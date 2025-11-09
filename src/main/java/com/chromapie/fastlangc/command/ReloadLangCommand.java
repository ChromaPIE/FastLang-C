package com.chromapie.fastlangc.command;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class ReloadLangCommand extends CommandBase {

    @Override
    public String getCommandName() {
        return "reloadlang";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/reloadlang";
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        Minecraft mc = Minecraft.getMinecraft();
        mc.getLanguageManager()
            .onResourceManagerReload(mc.getResourceManager());
        sender.addChatMessage(new ChatComponentText("Language files reloaded!"));
    }
}
