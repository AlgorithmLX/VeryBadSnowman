package com.valion.very_bad_snowman.setup;

import com.valion.very_bad_snowman.entity.RegEntity;
import com.valion.very_bad_snowman.item.ModSpawnEggItem;
import com.valion.very_bad_snowman.item.SnowCrystalArmor;
import com.valion.very_bad_snowman.item.SnowCrystalArmorTier;
import com.valion.very_bad_snowman.item.ToolTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.valion.very_bad_snowman.VeryBadSnowman.ModId;


public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModId);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModId);


    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> SNOW_CRYSTAL = ITEMS.register("snow_crystal",
    () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
    public static final RegistryObject<Item> SNOW_CRYSTAL_INGOT = ITEMS.register("snow_crystal_ingot",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));



    public static final RegistryObject<Item> SNOW_CRYSTAL_HELMET = ITEMS.register("snow_crystal_helmet", () ->
            new SnowCrystalArmor(SnowCrystalArmorTier.SNOW_CRYSTAL_ARMOR,EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()));
    public static final RegistryObject<Item> SNOW_CRYSTAL_CHESTPLATE = ITEMS.register("snow_crystal_chestplate", () ->
            new SnowCrystalArmor(SnowCrystalArmorTier.SNOW_CRYSTAL_ARMOR,EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()));
    public static final RegistryObject<Item> SNOW_CRYSTAL_LEGGINGS = ITEMS.register("snow_crystal_leggings", () ->
            new SnowCrystalArmor(SnowCrystalArmorTier.SNOW_CRYSTAL_ARMOR,EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()));
    public static final RegistryObject<Item> SNOW_CRYSTAL_BOOTS = ITEMS.register("snow_crystal_boots", () ->
            new SnowCrystalArmor(SnowCrystalArmorTier.SNOW_CRYSTAL_ARMOR,EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()));

    public static final RegistryObject<Item> SNOW_CRYSTAL_SWORD = ITEMS.register("snow_crystal_sword",
            () -> new SwordItem(ToolTier.SNOW_CRYSTAL, 4, -2.4F,
                    new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> SNOW_CRYSTAL_PICKAXE = ITEMS.register("snow_crystal_pickaxe",
            () -> new PickaxeItem(ToolTier.SNOW_CRYSTAL, 1, -2.5f,
                    new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<Item> SNOW_CRYSTAL_SHOVEL = ITEMS.register("snow_crystal_shovel",
            () -> new ShovelItem(ToolTier.SNOW_CRYSTAL, 1F, -3f,
                    new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<Item> SNOW_CRYSTAL_AXE = ITEMS.register("snow_crystal_axe",
            () -> new AxeItem(ToolTier.SNOW_CRYSTAL, 5, -3f,
                    new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<Item> SNOW_CRYSTAL_HOE = ITEMS.register("snow_crystal_hoe",
            () -> new HoeItem(ToolTier.SNOW_CRYSTAL, 0, 1,
                    new Item.Properties().group(ItemGroup.TOOLS)));
}
