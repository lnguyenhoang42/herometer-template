package net.inancoldflower.herometer.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Inku_egg extends Item {
    public Inku_egg(Settings settings) { super(settings); }
    @Override
    public void appendTooltip(ItemStack itemStack, @Nullable World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(Text.translatable("tooltip.herometer.inku_egg.edible"));
        super.appendTooltip(itemStack, world, tooltip, tooltipContext);
    }
}
