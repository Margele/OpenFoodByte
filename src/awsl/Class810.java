package awsl;

import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;

public class Class810 extends Class877 {
   private float Field3621 = 0.0F;
   private float Field3622 = 0.5F;
   private float Field3623 = 0.5F;
   private float Field3624 = 100.0F;
   private float Field3625 = 0.0F;
   private float Field3626;
   private float Field3627;

   public Class810() {
      this.Method9(1);
   }

   public void Method56(float a) {
      this.Field3621 = a;
   }

   public float Method57() {
      return this.Field3621;
   }

   public void Method58(float a) {
      this.Field3622 = a;
   }

   public float Method59() {
      return this.Field3622;
   }

   public void Method60(float a) {
      this.Field3623 = a;
   }

   public float Method61() {
      return this.Field3623;
   }

   public void Method330(Point2D a) {
      this.Field3622 = (float)a.getX();
      this.Field3623 = (float)a.getY();
   }

   public Point2D Method331() {
      return new Point2D.Float(this.Field3622, this.Field3623);
   }

   public void Method164(float a) {
      this.Field3624 = a;
   }

   public float Method165() {
      return this.Field3624;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Field3626 = (float)a.getWidth() * this.Field3622;
      this.Field3627 = (float)a.getHeight() * this.Field3623;
      if (this.Field3624 == 0.0F) {
         this.Field3624 = Math.min(this.Field3626, this.Field3627);
      }

      this.Field3625 = this.Field3624 * this.Field3624;
      return super.Method62(a, a);
   }

   protected void Method3439(int a, int a, float[] a) {
      Class193.Method1269();
      float var5 = (float)a - this.Field3626;
      float var6 = (float)a - this.Field3627;
      float var7 = var5 * var5 + var6 * var6;
      if (var7 > this.Field3625) {
         a[0] = (float)a;
         a[1] = (float)a;
      }

      var7 = (float)Math.sqrt((double)var7);
      float var8 = (float)Math.atan2((double)var6, (double)var5) + this.Field3621 * (this.Field3624 - var7) / this.Field3624;
      a[0] = this.Field3626 + var7 * (float)Math.cos((double)var8);
      a[1] = this.Field3627 + var7 * (float)Math.sin((double)var8);
   }

   public String toString() {
      return "Distort/Twirl...";
   }
}
