package net.hanas_cards.component;

import net.hanas_cards.HanasCardsMod;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

public class ModDataComponentTypes {

    // No need for ComponentType registration anymore as we now work directly with NBT

    public static void registerDataComponentTypes() {
        HanasCardsMod.LOGGER.info("Setting up NBT handling for Card Components in " + HanasCardsMod.MOD_ID);
    }

    // Helper method to write CardComponent to NBT
    public static void writeCardComponentToNbt(ItemStack stack, CardComponent component) {
        NbtCompound nbt = stack.getOrCreateNbt();
        component.writeNbt(nbt); // Assuming you implement writeNbt in CardComponent
        stack.setNbt(nbt);
    }

    // Helper method to read CardComponent from NBT
    public static CardComponent readCardComponentFromNbt(ItemStack stack) {
        NbtCompound nbt = stack.getNbt();
        return nbt != null ? CardComponent.fromNbt(nbt) : CardComponent.DEFAULT;
    }
}