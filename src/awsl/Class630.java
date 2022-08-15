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
package awsl;

import awsl.Class91;
import eventapi.Event;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovementInput;
import trash.foodbyte.event.EventPacket;

public class Class630
implements Event {
    public double Field2881;
    public double Field2882;
    public double Field2883;
    private boolean Field2884;
    public Entity Field2885;

    public Class630(Object a, double a2, double a3, double a4) {
        this.Field2885 = (Entity)a;
        this.Field2881 = a2;
        this.Field2882 = a3;
        this.Field2883 = a4;
    }

    public Boolean Method3502() {
        return this.Field2885 instanceof EntityPlayerSP;
    }

    public Entity Method3503() {
        return this.Field2885;
    }

    public double Method3504() {
        return this.Field2881;
    }

    public void Method3505(double a) {
        this.Field2881 = a;
    }

    public double Method3506() {
        return this.Field2882;
    }

    public void Method3507(double a) {
        this.Field2882 = a;
    }

    public double Method3508() {
        return this.Field2883;
    }

    public void Method3509(double a) {
        this.Field2883 = a;
    }

    public void Method3510(boolean a) {
        this.Field2884 = a;
    }

    public void Method3511(boolean a) {
        this.Field2884 = a;
    }

    /*
     * WARNING - void declaration
     */
    public void Method3512(double a) {
        void a2;
        Minecraft a3 = Minecraft.getMinecraft();
        MovementInput movementInput = a3.thePlayer.movementInput;
        String[] a4 = EventPacket.Method2243();
        double a5 = a2.moveForward;
        double a6 = a2.moveStrafe;
        double a7 = a3.thePlayer.rotationYaw;
        double a8 = a5 == 0.0 ? 90.0 : (a5 < 0.0 ? -45.0 : 45.0);
        boolean a9 = a5 != 0.0 || a6 != 0.0;
        a7 += a5 < 0.0 ? 180.0 : 0.0;
        if (a6 < 0.0) {
            a7 += a8;
            Class91.Method3647(new String[3]);
        }
        if (a6 > 0.0) {
            a7 -= a8;
        }
        this.Method3505(-((double)MathHelper.sin((float)((float)Math.toRadians((double)a7))) * a));
        this.Method3509((double)MathHelper.cos((float)((float)Math.toRadians((double)a7))) * a);
        this.Method3505(0.0);
        this.Method3509(0.0);
    }
}