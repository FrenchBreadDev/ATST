package net.frenchbread.atst;

import net.fabricmc.api.ModInitializer;
import net.frenchbread.atst.block.ModBlocks;
import net.frenchbread.atst.enchantment.ModEnchantments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ATSTMod implements ModInitializer {
	public static final String MOD_ID = "atst";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		//ModConfiguredFeatures.registerConfiguredFeatures();

		//ModLootTableModifiers.modifyLootTables();

		//ModPaintings.registerPaintings();

		//ModBlocks.registerModBlocks();

		ModEnchantments.registerModEnchantments();

	}
}
