/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.nio.FloatBuffer
 *  java.nio.IntBuffer
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.util.glu.GLU
 *  org.lwjgl.util.vector.Matrix4f
 */
package awsl;

import awsl.Class365;
import awsl.Class366;
import awsl.Class368;
import awsl.Class677;
import awsl.Class679;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import obfuscate.a;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Matrix4f;
import trash.foodbyte.utils.RenderUtils;

public final class Class371 {
    private static Class371 Field1738;
    private final FloatBuffer Field1739 = BufferUtils.createFloatBuffer((int)3);
    private IntBuffer Field1740;
    private FloatBuffer Field1741;
    private FloatBuffer Field1742;
    private Class368 Field1743;
    private Class368[] Field1744;
    private Class368[] Field1745;
    private Class368 Field1746;
    private double Field1747;
    private double Field1748;
    private double Field1749;
    private double Field1750;
    private double Field1751;
    private double Field1752;
    private double Field1753;
    private double Field1754;
    private Class366 Field1755;
    private Class366 Field1756;
    private Class366 Field1757;
    private Class366 Field1758;
    private float Field1759;
    private float Field1760;
    private Class368 Field1761;

    private Class371() {
    }

    public static Class371 Method381() {
        if (Field1738 == null) {
            Field1738 = new Class371();
        }
        return Field1738;
    }

    /*
     * WARNING - void declaration
     */
    public void Method382(IntBuffer a2, FloatBuffer a3, FloatBuffer a4, double a5, double a6) {
        void a7;
        float a8;
        this.Field1740 = a2;
        this.Field1741 = a3;
        this.Field1742 = a4;
        this.Field1749 = a5;
        this.Field1750 = a6;
        this.Field1759 = a8 = (float)Math.toDegrees((double)(Math.atan((double)(1.0 / (double)this.Field1742.get(5))) * 2.0));
        this.Field1747 = this.Field1740.get(2);
        this.Field1748 = this.Field1740.get(3);
        this.Field1760 = (float)Math.toDegrees((double)(2.0 * Math.atan((double)(this.Field1747 / this.Field1748 * Math.tan((double)(Math.toRadians((double)this.Field1759) / 2.0))))));
        Class368 a9 = new Class368(this.Field1741.get(12), this.Field1741.get(13), this.Field1741.get(14));
        Class368 a10 = new Class368(this.Field1741.get(0), this.Field1741.get(1), this.Field1741.get(2));
        Class368 a11 = new Class368(this.Field1741.get(4), this.Field1741.get(5), this.Field1741.get(6));
        Class368 a12 = new Class368(this.Field1741.get(8), this.Field1741.get(9), this.Field1741.get(10));
        Class368 a13 = new Class368(0.0, 1.0, 0.0);
        Class368 class368 = new Class368(1.0, 0.0, 0.0);
        int[] a14 = RenderUtils.trash();
        Class368 a15 = new Class368(0.0, 0.0, 1.0);
        double a16 = Math.toDegrees((double)Math.atan2((double)a7.Method663(a10).Method666(), (double)a7.Method662(a10))) + 180.0;
        if (a12.Field1733 < 0.0) {
            a16 = 360.0 - a16;
        }
        double a17 = -a12.Field1734 > 0.0 && a16 >= 90.0 && a16 < 270.0 || a12.Field1734 > 0.0 && (a16 < 90.0 || a16 >= 270.0) ? Math.toDegrees((double)Math.atan2((double)a13.Method663(a11).Method666(), (double)a13.Method662(a11))) : -Math.toDegrees((double)Math.atan2((double)a13.Method663(a11).Method666(), (double)a13.Method662(a11)));
        this.Field1761 = this.Method391(a16, a17);
        Matrix4f a18 = new Matrix4f();
        a18.load(this.Field1741.asReadOnlyBuffer());
        a18.invert();
        this.Field1743 = new Class368(a18.m30, a18.m31, a18.m32);
        this.Field1744 = this.Method386(this.Field1743.Field1733, this.Field1743.Field1734, this.Field1743.Field1735, a16, a17, a8, 1.0, this.Field1747 / this.Field1748);
        this.Field1745 = this.Method386(this.Field1743.Field1733, this.Field1743.Field1734, this.Field1743.Field1735, a16 - 180.0, -a17, a8, 1.0, this.Field1747 / this.Field1748);
        this.Field1746 = this.Method391(a16, a17).Method661();
        this.Field1751 = Math.toDegrees((double)Math.acos((double)(this.Field1748 * a6 / Math.sqrt((double)(this.Field1747 * a5 * this.Field1747 * a5 + this.Field1748 * a6 * this.Field1748 * a6)))));
        this.Field1752 = 360.0 - this.Field1751;
        this.Field1753 = this.Field1752 - 180.0;
        this.Field1754 = this.Field1751 + 180.0;
        this.Field1758 = new Class366(this.Field1747 * this.Field1749, 0.0, 0.0, 0.0, 1.0, 0.0);
        this.Field1755 = new Class366(0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        this.Field1757 = new Class366(0.0, 0.0, 0.0, 0.0, 1.0, 0.0);
        this.Field1756 = new Class366(0.0, this.Field1748 * this.Field1750, 0.0, 1.0, 0.0, 0.0);
        if (a.trash() == null) {
            RenderUtils.trash2(new int[4]);
        }
    }

    public Class365 Method383(double a2, double a3, double a4, Class679 a5, boolean a6) {
        int[] a7 = RenderUtils.trash();
        if (this.Field1740 == null || this.Field1741 == null || this.Field1742 == null) {
            return new Class365(0.0, 0.0, Class677.FAIL);
        }
        Class368 a8 = new Class368(a2, a3, a4);
        boolean[] a9 = this.Method384(this.Field1744, this.Field1743, a2, a3, a4);
        boolean a10 = a9[0] || a9[1] || a9[2] || a9[3];
        boolean a11 = a10;
        if (!GLU.gluProject((float)((float)a2), (float)((float)a3), (float)((float)a4), (FloatBuffer)this.Field1741, (FloatBuffer)this.Field1742, (IntBuffer)this.Field1740, (FloatBuffer)this.Field1739)) {
            return new Class365(0.0, 0.0, Class677.FAIL);
        }
        double a12 = (double)this.Field1739.get(0) * this.Field1749;
        double a22 = (this.Field1748 - (double)this.Field1739.get(1)) * this.Field1750;
        return new Class365(a12, a22, Class677.INSIDE);
    }

    private boolean[] Method384(Class368[] a2, Class368 a3, double a4, double a5, double a6) {
        Class368 a7 = new Class368(a4, a5, a6);
        boolean a8 = this.Method385(new Class368[]{a3, a2[3], a2[0]}, a7);
        boolean a9 = this.Method385(new Class368[]{a3, a2[0], a2[1]}, a7);
        boolean a10 = this.Method385(new Class368[]{a3, a2[1], a2[2]}, a7);
        boolean a11 = this.Method385(new Class368[]{a3, a2[2], a2[3]}, a7);
        return new boolean[]{a8, a9, a10, a11};
    }

    private boolean Method385(Class368[] a2, Class368 a3) {
        Class368 a4 = new Class368(0.0, 0.0, 0.0);
        Class368 a5 = a2[1].Method659(a2[0]);
        Class368 a6 = a2[2].Method659(a2[0]);
        Class368 a7 = a5.Method663(a6).Method671();
        double a8 = a4.Method659(a7).Method662(a2[2]);
        double a9 = a7.Method662(a3) + a8;
        return a9 >= 0.0;
    }

    private Class368[] Method386(double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9) {
        Class368 a10 = this.Method391(a5, a6).Method671();
        double a11 = 2.0 * Math.tan((double)Math.toRadians((double)(a7 / 2.0))) * a8;
        double a12 = a11 * a9;
        Class368 a13 = this.Method391(a5, a6).Method671();
        Class368 a14 = this.Method391(a5, a6 - 90.0).Method671();
        Class368 a15 = this.Method391(a5 + 90.0, 0.0).Method671();
        Class368 a16 = new Class368(a2, a3, a4);
        Class368 a17 = a13.Method657(a16);
        Class368 a18 = new Class368(a17.Field1733 * a8, a17.Field1734 * a8, a17.Field1735 * a8);
        Class368 a19 = new Class368(a18.Field1733 + a14.Field1733 * a11 / 2.0 - a15.Field1733 * a12 / 2.0, a18.Field1734 + a14.Field1734 * a11 / 2.0 - a15.Field1734 * a12 / 2.0, a18.Field1735 + a14.Field1735 * a11 / 2.0 - a15.Field1735 * a12 / 2.0);
        Class368 a20 = new Class368(a18.Field1733 - a14.Field1733 * a11 / 2.0 - a15.Field1733 * a12 / 2.0, a18.Field1734 - a14.Field1734 * a11 / 2.0 - a15.Field1734 * a12 / 2.0, a18.Field1735 - a14.Field1735 * a11 / 2.0 - a15.Field1735 * a12 / 2.0);
        Class368 a21 = new Class368(a18.Field1733 + a14.Field1733 * a11 / 2.0 + a15.Field1733 * a12 / 2.0, a18.Field1734 + a14.Field1734 * a11 / 2.0 + a15.Field1734 * a12 / 2.0, a18.Field1735 + a14.Field1735 * a11 / 2.0 + a15.Field1735 * a12 / 2.0);
        Class368 a22 = new Class368(a18.Field1733 - a14.Field1733 * a11 / 2.0 + a15.Field1733 * a12 / 2.0, a18.Field1734 - a14.Field1734 * a11 / 2.0 + a15.Field1734 * a12 / 2.0, a18.Field1735 - a14.Field1735 * a11 / 2.0 + a15.Field1735 * a12 / 2.0);
        return new Class368[]{a19, a20, a22, a21};
    }

    public Class368[] Method387() {
        return this.Field1744;
    }

    public float Method388() {
        return this.Field1760;
    }

    public float Method389() {
        return this.Field1759;
    }

    public Class368 Method390() {
        return this.Field1761;
    }

    private Class368 Method391(double a2, double a3) {
        double a4 = Math.cos((double)(-a2 * 0.01745329238474369 - Math.PI));
        double a5 = Math.sin((double)(-a2 * 0.01745329238474369 - Math.PI));
        double a6 = -Math.cos((double)(-a3 * 0.01745329238474369));
        double a7 = Math.sin((double)(-a3 * 0.01745329238474369));
        return new Class368(a5 * a6, a7, a4 * a6);
    }
}