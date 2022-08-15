/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class877;
import java.awt.image.BufferedImage;

public class Class889
extends Class877 {
    private int Field3891;
    private int Field3892;
    private int Field3893;
    private int Field3894;
    private boolean Field3895;

    public Class889() {
        this(0, 0, true);
    }

    public Class889(int a, int a2, boolean a3) {
        this.Field3893 = a;
        this.Field3894 = a2;
        this.Field3895 = a3;
        this.Method9(0);
    }

    public void Method13(int a) {
        this.Field3893 = a;
    }

    public int Method14() {
        return this.Field3893;
    }

    public void Method15(int a) {
        this.Field3894 = a;
    }

    public int Method16() {
        return this.Field3894;
    }

    public void Method87(boolean a) {
        this.Field3895 = a;
    }

    public boolean Method88() {
        return this.Field3895;
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        boolean bl = Class193.Method1269();
        if (this.Field3895) {
            a3[0] = (a + this.Field3891 - this.Field3893) % this.Field3891;
            a3[1] = (a2 + this.Field3892 - this.Field3894) % this.Field3892;
        }
        a3[0] = a - this.Field3893;
        a3[1] = a2 - this.Field3894;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        this.Field3891 = a.getWidth();
        boolean bl = Class193.Method1269();
        this.Field3892 = a.getHeight();
        if (this.Field3895) {
            if (this.Field3893 < 0) {
                this.Field3893 += this.Field3891;
            }
            if (this.Field3894 < 0) {
                this.Field3894 += this.Field3892;
            }
            this.Field3893 %= this.Field3891;
            this.Field3894 %= this.Field3892;
        }
        return super.Method62(a, a2);
    }

    public String toString() {
        return "Distort/Offset...";
    }
}