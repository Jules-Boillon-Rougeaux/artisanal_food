package com.shpouf.artisanalfood.tags;

import com.shpouf.artisanalfood.ArtisanalFood;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
    public static final TagKey<Block> NEEDS_INOX_TOOL = createTag("needs_inox_tool");
    public static final TagKey<Block> INCORRECT_FOR_INOX_TOOL = createTag("incorrect_for_inox_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(ArtisanalFood.MOD_ID, name));
        }
    }

    public static class Items  {
        public static final TagKey<Item> INOX_REPAIRABLE = createTag("inox_repairable");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(ArtisanalFood.MOD_ID, name));
        }
    }
}
