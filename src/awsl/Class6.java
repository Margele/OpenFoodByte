/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class119;
import awsl.Class767;

public class Class6
extends Class119 {
    private int[] Field109 = new int[]{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0};

    public void Method85(int[] a) {
        this.Field109 = a;
    }

    public int[] Method3438() {
        return this.Field109;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 >> 24 & 0xFF;
        int a5 = a3 >> 16 & 0xFF;
        int a6 = a3 >> 8 & 0xFF;
        int a7 = a3 & 0xFF;
        a4 = this.Field109[0] * a4 + this.Field109[1] * a5 + this.Field109[2] * a6 + this.Field109[3] * a7 + this.Field109[4] * 255;
        a5 = this.Field109[5] * a4 + this.Field109[6] * a5 + this.Field109[7] * a6 + this.Field109[8] * a7 + this.Field109[9] * 255;
        a6 = this.Field109[10] * a4 + this.Field109[11] * a5 + this.Field109[12] * a6 + this.Field109[13] * a7 + this.Field109[14] * 255;
        a7 = this.Field109[15] * a4 + this.Field109[16] * a5 + this.Field109[17] * a6 + this.Field109[18] * a7 + this.Field109[19] * 255;
        a4 = Class767.Method1687(a4);
        a5 = Class767.Method1687(a5);
        a6 = Class767.Method1687(a6);
        a7 = Class767.Method1687(a7);
        return a4 << 24 | a5 << 16 | a6 << 8 | a7;
    }

    public String toString() {
        return "Channels/Swizzle...";
    }
}