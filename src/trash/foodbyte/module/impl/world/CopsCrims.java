/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C08PacketPlayerBlockPlacement
 *  net.minecraft.network.play.client.C0BPacketEntityAction
 *  net.minecraft.network.play.client.C0BPacketEntityAction$Action
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.World
 */
package trash.foodbyte.module.impl.world;

import awsl.Class305;
import awsl.Class448;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C0BPacketEntityAction;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import obfuscate.a;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class CopsCrims
extends Module {
    public ModeValue Field2306 = new ModeValue("CopsCrims", "Aim Mode", "Head", new String[]{"Head", "Neck", "Chest", "Jimmies", "Legs", "Feet"}, "\u7784\u51c6\u90e8\u4f4d{\u5934\u3001\u9888\u3001\u80f8\u3001JJ\u3001\u817f\u3001\u811a}");
    public FloatValue Field2307 = new FloatValue("CopsCrims", "Delay", 7.0, 0.0, 35.0, 1.0, "\u5ef6\u8fdf");
    public FloatValue Field2308 = new FloatValue("CopsCrims", "Fov", 360.0, 1.0, 360.0, 1.0, "\u7784\u51c6\u89c6\u89d2");
    public FloatValue Field2309 = new FloatValue("CopsCrims", "HRecoil", 0.1, 0.1, 2.0, 0.1, "\u63a7\u5236\u540e\u5750\u529b\u6c34\u5e73\u7784\u51c6\u5de6\u53f3\u79fb\u52a8");
    public FloatValue Field2310 = new FloatValue("CopsCrims", "VRecoil", 0.5, 0.1, 2.0, 0.1, "\u63a7\u5236\u540e\u5750\u529b\u6c34\u5e73\u7784\u51c6\u4e0a\u4e0b\u79fb\u52a8");
    public BooleanValue Field2311 = new BooleanValue("CopsCrims", "No Spread", (Boolean)true, "\u4e0d\u6269\u6563");
    public BooleanValue Field2312 = new BooleanValue("CopsCrims", "Rcs", (Boolean)false, "\u540e\u5750\u529b\u63a7\u5236\u7cfb\u7edf");
    public BooleanValue Field2313 = new BooleanValue("CopsCrims", "Silent", (Boolean)true, "");
    public BooleanValue Field2314 = new BooleanValue("CopsCrims", "Auto Shoot", (Boolean)true, "\u81ea\u52a8\u5c04\u51fb");
    private float Field2315;
    private float Field2316;
    public int Field2317;
    public int Field2318;
    private EntityPlayer Field2319;
    public int Field2320 = 10;
    private Map Field2321 = new HashMap();

    public CopsCrims() {
        super("CopsCrims", "Cops Crims", Category.WORLD);
    }

    @Override
    public String getDescription() {
        return "\u8b66\u5bdf\u4e0e\u52ab\u532a\u5c0f\u6e38\u620f\u81ea\u7784";
    }

    @EventTarget
    public void Method273(EventPacket a) {
        if (a.isRecieve() && this.Field2312.getBooleanValue().booleanValue() && a.getPacket() instanceof C08PacketPlayerBlockPlacement) {
            ++this.Field2317;
        }
    }

    @EventTarget
    private void Method712(EventMotion a2) {
        block28: {
            block29: {
                block31: {
                    Object a3;
                    block30: {
                        Object a4;
                        a[] a5 = Class448.Method2461();
                        if (!a2.isPre()) break block28;
                        if (this.Field2313.getBooleanValue().booleanValue()) {
                            this.Field2315 = CopsCrims.mc.thePlayer.rotationPitch;
                            this.Field2316 = CopsCrims.mc.thePlayer.rotationYaw;
                        }
                        double a6 = Double.NEGATIVE_INFINITY;
                        this.Field2319 = null;
                        Iterator iterator = CopsCrims.mc.theWorld.playerEntities.Method1383();
                        if (iterator.Method932()) {
                            a4 = iterator.Method933();
                            a3 = (EntityPlayer)a4;
                            if (!a3.equals((Object)CopsCrims.mc.thePlayer) && !Class305.Method698(a3.getName()) && a3.ticksExisted >= 40 && !a3.isInvisible() && CopsCrims.mc.thePlayer.canEntityBeSeen((Entity)a3) && !Class305.Method704((Entity)a3) && this.Method817((EntityLivingBase)a3, this.Field2308.getFloatValue().floatValue())) {
                                if (this.Field2319 == null) {
                                    this.Field2319 = a3;
                                    a6 = this.Method1667((EntityPlayer)a3);
                                }
                                if (this.Method1667((EntityPlayer)a3) <= a6) {
                                }
                                this.Field2319 = a3;
                                a6 = this.Method1667((EntityPlayer)a3);
                            }
                        }
                        if ((iterator = this.Field2321.keySet().Method1383()).Method932()) {
                            a4 = (EntityPlayer)iterator.Method933();
                            if (!CopsCrims.mc.theWorld.playerEntities.contains(a4)) {
                                this.Field2321.remove(a4);
                            }
                        }
                        if ((iterator = CopsCrims.mc.theWorld.playerEntities.Method1383()).Method932()) {
                            a4 = iterator.Method933();
                            a3 = (EntityPlayer)a4;
                            this.Field2321.putIfAbsent(a3, (Object)new ArrayList());
                            List a7 = (List)this.Field2321.Method2665(a3);
                            a7.Method2530((Object)new Vec3(a3.posX, a3.posY, a3.posZ));
                            if (a7.Method1799() > this.Field2320) {
                                int a8 = 0;
                                Iterator iterator2 = new ArrayList((Collection)a7).Method1383();
                                if (iterator2.Method932()) {
                                    Vec3 a9 = (Vec3)iterator2.Method933();
                                    if (a8 < a7.Method1799() - this.Field2320) {
                                        a7.remove(a7.get(a8));
                                    }
                                    ++a8;
                                }
                            }
                        }
                        if (this.Field2319 == null) break block29;
                        if (this.Field2312.getBooleanValue().booleanValue() && this.Field2317 >= 30) {
                            this.Field2317 = 0;
                        }
                        ++this.Field2318;
                        Entity a10 = this.Method1668(this.Field2319);
                        float a11 = 0.0f;
                        if (this.Field2306.isCurrentMode("Head")) {
                            a11 = -0.2f;
                        }
                        if (this.Field2306.isCurrentMode("Neck")) {
                            a11 = 0.1f;
                        }
                        if (this.Field2306.isCurrentMode("Chest")) {
                            a11 = 0.4f;
                        }
                        if (this.Field2306.isCurrentMode("Jimmies")) {
                            a11 = 0.85f;
                        }
                        if (this.Field2306.isCurrentMode("Legs")) {
                            a11 = 1.0f;
                        }
                        if (this.Field2306.isCurrentMode("Feet")) {
                            a11 = 1.5f;
                        }
                        a3 = this.Method1670((Entity)CopsCrims.mc.thePlayer, a10.posX, a10.posY + (double)this.Field2319.getEyeHeight() - (double)a11, a10.posZ);
                        if (!this.Field2312.getBooleanValue().booleanValue()) break block30;
                        CopsCrims.mc.thePlayer.rotationYaw = (float)a3[0];
                        CopsCrims.mc.thePlayer.rotationPitch = (float)(a3[1] + this.Field2310.getFloatValue().floatValue() * (float)this.Field2317);
                        if (this.Field2317 >= 10) {
                            CopsCrims.mc.thePlayer.rotationYaw = (float)(a3[0] - this.Field2309.getFloatValue().floatValue() * (float)this.Field2317);
                        }
                        if (this.Field2317 < 20) break block31;
                        CopsCrims.mc.thePlayer.rotationYaw = (float)(a3[0] + this.Field2309.getFloatValue().floatValue() * (float)this.Field2317);
                    }
                    CopsCrims.mc.thePlayer.rotationYaw = (float)a3[0];
                    CopsCrims.mc.thePlayer.rotationPitch = (float)a3[1];
                }
                if ((float)this.Field2318 >= this.Field2307.getFloatValue().floatValue()) {
                    if (this.Field2311.getBooleanValue().booleanValue()) {
                        Wrapper.INSTANCE.sendPacket((Packet)new C0BPacketEntityAction((Entity)CopsCrims.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SNEAKING));
                    }
                    if (this.Field2314.getBooleanValue().booleanValue() && CopsCrims.mc.thePlayer.inventory.getCurrentItem() != null) {
                        CopsCrims.mc.playerController.sendUseItem((EntityPlayer)CopsCrims.mc.thePlayer, (World)CopsCrims.mc.theWorld, CopsCrims.mc.thePlayer.inventory.getCurrentItem());
                    }
                    if (this.Field2311.getBooleanValue().booleanValue()) {
                        Wrapper.INSTANCE.sendPacket((Packet)new C0BPacketEntityAction((Entity)CopsCrims.mc.thePlayer, C0BPacketEntityAction.Action.START_SNEAKING));
                    }
                    this.Field2318 = 0;
                }
                break block28;
            }
            --this.Field2317;
            if (this.Field2317 <= 0) {
                this.Field2317 = 0;
            }
        }
        CopsCrims.mc.thePlayer.rotationPitch = this.Field2315;
        CopsCrims.mc.thePlayer.rotationYaw = this.Field2316;
    }

    public double Method1667(EntityPlayer a2) {
        double a3 = -CopsCrims.mc.thePlayer.getDistanceToEntity((Entity)a2);
        if (a2.lastTickPosX == a2.posX && a2.lastTickPosY == a2.posY && a2.lastTickPosZ == a2.posZ) {
            a3 += 200.0;
        }
        return a3 -= (double)(a2.getDistanceToEntity((Entity)CopsCrims.mc.thePlayer) / 5.0f);
    }

    private Entity Method1668(EntityPlayer a2) {
        int a3 = (int)Math.ceil((double)((double)mc.getNetHandler().getPlayerInfo(CopsCrims.mc.thePlayer.getUniqueID()).getResponseTime() / 50.0));
        return this.Method1669(a2, a3);
    }

    public Entity Method1669(EntityPlayer a2, int a3) {
        List a4;
        if (this.Field2321.containsKey((Object)a2) && (a4 = (List)this.Field2321.Method2665((Object)a2)).Method1799() > 1) {
            Vec3 a5 = (Vec3)a4.get(0);
            ArrayList a6 = new ArrayList();
            Vec3 a7 = a5;
            Iterator iterator = a4.Method1383();
            while (iterator.Method932()) {
                Vec3 a8 = (Vec3)iterator.Method933();
                a6.Method2530((Object)new Vec3(a8.xCoord - a7.xCoord, a8.yCoord - a7.yCoord, a8.zCoord - a7.zCoord));
                a7 = a8;
            }
            double a9 = 0.0;
            double a10 = 0.0;
            double a11 = 0.0;
            Iterator iterator2 = a6.Method1383();
            while (iterator2.Method932()) {
                Vec3 a12 = (Vec3)iterator2.Method933();
                a9 += a12.xCoord;
                a10 += a12.yCoord;
                a11 += a12.zCoord;
            }
            a9 /= (double)a6.Method1799();
            a10 /= (double)a6.Method1799();
            a11 /= (double)a6.Method1799();
            EntityOtherPlayerMP a13 = new EntityOtherPlayerMP((World)CopsCrims.mc.theWorld, a2.getGameProfile());
            a13.noClip = false;
            a13.setPosition(a2.posX, a2.posY, a2.posZ);
            for (int a14 = 0; a14 < a3; ++a14) {
                a13.moveEntity(a9, a10, a11);
            }
            return a13;
        }
        return a2;
    }

    private final float[] Method1670(Entity a2, double a3, double a4, double a5) {
        double a6 = a3 - a2.posX;
        double a7 = a4 - a2.posY - (double)a2.getEyeHeight() - 0.1;
        double a8 = a5 - a2.posZ;
        double a9 = a8 < 0.0 && a6 < 0.0 ? 90.0 + Math.toDegrees((double)Math.atan((double)(a8 / a6))) : (a8 < 0.0 && a6 > 0.0 ? -90.0 + Math.toDegrees((double)Math.atan((double)(a8 / a6))) : Math.toDegrees((double)(-Math.atan((double)(a6 / a8)))));
        double a10 = Math.sqrt((double)(a6 * a6 + a8 * a8));
        double a11 = -Math.toDegrees((double)Math.atan((double)(a7 / a10)));
        a9 = CopsCrims.Method1671((float)a9);
        a11 = CopsCrims.Method1671((float)a11);
        return new float[]{(float)a9, (float)a11};
    }

    private static float Method1671(float a2) {
        a2 %= 360.0f;
        while (a2 >= 180.0f) {
            a2 -= 360.0f;
        }
        while (a2 < -180.0f) {
            a2 += 360.0f;
        }
        return a2;
    }

    public boolean Method817(EntityLivingBase a2, float a3) {
        a3 = (float)((double)a3 * 0.5);
        double a4 = (((double)CopsCrims.mc.thePlayer.rotationYaw - this.Method818(a2)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
        return a4 > 0.0 && a4 < (double)a3 || (double)(-a3) < a4 && a4 < 0.0;
    }

    public double[] Method818(EntityLivingBase a2) {
        double a3 = a2.posX - CopsCrims.mc.thePlayer.posX;
        double a4 = a2.posY - CopsCrims.mc.thePlayer.posY;
        double a5 = a2.posZ - CopsCrims.mc.thePlayer.posZ;
        double a6 = -(Math.atan2((double)a3, (double)a5) * 57.29577951308232);
        double a7 = -(Math.asin((double)(a4 /= (double)CopsCrims.mc.thePlayer.getDistanceToEntity((Entity)a2))) * 57.29577951308232);
        return new double[]{a6, a7};
    }
}