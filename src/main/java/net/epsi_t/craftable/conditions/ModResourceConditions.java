package net.epsi_t.craftable.conditions;

import com.mojang.serialization.MapCodec;
import net.epsi_t.craftable.Craftable;
import net.epsi_t.craftable.conditions.groups.*;
import net.epsi_t.craftable.conditions.singles.*;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.resources.Identifier;

public class ModResourceConditions {
    private static <T extends ResourceCondition> ResourceConditionType<T> createResourceConditionType(String name, MapCodec<T> codec) {
        return ResourceConditionType.create(Identifier.fromNamespaceAndPath(Craftable.MOD_ID, name), codec);
    }

    //Recipe groups:
    public static final ResourceConditionType<ChainmailArmorRecipesCondition> CHAINMAIL_RECIPES =
            createResourceConditionType("chainmail_recipes", ChainmailArmorRecipesCondition.CODEC);
    public static final ResourceConditionType<FoodRecipesCondition> FOOD_RECIPES =
            createResourceConditionType("food_recipes", FoodRecipesCondition.CODEC);
    public static final ResourceConditionType<DecorativeBlocksRecipesCondition> DECORATIVE_BLOCKS_RECIPES =
            createResourceConditionType("decorative_blocks_recipes", DecorativeBlocksRecipesCondition.CODEC);
     public static final ResourceConditionType<CoralBlocksRecipesCondition> CORAL_BLOCKS_RECIPES =
            createResourceConditionType("coral_blocks_recipes", CoralBlocksRecipesCondition.CODEC);
    public static final ResourceConditionType<FroglightsRecipesCondition> FROGLIGHTS_RECIPES =
            createResourceConditionType("froglights_recipes", FroglightsRecipesCondition.CODEC);
     public static final ResourceConditionType<MusicDiscsRecipesCondition> MUSIC_DISCS_RECIPES =
            createResourceConditionType("music_discs_recipes", MusicDiscsRecipesCondition.CODEC);
     public static final ResourceConditionType<MobHeadsRecipesCondition> MOB_HEADS_RECIPES =
            createResourceConditionType("mob_heads_recipes", MobHeadsRecipesCondition.CODEC);
     public static final ResourceConditionType<SherdRecipesCondition> SHERD_RECIPES =
            createResourceConditionType("sherd_recipes", SherdRecipesCondition.CODEC);
     public static final ResourceConditionType<HorseArmorRecipesCondition> HORSE_ARMOR_RECIPES =
            createResourceConditionType("horse_armor_recipes", HorseArmorRecipesCondition.CODEC);
     public static final ResourceConditionType<CopperOxidationRecipesCondition> COPPER_OXIDATION_RECIPES =
            createResourceConditionType("copper_oxidation_recipes", CopperOxidationRecipesCondition.CODEC);
     public static final ResourceConditionType<ShroomsBlocksRecipesCondition> SHROOMS_BLOCKS_RECIPES =
            createResourceConditionType("shrooms_blocks_recipes", ShroomsBlocksRecipesCondition.CODEC);
     public static final ResourceConditionType<SmallDecorativeBlocksRecipesCondition> SMALL_DECORATIVE_BLOCKS_RECIPES =
            createResourceConditionType("small_decorative_blocks_recipes", SmallDecorativeBlocksRecipesCondition.CODEC);
     public static final ResourceConditionType<TulipsRecipesCondition> TULIPS_RECIPES =
            createResourceConditionType("tulips_recipes", TulipsRecipesCondition.CODEC);
     public static final ResourceConditionType<InfestedBlocksRecipesCondition> INFESTED_BLOCKS_RECIPES =
            createResourceConditionType("infested_blocks_recipes", InfestedBlocksRecipesCondition.CODEC);
     public static final ResourceConditionType<RawBlocksSmeltingRecipesCondition> RAW_BLOCKS_SMELTING_RECIPES =
            createResourceConditionType("raw_blocks_smelting_recipes", RawBlocksSmeltingRecipesCondition.CODEC);
    public static final ResourceConditionType<OtherSmeltableRecipesCondition> OTHER_SMELTABLE_RECIPES =
            createResourceConditionType("other_smelting_recipes", OtherSmeltableRecipesCondition.CODEC);
    public static final ResourceConditionType<NautilusArmorRecipesCondition> NAUTILUS_ARMOR_RECIPES =
            createResourceConditionType("nautilus_armor_recipes", NautilusArmorRecipesCondition.CODEC);
     public static final ResourceConditionType<SculkRelatedBlocksRecipesCondition> SCULK_RELATED_BLOCKS_RECIPES =
            createResourceConditionType("sculk_related_blocks_recipes", SculkRelatedBlocksRecipesCondition.CODEC);
     public static final ResourceConditionType<QuickCraftingRecipesCondition> QUICK_CRAFTING_RECIPES =
            createResourceConditionType("quick_crafting_recipes", QuickCraftingRecipesCondition.CODEC);


    //Single recipes:
    public static final ResourceConditionType<EnchantedGoldenAppleRecipeCondition> ENCHANTED_GOLDEN_APPLE_RECIPE =
            createResourceConditionType("enchanted_golden_apple_recipe", EnchantedGoldenAppleRecipeCondition.CODEC);
    public static final ResourceConditionType<GunpowderRecipeCondition> GUNPOWDER_RECIPE =
            createResourceConditionType("gunpowder_recipe", GunpowderRecipeCondition.CODEC);
    public static final ResourceConditionType<ShulkerShellRecipeCondition> SHULKER_SHELL_RECIPE =
            createResourceConditionType("shulker_shell_recipe", ShulkerShellRecipeCondition.CODEC);
    public static final ResourceConditionType<EchoShardRecipeCondition> ECHO_SHARD_RECIPE =
            createResourceConditionType("echo_shard_recipe", EchoShardRecipeCondition.CODEC);
    public static final ResourceConditionType<DragonBreathRecipeCondition> DRAGON_BREATH_RECIPE =
            createResourceConditionType("dragon_breath_recipe", DragonBreathRecipeCondition.CODEC);
    public static final ResourceConditionType<HeartOfTheSeaRecipeCondition> HEART_OF_THE_SEA_RECIPE =
            createResourceConditionType("heart_of_the_sea_recipe", HeartOfTheSeaRecipeCondition.CODEC);
    public static final ResourceConditionType<GlowInkSacRecipeCondition> GLOW_INK_SAC_RECIPE =
            createResourceConditionType("glow_ink_sac_recipe", GlowInkSacRecipeCondition.CODEC);
    public static final ResourceConditionType<GlowstoneRecipeCondition> GLOWSTONE_RECIPE =
            createResourceConditionType("glowstone_recipe", GlowstoneRecipeCondition.CODEC);
    public static final ResourceConditionType<StringRecipeCondition> STRING_RECIPE =
            createResourceConditionType("string_recipe", StringRecipeCondition.CODEC);
    public static final ResourceConditionType<CobwebRecipeCondition> COBWEB_RECIPE =
            createResourceConditionType("cobweb_recipe", CobwebRecipeCondition.CODEC);
    public static final ResourceConditionType<ReinforcedDeepslateRecipeCondition> REINFORCED_DEEPSLATE_RECIPE =
            createResourceConditionType("reinforced_deepslate_recipe", ReinforcedDeepslateRecipeCondition.CODEC);
    public static final ResourceConditionType<TridentRecipeCondition> TRIDENT_RECIPE =
            createResourceConditionType("trident_recipe", TridentRecipeCondition.CODEC);
    public static final ResourceConditionType<TotemOfUndyingRecipeCondition> TOTEM_OF_UNDYING_RECIPE =
            createResourceConditionType("totem_of_undying_recipe", TotemOfUndyingRecipeCondition.CODEC);
    public static final ResourceConditionType<ElytraRecipeCondition> ELYTRA_RECIPE =
            createResourceConditionType("elytra_recipe", ElytraRecipeCondition.CODEC);
    public static final ResourceConditionType<BuddingAmethystRecipeCondition> BUDDING_AMETHYST_RECIPE =
            createResourceConditionType("budding_amethyst_recipe", BuddingAmethystRecipeCondition.CODEC);
    public static final ResourceConditionType<ExperienceBottleRecipeCondition> EXPERIENCE_BOTTLE_RECIPE =
            createResourceConditionType("experience_bottle_recipe", ExperienceBottleRecipeCondition.CODEC);
    public static final ResourceConditionType<RottenFleshToLeatherSmeltingRecipeCondition> ROTTEN_FLESH_TO_LEATHER_SMELTING_RECIPE =
            createResourceConditionType("rotten_flesh_to_leather_smelting_recipe", RottenFleshToLeatherSmeltingRecipeCondition.CODEC);
    public static final ResourceConditionType<SlimeBallToMagmaCreamRecipeCondition> SLIME_BALL_TO_MAGMA_CREAM_RECIPE =
            createResourceConditionType("slime_ball_to_magma_cream_recipe", SlimeBallToMagmaCreamRecipeCondition.CODEC);
    public static final ResourceConditionType<MagmaCreamToSlimeBallRecipeCondition> MAGMA_CREAM_TO_SLIME_BALL_RECIPE =
            createResourceConditionType("magma_cream_to_slime_ball_recipe", MagmaCreamToSlimeBallRecipeCondition.CODEC);
    public static final ResourceConditionType<MossBlockRecipeCondition> MOSS_BLOCK_RECIPE =
            createResourceConditionType("moss_block_recipe", MossBlockRecipeCondition.CODEC);

    public static void register() {
        //Recipe groups:
        ResourceConditions.register(CHAINMAIL_RECIPES);
        ResourceConditions.register(FOOD_RECIPES);
        ResourceConditions.register(DECORATIVE_BLOCKS_RECIPES);
        ResourceConditions.register(CORAL_BLOCKS_RECIPES);
        ResourceConditions.register(FROGLIGHTS_RECIPES);
        ResourceConditions.register(MUSIC_DISCS_RECIPES);
        ResourceConditions.register(MOB_HEADS_RECIPES);
        ResourceConditions.register(SHERD_RECIPES);
        ResourceConditions.register(HORSE_ARMOR_RECIPES);
        ResourceConditions.register(COPPER_OXIDATION_RECIPES);
        ResourceConditions.register(SHROOMS_BLOCKS_RECIPES);
        ResourceConditions.register(SMALL_DECORATIVE_BLOCKS_RECIPES);
        ResourceConditions.register(TULIPS_RECIPES);
        ResourceConditions.register(INFESTED_BLOCKS_RECIPES);
        ResourceConditions.register(RAW_BLOCKS_SMELTING_RECIPES);
        ResourceConditions.register(OTHER_SMELTABLE_RECIPES);
        ResourceConditions.register(NAUTILUS_ARMOR_RECIPES);
        ResourceConditions.register(SCULK_RELATED_BLOCKS_RECIPES);
        ResourceConditions.register(QUICK_CRAFTING_RECIPES);
        //Single recipes:
        ResourceConditions.register(ENCHANTED_GOLDEN_APPLE_RECIPE);
        ResourceConditions.register(GUNPOWDER_RECIPE);
        ResourceConditions.register(SHULKER_SHELL_RECIPE);
        ResourceConditions.register(ECHO_SHARD_RECIPE);
        ResourceConditions.register(DRAGON_BREATH_RECIPE);
        ResourceConditions.register(HEART_OF_THE_SEA_RECIPE);
        ResourceConditions.register(GLOW_INK_SAC_RECIPE);
        ResourceConditions.register(GLOWSTONE_RECIPE);
        ResourceConditions.register(STRING_RECIPE);
        ResourceConditions.register(COBWEB_RECIPE);
        ResourceConditions.register(REINFORCED_DEEPSLATE_RECIPE);
        ResourceConditions.register(TRIDENT_RECIPE);
        ResourceConditions.register(TOTEM_OF_UNDYING_RECIPE);
        ResourceConditions.register(ELYTRA_RECIPE);
        ResourceConditions.register(BUDDING_AMETHYST_RECIPE);
        ResourceConditions.register(EXPERIENCE_BOTTLE_RECIPE);
        ResourceConditions.register(ROTTEN_FLESH_TO_LEATHER_SMELTING_RECIPE);
        ResourceConditions.register(SLIME_BALL_TO_MAGMA_CREAM_RECIPE);
        ResourceConditions.register(MAGMA_CREAM_TO_SLIME_BALL_RECIPE);
        ResourceConditions.register(MOSS_BLOCK_RECIPE);
    }
}