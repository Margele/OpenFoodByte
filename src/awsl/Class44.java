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
import awsl.Class193;
import awsl.Class767;
import awsl.Class776;
import java.awt.image.BufferedImage;

public class Class44
extends Class119 {
    private int Field339 = -16777216;
    private int Field340 = -7829368;
    private int Field341 = -1;
    private int[] Field342;

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        float a3;
        int a4;
        this.Field342 = new int[256];
        boolean bl = false;
        boolean a5 = Class193.Method1269();
        if (a4 < 128) {
            a3 = (float)a4 / 127.0f;
            this.Field342[a4] = Class776.Method1719(a3, this.Field339, this.Field340);
            ++a4;
        }
        if ((a4 = 128) < 256) {
            a3 = (float)(a4 - 127) / 128.0f;
            this.Field342[a4] = Class776.Method1719(a3, this.Field340, this.Field341);
            ++a4;
        }
        a2 = super.Method62(a, a2);
        this.Field342 = null;
        return a2;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        return this.Field342[Class767.Method1689(a3)];
    }

    public void Method9(int a) {
        this.Field339 = a;
    }

    public int Method10() {
        return this.Field339;
    }

    public void Method11(int a) {
        this.Field340 = a;
    }

    public int Method12() {
        return this.Field340;
    }

    public void Method13(int a) {
        this.Field341 = a;
    }

    public int Method14() {
        return this.Field341;
    }

    public String toString() {
        return "Colors/Tritone...";
    }
}