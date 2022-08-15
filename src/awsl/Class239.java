/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.AlphaComposite
 *  java.awt.Composite
 *  java.awt.CompositeContext
 *  java.awt.RenderingHints
 *  java.awt.image.ColorModel
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class145;
import awsl.Class147;
import awsl.Class156;
import awsl.Class157;
import awsl.Class158;
import awsl.Class159;
import awsl.Class160;
import awsl.Class162;
import awsl.Class163;
import awsl.Class164;
import awsl.Class166;
import awsl.Class168;
import awsl.Class170;
import awsl.Class172;
import awsl.Class174;
import awsl.Class175;
import awsl.Class176;
import awsl.Class177;
import awsl.Class237;
import awsl.Class242;
import awsl.Class243;
import awsl.Class245;
import awsl.Class246;
import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class Class239
implements Composite {
    public static final int Field1310 = 0;
    public static final int Field1311 = 1;
    public static final int Field1312 = 2;
    public static final int Field1313 = 3;
    public static final int Field1314 = 4;
    public static final int Field1315 = 5;
    public static final int Field1316 = 6;
    public static final int Field1317 = 7;
    public static final int Field1318 = 8;
    public static final int Field1319 = 9;
    public static final int Field1320 = 10;
    public static final int Field1321 = 11;
    public static final int Field1322 = 12;
    public static final int Field1323 = 13;
    public static final int Field1324 = 14;
    public static final int Field1325 = 15;
    public static final int Field1326 = 16;
    public static final int Field1327 = 17;
    public static final int Field1328 = 18;
    public static final int Field1329 = 19;
    public static final int Field1330 = 20;
    public static final int Field1331 = 21;
    public static final int Field1332 = 22;
    public static final int Field1333 = 23;
    public static final int Field1334 = 24;
    private static final int Field1335 = 0;
    private static final int Field1336 = 24;
    public static String[] Field1337 = new String[]{"Normal", "Add", "Subtract", "Difference", "Multiply", "Darken", "Burn", "Color Burn", "Screen", "Lighten", "Dodge", "Color Dodge", "Hue", "Saturation", "Brightness", "Color", "Overlay", "Soft Light", "Hard Light", "Pin Light", "Exclusion", "Negation", "Average", "Stencil", "Silhouette"};
    protected float Field1338;
    protected int Field1339;

    private Class239(int a) {
        this(a, 1.0f);
    }

    private Class239(int a, float a2) {
        if (a2 < 0.0f || a2 > 1.0f) {
            throw new IllegalArgumentException("alpha value out of range");
        }
        if (a > 24) {
            throw new IllegalArgumentException("unknown composite rule");
        }
        this.Field1339 = a;
        this.Field1338 = a2;
    }

    public static Composite Method2275(int a, float a2) {
        switch (a) {
            case 0: {
                return AlphaComposite.getInstance((int)3, (float)a2);
            }
            case 1: {
                return new Class246(a2);
            }
            case 2: {
                return new Class147(a2);
            }
            case 3: {
                return new Class166(a2);
            }
            case 4: {
                return new Class158(a2);
            }
            case 5: {
                return new Class168(a2);
            }
            case 6: {
                return new Class243(a2);
            }
            case 7: {
                return new Class242(a2);
            }
            case 8: {
                return new Class162(a2);
            }
            case 9: {
                return new Class159(a2);
            }
            case 10: {
                return new Class177(a2);
            }
            case 11: {
                return new Class170(a2);
            }
            case 12: {
                return new Class174(a2);
            }
            case 13: {
                return new Class163(a2);
            }
            case 14: {
                return new Class145(a2);
            }
            case 15: {
                return new Class172(a2);
            }
            case 16: {
                return new Class156(a2);
            }
            case 17: {
                return new Class160(a2);
            }
            case 18: {
                return new Class175(a2);
            }
            case 19: {
                return new Class164(a2);
            }
            case 20: {
                return new Class176(a2);
            }
            case 21: {
                return new Class157(a2);
            }
            case 22: {
                return new Class245(a2);
            }
            case 23: {
                return AlphaComposite.getInstance((int)6, (float)a2);
            }
            case 24: {
                return AlphaComposite.getInstance((int)8, (float)a2);
            }
        }
        return new Class239(a, a2);
    }

    public CompositeContext Method1356(ColorModel a, ColorModel a2, RenderingHints a3) {
        return new Class237(this.Field1339, this.Field1338, a, a2);
    }

    public float Method2102() {
        return this.Field1338;
    }

    public int Method2276() {
        return this.Field1339;
    }

    public int Method2103() {
        return Float.floatToIntBits((float)this.Field1338) * 31 + this.Field1339;
    }

    public boolean Method2104(Object a) {
        if (!(a instanceof Class239)) {
            return false;
        }
        Class239 a2 = (Class239)a;
        if (this.Field1339 != a2.Field1339) {
            return false;
        }
        return this.Field1338 == a2.Field1338;
    }

    private static IllegalArgumentException Method2107(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}