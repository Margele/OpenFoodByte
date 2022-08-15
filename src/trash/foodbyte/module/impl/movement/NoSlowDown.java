/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemPotion
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C07PacketPlayerDigging
 *  net.minecraft.network.play.client.C07PacketPlayerDigging$Action
 *  net.minecraft.network.play.client.C08PacketPlayerBlockPlacement
 *  net.minecraft.network.play.client.C09PacketHeldItemChange
 *  net.minecraft.network.play.server.S30PacketWindowItems
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.EnumFacing
 */
package trash.foodbyte.module.impl.movement;

import awsl.Class167;
import awsl.Class749;
import awsl.Class91;
import eventapi.EventTarget;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.server.S30PacketWindowItems;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.Wrapper;
import trash.foodbyte.value.ModeValue;

public class NoSlowDown
extends Module {
    public ModeValue mode;
    private ItemStack[] itemStacks;

    public NoSlowDown() {
        boolean bl = Class167.Method1501();
        super("NoSlowDown", "No Slow Down", Category.MOVEMENT);
        boolean bl2 = bl;
        this.mode = new ModeValue("NoSlowDown", "Block Mode", "Vanilla", new String[]{"Vanilla", "NCP", "Hypixel"}, "\u653b\u51fb\u6a21\u5f0f{\u4e0d\u53d1\u5305,NCP\u53d1\u5305,Hypixel\u53d1\u5305}");
        if (Class91.Method3648() == null) {
            Class167.Method1499(false);
        }
    }

    @Override
    public String getDescription() {
        return "\u683c\u6321\u65e0\u51cf\u901f";
    }

    @EventTarget
    public void Method712(EventMotion a) {
        boolean bl = Class167.Method1501();
        if (this.mode.isCurrentMode("NCP") && NoSlowDown.mc.thePlayer.isBlocking() && Class749.Method1601() && NoSlowDown.mc.thePlayer.onGround && KillAura.Field2524 == null) {
            if (a.isPost()) {
                Wrapper.INSTANCE.Method2874((Packet)new C08PacketPlayerBlockPlacement(NoSlowDown.mc.thePlayer.inventory.getCurrentItem()));
            }
            Wrapper.INSTANCE.Method2874((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, new BlockPos(-1, -1, -1), EnumFacing.DOWN));
        }
        if (this.mode.isCurrentMode("Hypixel") && a.isPost() && this.Method713()) {
            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C09PacketHeldItemChange(NoSlowDown.mc.thePlayer.inventory.currentItem < 8 ? NoSlowDown.mc.thePlayer.inventory.currentItem + 1 : NoSlowDown.mc.thePlayer.inventory.currentItem - 1));
            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C09PacketHeldItemChange(NoSlowDown.mc.thePlayer.inventory.currentItem));
        }
    }

    @EventTarget
    public void Method273(EventPacket a) {
        boolean bl = Class167.Method1500();
        if (this.mode.isCurrentMode("Hypixel") && a.getPacket() instanceof S30PacketWindowItems && ((S30PacketWindowItems)a.getPacket()).func_148911_c() == 0) {
            this.itemStacks = ((S30PacketWindowItems)a.getPacket()).getItemStacks();
            if (this.itemStacks != null && this.itemStacks == ((S30PacketWindowItems)a.getPacket()).getItemStacks()) {
                if (this.Method713()) {
                    Wrapper.INSTANCE.Method2874((Packet)new C08PacketPlayerBlockPlacement(NoSlowDown.mc.thePlayer.inventory.getCurrentItem()));
                    a.setCancelled(true);
                }
                Wrapper.INSTANCE.Method2874((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, new BlockPos(-1, -1, -1), EnumFacing.DOWN));
            }
        }
    }

    public boolean Method713() {
        if (ModuleManager.getModule(KillAura.class).getState() && ReflectionUtils.Method2603() >= 520.0f) {
            return false;
        }
        if (ReflectionUtils.Method2603() > 0.0f && NoSlowDown.mc.thePlayer.getHeldItem().getItem() instanceof ItemSword) {
            return true;
        }
        return ReflectionUtils.Method2603() > 0.0f && (NoSlowDown.mc.thePlayer.getHeldItem().getItem() instanceof ItemFood || NoSlowDown.mc.thePlayer.getHeldItem().getItem() instanceof ItemPotion);
    }
}