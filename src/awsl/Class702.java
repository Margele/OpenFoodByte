package awsl;

public class Class702 {
   public float[] Field3028 = null;
   public float[] Field3029 = null;
   public int Field3030;
   public int Field3031;
   private static final float Field3032 = -0.5F;
   private static final float Field3033 = 1.5F;
   private static final float Field3034 = -1.5F;
   private static final float Field3035 = 0.5F;
   private static final float Field3036 = 1.0F;
   private static final float Field3037 = -2.5F;
   private static final float Field3038 = 2.0F;
   private static final float Field3039 = -0.5F;
   private static final float Field3040 = -0.5F;
   private static final float Field3041 = 0.5F;
   private static final float Field3042 = 1.0F;

   public Class702(int a, int a, int a, int a) {
      this.Field3030 = a;
      this.Field3031 = a;
      this.Field3028 = new float[a * a];
      this.Field3029 = new float[a * a];
      int a = 0;

      for(int a = 0; a < a; ++a) {
         for(int a = 0; a < a; ++a) {
            this.Field3028[a] = (float)a * (float)(a - 1) / (float)(a - 1);
            this.Field3029[a] = (float)a * (float)(a - 1) / (float)(a - 1);
            ++a;
         }
      }

   }

   public void Method1789(int a) {
      int a = (this.Field3030 + 1) * this.Field3031;
      float[] a = new float[a];
      float[] a = new float[a];
      ++this.Field3030;
      int a = 0;
      int a = 0;

      for(int a = 0; a < this.Field3030; ++a) {
         for(int a = 0; a < this.Field3031; ++a) {
            int a = a + a;
            int a = a + a;
            if (a == a) {
               a[a] = (this.Field3028[a] + this.Field3028[a]) / 2.0F;
               a[a] = (this.Field3029[a] + this.Field3029[a]) / 2.0F;
            } else {
               a[a] = this.Field3028[a];
               a[a] = this.Field3029[a];
            }
         }

         if (a != a - 1) {
            a += this.Field3031;
         }

         a += this.Field3031;
      }

      this.Field3028 = a;
      this.Field3029 = a;
   }

   public void Method1790(int a) {
      int a = this.Field3030 * (this.Field3031 + 1);
      float[] a = new float[a];
      float[] a = new float[a];
      ++this.Field3031;
      int a = 0;
      int a = 0;

      for(int a = 0; a < this.Field3030; ++a) {
         for(int a = 0; a < this.Field3031; ++a) {
            if (a == a) {
               a[a] = (this.Field3028[a] + this.Field3028[a - 1]) / 2.0F;
               a[a] = (this.Field3029[a] + this.Field3029[a - 1]) / 2.0F;
            } else {
               a[a] = this.Field3028[a];
               a[a] = this.Field3029[a];
               ++a;
            }

            ++a;
         }
      }

      this.Field3028 = a;
      this.Field3029 = a;
   }

   public void Method1791(int a) {
      int a = (this.Field3030 - 1) * this.Field3031;
      float[] a = new float[a];
      float[] a = new float[a];
      --this.Field3030;
      int a = 0;
      int a = 0;

      for(int a = 0; a < this.Field3030; ++a) {
         for(int a = 0; a < this.Field3031; ++a) {
            int a = a + a;
            int a = a + a;
            a[a] = this.Field3028[a];
            a[a] = this.Field3029[a];
         }

         if (a == a - 1) {
            a += this.Field3031;
         }

         a += this.Field3031;
         a += this.Field3031;
      }

      this.Field3028 = a;
      this.Field3029 = a;
   }

   public void Method1792(int a) {
      int a = this.Field3030 * (this.Field3031 + 1);
      float[] a = new float[a];
      float[] a = new float[a];
      --this.Field3031;

      for(int a = 0; a < this.Field3030; ++a) {
         int a = a * (this.Field3031 + 1);
         int a = a * this.Field3031;

         for(int a = 0; a < this.Field3031; ++a) {
            a[a] = this.Field3028[a];
            a[a] = this.Field3029[a];
            if (a == a - 1) {
               ++a;
            }

            ++a;
            ++a;
         }
      }

      this.Field3028 = a;
      this.Field3029 = a;
   }

   public void Method1793(float a, Class702 a, Class702 a) {
      if (this.Field3030 == a.Field3030 && this.Field3031 == a.Field3031) {
         if (this.Field3030 == a.Field3030 && this.Field3031 == a.Field3031) {
            int a = 0;

            for(int a = 0; a < this.Field3030; ++a) {
               for(int a = 0; a < this.Field3031; ++a) {
                  a.Field3028[a] = Class776.Method1717(a, this.Field3028[a], a.Field3028[a]);
                  a.Field3029[a] = Class776.Method1717(a, this.Field3029[a], a.Field3029[a]);
                  ++a;
               }
            }

         } else {
            throw new IllegalArgumentException("source and intermediate are different sizes");
         }
      } else {
         throw new IllegalArgumentException("source and destination are different sizes");
      }
   }

   public void Method1794(int[] a, int a, int a, Class702 a, Class702 a, int[] a) {
      int a = Class193.Method1269();

      try {
         if (a.Field3030 != a.Field3030 || a.Field3031 != a.Field3031) {
            throw new IllegalArgumentException("source and destination grids are different sizes");
         }

         int a = Math.max(a, a);
         float[] a = new float[a];
         float[] a = new float[a];
         float[] a = new float[a + 1];
         float[] a = new float[a + 1];
         int a = a.Field3031;
         int a = a.Field3030;
         Class702 a = new Class702(a, a, 1, 1);
         int a = 0;
         int a;
         int a;
         int a;
         if (a < a) {
            a = 0;
            if (a < a) {
               a[a] = a.Field3028[a];
               a[a] = a.Field3029[a];
               a = a + a;
               ++a;
            }

            this.Method1795(a, a, 0, a, a, 0, a);
            a = 0;
            if (a < a) {
               a.Field3028[a] = a[a];
               a = a + a;
               ++a;
            }

            ++a;
         }

         int a = 0;
         byte a;
         byte a;
         if (a < a) {
            a = 0;
            if (a < a) {
               a[a] = a.Field3028[a];
               a[a] = a.Field3029[a];
               a = a + a;
               a = a + 1;
            }

            this.Method1795(a, a, 0, a, a, 0, a);
            a = 0;
            if (a < a) {
               a.Field3029[a] = a[a];
               a = a + a;
               a = a + 1;
            }

            a = a + 1;
         }

         int[] a = new int[a * a];
         int a = 0;
         a = 0;
         int var10000;
         if (a < a) {
            this.Method1795(a.Field3028, a.Field3029, a, a, a, 0, a);
            a[a] = (float)a;
            Class776.Method1726(a, a, a, a * a, 1, a);
            var10000 = a + a;
            a = a + 1;
         }

         a = new Class702(a, a, 1, 1);
         a = 0;
         int a = 0;
         a = 0;
         if (a < a) {
            this.Method1795(a.Field3028, a.Field3029, a, a, a.Field3028, a, a);
            var10000 = a + a;
            var10000 = a + a;
            a = a + 1;
         }

         a = 0;
         a = 0;
         a = 0;
         if (a < a) {
            this.Method1795(a.Field3028, a.Field3029, a, a, a.Field3029, a, a);
            var10000 = a + a;
            var10000 = a + a;
            a = a + 1;
         }

         int a = 0;
         if (a < a) {
            a = 0;
            if (a < a) {
               a[a] = a.Field3028[a];
               a[a] = a.Field3029[a];
               int a = a + a;
               a = a + 1;
            }

            this.Method1795(a, a, 0, a, a, 0, a);
            a[a] = (float)a;
            Class776.Method1726(a, a, a, a, a, a);
            ++a;
         }
      } catch (Exception var24) {
         var24.printStackTrace();
      }

   }

   protected void Method1795(float[] a, float[] a, int a, int a, float[] a, int a, int a) {
      int a = a;
      int a = a + a - 1;
      float a = a[a];
      float a;
      float a;
      float a = a = a = a[a];
      float a = a[a + 1];
      float a = a[a + 1];

      for(int a = 0; a < a; ++a) {
         if (a <= a && (float)a > a[a]) {
            a = a;
            a = a;
            a = a;
            a = a[a];
            ++a;
            if (a <= a) {
               a = a[a];
            }

            if (a < a) {
               a = a[a + 1];
            } else {
               a = a;
            }
         }

         float a = ((float)a - a) / (a - a);
         float a = -0.5F * a + 1.5F * a + -1.5F * a + 0.5F * a;
         float a = 1.0F * a + -2.5F * a + 2.0F * a + -0.5F * a;
         float a = -0.5F * a + 0.5F * a;
         float a = 1.0F * a;
         a[a + a] = ((a * a + a) * a + a) * a + a;
      }

   }

   protected void Method1796(float[] a, float[] a, int a, float[] a, int a, int a) {
      int a = a;
      float a = a[a];
      float a = a[a];
      float a = a[a + 1];
      float a = a[a + 1];

      for(int a = 0; a < a; ++a) {
         if ((float)a > a[a]) {
            a = a[a];
            a = a[a];
            ++a;
            a = a[a];
            a = a[a];
         }

         float a = ((float)a - a) / (a - a);
         a[a + a] = a + a * (a - a);
      }

   }

   private static Exception Method1797(Exception exception) {
      return exception;
   }
}
