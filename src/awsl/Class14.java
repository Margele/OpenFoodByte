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
      int[] var2 = new int[256];
      int var3 = 0;
      if (var3 < 256) {
         var2[var3] = this.Method3(0, 0, var3 << 24 | var3 << 16 | var3 << 8 | var3);
         ++var3;
      }

      return var2;
   }

   public int Method3(int a, int a, int a) {
      int var4 = a & -16777216;
      int var5 = a >> 16 & 255;
      int var6 = a >> 8 & 255;
      int var7 = a & 255;
      var5 = Class767.Method1687((int)((float)var5 * this.Field191));
      var6 = Class767.Method1687((int)((float)var6 * this.Field192));
      var7 = Class767.Method1687((int)((float)var7 * this.Field193));
      return var4 | var5 << 16 | var6 << 8 | var7;
   }

   public String toString() {
      return "Colors/Adjust RGB...";
   }
}
