package com.shpouf.artisanalfood.food;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;

public class ModFoods {
    public static final FoodProperties CORN_SEEDS = new FoodProperties.Builder().nutrition(1).saturationModifier(0.5f).build();
    public static final Consumable CORN_SEEDS_CONSUMABLE = Consumables.defaultFood().consumeSeconds(0.8F).build();

    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(2).saturationModifier(0.7f).build();
    public static final Consumable CORN_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties GRILLED_CORN = new FoodProperties.Builder().nutrition(3).saturationModifier(0.9f).build();
    public static final Consumable GRILLED_CORN_CONSUMABLE = Consumables.defaultFood().consumeSeconds(0.8F).build();

    public static final FoodProperties RED_BELL_PEPPER = new FoodProperties.Builder().nutrition(2).saturationModifier(0.7f).build();
    public static final Consumable RED_BELL_PEPPER_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties EGGPLANT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Consumable EGGPLANT_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties ZUCCHINI = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Consumable ZUCCHINI_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties SALTED_COD = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable SALTED_COD_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties SWEET_BERRIES_JAM = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable SWEET_BERRIES_JAM_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties HONEY_CANDIES = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable HONEY_CANDIES_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties GARLIC = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable GARLIC_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties ONION = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable ONION_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable TOMATO_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties POPCORN = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable POPCORN_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties LEEK = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable LEEK_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties LEEK_PENCIL = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable LEEK_PENCIL_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties TOFU = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable TOFU_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties SARDINE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable SARDINE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties GRILLED_SARDINE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable GRILLED_SARDINE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties TENTACLE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable TENTACLE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties GRILLED_TENTACLE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable GRILLED_TENTACLE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();
    
    public static final FoodProperties CANDY_APPLE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable CANDY_APPLE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(2.4F).build(); // effet de regen
    
    public static final FoodProperties SOYBEAN = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable SOYBEAN_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build(); //TODO faire du poison
    
    public static final FoodProperties SOY_MILK = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final Consumable SOY_MILK_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build(); //TODO faire du lait
    
    public static final FoodProperties BOWL_OF_RATATOUILLE = new FoodProperties.Builder().nutrition(7).saturationModifier(0.8f).build();
    public static final Consumable BOWL_OF_RATATOUILLE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties VEGETABLE_SOUP = new FoodProperties.Builder().nutrition(5).saturationModifier(0.9f).build();
    public static final Consumable VEGETABLE_SOUP_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

    public static final FoodProperties CREME_BRULEE = new FoodProperties.Builder().nutrition(3).saturationModifier(1.2f).build();
    public static final Consumable CREME_BRULEE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6F).build();

}
