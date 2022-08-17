package awsl;

import java.awt.Rectangle;

public class Class793 extends Class808 {
   private static final byte[] Field3558 = new byte[]{0, 0, 0, 1, 0, 0, 1, 3, 0, 0, 3, 1, 1, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 3, 0, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 3, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 2, 0, 0, 1, 3, 1, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 1, 3, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 1, 0, 0, 0, 0, 2, 2, 0, 0, 2, 0, 0, 0};

   public Class793() {
      this.Field3617 = -1;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      Class193.Method1270();
      int[] a = new int[a * a];
      int a = false;
      int a = -16777216;
      int a = true;
      int a = 0;
      if (a < this.Field3619) {
         int a = 0;
         int a = 0;
         if (a < 2) {
            int a = 1;
            if (a < a - 1) {
               int a = a * a + 1;
               int a = 1;
               if (a < a - 1) {
                  int a = a[a];
                  if (a == a) {
                     label87: {
                        int a = 0;
                        if (a[a - a - 1] == a) {
                           a |= 1;
                        }

                        if (a[a - a] == a) {
                           a |= 2;
                        }

                        if (a[a - a + 1] == a) {
                           a |= 4;
                        }

                        if (a[a + 1] == a) {
                           a |= 8;
                        }

                        if (a[a + a + 1] == a) {
                           a |= 16;
                        }

                        if (a[a + a] == a) {
                           a |= 32;
                        }

                        if (a[a + a - 1] == a) {
                           a |= 64;
                        }

                        if (a[a - 1] == a) {
                           a |= 128;
                        }

                        int a = Field3558[a];
                        if (a == 1) {
                           if (a != 2 && a != 3) {
                              break label87;
                           }

                           if (this.Field3620 != null) {
                              this.Field3620.Method283((float)a / (float)this.Field3619);
                           }

                           a = this.Field3617;
                           ++a;
                        }

                        if (a == 1 || a == 3) {
                           if (this.Field3620 != null) {
                              this.Field3620.Method283((float)a / (float)this.Field3619);
                           }

                           a = this.Field3617;
                           ++a;
                        }
                     }
                  }

                  a[a++] = a;
                  ++a;
               }

               ++a;
            }

            a = new int[a * a];
            ++a;
         }

         ++a;
      }

      return a;
   }

   public String toString() {
      return "Binary/Skeletonize...";
   }
}
