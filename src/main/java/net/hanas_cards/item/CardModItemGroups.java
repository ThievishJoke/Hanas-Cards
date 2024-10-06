package net.hanas_cards.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hanas_cards.HanasCardsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.hanas_cards.item.CardModItems.*;

public class CardModItemGroups {
    public static final ItemGroup HANAS_CARDS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HanasCardsMod.MOD_ID, "cards"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cards"))
            .icon(() -> new ItemStack(CardModItems.LUCY_AXOLOTL_CARD)).entries((displayContext, entries) -> {
                        entries.add(CardModItems.OVERWORLD_MOB_CARD_PACK);
                        entries.add(CardModItems.NETHER_MOB_CARD_PACK);
                        entries.add(CardModItems.END_MOB_CARD_PACK);

                        entries.add(CardModItems.RAINBOW_CARD_PACK);

                        entries.add(CardModItems.SERIES_ONE_CARD_PACK);

                        entries.add(CardModItems.ALLAY_CARD);

                        entries.add(CardModItems.ARMADILLO_CARD);

                        entries.add(CardModItems.LUCY_AXOLOTL_CARD);
                        entries.add(CardModItems.WILD_AXOLOTL_CARD);
                        entries.add(CardModItems.GOLD_AXOLOTL_CARD);
                        entries.add(CardModItems.CYAN_AXOLOTL_CARD);
                        entries.add(CardModItems.BLUE_AXOLOTL_CARD);
                        entries.add(CardModItems.GREEN_AXOLOTL_CARD);
                        entries.add(CardModItems.MELONOID_AXOLOTL_CARD);

                        entries.add(CardModItems.BAT_CARD);

                        entries.add(CardModItems.ANGRY_BEE_CARD);
                        entries.add(CardModItems.BEE_CARD);
                        entries.add(CardModItems.ANGRY_POLLINATED_BEE_CARD);
                        entries.add(CardModItems.POLLINATED_BEE_CARD);
                        entries.add(CardModItems.GENTLE_BEE_CARD);

                        entries.add(CardModItems.CAMEL_CARD);

                        entries.add(CardModItems.DOLPHIN_CARD);

                        entries.add(CardModItems.FOX_CARD);
                        entries.add(CardModItems.SNOW_FOX_CARD);

                        entries.add(CardModItems.TEMPERATE_FROG_CARD);
                        entries.add(CardModItems.WARM_FROG_CARD);
                        entries.add(CardModItems.COLD_FROG_CARD);
                        entries.add(CardModItems.TADPOLE_CARD);

                        entries.add(CardModItems.FIREFLY_CARD);

                        entries.add(CardModItems.RED_PARROT_CARD);
                        entries.add(CardModItems.BLUE_PARROT_CARD);
                        entries.add(CardModItems.GREEN_PARROT_CARD);
                        entries.add(CardModItems.CYAN_PARROT_CARD);
                        entries.add(CardModItems.GRAY_PARROT_CARD);

                        entries.add(CardModItems.SQUID_CARD);
                        entries.add(CardModItems.GLOW_SQUID_CARD);

                        entries.add(CardModItems.SNIFFER_CARD);

                        entries.add(CardModItems.RABBIT_CARD);
                        entries.add(CardModItems.ALBINO_RABBIT_CARD);
                        entries.add(CardModItems.BLACK_AND_WHITE_RABBIT_CARD);
                        entries.add(CardModItems.BLACK_RABBIT_CARD);
                        entries.add(CardModItems.GOLD_RABBIT_CARD);
                        entries.add(CardModItems.KILLER_RABBIT_CARD);
                        entries.add(CardModItems.SALT_AND_PEPPER_RABBIT_CARD);
                        entries.add(CardModItems.JUMBO_RABBIT_CARD);
                        entries.add(CardModItems.DIAMOND_RABBIT_CARD);

                        entries.add(CardModItems.CHICKEN_CARD);
                        entries.add(CardModItems.DIAMOND_CHICKEN_CARD);

                        entries.add(CardModItems.COW_CARD);
                        entries.add(CardModItems.MOOBLOOM_CARD);
                        entries.add(CardModItems.RED_MOOSHROOM_CARD);
                        entries.add(CardModItems.BROWN_MOOSHROOM_CARD);
                        entries.add(CardModItems.WOOLY_COW_CARD);

                        entries.add(CardModItems.DONKEY_CARD);
                        entries.add(CardModItems.SADDLED_DONKEY_CARD);

                        entries.add(CardModItems.HORSE_CARD);
                        entries.add(CardModItems.ARMORED_HORSE_CARD);
                        entries.add(CardModItems.SKELETON_HORSE_CARD);
                        entries.add(CardModItems.ZOMBIE_HORSE_CARD);

                        entries.add(CardModItems.MULE_CARD);

                        for (String color : sheep_colors) {
                            String cardName = color.toLowerCase().replace(" ", "_") + "_sheep_card";
                            Item item = CardModItems.get(cardName);
                            if (item != null) {
                                entries.add(item);
                            } else {
                                // Log error
                                System.err.println("Item not found for: " + cardName + " In CardModItemGroups");
                            }
                        }
                        entries.add(CardModItems.RAINBOW_SHEEP_CARD);

                        entries.add(CardModItems.PIG_CARD);

                        for (String biome : villager_card_biomes) {
                            for (String profession : villager_card_professions) {
                                String cardName = biome.trim().toLowerCase().replace(" ", "_") + "_"
                                        + profession.trim().toLowerCase().replace(" ", "_") + "_villager_card";

                                Item item = CardModItems.get(cardName);

                                if (item != null) {
                                    entries.add(item);
                                } else {
                                    // Log error
                                    System.err.println("Item not found for: " + cardName + " In CardModItemGroups");
                                }
                            }
                        }

                        entries.add(CardModItems.IRON_GOLEM_CARD);
                        entries.add(CardModItems.SNOW_GOLEM_CARD);
                        entries.add(CardModItems.SHEARED_SNOW_GOLEM_CARD);

                        entries.add(CardModItems.TURTLE_CARD);

                        entries.add(CardModItems.OCELOT_CARD);
                        entries.add(CardModItems.BLACK_CAT_CARD);
                        entries.add(CardModItems.BRITISH_SHORTHAIR_CAT_CARD);
                        entries.add(CardModItems.CALICO_CAT_CARD);
                        entries.add(CardModItems.JELLY_CAT_CARD);
                        entries.add(CardModItems.PERSIAN_CAT_CARD);
                        entries.add(CardModItems.RAGDOLL_CAT_CARD);
                        entries.add(CardModItems.RED_CAT_CARD);
                        entries.add(CardModItems.SIAMESE_CAT_CARD);
                        entries.add(CardModItems.TABBY_CAT_CARD);
                        entries.add(CardModItems.TUXEDO_CAT_CARD);
                        entries.add(CardModItems.WHITE_CAT_CARD);

                        entries.add(CardModItems.WOLF_ASHEN_CARD);
                        entries.add(CardModItems.WOLF_BLACK_CARD);
                        entries.add(CardModItems.WOLF_CHESTNUT_CARD);
                        entries.add(CardModItems.WOLF_PALE_CARD);
                        entries.add(CardModItems.WOLF_RUSTY_CARD);
                        entries.add(CardModItems.WOLF_SNOWY_CARD);
                        entries.add(CardModItems.WOLF_SPOTTED_CARD);
                        entries.add(CardModItems.WOLF_STRIPED_CARD);
                        entries.add(CardModItems.WOLF_WOODS_CARD);
                        entries.add(CardModItems.WOLF_ASHEN_ANGRY_CARD);
                        entries.add(CardModItems.WOLF_BLACK_ANGRY_CARD);
                        entries.add(CardModItems.WOLF_CHESTNUT_ANGRY_CARD);
                        entries.add(CardModItems.WOLF_PALE_ANGRY_CARD);
                        entries.add(CardModItems.WOLF_RUSTY_ANGRY_CARD);
                        entries.add(CardModItems.WOLF_SNOWY_ANGRY_CARD);
                        entries.add(CardModItems.WOLF_SPOTTED_ANGRY_CARD);
                        entries.add(CardModItems.WOLF_STRIPED_ANGRY_CARD);
                        entries.add(CardModItems.WOLF_WOODS_ANGRY_CARD);
                        entries.add(CardModItems.WOLF_ASHEN_ARMOR_CARD);
                        entries.add(CardModItems.WOLF_BLACK_ARMOR_CARD);
                        entries.add(CardModItems.WOLF_CHESTNUT_ARMOR_CARD);
                        entries.add(CardModItems.WOLF_PALE_ARMOR_CARD);
                        entries.add(CardModItems.WOLF_RUSTY_ARMOR_CARD);
                        entries.add(CardModItems.WOLF_SNOWY_ARMOR_CARD);
                        entries.add(CardModItems.WOLF_SPOTTED_ARMOR_CARD);
                        entries.add(CardModItems.WOLF_STRIPED_ARMOR_CARD);
                        entries.add(CardModItems.WOLF_WOODS_ARMOR_CARD);

                        entries.add(CardModItems.PHANTOM_CARD);

                        entries.add(CardModItems.CAVE_SPIDER_CARD);
                        entries.add(CardModItems.SPIDER_CARD);
                        entries.add(CardModItems.INVISIBLE_SPIDER_CARD);

                        entries.add(CardModItems.CREEPER_CARD);
                        entries.add(CardModItems.CHARGED_CREEPER_CARD);

                        entries.add(CardModItems.ZOMBIE_CARD);
                        entries.add(CardModItems.HUSK_CARD);
                        entries.add(CardModItems.DROWNED_CARD);

                        entries.add(CardModItems.SKELETON_CARD);
                        entries.add(CardModItems.BOGGED_CARD);
                        entries.add(CardModItems.STRAY_CARD);

                        entries.add(CardModItems.STRIDER_CARD);

                        entries.add(CardModItems.WITHER_SKELETON_CARD);

                        entries.add(CardModItems.GHAST_CARD);

                        entries.add(CardModItems.BLAZE_CARD);

                        entries.add(CardModItems.MAGMA_CUBE_CARD);

                        entries.add(CardModItems.PIGLIN_SWORD_CARD);
                        entries.add(CardModItems.PIGLIN_CROSSBOW_CARD);
                        entries.add(CardModItems.PIGLIN_BRUTE_CARD);
                        entries.add(CardModItems.ZOMBIFIED_PIGLIN_CARD);

                        entries.add(CardModItems.HOGLIN_CARD);
                        entries.add(CardModItems.ZOMBIFIED_HOGLIN_CARD);

                        entries.add(CardModItems.ENDER_DRAGON_CARD);

                        entries.add(CardModItems.ENDERMAN_CARD);

                        entries.add(CardModItems.ENDERMITE_CARD);

                        for (String color : shulker_colors) {
                            String cardName = color.toLowerCase().replace(" ", "_") + "_shulker_card";
                            Item item = CardModItems.get(cardName);
                            if (item != null) {
                                entries.add(item);
                            } else {
                                System.err.println("Item not found for: " + cardName + " In CardModItemGroups");
                            }
                        }
                        entries.add(CardModItems.SHULKER_CARD);





                }).build());


    public static void registerCardModItemGroups() {
        HanasCardsMod.LOGGER.info("Registering Item Groups for " + HanasCardsMod.MOD_ID);
    }
}