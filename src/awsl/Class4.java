package awsl;

public class Class4 extends Class119 {
   public float Field100 = 1.0F;

   public Class4() {
   }

   public Class4(float a) {
      this.Field100 = a;
      this.Field950 = true;
   }

   public void Method56(float a) {
      this.Field100 = a;
   }

   public float Method57() {
      return this.Field100;
   }

   public int Method3(int a, int a, int a) {
      if (this.Field100 != 1.0F) {
         int var4 = a & -16777216;
         int var5 = a >> 16 & 255;
         int var6 = a >> 8 & 255;
         int var7 = a & 255;
         int var8 = (var5 + var6 + var7) / 3;
         var5 = Class767.Method1687((int)((float)var8 + this.Field100 * (float)(var5 - var8)));
         var6 = Class767.Method1687((int)((float)var8 + this.Field100 * (float)(var6 - var8)));
         var7 = Class767.Method1687((int)((float)var8 + this.Field100 * (float)(var7 - var8)));
         return var4 | var5 << 16 | var6 << 8 | var7;
      } else {
         return a;
      }
   }

   public String toString() {
      return "Colors/Saturation...";
   }
}
