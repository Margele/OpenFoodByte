package awsl;

import java.util.Random;

public class Class16 extends Class119 {
   public static final int Field217 = 0;
   public static final int Field218 = 1;
   private int Field219 = 25;
   private int Field220 = 1;
   private boolean Field221 = false;
   private float Field222 = 1.0F;
   private Random Field223 = new Random();

   public void Method9(int a) {
      this.Field219 = a;
   }

   public int Method10() {
      return this.Field219;
   }

   public void Method11(int a) {
      this.Field220 = a;
   }

   public int Method12() {
      return this.Field220;
   }

   public void Method87(boolean a) {
      this.Field221 = a;
   }

   public boolean Method88() {
      return this.Field221;
   }

   public void Method56(float a) {
      this.Field222 = a;
   }

   public float Method57() {
      return this.Field222;
   }

   private int Method1612(int a) {
      boolean var2 = Class193.Method1270();
      a += (int)((this.Field220 == 0 ? this.Field223.nextGaussian() : (double)(2.0F * this.Field223.nextFloat() - 1.0F)) * (double)this.Field219);
      short var3 = 0;
      if (var3 > 255) {
         var3 = 255;
      }

      return var3;
   }

   public int Method3(int a, int a, int a) {
      boolean var4 = Class193.Method1270();
      if (this.Field223.nextFloat() <= this.Field222) {
         int var5 = a & -16777216;
         int var6 = a >> 16 & 255;
         int var7 = a >> 8 & 255;
         int var8 = a & 255;
         if (this.Field221) {
            int var9 = (int)((this.Field220 == 0 ? this.Field223.nextGaussian() : (double)(2.0F * this.Field223.nextFloat() - 1.0F)) * (double)this.Field219);
            var6 = Class767.Method1687(var6 + var9);
            var7 = Class767.Method1687(var7 + var9);
            var8 = Class767.Method1687(var8 + var9);
         }

         var6 = this.Method1612(var6);
         var7 = this.Method1612(var7);
         var8 = this.Method1612(var8);
         return var5 | var6 << 16 | var7 << 8 | var8;
      } else {
         return a;
      }
   }

   public String toString() {
      return "Stylize/Add Noise...";
   }
}
