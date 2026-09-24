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

    public static final Supplier<CreativeModeTab> AZURITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("azurite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RED_BELL_PEPPER.get()))
                    .title(Component.translatable("creativetab.artisanalfood.azurite_items"))
                    .withTabsAfter(Identifier.fromNamespaceAndPath(ArtisanalFood.MOD_ID, "azurite_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RED_BELL_PEPPER);
                        output.accept(ModItems.ZUCCHINI);
                        output.accept(ModItems.CORN);
                        output.accept(ModItems.CORNSTARCH);
                        output.accept(ModItems.EGGPLANT);

                        output.accept(ModItems.RAMEKIN);
                        output.accept(ModItems.WHEAT_FLOUR);
                        output.accept(ModItems.SALT);
                        output.accept(ModItems.SPARKLING_POWDER);

                        output.accept(ModItems.CREME_BRULEE);
                        output.accept(ModItems.BOWL_OF_RATATOUILLE);
                        output.accept(ModItems.VEGETABLE_SOUP);

                        output.accept(ModItems.MINI_CHARCOAL);
                        output.accept(ModItems.MINI_COAL);

                        output.accept(ModItems.CORN_SEEDS);
                        output.accept(ModItems.EGGPLANT_SEEDS);
                        output.accept(ModItems.BELL_PEPPER_SEEDS);
                        output.accept(ModItems.ZUCCHINI_SEEDS);
                    }).build());

    public static final Supplier<CreativeModeTab> AZURITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("azurite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AZURITE_BLOCK.get()))
                    .title(Component.translatable("creativetab.artisanalfood.azurite_blocks"))
                    .withTabsBefore(Identifier.fromNamespaceAndPath(ArtisanalFood.MOD_ID, "azurite_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.AZURITE_BLOCK);
                        output.accept(ModBlocks.AZURITE_ORE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
