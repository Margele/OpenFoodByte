/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.login.server.S02PacketLoginSuccess
 *  net.minecraft.network.play.client.C03PacketPlayer
 *  net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition
 *  net.minecraft.network.play.client.C03PacketPlayer$C05PacketPlayerLook
 *  net.minecraft.network.play.client.C03PacketPlayer$C06PacketPlayerPosLook
 *  net.minecraft.network.play.client.C0BPacketEntityAction
 *  net.minecraft.network.play.client.C0BPacketEntityAction$Action
 *  net.minecraft.network.play.server.S07PacketRespawn
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.MathHelper
 *  net.minecraft.world.World
 */
package trash.foodbyte.module.impl.player;

import awsl.Class148;
import eventapi.EventTarget;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import trash.foodbyte.event.EventMove;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.FloatValue;

public class Freecam
extends Module {
    private EntityOtherPlayerMP Field2739;
    public FloatValue Field2740 = new FloatValue("Freecam", "Speed", 1.0, 1.0, 10.0, 1.0, "\u79fb\u52a8\u901f\u5ea6");
    private double Field2741;
    private double Field2742;
    private double Field2743;
    private int Field2744 = 0;

    public Freecam() {
        super("Freecam", Category.PLAYER);
    }

    @Override
    public String getDescription() {
        return "\u7075\u9b42\u51fa\u7a8d(2022\u5df2\u4fee\u590dhypixel\u72d7ban)";
    }

    @EventTarget
    public void Method273(EventPacket a) {
        C0BPacketEntityAction a2;
        if (a.isRecieve() && (a.getPacket() instanceof S07PacketRespawn || a.getPacket() instanceof S02PacketLoginSuccess)) {
            this.setState(false);
        }
        if (a.isRecieve()) {
            return;
        }
        if (a.getPacket() instanceof C03PacketPlayer.C06PacketPlayerPosLook || a.getPacket() instanceof C03PacketPlayer.C04PacketPlayerPosition || a.getPacket() instanceof C03PacketPlayer.C05PacketPlayerLook) {
            a.setCancelled(true);
            Wrapper.INSTANCE.sendPacket((Packet)new C03PacketPlayer(this.Field2739.onGround));
        } else if (a.getPacket() instanceof C03PacketPlayer) {
            C03PacketPlayer a3 = (C03PacketPlayer)a.getPacket();
            ++this.Field2744;
            if (this.Field2744 > 20) {
                a.setCancelled(true);
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C03PacketPlayer.C04PacketPlayerPosition(this.Field2739.posX, this.Field2739.posY, this.Field2739.posZ, this.Field2739.onGround));
                this.Field2744 = 0;
            }
        } else if (a.getPacket() instanceof C0BPacketEntityAction && ((a2 = (C0BPacketEntityAction)a.getPacket()).getAction() == C0BPacketEntityAction.Action.START_SPRINTING || a2.getAction() == C0BPacketEntityAction.Action.STOP_SPRINTING)) {
            a.setCancelled(true);
        }
    }

    @EventTarget
    public void Method274(EventMove a) {
        int a2 = Class148.Method1444();
        if (a.isLocalPlayer().booleanValue()) {
            this.Field2739.setSneaking(Freecam.mc.thePlayer.isSneaking());
            Freecam.mc.thePlayer.noClip = true;
            Freecam.mc.thePlayer.onGround = this.Field2739.onGround;
            float a3 = this.Field2740.getFloatValue().floatValue();
            if (Freecam.mc.thePlayer.movementInput.jump) {
                Freecam.mc.thePlayer.motionY = a3;
                a.setY(Freecam.mc.thePlayer.motionY);
            }
            if (Freecam.mc.thePlayer.movementInput.sneak) {
                Freecam.mc.thePlayer.motionY = -a3;
                a.setY(Freecam.mc.thePlayer.motionY);
            }
            Freecam.mc.thePlayer.motionY = 0.0;
            a.setY(0.0);
            a3 = (float)Math.max((double)a3, (double)Freecam.Method275());
            double a4 = Freecam.mc.thePlayer.movementInput.moveForward;
            double a5 = Freecam.mc.thePlayer.movementInput.moveStrafe;
            float a6 = Freecam.mc.thePlayer.rotationYaw;
            if (a4 == 0.0 && a5 == 0.0) {
                a.setX(0.0);
                a.setZ(0.0);
            }
            if (a4 != 0.0) {
                if (a5 > 0.0) {
                    a5 = 1.0;
                    a6 += (float)(a4 > 0.0 ? -45 : 45);
                }
                if (a5 < 0.0) {
                    a6 += (float)(a4 > 0.0 ? 45 : -45);
                }
                a5 = 0.0;
                if (a4 > 0.0) {
                    a4 = 1.0;
                }
                a4 = -1.0;
            }
            a.setX(a4 * (double)a3 * Math.cos((double)Math.toRadians((double)(a6 + 90.0f))) + a5 * (double)a3 * Math.sin((double)Math.toRadians((double)(a6 + 90.0f))));
            a.setZ(a4 * (double)a3 * Math.sin((double)Math.toRadians((double)(a6 + 90.0f))) - a5 * (double)a3 * Math.cos((double)Math.toRadians((double)(a6 + 90.0f))));
        }
    }

    public static double Method275() {
        double a = 0.2873;
        if (Freecam.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
            int a2 = Freecam.mc.thePlayer.getActivePotionEffect(Potion.moveSpeed).getAmplifier();
            a *= 1.0 + 0.2 * (double)(a2 + 1);
        }
        return a;
    }

    public float Method276() {
        float a = Freecam.mc.thePlayer.rotationYaw;
        float a2 = Freecam.mc.thePlayer.moveForward;
        float a3 = Freecam.mc.thePlayer.moveStrafing;
        a += (float)(a2 < 0.0f ? 180 : 0);
        if (a3 < 0.0f) {
            a += a2 < 0.0f ? -45.0f : (a2 == 0.0f ? 90.0f : 45.0f);
        }
        if (a3 > 0.0f) {
            a -= a2 < 0.0f ? -45.0f : (a2 == 0.0f ? 90.0f : 45.0f);
        }
        return a * ((float)Math.PI / 180);
    }

    public void Method277(double a) {
        Freecam.mc.thePlayer.motionX = (double)(-MathHelper.sin((float)this.Method276())) * a;
        Freecam.mc.thePlayer.motionZ = (double)MathHelper.cos((float)this.Method276()) * a;
    }

    @Override
    public void onEnable() {
        if (!this.Method1026()) {
            this.Field2739 = null;
            this.setState(false);
            return;
        }
        if (!this.Method1026()) {
            return;
        }
        Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0BPacketEntityAction((Entity)Freecam.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SPRINTING));
        this.Field2744 = 0;
        this.Field2739 = new EntityOtherPlayerMP((World)Freecam.mc.theWorld, Freecam.mc.thePlayer.getGameProfile());
        this.Field2739.clonePlayer((EntityPlayer)Freecam.mc.thePlayer, true);
        this.Field2739.setLocationAndAngles(Freecam.mc.thePlayer.posX, Freecam.mc.thePlayer.posY, Freecam.mc.thePlayer.posZ, Freecam.mc.thePlayer.rotationYaw, Freecam.mc.thePlayer.rotationPitch);
        this.Field2739.rotationYawHead = Freecam.mc.thePlayer.rotationYawHead;
        this.Field2739.setEntityId(-1337);
        this.Field2739.setSneaking(Freecam.mc.thePlayer.isSneaking());
        this.Field2739.onGround = Freecam.mc.thePlayer.onGround;
        Freecam.mc.theWorld.addEntityToWorld(this.Field2739.getEntityId(), (Entity)this.Field2739);
        this.Field2741 = Freecam.mc.thePlayer.posX;
        this.Field2742 = Freecam.mc.thePlayer.posY;
        this.Field2743 = Freecam.mc.thePlayer.posZ;
    }

    @Override
    public void onDisable() {
        if (!this.Method1026()) {
            return;
        }
        if (this.Field2739 == null) {
            return;
        }
        this.Method277(0.0);
        Freecam.mc.thePlayer.setLocationAndAngles(this.Field2739.posX, this.Field2739.posY, this.Field2739.posZ, this.Field2739.rotationYaw, this.Field2739.rotationPitch);
        Freecam.mc.thePlayer.rotationYawHead = this.Field2739.rotationYawHead;
        Freecam.mc.theWorld.removeEntityFromWorld(this.Field2739.getEntityId());
        Freecam.mc.thePlayer.setSneaking(this.Field2739.isSneaking());
        this.Field2739 = null;
        Freecam.mc.thePlayer.setPosition(this.Field2741, this.Field2742, this.Field2743);
        Freecam.mc.thePlayer.capabilities.isFlying = false;
        Freecam.mc.thePlayer.noClip = false;
        Freecam.mc.theWorld.removeEntityFromWorld(-1);
        Freecam.mc.renderGlobal.loadRenderers();
    }
}