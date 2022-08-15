/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 */
package trash.foodbyte.command.impl;

import java.util.Iterator;
import trash.foodbyte.command.Command;
import trash.foodbyte.command.impl.GetDmgCommand;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.utils.ChatUtils;

public class HideCommand
extends Command {
    public HideCommand() {
        super(new String[]{"hide"});
        this.setHelp("Hide <module>");
    }

    @Override
    public void onCommand(String[] commands) {
        int a = GetDmgCommand.Method3599();
        if (commands.length != 2) {
            ChatUtils.addChatMessage(this.getHelp());
            return;
        }
        boolean a2 = false;
        Iterator iterator = ModuleManager.getAllModules().Method1383();
        if (iterator.Method932()) {
            Module a3 = (Module)iterator.Method933();
            if (!commands[1].equalsIgnoreCase(a3.getName())) {
            }
            a3.hide = !a3.hide;
            a2 = true;
            ChatUtils.addChatMessage(String.valueOf((Object)a3.getName()) + " Module hide toggled!");
            a3.Method1038().Method1192(0.0);
            a3.Method1039().Method1192(0.0);
            GlobalModule.INSTANCE.fileManager.saveHide();
        }
        ChatUtils.addChatMessage("Hide to Module : " + commands[1]);
    }
}