package awsl;

public class Class744 {
   public float[] Field3256;
   public float[] Field3257;

   public Class744() {
      this.Field3256 = new float[]{0.0F, 1.0F};
      this.Field3257 = new float[]{0.0F, 1.0F};
   }

   public Class744(Class744 a) {
      this.Field3256 = (float[])((float[])a.Field3256.clone());
      this.Field3257 = (float[])((float[])a.Field3257.clone());
   }

   public int Method1672(float a, float a) {
      int var4 = -1;
      int var5 = this.Field3256.length;
      float[] var6 = new float[var5 + 1];
      Class193.Method1270();
      float[] var7 = new float[var5 + 1];
      int var8 = 0;
      int var9 = 0;
      if (var9 < var5) {
         if (var4 == -1 && this.Field3256[var9] > a) {
            var4 = var8;
            var6[var8] = a;
            var7[var8] = a;
            ++var8;
         }

         var6[var8] = this.Field3256[var9];
         var7[var8] = this.Field3257[var9];
         ++var8;
         ++var9;
      }

      if (var4 == -1) {
         var4 = var8;
         var6[var8] = a;
         var7[var8] = a;
      }

      this.Field3256 = var6;
      this.Field3257 = var7;
      return var4;
   }

   public void Method1673(int a) {
      int var2 = this.Field3256.length;
      if (var2 > 2) {
         float[] var3 = new float[var2 - 1];
         float[] var4 = new float[var2 - 1];
         int var5 = 0;

         for(int var6 = 0; var6 < var2 - 1; ++var6) {
            if (var6 == a) {
               ++var5;
            }

            var3[var6] = this.Field3256[var5];
            var4[var6] = this.Field3257[var5];
            ++var5;
         }

         this.Field3256 = var3;
         this.Field3257 = var4;
      }
   }

   private void Method1674() {
      Class193.Method1270();
      int var2 = this.Field3256.length;
      int var3 = 1;
      if (var3 < var2 - 1) {
         int var4 = 1;
         if (var4 < var3) {
            if (this.Field3256[var3] < this.Field3256[var4]) {
               float var5 = this.Field3256[var3];
               this.Field3256[var3] = this.Field3256[var4];
               this.Field3256[var4] = var5;
               var5 = this.Field3257[var3];
               this.Field3257[var3] = this.Field3257[var4];
               this.Field3257[var4] = var5;
            }

            ++var4;
         }

         ++var3;
      }

   }

   protected int[] Method1675() {
      int var2 = this.Field3256.length;
      float[] var3 = new float[var2 + 2];
      Class193.Method1270();
      float[] var4 = new float[var2 + 2];
      System.arraycopy(this.Field3256, 0, var3, 1, var2);
      System.arraycopy(this.Field3257, 0, var4, 1, var2);
      var3[0] = var3[1];
      var4[0] = var4[1];
      var3[var2 + 1] = var3[var2];
      var4[var2 + 1] = var4[var2];
      int[] var5 = new int[256];
      int var6 = 0;
      if (var6 < 1024) {
         float var7 = (float)var6 / 1024.0F;
         int var8 = (int)(255.0F * Class776.Method1722(var7, var3.length, var3) + 0.5F);
         int var9 = (int)(255.0F * Class776.Method1722(var7, var3.length, var4) + 0.5F);
         var8 = Class776.Method1712(var8, 0, 255);
         var9 = Class776.Method1712(var9, 0, 255);
         var5[var8] = var9;
         ++var6;
      }

      return var5;
   }
}
