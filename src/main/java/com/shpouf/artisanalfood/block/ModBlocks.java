package com.shpouf.artisanalfood.block;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.block.custom.CustomCropBlock;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ArtisanalFood.MOD_ID);

    public static final DeferredBlock<Block> SALT_ORE = registerBlock("salt_ore",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_SALT_ORE = registerBlock("deepslate_salt_ore",
            properties -> new Block(properties.strength(4.5f)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHARCOAL_BLOCK = registerBlock("charcoal_block",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SALT_BLOCK = registerBlock("salt_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_SALT_BLOCK = registerBlock("polished_salt_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SALT_BRICKS = registerBlock("salt_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHISELED_SALT_BRICKS = registerBlock("chiseled_salt_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SPARKLING_GLASS = registerBlock("sparkling_glass",
            properties -> new TransparentBlock(properties.strength(0.5f).lightLevel(state -> 15).noOcclusion()));
    public static final DeferredBlock<Block> SPARKLING_COBBLESTONE = registerBlock("sparkling_cobblestone",
            properties -> new Block(properties.strength(2f).lightLevel(state -> 15).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> SALT_STAIRS = registerBlock("salt_stairs",
            properties -> new StairBlock(ModBlocks.SALT_BLOCK.get().defaultBlockState(),
                    properties.strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SALT_SLAB = registerBlock("salt_slab",
            properties -> new SlabBlock(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SALT_WALL = registerBlock("salt_wall",
            properties -> new WallBlock(properties.strength(3f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> POLISHED_SALT_STAIRS = registerBlock("polished_salt_stairs",
            properties -> new StairBlock(ModBlocks.POLISHED_SALT_BLOCK.get().defaultBlockState(),
                    properties.strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_SALT_SLAB = registerBlock("polished_salt_slab",
            properties -> new SlabBlock(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> POLISHED_SALT_WALL = registerBlock("polished_salt_wall",
            properties -> new WallBlock(properties.strength(3f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> SALT_BRICKS_STAIRS = registerBlock("salt_bricks_stairs",
            properties -> new StairBlock(ModBlocks.SALT_BRICKS.get().defaultBlockState(),
                    properties.strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SALT_BRICKS_SLAB = registerBlock("salt_bricks_slab",
            properties -> new SlabBlock(properties.strength(3f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SALT_BRICKS_WALL = registerBlock("salt_bricks_wall",
            properties -> new WallBlock(properties.strength(3f).requiresCorrectToolForDrops()));

    private static final VoxelShape[] CROP_SHAPES =
            Block.boxes(4, age -> Block.column(16.0, 0.0, 3 + age * 2));

    public static final DeferredBlock<CustomCropBlock.Age4> BELL_PEPPER_CROP = BLOCKS.registerBlock("bell_pepper_crop",
            properties -> new CustomCropBlock.Age4(properties.randomTicks().sound(SoundType.CROP)
                    .instabreak().noCollision().pushReaction(PushReaction.DESTROY),
                    ModItems.BELL_PEPPER_SEEDS, CROP_SHAPES));
    public static final DeferredBlock<CustomCropBlock.Age4> CORN_CROP = BLOCKS.registerBlock("corn_crop",
            properties -> new CustomCropBlock.Age4(properties.randomTicks().sound(SoundType.CROP)
                    .instabreak().noCollision().pushReaction(PushReaction.DESTROY),
                    ModItems.CORN_SEEDS, CROP_SHAPES));
    public static final DeferredBlock<CustomCropBlock.Age4> EGGPLANT_CROP = BLOCKS.registerBlock("eggplant_crop",
            properties -> new CustomCropBlock.Age4(properties.randomTicks().sound(SoundType.CROP)
                    .instabreak().noCollision().pushReaction(PushReaction.DESTROY),
                    ModItems.EGGPLANT_SEEDS, CROP_SHAPES));
    public static final DeferredBlock<CustomCropBlock.Age4> ZUCCHINI_CROP = BLOCKS.registerBlock("zucchini_crop",
            properties -> new CustomCropBlock.Age4(properties.randomTicks().sound(SoundType.CROP)
                    .instabreak().noCollision().pushReaction(PushReaction.DESTROY),
                    ModItems.ZUCCHINI_SEEDS, CROP_SHAPES));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}