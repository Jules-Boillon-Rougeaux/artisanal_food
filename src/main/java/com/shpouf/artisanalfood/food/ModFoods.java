package com.shpouf.artisanalfood.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoods {
    public static final FoodProperties CREME_BRULEE = new FoodProperties.Builder().nutrition(2).saturationModifier(1f).build();

    public static final Consumable CREME_BRULEE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.6F)
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400)))
            .build();
}
