package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
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
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZURITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AZURITE.get())
                .unlockedBy(getHasName(ModItems.AZURITE.get()), has(ModItems.AZURITE))
                .group("azurite")
                .save(output, "artisanalfood:azurite_block_compression");

        shapeless(RecipeCategory.MISC, ModItems.AZURITE.get(), 9)
                .requires(ModBlocks.AZURITE_BLOCK)
                .unlockedBy(getHasName(ModBlocks.AZURITE_BLOCK.get()), has(ModBlocks.AZURITE_BLOCK))
                .group("azurite")
                .save(output, "artisanalfood:azurite_decompression");


        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(ModItems.RAW_AZURITE.get()),
                RecipeCategory.MISC,
                CookingBookCategory.MISC,
                ModItems.AZURITE.get(),
                0.7f,
                200
                )
                .unlockedBy(getHasName(ModItems.RAW_AZURITE.get()), has(ModItems.RAW_AZURITE.get()))
                .save(output, ArtisanalFood.MOD_ID + ":" + getItemName(ModItems.AZURITE.get()) + "_from_" + getItemName(ModItems.RAW_AZURITE.get()));

        SimpleCookingRecipeBuilder.blasting(
                Ingredient.of(ModItems.RAW_AZURITE.get()),
                RecipeCategory.MISC,
                CookingBookCategory.MISC,
                ModItems.AZURITE.get(),
                0.7f,
                100
                )
                .unlockedBy(getHasName(ModItems.RAW_AZURITE.get()), has(ModItems.RAW_AZURITE.get()))
                .save(output, ArtisanalFood.MOD_ID + ":blast_" + getItemName(ModItems.AZURITE.get()) + "_from_" + getItemName(ModItems.RAW_AZURITE.get()));


    }


}
