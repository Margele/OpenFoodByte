package awsl;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import obfuscate.a;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Matrix4f;
import trash.foodbyte.utils.RenderUtils;

public final class Class371 {
   private static Class371 Field1738;
   private final FloatBuffer Field1739 = BufferUtils.createFloatBuffer(3);
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

   public void Method382(IntBuffer a, FloatBuffer a, FloatBuffer a, double a, double a) {
      RenderUtils.trash();
      this.Field1740 = a;
      this.Field1741 = a;
      this.Field1742 = a;
      this.Field1749 = a;
      this.Field1750 = a;
      float a;
      this.Field1759 = a = (float)Math.toDegrees(Math.atan(1.0 / (double)this.Field1742.get(5)) * 2.0);
      this.Field1747 = (double)this.Field1740.get(2);
      this.Field1748 = (double)this.Field1740.get(3);
      this.Field1760 = (float)Math.toDegrees(2.0 * Math.atan(this.Field1747 / this.Field1748 * Math.tan(Math.toRadians((double)this.Field1759) / 2.0)));
      new Class368((double)this.Field1741.get(12), (double)this.Field1741.get(13), (double)this.Field1741.get(14));
      Class368 a = new Class368((double)this.Field1741.get(0), (double)this.Field1741.get(1), (double)this.Field1741.get(2));
      Class368 a = new Class368((double)this.Field1741.get(4), (double)this.Field1741.get(5), (double)this.Field1741.get(6));
      Class368 a = new Class368((double)this.Field1741.get(8), (double)this.Field1741.get(9), (double)this.Field1741.get(10));
      Class368 a = new Class368(0.0, 1.0, 0.0);
      Class368 a = new Class368(1.0, 0.0, 0.0);
      new Class368(0.0, 0.0, 1.0);
      double a = Math.toDegrees(Math.atan2(a.Method663(a).Method666(), a.Method662(a))) + 180.0;
      if (a.Field1733 < 0.0) {
         a = 360.0 - a;
      }

      double a = (!(-a.Field1734 > 0.0) || !(a >= 90.0) || !(a < 270.0)) && (!(a.Field1734 > 0.0) || !(a < 90.0) && !(a >= 270.0)) ? -Math.toDegrees(Math.atan2(a.Method663(a).Method666(), a.Method662(a))) : Math.toDegrees(Math.atan2(a.Method663(a).Method666(), a.Method662(a)));
      this.Field1761 = this.Method391(a, a);
      Matrix4f a = new Matrix4f();
      a.load(this.Field1741.asReadOnlyBuffer());
      a.invert();
      this.Field1743 = new Class368((double)a.m30, (double)a.m31, (double)a.m32);
      this.Field1744 = this.Method386(this.Field1743.Field1733, this.Field1743.Field1734, this.Field1743.Field1735, a, a, (double)a, 1.0, this.Field1747 / this.Field1748);
      this.Field1745 = this.Method386(this.Field1743.Field1733, this.Field1743.Field1734, this.Field1743.Field1735, a - 180.0, -a, (double)a, 1.0, this.Field1747 / this.Field1748);
      this.Field1746 = this.Method391(a, a).Method661();
      this.Field1751 = Math.toDegrees(Math.acos(this.Field1748 * a / Math.sqrt(this.Field1747 * a * this.Field1747 * a + this.Field1748 * a * this.Field1748 * a)));
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

   public Class365 Method383(double a, double a, double a, Class679 a3, boolean a4) {
      int[] a = RenderUtils.trash();
      if (this.Field1740 != null && this.Field1741 != null && this.Field1742 != null) {
         new Class368(a, a, a);
         boolean[] a = this.Method384(this.Field1744, this.Field1743, a, a, a);
         boolean a = a[0] || a[1] || a[2] || a[3];
         if (!GLU.gluProject((float)a, (float)a, (float)a, this.Field1741, this.Field1742, this.Field1740, this.Field1739)) {
            return new Class365(0.0, 0.0, Class677.FAIL);
         } else {
            double a = (double)this.Field1739.get(0) * this.Field1749;
            double a = (this.Field1748 - (double)this.Field1739.get(1)) * this.Field1750;
            return new Class365(a, a, Class677.INSIDE);
         }
      } else {
         return new Class365(0.0, 0.0, Class677.FAIL);
      }
   }

   private boolean[] Method384(Class368[] a, Class368 a, double a, double a, double a) {
      Class368 a = new Class368(a, a, a);
      boolean a = this.Method385(new Class368[]{a, a[3], a[0]}, a);
      boolean a = this.Method385(new Class368[]{a, a[0], a[1]}, a);
      boolean a = this.Method385(new Class368[]{a, a[1], a[2]}, a);
      boolean a = this.Method385(new Class368[]{a, a[2], a[3]}, a);
      return new boolean[]{a, a, a, a};
   }

   private boolean Method385(Class368[] a, Class368 a) {
      Class368 a = new Class368(0.0, 0.0, 0.0);
      Class368 a = a[1].Method659(a[0]);
      Class368 a = a[2].Method659(a[0]);
      Class368 a = a.Method663(a).Method671();
      double a = a.Method659(a).Method662(a[2]);
      double a = a.Method662(a) + a;
      return a >= 0.0;
   }

   private Class368[] Method386(double a, double a, double a, double a, double a, double a, double a, double a) {
      Class368 a = this.Method391(a, a).Method671();
      double a = 2.0 * Math.tan(Math.toRadians(a / 2.0)) * a;
      double a = a * a;
      Class368 a = this.Method391(a, a).Method671();
      Class368 a = this.Method391(a, a - 90.0).Method671();
      Class368 a = this.Method391(a + 90.0, 0.0).Method671();
      Class368 a = new Class368(a, a, a);
      Class368 a = a.Method657(a);
      Class368 a = new Class368(a.Field1733 * a, a.Field1734 * a, a.Field1735 * a);
      Class368 a = new Class368(a.Field1733 + a.Field1733 * a / 2.0 - a.Field1733 * a / 2.0, a.Field1734 + a.Field1734 * a / 2.0 - a.Field1734 * a / 2.0, a.Field1735 + a.Field1735 * a / 2.0 - a.Field1735 * a / 2.0);
      Class368 a = new Class368(a.Field1733 - a.Field1733 * a / 2.0 - a.Field1733 * a / 2.0, a.Field1734 - a.Field1734 * a / 2.0 - a.Field1734 * a / 2.0, a.Field1735 - a.Field1735 * a / 2.0 - a.Field1735 * a / 2.0);
      Class368 a = new Class368(a.Field1733 + a.Field1733 * a / 2.0 + a.Field1733 * a / 2.0, a.Field1734 + a.Field1734 * a / 2.0 + a.Field1734 * a / 2.0, a.Field1735 + a.Field1735 * a / 2.0 + a.Field1735 * a / 2.0);
      Class368 a = new Class368(a.Field1733 - a.Field1733 * a / 2.0 + a.Field1733 * a / 2.0, a.Field1734 - a.Field1734 * a / 2.0 + a.Field1734 * a / 2.0, a.Field1735 - a.Field1735 * a / 2.0 + a.Field1735 * a / 2.0);
      return new Class368[]{a, a, a, a};
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

   private Class368 Method391(double a, double a) {
      double a = Math.cos(-a * 0.01745329238474369 - Math.PI);
      double a = Math.sin(-a * 0.01745329238474369 - Math.PI);
      double a = -Math.cos(-a * 0.01745329238474369);
      double a = Math.sin(-a * 0.01745329238474369);
      return new Class368(a * a, a, a * a);
   }
}
