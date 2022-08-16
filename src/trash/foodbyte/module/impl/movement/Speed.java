/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  net.minecraft.network.play.server.S08PacketPlayerPosLook
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.MathHelper
 */
package trash.foodbyte.module.impl.movement;

import awsl.Class167;
import awsl.Class633;
import eventapi.EventTarget;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventMove;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflection.ReflectionsHelper;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.MoveUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Speed
extends Module {
    public ModeValue Field2431 = new ModeValue("Speed", "Speed Mode", "Hypixel", new String[]{"WatchDog", "WatchDogLow", "Hypixel", "JumpStrafe"}, "\u7ed5\u8fc7\u6a21\u5f0f{\u6b63\u5e38\u4e00\u822cSpeed,Hypixel}");
    public FloatValue Field2432 = new FloatValue("Speed", "Timer Boost", 1.0, 0.5, 2.0, 0.1, "Timer\u52a0\u901f");
    public BooleanValue Field2433 = new BooleanValue("Speed", "Strafe Look", true);
    public BooleanValue Field2434 = new BooleanValue("Speed", "Timer Boost", true);
    public BooleanValue Field2435 = new BooleanValue("Speed", "LagBack Check", true);
    public static TimeHelper Field2436 = new TimeHelper();
    private int stage;
    private double speed;
    private double Field2439;
    private double Field2440;

    public Speed() {
        super("Speed", "Speed", Category.MOVEMENT);
        this.setHideModule(true);
    }

    @Override
    public String getDescription() {
        return "\u52a0\u901f\u8fb9\u8df3\u8fb9\u8dd1";
    }

    @Override
    public boolean canUse() {
        return GlobalModule.INSTANCE.Field3186 == null || !PermissionManager.canUseModule("speed");
    }

    @Override
    public void onEnable() {
        this.speed = 0.0;
        this.stage = 0;
    }

    @Override
    public void onDisable() {
        ReflectionUtils.setTimerSpeed(1.0f);
    }

    @EventTarget
    public void Method762(Class633 a2) {
    }

    @EventTarget
    public void Method801(EventTickUpdate a2) {
    }

    @EventTarget
    public void Method755(EventTick a2) {
    }

    @EventTarget(value=3)
    public void Method712(EventMotion a2) {
        boolean bl = Class167.Method1501();
        this.setDisplayTag(this.Field2431.getMode());
        boolean bl2 = bl;
        if (a2.isPre()) {
            if (this.Field2433.getBooleanValue().booleanValue() && this.Method713() && !Speed.mc.thePlayer.isSneaking()) {
                a2.setYaw(this.Method276() / ((float)Math.PI / 180));
            }
            if (this.Field2431.isCurrentMode("JumpStrafe")) {
                if (Speed.mc.thePlayer.onGround && MoveUtils.isMoving()) {
                    MoveUtils.setSpeed(MoveUtils.getDefaultSpeed() - Math.random() / 50.0);
                    if (MoveUtils.isMoving()) {
                        if (this.Field2434.getBooleanValue().booleanValue()) {
                            ReflectionUtils.setTimerSpeed(this.Field2432.getFloatValue().floatValue());
                        }
                        Speed.mc.thePlayer.jump();
                        Speed.mc.thePlayer.motionY = MoveUtils.getJumpEffect(0.39999998688697813);
                        a2.setY(Speed.mc.thePlayer.motionY);
                    }
                    ReflectionUtils.setTimerSpeed(1.0f);
                }
                MoveUtils.setHypottedSpeed();
            }
            if (this.Field2431.isCurrentMode("WatchDog") && MoveUtils.isMoving()) {
                if (Speed.mc.thePlayer.onGround) {
                    Speed.mc.thePlayer.motionY = MoveUtils.getJumpEffect(0.42f);
                    this.speed = 0.3323;
                    if (Speed.mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
                        this.speed = 0.465023;
                    }
                    ReflectionUtils.setTimerSpeed(this.Field2432.getFloatValue().floatValue());
                }
                this.speed -= 0.006;
                MoveUtils.setSpeed2(this.speed);
            }
            if (this.Field2431.isCurrentMode("WatchDogLow")) {
                if (this.Field2434.getBooleanValue().booleanValue()) {
                    ReflectionUtils.setTimerSpeed(this.Field2432.getFloatValue().floatValue());
                }
                if (MoveUtils.isMoving() && Speed.mc.thePlayer.onGround) {
                    this.Field2439 = 1.2f;
                    Speed.mc.thePlayer.motionY = 0.31999998688697817;
                }
                MoveUtils.setSpeed2(MoveUtils.getMoveSpeed() * (double)0.90151f * this.Field2439);
                if (this.Field2439 > 1.0) {
                    this.Field2439 -= 0.05;
                }
            }
        }
    }

    private float Method1779() {
        double a2 = (Double)ReflectionsHelper.getFieldAsObject(Speed.mc.thePlayer, new String[]{ObfuscatedField.lastReportedPosX.getObfuscatedName()});
        double a3 = (Double)ReflectionsHelper.getFieldAsObject(Speed.mc.thePlayer, new String[]{ObfuscatedField.lastReportedPosY.getObfuscatedName()}) + (double)Speed.mc.thePlayer.getEyeHeight();
        double a4 = (Double)ReflectionsHelper.getFieldAsObject(Speed.mc.thePlayer, new String[]{ObfuscatedField.lastReportedPosZ.getObfuscatedName()});
        double a5 = Speed.mc.thePlayer.posX;
        double a6 = Speed.mc.thePlayer.posY + (double)Speed.mc.thePlayer.getEyeHeight();
        double a7 = Speed.mc.thePlayer.posZ;
        double a8 = a2 - a5;
        double a9 = a3 - a6;
        double a10 = a4 - a7;
        double a11 = Math.sqrt((double)(Math.pow((double)a8, (double)2.0) + Math.pow((double)a10, (double)2.0)));
        double a12 = Math.toDegrees((double)Math.atan2((double)a10, (double)a8)) + 90.0;
        double a13 = Math.toDegrees((double)Math.atan2((double)a11, (double)a9));
        return (float)a12;
    }

    @EventTarget
    public void Method274(EventMove e) {
        if (this.Field2431.isCurrentMode("Hypixel") && e.isLocalPlayer().booleanValue()) {
            double a2 = MoveUtils.getDefaultSpeed();
            if (MoveUtils.isMoving()) {
                if (this.Field2434.getBooleanValue().booleanValue() && !MoveUtils.isReallyOnGround(0.0) && Speed.mc.thePlayer.ticksExisted > 5) {
                    ReflectionUtils.setTimerSpeed(this.Field2432.getFloatValue().floatValue() + MoveUtils.getRandomFloat());
                }
                if (MoveUtils.isTouchingWall()) {
                    Speed.mc.thePlayer.motionY = MoveUtils.getJumpEffect(0.42f);
                    e.setY(Speed.mc.thePlayer.motionY);
                    this.stage = 0;
                }
                switch (this.stage) {
                    case 0: {
                        this.speed = a2 * 2.15;
                        break;
                    }
                    case 1: {
                        this.speed *= 0.58;
                        break;
                    }
                    case 4: {
                        this.speed = a2 * 1.2;
                        break;
                    }
                    default: {
                        this.speed = this.speed / 100.0 * 98.5;
                    }
                }
                ++this.stage;
                double[] a3 = MoveUtils.warp(this.Method276(), Math.max((double)a2, (double)this.speed));
                e.setX(a3[0]);
                e.setZ(a3[1]);
            } else {
                ReflectionUtils.setTimerSpeed(1.0f);
                Speed.mc.thePlayer.motionX = 0.0;
                e.setX(0.0);
                Speed.mc.thePlayer.motionZ = 0.0;
                e.setZ(0.0);
            }
        }
    }

    public float Method276() {
        float a2 = Speed.mc.thePlayer.rotationYaw;
        if (Speed.mc.thePlayer.moveForward < 0.0f) {
            a2 += 180.0f;
        }
        float a3 = 1.0f;
        if (Speed.mc.thePlayer.moveForward < 0.0f) {
            a3 = -0.5f;
        } else if (Speed.mc.thePlayer.moveForward > 0.0f) {
            a3 = 0.5f;
        }
        if (Speed.mc.thePlayer.moveStrafing > 0.0f) {
            a2 -= 90.0f * a3;
        }
        if (Speed.mc.thePlayer.moveStrafing < 0.0f) {
            a2 += 90.0f * a3;
        }
        a2 = (float)((double)a2 * 0.017453292);
        return a2;
    }

    private double Method1780() {
        this.Field2440 = Math.toRadians((double)Speed.mc.thePlayer.rotationYaw);
        boolean a2 = Class167.Method1501();
        boolean a3 = Speed.mc.thePlayer.moveForward > 0.0f;
        boolean a4 = Speed.mc.thePlayer.moveForward < 0.0f;
        boolean a5 = Speed.mc.thePlayer.moveStrafing > 0.0f;
        boolean a6 = Speed.mc.thePlayer.moveStrafing < 0.0f;
        boolean a7 = true;
        boolean a8 = true;
        double a9 = MathHelper.wrapAngleTo180_double((double)Speed.mc.thePlayer.rotationYaw);
        if (this.Field2440 == Double.NaN) {
            this.Field2440 = a9;
        }
        double a10 = 45.0;
        if (Math.abs((double)(a9 - this.Field2440)) > 45.0 && Math.abs((double)(a9 - this.Field2440)) < 315.0) {
            if (a9 > this.Field2440) {
                a9 += a10;
            }
            a9 -= a10;
        }
        this.Field2440 = a9;
        return Math.toRadians((double)a9);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Method713() {
        if (Speed.mc.gameSettings.keyBindForward.isKeyDown()) return true;
        if (Speed.mc.gameSettings.keyBindBack.isKeyDown()) return true;
        if (Speed.mc.gameSettings.keyBindLeft.isKeyDown()) return true;
        if (!Speed.mc.gameSettings.keyBindRight.isKeyDown()) return false;
        return true;
    }

    @EventTarget
    public void Method273(EventPacket a2) {
        if (this.Field2435.getBooleanValue().booleanValue() && a2.getPacket() instanceof S08PacketPlayerPosLook) {
            this.setState(false);
        }
    }
}