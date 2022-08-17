package awsl;

import java.util.Random;

public class Class616 implements Class594 {
   public float Field2861 = 2.0F;
   public boolean Field2862 = false;
   public boolean Field2863 = false;
   private float[] Field2864 = new float[]{1.0F, 0.0F, 0.0F, 0.0F};
   private Random Field2865 = new Random();
   private Class617[] Field2866 = null;

   public Class616() {
      this.Field2866 = new Class617[2];

      for(int a = 0; a < this.Field2866.length; ++a) {
         this.Field2866[a] = new Class617(this);
      }

   }

   public void Method866(int a, float a) {
      this.Field2864[a] = a;
   }

   public float Method867(int a) {
      return this.Field2864[a];
   }

   private float Method3530(float a, float a, int a, int a, Class617[] a) {
      this.Field2865.setSeed((long)(571 * a + 23 * a));
      int var7 = 3 + this.Field2865.nextInt() % 4;
      Class598.Method86();
      int a = 4;
      int a = 0;
      if (a < a) {
         float a = this.Field2865.nextFloat();
         float a = this.Field2865.nextFloat();
         float a = Math.abs(a - a);
         float a = Math.abs(a - a);
         if (this.Field2861 == 1.0F) {
            float var10000 = a + a;
         }

         float a;
         if (this.Field2861 == 2.0F) {
            a = (float)Math.sqrt((double)(a * a + a * a));
         }

         a = (float)Math.pow(Math.pow((double)a, (double)this.Field2861) + Math.pow((double)a, (double)this.Field2861), (double)(1.0F / this.Field2861));
         int a = 0;
         if (a < a.length) {
            Class617 a;
            if ((double)a[a].Field2870 == Double.POSITIVE_INFINITY) {
               a = a[a];
               a.Field2870 = a;
               a.Field2868 = a;
               a.Field2869 = a;
               a[a] = a;
            }

            if (a < a[a].Field2870) {
               a = a[a.length - 1];
               int a = a.length - 1;
               if (a > a) {
                  a[a] = a[a - 1];
                  --a;
               }

               a.Field2870 = a;
               a.Field2868 = a;
               a.Field2869 = a;
               a[a] = a;
            }

            ++a;
         }

         ++a;
      }

      return a[1].Field2870;
   }

   public float Method20(float a, float a) {
      Class598.Method86();
      int a = 0;
      if (a < this.Field2866.length) {
         this.Field2866[a].Field2870 = Float.POSITIVE_INFINITY;
         ++a;
      }

      a = (int)a;
      int a = (int)a;
      float a = a - (float)a;
      float a = a - (float)a;
      float a = this.Method3530(a, a, a, a, this.Field2866);
      if (a > a) {
         a = this.Method3530(a, a + 1.0F, a, a - 1, this.Field2866);
      }

      if (a > 1.0F - a) {
         a = this.Method3530(a, a - 1.0F, a, a + 1, this.Field2866);
      }

      if (a > a) {
         this.Method3530(a + 1.0F, a, a - 1, a, this.Field2866);
         if (a > a) {
            a = this.Method3530(a + 1.0F, a + 1.0F, a - 1, a - 1, this.Field2866);
         }

         if (a > 1.0F - a) {
            a = this.Method3530(a + 1.0F, a - 1.0F, a - 1, a + 1, this.Field2866);
         }
      }

      if (a > 1.0F - a) {
         a = this.Method3530(a - 1.0F, a, a + 1, a, this.Field2866);
         if (a > a) {
            a = this.Method3530(a - 1.0F, a + 1.0F, a + 1, a - 1, this.Field2866);
         }

         if (a > 1.0F - a) {
            a = this.Method3530(a - 1.0F, a - 1.0F, a + 1, a + 1, this.Field2866);
         }
      }

      float a = 0.0F;
      int a = 0;
      if (a < 2) {
         a += this.Field2864[a] * this.Field2866[a].Field2870;
         ++a;
      }

      if (this.Field2863) {
         a = (float)((double)a + Math.atan2((double)(a - this.Field2866[0].Field2869), (double)(a - this.Field2866[0].Field2868)) / 6.283185307179586 + 0.5);
      }

      return a;
   }
}
