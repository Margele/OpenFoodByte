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
      float a = (float)a - this.Field3922;
      Class193.Method1269();
      float a = (float)a - this.Field3923;
      float a = a * a + a * a;
      if (a > this.Field3921 || a == 0.0F) {
         a[0] = (float)a;
         a[1] = (float)a;
      }

      float a = (float)Math.sqrt((double)(a / this.Field3921));
      float a = (float)Math.pow(Math.sin(1.5707963267948966 * (double)a), (double)(-this.Field3920));
      a *= a;
      a *= a;
      float a = 1.0F - a;
      float a = this.Field3916 * a * a;
      float a = (float)Math.sin((double)a);
      float a = (float)Math.cos((double)a);
      a[0] = this.Field3922 + a * a - a * a;
      a[1] = this.Field3923 + a * a + a * a;
   }

   public String toString() {
      return "Distort/Pinch...";
   }
}
