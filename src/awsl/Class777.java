package awsl;

import java.awt.Image;
import java.awt.image.ImageProducer;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;

public class Class777 {
   public int Method1700(int a, int a1, int a, int a) {
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      int a = Class767.Method1687(a + a);
      int a = Class767.Method1687(a + a);
      int a = Class767.Method1687(a + a);
      return a << 24 | a << 16 | a << 8 | a;
   }

   public ImageProducer Method1701(Image a, Image a, int a, int a, int a, int a) {
      int[] a = new int[a * a];
      Class193.Method1269();
      int[] a = new int[a * a];
      int[] a = new int[a * a];
      PixelGrabber a = new PixelGrabber(a, a, a, a, a, a, 0, a);
      PixelGrabber a = new PixelGrabber(a, a, a, a, a, a, 0, a);

      try {
         a.grabPixels();
         a.grabPixels();
      } catch (InterruptedException var16) {
         System.err.println("interrupted waiting for pixels!");
         return null;
      }

      if ((a.status() & 128) != 0) {
         System.err.println("image fetch aborted or errored");
         return null;
      } else if ((a.status() & 128) != 0) {
         System.err.println("image fetch aborted or errored");
         return null;
      } else {
         int a = 0;
         if (a < a) {
            int a = 0;
            if (a < a) {
               int a = a * a + a;
               a[a] = this.Method1700(a + a, a + a, a[a], a[a]);
               ++a;
            }

            ++a;
         }

         return new MemoryImageSource(a, a, a, 0, a);
      }
   }

   private static InterruptedException Method1702(InterruptedException interruptedException) {
      return interruptedException;
   }
}
