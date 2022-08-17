package awsl;

import java.awt.Rectangle;

public class Class791 extends Class808 {
   private int Field3555 = 2;

   public Class791() {
      this.Field3617 = -1;
   }

   public void Method13(int a) {
      this.Field3555 = a;
   }

   public int Method14() {
      return this.Field3555;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1269();
      int[] var6 = new int[a * a];
      int var7 = 0;
      if (var7 < this.Field3619) {
         int var8 = 0;
         int[] var9 = a;
         a = var6;
         var6 = var9;
         int var19 = 0;
         if (var19 < a) {
            int var10 = 0;
            if (var10 < a) {
               int var11 = a[var19 * a + var10];
               if (this.Field3618.Method3494(var11)) {
                  int var12 = 0;
                  int var13 = -1;
                  if (var13 <= 1) {
                     int var14 = var19 + var13;
                     if (0 <= var14 && var14 < a) {
                        int var15 = var14 * a;
                        int var16 = -1;
                        if (var16 <= 1) {
                           int var17 = var10 + var16;
                           if (0 <= var17 && var17 < a) {
                              int var18 = a[var15 + var17];
                              if (!this.Field3618.Method3494(var18)) {
                                 ++var12;
                              }
                           }

                           ++var16;
                        }
                     }

                     ++var13;
                  }

                  if (var12 >= this.Field3555) {
                     if (this.Field3620 != null) {
                        this.Field3620.Method283((float)var7 / (float)this.Field3619);
                     }

                     var11 = this.Field3617;
                  }
               }

               var9[var8++] = var11;
               ++var10;
            }

            ++var19;
         }

         ++var7;
      }

      return var6;
   }

   public String toString() {
      return "Binary/Erode...";
   }
}
