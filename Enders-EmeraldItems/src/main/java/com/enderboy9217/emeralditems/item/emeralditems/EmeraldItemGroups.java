package com.enderboy9217.emeralditems.item.emeralditems;

import com.enderboy9217.emeralditems.EndersEmeraldItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class EmeraldItemGroups {

    public static final ItemGroup emeraldItems = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EndersEmeraldItems.MOD_ID, "emeralditems"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.emeralditems"))
                    .icon(() -> new ItemStack(EmeraldItems.EMERALD_AXE)).entries((displayContext, entries) -> {
                        entries.add(EmeraldItems.EMERALD_SWORD);
                        entries.add(EmeraldItems.EMERALD_PICKAXE);
                        entries.add(EmeraldItems.EMERALD_AXE);
                        entries.add(EmeraldItems.EMERALD_SHOVEL);
                        entries.add(EmeraldItems.EMERALD_HOE);
                        entries.add(EmeraldItems.EMERALD_HELMET);
                        entries.add(EmeraldItems.EMERALD_CHESTPLATE);
                        entries.add(EmeraldItems.EMERALD_LEGGINGS);
                        entries.add(EmeraldItems.EMERALD_BOOTS);
                        entries.add(EmeraldItems.EMERALD_HORSE_ARMOR);
                    }).build());

    public static void registerItemGroups() {
        EndersEmeraldItems.LOGGER.info("Registering Item Groups for " + EndersEmeraldItems.MOD_ID);
    }
}
