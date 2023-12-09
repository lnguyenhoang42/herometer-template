package net.inancoldflower.herometer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.inancoldflower.herometer.entity.ModEntities;
import net.inancoldflower.herometer.entity.client.InkuModel;
import net.inancoldflower.herometer.entity.client.InkuRenderer;
import net.inancoldflower.herometer.entity.client.ModModelLayers;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class HeroMeterClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HeroMeter.LOGGER.info("Hero is a really cool guy!");

        EntityRendererRegistry.register(ModEntities.INKU, InkuRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.INKU, InkuModel::getTexturedModelData);
    }
}
