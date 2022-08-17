package awsl;

import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

public class Class885 extends Class877 {
   private float Field3866 = 0.0F;
   private float Field3867 = 0.0F;
   private float Field3868 = 0.0F;
   private float Field3869 = 0.0F;
   private float Field3870 = 0.5F;
   private float Field3871 = 0.5F;
   private float Field3872 = 1.5F;
   private float Field3873;
   private float Field3874;

   public Class885() {
      this.Method9(1);
      this.Method58(100.0F);
   }

   public void Method56(float a) {
      this.Field3872 = a;
   }

   public float Method57() {
      return this.Field3872;
   }

   public void Method58(float a) {
      this.Field3866 = a;
      this.Field3867 = a;
   }

   public float Method59() {
      return this.Field3866;
   }

   public void Method60(float a) {
      this.Field3870 = a;
   }

   public float Method61() {
      return this.Field3870;
   }

   public void Method164(float a) {
      this.Field3871 = a;
   }

   public float Method165() {
      return this.Field3871;
   }

   public void Method330(Point2D a) {
      this.Field3870 = (float)a.getX();
      this.Field3871 = (float)a.getY();
   }

   public Point2D Method331() {
      return new Point2D.Float(this.Field3870, this.Field3871);
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      this.Field3873 = (float)a * this.Field3870;
      this.Field3874 = (float)a * this.Field3871;
      if (this.Field3866 == 0.0F) {
         this.Field3866 = (float)(a / 2);
      }

      if (this.Field3867 == 0.0F) {
         this.Field3867 = (float)(a / 2);
      }

      this.Field3868 = this.Field3866 * this.Field3866;
      this.Field3869 = this.Field3867 * this.Field3867;
      return super.Method62(a, a);
   }

   protected void Method3439(int a, int a, float[] a) {
      float a = (float)a - this.Field3873;
      Class193.Method1270();
      float a = (float)a - this.Field3874;
      float a = a * a;
      float a = a * a;
      if (a >= this.Field3869 - this.Field3869 * a / this.Field3868) {
         a[0] = (float)a;
         a[1] = (float)a;
      }

      float a = 1.0F / this.Field3872;
      float a = (float)Math.sqrt((double)((1.0F - a / this.Field3868 - a / this.Field3869) * this.Field3866 * this.Field3867));
      float a = a * a;
      float a = (float)Math.acos((double)a / Math.sqrt((double)(a + a)));
      float a = 1.5707964F - a;
      float a = (float)Math.asin(Math.sin((double)a) * (double)a);
      a = 1.5707964F - a - a;
      a[0] = (float)a - (float)Math.tan((double)a) * a;
      float a = (float)Math.acos((double)a / Math.sqrt((double)(a + a)));
      a = 1.5707964F - a;
      a = (float)Math.asin(Math.sin((double)a) * (double)a);
      a = 1.5707964F - a - a;
      a[1] = (float)a - (float)Math.tan((double)a) * a;
   }

   public String toString() {
      return "Distort/Sphere...";
   }
}
