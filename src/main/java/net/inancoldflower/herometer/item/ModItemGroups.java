package net.inancoldflower.herometer.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.inancoldflower.herometer.HeroMeter;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup INK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HeroMeter.MOD_ID, "inku"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.inku"))
                    .icon(() -> new ItemStack(ModItems.Hard_Boiled_Egg)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Hard_Boiled_Egg);

                        entries.add(Items.EGG);
                        entries.add(Items.INK_SAC);
                    }).build());

    public static void registerItemGroups() {
        HeroMeter.LOGGER.info("Registering Mod Item Groups for " + HeroMeter.MOD_ID);
    }
}
