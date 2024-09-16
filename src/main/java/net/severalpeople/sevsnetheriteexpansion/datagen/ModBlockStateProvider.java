package net.severalpeople.sevsnetheriteexpansion.datagen;

import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.Block;
import net.severalpeople.sevsnetheriteexpansion.Sevsnetheriteexpansion;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.state.predicate.BlockStatePredicate;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.severalpeople.sevsnetheriteexpansion.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Sevsnetheriteexpansion.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem((ModBlocks.CHORUS_STEEL_BLOCK));
        blockWithItem((ModBlocks.COMPRESSED_REDSTONE_BLOCK));
        blockWithItem((ModBlocks.POWERED_NETHERITE_BLOCK));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
