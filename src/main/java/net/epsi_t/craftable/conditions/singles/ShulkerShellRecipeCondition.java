package net.epsi_t.craftable.conditions.singles;

import com.mojang.serialization.MapCodec;
import net.epsi_t.craftable.conditions.ModResourceConditions;
import net.epsi_t.craftable.config.CraftableConfig;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.resources.RegistryOps;
import org.jspecify.annotations.Nullable;

public record ShulkerShellRecipeCondition() implements ResourceCondition {
    public static final MapCodec<ShulkerShellRecipeCondition> CODEC = MapCodec.unit(new ShulkerShellRecipeCondition());

    @Override
    public ResourceConditionType<?> getType() {
        return ModResourceConditions.SHULKER_SHELL_RECIPE;
    }

    @Override
    public boolean test(RegistryOps.@Nullable RegistryInfoLookup registryInfo) {
        return CraftableConfig.get().shulkerShellRecipe;
    }
}
