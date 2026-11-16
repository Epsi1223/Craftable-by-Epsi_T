package net.epsi_t.craftable.datagen;

import net.epsi_t.craftable.recipe.CraftableModRecipeProvider;
import net.epsi_t.craftable.tags.ItemTagsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CraftableDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(CraftableModRecipeProvider::new);
		pack.addProvider(ItemTagsProvider::new);
	}
}
