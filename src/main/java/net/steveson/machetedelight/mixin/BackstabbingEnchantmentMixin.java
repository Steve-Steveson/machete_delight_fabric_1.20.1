package net.steveson.machetedelight.mixin;

import com.nhoryzon.mc.farmersdelight.enchantment.BackstabbingEnchantment;
import net.minecraft.item.ItemStack;
import net.steveson.machetedelight.item.custom.MacheteItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BackstabbingEnchantment.class)
public class BackstabbingEnchantmentMixin {
    @Inject(method = "isAcceptableItem", at = @At("HEAD"), cancellable = true)
    private void isAccept1ableItem(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.getItem() instanceof MacheteItem) {
            cir.setReturnValue(true);
        }
    }
}
