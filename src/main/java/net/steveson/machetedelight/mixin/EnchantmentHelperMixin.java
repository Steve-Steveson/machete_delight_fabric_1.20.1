package net.steveson.machetedelight.mixin;

import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.item.ItemStack;
import net.steveson.machetedelight.item.custom.MacheteItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {

    @Inject(method = "getPossibleEntries", at = @At("RETURN"))
    private static void getPossibleEntries(int power, ItemStack stack, boolean treasureAllowed,
                                                   CallbackInfoReturnable<List<EnchantmentLevelEntry>> returnCallback) {


        if (stack.getItem() instanceof MacheteItem) {

        }
    }
}
