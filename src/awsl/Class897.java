/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class598;
import awsl.Class767;
import awsl.Class877;
import java.awt.image.BufferedImage;

public class Class897
extends Class877 {
    private float[] Field3976;
    private float[] Field3977;
    private float Field3978 = 4.0f;
    private float Field3979 = 4.0f;
    private float Field3980 = 1.0f;
    private float Field3981 = 1.0f;

    public Class897() {
        this.Method9(1);
    }

    public void Method56(float a) {
        this.Field3978 = a;
    }

    public float Method57() {
        return this.Field3978;
    }

    public void Method58(float a) {
        this.Field3979 = a;
    }

    public float Method59() {
        return this.Field3979;
    }

    public void Method60(float a) {
        this.Field3980 = a;
    }

    public float Method61() {
        return this.Field3980;
    }

    public void Method164(float a) {
        this.Field3981 = a;
    }

    public float Method165() {
        return this.Field3981;
    }

    private void Method89() {
        this.Field3976 = new float[256];
        boolean a = Class193.Method1269();
        this.Field3977 = new float[256];
        int a2 = 0;
        if (a2 < 256) {
            float a3 = (float)Math.PI * 2 * (float)a2 / 256.0f * this.Field3981;
            this.Field3976[a2] = (float)((double)(-this.Field3979) * Math.sin((double)a3));
            this.Field3977[a2] = (float)((double)this.Field3979 * Math.cos((double)a3));
            ++a2;
        }
    }

    private int Method1614(int a, int a2) {
        return Class767.Method1687((int)(127.0f * (1.0f + Class598.Method157((float)a / this.Field3978, (float)a2 / this.Field3978))));
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        int a4 = this.Method1614(a, a2);
        a3[0] = (float)a + this.Field3976[a4];
        a3[1] = (float)a2 + this.Field3977[a4];
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        this.Method89();
        return super.Method62(a, a2);
    }

    public String toString() {
        return "Distort/Marble...";
    }
}