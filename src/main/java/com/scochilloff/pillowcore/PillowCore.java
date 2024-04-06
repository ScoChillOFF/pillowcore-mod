package com.scochilloff.pillowcore;

import com.scochilloff.pillowcore.block.ModBlocks;
import com.scochilloff.pillowcore.item.ModItemGroup;
import com.scochilloff.pillowcore.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PillowCore implements ModInitializer {
	public static final String MOD_ID = "pillowcore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroup.registerModItemGroups();
		ModBlocks.registerModBlocks();
	}
}