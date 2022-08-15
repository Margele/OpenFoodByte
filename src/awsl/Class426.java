/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class414;
import awsl.Class447;
import awsl.Class565;
import awsl.Class705;
import awsl.Class91;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Class426 {
    public Class705 Field2046;
    public Class414 Field2047;
    public Class447 Field2048;
    public double Field2049;
    public double Field2050;
    public double Field2051;
    public double Field2052;
    public double Field2053;
    public String Field2054;
    public boolean Field2055;
    private static String[] Field2056;

    public void Method2308() {
        this.Field2046 = this.Field2047.Field2003.Field2039;
    }

    public void Method2309() {
        String a;
        String a2;
        block11: {
            block13: {
                block12: {
                    this.Field2050 = this.Field2047.Field2004 + this.Field2047.Field2006 + 3.0;
                    this.Field2051 = this.Field2047.Field2003.Field2029 + this.Field2049 + 15.0;
                    this.Field2052 = this.Field2047.Field2006 + 10.0;
                    this.Field2053 = 15.0;
                    a2 = this.Field2048.Method2754();
                    String[] a3 = Class426.Method2315();
                    if (!(this.Field2048 instanceof ModeValue)) break block11;
                    if (!this.Field2055) break block12;
                    this.Field2053 = 25.0;
                    int a4 = 0;
                    if (a4 < ((ModeValue)this.Field2048).Method2728().length) {
                        a = ((ModeValue)this.Field2048).Method2728()[a4];
                        if (((ModeValue)this.Field2048).isCurrentMode(a)) {
                        }
                        this.Field2053 += (double)(Class565.Field2637.Field2625 - 5.0f);
                        ++a4;
                    }
                    if (((ModeValue)this.Field2048).Method2728().length <= 1) break block13;
                    this.Field2053 += 3.0;
                }
                this.Field2053 = 25.0;
            }
            this.Field2054 = this.Field2048.Method2754();
            double a5 = this.Field2050 + this.Field2052 - (double)((int)Class565.Field2637.Method1225(((ModeValue)this.Field2048).getMode()));
            if (a5 < this.Field2050 + 33.0) {
                this.Field2052 += this.Field2050 + 33.0 - a5;
            }
        }
        if (this.Field2048 instanceof FloatValue) {
            this.Field2054 = String.valueOf((Object)a2.substring(0, 1).toUpperCase()) + a2.substring(1, a2.length());
            String a6 = "" + (double)Math.round((double)((double)((FloatValue)this.Field2048).Method2744().floatValue() * 100.0)) / 100.0;
            a = "" + (double)Math.round((double)((double)((FloatValue)this.Field2048).Method2751() * 100.0)) / 100.0;
            double a7 = this.Field2050 + this.Field2052 - (double)Class565.Field2637.Method1225(this.Field2054) - (double)Class565.Field2637.Method1225(a) - 4.0;
            if (a7 < this.Field2050) {
                this.Field2052 += this.Field2050 - a7 + 1.0;
            }
        }
        if (this.Field2048 instanceof BooleanValue) {
            this.Field2054 = a2.substring(0, 1).toUpperCase() + a2.substring(1, a2.length());
            double a8 = this.Field2050 + this.Field2052 - (double)Class565.Field2637.Method1225(this.Field2054);
            if (a8 < this.Field2050 + 13.0) {
                this.Field2052 += this.Field2050 + 13.0 - a8 + 1.0;
            }
        }
        if (Class91.Method3648() == null) {
            Class426.Method2314(new String[2]);
        }
    }

    public void Method2310(int a, int a2, float a3) {
    }

    public boolean Method2311(int a, int a2, int a3) {
        return this.Method2313(a, a2);
    }

    public void Method2312(int a, int a2, int a3) {
    }

    public boolean Method2313(int a, int a2) {
        return (double)a >= this.Field2050 && (double)a <= this.Field2050 + this.Field2052 && (double)a2 >= this.Field2051 && (double)a2 <= this.Field2051 + this.Field2053;
    }

    public static void Method2314(String[] stringArray) {
        Field2056 = stringArray;
    }

    public static String[] Method2315() {
        return Field2056;
    }

    static {
        if (Class426.Method2315() == null) {
            Class426.Method2314(new String[5]);
        }
    }
}