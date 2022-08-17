package awsl;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class68 extends Class70 {
   private float Field659 = 1.0F;
   private float Field660 = 0.0F;
   private float Field661 = 0.5F;
   private boolean Field662 = false;
   private Class755 Field663;

   public void Method170(float a) {
      this.Field659 = a;
   }

   public float Method171() {
      return this.Field659;
   }

   public void Method172(float a) {
      this.Field660 = a;
   }

   public float Method173() {
      return this.Field660;
   }

   public void Method174(float a) {
      this.Field661 = a;
   }

   public float Method175() {
      return this.Field661;
   }

   public void Method87(boolean a) {
      this.Field662 = a;
   }

   public boolean Method88() {
      return this.Field662;
   }

   public void Method176(Class755 a) {
      this.Field663 = a;
   }

   public Class755 Method177() {
      return this.Field663;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      int a = a.getWidth();
      int a = a.getHeight();
      int[] a = new int[a];
      int[] a = new int[a];
      BufferedImage a = new BufferedImage(a, a, 2);
      int a = (int)(this.Field660 * 3.0F * 255.0F);
      int a = 0;
      int a;
      int a;
      int a;
      int a;
      int a;
      int a;
      int a;
      if (a < a) {
         this.Method104(a, 0, a, a, 1, a);
         a = 0;
         if (a < a) {
            a = a[a];
            a = a & -16777216;
            a = a >> 16 & 255;
            a = a >> 8 & 255;
            a = a & 255;
            a = a + a + a;
            if (a < a) {
               a[a] = -16777216;
            }

            a /= 3;
            a[a] = a | a << 16 | a << 8 | a;
            ++a;
         }

         this.Method1267(a, 0, a, a, 1, a);
         ++a;
      }

      a = super.Method62(a, (BufferedImage)null);
      int a = 0;
      if (a < a) {
         this.Method104(a, 0, a, a, 1, a);
         this.Method104(a, 0, a, a, 1, a);
         int a = 0;
         if (a < a) {
            a = a[a];
            a = a & -16777216;
            a = a >> 16 & 255;
            a = a >> 8 & 255;
            a = a & 255;
            if (this.Field663 != null) {
               a = a + a + a;
               this.Field663.Method283((float)a * this.Field661 * 0.33333334F);
            }

            a = Class767.Method1687((int)((float)a * this.Field661));
            a = Class767.Method1687((int)((float)a * this.Field661));
            a = Class767.Method1687((int)((float)a * this.Field661));
            a = a | a << 16 | a << 8 | a;
            a[a] = a;
            a = a + 1;
         }

         this.Method1267(a, 0, a, a, 1, a);
         a = a + 1;
      }

      a = this.Method1263(a, (ColorModel)null);
      Graphics2D a = a.createGraphics();
      if (!this.Field662) {
         a.setComposite(AlphaComposite.SrcOver);
         a.drawRenderedImage(a, (AffineTransform)null);
      }

      a.setComposite(Class239.Method2275(1, this.Field659));
      a.drawRenderedImage(a, (AffineTransform)null);
      a.dispose();
      return a;
   }

   public String toString() {
      return "Stylize/Rays...";
   }
}
