package com.shpouf.artisanalfood.block;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
            properties -> new Block(properties.strength(2f).lightLevel(state -> 15)));

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
