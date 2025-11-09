package com.chromapie.fastlangc;

import net.minecraftforge.client.ClientCommandHandler;

import com.chromapie.fastlangc.command.ReloadLangCommand;

import cpw.mods.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        ClientCommandHandler.instance.registerCommand(new ReloadLangCommand());
    }
}
