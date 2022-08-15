/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

public class Class743 {
    public int Field3248;
    public int Field3249;
    public int Field3250;
    public int Field3251;
    public int Field3252;
    public int Field3253;
    public float Field3254;
    public float Field3255;

    public Class743(int a, int a2, int a3, int a4) {
        this.Field3248 = a;
        this.Field3249 = a2;
        this.Field3250 = a3;
        this.Field3251 = a4;
    }

    public void Method1676() {
        this.Field3252 = this.Field3250 - this.Field3248;
        this.Field3253 = this.Field3251 - this.Field3249;
        this.Field3255 = this.Field3252 * this.Field3252 + this.Field3253 * this.Field3253;
        this.Field3254 = (float)Math.sqrt((double)this.Field3255);
    }
}