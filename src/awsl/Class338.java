/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.Vec3
 */
package awsl;

import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

public class Class338 {
    public double Field1633;
    public double Field1634;
    public double Field1635;

    public Class338(double a, double a2, double a3) {
        this.Field1633 = a;
        this.Field1634 = a2;
        this.Field1635 = a3;
    }

    public double Method220() {
        return this.Field1633;
    }

    public double Method221() {
        return this.Field1634;
    }

    public double Method222() {
        return this.Field1635;
    }

    public double Method223(Vec3 a) {
        double a2 = a.xCoord - this.Field1633;
        double a3 = a.yCoord - this.Field1634;
        double a4 = a.zCoord - this.Field1635;
        return MathHelper.sqrt_double((double)(a2 * a2 + a3 * a3 + a4 * a4));
    }

    public Class338 Method224(double a, double a2, double a3) {
        return new Class338(this.Field1633 + a, this.Field1634 + a2, this.Field1635 + a3);
    }

    public Class338 Method225(double a) {
        return new Class338(this.Field1633 * a, this.Field1634 * a, this.Field1635 * a);
    }

    public Class338 Method226() {
        return new Class338(Math.floor((double)this.Field1633), Math.floor((double)this.Field1634), Math.floor((double)this.Field1635));
    }

    public double Method227(Class338 a) {
        return Math.pow((double)(a.Field1633 - this.Field1633), (double)2.0) + Math.pow((double)(a.Field1634 - this.Field1634), (double)2.0) + Math.pow((double)(a.Field1635 - this.Field1635), (double)2.0);
    }

    public Class338 Method228(Class338 a) {
        return this.Method224(a.Method220(), a.Method221(), a.Method222());
    }

    public Vec3 Method229() {
        return new Vec3(this.Field1633, this.Field1634, this.Field1635);
    }

    public String Method230() {
        return "[" + this.Field1633 + ";" + this.Field1634 + ";" + this.Field1635 + "]";
    }
}