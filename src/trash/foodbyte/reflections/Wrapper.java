/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 *  java.awt.Toolkit
 *  java.awt.datatransfer.StringSelection
 *  java.awt.datatransfer.Transferable
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.settings.GameSettings
 *  net.minecraft.network.Packet
 */
package trash.foodbyte.reflections;

import io.netty.util.concurrent.GenericFutureListener;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.network.Packet;
import obfuscate.a;

public class Wrapper {
    public static volatile Wrapper INSTANCE = new Wrapper();
    private static String trash;

    public Minecraft getMinecraft() {
        return Minecraft.getMinecraft();
    }

    public EntityPlayerSP getThePlayer() {
        return Wrapper.INSTANCE.getMinecraft().thePlayer;
    }

    public WorldClient getTheWorld() {
        return Wrapper.INSTANCE.getMinecraft().theWorld;
    }

    public boolean isVaildWorldAndPlayer() {
        return Wrapper.INSTANCE.getMinecraft().thePlayer != null && Wrapper.INSTANCE.getMinecraft().theWorld != null;
    }

    public GameSettings getGameSettings() {
        return Wrapper.INSTANCE.getMinecraft().gameSettings;
    }

    public FontRenderer getFontRendererObj() {
        return Wrapper.INSTANCE.getMinecraft().fontRendererObj;
    }

    public void sendPacket(Packet packet) {
        INSTANCE.getMinecraft().getNetHandler().getNetworkManager().sendPacket(packet);
    }

    public void sendPacketNoEvent(Packet packet) {
        String string = Wrapper.trash();
        INSTANCE.getMinecraft().getNetHandler().getNetworkManager().sendPacket(packet, null, new GenericFutureListener[0]);
        String string2 = string;
        a.trash(new String[2]);
    }

    public void setClipboard(String msg) {
        String string = Wrapper.trash();
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents((Transferable)new StringSelection(msg), null);
        String string2 = string;
        if (a.trash() == null) {
            Wrapper.trash("zgHohb");
        }
    }

    public boolean hasClass(String className) {
        try {
            Class.forName((String)className);
            return true;
        }
        catch (ClassNotFoundException a2) {
            return false;
        }
    }

    static {
        Wrapper.trash(null);
    }

    public static void trash(String string) {
        trash = string;
    }

    public static String trash() {
        return trash;
    }
}