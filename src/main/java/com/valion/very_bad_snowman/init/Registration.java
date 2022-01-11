package com.valion.very_bad_snowman.init;

import com.valion.very_bad_snowman.entity.RegEntity;
import com.valion.very_bad_snowman.item.ModSpawnEggItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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

    public static final RegistryObject<Item> BAD_SNOWMAN_SPAWN_EGG = ITEMS.register("bad_snowman_spawn_egg",
            () -> new ModSpawnEggItem(RegEntity.BAD_SNOWMAN, 0x464F56,0x1D6336,
                    new Item.Properties().group(ItemGroup.MISC)));

}
