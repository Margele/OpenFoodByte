/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class586;
import awsl.Class589;
import awsl.Class590;
import awsl.Class599;
import awsl.Class602;
import awsl.Class91;

public class Class587 {
    public float Field2759;
    public float Field2760;
    public float Field2761;
    public float Field2762;
    public float Field2763;
    public float Field2764;
    public float Field2765;
    public float Field2766;
    public float Field2767;
    public float Field2768;
    public float Field2769;
    public float Field2770;
    public float Field2771;
    public float Field2772;
    public float Field2773;
    public float Field2774;

    public Class587() {
        this.Method349();
    }

    public Class587(Class587 a) {
        this.Method345(a);
    }

    public Class587(float[] a) {
        this.Method346(a);
    }

    public void Method345(Class587 a) {
        this.Field2759 = a.Field2759;
        this.Field2760 = a.Field2760;
        this.Field2761 = a.Field2761;
        this.Field2762 = a.Field2762;
        this.Field2763 = a.Field2763;
        this.Field2764 = a.Field2764;
        this.Field2765 = a.Field2765;
        this.Field2766 = a.Field2766;
        this.Field2767 = a.Field2767;
        this.Field2768 = a.Field2768;
        this.Field2769 = a.Field2769;
        this.Field2770 = a.Field2770;
        this.Field2771 = a.Field2771;
        this.Field2772 = a.Field2772;
        this.Field2773 = a.Field2773;
        this.Field2774 = a.Field2774;
    }

    public void Method346(float[] a) {
        this.Field2759 = a[0];
        this.Field2760 = a[1];
        this.Field2761 = a[2];
        this.Field2762 = a[3];
        this.Field2763 = a[4];
        this.Field2764 = a[5];
        this.Field2765 = a[6];
        this.Field2766 = a[7];
        this.Field2767 = a[8];
        this.Field2768 = a[9];
        this.Field2769 = a[10];
        this.Field2770 = a[11];
        this.Field2771 = a[12];
        this.Field2772 = a[13];
        this.Field2773 = a[14];
        this.Field2774 = a[15];
    }

    public void Method347(Class587 a) {
        a.Field2759 = this.Field2759;
        a.Field2760 = this.Field2760;
        a.Field2761 = this.Field2761;
        a.Field2762 = this.Field2762;
        a.Field2763 = this.Field2763;
        a.Field2764 = this.Field2764;
        a.Field2765 = this.Field2765;
        a.Field2766 = this.Field2766;
        a.Field2767 = this.Field2767;
        a.Field2768 = this.Field2768;
        a.Field2769 = this.Field2769;
        a.Field2770 = this.Field2770;
        a.Field2771 = this.Field2771;
        a.Field2772 = this.Field2772;
        a.Field2773 = this.Field2773;
        a.Field2774 = this.Field2774;
    }

    public void Method348(float[] a) {
        a[0] = this.Field2759;
        a[1] = this.Field2760;
        a[2] = this.Field2761;
        a[3] = this.Field2762;
        a[4] = this.Field2763;
        a[5] = this.Field2764;
        a[6] = this.Field2765;
        a[7] = this.Field2766;
        a[8] = this.Field2767;
        a[9] = this.Field2768;
        a[10] = this.Field2769;
        a[11] = this.Field2770;
        a[12] = this.Field2771;
        a[13] = this.Field2772;
        a[14] = this.Field2773;
        a[15] = this.Field2774;
    }

    public void Method349() {
        this.Field2759 = 1.0f;
        this.Field2760 = 0.0f;
        this.Field2761 = 0.0f;
        this.Field2762 = 0.0f;
        this.Field2763 = 0.0f;
        this.Field2764 = 1.0f;
        this.Field2765 = 0.0f;
        this.Field2766 = 0.0f;
        this.Field2767 = 0.0f;
        this.Field2768 = 0.0f;
        this.Field2769 = 1.0f;
        this.Field2770 = 0.0f;
        this.Field2771 = 0.0f;
        this.Field2772 = 0.0f;
        this.Field2773 = 0.0f;
        this.Field2774 = 1.0f;
    }

    /*
     * WARNING - void declaration
     */
    public void Method350(Class587 a) {
        void a2;
        void a3;
        float a4 = this.Field2759;
        float a5 = this.Field2760;
        float a6 = this.Field2761;
        float f = this.Field2762;
        float a7 = this.Field2763;
        float a8 = this.Field2764;
        float a9 = this.Field2765;
        float a10 = this.Field2766;
        float a11 = this.Field2767;
        float a12 = this.Field2768;
        float f2 = this.Field2769;
        boolean a13 = Class599.Method128();
        float a14 = this.Field2770;
        float a15 = this.Field2771;
        float a16 = this.Field2772;
        float a17 = this.Field2773;
        float a18 = this.Field2774;
        this.Field2759 = a4 * a.Field2759 + a7 * a.Field2760 + a11 * a.Field2761 + a15 * a.Field2762;
        this.Field2760 = a5 * a.Field2759 + a8 * a.Field2760 + a12 * a.Field2761 + a16 * a.Field2762;
        this.Field2761 = a6 * a.Field2759 + a9 * a.Field2760 + a3 * a.Field2761 + a17 * a.Field2762;
        this.Field2762 = a2 * a.Field2759 + a10 * a.Field2760 + a14 * a.Field2761 + a18 * a.Field2762;
        this.Field2763 = a4 * a.Field2763 + a7 * a.Field2764 + a11 * a.Field2765 + a15 * a.Field2766;
        this.Field2764 = a5 * a.Field2763 + a8 * a.Field2764 + a12 * a.Field2765 + a16 * a.Field2766;
        this.Field2765 = a6 * a.Field2763 + a9 * a.Field2764 + a3 * a.Field2765 + a17 * a.Field2766;
        this.Field2766 = a2 * a.Field2763 + a10 * a.Field2764 + a14 * a.Field2765 + a18 * a.Field2766;
        this.Field2767 = a4 * a.Field2767 + a7 * a.Field2768 + a11 * a.Field2769 + a15 * a.Field2770;
        this.Field2768 = a5 * a.Field2767 + a8 * a.Field2768 + a12 * a.Field2769 + a16 * a.Field2770;
        this.Field2769 = a6 * a.Field2767 + a9 * a.Field2768 + a3 * a.Field2769 + a17 * a.Field2770;
        this.Field2770 = a2 * a.Field2767 + a10 * a.Field2768 + a14 * a.Field2769 + a18 * a.Field2770;
        this.Field2771 = a4 * a.Field2771 + a7 * a.Field2772 + a11 * a.Field2773 + a15 * a.Field2774;
        this.Field2772 = a5 * a.Field2771 + a8 * a.Field2772 + a12 * a.Field2773 + a16 * a.Field2774;
        this.Field2773 = a6 * a.Field2771 + a9 * a.Field2772 + a3 * a.Field2773 + a17 * a.Field2774;
        this.Field2774 = a2 * a.Field2771 + a10 * a.Field2772 + a14 * a.Field2773 + a18 * a.Field2774;
        Class91.Method3647(new String[3]);
    }

    public void Method351() {
        Class587 a = new Class587(this);
        this.Method352(a);
    }

    public void Method352(Class587 a) {
        this.Field2759 = a.Field2759;
        this.Field2760 = a.Field2763;
        this.Field2761 = a.Field2767;
        this.Field2762 = a.Field2762;
        this.Field2763 = a.Field2760;
        this.Field2764 = a.Field2764;
        this.Field2765 = a.Field2768;
        this.Field2766 = a.Field2766;
        this.Field2767 = a.Field2761;
        this.Field2768 = a.Field2765;
        this.Field2769 = a.Field2769;
        this.Field2770 = a.Field2770;
        this.Field2771 *= -1.0f;
        this.Field2772 *= -1.0f;
        this.Field2773 *= -1.0f;
        this.Field2774 = a.Field2774;
    }

    public void Method353(Class586 a) {
        float a2 = a.Field2758 * 0.5f;
        float a3 = (float)Math.cos((double)a2);
        float a4 = (float)Math.sin((double)a2);
        this.Method354(new Class602(a.Field2755 * a4, a.Field2756 * a4, a.Field2757 * a4, a3));
    }

    public void Method354(Class602 a) {
        float a2 = a.Field2813 + a.Field2813;
        float a3 = a.Field2814 + a.Field2814;
        float a4 = a.Field2815 + a.Field2815;
        float a5 = a.Field2813 * a2;
        float a6 = a.Field2813 * a3;
        float a7 = a.Field2813 * a4;
        float a8 = a.Field2814 * a3;
        float a9 = a.Field2814 * a4;
        float a10 = a.Field2815 * a4;
        float a11 = a.Field2816 * a2;
        float a12 = a.Field2816 * a3;
        float a13 = a.Field2816 * a4;
        this.Field2759 = 1.0f - (a8 + a10);
        this.Field2760 = a6 - a13;
        this.Field2761 = a7 + a12;
        this.Field2762 = 0.0f;
        this.Field2763 = a6 + a13;
        this.Field2764 = 1.0f - (a5 + a10);
        this.Field2765 = a9 - a11;
        this.Field2766 = 0.0f;
        this.Field2767 = a7 - a12;
        this.Field2768 = a9 + a11;
        this.Field2769 = 1.0f - (a5 + a8);
        this.Field2770 = 0.0f;
        this.Field2771 = 0.0f;
        boolean a14 = Class599.Method129();
        this.Field2772 = 0.0f;
        this.Field2773 = 0.0f;
        this.Field2774 = 1.0f;
        if (Class91.Method3648() == null) {
            Class599.Method127(false);
        }
    }

    public void Method355(Class589 a) {
        float a2 = a.Field2775 * this.Field2759 + a.Field2776 * this.Field2763 + a.Field2777 * this.Field2767 + this.Field2771;
        float a3 = a.Field2775 * this.Field2760 + a.Field2776 * this.Field2764 + a.Field2777 * this.Field2768 + this.Field2772;
        float a4 = a.Field2775 * this.Field2761 + a.Field2776 * this.Field2765 + a.Field2777 * this.Field2769 + this.Field2773;
        a.Field2775 = a2;
        a.Field2776 = a3;
        a.Field2777 = a4;
    }

    public void Method356(Class590 a) {
        float a2 = a.Field2775 * this.Field2759 + a.Field2776 * this.Field2763 + a.Field2777 * this.Field2767;
        float a3 = a.Field2775 * this.Field2760 + a.Field2776 * this.Field2764 + a.Field2777 * this.Field2768;
        float a4 = a.Field2775 * this.Field2761 + a.Field2776 * this.Field2765 + a.Field2777 * this.Field2769;
        a.Field2775 = a2;
        a.Field2776 = a3;
        a.Field2777 = a4;
    }

    public void Method357(Class590 a) {
        this.Field2771 = a.Field2775;
        this.Field2772 = a.Field2776;
        this.Field2773 = a.Field2777;
    }

    public void Method358(float a) {
        this.Field2759 = a;
        this.Field2764 = a;
        this.Field2769 = a;
    }

    public void Method359(float a) {
        float a2 = (float)Math.sin((double)a);
        float a3 = (float)Math.cos((double)a);
        this.Field2759 = 1.0f;
        this.Field2760 = 0.0f;
        this.Field2761 = 0.0f;
        this.Field2762 = 0.0f;
        this.Field2763 = 0.0f;
        this.Field2764 = a3;
        this.Field2765 = a2;
        this.Field2766 = 0.0f;
        this.Field2767 = 0.0f;
        this.Field2768 = -a2;
        this.Field2769 = a3;
        this.Field2770 = 0.0f;
        this.Field2771 = 0.0f;
        this.Field2772 = 0.0f;
        this.Field2773 = 0.0f;
        this.Field2774 = 1.0f;
    }

    public void Method360(float a) {
        float a2;
        float a3 = (float)Math.sin((double)a);
        this.Field2759 = a2 = (float)Math.cos((double)a);
        this.Field2760 = 0.0f;
        this.Field2761 = -a3;
        this.Field2762 = 0.0f;
        this.Field2763 = 0.0f;
        this.Field2764 = 1.0f;
        this.Field2765 = 0.0f;
        this.Field2766 = 0.0f;
        this.Field2767 = a3;
        this.Field2768 = 0.0f;
        this.Field2769 = a2;
        this.Field2770 = 0.0f;
        this.Field2771 = 0.0f;
        this.Field2772 = 0.0f;
        this.Field2773 = 0.0f;
        this.Field2774 = 1.0f;
    }

    public void Method361(float a) {
        float a2;
        float a3 = (float)Math.sin((double)a);
        this.Field2759 = a2 = (float)Math.cos((double)a);
        this.Field2760 = a3;
        this.Field2761 = 0.0f;
        this.Field2762 = 0.0f;
        this.Field2763 = -a3;
        this.Field2764 = a2;
        this.Field2765 = 0.0f;
        this.Field2766 = 0.0f;
        this.Field2767 = 0.0f;
        this.Field2768 = 0.0f;
        this.Field2769 = 1.0f;
        this.Field2770 = 0.0f;
        this.Field2771 = 0.0f;
        this.Field2772 = 0.0f;
        this.Field2773 = 0.0f;
        this.Field2774 = 1.0f;
    }
}