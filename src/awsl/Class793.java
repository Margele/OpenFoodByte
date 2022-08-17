package awsl;

import java.awt.Rectangle;

public class Class793 extends Class808 {
   private static final byte[] Field3558 = new byte[]{0, 0, 0, 1, 0, 0, 1, 3, 0, 0, 3, 1, 1, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 3, 0, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 3, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 2, 0, 0, 1, 3, 1, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 1, 3, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 1, 0, 0, 0, 0, 2, 2, 0, 0, 2, 0, 0, 0};

   public Class793() {
      this.Field3617 = -1;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1270();
      int[] var6 = new int[a * a];
      boolean var7 = false;
      int var8 = -16777216;
      boolean var9 = true;
      int var10 = 0;
      if (var10 < this.Field3619) {
         int var18 = 0;
         int var11 = 0;
         if (var11 < 2) {
            int var12 = 1;
            if (var12 < a - 1) {
               int var13 = var12 * a + 1;
               int var14 = 1;
               if (var14 < a - 1) {
                  int var15 = a[var13];
                  if (var15 == var8) {
                     label87: {
                        int var16 = 0;
                        if (a[var13 - a - 1] == var8) {
                           var16 |= 1;
                        }

                        if (a[var13 - a] == var8) {
                           var16 |= 2;
                        }

                        if (a[var13 - a + 1] == var8) {
                           var16 |= 4;
                        }

                        if (a[var13 + 1] == var8) {
                           var16 |= 8;
                        }

                        if (a[var13 + a + 1] == var8) {
                           var16 |= 16;
                        }

                        if (a[var13 + a] == var8) {
                           var16 |= 32;
                        }

                        if (a[var13 + a - 1] == var8) {
                           var16 |= 64;
                        }

                        if (a[var13 - 1] == var8) {
                           var16 |= 128;
                        }

                        byte var17 = Field3558[var16];
                        if (var11 == 1) {
                           if (var17 != 2 && var17 != 3) {
                              break label87;
                           }

                           if (this.Field3620 != null) {
                              this.Field3620.Method283((float)var10 / (float)this.Field3619);
                           }

                           var15 = this.Field3617;
                           ++var18;
                        }

                        if (var17 == 1 || var17 == 3) {
                           if (this.Field3620 != null) {
                              this.Field3620.Method283((float)var10 / (float)this.Field3619);
                           }

                           var15 = this.Field3617;
                           ++var18;
                        }
                     }
                  }

                  var6[var13++] = var15;
                  ++var14;
               }

               ++var12;
            }

            var6 = new int[a * a];
            ++var11;
         }

         ++var10;
      }

      return var6;
   }

   public String toString() {
      return "Binary/Skeletonize...";
   }
}
