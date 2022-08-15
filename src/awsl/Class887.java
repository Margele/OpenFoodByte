/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Point
 *  java.awt.Rectangle
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class877;
import java.awt.Point;
import java.awt.Rectangle;

public class Class887
extends Class877 {
    private float Field3884;
    private float Field3885;
    private float Field3886;
    private boolean Field3887 = true;

    public Class887() {
        this((float)Math.PI);
    }

    public Class887(float a) {
        this(a, true);
    }

    public Class887(float a, boolean a2) {
        this.Method56(a);
        this.Field3887 = a2;
    }

    public void Method56(float a) {
        this.Field3884 = a;
        this.Field3885 = (float)Math.cos((double)this.Field3884);
        this.Field3886 = (float)Math.sin((double)this.Field3884);
    }

    public float Method57() {
        return this.Field3884;
    }

    @Override
    protected void Method834(Rectangle a) {
        boolean a2 = Class193.Method1270();
        if (this.Field3887) {
            Point a3 = new Point(0, 0);
            int a4 = Integer.MAX_VALUE;
            int a5 = Integer.MAX_VALUE;
            int a6 = Integer.MIN_VALUE;
            int a7 = Integer.MIN_VALUE;
            int a8 = a.width;
            int a9 = a.height;
            int a10 = a.x;
            int a11 = a.y;
            int a12 = 0;
            if (a12 < 4) {
                switch (a12) {
                    case 0: {
                        this.Method3567(a10, a11, a3);
                    }
                    case 1: {
                        this.Method3567(a10 + a8, a11, a3);
                    }
                    case 2: {
                        this.Method3567(a10, a11 + a9, a3);
                    }
                    case 3: {
                        this.Method3567(a10 + a8, a11 + a9, a3);
                    }
                }
                a4 = Math.min((int)a4, (int)a3.x);
                a5 = Math.min((int)a5, (int)a3.y);
                a6 = Math.max((int)a6, (int)a3.x);
                a7 = Math.max((int)a7, (int)a3.y);
                ++a12;
            }
            a.x = a4;
            a.y = a5;
            a.width = a6 - a.x;
            a.height = a7 - a.y;
        }
    }

    private void Method3567(int a, int a2, Point a3) {
        a3.x = (int)((float)a * this.Field3885 + (float)a2 * this.Field3886);
        a3.y = (int)((float)a2 * this.Field3885 - (float)a * this.Field3886);
    }

    @Override
    protected void Method3439(int a, int a2, float[] a3) {
        a3[0] = (float)a * this.Field3885 - (float)a2 * this.Field3886;
        a3[1] = (float)a2 * this.Field3885 + (float)a * this.Field3886;
    }

    public String toString() {
        return "Rotate " + (int)((double)(this.Field3884 * 180.0f) / Math.PI);
    }
}