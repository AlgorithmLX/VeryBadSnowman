package com.valion.very_bad_snowman.setup;

import com.valion.very_bad_snowman.item.SnowCrystalArmor;
import com.valion.very_bad_snowman.item.ToolTier;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.valion.very_bad_snowman.VeryBadSnowman.ModId;

import com.valion.very_bad_snowman.entity.BadSnowman;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModId);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModId);
    public static final DeferredRegister<EntityType<?>> ENTITY = DeferredRegister.create(ForgeRegistries.ENTITIES, ModId);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> SNOW_CRYSTAL = ITEMS.register("snow_crystal",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SNOW_CRYSTAL_INGOT = ITEMS.register("snow_crystal_ingot",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<EntityType<BadSnowman>> BAD_SNOWMAN = ENTITY.register("bad_snowman", 
        ()-> EntityType.Builder.<BadSnowman>of(BadSnowman::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
                .setUpdateInterval(3).sized(0.6f, 1.8f).build("bad_snowman"));


    public static final RegistryObject<Item> SNOW_CRYSTAL_HELMET = ITEMS.register("snow_crystal_helmet", () ->
            new SnowCrystalArmor(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

    public static final RegistryObject<Item> SNOW_CRYSTAL_CHESTPLATE = ITEMS.register("snow_crystal_chestplate", () ->
            new SnowCrystalArmor(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

    public static final RegistryObject<Item> SNOW_CRYSTAL_LEGGINGS = ITEMS.register("snow_crystal_leggings", () ->
            new SnowCrystalArmor(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

    public static final RegistryObject<Item> SNOW_CRYSTAL_BOOTS = ITEMS.register("snow_crystal_boots", () ->
            new SnowCrystalArmor(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

    public static final RegistryObject<Item> SNOW_CRYSTAL_SWORD = ITEMS.register("snow_crystal_sword",
            () -> new SwordItem(ToolTier.SNOW_CRYSTAL, 4, -2.4F,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> SNOW_CRYSTAL_PICKAXE = ITEMS.register("snow_crystal_pickaxe",
            () -> new PickaxeItem(ToolTier.SNOW_CRYSTAL, 1, -2.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> SNOW_CRYSTAL_SHOVEL = ITEMS.register("snow_crystal_shovel",
            () -> new ShovelItem(ToolTier.SNOW_CRYSTAL, 1F, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> SNOW_CRYSTAL_AXE = ITEMS.register("snow_crystal_axe",
            () -> new AxeItem(ToolTier.SNOW_CRYSTAL, 5, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> SNOW_CRYSTAL_HOE = ITEMS.register("snow_crystal_hoe",
            () -> new HoeItem(ToolTier.SNOW_CRYSTAL, 0, 1,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> BAD_SNOWMAN_SPAWN_EGG = ITEMS.register("spawn_egg_bad_snowman", 
        ()-> new ForgeSpawnEggItem(Registration.BAD_SNOWMAN, 808080, 000000, 
                new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
