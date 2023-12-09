package net.inancoldflower.herometer.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent Hard_Boiled_egg = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 7),0.25f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 7), 0.5f).build();
}
