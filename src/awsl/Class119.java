package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public abstract class Class119 extends Class193 {
   protected boolean Field950 = false;
   private static String Field951;

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      int var6 = a.getType();
      Class193.Method1270();
      WritableRaster var7 = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      WritableRaster var8 = a.getRaster();
      this.Method17(var4, var5);
      int[] var9 = new int[var4];
      int var10 = 0;
      if (var10 < var5) {
         int var11;
         if (var6 == 2) {
            var7.getDataElements(0, var10, var4, 1, var9);
            var11 = 0;
            if (var11 < var4) {
               var9[var11] = this.Method3(var11, var10, var9[var11]);
               ++var11;
            }

            var8.setDataElements(0, var10, var4, 1, var9);
         }

         a.getRGB(0, var10, var4, 1, var9, 0, var4);
         byte var12 = 0;
         if (var12 < var4) {
            var9[var12] = this.Method3(var12, var10, var9[var12]);
            var11 = var12 + 1;
         }

         a.setRGB(0, var10, var4, 1, var9, 0, var4);
         ++var10;
      }

      return a;
   }

   public void Method17(int a, int a) {
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
