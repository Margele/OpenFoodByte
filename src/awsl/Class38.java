package awsl;

public class Class38 extends Class119 {
   private float Field302 = 200.0F;
   private float Field303 = 10.0F;
   private float Field304 = 1.5707964F;
   private float Field305 = 0.5F;
   private float Field306 = 0.0F;
   private float Field307 = 0.5F;
   private float Field308 = 0.8F;
   private float Field309 = 1.0F;
   private float Field310 = 0.0F;
   private float Field311 = 0.0F;
   private float Field312 = 1.0F;
   private Class755 Field313 = new Class771(-1719148, -6784175);

   public void Method56(float a) {
      this.Field305 = a;
   }

   public float Method57() {
      return this.Field305;
   }

   public void Method58(float a) {
      this.Field302 = a;
   }

   public float Method59() {
      return this.Field302;
   }

   public void Method60(float a) {
      this.Field303 = a;
   }

   public float Method61() {
      return this.Field303;
   }

   public void Method164(float a) {
      this.Field304 = a;
      float var2 = (float)Math.cos((double)a);
      float var3 = (float)Math.sin((double)a);
      this.Field309 = var2;
      this.Field310 = var3;
      this.Field311 = -var3;
      this.Field312 = var2;
   }

   public float Method165() {
      return this.Field304;
   }

   public void Method166(float a) {
      this.Field306 = a;
   }

   public float Method167() {
      return this.Field306;
   }

   public void Method168(float a) {
      this.Field307 = a;
   }

   public float Method169() {
      return this.Field307;
   }

   public void Method170(float a) {
      this.Field308 = a;
   }

   public float Method171() {
      return this.Field308;
   }

   public void Method176(Class755 a) {
      this.Field313 = a;
   }

   public Class755 Method177() {
      return this.Field313;
   }

   public int Method3(int a, int a, int a) {
      float var5 = this.Field309 * (float)a + this.Field310 * (float)a;
      float var6 = this.Field311 * (float)a + this.Field312 * (float)a;
      var5 /= this.Field302;
      var6 /= this.Field302 * this.Field303;
      float var7 = Class598.Method157(var5, var6);
      Class193.Method1270();
      var7 += 0.1F * this.Field306 * Class598.Method157(var5 * 0.05F, var6 * 20.0F);
      var7 = var7 * 0.5F + 0.5F;
      var7 *= this.Field305 * 50.0F;
      var7 -= (float)((int)var7);
      var7 *= 1.0F - Class776.Method1708(this.Field308, 1.0F, var7);
      var7 += this.Field307 * Class598.Method157(var5 * this.Field302, var6 * 50.0F);
      int var8 = a & -16777216;
      if (this.Field313 != null) {
         this.Field313.Method283(var7);
      }

      int var9 = Class767.Method1687((int)(var7 * 255.0F));
      int var10 = var9 << 16;
      int var11 = var9 << 8;
      var9 |= var8 | var10 | var11;
      return var9;
   }

   public String toString() {
      return "Texture/Wood...";
   }
}
