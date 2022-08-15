/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 */
package awsl;

import awsl.Class594;
import awsl.Class598;

public class Class591
implements Class594 {
    protected float[] Field2778;
    protected float Field2779;
    protected float Field2780;
    protected float Field2781;
    protected Class594 Field2782;

    public Class591(float a, float a2, float a3) {
        this(a, a2, a3, new Class598());
    }

    public Class591(float a, float a2, float a3, Class594 a4) {
        int[] nArray = Class598.Method86();
        int[] a5 = nArray;
        this.Field2779 = a;
        this.Field2780 = a2;
        this.Field2781 = a3;
        this.Field2782 = a4;
        this.Field2778 = new float[(int)a3 + 1];
        float a6 = 1.0f;
        int a7 = 0;
        if (a7 <= (int)a3) {
            this.Field2778[a7] = (float)Math.pow((double)a6, (double)(-a));
            a6 *= a2;
            ++a7;
        }
    }

    public void Method18(Class594 a) {
        this.Field2782 = a;
    }

    public Class594 Method19() {
        return this.Field2782;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public float Method20(float a, float a2) {
        void a3;
        float a4;
        void a5;
        float f = 0.0f;
        a += 371.0f;
        a2 += 529.0f;
        boolean bl = false;
        int[] a6 = Class598.Method86();
        if (a5 < (int)this.Field2781) {
            a3 += this.Field2782.Method20(a, a2) * this.Field2778[a5];
            a *= this.Field2780;
            a2 *= this.Field2780;
            ++a5;
        }
        if ((a4 = this.Field2781 - (float)((int)this.Field2781)) != 0.0f) {
            a3 += a4 * this.Field2782.Method20(a, a2) * this.Field2778[a5];
        }
        return (float)a3;
    }
}