/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Composite
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import java.awt.Composite;

public abstract class Class236
implements Composite {
    protected float Field1299;
    private static String[] Field1300;

    public Class236() {
        this(1.0f);
    }

    public Class236(float a) {
        if (a < 0.0f || a > 1.0f) {
            throw new IllegalArgumentException("RGBComposite: alpha must be between 0 and 1");
        }
        this.Field1299 = a;
    }

    public float Method2102() {
        return this.Field1299;
    }

    public int Method2103() {
        return Float.floatToIntBits((float)this.Field1299);
    }

    public boolean Method2104(Object a) {
        if (!(a instanceof Class236)) {
            return false;
        }
        Class236 a2 = (Class236)a;
        return this.Field1299 == a2.Field1299;
    }

    public static void Method2105(String[] stringArray) {
        Field1300 = stringArray;
    }

    public static String[] Method2106() {
        return Field1300;
    }

    private static IllegalArgumentException Method2107(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    static {
        if (Class236.Method2106() != null) {
            Class236.Method2105(new String[5]);
        }
    }
}