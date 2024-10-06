package net.hanas_cards.util;

import net.hanas_cards.HanasCardsMod;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class CardModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(HanasCardsMod.MOD_ID, name));
        }
    }

    public static class Entities {
        // Mob
        public static final TagKey<EntityType<?>> PASSIVE_MOB_TAG = createTag("passive_mob");

        private static TagKey<EntityType<?>> createTag(String name) {
            return TagKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(HanasCardsMod.MOD_ID, name));
        }
    }

    public static class Items {
        // Rarity Based
        public static final TagKey<Item> COMMON_CARDS = createTag("common_cards");
        public static final TagKey<Item> UNCOMMON_CARDS = createTag("uncommon_cards");
        public static final TagKey<Item> RARE_CARDS = createTag("rare_cards");
        public static final TagKey<Item> EPIC_CARDS = createTag("epic_cards");
        public static final TagKey<Item> MYTHIC_CARDS = createTag("mythic_cards");

        // Hostility Based
        public static final TagKey<Item> PASSIVE_MOB_CARDS = createTag("passive_mob_cards");
        public static final TagKey<Item> NEUTRAL_MOB_CARDS = createTag("neutral_mob_cards");
        public static final TagKey<Item> HOSTILE_MOB_CARDS = createTag("hostile_mob_cards");

        // Dimension Based
        public static final TagKey<Item> OVERWORLD_MOB_CARDS = createTag("overworld_mob_cards");
        public static final TagKey<Item> NETHER_MOB_CARDS = createTag("nether_mob_cards");
        public static final TagKey<Item> END_MOB_CARDS = createTag("end_mob_cards");

        // Village
        public static final TagKey<Item> VILLAGE_MOB_CARDS = createTag("village_mob_cards");
        public static final TagKey<Item> VILLAGE_CARDS = createTag("village_mob_cards");

        // Series
        public static final TagKey<Item> SERIES_ONE_CARDS = createTag("series_one_cards");
        public static final TagKey<Item> SERIES_TWO_CARDS = createTag("series_two_cards");



        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(HanasCardsMod.MOD_ID, name));
        }
    }
}