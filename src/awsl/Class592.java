package awsl;

public class Class592 {
   protected float[] Field2783;
   protected float[] Field2784;
   protected float[] Field2785;

   public Class592(int a) {
      this.Field2783 = new float[a];
      this.Field2784 = new float[a];
      this.Field2785 = new float[a];
      int a = 1;

      for(int a = 0; a < a; ++a) {
         a <<= 1;
         double a = -6.283185307179586 / (double)a;
         this.Field2783[a] = (float)Math.sin(0.5 * a);
         this.Field2784[a] = -2.0F * this.Field2783[a] * this.Field2783[a];
         this.Field2785[a] = (float)Math.sin(a);
      }

   }

   private void Method51(int a, float[] a, float[] a) {
      int a = 0;

      for(int a = 0; a < a; ++a) {
         if (a > a) {
            float a = a[a];
            a[a] = a[a];
            a[a] = a;
            a = a[a];
            a[a] = a[a];
            a[a] = a;
         }

         int a;
         for(a = a >> 1; a >= a && a >= 2; a >>= 1) {
            a -= a;
         }

         a += a;
      }

   }

   private void Method52(int a, int a, int a, float[] a, float[] a) {
      Class598.Method86();
      int a = 1;
      int a = 0;
      if (a < a) {
         int a = (byte)a;
         a <<= 1;
         float a = (float)a * this.Field2783[a];
         float a = this.Field2784[a];
         float a = (float)a * this.Field2785[a];
         float a = 1.0F;
         float a = 0.0F;
         int a = 0;
         if (a < a) {
            if (a < a) {
               int a = a + a;
               float a = a[a];
               float a = a[a];
               float a = a * a - a * a;
               float a = a * a + a * a;
               a[a] = a[a] - a;
               a[a] += a;
               a[a] = a[a] - a;
               a[a] += a;
               int a = a + a;
            }

            a = a;
            a += a * a - a * a;
            a += a * a + a * a;
            ++a;
         }

         ++a;
      }

      if (a == -1) {
         float a = 1.0F / (float)a;
         int a = 0;
         if (a < a) {
            a[a] *= a;
            a[a] *= a;
            ++a;
         }
      }

   }

   public void Method53(float[] a, float[] a, int a, int a, boolean a4) {
      this.Method51(a, a, a);
      this.Method52(a, a, 1, a, a);
   }

   public void Method54(float[] a, float[] a, int a, int a, boolean a) {
      int a = this.Method55(a);
      int a = this.Method55(a);
      int a = Math.max(a, a);
      float[] a = new float[a];
      float[] a = new float[a];

      int a;
      int a;
      for(a = 0; a < a; ++a) {
         a = a * a;
         System.arraycopy(a, a, a, 0, a);
         System.arraycopy(a, a, a, 0, a);
         this.Method53(a, a, a, a, a);
         System.arraycopy(a, 0, a, a, a);
         System.arraycopy(a, 0, a, a, a);
      }

      for(a = 0; a < a; ++a) {
         a = a;

         int a;
         for(a = 0; a < a; ++a) {
            a[a] = a[a];
            a[a] = a[a];
            a += a;
         }

         this.Method53(a, a, a, a, a);
         a = a;

         for(a = 0; a < a; ++a) {
            a[a] = a[a];
            a[a] = a[a];
            a += a;
         }
      }

   }

   private int Method55(int a) {
      int a = 1;

      int a;
      for(a = 0; a < a; ++a) {
         a *= 2;
      }

      return a == a ? a : -1;
   }
}
