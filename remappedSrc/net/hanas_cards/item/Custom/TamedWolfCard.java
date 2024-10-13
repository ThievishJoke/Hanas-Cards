package net.hanas_cards.item.Custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtInt;
import net.minecraft.nbt.NbtType;
import net.minecraft.util.Rarity;
import net.minecraft.util.Identifier;


public class TamedWolfCard extends CardItem {
    private final String wolfType; // Type of the wolf, e.g., "ashen", "black"
    private final String baseTextureName; // Base texture for the wolf type
    private static final String DEFAULT_COLLAR_COLOR = "red"; // Default collar color

    // Constructor for the TamedWolfCard class
    public TamedWolfCard(Item.Settings settings, String world, String type, String variant, Rarity rarity, String wolfType) {
        super(settings, world, type, variant, rarity); // Call the constructor of the parent class (CardItem)
        this.wolfType = wolfType; // Initialize the wolf type
        this.baseTextureName = "hanas_cards:item/" + wolfType + "_wolf"; // Construct base texture name
    }

    // Method to get the base texture
    public void getBaseTexture() {
        Identifier.of(baseTextureName);
    }

    // Method to get the collar texture based on the collar color stored in the NBT
    public void getCollarTexture(ItemStack stack) {
        String collarColor = TamedWolfCard.getCollarColor(stack); // Get collar color from NBT
        Identifier.of("hanas_cards", "collars/collar_" + collarColor);
    }

    private static String getCollarColor(ItemStack stack) {
    }

    // Method to get the wolf type (not necessarily needed, but kept for reference)
    public void getWolfType() {
        Identifier.of("hanas_cards", "item/" + wolfType + "_wolf");
    }
}


