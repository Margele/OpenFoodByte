/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import obfuscate.a;

public class Class391 {
    private float Field1925;
    private float Field1926;
    private float Field1927;
    private float Field1928;
    private static String[] Field1929;

    public Class391() {
    }

    public Class391(float a, float a2, float a3, float a4) {
        this.Field1925 = a;
        this.Field1926 = a2;
        this.Field1927 = a3;
        this.Field1928 = a4;
    }

    public float Method1295() {
        return this.Field1925;
    }

    public float Method1296() {
        return this.Field1926;
    }

    public float Method1297() {
        return this.Field1927;
    }

    public float Method1298() {
        return this.Field1928;
    }

    public void Method1299(float a) {
        this.Field1925 = a;
    }

    public void Method1300(float a) {
        this.Field1926 = a;
    }

    public void Method1301(float a) {
        this.Field1927 = a;
    }

    public void Method1302(float a) {
        this.Field1928 = a;
    }

    public boolean Method1303(Object a) {
        if (a == this) {
            return true;
        }
        if (!(a instanceof Class391)) {
            return false;
        }
        Class391 a2 = (Class391)a;
        if (!a2.Method1304(this)) {
            return false;
        }
        if (Float.compare((float)this.Method1295(), (float)a2.Method1295()) != 0) {
            return false;
        }
        if (Float.compare((float)this.Method1296(), (float)a2.Method1296()) != 0) {
            return false;
        }
        if (Float.compare((float)this.Method1297(), (float)a2.Method1297()) != 0) {
            return false;
        }
        return Float.compare((float)this.Method1298(), (float)a2.Method1298()) == 0;
    }

    protected boolean Method1304(Object a) {
        return a instanceof Class391;
    }

    public int Method1305() {
        int a2 = 59;
        int a3 = 1;
        a3 = a3 * 59 + Float.floatToIntBits((float)this.Method1295());
        a3 = a3 * 59 + Float.floatToIntBits((float)this.Method1296());
        a3 = a3 * 59 + Float.floatToIntBits((float)this.Method1297());
        a3 = a3 * 59 + Float.floatToIntBits((float)this.Method1298());
        String[] a4 = Class391.Method1308();
        a.trash(new String[2]);
        return a3;
    }

    public String Method1306() {
        String[] stringArray = Class391.Method1308();
        String string = "Rect(x=" + this.Method1295() + ", y=" + this.Method1296() + ", width=" + this.Method1297() + ", height=" + this.Method1298() + ")";
        if (a.trash() == null) {
            Class391.Method1307(new String[2]);
        }
        return string;
    }

    public static void Method1307(String[] stringArray) {
        Field1929 = stringArray;
    }

    public static String[] Method1308() {
        return Field1929;
    }

    static {
        Class391.Method1307(new String[4]);
    }
}