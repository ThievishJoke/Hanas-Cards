package net.hanas_cards;

import net.fabricmc.api.ModInitializer;
import net.hanas_cards.item.CardModItems;
import net.hanas_cards.item.CardModItemGroups;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.KilledByPlayerLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.BinomialLootNumberProvider;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
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
        CardModItems.registerShulkerCards();

        LootTableEvents.MODIFY.register((resourceLocation, lootTableBuilder, source, registries) -> {
                LootPool customPool = LootPool.builder()
                        .with(ItemEntry.builder(CardModItems.SERIES_ONE_CARD_PACK)
                                .conditionally(KilledByPlayerLootCondition.builder())
                                .weight(50))
                        .rolls(BinomialLootNumberProvider.create(1, 0.05f))  // 5% chance to drop
                        .build();

                lootTableBuilder.pool(customPool);
        });
    }
}