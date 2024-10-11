package net.hanas_cards.item.Custom;

import net.hanas_cards.util.CustomCardRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import java.util.List;

import static net.hanas_cards.util.TextUtils.toTitleCase;

public class CardItem extends Item {

    private final String dimension;
    private final String mob_type;
    private final String variant;
    private final Rarity rarity;
    private final CustomCardRarity customRarity;

    public CardItem(Settings settings, String dimension, String mob_type, String variant, Rarity rarity) {
        super(settings.rarity(rarity).maxCount(16));
        this.dimension = dimension;
        this.mob_type = mob_type;
        this.variant = variant;
        this.rarity = rarity;
        this.customRarity = null;
    }

    public CardItem(Settings settings, String dimension, String mob_type, String variant, CustomCardRarity customRarity) {
        super(settings);
        this.dimension = dimension;
        this.mob_type = mob_type;
        this.variant = variant;
        this.rarity = null;
        this.customRarity = customRarity;
    }

    //todo implement inspect on use

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.literal(""));
        tooltip.add(Text.literal("---------------------"));

        String boldedDimension = dimension.replaceAll("(§.)", "$1§l");
        tooltip.add(Text.translatable("§fDimension: §7§l" + toTitleCase(boldedDimension)));

        tooltip.add(Text.literal("---------------------"));
        if (customRarity != null) {
            tooltip.add(Text.translatable("§lRarity: " + customRarity.getColorCode() + "§l" + toTitleCase(customRarity.getDisplayName())));
        } else if (rarity != null) {
            tooltip.add(Text.translatable("§fRarity: " + getRarityColor(rarity) + "§l" + toTitleCase(rarity.name())));
        }

        tooltip.add(Text.literal("---------------------"));
        tooltip.add(Text.translatable("§fType: §7§l" + toTitleCase(mob_type)));
        tooltip.add(Text.literal("---------------------"));

        String boldedVariant = variant.replaceAll("(§.)", "$1§l");
        tooltip.add(Text.translatable("§fVariant: §7§l" + toTitleCase(boldedVariant)));
        tooltip.add(Text.literal("---------------------"));

        super.appendTooltip(stack, context, tooltip, type);
    }

    private String getRarityColor(Rarity rarity) {
        return switch (rarity) {
            case COMMON -> "§f";
            case UNCOMMON -> "§e";
            case RARE -> "§9";
            case EPIC -> "§5";
            default -> "§f";
        };
    }

}
