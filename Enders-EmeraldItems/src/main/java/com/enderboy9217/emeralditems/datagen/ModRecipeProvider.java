package com.enderboy9217.emeralditems.datagen;

import com.enderboy9217.emeralditems.item.emeralditems.EmeraldItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

import static com.enderboy9217.emeralditems.datagen.ModCustomRecipeTypes.*;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {

        offerSwordRecipe(consumer, EmeraldItems.EMERALD_SWORD, Items.EMERALD);
        offerPickaxeRecipe(consumer, EmeraldItems.EMERALD_PICKAXE, Items.EMERALD);
        offerAxeRecipe(consumer, EmeraldItems.EMERALD_AXE, Items.EMERALD);
        offerShovelRecipe(consumer, EmeraldItems.EMERALD_SHOVEL, Items.EMERALD);
        offerHoeRecipe(consumer, EmeraldItems.EMERALD_HOE, Items.EMERALD);

        offerHelmetRecipe(consumer, EmeraldItems.EMERALD_HELMET, Items.EMERALD);
        offerChestplateRecipe(consumer, EmeraldItems.EMERALD_CHESTPLATE, Items.EMERALD);
        offerLeggingsRecipe(consumer, EmeraldItems.EMERALD_LEGGINGS, Items.EMERALD);
        offerBootsRecipe(consumer, EmeraldItems.EMERALD_BOOTS, Items.EMERALD);
    }
}
