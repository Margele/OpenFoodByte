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
      int var3 = a.getWidth();
      int var4 = a.getHeight();
      this.Field3873 = (float)var3 * this.Field3870;
      this.Field3874 = (float)var4 * this.Field3871;
      if (this.Field3866 == 0.0F) {
         this.Field3866 = (float)(var3 / 2);
      }

      if (this.Field3867 == 0.0F) {
         this.Field3867 = (float)(var4 / 2);
      }

      this.Field3868 = this.Field3866 * this.Field3866;
      this.Field3869 = this.Field3867 * this.Field3867;
      return super.Method62(a, a);
   }

   protected void Method3439(int a, int a, float[] a) {
      float var5 = (float)a - this.Field3873;
      Class193.Method1270();
      float var6 = (float)a - this.Field3874;
      float var7 = var5 * var5;
      float var8 = var6 * var6;
      if (var8 >= this.Field3869 - this.Field3869 * var7 / this.Field3868) {
         a[0] = (float)a;
         a[1] = (float)a;
      }

      float var9 = 1.0F / this.Field3872;
      float var10 = (float)Math.sqrt((double)((1.0F - var7 / this.Field3868 - var8 / this.Field3869) * this.Field3866 * this.Field3867));
      float var11 = var10 * var10;
      float var12 = (float)Math.acos((double)var5 / Math.sqrt((double)(var7 + var11)));
      float var13 = 1.5707964F - var12;
      float var14 = (float)Math.asin(Math.sin((double)var13) * (double)var9);
      var14 = 1.5707964F - var12 - var14;
      a[0] = (float)a - (float)Math.tan((double)var14) * var10;
      float var15 = (float)Math.acos((double)var6 / Math.sqrt((double)(var8 + var11)));
      var13 = 1.5707964F - var15;
      var14 = (float)Math.asin(Math.sin((double)var13) * (double)var9);
      var14 = 1.5707964F - var15 - var14;
      a[1] = (float)a - (float)Math.tan((double)var14) * var10;
   }

   public String toString() {
      return "Distort/Sphere...";
   }
}
