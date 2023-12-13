package net.inancoldflower.herometer.item.client;

import net.inancoldflower.herometer.item.custom.InkuArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class InkuArmorRenderer extends GeoArmorRenderer<InkuArmorItem> {
    public InkuArmorRenderer() {
        super(new InkuArmorModel());
    }
}
