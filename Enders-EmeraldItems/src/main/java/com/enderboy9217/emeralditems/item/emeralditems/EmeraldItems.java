package com.enderboy9217.emeralditems.item.emeralditems;

import com.enderboy9217.emeralditems.EndersEmeraldItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EmeraldItems {

    // Tools and Weapons
    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            new SwordItem(EmeraldToolMaterials.EMERALD, 4, -2.9f, new FabricItemSettings()));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
        new PickaxeItem(EmeraldToolMaterials.EMERALD, 2, -3.1f, new FabricItemSettings()));
    public static final Item EMERALD_AXE = registerItem("emerald_axe",
        new AxeItem(EmeraldToolMaterials.EMERALD, 7.0F, -3.3f, new FabricItemSettings()));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",
        new ShovelItem(EmeraldToolMaterials.EMERALD, 2, -3.2f, new FabricItemSettings()));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
        new HoeItem(EmeraldToolMaterials.EMERALD, -1, -2.0f, new FabricItemSettings()));

    // Armor
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
        new ArmorItem(EmeraldArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
        new ArmorItem(EmeraldArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
        new ArmorItem(EmeraldArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
        new ArmorItem(EmeraldArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    // Horse Armor
    public static final Item EMERALD_HORSE_ARMOR = registerItem("emerald_horse_armor",
        new HorseArmorItem(7, "emerald", new FabricItemSettings()));

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(EMERALD_SWORD);
        entries.add(EMERALD_AXE);
        entries.add(EMERALD_HELMET);
        entries.add(EMERALD_CHESTPLATE);
        entries.add(EMERALD_LEGGINGS);
        entries.add(EMERALD_BOOTS);
        entries.add(EMERALD_HORSE_ARMOR);
    }

    public static void addItemsToToolsItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(EMERALD_AXE);
        entries.add(EMERALD_PICKAXE);
        entries.add(EMERALD_SHOVEL);
        entries.add(EMERALD_HOE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EndersEmeraldItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EndersEmeraldItems.LOGGER.info("Registering Emerald Items for " + EndersEmeraldItems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(EmeraldItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(EmeraldItems::addItemsToToolsItemGroup);
    }

}
