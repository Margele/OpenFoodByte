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
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      if (this.Field700 == null) {
         return a;
      } else {
         int var6 = this.Field700.getWidth();
         int var7 = this.Field700.getHeight();
         float var8 = this.Field697 * (1.0F + this.Field698);
         float var9 = 255.0F * (var8 - this.Field698);
         float var10 = 255.0F * var8;
         int[] var11 = new int[var4];
         int[] var12 = new int[var6];
         int var13 = 0;
         if (var13 < var5) {
            this.Method104(a, 0, var13, var4, 1, var11);
            this.Method104(this.Field700, 0, var13 % var7, var6, 1, var12);
            int var14 = 0;
            if (var14 < var4) {
               int var15 = var12[var14 % var6];
               int var16 = var11[var14];
               int var17 = Class767.Method1689(var15);
               float var18 = Class776.Method1708(var9, var10, (float)var17);
               int var19 = (int)(255.0F * var18);
               if (this.Field699) {
                  var19 = 255 - var19;
               }

               var11[var14] = var19 << 24 | var16 & 16777215;
               ++var14;
            }

            this.Method1267(a, 0, var13, var4, 1, var11);
            ++var13;
         }

         return a;
      }
   }

   public String toString() {
      return "Transitions/Gradient Wipe...";
   }
}
