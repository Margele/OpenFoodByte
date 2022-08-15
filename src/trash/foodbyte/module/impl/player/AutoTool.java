/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Objects
 *  net.minecraft.block.Block
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.network.play.client.C07PacketPlayerDigging
 *  net.minecraft.network.play.client.C07PacketPlayerDigging$Action
 *  net.minecraft.util.BlockPos
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import awsl.Class654;
import eventapi.EventTarget;
import java.util.Objects;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.util.BlockPos;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.player.AntiObbyTrap;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.value.BooleanValue;

public class AutoTool
extends Module {
    boolean Field2691;
    boolean Field2692;
    public BooleanValue Field2693 = new BooleanValue("AutoTool", "SwordCheck", (Boolean)false, "\u624b\u62ff\u5251\u4e0d\u81ea\u52a8\u5207\u6362\u5de5\u5177");
    public BooleanValue Field2694 = new BooleanValue("AutoTool", "EatCheck", (Boolean)true, "\u5403\u4e1c\u897f\u65f6\u5de6\u952e\u4e0d\u81ea\u52a8\u5207\u6362\u5de5\u5177");

    public AutoTool() {
        super("AutoTool", "Auto Tool", Category.PLAYER);
    }

    @Override
    public String getDescription() {
        return "\u6316\u77ff\u81ea\u52a8\u5207\u6362\u5de5\u5177";
    }

    @EventTarget
    public void Method801(Class654 a) {
        int n = Class148.Method1445();
        if (Objects.isNull((Object)AutoTool.mc.theWorld)) {
            return;
        }
        if (this.Field2691 && AutoTool.mc.thePlayer.getHeldItem() == null) {
            this.Field2691 = false;
        }
        if (AutoTool.mc.thePlayer.getHeldItem() != null && AutoTool.mc.thePlayer.getHeldItem().getItem() instanceof ItemSword) {
            this.Field2691 = true;
        }
        this.Field2691 = false;
        if (ReflectionUtils.Method2603() > 0.0f && AutoTool.mc.thePlayer.getHeldItem().getItem() instanceof ItemFood) {
            this.Field2692 = true;
        }
        this.Field2692 = false;
    }

    @EventTarget
    public void Method273(EventPacket a) {
        if (a.isRecieve()) {
            return;
        }
        if (!(a.getPacket() instanceof C07PacketPlayerDigging)) {
            return;
        }
        C07PacketPlayerDigging a2 = (C07PacketPlayerDigging)a.getPacket();
        if (a2.getStatus() == C07PacketPlayerDigging.Action.START_DESTROY_BLOCK) {
            if (this.Field2693.getValue() && this.Field2691 && !AntiObbyTrap.Field2468) {
                return;
            }
            if (this.Field2694.getValue() && this.Field2692) {
                return;
            }
            AutoTool.Method1178(a2.getPosition());
        }
    }

    private static void Method1178(BlockPos a) {
        Block a2 = AutoTool.mc.theWorld.getBlockState(a).getBlock();
        int a3 = AutoTool.Method1179(a2);
    }

    public static void Method258() {
        ItemSword a = null;
        int a2 = 0;
        int a3 = Class148.Method1445();
        if (a2 < 9) {
            ItemStack a4 = AutoTool.mc.thePlayer.inventory.mainInventory[a2];
            if (a4.getItem() == null) {
            }
            if (a4.getItem() instanceof ItemSword) {
                ItemSword a5 = (ItemSword)a4.getItem();
                a = a5;
                AutoTool.mc.thePlayer.inventory.currentItem = a2;
                if (a.getDamageVsEntity() > a5.getDamageVsEntity()) {
                }
                a = a5;
                AutoTool.mc.thePlayer.inventory.currentItem = a2;
            }
            ++a2;
        }
    }

    private static int Method1179(Block a) {
        float a2 = Float.NEGATIVE_INFINITY;
        int a3 = -1;
        for (int a4 = 0; a4 < 9; ++a4) {
            float f;
            ItemStack a5 = AutoTool.mc.thePlayer.inventory.mainInventory[a4];
            if (a5.getItem() == null) continue;
            float a6 = AutoTool.Method1180(a, a5);
            if (!(f > a2) || a6 == 1.0f) continue;
            a3 = a4;
            a2 = a6;
        }
        return a3;
    }

    public static float Method1180(Block a, ItemStack a2) {
        float a3 = a2.getStrVsBlock(a);
        int a4 = Block.getIdFromBlock((Block)a);
        if (a2.getUnlocalizedName().contains((CharSequence)"Stone") && (a4 == 14 || a4 == 129 || a4 == 56 || a4 == 74 || a4 == 73)) {
            return 5.0f;
        }
        if (!EnchantmentHelper.getEnchantments((ItemStack)a2).containsKey((Object)Enchantment.efficiency.effectId) || a3 == 1.0f) {
            return a3;
        }
        int a5 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.efficiency.effectId, (ItemStack)a2);
        return a3 + (float)(a5 * a5 + 1);
    }
}