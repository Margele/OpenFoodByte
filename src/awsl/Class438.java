/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  net.minecraft.client.Minecraft
 */
package awsl;

import net.minecraft.client.Minecraft;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.utils.MathUtils;

public final class Class438 {
    private double Field2080;
    private double Field2081;
    final Notification Field2082;

    public Class438(Notification a, double a2, double a3) {
        this.Field2082 = a;
        this.Field2080 = a2;
        this.Field2081 = a3;
    }

    public void Method2666(double a, double a2) {
        this.Field2080 = this.Method2671(this.Field2080, a, 1.0);
        this.Field2081 = this.Method2671(this.Field2081, a2, 1.0);
    }

    public double Method2667() {
        return this.Field2080;
    }

    public void Method2668(float a) {
        this.Field2080 = a;
    }

    public double Method2669() {
        return this.Field2081;
    }

    public void Method2670(float a) {
        this.Field2081 = a;
    }

    public double Method2671(double a, double a2, double a3) {
        double a4 = Math.abs((double)(a - a2));
        int a5 = Minecraft.getDebugFPS();
        if (a4 > 0.0) {
            double a6 = MathUtils.floor(Math.min((double)10.0, (double)Math.max((double)0.05, (double)(144.0 / (double)a5 * (a4 / 10.0) * a3))), 0.05);
            if (a4 != 0.0 && a4 < a6) {
                a6 = a4;
            }
            if (a < a2) {
                return a + a6;
            }
            if (a > a2) {
                return a - a6;
            }
        }
        return a;
    }
}