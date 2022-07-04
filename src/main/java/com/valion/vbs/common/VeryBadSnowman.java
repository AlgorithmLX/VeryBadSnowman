package com.valion.vbs.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.valion.vbs.common.setup.Registration;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(VeryBadSnowman.ModId)
public class VeryBadSnowman {
    public static final String ModId = "vbs";

    private static final Logger LOGGER = LoggerFactory.getLogger(ModId);

    public VeryBadSnowman() {
        Registration.init();

        MinecraftForge.EVENT_BUS.register(this);
        
        LOGGER.info("Mod Started!");
    }
}
