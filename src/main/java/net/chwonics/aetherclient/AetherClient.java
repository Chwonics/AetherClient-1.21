package net.chwonics.aetherclient;

import net.chwonics.aetherclient.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AetherClient implements ModInitializer {
	public static final String MOD_ID = "aether-client";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}