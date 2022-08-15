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
import awsl.Class91;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
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
    public void Method382(IntBuffer a, FloatBuffer a2, FloatBuffer a3, double a4, double a5) {
        void a6;
        float a7;
        this.Field1740 = a;
        this.Field1741 = a2;
        this.Field1742 = a3;
        this.Field1749 = a4;
        this.Field1750 = a5;
        this.Field1759 = a7 = (float)Math.toDegrees((double)(Math.atan((double)(1.0 / (double)this.Field1742.get(5))) * 2.0));
        this.Field1747 = this.Field1740.get(2);
        this.Field1748 = this.Field1740.get(3);
        this.Field1760 = (float)Math.toDegrees((double)(2.0 * Math.atan((double)(this.Field1747 / this.Field1748 * Math.tan((double)(Math.toRadians((double)this.Field1759) / 2.0))))));
        Class368 a8 = new Class368(this.Field1741.get(12), this.Field1741.get(13), this.Field1741.get(14));
        Class368 a9 = new Class368(this.Field1741.get(0), this.Field1741.get(1), this.Field1741.get(2));
        Class368 a10 = new Class368(this.Field1741.get(4), this.Field1741.get(5), this.Field1741.get(6));
        Class368 a11 = new Class368(this.Field1741.get(8), this.Field1741.get(9), this.Field1741.get(10));
        Class368 a12 = new Class368(0.0, 1.0, 0.0);
        Class368 class368 = new Class368(1.0, 0.0, 0.0);
        int[] a13 = RenderUtils.Method1148();
        Class368 a14 = new Class368(0.0, 0.0, 1.0);
        double a15 = Math.toDegrees((double)Math.atan2((double)a6.Method663(a9).Method666(), (double)a6.Method662(a9))) + 180.0;
        if (a11.Field1733 < 0.0) {
            a15 = 360.0 - a15;
        }
        double a16 = -a11.Field1734 > 0.0 && a15 >= 90.0 && a15 < 270.0 || a11.Field1734 > 0.0 && (a15 < 90.0 || a15 >= 270.0) ? Math.toDegrees((double)Math.atan2((double)a12.Method663(a10).Method666(), (double)a12.Method662(a10))) : -Math.toDegrees((double)Math.atan2((double)a12.Method663(a10).Method666(), (double)a12.Method662(a10)));
        this.Field1761 = this.Method391(a15, a16);
        Matrix4f a17 = new Matrix4f();
        a17.load(this.Field1741.asReadOnlyBuffer());
        a17.invert();
        this.Field1743 = new Class368(a17.m30, a17.m31, a17.m32);
        this.Field1744 = this.Method386(this.Field1743.Field1733, this.Field1743.Field1734, this.Field1743.Field1735, a15, a16, a7, 1.0, this.Field1747 / this.Field1748);
        this.Field1745 = this.Method386(this.Field1743.Field1733, this.Field1743.Field1734, this.Field1743.Field1735, a15 - 180.0, -a16, a7, 1.0, this.Field1747 / this.Field1748);
        this.Field1746 = this.Method391(a15, a16).Method661();
        this.Field1751 = Math.toDegrees((double)Math.acos((double)(this.Field1748 * a5 / Math.sqrt((double)(this.Field1747 * a4 * this.Field1747 * a4 + this.Field1748 * a5 * this.Field1748 * a5)))));
        this.Field1752 = 360.0 - this.Field1751;
        this.Field1753 = this.Field1752 - 180.0;
        this.Field1754 = this.Field1751 + 180.0;
        this.Field1758 = new Class366(this.Field1747 * this.Field1749, 0.0, 0.0, 0.0, 1.0, 0.0);
        this.Field1755 = new Class366(0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        this.Field1757 = new Class366(0.0, 0.0, 0.0, 0.0, 1.0, 0.0);
        this.Field1756 = new Class366(0.0, this.Field1748 * this.Field1750, 0.0, 1.0, 0.0, 0.0);
        if (Class91.Method3648() == null) {
            RenderUtils.Method1147(new int[4]);
        }
    }

    public Class365 Method383(double a, double a2, double a3, Class679 a4, boolean a5) {
        int[] a6 = RenderUtils.Method1148();
        if (this.Field1740 == null || this.Field1741 == null || this.Field1742 == null) {
            return new Class365(0.0, 0.0, Class677.FAIL);
        }
        Class368 a7 = new Class368(a, a2, a3);
        boolean[] a8 = this.Method384(this.Field1744, this.Field1743, a, a2, a3);
        boolean a9 = a8[0] || a8[1] || a8[2] || a8[3];
        boolean a10 = a9;
        if (!GLU.gluProject((float)((float)a), (float)((float)a2), (float)((float)a3), (FloatBuffer)this.Field1741, (FloatBuffer)this.Field1742, (IntBuffer)this.Field1740, (FloatBuffer)this.Field1739)) {
            return new Class365(0.0, 0.0, Class677.FAIL);
        }
        double a11 = (double)this.Field1739.get(0) * this.Field1749;
        double a22 = (this.Field1748 - (double)this.Field1739.get(1)) * this.Field1750;
        return new Class365(a11, a22, Class677.INSIDE);
    }

    private boolean[] Method384(Class368[] a, Class368 a2, double a3, double a4, double a5) {
        Class368 a6 = new Class368(a3, a4, a5);
        boolean a7 = this.Method385(new Class368[]{a2, a[3], a[0]}, a6);
        boolean a8 = this.Method385(new Class368[]{a2, a[0], a[1]}, a6);
        boolean a9 = this.Method385(new Class368[]{a2, a[1], a[2]}, a6);
        boolean a10 = this.Method385(new Class368[]{a2, a[2], a[3]}, a6);
        return new boolean[]{a7, a8, a9, a10};
    }

    private boolean Method385(Class368[] a, Class368 a2) {
        Class368 a3 = new Class368(0.0, 0.0, 0.0);
        Class368 a4 = a[1].Method659(a[0]);
        Class368 a5 = a[2].Method659(a[0]);
        Class368 a6 = a4.Method663(a5).Method671();
        double a7 = a3.Method659(a6).Method662(a[2]);
        double a8 = a6.Method662(a2) + a7;
        return a8 >= 0.0;
    }

    private Class368[] Method386(double a, double a2, double a3, double a4, double a5, double a6, double a7, double a8) {
        Class368 a9 = this.Method391(a4, a5).Method671();
        double a10 = 2.0 * Math.tan((double)Math.toRadians((double)(a6 / 2.0))) * a7;
        double a11 = a10 * a8;
        Class368 a12 = this.Method391(a4, a5).Method671();
        Class368 a13 = this.Method391(a4, a5 - 90.0).Method671();
        Class368 a14 = this.Method391(a4 + 90.0, 0.0).Method671();
        Class368 a15 = new Class368(a, a2, a3);
        Class368 a16 = a12.Method657(a15);
        Class368 a17 = new Class368(a16.Field1733 * a7, a16.Field1734 * a7, a16.Field1735 * a7);
        Class368 a18 = new Class368(a17.Field1733 + a13.Field1733 * a10 / 2.0 - a14.Field1733 * a11 / 2.0, a17.Field1734 + a13.Field1734 * a10 / 2.0 - a14.Field1734 * a11 / 2.0, a17.Field1735 + a13.Field1735 * a10 / 2.0 - a14.Field1735 * a11 / 2.0);
        Class368 a19 = new Class368(a17.Field1733 - a13.Field1733 * a10 / 2.0 - a14.Field1733 * a11 / 2.0, a17.Field1734 - a13.Field1734 * a10 / 2.0 - a14.Field1734 * a11 / 2.0, a17.Field1735 - a13.Field1735 * a10 / 2.0 - a14.Field1735 * a11 / 2.0);
        Class368 a20 = new Class368(a17.Field1733 + a13.Field1733 * a10 / 2.0 + a14.Field1733 * a11 / 2.0, a17.Field1734 + a13.Field1734 * a10 / 2.0 + a14.Field1734 * a11 / 2.0, a17.Field1735 + a13.Field1735 * a10 / 2.0 + a14.Field1735 * a11 / 2.0);
        Class368 a21 = new Class368(a17.Field1733 - a13.Field1733 * a10 / 2.0 + a14.Field1733 * a11 / 2.0, a17.Field1734 - a13.Field1734 * a10 / 2.0 + a14.Field1734 * a11 / 2.0, a17.Field1735 - a13.Field1735 * a10 / 2.0 + a14.Field1735 * a11 / 2.0);
        return new Class368[]{a18, a19, a21, a20};
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

    private Class368 Method391(double a, double a2) {
        double a3 = Math.cos((double)(-a * 0.01745329238474369 - Math.PI));
        double a4 = Math.sin((double)(-a * 0.01745329238474369 - Math.PI));
        double a5 = -Math.cos((double)(-a2 * 0.01745329238474369));
        double a6 = Math.sin((double)(-a2 * 0.01745329238474369));
        return new Class368(a4 * a5, a6, a3 * a5);
    }
}