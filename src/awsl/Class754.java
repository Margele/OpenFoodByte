package awsl;

import java.awt.image.BufferedImage;

class Class754 {
   private int Field3294;
   private int Field3295;
   private int Field3296;
   private int[] Field3297;

   public Class754(BufferedImage a) {
      int var2 = a.getWidth();
      int var3 = a.getHeight();
      int var4 = a.getType();
      this.Field3297 = Class779.Method842(a, 0, 0, var2, var3, (int[])null);
   }

   public int Method1630(float a, float a) {
      int var4 = (int)Math.floor((double)a);
      Class193.Method1270();
      int var5 = (int)Math.floor((double)a);
      float var6 = a - (float)var4;
      float var7 = a - (float)var5;
      if (var4 < this.Field3295 - 1 && var5 < this.Field3296 - 1) {
         int var12 = this.Field3295 * var5 + var4;
         int var10000 = this.Field3297[var12];
         var10000 = this.Field3297[var12 + 1];
         var10000 = this.Field3297[var12 + this.Field3295];
         var10000 = this.Field3297[var12 + this.Field3295 + 1];
      }

      int var8 = this.Method1631(this.Field3297, var4, var5, this.Field3295, this.Field3296);
      int var9 = this.Method1631(this.Field3297, var4 + 1, var5, this.Field3295, this.Field3296);
      int var10 = this.Method1631(this.Field3297, var4, var5 + 1, this.Field3295, this.Field3296);
      int var11 = this.Method1631(this.Field3297, var4 + 1, var5 + 1, this.Field3295, this.Field3296);
      return Class776.Method1720(var6, var7, var8, var9, var10, var11);
   }

   private final int Method1631(int[] a, int a, int a, int a, int a) {
      if (a < a && a < a) {
         return a[a * a + a];
      } else {
         switch (this.Field3294) {
            case 0:
            default:
               return 0;
            case 1:
               return a[Class776.Method1712(a, 0, a - 1) * a + Class776.Method1712(a, 0, a - 1)];
            case 2:
               return a[Class776.Method1715(a, a) * a + Class776.Method1715(a, a)];
         }
      }
   }
}
