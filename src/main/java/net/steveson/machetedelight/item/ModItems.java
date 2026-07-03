package net.steveson.machetedelight.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.steveson.machetedelight.MacheteDelightMod;
import net.steveson.machetedelight.item.custom.MacheteItem;

public class ModItems {
    public static final Item GOLDEN_MACHETE = registerItem("golden_machete",
            new MacheteItem(ToolMaterials.GOLD, 2, -2.6f, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MacheteDelightMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MacheteDelightMod.LOGGER.info("Registering Mod Items for " + MacheteDelightMod.MOD_ID);
    }
}
