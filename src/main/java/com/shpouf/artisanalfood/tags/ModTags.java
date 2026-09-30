package com.shpouf.artisanalfood.tags;

import com.shpouf.artisanalfood.ArtisanalFood;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items  {
        public static final TagKey<Item> VEGETABLES = createTag("vegetables");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(ArtisanalFood.MOD_ID, name));
        }
    }
}
