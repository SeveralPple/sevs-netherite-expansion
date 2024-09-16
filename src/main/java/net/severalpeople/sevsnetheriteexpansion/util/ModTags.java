package net.severalpeople.sevsnetheriteexpansion.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.severalpeople.sevsnetheriteexpansion.Sevsnetheriteexpansion;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_POWERED_POWERED_NETHERITE_TOOL = tag("needs_powered_netherite_tool");
        public static final TagKey<Block> NEEDS_CHORUS_STEEL_TOOL = tag("needs_chorus_steel_tool");
        public static final TagKey<Block> NEEDS_SCULK_TOOL = tag("needs_sculk_tool");



        private static TagKey<Block> tag(String name) {
                return BlockTags.create(new ResourceLocation(Sevsnetheriteexpansion.MODID, name));
        }
    }

    public static class Items {


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Sevsnetheriteexpansion.MODID, name));
        }
    }

}
