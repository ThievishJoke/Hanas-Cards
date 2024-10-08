package net.hanas_cards.item;

import net.hanas_cards.HanasCardsMod;
import net.hanas_cards.item.Custom.CardItem;
import net.hanas_cards.item.Custom.CardPackItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.hanas_cards.util.CustomCardRarity.*;

//todo
// villager variants (village pack update)
// evoker, vex, vindicator, pillager, witch, ravager, illusioner, Iceologer (Pillage pack update)
// elder guardian, guardian, pufferfish, + new ocean mob variants (Sea pack update)
// panda + variants (Panda pack update)
// creaking, wither (Spooky pack update)
// warden, silverfish, llamas, goats, wandering trader, trader llama (Mountain exploration pack update)
// breeze (Trial pack update)
//todo add slimed mob pack (slime cow, slime chicken, slime, ect.) (Slimed pack update)
//todo add golden mob pack (golden chicken, golden cow, golden frog, ect.) (Golden pack update)
//todo add minecraft earth all variants (muddy pig, ect.) (Minecraft earth pack update)
//todo
// dev cards
// block cards

//todo mod integration???

@SuppressWarnings("ALL")
public class CardModItems {
    //public static final Item  = registerItem("",
    //        new CardItem(new Item.Settings(), "", "", "", Rarity.COMMON));

    public static final Item RAINBOW_CARD_PACK = registerItem("rainbow_card_pack",
            new CardPackItem(new CardPackSettings(5,
                    Map.of(),
                    List.of(
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "common_cards")),
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "uncommon_cards")),
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "rare_cards")),
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "epic_cards")),
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "mythic_cards"))
                    ))));
    public static final Item OVERWORLD_MOB_CARD_PACK = registerItem("overworld_mob_card_pack",
            new CardPackItem(new CardPackSettings(3,
                    Map.of(),
                    List.of(
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "overworld_mob_cards"))
                            ))));
    public static final Item NETHER_MOB_CARD_PACK = registerItem("nether_mob_card_pack",
            new CardPackItem(new CardPackSettings(3,
                    Map.of(),
                    List.of(
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "nether_mob_cards"))
                    ))));
    public static final Item END_MOB_CARD_PACK = registerItem("end_mob_card_pack",
            new CardPackItem(new CardPackSettings(3,
                    Map.of(),
                    List.of(
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "end_mob_cards"))
                    ))));
    public static final Item SERIES_ONE_CARD_PACK = registerItem("series_one_card_pack",
            new CardPackItem(new CardPackSettings(6,
                    Map.of(),
                    List.of(
                            TagKey.of(Registries.ITEM.getKey(), Identifier.of("hanas_cards", "series_one_cards"))
                    ))));
    public static final Item SERIES_TWO_CARD_PACK = registerItem("series_two_card_pack",
            new CardPackItem(new CardPackSettings(6,
                    Map.of(),
                    List.of(
                            TagKey.of(Registries.ITEM.getKey(), Identifier.of("hanas_cards", "series_one_cards"))
                    ))));

    //Overworld
    //Passive
    // Allay
    public static final Item ALLAY_CARD = registerItem("allay_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Allay", "Default", Rarity.UNCOMMON));

    // Armadillo
    public static final Item ARMADILLO_CARD = registerItem("armadillo_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Armadillo", "Default", Rarity.COMMON));

    // Axolotl
    public static final Item LUCY_AXOLOTL_CARD = registerItem("lucy_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§dLucy", Rarity.COMMON));
    public static final Item WILD_AXOLOTL_CARD = registerItem("wild_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§4Wild", Rarity.COMMON));
    public static final Item GOLD_AXOLOTL_CARD = registerItem("gold_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§eGold", Rarity.COMMON));
    public static final Item CYAN_AXOLOTL_CARD = registerItem("cyan_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§3Cyan", Rarity.COMMON));
    public static final Item BLUE_AXOLOTL_CARD = registerItem("blue_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§9Blue", Rarity.UNCOMMON));
    public static final Item GREEN_AXOLOTL_CARD = registerItem("green_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§2Green", Rarity.UNCOMMON));
    public static final Item MELONOID_AXOLOTL_CARD = registerItem("melonoid_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "Melonoid", Rarity.RARE));

    // Bat
    public static final Item BAT_CARD = registerItem("bat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Bat", "§4Default", Rarity.COMMON));

    // Bee
    public static final Item ANGRY_BEE_CARD = registerItem("angry_bee_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Angry Bee", "§4Angry", Rarity.COMMON));
    public static final Item BEE_CARD = registerItem("bee_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Bee", "Default", Rarity.COMMON));
    public static final Item ANGRY_POLLINATED_BEE_CARD = registerItem("angry_pollinated_bee_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Angry Bee", "§4Angry Pollinated", Rarity.UNCOMMON));
    public static final Item POLLINATED_BEE_CARD = registerItem("pollinated_bee_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Bee", "Pollinated", Rarity.UNCOMMON));
    public static final Item GENTLE_BEE_CARD = registerItem("gentle_bee_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Bee", "Gentle", Rarity.EPIC));

    // Camel
    public static final Item CAMEL_CARD = registerItem("camel_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Camel", "Default", Rarity.COMMON));

    // Dolphin
    public static final Item DOLPHIN_CARD = registerItem("dolphin_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Dolphin", "Defualt", Rarity.COMMON));

    // Fox
    public static final Item FOX_CARD = registerItem("fox_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Fox", "Default", Rarity.COMMON));
    public static final Item SNOW_FOX_CARD = registerItem("snow_fox_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Fox", "§bSnowy", Rarity.COMMON));

    // Frog
    public static final Item TEMPERATE_FROG_CARD = registerItem("temperate_frog_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Frog", "Temperate", Rarity.COMMON));
    public static final Item WARM_FROG_CARD = registerItem("warm_frog_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Frog", "Warm", Rarity.COMMON));
    public static final Item COLD_FROG_CARD = registerItem("cold_frog_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Frog", "Cold", Rarity.UNCOMMON));
    public static final Item TADPOLE_CARD = registerItem("tadpole_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Frog", "Tadpole", Rarity.COMMON));

    // Firefly
    public static final Item FIREFLY_CARD = registerItem("firefly_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Passive", "Firefly", Rarity.UNCOMMON));

    // Parrot
    public static final Item RED_PARROT_CARD = registerItem("red_parrot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Parrot", "Red", Rarity.UNCOMMON));
    public static final Item BLUE_PARROT_CARD = registerItem("blue_parrot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Parrot", "Blue", Rarity.UNCOMMON));
    public static final Item GREEN_PARROT_CARD = registerItem("green_parrot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Parrot", "Green", Rarity.UNCOMMON));
    public static final Item CYAN_PARROT_CARD = registerItem("cyan_parrot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Parrot", "Cyan", Rarity.UNCOMMON));
    public static final Item GRAY_PARROT_CARD = registerItem("gray_parrot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Parrot", "Gray", Rarity.UNCOMMON));

    // Squid
    public static final Item SQUID_CARD = registerItem("squid_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Squid", "Default", Rarity.COMMON));
    public static final Item GLOW_SQUID_CARD = registerItem("glow_squid_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Squid", "§3Glow", Rarity.COMMON));

    // Sniffer
    public static final Item SNIFFER_CARD = registerItem("sniffer_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Sniffer", "Default", Rarity.RARE));

    // Rabbit
    public static final Item RABBIT_CARD = registerItem("rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§4Default", Rarity.COMMON));
    public static final Item ALBINO_RABBIT_CARD = registerItem("albino_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§fAlbino", Rarity.COMMON));
    public static final Item BLACK_AND_WHITE_RABBIT_CARD = registerItem("black_and_white_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§8Black §7And §fWhite", Rarity.COMMON));
    public static final Item BLACK_RABBIT_CARD = registerItem("black_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§8Black", Rarity.COMMON));
    public static final Item GOLD_RABBIT_CARD = registerItem("gold_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§6Gold", Rarity.COMMON));
    public static final Item KILLER_RABBIT_CARD = registerItem("killer_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§4Killer", Rarity.UNCOMMON));
    public static final Item SALT_AND_PEPPER_RABBIT_CARD = registerItem("salt_and_pepper_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§fSalt §7And §8Pepper", Rarity.COMMON));
    public static final Item JUMBO_RABBIT_CARD = registerItem("jumbo_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§4Jumbo", Rarity.RARE));
    public static final Item DIAMOND_RABBIT_CARD = registerItem("diamond_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§3Diamond", Rarity.EPIC));

    //Farm Animal
    //Chicken
    public static final Item CHICKEN_CARD = registerItem("chicken_card",
             new CardItem(new Item.Settings(), "§2Overworld", "Chicken", "Default", Rarity.COMMON));
    public static final Item DIAMOND_CHICKEN_CARD = registerItem("diamond_chicken_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Chicken", "§3Diamond", Rarity.EPIC));

    // COW
    public static final Item COW_CARD = registerItem("cow_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "Default", Rarity.COMMON));
    public static final Item RED_MOOSHROOM_CARD = registerItem("red_mooshroom_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "§cRed Mooshroom", Rarity.UNCOMMON));
    public static final Item BROWN_MOOSHROOM_CARD = registerItem("brown_mooshroom_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "§4Brown Mooshroom", Rarity.UNCOMMON));
    public static final Item MOOBLOOM_CARD = registerItem("moobloom_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "§eMoobloom", Rarity.RARE));
    public static final Item WOOLY_COW_CARD = registerItem("wooly_cow_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "§4Wooly", Rarity.RARE));

    // Donkey
    public static final Item DONKEY_CARD = registerItem("donkey_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Donkey", "Default", Rarity.COMMON));
    public static final Item SADDLED_DONKEY_CARD = registerItem("saddled_donkey_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Donkey", "Saddled", Rarity.COMMON));

    // Horse
    public static final Item HORSE_CARD = registerItem("horse_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Horse", "Default", Rarity.COMMON));
    public static final Item ARMORED_HORSE_CARD = registerItem("armored_horse_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Horse", "Armored", Rarity.COMMON));
    public static final Item SKELETON_HORSE_CARD = registerItem("skeleton_horse_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Horse", "Skeleton", Rarity.RARE));
    public static final Item ZOMBIE_HORSE_CARD = registerItem("zombie_horse_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Horse", "Zombie", Rarity.RARE));

    // Mule
    public static final Item MULE_CARD = registerItem("mule_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Hybrid", "Default", Rarity.COMMON));

    // Sheep
    public static final String[] sheep_colors = {
            "White", "Orange", "Magenta", "Light Blue", "Yellow", "Lime",
            "Pink", "Gray", "Light Gray", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"
    };

    public static void registerSheepCards() {
        for (String color : sheep_colors) {
            String cardName = color.toLowerCase().replace(" ", "_") + "_sheep_card";
            String variant = "§" + getSheepColorCode(color) + color + " Sheep";

            Item sheepCard = new CardItem(new Item.Settings(), "§2Overworld", "Sheep", variant, Rarity.COMMON);
            System.out.println("Successfully registered sheep card: " + cardName);

            registerItem(cardName, sheepCard);
            ITEMS.put(cardName, sheepCard);
        }
    }

    // Sheep Color Codes
    public static String getSheepColorCode(String color) {
        switch (color) {
            case "White": return "f";
            case "Orange": return "6";
            case "Magenta": return "d";
            case "Light Blue": return "b";
            case "Yellow": return "e";
            case "Lime": return "a";
            case "Pink": return "d";
            case "Gray": return "8";
            case "Light Gray": return "7";
            case "Cyan": return "3";
            case "Purple": return "5";
            case "Blue": return "9";
            case "Brown": return "4";
            case "Green": return "2";
            case "Red": return "c";
            case "Black": return "8";
            default: return "f";
        }
    }

    public static final Item RAINBOW_SHEEP_CARD = registerItem("rainbow_sheep_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Sheep", "§cR§6A§eI§aN§2B§bO§3W", MYTHIC));

    // Pig
    public static final Item PIG_CARD = registerItem("pig_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pig", "Default", Rarity.COMMON));

    // Villager
    public static final String[] villager_card_professions = {
            "Unemployed", "Farmer", "Fisherman", "Shepherd", "Fletcher",
            "Librarian", "Cleric", "Armorer", "Toolsmith", "Weaponsmith", "Butcher", "Cartographer", "Nitwit"
    };
    //todo all the biome variants in a later release
    public static final String[] villager_card_biomes = {
            "Plains"//, "Desert", "Savanna", "Taiga", "Swamp", "Jungle", "Snowy"
    };

    public static void registerVillagerCards() {
        for (String biome : villager_card_biomes) {
            for (String profession : villager_card_professions) {
                String cardName = biome.toLowerCase().replace(" ", "_") + "_"
                        + profession.toLowerCase().replace(" ", "_")
                        + "_villager_card";

                String variant = (biome + " " + profession);

                Item villagerCard = new CardItem(new Item.Settings(), "Overworld", "Villager", variant, Rarity.COMMON);
                System.out.println("Successfully registered villager card: " + cardName);

                registerItem(cardName, villagerCard);
                ITEMS.put(cardName, villagerCard);
            }
        }
    }

    // Golem
    public static final Item IRON_GOLEM_CARD = registerItem("iron_golem_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Golem", "Default", Rarity.COMMON));
    public static final Item SNOW_GOLEM_CARD = registerItem("snow_golem_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Golem", "Defualt", Rarity.COMMON));
    public static final Item SHEARED_SNOW_GOLEM_CARD = registerItem("sheared_snow_golem_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Golem", "Sheared", Rarity.COMMON));

    // Turtle
    public static final Item TURTLE_CARD = registerItem("turtle_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Turtle", "Defualt", Rarity.COMMON));

    // Pet
    // Occelot & Cat
    public static final Item OCELOT_CARD = registerItem("ocelot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "Default", Rarity.RARE));
    public static final Item BLACK_CAT_CARD = registerItem("black_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§8Black", Rarity.RARE));
    public static final Item BRITISH_SHORTHAIR_CAT_CARD = registerItem("british_shorthair_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§7British", Rarity.UNCOMMON));
    public static final Item CALICO_CAT_CARD = registerItem("calico_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§8Cal§6ico", Rarity.UNCOMMON));
    public static final Item JELLY_CAT_CARD = registerItem("jelly_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§fJelly", Rarity.UNCOMMON));
    public static final Item PERSIAN_CAT_CARD = registerItem("persian_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§ePersian", Rarity.UNCOMMON));
    public static final Item RAGDOLL_CAT_CARD = registerItem("ragdoll_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§fRagdoll", Rarity.UNCOMMON));
    public static final Item RED_CAT_CARD = registerItem("red_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§cRed", Rarity.UNCOMMON));
    public static final Item SIAMESE_CAT_CARD = registerItem("siamese_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§7Siamese", Rarity.UNCOMMON));
    public static final Item TABBY_CAT_CARD = registerItem("tabby_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§6Tabby", Rarity.UNCOMMON));
    public static final Item TUXEDO_CAT_CARD = registerItem("tuxedo_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§8Tuxedo", Rarity.UNCOMMON));
    public static final Item WHITE_CAT_CARD = registerItem("white_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§fWhite", Rarity.UNCOMMON));

    // Wolf & Dog
    // Normal Variants
    public static final Item WOLF_ASHEN_CARD = registerItem("wolf_ashen_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§7Wolf (Ashen)", Rarity.COMMON));
    public static final Item WOLF_BLACK_CARD = registerItem("wolf_black_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§8Wolf (Black)", Rarity.COMMON));
    public static final Item WOLF_CHESTNUT_CARD = registerItem("wolf_chestnut_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§cWolf (Chestnut)", Rarity.COMMON));
    public static final Item WOLF_PALE_CARD = registerItem("wolf_pale_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§fWolf (Pale)", Rarity.COMMON));
    public static final Item WOLF_RUSTY_CARD = registerItem("wolf_rusty_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§6Wolf (Rusty)", Rarity.COMMON));
    public static final Item WOLF_SNOWY_CARD = registerItem("wolf_snowy_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§fWolf (Snowy)", Rarity.COMMON));
    public static final Item WOLF_SPOTTED_CARD = registerItem("wolf_spotted_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§dWolf (Spotted)", Rarity.COMMON));
    public static final Item WOLF_STRIPED_CARD = registerItem("wolf_striped_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§8Wolf (Striped)", Rarity.COMMON));
    public static final Item WOLF_WOODS_CARD = registerItem("wolf_woods_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§2Wolf (Woods)", Rarity.COMMON));

    // Angry Variants
    public static final Item WOLF_ASHEN_ANGRY_CARD = registerItem("wolf_ashen_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Ashen)", Rarity.UNCOMMON));
    public static final Item WOLF_BLACK_ANGRY_CARD = registerItem("wolf_black_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Black)", Rarity.UNCOMMON));
    public static final Item WOLF_CHESTNUT_ANGRY_CARD = registerItem("wolf_chestnut_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Chestnut)", Rarity.UNCOMMON));
    public static final Item WOLF_PALE_ANGRY_CARD = registerItem("wolf_pale_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Pale)", Rarity.UNCOMMON));
    public static final Item WOLF_RUSTY_ANGRY_CARD = registerItem("wolf_rusty_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Rusty)", Rarity.UNCOMMON));
    public static final Item WOLF_SNOWY_ANGRY_CARD = registerItem("wolf_snowy_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Snowy)", Rarity.UNCOMMON));
    public static final Item WOLF_SPOTTED_ANGRY_CARD = registerItem("wolf_spotted_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Spotted)", Rarity.UNCOMMON));
    public static final Item WOLF_STRIPED_ANGRY_CARD = registerItem("wolf_striped_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Striped)", Rarity.UNCOMMON));
    public static final Item WOLF_WOODS_ANGRY_CARD = registerItem("wolf_woods_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Woods)", Rarity.UNCOMMON));

    // Armored Variants
    public static final Item WOLF_ASHEN_ARMOR_CARD = registerItem("wolf_ashen_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§7Armored Wolf (Ashen)", Rarity.RARE));
    public static final Item WOLF_BLACK_ARMOR_CARD = registerItem("wolf_black_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§8Armored Wolf (Black)", Rarity.RARE));
    public static final Item WOLF_CHESTNUT_ARMOR_CARD = registerItem("wolf_chestnut_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§cArmored Wolf (Chestnut)", Rarity.RARE));
    public static final Item WOLF_PALE_ARMOR_CARD = registerItem("wolf_pale_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§fArmored Wolf (Pale)", Rarity.RARE));
    public static final Item WOLF_RUSTY_ARMOR_CARD = registerItem("wolf_rusty_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§6Armored Wolf (Rusty)", Rarity.RARE));
    public static final Item WOLF_SNOWY_ARMOR_CARD = registerItem("wolf_snowy_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§fArmored Wolf (Snowy)", Rarity.RARE));
    public static final Item WOLF_SPOTTED_ARMOR_CARD = registerItem("wolf_spotted_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§dArmored Wolf (Spotted)", Rarity.RARE));
    public static final Item WOLF_STRIPED_ARMOR_CARD = registerItem("wolf_striped_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§8Armored Wolf (Striped)", Rarity.RARE));
    public static final Item WOLF_WOODS_ARMOR_CARD = registerItem("wolf_woods_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§2Armored Wolf (Woods)", Rarity.RARE));


    //Hostile
    //Phantom
    public static final Item PHANTOM_CARD = registerItem("phantom_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Undead Mob", "Phantom", Rarity.COMMON));

    //Spider
    public static final Item CAVE_SPIDER_CARD = registerItem("cave_spider_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Spider", "§8Cave", Rarity.COMMON));
    public static final Item SPIDER_CARD = registerItem("spider_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Spider", "Defualt", Rarity.COMMON));
    public static final Item INVISIBLE_SPIDER_CARD = registerItem("invisible_spider_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Spider", "§9Invisible", Rarity.UNCOMMON));

    //Creeper
    public static final Item CREEPER_CARD = registerItem("creeper_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Creeper", "Default", Rarity.UNCOMMON));
    public static final Item CHARGED_CREEPER_CARD = registerItem("charged_creeper_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Creeper", "§6Charged", Rarity.UNCOMMON));

    //Zombie
    public static final Item ZOMBIE_CARD = registerItem("zombie_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Zombie", "Default", Rarity.COMMON));
    public static final Item HUSK_CARD = registerItem("husk_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Zombie", "Husk", Rarity.UNCOMMON));
    public static final Item DROWNED_CARD = registerItem("drowned_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Zombie", "Drowned", Rarity.UNCOMMON));

    //Skeleton
    public static final Item SKELETON_CARD = registerItem("skeleton_card",
            new CardItem(new Item.Settings(), "§2Overworld §cNether", "Skeleton", "Default", Rarity.COMMON));
    public static final Item BOGGED_CARD = registerItem("bogged_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Skeleton", "Bogged", Rarity.UNCOMMON));
    public static final Item STRAY_CARD = registerItem("stray_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Skeleton", "§3Stray", Rarity.UNCOMMON));
    //Nether
    //Passive
    public static final Item STRIDER_CARD = registerItem("strider_card",
            new CardItem(new Item.Settings(), "§cNether", "Passive", "Default", Rarity.UNCOMMON));

    //Hostile
    public static final Item WITHER_SKELETON_CARD = registerItem("wither_skeleton_card",
            new CardItem(new Item.Settings(), "§cNether", "Skeleton", "Wither", Rarity.UNCOMMON));

    public static final Item GHAST_CARD = registerItem("ghast_card",
            new CardItem(new Item.Settings(), "§cNether", "Ghast", "Defualt", Rarity.COMMON));

    //Blaze
    public static final Item BLAZE_CARD = registerItem("blaze_card",
            new CardItem(new Item.Settings(), "§cNether", "Blaze", "Default", Rarity.COMMON));

    //Magma Cube
    public static final Item MAGMA_CUBE_CARD = registerItem("magma_cube_card",
            new CardItem(new Item.Settings(), "§cNether", "Magma Cube", "Default", Rarity.UNCOMMON));

    //Piglin
    public static final Item PIGLIN_SWORD_CARD = registerItem("piglin_sword_card",
            new CardItem(new Item.Settings(), "§cNether", "Piglin", "§ePiglin (Sword)", Rarity.UNCOMMON));
    public static final Item PIGLIN_CROSSBOW_CARD = registerItem("piglin_crossbow_card",
            new CardItem(new Item.Settings(), "§cNether", "Piglin", "§aPiglin (Crossbow)", Rarity.UNCOMMON));
    public static final Item PIGLIN_BRUTE_CARD = registerItem("piglin_brute_card",
            new CardItem(new Item.Settings(), "§cNether", "Piglin Brute", "§4Piglin Brute", Rarity.RARE));
    public static final Item ZOMBIFIED_PIGLIN_CARD = registerItem("zombified_piglin_card",
            new CardItem(new Item.Settings(), "§cNether", "Zombified Piglin", "§2Zombified", Rarity.COMMON));

    //Hoglin
    public static final Item HOGLIN_CARD = registerItem("hoglin_card",
            new CardItem(new Item.Settings(), "§cNether", "Hoglin", "§eHoglin", Rarity.COMMON));
    public static final Item ZOMBIFIED_HOGLIN_CARD = registerItem("zombified_hoglin_card",
            new CardItem(new Item.Settings(), "§cNether", "Hoglin", "§2Zoglin", Rarity.RARE));

    //End
    //Ender Dragon
    public static final Item ENDER_DRAGON_CARD = registerItem("ender_dragon_card",
            new CardItem(new Item.Settings(), "§5End", "Dragon", "Default", Rarity.COMMON));
    //Enderman
    public static final Item ENDERMAN_CARD = registerItem("enderman_card",
            new CardItem(new Item.Settings(), "§2Overworld §cNether §5End", "Enderman", "Default", Rarity.COMMON));
    //Endermite
    public static final Item ENDERMITE_CARD = registerItem("endermite_card",
            new CardItem(new Item.Settings(), "§5End", "Endermite", "Default", Rarity.COMMON));
    //Shulker
    public static final String[] shulker_colors = {
            "White", "Orange", "Magenta", "Light Blue", "Yellow", "Lime",
            "Pink", "Gray", "Light Gray", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"
    };
    private static final Map<String, Item> ITEMS = new HashMap<>();
    public static void registerShulkerCards() {
        for (String color : shulker_colors) {
            String cardName = color.toLowerCase().replace(" ", "_") + "_shulker_card";
            String variant = "§" + getShulkerColorCode(color) + color + " Shulker";

            Item shulkerCard = new CardItem(new Item.Settings(), "§5End", "Shulker", variant, Rarity.COMMON);
            System.out.println("Successfully registered shulker card: " + cardName);

            registerItem(cardName, shulkerCard);
            ITEMS.put(cardName, shulkerCard);
        }
    }

    //Shulker Color Codes
    private static String getShulkerColorCode(String color) {
        switch (color) {
            case "White": return "f";
            case "Orange": return "6";
            case "Magenta": return "d";
            case "Light Blue": return "b";
            case "Yellow": return "e";
            case "Lime": return "a";
            case "Pink": return "d"; // Using Magenta for Pink
            case "Gray": return "8";
            case "Light Gray": return "7";
            case "Cyan": return "3";
            case "Purple": return "5";
            case "Blue": return "9";
            case "Brown": return "4";
            case "Green": return "2";
            case "Red": return "c";
            case "Black": return "8";
            default: return "f"; // Default to White if not found
        }
    }

    public static final Item SHULKER_CARD = registerItem("shulker_card",
            new CardItem(new Item.Settings(), "§5End", "Shulker", "Default", Rarity.COMMON));

    public static Item get(String name) {
        return ITEMS.get(name);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HanasCardsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HanasCardsMod.LOGGER.info("Registering Mod Items for " + HanasCardsMod.MOD_ID);
    }
}