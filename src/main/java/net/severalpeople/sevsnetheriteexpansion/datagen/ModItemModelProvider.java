package net.severalpeople.sevsnetheriteexpansion.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.severalpeople.sevsnetheriteexpansion.Item.ModItems;
import net.severalpeople.sevsnetheriteexpansion.Sevsnetheriteexpansion;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, Sevsnetheriteexpansion.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CHORUS_HEMATITE);
        simpleItem(ModItems.CHORUS_STEEL);
        simpleItem(ModItems.POWEREDNETHERITE);
        simpleItem(ModItems.SCULK_INGOT);


        handheldItem(ModItems.POWERED_NETHERITE_SWORD);
        handheldItem(ModItems.POWERED_NETHERITE_PICKAXE);
        handheldItem(ModItems.POWERED_NETHERITE_AXE);
        handheldItem(ModItems.POWERED_NETHERITE_SHOVEL);
        handheldItem(ModItems.POWERED_NETHERITE_HOE);
    }




    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Sevsnetheriteexpansion.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                        new ResourceLocation(Sevsnetheriteexpansion.MODID, "item/" + item.getId().getPath()));
    }
}
