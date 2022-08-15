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
import awsl.Class193;

public class Class20
extends Class119 {
    private int Field229;
    private int[] Field230;
    private boolean Field231 = false;

    public Class20() {
        this.Method9(6);
    }

    public void Method9(int a) {
        this.Field229 = a;
        this.Field231 = false;
    }

    public int Method10() {
        return this.Field229;
    }

    protected void Method89() {
        int a;
        this.Field230 = new int[256];
        boolean a2 = Class193.Method1269();
        if (this.Field229 != 1 && (a = 0) < 256) {
            this.Field230[a] = 255 * (this.Field229 * a / 256) / (this.Field229 - 1);
            ++a;
        }
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        if (!this.Field231) {
            this.Field231 = true;
            this.Method89();
        }
        int a4 = a3 & 0xFF000000;
        int a5 = a3 >> 16 & 0xFF;
        int a6 = a3 >> 8 & 0xFF;
        int a7 = a3 & 0xFF;
        a5 = this.Field230[a5];
        a6 = this.Field230[a6];
        a7 = this.Field230[a7];
        return a4 | a5 << 16 | a6 << 8 | a7;
    }

    public String toString() {
        return "Colors/Posterize...";
    }
}