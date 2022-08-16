/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.block.Block
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C07PacketPlayerDigging
 *  net.minecraft.network.play.client.C07PacketPlayerDigging$Action
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.world.World
 */
package trash.foodbyte.module.impl.world;

import awsl.Class448;
import awsl.Class636;
import eventapi.EventTarget;
import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import obfuscate.a;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class FastBreak
extends Module {
    public static ModeValue Field2322 = new ModeValue("FastBreak", "Mode", "Vanilla", new String[]{"Vanilla", "Packet", "FastPacket"}, "{\u666e\u901a\u6a21\u5f0f,\u53d1\u5305\u6a21\u5f0f,\u76f4\u63a5\u5feb\u901f\u53d1\u5305\u6a21\u5f0f}");
    public FloatValue Field2323 = new FloatValue("FastBreak", "Speed", 0.7, 0.1, 1.0, 0.1, "Vanilla\u6a21\u5f0f\u7684\u901f\u5ea6(\u8d8a\u4f4e\u8d8a\u5feb)");
    public FloatValue Field2324 = new FloatValue("FastBreak", "Packet Speed", 1.4, 1.0, 3.0, 0.1, "Packet\u6a21\u5f0f\u7684\u901f\u5ea6(\u8d8a\u9ad8\u8d8a\u5feb)");
    public BooleanValue Field2325 = new BooleanValue("FastBreak", "Fast Break Bed", (Boolean)true, "\u79d2\u7834\u5e8a");
    private boolean Field2326 = false;
    private float Field2327 = 0.0f;
    public BlockPos Field2328;
    public EnumFacing Field2329;

    public FastBreak() {
        super("FastBreak", "Fast Break", Category.WORLD);
    }

    @Override
    public String getDescription() {
        return "\u5feb\u901f\u6316\u6398";
    }

    @Override
    public void idk() {
        this.Field2324.Method2757(Field2322.isCurrentMode("Packet"));
        this.Field2323.Method2757(Field2322.isCurrentMode("Vanilla"));
    }

    @EventTarget
    public void Method232(EventUpdate a2) {
        this.setDisplayTag(Field2322.getMode());
        if (Field2322.isCurrentMode("Vanilla")) {
            if (ReflectionUtils.getCurBlockDamageMP() >= this.Field2323.getFloatValueCast()) {
                ReflectionUtils.setCurBlockDamageMP(1.0f);
            }
            ReflectionUtils.setBlockHitDelay(0);
        }
    }

    @EventTarget
    private void Method1543(Class636 a2) {
        Block a3;
        if (Field2322.isCurrentMode("FastPacket")) {
            a3 = FastBreak.mc.theWorld.getBlockState(a2.Method3583()).getBlock();
            int a4 = Block.getIdFromBlock((Block)a3);
            PlayerControllerMP a5 = FastBreak.mc.playerController;
            ReflectionUtils.setBlockHitDelay(0);
            if (a4 != 7) {
                Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK, a2.Method3583(), a2.Method3585()));
                Wrapper.INSTANCE.sendPacket((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK, a2.Method3583(), a2.Method3585()));
            }
        }
        if (this.Field2325.getValue() && (a3 = FastBreak.mc.theWorld.getBlockState(a2.Method3583()).getBlock()) == Blocks.bed) {
            if (ReflectionUtils.getCurBlockDamageMP() > 0.1f) {
                FastBreak.mc.theWorld.setBlockState(a2.Method3583(), Blocks.air.getDefaultState(), 11);
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK, a2.Method3583(), a2.Method3585()));
            }
            ReflectionUtils.setBlockHitDelay(0);
        }
    }

    @EventTarget
    public void Method273(EventPacket a2) {
        a[] a3 = Class448.Method2461();
        if (a2.isRecieve()) {
            return;
        }
        if (!Field2322.isCurrentMode("Packet")) {
            return;
        }
        if (a2.packet instanceof C07PacketPlayerDigging && !FastBreak.mc.playerController.extendedReach() && FastBreak.mc.playerController != null) {
            C07PacketPlayerDigging a4 = (C07PacketPlayerDigging)a2.packet;
            if (a4.getStatus() == C07PacketPlayerDigging.Action.START_DESTROY_BLOCK) {
                this.Field2326 = true;
                this.Field2328 = a4.getPosition();
                this.Field2329 = a4.getFacing();
                this.Field2327 = 0.0f;
            }
            if (a4.getStatus() == C07PacketPlayerDigging.Action.ABORT_DESTROY_BLOCK || a4.getStatus() == C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK) {
                this.Field2326 = false;
                this.Field2328 = null;
                this.Field2329 = null;
            }
        }
    }

    @EventTarget
    public void Method803(EventUpdate a2) {
        a[] a3 = Class448.Method2461();
        if (!Field2322.isCurrentMode("Packet")) {
            return;
        }
        if (FastBreak.mc.playerController.extendedReach()) {
            ReflectionUtils.setBlockHitDelay(0);
        }
        if (this.Field2326) {
            Block a4 = FastBreak.mc.theWorld.getBlockState(this.Field2328).getBlock();
            this.Field2327 += (float)((double)a4.getPlayerRelativeBlockHardness((EntityPlayer)FastBreak.mc.thePlayer, (World)FastBreak.mc.theWorld, this.Field2328) * (double)this.Field2324.getFloatValueCast());
            if (this.Field2327 >= 1.0f) {
                FastBreak.mc.theWorld.setBlockState(this.Field2328, Blocks.air.getDefaultState(), 11);
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK, this.Field2328, this.Field2329));
                this.Field2327 = 0.0f;
                this.Field2326 = false;
            }
        }
    }

    @Override
    public void onDisable() {
        this.Field2327 = 0.0f;
        this.Field2326 = false;
        this.Field2328 = null;
        this.Field2329 = null;
    }
}