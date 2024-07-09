package com.weltale;

import com.mojang.brigadier.LiteralMessage;
import com.weltale.block.welltale_blocks;
import com.weltale.effects.welltale_effects;
import com.weltale.items.welltale_items;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.TypedActionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Weltale implements ModInitializer {

	public static final String MOD_ID = "weltale";
	public static final Logger LOGGER = LoggerFactory.getLogger("weltale");

	@Override
	public void onInitialize() {
		welltale_items.registerModItems();
		welltale_blocks.registerModBlocks();
		welltale_effects.registerEffects();


		LOGGER.info("welltale is start");

		//кастыль
		AttackEntityCallback.EVENT.register((player, world, hand,entity,hitResult) -> {
			ItemStack helmet = player.getInventory().armor.get(3);
			if (helmet.getItem() == welltale_items.OTHER_CROWN) {
				// Накладываем эффект на игрока
				player.addStatusEffect(new StatusEffectInstance(welltale_effects.СURVATURE, 600, 1));
			}
			return ActionResult.PASS;
		});
	}
}