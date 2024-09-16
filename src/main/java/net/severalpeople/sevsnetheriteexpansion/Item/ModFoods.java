package net.severalpeople.sevsnetheriteexpansion.Item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties NETHERITE_SANDWICH = new FoodProperties.Builder().alwaysEat().nutrition(26)
            .saturationMod(5.8f).effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 820, 5), 1f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 320, 0), 1f).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1250, 0), 1f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1250, 3), 1f).build();

    public static final FoodProperties NETHERITE_DIPPED_CARROT = new FoodProperties.Builder().alwaysEat().nutrition(14)
            .saturationMod(3.8f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 1250), 1f).effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 16), 0.35f).build();

}
