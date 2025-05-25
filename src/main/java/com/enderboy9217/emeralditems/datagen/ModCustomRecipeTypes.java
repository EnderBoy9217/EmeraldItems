package com.enderboy9217.emeralditems.datagen;

import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

import static com.enderboy9217.emeralditems.EndersEmeraldItems.MOD_ID;
import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class ModCustomRecipeTypes {
    public static void offerSwordRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .input('#', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, new Identifier(MOD_ID, "recipes/combat/" + getRecipeName(output)));
    }
    public static void offerPickaxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, new Identifier(MOD_ID, "recipes/combat/" + getRecipeName(output)));
    }
    public static void offerAxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("##")
                .pattern("#S")
                .pattern(" S")
                .input('#', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, new Identifier(MOD_ID, "recipes/combat/" + getRecipeName(output)));
    }
    public static void offerShovelRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .input('#', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, new Identifier(MOD_ID, "recipes/combat/" + getRecipeName(output)));
    }
    public static void offerHoeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("##")
                .pattern(" S")
                .pattern(" S")
                .input('#', material)
                .input('S', Items.STICK)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, new Identifier(MOD_ID, "recipes/combat/" + getRecipeName(output)));
    }
    public static void offerHelmetRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("###")
                .pattern("# #")
                .input('#', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, new Identifier(MOD_ID, "recipes/combat/" + getRecipeName(output)));
    }
    public static void offerChestplateRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, new Identifier(MOD_ID, "recipes/combat/" + getRecipeName(output)));
    }
    public static void offerLeggingsRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, new Identifier(MOD_ID, "recipes/combat/" + getRecipeName(output)));
    }
    public static void offerBootsRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible material) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("# #")
                .pattern("# #")
                .input('#', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, new Identifier(MOD_ID, "recipes/combat/" + getRecipeName(output)));
    }
}
