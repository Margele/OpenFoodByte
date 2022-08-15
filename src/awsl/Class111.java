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

import awsl.Class119;
import awsl.Class187;
import awsl.Class193;
import awsl.Class776;
import java.awt.image.BufferedImage;

public class Class111
extends Class119 {
    private float Field872;
    private float Field873 = 0.0f;
    protected float Field874 = 5.0f;
    private float Field875;
    private float Field876;

    public Class111() {
        this(3.0f, 0.75f, 0.0f);
    }

    public Class111(float a, float a2, float a3) {
        this.Field874 = a;
        this.Field872 = a2;
        this.Field873 = a3;
    }

    public void Method56(float a) {
        this.Field874 = a;
    }

    public float Method57() {
        return this.Field874;
    }

    public void Method58(float a) {
        this.Field872 = a;
    }

    public float Method59() {
        return this.Field872;
    }

    public void Method60(float a) {
        this.Field873 = a;
    }

    public float Method61() {
        return this.Field873;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        a2 = new Class187((int)this.Field874).Method62(a, null);
        this.Field875 = 255.0f * (this.Field872 - this.Field873 * 0.5f);
        this.Field876 = 255.0f * (this.Field872 + this.Field873 * 0.5f);
        return super.Method62(a2, a2);
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4;
        int n = a3 >> 24 & 0xFF;
        int n2 = a3 >> 16 & 0xFF;
        boolean a5 = Class193.Method1270();
        int a6 = a3 >> 8 & 0xFF;
        int a7 = a3 & 0xFF;
        if (a4 == 255) {
            return -1;
        }
        float a8 = Class776.Method1708(this.Field875, this.Field876, a4);
        a4 = (int)(a8 * 255.0f);
        a4 = 0;
        if (a4 > 255) {
            a4 = 255;
        }
        return a4 << 24 | 0xFFFFFF;
    }

    public String toString() {
        return "Alpha/Erode...";
    }
}