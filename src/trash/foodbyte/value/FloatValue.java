/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package trash.foodbyte.value;

import awsl.Class333;
import awsl.Class446;
import awsl.Class447;

public class FloatValue
extends Class447 {
    Class333 Field2093 = new Class333(1.0f);
    private float Field2094;
    private float Field2095;
    private float Field2096;
    private String Field2097;
    public boolean Field2098;
    private static int Field2099;

    public FloatValue(String a, String a2, float a3, float a4, float a5, float a6, boolean a7) {
        this.Field2117 = a;
        this.Field2118 = a2;
        this.Field2120 = Float.valueOf((float)a3);
        this.Field2094 = a4;
        this.Field2095 = a5;
        this.Field2096 = a6;
        this.Field2098 = false;
        Class446.Method2762(this);
    }

    public FloatValue(String a, String a2, float a3, float a4, float a5, float a6) {
        this(a, a2, a3, a4, a5, a6, false);
    }

    public FloatValue(String a, String a2, float a3, float a4, float a5, float a6, String a7) {
        this(a, a2, a3, a4, a5, a6);
        this.Field2119 = a7;
    }

    public FloatValue(String a, String a2, String a3, float a4, float a5, float a6, float a7) {
        this(a, a2, a4, a5, a6, a7);
        this.Field2097 = a3;
    }

    public FloatValue(String a, String a2, float a3, float a4, float a5, float a6, String a7, String a8) {
        this(a, a2, a3, a4, a5, a6);
        this.Field2097 = a7;
        this.Field2119 = a8;
    }

    public FloatValue(String a, String a2, double a3, double a4, double a5, double a6, boolean a7) {
        this.Field2117 = a;
        this.Field2118 = a2;
        this.Field2120 = Float.valueOf((float)((float)a3));
        this.Field2094 = (float)a4;
        this.Field2095 = (float)a5;
        this.Field2096 = (float)a6;
        this.Field2098 = false;
        Class446.Method2762(this);
    }

    public FloatValue(String a, String a2, double a3, double a4, double a5, double a6) {
        this(a, a2, a3, a4, a5, a6, false);
    }

    public FloatValue(String a, String a2, double a3, double a4, double a5, double a6, String a7) {
        this(a, a2, a3, a4, a5, a6);
        this.Field2119 = a7;
    }

    public FloatValue(String a, String a2, String a3, double a4, double a5, double a6, double a7) {
        this(a, a2, a4, a5, a6, a7);
        this.Field2097 = a3;
    }

    public FloatValue(String a, String a2, double a3, double a4, double a5, double a6, String a7, String a8) {
        this(a, a2, a3, a4, a5, a6);
        this.Field2097 = a7;
        this.Field2119 = a8;
    }

    public Float Method2744() {
        return (Float)this.Field2120;
    }

    public void Method2745(float a) {
        if (a < this.Field2094) {
            a = this.Field2094;
        }
        if (a > this.Field2095) {
            a = this.Field2095;
        }
        this.Field2120 = Float.valueOf((float)a);
    }

    public float Method2746() {
        return this.Method2744().floatValue();
    }

    public void Method2747(float a) {
        this.Method2745(a);
    }

    public double Method2435() {
        return this.Field2094;
    }

    public double Method2748() {
        return this.Field2095;
    }

    public double Method2749() {
        return this.Field2096;
    }

    public Class333 Method2727() {
        return this.Field2093;
    }

    public float Method2750() {
        return this.Field2094;
    }

    public float Method2751() {
        return this.Field2095;
    }

    public String Method2719() {
        return this.Field2097;
    }

    public float Method2752() {
        return this.Field2096;
    }

    @Override
    public Object Method2454() {
        return this.Method2744();
    }

    public static void Method2440(int n) {
        Field2099 = n;
    }

    public static int Method2442() {
        return Field2099;
    }

    public static int Method2450() {
        int n = FloatValue.Method2442();
        return 108;
    }

    static {
        if (FloatValue.Method2442() != 0) {
            FloatValue.Method2440(121);
        }
    }
}