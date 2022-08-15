/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Objects
 *  net.minecraft.client.gui.GuiChat
 *  net.minecraft.client.gui.GuiEnchantment
 *  net.minecraft.client.gui.GuiRepair
 *  net.minecraft.client.gui.inventory.GuiChest
 *  net.minecraft.client.gui.inventory.GuiCrafting
 *  net.minecraft.client.gui.inventory.GuiEditSign
 *  net.minecraft.client.gui.inventory.GuiFurnace
 *  net.minecraft.client.gui.inventory.GuiInventory
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C0DPacketCloseWindow
 *  net.minecraft.network.play.client.C0EPacketClickWindow
 *  net.minecraft.network.play.client.C16PacketClientStatus
 *  net.minecraft.network.play.client.C16PacketClientStatus$EnumState
 *  net.minecraftforge.fml.relauncher.ReflectionHelper
 *  org.lwjgl.input.Keyboard
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class634;
import awsl.Class655;
import eventapi.EventTarget;
import java.util.Objects;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiEnchantment;
import net.minecraft.client.gui.GuiRepair;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraft.client.gui.inventory.GuiFurnace;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C0EPacketClickWindow;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ObfuscatedClasses;
import trash.foodbyte.utils.Wrapper;
import trash.foodbyte.value.BooleanValue;

public class InvWalk
extends Module {
    private boolean Field2718;
    public BooleanValue Field2719 = new BooleanValue("InvWalk", "Hypixel", (Boolean)true, "\u81ea\u52a8\u963b\u6b62\u4e0d\u5408\u6cd5\u7684\u64cd\u4f5c");

    public InvWalk() {
        super("InvWalk", "Inv Walk", Category.PLAYER);
    }

    @Override
    public String getDescription() {
        return "\u80cc\u5305\u884c\u8d70";
    }

    @EventTarget
    public void Method1066(Class655 a) {
        if (this.Field2719.getValue() && (a.Method3582() instanceof GuiChat || a.Method3582() instanceof GuiChest || a.Field2925 instanceof GuiCrafting || a.Field2925 instanceof GuiFurnace || a.Field2925 instanceof GuiRepair || a.Field2925 instanceof GuiEditSign || a.Field2925 instanceof GuiEnchantment)) {
            this.Field2718 = true;
        }
    }

    @EventTarget
    public void Method232(Class634 a) {
        block16: {
            KeyBinding a2;
            int a3;
            int a4;
            KeyBinding[] a5;
            KeyBinding[] a6;
            block15: {
                a6 = new KeyBinding[]{InvWalk.mc.gameSettings.keyBindForward, InvWalk.mc.gameSettings.keyBindBack, InvWalk.mc.gameSettings.keyBindLeft, InvWalk.mc.gameSettings.keyBindRight, InvWalk.mc.gameSettings.keyBindSprint, InvWalk.mc.gameSettings.keyBindJump};
                int a7 = Class148.Method1444();
                if (this.Field2719.getValue()) break block15;
                if (InvWalk.mc.currentScreen != null && !(InvWalk.mc.currentScreen instanceof GuiChat)) {
                    a5 = a6;
                    a4 = 0;
                    a3 = a6.length;
                    if (a4 < a3) {
                        a2 = a5[a4];
                        KeyBinding.setKeyBindState((int)a2.getKeyCode(), (boolean)Keyboard.isKeyDown((int)a2.getKeyCode()));
                        ++a4;
                    }
                }
                if (!Objects.isNull((Object)InvWalk.mc.currentScreen)) break block16;
                a5 = a6;
                a4 = 0;
                a3 = a6.length;
                if (a4 < a3) {
                    a2 = a5[a4];
                    if (!Keyboard.isKeyDown((int)a2.getKeyCode())) {
                        KeyBinding.setKeyBindState((int)a2.getKeyCode(), (boolean)false);
                    }
                    ++a4;
                }
            }
            if (this.Field2718 && Objects.nonNull((Object)InvWalk.mc.currentScreen)) {
                a5 = a6;
                a4 = 0;
                a3 = a6.length;
                if (a4 < a3) {
                    a2 = a5[a4];
                    KeyBinding.setKeyBindState((int)a2.getKeyCode(), (boolean)false);
                    ++a4;
                }
                return;
            }
            if (!(InvWalk.mc.currentScreen == null || InvWalk.mc.currentScreen instanceof GuiChat || InvWalk.mc.currentScreen instanceof GuiChest || InvWalk.mc.currentScreen instanceof GuiCrafting || InvWalk.mc.currentScreen instanceof GuiFurnace || InvWalk.mc.currentScreen instanceof GuiRepair || InvWalk.mc.currentScreen instanceof GuiEditSign || InvWalk.mc.currentScreen instanceof GuiEnchantment)) {
                a5 = a6;
                a4 = 0;
                a3 = a6.length;
                if (a4 < a3) {
                    a2 = a5[a4];
                    KeyBinding.setKeyBindState((int)a2.getKeyCode(), (boolean)Keyboard.isKeyDown((int)a2.getKeyCode()));
                    ++a4;
                }
            }
            if (Objects.isNull((Object)InvWalk.mc.currentScreen)) {
                this.Field2718 = false;
                a5 = a6;
                a4 = 0;
                a3 = a6.length;
                if (a4 < a3) {
                    a2 = a5[a4];
                    if (!Keyboard.isKeyDown((int)a2.getKeyCode())) {
                        KeyBinding.setKeyBindState((int)a2.getKeyCode(), (boolean)false);
                    }
                    ++a4;
                }
                a5 = a6;
                a4 = 0;
                a3 = a6.length;
                if (a4 < a3) {
                    a2 = a5[a4];
                    KeyBinding.setKeyBindState((int)a2.getKeyCode(), (boolean)Keyboard.isKeyDown((int)a2.getKeyCode()));
                    ++a4;
                }
            }
        }
    }

    @EventTarget
    public void Method273(EventPacket a) {
        if (this.Field2719.getValue()) {
            Packet a2 = a.getPacket();
            if (a.isSend()) {
                C0DPacketCloseWindow a3;
                if (a2 instanceof C0DPacketCloseWindow) {
                    a3 = (C0DPacketCloseWindow)a.getPacket();
                    if (InvWalk.mc.currentScreen instanceof GuiInventory && !this.Field2718) {
                        int a4 = 999;
                        try {
                            a4 = ReflectionHelper.findField((Class)a3.getClass(), (String[])new String[]{ObfuscatedClasses.windowId.getObfuscatedName()}).getInt((Object)a3);
                            a.setCancelled(true);
                        }
                        catch (IllegalAccessException illegalAccessException) {
                            // empty catch block
                        }
                    }
                    this.Field2718 = false;
                }
                if (a2 instanceof C16PacketClientStatus && (a3 = (C16PacketClientStatus)a2).getStatus() == C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT) {
                    a.setCancelled(true);
                }
                if (a2 instanceof C0EPacketClickWindow) {
                    a3 = (C0EPacketClickWindow)a.getPacket();
                    if (InvWalk.mc.currentScreen instanceof GuiInventory) {
                        if ((a3.getMode() == 4 || a3.getMode() == 3) && a3.getSlotId() == -999) {
                            a.setCancelled(true);
                        } else {
                            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                            this.Field2718 = true;
                        }
                    }
                }
            }
            if (a.isRecieve()) {
                // empty if block
            }
        }
    }

    @Override
    public void Method279() {
        KeyBinding[] a;
        if (InvWalk.mc.currentScreen == null && !Wrapper.INSTANCE.Method2871()) {
            return;
        }
        KeyBinding[] a2 = a = new KeyBinding[]{InvWalk.mc.gameSettings.keyBindForward, InvWalk.mc.gameSettings.keyBindBack, InvWalk.mc.gameSettings.keyBindLeft, InvWalk.mc.gameSettings.keyBindRight, InvWalk.mc.gameSettings.keyBindSprint, InvWalk.mc.gameSettings.keyBindJump};
        int a3 = a.length;
        for (int a4 = 0; a4 < a3; ++a4) {
            KeyBinding a5 = a2[a4];
            KeyBinding.setKeyBindState((int)a5.getKeyCode(), (boolean)false);
        }
    }

    private static IllegalAccessException Method1185(IllegalAccessException illegalAccessException) {
        return illegalAccessException;
    }
}