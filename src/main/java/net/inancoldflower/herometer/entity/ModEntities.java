package net.inancoldflower.herometer.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.inancoldflower.herometer.HeroMeter;
import net.inancoldflower.herometer.entity.custom.InkuEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<InkuEntity> INKU = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(HeroMeter.MOD_ID, "inku"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, InkuEntity::new)
                    .dimensions(EntityDimensions.fixed(.8f, 1.95f)).build());
    public static void registerModEntities() {
        HeroMeter.LOGGER.info("Registering Entities for " + HeroMeter.MOD_ID);
    }
}
