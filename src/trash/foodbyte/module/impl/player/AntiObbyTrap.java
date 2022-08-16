/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C07PacketPlayerDigging
 *  net.minecraft.network.play.client.C07PacketPlayerDigging$Action
 *  net.minecraft.network.play.client.C0APacketAnimation
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.EnumFacing
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import eventapi.EventTarget;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.player.Freecam;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.BooleanValue;

public class AntiObbyTrap
extends Module {
    public BooleanValue Field2466 = new BooleanValue("AntiObbyTrap", "Anti Sand Trap", (Boolean)true, "UHC\u88ab\u5361\u6c99\u5b50\u81ea\u52a8\u9003\u8131");
    public BooleanValue Field2467 = new BooleanValue("AntiObbyTrap", "No Swing", (Boolean)false, "\u88ab\u5361\u9ed1\u66dc\u77f3\u4e0d\u6325\u624b\u6316\u811a\u4e0b\u65b9\u5757");
    public static boolean Field2468 = false;

    public AntiObbyTrap() {
        super("AntiObbyTrap", "Anti Obby Trap", Category.PLAYER);
    }

    @Override
    public String getDescription() {
        return "\u9632\u5361\u9ed1\u66dc\u77f3";
    }

    @EventTarget
    public void Method712(EventMotion a) {
        int a2 = Class148.Method1445();
        if (a.isPost()) {
            return;
        }
        if (ModuleManager.getModule(Freecam.class).getState()) {
            return;
        }
        Field2468 = false;
        Block a3 = AntiObbyTrap.mc.theWorld.getBlockState(new BlockPos(AntiObbyTrap.mc.thePlayer.posX, AntiObbyTrap.mc.thePlayer.posY + 1.0, AntiObbyTrap.mc.thePlayer.posZ)).getBlock();
        Block a4 = AntiObbyTrap.mc.theWorld.getBlockState(new BlockPos(AntiObbyTrap.mc.thePlayer.posX, AntiObbyTrap.mc.thePlayer.posY - 1.0, AntiObbyTrap.mc.thePlayer.posZ)).getBlock();
        Block a5 = AntiObbyTrap.mc.theWorld.getBlockState(new BlockPos(AntiObbyTrap.mc.thePlayer.posX + 1.0, AntiObbyTrap.mc.thePlayer.posY + 1.0, AntiObbyTrap.mc.thePlayer.posZ)).getBlock();
        Block a6 = AntiObbyTrap.mc.theWorld.getBlockState(new BlockPos(AntiObbyTrap.mc.thePlayer.posX + 1.0, AntiObbyTrap.mc.thePlayer.posY, AntiObbyTrap.mc.thePlayer.posZ)).getBlock();
        BlockPos a7 = new BlockPos(AntiObbyTrap.mc.thePlayer.posX, AntiObbyTrap.mc.thePlayer.posY - 1.0, AntiObbyTrap.mc.thePlayer.posZ);
        BlockPos a8 = new BlockPos(AntiObbyTrap.mc.thePlayer.posX + 1.0, AntiObbyTrap.mc.thePlayer.posY + 1.0, AntiObbyTrap.mc.thePlayer.posZ);
        BlockPos a9 = new BlockPos(AntiObbyTrap.mc.thePlayer.posX + 1.0, AntiObbyTrap.mc.thePlayer.posY, AntiObbyTrap.mc.thePlayer.posZ);
        if (a4 != Blocks.air && a4 != Blocks.bedrock && a4 != Blocks.obsidian && a3 == Blocks.obsidian && AntiObbyTrap.mc.thePlayer.hurtTime > 8) {
            Field2468 = true;
            this.Method1699(a7, EnumFacing.DOWN);
        }
        if (a4 != Blocks.air && (a4 == Blocks.bedrock || a4 == Blocks.obsidian) && a3 == Blocks.obsidian && AntiObbyTrap.mc.thePlayer.hurtTime > 8) {
            if (a6 != Blocks.air) {
                Field2468 = true;
                this.Method1699(a9, EnumFacing.EAST);
            }
            if (a5 != Blocks.air) {
                Field2468 = true;
                a.setPitch(90.0f);
                this.Method1699(a8, EnumFacing.UP);
            }
        }
    }

    @EventTarget
    public void Method955(EventMotion a) {
        Block a2;
        if (a.isPost()) {
            return;
        }
        if (ModuleManager.getModule(Freecam.class).getState()) {
            return;
        }
        Field2468 = false;
        BlockPos a3 = new BlockPos(AntiObbyTrap.mc.thePlayer.posX, AntiObbyTrap.mc.thePlayer.posY, AntiObbyTrap.mc.thePlayer.posZ);
        Block a4 = AntiObbyTrap.mc.theWorld.getBlockState(a3.up()).getBlock();
        if (a4 == Blocks.gravel || a4 == Blocks.sand) {
            a3 = new BlockPos(AntiObbyTrap.mc.thePlayer.posX, AntiObbyTrap.mc.thePlayer.posY + 1.0, AntiObbyTrap.mc.thePlayer.posZ);
        }
        if ((a2 = AntiObbyTrap.mc.theWorld.getBlockState(a3).getBlock()) == Blocks.gravel || a2 == Blocks.sand) {
            Field2468 = false;
            if (this.Field2466.getValue()) {
                a.setPitch(90.0f);
                this.Method1699(a3, EnumFacing.UP);
            }
        }
    }

    public void Method1699(BlockPos a, EnumFacing a2) {
        int n = Class148.Method1444();
        if (this.Field2467.getValue()) {
            Wrapper.INSTANCE.sendPacket((Packet)new C0APacketAnimation());
        }
        AntiObbyTrap.mc.thePlayer.swingItem();
        Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.START_DESTROY_BLOCK, a, a2));
        Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK, a, a2));
        Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.START_DESTROY_BLOCK, a, a2));
    }
}