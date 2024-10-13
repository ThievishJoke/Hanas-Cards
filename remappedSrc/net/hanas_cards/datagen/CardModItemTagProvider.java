package net.hanas_cards.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hanas_cards.HanasCardsMod;
import net.hanas_cards.item.CardModItems;
import net.hanas_cards.util.CardModTags;
import net.minecraft.data.client.Models;
import net.minecraft.entity.passive.AllayEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static net.hanas_cards.item.CardModItems.*;

public class CardModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public CardModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(CardModTags.Items.COMMON_CARDS)
                .add(CardModItems.ARMADILLO_CARD.asItem())

                .add(CardModItems.LUCY_AXOLOTL_CARD.asItem())
                .add(CardModItems.WILD_AXOLOTL_CARD.asItem())
                .add(CardModItems.GOLD_AXOLOTL_CARD.asItem())
                .add(CardModItems.CYAN_AXOLOTL_CARD.asItem())

                .add(CardModItems.BAT_CARD.asItem())

                .add(CardModItems.ANGRY_BEE_CARD.asItem())
                .add(CardModItems.BEE_CARD.asItem())

                .add(CardModItems.CAMEL_CARD.asItem())

                .add(CardModItems.DOLPHIN_CARD.asItem())

                .add(CardModItems.FOX_CARD.asItem())
                .add(CardModItems.SNOW_FOX_CARD.asItem())

                .add(CardModItems.TEMPERATE_FROG_CARD.asItem())
                .add(CardModItems.WARM_FROG_CARD.asItem())
                .add(CardModItems.TADPOLE_CARD.asItem())

                .add(CardModItems.SQUID_CARD.asItem())
                .add(CardModItems.GLOW_SQUID_CARD.asItem())

                .add(CardModItems.RABBIT_CARD.asItem())
                .add(CardModItems.ALBINO_RABBIT_CARD.asItem())
                .add(CardModItems.BLACK_AND_WHITE_RABBIT_CARD.asItem())
                .add(CardModItems.BLACK_RABBIT_CARD.asItem())
                .add(CardModItems.GOLD_RABBIT_CARD.asItem())
                .add(CardModItems.SALT_AND_PEPPER_RABBIT_CARD.asItem())

                .add(CardModItems.CHICKEN_CARD.asItem())

                .add(CardModItems.COW_CARD.asItem())

                .add(CardModItems.DONKEY_CARD.asItem())
                .add(CardModItems.SADDLED_DONKEY_CARD.asItem())
                .add(CardModItems.HORSE_CARD.asItem())
                .add(CardModItems.ARMORED_HORSE_CARD.asItem())
                .add(CardModItems.MULE_CARD.asItem())

                .add(CardModItems.PIG_CARD.asItem())

                .add(CardModItems.IRON_GOLEM_CARD.asItem())
                .add(CardModItems.SNOW_GOLEM_CARD.asItem())
                .add(CardModItems.SHEARED_SNOW_GOLEM_CARD.asItem())

                .add(CardModItems.TURTLE_CARD.asItem())

                .add(CardModItems.WOLF_ASHEN_CARD.asItem())
                .add(CardModItems.WOLF_BLACK_CARD.asItem())
                .add(CardModItems.WOLF_CHESTNUT_CARD.asItem())
                .add(CardModItems.WOLF_PALE_CARD.asItem())
                .add(CardModItems.WOLF_RUSTY_CARD.asItem())
                .add(CardModItems.WOLF_SNOWY_CARD.asItem())
                .add(CardModItems.WOLF_SPOTTED_CARD.asItem())
                .add(CardModItems.WOLF_STRIPED_CARD.asItem())
                .add(CardModItems.WOLF_WOODS_CARD.asItem())

                .add(CardModItems.PHANTOM_CARD.asItem())

                .add(CardModItems.CAVE_SPIDER_CARD.asItem())
                .add(CardModItems.SPIDER_CARD.asItem())

                .add(CardModItems.ZOMBIE_CARD.asItem())

                .add(CardModItems.SKELETON_CARD.asItem())

                .add(CardModItems.STRIDER_CARD.asItem())

                .add(CardModItems.GHAST_CARD.asItem())

                .add(CardModItems.BLAZE_CARD.asItem())

                .add(CardModItems.ZOMBIFIED_PIGLIN_CARD.asItem())

                .add(CardModItems.HOGLIN_CARD.asItem())

                .add(CardModItems.ENDER_DRAGON_CARD.asItem())
                .add(CardModItems.ENDERMAN_CARD.asItem())
                .add(CardModItems.ENDERMITE_CARD.asItem());

        getOrCreateTagBuilder(CardModTags.Items.UNCOMMON_CARDS)
                .add(CardModItems.BLUE_AXOLOTL_CARD.asItem())
                .add(CardModItems.GREEN_AXOLOTL_CARD.asItem())
                .add(CardModItems.ANGRY_POLLINATED_BEE_CARD.asItem())
                .add(CardModItems.POLLINATED_BEE_CARD.asItem())

                .add(CardModItems.FIREFLY_CARD.asItem())

                .add(CardModItems.RED_PARROT_CARD.asItem())
                .add(CardModItems.BLUE_PARROT_CARD.asItem())
                .add(CardModItems.GREEN_PARROT_CARD.asItem())
                .add(CardModItems.CYAN_PARROT_CARD.asItem())
                .add(CardModItems.GRAY_PARROT_CARD.asItem())

                .add(CardModItems.KILLER_RABBIT_CARD.asItem())

                .add(CardModItems.RED_MOOSHROOM_CARD.asItem())
                .add(CardModItems.BROWN_MOOSHROOM_CARD.asItem())

                .add(CardModItems.BRITISH_SHORTHAIR_CAT_CARD.asItem())
                .add(CardModItems.CALICO_CAT_CARD.asItem())
                .add(CardModItems.JELLY_CAT_CARD.asItem())
                .add(CardModItems.PERSIAN_CAT_CARD.asItem())
                .add(CardModItems.RAGDOLL_CAT_CARD.asItem())
                .add(CardModItems.RED_CAT_CARD.asItem())
                .add(CardModItems.SIAMESE_CAT_CARD.asItem())
                .add(CardModItems.TABBY_CAT_CARD.asItem())
                .add(CardModItems.TUXEDO_CAT_CARD.asItem())
                .add(CardModItems.WHITE_CAT_CARD.asItem())

                .add(CardModItems.HUSK_CARD.asItem())
                .add(CardModItems.DROWNED_CARD.asItem())

                .add(CardModItems.BOGGED_CARD.asItem())
                .add(CardModItems.STRAY_CARD.asItem())

                .add(CardModItems.WITHER_SKELETON_CARD.asItem());

        getOrCreateTagBuilder(CardModTags.Items.RARE_CARDS)
                .add(CardModItems.MELONOID_AXOLOTL_CARD.asItem())

                .add(CardModItems.SNIFFER_CARD.asItem())

                .add(CardModItems.JUMBO_RABBIT_CARD.asItem())

                .add(CardModItems.MOOBLOOM_CARD.asItem())
                .add(CardModItems.WOOLY_COW_CARD.asItem())

                .add(CardModItems.SKELETON_HORSE_CARD.asItem())
                .add(CardModItems.ZOMBIE_HORSE_CARD.asItem())

                .add(CardModItems.OCELOT_CARD.asItem())
                .add(CardModItems.BLACK_CAT_CARD.asItem())

                .add(CardModItems.ZOMBIFIED_HOGLIN_CARD.asItem());

        getOrCreateTagBuilder(CardModTags.Items.EPIC_CARDS)
                .add(CardModItems.DIAMOND_CHICKEN_CARD.asItem())
                .add(CardModItems.DIAMOND_RABBIT_CARD.asItem())
                .add(CardModItems.GENTLE_BEE_CARD.asItem());

        getOrCreateTagBuilder(CardModTags.Items.MYTHIC_CARDS)
                .add(CardModItems.RAINBOW_SHEEP_CARD.asItem());

        getOrCreateTagBuilder(CardModTags.Items.PASSIVE_MOB_CARDS)
                .add(CardModItems.ARMADILLO_CARD.asItem())

                .add(CardModItems.LUCY_AXOLOTL_CARD.asItem())
                .add(CardModItems.WILD_AXOLOTL_CARD.asItem())
                .add(CardModItems.GOLD_AXOLOTL_CARD.asItem())
                .add(CardModItems.CYAN_AXOLOTL_CARD.asItem())

                .add(CardModItems.BAT_CARD.asItem())

                .add(CardModItems.CAMEL_CARD.asItem())

                .add(CardModItems.FOX_CARD.asItem())
                .add(CardModItems.SNOW_FOX_CARD.asItem())

                .add(CardModItems.BAT_CARD.asItem())
                .add(CardModItems.WARM_FROG_CARD.asItem())
                .add(CardModItems.COLD_FROG_CARD.asItem())
                .add(CardModItems.TADPOLE_CARD.asItem())

                .add(CardModItems.FIREFLY_CARD.asItem())

                .add(CardModItems.RED_PARROT_CARD.asItem())
                .add(CardModItems.BLUE_PARROT_CARD.asItem())
                .add(CardModItems.GREEN_PARROT_CARD.asItem())
                .add(CardModItems.CYAN_PARROT_CARD.asItem())
                .add(CardModItems.GRAY_PARROT_CARD.asItem())

                .add(CardModItems.SQUID_CARD.asItem())
                .add(CardModItems.GLOW_SQUID_CARD.asItem())

                .add(CardModItems.SNIFFER_CARD.asItem())

                .add(CardModItems.RABBIT_CARD.asItem())
                .add(CardModItems.ALBINO_RABBIT_CARD.asItem())
                .add(CardModItems.BLACK_AND_WHITE_RABBIT_CARD.asItem())
                .add(CardModItems.BLACK_RABBIT_CARD.asItem())
                .add(CardModItems.GOLD_RABBIT_CARD.asItem())
                .add(CardModItems.SALT_AND_PEPPER_RABBIT_CARD.asItem())
                .add(CardModItems.JUMBO_RABBIT_CARD.asItem())
                .add(CardModItems.DIAMOND_RABBIT_CARD.asItem())

                .add(CardModItems.CHICKEN_CARD.asItem())
                .add(CardModItems.DIAMOND_CHICKEN_CARD.asItem())

                .add(CardModItems.COW_CARD.asItem())
                .add(CardModItems.RED_MOOSHROOM_CARD.asItem())
                .add(CardModItems.BROWN_MOOSHROOM_CARD.asItem())
                .add(CardModItems.MOOBLOOM_CARD.asItem())
                .add(CardModItems.WOOLY_COW_CARD.asItem())

                .add(CardModItems.DONKEY_CARD.asItem())
                .add(CardModItems.SADDLED_DONKEY_CARD.asItem())

                .add(CardModItems.HORSE_CARD.asItem())
                .add(CardModItems.ARMORED_HORSE_CARD.asItem())
                .add(CardModItems.SKELETON_HORSE_CARD.asItem())
                .add(CardModItems.ZOMBIE_HORSE_CARD.asItem())

                .add(CardModItems.MULE_CARD.asItem())

                .add(CardModItems.RAINBOW_SHEEP_CARD.asItem())

                .add(CardModItems.PIG_CARD.asItem())

                .add(CardModItems.SNOW_GOLEM_CARD.asItem())
                .add(CardModItems.SHEARED_SNOW_GOLEM_CARD.asItem())

                .add(CardModItems.TURTLE_CARD.asItem())

                .add(CardModItems.OCELOT_CARD.asItem())
                .add(CardModItems.BLACK_CAT_CARD.asItem())
                .add(CardModItems.BRITISH_SHORTHAIR_CAT_CARD.asItem())
                .add(CardModItems.CALICO_CAT_CARD.asItem())
                .add(CardModItems.JELLY_CAT_CARD.asItem())
                .add(CardModItems.PERSIAN_CAT_CARD.asItem())
                .add(CardModItems.RAGDOLL_CAT_CARD.asItem())
                .add(CardModItems.RED_CAT_CARD.asItem())
                .add(CardModItems.SIAMESE_CAT_CARD.asItem())
                .add(CardModItems.TABBY_CAT_CARD.asItem())
                .add(CardModItems.TUXEDO_CAT_CARD.asItem())
                .add(CardModItems.WHITE_CAT_CARD.asItem())

                .add(CardModItems.STRIDER_CARD.asItem())
        ;

        getOrCreateTagBuilder(CardModTags.Items.NEUTRAL_MOB_CARDS)
                .add(CardModItems.ANGRY_BEE_CARD.asItem())
                .add(CardModItems.BEE_CARD.asItem())
                .add(CardModItems.ANGRY_POLLINATED_BEE_CARD.asItem())
                .add(CardModItems.POLLINATED_BEE_CARD.asItem())
                .add(CardModItems.GENTLE_BEE_CARD.asItem())

                .add(CardModItems.DOLPHIN_CARD.asItem())

                .add(CardModItems.IRON_GOLEM_CARD.asItem())

                .add(CardModItems.WOLF_ASHEN_CARD.asItem())
                .add(CardModItems.WOLF_BLACK_CARD.asItem())
                .add(CardModItems.WOLF_CHESTNUT_CARD.asItem())
                .add(CardModItems.WOLF_PALE_CARD.asItem())
                .add(CardModItems.WOLF_RUSTY_CARD.asItem())
                .add(CardModItems.WOLF_SNOWY_CARD.asItem())
                .add(CardModItems.WOLF_SPOTTED_CARD.asItem())
                .add(CardModItems.WOLF_STRIPED_CARD.asItem())
                .add(CardModItems.WOLF_WOODS_CARD.asItem())

                .add(CardModItems.WOLF_ASHEN_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_BLACK_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_CHESTNUT_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_PALE_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_RUSTY_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_SNOWY_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_SPOTTED_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_STRIPED_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_WOODS_ANGRY_CARD.asItem())
        ;

        getOrCreateTagBuilder(CardModTags.Items.HOSTILE_MOB_CARDS)
                .add(CardModItems.KILLER_RABBIT_CARD.asItem())

                .add(CardModItems.PHANTOM_CARD.asItem())

                .add(CardModItems.CAVE_SPIDER_CARD.asItem())
                .add(CardModItems.SPIDER_CARD.asItem())
                .add(CardModItems.INVISIBLE_SPIDER_CARD.asItem())

                .add(CardModItems.CREEPER_CARD.asItem())
                .add(CardModItems.CHARGED_CREEPER_CARD.asItem())

                .add(CardModItems.ZOMBIE_CARD.asItem())
                .add(CardModItems.HUSK_CARD.asItem())
                .add(CardModItems.DROWNED_CARD.asItem())

                .add(CardModItems.SKELETON_CARD.asItem())
                .add(CardModItems.BOGGED_CARD.asItem())
                .add(CardModItems.STRAY_CARD.asItem())

                .add(CardModItems.WITHER_SKELETON_CARD.asItem())

                .add(CardModItems.GHAST_CARD.asItem())

                .add(CardModItems.BLAZE_CARD.asItem())

                .add(CardModItems.MAGMA_CUBE_CARD.asItem())

                .add(CardModItems.PIGLIN_SWORD_CARD.asItem())
                .add(CardModItems.PIGLIN_CROSSBOW_CARD.asItem())
                .add(CardModItems.PIGLIN_BRUTE_CARD.asItem())
                .add(CardModItems.ZOMBIFIED_PIGLIN_CARD.asItem())

                .add(CardModItems.HOGLIN_CARD.asItem())
                .add(CardModItems.ZOMBIFIED_HOGLIN_CARD.asItem())

                .add(CardModItems.ENDER_DRAGON_CARD.asItem())

                .add(CardModItems.ENDERMAN_CARD.asItem())

                .add(CardModItems.ENDERMITE_CARD.asItem())

                .add(CardModItems.SHULKER_CARD.asItem());

        getOrCreateTagBuilder(CardModTags.Items.OVERWORLD_MOB_CARDS)
                .add(CardModItems.ALLAY_CARD.asItem())

                .add(CardModItems.ARMADILLO_CARD.asItem())

                .add(CardModItems.LUCY_AXOLOTL_CARD.asItem())
                .add(CardModItems.WILD_AXOLOTL_CARD.asItem())
                .add(CardModItems.GOLD_AXOLOTL_CARD.asItem())
                .add(CardModItems.CYAN_AXOLOTL_CARD.asItem())
                .add(CardModItems.BLUE_AXOLOTL_CARD.asItem())
                .add(CardModItems.GREEN_AXOLOTL_CARD.asItem())
                .add(CardModItems.MELONOID_AXOLOTL_CARD.asItem())

                .add(CardModItems.BAT_CARD.asItem())

                .add(CardModItems.ANGRY_BEE_CARD.asItem())
                .add(CardModItems.BEE_CARD.asItem())
                .add(CardModItems.ANGRY_POLLINATED_BEE_CARD.asItem())
                .add(CardModItems.POLLINATED_BEE_CARD.asItem())
                .add(CardModItems.GENTLE_BEE_CARD.asItem())

                .add(CardModItems.CAMEL_CARD.asItem())

                .add(CardModItems.DOLPHIN_CARD.asItem())

                .add(CardModItems.FOX_CARD.asItem())
                .add(CardModItems.SNOW_FOX_CARD.asItem())

                .add(CardModItems.TEMPERATE_FROG_CARD.asItem())
                .add(CardModItems.WARM_FROG_CARD.asItem())
                .add(CardModItems.COLD_FROG_CARD.asItem())
                .add(CardModItems.TADPOLE_CARD.asItem())

                .add(CardModItems.FIREFLY_CARD.asItem())

                .add(CardModItems.RED_PARROT_CARD.asItem())
                .add(CardModItems.BLUE_PARROT_CARD.asItem())
                .add(CardModItems.GREEN_PARROT_CARD.asItem())
                .add(CardModItems.CYAN_PARROT_CARD.asItem())
                .add(CardModItems.GRAY_PARROT_CARD.asItem())

                .add(CardModItems.SQUID_CARD.asItem())
                .add(CardModItems.GLOW_SQUID_CARD.asItem())

                .add(CardModItems.SNIFFER_CARD.asItem())

                .add(CardModItems.RABBIT_CARD.asItem())
                .add(CardModItems.ALBINO_RABBIT_CARD.asItem())
                .add(CardModItems.BLACK_AND_WHITE_RABBIT_CARD.asItem())
                .add(CardModItems.BLACK_RABBIT_CARD.asItem())
                .add(CardModItems.GOLD_RABBIT_CARD.asItem())
                .add(CardModItems.KILLER_RABBIT_CARD.asItem())
                .add(CardModItems.SALT_AND_PEPPER_RABBIT_CARD.asItem())
                .add(CardModItems.JUMBO_RABBIT_CARD.asItem())
                .add(CardModItems.DIAMOND_RABBIT_CARD.asItem())

                .add(CardModItems.CHICKEN_CARD.asItem())
                .add(CardModItems.DIAMOND_CHICKEN_CARD.asItem())

                .add(CardModItems.COW_CARD.asItem())
                .add(CardModItems.RED_MOOSHROOM_CARD.asItem())
                .add(CardModItems.BROWN_MOOSHROOM_CARD.asItem())
                .add(CardModItems.MOOBLOOM_CARD.asItem())
                .add(CardModItems.WOOLY_COW_CARD.asItem())

                .add(CardModItems.DONKEY_CARD.asItem())
                .add(CardModItems.SADDLED_DONKEY_CARD.asItem())

                .add(CardModItems.HORSE_CARD.asItem())
                .add(CardModItems.ARMORED_HORSE_CARD.asItem())
                .add(CardModItems.SKELETON_HORSE_CARD.asItem())
                .add(CardModItems.ZOMBIE_HORSE_CARD.asItem())

                .add(CardModItems.MULE_CARD.asItem())

                .add(CardModItems.RAINBOW_SHEEP_CARD.asItem())

                .add(CardModItems.PIG_CARD.asItem())

                .add(CardModItems.IRON_GOLEM_CARD.asItem())
                .add(CardModItems.SNOW_GOLEM_CARD.asItem())
                .add(CardModItems.SHEARED_SNOW_GOLEM_CARD.asItem())

                .add(CardModItems.TURTLE_CARD.asItem())

                .add(CardModItems.OCELOT_CARD.asItem())
                .add(CardModItems.BLACK_CAT_CARD.asItem())
                .add(CardModItems.BRITISH_SHORTHAIR_CAT_CARD.asItem())
                .add(CardModItems.CALICO_CAT_CARD.asItem())
                .add(CardModItems.JELLY_CAT_CARD.asItem())
                .add(CardModItems.PERSIAN_CAT_CARD.asItem())
                .add(CardModItems.RAGDOLL_CAT_CARD.asItem())
                .add(CardModItems.RED_CAT_CARD.asItem())
                .add(CardModItems.SIAMESE_CAT_CARD.asItem())
                .add(CardModItems.TABBY_CAT_CARD.asItem())
                .add(CardModItems.TUXEDO_CAT_CARD.asItem())
                .add(CardModItems.WHITE_CAT_CARD.asItem())

                .add(CardModItems.WOLF_ASHEN_CARD.asItem())
                .add(CardModItems.WOLF_BLACK_CARD.asItem())
                .add(CardModItems.WOLF_CHESTNUT_CARD.asItem())
                .add(CardModItems.WOLF_PALE_CARD.asItem())
                .add(CardModItems.WOLF_RUSTY_CARD.asItem())
                .add(CardModItems.WOLF_SNOWY_CARD.asItem())
                .add(CardModItems.WOLF_SPOTTED_CARD.asItem())
                .add(CardModItems.WOLF_STRIPED_CARD.asItem())
                .add(CardModItems.WOLF_WOODS_CARD.asItem())

                .add(CardModItems.WOLF_ASHEN_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_BLACK_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_CHESTNUT_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_PALE_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_RUSTY_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_SNOWY_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_SPOTTED_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_STRIPED_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_WOODS_ANGRY_CARD.asItem())

                .add(CardModItems.WOLF_ASHEN_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_BLACK_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_CHESTNUT_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_PALE_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_RUSTY_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_SNOWY_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_SPOTTED_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_STRIPED_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_WOODS_ARMOR_CARD.asItem())

                .add(CardModItems.PHANTOM_CARD.asItem())

                .add(CardModItems.CAVE_SPIDER_CARD.asItem())
                .add(CardModItems.SPIDER_CARD.asItem())
                .add(CardModItems.INVISIBLE_SPIDER_CARD.asItem())

                .add(CardModItems.CREEPER_CARD.asItem())
                .add(CardModItems.CHARGED_CREEPER_CARD.asItem())

                .add(CardModItems.ZOMBIE_CARD.asItem())
                .add(CardModItems.HUSK_CARD.asItem())
                .add(CardModItems.DROWNED_CARD.asItem())

                .add(CardModItems.SKELETON_CARD.asItem())
                .add(CardModItems.BOGGED_CARD.asItem())
                .add(CardModItems.STRAY_CARD.asItem())

                .add(CardModItems.ENDERMAN_CARD.asItem());

        getOrCreateTagBuilder(CardModTags.Items.NETHER_MOB_CARDS)
                .add(CardModItems.STRIDER_CARD.asItem())

                .add(CardModItems.SKELETON_CARD.asItem())
                .add(CardModItems.WITHER_SKELETON_CARD.asItem())

                .add(CardModItems.GHAST_CARD.asItem())

                .add(CardModItems.BLAZE_CARD.asItem())

                .add(CardModItems.MAGMA_CUBE_CARD.asItem())

                .add(CardModItems.PIGLIN_SWORD_CARD.asItem())
                .add(CardModItems.PIGLIN_CROSSBOW_CARD.asItem())
                .add(CardModItems.PIGLIN_BRUTE_CARD.asItem())
                .add(CardModItems.ZOMBIFIED_PIGLIN_CARD.asItem())

                .add(CardModItems.HOGLIN_CARD.asItem())
                .add(CardModItems.ZOMBIFIED_HOGLIN_CARD.asItem())

                .add(CardModItems.ENDERMAN_CARD.asItem());

        getOrCreateTagBuilder(CardModTags.Items.END_MOB_CARDS)
                .add(CardModItems.ENDER_DRAGON_CARD.asItem())

                .add(CardModItems.ENDERMAN_CARD.asItem())

                .add(CardModItems.ENDERMITE_CARD.asItem())

                .add(CardModItems.SHULKER_CARD.asItem());

        getOrCreateTagBuilder(CardModTags.Items.SERIES_ONE_CARDS)
                .add(CardModItems.ALLAY_CARD.asItem())

                .add(CardModItems.ARMADILLO_CARD.asItem())

                .add(CardModItems.LUCY_AXOLOTL_CARD.asItem())
                .add(CardModItems.WILD_AXOLOTL_CARD.asItem())
                .add(CardModItems.GOLD_AXOLOTL_CARD.asItem())
                .add(CardModItems.CYAN_AXOLOTL_CARD.asItem())
                .add(CardModItems.BLUE_AXOLOTL_CARD.asItem())
                .add(CardModItems.GREEN_AXOLOTL_CARD.asItem())
                .add(CardModItems.MELONOID_AXOLOTL_CARD.asItem())

                .add(CardModItems.BAT_CARD.asItem())

                .add(CardModItems.ANGRY_BEE_CARD.asItem())
                .add(CardModItems.BEE_CARD.asItem())
                .add(CardModItems.ANGRY_POLLINATED_BEE_CARD.asItem())
                .add(CardModItems.POLLINATED_BEE_CARD.asItem())
                .add(CardModItems.GENTLE_BEE_CARD.asItem())

                .add(CardModItems.CAMEL_CARD.asItem())

                .add(CardModItems.DOLPHIN_CARD.asItem())

                .add(CardModItems.FOX_CARD.asItem())
                .add(CardModItems.SNOW_FOX_CARD.asItem())

                .add(CardModItems.TEMPERATE_FROG_CARD.asItem())
                .add(CardModItems.WARM_FROG_CARD.asItem())
                .add(CardModItems.COLD_FROG_CARD.asItem())
                .add(CardModItems.TADPOLE_CARD.asItem())

                .add(CardModItems.FIREFLY_CARD.asItem())

                .add(CardModItems.RED_PARROT_CARD.asItem())
                .add(CardModItems.BLUE_PARROT_CARD.asItem())
                .add(CardModItems.GREEN_PARROT_CARD.asItem())
                .add(CardModItems.CYAN_PARROT_CARD.asItem())
                .add(CardModItems.GRAY_PARROT_CARD.asItem())

                .add(CardModItems.SQUID_CARD.asItem())
                .add(CardModItems.GLOW_SQUID_CARD.asItem())

                .add(CardModItems.SNIFFER_CARD.asItem())

                .add(CardModItems.RABBIT_CARD.asItem())
                .add(CardModItems.ALBINO_RABBIT_CARD.asItem())
                .add(CardModItems.BLACK_AND_WHITE_RABBIT_CARD.asItem())
                .add(CardModItems.BLACK_RABBIT_CARD.asItem())
                .add(CardModItems.GOLD_RABBIT_CARD.asItem())
                .add(CardModItems.KILLER_RABBIT_CARD.asItem())
                .add(CardModItems.SALT_AND_PEPPER_RABBIT_CARD.asItem())
                .add(CardModItems.JUMBO_RABBIT_CARD.asItem())
                .add(CardModItems.DIAMOND_RABBIT_CARD.asItem())

                .add(CardModItems.CHICKEN_CARD.asItem())
                .add(CardModItems.DIAMOND_CHICKEN_CARD.asItem())

                .add(CardModItems.COW_CARD.asItem())
                .add(CardModItems.RED_MOOSHROOM_CARD.asItem())
                .add(CardModItems.BROWN_MOOSHROOM_CARD.asItem())
                .add(CardModItems.MOOBLOOM_CARD.asItem())
                .add(CardModItems.WOOLY_COW_CARD.asItem())

                .add(CardModItems.DONKEY_CARD.asItem())
                .add(CardModItems.SADDLED_DONKEY_CARD.asItem())

                .add(CardModItems.HORSE_CARD.asItem())
                .add(CardModItems.ARMORED_HORSE_CARD.asItem())
                .add(CardModItems.SKELETON_HORSE_CARD.asItem())
                .add(CardModItems.ZOMBIE_HORSE_CARD.asItem())

                .add(CardModItems.MULE_CARD.asItem())

                .add(CardModItems.RAINBOW_SHEEP_CARD.asItem())

                .add(CardModItems.PIG_CARD.asItem())

                .add(CardModItems.IRON_GOLEM_CARD.asItem())
                .add(CardModItems.SNOW_GOLEM_CARD.asItem())
                .add(CardModItems.SHEARED_SNOW_GOLEM_CARD.asItem())

                .add(CardModItems.TURTLE_CARD.asItem())

                .add(CardModItems.OCELOT_CARD.asItem())
                .add(CardModItems.BLACK_CAT_CARD.asItem())
                .add(CardModItems.BRITISH_SHORTHAIR_CAT_CARD.asItem())
                .add(CardModItems.CALICO_CAT_CARD.asItem())
                .add(CardModItems.JELLY_CAT_CARD.asItem())
                .add(CardModItems.PERSIAN_CAT_CARD.asItem())
                .add(CardModItems.RAGDOLL_CAT_CARD.asItem())
                .add(CardModItems.RED_CAT_CARD.asItem())
                .add(CardModItems.SIAMESE_CAT_CARD.asItem())
                .add(CardModItems.TABBY_CAT_CARD.asItem())
                .add(CardModItems.TUXEDO_CAT_CARD.asItem())
                .add(CardModItems.WHITE_CAT_CARD.asItem())

                .add(CardModItems.WOLF_ASHEN_CARD.asItem())
                .add(CardModItems.WOLF_BLACK_CARD.asItem())
                .add(CardModItems.WOLF_CHESTNUT_CARD.asItem())
                .add(CardModItems.WOLF_PALE_CARD.asItem())
                .add(CardModItems.WOLF_RUSTY_CARD.asItem())
                .add(CardModItems.WOLF_SNOWY_CARD.asItem())
                .add(CardModItems.WOLF_SPOTTED_CARD.asItem())
                .add(CardModItems.WOLF_STRIPED_CARD.asItem())
                .add(CardModItems.WOLF_WOODS_CARD.asItem())

                .add(CardModItems.WOLF_ASHEN_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_BLACK_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_CHESTNUT_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_PALE_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_RUSTY_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_SNOWY_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_SPOTTED_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_STRIPED_ANGRY_CARD.asItem())
                .add(CardModItems.WOLF_WOODS_ANGRY_CARD.asItem())

                .add(CardModItems.WOLF_ASHEN_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_BLACK_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_CHESTNUT_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_PALE_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_RUSTY_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_SNOWY_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_SPOTTED_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_STRIPED_ARMOR_CARD.asItem())
                .add(CardModItems.WOLF_WOODS_ARMOR_CARD.asItem())

                .add(CardModItems.TAMED_WOLF_ASHEN_CARD.asItem())
                .add(CardModItems.TAMED_WOLF_BLACK_CARD.asItem())
                .add(CardModItems.TAMED_WOLF_CHESTNUT_CARD.asItem())
                .add(CardModItems.TAMED_WOLF_PALE_CARD.asItem())
                .add(CardModItems.TAMED_WOLF_RUSTY_CARD.asItem())
                .add(CardModItems.TAMED_WOLF_SNOWY_CARD.asItem())
                .add(CardModItems.TAMED_WOLF_SPOTTED_CARD.asItem())
                .add(CardModItems.TAMED_WOLF_STRIPED_CARD.asItem())
                .add(CardModItems.TAMED_WOLF_WOODS_CARD.asItem())

                .add(CardModItems.PHANTOM_CARD.asItem())

                .add(CardModItems.CAVE_SPIDER_CARD.asItem())
                .add(CardModItems.SPIDER_CARD.asItem())
                .add(CardModItems.INVISIBLE_SPIDER_CARD.asItem())

                .add(CardModItems.CREEPER_CARD.asItem())
                .add(CardModItems.CHARGED_CREEPER_CARD.asItem())

                .add(CardModItems.ZOMBIE_CARD.asItem())
                .add(CardModItems.HUSK_CARD.asItem())
                .add(CardModItems.DROWNED_CARD.asItem())

                .add(CardModItems.SKELETON_CARD.asItem())
                .add(CardModItems.BOGGED_CARD.asItem())
                .add(CardModItems.STRAY_CARD.asItem())

                .add(CardModItems.STRIDER_CARD.asItem())

                .add(CardModItems.SKELETON_CARD.asItem())
                .add(CardModItems.WITHER_SKELETON_CARD.asItem())

                .add(CardModItems.GHAST_CARD.asItem())

                .add(CardModItems.BLAZE_CARD.asItem())

                .add(CardModItems.MAGMA_CUBE_CARD.asItem())

                .add(CardModItems.PIGLIN_SWORD_CARD.asItem())
                .add(CardModItems.PIGLIN_CROSSBOW_CARD.asItem())
                .add(CardModItems.PIGLIN_BRUTE_CARD.asItem())
                .add(CardModItems.ZOMBIFIED_PIGLIN_CARD.asItem())

                .add(CardModItems.HOGLIN_CARD.asItem())
                .add(CardModItems.ZOMBIFIED_HOGLIN_CARD.asItem())

                .add(CardModItems.ENDER_DRAGON_CARD.asItem())

                .add(CardModItems.ENDERMAN_CARD.asItem())

                .add(CardModItems.ENDERMITE_CARD.asItem())

                .add(CardModItems.SHULKER_CARD.asItem());

        for (String color : sheep_colors) {
            String cardName = color.toLowerCase().replace(" ", "_") + "_sheep_card";
            Item item = CardModItems.get(cardName); // Fetch the card item dynamically
            if (item != null) {
                getOrCreateTagBuilder(CardModTags.Items.COMMON_CARDS).add(item);
                getOrCreateTagBuilder(CardModTags.Items.PASSIVE_MOB_CARDS).add(item);
                getOrCreateTagBuilder(CardModTags.Items.OVERWORLD_MOB_CARDS).add(item);
            } else {
                // Log error
                System.err.println("Item not found for: " + cardName + " in CardModItemTagProvider");
            }
        }
        for (String biome : villager_card_biomes) {
            for (String profession : villager_card_professions) {
                String cardName = biome.toLowerCase().replace(" ", "_") + "_"
                        + profession.toLowerCase().replace(" ", "_")
                        + "_villager_card";
                Item item = CardModItems.get(cardName);
                if (item != null) {
                    getOrCreateTagBuilder(CardModTags.Items.COMMON_CARDS).add(item);
                    getOrCreateTagBuilder(CardModTags.Items.PASSIVE_MOB_CARDS).add(item);
                    getOrCreateTagBuilder(CardModTags.Items.OVERWORLD_MOB_CARDS).add(item);
                    getOrCreateTagBuilder(CardModTags.Items.VILLAGE_MOB_CARDS).add(item);
                    getOrCreateTagBuilder(CardModTags.Items.VILLAGE_CARDS).add(item);
                } else {
                    // Log error
                    System.err.println("Item not found for: " + cardName + " in CardModItemTagProvider");
                }
            }
        }
        for (String color : shulker_colors) {
            String cardName = color.toLowerCase().replace(" ", "_") + "_shulker_card";
            Item item = CardModItems.get(cardName); // Fetch the card item dynamically
            if (item != null) {
                getOrCreateTagBuilder(CardModTags.Items.COMMON_CARDS).add(item);
                getOrCreateTagBuilder(CardModTags.Items.HOSTILE_MOB_CARDS).add(item);
                getOrCreateTagBuilder(CardModTags.Items.END_MOB_CARDS).add(item);
                getOrCreateTagBuilder(CardModTags.Items.SERIES_ONE_CARDS).add(item);
            } else {
                // Log error
                System.err.println("Item not found for: " + cardName + " in CardModItemTagProvider");
            }
        }
    }
}