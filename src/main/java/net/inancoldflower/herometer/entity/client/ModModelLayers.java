package net.inancoldflower.herometer.entity.client;

import net.inancoldflower.herometer.HeroMeter;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer INKU =
            new EntityModelLayer(new Identifier(HeroMeter.MOD_ID, "inku"), "main");
}
