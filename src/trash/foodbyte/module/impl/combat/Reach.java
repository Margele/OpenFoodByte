/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Random
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItemFrame
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraft.util.Vec3
 */
package trash.foodbyte.module.impl.combat;

import eventapi.EventTarget;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import obfuscate.a;
import obfuscate.b;
import trash.foodbyte.event.EventEntityTick;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.HitBox;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class Reach
extends Module {
    public FloatValue Field2486 = new FloatValue("Reach", "MaxReach", 3.5f, 3.0f, 7.0f, 0.1f, "\u6700\u8fdc\u8ddd\u79bb");
    public FloatValue Field2487 = new FloatValue("Reach", "MinReach", 3.5f, 3.0f, 7.0f, 0.1f, "\u6700\u8fd1\u8ddd\u79bb");
    public FloatValue Field2488 = new FloatValue("Reach", "BlockReach", 5.0f, 4.5f, 7.0f, 0.1f, "\u4fee\u6539\u7784\u51c6\u65b9\u5757\u8ddd\u79bb");
    public BooleanValue Field2489 = new BooleanValue("Reach", "ThroughWalls", (Boolean)true, "\u9694\u5899(\u6709\u5899\u70b9\u51fb\u5899\u5c31\u80fd\u653b\u51fb)");
    Random Field2490 = new Random();
    private TimeHelper Field2491 = new TimeHelper();

    public Reach() {
        super("Reach", Category.COMBAT);
    }

    @Override
    public String getDescription() {
        return "\u4fee\u6539\u653b\u51fb\u8ddd\u79bb";
    }

    public float Method276() {
        float a = this.Field2487.getFloatValue().floatValue();
        float a2 = this.Field2486.getFloatValue().floatValue();
        float a3 = a;
        float a4 = a2;
        return (float)((double)a4 + this.Field2490.nextDouble() * (double)(a3 - a4));
    }

    public float Method798() {
        float a = this.Method276();
        float a2 = this.Field2488.getFloatValue().floatValue();
        return Math.max((float)a, (float)a2);
    }

    @EventTarget
    public void Method712(EventMotion a) {
        this.setDisplayTag(this.Field2487.getFloatValue().doubleValue() == this.Field2486.getFloatValue().doubleValue() ? this.Method276() + "" : this.Field2487.getFloatValue() + "-" + this.Field2486.getFloatValue());
    }

    @EventTarget
    private void Method747(EventEntityTick a) {
        if (a.getEntity().equals((Object)Reach.mc.thePlayer) && this.Field2489.getBooleanValue().booleanValue()) {
            double a2 = 3.4;
            Object[] a3 = this.Method926(a2, 0.0, 0.0f);
            if (Reach.mc.gameSettings.keyBindAttack.isKeyDown() && this.Field2491.isDelayComplete(100.0) && Reach.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
                Reach.mc.objectMouseOver = new MovingObjectPosition((Entity)a3[0], (Vec3)a3[1]);
                Reach.mc.pointedEntity = (Entity)a3[0];
                Reach.mc.thePlayer.swingItem();
                Reach.mc.playerController.attackEntity((EntityPlayer)Reach.mc.thePlayer, Reach.mc.objectMouseOver.entityHit);
                this.Field2491.reset();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public Object[] Method926(double a2, double a3, float a4) {
        Entity a5;
        double a6;
        block5: {
            int a7;
            block6: {
                double a8;
                MovingObjectPosition a9;
                Entity a10;
                Vec3 a11;
                block8: {
                    Vec3 a12;
                    void a13;
                    block7: {
                        Entity entity = mc.getRenderViewEntity();
                        Object var8_5 = null;
                        a[] a14 = b.trash();
                        if (Reach.mc.theWorld == null) {
                            return null;
                        }
                        Reach.mc.mcProfiler.startSection("pick");
                        a12 = a13.getPositionEyes(0.0f);
                        Vec3 a15 = a13.getLook(0.0f);
                        Vec3 a16 = a12.addVector(a15.xCoord * a2, a15.yCoord * a2, a15.zCoord * a2);
                        a11 = null;
                        float a17 = 1.0f;
                        List a18 = Reach.mc.theWorld.getEntitiesWithinAABBExcludingEntity((Entity)a13, a13.getEntityBoundingBox().addCoord(a15.xCoord * a2, a15.yCoord * a2, a15.zCoord * a2).expand(1.0, 1.0, 1.0));
                        a6 = a2;
                        a7 = 0;
                        if (a7 >= a18.Method1799()) break block5;
                        a10 = (Entity)a18.get(a7);
                        if (!a10.canBeCollidedWith()) break block6;
                        HitBox a19 = (HitBox)ModuleManager.getModule(HitBox.class);
                        float a20 = a19.Method1187(a10) ? a19.Field2607.getFloatValue().floatValue() : a10.getCollisionBorderSize();
                        AxisAlignedBB a21 = a10.getEntityBoundingBox().expand((double)a20, (double)a20, (double)a20);
                        a21 = a21.expand(a3, a3, a3);
                        a9 = a21.calculateIntercept(a12, a16);
                        if (!a21.isVecInside(a12)) break block7;
                        if (!(0.0 < a6) && a6 != 0.0) break block6;
                        a5 = a10;
                        a11 = a12;
                        a6 = 0.0;
                    }
                    if (!((a8 = a12.distanceTo(a9.hitVec)) < a6) && a6 != 0.0) break block6;
                    if (a10 != a13.ridingEntity) break block8;
                    if (a6 != 0.0) break block6;
                    a5 = a10;
                    a11 = a9.hitVec;
                }
                a5 = a10;
                a11 = a9.hitVec;
                a6 = a8;
            }
            ++a7;
        }
        if (a6 < a2 && !(a5 instanceof EntityLivingBase) && !(a5 instanceof EntityItemFrame)) {
            a5 = null;
        }
        Reach.mc.mcProfiler.endSection();
        return null;
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}