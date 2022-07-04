package com.valion.vbs.proxy;

import com.valion.vbs.client.render.BadSnowmanRender;
import com.valion.vbs.common.setup.Registration;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import liquid.network.Direction;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientProxy implements Direction {

    @Override
    public Level clientLevel() {
        return null;
    }

    @Override
    public Player clientPlayer() {
        return null;
    }

    @Override
    public boolean clientSide() {
        return false;
    }

    @Override
    public void init() {
    }

    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(Registration.BAD_SNOWMAN.get(), BadSnowmanRender::new);
    }
}
