package com.shpouf.artisanalfood.food;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;

public class ModFoods {
    public static final FoodProperties CORN_SEEDS = new FoodProperties.Builder().nutrition(1).saturationModifier(0.5f).build();
    public static final Consumable CORN_SEEDS_CONSUMABLE = Consumables.defaultFood().consumeSeconds(0.8F).build();

    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(2).saturationModifier(0.7f).build();
    public static final Consumable CORN_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties GRILLED_CORN = new FoodProperties.Builder().nutrition(3).saturationModifier(1.1f).build();
    public static final Consumable GRILLED_CORN_CONSUMABLE = Consumables.defaultFood().consumeSeconds(0.8F).build();

    public static final FoodProperties RED_BELL_PEPPER = new FoodProperties.Builder().nutrition(2).saturationModifier(0.7f).build();
    public static final Consumable RED_BELL_PEPPER_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties EGGPLANT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Consumable EGGPLANT_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties ZUCCHINI = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Consumable ZUCCHINI_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties BOWL_OF_RATATOUILLE = new FoodProperties.Builder().nutrition(7).saturationModifier(0.8f).build();
    public static final Consumable BOWL_OF_RATATOUILLE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties VEGETABLE_SOUP = new FoodProperties.Builder().nutrition(5).saturationModifier(0.9f).build();
    public static final Consumable VEGETABLE_SOUP_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties CREME_BRULEE = new FoodProperties.Builder().nutrition(3).saturationModifier(1.2f).build();
    public static final Consumable CREME_BRULEE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

}
