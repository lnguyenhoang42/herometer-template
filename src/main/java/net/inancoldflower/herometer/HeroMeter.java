package net.inancoldflower.herometer;

import net.fabricmc.api.ModInitializer;

import net.inancoldflower.herometer.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeroMeter implements ModInitializer {
	public static final String MOD_ID = "herometer";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        LOGGER.info("Felic is a very cool femboian!");
		ModItems.registerModItems();
	}
}