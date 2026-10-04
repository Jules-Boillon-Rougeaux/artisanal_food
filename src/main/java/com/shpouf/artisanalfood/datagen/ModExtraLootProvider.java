package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.function.BiConsumer;

public class ModExtraLootProvider implements LootTableSubProvider {
    public static final ResourceKey<LootTable> BELL_PEPPER_SEEDS = ResourceKey.create(Registries.LOOT_TABLE,
            Identifier.fromNamespaceAndPath(ArtisanalFood.MOD_ID, "extra/glm/bell_pepper_seeds"));

    public ModExtraLootProvider(HolderLookup.Provider provider) {

    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> output) {
        output.accept(BELL_PEPPER_SEEDS,
                LootTable.lootTable().withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1f))
                        .when(LootItemRandomChanceCondition.randomChance(0.25f))
                        .add(LootItem.lootTableItem(ModItems.BELL_PEPPER_SEEDS.get()))));
    }
}