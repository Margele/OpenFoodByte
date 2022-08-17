package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Class198 extends Class193 {
   private int Field1175 = 2;

   public Class198() {
   }

   public Class198(int a) {
      this.Field1175 = a;
   }

   public void Method9(int a) {
      this.Field1175 = a;
   }

   public int Method10() {
      return this.Field1175;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int a = a.getWidth();
      int a = a.getHeight();
      int a = a.getType();
      WritableRaster a = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      int[] a = new int[this.Field1175 * this.Field1175];
      int a = 0;
      if (a < a) {
         int a = 0;
         int var10000;
         if (a < a) {
            int a = Math.min(this.Field1175, a - a);
            int a = Math.min(this.Field1175, a - a);
            int a = a * a;
            this.Method104(a, a, a, a, a, a);
            int a = 0;
            int a = 0;
            int a = 0;
            int a = 0;
            int a = 0;
            int a;
            int a;
            if (a < a) {
               a = 0;
               if (a < a) {
                  a = a[a];
                  a += a >> 16 & 255;
                  a += a >> 8 & 255;
                  a += a & 255;
                  ++a;
                  ++a;
               }

               ++a;
            }

            a = a / a << 16 | a / a << 8 | a / a;
            int a = 0;
            int a = 0;
            if (a < a) {
               int a = 0;
               if (a < a) {
                  a[a] = a[a] & -16777216 | a;
                  a = a + 1;
                  a = a + 1;
               }

               a = a + 1;
            }

            this.Method1267(a, a, a, a, a, a);
            var10000 = a + this.Field1175;
         }

         var10000 = a + this.Field1175;
      }

      return a;
   }

   public String toString() {
      return "Pixellate/Mosaic...";
   }
}
