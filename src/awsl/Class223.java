/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.util.Vec3i
 */
package awsl;

import awsl.Class216;
import net.minecraft.util.Vec3i;
import obfuscate.a;

public class Class223 {
    public static final Class223 Field1238 = new Class223(0.0, 0.0, 0.0);
    public final double Field1239;
    public final double Field1240;
    public final double Field1241;

    public Class223(double a, double a2, double a3) {
        if (a == -0.0) {
            a = 0.0;
        }
        if (a2 == -0.0) {
            a2 = 0.0;
        }
        if (a3 == -0.0) {
            a3 = 0.0;
        }
        this.Field1239 = a;
        this.Field1240 = a2;
        this.Field1241 = a3;
    }

    public Class223(Vec3i a) {
        this(a.getX(), a.getY(), a.getZ());
    }

    public Class223 Method2169() {
        double a = Math.sqrt((double)(this.Field1239 * this.Field1239 + this.Field1240 * this.Field1240 + this.Field1241 * this.Field1241));
        return a < 1.0E-4 ? Field1238 : new Class223(this.Field1239 / a, this.Field1240 / a, this.Field1241 / a);
    }

    public Class223 Method2170(Class223 a) {
        return this.Method2171(a.Field1239, a.Field1240, a.Field1241);
    }

    public Class223 Method2171(double a, double a2, double a3) {
        return this.Method2173(-a, -a2, -a3);
    }

    public Class223 Method2172(Class223 a) {
        return this.Method2173(a.Field1239, a.Field1240, a.Field1241);
    }

    public Class223 Method2173(double a, double a2, double a3) {
        return new Class223(this.Field1239 + a, this.Field1240 + a2, this.Field1241 + a3);
    }

    public double Method2174(Class223 a) {
        double a2 = a.Field1239 - this.Field1239;
        double a3 = a.Field1240 - this.Field1240;
        double a4 = a.Field1241 - this.Field1241;
        return a2 * a2 + a3 * a3 + a4 * a4;
    }

    public double Method2175(double a, double a2, double a3) {
        double a4 = a - this.Field1239;
        double a5 = a2 - this.Field1240;
        double a6 = a3 - this.Field1241;
        return a4 * a4 + a5 * a5 + a6 * a6;
    }

    public Class223 Method2176(double a) {
        return new Class223(this.Field1239 * a, this.Field1240 * a, this.Field1241 * a);
    }

    public boolean Method2177(Object a) {
        if (this == a) {
            return true;
        }
        if (!(a instanceof Class223)) {
            return false;
        }
        Class223 a2 = (Class223)a;
        return Double.compare((double)a2.Field1239, (double)this.Field1239) == 0 && Double.compare((double)a2.Field1240, (double)this.Field1240) == 0 && Double.compare((double)a2.Field1241, (double)this.Field1241) == 0;
    }

    public int Method2178() {
        int a2;
        long a3 = Double.doubleToLongBits((double)this.Field1239);
        int n = (int)(a3 ^ a3 >>> 32);
        a3 = Double.doubleToLongBits((double)this.Field1240);
        a2 = 31 * a2 + (int)(a3 ^ a3 >>> 32);
        String a4 = Class216.Method2647();
        a3 = Double.doubleToLongBits((double)this.Field1241);
        a2 = 31 * a2 + (int)(a3 ^ a3 >>> 32);
        if (a.trash() == null) {
            Class216.Method2646("w2n8Y");
        }
        return a2;
    }

    public String Method2179() {
        return "(" + this.Field1239 + ", " + this.Field1240 + ", " + this.Field1241 + ")";
    }

    public Class223 Method2180(float a2) {
        return new Class223(this.Field1239 * (double)a2, this.Field1240 * (double)a2, this.Field1241 * (double)a2);
    }
}