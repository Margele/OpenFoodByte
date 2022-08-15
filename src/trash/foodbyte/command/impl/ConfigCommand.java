/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 */
package trash.foodbyte.command.impl;

import awsl.Class207;
import awsl.Class215;
import awsl.Class91;
import java.io.File;
import trash.foodbyte.command.Command;
import trash.foodbyte.command.impl.GetDmgCommand;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.ChatUtils;

public class ConfigCommand
extends Command {
    public ConfigCommand() {
        super(new String[]{"config", "c"});
        this.setHelp("Config");
    }

    @Override
    public void onCommand(String[] commands) {
        block12: {
            Object a;
            int a2 = GetDmgCommand.Method3599();
            if (commands.length == 1) {
                ChatUtils.addChatMessage("\u00a7f-C list");
                ChatUtils.addChatMessage("\u00a7f-C \u00a7aConfigName \u00a7e[Load CFG]!");
                ChatUtils.addChatMessage("\u00a7f-C Save \u00a7aConfigName!");
                ChatUtils.addChatMessage("\u00a7f-C Load \u00a7aConfigName!");
                ChatUtils.addChatMessage("\u00a7f-C Remove \u00a7aConfigName!");
            }
            if (commands.length == 2 && commands[1].toLowerCase().equals((Object)"list")) {
                if (Class215.Method2649().Method1799() > 0) {
                    Class215.Method2649().forEach(ConfigCommand::Method1640);
                }
                ChatUtils.addChatMessage("\u00a7c[Can't find]");
                return;
            }
            if (commands.length == 2) {
                a = new File(System.getProperty((String)"user.home") + File.separator + GlobalModule.clientName + "/conf-" + commands[1].trim() + ".cfg");
                try {
                    if (!a.exists()) {
                        ChatUtils.addChatMessage("Loaded \u00a7c" + commands[1] + " \u00a7fConfig \u00a7cError [Can't find]");
                        return;
                    }
                }
                catch (Exception a3) {
                    a3.printStackTrace();
                }
                GlobalModule.INSTANCE.fileManager.Method787(commands[1], false);
                ChatUtils.addChatMessage("Loaded \u00a7c" + commands[1] + " \u00a7fConfig \u00a7aSuccessfully");
            }
            if (commands.length == 3) {
                if (commands[1].toLowerCase().equals((Object)"save")) {
                    GlobalModule.INSTANCE.fileManager.Method786(commands[2]);
                    if (Class215.Method2649().stream().noneMatch(arg_0 -> ConfigCommand.Method1639(commands, arg_0))) {
                        a = new Class207(commands[2]);
                        Class215.Method2649().Method2530(a);
                        ChatUtils.addChatMessage("Saved Config \u00a7a" + commands[2]);
                    }
                    ChatUtils.addChatMessage("Replace Config \u00a7a" + commands[2]);
                }
                if (commands[1].toLowerCase().equals((Object)"remove") || commands[1].toLowerCase().equals((Object)"del")) {
                    GlobalModule.INSTANCE.fileManager.deleteConfig(commands[2]);
                    a = new Class207(commands[2]);
                    Class215.Method2649().remove(a);
                    ChatUtils.addChatMessage("removed Config \u00a76" + commands[2]);
                }
                if (commands[1].toLowerCase().equals((Object)"load")) {
                    GlobalModule.INSTANCE.fileManager.Method787(commands[2], false);
                    ChatUtils.addChatMessage("Loaded \u00a7c" + commands[2] + " \u00a7fConfig \u00a7aSuccessfully");
                }
            }
            if (Class91.Method3648() != null) break block12;
            GetDmgCommand.Method3597(++a2);
        }
    }

    private static boolean Method1639(String[] a, Class207 a2) {
        return a2.Method2419().equalsIgnoreCase(a[2]);
    }

    private static void Method1640(Class207 a) {
        ChatUtils.addChatMessage("Config List Name - \u00a7b" + a.Method2419());
    }

    private static Exception Method1641(Exception exception) {
        return exception;
    }
}