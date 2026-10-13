package com.shpouf.artisanalfood.creativemodetab;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArtisanalFood.MOD_ID);

    public static final Supplier<CreativeModeTab> AF_ITEMS_TAB = CREATIVE_MODE_TABS.register("af_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RED_BELL_PEPPER.get()))
                    .title(Component.translatable("creativetab.artisanalfood.af_items"))
                    .withTabsAfter(Identifier.fromNamespaceAndPath(ArtisanalFood.MOD_ID, "af_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        // Vegetables with seed and cooked version
                        output.accept(ModItems.CORN_SEEDS);
                        output.accept(ModItems.POPCORN);
                        output.accept(ModItems.CORN);
                        output.accept(ModItems.GRILLED_CORN);
                        output.accept(ModItems.BELL_PEPPER_SEEDS);
                        output.accept(ModItems.RED_BELL_PEPPER);
                        output.accept(ModItems.EGGPLANT_SEEDS);
                        output.accept(ModItems.EGGPLANT);
                        output.accept(ModItems.ZUCCHINI_SEEDS);
                        output.accept(ModItems.ZUCCHINI);
                        output.accept(ModItems.ONION_SEEDS);
                        output.accept(ModItems.ONION);
                        output.accept(ModItems.TOMATO_SEEDS);
                        output.accept(ModItems.TOMATO);
                        output.accept(ModItems.LEEK_SEEDS);
                        output.accept(ModItems.LEEK_PENCIL);
                        output.accept(ModItems.LEEK);
                        output.accept(ModItems.SOYBEAN);
                        output.accept(ModItems.GARLIC);
                        // Non-eatable ingredients
                        output.accept(ModItems.WHEAT_FLOUR);
                        output.accept(ModItems.SALT);
                        output.accept(ModItems.CORNSTARCH);
                        output.accept(ModItems.SPARKLING_POWDER);
                        output.accept(ModItems.RAMEKIN);
                        // Meat/Fish
                        output.accept(ModItems.SARDINE);
                        output.accept(ModItems.GRILLED_SARDINE);
                        output.accept(ModItems.TENTACLE);
                        output.accept(ModItems.GRILLED_TENTACLE);
                        output.accept(ModItems.SALTED_COD);
                        // Small preparation
                        output.accept(ModItems.SOY_MILK);
                        output.accept(ModItems.TOFU);
                        // Sweet food
                        output.accept(ModItems.HONEY_CANDIES);
                        output.accept(ModItems.SWEET_BERRIES_JAM);
                        output.accept(ModItems.CANDY_APPLE);
                        output.accept(ModItems.CREME_BRULEE);
                        // Big food
                        output.accept(ModItems.BOWL_OF_RATATOUILLE);
                        output.accept(ModItems.VEGETABLE_SOUP);
                        // Other
                        output.accept(ModItems.MINI_COAL);
                        output.accept(ModItems.MINI_CHARCOAL);
                    }).build());

    public static final Supplier<CreativeModeTab> AF_BLOCKS_TAB = CREATIVE_MODE_TABS.register("af_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SALT_BLOCK.get()))
                    .title(Component.translatable("creativetab.artisanalfood.af_blocks"))
                    .withTabsBefore(Identifier.fromNamespaceAndPath(ArtisanalFood.MOD_ID, "af_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.CHARCOAL_BLOCK);
                        output.accept(ModBlocks.SALT_ORE);
                        output.accept(ModBlocks.DEEPSLATE_SALT_ORE);
                        output.accept(ModBlocks.SALT_BLOCK);
                        output.accept(ModBlocks.SALT_STAIRS);
                        output.accept(ModBlocks.SALT_SLAB);
                        output.accept(ModBlocks.SALT_WALL);
                        output.accept(ModBlocks.POLISHED_SALT_BLOCK);
                        output.accept(ModBlocks.POLISHED_SALT_STAIRS);
                        output.accept(ModBlocks.POLISHED_SALT_SLAB);
                        output.accept(ModBlocks.POLISHED_SALT_WALL);
                        output.accept(ModBlocks.SALT_BRICKS);
                        output.accept(ModBlocks.SALT_BRICKS_STAIRS);
                        output.accept(ModBlocks.SALT_BRICKS_SLAB);
                        output.accept(ModBlocks.SALT_BRICKS_WALL);
                        output.accept(ModBlocks.CHISELED_SALT_BRICKS);
                        output.accept(ModBlocks.SPARKLING_GLASS);
                        output.accept(ModBlocks.SPARKLING_COBBLESTONE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
