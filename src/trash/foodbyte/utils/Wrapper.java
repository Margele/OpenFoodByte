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
package trash.foodbyte.utils;

import awsl.Class91;
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

public class Wrapper {
    public static volatile Wrapper INSTANCE = new Wrapper();
    private static String Field1463;

    public Minecraft Method2868() {
        return Minecraft.getMinecraft();
    }

    public EntityPlayerSP Method2869() {
        return Wrapper.INSTANCE.Method2868().thePlayer;
    }

    public WorldClient Method2870() {
        return Wrapper.INSTANCE.Method2868().theWorld;
    }

    public boolean Method2871() {
        return Wrapper.INSTANCE.Method2868().thePlayer != null && Wrapper.INSTANCE.Method2868().theWorld != null;
    }

    public GameSettings Method2872() {
        return Wrapper.INSTANCE.Method2868().gameSettings;
    }

    public FontRenderer Method2873() {
        return Wrapper.INSTANCE.Method2868().fontRendererObj;
    }

    public void Method2874(Packet a) {
        INSTANCE.Method2868().getNetHandler().getNetworkManager().sendPacket(a);
    }

    public void sendPacketNoEvent(Packet a) {
        String string = Wrapper.Method2879();
        INSTANCE.Method2868().getNetHandler().getNetworkManager().sendPacket(a, null, new GenericFutureListener[0]);
        String string2 = string;
        Class91.Method3647(new String[2]);
    }

    public void Method2876(String a) {
        String string = Wrapper.Method2879();
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents((Transferable)new StringSelection(a), null);
        String string2 = string;
        if (Class91.Method3648() == null) {
            Wrapper.Method2878("zgHohb");
        }
    }

    public boolean Method2877(String a) {
        try {
            Class.forName((String)a);
            return true;
        }
        catch (ClassNotFoundException a2) {
            return false;
        }
    }

    static {
        Wrapper.Method2878(null);
    }

    public static void Method2878(String string) {
        Field1463 = string;
    }

    public static String Method2879() {
        return Field1463;
    }
}