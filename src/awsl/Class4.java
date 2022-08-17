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

   public int Method3(int a, int a1, int a) {
      if (this.Field100 != 1.0F) {
         int a = a & -16777216;
         int a = a >> 16 & 255;
         int a = a >> 8 & 255;
         int a = a & 255;
         int a = (a + a + a) / 3;
         a = Class767.Method1687((int)((float)a + this.Field100 * (float)(a - a)));
         a = Class767.Method1687((int)((float)a + this.Field100 * (float)(a - a)));
         a = Class767.Method1687((int)((float)a + this.Field100 * (float)(a - a)));
         return a | a << 16 | a << 8 | a;
      } else {
         return a;
      }
   }

   public String toString() {
      return "Colors/Saturation...";
   }
}
