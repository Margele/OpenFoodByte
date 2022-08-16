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
import java.util.ArrayList;
import net.minecraft.util.Vec3;
import obfuscate.a;

public class Class210 {
    private ArrayList Field1187;
    private boolean Field1188;
    private double Field1189;

    public Class210(ArrayList a2, Vec3 a3, Class670 a4) {
        String[] stringArray = Class221.Method2164();
        String[] a5 = stringArray;
        this.Field1187 = a2;
        Vec3 a6 = (Vec3)a2.get(a2.Method1799() - 1);
        double a7 = Math.abs((double)(a6.xCoord - a3.xCoord));
        double a8 = Math.abs((double)(a6.yCoord - a3.yCoord));
        double a9 = Math.abs((double)(a6.zCoord - a3.zCoord));
        this.Field1189 = a7 + a8 + a9;
        switch (Class209.Field1186[a4.ordinal()]) {
            case 1: {
                if (a7 == a9) {
                    this.Field1189 -= 1.0;
                }
                if (a8 == a7) {
                    this.Field1189 -= 1.0;
                }
                if (a9 != a8) break;
                this.Field1189 -= 1.0;
                break;
            }
        }
        if (a.trash() == null) {
            Class221.Method2163(new String[3]);
        }
    }

    public ArrayList Method2523() {
        return this.Field1187;
    }

    public double Method2524() {
        return this.Field1189;
    }

    public void Method2525(boolean a2) {
        this.Field1188 = a2;
    }

    public boolean Method2526() {
        return this.Field1188;
    }
}