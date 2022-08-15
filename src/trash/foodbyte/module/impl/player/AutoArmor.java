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
import awsl.Class281;
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
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.utils.Wrapper;
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
            this.Field2460.Method216((int)(1000.0f * Field2462.Method2746() - 80.0f));
            this.Field2464 = System.currentTimeMillis();
        }
    }

    @EventTarget(value=0)
    public void Method712(EventMotion a) {
        if (a.isPost()) {
            return;
        }
        if (Class281.Method3050()) {
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
        int a = 1;
        int a2 = Class148.Method1445();
        if (a < 5) {
            int a3;
            if (AutoArmor.mc.thePlayer.inventoryContainer.getSlot(4 + a).getHasStack()) {
                ItemStack a4 = AutoArmor.mc.thePlayer.inventoryContainer.getSlot(4 + a).getStack();
                if (AutoArmor.Method1695(a4, a)) {
                }
                if (this.Field2460.Method211((long)(1000.0f * Field2462.Method2746()))) {
                    if (Field2461.isCurrentMode("FakeInv")) {
                        Wrapper.INSTANCE.Method2874((Packet)new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                        this.Field2463 = true;
                    }
                    if (this.Method713()) {
                        this.Method234(4 + a);
                    }
                    this.Method233(4 + a);
                }
            }
            if ((a3 = 9) < 45) {
                if (AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack()) {
                    ItemStack a5 = AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a3).getStack();
                    if (this.Field2460.Method211((long)(1000.0f * Field2462.Method2746())) && AutoArmor.Method239(a5, a) && AutoArmor.Method238(a5) > 0.0f) {
                        if (Field2461.isCurrentMode("FakeInv") && !this.Field2463) {
                            Wrapper.INSTANCE.Method2874((Packet)new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
                            this.Field2463 = false;
                        }
                        this.Method233(a3);
                        if (Field2461.isCurrentMode("FakeInv")) {
                            Wrapper.INSTANCE.Method2874((Packet)new C0DPacketCloseWindow(0));
                            this.Field2463 = false;
                        }
                        this.Field2460.Method214();
                    }
                }
                ++a3;
            }
            ++a;
        }
    }

    public static boolean Method239(ItemStack a, int a2) {
        float a3 = AutoArmor.Method238(a);
        String a4 = "";
        if (a2 == 1) {
            a4 = "helmet";
        } else if (a2 == 2) {
            a4 = "chestplate";
        } else if (a2 == 3) {
            a4 = "leggings";
        } else if (a2 == 4) {
            a4 = "boots";
        }
        if (!a.getUnlocalizedName().contains((CharSequence)a4)) {
            return false;
        }
        for (int a5 = 5; a5 < 45; ++a5) {
            ItemStack a6;
            if (!AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a5).getHasStack() || !(AutoArmor.Method238(a6 = AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a5).getStack()) > a3) || !a6.getUnlocalizedName().contains((CharSequence)a4)) continue;
            return false;
        }
        return true;
    }

    public static boolean Method1695(ItemStack a, int a2) {
        float a3 = AutoArmor.Method238(a);
        String a4 = "";
        if (a2 == 1) {
            a4 = "helmet";
        } else if (a2 == 2) {
            a4 = "chestplate";
        } else if (a2 == 3) {
            a4 = "leggings";
        } else if (a2 == 4) {
            a4 = "boots";
        }
        for (int a5 = 5; a5 < 45; ++a5) {
            ItemStack a6;
            if (!AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a5).getHasStack() || !(AutoArmor.Method238(a6 = AutoArmor.mc.thePlayer.inventoryContainer.getSlot(a5).getStack()) > a3) || !a6.getUnlocalizedName().contains((CharSequence)a4)) continue;
            return false;
        }
        return true;
    }

    public void Method233(int a) {
        AutoArmor.mc.playerController.windowClick(AutoArmor.mc.thePlayer.inventoryContainer.windowId, a, 0, 1, (EntityPlayer)AutoArmor.mc.thePlayer);
    }

    public void Method234(int a) {
        AutoArmor.mc.playerController.windowClick(AutoArmor.mc.thePlayer.inventoryContainer.windowId, a, 1, 4, (EntityPlayer)AutoArmor.mc.thePlayer);
    }

    public static float Method238(ItemStack a) {
        float a2 = 0.0f;
        if (a.getItem() instanceof ItemArmor) {
            ItemArmor a3 = (ItemArmor)a.getItem();
            a2 = (float)((double)a2 + ((double)a3.damageReduceAmount + (double)((100 - a3.damageReduceAmount) * EnchantmentHelper.getEnchantmentLevel((int)Enchantment.protection.effectId, (ItemStack)a)) * 0.0075));
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.depthStrider.effectId, (ItemStack)a) / 45.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.featherFalling.effectId, (ItemStack)a) / 40.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.blastProtection.effectId, (ItemStack)a) / 100.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireProtection.effectId, (ItemStack)a) / 100.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.thorns.effectId, (ItemStack)a) / 100.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.unbreaking.effectId, (ItemStack)a) / 50.0);
            a2 = (float)((double)a2 + (double)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.projectileProtection.effectId, (ItemStack)a) / 100.0);
            a2 = a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7abarbarian chestplate") ? 10.76f : a2;
            a2 = a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a76exodus") ? 5.91f : a2;
            a2 = a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7ashoes of vidar") ? 5.91f : a2;
            a2 = a.getDisplayName().toLowerCase().contains((CharSequence)"\u00a7ahermes' boots") ? 5.91f : a2;
        }
        return a2;
    }

    public boolean Method713() {
        return !Arrays.asList((Object[])AutoArmor.mc.thePlayer.inventory.mainInventory).contains(null);
    }
}