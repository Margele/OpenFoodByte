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
import awsl.Class91;
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
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.Wrapper;
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
        if (a.isRecieve() && this.Field2312.Method2509().booleanValue() && a.getPacket() instanceof C08PacketPlayerBlockPlacement) {
            ++this.Field2317;
        }
    }

    @EventTarget
    private void Method712(EventMotion a) {
        block28: {
            block29: {
                block31: {
                    Object a2;
                    block30: {
                        Object a3;
                        Class91[] a4 = Class448.Method2461();
                        if (!a.isPre()) break block28;
                        if (this.Field2313.Method2509().booleanValue()) {
                            this.Field2315 = CopsCrims.mc.thePlayer.rotationPitch;
                            this.Field2316 = CopsCrims.mc.thePlayer.rotationYaw;
                        }
                        double a5 = Double.NEGATIVE_INFINITY;
                        this.Field2319 = null;
                        Iterator iterator = CopsCrims.mc.theWorld.playerEntities.Method1383();
                        if (iterator.Method932()) {
                            a3 = iterator.Method933();
                            a2 = (EntityPlayer)a3;
                            if (!a2.equals((Object)CopsCrims.mc.thePlayer) && !Class305.Method698(a2.getName()) && a2.ticksExisted >= 40 && !a2.isInvisible() && CopsCrims.mc.thePlayer.canEntityBeSeen((Entity)a2) && !Class305.Method704((Entity)a2) && this.Method817((EntityLivingBase)a2, this.Field2308.Method2744().floatValue())) {
                                if (this.Field2319 == null) {
                                    this.Field2319 = a2;
                                    a5 = this.Method1667((EntityPlayer)a2);
                                }
                                if (this.Method1667((EntityPlayer)a2) <= a5) {
                                }
                                this.Field2319 = a2;
                                a5 = this.Method1667((EntityPlayer)a2);
                            }
                        }
                        if ((iterator = this.Field2321.keySet().Method1383()).Method932()) {
                            a3 = (EntityPlayer)iterator.Method933();
                            if (!CopsCrims.mc.theWorld.playerEntities.contains(a3)) {
                                this.Field2321.remove(a3);
                            }
                        }
                        if ((iterator = CopsCrims.mc.theWorld.playerEntities.Method1383()).Method932()) {
                            a3 = iterator.Method933();
                            a2 = (EntityPlayer)a3;
                            this.Field2321.putIfAbsent(a2, (Object)new ArrayList());
                            List a6 = (List)this.Field2321.Method2665(a2);
                            a6.Method2530((Object)new Vec3(a2.posX, a2.posY, a2.posZ));
                            if (a6.Method1799() > this.Field2320) {
                                int a7 = 0;
                                Iterator iterator2 = new ArrayList((Collection)a6).Method1383();
                                if (iterator2.Method932()) {
                                    Vec3 a8 = (Vec3)iterator2.Method933();
                                    if (a7 < a6.Method1799() - this.Field2320) {
                                        a6.remove(a6.get(a7));
                                    }
                                    ++a7;
                                }
                            }
                        }
                        if (this.Field2319 == null) break block29;
                        if (this.Field2312.Method2509().booleanValue() && this.Field2317 >= 30) {
                            this.Field2317 = 0;
                        }
                        ++this.Field2318;
                        Entity a9 = this.Method1668(this.Field2319);
                        float a10 = 0.0f;
                        if (this.Field2306.isCurrentMode("Head")) {
                            a10 = -0.2f;
                        }
                        if (this.Field2306.isCurrentMode("Neck")) {
                            a10 = 0.1f;
                        }
                        if (this.Field2306.isCurrentMode("Chest")) {
                            a10 = 0.4f;
                        }
                        if (this.Field2306.isCurrentMode("Jimmies")) {
                            a10 = 0.85f;
                        }
                        if (this.Field2306.isCurrentMode("Legs")) {
                            a10 = 1.0f;
                        }
                        if (this.Field2306.isCurrentMode("Feet")) {
                            a10 = 1.5f;
                        }
                        a2 = this.Method1670((Entity)CopsCrims.mc.thePlayer, a9.posX, a9.posY + (double)this.Field2319.getEyeHeight() - (double)a10, a9.posZ);
                        if (!this.Field2312.Method2509().booleanValue()) break block30;
                        CopsCrims.mc.thePlayer.rotationYaw = (float)a2[0];
                        CopsCrims.mc.thePlayer.rotationPitch = (float)(a2[1] + this.Field2310.Method2744().floatValue() * (float)this.Field2317);
                        if (this.Field2317 >= 10) {
                            CopsCrims.mc.thePlayer.rotationYaw = (float)(a2[0] - this.Field2309.Method2744().floatValue() * (float)this.Field2317);
                        }
                        if (this.Field2317 < 20) break block31;
                        CopsCrims.mc.thePlayer.rotationYaw = (float)(a2[0] + this.Field2309.Method2744().floatValue() * (float)this.Field2317);
                    }
                    CopsCrims.mc.thePlayer.rotationYaw = (float)a2[0];
                    CopsCrims.mc.thePlayer.rotationPitch = (float)a2[1];
                }
                if ((float)this.Field2318 >= this.Field2307.Method2744().floatValue()) {
                    if (this.Field2311.Method2509().booleanValue()) {
                        Wrapper.INSTANCE.Method2874((Packet)new C0BPacketEntityAction((Entity)CopsCrims.mc.thePlayer, C0BPacketEntityAction.Action.STOP_SNEAKING));
                    }
                    if (this.Field2314.Method2509().booleanValue() && CopsCrims.mc.thePlayer.inventory.getCurrentItem() != null) {
                        CopsCrims.mc.playerController.sendUseItem((EntityPlayer)CopsCrims.mc.thePlayer, (World)CopsCrims.mc.theWorld, CopsCrims.mc.thePlayer.inventory.getCurrentItem());
                    }
                    if (this.Field2311.Method2509().booleanValue()) {
                        Wrapper.INSTANCE.Method2874((Packet)new C0BPacketEntityAction((Entity)CopsCrims.mc.thePlayer, C0BPacketEntityAction.Action.START_SNEAKING));
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

    public double Method1667(EntityPlayer a) {
        double a2 = -CopsCrims.mc.thePlayer.getDistanceToEntity((Entity)a);
        if (a.lastTickPosX == a.posX && a.lastTickPosY == a.posY && a.lastTickPosZ == a.posZ) {
            a2 += 200.0;
        }
        return a2 -= (double)(a.getDistanceToEntity((Entity)CopsCrims.mc.thePlayer) / 5.0f);
    }

    private Entity Method1668(EntityPlayer a) {
        int a2 = (int)Math.ceil((double)((double)mc.getNetHandler().getPlayerInfo(CopsCrims.mc.thePlayer.getUniqueID()).getResponseTime() / 50.0));
        return this.Method1669(a, a2);
    }

    public Entity Method1669(EntityPlayer a, int a2) {
        List a3;
        if (this.Field2321.containsKey((Object)a) && (a3 = (List)this.Field2321.Method2665((Object)a)).Method1799() > 1) {
            Vec3 a4 = (Vec3)a3.get(0);
            ArrayList a5 = new ArrayList();
            Vec3 a6 = a4;
            Iterator iterator = a3.Method1383();
            while (iterator.Method932()) {
                Vec3 a7 = (Vec3)iterator.Method933();
                a5.Method2530((Object)new Vec3(a7.xCoord - a6.xCoord, a7.yCoord - a6.yCoord, a7.zCoord - a6.zCoord));
                a6 = a7;
            }
            double a8 = 0.0;
            double a9 = 0.0;
            double a10 = 0.0;
            Iterator iterator2 = a5.Method1383();
            while (iterator2.Method932()) {
                Vec3 a11 = (Vec3)iterator2.Method933();
                a8 += a11.xCoord;
                a9 += a11.yCoord;
                a10 += a11.zCoord;
            }
            a8 /= (double)a5.Method1799();
            a9 /= (double)a5.Method1799();
            a10 /= (double)a5.Method1799();
            EntityOtherPlayerMP a12 = new EntityOtherPlayerMP((World)CopsCrims.mc.theWorld, a.getGameProfile());
            a12.noClip = false;
            a12.setPosition(a.posX, a.posY, a.posZ);
            for (int a13 = 0; a13 < a2; ++a13) {
                a12.moveEntity(a8, a9, a10);
            }
            return a12;
        }
        return a;
    }

    private final float[] Method1670(Entity a, double a2, double a3, double a4) {
        double a5 = a2 - a.posX;
        double a6 = a3 - a.posY - (double)a.getEyeHeight() - 0.1;
        double a7 = a4 - a.posZ;
        double a8 = a7 < 0.0 && a5 < 0.0 ? 90.0 + Math.toDegrees((double)Math.atan((double)(a7 / a5))) : (a7 < 0.0 && a5 > 0.0 ? -90.0 + Math.toDegrees((double)Math.atan((double)(a7 / a5))) : Math.toDegrees((double)(-Math.atan((double)(a5 / a7)))));
        double a9 = Math.sqrt((double)(a5 * a5 + a7 * a7));
        double a10 = -Math.toDegrees((double)Math.atan((double)(a6 / a9)));
        a8 = CopsCrims.Method1671((float)a8);
        a10 = CopsCrims.Method1671((float)a10);
        return new float[]{(float)a8, (float)a10};
    }

    private static float Method1671(float a) {
        a %= 360.0f;
        while (a >= 180.0f) {
            a -= 360.0f;
        }
        while (a < -180.0f) {
            a += 360.0f;
        }
        return a;
    }

    public boolean Method817(EntityLivingBase a, float a2) {
        a2 = (float)((double)a2 * 0.5);
        double a3 = (((double)CopsCrims.mc.thePlayer.rotationYaw - this.Method818(a)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
        return a3 > 0.0 && a3 < (double)a2 || (double)(-a2) < a3 && a3 < 0.0;
    }

    public double[] Method818(EntityLivingBase a) {
        double a2 = a.posX - CopsCrims.mc.thePlayer.posX;
        double a3 = a.posY - CopsCrims.mc.thePlayer.posY;
        double a4 = a.posZ - CopsCrims.mc.thePlayer.posZ;
        double a5 = -(Math.atan2((double)a2, (double)a4) * 57.29577951308232);
        double a6 = -(Math.asin((double)(a3 /= (double)CopsCrims.mc.thePlayer.getDistanceToEntity((Entity)a))) * 57.29577951308232);
        return new double[]{a5, a6};
    }
}