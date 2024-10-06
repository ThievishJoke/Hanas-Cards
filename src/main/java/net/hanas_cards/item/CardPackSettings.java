package net.hanas_cards.item;

import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;

import java.util.List;
import java.util.Map;

public class CardPackSettings extends Item.Settings{
    private final int numberOfCards;
    private final Map<TagKey<Item>, Integer> weightedTags; // Tags with weights
    private final List<TagKey<Item>> unweightedTags; // Tags without weights

    public CardPackSettings(int numberOfCards, Map<TagKey<Item>, Integer> weightedTags, List<TagKey<Item>> unweightedTags) {
        this.numberOfCards = numberOfCards;
        this.weightedTags = weightedTags;
        this.unweightedTags = unweightedTags;
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public Map<TagKey<Item>, Integer> getWeightedTags() {
        return weightedTags;
    }

    public List<TagKey<Item>> getUnweightedTags() {
        return unweightedTags;
    }
}