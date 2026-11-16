package net.epsi_t.craftable.conditions.groups;

import com.mojang.serialization.MapCodec;
import net.epsi_t.craftable.conditions.ModResourceConditions;
import net.epsi_t.craftable.config.CraftableConfig;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditionType;
import net.minecraft.resources.RegistryOps;
import org.jspecify.annotations.Nullable;

public record SculkRelatedBlocksRecipesCondition() implements ResourceCondition {
    public static final MapCodec<SculkRelatedBlocksRecipesCondition> CODEC = MapCodec.unit(new SculkRelatedBlocksRecipesCondition());

    @Override
    public ResourceConditionType<?> getType() {
        return ModResourceConditions.SCULK_RELATED_BLOCKS_RECIPES;
    }

    @Override
    public boolean test(RegistryOps.@Nullable RegistryInfoLookup registryInfo) {
        return CraftableConfig.get().sculkRelatedBlocksRecipes;
    }
}