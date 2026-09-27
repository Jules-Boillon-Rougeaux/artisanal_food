package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
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
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SALT.get())
                .unlockedBy(getHasName(ModItems.SALT.get()), has(ModItems.SALT))
                .group("salt")
                .save(output, "artisanalfood:salt_block_from_salt_craft");

        shapeless(RecipeCategory.MISC, ModItems.SALT.get(), 9)
                .requires(ModBlocks.SALT_BLOCK)
                .unlockedBy(getHasName(ModBlocks.SALT_BLOCK.get()), has(ModBlocks.SALT_BLOCK))
                .group("salt")
                .save(output, "artisanalfood:salt_from_salt_block_craft");

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHARCOAL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.CHARCOAL)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL))
                .group("charcoal")
                .save(output, "artisanalfood:charcoal_block_from_charcoal_craft");

        shapeless(RecipeCategory.MISC, Items.CHARCOAL, 9)
                .requires(ModBlocks.CHARCOAL_BLOCK)
                .unlockedBy(getHasName(ModBlocks.CHARCOAL_BLOCK.get()), has(ModBlocks.CHARCOAL_BLOCK))
                .group("charcoal")
                .save(output, "artisanalfood:charcoal_from_charcoal_block_craft");

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SALT_BLOCK.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.SALT_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SALT_BLOCK.get()), has(ModBlocks.SALT_BLOCK))
                .group("salt")
                .save(output, "artisanalfood:polished_salt_block_craft");

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BRICKS.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.POLISHED_SALT_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.POLISHED_SALT_BLOCK.get()), has(ModBlocks.POLISHED_SALT_BLOCK))
                .group("salt")
                .save(output, "artisanalfood:salt_bricks_craft");

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SALT_BRICKS.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.SALT_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.SALT_BRICKS.get()), has(ModBlocks.SALT_BRICKS))
                .group("salt")
                .save(output, "artisanalfood:chiseled_salt_bricks_craft");


        addStonecutterRecipe(ModBlocks.POLISHED_SALT_BLOCK.get(), ModBlocks.SALT_BLOCK.get(), 1);
        addStonecutterRecipe(ModBlocks.SALT_BRICKS.get(), ModBlocks.SALT_BLOCK.get(), 1);
        addStonecutterRecipe(ModBlocks.SALT_BRICKS.get(), ModBlocks.POLISHED_SALT_BLOCK.get(), 1);
        addStonecutterRecipe(ModBlocks.CHISELED_SALT_BRICKS.get(), ModBlocks.SALT_BLOCK.get(), 1);
        addStonecutterRecipe(ModBlocks.CHISELED_SALT_BRICKS.get(), ModBlocks.POLISHED_SALT_BLOCK.get(), 1);
        addStonecutterRecipe(ModBlocks.CHISELED_SALT_BRICKS.get(), ModBlocks.SALT_BRICKS.get(), 1);


//        SimpleCookingRecipeBuilder.smelting(
//                Ingredient.of(ModItems.RAW_AZURITE.get()),
//                RecipeCategory.MISC,
//                CookingBookCategory.MISC,
//                ModItems.SALT.get(),
//                0.7f,
//                200
//                )
//                .unlockedBy(getHasName(ModItems.RAW_AZURITE.get()), has(ModItems.RAW_AZURITE.get()))
//                .save(output, ArtisanalFood.MOD_ID + ":" + getItemName(ModItems.AZURITE.get()) + "_from_" + getItemName(ModItems.RAW_AZURITE.get()));

//        SimpleCookingRecipeBuilder.blasting(
//                Ingredient.of(ModItems.RAW_AZURITE.get()),
//                RecipeCategory.MISC,
//                CookingBookCategory.MISC,
//                ModItems.AZURITE.get(),
//                0.7f,
//                100
//                )
//                .unlockedBy(getHasName(ModItems.RAW_AZURITE.get()), has(ModItems.RAW_AZURITE.get()))
//                .save(output, ArtisanalFood.MOD_ID + ":blast_" + getItemName(ModItems.AZURITE.get()) + "_from_" + getItemName(ModItems.RAW_AZURITE.get()));


    }
    private void addStonecutterRecipe(ItemLike result, ItemLike base, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(base), RecipeCategory.BUILDING_BLOCKS, result, count)
                .unlockedBy(getHasName(base), this.has(base))
                .save(this.output, "artisanalfood:" + getItemName(result) + "_from_" + getItemName(base) + "_stonecutting");

    }


}
