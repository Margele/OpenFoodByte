package awsl;

import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

public class Class761 extends Class798 {
   private Random Field3333 = new Random();
   private long Field3334 = 567L;
   private int Field3335 = 25000;
   private float Field3336 = -0.59F;
   private float Field3337 = 0.2F;
   private float Field3338 = 0.1F;
   private float Field3339 = 0.0F;
   private int Field3340 = 0;
   private Class755 Field3341 = new Class771();

   public void Method89() {
      this.Field3334 = (new Date()).getTime();
      this.Field3333.setSeed(this.Field3334);
      this.Field3336 = this.Field3333.nextFloat();
      this.Field3337 = this.Field3333.nextFloat();
      this.Field3338 = this.Field3333.nextFloat();
      this.Field3339 = this.Field3333.nextFloat();
      this.Field3340 = this.Field3333.nextInt() % 20 - 10;
   }

   public void Method9(int a) {
      this.Field3335 = a;
   }

   public int Method10() {
      return this.Field3335;
   }

   public void Method56(float a) {
      this.Field3336 = a;
   }

   public float Method57() {
      return this.Field3336;
   }

   public void Method58(float a) {
      this.Field3337 = a;
   }

   public float Method59() {
      return this.Field3337;
   }

   public void Method60(float a) {
      this.Field3338 = a;
   }

   public float Method61() {
      return this.Field3338;
   }

   public void Method164(float a) {
      this.Field3339 = a;
   }

   public float Method165() {
      return this.Field3339;
   }

   public void Method11(int a) {
      this.Field3340 = a;
   }

   public int Method12() {
      return this.Field3340;
   }

   public void Method176(Class755 a) {
      this.Field3341 = a;
   }

   public Class755 Method177() {
      return this.Field3341;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a) {
      int[] var6 = new int[a * a];
      boolean var7 = false;
      Class193.Method1269();
      int var8 = 0;
      float var9 = 0.1F;
      float var10 = 0.3F;
      int var11 = 0;
      float var12;
      float var13;
      float var14;
      float var15;
      if (var11 < 20) {
         var12 = 3.1415927F * var9;
         var13 = 3.1415927F * var10;
         var14 = (float)Math.sin((double)(2.0F * var12));
         var15 = (float)Math.sin((double)(2.0F * var13));
         float var16 = (float)((double)(this.Field3336 * var14) + (double)(this.Field3337 * var14) * Math.cos((double)(2.0F * var13)) + (double)this.Field3338 * Math.sin((double)(4.0F * var12)) + (double)this.Field3339 * Math.sin((double)(6.0F * var12)) * Math.cos((double)(4.0F * var13)) + (double)((float)this.Field3340 * var9));
         var16 = var16 >= 0.0F ? var16 - (float)((int)var16) : var16 - (float)((int)var16) + 1.0F;
         float var17 = (float)((double)(this.Field3336 * var15) + (double)(this.Field3337 * var15) * Math.cos((double)(2.0F * var12)) + (double)this.Field3338 * Math.sin((double)(4.0F * var13)) + (double)this.Field3339 * Math.sin((double)(6.0F * var13)) * Math.cos((double)(4.0F * var12)) + (double)((float)this.Field3340 * var10));
         var17 = var17 >= 0.0F ? var17 - (float)((int)var17) : var17 - (float)((int)var17) + 1.0F;
         var9 = var16;
         var10 = var17;
         ++var11;
      }

      byte var19 = 0;
      if (var19 < this.Field3335) {
         var12 = 3.1415927F * var9;
         var13 = 3.1415927F * var10;
         var14 = (float)((double)this.Field3336 * Math.sin((double)(2.0F * var12)) + (double)this.Field3337 * Math.sin((double)(2.0F * var12)) * Math.cos((double)(2.0F * var13)) + (double)this.Field3338 * Math.sin((double)(4.0F * var12)) + (double)this.Field3339 * Math.sin((double)(6.0F * var12)) * Math.cos((double)(4.0F * var13)) + (double)((float)this.Field3340 * var9));
         var14 = var14 >= 0.0F ? var14 - (float)((int)var14) : var14 - (float)((int)var14) + 1.0F;
         var15 = (float)((double)this.Field3336 * Math.sin((double)(2.0F * var13)) + (double)this.Field3337 * Math.sin((double)(2.0F * var13)) * Math.cos((double)(2.0F * var12)) + (double)this.Field3338 * Math.sin((double)(4.0F * var13)) + (double)this.Field3339 * Math.sin((double)(6.0F * var13)) * Math.cos((double)(4.0F * var12)) + (double)((float)this.Field3340 * var10));
         var15 = var15 >= 0.0F ? var15 - (float)((int)var15) : var15 - (float)((int)var15) + 1.0F;
         int var20 = (int)((float)a * var14);
         int var21 = (int)((float)a * var15);
         if (var20 < a && var21 < a) {
            int var10001 = a * var21 + var20;
            int var10003 = var6[a * var21 + var20];
            var6[var10001] = var6[a * var21 + var20] + 1;
            int var18 = var10003;
            if (var18 > var8) {
               var8 = var18;
            }
         }

         var11 = var19 + 1;
      }

      if (this.Field3341 != null) {
         var19 = 0;
         var10 = 0.0F;
         if (var10 < (float)a) {
            var9 = 0.0F;
            if (var9 < (float)a) {
               var6[var19] = this.Field3341.Method283((float)var6[var19] / (float)var8);
               var11 = var19 + 1;
               ++var9;
            }

            ++var10;
         }
      }

      return var6;
   }

   public String toString() {
      return "Texture/Chaotic Quilt...";
   }
}
