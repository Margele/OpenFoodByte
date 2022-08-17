package awsl;

public class Class776 {
   public static final float Field3450 = 3.1415927F;
   public static final float Field3451 = 1.5707964F;
   public static final float Field3452 = 0.7853982F;
   public static final float Field3453 = 6.2831855F;
   private static final float Field3454 = -0.5F;
   private static final float Field3455 = 1.5F;
   private static final float Field3456 = -1.5F;
   private static final float Field3457 = 0.5F;
   private static final float Field3458 = 1.0F;
   private static final float Field3459 = -2.5F;
   private static final float Field3460 = 2.0F;
   private static final float Field3461 = -0.5F;
   private static final float Field3462 = -0.5F;
   private static final float Field3463 = 0.0F;
   private static final float Field3464 = 0.5F;
   private static final float Field3465 = 0.0F;
   private static final float Field3466 = 0.0F;
   private static final float Field3467 = 1.0F;
   private static final float Field3468 = 0.0F;
   private static final float Field3469 = 0.0F;
   private static int Field3470;

   public static float Method1703(float a, float a) {
      return a / ((1.0F / a - 2.0F) * (1.0F - a) + 1.0F);
   }

   public static float Method1704(float a, float a) {
      float a = (1.0F / a - 2.0F) * (1.0F - 2.0F * a);
      return (double)a < 0.5 ? a / (a + 1.0F) : (a - a) / (a - 1.0F);
   }

   public static float Method1705(float a, float a) {
      return a < a ? 0.0F : 1.0F;
   }

   public static float Method1706(float a, float a, float a) {
      return !(a < a) && !(a >= a) ? 1.0F : 0.0F;
   }

   public static float Method1707(float a, float a, float a, float a, float a) {
      if (!(a < a) && !(a >= a)) {
         if (a >= a) {
            if (a < a) {
               return 1.0F;
            } else {
               a = (a - a) / (a - a);
               return 1.0F - a * a * (3.0F - 2.0F * a);
            }
         } else {
            a = (a - a) / (a - a);
            return a * a * (3.0F - 2.0F * a);
         }
      } else {
         return 0.0F;
      }
   }

   public static float Method1708(float a, float a, float a) {
      if (a < a) {
         return 0.0F;
      } else if (a >= a) {
         return 1.0F;
      } else {
         a = (a - a) / (a - a);
         return a * a * (3.0F - 2.0F * a);
      }
   }

   public static float Method1709(float a) {
      a = 1.0F - a;
      return (float)Math.sqrt((double)(1.0F - a * a));
   }

   public static float Method1710(float a) {
      return 1.0F - (float)Math.sqrt((double)(1.0F - a * a));
   }

   public static float Method1711(float a, float a, float a) {
      return a < a ? a : (a > a ? a : a);
   }

   public static int Method1712(int a, int a, int a) {
      return a < a ? a : (a > a ? a : a);
   }

   public static double Method1713(double a, double a) {
      int a = (int)(a / a);
      a -= (double)a * a;
      return a < 0.0 ? a + a : a;
   }

   public static float Method1714(float a, float a) {
      int a = (int)(a / a);
      a -= (float)a * a;
      return a < 0.0F ? a + a : a;
   }

   public static int Method1715(int a, int a) {
      int a = a / a;
      a -= a * a;
      return a + a;
   }

   public static float Method1716(float a) {
      float a = Method1714(a, 1.0F);
      return 2.0F * ((double)a < 0.5 ? a : 1.0F - a);
   }

   public static float Method1717(float a, float a, float a) {
      return a + a * (a - a);
   }

   public static int Method1718(float a, int a, int a) {
      return (int)((float)a + a * (float)(a - a));
   }

   public static int Method1719(float a, int a, int a) {
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      a = Method1718(a, a, a);
      a = Method1718(a, a, a);
      a = Method1718(a, a, a);
      a = Method1718(a, a, a);
      return a << 24 | a << 16 | a << 8 | a;
   }

   public static int Method1720(float a, float a, int a, int a, int a, int a) {
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      float a = 1.0F - a;
      float a = 1.0F - a;
      float a = a * (float)a + a * (float)a;
      float a = a * (float)a + a * (float)a;
      int a = (int)(a * a + a * a);
      a = a * (float)a + a * (float)a;
      a = a * (float)a + a * (float)a;
      int a = (int)(a * a + a * a);
      a = a * (float)a + a * (float)a;
      a = a * (float)a + a * (float)a;
      int a = (int)(a * a + a * a);
      a = a * (float)a + a * (float)a;
      a = a * (float)a + a * (float)a;
      int a = (int)(a * a + a * a);
      return a << 24 | a << 16 | a << 8 | a;
   }

   public static int Method1721(int a) {
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      return (int)((float)a * 0.299F + (float)a * 0.587F + (float)a * 0.114F);
   }

   public static float Method1722(float a, int a, float[] a) {
      int a = a - 3;
      if (a < 1) {
         throw new IllegalArgumentException("Too few knots in spline");
      } else {
         a = Method1711(a, 0.0F, 1.0F) * (float)a;
         int a = (int)a;
         if (a > a - 4) {
            a = a - 4;
         }

         a -= (float)a;
         float a = a[a];
         float a = a[a + 1];
         float a = a[a + 2];
         float a = a[a + 3];
         float a = -0.5F * a + 1.5F * a + -1.5F * a + 0.5F * a;
         float a = 1.0F * a + -2.5F * a + 2.0F * a + -0.5F * a;
         float a = -0.5F * a + 0.0F * a + 0.5F * a + 0.0F * a;
         float a = 0.0F * a + 1.0F * a + 0.0F * a + 0.0F * a;
         return ((a * a + a) * a + a) * a + a;
      }
   }

   public static float Method1723(float a, int a, int[] a, int[] a) {
      int a = a - 3;
      if (a < 1) {
         throw new IllegalArgumentException("Too few knots in spline");
      } else {
         int a;
         for(a = 0; a < a && !((float)a[a + 1] > a); ++a) {
         }

         if (a > a - 3) {
            a = a - 3;
         }

         float a = (a - (float)a[a]) / (float)(a[a + 1] - a[a]);
         --a;
         int a = 0;
         a = 0.0F;
         float a = (float)a[a];
         float a = (float)a[a + 1];
         float a = (float)a[a + 2];
         float a = (float)a[a + 3];
         float a = -0.5F * a + 1.5F * a + -1.5F * a + 0.5F * a;
         float a = 1.0F * a + -2.5F * a + 2.0F * a + -0.5F * a;
         float a = -0.5F * a + 0.0F * a + 0.5F * a + 0.0F * a;
         float a = 0.0F * a + 1.0F * a + 0.0F * a + 0.0F * a;
         return ((a * a + a) * a + a) * a + a;
      }
   }

   public static int Method1724(float a, int a, int[] a) {
      int a = a - 3;
      if (a < 1) {
         throw new IllegalArgumentException("Too few knots in spline");
      } else {
         a = Method1711(a, 0.0F, 1.0F) * (float)a;
         int a = (int)a;
         if (a > a - 4) {
            a = a - 4;
         }

         a -= (float)a;
         int a = 0;

         for(int a = 0; a < 4; ++a) {
            int a = a * 8;
            float a = (float)(a[a] >> a & 255);
            float a = (float)(a[a + 1] >> a & 255);
            float a = (float)(a[a + 2] >> a & 255);
            float a = (float)(a[a + 3] >> a & 255);
            float a = -0.5F * a + 1.5F * a + -1.5F * a + 0.5F * a;
            float a = 1.0F * a + -2.5F * a + 2.0F * a + -0.5F * a;
            float a = -0.5F * a + 0.0F * a + 0.5F * a + 0.0F * a;
            float a = 0.0F * a + 1.0F * a + 0.0F * a + 0.0F * a;
            int a = (int)(((a * a + a) * a + a) * a + a);
            int a = 0;
            a |= a << a;
         }

         return a;
      }
   }

   public static int Method1725(int a, int a, int[] a, int[] a) {
      int a = a - 3;
      if (a < 1) {
         throw new IllegalArgumentException("Too few knots in spline");
      } else {
         int a;
         for(a = 0; a < a && a[a + 1] <= a; ++a) {
         }

         if (a > a - 3) {
            a = a - 3;
         }

         float a = (float)(a - a[a]) / (float)(a[a + 1] - a[a]);
         --a;
         int a = 0;
         a = 0.0F;
         int a = 0;

         for(int a = 0; a < 4; ++a) {
            int a = a * 8;
            float a = (float)(a[a] >> a & 255);
            float a = (float)(a[a + 1] >> a & 255);
            float a = (float)(a[a + 2] >> a & 255);
            float a = (float)(a[a + 3] >> a & 255);
            float a = -0.5F * a + 1.5F * a + -1.5F * a + 0.5F * a;
            float a = 1.0F * a + -2.5F * a + 2.0F * a + -0.5F * a;
            float a = -0.5F * a + 0.0F * a + 0.5F * a + 0.0F * a;
            float a = 0.0F * a + 1.0F * a + 0.0F * a + 0.0F * a;
            int a = (int)(((a * a + a) * a + a) * a + a);
            int a = 0;
            a |= a << a;
         }

         return a;
      }
   }

   public static void Method1726(int[] a, int[] a, int a, int a, int a, float[] a) {
      int a = a.length;
      float[] a = new float[a + 2];
      Class193.Method1270();
      int a = 0;
      int a = 0;
      if (a < a) {
         if (a[a + 1] < (float)a) {
            ++a;
         }

         a[a] = (float)a + ((float)a - a[a]) / (a[a + 1] - a[a]);
         ++a;
      }

      a[a] = (float)a;
      a[a + 1] = (float)a;
      float a = 1.0F;
      float a = a[1];
      float a = a;
      float a = 0.0F;
      float a = 0.0F;
      float a = 0.0F;
      float a = 0.0F;
      int a = a[a];
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      int a = a + a;
      a = a[a];
      int a = a >> 24 & 255;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      a += a;
      int a = 1;
      if (a <= a) {
         float a = a * (float)a + (1.0F - a) * (float)a;
         float a = a * (float)a + (1.0F - a) * (float)a;
         float a = a * (float)a + (1.0F - a) * (float)a;
         float a = a * (float)a + (1.0F - a) * (float)a;
         if (a < a) {
            a += a * a;
            a += a * a;
            a += a * a;
            a += a * a;
            a -= a;
            a = 1.0F;
            if (a < a) {
               a = a[a];
            }

            a = a >> 24 & 255;
            a = a >> 16 & 255;
            a = a >> 8 & 255;
            a = a & 255;
            int var10000 = a + a;
         }

         a += a * a;
         a += a * a;
         a += a * a;
         a += a * a;
         a[a] = (int)Math.min(a / a, 255.0F) << 24 | (int)Math.min(a / a, 255.0F) << 16 | (int)Math.min(a / a, 255.0F) << 8 | (int)Math.min(a / a, 255.0F);
         int a = a + a;
         a = 0.0F;
         a = 0.0F;
         a = 0.0F;
         a = 0.0F;
         float var34 = a - a;
         a = a[a + 1] - a[a];
         a = a + 1;
      }

   }

   public static void Method1727(int[] a, int a, int a) {
      a += a;

      for(int a = a; a < a; ++a) {
         int a = a[a];
         int a = a >> 24 & 255;
         int a = a >> 16 & 255;
         int a = a >> 8 & 255;
         int a = a & 255;
         float a = (float)a * 0.003921569F;
         a = (int)((float)a * a);
         a = (int)((float)a * a);
         a = (int)((float)a * a);
         a[a] = a << 24 | a << 16 | a << 8 | a;
      }

   }

   public static void Method1728(int[] a, int a, int a) {
      a += a;

      for(int a = a; a < a; ++a) {
         int a = a[a];
         int a = a >> 24 & 255;
         int a = a >> 16 & 255;
         int a = a >> 8 & 255;
         int a = a & 255;
         if (a != 255) {
            float a = 255.0F / (float)a;
            a = (int)((float)a * a);
            a = (int)((float)a * a);
            a = (int)((float)a * a);
            if (a > 255) {
               a = 255;
            }

            if (a > 255) {
               a = 255;
            }

            if (a > 255) {
               a = 255;
            }

            a[a] = a << 24 | a << 16 | a << 8 | a;
         }
      }

   }

   public static void Method1729(int integer) {
      Field3470 = integer;
   }

   public static int Method1730() {
      return Field3470;
   }

   public static int Method1731() {
      int var0 = Method1730();
      return 7;
   }

   private static IllegalArgumentException Method1732(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }

   static {
      Method1729(0);
   }
}
