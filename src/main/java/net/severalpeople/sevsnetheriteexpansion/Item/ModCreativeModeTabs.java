package net.severalpeople.sevsnetheriteexpansion.Item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.severalpeople.sevsnetheriteexpansion.Sevsnetheriteexpansion;
import net.severalpeople.sevsnetheriteexpansion.block.ModBlocks;

import java.awt.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sevsnetheriteexpansion.MODID);

    public static final RegistryObject<CreativeModeTab> SEVNETHERITEEXPANSION_TAB = CREATIVE_MOD_TABS.register("sevs_netherite_expansion",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.POWEREDNETHERITE.get()))
            .title(Component.translatable("creativetab.sevsnetheriteexpansion_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.POWEREDNETHERITE.get());
                pOutput.accept(ModItems.POWERED_NETHERITE_SWORD.get());
                pOutput.accept(ModItems.POWERED_NETHERITE_PICKAXE.get());
                pOutput.accept(ModItems.POWERED_NETHERITE_AXE.get());
                pOutput.accept(ModItems.POWERED_NETHERITE_SHOVEL.get());
                pOutput.accept(ModItems.POWERED_NETHERITE_HOE.get());

                pOutput.accept(ModItems.POWERED_NETHERITE_HELMET.get());
                pOutput.accept(ModItems.POWERED_NETHERITE_CHESTPLATE.get());
                pOutput.accept(ModItems.POWERED_NETHERITE_LEGGINGS.get());
                pOutput.accept(ModItems.POWERED_NETHERITE_BOOTS.get());

                pOutput.accept(ModItems.CHORUS_STEEL.get());
                pOutput.accept(ModItems.CHORUS_STEEL_SWORD.get());
                pOutput.accept(ModItems.CHORUS_STEEL_PICKAXE.get());
                pOutput.accept(ModItems.CHORUS_STEEL_AXE.get());
                pOutput.accept(ModItems.CHORUS__STEEL_SHOVEL.get());
                pOutput.accept(ModItems.CHORUS_STEEL_HOE.get());

                pOutput.accept(ModItems.CHORUS_STEEL_HELMET.get());
                pOutput.accept(ModItems.CHORUS_STEEL_CHESTPLATE.get());
                pOutput.accept(ModItems.CHORUS_STEEL_LEGGINGS.get());
                pOutput.accept(ModItems.CHORUS_STEEL_BOOTS.get());


                pOutput.accept(ModItems.SCULK_INGOT.get());
                pOutput.accept(ModItems.SCULK_SWORD.get());
                pOutput.accept(ModItems.SCULK_PICKAXE.get());
                pOutput.accept(ModItems.SCULK_AXE.get());
                pOutput.accept(ModItems.SCULK_SHOVEL.get());
                pOutput.accept(ModItems.SCULK_HOE.get());

                pOutput.accept(ModItems.SCULK_HELMET.get());
                pOutput.accept(ModItems.SCULK_CHESTPLATE.get());
                pOutput.accept(ModItems.SCULK_LEGGINGS.get());
                pOutput.accept(ModItems.SCULK_BOOTS.get());


                pOutput.accept(ModBlocks.COMPRESSED_REDSTONE_BLOCK.get());
                pOutput.accept(ModBlocks.POWERED_NETHERITE_BLOCK.get());
                pOutput.accept(ModBlocks.CHORUS_STEEL_BLOCK.get());
                pOutput.accept(ModBlocks.SCULK_INGOT_BLOCK.get());
                pOutput.accept(ModItems.CHORUS_HEMATITE.get());

                pOutput.accept(ModItems.NETHERITE_SANDWICH.get());
                pOutput.accept(ModItems.NETHERITE_DIPPED_CARROT.get());
    })
            .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
