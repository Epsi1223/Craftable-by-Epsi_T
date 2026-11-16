package net.epsi_t.craftable.conditions.singles;

import com.mojang.serialization.MapCodec;
import net.epsi_t.craftable.conditions.ModResourceConditions;
import net.epsi_t.craftable.config.CraftableConfig;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.resources.RegistryOps;
import org.jspecify.annotations.Nullable;

public record ElytraRecipeCondition() implements ResourceCondition {
    public static final MapCodec<ElytraRecipeCondition> CODEC = MapCodec.unit(new ElytraRecipeCondition());

    @Override
    public ResourceConditionType<?> getType() {
        return ModResourceConditions.ELYTRA_RECIPE;
    }

    @Override
    public boolean test(RegistryOps.@Nullable RegistryInfoLookup registryInfo) {
        return CraftableConfig.get().elytraRecipe;
    }
}
