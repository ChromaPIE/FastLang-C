package com.chromapie.fastlangc;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        FastLangC.LOG.info("FastLangC loaded, version " + Tags.VERSION);
    }

    public void init(FMLInitializationEvent event) {}
}
