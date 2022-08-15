/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C0EPacketClickWindow
 */
package awsl;

import awsl.Class208;
import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import trash.foodbyte.utils.Wrapper;

public class Class747 {
    private static Minecraft Field3270 = Minecraft.getMinecraft();

    public static int Method1561() {
        int a = 0;
        String[] a2 = Class208.Method2491();
        if (a < 8) {
            if (Class747.Field3270.thePlayer.inventory.mainInventory[a] == null) {
                return a;
            }
            ++a;
        }
        return Class747.Field3270.thePlayer.inventory.currentItem + (Class747.Field3270.thePlayer.inventory.getCurrentItem() == null ? 0 : (Class747.Field3270.thePlayer.inventory.currentItem < 8 ? 4 : -1));
    }

    public static ItemStack Method1562() {
        return Class747.Field3270.thePlayer.getCurrentEquippedItem() == null ? new ItemStack(Blocks.air) : Class747.Field3270.thePlayer.getCurrentEquippedItem();
    }

    public static ItemStack Method1563(int a) {
        return Class747.Field3270.thePlayer.inventory.mainInventory[a] == null ? new ItemStack(Blocks.air) : Class747.Field3270.thePlayer.inventory.mainInventory[a];
    }

    public static void Method1564(int a) {
        Class747.Field3270.playerController.windowClick(Class747.Field3270.thePlayer.openContainer.windowId, a, 0, 0, (EntityPlayer)Class747.Field3270.thePlayer);
    }

    public static void Method1565(int a) {
        short a2 = Class747.Field3270.thePlayer.openContainer.getNextTransactionID(Class747.Field3270.thePlayer.inventory);
        ItemStack a3 = Class747.Field3270.thePlayer.openContainer.getSlot(a).getStack();
        Wrapper.INSTANCE.Method2874((Packet)new C0EPacketClickWindow(Class747.Field3270.thePlayer.openContainer.windowId, a, 0, 0, a3, a2));
    }

    public static void Method1566(int a, int a2) {
        Class747.Field3270.playerController.windowClick(Class747.Field3270.thePlayer.openContainer.windowId, a, a2, 2, (EntityPlayer)Class747.Field3270.thePlayer);
    }

    public static void Method1567(int a, int a2) {
        short a3 = Class747.Field3270.thePlayer.openContainer.getNextTransactionID(Class747.Field3270.thePlayer.inventory);
        ItemStack a4 = Class747.Field3270.thePlayer.openContainer.getSlot(a).getStack();
        Wrapper.INSTANCE.Method2874((Packet)new C0EPacketClickWindow(Class747.Field3270.thePlayer.openContainer.windowId, a, a2, 0, a4, a3));
    }

    public static void Method1568(int a) {
        Class747.Field3270.playerController.windowClick(Class747.Field3270.thePlayer.openContainer.windowId, a, 0, 1, (EntityPlayer)Class747.Field3270.thePlayer);
    }

    public static void Method1569(int a) {
        short a2 = Class747.Field3270.thePlayer.openContainer.getNextTransactionID(Class747.Field3270.thePlayer.inventory);
        ItemStack a3 = Class747.Field3270.thePlayer.openContainer.getSlot(a).getStack();
        Wrapper.INSTANCE.Method2874((Packet)new C0EPacketClickWindow(Class747.Field3270.thePlayer.openContainer.windowId, a, 0, 1, a3, a2));
    }

    public static boolean Method1570() {
        return !Arrays.asList((Object[])Class747.Field3270.thePlayer.inventory.mainInventory).contains(null);
    }
}