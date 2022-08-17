package awsl;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class64 extends Class193 {
   private float Field639 = 0.0F;
   private float Field640 = 1.0F;
   private float Field641 = 1.0F;
   private float Field642 = 0.0F;
   private float Field643 = 0.0F;
   private boolean Field644 = false;
   private boolean Field645 = true;

   public Class64() {
   }

   public Class64(float a, float a, float a, float a) {
      this.Field641 = a;
      this.Field639 = a;
      this.Field643 = a;
      this.Field642 = a;
   }

   public void Method56(float a) {
      this.Field639 = a;
   }

   public float Method57() {
      return this.Field639;
   }

   public void Method58(float a) {
      this.Field641 = a;
   }

   public float Method59() {
      return this.Field641;
   }

   public void Method60(float a) {
      this.Field643 = a;
   }

   public float Method61() {
      return this.Field643;
   }

   public void Method164(float a) {
      this.Field642 = a;
   }

   public float Method165() {
      return this.Field642;
   }

   public void Method87(boolean a) {
      this.Field644 = a;
   }

   public boolean Method88() {
      return this.Field644;
   }

   public void Method1282(boolean a) {
      this.Field645 = a;
   }

   public boolean Method1283() {
      return this.Field645;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      int a = a.getWidth();
      int a = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] a = new int[a * a];
      int[] a = new int[a * a];
      this.Method104(a, 0, 0, a, a, a);
      float a = (float)Math.sin((double)this.Field639);
      float a = (float)Math.cos((double)this.Field639);
      int a = a / 2;
      int a = a / 2;
      int a = 0;
      float a = (float)Math.sqrt((double)(a * a + a * a));
      float a = (float)((double)this.Field641 * Math.cos((double)this.Field639));
      float a = (float)((double)this.Field641 * -Math.sin((double)this.Field639));
      float a = this.Field641 + Math.abs(this.Field643 * a) + this.Field642 * a;
      int a = (int)a;
      AffineTransform a = new AffineTransform();
      Point2D.Float a = new Point2D.Float();
      if (this.Field645) {
         Class776.Method1727(a, 0, a.length);
      }

      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            int a = 0;
            int a = 0;
            int a = 0;
            int a = 0;
            int a = 0;
            int a = 0;
            if (a < a) {
               label49: {
                  float a = (float)a / (float)a;
                  a.x = (float)a;
                  a.y = (float)a;
                  a.setToIdentity();
                  a.translate((double)((float)a + a * a), (double)((float)a + a * a));
                  float a = 1.0F - this.Field642 * a;
                  a.scale((double)a, (double)a);
                  if (this.Field643 != 0.0F) {
                     a.rotate((double)(-this.Field643 * a));
                  }

                  a.translate((double)(-a), (double)(-a));
                  a.transform(a, a);
                  int a = (int)a.x;
                  int a = (int)a.y;
                  if (a >= a) {
                     if (!this.Field644) {
                        break label49;
                     }

                     a = Class776.Method1715(a, a);
                  }

                  if (a >= a) {
                     if (!this.Field644) {
                        break label49;
                     }

                     a = Class776.Method1715(a, a);
                  }

                  ++a;
                  int a = a[a * a + a];
                  a += a >> 24 & 255;
                  a += a >> 16 & 255;
                  a += a >> 8 & 255;
                  a += a & 255;
                  ++a;
               }
            }

            a[a] = a[a];
            a = Class767.Method1687(a / a);
            a = Class767.Method1687(a / a);
            a = Class767.Method1687(a / a);
            a = Class767.Method1687(a / a);
            a[a] = a << 24 | a << 16 | a << 8 | a;
            ++a;
            ++a;
         }

         ++a;
      }

      if (this.Field645) {
         Class776.Method1728(a, 0, a.length);
      }

      this.Method1267(a, 0, 0, a, a, a);
      return a;
   }

   public String toString() {
      return "Blur/Motion Blur...";
   }
}
