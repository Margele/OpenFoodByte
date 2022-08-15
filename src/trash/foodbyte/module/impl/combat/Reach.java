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

import awsl.Class46;
import awsl.Class635;
import awsl.Class91;
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
        float a = this.Field2487.Method2744().floatValue();
        float a2 = this.Field2486.Method2744().floatValue();
        float a3 = a;
        float a4 = a2;
        return (float)((double)a4 + this.Field2490.nextDouble() * (double)(a3 - a4));
    }

    public float Method798() {
        float a = this.Method276();
        float a2 = this.Field2488.Method2744().floatValue();
        return Math.max((float)a, (float)a2);
    }

    @EventTarget
    public void Method712(EventMotion a) {
        this.setDisplayTag(this.Field2487.Method2744().doubleValue() == this.Field2486.Method2744().doubleValue() ? this.Method276() + "" : this.Field2487.Method2744() + "-" + this.Field2486.Method2744());
    }

    @EventTarget
    private void Method747(Class635 a) {
        if (a.Method3587().equals((Object)Reach.mc.thePlayer) && this.Field2489.Method2509().booleanValue()) {
            double a2 = 3.4;
            Object[] a3 = this.Method926(a2, 0.0, 0.0f);
            if (Reach.mc.gameSettings.keyBindAttack.isKeyDown() && this.Field2491.Method219(100.0) && Reach.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
                Reach.mc.objectMouseOver = new MovingObjectPosition((Entity)a3[0], (Vec3)a3[1]);
                Reach.mc.pointedEntity = (Entity)a3[0];
                Reach.mc.thePlayer.swingItem();
                Reach.mc.playerController.attackEntity((EntityPlayer)Reach.mc.thePlayer, Reach.mc.objectMouseOver.entityHit);
                this.Field2491.Method214();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public Object[] Method926(double a, double a2, float a3) {
        Entity a4;
        double a5;
        block5: {
            int a6;
            block6: {
                double a7;
                MovingObjectPosition a8;
                Entity a9;
                Vec3 a10;
                block8: {
                    Vec3 a11;
                    void a12;
                    block7: {
                        Entity entity = mc.getRenderViewEntity();
                        Object var8_5 = null;
                        Class91[] a13 = Class46.Method3239();
                        if (Reach.mc.theWorld == null) {
                            return null;
                        }
                        Reach.mc.mcProfiler.startSection("pick");
                        a11 = a12.getPositionEyes(0.0f);
                        Vec3 a14 = a12.getLook(0.0f);
                        Vec3 a15 = a11.addVector(a14.xCoord * a, a14.yCoord * a, a14.zCoord * a);
                        a10 = null;
                        float a16 = 1.0f;
                        List a17 = Reach.mc.theWorld.getEntitiesWithinAABBExcludingEntity((Entity)a12, a12.getEntityBoundingBox().addCoord(a14.xCoord * a, a14.yCoord * a, a14.zCoord * a).expand(1.0, 1.0, 1.0));
                        a5 = a;
                        a6 = 0;
                        if (a6 >= a17.Method1799()) break block5;
                        a9 = (Entity)a17.get(a6);
                        if (!a9.canBeCollidedWith()) break block6;
                        HitBox a18 = (HitBox)ModuleManager.getModule(HitBox.class);
                        float a19 = a18.Method1187(a9) ? a18.Field2607.Method2744().floatValue() : a9.getCollisionBorderSize();
                        AxisAlignedBB a20 = a9.getEntityBoundingBox().expand((double)a19, (double)a19, (double)a19);
                        a20 = a20.expand(a2, a2, a2);
                        a8 = a20.calculateIntercept(a11, a15);
                        if (!a20.isVecInside(a11)) break block7;
                        if (!(0.0 < a5) && a5 != 0.0) break block6;
                        a4 = a9;
                        a10 = a11;
                        a5 = 0.0;
                    }
                    if (!((a7 = a11.distanceTo(a8.hitVec)) < a5) && a5 != 0.0) break block6;
                    if (a9 != a12.ridingEntity) break block8;
                    if (a5 != 0.0) break block6;
                    a4 = a9;
                    a10 = a8.hitVec;
                }
                a4 = a9;
                a10 = a8.hitVec;
                a5 = a7;
            }
            ++a6;
        }
        if (a5 < a && !(a4 instanceof EntityLivingBase) && !(a4 instanceof EntityItemFrame)) {
            a4 = null;
        }
        Reach.mc.mcProfiler.endSection();
        return null;
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void Method279() {
        super.Method279();
    }
}