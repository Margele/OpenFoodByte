package awsl;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class70 extends Class193 {
   private float Field680 = 0.5F;
   private float Field681 = 0.5F;
   private float Field682;
   private float Field683;
   private float Field684;
   private float Field685;

   public Class70() {
   }

   public Class70(float a, float a, float a, float a) {
      this.Field682 = a;
      this.Field683 = a;
      this.Field684 = a;
      this.Field685 = a;
   }

   public void Method56(float a) {
      this.Field683 = a;
   }

   public float Method57() {
      return this.Field683;
   }

   public void Method58(float a) {
      this.Field682 = a;
   }

   public float Method59() {
      return this.Field682;
   }

   public void Method60(float a) {
      this.Field684 = a;
   }

   public float Method61() {
      return this.Field684;
   }

   public void Method164(float a) {
      this.Field685 = a;
   }

   public float Method165() {
      return this.Field685;
   }

   public void Method166(float a) {
      this.Field680 = a;
   }

   public float Method167() {
      return this.Field680;
   }

   public void Method168(float a) {
      this.Field681 = a;
   }

   public float Method169() {
      return this.Field681;
   }

   public void Method330(Point2D a) {
      this.Field680 = (float)a.getX();
      this.Field681 = (float)a.getY();
   }

   public Point2D Method331() {
      return new Point2D.Float(this.Field680, this.Field681);
   }

   private int Method1612(int a) {
      int a = 1;
      Class193.Method1269();
      int a = 0;
      if (a < a) {
         a *= 2;
         ++a;
      }

      return a;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = Class193.Method1270();
      a = this.Method1263(a, (ColorModel)null);
      float a = (float)a.getWidth() * this.Field680;
      float a = (float)a.getHeight() * this.Field681;
      float a = (float)Math.sqrt((double)(a * a + a * a));
      float a = (float)((double)this.Field682 * Math.cos((double)this.Field683));
      float a = (float)((double)this.Field682 * -Math.sin((double)this.Field683));
      float a = this.Field685;
      float a = this.Field684;
      float a = this.Field682 + Math.abs(this.Field684 * a) + this.Field685 * a;
      int a = this.Method1612((int)a);
      float var10000 = a / a;
      var10000 = a / a;
      var10000 = a / a;
      var10000 = a / a;
      Graphics2D a = a.createGraphics();
      a.drawRenderedImage(a, (AffineTransform)null);
      a.dispose();
      return a;
   }

   public String toString() {
      return "Blur/Faster Motion Blur...";
   }
}
