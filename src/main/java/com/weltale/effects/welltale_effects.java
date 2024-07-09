package com.weltale.effects;

import com.weltale.Weltale;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class welltale_effects {
    public static StatusEffect СURVATURE;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(Weltale.MOD_ID, name),
                new curvature(StatusEffectCategory.HARMFUL, 3124687));
    }

    public static void registerEffects() {
        СURVATURE = registerStatusEffect("curvature");
    }
}



