package net.hanas_cards.component;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DataComponentTypes {
    public static final CardComponentType CARD_COMPONENT =
            new CardComponentType(Identifier.of("hanas_cards", "card_component"), CardComponent.CODEC);

    public static void register() {
        Registry.register(Registries.DATA_COMPONENT_TYPE, CARD_COMPONENT.getId(), CARD_COMPONENT);
    }
}