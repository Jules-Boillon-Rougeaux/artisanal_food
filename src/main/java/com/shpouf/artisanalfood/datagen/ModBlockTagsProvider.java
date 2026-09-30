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
                .add(ModBlocks.CHISELED_SALT_BRICKS.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SALT_ORE.get())
                .add(ModBlocks.DEEPSLATE_SALT_ORE.get())
                .add(ModBlocks.SALT_BLOCK.get())
                .add(ModBlocks.POLISHED_SALT_BLOCK.get())
                .add(ModBlocks.SALT_BRICKS.get())
                .add(ModBlocks.CHISELED_SALT_BRICKS.get());
    }
}
