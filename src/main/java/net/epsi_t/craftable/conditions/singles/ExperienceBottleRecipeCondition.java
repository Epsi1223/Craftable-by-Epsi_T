package net.epsi_t.craftable.conditions.singles;

import com.mojang.serialization.MapCodec;
import net.epsi_t.craftable.conditions.ModResourceConditions;
import net.epsi_t.craftable.config.CraftableConfig;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.resources.RegistryOps;
import org.jspecify.annotations.Nullable;

public record ExperienceBottleRecipeCondition() implements ResourceCondition {
    public static final MapCodec<ExperienceBottleRecipeCondition> CODEC = MapCodec.unit(new ExperienceBottleRecipeCondition());

    @Override
    public ResourceConditionType<?> getType() {
        return ModResourceConditions.EXPERIENCE_BOTTLE_RECIPE;
    }

    @Override
    public boolean test(RegistryOps.@Nullable RegistryInfoLookup registryInfo) {
        return CraftableConfig.get().experienceBottleRecipe;
    }
}
