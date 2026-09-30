package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.item.ModItems;
import com.shpouf.artisanalfood.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, ArtisanalFood.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ItemTags.CHICKEN_FOOD)
                .add(ModItems.BELL_PEPPER_SEEDS.get())
                .add(ModItems.EGGPLANT_SEEDS.get())
                .add(ModItems.CORN_SEEDS.get())
                .add(ModItems.ZUCCHINI_SEEDS.get());
        tag(ItemTags.VILLAGER_PICKS_UP)
                .add(ModItems.BELL_PEPPER_SEEDS.get())
                .add(ModItems.EGGPLANT_SEEDS.get())
                .add(ModItems.CORN_SEEDS.get())
                .add(ModItems.ZUCCHINI_SEEDS.get());
        tag(ItemTags.VILLAGER_PLANTABLE_SEEDS)
                .add(ModItems.BELL_PEPPER_SEEDS.get())
                .add(ModItems.EGGPLANT_SEEDS.get())
                .add(ModItems.CORN_SEEDS.get())
                .add(ModItems.ZUCCHINI_SEEDS.get());
        tag(ItemTags.PARROT_FOOD)
                .add(ModItems.BELL_PEPPER_SEEDS.get())
                .add(ModItems.EGGPLANT_SEEDS.get())
                .add(ModItems.CORN_SEEDS.get())
                .add(ModItems.ZUCCHINI_SEEDS.get());

        tag(ModTags.Items.VEGETABLES)
                .add(ModItems.CORN.get())
                .add(ModItems.RED_BELL_PEPPER.get())
                .add(ModItems.ZUCCHINI.get())
                .add(ModItems.EGGPLANT.get())

                .add(Items.CARROT)
                .add(Items.BEETROOT)
                .add(Items.BROWN_MUSHROOM)
                .add(Items.RED_MUSHROOM)
                .add(Items.POTATO);
    }
}
