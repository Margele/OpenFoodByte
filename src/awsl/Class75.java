package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class75 extends Class193 {
   private float Field693 = 0.1F;
   private boolean Field694;
   private boolean Field695;
   private BufferedImage Field696;

   public void Method56(float a) {
      this.Field693 = a;
   }

   public float Method57() {
      return this.Field693;
   }

   public void Method1271(BufferedImage a) {
      this.Field696 = a;
   }

   public BufferedImage Method1272() {
      return this.Field696;
   }

   public void Method87(boolean a) {
      this.Field694 = a;
   }

   public boolean Method88() {
      return this.Field694;
   }

   public void Method1282(boolean a) {
      this.Field695 = a;
   }

   public boolean Method1283() {
      return this.Field695;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int a = a.getWidth();
      int a = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      if (this.Field696 == null) {
         return a;
      } else {
         int a = this.Field696.getWidth();
         int a = this.Field696.getHeight();
         float a = 255.0F * this.Field693;
         int[] a = new int[a];
         int[] a = new int[a];
         int a = 0;
         if (a < a) {
            this.Method104(a, 0, a, a, 1, a);
            this.Method104(this.Field696, 0, a % a, a, 1, a);
            int a = 0;
            if (a < a) {
               int a = a[a % a];
               int a = a[a];
               if (this.Field694) {
                  a ^= 16777215;
               }

               int a;
               int a;
               int a;
               if (this.Field695) {
                  a = Class767.Method1689(a);
                  a = Class767.Method1689(a);
                  float a = 1.0F - Class776.Method1708((float)a - a, (float)a + a, (float)a);
                  a = (int)(255.0F * a);
                  a[a] = a & -16777216 | a << 16 | a << 8 | a;
               }

               a = a >> 16 & 255;
               a = a >> 8 & 255;
               int a = a & 255;
               a = a >> 16 & 255;
               int a = a >> 8 & 255;
               int a = a & 255;
               int a = (int)(255.0F * (1.0F - Class776.Method1708((float)a - a, (float)a + a, (float)a)));
               int a = (int)(255.0F * (1.0F - Class776.Method1708((float)a - a, (float)a + a, (float)a)));
               int a = (int)(255.0F * (1.0F - Class776.Method1708((float)a - a, (float)a + a, (float)a)));
               a[a] = a & -16777216 | a << 16 | a << 8 | a;
               ++a;
            }

            this.Method1267(a, 0, a, a, 1, a);
            ++a;
         }

         return a;
      }
   }

   public String toString() {
      return "Stylize/Halftone...";
   }
}
