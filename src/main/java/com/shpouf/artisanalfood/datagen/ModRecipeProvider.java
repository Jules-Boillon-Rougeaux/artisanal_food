package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "ArtisanalFood Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        //  StoneCutting
        addStonecutterRecipe(ModBlocks.POLISHED_SALT_BLOCK.get(), List.of(ModBlocks.SALT_BLOCK.get()), 1);
        addStonecutterRecipe(ModBlocks.SALT_BRICKS.get(), List.of(ModBlocks.SALT_BLOCK.get(), ModBlocks.POLISHED_SALT_BLOCK.get()), 1);
        addStonecutterRecipe(ModBlocks.CHISELED_SALT_BRICKS.get(), List.of(ModBlocks.SALT_BLOCK.get(), ModBlocks.POLISHED_SALT_BLOCK.get(), ModBlocks.SALT_BRICKS.get()), 1);
        addStonecutterRecipe(ModBlocks.SALT_STAIRS.get(), List.of(ModBlocks.SALT_BLOCK.get()), 1);
        addStonecutterRecipe(ModBlocks.SALT_SLAB.get(), List.of(ModBlocks.SALT_BLOCK.get()), 2);
        addStonecutterRecipe(ModBlocks.SALT_WALL.get(), List.of(ModBlocks.SALT_BLOCK.get()), 1);
        addStonecutterRecipe(ModBlocks.POLISHED_SALT_STAIRS.get(), List.of(ModBlocks.SALT_BLOCK.get(), ModBlocks.POLISHED_SALT_BLOCK.get()), 1);
        addStonecutterRecipe(ModBlocks.POLISHED_SALT_SLAB.get(), List.of(ModBlocks.SALT_BLOCK.get(), ModBlocks.POLISHED_SALT_BLOCK.get()), 2);
        addStonecutterRecipe(ModBlocks.POLISHED_SALT_WALL.get(), List.of(ModBlocks.SALT_BLOCK.get(), ModBlocks.POLISHED_SALT_BLOCK.get()), 1);
        addStonecutterRecipe(ModBlocks.SALT_BRICKS_STAIRS.get(), List.of(ModBlocks.SALT_BLOCK.get(), ModBlocks.POLISHED_SALT_BLOCK.get(), ModBlocks.SALT_BRICKS.get()), 1);
        addStonecutterRecipe(ModBlocks.SALT_BRICKS_SLAB.get(), List.of(ModBlocks.SALT_BLOCK.get(), ModBlocks.POLISHED_SALT_BLOCK.get(), ModBlocks.SALT_BRICKS.get()), 2);
        addStonecutterRecipe(ModBlocks.SALT_BRICKS_WALL.get(), List.of(ModBlocks.SALT_BLOCK.get(), ModBlocks.POLISHED_SALT_BLOCK.get(), ModBlocks.SALT_BRICKS.get()), 1);

        //  Shaped
        addSimpleShapedRecipe("2x2", ModBlocks.POLISHED_SALT_BLOCK.get(), ModBlocks.SALT_BLOCK.get(), 1);
        addSimpleShapedRecipe("2x2", ModBlocks.SALT_BRICKS.get(), ModBlocks.POLISHED_SALT_BLOCK.get(), 1);
        addSimpleShapedRecipe("2x2", ModBlocks.CHISELED_SALT_BRICKS.get(), ModBlocks.SALT_BRICKS.get(), 1);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPARKLING_GLASS, 4)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', Items.GLASS)
                .define('B', ModItems.SPARKLING_POWDER)
                .unlockedBy(getHasName(ModItems.SPARKLING_POWDER), has(ModItems.SPARKLING_POWDER))
                .group(getItemName(ModBlocks.SPARKLING_GLASS))
                .save(output);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPARKLING_COBBLESTONE, 4)
                .pattern(" A ")
                .pattern("ABA")
                .pattern(" A ")
                .define('A', Items.COBBLESTONE)
                .define('B', ModItems.SPARKLING_POWDER)
                .unlockedBy(getHasName(ModItems.SPARKLING_POWDER.get()), has(ModItems.SPARKLING_POWDER))
                .group(getItemName(ModBlocks.SPARKLING_COBBLESTONE))
                .save(output);
        shaped(RecipeCategory.FOOD, ModItems.RAMEKIN, 4)
                .pattern("A A")
                .pattern(" A ")
                .define('A', Items.TERRACOTTA)
                .unlockedBy(getHasName(Items.TERRACOTTA), has(Items.TERRACOTTA))
                .group(getItemName(ModItems.RAMEKIN))
                .save(output);
        shaped(RecipeCategory.FOOD, ModItems.CANDY_APPLE, 1)
                .pattern(" C ")
                .pattern("CAC")
                .pattern(" B ")
                .define('A', Items.APPLE)
                .define('B', Items.STICK)
                .define('C', Items.SUGAR)
                .unlockedBy(getHasName(Items.APPLE), has(Items.APPLE))
                .group(getItemName(ModItems.CANDY_APPLE))
                .save(output);

        //  Shapeless
        addSimpleShapelessRecipe(ModBlocks.CHARCOAL_BLOCK.get(), List.of(Items.CHARCOAL), 1, List.of(9), "coal_block", "charcoal");
        addSimpleShapelessRecipe(Items.CHARCOAL, List.of(ModBlocks.CHARCOAL_BLOCK.get()), 9, List.of(1), "coal", "charcoal_block");
        addSimpleShapelessRecipe(ModBlocks.SALT_BLOCK.get(), List.of(ModItems.SALT.get()), 1, List.of(9), "", "");
        addSimpleShapelessRecipe(ModItems.SALT.get(), List.of(ModBlocks.SALT_BLOCK.get()), 9, List.of(1), "", "");
        addSimpleShapelessRecipe(ModItems.CORN_SEEDS.get(), List.of(ModItems.CORN.get()), 2, List.of(1), "seeds", "");
        addSimpleShapelessRecipe(ModItems.BELL_PEPPER_SEEDS.get(), List.of(ModItems.RED_BELL_PEPPER.get()), 1, List.of(1), "seeds", "");
        addSimpleShapelessRecipe(ModItems.EGGPLANT_SEEDS.get(), List.of(ModItems.EGGPLANT.get()), 1, List.of(1), "seeds", "");
        addSimpleShapelessRecipe(ModItems.ZUCCHINI_SEEDS.get(), List.of(ModItems.ZUCCHINI.get()), 1, List.of(1), "seeds", "");
        addSimpleShapelessRecipe(ModItems.SPARKLING_POWDER.get(), List.of(Items.GLOWSTONE_DUST, Items.AMETHYST_SHARD), 1, List.of(2, 1), "", "");
        addSimpleShapelessRecipe(ModItems.SALTED_COD.get(), List.of(ModItems.SALT.get(), Items.COD), 1, List.of(1, 1), "", "");
        addSimpleShapelessRecipe(ModItems.BOWL_OF_RATATOUILLE, List.of(ModItems.EGGPLANT.get(), ModItems.ZUCCHINI.get(), ModItems.RED_BELL_PEPPER.get(), ModItems.TOMATO.get(), ModItems.ONION.get(), Items.BOWL), 1, List.of(1, 1, 1, 1, 1, 1), "", "");
        addSimpleShapelessRecipe(ModItems.CREME_BRULEE.get(), List.of(ModItems.RAMEKIN.get(),Items.EGG, Items.SUGAR, Items.MILK_BUCKET), 1, List.of(1, 1, 1, 1), "", "");
        addSimpleShapelessRecipe(ModItems.MINI_CHARCOAL.get(), List.of(Items.CHARCOAL), 8, List.of(1), "mini_coal", "charcoal");
        addSimpleShapelessRecipe(Items.CHARCOAL, List.of(ModItems.MINI_CHARCOAL.get()), 1, List.of(8), "coal", "coal");
        addSimpleShapelessRecipe(ModItems.MINI_COAL.get(), List.of(Items.COAL), 8, List.of(1), "mini_coal", "");
        addSimpleShapelessRecipe(Items.COAL, List.of(ModItems.MINI_COAL.get()), 1, List.of(8), "coal", "");
        addSimpleShapelessRecipe(ModItems.SWEET_BERRIES_JAM.get(), List.of(Items.SUGAR, Items.SWEET_BERRIES, Items.GLASS_BOTTLE), 1, List.of(1, 1, 1), "jam", "");
        addSimpleShapelessRecipe(ModItems.TOMATO_SEEDS.get(), List.of(ModItems.TOMATO.get()), 1, List.of(1), "seeds", "");

        //  Smelting
        addSimpleCookingRecipe(ModBlocks.SALT_ORE, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SALT, 0.5f, "salt_ore", true, false, false, true);
        addSimpleCookingRecipe(ModBlocks.DEEPSLATE_SALT_ORE, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SALT, 0.5f, "deepslate_salt_ore", true, false, false, true);
        addSimpleCookingRecipe(ModItems.CORN, RecipeCategory.FOOD, CookingBookCategory.FOOD, ModItems.GRILLED_CORN, 0.35f, "", true, true, true, false);
        addSimpleCookingRecipe(ModItems.CORN_SEEDS, RecipeCategory.FOOD, CookingBookCategory.FOOD, ModItems.POPCORN, 0.35f, "", true, true, true, false);
        addSimpleCookingRecipe(ModItems.SARDINE, RecipeCategory.FOOD, CookingBookCategory.FOOD, ModItems.GRILLED_SARDINE, 0.35f, "", true, true, true, false);
        addSimpleCookingRecipe(ModItems.TENTACLE, RecipeCategory.FOOD, CookingBookCategory.FOOD, ModItems.GRILLED_TENTACLE, 0.35f, "", true, true, true, false);

        // Other
        stairBuilder(ModBlocks.SALT_STAIRS.get(), Ingredient.of(ModBlocks.SALT_BLOCK))
                .unlockedBy(getHasName(ModBlocks.SALT_BLOCK.get()), has(ModBlocks.SALT_BLOCK))
                .group("salt_stairs").save(output, "artisanalfood:salt_stairs_from_salt_block");
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_SLAB.get(), ModBlocks.SALT_BLOCK.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_WALL.get(), ModBlocks.SALT_BLOCK.get());

        stairBuilder(ModBlocks.POLISHED_SALT_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_SALT_BLOCK))
                .unlockedBy(getHasName(ModBlocks.POLISHED_SALT_BLOCK.get()), has(ModBlocks.POLISHED_SALT_BLOCK))
                .group("salt_stairs").save(output, "artisanalfood:polished_salt_stairs_from_polished_salt_block");
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SALT_SLAB.get(), ModBlocks.POLISHED_SALT_BLOCK.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SALT_WALL.get(), ModBlocks.POLISHED_SALT_BLOCK.get());

        stairBuilder(ModBlocks.SALT_BRICKS_STAIRS.get(), Ingredient.of(ModBlocks.SALT_BRICKS))
                .unlockedBy(getHasName(ModBlocks.SALT_BRICKS.get()), has(ModBlocks.SALT_BRICKS))
                .group("salt_stairs").save(output, "artisanalfood:salt_bricks_stairs_from_salt_bricks");
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BRICKS_SLAB.get(), ModBlocks.SALT_BRICKS.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BRICKS_WALL.get(), ModBlocks.SALT_BRICKS.get());

        shapeless(RecipeCategory.MISC, ModItems.VEGETABLE_SOUP, 1)
                .requires(Tags.Items.FOODS_VEGETABLE)
                .requires(Tags.Items.FOODS_VEGETABLE)
                .requires(Tags.Items.FOODS_VEGETABLE)
                .requires(Items.POTATO)
                .requires(Items.BOWL)
                .requires(ModItems.ONION)
                .unlockedBy("has_bowl", has(Items.BOWL))
                .group("vegetable_soup")
                .save(output, "artisanalfood:vegetable_soup_from_vegetables_shapeless");

    }

    private void addStonecutterRecipe(ItemLike result, List<ItemLike> bases, int resultCount) {
        for (ItemLike base : bases) {
            SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), RecipeCategory.BUILDING_BLOCKS, result, resultCount)
                    .unlockedBy(getHasName(base), this.has(base))
                    .save(this.output, "artisanalfood:" + getItemName(result) + "_from_" + getItemName(base) + "_stonecutting");
        }
    }

    private void addSimpleShapedRecipe(String recipeShape, ItemLike result, ItemLike base, int resultCount) {
        if (Objects.equals(recipeShape, "2x2")) {
            shaped(RecipeCategory.BUILDING_BLOCKS, result, resultCount)
                    .pattern("AA")
                    .pattern("AA")
                    .define('A', base)
                    .unlockedBy(getHasName(base), has(base))
                    .group(getItemName(result))
                    .save(output);
        } else {
            throw new IllegalArgumentException(
                    String.format("recipeShape '%s' is not known", recipeShape)
            );
        }
    }

    private void addSimpleShapelessRecipe(ItemLike result, List<ItemLike> base, int resultCount, List<Integer> baseCount, String group, String fromIngredient) {
        if (Objects.equals(group, "")) {
            group = getItemName(result);
        }
        String id = "artisanalfood:" + getItemName(result);
        if(!Objects.equals(fromIngredient, "")) {
            id += "_from_" + fromIngredient;
        }
        if (base.size() != baseCount.size()) {
            throw new IllegalArgumentException(
                    String.format("Lists must have the same size. List 1 size: %d, List 2 size: %d",
                            base.size(), baseCount.size())
            );
        }
        ShapelessRecipeBuilder builder = shapeless(RecipeCategory.MISC, result, resultCount);
        for (int i = 0; i < base.size(); i++) {
            builder.requires(base.get(i), baseCount.get(i));
        }
        builder.unlockedBy(getHasName(base.getFirst()), has(base.getFirst()))
                .group(group);
        if (Objects.equals(fromIngredient, "")) {
            builder.save(output);
        } else {
            builder.save(output, id);
        }
    }

    private void addSimpleCookingRecipe(ItemLike base, RecipeCategory recipeCategory, CookingBookCategory cookingBookCategory, ItemLike result, float experience, String fromIngredient, boolean smelt, boolean campfire, boolean smoke, boolean blast) {
        if (!Objects.equals(fromIngredient, "")) {
            fromIngredient = "_from_" + fromIngredient;
        }
        if (smelt) {
            SimpleCookingRecipeBuilder builder = SimpleCookingRecipeBuilder.smelting(Ingredient.of(base), recipeCategory, cookingBookCategory, result, experience, 200)
                    .unlockedBy(getHasName(base), has(base));
            if (Objects.equals(fromIngredient, "")) {
                builder.save(this.output);
            } else {
                builder.save(this.output, "artisanalfood:" + getItemName(result) + "_" + fromIngredient);
            }
        }
        if (campfire) {
            SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(base), recipeCategory, result, experience, 600)
                    .unlockedBy(getHasName(base), has(base))
                    .save(this.output, "artisanalfood:" + getItemName(result) + "_from_campfire_cooking" + fromIngredient);
        }
        if (smoke) {
            SimpleCookingRecipeBuilder.smoking(Ingredient.of(base), recipeCategory, result, experience, 100)
                    .unlockedBy(getHasName(base), has(base))
                    .save(this.output, "artisanalfood:" + getItemName(result) + "_from_smoking" + fromIngredient);
        }
        if (blast) {
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(base), recipeCategory, cookingBookCategory, result, experience, 100)
                    .unlockedBy(getHasName(base), has(base))
                    .save(this.output, "artisanalfood:" + getItemName(result) + "_from_blasting" + fromIngredient);
        }
    }
}
