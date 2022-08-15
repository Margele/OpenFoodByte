/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.util.Vec3
 */
package awsl;

import net.minecraft.util.Vec3;

public class Class216 {
    public double Field1207;
    public double Field1208;
    public double Field1209;
    private static String Field1210;

    public Class216(double a, double a2, double a3) {
        this.Field1207 = a;
        this.Field1208 = a2;
        this.Field1209 = a3;
    }

    public double Method2637() {
        return this.Field1207;
    }

    public double Method2638() {
        return this.Field1208;
    }

    public double Method2639() {
        return this.Field1209;
    }

    public Class216 Method2640(double a, double a2, double a3) {
        return new Class216(this.Field1207 + a, this.Field1208 + a2, this.Field1209 + a3);
    }

    public Class216 Method2641() {
        return new Class216(Math.floor((double)this.Field1207), Math.floor((double)this.Field1208), Math.floor((double)this.Field1209));
    }

    public double Method2642(Class216 a) {
        return Math.pow((double)(a.Field1207 - this.Field1207), (double)2.0) + Math.pow((double)(a.Field1208 - this.Field1208), (double)2.0) + Math.pow((double)(a.Field1209 - this.Field1209), (double)2.0);
    }

    public Class216 Method2643(Class216 a) {
        return this.Method2640(a.Method2637(), a.Method2638(), a.Method2639());
    }

    public Vec3 Method2644() {
        return new Vec3(this.Field1207, this.Field1208, this.Field1209);
    }

    public String Method2645() {
        return "[" + this.Field1207 + ";" + this.Field1208 + ";" + this.Field1209 + "]";
    }

    public static void Method2646(String string) {
        Field1210 = string;
    }

    public static String Method2647() {
        return Field1210;
    }

    static {
        if (Class216.Method2647() != null) {
            Class216.Method2646("kZYyI");
        }
    }
}