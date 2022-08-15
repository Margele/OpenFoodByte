/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package trash.foodbyte.event;

import awsl.Class266;
import eventapi.Event;
import trash.foodbyte.event.Type;

public class EventMotion
implements Event,
Class266 {
    public static double x;
    public static double y;
    public static double z;
    public static float yaw;
    public static float pitch;
    public static boolean onGround;
    public static float Field2892;
    public static float Field2893;
    public static float Field2894;
    public static float Field2895;
    public boolean Field2896;
    public Type type;

    public boolean Method3515() {
        return this.Field2896;
    }

    public EventMotion(double x, double y, double z, float yaw, float pitch) {
        EventMotion.x = x;
        EventMotion.y = y;
        EventMotion.z = z;
        EventMotion.yaw = yaw;
        EventMotion.pitch = pitch;
        this.type = Type.PRE;
    }

    public EventMotion(double x, double y, double z, float yaw, float pitch, boolean onGround) {
        EventMotion.x = x;
        EventMotion.y = y;
        EventMotion.z = z;
        EventMotion.yaw = yaw;
        EventMotion.pitch = pitch;
        EventMotion.onGround = onGround;
        this.type = Type.PRE;
    }

    public EventMotion() {
        this.type = Type.POST;
    }

    public void Method2240() {
        Field2894 = Field2892;
        Field2895 = Field2893;
        Field2892 = yaw;
        Field2893 = pitch;
    }

    public Type Method3516() {
        return this.type;
    }

    public EventMotion(Type a) {
        this.type = a;
    }

    public boolean isPre() {
        return this.type == Type.PRE;
    }

    public boolean isPost() {
        return this.type == Type.POST;
    }

    @Override
    public boolean Method2241() {
        return this.Field2896;
    }

    @Override
    public void Method2300(boolean a) {
        this.Field2896 = a;
    }

    public double Method3519() {
        return y;
    }

    public void setX(double x) {
        EventMotion.x = x;
    }

    public void setY(double y) {
        EventMotion.y = y;
    }

    public void setZ(double z) {
        EventMotion.z = z;
    }

    public float getYaw() {
        return yaw;
    }

    public void setYaw(float yaw) {
        EventMotion.yaw = yaw;
    }

    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        EventMotion.pitch = pitch;
    }

    public boolean isOnGround() {
        return onGround;
    }

    public void setGround(boolean onGround) {
        EventMotion.onGround = onGround;
    }
}