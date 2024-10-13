package net.hanas_cards;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import net.hanas_cards.datagen.*;

public class HanasCardsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModModelProvider::new);
        pack.addProvider(CardModItemTagProvider::new);
        pack.addProvider(EntityTypeTagProvider::new);
        pack.addProvider(ModRecipeProvider::new);
    }
}
