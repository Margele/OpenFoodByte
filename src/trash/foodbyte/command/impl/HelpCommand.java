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
import trash.foodbyte.command.CommandManager;
import trash.foodbyte.command.impl.GetDmgCommand;
import trash.foodbyte.utils.ChatUtils;

public class HelpCommand
extends Command {
    public HelpCommand() {
        super(new String[]{"help"});
        this.setHelp("Shows all commands");
    }

    @Override
    public void onCommand(String[] commands) {
        Iterator a = CommandManager.Method3592().Method1383();
        int a2 = GetDmgCommand.Method3599();
        if (a.Method932()) {
            Command a3 = (Command)a.Method933();
            String a4 = a3.getCommands()[0];
            int a5 = 1;
            if (a5 < a3.getCommands().length) {
                a4 = a4 + (a5 != a3.getCommands().length ? ", " : "") + a3.getCommands()[a5];
                ++a5;
            }
            ChatUtils.addChatMessage("\u00a7e" + a4 + "\u00a7f > " + a3.getHelp());
        }
    }
}