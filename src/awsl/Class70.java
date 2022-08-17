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
      int var3 = 1;
      Class193.Method1269();
      int var4 = 0;
      if (var3 < a) {
         var3 *= 2;
         ++var4;
      }

      return var4;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      boolean var3 = Class193.Method1270();
      a = this.Method1263(a, (ColorModel)null);
      float var5 = (float)a.getWidth() * this.Field680;
      float var6 = (float)a.getHeight() * this.Field681;
      float var7 = (float)Math.sqrt((double)(var5 * var5 + var6 * var6));
      float var8 = (float)((double)this.Field682 * Math.cos((double)this.Field683));
      float var9 = (float)((double)this.Field682 * -Math.sin((double)this.Field683));
      float var10 = this.Field685;
      float var11 = this.Field684;
      float var12 = this.Field682 + Math.abs(this.Field684 * var7) + this.Field685 * var7;
      int var13 = this.Method1612((int)var12);
      float var10000 = var8 / var12;
      var10000 = var9 / var12;
      var10000 = var10 / var12;
      var10000 = var11 / var12;
      Graphics2D var14 = a.createGraphics();
      var14.drawRenderedImage(a, (AffineTransform)null);
      var14.dispose();
      return a;
   }

   public String toString() {
      return "Blur/Faster Motion Blur...";
   }
}
