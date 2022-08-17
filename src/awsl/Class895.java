package awsl;

import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

public class Class895 extends Class877 {
   private float Field3960 = 0.0F;
   private float Field3961 = 0.0F;
   private float Field3962 = 0.5F;
   private float Field3963 = 0.5F;
   private int Field3964 = 3;
   private float Field3965 = 0.0F;
   private float Field3966;
   private float Field3967;

   public Class895() {
      this.Method9(1);
   }

   public void Method13(int a) {
      this.Field3964 = a;
   }

   public int Method14() {
      return this.Field3964;
   }

   public void Method56(float a) {
      this.Field3960 = a;
   }

   public float Method57() {
      return this.Field3960;
   }

   public void Method58(float a) {
      this.Field3961 = a;
   }

   public float Method59() {
      return this.Field3961;
   }

   public void Method60(float a) {
      this.Field3962 = a;
   }

   public float Method61() {
      return this.Field3962;
   }

   public void Method164(float a) {
      this.Field3963 = a;
   }

   public float Method165() {
      return this.Field3963;
   }

   public void Method330(Point2D a) {
      this.Field3962 = (float)a.getX();
      this.Field3963 = (float)a.getY();
   }

   public Point2D Method331() {
      return new Point2D.Float(this.Field3962, this.Field3963);
   }

   public void Method166(float a) {
      this.Field3965 = a;
   }

   public float Method167() {
      return this.Field3965;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Field3966 = (float)a.getWidth() * this.Field3962;
      this.Field3967 = (float)a.getHeight() * this.Field3963;
      return super.Method62(a, a);
   }

   protected void Method3439(int a, int a, float[] a) {
      double var4 = (double)((float)a - this.Field3966);
      double var6 = (double)((float)a - this.Field3967);
      double var8 = Math.sqrt(var4 * var4 + var6 * var6);
      double var10 = Math.atan2(var6, var4) - (double)this.Field3960 - (double)this.Field3961;
      var10 = (double)Class776.Method1716((float)(var10 / Math.PI * (double)this.Field3964 * 0.5));
      if (this.Field3965 != 0.0F) {
         double var12 = Math.cos(var10);
         double var14 = (double)this.Field3965 / var12;
         var8 = var14 * (double)Class776.Method1716((float)(var8 / var14));
      }

      var10 += (double)this.Field3960;
      a[0] = (float)((double)this.Field3966 + var8 * Math.cos(var10));
      a[1] = (float)((double)this.Field3967 + var8 * Math.sin(var10));
   }

   public String toString() {
      return "Distort/Kaleidoscope...";
   }
}
