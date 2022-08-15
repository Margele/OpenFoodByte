/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package awsl;

public class Class33 {
    public static final int Field270 = 0;
    public static final int Field271 = 1;
    public static final int Field272 = 16;
    public static final int Field273 = 17;
    public static final int Field274 = 18;
    public static final int Field275 = 19;
    public static final int Field276 = 20;
    public static final int Field277 = 21;
    public static final int Field278 = 22;
    public static final int Field279 = 23;
    public static final int Field280 = 64;
    public static final int Field281 = 65;
    public static final int Field282 = 66;
    public static final int Field283 = 67;
    public static final int Field284 = 68;
    public static final int Field285 = 69;
    public static final int Field286 = 70;
    public static final int Field287 = 71;
    public static final int Field288 = 72;
    public static final int Field289 = 73;
    public static final int Field290 = 74;
    public static final int Field291 = 75;
    private int Field292;

    public Class33(int a) {
        this.Field292 = a;
    }

    public static Class33 Method3400(int a) {
        return new Class33(a << 24);
    }

    public static Class33 Method3401(int a, int a2) {
        return new Class33(a << 24 | a2 << 16);
    }

    public static Class33 Method3402(int a, int a2, int a3) {
        return new Class33(a << 24 | a2 << 16 | a3 << 8);
    }

    public static Class33 Method3403(int a) {
        return new Class33(0x10000000 | (a &= 0xFFFF) << 8);
    }

    public static Class33 Method3404(int a) {
        return new Class33(0x16000000 | a << 16);
    }

    public static Class33 Method3405(int a) {
        return new Class33(0x17000000 | a << 8);
    }

    public static Class33 Method3406(int a) {
        return new Class33(0x42000000 | a << 8);
    }

    public static Class33 Method3407(int a, int a2) {
        return new Class33(a << 24 | a2);
    }

    public int Method3408() {
        return this.Field292 >>> 24;
    }

    public int Method3409() {
        return (this.Field292 & 0xFF0000) >> 16;
    }

    public int Method3410() {
        return (this.Field292 & 0xFF00) >> 8;
    }

    public int Method3411() {
        return (short)((this.Field292 & 0xFFFF00) >> 8);
    }

    public int Method3412() {
        return (this.Field292 & 0xFF0000) >> 16;
    }

    public int Method3413() {
        return (this.Field292 & 0xFFFF00) >> 8;
    }

    public int Method3414() {
        return (this.Field292 & 0xFFFF00) >> 8;
    }

    public int Method3415() {
        return this.Field292 & 0xFF;
    }

    public int Method3416() {
        return this.Field292;
    }
}