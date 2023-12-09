package net.inancoldflower.herometer.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.inancoldflower.herometer.HeroMeter;
import net.inancoldflower.herometer.item.custom.Inku_egg;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Hard_Boiled_Egg = registerItem("inku_egg",
            new Inku_egg(new FabricItemSettings().food(ModFoodComponents.Hard_Boiled_egg)));
    public static final Item Hard_Boiled_Egg_Wearable = registerItem("inku_egg_wearable",
            new ArmorItem(ModArmorMaterials.INKU, ArmorItem.Type.HELMET, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(Hard_Boiled_Egg);
        entries.add(Hard_Boiled_Egg_Wearable);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HeroMeter.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HeroMeter.LOGGER.info("Registering Mod Items for " + HeroMeter.MOD_ID);
        
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}