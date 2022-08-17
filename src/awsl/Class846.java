package awsl;

import java.awt.Rectangle;

public class Class846 extends Class798 {
   private static final float Field3734 = 255.9F;
   private float Field3735 = 2.3561945F;
   private float Field3736 = 0.5235988F;
   private boolean Field3737 = false;
   private float Field3738 = 3.0F;

   public void Method56(float a) {
      this.Field3735 = a;
   }

   public float Method57() {
      return this.Field3735;
   }

   public void Method58(float a) {
      this.Field3736 = a;
   }

   public float Method59() {
      return this.Field3736;
   }

   public void Method60(float a) {
      this.Field3738 = 3.0F * a;
   }

   public float Method61() {
      return this.Field3738 / 3.0F;
   }

   public void Method87(boolean a) {
      this.Field3737 = a;
   }

   public boolean Method88() {
      return this.Field3737;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int var6 = 0;
      int[] var7 = new int[a * a];
      Class193.Method1269();
      int[] var8 = new int[a * a];
      int var11 = 0;
      if (var11 < a.length) {
         var8[var11] = Class767.Method1689(a[var11]);
         ++var11;
      }

      int var14 = (int)(Math.cos((double)this.Field3735) * Math.cos((double)this.Field3736) * 255.89999389648438);
      int var15 = (int)(Math.sin((double)this.Field3735) * Math.cos((double)this.Field3736) * 255.89999389648438);
      int var16 = (int)(Math.sin((double)this.Field3736) * 255.89999389648438);
      int var13 = (int)(1530.0F / this.Field3738);
      int var17 = var13 * var13;
      int var18 = var13 * var16;
      byte var22 = 0;
      int var23 = 0;
      if (var23 < a) {
         int var25 = var22 + a;
         int var26 = var25 + a;
         int var27 = 0;
         if (var27 < a) {
            if (var23 < a - 2 && var27 < a - 2) {
               var11 = var8[var22 - 1] + var8[var25 - 1] + var8[var26 - 1] - var8[var22 + 1] - var8[var25 + 1] - var8[var26 + 1];
               int var12 = var8[var26 - 1] + var8[var26] + var8[var26 + 1] - var8[var22 - 1] - var8[var22] - var8[var22 + 1];
               int var19;
               if ((var19 = var11 * var14 + var12 * var15 + var18) < 0) {
                  boolean var20 = false;
               }

               int var33 = (int)((double)var19 / Math.sqrt((double)(var11 * var11 + var12 * var12 + var17)));
            }

            if (this.Field3737) {
               int var28 = a[var6];
               int var29 = var28 & -16777216;
               int var30 = var28 >> 16 & 255;
               int var31 = var28 >> 8 & 255;
               int var32 = var28 & 255;
               var30 = var30 * var16 >> 8;
               var31 = var31 * var16 >> 8;
               var32 = var32 * var16 >> 8;
               var7[var6++] = var29 | var30 << 16 | var31 << 8 | var32;
            }

            var7[var6++] = -16777216 | var16 << 16 | var16 << 8 | var16;
            ++var27;
            int var24 = var22 + 1;
            ++var25;
            ++var26;
         }

         ++var23;
         int var10000 = var22 + a;
      }

      return var7;
   }

   public String toString() {
      return "Stylize/Emboss...";
   }
}
