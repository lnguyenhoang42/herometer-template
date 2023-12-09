package net.inancoldflower.herometer;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.inancoldflower.herometer.block.ModBlocks;
import net.inancoldflower.herometer.entity.ModEntities;
import net.inancoldflower.herometer.entity.custom.InkuEntity;
import net.inancoldflower.herometer.item.ModItemGroups;
import net.inancoldflower.herometer.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeroMeter implements ModInitializer {
	public static final String MOD_ID = "herometer";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        LOGGER.info("Felic is a very cool femboian!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.INKU, InkuEntity.createInkuAttributes());
	}
}