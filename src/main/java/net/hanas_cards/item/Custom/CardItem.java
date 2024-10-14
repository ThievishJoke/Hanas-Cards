package net.hanas_cards.item.Custom;

import net.hanas_cards.component.CardComponent;
import net.hanas_cards.component.ModDataComponentTypes;
import net.hanas_cards.util.CardModTags;
import net.hanas_cards.util.CustomCardRarity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.world.World;

import java.util.List;

import static net.hanas_cards.util.TextUtils.*;

public class CardItem extends Item {

    private final String dimension;
    private final String mobType;
    private final String variant;
    private final Rarity rarity;
    private final CustomCardRarity customRarity;

    /**
     * Card Item Using Vanilla Rarity
     */
    public CardItem(Settings settings, String dimension, String mob_type, String variant, Rarity rarity) {
        super(settings.rarity(rarity).maxCount(16));
        this.dimension = dimension;
        this.mobType = mob_type;
        this.variant = variant;
        this.rarity = rarity;
        this.customRarity = null;
    }

    /**
     * Card Item Using Custom Rarity
     */
    public CardItem(Settings settings, String dimension, String mob_type, String variant, CustomCardRarity customRarity) {
        super(settings.maxCount(16));
        this.dimension = dimension;
        this.mobType = mob_type;
        this.variant = variant;
        this.rarity = null;
        this.customRarity = customRarity;
    }

    /**
     * Override getName() to change the display color of the item name for Card Items using Custom Rarity
     */
    @Override
    public Text getName(ItemStack stack) {
        if (customRarity != null) {
            String colorCode = customRarity.getColorCode();
            MutableText cardName = Text.translatable("item.cardItem.hanas_cards.name");
            String cleanVariant = variant.replaceAll("§.", "");
            MutableText fullName = Text.literal(colorCode + toTitleCase(cleanVariant) + " ")
                    .append(Text.literal(colorCode + toTitleCase(mobType) + " "))
                    .append(cardName.formatted(customRarity.getFormatting()));
            return fullName.formatted(customRarity.getFormatting());
        } else if (rarity != null) {
            // Handle rarity case if needed
        }
        return super.getName(stack);
    }

    // Todo: Implement inspect-on-use behavior
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        if (!world.isClient) {
            player.sendMessage(Text.literal("Meow!"), true);

            // Check if the stack has a CardComponent
            CardComponent component = stack.get(ModDataComponentTypes.CARD_COMPONENT);

            if (component != null) {
                // If the card is already graded, notify the player
                if (component.getGrading() > 0) {
                    player.sendMessage(Text.literal("This card is already graded!"), true);
                    return TypedActionResult.fail(stack);
                }
            }

            // If the card is not graded, create a new component with a random grading
            int newGrading = 1 + world.getRandom().nextInt(5);
            CardComponent newComponent = new CardComponent(newGrading, "Graded", List.of("tag"));

            stack.set(ModDataComponentTypes.CARD_COMPONENT, newComponent);

            player.sendMessage(Text.literal("Card graded!"), true);
            return TypedActionResult.success(stack);
        }
        return super.use(world, player, hand);
    }

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
        tooltip.add(Text.translatable("§fType: §7§l" + toTitleCase(mobType)));
        tooltip.add(Text.literal("---------------------"));

        String boldedVariant = variant.replaceAll("(§.)", "$1§l");
        tooltip.add(Text.translatable("§fVariant: §7§l" + toTitleCase(boldedVariant)));
        tooltip.add(Text.literal("---------------------"));

        // Append grading information to the tooltip
        if (stack.get(ModDataComponentTypes.CARD_COMPONENT) != null) {
            tooltip.add(Text.literal("§fGrading: §7§l" + stack.get(ModDataComponentTypes.CARD_COMPONENT).getGrading()));
        }

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
