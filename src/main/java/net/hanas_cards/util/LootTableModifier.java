package net.hanas_cards.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.hanas_cards.HanasCardsMod;
import net.hanas_cards.item.CardModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.EntityPropertiesLootCondition;
import net.minecraft.loot.condition.KilledByPlayerLootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.BinomialLootNumberProvider;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.registry.tag.EntityTypeTags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LootTableModifier {
    public static final Logger LOGGER = LogManager.getLogger();

    public static void registerLootTableEvents() {
        LootTableEvents.MODIFY.register((resourceLocation, lootTableBuilder, source, registries) -> {
            addCardPackLoot(lootTableBuilder);
            LOGGER.info("Modified loot table: {}", resourceLocation);  // Log modification
        });
    }

    private static void addCardPackLoot(LootTable.Builder lootTableBuilder) {
        LootPool customPool = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1.0F))  // Set number of rolls
                .with(ItemEntry.builder(CardModItems.SERIES_ONE_CARD_PACK)
                        .conditionally(KilledByPlayerLootCondition.builder())
                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.THIS,
                                EntityPredicate.Builder.create().type(CardModTags.Entities.MOB_TAG))
                        )
                        .weight(1))
                .rolls(BinomialLootNumberProvider.create(1, 0.01F))
                .build();

        lootTableBuilder.pool(customPool);
        LOGGER.info("Added custom loot pool to loot table");
    }
}
