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
import awsl.Class91;
import eventapi.EventManager;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.network.play.client.C01PacketChatMessage;
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
        Class91.Method3647(new String[4]);
    }

    @EventTarget
    public void Method3590(Class632 a) {
        int a2 = Command.Method1666();
        if (GlobalModule.Field3160.Method2509().booleanValue() && Minecraft.getMinecraft().currentScreen == null && a.Method3513() == 12) {
            GuiChat a3;
            if (GlobalModule.INSTANCE.Field3186.Field2834 != null && GlobalModule.INSTANCE.Field3186.Field2834.isOpen()) {
                a3 = new GuiChat("-I ");
                Minecraft.getMinecraft().displayGuiScreen((GuiScreen)a3);
            }
            a3 = new GuiChat(PREFIX);
            Minecraft.getMinecraft().displayGuiScreen((GuiScreen)a3);
        }
    }

    @EventTarget
    public void Method3591(EventPacket a) {
        int a2 = Command.Method1665();
        if (GlobalModule.Field3160.getValue() && a.getPacket() instanceof C01PacketChatMessage) {
            Iterator iterator;
            C01PacketChatMessage a3 = (C01PacketChatMessage)a.getPacket();
            String a4 = CommandManager.Method3593(a3.getMessage());
            if (a3.getMessage().startsWith(PREFIX) && (iterator = CommandManager.Method3592().Method1383()).Method932()) {
                int a5 = 0;
                Command a6 = (Command)iterator.Method933();
                if (a5 < a6.getCommands().length) {
                    if (a4.toLowerCase().split(" ")[0].equals((Object)(PREFIX + a6.getCommands()[a5].toLowerCase()))) {
                        a.setCancelled(true);
                        a6.onCommand(a4.split(" "));
                        return;
                    }
                    ++a5;
                }
            }
        }
    }

    public static ArrayList Method3592() {
        return commands;
    }

    public static String Method3593(String a) {
        String a2 = " ";
        String a3 = "  ";
        while (a.contains((CharSequence)a3)) {
            a = a.replace((CharSequence)a3, (CharSequence)a2);
        }
        return a;
    }
}