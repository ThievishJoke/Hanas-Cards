package net.hanas_cards.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hanas_cards.HanasCardsMod;
import net.hanas_cards.item.CardModItems;
import net.hanas_cards.util.CardModTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;


public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, CardModItems.CARD_SCRAP, 1)
                    .input(CardModTags.Items.SERIES_ONE_CARDS)
                    .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                    .offerTo(exporter, Identifier.of(HanasCardsMod.MOD_ID, "card_scrap_from_series_one"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, CardModItems.CARD_SCRAP, 1)
                    .input(CardModTags.Items.SERIES_ONE_EXPANSION_ONE_CARDS)
                    .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                    .offerTo(exporter, Identifier.of(HanasCardsMod.MOD_ID, "card_scrap_from_series_one_expansion_one"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, CardModItems.CARD_SCRAP, 1)
                    .input(CardModTags.Items.SERIES_ONE_EXPANSION_TWO_CARDS)
                    .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                    .offerTo(exporter, Identifier.of(HanasCardsMod.MOD_ID, "card_scrap_from_series_one_expansion_two"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, CardModItems.CARD_SCRAP, 1)
                    .input(CardModTags.Items.SERIES_TWO_CARDS)
                    .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                    .offerTo(exporter, Identifier.of(HanasCardsMod.MOD_ID, "card_scrap_from_series_two"));

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, CardModItems.CARD_SCRAP, 1)
                    .input(CardModTags.Items.VILLAGE_CARDS)
                    .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                    .offerTo(exporter, Identifier.of(HanasCardsMod.MOD_ID, "card_scrap_from_villager_cards"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PAPER, 3)
                .input(CardModItems.CARD_SCRAP)
                .criterion(hasItem(CardModItems.CARD_SCRAP), conditionsFromItem(CardModItems.CARD_SCRAP))
                .offerTo(exporter);
    }
}
