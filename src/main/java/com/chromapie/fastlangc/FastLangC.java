package com.chromapie.fastlangc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FastLangC.MODID, version = Tags.VERSION, name = "FastLangC", acceptedMinecraftVersions = "[1.7.10]")
public class FastLangC {

    public static final String MODID = "fastlangc";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(clientSide = "com.chromapie.fastlangc.ClientProxy", serverSide = "com.chromapie.fastlangc.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
}
