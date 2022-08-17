package awsl;

import java.awt.Rectangle;

public class Class858 extends Class798 {
   private float Field3752 = 5.0F;
   private float Field3753 = 1.0F;
   private float Field3754 = 0.0F;
   private int Field3755 = -16777216;

   public void Method56(float a) {
      this.Field3752 = a;
   }

   public float Method57() {
      return this.Field3752;
   }

   public void Method58(float a) {
      this.Field3753 = a;
   }

   public float Method59() {
      return this.Field3753;
   }

   public void Method60(float a) {
      this.Field3754 = a;
   }

   public float Method61() {
      return this.Field3754;
   }

   public void Method9(int a) {
      this.Field3755 = a;
   }

   public int Method10() {
      return this.Field3755;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1270();
      int var6 = 0;
      short[][] var7 = new short[3][a];
      int[] var8 = new int[a * a];
      short[] var9 = new short[256];
      int var10 = (int)(this.Field3754 * 256.0F / this.Field3752);
      int var11 = 0;
      if (var11 < 256) {
         var9[var11] = (short)Class767.Method1687((int)(255.0 * Math.floor((double)(this.Field3752 * (float)(var11 + var10) / 256.0F)) / (double)(this.Field3752 - 1.0F) - (double)var10));
         ++var11;
      }

      byte var27 = 0;
      if (var27 < a) {
         int var12 = a[var27];
         var7[1][var27] = (short)Class767.Method1689(var12);
         var11 = var27 + 1;
      }

      var27 = 0;
      if (var27 < a) {
         boolean var28 = var27 < a - 1;
         int var13 = var6 + a;
         int var14;
         if (var27 < a - 1) {
            var14 = 0;
            if (var14 < a) {
               int var15 = a[var13++];
               var7[2][var14] = (short)Class767.Method1689(var15);
               ++var14;
            }
         }

         byte var29 = 0;
         if (var29 < a) {
            boolean var30 = var29 < a - 1;
            int var16 = var29 - 1;
            int var17 = var29 + 1;
            int var18 = 0;
            short var19 = var7[0][var16];
            short var20 = var7[0][var29];
            short var21 = var7[1][var16];
            short var22 = var7[1][var29];
            short var23 = var9[var19];
            short var24 = var9[var20];
            short var25 = var9[var21];
            short var26 = var9[var22];
            if (var23 != var24 || var23 != var25 || var24 != var26 || var25 != var26) {
               var18 = (int)(this.Field3753 * (float)(Math.abs(var19 - var20) + Math.abs(var19 - var21) + Math.abs(var20 - var22) + Math.abs(var21 - var22)));
               if (var18 > 255) {
                  var18 = 255;
               }
            }

            var8[var6] = Class767.Method1693(a[var6], this.Field3755, 1, var18);
            var8[var6] = a[var6];
            ++var6;
            var14 = var29 + 1;
         }

         short[] var31 = var7[0];
         var7[0] = var7[1];
         var7[1] = var7[2];
         var7[2] = var31;
         var11 = var27 + 1;
      }

      return var8;
   }

   public String toString() {
      return "Stylize/Contour...";
   }
}
