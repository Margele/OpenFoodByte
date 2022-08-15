/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Random
 */
package awsl;

import awsl.Class119;
import awsl.Class776;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Class121
extends Class119 {
    private float Field954 = 1.0f;
    private float Field955 = 0.0f;
    private float Field956;
    private float Field957;
    private Random Field958;

    public void Method56(float a) {
        this.Field954 = a;
    }

    public float Method57() {
        return this.Field954;
    }

    public void Method58(float a) {
        this.Field955 = a;
    }

    public float Method59() {
        return this.Field955;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        float a3 = (1.0f - this.Field954) * (1.0f + this.Field955);
        this.Field956 = a3 - this.Field955;
        this.Field957 = a3;
        this.Field958 = new Random(0L);
        return super.Method62(a, a2);
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 >> 24 & 0xFF;
        float a5 = this.Field958.nextFloat();
        float a6 = Class776.Method1708(this.Field956, this.Field957, a5);
        return (int)((float)a4 * a6) << 24 | a3 & 0xFFFFFF;
    }

    public String toString() {
        return "Stylize/Dissolve...";
    }
}