package net.hanas_cards.component;

import java.util.Arrays;
import java.util.List;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class CardComponent {
    private final float grading;
    private final String description;
    private final String[] tags;

    public static final Codec<CardComponent> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                    Codec.FLOAT.fieldOf("grading").forGetter(CardComponent::getGrading),
                    Codec.STRING.fieldOf("description").forGetter(CardComponent::getDescription),
                    Codec.STRING.listOf().fieldOf("tags").forGetter(CardComponent::getTagList) // Modified getter here
            ).apply(instance, CardComponent::new)
    );

    public static final CardComponent DEFAULT = new CardComponent(0, "", List.of());

    // Constructor to initialize grading, description, and tags
    public CardComponent(float grading, String description, List<String> tags) {
        this.grading = grading; // Set the grading value
        this.description = description; // Set the description value
        this.tags = tags.toArray(new String[0]); // Convert List to array
    }

    // Getter for grading
    public float getGrading() {
        return grading;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Getter that returns a copy of the tags array as a list
    public List<String> getTagList() {
        return Arrays.asList(tags); // Convert array to List
    }
}