package com.valion.very_bad_snowman;


import com.valion.very_bad_snowman.entity.BadSnowman;
import com.valion.very_bad_snowman.setup.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(VeryBadSnowman.ModId)
@Mod.EventBusSubscriber(modid = VeryBadSnowman.ModId, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VeryBadSnowman {

    public static final String ModId = "very_bad_snowman";

    private static final Logger LOGGER = LogManager.getLogger();

    public VeryBadSnowman() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Registration.init();

        MinecraftForge.EVENT_BUS.register(this);

    }
}
