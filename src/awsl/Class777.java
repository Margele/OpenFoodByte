package awsl;

import java.awt.Image;
import java.awt.image.ImageProducer;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;

public class Class777 {
   public int Method1700(int a, int a, int a, int a) {
      int var5 = a >> 24 & 255;
      int var6 = a >> 16 & 255;
      int var7 = a >> 8 & 255;
      int var8 = a & 255;
      int var9 = a >> 24 & 255;
      int var10 = a >> 16 & 255;
      int var11 = a >> 8 & 255;
      int var12 = a & 255;
      int var13 = Class767.Method1687(var6 + var10);
      int var14 = Class767.Method1687(var6 + var10);
      int var15 = Class767.Method1687(var6 + var10);
      return var5 << 24 | var13 << 16 | var14 << 8 | var15;
   }

   public ImageProducer Method1701(Image a, Image a, int a, int a, int a, int a) {
      int[] var8 = new int[a * a];
      Class193.Method1269();
      int[] var9 = new int[a * a];
      int[] var10 = new int[a * a];
      PixelGrabber var11 = new PixelGrabber(a, a, a, a, a, var8, 0, a);
      PixelGrabber var12 = new PixelGrabber(a, a, a, a, a, var9, 0, a);

      try {
         var11.grabPixels();
         var12.grabPixels();
      } catch (InterruptedException var16) {
         System.err.println("interrupted waiting for pixels!");
         return null;
      }

      if ((var11.status() & 128) != 0) {
         System.err.println("image fetch aborted or errored");
         return null;
      } else if ((var12.status() & 128) != 0) {
         System.err.println("image fetch aborted or errored");
         return null;
      } else {
         int var13 = 0;
         if (var13 < a) {
            int var14 = 0;
            if (var14 < a) {
               int var15 = var13 * a + var14;
               var10[var15] = this.Method1700(a + var14, a + var13, var8[var15], var9[var15]);
               ++var14;
            }

            ++var13;
         }

         return new MemoryImageSource(a, a, var10, 0, a);
      }
   }

   private static InterruptedException Method1702(InterruptedException interruptedException) {
      return interruptedException;
   }
}
