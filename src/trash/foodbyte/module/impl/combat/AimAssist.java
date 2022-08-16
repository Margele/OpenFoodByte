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
import obfuscate.a;
import obfuscate.b;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.utils.RotationUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class AimAssist
extends Module {
    public ModeValue aimMode = new ModeValue("AimAssist", "Aim Mode", "New", new String[]{"Old", "New", "Blatant"}, "\u6a21\u5f0f{\u65e7\u7684,\u65b0\u7684,\u9501\u6b7b}");
    public ModeValue priority = new ModeValue("AimAssist", "Priority", "Health", new String[]{"Health", "Reach", "Angle", "Fov"}, "\u4f18\u5148\u7784\u51c6{\u8840\u91cf\u6700\u5c11,\u8ddd\u79bb\u6700\u8fd1,\u89d2\u5ea6\u6700\u5c0f,\u89c6\u89d2\u6700\u8fd1}");
    public FloatValue hSpeed = new FloatValue("AimAssist", "H Speed", 10.0, 0.0, 20.0, 0.1, "\u5de6\u53f3\u7784\u51c6\u901f\u5ea6");
    public FloatValue vSpeed = new FloatValue("AimAssist", "V Speed", 10.0, 0.0, 20.0, 0.1, "\u4e0a\u4e0b\u7784\u51c6\u901f\u5ea6");
    public FloatValue range = new FloatValue("AimAssist", "Range", 3.8, 3.0, 10.0, 0.1, "\u7784\u51c6\u8ddd\u79bb");
    public FloatValue fov = new FloatValue("AimAssist", "Fov", 120.0, 1.0, 360.0, 5.0, "\u00b0", "\u7784\u51c6\u89c6\u89d2(120\u00b0\u4e3a\u5c4f\u5e55\u80fd\u770b\u89c1\u7684\u5730\u65b9)");
    public BooleanValue infiniteRange = new BooleanValue("AimAssist", "Infinite Range", (Boolean)false, "\u5f00\u542f\u540e\u65e0\u8bba\u591a\u8fdc\u90fd\u4f1a\u81ea\u7784(\u9002\u5408\u67aa\u6218\u5c0f\u6e38\u620f)");
    public BooleanValue rayTrace = new BooleanValue("AimAssist", "RayTrace", (Boolean)false, "\u5899\u4f53\u68c0\u6d4b");
    public BooleanValue blockCheck = new BooleanValue("AimAssist", "Block Check", (Boolean)true, "\u65b9\u5757\u68c0\u6d4b");
    public BooleanValue checkAim = new BooleanValue("AimAssist", "ClickAim", (Boolean)true, "\u6309\u4f4f\u5de6\u952e\u624d\u80fd\u5f00\u59cb\u81ea\u7784");
    public BooleanValue weapon = new BooleanValue("AimAssist", "Weapon", (Boolean)false, "\u624b\u62ff\u6b66\u5668\u624d\u4f1a\u81ea\u7784");
    public BooleanValue players = new BooleanValue("AimAssist", "Players", (Boolean)true, "\u73a9\u5bb6");
    public BooleanValue animals = new BooleanValue("AimAssist", "Animals", (Boolean)false, "\u52a8\u7269");
    public BooleanValue mobs = new BooleanValue("AimAssist", "Mobs", (Boolean)false, "\u602a\u7269");
    public BooleanValue invisibles = new BooleanValue("AimAssist", "Invisibles", (Boolean)false, "\u9690\u8eab");
    protected Random random = new Random();
    public ArrayList targets = new ArrayList();
    EntityLivingBase target;
    public boolean aimLock = false;

    public AimAssist() {
        super("AimAssist", "Aim Assist", Category.COMBAT);
    }

    @Override
    public String getDescription() {
        return "\u81ea\u7784";
    }

    @EventTarget
    public void onRender(EventRender2D a) {
        ScaledResolution a2 = new ScaledResolution(mc);
        if (this.weapon.getValue()) {
            if (AimAssist.mc.thePlayer.getCurrentEquippedItem() == null) {
                return;
            }
            if (!(AimAssist.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword)) {
                return;
            }
        }
        if (this.checkAim.getBooleanValue().booleanValue() && !AimAssist.mc.gameSettings.keyBindAttack.isKeyDown()) {
            this.target = null;
            return;
        }
        if (this.target != null) {
            // empty if block
        }
    }

    @EventTarget
    public void Method755(EventTick a2) {
        a[] a3 = b.trash();
        if (AimAssist.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE && AimAssist.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && this.target == null && this.blockCheck.getBooleanValue().booleanValue()) {
            return;
        }
        if (AimAssist.mc.thePlayer.ridingEntity != null) {
            if (this.weapon.getValue() && this.weapon.getValue() && !PlayerUtils.isVaildItem()) {
                return;
            }
            if (this.checkAim.getBooleanValue().booleanValue() && !AimAssist.mc.gameSettings.keyBindAttack.isKeyDown()) {
                return;
            }
            if (AimAssist.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE && AimAssist.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && !(AimAssist.mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword)) {
                return;
            }
            if (AimAssist.getMouseEntities((double)this.range.getFloatValue().floatValue() + (this.infiniteRange.getBooleanValue() != false ? 999.0 : 0.0), 0.0) != null && KillAura.target == null) {
                return;
            }
            if (this.target != null) {
                double d = AimAssist.mc.thePlayer.getDistanceToEntity((Entity)this.target);
                double d2 = this.range.getFloatValue().floatValue();
                double d3 = this.infiniteRange.getBooleanValue() != false ? 999.0 : 0.0;
                if (d <= d2 + d3) {
                    if (this.aimMode.isCurrentMode("Old")) {
                        boolean a4;
                        boolean a5 = this.getYaw(this.target) > 0.0;
                        double a6 = (float)(Math.random() / (90.0 / ((double)this.hSpeed.getFloatValue().floatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.hSpeed.getFloatValue().floatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8);
                        if ((this.getYaw(this.target) > 7.0 || this.getYaw(this.target) < -7.0) && (double)this.hSpeed.getFloatValue().floatValue() * 10.0 >= 10.0) {
                            AimAssist.mc.thePlayer.rotationYaw += (float)(-(Math.abs((double)this.getYaw(this.target)) / a6));
                        }
                        double a7 = (float)(Math.random() / (90.0 / ((double)this.vSpeed.getFloatValue().floatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.vSpeed.getFloatValue().floatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8);
                        boolean bl = a4 = this.getPitch(this.target) > 0.0;
                        if ((this.getPitch(this.target) > 20.0 || this.getPitch(this.target) < -1.0) && (double)this.vSpeed.getFloatValue().floatValue() * 10.0 >= 10.0) {
                            AimAssist.mc.thePlayer.rotationPitch += (float)(-(Math.abs((double)this.getPitch(this.target)) / a7));
                        }
                    }
                    double a8 = (double)this.hSpeed.getFloatValue().floatValue() * 3.0 + ((double)this.hSpeed.getFloatValue().floatValue() > 0.0 ? this.random.nextDouble() : 0.0);
                    double a9 = (double)this.vSpeed.getFloatValue().floatValue() * 3.0 + ((double)this.vSpeed.getFloatValue().floatValue() > 0.0 ? this.random.nextDouble() : 0.0);
                    this.setRotation((Entity)this.target, (float)a8 * 2.5f, (float)a9 * 2.5f);
                }
            }
            this.removeTargets();
            this.updateTargets();
            this.updateTargetByKillAura();
        }
    }

    @EventTarget
    public void onMotion(EventMotion event) {
        block12: {
            block11: {
                a[] a2 = b.trash();
                if (AimAssist.mc.playerController.getCurrentGameType() != WorldSettings.GameType.ADVENTURE && AimAssist.mc.objectMouseOver.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && this.target == null && this.blockCheck.getBooleanValue().booleanValue()) {
                    return;
                }
                if (!event.isPre()) break block11;
                if (AimAssist.mc.theWorld == null) break block12;
                if (this.weapon.getValue() && !PlayerUtils.isVaildItem()) {
                    return;
                }
                if (this.checkAim.getBooleanValue().booleanValue() && !AimAssist.mc.gameSettings.keyBindAttack.isKeyDown()) {
                    return;
                }
                if (AimAssist.getMouseEntities((double)this.range.getFloatValue().floatValue() + (this.infiniteRange.getBooleanValue() != false ? 999.0 : 0.0), 0.0) != null && KillAura.target == null) {
                    return;
                }
                if (this.target == null) break block12;
                double d = AimAssist.mc.thePlayer.getDistanceToEntity((Entity)this.target);
                double d2 = this.range.getFloatValue().floatValue();
                double d3 = this.infiniteRange.getBooleanValue() != false ? 999.0 : 0.0;
                if (!(d <= d2 + d3)) break block12;
                if (this.aimMode.isCurrentMode("Old")) {
                    boolean a3;
                    boolean a4 = this.getYaw(this.target) > 0.0;
                    double a5 = (float)(Math.random() / (90.0 / ((double)this.hSpeed.getFloatValue().floatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.hSpeed.getFloatValue().floatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8);
                    if ((this.getYaw(this.target) > 7.0 || this.getYaw(this.target) < -7.0) && (double)this.hSpeed.getFloatValue().floatValue() * 10.0 >= 10.0) {
                        AimAssist.mc.thePlayer.rotationYaw += (float)(-(Math.abs((double)this.getYaw(this.target)) / a5));
                    }
                    double a6 = (float)(Math.random() / (90.0 / ((double)this.vSpeed.getFloatValue().floatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.vSpeed.getFloatValue().floatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8);
                    boolean bl = a3 = this.getPitch(this.target) > 0.0;
                    if ((this.getPitch(this.target) > 20.0 || this.getPitch(this.target) < -1.0) && (double)this.vSpeed.getFloatValue().floatValue() * 10.0 >= 10.0) {
                        AimAssist.mc.thePlayer.rotationPitch += (float)(-(Math.abs((double)this.getPitch(this.target)) / a6));
                    }
                }
                double a7 = (double)this.hSpeed.getFloatValue().floatValue() * 3.0 + ((double)this.hSpeed.getFloatValue().floatValue() > 0.0 ? this.random.nextDouble() : 0.0);
                double a8 = (double)this.vSpeed.getFloatValue().floatValue() * 3.0 + ((double)this.vSpeed.getFloatValue().floatValue() > 0.0 ? this.random.nextDouble() : 0.0);
                this.setRotation((Entity)this.target, (float)a7 * 2.5f, (float)a8 * 2.5f);
            }
            if (AimAssist.mc.theWorld != null) {
                this.removeTargets();
                this.updateTargets();
                this.updateTargetByKillAura();
            }
        }
    }

    public static Object[] getMouseEntities(double range, double hitbox) {
        Entity a2 = mc.getRenderViewEntity();
        Entity a3 = null;
        if (AimAssist.mc.theWorld != null) {
            double a4;
            AimAssist.mc.mcProfiler.startSection("pick");
            double a5 = a4 = range;
            Vec3 a6 = a2.getPositionEyes(ReflectionUtils.getRenderPartialTicks());
            Vec3 a7 = a2.getLook(ReflectionUtils.getRenderPartialTicks());
            Vec3 a8 = a6.addVector(a7.xCoord * a4, a7.yCoord * a4, a7.zCoord * a4);
            Vec3 a9 = null;
            float a10 = 1.0f;
            List a11 = AimAssist.mc.theWorld.getEntitiesWithinAABBExcludingEntity(a2, a2.getEntityBoundingBox().addCoord(a7.xCoord * a4, a7.yCoord * a4, a7.zCoord * a4).expand((double)a10, (double)a10, (double)a10));
            double a12 = a5;
            for (int a13 = 0; a13 < a11.Method1799(); ++a13) {
                Entity a14 = (Entity)a11.get(a13);
                if (!a14.canBeCollidedWith()) continue;
                float a15 = a14.getCollisionBorderSize();
                AxisAlignedBB a16 = a14.getEntityBoundingBox().expand((double)a15, (double)a15, (double)a15);
                a16 = a16.expand(hitbox, hitbox, hitbox);
                MovingObjectPosition a17 = a16.calculateIntercept(a6, a8);
                if (a16.isVecInside(a6)) {
                    if (!(0.0 < a12) && a12 != 0.0) continue;
                    a3 = a14;
                    a9 = a6;
                    a12 = 0.0;
                    continue;
                }
                double a18 = a6.distanceTo(a17.hitVec);
                if (!(a18 < a12) && a12 != 0.0) continue;
                if (a14 == a2.ridingEntity) {
                    if (a12 != 0.0) continue;
                    a3 = a14;
                    a9 = a17.hitVec;
                    continue;
                }
                a3 = a14;
                a9 = a17.hitVec;
                a12 = a18;
            }
            if (a12 < a5 && !(a3 instanceof EntityLivingBase) && !(a3 instanceof EntityItemFrame)) {
                a3 = null;
            }
            AimAssist.mc.mcProfiler.endSection();
            return null;
        }
        return null;
    }

    public double getYaw(EntityLivingBase target) {
        return (((double)AimAssist.mc.thePlayer.rotationYaw - this.getRotation(target)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
    }

    public double getPitch(EntityLivingBase target) {
        return (((double)AimAssist.mc.thePlayer.rotationPitch - this.getRotation(target)[1]) % 360.0 + 540.0) % 360.0 - 180.0;
    }

    private void updateTargetByKillAura() {
        this.target = this.targets.Method1799() == 0 ? null : (EntityLivingBase)this.targets.get(0);
        if (KillAura.target != null) {
            this.target = KillAura.target;
        }
    }

    private void removeTargets() {
        Iterator iterator = this.targets.Method1383();
        while (iterator.Method932()) {
            EntityLivingBase a2 = (EntityLivingBase)iterator.Method933();
            if (this.isInViewEmpty(a2, (double)this.range.getFloatValue().floatValue() + (this.infiniteRange.getBooleanValue() != false ? 999.0 : 0.0))) continue;
            this.targets.remove((Object)a2);
        }
    }

    private void updateTargets() {
        int a2 = 999;
        Iterator iterator = AimAssist.mc.theWorld.loadedEntityList.Method1383();
        while (iterator.Method932()) {
            EntityLivingBase a3;
            Entity a4 = (Entity)iterator.Method933();
            if (!(a4 instanceof EntityLivingBase) || !this.isInViewEmpty(a3 = (EntityLivingBase)a4, (double)this.range.getFloatValue().floatValue() + (this.infiniteRange.getBooleanValue() != false ? 999.0 : 0.0)) || this.targets.contains((Object)a3)) continue;
            this.targets.Method2530((Object)a3);
        }
        if (this.priority.isCurrentMode("Reach") && AimAssist.mc.gameSettings.keyBindSprint.isKeyDown()) {
            this.targets.sort(AimAssist::getHealthDiff2);
            return;
        }
        if (this.priority.isCurrentMode("Health") && AimAssist.mc.gameSettings.keyBindSprint.isKeyDown()) {
            this.targets.sort(Comparator.comparingDouble(AimAssist::getDistanceToPlayer2));
            return;
        }
        if (this.priority.isCurrentMode("Reach")) {
            this.targets.sort(Comparator.comparingDouble(AimAssist::getDistanceToPlayer));
        }
        if (this.priority.isCurrentMode("Fov")) {
            this.targets.sort(Comparator.comparingDouble(this::getYawDiff));
        }
        if (this.priority.isCurrentMode("Angle")) {
            this.targets.sort(AimAssist::getAngleDiff);
        }
        if (this.priority.isCurrentMode("Health")) {
            this.targets.sort(AimAssist::getHealthDiff);
        }
    }

    private boolean isInViewEmpty(EntityLivingBase entity, double fov) {
        return false;
    }

    public boolean isInView(EntityLivingBase target, float fov) {
        fov = (float)((double)fov * 0.5);
        double a2 = (((double)AimAssist.mc.thePlayer.rotationYaw - this.getRotation(target)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
        return a2 > 0.0 && a2 < (double)fov || (double)(-fov) < a2 && a2 < 0.0;
    }

    public double[] getRotation(EntityLivingBase entity) {
        double a2 = entity.posX - AimAssist.mc.thePlayer.posX;
        double a3 = entity.posY - AimAssist.mc.thePlayer.posY;
        double a4 = entity.posZ - AimAssist.mc.thePlayer.posZ;
        double a5 = -(Math.atan2((double)a2, (double)a4) * 57.29577951308232);
        double a6 = -(Math.asin((double)(a3 /= (double)AimAssist.mc.thePlayer.getDistanceToEntity((Entity)entity))) * 57.29577951308232);
        return new double[]{a5, a6};
    }

    public static float toSimpleYaw(float a2, float b2) {
        float a3 = Math.abs((float)(a2 - b2)) % 360.0f;
        if (a3 > 180.0f) {
            a3 = 360.0f - a3;
        }
        return a3;
    }

    public static float[] getRotation3(Entity entity) {
        double a2 = AimAssist.mc.thePlayer.posX;
        double a3 = AimAssist.mc.thePlayer.posY + (double)AimAssist.mc.thePlayer.getEyeHeight();
        double a4 = AimAssist.mc.thePlayer.posZ;
        double a5 = entity.posX;
        double a6 = entity.posY + (double)(entity.height / 2.0f);
        double a7 = entity.posZ;
        double a8 = a2 - a5;
        double a9 = a3 - a6;
        double a10 = a4 - a7;
        double a11 = Math.sqrt((double)(Math.pow((double)a8, (double)2.0) + Math.pow((double)a10, (double)2.0)));
        double a12 = Math.toDegrees((double)Math.atan2((double)a10, (double)a8)) + 90.0;
        double a13 = Math.toDegrees((double)Math.atan2((double)a11, (double)a9));
        return new float[]{(float)a12, (float)(90.0 - a13)};
    }

    private void setRotation(Entity target, float lastYaw, float lastPitch) {
        EntityPlayerSP a2 = AimAssist.mc.thePlayer;
        float a3 = AimAssist.getRotation2(target)[1];
        float a4 = AimAssist.getRotation2(target)[0];
        if (this.aimMode.isCurrentMode("Blatant")) {
            a2.rotationYaw = a3;
            a2.rotationPitch = a4;
            return;
        }
        a2.rotationYaw = this.clamp(a2.rotationYaw, a3, lastYaw);
        a2.rotationPitch = this.clamp(a2.rotationPitch, a4, lastPitch);
    }

    public static float[] getRotation2(Entity target) {
        double a2 = target.posX - AimAssist.mc.thePlayer.posX;
        double a3 = target.posZ - AimAssist.mc.thePlayer.posZ;
        double a4 = target instanceof EntityEnderman ? target.posY - AimAssist.mc.thePlayer.posY : target.posY + ((double)target.getEyeHeight() - 1.9) - AimAssist.mc.thePlayer.posY + ((double)AimAssist.mc.thePlayer.getEyeHeight() - 1.5);
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

    protected float clamp(float origin, float min, float max) {
        float a2 = MathHelper.wrapAngleTo180_float((float)(min - origin));
        if (a2 > max) {
            a2 = max;
        }
        if (a2 < -max) {
            a2 = -max;
        }
        Random a3 = new Random();
        float a4 = (float)a3.nextInt(15) * 0.01f;
        return origin + a2 + a4;
    }

    private double getYawDiff(EntityLivingBase entity) {
        float[] a2 = RotationUtils.getRotation(entity);
        float a3 = (int)a2[0];
        float a4 = AimAssist.mc.thePlayer.rotationYaw > a3 ? AimAssist.mc.thePlayer.rotationYaw - a3 : a3 - AimAssist.mc.thePlayer.rotationYaw;
        return a4;
    }

    private static int getHealthDiff(EntityLivingBase entity1, EntityLivingBase entity2) {
        return (int)(entity1.getHealth() - entity2.getHealth());
    }

    private static int getAngleDiff(EntityLivingBase entity1, EntityLivingBase entity2) {
        float[] a2 = RotationUtils.getRotation2(entity1);
        float[] a3 = RotationUtils.getRotation2(entity2);
        return (int)(AimAssist.mc.thePlayer.rotationYaw - a2[0] - (AimAssist.mc.thePlayer.rotationYaw - a3[0]));
    }

    private static double getDistanceToPlayer(EntityLivingBase entity) {
        return AimAssist.mc.thePlayer.getDistanceToEntity((Entity)entity);
    }

    private static double getDistanceToPlayer2(EntityLivingBase entity) {
        return AimAssist.mc.thePlayer.getDistanceToEntity((Entity)entity);
    }

    private static int getHealthDiff2(EntityLivingBase entity1, EntityLivingBase entity2) {
        return (int)(entity1.getHealth() - entity2.getHealth());
    }
}