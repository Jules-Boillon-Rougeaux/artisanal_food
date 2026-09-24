package com.shpouf.artisanalfood.item;

import com.shpouf.artisanalfood.ArtisanalFood;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArtisanalFood.MOD_ID);

    public static final DeferredItem<Item> RED_BELL_PEPPER = ITEMS.registerSimpleItem("red_bell_pepper");
    public static final DeferredItem<Item> ZUCCHINI = ITEMS.registerSimpleItem("zucchini");
    public static final DeferredItem<Item> CORN = ITEMS.registerSimpleItem("corn");
    public static final DeferredItem<Item> EGGPLANT = ITEMS.registerSimpleItem("eggplant");

    public static final DeferredItem<Item> CORNSTARCH = ITEMS.registerSimpleItem("cornstarch");
    public static final DeferredItem<Item> RAMEKIN = ITEMS.registerSimpleItem("ramekin");
    public static final DeferredItem<Item> WHEAT_FLOUR = ITEMS.registerSimpleItem("wheat_flour");
    public static final DeferredItem<Item> SALT = ITEMS.registerSimpleItem("salt");
    public static final DeferredItem<Item> SPARKLING_POWDER = ITEMS.registerSimpleItem("sparkling_powder");

    public static final DeferredItem<Item> CREME_BRULEE = ITEMS.registerSimpleItem("creme_brulee");
    public static final DeferredItem<Item> BOWL_OF_RATATOUILLE = ITEMS.registerSimpleItem("bowl_of_ratatouille");
    public static final DeferredItem<Item> VEGETABLE_SOUP = ITEMS.registerSimpleItem("vegetable_soup");

    public static final DeferredItem<Item> MINI_CHARCOAL = ITEMS.registerSimpleItem("mini_charcoal");
    public static final DeferredItem<Item> MINI_COAL = ITEMS.registerSimpleItem("mini_coal");

    public static final DeferredItem<Item> CORN_SEEDS = ITEMS.registerSimpleItem("corn_seeds");
    public static final DeferredItem<Item> EGGPLANT_SEEDS = ITEMS.registerSimpleItem("eggplant_seeds");
    public static final DeferredItem<Item> BELL_PEPPER_SEEDS = ITEMS.registerSimpleItem("bell_pepper_seeds");
    public static final DeferredItem<Item> ZUCCHINI_SEEDS = ITEMS.registerSimpleItem("zucchini_seeds");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
