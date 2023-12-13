package net.inancoldflower.herometer.item.client;

import net.inancoldflower.herometer.HeroMeter;
import net.inancoldflower.herometer.item.custom.InkuArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class InkuArmorModel extends GeoModel<InkuArmorItem> {
    @Override
    public Identifier getModelResource(InkuArmorItem animatable) {
        return new Identifier(HeroMeter.MOD_ID, "geo/inku_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(InkuArmorItem animatable) {
        return new Identifier(HeroMeter.MOD_ID, "textures/armor/inku_head_texture.png");
    }

    @Override
    public Identifier getAnimationResource(InkuArmorItem animatable) {
        return new Identifier(HeroMeter.MOD_ID, "animations/inku_armor.animation.json");
    }
}
