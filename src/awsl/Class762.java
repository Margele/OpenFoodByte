package awsl;

import java.awt.Rectangle;

public class Class762 extends Class798 {
   public static final int Field3342 = 0;
   public static final int Field3343 = 1;
   public static final int Field3344 = 2;
   public static final int Field3345 = 3;
   private float Field3346 = 1.0F;
   protected Class755 Field3347 = new Class771();
   private boolean Field3348 = true;
   private boolean Field3349 = false;
   private boolean Field3350 = false;
   private int Field3351;
   private static final int Field3352 = 41;
   private static final int Field3353 = (int)(41.0 * Math.sqrt(2.0));
   private static final int Field3354 = (int)(41.0 * Math.sqrt(5.0));

   public void Method56(float a) {
      this.Field3346 = a;
   }

   public float Method57() {
      return this.Field3346;
   }

   public void Method176(Class755 a) {
      this.Field3347 = a;
   }

   public Class755 Method177() {
      return this.Field3347;
   }

   public void Method87(boolean a) {
      this.Field3348 = a;
   }

   public boolean Method88() {
      return this.Field3348;
   }

   public void Method9(int a) {
      this.Field3351 = a;
   }

   public int Method10() {
      return this.Field3351;
   }

   public void Method1282(boolean a) {
      this.Field3349 = a;
   }

   public boolean Method1283() {
      return this.Field3349;
   }

   public void Method1770(boolean a) {
      this.Field3350 = a;
   }

   public boolean Method1771() {
      return this.Field3350;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      int[] a = new int[a * a];
      this.Method1615(a, a, a, a);
      int a = this.Method1772(a, a, a);
      this.Method1773(a, a, a, a, a);
      return a;
   }

   public int Method1772(int[] a, int a, int a) {
      int a = a - 3;
      int a = a - 3;
      int a = 0;

      int a;
      int a;
      int a;
      int a;
      for(a = 0; a < a; ++a) {
         for(a = 0; a < a; ++a) {
            a = a + a * a;
            if (a[a] > 0) {
               if (a >= 2 && a <= a && a >= 2 && a <= a) {
                  a = this.Method1775(a, a, a);
               } else {
                  a = this.Method1774(a, a, a, a, a, a, a);
               }

               if (a > a) {
                  a = a;
               }
            }
         }
      }

      a = a - 1;
      a = a - 1;

      while(true) {
         a = a + a * a;
         if (a[a] > 0) {
            if (a >= 2 && a <= a && a >= 2 && a <= a) {
               a = this.Method1775(a, a, a);
            } else {
               a = this.Method1774(a, a, a, a, a, a, a);
            }

            if (a > a) {
               a = a;
            }
         }

         --a;
      }
   }

   private void Method1615(int[] a, int[] a, int a, int a) {
      for(int a = 0; a < a; ++a) {
         for(int a = 0; a < a; ++a) {
            int a = a + a * a;
            int a = this.Field3348 ? a[a] >> 24 & 255 : Class767.Method1689(a[a]);
            a[a] = a * 41 / 10;
         }
      }

   }

   private void Method1773(int[] a, int[] a, int a, int a, int a4) {
      int a = Class193.Method1270();
      int a = 1;
      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            int a = a + a * a;
            int a = a[a];
            float a = 0.0F;
            int a = false;
            int a = false;
            int a = false;
            int a = false;
            a = false;
            a = false;
            a = false;
            a = false;
            int a = a[a] >> 24 & 255;
            a = Class776.Method1711(this.Field3346 * (float)a / (float)a, 0.0F, 1.0F);
            switch (this.Field3351) {
               case 1:
                  a = Class776.Method1709(a);
               case 2:
                  a = Class776.Method1710(a);
               case 3:
                  a = Class776.Method1708(0.0F, 1.0F, a);
               default:
                  int a;
                  if (this.Field3347 == null) {
                     a = (int)(a * 255.0F);
                  }

                  int a = this.Field3347.Method283(a);
                  int a = a >> 16 & 255;
                  int a = a >> 8 & 255;
                  a = a & 255;
                  a = this.Field3348 ? a[a] >> 24 & 255 : Class767.Method1689(a[a]);
                  if (this.Field3349) {
                     a = 255 - a;
                     a = 255 - a;
                     a = 255 - a;
                  }

                  if (this.Field3350) {
                     int a = 255;
                     int a = a[a];
                     int a = (a & -16777216) >> 24;
                     int a = (a & 16711680) >> 16;
                     int a = (a & '\uff00') >> 8;
                     int a = a & 255;
                     a = a * a / a;
                     a = a * a / a;
                     a = a * a / a;
                     int a = 0;
                     if (a > 255) {
                        a = 255;
                     }

                     int a = 0;
                     if (a > 255) {
                        a = 255;
                     }

                     int a = 0;
                     if (a > 255) {
                        a = 255;
                     }

                     a[a] = a << 24 | a << 16 | a << 8 | a;
                  }

                  a[a] = a << 24 | a << 16 | a << 8 | a;
                  ++a;
            }
         }

         ++a;
      }

   }

   private int Method1774(int a, int a, int[] a, int a, int a, int a, int a) {
      int a = a - a - a - 2;
      int a = a + a;
      int a = a + a;
      int a = a + a;
      int a = a + a;
      if (a != a + 2 && a != a + 2) {
         int a = a[a + 2] + 41;
         int a = a;
         a = a[a + 1] + 41;
         if (a < a) {
            a = a;
         }

         a = a[a + 3] + 41;
         if (a < a) {
            a = a;
         }

         a = a[a + 2] + 41;
         if (a < a) {
            a = a;
         }

         a = a[a + 1] + Field3353;
         if (a < a) {
            a = a;
         }

         a = a[a + 3] + Field3353;
         if (a < a) {
            a = a;
         }

         a = a[a + 1] + Field3353;
         if (a < a) {
            a = a;
         }

         a = a[a + 3] + Field3353;
         if (a < a) {
            a = a;
         }

         if (a != 1 && a != 1 && a != a + 1 && a != a + 1) {
            a = a[a + 1] + Field3354;
            if (a < a) {
               a = a;
            }

            a = a[a + 3] + Field3354;
            if (a < a) {
               a = a;
            }

            a = a[a + 4] + Field3354;
            if (a < a) {
               a = a;
            }

            a = a[a + 4] + Field3354;
            if (a < a) {
               a = a;
            }

            a = a[a + 3] + Field3354;
            if (a < a) {
               a = a;
            }

            a = a[a + 1] + Field3354;
            if (a < a) {
               a = a;
            }

            a = a[a] + Field3354;
            if (a < a) {
               a = a;
            }

            a = a[a] + Field3354;
            if (a < a) {
               a = a;
            }

            return a[a] = a;
         } else {
            return a[a] = a;
         }
      } else {
         return a[a] = 41;
      }
   }

   private int Method1775(int[] a, int a, int a) {
      int a = a - a - a - 2;
      int a = a + a;
      int a = a + a;
      int a = a + a;
      int a = a + a;
      int a = a[a + 2] + 41;
      int a = a;
      a = a[a + 1] + 41;
      if (a < a) {
         a = a;
      }

      a = a[a + 3] + 41;
      if (a < a) {
         a = a;
      }

      a = a[a + 2] + 41;
      if (a < a) {
         a = a;
      }

      a = a[a + 1] + Field3353;
      if (a < a) {
         a = a;
      }

      a = a[a + 3] + Field3353;
      if (a < a) {
         a = a;
      }

      a = a[a + 1] + Field3353;
      if (a < a) {
         a = a;
      }

      a = a[a + 3] + Field3353;
      if (a < a) {
         a = a;
      }

      a = a[a + 1] + Field3354;
      if (a < a) {
         a = a;
      }

      a = a[a + 3] + Field3354;
      if (a < a) {
         a = a;
      }

      a = a[a + 4] + Field3354;
      if (a < a) {
         a = a;
      }

      a = a[a + 4] + Field3354;
      if (a < a) {
         a = a;
      }

      a = a[a + 3] + Field3354;
      if (a < a) {
         a = a;
      }

      a = a[a + 1] + Field3354;
      if (a < a) {
         a = a;
      }

      a = a[a] + Field3354;
      if (a < a) {
         a = a;
      }

      a = a[a] + Field3354;
      if (a < a) {
         a = a;
      }

      return a[a] = a;
   }

   public String toString() {
      return "Stylize/Shapeburst...";
   }
}
