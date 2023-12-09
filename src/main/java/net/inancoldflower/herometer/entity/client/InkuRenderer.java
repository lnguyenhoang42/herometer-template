package net.inancoldflower.herometer.entity.client;

import net.inancoldflower.herometer.HeroMeter;
import net.inancoldflower.herometer.entity.custom.InkuEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class InkuRenderer extends MobEntityRenderer<InkuEntity, InkuModel<InkuEntity>> {
    private static final Identifier TEXTURE = new Identifier(HeroMeter.MOD_ID, "textures/entity/inkuman.png");
    public InkuRenderer(EntityRendererFactory.Context context) {
        super(context, new InkuModel<>(context.getPart(ModModelLayers.INKU)), 0.6f);
    }

    @Override
    public Identifier getTexture(InkuEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(InkuEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f,1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
