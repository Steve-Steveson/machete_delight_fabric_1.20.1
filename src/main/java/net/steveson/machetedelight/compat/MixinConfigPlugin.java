package net.steveson.machetedelight.compat;

import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class MixinConfigPlugin implements IMixinConfigPlugin {
    @Override
    public void onLoad(String s) {

    }

    @Override
    public String getRefMapperConfig() {
        return "";
    }

    @Override
    public boolean shouldApplyMixin(String s, String s1) {
        ClassLoader cl = FabricLoader.class.getClassLoader();

        boolean present =
                cl.getResource(
                        "com/nhoryzon/mc/farmersdelight/enchantment/BackstabbingEnchantment.class"
                ) != null;
        if (present) {
            return true;
        }

//        System.out.println("QQQQQQQQ");
//        if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
//            System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
//            try {
//                Class.forName("com.nhoryzon.mc.farmersdelight.enchantment.BackstabbingEnchantment");
//
//                return true;
//            }
//            catch (ClassNotFoundException e) {
//                return false;
//            }
//        }
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
