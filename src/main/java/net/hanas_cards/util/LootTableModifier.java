package net.hanas_cards.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.hanas_cards.item.CardModPacks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.KilledByPlayerLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.BinomialLootNumberProvider;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LootTableModifier {
    public static final Logger LOGGER = LogManager.getLogger();

    public static void registerLootTableEvents() {
        LootTableEvents.MODIFY.register((resourceLocation, lootTableBuilder, source, registries) -> {
            addCardPackLoot(lootTableBuilder);
        });
    }

    private static void addCardPackLoot(LootTable.Builder lootTableBuilder) {
        LootPool series_one_packPool = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0F))  // Set number of rolls
                .with(ItemEntry.builder(CardModPacks.SERIES_ONE_CARD_PACK)
                        .conditionally(KilledByPlayerLootCondition.builder())
                        .weight(1))
                .rolls(BinomialLootNumberProvider.create(1, 0.1F))
                .build();
        LootPool overworld_packPool = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0F))  // Set number of rolls
                .with(ItemEntry.builder(CardModPacks.OVERWORLD_MOB_CARD_PACK)
                        .conditionally(KilledByPlayerLootCondition.builder())
                        .weight(1))
                .rolls(BinomialLootNumberProvider.create(1, 0.025F))
                .build();
        LootPool nether_packPool = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0F))  // Set number of rolls
                .with(ItemEntry.builder(CardModPacks.NETHER_MOB_CARD_PACK)
                        .conditionally(KilledByPlayerLootCondition.builder())
                        .weight(1))
                .rolls(BinomialLootNumberProvider.create(1, 0.025F))
                .build();
        LootPool end_packPool = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0F))  // Set number of rolls
                .with(ItemEntry.builder(CardModPacks.END_MOB_CARD_PACK)
                        .conditionally(KilledByPlayerLootCondition.builder())
                        .weight(1))
                .rolls(BinomialLootNumberProvider.create(1, 0.025F))
                .build();

        lootTableBuilder.pool(series_one_packPool);
        lootTableBuilder.pool(overworld_packPool);
        lootTableBuilder.pool(nether_packPool);
        lootTableBuilder.pool(end_packPool);
        LOGGER.info("Added custom loot pool to loot table");
    }
}
