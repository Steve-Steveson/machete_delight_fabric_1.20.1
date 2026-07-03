package net.steveson.machetedelight;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.steveson.machetedelight.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixins;

public class MacheteDelightMod implements ModInitializer {
	public static final String MOD_ID = "machete_delight";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

//		if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
//			System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
//			try {
//				Class.forName("com.nhoryzon.mc.farmersdelight.enchantment.BackstabbingEnchantment");
//
//				LOGGER.info("old Farmer's Delight port found");
//
//				Mixins.addConfiguration("machete_delight_old_fd.mixins.json");
//			}
//			catch (ClassNotFoundException e) {
//				LOGGER.info("old Farmer's Delight port not installed");
//			}
//
//
//
//		}

	}
}