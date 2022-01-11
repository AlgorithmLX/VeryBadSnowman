package com.valion.very_bad_snowman;

import com.valion.very_bad_snowman.entity.RegEntity;
import com.valion.very_bad_snowman.entity.render.BadSnowmanRender;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(VeryBadSnowman.ModId)
@Mod.EventBusSubscriber(modid = VeryBadSnowman.ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VeryBadSnowman {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String ModId = "very_bad_snowman";
    public static final String NAME = "VeryBadSnowman";

    public VeryBadSnowman() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);

        RegEntity.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::enqueueIMC);
        eventBus.addListener(this::processIMC);
        eventBus.addListener(this::doClientStuff);

    }

    private void enqueueIMC(final InterModEnqueueEvent event){
    }

    private void processIMC(final InterModProcessEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event){
        event.enqueueWork(() -> {
        });
        RenderingRegistry.registerEntityRenderingHandler(RegEntity.BAD_SNOWMAN.get(), BadSnowmanRender::new);
    }

    private void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }
}
