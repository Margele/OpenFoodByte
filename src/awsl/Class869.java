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
import awsl.Class877;
import java.awt.image.BufferedImage;

public class Class869
extends Class877 {
    private float[] Field3799;
    private float[] Field3800;
    private float Field3801 = 4.0f;

    public Class869() {
        this.Method9(1);
    }

    public void Method56(float a) {
        this.Field3801 = a;
    }

    public float Method57() {
        return this.Field3801;
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        int a4 = (int)(Math.random() * 255.0);
        float a5 = (float)Math.random();
        a3[0] = (float)a + a5 * this.Field3799[a4];
        a3[1] = (float)a2 + a5 * this.Field3800[a4];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        void a3;
        this.Field3799 = new float[256];
        this.Field3800 = new float[256];
        boolean bl = false;
        boolean a4 = Class193.Method1269();
        if (a3 < 256) {
            float a5 = (float)Math.PI * 2 * (float)a3 / 256.0f;
            this.Field3799[a3] = (float)((double)this.Field3801 * Math.sin((double)a5));
            this.Field3800[a3] = (float)((double)this.Field3801 * Math.cos((double)a5));
            ++a3;
        }
        return super.Method62(a, a2);
    }

    public String toString() {
        return "Distort/Diffuse...";
    }
}