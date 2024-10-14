package net.hanas_cards.item.Custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.util.Identifier;

import java.util.List;

public class TamedWolfCard extends CardItem {
    private final String collarColor;
    private final String wolfType; // Type of the wolf, e.g., "ashen", "black"
    private final Identifier baseTextureName; // Base texture for the wolf type
    private final Identifier collarTexture;

    // Constructor for the TamedWolfCard class
    public TamedWolfCard(Settings settings, String world, String type, String variant, Rarity rarity, String wolfType, String collarColor, Identifier baseTextureName, Identifier collarTexture) {
        super(settings, world, type, variant, rarity); // Call the constructor of the parent class (CardItem)
        this.collarColor = collarColor;
        this.wolfType = wolfType; // Initialize the wolf type
        this.baseTextureName = baseTextureName; // Construct base texture name
        this.collarTexture = collarTexture;
    }

    // Method to get the wolf type (not necessarily needed, but kept for reference)
    public Identifier getWolfType() {
        return Identifier.of("hanas_cards", "item/" + wolfType + "_wolf");
    }

    public String getWolfCardType() {
        return wolfType;
        }

    // Method to get the base texture
    public Identifier getBaseTexture() {
        return this.baseTextureName;
    }

    // Method to get the collar texture based on the collar color stored in the NBT
    public Identifier getCollarTexture() {
        return this.collarTexture;
    }

    public String getCollarColor() {
        return this.collarColor;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
    }
}


