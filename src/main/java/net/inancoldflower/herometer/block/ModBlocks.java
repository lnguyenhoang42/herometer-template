package net.inancoldflower.herometer.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.inancoldflower.herometer.HeroMeter;
import net.inancoldflower.herometer.block.custom.Inku_big_egg;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block Inku_Egg_Block = registerBlock("inku_egg_block",
            new Inku_big_egg(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(HeroMeter.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(HeroMeter.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        HeroMeter.LOGGER.info("Registering Blocks for " + HeroMeter.MOD_ID);
    }
}
