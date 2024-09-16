package net.severalpeople.sevsnetheriteexpansion.Item;

import net.severalpeople.sevsnetheriteexpansion.Sevsnetheriteexpansion;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    POWERED_NETHERITE("powered_netherite", 42, new int[]{ 5, 9, 7, 4 }, 30,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.5f, 0.2f, () -> Ingredient.of(ModItems.POWEREDNETHERITE.get())),

    CHORUS_STEEL("chorus_steel", 46, new int[]{ 6, 11, 8, 5 }, 35,
    SoundEvents.ARMOR_EQUIP_NETHERITE, 5.5f, 0.3f, () -> Ingredient.of(ModItems.CHORUS_STEEL.get())),

    SCULK_INGOT("sculk_ingot", 52, new int[]{ 7, 16, 11, 7 }, 50,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 8.5f, 0.6f, () -> Ingredient.of(ModItems.SCULK_INGOT.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Sevsnetheriteexpansion.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}