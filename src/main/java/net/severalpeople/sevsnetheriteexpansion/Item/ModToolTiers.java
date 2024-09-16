package net.severalpeople.sevsnetheriteexpansion.Item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.severalpeople.sevsnetheriteexpansion.Sevsnetheriteexpansion;
import net.severalpeople.sevsnetheriteexpansion.util.ModTags;

import java.util.List;

public class ModToolTiers {

    public static final Tier POWERED_NETHERITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2303, 11f, 5f, 30,
                    ModTags.Blocks.NEEDS_POWERED_POWERED_NETHERITE_TOOL, () -> Ingredient.of(ModItems.POWEREDNETHERITE.get())),
            new ResourceLocation(Sevsnetheriteexpansion.MODID, "powerednetherite"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier CHORUS_STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(6, 2606, 13f, 7f, 35,
                    ModTags.Blocks.NEEDS_CHORUS_STEEL_TOOL, () -> Ingredient.of(ModItems.CHORUS_STEEL.get())),
            new ResourceLocation(Sevsnetheriteexpansion.MODID, "chorus_steel"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier SCULK_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(8, 3976, 15f, 10f, 55,
                    ModTags.Blocks.NEEDS_SCULK_TOOL, () -> Ingredient.of(ModItems.CHORUS_STEEL.get())),
            new ResourceLocation(Sevsnetheriteexpansion.MODID, "sculk_ingot"), List.of(Tiers.NETHERITE), List.of());

}
