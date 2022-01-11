package com.valion.very_bad_snowman.events;

import com.valion.very_bad_snowman.entity.BadSnowman;
import com.valion.very_bad_snowman.entity.RegEntity;
import com.valion.very_bad_snowman.item.ModSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.valion.very_bad_snowman.VeryBadSnowman.ModId;

@Mod.EventBusSubscriber(modid = ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VBSWorldEventBus {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(RegEntity.BAD_SNOWMAN.get(), BadSnowman.setCustomAttributes().create());
    }
    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
