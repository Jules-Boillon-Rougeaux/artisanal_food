package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

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
        addSimpleShapelessRecipe(Items.COAL, List.of(ModItems.MINI_COAL.get()), 1, List.of(8), "");
        addSimpleShapelessRecipe(Items.CHARCOAL, List.of(ModItems.MINI_CHARCOAL.get()), 1, List.of(8), "");
        addSimpleShapelessRecipe(ModItems.SALT.get(), List.of(ModBlocks.SALT_BLOCK.get()), 9, List.of(1), "");
        addSimpleShapelessRecipe(ModItems.MINI_COAL.get(), List.of(Items.COAL), 8, List.of(1), "");
        addSimpleShapelessRecipe(ModItems.MINI_CHARCOAL.get(), List.of(Items.CHARCOAL), 8, List.of(1), "");
        addSimpleShapelessRecipe(Items.CHARCOAL, List.of(ModBlocks.CHARCOAL_BLOCK.get()), 9, List.of(1), "");
        addSimpleShapelessRecipe(ModItems.CORN_SEEDS.get(), List.of(ModItems.CORN.get()), 2, List.of(1), "");
        addSimpleShapelessRecipe(ModItems.BELL_PEPPER_SEEDS.get(), List.of(ModItems.RED_BELL_PEPPER.get()), 1, List.of(1), "");
        addSimpleShapelessRecipe(ModItems.EGGPLANT_SEEDS.get(), List.of(ModItems.EGGPLANT.get()), 1, List.of(1), "");
        addSimpleShapelessRecipe(ModItems.ZUCCHINI_SEEDS.get(), List.of(ModItems.ZUCCHINI.get()), 1, List.of(1), "");
        addSimpleShapelessRecipe(ModItems.SPARKLING_POWDER.get(), List.of(Items.GLOWSTONE_DUST, Items.AMETHYST_SHARD), 1, List.of(2, 1), "");
        addSimpleShapelessRecipe(ModItems.CREME_BRULEE.get(), List.of(ModItems.RAMEKIN.get(),Items.EGG, Items.SUGAR, Items.MILK_BUCKET), 1, List.of(1, 1, 1, 1), "");
        addSimpleShapelessRecipe(ModItems.BOWL_OF_RATATOUILLE, List.of(ModItems.EGGPLANT.get(), ModItems.ZUCCHINI.get(), ModItems.RED_BELL_PEPPER.get(),  Items.BOWL), 1, List.of(1, 1, 1, 1), "");

        addSimpleShapedRecipe("3x3", ModBlocks.SALT_BLOCK.get(), ModItems.SALT.get(), 1);
        addSimpleShapedRecipe("3x3", ModBlocks.CHARCOAL_BLOCK.get(), Items.CHARCOAL, 1);
        addSimpleShapedRecipe("2x2", ModBlocks.POLISHED_SALT_BLOCK.get(), ModBlocks.SALT_BLOCK.get(), 1);
        addSimpleShapedRecipe("2x2", ModBlocks.SALT_BRICKS.get(), ModBlocks.POLISHED_SALT_BLOCK.get(), 1);
        addSimpleShapedRecipe("2x2", ModBlocks.CHISELED_SALT_BRICKS.get(), ModBlocks.SALT_BRICKS.get(), 1);

        addStonecutterRecipe(ModBlocks.POLISHED_SALT_BLOCK.get(), ModBlocks.SALT_BLOCK.get(), 1);
        addStonecutterRecipe(ModBlocks.SALT_BRICKS.get(), ModBlocks.SALT_BLOCK.get(), 1);
        addStonecutterRecipe(ModBlocks.SALT_BRICKS.get(), ModBlocks.POLISHED_SALT_BLOCK.get(), 1);
        addStonecutterRecipe(ModBlocks.CHISELED_SALT_BRICKS.get(), ModBlocks.SALT_BLOCK.get(), 1);
        addStonecutterRecipe(ModBlocks.CHISELED_SALT_BRICKS.get(), ModBlocks.POLISHED_SALT_BLOCK.get(), 1);
        addStonecutterRecipe(ModBlocks.CHISELED_SALT_BRICKS.get(), ModBlocks.SALT_BRICKS.get(), 1);

        List<ItemLike> SALT_SMELTABLES = List.of(ModBlocks.SALT_ORE, ModBlocks.DEEPSLATE_SALT_ORE);

        oreSmelting(SALT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SALT.get(), 0.25f, 200, "salt");
        oreBlasting(SALT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SALT.get(), 0.25f, 100, "salt");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.CORN), RecipeCategory.FOOD, CookingBookCategory.FOOD, ModItems.COOKED_CORN, 0.25f, 200)
                .unlockedBy(getHasName(ModItems.CORN), has(ModItems.CORN))
                .save(this.output, "artisanalfood:corn_smelting");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.CORN), RecipeCategory.FOOD, ModItems.COOKED_CORN, 0.25f, 100)
                .unlockedBy(getHasName(ModItems.CORN), has(ModItems.CORN))
                .save(this.output, "artisanalfood:corn_smoking");

        shaped(RecipeCategory.FOOD, ModItems.RAMEKIN, 4)
                .pattern("A A")
                .pattern(" A ")
                .define('A', Items.TERRACOTTA)
                .unlockedBy(getHasName(Items.TERRACOTTA), has(Items.TERRACOTTA))
                .group(getItemName(ModItems.RAMEKIN))
                .save(output, "artisanalfood:ramekin_from_terracotta_shaped");
    }

    private void addStonecutterRecipe(ItemLike result, ItemLike base, int resultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), RecipeCategory.BUILDING_BLOCKS, result, resultCount)
                .unlockedBy(getHasName(base), this.has(base))
                .save(this.output, "artisanalfood:" + getItemName(result) + "_from_" + getItemName(base) + "_stonecutting");

    }

    private void addSimpleShapedRecipe(String recipeShape, ItemLike result, ItemLike base, int resultCount) {
        if (Objects.equals(recipeShape, "3x3")) {
            shaped(RecipeCategory.BUILDING_BLOCKS, result, resultCount)
                    .pattern("AAA")
                    .pattern("AAA")
                    .pattern("AAA")
                    .define('A', base)
                    .unlockedBy(getHasName(base), has(base))
                    .group(getItemName(result))
                    .save(output, "artisanalfood:" + getItemName(result) + "_from_" + getItemName(base) + "_shaped");
        } else if (Objects.equals(recipeShape, "2x2")) {
            shaped(RecipeCategory.BUILDING_BLOCKS, result, resultCount)
                    .pattern("AA")
                    .pattern("AA")
                    .define('A', base)
                    .unlockedBy(getHasName(base), has(base))
                    .group(getItemName(result))
                    .save(output, "artisanalfood:" + getItemName(result) + "_from_" + getItemName(base) + "_shaped");
        }
    }

    private void addSimpleShapelessRecipe(ItemLike result, List<ItemLike> base, int resultCount, List<Integer> baseCount, String group) {
        if (Objects.equals(group, "")) {
            group = getItemName(result);
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
                .group(group)
                .save(output, "artisanalfood:" + getItemName(result) + "_from_" + getItemName(base.getFirst()) + "_shapeless");
    }

    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables,
                                                                RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result,
                                                                float experience, int cookingTime, String group, String fromDesc) {
        for(ItemLike itemlike : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory, result, experience, cookingTime, factory).group(group).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(output, "artisanalfood:" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
        }
    }

}
