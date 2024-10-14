package net.hanas_cards.component;

import com.mojang.serialization.Codec;
import net.minecraft.component.ComponentType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class CardComponentType implements ComponentType<CardComponent> {
    private final Identifier id;
    private final Codec<CardComponent> codec;

    public CardComponentType(Identifier id, Codec<CardComponent> codec) {
        this.id = id;
        this.codec = codec;
    }

    @Override
    public Codec<CardComponent> getCodec() {
        return codec;
    }

    @Override
    public Codec<CardComponent> getCodecOrThrow() {
        return getCodec();
    }

    @Override
    public boolean shouldSkipSerialization() {
        return false;
    }

    @Override
    public PacketCodec<PacketByteBuf, CardComponent> getPacketCodec() {
        return new PacketCodec<>() {
            @Override
            public void encode(PacketByteBuf buf, CardComponent cardComponent) {

                buf.writeInt(cardComponent.getGrading());

                buf.writeString(cardComponent.getDescription());

                buf.writeVarInt(cardComponent.getTags().length);
                for (String tag : cardComponent.getTags()) {
                    buf.writeString(tag);
                }
            }

            @Override
            public CardComponent decode(PacketByteBuf buf) {
                int gradingValue = buf.readInt();

                String description = buf.readString(32767);

                int tagsCount = buf.readVarInt();
                String[] tags = new String[tagsCount];
                for (int i = 0; i < tagsCount; i++) {
                    tags[i] = buf.readString(32767);
                }

                return new CardComponent(gradingValue, description, tags);
            }
        };
    }

    public Function<ItemStack, CardComponent> getDefaultFactory() {
        return stack -> CardComponent.DEFAULT;
    }

    public Identifier getId() {
        return id;
    }
}