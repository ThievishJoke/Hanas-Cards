package net.hanas_cards.item.Custom;

import net.hanas_cards.util.CustomCardRarity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static net.hanas_cards.util.TextUtils.toTitleCase;

public class SourceCard extends Item{

    private final String dimension;
    private final String sourceType;
    private final String variant;
    private final Rarity rarity;
    private final CustomCardRarity customRarity;

    /**
     * Card Item Using Vanilla Rarity
     */
    public SourceCard(Item.Settings settings, String dimension, String source_type, String variant, Rarity rarity) {
        super(settings.rarity(rarity).maxCount(16));
        this.dimension = dimension;
        this.sourceType = source_type;
        this.variant = variant;
        this.rarity = rarity;
        this.customRarity = null;
    }

    /**
     * Card Item Using Custom Rarity
     */
    public SourceCard(Item.Settings settings, String dimension, String source_type, String variant, CustomCardRarity customRarity) {
        super(settings.maxCount(16));
        this.dimension = dimension;
        this.sourceType = source_type;
        this.variant = variant;
        this.rarity = null;
        this.customRarity = customRarity;
    }

    public Rarity getRarity() {
        return this.rarity; // This assumes you already have the Rarity field defined.
    }

    /**
     * Get the custom rarity of the card.
     *
     * @return the custom rarity, or null if not set.
     */

    public CustomCardRarity getCustomRarity() {
        return customRarity;
    }

    @Override
    public Text getName(ItemStack stack) {
        if (customRarity != null) {
            String colorCode = customRarity.getColorCode();
            MutableText cardName = Text.translatable("item.cardItem.hanas_cards.name");
            String cleanVariant = variant.replaceAll("§.", "");
            return Text.literal(colorCode + toTitleCase(cleanVariant) + " ")
                    .append(Text.literal(colorCode + toTitleCase(sourceType) + " "))
                    .append(cardName.formatted(customRarity.getFormatting()))
                    .formatted(customRarity.getFormatting());
        }
        return super.getName(stack);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, @NotNull List<Text> tooltip, TooltipType type) {
        // Add Card Item tooltip
        super.appendTooltip(stack, context, tooltip, type);

        if(!Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.hanas_cards.flying_pig_card.shift"));
        } else {
            tooltip.add(Text.literal("'You look on the other ").formatted(Formatting.GRAY));
        }
    }
}
