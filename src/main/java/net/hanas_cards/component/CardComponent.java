package net.hanas_cards.component;

import java.util.Arrays;
import java.util.List;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;

public class CardComponent {
    private final float grading;
    private final String description;
    private final String[] tags;

    // Define a default component with sensible defaults
    public static final CardComponent DEFAULT = new CardComponent(0.0f, "", List.of(new String[]{}));

    public CardComponent(float grading, String description, List<String> tags) {
        this.grading = grading;
        this.description = description;
        this.tags = tags.toArray(new String[0]);
    }

    public float getGrading() {
        return grading;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTagList() {
        return Arrays.asList(tags);
    }

    public void writeNbt(NbtCompound nbt) {
        nbt.putFloat("grading", this.grading);
        nbt.putString("description", this.description);

        // Store the tags array as an NbtList
        NbtList tagList = new NbtList();
        for (String tag : this.tags) {
            tagList.add(NbtString.of(tag)); // Wrap each tag as an NbtString
        }
        nbt.put("tags", tagList); // Add the list to the compound under "tags"
    }

    public static CardComponent fromNbt(NbtCompound nbt) {
        float grading = nbt.getFloat("grading");
        String description = nbt.getString("description");

        // Retrieve the list of tags
        NbtList tagList = nbt.getList("tags", NbtElement.STRING_TYPE); // STRING_TYPE corresponds to NbtString
        String[] tags = new String[tagList.size()];
        for (int i = 0; i < tagList.size(); i++) {
            tags[i] = tagList.getString(i); // Get the string from each NbtString
        }

        return new CardComponent(grading, description, List.of(tags));
    }

    public static CardComponent getDefault() {
        return new CardComponent(0.0f, "", List.of());
    }
}