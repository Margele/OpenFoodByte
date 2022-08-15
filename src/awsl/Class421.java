/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package awsl;

import awsl.Class414;
import awsl.Class416;
import awsl.Class417;
import awsl.Class565;
import awsl.Class705;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import trash.foodbyte.utils.RenderUtils;

public class Class421 {
    public String Field2027;
    public double Field2028;
    public double Field2029;
    private double Field2030;
    private double Field2031;
    public double Field2032;
    public double Field2033;
    public boolean Field2034;
    public boolean Field2035;
    public boolean Field2036;
    public ArrayList Field2037;
    public ArrayList Field2038 = new ArrayList();
    public Class705 Field2039;
    private static String[] Field2040;

    public Class421(String a, double a2, double a3, double a4, double a5, boolean a6, Class705 a7) {
        this.Field2037 = new ArrayList();
        this.Field2027 = a;
        this.Field2028 = a2;
        this.Field2029 = a3;
        this.Field2032 = a4;
        this.Field2033 = a5;
        this.Field2035 = a6;
        this.Field2034 = false;
        this.Field2036 = true;
        this.Field2039 = a7;
        this.Method2381();
    }

    public void Method2381() {
    }

    public void Method2385(int a, int a2, float a3) {
        Object a4;
        Iterator iterator;
        int a5;
        double a6;
        String[] a7 = Class421.Method2390();
        if (!this.Field2036) {
            return;
        }
        if (this.Field2034) {
            this.Field2028 = this.Field2030 + (double)a;
            this.Field2029 = this.Field2031 + (double)a2;
        }
        Color a8 = Class416.Method2352().darker();
        int a9 = new Color(a8.getRed(), a8.getGreen(), a8.getBlue(), 170).getRGB();
        RenderUtils.Method1105(this.Field2028 - 2.0, this.Field2029, this.Field2028 + this.Field2032 + 2.0, this.Field2029 + this.Field2033, new Color(0, 155, 255).getRGB());
        Class565.Field2635.Method1224(this.Field2027.substring(0, 1) + this.Field2027.toLowerCase().substring(1, this.Field2027.length()), (float)(this.Field2028 + this.Field2032 / 2.0), (float)(this.Field2029 + 1.0), -1052689);
        if (this.Field2035 && !this.Field2037.isEmpty()) {
            a6 = this.Field2029 + this.Field2033;
            a5 = new Color(0, 0, 0, 150).getRGB();
            iterator = this.Field2037.Method1383();
            if (iterator.Method932()) {
                a4 = (Class414)iterator.Method933();
                RenderUtils.Method1105(this.Field2028, a6, this.Field2028 + this.Field2032, a6 + ((Class414)a4).Field2007 + 1.0, a5);
                ((Class414)a4).Field2004 = this.Field2028 + 2.0;
                ((Class414)a4).Field2005 = a6;
                ((Class414)a4).Field2006 = this.Field2032 - 4.0;
                ((Class414)a4).Method3568(a, a2, a3);
                a6 += ((Class414)a4).Field2007 + 1.0;
            }
            RenderUtils.Method1105(this.Field2028, a6 + 1.0, this.Field2028 + this.Field2032, a6 + 1.0, a5);
        }
        if (this.Field2035 && !this.Field2038.isEmpty()) {
            a6 = this.Field2029 + this.Field2033;
            a5 = new Color(0, 0, 0, 150).getRGB();
            iterator = this.Field2038.Method1383();
            if (iterator.Method932()) {
                a4 = (Class417)iterator.Method933();
                ((Class417)a4).Field2015 = this.Field2028 + 2.0;
                ((Class417)a4).Field2016 = a6;
                ((Class417)a4).Field2017 = this.Field2032 - 4.0;
                ((Class417)a4).Method2376(a, a2, a3);
                a6 += ((Class417)a4).Field2018 + 1.0;
            }
        }
    }

    public boolean Method2386(int a, int a2, int a3) {
        String[] a4 = Class421.Method2390();
        if (!this.Field2036) {
            return false;
        }
        if (this.Method2388(a, a2)) {
            this.Field2030 = this.Field2028 - (double)a;
            this.Field2031 = this.Field2029 - (double)a2;
            this.Field2034 = true;
            return true;
        }
        if (a3 == 1 && this.Method2388(a, a2)) {
            this.Field2035 = !this.Field2035;
            return true;
        }
        if (this.Field2035) {
            Object a5;
            Iterator iterator = this.Field2037.Method1383();
            if (iterator.Method932()) {
                a5 = (Class414)iterator.Method933();
                if (((Class414)a5).Method3569(a, a2, a3)) {
                    return true;
                }
            }
            if ((iterator = this.Field2038.Method1383()).Method932()) {
                a5 = (Class417)iterator.Method933();
                if (((Class417)a5).Method2377(a, a2, a3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void Method2387(int a, int a2, int a3) {
        if (!this.Field2036) {
            return;
        }
        this.Field2034 = false;
    }

    public boolean Method2388(int a, int a2) {
        return (double)a >= this.Field2028 && (double)a <= this.Field2028 + this.Field2032 && (double)a2 >= this.Field2029 && (double)a2 <= this.Field2029 + this.Field2033;
    }

    public static void Method2389(String[] stringArray) {
        Field2040 = stringArray;
    }

    public static String[] Method2390() {
        return Field2040;
    }

    static {
        if (Class421.Method2390() == null) {
            Class421.Method2389(new String[4]);
        }
    }
}