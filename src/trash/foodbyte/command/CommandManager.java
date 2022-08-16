/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiChat
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.network.play.client.C01PacketChatMessage
 */
package trash.foodbyte.command;

import awsl.Class632;
import eventapi.EventManager;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.network.play.client.C01PacketChatMessage;
import obfuscate.a;
import trash.foodbyte.command.Command;
import trash.foodbyte.command.impl.BindCommand;
import trash.foodbyte.command.impl.ConfigCommand;
import trash.foodbyte.command.impl.FriendCommand;
import trash.foodbyte.command.impl.GetDmgCommand;
import trash.foodbyte.command.impl.HelpCommand;
import trash.foodbyte.command.impl.HideCommand;
import trash.foodbyte.command.impl.IRCCommand;
import trash.foodbyte.command.impl.NameProtectCommand;
import trash.foodbyte.command.impl.RejoinCommand;
import trash.foodbyte.command.impl.TargetCommand;
import trash.foodbyte.command.impl.TeleportCommand;
import trash.foodbyte.command.impl.ToggleCommand;
import trash.foodbyte.command.impl.WDRCommand;
import trash.foodbyte.command.impl.WaypointCommand;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.GlobalModule;

public class CommandManager {
    public static final String PREFIX = "-";
    private static ArrayList commands = new ArrayList();

    public CommandManager() {
        int n = Command.Method1665();
        commands.Method2530((Object)new BindCommand());
        commands.Method2530((Object)new HideCommand());
        int n2 = n;
        commands.Method2530((Object)new WDRCommand());
        commands.Method2530((Object)new HelpCommand());
        commands.Method2530((Object)new IRCCommand());
        commands.Method2530((Object)new TeleportCommand());
        commands.Method2530((Object)new FriendCommand());
        commands.Method2530((Object)new TargetCommand());
        commands.Method2530((Object)new ConfigCommand());
        commands.Method2530((Object)new GetDmgCommand());
        commands.Method2530((Object)new ToggleCommand());
        commands.Method2530((Object)new RejoinCommand());
        commands.Method2530((Object)new NameProtectCommand());
        commands.Method2530((Object)new WaypointCommand());
        commands.sort(Comparator.comparing(Command::getName));
        EventManager.register(this);
        a.trash(new String[4]);
    }

    @EventTarget
    public void Method3590(Class632 a2) {
        int a3 = Command.Method1666();
        if (GlobalModule.Field3160.getBooleanValue().booleanValue() && Minecraft.getMinecraft().currentScreen == null && a2.Method3513() == 12) {
            GuiChat a4;
            if (GlobalModule.INSTANCE.Field3186.Field2834 != null && GlobalModule.INSTANCE.Field3186.Field2834.isOpen()) {
                a4 = new GuiChat("-I ");
                Minecraft.getMinecraft().displayGuiScreen((GuiScreen)a4);
            }
            a4 = new GuiChat(PREFIX);
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)a4);
        }
    }

    @EventTarget
    public void Method3591(EventPacket a2) {
        int a3 = Command.Method1665();
        if (GlobalModule.Field3160.getValue() && a2.getPacket() instanceof C01PacketChatMessage) {
            Iterator iterator;
            C01PacketChatMessage a4 = (C01PacketChatMessage)a2.getPacket();
            String a5 = CommandManager.Method3593(a4.getMessage());
            if (a4.getMessage().startsWith(PREFIX) && (iterator = CommandManager.Method3592().Method1383()).Method932()) {
                int a6 = 0;
                Command a7 = (Command)iterator.Method933();
                if (a6 < a7.getCommands().length) {
                    if (a5.toLowerCase().split(" ")[0].equals((Object)(PREFIX + a7.getCommands()[a6].toLowerCase()))) {
                        a2.setCancelled(true);
                        a7.onCommand(a5.split(" "));
                        return;
                    }
                    ++a6;
                }
            }
        }
    }

    public static ArrayList Method3592() {
        return commands;
    }

    public static String Method3593(String a2) {
        String a3 = " ";
        String a4 = "  ";
        while (a2.contains((CharSequence)a4)) {
            a2 = a2.replace((CharSequence)a4, (CharSequence)a3);
        }
        return a2;
    }
}