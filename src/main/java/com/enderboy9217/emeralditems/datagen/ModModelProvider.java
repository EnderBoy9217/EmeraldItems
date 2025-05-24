package com.enderboy9217.emeralditems.datagen;

import com.enderboy9217.emeralditems.item.emeralditems.EmeraldItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

import java.util.List;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    private static final List<Item> handheldItems = List.of(
        EmeraldItems.EMERALD_SWORD,
        EmeraldItems.EMERALD_PICKAXE,
        EmeraldItems.EMERALD_AXE,
        EmeraldItems.EMERALD_SHOVEL,
        EmeraldItems.EMERALD_HOE
    );

    private static final List<Item> armorItems = List.of(
        EmeraldItems.EMERALD_HELMET,
        EmeraldItems.EMERALD_CHESTPLATE,
        EmeraldItems.EMERALD_LEGGINGS,
        EmeraldItems.EMERALD_BOOTS
    );

    private static final List<Item> standardItems = List.of(
        EmeraldItems.EMERALD_HORSE_ARMOR
    );

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Item item : standardItems) {
            itemModelGenerator.register(item, Models.GENERATED);
        }

        for (Item item : handheldItems) {
            itemModelGenerator.register(item, Models.HANDHELD);
        }

        for (Item item : armorItems) {
            itemModelGenerator.registerArmor((ArmorItem) item);
        }

    }
}
