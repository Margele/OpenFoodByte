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
import obfuscate.a;

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
    public void Method350(Class587 a2) {
        void a3;
        void a4;
        float a5 = this.Field2759;
        float a6 = this.Field2760;
        float a7 = this.Field2761;
        float f = this.Field2762;
        float a8 = this.Field2763;
        float a9 = this.Field2764;
        float a10 = this.Field2765;
        float a11 = this.Field2766;
        float a12 = this.Field2767;
        float a13 = this.Field2768;
        float f2 = this.Field2769;
        boolean a14 = Class599.Method128();
        float a15 = this.Field2770;
        float a16 = this.Field2771;
        float a17 = this.Field2772;
        float a18 = this.Field2773;
        float a19 = this.Field2774;
        this.Field2759 = a5 * a2.Field2759 + a8 * a2.Field2760 + a12 * a2.Field2761 + a16 * a2.Field2762;
        this.Field2760 = a6 * a2.Field2759 + a9 * a2.Field2760 + a13 * a2.Field2761 + a17 * a2.Field2762;
        this.Field2761 = a7 * a2.Field2759 + a10 * a2.Field2760 + a4 * a2.Field2761 + a18 * a2.Field2762;
        this.Field2762 = a3 * a2.Field2759 + a11 * a2.Field2760 + a15 * a2.Field2761 + a19 * a2.Field2762;
        this.Field2763 = a5 * a2.Field2763 + a8 * a2.Field2764 + a12 * a2.Field2765 + a16 * a2.Field2766;
        this.Field2764 = a6 * a2.Field2763 + a9 * a2.Field2764 + a13 * a2.Field2765 + a17 * a2.Field2766;
        this.Field2765 = a7 * a2.Field2763 + a10 * a2.Field2764 + a4 * a2.Field2765 + a18 * a2.Field2766;
        this.Field2766 = a3 * a2.Field2763 + a11 * a2.Field2764 + a15 * a2.Field2765 + a19 * a2.Field2766;
        this.Field2767 = a5 * a2.Field2767 + a8 * a2.Field2768 + a12 * a2.Field2769 + a16 * a2.Field2770;
        this.Field2768 = a6 * a2.Field2767 + a9 * a2.Field2768 + a13 * a2.Field2769 + a17 * a2.Field2770;
        this.Field2769 = a7 * a2.Field2767 + a10 * a2.Field2768 + a4 * a2.Field2769 + a18 * a2.Field2770;
        this.Field2770 = a3 * a2.Field2767 + a11 * a2.Field2768 + a15 * a2.Field2769 + a19 * a2.Field2770;
        this.Field2771 = a5 * a2.Field2771 + a8 * a2.Field2772 + a12 * a2.Field2773 + a16 * a2.Field2774;
        this.Field2772 = a6 * a2.Field2771 + a9 * a2.Field2772 + a13 * a2.Field2773 + a17 * a2.Field2774;
        this.Field2773 = a7 * a2.Field2771 + a10 * a2.Field2772 + a4 * a2.Field2773 + a18 * a2.Field2774;
        this.Field2774 = a3 * a2.Field2771 + a11 * a2.Field2772 + a15 * a2.Field2773 + a19 * a2.Field2774;
        a.trash(new String[3]);
    }

    public void Method351() {
        Class587 a2 = new Class587(this);
        this.Method352(a2);
    }

    public void Method352(Class587 a2) {
        this.Field2759 = a2.Field2759;
        this.Field2760 = a2.Field2763;
        this.Field2761 = a2.Field2767;
        this.Field2762 = a2.Field2762;
        this.Field2763 = a2.Field2760;
        this.Field2764 = a2.Field2764;
        this.Field2765 = a2.Field2768;
        this.Field2766 = a2.Field2766;
        this.Field2767 = a2.Field2761;
        this.Field2768 = a2.Field2765;
        this.Field2769 = a2.Field2769;
        this.Field2770 = a2.Field2770;
        this.Field2771 *= -1.0f;
        this.Field2772 *= -1.0f;
        this.Field2773 *= -1.0f;
        this.Field2774 = a2.Field2774;
    }

    public void Method353(Class586 a2) {
        float a3 = a2.Field2758 * 0.5f;
        float a4 = (float)Math.cos((double)a3);
        float a5 = (float)Math.sin((double)a3);
        this.Method354(new Class602(a2.Field2755 * a5, a2.Field2756 * a5, a2.Field2757 * a5, a4));
    }

    public void Method354(Class602 a2) {
        float a3 = a2.Field2813 + a2.Field2813;
        float a4 = a2.Field2814 + a2.Field2814;
        float a5 = a2.Field2815 + a2.Field2815;
        float a6 = a2.Field2813 * a3;
        float a7 = a2.Field2813 * a4;
        float a8 = a2.Field2813 * a5;
        float a9 = a2.Field2814 * a4;
        float a10 = a2.Field2814 * a5;
        float a11 = a2.Field2815 * a5;
        float a12 = a2.Field2816 * a3;
        float a13 = a2.Field2816 * a4;
        float a14 = a2.Field2816 * a5;
        this.Field2759 = 1.0f - (a9 + a11);
        this.Field2760 = a7 - a14;
        this.Field2761 = a8 + a13;
        this.Field2762 = 0.0f;
        this.Field2763 = a7 + a14;
        this.Field2764 = 1.0f - (a6 + a11);
        this.Field2765 = a10 - a12;
        this.Field2766 = 0.0f;
        this.Field2767 = a8 - a13;
        this.Field2768 = a10 + a12;
        this.Field2769 = 1.0f - (a6 + a9);
        this.Field2770 = 0.0f;
        this.Field2771 = 0.0f;
        boolean a15 = Class599.Method129();
        this.Field2772 = 0.0f;
        this.Field2773 = 0.0f;
        this.Field2774 = 1.0f;
        if (a.trash() == null) {
            Class599.Method127(false);
        }
    }

    public void Method355(Class589 a2) {
        float a3 = a2.Field2775 * this.Field2759 + a2.Field2776 * this.Field2763 + a2.Field2777 * this.Field2767 + this.Field2771;
        float a4 = a2.Field2775 * this.Field2760 + a2.Field2776 * this.Field2764 + a2.Field2777 * this.Field2768 + this.Field2772;
        float a5 = a2.Field2775 * this.Field2761 + a2.Field2776 * this.Field2765 + a2.Field2777 * this.Field2769 + this.Field2773;
        a2.Field2775 = a3;
        a2.Field2776 = a4;
        a2.Field2777 = a5;
    }

    public void Method356(Class590 a2) {
        float a3 = a2.Field2775 * this.Field2759 + a2.Field2776 * this.Field2763 + a2.Field2777 * this.Field2767;
        float a4 = a2.Field2775 * this.Field2760 + a2.Field2776 * this.Field2764 + a2.Field2777 * this.Field2768;
        float a5 = a2.Field2775 * this.Field2761 + a2.Field2776 * this.Field2765 + a2.Field2777 * this.Field2769;
        a2.Field2775 = a3;
        a2.Field2776 = a4;
        a2.Field2777 = a5;
    }

    public void Method357(Class590 a2) {
        this.Field2771 = a2.Field2775;
        this.Field2772 = a2.Field2776;
        this.Field2773 = a2.Field2777;
    }

    public void Method358(float a2) {
        this.Field2759 = a2;
        this.Field2764 = a2;
        this.Field2769 = a2;
    }

    public void Method359(float a2) {
        float a3 = (float)Math.sin((double)a2);
        float a4 = (float)Math.cos((double)a2);
        this.Field2759 = 1.0f;
        this.Field2760 = 0.0f;
        this.Field2761 = 0.0f;
        this.Field2762 = 0.0f;
        this.Field2763 = 0.0f;
        this.Field2764 = a4;
        this.Field2765 = a3;
        this.Field2766 = 0.0f;
        this.Field2767 = 0.0f;
        this.Field2768 = -a3;
        this.Field2769 = a4;
        this.Field2770 = 0.0f;
        this.Field2771 = 0.0f;
        this.Field2772 = 0.0f;
        this.Field2773 = 0.0f;
        this.Field2774 = 1.0f;
    }

    public void Method360(float a2) {
        float a3;
        float a4 = (float)Math.sin((double)a2);
        this.Field2759 = a3 = (float)Math.cos((double)a2);
        this.Field2760 = 0.0f;
        this.Field2761 = -a4;
        this.Field2762 = 0.0f;
        this.Field2763 = 0.0f;
        this.Field2764 = 1.0f;
        this.Field2765 = 0.0f;
        this.Field2766 = 0.0f;
        this.Field2767 = a4;
        this.Field2768 = 0.0f;
        this.Field2769 = a3;
        this.Field2770 = 0.0f;
        this.Field2771 = 0.0f;
        this.Field2772 = 0.0f;
        this.Field2773 = 0.0f;
        this.Field2774 = 1.0f;
    }

    public void Method361(float a2) {
        float a3;
        float a4 = (float)Math.sin((double)a2);
        this.Field2759 = a3 = (float)Math.cos((double)a2);
        this.Field2760 = a4;
        this.Field2761 = 0.0f;
        this.Field2762 = 0.0f;
        this.Field2763 = -a4;
        this.Field2764 = a3;
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