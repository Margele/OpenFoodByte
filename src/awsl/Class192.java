package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class Class192 extends Class193 {
   private BufferedImage Field1157;
   private BufferedImage Field1158;

   public Class192() {
   }

   public Class192(BufferedImage a, BufferedImage a) {
      this.Field1158 = a;
      this.Field1157 = a;
   }

   public void Method1271(BufferedImage a) {
      this.Field1157 = a;
   }

   public BufferedImage Method1272() {
      return this.Field1157;
   }

   public void Method1273(BufferedImage a) {
      this.Field1158 = a;
   }

   public BufferedImage Method1274() {
      return this.Field1158;
   }

   public static void Method1275(Raster a, WritableRaster a, Raster a) {
      int a = a.getMinX();
      int a = a.getMinY();
      int a = a.getWidth();
      int a = a.getHeight();
      Object a = null;
      Class193.Method1270();
      int[] a = null;
      int[] a = null;
      int a = 0;
      if (a < a) {
         int[] a = a.getPixels(a, a, a, 1, (int[])a);
         int[] a = a.getPixels(a, a, a, 1, (int[])a);
         int[] a = a.getPixels(a, a, a, 1, (int[])a);
         int a = 0;
         if (a < a) {
            int a = a[a];
            int a = a[a];
            int a = a[a + 1];
            int a = a[a + 1];
            int a = a[a + 2];
            int a = a[a + 2];
            int a = a[a + 3];
            int a = a[a + 3];
            float a = (float)a[a + 3] / 255.0F;
            float a = 1.0F - a;
            a[a] = (int)(a * (float)a + a * (float)a);
            a[a + 1] = (int)(a * (float)a + a * (float)a);
            a[a + 2] = (int)(a * (float)a + a * (float)a);
            a[a + 3] = (int)(a * (float)a + a * (float)a);
            int var12 = a + 4;
            ++a;
         }

         a.setPixels(a, a, a, 1, a);
         ++a;
         ++a;
      }

   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      int a = a.getType();
      WritableRaster a = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      WritableRaster a = a.getRaster();
      if (this.Field1157 != null && this.Field1158 != null) {
         Method1275(a.getRaster(), a.getRaster(), this.Field1158.getRaster());
      }

      return a;
   }

   public String toString() {
      return "Keying/Key...";
   }
}
