/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Random
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItemFrame
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.item.ItemSword
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.WorldSettings$GameType
 */
package trash.foodbyte.module.impl.combat;

import awsl.Class334;
import awsl.Class46;
import awsl.Class653;
import awsl.Class749;
import awsl.Class91;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.item.ItemSword;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldSettings;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class AimAssist
extends Module {
    public ModeValue Field2584 = new ModeValue("AimAssist", "Aim Mode", "New", new String[]{"Old", "New", "Blatant"}, "\u6a21\u5f0f{\u65e7\u7684,\u65b0\u7684,\u9501\u6b7b}");
    public ModeValue Field2585 = new ModeValue("AimAssist", "Priority", "Health", new String[]{"Health", "Reach", "Angle", "Fov"}, "\u4f18\u5148\u7784\u51c6{\u8840\u91cf\u6700\u5c11,\u8ddd\u79bb\u6700\u8fd1,\u89d2\u5ea6\u6700\u5c0f,\u89c6\u89d2\u6700\u8fd1}");
    public FloatValue Field2586 = new FloatValue("AimAssist", "H Speed", 10.0, 0.0, 20.0, 0.1, "\u5de6\u53f3\u7784\u51c6\u901f\u5ea6");
    public FloatValue Field2587 = new FloatValue("AimAssist", "V Speed", 10.0, 0.0, 20.0, 0.1, "\u4e0a\u4e0b\u7784\u51c6\u901f\u5ea6");
    public FloatValue Field2588 = new FloatValue("AimAssist", "Range", 3.8, 3.0, 10.0, 0.1, "\u7784\u51c6\u8ddd\u79bb");
    public FloatValue Field2589 = new FloatValue("AimAssist", "Fov", 120.0, 1.0, 360.0, 5.0, "\u00b0", "\u7784\u51c6\u89c6\u89d2(120\u00b0\u4e3a\u5c4f\u5e55\u80fd\u770b\u89c1\u7684\u5730\u65b9)");
    public BooleanValue Field2590 = new BooleanValue("AimAssist", "Infinite Range", (Boolean)false, "\u5f00\u542f\u540e\u65e0\u8bba\u591a\u8fdc\u90fd\u4f1a\u81ea\u7784(\u9002\u5408\u67aa\u6218\u5c0f\u6e38\u620f)");
    public BooleanValue Field2591 = new BooleanValue("AimAssist", "RayTrace", (Boolean)false, "\u5899\u4f53\u68c0\u6d4b");
    public BooleanValue Field2592 = new BooleanValue("AimAssist", "Block Check", (Boolean)true, "\u65b9\u5757\u68c0\u6d4b");
    public BooleanValue Field2593 = new BooleanValue("AimAssist", "ClickAim", (Boolean)true, "\u6309\u4f4f\u5de6\u952e\u624d\u80fd\u5f00\u59cb\u81ea\u7784");
    public BooleanValue Field2594 = new BooleanValue("AimAssist", "Weapon", (Boolean)false, "\u624b\u62ff\u6b66\u5668\u624d\u4f1a\u81ea\u7784");
    public BooleanValue Field2595 = new BooleanValue("AimAssist", "Players", (Boolean)true, "\u73a9\u5bb6");
    public BooleanValue Field2596 = new BooleanValue("AimAssist", "Animals", (Boolean)false, "\u52a8\u7269");
    public BooleanValue Field2597 = new BooleanValue("AimAssist", "Mobs", (Boolean)false, "\u602a\u7269");
    public BooleanValue Field2598 = new BooleanValue("AimAssist", "Invisibles", (Boolean)false, "\u9690\u8eab");
    protected Random Field2599 = new Random();
    public ArrayList Field2600 = new ArrayList();
    EntityLivingBase Field2601;
    public boolean Field2602 = false;

    public AimAssist() {
        super("AimAssist", "Aim Assist", Category.COMBAT);
    }

    @Override
    public String getDescription() {
        return "\u81ea\u7784";
    }

    @EventTarget
    public void Method810(EventRender2D a) {
        ScaledResolution a2 = new ScaledResolution(mc);
        if (this.Field2594.getValue()) {
            if (AimAssist.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(AimAssist.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword)) {
                return;
            }
        }
        if (this.Field2593.Method2509().booleanValue() && !AimAssist.mc.gameSettings.keyBindAttack.isKeyDown()) {
            this.Field2601 = null;
            return;
        }
        if (this.Field2601 != null) {
            // empty if block
        }
    }

    @EventTarget
    public void Method755(Class653 a) {
        Class91[] a2 = Class46.Method3239();
        if (AimAssist.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE && AimAssist.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && this.Field2601 == null && this.Field2592.Method2509().booleanValue()) {
            return;
        }
        if (AimAssist.mc.thePlayer.ridingEntity != null) {
            if (this.Field2594.getValue() && this.Field2594.getValue() && !Class749.Method1591()) {
                return;
            }
            if (this.Field2593.Method2509().booleanValue() && !AimAssist.mc.gameSettings.keyBindAttack.isKeyDown()) {
                return;
            }
            if (AimAssist.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE && AimAssist.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && !(AimAssist.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword)) {
                return;
            }
            if (AimAssist.Method811((double)this.Field2588.Method2744().floatValue() + (this.Field2590.Method2509() != false ? 999.0 : 0.0), 0.0) != null && KillAura.Field2524 == null) {
                return;
            }
            if (this.Field2601 != null) {
                double d = AimAssist.mc.thePlayer.getDistanceToEntity((Entity)this.Field2601);
                double d2 = this.Field2588.Method2744().floatValue();
                double d3 = this.Field2590.Method2509() != false ? 999.0 : 0.0;
                if (d <= d2 + d3) {
                    if (this.Field2584.isCurrentMode("Old")) {
                        boolean a3;
                        boolean a4 = this.Method812(this.Field2601) > 0.0;
                        double a5 = (float)(Math.random() / (90.0 / ((double)this.Field2586.Method2744().floatValue() * 10.0 + MathUtils.Method572(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.Field2586.Method2744().floatValue() * 10.0 + MathUtils.Method572(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8);
                        if ((this.Method812(this.Field2601) > 7.0 || this.Method812(this.Field2601) < -7.0) && (double)this.Field2586.Method2744().floatValue() * 10.0 >= 10.0) {
                            AimAssist.mc.thePlayer.rotationYaw += (float)(-(Math.abs((double)this.Method812(this.Field2601)) / a5));
                        }
                        double a6 = (float)(Math.random() / (90.0 / ((double)this.Field2587.Method2744().floatValue() * 10.0 + MathUtils.Method572(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.Field2587.Method2744().floatValue() * 10.0 + MathUtils.Method572(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8);
                        boolean bl = a3 = this.Method813(this.Field2601) > 0.0;
                        if ((this.Method813(this.Field2601) > 20.0 || this.Method813(this.Field2601) < -1.0) && (double)this.Field2587.Method2744().floatValue() * 10.0 >= 10.0) {
                            AimAssist.mc.thePlayer.rotationPitch += (float)(-(Math.abs((double)this.Method813(this.Field2601)) / a6));
                        }
                    }
                    double a7 = (double)this.Field2586.Method2744().floatValue() * 3.0 + ((double)this.Field2586.Method2744().floatValue() > 0.0 ? this.Field2599.nextDouble() : 0.0);
                    double a8 = (double)this.Field2587.Method2744().floatValue() * 3.0 + ((double)this.Field2587.Method2744().floatValue() > 0.0 ? this.Field2599.nextDouble() : 0.0);
                    this.Method821((Entity)this.Field2601, (float)a7 * 2.5f, (float)a8 * 2.5f);
                }
            }
            this.Method814();
            this.Method815();
            this.Method258();
        }
    }

    @EventTarget
    public void Method712(EventMotion a) {
        block12: {
            block11: {
                Class91[] a2 = Class46.Method3239();
                if (AimAssist.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE && AimAssist.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && this.Field2601 == null && this.Field2592.Method2509().booleanValue()) {
                    return;
                }
                if (!a.isPre()) break block11;
                if (AimAssist.mc.theWorld == null) break block12;
                if (this.Field2594.getValue() && !Class749.Method1591()) {
                    return;
                }
                if (this.Field2593.Method2509().booleanValue() && !AimAssist.mc.gameSettings.keyBindAttack.isKeyDown()) {
                    return;
                }
                if (AimAssist.Method811((double)this.Field2588.Method2744().floatValue() + (this.Field2590.Method2509() != false ? 999.0 : 0.0), 0.0) != null && KillAura.Field2524 == null) {
                    return;
                }
                if (this.Field2601 == null) break block12;
                double d = AimAssist.mc.thePlayer.getDistanceToEntity((Entity)this.Field2601);
                double d2 = this.Field2588.Method2744().floatValue();
                double d3 = this.Field2590.Method2509() != false ? 999.0 : 0.0;
                if (!(d <= d2 + d3)) break block12;
                if (this.Field2584.isCurrentMode("Old")) {
                    boolean a3;
                    boolean a4 = this.Method812(this.Field2601) > 0.0;
                    double a5 = (float)(Math.random() / (90.0 / ((double)this.Field2586.Method2744().floatValue() * 10.0 + MathUtils.Method572(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.Field2586.Method2744().floatValue() * 10.0 + MathUtils.Method572(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8);
                    if ((this.Method812(this.Field2601) > 7.0 || this.Method812(this.Field2601) < -7.0) && (double)this.Field2586.Method2744().floatValue() * 10.0 >= 10.0) {
                        AimAssist.mc.thePlayer.rotationYaw += (float)(-(Math.abs((double)this.Method812(this.Field2601)) / a5));
                    }
                    double a6 = (float)(Math.random() / (90.0 / ((double)this.Field2587.Method2744().floatValue() * 10.0 + MathUtils.Method572(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.Field2587.Method2744().floatValue() * 10.0 + MathUtils.Method572(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8);
                    boolean bl = a3 = this.Method813(this.Field2601) > 0.0;
                    if ((this.Method813(this.Field2601) > 20.0 || this.Method813(this.Field2601) < -1.0) && (double)this.Field2587.Method2744().floatValue() * 10.0 >= 10.0) {
                        AimAssist.mc.thePlayer.rotationPitch += (float)(-(Math.abs((double)this.Method813(this.Field2601)) / a6));
                    }
                }
                double a7 = (double)this.Field2586.Method2744().floatValue() * 3.0 + ((double)this.Field2586.Method2744().floatValue() > 0.0 ? this.Field2599.nextDouble() : 0.0);
                double a8 = (double)this.Field2587.Method2744().floatValue() * 3.0 + ((double)this.Field2587.Method2744().floatValue() > 0.0 ? this.Field2599.nextDouble() : 0.0);
                this.Method821((Entity)this.Field2601, (float)a7 * 2.5f, (float)a8 * 2.5f);
            }
            if (AimAssist.mc.theWorld != null) {
                this.Method814();
                this.Method815();
                this.Method258();
            }
        }
    }

    public static Object[] Method811(double a, double a2) {
        Entity a3 = mc.getRenderViewEntity();
        Entity a4 = null;
        if (AimAssist.mc.theWorld != null) {
            double a5;
            AimAssist.mc.mcProfiler.startSection("pick");
            double a6 = a5 = a;
            Vec3 a7 = a3.getPositionEyes(ReflectionUtils.Method2587());
            Vec3 a8 = a3.getLook(ReflectionUtils.Method2587());
            Vec3 a9 = a7.addVector(a8.xCoord * a5, a8.yCoord * a5, a8.zCoord * a5);
            Vec3 a10 = null;
            float a11 = 1.0f;
            List a12 = AimAssist.mc.theWorld.getEntitiesWithinAABBExcludingEntity(a3, a3.getEntityBoundingBox().addCoord(a8.xCoord * a5, a8.yCoord * a5, a8.zCoord * a5).expand((double)a11, (double)a11, (double)a11));
            double a13 = a6;
            for (int a14 = 0; a14 < a12.Method1799(); ++a14) {
                Entity a15 = (Entity)a12.get(a14);
                if (!a15.canBeCollidedWith()) continue;
                float a16 = a15.getCollisionBorderSize();
                AxisAlignedBB a17 = a15.getEntityBoundingBox().expand((double)a16, (double)a16, (double)a16);
                a17 = a17.expand(a2, a2, a2);
                MovingObjectPosition a18 = a17.calculateIntercept(a7, a9);
                if (a17.isVecInside(a7)) {
                    if (!(0.0 < a13) && a13 != 0.0) continue;
                    a4 = a15;
                    a10 = a7;
                    a13 = 0.0;
                    continue;
                }
                double a19 = a7.distanceTo(a18.hitVec);
                if (!(a19 < a13) && a13 != 0.0) continue;
                if (a15 == a3.ridingEntity) {
                    if (a13 != 0.0) continue;
                    a4 = a15;
                    a10 = a18.hitVec;
                    continue;
                }
                a4 = a15;
                a10 = a18.hitVec;
                a13 = a19;
            }
            if (a13 < a6 && !(a4 instanceof EntityLivingBase) && !(a4 instanceof EntityItemFrame)) {
                a4 = null;
            }
            AimAssist.mc.mcProfiler.endSection();
            return null;
        }
        return null;
    }

    public double Method812(EntityLivingBase a) {
        return (((double)AimAssist.mc.thePlayer.rotationYaw - this.Method818(a)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
    }

    public double Method813(EntityLivingBase a) {
        return (((double)AimAssist.mc.thePlayer.rotationPitch - this.Method818(a)[1]) % 360.0 + 540.0) % 360.0 - 180.0;
    }

    private void Method258() {
        this.Field2601 = this.Field2600.Method1799() == 0 ? null : (EntityLivingBase)this.Field2600.get(0);
        if (KillAura.Field2524 != null) {
            this.Field2601 = KillAura.Field2524;
        }
    }

    private void Method814() {
        Iterator iterator = this.Field2600.Method1383();
        while (iterator.Method932()) {
            EntityLivingBase a = (EntityLivingBase)iterator.Method933();
            if (this.Method816(a, (double)this.Field2588.Method2744().floatValue() + (this.Field2590.Method2509() != false ? 999.0 : 0.0))) continue;
            this.Field2600.remove((Object)a);
        }
    }

    private void Method815() {
        int a = 999;
        Iterator iterator = AimAssist.mc.theWorld.loadedEntityList.Method1383();
        while (iterator.Method932()) {
            EntityLivingBase a2;
            Entity a3 = (Entity)iterator.Method933();
            if (!(a3 instanceof EntityLivingBase) || !this.Method816(a2 = (EntityLivingBase)a3, (double)this.Field2588.Method2744().floatValue() + (this.Field2590.Method2509() != false ? 999.0 : 0.0)) || this.Field2600.contains((Object)a2)) continue;
            this.Field2600.Method2530((Object)a2);
        }
        if (this.Field2585.isCurrentMode("Reach") && AimAssist.mc.gameSettings.keyBindSprint.isKeyDown()) {
            this.Field2600.sort(AimAssist::Method829);
            return;
        }
        if (this.Field2585.isCurrentMode("Health") && AimAssist.mc.gameSettings.keyBindSprint.isKeyDown()) {
            this.Field2600.sort(Comparator.comparingDouble(AimAssist::Method828));
            return;
        }
        if (this.Field2585.isCurrentMode("Reach")) {
            this.Field2600.sort(Comparator.comparingDouble(AimAssist::Method827));
        }
        if (this.Field2585.isCurrentMode("Fov")) {
            this.Field2600.sort(Comparator.comparingDouble(this::Method824));
        }
        if (this.Field2585.isCurrentMode("Angle")) {
            this.Field2600.sort(AimAssist::Method826);
        }
        if (this.Field2585.isCurrentMode("Health")) {
            this.Field2600.sort(AimAssist::Method825);
        }
    }

    private boolean Method816(EntityLivingBase a, double a2) {
        return false;
    }

    public boolean Method817(EntityLivingBase a, float a2) {
        a2 = (float)((double)a2 * 0.5);
        double a3 = (((double)AimAssist.mc.thePlayer.rotationYaw - this.Method818(a)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
        return a3 > 0.0 && a3 < (double)a2 || (double)(-a2) < a3 && a3 < 0.0;
    }

    public double[] Method818(EntityLivingBase a) {
        double a2 = a.posX - AimAssist.mc.thePlayer.posX;
        double a3 = a.posY - AimAssist.mc.thePlayer.posY;
        double a4 = a.posZ - AimAssist.mc.thePlayer.posZ;
        double a5 = -(Math.atan2((double)a2, (double)a4) * 57.29577951308232);
        double a6 = -(Math.asin((double)(a3 /= (double)AimAssist.mc.thePlayer.getDistanceToEntity((Entity)a))) * 57.29577951308232);
        return new double[]{a5, a6};
    }

    public static float Method819(float a, float a2) {
        float a3 = Math.abs((float)(a - a2)) % 360.0f;
        if (a3 > 180.0f) {
            a3 = 360.0f - a3;
        }
        return a3;
    }

    public static float[] Method820(Entity a) {
        double a2 = AimAssist.mc.thePlayer.posX;
        double a3 = AimAssist.mc.thePlayer.posY + (double)AimAssist.mc.thePlayer.getEyeHeight();
        double a4 = AimAssist.mc.thePlayer.posZ;
        double a5 = a.posX;
        double a6 = a.posY + (double)(a.height / 2.0f);
        double a7 = a.posZ;
        double a8 = a2 - a5;
        double a9 = a3 - a6;
        double a10 = a4 - a7;
        double a11 = Math.sqrt((double)(Math.pow((double)a8, (double)2.0) + Math.pow((double)a10, (double)2.0)));
        double a12 = Math.toDegrees((double)Math.atan2((double)a10, (double)a8)) + 90.0;
        double a13 = Math.toDegrees((double)Math.atan2((double)a11, (double)a9));
        return new float[]{(float)a12, (float)(90.0 - a13)};
    }

    private void Method821(Entity a, float a2, float a3) {
        EntityPlayerSP a4 = AimAssist.mc.thePlayer;
        float a5 = AimAssist.Method822(a)[1];
        float a6 = AimAssist.Method822(a)[0];
        if (this.Field2584.isCurrentMode("Blatant")) {
            a4.rotationYaw = a5;
            a4.rotationPitch = a6;
            return;
        }
        a4.rotationYaw = this.Method823(a4.rotationYaw, a5, a2);
        a4.rotationPitch = this.Method823(a4.rotationPitch, a6, a3);
    }

    public static float[] Method822(Entity a) {
        double a2 = a.posX - AimAssist.mc.thePlayer.posX;
        double a3 = a.posZ - AimAssist.mc.thePlayer.posZ;
        double a4 = a instanceof EntityEnderman ? a.posY - AimAssist.mc.thePlayer.posY : a.posY + ((double)a.getEyeHeight() - 1.9) - AimAssist.mc.thePlayer.posY + ((double)AimAssist.mc.thePlayer.getEyeHeight() - 1.5);
        double a5 = MathHelper.sqrt_double((double)(a2 * a2 + a3 * a3));
        float a6 = (float)Math.toDegrees((double)(-Math.atan((double)(a2 / a3))));
        float a7 = (float)(-Math.toDegrees((double)Math.atan((double)(a4 / a5))));
        if (a3 < 0.0 && a2 < 0.0) {
            a6 = (float)(90.0 + Math.toDegrees((double)Math.atan((double)(a3 / a2))));
        } else if (a3 < 0.0 && a2 > 0.0) {
            a6 = (float)(-90.0 + Math.toDegrees((double)Math.atan((double)(a3 / a2))));
        }
        return new float[]{a7, a6};
    }

    protected float Method823(float a, float a2, float a3) {
        float a4 = MathHelper.wrapAngleTo180_float((float)(a2 - a));
        if (a4 > a3) {
            a4 = a3;
        }
        if (a4 < -a3) {
            a4 = -a3;
        }
        Random a5 = new Random();
        float a6 = (float)a5.nextInt(15) * 0.01f;
        return a + a4 + a6;
    }

    private double Method824(EntityLivingBase a) {
        float[] a2 = Class334.Method1177(a);
        float a3 = (int)a2[0];
        float a4 = AimAssist.mc.thePlayer.rotationYaw > a3 ? AimAssist.mc.thePlayer.rotationYaw - a3 : a3 - AimAssist.mc.thePlayer.rotationYaw;
        return a4;
    }

    private static int Method825(EntityLivingBase a, EntityLivingBase a2) {
        return (int)(a.getHealth() - a2.getHealth());
    }

    private static int Method826(EntityLivingBase a, EntityLivingBase a2) {
        float[] a3 = Class334.Method1163(a);
        float[] a4 = Class334.Method1163(a2);
        return (int)(AimAssist.mc.thePlayer.rotationYaw - a3[0] - (AimAssist.mc.thePlayer.rotationYaw - a4[0]));
    }

    private static double Method827(EntityLivingBase a) {
        return AimAssist.mc.thePlayer.getDistanceToEntity((Entity)a);
    }

    private static double Method828(EntityLivingBase a) {
        return AimAssist.mc.thePlayer.getDistanceToEntity((Entity)a);
    }

    private static int Method829(EntityLivingBase a, EntityLivingBase a2) {
        return (int)(a.getHealth() - a2.getHealth());
    }
}