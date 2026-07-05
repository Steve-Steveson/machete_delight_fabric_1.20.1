package net.steveson.machetedelight.compat;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.steveson.machetedelight.MacheteDelightMod;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class MixinConfigPluginRefabricated implements IMixinConfigPlugin {
    @Override
    public void onLoad(String s) {

    }

    @Override
    public String getRefMapperConfig() {
        return "";
    }

    @Override
    public boolean shouldApplyMixin(String s, String s1) {
        MacheteDelightMod.LOGGER.info("Should I apply refab mixins for " + MacheteDelightMod.MOD_ID + "?");

        Optional<ModContainer> mod = FabricLoader.getInstance().getModContainer("farmersdelight");
        if (mod.isPresent()) {
            MacheteDelightMod.LOGGER.info(MacheteDelightMod.MOD_ID + " FOUND a farmersdelight");

            boolean pathPresent = mod.get().findPath("vectorwing/farmersdelight/common/item/enchantment/BackstabbingEnchantment.class").isPresent();
            if (pathPresent) {
                MacheteDelightMod.LOGGER.info("YES");
                return true;
            }
        }

//        ClassLoader cl = FabricLoader.class.getClassLoader();
//
//        if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
//            MacheteDelightMod.LOGGER.info(MacheteDelightMod.MOD_ID + " FOUND a farmersdelight");
//        }
        else {
            MacheteDelightMod.LOGGER.info(MacheteDelightMod.MOD_ID + "could NOT find farmersdelight");
        }

//        boolean present =
//                cl.getResource(
//                        "vectorwing/farmersdelight/common/item/enchantment/BackstabbingEnchantment.class"
//                ) != null;
//        if (present) {
//            MacheteDelightMod.LOGGER.info("YES");
//            return true;
//        }
        MacheteDelightMod.LOGGER.info("NO");
        return false;
    }

    @Override
    public void acceptTargets(Set<String> set, Set<String> set1) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }

    @Override
    public void postApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }
}
