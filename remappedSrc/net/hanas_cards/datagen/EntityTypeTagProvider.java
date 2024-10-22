package net.hanas_cards.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hanas_cards.util.CardModTags;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EntityTypeTags;

import java.util.concurrent.CompletableFuture;

public class EntityTypeTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public EntityTypeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(CardModTags.Entities.PASSIVE_MOB_TAG)
                .add(EntityType.ALLAY)
                .add(EntityType.ARMADILLO)
                .add(EntityType.AXOLOTL)
                .add(EntityType.CAMEL)
                .add(EntityType.CAT)
                .add(EntityType.CHICKEN)
                .add(EntityType.COD)
                .add(EntityType.COW)
                .add(EntityType.DONKEY)
                .add(EntityType.FROG)
                .add(EntityType.GLOW_SQUID)
                .add(EntityType.HORSE)
                .add(EntityType.MOOSHROOM)
                .add(EntityType.MULE)
                .add(EntityType.OCELOT)
                .add(EntityType.PARROT)
                .add(EntityType.PIG)
                .add(EntityType.PUFFERFISH)
                .add(EntityType.RABBIT)
                .add(EntityType.SALMON)
                .add(EntityType.SHEEP)
                .add(EntityType.SKELETON_HORSE)
                .add(EntityType.SNIFFER)
                .add(EntityType.SNOW_GOLEM)
                .add(EntityType.SQUID)
                .add(EntityType.STRIDER)
                .add(EntityType.TADPOLE)
                .add(EntityType.TROPICAL_FISH)
                .add(EntityType.TURTLE)
                .add(EntityType.VILLAGER)
                .add(EntityType.WANDERING_TRADER)
                .add(EntityType.ZOMBIE_HORSE)
        ;
        getOrCreateTagBuilder(CardModTags.Entities.NEUTRAL_MOB_TAG)
                .add(EntityType.BEE)
                .add(EntityType.CAVE_SPIDER)
                .add(EntityType.DOLPHIN)
                .add(EntityType.DROWNED)
                .add(EntityType.ENDERMAN)
                .add(EntityType.FOX)
                .add(EntityType.GOAT)
                .add(EntityType.IRON_GOLEM)
                .add(EntityType.LLAMA)
                .add(EntityType.PANDA)
                .add(EntityType.PIGLIN)
                .add(EntityType.POLAR_BEAR)
                .add(EntityType.SPIDER)
                .add(EntityType.TRADER_LLAMA)
                .add(EntityType.WOLF)
                .add(EntityType.ZOMBIFIED_PIGLIN)
        ;
        getOrCreateTagBuilder(CardModTags.Entities.HOSTILE_MOB_TAG)
                .add(EntityType.BLAZE)
                .add(EntityType.BOGGED)
                .add(EntityType.BREEZE)
                .add(EntityType.CREEPER)
                .add(EntityType.ELDER_GUARDIAN)
                .add(EntityType.ENDERMITE)
                .add(EntityType.ENDER_DRAGON)
                .add(EntityType.EVOKER)
                .add(EntityType.GHAST)
                .add(EntityType.GUARDIAN)
                .add(EntityType.HOGLIN)
                .add(EntityType.HUSK)
                .add(EntityType.MAGMA_CUBE)
                .add(EntityType.PHANTOM)
                .add(EntityType.PIGLIN_BRUTE)
                .add(EntityType.PILLAGER)
                .add(EntityType.RAVAGER)
                .add(EntityType.SHULKER)
                .add(EntityType.SILVERFISH)
                .add(EntityType.SKELETON)
                .add(EntityType.SLIME)
                .add(EntityType.STRAY)
                .add(EntityType.VEX)
                .add(EntityType.VINDICATOR)
                .add(EntityType.WARDEN)
                .add(EntityType.WITCH)
                .add(EntityType.WITHER)
                .add(EntityType.WITHER_SKELETON)
                .add(EntityType.ZOGLIN)
                .add(EntityType.ZOMBIE)
                .add(EntityType.ZOMBIE_VILLAGER)
        ;
        getOrCreateTagBuilder(CardModTags.Entities.BOSS_MOB_TAG)
                .add(EntityType.WARDEN)
                .add(EntityType.ELDER_GUARDIAN)
                .add(EntityType.ENDER_DRAGON)
                .add(EntityType.WITHER)
        ;
        getOrCreateTagBuilder(CardModTags.Entities.MOB_TAG)
                .add(EntityType.ALLAY)
                .add(EntityType.ARMADILLO)
                .add(EntityType.AXOLOTL)
                .add(EntityType.CAMEL)
                .add(EntityType.CAT)
                .add(EntityType.CHICKEN)
                .add(EntityType.COD)
                .add(EntityType.COW)
                .add(EntityType.DONKEY)
                .add(EntityType.FROG)
                .add(EntityType.GLOW_SQUID)
                .add(EntityType.HORSE)
                .add(EntityType.MOOSHROOM)
                .add(EntityType.MULE)
                .add(EntityType.OCELOT)
                .add(EntityType.PARROT)
                .add(EntityType.PIG)
                .add(EntityType.PUFFERFISH)
                .add(EntityType.RABBIT)
                .add(EntityType.SALMON)
                .add(EntityType.SHEEP)
                .add(EntityType.SKELETON_HORSE)
                .add(EntityType.SNIFFER)
                .add(EntityType.SNOW_GOLEM)
                .add(EntityType.SQUID)
                .add(EntityType.STRIDER)
                .add(EntityType.TADPOLE)
                .add(EntityType.TROPICAL_FISH)
                .add(EntityType.TURTLE)
                .add(EntityType.VILLAGER)
                .add(EntityType.WANDERING_TRADER)
                .add(EntityType.ZOMBIE_HORSE)
                .add(EntityType.BEE)
                .add(EntityType.CAVE_SPIDER)
                .add(EntityType.DOLPHIN)
                .add(EntityType.DROWNED)
                .add(EntityType.ENDERMAN)
                .add(EntityType.FOX)
                .add(EntityType.GOAT)
                .add(EntityType.IRON_GOLEM)
                .add(EntityType.LLAMA)
                .add(EntityType.PANDA)
                .add(EntityType.PIGLIN)
                .add(EntityType.POLAR_BEAR)
                .add(EntityType.SPIDER)
                .add(EntityType.TRADER_LLAMA)
                .add(EntityType.WOLF)
                .add(EntityType.ZOMBIFIED_PIGLIN)
                .add(EntityType.BLAZE)
                .add(EntityType.BOGGED)
                .add(EntityType.BREEZE)
                .add(EntityType.CREEPER)
                .add(EntityType.ELDER_GUARDIAN)
                .add(EntityType.ENDERMITE)
                .add(EntityType.ENDER_DRAGON)
                .add(EntityType.EVOKER)
                .add(EntityType.GHAST)
                .add(EntityType.GUARDIAN)
                .add(EntityType.HOGLIN)
                .add(EntityType.HUSK)
                .add(EntityType.MAGMA_CUBE)
                .add(EntityType.PHANTOM)
                .add(EntityType.PIGLIN_BRUTE)
                .add(EntityType.PILLAGER)
                .add(EntityType.RAVAGER)
                .add(EntityType.SHULKER)
                .add(EntityType.SILVERFISH)
                .add(EntityType.SKELETON)
                .add(EntityType.SLIME)
                .add(EntityType.STRAY)
                .add(EntityType.VEX)
                .add(EntityType.VINDICATOR)
                .add(EntityType.WARDEN)
                .add(EntityType.WITCH)
                .add(EntityType.WITHER)
                .add(EntityType.WITHER_SKELETON)
                .add(EntityType.ZOGLIN)
                .add(EntityType.ZOMBIE)
                .add(EntityType.ZOMBIE_VILLAGER)
        ;
        getOrCreateTagBuilder(CardModTags.Entities.OVERWORLD_MOB_TAG)
                .add(EntityType.ALLAY)
                .add(EntityType.ARMADILLO)
                .add(EntityType.AXOLOTL)
                .add(EntityType.CAMEL)
                .add(EntityType.CAT)
                .add(EntityType.CHICKEN)
                .add(EntityType.COD)
                .add(EntityType.COW)
                .add(EntityType.DONKEY)
                .add(EntityType.FROG)
                .add(EntityType.GLOW_SQUID)
                .add(EntityType.HORSE)
                .add(EntityType.MOOSHROOM)
                .add(EntityType.MULE)
                .add(EntityType.OCELOT)
                .add(EntityType.PARROT)
                .add(EntityType.PIG)
                .add(EntityType.PUFFERFISH)
                .add(EntityType.RABBIT)
                .add(EntityType.SALMON)
                .add(EntityType.SHEEP)
                .add(EntityType.SKELETON_HORSE)
                .add(EntityType.SNIFFER)
                .add(EntityType.SNOW_GOLEM)
                .add(EntityType.SQUID)
                .add(EntityType.TADPOLE)
                .add(EntityType.TROPICAL_FISH)
                .add(EntityType.TURTLE)
                .add(EntityType.VILLAGER)
                .add(EntityType.WANDERING_TRADER)
                .add(EntityType.ZOMBIE_HORSE)
                .add(EntityType.BEE)
                .add(EntityType.CAVE_SPIDER)
                .add(EntityType.DOLPHIN)
                .add(EntityType.DROWNED)
                .add(EntityType.ENDERMAN)
                .add(EntityType.FOX)
                .add(EntityType.GOAT)
                .add(EntityType.IRON_GOLEM)
                .add(EntityType.LLAMA)
                .add(EntityType.PANDA)
                .add(EntityType.POLAR_BEAR)
                .add(EntityType.SPIDER)
                .add(EntityType.TRADER_LLAMA)
                .add(EntityType.WOLF)
                .add(EntityType.BOGGED)
                .add(EntityType.BREEZE)
                .add(EntityType.CREEPER)
                .add(EntityType.ELDER_GUARDIAN)
                .add(EntityType.EVOKER)
                .add(EntityType.GUARDIAN)
                .add(EntityType.PHANTOM)
                .add(EntityType.PILLAGER)
                .add(EntityType.RAVAGER)
                .add(EntityType.SILVERFISH)
                .add(EntityType.SKELETON)
                .add(EntityType.SLIME)
                .add(EntityType.STRAY)
                .add(EntityType.VEX)
                .add(EntityType.VINDICATOR)
                .add(EntityType.WARDEN)
                .add(EntityType.WITCH)
                .add(EntityType.ZOMBIE)
                .add(EntityType.ZOMBIE_VILLAGER)
        ;
        getOrCreateTagBuilder(CardModTags.Entities.NETHER_MOB_TAG)
                .add(EntityType.STRIDER)
                .add(EntityType.ENDERMAN)
                .add(EntityType.PIGLIN)
                .add(EntityType.ZOMBIFIED_PIGLIN)
                .add(EntityType.BLAZE)
                .add(EntityType.GHAST)
                .add(EntityType.HOGLIN)
                .add(EntityType.MAGMA_CUBE)
                .add(EntityType.PIGLIN_BRUTE)
                .add(EntityType.SKELETON)
                .add(EntityType.WITHER)
                .add(EntityType.WITHER_SKELETON)
                .add(EntityType.ZOGLIN)
        ;
        getOrCreateTagBuilder(CardModTags.Entities.END_MOB_TAG)
                .add(EntityType.ENDER_DRAGON)
                .add(EntityType.ENDERMITE)
                .add(EntityType.ENDERMAN)
                .add(EntityType.SHULKER)
        ;
    }
}