package net.hanas_cards;

import net.fabricmc.api.ModInitializer;
import net.hanas_cards.component.ModDataComponentTypes;
import net.hanas_cards.item.CardModItems;
import net.hanas_cards.item.CardModItemGroups;
import net.hanas_cards.util.LootTableModifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HanasCardsMod implements ModInitializer {
    public static final String MOD_ID = "hanas_cards";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        CardModItemGroups.registerCardModItemGroups();

        CardModItems.registerModItems();
        CardModItems.registerSheepCards();
        CardModItems.registerVillagerCards();
        CardModItems.registerTamedWolfCards();
        CardModItems.registerShulkerCards();

        LootTableModifier.registerLootTableEvents();

        ModDataComponentTypes.registerDataComponentTypes();
    }
}
