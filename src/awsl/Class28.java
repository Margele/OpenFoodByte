package awsl;

public class Class28 extends Class119 {
   private float Field239 = 32.0F;
   private float Field240 = 1.0F;
   private float Field241 = 0.0F;
   private float Field242 = 1.0F;
   private float Field243 = 0.5F;
   private Class755 Field244;
   private float Field245 = 1.0F;
   private float Field246 = 0.0F;
   private float Field247 = 0.0F;
   private float Field248 = 1.0F;

   public void Method56(float a) {
      this.Field239 = a;
   }

   public float Method57() {
      return this.Field239;
   }

   public void Method58(float a) {
      this.Field240 = a;
   }

   public float Method59() {
      return this.Field240;
   }

   public void Method60(float a) {
      this.Field241 = a;
      float var2 = (float)Math.cos((double)a);
      float var3 = (float)Math.sin((double)a);
      this.Field245 = var2;
      this.Field246 = var3;
      this.Field247 = -var3;
      this.Field248 = var2;
   }

   public float Method61() {
      return this.Field241;
   }

   public void Method164(float a) {
      this.Field242 = a;
   }

   public float Method165() {
      return this.Field242;
   }

   public void Method166(float a) {
      this.Field243 = a;
   }

   public float Method167() {
      return this.Field243;
   }

   public void Method176(Class755 a) {
      this.Field244 = a;
   }

   public Class755 Method177() {
      return this.Field244;
   }

   public int Method3(int a, int a, int a) {
      float var4 = this.Field245 * (float)a + this.Field246 * (float)a;
      float var5 = this.Field247 * (float)a + this.Field248 * (float)a;
      var4 /= this.Field239 * this.Field240;
      var5 /= this.Field239;
      int var6 = a & -16777216;
      float var7;
      float var8;
      float var9;
      if (this.Field244 != null) {
         var7 = this.Field243 * Class598.Method153(var4, var5, this.Field242);
         var8 = 3.0F * this.Field243 * var7 + var5;
         var8 = (float)Math.sin((double)var8 * Math.PI);
         var9 = (float)Math.sin(40.0 * (double)var7);
         var8 = (float)((double)var8 + 0.2 * (double)var9);
         return this.Field244.Method283(var8);
      } else {
         float var10 = this.Field243 * Class598.Method153(var4, var5, this.Field242);
         float var17 = (float)Math.sin(Math.sin(8.0 * (double)var10 + (double)(7.0F * var4) + 3.0 * (double)var5));
         float var11;
         float var12 = var11 = Math.abs(var17);
         float var13 = (float)Math.sin(40.0 * (double)var10);
         var13 = Math.abs(var13);
         float var14 = 0.6F * var13 + 0.3F;
         float var15 = 0.2F * var13 + 0.8F;
         float var16 = 0.15F * var13 + 0.85F;
         var8 = 0.5F * (float)Math.pow((double)Math.abs(var11), 0.3);
         var11 = (float)Math.pow(0.5 * ((double)var11 + 1.0), 0.6) * var14;
         var12 = (float)Math.pow(0.5 * ((double)var12 + 1.0), 0.6) * var15;
         var7 = (0.5F * var11 + 0.35F * var12) * 2.0F * var8;
         var9 = (0.25F * var11 + 0.35F * var12) * 2.0F * var8;
         var8 *= Math.max(var11, var12) * var16;
         int var18 = a >> 16 & 255;
         int var19 = a >> 8 & 255;
         int var20 = a & 255;
         var18 = Class767.Method1687((int)((float)var18 * var7));
         var19 = Class767.Method1687((int)((float)var19 * var8));
         var20 = Class767.Method1687((int)((float)var20 * var9));
         return a & -16777216 | var18 << 16 | var19 << 8 | var20;
      }
   }

   public String toString() {
      return "Texture/Marble Texture...";
   }
}
