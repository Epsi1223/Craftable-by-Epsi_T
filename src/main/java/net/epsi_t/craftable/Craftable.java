package net.epsi_t.craftable;

import net.epsi_t.craftable.conditions.ModResourceConditions;
import net.epsi_t.craftable.config.CraftableConfig;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Craftable implements ModInitializer {
	public static final String MOD_ID = "craftable";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CraftableConfig.load();
		ModResourceConditions.register();
	}
}