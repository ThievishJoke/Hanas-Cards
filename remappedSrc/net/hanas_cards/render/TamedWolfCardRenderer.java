package net.hanas_cards.render;

import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.hanas_cards.item.Custom.TamedWolfCard;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;

public class TamedWolfCardRenderer implements BuiltinItemRendererRegistry.DynamicItemRenderer {

    private static final MinecraftClient client = MinecraftClient.getInstance();

    @Override
    public void render(ItemStack stack, ModelTransformationMode mode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        // Ensure the stack is an instance of TamedWolfCard
        if (stack.getItem() instanceof TamedWolfCard wolfCard) {
            // Get the base texture and collar overlay texture for the card
            wolfCard.getBaseTexture();
            wolfCard.getCollarTexture();
            wolfCard.getWolfType();
            wolfCard.getCurrentCollarColor();

            // Get the model for rendering the item (this can be a custom model if needed)
            BakedModel baseModel = client.getItemRenderer().getModel(new ItemStack(Items.PAPER), null, null, 0);

            // Render the base card texture
            renderCard(stack, baseModel, matrices, vertexConsumers, light, overlay);

            // Render the collar overlay texture on top (same method but with collar texture)
            renderCard(stack, baseModel, matrices, vertexConsumers, light, overlay); // You may want a custom model for this overlay if needed
        }
    }

    private void renderCard(ItemStack stack, BakedModel model, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        // Use the provided renderItem() method for rendering the card item with the base/collar textures
        MinecraftClient.getInstance().getItemRenderer().renderItem(
                stack,
                ModelTransformationMode.GUI,  // You can adjust the mode based on where this is rendered (GUI, ground, etc.)
                false,                        // Not left-handed
                matrices,
                vertexConsumers,
                light,
                overlay,
                model                         // Use the model for the card
        );
    }
}
