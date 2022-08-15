/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package awsl;

import awsl.Class193;
import awsl.Class776;

public class Class744 {
    public float[] Field3256;
    public float[] Field3257;

    public Class744() {
        this.Field3256 = new float[]{0.0f, 1.0f};
        this.Field3257 = new float[]{0.0f, 1.0f};
    }

    public Class744(Class744 a) {
        this.Field3256 = (float[])a.Field3256.clone();
        this.Field3257 = (float[])a.Field3257.clone();
    }

    /*
     * WARNING - void declaration
     */
    public int Method1672(float a, float a2) {
        void a3;
        void a4;
        int a5 = -1;
        int a6 = this.Field3256.length;
        float[] fArray = new float[a6 + 1];
        float[] a7 = new float[a6 + 1];
        int a8 = 0;
        boolean bl = false;
        boolean a9 = Class193.Method1270();
        if (a4 < a6) {
            if (a5 == -1 && this.Field3256[a4] > a) {
                a5 = a8;
                a3[a8] = a;
                a7[a8] = a2;
                ++a8;
            }
            a3[a8] = this.Field3256[a4];
            a7[a8] = this.Field3257[a4];
            ++a8;
            ++a4;
        }
        if (a5 == -1) {
            a5 = a8;
            a3[a8] = a;
            a7[a8] = a2;
        }
        this.Field3256 = a3;
        this.Field3257 = a7;
        return a5;
    }

    public void Method1673(int a) {
        int a2 = this.Field3256.length;
        if (a2 <= 2) {
            return;
        }
        float[] a3 = new float[a2 - 1];
        float[] a4 = new float[a2 - 1];
        int a5 = 0;
        for (int a6 = 0; a6 < a2 - 1; ++a6) {
            if (a6 == a) {
                ++a5;
            }
            a3[a6] = this.Field3256[a5];
            a4[a6] = this.Field3257[a5];
            ++a5;
        }
        this.Field3256 = a3;
        this.Field3257 = a4;
    }

    private void Method1674() {
        int a = this.Field3256.length;
        int a2 = 1;
        boolean a3 = Class193.Method1270();
        if (a2 < a - 1) {
            int a4 = 1;
            if (a4 < a2) {
                if (this.Field3256[a2] < this.Field3256[a4]) {
                    float a5 = this.Field3256[a2];
                    this.Field3256[a2] = this.Field3256[a4];
                    this.Field3256[a4] = a5;
                    a5 = this.Field3257[a2];
                    this.Field3257[a2] = this.Field3257[a4];
                    this.Field3257[a4] = a5;
                }
                ++a4;
            }
            ++a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    protected int[] Method1675() {
        void a;
        int a2 = this.Field3256.length;
        float[] fArray = new float[a2 + 2];
        boolean bl = Class193.Method1270();
        float[] a3 = new float[a2 + 2];
        System.arraycopy((Object)this.Field3256, (int)0, (Object)a, (int)1, (int)a2);
        System.arraycopy((Object)this.Field3257, (int)0, (Object)a3, (int)1, (int)a2);
        a[0] = a[1];
        boolean a4 = bl;
        a3[0] = a3[1];
        a[a2 + 1] = a[a2];
        a3[a2 + 1] = a3[a2];
        int[] a5 = new int[256];
        int a6 = 0;
        if (a6 < 1024) {
            float a7 = (float)a6 / 1024.0f;
            int a8 = (int)(255.0f * Class776.Method1722(a7, ((void)a).length, (float[])a) + 0.5f);
            int a9 = (int)(255.0f * Class776.Method1722(a7, ((void)a).length, a3) + 0.5f);
            a8 = Class776.Method1712(a8, 0, 255);
            a5[a8] = a9 = Class776.Method1712(a9, 0, 255);
            ++a6;
        }
        return a5;
    }
}