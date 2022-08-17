package awsl;

import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

public class Class815 extends Class877 {
   private float Field3643 = 16.0F;
   private float Field3644 = 10.0F;
   private float Field3645 = 0.0F;
   private float Field3646 = 0.5F;
   private float Field3647 = 0.5F;
   private float Field3648 = 50.0F;
   private float Field3649 = 0.0F;
   private float Field3650;
   private float Field3651;

   public Class815() {
      this.Method9(1);
   }

   public void Method56(float a) {
      this.Field3643 = a;
   }

   public float Method57() {
      return this.Field3643;
   }

   public void Method58(float a) {
      this.Field3644 = a;
   }

   public float Method59() {
      return this.Field3644;
   }

   public void Method60(float a) {
      this.Field3645 = a;
   }

   public float Method61() {
      return this.Field3645;
   }

   public void Method164(float a) {
      this.Field3646 = a;
   }

   public float Method165() {
      return this.Field3646;
   }

   public void Method166(float a) {
      this.Field3647 = a;
   }

   public float Method167() {
      return this.Field3647;
   }

   public void Method330(Point2D a) {
      this.Field3646 = (float)a.getX();
      this.Field3647 = (float)a.getY();
   }

   public Point2D Method331() {
      return new Point2D.Float(this.Field3646, this.Field3647);
   }

   public void Method168(float a) {
      this.Field3648 = a;
   }

   public float Method169() {
      return this.Field3648;
   }

   private boolean Method3676(int a, int a, int a) {
      return a <= a && a <= a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Field3650 = (float)a.getWidth() * this.Field3646;
      this.Field3651 = (float)a.getHeight() * this.Field3647;
      if (this.Field3648 == 0.0F) {
         this.Field3648 = Math.min(this.Field3650, this.Field3651);
      }

      this.Field3649 = this.Field3648 * this.Field3648;
      return super.Method62(a, a);
   }

   protected void Method3439(int a, int a, float[] a) {
      Class193.Method1270();
      float a = (float)a - this.Field3650;
      float a = (float)a - this.Field3651;
      float a = a * a + a * a;
      if (a > this.Field3649) {
         a[0] = (float)a;
         a[1] = (float)a;
      }

      float a = (float)Math.sqrt((double)a);
      float a = this.Field3644 * (float)Math.sin((double)(a / this.Field3643 * 6.2831855F - this.Field3645));
      a *= (this.Field3648 - a) / this.Field3648;
      if (a != 0.0F) {
         a *= this.Field3643 / a;
      }

      a[0] = (float)a + a * a;
      a[1] = (float)a + a * a;
   }

   public String toString() {
      return "Distort/Water Ripples...";
   }
}
