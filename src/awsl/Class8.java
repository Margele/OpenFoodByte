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
import awsl.Class776;
import java.awt.image.BufferedImage;

public class Class8
extends Class119 {
    private float Field111;
    private float Field112 = 0.0f;
    private float Field113 = 5.0f;
    private float Field114;
    private float Field115;
    private int Field116 = -1;
    private int Field117 = -16777216;

    public Class8() {
        this(0.5f);
    }

    public Class8(float a) {
        this.Method58(a);
    }

    public void Method56(float a) {
        this.Field113 = a;
    }

    public float Method57() {
        return this.Field113;
    }

    public void Method58(float a) {
        this.Field111 = a;
    }

    public float Method59() {
        return this.Field111;
    }

    public void Method60(float a) {
        this.Field112 = a;
    }

    public float Method61() {
        return this.Field112;
    }

    public void Method9(int a) {
        this.Field116 = a;
    }

    public int Method10() {
        return this.Field116;
    }

    public void Method11(int a) {
        this.Field117 = a;
    }

    public int Method12() {
        return this.Field117;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        a2 = new Class187((int)this.Field113).Method62(a, null);
        this.Field114 = 765.0f * (this.Field111 - this.Field112 * 0.5f);
        this.Field115 = 765.0f * (this.Field111 + this.Field112 * 0.5f);
        return super.Method62(a2, a2);
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 & 0xFF000000;
        int a5 = a3 >> 16 & 0xFF;
        int a6 = a3 >> 8 & 0xFF;
        int a7 = a3 & 0xFF;
        int a8 = a5 + a6 + a7;
        float a9 = Class776.Method1708(this.Field114, this.Field115, a8);
        return Class776.Method1719(a9, this.Field117, this.Field116);
    }

    public String toString() {
        return "Stylize/Stamp...";
    }
}