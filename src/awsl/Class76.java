package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class76 extends Class193 {
   private float Field697 = 0.0F;
   private float Field698 = 0.0F;
   private boolean Field699;
   private BufferedImage Field700;

   public void Method56(float a) {
      this.Field697 = a;
   }

   public float Method57() {
      return this.Field697;
   }

   public void Method58(float a) {
      this.Field698 = a;
   }

   public float Method59() {
      return this.Field698;
   }

   public void Method1271(BufferedImage a) {
      this.Field700 = a;
   }

   public BufferedImage Method1272() {
      return this.Field700;
   }

   public void Method87(boolean a) {
      this.Field699 = a;
   }

   public boolean Method88() {
      return this.Field699;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1269();
      int a = a.getWidth();
      int a = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      if (this.Field700 == null) {
         return a;
      } else {
         int a = this.Field700.getWidth();
         int a = this.Field700.getHeight();
         float a = this.Field697 * (1.0F + this.Field698);
         float a = 255.0F * (a - this.Field698);
         float a = 255.0F * a;
         int[] a = new int[a];
         int[] a = new int[a];
         int a = 0;
         if (a < a) {
            this.Method104(a, 0, a, a, 1, a);
            this.Method104(this.Field700, 0, a % a, a, 1, a);
            int a = 0;
            if (a < a) {
               int a = a[a % a];
               int a = a[a];
               int a = Class767.Method1689(a);
               float a = Class776.Method1708(a, a, (float)a);
               int a = (int)(255.0F * a);
               if (this.Field699) {
                  a = 255 - a;
               }

               a[a] = a << 24 | a & 16777215;
               ++a;
            }

            this.Method1267(a, 0, a, a, 1, a);
            ++a;
         }

         return a;
      }
   }

   public String toString() {
      return "Transitions/Gradient Wipe...";
   }
}
