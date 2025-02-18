package net.hanas_cards.item.Custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class CardBoxItem extends Item {

    private final Map<Item, Integer> packsToGive;

    public CardBoxItem(Settings settings, Map<Item, Integer> packsToGive) {
        super(settings);
        this.packsToGive = packsToGive;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (world.isClient) {
            return TypedActionResult.success(player.getStackInHand(hand));
        }

        ItemStack stack = player.getStackInHand(hand);
        world.playSound(null, player.getX(), player.getY(), player.getZ(),
                SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.PLAYERS, 1.0F, 1.0F);
        player.sendMessage(Text.literal("You opened a card box!").formatted(Formatting.BOLD), true);

        for (Map.Entry<Item, Integer> entry : packsToGive.entrySet()) {
            Item packItem = entry.getKey();
            int count = entry.getValue();
            ItemStack packStack = new ItemStack(packItem, count);

            if (!player.getInventory().insertStack(packStack)) {
                player.dropItem(packStack, false);
            }
        }

        if (!player.isCreative()) {
            stack.decrement(1);
        }

        return TypedActionResult.success(stack);
    }
}