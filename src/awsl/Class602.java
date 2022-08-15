/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package awsl;

import awsl.Class586;
import awsl.Class587;
import awsl.Class599;

public class Class602
extends Class599 {
    public Class602() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class602(float[] a) {
        this.Field2813 = a[0];
        this.Field2814 = a[1];
        this.Field2815 = a[2];
        this.Field2816 = a[3];
    }

    public Class602(float a, float a2, float a3, float a4) {
        this.Field2813 = a;
        this.Field2814 = a2;
        this.Field2815 = a3;
        this.Field2816 = a4;
    }

    public Class602(Class602 a) {
        this.Field2813 = a.Field2813;
        this.Field2814 = a.Field2814;
        this.Field2815 = a.Field2815;
        this.Field2816 = a.Field2816;
    }

    public Class602(Class599 a) {
        this.Field2813 = a.Field2813;
        this.Field2814 = a.Field2814;
        this.Field2815 = a.Field2815;
        this.Field2816 = a.Field2816;
    }

    public void Method3691(Class586 a) {
        float a2 = a.Field2758 * 0.5f;
        float a3 = (float)Math.cos((double)a2);
        float a4 = (float)Math.sin((double)a2);
        this.Field2813 = a.Field2755 * a4;
        this.Field2814 = a.Field2756 * a4;
        this.Field2815 = a.Field2757 * a4;
        this.Field2816 = a3;
    }

    public void Method3690() {
        float a = 1.0f / (this.Field2813 * this.Field2813 + this.Field2814 * this.Field2814 + this.Field2815 * this.Field2815 + this.Field2816 * this.Field2816);
        this.Field2813 *= a;
        this.Field2814 *= a;
        this.Field2815 *= a;
        this.Field2816 *= a;
    }

    /*
     * WARNING - void declaration
     */
    public void Method3692(Class587 a) {
        int a2;
        float a3;
        block14: {
            block13: {
                void a4;
                float f = a.Field2759 + a.Field2764 + a.Field2769;
                boolean a5 = Class599.Method129();
                if ((double)a4 > 0.0) {
                    a3 = (float)Math.sqrt((double)((double)(a4 + 1.0f)));
                    this.Field2816 = a3 / 2.0f;
                    a3 = 0.5f / a3;
                    this.Field2813 = (a.Field2765 - a.Field2768) * a3;
                    this.Field2814 = (a.Field2767 - a.Field2761) * a3;
                    this.Field2815 = (a.Field2760 - a.Field2763) * a3;
                }
                a2 = 0;
                if (!(a.Field2764 > a.Field2759)) break block13;
                a2 = 1;
                if (!(a.Field2769 > a.Field2764)) break block14;
                a2 = 2;
            }
            if (a.Field2769 > a.Field2759) {
                a2 = 2;
            }
        }
        switch (a2) {
            case 0: {
                a3 = (float)Math.sqrt((double)(a.Field2759 - (a.Field2764 + a.Field2769) + 1.0f));
                this.Field2813 = a3 * 0.5f;
                if ((double)a3 != 0.0) {
                    a3 = 0.5f / a3;
                }
                this.Field2816 = (a.Field2765 - a.Field2768) * a3;
                this.Field2814 = (a.Field2760 + a.Field2763) * a3;
                this.Field2815 = (a.Field2761 + a.Field2767) * a3;
            }
            case 1: {
                a3 = (float)Math.sqrt((double)(a.Field2764 - (a.Field2769 + a.Field2759) + 1.0f));
                this.Field2814 = a3 * 0.5f;
                if ((double)a3 != 0.0) {
                    a3 = 0.5f / a3;
                }
                this.Field2816 = (a.Field2767 - a.Field2761) * a3;
                this.Field2815 = (a.Field2765 + a.Field2768) * a3;
                this.Field2813 = (a.Field2763 + a.Field2760) * a3;
            }
            case 2: {
                a3 = (float)Math.sqrt((double)(a.Field2759 - (a.Field2764 + a.Field2769) + 1.0f));
                this.Field2815 = a3 * 0.5f;
                if ((double)a3 != 0.0) {
                    a3 = 0.5f / a3;
                }
                this.Field2816 = (a.Field2760 - a.Field2763) * a3;
                this.Field2813 = (a.Field2767 + a.Field2761) * a3;
                this.Field2814 = (a.Field2768 + a.Field2765) * a3;
            }
        }
    }
}