package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, ArtisanalFood.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SALT_ORE.get())
                .add(ModBlocks.DEEPSLATE_SALT_ORE.get())
                .add(ModBlocks.CHARCOAL_BLOCK.get())
                .add(ModBlocks.SALT_BLOCK.get())
                .add(ModBlocks.POLISHED_SALT_BLOCK.get())
                .add(ModBlocks.SALT_BRICKS.get())
                .add(ModBlocks.CHISELED_SALT_BRICKS.get())
                .add(ModBlocks.SPARKLING_COBBLESTONE.get())
                .add(ModBlocks.SALT_STAIRS.get())
                .add(ModBlocks.SALT_SLAB.get())
                .add(ModBlocks.SALT_WALL.get())
                .add(ModBlocks.POLISHED_SALT_STAIRS.get())
                .add(ModBlocks.POLISHED_SALT_SLAB.get())
                .add(ModBlocks.POLISHED_SALT_WALL.get())
                .add(ModBlocks.SALT_BRICKS_STAIRS.get())
                .add(ModBlocks.SALT_BRICKS_SLAB.get())
                .add(ModBlocks.SALT_BRICKS_WALL.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SALT_ORE.get())
                .add(ModBlocks.DEEPSLATE_SALT_ORE.get())
                .add(ModBlocks.SALT_BLOCK.get())
                .add(ModBlocks.POLISHED_SALT_BLOCK.get())
                .add(ModBlocks.SALT_BRICKS.get())
                .add(ModBlocks.CHISELED_SALT_BRICKS.get())
                .add(ModBlocks.SALT_STAIRS.get())
                .add(ModBlocks.SALT_SLAB.get())
                .add(ModBlocks.SALT_WALL.get())
                .add(ModBlocks.POLISHED_SALT_STAIRS.get())
                .add(ModBlocks.POLISHED_SALT_SLAB.get())
                .add(ModBlocks.POLISHED_SALT_WALL.get())
                .add(ModBlocks.SALT_BRICKS_STAIRS.get())
                .add(ModBlocks.SALT_BRICKS_SLAB.get())
                .add(ModBlocks.SALT_BRICKS_WALL.get());


        tag(BlockTags.STAIRS)
                .add(ModBlocks.SALT_STAIRS.get())
                .add(ModBlocks.POLISHED_SALT_STAIRS.get())
                .add(ModBlocks.SALT_BRICKS_STAIRS.get());

        tag(BlockTags.SLABS)
                .add(ModBlocks.SALT_SLAB.get())
                .add(ModBlocks.POLISHED_SALT_SLAB.get())
                .add(ModBlocks.SALT_BRICKS_SLAB.get());

        tag(BlockTags.WALLS)
                .add(ModBlocks.SALT_WALL.get())
                .add(ModBlocks.POLISHED_SALT_WALL.get())
                .add(ModBlocks.SALT_BRICKS_WALL.get());

        tag(BlockTags.CROPS)
                .add(ModBlocks.BELL_PEPPER_CROP.get())
                .add(ModBlocks.ZUCCHINI_CROP.get())
                .add(ModBlocks.CORN_CROP.get())
                .add(ModBlocks.EGGPLANT_CROP.get());

        tag(BlockTags.MAINTAINS_FARMLAND)
                .add(ModBlocks.BELL_PEPPER_CROP.get())
                .add(ModBlocks.ZUCCHINI_CROP.get())
                .add(ModBlocks.CORN_CROP.get())
                .add(ModBlocks.EGGPLANT_CROP.get());
    }
}
