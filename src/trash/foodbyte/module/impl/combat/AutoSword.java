/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Objects
 *  net.minecraft.client.gui.GuiChat
 *  net.minecraft.client.gui.inventory.GuiInventory
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.item.ItemTool
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C09PacketHeldItemChange
 *  trash.foodbyte.module.impl.combat.KillAura
 */
package trash.foodbyte.module.impl.combat;

import awsl.Class281;
import awsl.Class46;
import awsl.Class653;
import awsl.Class655;
import awsl.Class667;
import awsl.Class749;
import awsl.Class91;
import eventapi.EventTarget;
import java.util.Objects;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.utils.Wrapper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class AutoSword
extends Module {
    public static ModeValue Field2608 = new ModeValue("AutoSword", "Mode", "Vanilla", new String[]{"Vanilla", "OpenInv"}, "{\u666e\u901a\u6a21\u5f0f,\u6253\u5f00\u80cc\u5305\u518d\u7a7f}");
    public static FloatValue Field2609 = new FloatValue("AutoSword", "Slot", 1.0, 1.0, 9.0, 1.0, "\u9012\u51fa\u6700\u597d\u7684\u5251\u5230\u51e0\u53f7\u7269\u54c1\u680f");
    public static BooleanValue Field2610 = new BooleanValue("AutoSword", "TargetSword", (Boolean)true, "\u5b89\u5168\u6740\u622e\u653b\u51fb\u65f6\u81ea\u52a8\u5207\u6362\u5230\u6b66\u5668(\u6bcf\u79d2\u68c0\u6d4b\u4e00\u6b21)");
    TimeHelper Field2611 = new TimeHelper();
    TimeHelper Field2612 = new TimeHelper();
    public static int Field2613 = 36;
    private static long Field2614 = -1L;

    public AutoSword() {
        super("AutoSword", "Auto Sword", Category.COMBAT);
        this.setDescription("\u81ea\u52a8\u9012\u51fa\u6700\u597d\u7684\u5251");
    }

    @EventTarget
    public void Method1066(Class655 a) {
        if (a.Method3582() instanceof GuiInventory) {
            if (this.Method805()) {
                AutoSword.mc.playerController.windowClick(AutoSword.mc.thePlayer.inventoryContainer.windowId, -999, 0, 4, (EntityPlayer)AutoSword.mc.thePlayer);
                this.Field2611.Method214();
            }
            Field2614 = System.currentTimeMillis();
        }
    }

    public boolean Method713() {
        return System.currentTimeMillis() - Field2614 > 200L;
    }

    @EventTarget
    public void Method755(Class653 a) {
        if (Class281.Method3049(Class667.SG) && Class281.Method3060()) {
            return;
        }
        if (Class281.Method3049(Class667.SB) || Class281.Method3049(Class667.MM) || Class281.Method3049(Class667.PRE)) {
            return;
        }
        if (KillAura.Field2524 != null && Field2610.Method2509().booleanValue()) {
            if (AutoSword.mc.thePlayer.inventory.getCurrentItem() != null && AutoSword.mc.thePlayer.inventory.getCurrentItem().getItem() instanceof ItemSword) {
                this.Field2612.Method214();
            }
            if (AutoSword.mc.thePlayer.inventory.currentItem != Field2609.Method2744().intValue() - 1 && this.Field2612.Method219(1000.0)) {
                AutoSword.mc.thePlayer.inventory.currentItem = Field2609.Method2744().intValue() - 1;
                Wrapper.INSTANCE.Method2874((Packet)new C09PacketHeldItemChange(AutoSword.mc.thePlayer.inventory.currentItem));
                AutoSword.mc.playerController.updateController();
                this.Field2612.Method214();
            }
        }
        if (Field2608.isCurrentMode("OpenInv") && !(AutoSword.mc.currentScreen instanceof GuiInventory)) {
            return;
        }
        if ((AutoSword.mc.currentScreen == null || AutoSword.mc.currentScreen instanceof GuiInventory || AutoSword.mc.currentScreen instanceof GuiChat) && this.Field2611.Method219(100.0) && Field2613 >= 36) {
            if (!AutoSword.Method237(AutoSword.mc.thePlayer.inventoryContainer.getSlot(Field2613 + Field2609.Method2744().intValue() - 1).getStack())) {
                this.Method233(Field2613);
            }
            this.Field2611.Method214();
        }
    }

    public boolean Method805() {
        return this.Method1153() && !AutoSword.Method237(AutoSword.mc.thePlayer.inventoryContainer.getSlot(Field2613 + Field2609.Method2744().intValue() - 1).getStack());
    }

    public boolean Method1153() {
        for (int a = 9; a < 45; ++a) {
            if (!AutoSword.mc.thePlayer.inventoryContainer.getSlot(a).getHasStack()) continue;
            ItemStack a2 = AutoSword.mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (!(a2.getItem() instanceof ItemSword)) continue;
            return true;
        }
        return false;
    }

    public static boolean Method237(ItemStack a) {
        Class91[] a2 = Class46.Method3239();
        if (Objects.isNull((Object)a)) {
            return false;
        }
        float a3 = AutoSword.Method238(a);
        int a4 = 9;
        if (a4 < 45) {
            ItemStack a5;
            if (AutoSword.mc.thePlayer.inventoryContainer.getSlot(a4).getHasStack() && AutoSword.Method238(a5 = AutoSword.mc.thePlayer.inventoryContainer.getSlot(a4).getStack()) > a3 && a5.getItem() instanceof ItemSword) {
                return false;
            }
            ++a4;
        }
        return a.getItem() instanceof ItemSword;
    }

    public void Method235(int a, int a2) {
        AutoSword.mc.playerController.windowClick(AutoSword.mc.thePlayer.inventoryContainer.windowId, a, a2, 2, (EntityPlayer)AutoSword.mc.thePlayer);
    }

    public void Method233(int a) {
        int a2 = 9;
        Class91[] a3 = Class46.Method3239();
        if (a2 < 45) {
            ItemStack a4;
            if (AutoSword.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() && AutoSword.Method237(a4 = AutoSword.mc.thePlayer.inventoryContainer.getSlot(a2).getStack()) && AutoSword.Method238(a4) > 0.0f && a4.getItem() instanceof ItemSword) {
                this.Method235(a2, a - 36 + Field2609.Method2744().intValue() - 1);
            }
            ++a2;
        }
    }

    private static float Method238(ItemStack a) {
        float a2 = 0.0f;
        Item a3 = a.getItem();
        if (a3 instanceof ItemTool) {
            a2 += Class749.Method1590(a);
        }
        if (a3 instanceof ItemSword) {
            a2 += Class749.Method1590(a);
        }
        return a2 += (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.sharpness.effectId, (ItemStack)a) * 1.25f + (float)EnchantmentHelper.getEnchantmentLevel((int)Enchantment.fireAspect.effectId, (ItemStack)a) * 0.5f;
    }
}