package awsl;

import java.util.Random;

public class Class1 extends Class119 {
   private int Field6 = 50;
   private int Field7 = 25;
   private int Field8 = 50;
   private int Field9 = -1;
   private int Field10 = 25;
   private int Field11;
   private int Field12;
   private int Field13;
   private int Field14;
   private long Field15 = 371L;
   private float[] Field16;
   private Random Field17 = new Random();

   public void Method9(int a) {
      this.Field9 = a;
   }

   public int Method10() {
      return this.Field9;
   }

   public void Method11(int a) {
      this.Field10 = a;
   }

   public int Method12() {
      return this.Field10;
   }

   public void Method13(int a) {
      this.Field8 = a;
   }

   public int Method14() {
      return this.Field8;
   }

   public void Method15(int a) {
      this.Field6 = a;
   }

   public int Method16() {
      return this.Field6;
   }

   public void Method498(int a) {
      this.Field7 = a;
   }

   public int Method499() {
      return this.Field7;
   }

   public void Method17(int a, int a) {
      Class193.Method1270();
      this.Field11 = a;
      this.Field12 = a;
      this.Field13 = a / 2;
      this.Field14 = a / 2;
      super.Method17(a, a);
      this.Field17.setSeed(this.Field15);
      this.Field16 = new float[this.Field6];
      int var4 = 0;
      if (var4 < this.Field6) {
         this.Field16[var4] = (float)this.Field7 + (float)this.Field10 / 100.0F * (float)this.Field7 * (float)this.Field17.nextGaussian();
         ++var4;
      }

   }

   public int Method3(int a, int a, int a) {
      float var4 = (float)(a - this.Field13);
      float var5 = (float)(a - this.Field14);
      float var6 = var4 * var4 + var5 * var5;
      float var7 = (float)Math.atan2((double)var5, (double)var4);
      float var8 = (var7 + 3.1415927F) / 6.2831855F * (float)this.Field6;
      int var9 = (int)var8;
      float var10 = var8 - (float)var9;
      if (this.Field7 != 0) {
         float var11 = Class776.Method1717(var10, this.Field16[var9 % this.Field6], this.Field16[(var9 + 1) % this.Field6]);
         float var12 = var11 * var11 / (var6 + 1.0E-4F);
         var12 = (float)Math.pow((double)var12, (double)(100 - this.Field8) / 50.0);
         var10 -= 0.5F;
         var10 = 1.0F - var10 * var10;
         var10 *= var12;
      }

      var10 = Class776.Method1711(var10, 0.0F, 1.0F);
      return Class776.Method1719(var10, a, this.Field9);
   }

   public String toString() {
      return "Stylize/Sparkle...";
   }
}
