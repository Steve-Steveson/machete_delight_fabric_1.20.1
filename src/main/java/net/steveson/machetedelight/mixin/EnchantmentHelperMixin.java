package net.steveson.machetedelight.mixin;

import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import com.nhoryzon.mc.farmersdelight.registry.EnchantmentsRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.item.ItemStack;
import net.steveson.machetedelight.item.custom.MacheteItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(value = EnchantmentHelper.class, priority = 1050)
public class EnchantmentHelperMixin {

//    @Inject(method = "getPossibleEntries", at = @At("RETURN"))
//    private static void getPossibleEntries(int power, ItemStack stack, boolean treasureAllowed,
//                                                   CallbackInfoReturnable<List<EnchantmentLevelEntry>> returnCallback) {
//        List<EnchantmentLevelEntry> possibleEnchantmentList = returnCallback.getReturnValue();
//
//        if (stack.getItem() instanceof MacheteItem) {
//            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
//
//            if (!containsEnchantment(possibleEnchantmentList, EnchantmentsRegistry.BACKSTABBING.get())) {
////                possibleEnchantmentList.add(enchantmentLevelEntry -> enchantmentLevelEntry.enchantment == EnchantmentsRegistry.BACKSTABBING.get());
//                possibleEnchantmentList.add(new  EnchantmentLevelEntry (EnchantmentsRegistry.BACKSTABBING.get(), power));
//            }
//        }
//    }
//
//    @Unique
//    private static void addEntry(List<EnchantmentLevelEntry> entries, int power, Enchantment enchantment) {
//        for (int level = enchantment.getMaxLevel(); level >= enchantment.getMinLevel(); level--) {
//            if (enchantment.getMinPower(level) <= power && power <= enchantment.getMaxPower(level)) {
//                entries.add(new EnchantmentLevelEntry(enchantment, level));
//                break;
//            }
//        }
//    }
//
//    @Unique
//    private static boolean containsEnchantment(List<EnchantmentLevelEntry> entries, Enchantment enchantment) {
//        return entries.stream().anyMatch(enchantmentLevelEntry -> enchantmentLevelEntry.enchantment == enchantment);
//    }
}
