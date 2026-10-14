package com.shpouf.artisanalfood.item;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.block.ModBlocks;
import com.shpouf.artisanalfood.food.ModFoods;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemLore;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

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
    public static final DeferredItem<Item> SALTED_COD = ITEMS.registerItem("salted_cod",
            properties -> new Item(properties.food(ModFoods.SALTED_COD, ModFoods.SALTED_COD_CONSUMABLE)));
    public static final DeferredItem<Item> BOWL_OF_RATATOUILLE = ITEMS.registerItem("bowl_of_ratatouille",
            properties -> new Item(properties.food(ModFoods.BOWL_OF_RATATOUILLE, ModFoods.BOWL_OF_RATATOUILLE_CONSUMABLE).stacksTo(8).usingConvertsTo(Items.BOWL)));
    public static final DeferredItem<Item> VEGETABLE_SOUP = ITEMS.registerItem("vegetable_soup",
            properties -> new Item(properties.food(ModFoods.VEGETABLE_SOUP, ModFoods.VEGETABLE_SOUP_CONSUMABLE).stacksTo(8).usingConvertsTo(Items.BOWL)));
    public static final DeferredItem<Item> CREME_BRULEE = ITEMS.registerItem("creme_brulee",
            properties -> new Item(properties.food(ModFoods.CREME_BRULEE, ModFoods.CREME_BRULEE_CONSUMABLE).stacksTo(8).usingConvertsTo(ModItems.RAMEKIN.get())));

    public static final DeferredItem<Item> SWEET_BERRIES_JAM = ITEMS.registerItem("sweet_berries_jam",
            properties -> new Item(properties.food(ModFoods.SWEET_BERRIES_JAM, ModFoods.SWEET_BERRIES_JAM_CONSUMABLE).stacksTo(16).usingConvertsTo(Items.GLASS_BOTTLE)));
    
    public static final DeferredItem<Item> HONEY_CANDIES = ITEMS.registerItem("honey_candies",
            properties -> new Item(properties.food(ModFoods.HONEY_CANDIES, ModFoods.HONEY_CANDIES_CONSUMABLE)));

    public static final DeferredItem<Item> ONION = ITEMS.registerItem("onion",
            properties -> new Item(properties.food(ModFoods.ONION, ModFoods.ONION_CONSUMABLE)));

    public static final DeferredItem<Item> TOMATO = ITEMS.registerItem("tomato",
            properties -> new Item(properties.food(ModFoods.TOMATO, ModFoods.TOMATO_CONSUMABLE)));

    public static final DeferredItem<Item> POPCORN = ITEMS.registerItem("popcorn",
            properties -> new Item(properties.food(ModFoods.POPCORN, ModFoods.POPCORN_CONSUMABLE)
                    .component(
                            DataComponents.LORE, new ItemLore(List.of(
                                    Component.translatable("tooltip.artisanalfood.popcorn.tooltip")
                                            .withStyle(ChatFormatting.DARK_GRAY)
                            ))
                    )
            ));

    public static final DeferredItem<Item> LEEK = ITEMS.registerItem("leek",
            properties -> new Item(properties.food(ModFoods.LEEK, ModFoods.LEEK_CONSUMABLE)));

    public static final DeferredItem<Item> LEEK_PENCIL = ITEMS.registerItem("leek_pencil",
            properties -> new Item(properties.food(ModFoods.LEEK_PENCIL, ModFoods.LEEK_PENCIL_CONSUMABLE)));

    public static final DeferredItem<Item> TOFU = ITEMS.registerItem("tofu",
            properties -> new Item(properties.food(ModFoods.TOFU, ModFoods.TOFU_CONSUMABLE)));

    public static final DeferredItem<Item> SOYBEAN = ITEMS.registerItem("soybean",
            properties -> new Item(properties.food(ModFoods.SOYBEAN, ModFoods.SOYBEAN_CONSUMABLE)));

    public static final DeferredItem<Item> SARDINE = ITEMS.registerItem("sardine",
            properties -> new Item(properties.food(ModFoods.SARDINE, ModFoods.SARDINE_CONSUMABLE)));

    public static final DeferredItem<Item> GRILLED_SARDINE = ITEMS.registerItem("grilled_sardine",
            properties -> new Item(properties.food(ModFoods.GRILLED_SARDINE, ModFoods.GRILLED_SARDINE_CONSUMABLE)));

    public static final DeferredItem<Item> TENTACLE = ITEMS.registerItem("tentacle",
            properties -> new Item(properties.food(ModFoods.TENTACLE, ModFoods.TENTACLE_CONSUMABLE)));

    public static final DeferredItem<Item> GRILLED_TENTACLE = ITEMS.registerItem("grilled_tentacle",
            properties -> new Item(properties.food(ModFoods.GRILLED_TENTACLE, ModFoods.GRILLED_TENTACLE_CONSUMABLE)));

    public static final DeferredItem<Item> CANDY_APPLE = ITEMS.registerItem("candy_apple",
            properties -> new Item(properties.food(ModFoods.CANDY_APPLE, ModFoods.CANDY_APPLE_CONSUMABLE).stacksTo(16).usingConvertsTo(Items.STICK)));

    public static final DeferredItem<Item> SOY_MILK = ITEMS.registerItem("soy_milk",
            properties -> new Item(properties.food(ModFoods.SOY_MILK, ModFoods.SOY_MILK_CONSUMABLE).stacksTo(4).usingConvertsTo(Items.GLASS_BOTTLE)));

    public static final DeferredItem<Item> CORN_SEEDS = ITEMS.registerItem("corn_seeds",
            properties -> new BlockItem(ModBlocks.CORN_CROP.get(), properties.food(ModFoods.CORN_SEEDS, ModFoods.CORN_SEEDS_CONSUMABLE)));

    public static final DeferredItem<Item> MINI_CHARCOAL = ITEMS.registerSimpleItem("mini_charcoal");
    public static final DeferredItem<Item> MINI_COAL = ITEMS.registerSimpleItem("mini_coal");

    public static final DeferredItem<Item> BELL_PEPPER_SEEDS = ITEMS.registerItem("bell_pepper_seeds",
            properties -> new BlockItem(ModBlocks.BELL_PEPPER_CROP.get(), properties));
    public static final DeferredItem<Item> EGGPLANT_SEEDS = ITEMS.registerItem("eggplant_seeds",
            properties -> new BlockItem(ModBlocks.EGGPLANT_CROP.get(), properties));
    public static final DeferredItem<Item> ZUCCHINI_SEEDS = ITEMS.registerItem("zucchini_seeds",
            properties -> new BlockItem(ModBlocks.ZUCCHINI_CROP.get(), properties));
    public static final DeferredItem<Item> ONION_SEEDS = ITEMS.registerItem("onion_seeds",
            properties -> new BlockItem(ModBlocks.ONION_CROP.get(), properties));

    public static final DeferredItem<Item> GARLIC = ITEMS.registerItem("garlic",
            properties -> new BlockItem(ModBlocks.GARLIC_CROP.get(), properties.food(ModFoods.GARLIC, ModFoods.GARLIC_CONSUMABLE)));

    public static final DeferredItem<Item> TOMATO_SEEDS = ITEMS.registerItem("tomato_seeds",
            properties -> new BlockItem(ModBlocks.TOMATO_CROP.get(), properties));
    public static final DeferredItem<Item> LEEK_SEEDS = ITEMS.registerItem("leek_seeds",
            properties -> new BlockItem(ModBlocks.LEEK_CROP.get(), properties));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}