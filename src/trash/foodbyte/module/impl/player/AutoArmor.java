/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.Arrays
 *  net.minecraft.client.gui.GuiChat
 *  net.minecraft.client.gui.inventory.GuiInventory
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C0DPacketCloseWindow
 *  net.minecraft.network.play.client.C16PacketClientStatus
 *  net.minecraft.network.play.client.C16PacketClientStatus$EnumState
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class655;
import eventapi.EventTarget;
import java.util.Arrays;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C16PacketClientStatus;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class AutoArmor
extends Module {
    private TimeHelper Field2460 = new TimeHelper();
    public static ModeValue Field2461 = new ModeValue("AutoArmor", "Mode", "Vanilla", new String[]{"Vanilla", "OpenInv", "FakeInv"}, "{\u666e\u901a\u6a21\u5f0f,\u6253\u5f00\u80cc\u5305\u518d\u7a7f,\u4f2a\u88c5\u6253\u5f00\u80cc\u5305\u7a7f}");
    public static FloatValue Field2462 = new FloatValue("AutoArmor", "Delay", 1.0, 0.0, 5.0, 0.1, "\u7a7f\u88c5\u5907\u5ef6\u8fdf1\u4e3a\u4e00\u79d2");
    public boolean Field2463;
    public long Field2464;

    public AutoArmor() {
        super("AutoArmor", "Auto Armor", Category.PLAYER);
    }

    @Override
    public String getDescription() {
        return "\u81ea\u52a8\u7a7f\u88c5\u5907";
    }

    @EventTarget
    public void Method1066(Class655 a) {
        if (Field2461.isCurrentMode("OpenInv") && a.Method3582() instanceof GuiInventory) {
            this.Field2460.Method216((int)(1000.0f * Field2462.getFloatValueCast() - 80.0f));
            this.Field2464 = System.currentTimeMillis();
        }
    }

    @EventTarget(value=0)
    public void Method712(EventMotion a2) {
        if (a2.isPost()) {
            return;
        }
        if (ServerUtils.isPlayingSkyblock()) {
            return;
        }
        if (Field2461.isCurrentMode("OpenInv") && !(AutoArmor.mc.currentScreen instanceof GuiInventory)) {
            return;
        }
        if (AutoArmor.mc.currentScreen == null || AutoArmor.mc.currentScreen instanceof GuiInventory || AutoArmor.mc.currentScreen instanceof GuiChat) {
            this.Method258();
        }
    }

    public void Method258() {
        int a2 = 1;
        int a3 = Class148.Method1445();
        if (a2 < 5) {
            int a4;
            if (AutoArmor.mc.thePlayer.inventoryContainer.getSlot(4 + a2).getHasStack()) {
                ItemStack a5 = AutoArmor.mc.thePlayer.inventoryContainer.getSlot(4 + a2).getStack();
                if (AutoArmor.Method1695(a5, a2)) {
                }
                if (this.Field2460.Method211((long)(1000.0f * Field2462.getFloatValueCast()))) {
                    if (Field2461.isCurrentMode("FakeInv")) {
                        Wrapper.INSTANCE.sendPacket((Packet)new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                        this.Field2463 = true;
                    }
                    if (this.Method713()) {
                        this.Method234(4 + a2);
                    }
                    this.Method233(4 + a2);
                }
            }
            if ((a4 = 9) < 45) {
                if (AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a4).getHasStack()) {
                    ItemStack a6 = AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a4).getStack();
                    if (this.Field2460.Method211((long)(1000.0f * Field2462.getFloatValueCast())) && AutoArmor.Method239(a6, a2) && AutoArmor.Method238(a6) > 0.0f) {
                        if (Field2461.isCurrentMode("FakeInv") && !this.Field2463) {
                            Wrapper.INSTANCE.sendPacket((Packet)new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                            this.Field2463 = false;
                        }
                        this.Method233(a4);
                        if (Field2461.isCurrentMode("FakeInv")) {
                            Wrapper.INSTANCE.sendPacket((Packet)new C0DPacketCloseWindow(0));
                            this.Field2463 = false;
                        }
                        this.Field2460.reset();
                    }
                }
                ++a4;
            }
            ++a2;
        }
    }

    public static boolean Method239(ItemStack a2, int a3) {
        float a4 = AutoArmor.Method238(a2);
        String a5 = "";
        if (a3 == 1) {
            a5 = "helmet";
        } else if (a3 == 2) {
            a5 = "chestplate";
        } else if (a3 == 3) {
            a5 = "leggings";
        } else if (a3 == 4) {
            a5 = "boots";
        }
        if (!a2.getUnlocalizedName().contains((CharSequence)a5)) {
            return false;
        }
        for (int a6 = 5; a6 < 45; ++a6) {
            ItemStack a7;
            if (!AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a6).getHasStack() || !(AutoArmor.Method238(a7 = AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a6).getStack()) > a4) || !a7.getUnlocalizedName().contains((CharSequence)a5)) continue;
            return false;
        }
        return true;
    }

    public static boolean Method1695(ItemStack a2, int a3) {
        float a4 = AutoArmor.Method238(a2);
        String a5 = "";
        if (a3 == 1) {
            a5 = "helmet";
        } else if (a3 == 2) {
            a5 = "chestplate";
        } else if (a3 == 3) {
            a5 = "leggings";
        } else if (a3 == 4) {
            a5 = "boots";
        }
        for (int a6 = 5; a6 < 45; ++a6) {
            ItemStack a7;
            if (!AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a6).getHasStack() || !(AutoArmor.Method238(a7 = AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a6).getStack()) > a4) || !a7.getUnlocalizedName().contains((CharSequence)a5)) continue;
            return false;
        }
        return true;
    }

    public void Method233(int a2) {
        AutoArmor.mc.playerController.windowClick(AutoArmor.mc.thePlayer.inventoryContainer.windowId, a2, 0, 1, (EntityPlayer)AutoArmor.mc.thePlayer);
    }

    public void Method234(int a2) {
        AutoArmor.mc.playerController.windowClick(AutoArmor.mc.thePlayer.inventoryContainer.windowId, a2, 1, 4, (EntityPlayer)AutoArmor.mc.thePlayer);
    }

    public static float Method238(ItemStack a2) {
        float a3 = 0.0f;
        if (a2.getItem() instanceof ItemArmor) {
            ItemArmor a4 = (ItemArmor)a2.getItem();
            a3 = (float)((double)a3 + ((double)a4.damageReduceAmount + (double)((100 - a4.damageReduceAmount) * EnchantmentHelper.getEnchantmentLevel((int)Enchantment.protection.effectId, (ItemStack)a2)) * 0.0075));
            a3 = (float)((double)a3 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.depthStrider.effectId, (ItemStack)a2) / 45.0);
            a3 = (float)((double)a3 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.featherFalling.effectId, (ItemStack)a2) / 40.0);
            a3 = (float)((double)a3 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.blastProtection.effectId, (ItemStack)a2) / 100.0);
            a3 = (float)((double)a3 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireProtection.effectId, (ItemStack)a2) / 100.0);
            a3 = (float)((double)a3 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.thorns.effectId, (ItemStack)a2) / 100.0);
            a3 = (float)((double)a3 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.unbreaking.effectId, (ItemStack)a2) / 50.0);
            a3 = (float)((double)a3 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.projectileProtection.effectId, (ItemStack)a2) / 100.0);
            a3 = a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7abarbarian chestplate") ? 10.76f : a3;
            a3 = a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a76exodus") ? 5.91f : a3;
            a3 = a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7ashoes of vidar") ? 5.91f : a3;
            a3 = a2.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7ahermes' boots") ? 5.91f : a3;
        }
        return a3;
    }

    public boolean Method713() {
        return !Arrays.asList((Object[])AutoArmor.mc.thePlayer.inventory.mainInventory).contains(null);
    }
}