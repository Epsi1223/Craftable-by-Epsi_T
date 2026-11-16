package net.epsi_t.craftable.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.epsi_t.craftable.Craftable;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CraftableConfig {
    //Recipe groups:
    public boolean chainmailRecipes = true;
    public boolean foodRecipes = true;
    public boolean decorativeBlocksRecipes = true;
    public boolean coralBlocksRecipes = true;
    public boolean froglightsRecipes = true;
    public boolean musicDiscsRecipes = true;
    public boolean mobHeadsRecipes = true;
    public boolean sherdRecipes = true;
    public boolean horseArmorRecipes = true;
    public boolean copperOxidationRecipes = true;
    public boolean shroomBlocksRecipes = true;
    public boolean smallDecorativeBlocksRecipes = true;
    public boolean tulipsRecipes = true;
    public boolean infestedBlocksRecipes = false;
    public boolean rawBlocksSmeltingRecipes = true;
    public boolean otherSmeltableRecipes = true;
    public boolean nautilusArmorRecipes = true;
    public boolean sculkRelatedBlocksRecipes = true;
    public boolean quickCraftingRecipes = true;

    //Single recipes:
    public boolean enchantedGoldenAppleRecipe = true;
    public boolean gunpowderRecipe = true;
    public boolean shulkerShellRecipe = true;
    public boolean echoShardRecipe = true;
    public boolean dragonBreathRecipe = true;
    public boolean heartOfTheSeaRecipe = true;
    public boolean glowInkSacRecipe = true;
    public boolean glowstoneDustRecipe = true;
    public boolean stringRecipe = true;
    public boolean cobwebRecipe = true;
    public boolean reinforcedDeepslateRecipe = true;
    public boolean tridentRecipe = true;
    public boolean totemOfUndyingRecipe = true;
    public boolean elytraRecipe = true;
    public boolean buddingAmethystRecipe = true;
    public boolean experienceBottleRecipe = true;
    public boolean rottenFleshToLeatherSmeltingRecipe = true;
    public boolean slimeBallToMagmaCreamRecipe = true;
    public boolean magmaCreamToSlimeBallRecipe = true;
    public boolean mossBlockRecipe = true;

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = FabricLoader.getInstance()
            .getConfigDir().resolve("craftable-by-epsi_t.json");

    private static CraftableConfig instance = new CraftableConfig();

    public static CraftableConfig get() {
        return instance;
    }

    public static void load() {
        if (Files.exists(PATH)) {
            try {
                CraftableConfig loaded = GSON.fromJson(Files.readString(PATH), CraftableConfig.class);
                if (loaded != null) instance = loaded;
            } catch (Exception e) {
                Craftable.LOGGER.error("Failed to read config, using defaults", e);
                return;
            }
        }
        save();
    }

    public static void save() {
        try {
            Files.createDirectories(PATH.getParent());
            Files.writeString(PATH, GSON.toJson(instance));
        } catch (IOException e) {
            Craftable.LOGGER.error("Failed to save config", e);
        }
    }
}