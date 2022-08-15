/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package trash.foodbyte.command.impl;

import awsl.Class305;
import awsl.Class307;
import trash.foodbyte.command.Command;
import trash.foodbyte.command.impl.GetDmgCommand;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.ChatUtils;

public class TargetCommand
extends Command {
    public TargetCommand() {
        super(new String[]{"target", "tg"});
        this.setHelp("Target: <add/a/remove/r> <name> <alias>");
    }

    @Override
    public void onCommand(String[] commands) {
        int a = GetDmgCommand.Method3598();
        if (commands.length < 3) {
            ChatUtils.addChatMessage(this.getHelp());
            return;
        }
        String a2 = commands[1];
        String a3 = commands[2];
        String a4 = commands.length > 3 ? commands[3] : a3;
        Class307 a5 = Class305.Method702(a3);
        if (a2.equalsIgnoreCase("a") || a2.equalsIgnoreCase("add")) {
            Class307 a6 = new Class307(a3, a4);
            ChatUtils.addChatMessage("Added target " + a3 + " as " + a4);
            Class305.Method696().Method2530((Object)a6);
            a5.Method746(a4);
            ChatUtils.addChatMessage("Changed alias to " + a4);
        }
        if (a2.equalsIgnoreCase("r") || a2.equalsIgnoreCase("remove")) {
            Class305.Method696().remove((Object)a5);
            ChatUtils.addChatMessage("Removed target");
        }
        ChatUtils.addChatMessage(this.getHelp());
        GlobalModule.INSTANCE.fileManager.saveTargets();
    }
}