package net.steveson.machetedelight.mixin;

import com.nhoryzon.mc.farmersdelight.registry.EnchantmentsRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.steveson.machetedelight.item.custom.MacheteItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class EnchantmentMixin {

    @Inject(method = "isAcceptableItem", at = @At("RETURN"), cancellable = true)
    private void isAcceptableItem(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (stack.getItem() instanceof MacheteItem) {
            System.out.println("I am enchanting a machete!");
            if ((Object)this == EnchantmentsRegistry.BACKSTABBING.get()) {
                cir.setReturnValue(true);
            }
        }
    }
}
