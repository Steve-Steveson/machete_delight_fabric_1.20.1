package net.steveson.machetedelight.item.custom;

import com.nhoryzon.mc.farmersdelight.registry.EnchantmentsRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import java.util.Set;

public class MacheteItem extends SwordItem {
    public MacheteItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public static final Set<Enchantment> ALLOWED_ENCHANTMENTS = Set.of(Enchantments.SHARPNESS, Enchantments.SMITE,
            Enchantments.BANE_OF_ARTHROPODS, Enchantments.KNOCKBACK, Enchantments.FIRE_ASPECT, Enchantments.LOOTING,
            Enchantments.MENDING, Enchantments.SWEEPING, EnchantmentsRegistry.BACKSTABBING.get());



}
