/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.ChatComponentText
 *  net.minecraft.util.EnumChatFormatting
 *  net.minecraft.util.IChatComponent
 */
package trash.foodbyte.utils;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import trash.foodbyte.module.GlobalModule;

public class ChatUtils {
    public static List reported = new ArrayList();

    public static void addChatMessage(String msg) {
        if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null) {
            Minecraft.getMinecraft().thePlayer.addChatMessage((IChatComponent)new ChatComponentText("\u00a78[\u00a7c" + GlobalModule.clientName + "\u00a78]\u00a7r " + msg));
        }
    }

    public static void addChatMessageNoPrefix(String msg) {
        if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null) {
            Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage((IChatComponent)new ChatComponentText(msg));
        }
    }

    public static void sendMessage(String msg) {
        Minecraft.getMinecraft().thePlayer.sendChatMessage(msg);
    }

    public static void report(String name) {
        if (reported.contains((Object)name) || Minecraft.getMinecraft().thePlayer.getName().equals((Object)name)) {
            return;
        }
        reported.Method2530((Object)name);
        Minecraft.getMinecraft().thePlayer.sendChatMessage("/wdr " + name + " ka speed reach fly antiknockback autoclicker dolphin");
    }

    public static void debug(String msg) {
        if (!GlobalModule.debug.getValue()) {
            return;
        }
        if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null) {
            Minecraft.getMinecraft().thePlayer.addChatMessage((IChatComponent)new ChatComponentText("\u00a7c[DEBUG] \u00a7r" + EnumChatFormatting.GRAY + msg));
        }
    }
}