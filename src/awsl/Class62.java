/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class119;
import awsl.Class193;
import awsl.Class767;
import java.awt.image.BufferedImage;

public abstract class Class62
extends Class119 {
    protected int[] Field630;
    protected int[] Field631;
    protected int[] Field632;
    protected boolean Field633 = false;

    public Class62() {
        this.Field950 = true;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 & 0xFF000000;
        int a5 = a3 >> 16 & 0xFF;
        int a6 = a3 >> 8 & 0xFF;
        int a7 = a3 & 0xFF;
        a5 = this.Field630[a5];
        a6 = this.Field631[a6];
        a7 = this.Field632[a7];
        return a4 | a5 << 16 | a6 << 8 | a7;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        if (!this.Field633) {
            this.Method89();
        }
        return super.Method62(a, a2);
    }

    protected void Method89() {
        this.Field633 = true;
        this.Field632 = this.Method86();
        this.Field631 = this.Field632;
        this.Field630 = this.Field632;
    }

    protected int[] Method86() {
        int[] a = new int[256];
        int a2 = 0;
        boolean a3 = Class193.Method1270();
        if (a2 < 256) {
            a[a2] = Class767.Method1687((int)(255.0f * this.Method29((float)a2 / 255.0f)));
            ++a2;
        }
        return a;
    }

    protected float Method29(float a) {
        return 0.0f;
    }

    public int[] Method3782() {
        boolean a = Class193.Method1269();
        if (!this.Field633) {
            this.Method89();
        }
        int[] a2 = new int[256];
        int a3 = 0;
        if (a3 < 256) {
            a2[a3] = this.Method3(0, 0, a3 << 24 | a3 << 16 | a3 << 8 | a3);
            ++a3;
        }
        return a2;
    }
}