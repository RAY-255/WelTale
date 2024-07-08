package com.weltale;

import com.weltale.block.welltale_blocks;
import com.weltale.items.welltale_items;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Weltale implements ModInitializer {

	public static final String MOD_ID = "weltale";
    public static final Logger LOGGER = LoggerFactory.getLogger("weltale");

	@Override
	public void onInitialize() {
		welltale_items.registerModItems();
		welltale_blocks.registerModBlocks();


		LOGGER.info("welltale is start");
	}
}