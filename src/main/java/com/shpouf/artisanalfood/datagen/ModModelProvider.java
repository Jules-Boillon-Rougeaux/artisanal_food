package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, ArtisanalFood.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        /* ITEMS */
        itemModels.generateFlatItem(ModItems.RED_BELL_PEPPER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ZUCCHINI.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CORN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.EGGPLANT.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.CORNSTARCH.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAMEKIN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.WHEAT_FLOUR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SALT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SPARKLING_POWDER.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.CREME_BRULEE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BOWL_OF_RATATOUILLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.VEGETABLE_SOUP.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.MINI_CHARCOAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MINI_COAL.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.CORN_SEEDS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.EGGPLANT_SEEDS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BELL_PEPPER_SEEDS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ZUCCHINI_SEEDS.get(), ModelTemplates.FLAT_ITEM);

        /* BLOCKS */
        blockModels.createTrivialCube(ModBlocks.AZURITE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.AZURITE_ORE.get());

    }
}
