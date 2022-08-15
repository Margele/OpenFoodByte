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

public class Class222 {
    private final double Field1235;
    private final double Field1236;
    private final double Field1237;

    public Class222(double a, double a2, double a3) {
        this.Field1235 = a;
        this.Field1236 = a2;
        this.Field1237 = a3;
    }

    public double Method2182() {
        return this.Field1235;
    }

    public double Method2183() {
        return this.Field1236;
    }

    public double Method2184() {
        return this.Field1237;
    }

    public Class222 Method2185(double a, double a2, double a3) {
        return new Class222(this.Field1235 + a, this.Field1236 + a2, this.Field1237 + a3);
    }

    public Class222 Method2186() {
        return new Class222(Math.floor((double)this.Field1235), Math.floor((double)this.Field1236), Math.floor((double)this.Field1237));
    }

    public double Method2187(Class222 a) {
        return Math.pow((double)(a.Field1235 - this.Field1235), (double)2.0) + Math.pow((double)(a.Field1236 - this.Field1236), (double)2.0) + Math.pow((double)(a.Field1237 - this.Field1237), (double)2.0);
    }

    public Class222 Method2188(Class222 a) {
        return this.Method2185(a.Method2182(), a.Method2183(), a.Method2184());
    }

    public Vec3 Method2189() {
        return new Vec3(this.Field1235, this.Field1236, this.Field1237);
    }

    public String Method2190() {
        return "[" + this.Field1235 + ";" + this.Field1236 + ";" + this.Field1237 + "]";
    }
}