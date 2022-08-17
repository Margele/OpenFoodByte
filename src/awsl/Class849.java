package awsl;

import java.awt.Rectangle;

public class Class849 extends Class798 {
   private int[][] Field3741;
   private float Field3742 = 0.0F;
   private float Field3743 = 1.0F;
   private float Field3744 = 0.0F;
   private float Field3745 = 1.0F;

   public void Method56(float a) {
      this.Field3742 = a;
   }

   public float Method57() {
      return this.Field3742;
   }

   public void Method58(float a) {
      this.Field3743 = a;
   }

   public float Method59() {
      return this.Field3743;
   }

   public void Method60(float a) {
      this.Field3744 = a;
   }

   public float Method61() {
      return this.Field3744;
   }

   public void Method164(float a) {
      this.Field3745 = a;
   }

   public float Method165() {
      return this.Field3745;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      Class193.Method1269();
      Class745 var6 = new Class745(a, a, a, 0, a);
      int var7;
      if (var6.Method1545() > 0) {
         float var9 = 255.0F / (float)var6.Method1545();
         this.Field3741 = new int[3][256];
         float var10 = this.Field3742 * 255.0F;
         float var11 = this.Field3743 * 255.0F;
         if (var10 == var11) {
            ++var11;
         }

         var7 = 0;
         if (var7 < 3) {
            int var8 = 0;
            if (var8 < 256) {
               this.Field3741[var7][var8] = Class767.Method1687((int)(255.0F * (this.Field3744 + (this.Field3745 - this.Field3744) * ((float)var8 - var10) / (var11 - var10))));
               ++var8;
            }

            ++var7;
         }
      }

      this.Field3741 = (int[][])null;
      byte var12 = 0;
      int var13 = 0;
      if (var13 < a) {
         int var14 = 0;
         if (var14 < a) {
            a[var12] = this.Method3(var14, var13, a[var12]);
            var7 = var12 + 1;
            ++var14;
         }

         ++var13;
      }

      this.Field3741 = (int[][])null;
      return a;
   }

   public int Method3(int a, int a, int a) {
      if (this.Field3741 != null) {
         int var4 = a & -16777216;
         int var5 = this.Field3741[0][a >> 16 & 255];
         int var6 = this.Field3741[1][a >> 8 & 255];
         int var7 = this.Field3741[2][a & 255];
         return var4 | var5 << 16 | var6 << 8 | var7;
      } else {
         return a;
      }
   }

   public String toString() {
      return "Colors/Levels...";
   }
}
