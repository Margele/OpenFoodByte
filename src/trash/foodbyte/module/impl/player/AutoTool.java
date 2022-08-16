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
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.player.AntiObbyTrap;
import trash.foodbyte.reflections.ReflectionUtils;
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
    public void Method801(EventTickUpdate a2) {
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
        if (ReflectionUtils.getItemInUseCount() > 0.0f && AutoTool.mc.thePlayer.getHeldItem().getItem() instanceof ItemFood) {
            this.Field2692 = true;
        }
        this.Field2692 = false;
    }

    @EventTarget
    public void Method273(EventPacket a2) {
        if (a2.isRecieve()) {
            return;
        }
        if (!(a2.getPacket() instanceof C07PacketPlayerDigging)) {
            return;
        }
        C07PacketPlayerDigging a3 = (C07PacketPlayerDigging)a2.getPacket();
        if (a3.getStatus() == C07PacketPlayerDigging.Action.START_DESTROY_BLOCK) {
            if (this.Field2693.getValue() && this.Field2691 && !AntiObbyTrap.Field2468) {
                return;
            }
            if (this.Field2694.getValue() && this.Field2692) {
                return;
            }
            AutoTool.Method1178(a3.getPosition());
        }
    }

    private static void Method1178(BlockPos a2) {
        Block a3 = AutoTool.mc.theWorld.getBlockState(a2).getBlock();
        int a4 = AutoTool.Method1179(a3);
    }

    public static void Method258() {
        ItemSword a2 = null;
        int a3 = 0;
        int a4 = Class148.Method1445();
        if (a3 < 9) {
            ItemStack a5 = AutoTool.mc.thePlayer.inventory.mainInventory[a3];
            if (a5.getItem() == null) {
            }
            if (a5.getItem() instanceof ItemSword) {
                ItemSword a6 = (ItemSword)a5.getItem();
                a2 = a6;
                AutoTool.mc.thePlayer.inventory.currentItem = a3;
                if (a2.getDamageVsEntity() > a6.getDamageVsEntity()) {
                }
                a2 = a6;
                AutoTool.mc.thePlayer.inventory.currentItem = a3;
            }
            ++a3;
        }
    }

    private static int Method1179(Block a2) {
        float a3 = Float.NEGATIVE_INFINITY;
        int a4 = -1;
        for (int a5 = 0; a5 < 9; ++a5) {
            float f;
            ItemStack a6 = AutoTool.mc.thePlayer.inventory.mainInventory[a5];
            if (a6.getItem() == null) continue;
            float a7 = AutoTool.Method1180(a2, a6);
            if (!(f > a3) || a7 == 1.0f) continue;
            a4 = a5;
            a3 = a7;
        }
        return a4;
    }

    public static float Method1180(Block a2, ItemStack a3) {
        float a4 = a3.getStrVsBlock(a2);
        int a5 = Block.getIdFromBlock((Block)a2);
        if (a3.getUnlocalizedName().contains((CharSequence)"Stone") && (a5 == 14 || a5 == 129 || a5 == 56 || a5 == 74 || a5 == 73)) {
            return 5.0f;
        }
        if (!EnchantmentHelper.getEnchantments((ItemStack)a3).containsKey((Object)Enchantment.efficiency.effectId) || a4 == 1.0f) {
            return a4;
        }
        int a6 = EnchantmentHelper.getEnchantmentLevel((int)Enchantment.efficiency.effectId, (ItemStack)a3);
        return a4 + (float)(a6 * a6 + 1);
    }
}