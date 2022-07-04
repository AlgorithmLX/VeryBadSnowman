package com.valion.vbs.common.entity;

import com.valion.vbs.common.setup.Registration;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Events {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(Registration.BAD_SNOWMAN.get(), BadSnowman.prepareAttributes().build());
    }
}
