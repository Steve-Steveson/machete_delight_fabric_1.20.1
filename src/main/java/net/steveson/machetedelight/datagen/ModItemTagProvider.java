package net.steveson.machetedelight.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.steveson.machetedelight.item.ModItems;
import net.steveson.machetedelight.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.GOLDEN_MACHETE);


        getOrCreateTagBuilder(ModTags.Items.MY_MACHETE)
                .add(ModItems.GOLDEN_MACHETE)
                .add(ModItems.IRON_MACHETE)
                .add(ModItems.DIAMOND_MACHETE)
                .add(ModItems.NETHERITE_MACHETE);

        getOrCreateTagBuilder(ModTags.Items.C_MACHETE)
                .add(ModItems.GOLDEN_MACHETE)
                .add(ModItems.IRON_MACHETE)
                .add(ModItems.DIAMOND_MACHETE)
                .add(ModItems.NETHERITE_MACHETE);

        getOrCreateTagBuilder(ModTags.Items.C_TOOLS)
                .addTag(ModTags.Items.MY_MACHETE);


        getOrCreateTagBuilder(ModTags.Items.FD_KNIFE)
                .addTag(ModTags.Items.MY_MACHETE);


    }
}
