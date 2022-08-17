package awsl;

import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

public class Class867 extends Class877 {
   private float Field3783 = 10.0F;
   private float Field3784 = 20.0F;
   private float Field3785 = 0.0F;
   private float Field3786 = 3.1415927F;
   private float Field3787 = 0.5F;
   private float Field3788 = 0.5F;
   private float Field3789;
   private float Field3790;
   private float Field3791;
   private float Field3792;

   public Class867() {
      this.Method9(0);
   }

   public void Method56(float a) {
      this.Field3784 = a;
   }

   public float Method57() {
      return this.Field3784;
   }

   public void Method58(float a) {
      this.Field3785 = a;
   }

   public float Method59() {
      return this.Field3785;
   }

   public void Method60(float a) {
      this.Field3786 = a;
   }

   public float Method61() {
      return this.Field3786;
   }

   public void Method164(float a) {
      this.Field3783 = a;
   }

   public float Method165() {
      return this.Field3783;
   }

   public void Method166(float a) {
      this.Field3787 = a;
   }

   public float Method167() {
      return this.Field3787;
   }

   public void Method168(float a) {
      this.Field3788 = a;
   }

   public float Method169() {
      return this.Field3788;
   }

   public void Method330(Point2D a) {
      this.Field3787 = (float)a.getX();
      this.Field3788 = (float)a.getY();
   }

   public Point2D Method331() {
      return new Point2D.Float(this.Field3787, this.Field3788);
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Field3791 = (float)a.getWidth();
      this.Field3792 = (float)a.getHeight();
      this.Field3789 = this.Field3791 * this.Field3787;
      this.Field3790 = this.Field3792 * this.Field3788;
      --this.Field3791;
      return super.Method62(a, a);
   }

   protected void Method3439(int a, int a, float[] a) {
      float a = (float)a - this.Field3789;
      float a = (float)a - this.Field3790;
      float a = (float)Math.atan2((double)(-a), (double)(-a)) + this.Field3785;
      float a = (float)Math.sqrt((double)(a * a + a * a));
      a = Class776.Method1714(a, 6.2831855F);
      a[0] = this.Field3791 * a / (this.Field3786 + 1.0E-5F);
      a[1] = this.Field3792 * (1.0F - (a - this.Field3783) / (this.Field3784 + 1.0E-5F));
   }

   public String toString() {
      return "Distort/Circle...";
   }
}
