package net.hanas_cards;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.hanas_cards.item.CardModItems;
//import net.hanas_cards.render.TamedWolfCardRenderer;
//import net.hanas_cards.render.CustomWolfCardModel;
//import net.hanas_cards.render.TamedWolfCardRenderer;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class HanasCardsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Register the TamedWolfCardRenderer for each card
        //ModelPredicateProviderRegistry.register(
        //        CardModItems.TAMED_WOLF_ASHEN_CARD,
        //        Identifier.of("collar_color"),
        //        (stack, world, entity, seed) -> {
        //            // This assumes you have logic to store and retrieve the collar color in the ItemStack NBT data
        //            Wolf
        //        }
        //);

        //CustomWolfCardModel.register();

        //BuiltinItemRendererRegistry.INSTANCE.register(CardModItems.TAMED_WOLF_ASHEN_CARD, new TamedWolfCardRenderer());
        //BuiltinItemRendererRegistry.INSTANCE.register(CardModItems.TAMED_WOLF_BLACK_CARD, new TamedWolfCardRenderer());
        //BuiltinItemRendererRegistry.INSTANCE.register(CardModItems.TAMED_WOLF_CHESTNUT_CARD, new TamedWolfCardRenderer());
        //BuiltinItemRendererRegistry.INSTANCE.register(CardModItems.TAMED_WOLF_PALE_CARD, new TamedWolfCardRenderer());
        //BuiltinItemRendererRegistry.INSTANCE.register(CardModItems.TAMED_WOLF_RUSTY_CARD, new TamedWolfCardRenderer());
        //BuiltinItemRendererRegistry.INSTANCE.register(CardModItems.TAMED_WOLF_SNOWY_CARD, new TamedWolfCardRenderer());
        //BuiltinItemRendererRegistry.INSTANCE.register(CardModItems.TAMED_WOLF_SPOTTED_CARD, new TamedWolfCardRenderer());
        //BuiltinItemRendererRegistry.INSTANCE.register(CardModItems.TAMED_WOLF_STRIPED_CARD, new TamedWolfCardRenderer());
        //BuiltinItemRendererRegistry.INSTANCE.register(CardModItems.TAMED_WOLF_WOODS_CARD, new TamedWolfCardRenderer());
    }
}