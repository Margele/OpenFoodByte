package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class Class84 extends Class193 {
   public static final int Field714 = 1;
   public static final int Field715 = 2;
   public static final int Field716 = 3;
   public static final int Field717 = 4;
   public static final int Field718 = 5;
   public static final int Field719 = 6;
   private int Field720;
   private int Field721;
   private int Field722;
   private int Field723;
   private int Field724;

   public Class84() {
      this(3);
   }

   public Class84(int a) {
      this.Field720 = a;
   }

   public void Method9(int a) {
      this.Field720 = a;
   }

   public int Method10() {
      return this.Field720;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      int var6 = a.getType();
      WritableRaster var7 = a.getRaster();
      int[] var8 = this.Method104(a, 0, 0, var4, var5, (int[])null);
      byte var9 = 0;
      Class193.Method1270();
      byte var10 = 0;
      boolean var13 = false;
      boolean var14 = false;
      int var15 = var4;
      int var16 = var5;
      int var10000;
      switch (this.Field720) {
         case 1:
            var10000 = var4 - (var9 + var4);
         case 2:
            var10000 = var5 - (var10 + var5);
         case 3:
         case 4:
            var10000 = var5 - (var10 + var5);
         case 5:
            var15 = var5;
            var16 = var4;
            var10000 = var4 - (var9 + var4);
         case 6:
            var10000 = var4 - (var9 + var4);
            var10000 = var5 - (var10 + var5);
         default:
            int[] var17 = new int[var15 * var16];
            int var18 = 0;
            if (var18 < var5) {
               int var19 = 0;
               if (var19 < var4) {
                  int var20 = var18 * var4 + var19;
                  int var21 = var18;
                  int var22 = var19;
                  switch (this.Field720) {
                     case 1:
                        var22 = var4 - var19 - 1;
                     case 2:
                        var21 = var5 - var18 - 1;
                     case 3:
                     case 4:
                        var22 = var5 - var18 - 1;
                     case 5:
                        var21 = var4 - var19 - 1;
                     case 6:
                        var21 = var5 - var18 - 1;
                        var22 = var4 - var19 - 1;
                     default:
                        int var23 = var21 * var15 + var22;
                        var17[var23] = var8[var20];
                        ++var19;
                  }
               }

               ++var18;
            }

            ColorModel var24 = a.getColorModel();
            a = new BufferedImage(var24, var24.createCompatibleWritableRaster(var15, var16), var24.isAlphaPremultiplied(), (Hashtable)null);
            WritableRaster var25 = a.getRaster();
            this.Method1267(a, 0, 0, var15, var16, var17);
            return a;
      }
   }

   public String toString() {
      switch (this.Field720) {
         case 1:
            return "Flip Horizontal";
         case 2:
            return "Flip Vertical";
         case 3:
            return "Flip Diagonal";
         case 4:
            return "Rotate 90";
         case 5:
            return "Rotate -90";
         case 6:
            return "Rotate 180";
         default:
            return "Flip";
      }
   }
}
