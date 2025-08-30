package com.enderboy9217.emeralditems.util;

import com.enderboy9217.emeralditems.item.emeralditems.EmeraldItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantWithLevelsLootFunction;
import net.minecraft.loot.function.SetDamageLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableModifiers {

    public static void modifyLootTables() {

        // Emerald Horse Armor
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            float emerald_horse_armor_chance = switch (id.toString()) {
                case "minecraft:chests/simple_dungeon" -> 0.147f;
                case "minecraft:chests/desert_pyramid" -> 0.123f;
                case "minecraft:chests/end_city_treasure" -> 0.046f;
                case "minecraft:chests/jungle_temple" -> 0.045f;
                //case "minecraft:chests/nether_bridge" -> 0.291f;
                //case "minecraft:chests/ruined_portal" -> 0.073f;
                case "minecraft:chests/stronghold_corridor" -> 0.025f;
                case "minecraft:chests/village/village_weaponsmith" -> 0.057f;
                default -> 0.0f;
            };

            LootPool.Builder poolBuilder = LootPool.builder();

            if (emerald_horse_armor_chance > 0.0f) {
                poolBuilder.conditionally(RandomChanceLootCondition.builder(emerald_horse_armor_chance))
                        .with(ItemEntry.builder(EmeraldItems.EMERALD_HORSE_ARMOR));
            }

            tableBuilder.pool(poolBuilder.build());
        });

        // Emerald Helmet
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            float helmet_chance = switch (id.toString()) {
                case "minecraft:chests/stronghold_corridor" -> 0.12f;
                //case "minecraft:chests/village/village_armorer" -> 0.159f; // Iron is 0.318f
                //case "minecraft:chests/village/village_weaponsmith" -> 0.128f; // Iron is 0.256f
                case "minecraft:chests/underwater_ruins_small" -> 0.083f;
                case "minecraft:chests/underwater_ruins_big" -> 0.043f;
                default -> 0.0f;
            };
            boolean enchanted = false;

            if ( id.toString().equals("minecraft:chests/end_city_treasure") ) { // End City Enchanted Helmet Chance
                helmet_chance = 0.133f;
                enchanted = true;
            }

            if (helmet_chance > 0.0f) {
                LootPool.Builder poolBuilder = LootPool.builder();

                if (!enchanted) {
                // Add the conditional loot entry for the helmet
                poolBuilder
                    .with(ItemEntry.builder(EmeraldItems.EMERALD_HELMET)
                        .conditionally(RandomChanceLootCondition.builder(helmet_chance))
                    );
                } else {
                    // Add enchantment with levels entry
                    poolBuilder
                        .with(ItemEntry.builder(EmeraldItems.EMERALD_HELMET)
                            .conditionally(RandomChanceLootCondition.builder(helmet_chance))
                            .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20, 39))
                                .allowTreasureEnchantments()
                            )
                        );
                }
                tableBuilder.pool(poolBuilder.build());
            }

        });

        // Emerald Chestplate
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            float chestplate_chance = switch (id.toString()) {
                case "minecraft:chests/stronghold_corridor" -> 0.12f;
                //case "minecraft:chests/village/village_weaponsmith" -> 0.128f; // Iron is 0.256f
                default -> 0.0f;
            };
            boolean enchanted = false;

            if ( id.toString().equals("minecraft:chests/end_city_treasure") ) { // End City Enchanted Chestplate Chance
                chestplate_chance = 0.133f;
                enchanted = true;
            }

            if (chestplate_chance > 0.0f) {
                LootPool.Builder poolBuilder = LootPool.builder();

                if (!enchanted) {
                    poolBuilder
                            .with(ItemEntry.builder(EmeraldItems.EMERALD_CHESTPLATE)
                                    .conditionally(RandomChanceLootCondition.builder(chestplate_chance))
                            );
                } else {
                    // Add enchantment with levels entry
                    poolBuilder
                            .with(ItemEntry.builder(EmeraldItems.EMERALD_CHESTPLATE)
                                    .conditionally(RandomChanceLootCondition.builder(chestplate_chance))
                                    .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20, 39))
                                            .allowTreasureEnchantments()
                                    )
                            );
                }
                tableBuilder.pool(poolBuilder.build());
            }

        });

        // Emerald Leggings
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            float leggings_chance = switch (id.toString()) {
                case "minecraft:chests/stronghold_corridor" -> 0.12f;
                //case "minecraft:chests/village/village_weaponsmith" -> 0.128f; // Iron is 0.256f
                case "minecraft:chests/underwater_ruins_small" -> 0.083f;
                case "minecraft:chests/underwater_ruins_big" -> 0.043f;
                default -> 0.0f;
            };
            boolean enchanted = false;

            if ( id.toString().equals("minecraft:chests/end_city_treasure") ) { // End City Enchanted Leggings Chance
                leggings_chance = 0.133f;
                enchanted = true;
            }
            if ( id.toString().equals("minecraft:chests/ancient_city") ) { // Ancient City Enchanted Leggings Chance
                leggings_chance = 0.256f;
                enchanted = true;
            }

            if (leggings_chance > 0.0f) {
                LootPool.Builder poolBuilder = LootPool.builder();

                if (!enchanted) {
                    // Add the conditional loot entry for the helmet
                    poolBuilder
                            .with(ItemEntry.builder(EmeraldItems.EMERALD_LEGGINGS)
                                    .conditionally(RandomChanceLootCondition.builder(leggings_chance))
                            );
                } else {
                    // Add enchantment with levels entry
                    poolBuilder
                            .with(ItemEntry.builder(EmeraldItems.EMERALD_LEGGINGS)
                                    .conditionally(RandomChanceLootCondition.builder(leggings_chance))
                                    .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20, 39))
                                            .allowTreasureEnchantments()
                                    )
                            );
                }
                tableBuilder.pool(poolBuilder.build());
            }

        });

        // Emerald Boots
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            float boots_chance = switch (id.toString()) {
                case "minecraft:chests/stronghold_corridor" -> 0.12f;
                //case "minecraft:chests/village/village_weaponsmith" -> 0.128f; // Iron is 0.256f
                default -> 0.0f;
            };
            boolean enchanted = false;

            if ( id.toString().equals("minecraft:chests/end_city_treasure") ) { // End City Enchanted Boots Chance
                boots_chance = 0.133f;
                enchanted = true;
            }

            if (boots_chance > 0.0f) {
                LootPool.Builder poolBuilder = LootPool.builder();

                if (!enchanted) {
                    // Add the conditional loot entry for the helmet
                    poolBuilder
                            .with(ItemEntry.builder(EmeraldItems.EMERALD_BOOTS)
                                    .conditionally(RandomChanceLootCondition.builder(boots_chance))
                            );
                } else {
                    // Add enchantment with levels entry
                    poolBuilder
                            .with(ItemEntry.builder(EmeraldItems.EMERALD_BOOTS)
                                    .conditionally(RandomChanceLootCondition.builder(boots_chance))
                                    .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20, 39))
                                            .allowTreasureEnchantments()
                                    )
                            );
                }
                tableBuilder.pool(poolBuilder.build());
            }

        });

        // Emerald Sword
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            float sword_chance = switch (id.toString()) {
                case "minecraft:chests/buried_treasure" -> 0.25f;
                case "minecraft:chests/stronghold_corridor" -> 0.12f;
                //case "minecraft:chests/village/village_weaponsmith" -> 0.128f; // Iron is 0.256f
                case "minecraft:chests/underwater_ruins_small" -> 0.083f;
                case "minecraft:chests/underwater_ruins_big" -> 0.043f;
                default -> 0.0f;
            };
            boolean enchanted = false;
            boolean damaged = false;

            if ( id.toString().equals("minecraft:chests/end_city_treasure") ) { // End City Enchanted Sword Chance
                sword_chance = 0.133f;
                enchanted = true;
            }
            if ( id.toString().equals("minecraft:chests/bastion_other") ) { // Bastion Enchanted+Damaged Sword Chance
                sword_chance = 0.133f;
                enchanted = true;
                damaged = true; // 10% - 90%
            }

            if (sword_chance > 0.0f) {
                LootPool.Builder poolBuilder = LootPool.builder();

                if (!enchanted) {
                    // Add the conditional loot entry for the helmet
                    poolBuilder
                            .with(ItemEntry.builder(EmeraldItems.EMERALD_SWORD)
                                    .conditionally(RandomChanceLootCondition.builder(sword_chance))
                            );
                } else if (!damaged){
                    // Add enchantment with levels entry
                    poolBuilder
                            .with(ItemEntry.builder(EmeraldItems.EMERALD_SWORD)
                                    .conditionally(RandomChanceLootCondition.builder(sword_chance))
                                    .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20, 39))
                                            .allowTreasureEnchantments()
                                    )
                            );
                } else {
                    poolBuilder.with(ItemEntry.builder(EmeraldItems.EMERALD_SWORD)
                            .conditionally(RandomChanceLootCondition.builder(sword_chance))
                            .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20, 39))
                                    .allowTreasureEnchantments()
                            )
                            .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.1f, 0.9f)))
                    );
                }
                tableBuilder.pool(poolBuilder.build());
            }

        });

        // Emerald Axe should have no chest drops other than trial chambers (not in 1.20.1)

        // Emerald Shovel
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            // This is done on startup so optimization isn't fully necessary, leaving for later updates/ports
            float shovel_chance = switch (id.toString()) {
                //case "minecraft:chests/village/village_toolsmith" -> 0.206f; // Iron is 0.412f
                default -> 0.0f;
            };
            boolean enchanted = false;
            boolean damaged = false;

            if ( id.toString().equals("minecraft:chests/end_city_treasure") ) { // End City Enchanted Sword Chance
                shovel_chance = 0.133f;
                enchanted = true;
            }

            if (shovel_chance > 0.0f) {
                LootPool.Builder poolBuilder = LootPool.builder();

                if (!enchanted) { // Enchanted is always true because there are no un-enchanted drops
                    poolBuilder
                            .with(ItemEntry.builder(EmeraldItems.EMERALD_SHOVEL)
                                    .conditionally(RandomChanceLootCondition.builder(shovel_chance))
                            );
                } else {
                    poolBuilder.with(ItemEntry.builder(EmeraldItems.EMERALD_SHOVEL)
                            .conditionally(RandomChanceLootCondition.builder(shovel_chance))
                            .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(20, 39))
                                    .allowTreasureEnchantments()
                            )
                            .apply(SetDamageLootFunction.builder(UniformLootNumberProvider.create(0.1f, 0.9f)))
                    );
                }
                tableBuilder.pool(poolBuilder.build());
            }

        });

        // Emerald Hoe should not have any chest drops
    }
}
