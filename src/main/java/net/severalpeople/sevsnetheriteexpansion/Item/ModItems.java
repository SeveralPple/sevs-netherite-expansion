package net.severalpeople.sevsnetheriteexpansion.Item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.severalpeople.sevsnetheriteexpansion.Item.custom.ModArmorItem;
import net.severalpeople.sevsnetheriteexpansion.Sevsnetheriteexpansion;

import java.rmi.registry.Registry;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Sevsnetheriteexpansion.MODID);

    public static final RegistryObject<Item> POWEREDNETHERITE = ITEMS.register("powerednetherite",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> CHORUS_STEEL = ITEMS.register("chorus_steel",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> CHORUS_HEMATITE = ITEMS.register("chorus_hematite",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> SCULK_INGOT = ITEMS.register("sculk_ingot",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> NETHERITE_SANDWICH = ITEMS.register("netherite_sandwich",
            () -> new Item(new Item.Properties().fireResistant().food(ModFoods.NETHERITE_SANDWICH)));

    public static final RegistryObject<Item> NETHERITE_DIPPED_CARROT = ITEMS.register("netherite_dipped_carrot",
            () -> new Item(new Item.Properties().fireResistant().food(ModFoods.NETHERITE_DIPPED_CARROT)));


    public static final RegistryObject<Item> POWERED_NETHERITE_SWORD = ITEMS.register("powered_netherite_sword",
            () -> new SwordItem(ModToolTiers.POWERED_NETHERITE, 3, -2, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> POWERED_NETHERITE_PICKAXE = ITEMS.register("powered_netherite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.POWERED_NETHERITE, 0, -2, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> POWERED_NETHERITE_AXE = ITEMS.register("powered_netherite_axe",
            () -> new AxeItem(ModToolTiers.POWERED_NETHERITE, 6, -3, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> POWERED_NETHERITE_SHOVEL = ITEMS.register("powered_netherite_shovel",
            () -> new ShovelItem(ModToolTiers.POWERED_NETHERITE, 0,-2 , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> POWERED_NETHERITE_HOE = ITEMS.register("powered_netherite_hoe",
            () -> new HoeItem(ModToolTiers.POWERED_NETHERITE, -4, 0, new Item.Properties().fireResistant()));


    public static final RegistryObject<Item> POWERED_NETHERITE_HELMET = ITEMS.register("powered_netherite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.POWERED_NETHERITE, ArmorItem.Type.HELMET,  new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> POWERED_NETHERITE_CHESTPLATE = ITEMS.register("powered_netherite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.POWERED_NETHERITE, ArmorItem.Type.CHESTPLATE,  new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> POWERED_NETHERITE_LEGGINGS = ITEMS.register("powered_netherite_leggings",
            () -> new ArmorItem(ModArmorMaterials.POWERED_NETHERITE, ArmorItem.Type.LEGGINGS,  new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> POWERED_NETHERITE_BOOTS = ITEMS.register("powered_netherite_boots",
            () -> new ArmorItem(ModArmorMaterials.POWERED_NETHERITE, ArmorItem.Type.BOOTS,  new Item.Properties().fireResistant()));


    public static final RegistryObject<Item> CHORUS_STEEL_HELMET = ITEMS.register("chorus_steel_helmet",
            () -> new ModArmorItem(ModArmorMaterials.CHORUS_STEEL, ArmorItem.Type.HELMET,  new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CHORUS_STEEL_CHESTPLATE = ITEMS.register("chorus_steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CHORUS_STEEL, ArmorItem.Type.CHESTPLATE,  new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CHORUS_STEEL_LEGGINGS = ITEMS.register("chorus_steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.CHORUS_STEEL, ArmorItem.Type.LEGGINGS,  new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CHORUS_STEEL_BOOTS = ITEMS.register("chorus_steel_boots",
            () -> new ArmorItem(ModArmorMaterials.CHORUS_STEEL, ArmorItem.Type.BOOTS,  new Item.Properties().fireResistant()));


    public static final RegistryObject<Item> SCULK_HELMET = ITEMS.register("sculk_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SCULK_INGOT, ArmorItem.Type.HELMET,  new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> SCULK_CHESTPLATE = ITEMS.register("sculk_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SCULK_INGOT, ArmorItem.Type.CHESTPLATE,  new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> SCULK_LEGGINGS = ITEMS.register("sculk_leggings",
            () -> new ArmorItem(ModArmorMaterials.SCULK_INGOT, ArmorItem.Type.LEGGINGS,  new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> SCULK_BOOTS = ITEMS.register("sculk_boots",
            () -> new ArmorItem(ModArmorMaterials.SCULK_INGOT, ArmorItem.Type.BOOTS,  new Item.Properties().fireResistant()));



    public static final RegistryObject<Item> CHORUS_STEEL_SWORD = ITEMS.register("chorus_steel_sword",
            () -> new SwordItem(ModToolTiers.CHORUS_STEEL, 4, -2, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> CHORUS_STEEL_PICKAXE = ITEMS.register("chorus_steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHORUS_STEEL, 0, -2, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> CHORUS_STEEL_AXE = ITEMS.register("chorus_steel_axe",
            () -> new AxeItem(ModToolTiers.CHORUS_STEEL, 7, -3, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> CHORUS__STEEL_SHOVEL= ITEMS.register("chorus_steel_shovel",
            () -> new ShovelItem(ModToolTiers.CHORUS_STEEL, 1,-2 , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> CHORUS_STEEL_HOE = ITEMS.register("chorus_steel_hoe",
            () -> new HoeItem(ModToolTiers.CHORUS_STEEL, -4, 0, new Item.Properties().fireResistant()));


    public static final RegistryObject<Item> SCULK_SWORD= ITEMS.register("sculk_sword",
            () -> new SwordItem(ModToolTiers.SCULK_TOOL, 4, -2, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> SCULK_PICKAXE = ITEMS.register("sculk_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SCULK_TOOL, 0, -2, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> SCULK_AXE = ITEMS.register("sculk_axe",
            () -> new AxeItem(ModToolTiers.SCULK_TOOL, 9, -3, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> SCULK_SHOVEL= ITEMS.register("sculk_shovel",
            () -> new ShovelItem(ModToolTiers.SCULK_TOOL, 1,-2 , new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> SCULK_HOE = ITEMS.register("sculk_hoe",
            () -> new HoeItem(ModToolTiers.SCULK_TOOL, -4, 0, new Item.Properties().fireResistant()));



    public static void register(IEventBus eventBus)
    {
        ITEMS.register((eventBus));
    }

}
