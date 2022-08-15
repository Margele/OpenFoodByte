/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class702;
import awsl.Class776;
import awsl.Class798;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Class756
extends Class798 {
    private Class702 Field3298;
    private Class702 Field3299;
    private int Field3300 = 1;
    private BufferedImage Field3301;
    private float Field3302;

    public Class756() {
    }

    public Class756(Class702 a, Class702 a2) {
        this.Field3298 = a;
        this.Field3299 = a2;
    }

    public void Method1738(Class702 a) {
        this.Field3298 = a;
    }

    public Class702 Method1739() {
        return this.Field3298;
    }

    public void Method1740(Class702 a) {
        this.Field3299 = a;
    }

    public Class702 Method1741() {
        return this.Field3299;
    }

    public void Method9(int a) {
        this.Field3300 = a;
    }

    public int Method10() {
        return this.Field3300;
    }

    public void Method1271(BufferedImage a) {
        this.Field3301 = a;
    }

    public BufferedImage Method1272() {
        return this.Field3301;
    }

    public void Method56(float a) {
        this.Field3302 = a;
    }

    public float Method57() {
        return this.Field3302;
    }

    @Override
    protected void Method834(Rectangle a) {
        a.width *= this.Field3300;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        void a5;
        Object a6;
        int[] nArray = new int[a * a2];
        boolean a7 = Class193.Method1270();
        if (this.Field3301 != null) {
            a6 = this.Method104(this.Field3301, 0, 0, a, a2, null);
            this.Method1742(a3, (int[])a6, (int[])a5, this.Field3298, this.Field3299, a, a2, this.Field3302);
        }
        if (this.Field3300 <= 1) {
            this.Field3298.Method1794(a3, a, a2, this.Field3298, this.Field3299, (int[])a5);
        }
        a6 = new Class702(this.Field3298.Field3030, this.Field3298.Field3031, a, a2);
        int a8 = 0;
        if (a8 < this.Field3300) {
            float a9 = (float)a8 / (float)(this.Field3300 - 1);
            this.Field3298.Method1793(a9, this.Field3299, (Class702)a6);
            this.Field3298.Method1794(a3, a, a2, this.Field3298, (Class702)a6, (int[])a5);
            ++a8;
        }
        return a5;
    }

    public void Method1742(int[] a, int[] a2, int[] a3, Class702 a4, Class702 a5, int a6, int a7, float a8) {
        Class702 a9 = new Class702(a4.Field3030, a4.Field3031, a6, a7);
        a4.Method1793(a8, a5, a9);
        a4.Method1794(a, a6, a7, a4, a9, a3);
        int[] a10 = new int[a6 * a7];
        a5.Method1794(a2, a6, a7, a5, a9, a10);
        this.Method1278(a3, a10, a6, a7, a8);
    }

    public void Method1278(int[] a, int[] a2, int a3, int a4, float a5) {
        int a6 = 0;
        for (int a7 = 0; a7 < a4; ++a7) {
            for (int a8 = 0; a8 < a3; ++a8) {
                a[a6] = Class776.Method1719(a5, a[a6], a2[a6]);
                ++a6;
            }
        }
    }

    public String toString() {
        return "Distort/Mesh Warp...";
    }
}