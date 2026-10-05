package com.shpouf.artisanalfood.datagen;

import com.shpouf.artisanalfood.ArtisanalFood;
import com.shpouf.artisanalfood.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;
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
        tag(Tags.Items.SEEDS)
                .add(ModItems.BELL_PEPPER_SEEDS.get())
                .add(ModItems.EGGPLANT_SEEDS.get())
                .add(ModItems.CORN_SEEDS.get())
                .add(ModItems.ZUCCHINI_SEEDS.get());
        tag(Tags.Items.CROPS)
                .add(ModItems.RED_BELL_PEPPER.get())
                .add(ModItems.EGGPLANT.get())
                .add(ModItems.CORN.get())
                .add(ModItems.ZUCCHINI.get());


        tag(Tags.Items.FOODS_VEGETABLE)
                .add(ModItems.CORN.get())
                .add(ModItems.RED_BELL_PEPPER.get())
                .add(ModItems.ZUCCHINI.get())
                .add(ModItems.EGGPLANT.get())
                .add(Items.BROWN_MUSHROOM)
                .add(Items.RED_MUSHROOM);

        tag(Tags.Items.FOODS)
                .add(ModItems.CREME_BRULEE.get())
                .add(ModItems.GRILLED_CORN.get())
                .add(ModItems.BOWL_OF_RATATOUILLE.get())
                .add(ModItems.VEGETABLE_SOUP.get());
    }
}
