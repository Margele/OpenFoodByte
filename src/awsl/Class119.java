package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public abstract class Class119 extends Class193 {
   protected boolean Field950 = false;
   private static String Field951;

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      int a = a.getType();
      Class193.Method1270();
      WritableRaster a = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      WritableRaster a = a.getRaster();
      this.Method17(a, a);
      int[] a = new int[a];
      int a = 0;
      if (a < a) {
         int a;
         if (a == 2) {
            a.getDataElements(0, a, a, 1, a);
            a = 0;
            if (a < a) {
               a[a] = this.Method3(a, a, a[a]);
               ++a;
            }

            a.setDataElements(0, a, a, 1, a);
         }

         a.getRGB(0, a, a, 1, a, 0, a);
         int a = 0;
         if (a < a) {
            a[a] = this.Method3(a, a, a[a]);
            a = a + 1;
         }

         a.setRGB(0, a, a, 1, a, 0, a);
         ++a;
      }

      return a;
   }

   public void Method17(int a, int a1) {
   }

   public abstract int Method3(int integer1, int integer2, int integer3);

   public static void Method496(String string) {
      Field951 = string;
   }

   public static String Method497() {
      return Field951;
   }

   static {
      if (Method497() != null) {
         Method496("TZ1Do");
      }

   }
}
