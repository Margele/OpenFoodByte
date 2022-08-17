package awsl;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Class94 extends Class193 {
   private float Field810 = 1.0F;
   private float Field811 = 2.0F;
   private boolean Field812 = true;
   private boolean Field813;

   public void Method56(float a) {
      this.Field810 = a;
   }

   public float Method57() {
      return this.Field810;
   }

   public void Method58(float a) {
      this.Field811 = a;
   }

   public float Method59() {
      return this.Field811;
   }

   public void Method87(boolean a) {
      this.Field812 = a;
   }

   public boolean Method88() {
      return this.Field812;
   }

   public void Method1282(boolean a) {
      this.Field813 = a;
   }

   public boolean Method1283() {
      return this.Field813;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a1) {
      int a = a.getWidth();
      int a = a.getHeight();
      BufferedImage a = (new Class196(this.Field810, this.Field810, 3)).Method62(a, (BufferedImage)null);
      BufferedImage a = (new Class196(this.Field811, this.Field811, 3)).Method62(a, (BufferedImage)null);
      Class193.Method1270();
      Graphics2D a = a.createGraphics();
      a.setComposite(new Class147(1.0F));
      a.drawImage(a, 0, 0, (ImageObserver)null);
      a.dispose();
      if (this.Field812 && this.Field810 != this.Field811) {
         int[] a = null;
         int a = 0;
         int a = 0;
         int a;
         int a;
         int a;
         int a;
         int a;
         if (a < a) {
            a = this.Method104(a, 0, a, a, 1, a);
            a = 0;
            if (a < a) {
               a = a[a];
               a = a >> 16 & 255;
               a = a >> 8 & 255;
               a = a & 255;
               if (a > a) {
                  a = a;
               }

               if (a > a) {
                  a = a;
               }

               if (a > a) {
                  a = a;
               }

               ++a;
            }

            ++a;
         }

         int a = 0;
         if (a < a) {
            a = this.Method104(a, 0, a, a, 1, a);
            int a = 0;
            if (a < a) {
               a = a[a];
               a = a >> 16 & 255;
               a = a >> 8 & 255;
               a = a & 255;
               a = a * 255 / a;
               a = a * 255 / a;
               a = a * 255 / a;
               a[a] = a & -16777216 | a << 16 | a << 8 | a;
               a = a + 1;
            }

            this.Method1267(a, 0, a, a, 1, a);
            a = a + 1;
         }
      }

      if (this.Field813) {
         a = (new Class100()).Method62(a, a);
      }

      return a;
   }

   public String toString() {
      return "Edges/Difference of Gaussians...";
   }
}
