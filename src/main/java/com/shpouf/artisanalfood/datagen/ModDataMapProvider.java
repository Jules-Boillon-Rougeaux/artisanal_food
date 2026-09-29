package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    public ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(ModItems.MINI_COAL.getId(), new FurnaceFuel(200), false)
                .add(ModItems.MINI_CHARCOAL.getId(), new FurnaceFuel(200), false)
                .add(ModBlocks.CHARCOAL_BLOCK.getId(), new FurnaceFuel(200*80), false);
    }
}
