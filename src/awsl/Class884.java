/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class877;
import java.awt.Rectangle;

public class Class884
extends Class877 {
    private float Field3859 = 0.0f;
    private float Field3860 = 0.0f;
    private float Field3861 = 0.0f;
    private float Field3862 = 0.0f;
    private float Field3863 = 0.0f;
    private float Field3864 = 0.0f;
    private boolean Field3865 = true;

    public void Method87(boolean a) {
        this.Field3865 = a;
    }

    public boolean Method88() {
        return this.Field3865;
    }

    public void Method56(float a) {
        this.Field3859 = a;
        this.Method89();
    }

    public float Method57() {
        return this.Field3859;
    }

    public void Method58(float a) {
        this.Field3860 = a;
        this.Method89();
    }

    public float Method59() {
        return this.Field3860;
    }

    private void Method89() {
        this.Field3861 = (float)Math.sin((double)this.Field3859);
        this.Field3862 = (float)Math.sin((double)this.Field3860);
    }

    @Override
    protected void Method834(Rectangle a) {
        float a2 = (float)Math.tan((double)this.Field3859);
        this.Field3863 = (float)(-a.height) * a2;
        if ((double)a2 < 0.0) {
            a2 = -a2;
        }
        a.width = (int)((float)a.height * a2 + (float)a.width + 0.999999f);
        a2 = (float)Math.tan((double)this.Field3860);
        this.Field3864 = (float)(-a.width) * a2;
        if ((double)a2 < 0.0) {
            a2 = -a2;
        }
        a.height = (int)((float)a.width * a2 + (float)a.height + 0.999999f);
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        a3[0] = (float)a + this.Field3863 + (float)a2 * this.Field3861;
        a3[1] = (float)a2 + this.Field3864 + (float)a * this.Field3862;
    }

    public String toString() {
        return "Distort/Shear...";
    }
}