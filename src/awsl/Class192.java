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
      int var4 = a.getMinX();
      int var5 = a.getMinY();
      int var6 = a.getWidth();
      int var7 = a.getHeight();
      Object var8 = null;
      Class193.Method1270();
      Object var9 = null;
      Object var10 = null;
      int var11 = 0;
      if (var11 < var7) {
         int[] var24 = a.getPixels(var4, var5, var6, 1, (int[])var8);
         int[] var25 = a.getPixels(var4, var5, var6, 1, (int[])var9);
         int[] var26 = a.getPixels(var4, var5, var6, 1, (int[])var10);
         int var13 = 0;
         if (var13 < var6) {
            int var14 = var24[var4];
            int var15 = var26[var4];
            int var16 = var24[var4 + 1];
            int var17 = var26[var4 + 1];
            int var18 = var24[var4 + 2];
            int var19 = var26[var4 + 2];
            int var20 = var24[var4 + 3];
            int var21 = var26[var4 + 3];
            float var22 = (float)var25[var4 + 3] / 255.0F;
            float var23 = 1.0F - var22;
            var26[var4] = (int)(var22 * (float)var14 + var23 * (float)var15);
            var26[var4 + 1] = (int)(var22 * (float)var16 + var23 * (float)var17);
            var26[var4 + 2] = (int)(var22 * (float)var18 + var23 * (float)var19);
            var26[var4 + 3] = (int)(var22 * (float)var20 + var23 * (float)var21);
            int var12 = var4 + 4;
            ++var13;
         }

         a.setPixels(var4, var5, var6, 1, var26);
         ++var5;
         ++var11;
      }

   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var3 = a.getWidth();
      int var4 = a.getHeight();
      int var5 = a.getType();
      WritableRaster var6 = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      WritableRaster var7 = a.getRaster();
      if (this.Field1157 != null && this.Field1158 != null) {
         Method1275(a.getRaster(), a.getRaster(), this.Field1158.getRaster());
      }

      return a;
   }

   public String toString() {
      return "Keying/Key...";
   }
}
