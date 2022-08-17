package awsl;

import java.awt.Rectangle;

public class Class861 extends Class798 {
   public static final float Field3758 = (float)Math.sqrt(2.0);
   public static final float[] Field3759 = new float[]{0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   public static final float[] Field3760 = new float[]{-1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   public static final float[] Field3761 = new float[]{-1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F};
   public static final float[] Field3762 = new float[]{-1.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F};
   public static final float[] Field3763 = new float[]{-1.0F, 0.0F, 1.0F, -2.0F, 0.0F, 2.0F, -1.0F, 0.0F, 1.0F};
   public static float[] Field3764 = new float[]{-1.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F};
   public static final float[] Field3765;
   public static float[] Field3766;
   protected float[] Field3767;
   protected float[] Field3768;

   public Class861() {
      this.Field3767 = Field3763;
      this.Field3768 = Field3764;
   }

   public void Method160(float[] a) {
      this.Field3767 = a;
   }

   public float[] Method3535() {
      return this.Field3767;
   }

   public void Method161(float[] a) {
      this.Field3768 = a;
   }

   public float[] Method3536() {
      return this.Field3768;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      Class193.Method1269();
      int a = 0;
      int[] a = new int[a * a];
      int a = 0;
      if (a < a) {
         int a = 0;
         if (a < a) {
            int a = false;
            int a = false;
            int a = false;
            int a = 0;
            int a = 0;
            int a = 0;
            int a = 0;
            int a = 0;
            int a = 0;
            int a = a[a * a + a] & -16777216;
            int a = -1;
            int a;
            int a;
            int a;
            if (a <= 1) {
               int a = a + a;
               if (0 <= a && a < a) {
                  int var10000 = a * a;
               }

               int a = a * a;
               int a = 3 * (a + 1) + 1;
               int a = -1;
               if (a <= 1) {
                  int a = a + a;
                  if (0 > a || a >= a) {
                     a = a;
                  }

                  int a = a[a + a];
                  float a = this.Field3768[a + a];
                  float a = this.Field3767[a + a];
                  a = (a & 16711680) >> 16;
                  a = (a & '\uff00') >> 8;
                  a = a & 255;
                  a += (int)(a * (float)a);
                  a += (int)(a * (float)a);
                  a += (int)(a * (float)a);
                  a += (int)(a * (float)a);
                  a += (int)(a * (float)a);
                  a += (int)(a * (float)a);
                  ++a;
               }

               ++a;
            }

            a = (int)(Math.sqrt((double)(a * a + a * a)) / 1.8);
            a = (int)(Math.sqrt((double)(a * a + a * a)) / 1.8);
            a = (int)(Math.sqrt((double)(a * a + a * a)) / 1.8);
            a = Class767.Method1687(a);
            a = Class767.Method1687(a);
            a = Class767.Method1687(a);
            a[a++] = a | a << 16 | a << 8 | a;
            ++a;
         }

         ++a;
      }

      return a;
   }

   public String toString() {
      return "Edges/Detect Edges";
   }

   static {
      Field3765 = new float[]{-1.0F, 0.0F, 1.0F, -Field3758, 0.0F, Field3758, -1.0F, 0.0F, 1.0F};
      Field3766 = new float[]{-1.0F, -Field3758, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, Field3758, 1.0F};
   }
}
