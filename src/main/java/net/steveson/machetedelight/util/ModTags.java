package net.steveson.machetedelight.util;

import com.nhoryzon.mc.farmersdelight.FarmersDelightMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.steveson.machetedelight.MacheteDelightMod;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> commonTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));

        }
    }


    public static class Items {
        public static final TagKey<Item> C_TOOLS = commonTag("tools");

        public static final TagKey<Item> C_MACHETE = commonTag("tools/machete");
        public static final TagKey<Item> MY_MACHETE = customTag("tools/machete");

        public static final TagKey<Item> FD_KNIFE = baseModTag("tools/knives");


//        public static final TagKey<Item> STICKS = commonTag("rods/wooden");



        private static TagKey<Item> commonTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));

        }

        private static TagKey<Item> customTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MacheteDelightMod.MOD_ID, name));

        }

        private static TagKey<Item> baseModTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("farmersdelight", name));

        }
    }
}
