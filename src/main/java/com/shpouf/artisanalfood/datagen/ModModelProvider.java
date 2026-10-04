package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.block.custom.BellPepperCropBlock;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.Property;

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
        itemModels.generateFlatItem(ModItems.GRILLED_CORN.get(), ModelTemplates.FLAT_ITEM);
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

        /* BLOCKS */
        blockModels.createTrivialCube(ModBlocks.SALT_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_SALT_ORE.get());
        blockModels.createTrivialCube(ModBlocks.CHARCOAL_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CHISELED_SALT_BRICKS.get());
        blockModels.createTrivialCube(ModBlocks.SPARKLING_GLASS.get());
        blockModels.createTrivialCube(ModBlocks.SPARKLING_COBBLESTONE.get());

        blockModels.family(ModBlocks.SALT_BLOCK.get())
                .stairs(ModBlocks.SALT_STAIRS.get())
                .slab(ModBlocks.SALT_SLAB.get())
                .wall(ModBlocks.SALT_WALL.get());

        blockModels.family(ModBlocks.POLISHED_SALT_BLOCK.get())
                .stairs(ModBlocks.POLISHED_SALT_STAIRS.get())
                .slab(ModBlocks.POLISHED_SALT_SLAB.get())
                .wall(ModBlocks.POLISHED_SALT_WALL.get());

        blockModels.family(ModBlocks.SALT_BRICKS.get())
                .stairs(ModBlocks.SALT_BRICKS_STAIRS.get())
                .slab(ModBlocks.SALT_BRICKS_SLAB.get())
                .wall(ModBlocks.SALT_BRICKS_WALL.get());

        createCropCrossBlock(blockModels, ModBlocks.BELL_PEPPER_CROP.get(), BellPepperCropBlock.AGE, 0, 1, 2, 3, 4);
        createCropCrossBlock(blockModels, ModBlocks.CORN_CROP.get(), BellPepperCropBlock.AGE, 0, 1, 2, 3, 4);
        createCropCrossBlock(blockModels, ModBlocks.EGGPLANT_CROP.get(), BellPepperCropBlock.AGE, 0, 1, 2, 3, 4);
        createCropCrossBlock(blockModels, ModBlocks.ZUCCHINI_CROP.get(), BellPepperCropBlock.AGE, 0, 1, 2, 3, 4);
    }

    private static void createCropCrossBlock(
            BlockModelGenerators blockModels, Block block, Property<Integer> property, int... stages) {
        blockModels.createCrossBlock(block, BlockModelGenerators.PlantType.NOT_TINTED, property, stages);
    }
}