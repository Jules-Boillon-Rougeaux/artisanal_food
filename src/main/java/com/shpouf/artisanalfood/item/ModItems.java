package com.shpouf.artisanalfood.item;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.food.ModFoods;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.TooltipDisplay;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Consumer;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArtisanalFood.MOD_ID);

    public static final DeferredItem<Item> RED_BELL_PEPPER = ITEMS.registerItem("red_bell_pepper",
            properties -> new Item(properties.food(ModFoods.RED_BELL_PEPPER, ModFoods.RED_BELL_PEPPER_CONSUMABLE)));

    public static final DeferredItem<Item> ZUCCHINI = ITEMS.registerItem("zucchini",
            properties -> new Item(properties.food(ModFoods.ZUCCHINI, ModFoods.ZUCCHINI_CONSUMABLE)));

    public static final DeferredItem<Item> CORN = ITEMS.registerItem("corn",
            properties -> new Item(properties.food(ModFoods.CORN, ModFoods.CORN_CONSUMABLE)));

    public static final DeferredItem<Item> EGGPLANT = ITEMS.registerItem("eggplant",
            properties -> new Item(properties.food(ModFoods.EGGPLANT, ModFoods.EGGPLANT_CONSUMABLE)));


    public static final DeferredItem<Item> CORNSTARCH = ITEMS.registerSimpleItem("cornstarch");
    public static final DeferredItem<Item> RAMEKIN = ITEMS.registerSimpleItem("ramekin");
    public static final DeferredItem<Item> WHEAT_FLOUR = ITEMS.registerSimpleItem("wheat_flour");
    public static final DeferredItem<Item> SALT = ITEMS.registerSimpleItem("salt");
    public static final DeferredItem<Item> SPARKLING_POWDER = ITEMS.registerSimpleItem("sparkling_powder");

    public static final DeferredItem<Item> GRILLED_CORN = ITEMS.registerItem("grilled_corn",
            properties -> new Item(properties.food(ModFoods.GRILLED_CORN, ModFoods.GRILLED_CORN_CONSUMABLE)));
    public static final DeferredItem<Item> CREME_BRULEE = ITEMS.registerItem("creme_brulee",
            properties -> new Item(properties.food(ModFoods.CREME_BRULEE, ModFoods.CREME_BRULEE_CONSUMABLE).stacksTo(8).usingConvertsTo(ModItems.RAMEKIN.get())));
    public static final DeferredItem<Item> BOWL_OF_RATATOUILLE = ITEMS.registerItem("bowl_of_ratatouille",
            properties -> new Item(properties.food(ModFoods.BOWL_OF_RATATOUILLE, ModFoods.BOWL_OF_RATATOUILLE_CONSUMABLE).stacksTo(8).usingConvertsTo(Items.BOWL)));
    public static final DeferredItem<Item> VEGETABLE_SOUP = ITEMS.registerItem("vegetable_soup",
            properties -> new Item(properties.food(ModFoods.VEGETABLE_SOUP, ModFoods.VEGETABLE_SOUP_CONSUMABLE).stacksTo(8).usingConvertsTo(Items.BOWL)));

    public static final DeferredItem<Item> CORN_SEEDS = ITEMS.registerItem("corn_seeds",
            properties -> new Item(properties.food(ModFoods.CORN_SEEDS, ModFoods.CORN_SEEDS_CONSUMABLE)){
                @Override
                public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                    builder.accept(Component.translatable("tooltip.artisanalfood.cornseeds.tooltip"));
                    super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                }
            });


    public static final DeferredItem<Item> MINI_CHARCOAL = ITEMS.registerSimpleItem("mini_charcoal");
    public static final DeferredItem<Item> MINI_COAL = ITEMS.registerSimpleItem("mini_coal");
    public static final DeferredItem<Item> EGGPLANT_SEEDS = ITEMS.registerSimpleItem("eggplant_seeds");
    public static final DeferredItem<Item> ZUCCHINI_SEEDS = ITEMS.registerSimpleItem("zucchini_seeds");

    public static final DeferredItem<Item> BELL_PEPPER_SEEDS = ITEMS.registerItem("bell_pepper_seeds",
            properties -> new BlockItem(ModBlocks.BELL_PEPPER_CROP.get(), properties));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}