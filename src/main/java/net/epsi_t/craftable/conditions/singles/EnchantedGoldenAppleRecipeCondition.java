package net.epsi_t.craftable.conditions.singles;

import com.mojang.serialization.MapCodec;
import net.epsi_t.craftable.conditions.ModResourceConditions;
import net.epsi_t.craftable.config.CraftableConfig;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.resources.RegistryOps;
import org.jspecify.annotations.Nullable;

public record EnchantedGoldenAppleRecipeCondition() implements ResourceCondition {
    public static final MapCodec<EnchantedGoldenAppleRecipeCondition> CODEC = MapCodec.unit(new EnchantedGoldenAppleRecipeCondition());

    @Override
    public ResourceConditionType<?> getType() {
        return ModResourceConditions.ENCHANTED_GOLDEN_APPLE_RECIPE;
    }

    @Override
    public boolean test(RegistryOps.@Nullable RegistryInfoLookup registryInfo) {
        return CraftableConfig.get().enchantedGoldenAppleRecipe;
    }
}
