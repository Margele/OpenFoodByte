package awsl;

import java.awt.Rectangle;

public class Class855 extends Class798 {
   private short Method3529(short a, short a, short a) {
      if (a < a) {
         ++a;
      }

      if (a < a) {
         ++a;
      }

      if (a > a) {
         --a;
      }

      if (a > a) {
         --a;
      }

      return a;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1269();
      int var6 = 0;
      short[][] var7 = new short[3][a];
      short[][] var8 = new short[3][a];
      short[][] var9 = new short[3][a];
      int[] var10 = new int[a * a];
      int var11 = 0;
      if (var11 < a) {
         int var12 = a[var11];
         var7[1][var11] = (short)(var12 >> 16 & 255);
         var8[1][var11] = (short)(var12 >> 8 & 255);
         var9[1][var11] = (short)(var12 & 255);
         ++var11;
      }

      byte var21 = 0;
      if (var21 < a) {
         boolean var22 = var21 < a - 1;
         int var13 = var6 + a;
         int var14;
         if (var21 < a - 1) {
            var14 = 0;
            if (var14 < a) {
               int var15 = a[var13++];
               var7[2][var14] = (short)(var15 >> 16 & 255);
               var8[2][var14] = (short)(var15 >> 8 & 255);
               var9[2][var14] = (short)(var15 & 255);
               ++var14;
            }
         }

         byte var23 = 0;
         if (var23 < a) {
            boolean var24 = var23 < a - 1;
            short var16 = var7[1][var23];
            short var17 = var8[1][var23];
            short var18 = var9[1][var23];
            int var19 = var23 - 1;
            int var20 = var23 + 1;
            var16 = this.Method3529(var16, var7[0][var23], var7[2][var23]);
            var17 = this.Method3529(var17, var8[0][var23], var8[2][var23]);
            var18 = this.Method3529(var18, var9[0][var23], var9[2][var23]);
            var16 = this.Method3529(var16, var7[1][var19], var7[1][var20]);
            var17 = this.Method3529(var17, var8[1][var19], var8[1][var20]);
            var18 = this.Method3529(var18, var9[1][var19], var9[1][var20]);
            var16 = this.Method3529(var16, var7[0][var19], var7[2][var20]);
            var17 = this.Method3529(var17, var8[0][var19], var8[2][var20]);
            var18 = this.Method3529(var18, var9[0][var19], var9[2][var20]);
            var16 = this.Method3529(var16, var7[2][var19], var7[0][var20]);
            var17 = this.Method3529(var17, var8[2][var19], var8[0][var20]);
            var18 = this.Method3529(var18, var9[2][var19], var9[0][var20]);
            var10[var6] = a[var6] & -16777216 | var16 << 16 | var17 << 8 | var18;
            ++var6;
            var14 = var23 + 1;
         }

         short[] var25 = var7[0];
         var7[0] = var7[1];
         var7[1] = var7[2];
         var7[2] = var25;
         var25 = var8[0];
         var8[0] = var8[1];
         var8[1] = var8[2];
         var8[2] = var25;
         var25 = var9[0];
         var9[0] = var9[1];
         var9[1] = var9[2];
         var9[2] = var25;
         var11 = var21 + 1;
      }

      return var10;
   }

   public String toString() {
      return "Blur/Despeckle...";
   }
}
