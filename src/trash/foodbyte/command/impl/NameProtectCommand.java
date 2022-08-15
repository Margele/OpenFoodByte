/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package trash.foodbyte.command.impl;

import trash.foodbyte.command.Command;
import trash.foodbyte.command.impl.GetDmgCommand;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.notification.Types;
import trash.foodbyte.utils.ChatUtils;

public class NameProtectCommand
extends Command {
    public NameProtectCommand() {
        super(new String[]{"nameprotect", "np"});
        this.setHelp("NameProtect <text>");
    }

    @Override
    public void onCommand(String[] commands) {
        String a = "";
        int a2 = GetDmgCommand.Method3599();
        if (commands.length <= 1) {
            ChatUtils.addChatMessage(this.getHelp());
            return;
        }
        int a3 = 1;
        if (a3 < commands.length) {
            a = String.valueOf((Object)String.valueOf((Object)a)) + commands[a3] + " ";
            ++a3;
        }
        GlobalModule.fakeName = a.substring(0, a.length() - 1).replace((CharSequence)"&", (CharSequence)"\u00a7");
        GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("NameProtect", "Updated You New NameProtect - " + GlobalModule.fakeName, Types.WARNING));
        GlobalModule.INSTANCE.fileManager.saveNameProtect();
        super.onCommand(commands);
    }
}