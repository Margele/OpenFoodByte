/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  net.minecraft.util.Vec3
 */
package awsl;

import awsl.Class209;
import awsl.Class221;
import awsl.Class670;
import awsl.Class91;
import java.util.ArrayList;
import net.minecraft.util.Vec3;

public class Class210 {
    private ArrayList Field1187;
    private boolean Field1188;
    private double Field1189;

    public Class210(ArrayList a, Vec3 a2, Class670 a3) {
        String[] stringArray = Class221.Method2164();
        String[] a4 = stringArray;
        this.Field1187 = a;
        Vec3 a5 = (Vec3)a.get(a.Method1799() - 1);
        double a6 = Math.abs((double)(a5.xCoord - a2.xCoord));
        double a7 = Math.abs((double)(a5.yCoord - a2.yCoord));
        double a8 = Math.abs((double)(a5.zCoord - a2.zCoord));
        this.Field1189 = a6 + a7 + a8;
        switch (Class209.Field1186[a3.ordinal()]) {
            case 1: {
                if (a6 == a8) {
                    this.Field1189 -= 1.0;
                }
                if (a7 == a6) {
                    this.Field1189 -= 1.0;
                }
                if (a8 != a7) break;
                this.Field1189 -= 1.0;
                break;
            }
        }
        if (Class91.Method3648() == null) {
            Class221.Method2163(new String[3]);
        }
    }

    public ArrayList Method2523() {
        return this.Field1187;
    }

    public double Method2524() {
        return this.Field1189;
    }

    public void Method2525(boolean a) {
        this.Field1188 = a;
    }

    public boolean Method2526() {
        return this.Field1188;
    }
}