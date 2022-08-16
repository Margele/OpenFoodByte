/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.MovementInput
 */
package trash.foodbyte.event;

import eventapi.Event;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovementInput;
import obfuscate.a;
import trash.foodbyte.event.EventPacket;

public class EventMove
implements Event {
    public double x;
    public double y;
    public double z;
    private boolean safewalk;
    public Entity entity;

    public EventMove(Object entity, double x, double y, double z) {
        this.entity = (Entity)entity;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Boolean isLocalPlayer() {
        return this.entity instanceof EntityPlayerSP;
    }

    public Entity getEntity() {
        return this.entity;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setSafewalk(boolean safewalk) {
        this.safewalk = safewalk;
    }

    public void iWannaSetSafewalkToo(boolean safewalk) {
        this.safewalk = safewalk;
    }

    /*
     * WARNING - void declaration
     */
    public void setSpeed(double a2) {
        void a3;
        Minecraft a4 = Minecraft.getMinecraft();
        MovementInput movementInput = a4.thePlayer.movementInput;
        String[] a5 = EventPacket.trash();
        double a6 = a3.moveForward;
        double a7 = a3.moveStrafe;
        double a8 = a4.thePlayer.rotationYaw;
        double a9 = a6 == 0.0 ? 90.0 : (a6 < 0.0 ? -45.0 : 45.0);
        boolean a10 = a6 != 0.0 || a7 != 0.0;
        a8 += a6 < 0.0 ? 180.0 : 0.0;
        if (a7 < 0.0) {
            a8 += a9;
            a.trash(new String[3]);
        }
        if (a7 > 0.0) {
            a8 -= a9;
        }
        this.setX(-((double)MathHelper.sin((float)((float)Math.toRadians((double)a8))) * a2));
        this.setZ((double)MathHelper.cos((float)((float)Math.toRadians((double)a8))) * a2);
        this.setX(0.0);
        this.setZ(0.0);
    }
}