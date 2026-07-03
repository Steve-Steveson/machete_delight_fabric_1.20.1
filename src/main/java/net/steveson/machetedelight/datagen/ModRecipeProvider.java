package net.steveson.machetedelight.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.steveson.machetedelight.MacheteDelightMod;
import net.steveson.machetedelight.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        registerMacheteCraftingRecipe(ModItems.GOLDEN_MACHETE, Items.GOLD_INGOT, exporter);
        registerMacheteCraftingRecipe(ModItems.IRON_MACHETE, Items.IRON_INGOT, exporter);
        registerMacheteCraftingRecipe(ModItems.DIAMOND_MACHETE, Items.DIAMOND, exporter);


    }

    public static  void registerMacheteCraftingRecipe (ItemConvertible output, ItemConvertible input, Consumer<RecipeJsonProvider> exporter) {
        createMacheteCraftingRecipe(output, Ingredient.ofItems(input))
                .criterion(hasItem(output), conditionsFromItem(output))
                .offerTo(exporter, new Identifier(MacheteDelightMod.MOD_ID, getRecipeName(output)));
    }

    public static CraftingRecipeJsonBuilder createMacheteCraftingRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .input('#', input)
                .input('S', Items.STICK)
                .pattern("  #")
                .pattern(" # ")
                .pattern("S  ");
    }

}
