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

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1269();
      int var6 = 0;
      int[] var7 = new int[a * a];
      int var8 = 0;
      if (var8 < a) {
         int var9 = 0;
         if (var9 < a) {
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int var19 = a[var8 * a + var9] & -16777216;
            int var20 = -1;
            int var29;
            int var30;
            int var31;
            if (var20 <= 1) {
               int var21 = var8 + var20;
               if (0 <= var21 && var21 < a) {
                  int var10000 = var21 * a;
               }

               int var22 = var8 * a;
               int var23 = 3 * (var20 + 1) + 1;
               int var24 = -1;
               if (var24 <= 1) {
                  int var25 = var9 + var24;
                  if (0 > var25 || var25 >= a) {
                     var25 = var9;
                  }

                  int var26 = a[var22 + var25];
                  float var27 = this.Field3768[var23 + var24];
                  float var28 = this.Field3767[var23 + var24];
                  var29 = (var26 & 16711680) >> 16;
                  var30 = (var26 & '\uff00') >> 8;
                  var31 = var26 & 255;
                  var13 += (int)(var27 * (float)var29);
                  var14 += (int)(var27 * (float)var30);
                  var15 += (int)(var27 * (float)var31);
                  var16 += (int)(var28 * (float)var29);
                  var17 += (int)(var28 * (float)var30);
                  var18 += (int)(var28 * (float)var31);
                  ++var24;
               }

               ++var20;
            }

            var29 = (int)(Math.sqrt((double)(var13 * var13 + var16 * var16)) / 1.8);
            var30 = (int)(Math.sqrt((double)(var14 * var14 + var17 * var17)) / 1.8);
            var31 = (int)(Math.sqrt((double)(var15 * var15 + var18 * var18)) / 1.8);
            var29 = Class767.Method1687(var29);
            var30 = Class767.Method1687(var30);
            var31 = Class767.Method1687(var31);
            var7[var6++] = var19 | var29 << 16 | var30 << 8 | var31;
            ++var9;
         }

         ++var8;
      }

      return var7;
   }

   public String toString() {
      return "Edges/Detect Edges";
   }

   static {
      Field3765 = new float[]{-1.0F, 0.0F, 1.0F, -Field3758, 0.0F, Field3758, -1.0F, 0.0F, 1.0F};
      Field3766 = new float[]{-1.0F, -Field3758, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, Field3758, 1.0F};
   }
}
