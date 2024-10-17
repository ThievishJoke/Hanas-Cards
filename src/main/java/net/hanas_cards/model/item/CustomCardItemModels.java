package net.hanas_cards.model.item;

import com.google.gson.JsonObject;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;

public class CustomCardItemModels extends Models {

    public CustomCardItemModels(String string) {
        super();
    }

    public Model createInheritedTextureModel(Identifier baseTextureId, Identifier overlayTextureId) {
        JsonObject textures = new JsonObject();
        textures.addProperty("layer0", baseTextureId.toString());
        textures.addProperty("layer1", overlayTextureId.toString());

        // Return the model with 'item/generated' as parent and textures defined
        return new Model(Optional.of(Identifier.of("item/generated")), Optional.of(String.valueOf(textures)));
    }

    public Model createSleevedCardModel(
            Identifier baseTexture,
            @Nullable Map<Integer, Identifier> layeredTextures,
            Identifier cardSleeveTexture) {

        JsonObject textures = new JsonObject();

        if (layeredTextures != null && !layeredTextures.isEmpty()) {
            for (Map.Entry<Integer, Identifier> entry : layeredTextures.entrySet()) {
                textures.addProperty("layer" + entry.getKey(), entry.getValue().toString());
            }
        } else {
            textures.addProperty("layer0", baseTexture.toString());
        }

        int nextLayer = (layeredTextures != null ? layeredTextures.size() : 1);
        textures.addProperty("layer" + nextLayer, cardSleeveTexture.toString());

        // Return the model with 'item/generated' as parent and the defined textures
        return new Model(Optional.of(Identifier.of("item/generated")), Optional.of(String.valueOf(textures)));
    }
}
