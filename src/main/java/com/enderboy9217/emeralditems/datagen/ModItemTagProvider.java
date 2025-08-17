package com.enderboy9217.emeralditems.datagen;

import com.enderboy9217.emeralditems.item.emeralditems.EmeraldItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
            .add(EmeraldItems.EMERALD_HELMET,
                    EmeraldItems.EMERALD_CHESTPLATE,
                    EmeraldItems.EMERALD_LEGGINGS,
                    EmeraldItems.EMERALD_BOOTS);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(EmeraldItems.EMERALD_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(EmeraldItems.EMERALD_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(EmeraldItems.EMERALD_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(EmeraldItems.EMERALD_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(EmeraldItems.EMERALD_HOE);
    }
}
