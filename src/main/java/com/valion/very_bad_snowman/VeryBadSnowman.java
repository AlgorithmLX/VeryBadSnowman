package com.valion.very_bad_snowman;

import com.valion.very_bad_snowman.setup.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(VeryBadSnowman.ModId)
public class VeryBadSnowman {
    public static final String ModId = "very_bad_snowman";

    private static final Logger LOGGER = LogManager.getLogger("Very Bad SnowMan Logger");

    public VeryBadSnowman() {
        Registration.init();

        MinecraftForge.EVENT_BUS.register(this);
        
        LOGGER.info("Mod Started!");
    }
}
