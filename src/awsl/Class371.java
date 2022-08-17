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
      float var9;
      this.Field1759 = var9 = (float)Math.toDegrees(Math.atan(1.0 / (double)this.Field1742.get(5)) * 2.0);
      this.Field1747 = (double)this.Field1740.get(2);
      this.Field1748 = (double)this.Field1740.get(3);
      this.Field1760 = (float)Math.toDegrees(2.0 * Math.atan(this.Field1747 / this.Field1748 * Math.tan(Math.toRadians((double)this.Field1759) / 2.0)));
      new Class368((double)this.Field1741.get(12), (double)this.Field1741.get(13), (double)this.Field1741.get(14));
      Class368 var11 = new Class368((double)this.Field1741.get(0), (double)this.Field1741.get(1), (double)this.Field1741.get(2));
      Class368 var12 = new Class368((double)this.Field1741.get(4), (double)this.Field1741.get(5), (double)this.Field1741.get(6));
      Class368 var13 = new Class368((double)this.Field1741.get(8), (double)this.Field1741.get(9), (double)this.Field1741.get(10));
      Class368 var14 = new Class368(0.0, 1.0, 0.0);
      Class368 var15 = new Class368(1.0, 0.0, 0.0);
      new Class368(0.0, 0.0, 1.0);
      double var17 = Math.toDegrees(Math.atan2(var15.Method663(var11).Method666(), var15.Method662(var11))) + 180.0;
      if (var13.Field1733 < 0.0) {
         var17 = 360.0 - var17;
      }

      double var19 = (!(-var13.Field1734 > 0.0) || !(var17 >= 90.0) || !(var17 < 270.0)) && (!(var13.Field1734 > 0.0) || !(var17 < 90.0) && !(var17 >= 270.0)) ? -Math.toDegrees(Math.atan2(var14.Method663(var12).Method666(), var14.Method662(var12))) : Math.toDegrees(Math.atan2(var14.Method663(var12).Method666(), var14.Method662(var12)));
      this.Field1761 = this.Method391(var17, var19);
      Matrix4f var21 = new Matrix4f();
      var21.load(this.Field1741.asReadOnlyBuffer());
      var21.invert();
      this.Field1743 = new Class368((double)var21.m30, (double)var21.m31, (double)var21.m32);
      this.Field1744 = this.Method386(this.Field1743.Field1733, this.Field1743.Field1734, this.Field1743.Field1735, var17, var19, (double)var9, 1.0, this.Field1747 / this.Field1748);
      this.Field1745 = this.Method386(this.Field1743.Field1733, this.Field1743.Field1734, this.Field1743.Field1735, var17 - 180.0, -var19, (double)var9, 1.0, this.Field1747 / this.Field1748);
      this.Field1746 = this.Method391(var17, var19).Method661();
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

   public Class365 Method383(double a, double a, double a, Class679 a, boolean a) {
      int[] var9 = RenderUtils.trash();
      if (this.Field1740 != null && this.Field1741 != null && this.Field1742 != null) {
         new Class368(a, a, a);
         boolean[] var14 = this.Method384(this.Field1744, this.Field1743, a, a, a);
         boolean var12 = var14[0] || var14[1] || var14[2] || var14[3];
         if (!GLU.gluProject((float)a, (float)a, (float)a, this.Field1741, this.Field1742, this.Field1740, this.Field1739)) {
            return new Class365(0.0, 0.0, Class677.FAIL);
         } else {
            double var10 = (double)this.Field1739.get(0) * this.Field1749;
            double var21 = (this.Field1748 - (double)this.Field1739.get(1)) * this.Field1750;
            return new Class365(var10, var21, Class677.INSIDE);
         }
      } else {
         return new Class365(0.0, 0.0, Class677.FAIL);
      }
   }

   private boolean[] Method384(Class368[] a, Class368 a, double a, double a, double a) {
      Class368 var9 = new Class368(a, a, a);
      boolean var10 = this.Method385(new Class368[]{a, a[3], a[0]}, var9);
      boolean var11 = this.Method385(new Class368[]{a, a[0], a[1]}, var9);
      boolean var12 = this.Method385(new Class368[]{a, a[1], a[2]}, var9);
      boolean var13 = this.Method385(new Class368[]{a, a[2], a[3]}, var9);
      return new boolean[]{var10, var11, var12, var13};
   }

   private boolean Method385(Class368[] a, Class368 a) {
      Class368 var3 = new Class368(0.0, 0.0, 0.0);
      Class368 var4 = a[1].Method659(a[0]);
      Class368 var5 = a[2].Method659(a[0]);
      Class368 var6 = var4.Method663(var5).Method671();
      double var7 = var3.Method659(var6).Method662(a[2]);
      double var9 = var6.Method662(a) + var7;
      return var9 >= 0.0;
   }

   private Class368[] Method386(double a, double a, double a, double a, double a, double a, double a, double a) {
      Class368 var17 = this.Method391(a, a).Method671();
      double var18 = 2.0 * Math.tan(Math.toRadians(a / 2.0)) * a;
      double var20 = var18 * a;
      Class368 var22 = this.Method391(a, a).Method671();
      Class368 var23 = this.Method391(a, a - 90.0).Method671();
      Class368 var24 = this.Method391(a + 90.0, 0.0).Method671();
      Class368 var25 = new Class368(a, a, a);
      Class368 var26 = var22.Method657(var25);
      Class368 var27 = new Class368(var26.Field1733 * a, var26.Field1734 * a, var26.Field1735 * a);
      Class368 var28 = new Class368(var27.Field1733 + var23.Field1733 * var18 / 2.0 - var24.Field1733 * var20 / 2.0, var27.Field1734 + var23.Field1734 * var18 / 2.0 - var24.Field1734 * var20 / 2.0, var27.Field1735 + var23.Field1735 * var18 / 2.0 - var24.Field1735 * var20 / 2.0);
      Class368 var29 = new Class368(var27.Field1733 - var23.Field1733 * var18 / 2.0 - var24.Field1733 * var20 / 2.0, var27.Field1734 - var23.Field1734 * var18 / 2.0 - var24.Field1734 * var20 / 2.0, var27.Field1735 - var23.Field1735 * var18 / 2.0 - var24.Field1735 * var20 / 2.0);
      Class368 var30 = new Class368(var27.Field1733 + var23.Field1733 * var18 / 2.0 + var24.Field1733 * var20 / 2.0, var27.Field1734 + var23.Field1734 * var18 / 2.0 + var24.Field1734 * var20 / 2.0, var27.Field1735 + var23.Field1735 * var18 / 2.0 + var24.Field1735 * var20 / 2.0);
      Class368 var31 = new Class368(var27.Field1733 - var23.Field1733 * var18 / 2.0 + var24.Field1733 * var20 / 2.0, var27.Field1734 - var23.Field1734 * var18 / 2.0 + var24.Field1734 * var20 / 2.0, var27.Field1735 - var23.Field1735 * var18 / 2.0 + var24.Field1735 * var20 / 2.0);
      return new Class368[]{var28, var29, var31, var30};
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
      double var5 = Math.cos(-a * 0.01745329238474369 - Math.PI);
      double var7 = Math.sin(-a * 0.01745329238474369 - Math.PI);
      double var9 = -Math.cos(-a * 0.01745329238474369);
      double var11 = Math.sin(-a * 0.01745329238474369);
      return new Class368(var7 * var9, var11, var5 * var9);
   }
}
