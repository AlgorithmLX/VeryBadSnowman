package com.valion.very_bad_snowman.entity;


import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.ArrayList;
import java.util.List;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegEntity {
    private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
    public static final EntityType<BadSnowman> BAD_SNOWMAN = register("bad_snowman",
            EntityType.Builder.<BadSnowman>of(BadSnowman::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
                    .setUpdateInterval(3).sized(0.6f, 1.8f));

    private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
        REGISTRY.add(entityType);
        return entityType;
    }

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
    }

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(BadSnowman::init);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(BAD_SNOWMAN, BadSnowman.prepareAttributes().build());
    }
}
