/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 */
package trash.foodbyte.value;

import awsl.Class446;
import awsl.Class447;
import awsl.Class681;
import java.awt.Color;

public class ColorValue
extends Class447 {
    private Color Field2126;
    private boolean Field2127 = false;
    private double Field2128 = 1.0;

    public double Method2435() {
        return this.Field2128;
    }

    public void Method2436(double a) {
        this.Field2128 = a;
    }

    public boolean Method2437() {
        return this.Field2127;
    }

    public void Method2438(boolean a) {
        this.Field2127 = a;
    }

    public ColorValue(String a, String a2, Color a3, boolean a4) {
        this.Field2117 = a;
        this.Field2118 = a2;
        this.Field2126 = a3;
        Class446.Method2762(this);
    }

    public ColorValue(String a, String a2, Color a3, String a4) {
        this(a, a2, a3, false);
        this.Field2119 = a4;
    }

    public ColorValue(String a, String a2, Color a3) {
        this(a, a2, a3, false);
    }

    public void Method2439(Color a) {
        this.Field2126 = a;
    }

    public void Method2440(int a) {
        this.Field2126 = Class681.Method2697(a);
    }

    public Color Method2441() {
        return this.Field2126;
    }

    public int Method2442() {
        return this.Method2444().getRGB();
    }

    public float[] Method2443() {
        Color a = this.Field2126;
        return Color.RGBtoHSB((int)a.getRed(), (int)a.getGreen(), (int)a.getBlue(), null);
    }

    public Color Method2444() {
        return this.Method2445(0L);
    }

    public Color Method2445(long a) {
        if (this.Field2127) {
            float a2 = (float)(Math.ceil((double)((double)System.currentTimeMillis() / 14.1 + (double)a)) % 360.0 / 360.0);
            float[] a3 = this.Method2443();
            return Class681.Method2698(Color.getHSBColor((float)a2, (float)a3[1], (float)a3[2]).getRGB(), this.Field2126.getAlpha());
        }
        return this.Field2126;
    }

    public void Method2446(int a) {
        Color a2;
        Color a3 = this.Field2126;
        this.Field2126 = a2 = new Color(a, a3.getGreen(), a3.getBlue(), a3.getAlpha());
    }

    public void Method2447(int a) {
        Color a2;
        Color a3 = this.Field2126;
        this.Field2126 = a2 = new Color(a3.getRed(), a, a3.getBlue(), a3.getAlpha());
    }

    public void Method2448(int a) {
        Color a2;
        Color a3 = this.Field2126;
        this.Field2126 = a2 = new Color(a3.getRed(), a3.getGreen(), a, a3.getAlpha());
    }

    public void Method2449(int a) {
        Color a2;
        Color a3 = this.Field2126;
        this.Field2126 = a2 = new Color(a3.getRed(), a3.getGreen(), a3.getBlue(), a);
    }

    public int Method2450() {
        return this.Method2444().getRed();
    }

    public int Method2451() {
        return this.Method2444().getGreen();
    }

    public int Method2452() {
        return this.Method2444().getBlue();
    }

    public int Method2453() {
        return this.Method2444().getAlpha();
    }

    @Override
    public Object Method2454() {
        return this.Method2441();
    }
}