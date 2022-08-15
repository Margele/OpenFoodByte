/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

public class Class599 {
    public float Field2813;
    public float Field2814;
    public float Field2815;
    public float Field2816;
    private static boolean Field2817;

    public Class599() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class599(float[] a) {
        this.Field2813 = a[0];
        this.Field2814 = a[1];
        this.Field2815 = a[2];
        this.Field2816 = a[2];
    }

    public Class599(float a, float a2, float a3, float a4) {
        this.Field2813 = a;
        this.Field2814 = a2;
        this.Field2815 = a3;
        this.Field2816 = a4;
    }

    public Class599(Class599 a) {
        this.Field2813 = a.Field2813;
        this.Field2814 = a.Field2814;
        this.Field2815 = a.Field2815;
        this.Field2816 = a.Field2816;
    }

    public void Method110() {
        this.Field2813 = Math.abs((float)this.Field2813);
        this.Field2814 = Math.abs((float)this.Field2814);
        this.Field2815 = Math.abs((float)this.Field2815);
        this.Field2816 = Math.abs((float)this.Field2816);
    }

    public void Method111(Class599 a) {
        this.Field2813 = Math.abs((float)a.Field2813);
        this.Field2814 = Math.abs((float)a.Field2814);
        this.Field2815 = Math.abs((float)a.Field2815);
        this.Field2816 = Math.abs((float)a.Field2816);
    }

    public void Method112(float a, float a2) {
        boolean bl = Class599.Method129();
        if (this.Field2813 < a) {
            this.Field2813 = a;
        }
        if (this.Field2813 > a2) {
            this.Field2813 = a2;
        }
        if (this.Field2814 < a) {
            this.Field2814 = a;
        }
        if (this.Field2814 > a2) {
            this.Field2814 = a2;
        }
        if (this.Field2815 < a) {
            this.Field2815 = a;
        }
        if (this.Field2815 > a2) {
            this.Field2815 = a2;
        }
        if (this.Field2816 < a) {
            this.Field2816 = a;
        }
        if (this.Field2816 > a2) {
            this.Field2816 = a2;
        }
    }

    public void Method113(float a, float a2, float a3, float a4) {
        this.Field2813 = a;
        this.Field2814 = a2;
        this.Field2815 = a3;
        this.Field2816 = a4;
    }

    public void Method114(float[] a) {
        this.Field2813 = a[0];
        this.Field2814 = a[1];
        this.Field2815 = a[2];
        this.Field2816 = a[2];
    }

    public void Method115(Class599 a) {
        this.Field2813 = a.Field2813;
        this.Field2814 = a.Field2814;
        this.Field2815 = a.Field2815;
        this.Field2816 = a.Field2816;
    }

    public void Method116(Class599 a) {
        a.Field2813 = this.Field2813;
        a.Field2814 = this.Field2814;
        a.Field2815 = this.Field2815;
        a.Field2816 = this.Field2816;
    }

    public void Method117(float[] a) {
        a[0] = this.Field2813;
        a[1] = this.Field2814;
        a[2] = this.Field2815;
        a[3] = this.Field2816;
    }

    public void Method118() {
        this.Field2813 = -this.Field2813;
        this.Field2814 = -this.Field2814;
        this.Field2815 = -this.Field2815;
        this.Field2816 = -this.Field2816;
    }

    public void Method119(Class599 a) {
        this.Field2813 = -a.Field2813;
        this.Field2814 = -a.Field2814;
        this.Field2815 = -a.Field2815;
        this.Field2816 = -a.Field2816;
    }

    public void Method120(Class599 a, float a2) {
        float a3 = 1.0f - a2;
        this.Field2813 = a3 * this.Field2813 + a2 * a.Field2813;
        this.Field2814 = a3 * this.Field2814 + a2 * a.Field2814;
        this.Field2815 = a3 * this.Field2815 + a2 * a.Field2815;
        this.Field2816 = a3 * this.Field2816 + a2 * a.Field2816;
    }

    public void Method121(float a) {
        this.Field2813 *= a;
        this.Field2814 *= a;
        this.Field2815 *= a;
        this.Field2816 *= a;
    }

    public void Method122(Class599 a) {
        this.Field2813 += a.Field2813;
        this.Field2814 += a.Field2814;
        this.Field2815 += a.Field2815;
        this.Field2816 += a.Field2816;
    }

    public void Method123(Class599 a, Class599 a2) {
        this.Field2813 = a.Field2813 + a2.Field2813;
        this.Field2814 = a.Field2814 + a2.Field2814;
        this.Field2815 = a.Field2815 + a2.Field2815;
        this.Field2816 = a.Field2816 + a2.Field2816;
    }

    public void Method124(Class599 a) {
        this.Field2813 -= a.Field2813;
        this.Field2814 -= a.Field2814;
        this.Field2815 -= a.Field2815;
        this.Field2816 -= a.Field2816;
    }

    public void Method125(Class599 a, Class599 a2) {
        this.Field2813 = a.Field2813 - a2.Field2813;
        this.Field2814 = a.Field2814 - a2.Field2814;
        this.Field2815 = a.Field2815 - a2.Field2815;
        this.Field2816 = a.Field2816 - a2.Field2816;
    }

    public String Method126() {
        return "[" + this.Field2813 + ", " + this.Field2814 + ", " + this.Field2815 + ", " + this.Field2816 + "]";
    }

    public static void Method127(boolean bl) {
        Field2817 = bl;
    }

    public static boolean Method128() {
        return Field2817;
    }

    public static boolean Method129() {
        boolean bl = Class599.Method128();
        return true;
    }

    static {
        Class599.Method127(false);
    }
}