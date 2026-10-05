package com.shpouf.artisanalfood.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.block.custom.CustomCropBlock;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.data.PackOutput;

import net.minecraft.resources.Identifier;

import java.util.stream.IntStream;

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

        createEasyCropCrossBlock(blockModels, ModBlocks.BELL_PEPPER_CROP.get());
        createEasyCropCrossBlock(blockModels, ModBlocks.CORN_CROP.get());
        createEasyCropCrossBlock(blockModels, ModBlocks.EGGPLANT_CROP.get());
        createEasyCropCrossBlock(blockModels, ModBlocks.ZUCCHINI_CROP.get());
    }

    private static void createEasyCropBlock(BlockModelGenerators blockModels, CustomCropBlock block) {
        int[] stages = IntStream.rangeClosed(0, block.getMaxAge()).toArray();
        blockModels.createCropBlock(block, block.getAgeProperty(), stages);
}
    private static void createEasyCropCrossBlock(BlockModelGenerators blockModels, CustomCropBlock block) {
        blockModels.registerSimpleFlatItemModel(block.asItem());
        blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(block)
                .with(PropertyDispatch.initial(block.getAgeProperty()).generate(age -> {
                    String suffix = "_stage" + age;
                    Identifier modelId = ModelLocationUtils.getModelLocation(block, suffix);
                    createMirroredCrossModel(blockModels, block, suffix, modelId);
                    return BlockModelGenerators.plainVariant(modelId);
                })));
    }

    private static void createMirroredCrossModel(
            BlockModelGenerators blockModels,
            CustomCropBlock block,
            String suffix,
            Identifier modelId
    ) {
        JsonObject model = new JsonObject();
        model.addProperty("ambientocclusion", false);

        JsonObject textures = new JsonObject();
        textures.addProperty("particle", "#cross");
        textures.addProperty("cross", TextureMapping.getBlockTexture(block, suffix).sprite().toString());
        model.add("textures", textures);

        JsonArray elements = new JsonArray();
        addCrossPlane(elements, new double[]{0.8, 0, 8}, new double[]{15.2, 16, 8}, "north", "south");
        addCrossPlane(elements, new double[]{8, 0, 0.8}, new double[]{8, 16, 15.2}, "west", "east");
        model.add("elements", elements);

        blockModels.modelOutput.accept(modelId, () -> model);
    }

    private static void addCrossPlane(
            JsonArray elements,
            double[] from,
            double[] to,
            String frontFace,
            String backFace
    ) {
        JsonObject element = new JsonObject();
        element.add("from", jsonArray(from));
        element.add("to", jsonArray(to));

        JsonObject rotation = new JsonObject();
        rotation.add("origin", jsonArray(new double[]{8, 8, 8}));
        rotation.addProperty("axis", "y");
        rotation.addProperty("angle", 45);
        rotation.addProperty("rescale", true);
        element.add("rotation", rotation);
        element.addProperty("shade", false);

        JsonObject faces = new JsonObject();
        faces.add(frontFace, crossFace(false));
        faces.add(backFace, crossFace(true));
        element.add("faces", faces);
        elements.add(element);
    }

    private static JsonObject crossFace(boolean mirrored) {
        JsonObject face = new JsonObject();
        face.add("uv", mirrored
                ? jsonArray(new double[]{16, 0, 0, 16})
                : jsonArray(new double[]{0, 0, 16, 16}));
        face.addProperty("texture", "#cross");
        return face;
    }

    private static JsonArray jsonArray(double[] values) {
        JsonArray array = new JsonArray();
        for (double value : values) {
            array.add(value);
        }
        return array;
    }
}