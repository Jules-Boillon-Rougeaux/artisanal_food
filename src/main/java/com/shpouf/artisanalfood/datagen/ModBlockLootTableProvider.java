package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.block.custom.CustomCropBlock;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {


    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.CHARCOAL_BLOCK.get());
        dropSelf(ModBlocks.SALT_BLOCK.get());
        dropSelf(ModBlocks.POLISHED_SALT_BLOCK.get());
        dropSelf(ModBlocks.SALT_BRICKS.get());
        dropSelf(ModBlocks.CHISELED_SALT_BRICKS.get());
        dropSelf(ModBlocks.SPARKLING_COBBLESTONE.get());
        dropSelf(ModBlocks.SALT_STAIRS.get());
        add(ModBlocks.SALT_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.SALT_WALL.get());
        dropSelf(ModBlocks.POLISHED_SALT_STAIRS.get());
        add(ModBlocks.POLISHED_SALT_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.POLISHED_SALT_WALL.get());
        dropSelf(ModBlocks.SALT_BRICKS_STAIRS.get());
        add(ModBlocks.SALT_BRICKS_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.SALT_BRICKS_WALL.get());

        add(ModBlocks.SPARKLING_GLASS.get(),
                createSilkTouchOnlyTable(ModBlocks.SPARKLING_GLASS.get())
        );

        add(ModBlocks.SALT_ORE.get(),
                createMultipleOreDrops(ModBlocks.SALT_ORE.get(), ModItems.SALT.get(), 2F, 4F));
        add(ModBlocks.DEEPSLATE_SALT_ORE.get(),
                createMultipleOreDrops(ModBlocks.DEEPSLATE_SALT_ORE.get(), ModItems.SALT.get(), 2F, 4F));

        addCropDrops(ModBlocks.BELL_PEPPER_CROP.get(), ModItems.RED_BELL_PEPPER.get(), ModItems.BELL_PEPPER_SEEDS.get());
        addCropDrops(ModBlocks.CORN_CROP.get(), ModItems.CORN.get(), ModItems.CORN_SEEDS.get());
        addCropDrops(ModBlocks.EGGPLANT_CROP.get(), ModItems.EGGPLANT.get(), ModItems.EGGPLANT_SEEDS.get());
        addCropDrops(ModBlocks.ZUCCHINI_CROP.get(), ModItems.ZUCCHINI.get(), ModItems.ZUCCHINI_SEEDS.get());
    }

    private void addCropDrops(CustomCropBlock crop, Item produce, Item seeds) {
        add(crop, createCropDrops(crop, produce, seeds,
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(crop)
                        .setProperties(StatePropertiesPredicate.Builder.properties()
                                .hasProperty(crop.getAgeProperty(), crop.getMaxAge()))));
    }

    protected LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(block,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}