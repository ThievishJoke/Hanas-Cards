package net.hanas_cards.item.Custom;

import net.hanas_cards.util.CustomCardRarity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FlyingPigCard extends CardItem {

    public FlyingPigCard(Settings settings, String dimension, String mob_type, String variant, CustomCardRarity customRarity) {
        super(settings, dimension, mob_type, variant, customRarity);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatableWithFallback("tooltip.hanas_cards.flying_pig_card", "I can't believe it").formatted(Formatting.GOLD));
        // Add Card Item tooltip
        super.appendTooltip(stack, world, tooltip, context);

        if(!Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.hanas_cards.flying_pig_card.shift"));
        } else {
            tooltip.add(Text.literal("'You look on the other ").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("Side of the card and ").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("see the wings attached ").formatted(Formatting.GRAY));
            tooltip.add(Text.literal("with slime on the back'").formatted(Formatting.GRAY));
        }
    }
}
