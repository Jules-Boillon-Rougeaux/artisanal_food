package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.ArtisanalFood;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.AnyOfCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.AddTableLootModifier;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, ArtisanalFood.MOD_ID);
    }

    @Override
    protected void start() {
        add("bell_pepper_seeds_from_grass",
                new AddTableLootModifier(new LootItemCondition[]{
                        AnyOfCondition.anyOf(
                                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SHORT_GRASS),
                                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.TALL_GRASS)).build()
                }, 1000, ModExtraLootProvider.BELL_PEPPER_SEEDS));
    }
}