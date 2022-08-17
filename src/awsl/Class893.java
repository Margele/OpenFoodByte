package awsl;

import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

public class Class893 extends Class877 {
   private float Field3916 = 0.0F;
   private float Field3917 = 0.5F;
   private float Field3918 = 0.5F;
   private float Field3919 = 100.0F;
   private float Field3920 = 0.5F;
   private float Field3921 = 0.0F;
   private float Field3922;
   private float Field3923;
   private float Field3924;
   private float Field3925;

   public void Method56(float a) {
      this.Field3916 = a;
   }

   public float Method57() {
      return this.Field3916;
   }

   public void Method58(float a) {
      this.Field3917 = a;
   }

   public float Method59() {
      return this.Field3917;
   }

   public void Method60(float a) {
      this.Field3918 = a;
   }

   public float Method61() {
      return this.Field3918;
   }

   public void Method330(Point2D a) {
      this.Field3917 = (float)a.getX();
      this.Field3918 = (float)a.getY();
   }

   public Point2D Method331() {
      return new Point2D.Float(this.Field3917, this.Field3918);
   }

   public void Method164(float a) {
      this.Field3919 = a;
   }

   public float Method165() {
      return this.Field3919;
   }

   public void Method166(float a) {
      this.Field3920 = a;
   }

   public float Method167() {
      return this.Field3920;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Field3924 = (float)a.getWidth();
      this.Field3925 = (float)a.getHeight();
      this.Field3922 = this.Field3924 * this.Field3917;
      this.Field3923 = this.Field3925 * this.Field3918;
      if (this.Field3919 == 0.0F) {
         this.Field3919 = Math.min(this.Field3922, this.Field3923);
      }

      this.Field3921 = this.Field3919 * this.Field3919;
      return super.Method62(a, a);
   }

   protected void Method3439(int a, int a, float[] a) {
      float var5 = (float)a - this.Field3922;
      Class193.Method1269();
      float var6 = (float)a - this.Field3923;
      float var7 = var5 * var5 + var6 * var6;
      if (var7 > this.Field3921 || var7 == 0.0F) {
         a[0] = (float)a;
         a[1] = (float)a;
      }

      float var8 = (float)Math.sqrt((double)(var7 / this.Field3921));
      float var9 = (float)Math.pow(Math.sin(1.5707963267948966 * (double)var8), (double)(-this.Field3920));
      var5 *= var9;
      var6 *= var9;
      float var10 = 1.0F - var8;
      float var11 = this.Field3916 * var10 * var10;
      float var12 = (float)Math.sin((double)var11);
      float var13 = (float)Math.cos((double)var11);
      a[0] = this.Field3922 + var13 * var5 - var12 * var6;
      a[1] = this.Field3923 + var12 * var5 + var13 * var6;
   }

   public String toString() {
      return "Distort/Pinch...";
   }
}
