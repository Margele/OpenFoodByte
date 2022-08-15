/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 */
package awsl;

import awsl.Class212;
import java.awt.Color;

public class Class284 {
    public double Field1536;
    public double Field1537;
    public double Field1538;
    public double Field1539;
    public double Field1540;
    public double Field1541;
    public Color Field1542;

    public void Method3103() {
        Class212.Method2553(this.Field1536, this.Field1537, this.Field1540, new Color(this.Field1542.getRed(), this.Field1542.getGreen(), this.Field1542.getBlue(), (int)this.Field1541));
    }

    public void Method3104() {
        this.Field1536 += this.Field1538 * 2.0;
        this.Field1537 += this.Field1539 * 2.0;
        this.Field1539 *= 0.95;
        this.Field1538 *= 0.95;
        this.Field1541 -= 2.0;
        if (this.Field1541 < 1.0) {
            this.Field1541 = 1.0;
        }
    }

    public void Method3105(double a, double a2, double a3, double a4, double a5, Color a6) {
        this.Field1536 = a;
        this.Field1537 = a2;
        this.Field1538 = a3;
        this.Field1539 = a4;
        this.Field1540 = a5;
        this.Field1541 = 254.0;
        this.Field1542 = a6;
    }
}