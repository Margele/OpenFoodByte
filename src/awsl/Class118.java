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

public class Class118
extends Class119 {
    private int Field944;
    private int Field945;
    private int Field946;
    private int Field947;
    private int Field948;
    private int Field949;

    public Class118() {
        this.Field950 = true;
    }

    public void Method9(int a) {
        this.Field944 = a;
    }

    public int Method10() {
        return this.Field944;
    }

    public void Method11(int a) {
        this.Field945 = a;
    }

    public int Method12() {
        return this.Field945;
    }

    public void Method13(int a) {
        this.Field946 = a;
    }

    public int Method14() {
        return this.Field946;
    }

    public void Method15(int a) {
        this.Field947 = a;
    }

    public int Method16() {
        return this.Field947;
    }

    public void Method498(int a) {
        this.Field948 = a;
    }

    public int Method499() {
        return this.Field948;
    }

    public void Method500(int a) {
        this.Field949 = a;
    }

    public int Method501() {
        return this.Field949;
    }

    @Override
    public int Method3(int a, int a2, int a3) {
        int a4 = a3 & 0xFF000000;
        int a5 = a3 >> 16 & 0xFF;
        int a6 = a3 >> 8 & 0xFF;
        int a7 = a3 & 0xFF;
        int a8 = Class767.Method1687((this.Field947 * (this.Field944 * a6 + (255 - this.Field944) * a7) / 255 + (255 - this.Field947) * a5) / 255);
        int a9 = Class767.Method1687((this.Field948 * (this.Field945 * a7 + (255 - this.Field945) * a5) / 255 + (255 - this.Field948) * a6) / 255);
        int a10 = Class767.Method1687((this.Field949 * (this.Field946 * a5 + (255 - this.Field946) * a6) / 255 + (255 - this.Field949) * a7) / 255);
        return a4 | a8 << 16 | a9 << 8 | a10;
    }

    public String toString() {
        return "Colors/Mix Channels...";
    }
}