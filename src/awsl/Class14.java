package awsl;

public class Class14 extends Class119 {
   public float Field191;
   public float Field192;
   public float Field193;

   public Class14() {
      this(0.0F, 0.0F, 0.0F);
   }

   public Class14(float a, float a, float a) {
      this.Field191 = 1.0F + a;
      this.Field192 = 1.0F + a;
      this.Field193 = 1.0F + a;
      this.Field950 = true;
   }

   public void Method56(float a) {
      this.Field191 = 1.0F + a;
   }

   public float Method57() {
      return this.Field191 - 1.0F;
   }

   public void Method58(float a) {
      this.Field192 = 1.0F + a;
   }

   public float Method59() {
      return this.Field192 - 1.0F;
   }

   public void Method60(float a) {
      this.Field193 = 1.0F + a;
   }

   public float Method61() {
      return this.Field193 - 1.0F;
   }

   public int[] Method86() {
      Class193.Method1269();
      int[] a = new int[256];
      int a = 0;
      if (a < 256) {
         a[a] = this.Method3(0, 0, a << 24 | a << 16 | a << 8 | a);
         ++a;
      }

      return a;
   }

   public int Method3(int a, int a1, int a) {
      int a = a & -16777216;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      a = Class767.Method1687((int)((float)a * this.Field191));
      a = Class767.Method1687((int)((float)a * this.Field192));
      a = Class767.Method1687((int)((float)a * this.Field193));
      return a | a << 16 | a << 8 | a;
   }

   public String toString() {
      return "Colors/Adjust RGB...";
   }
}
