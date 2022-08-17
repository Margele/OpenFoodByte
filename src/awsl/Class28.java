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
      float a = (float)Math.cos((double)a);
      float a = (float)Math.sin((double)a);
      this.Field245 = a;
      this.Field246 = a;
      this.Field247 = -a;
      this.Field248 = a;
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
      float a = this.Field245 * (float)a + this.Field246 * (float)a;
      float a = this.Field247 * (float)a + this.Field248 * (float)a;
      a /= this.Field239 * this.Field240;
      a /= this.Field239;
      int a = a & -16777216;
      float a;
      float a;
      float a;
      if (this.Field244 != null) {
         a = this.Field243 * Class598.Method153(a, a, this.Field242);
         a = 3.0F * this.Field243 * a + a;
         a = (float)Math.sin((double)a * Math.PI);
         a = (float)Math.sin(40.0 * (double)a);
         a = (float)((double)a + 0.2 * (double)a);
         return this.Field244.Method283(a);
      } else {
         float a = this.Field243 * Class598.Method153(a, a, this.Field242);
         float a = (float)Math.sin(Math.sin(8.0 * (double)a + (double)(7.0F * a) + 3.0 * (double)a));
         float a;
         float a = a = Math.abs(a);
         float a = (float)Math.sin(40.0 * (double)a);
         a = Math.abs(a);
         float a = 0.6F * a + 0.3F;
         float a = 0.2F * a + 0.8F;
         float a = 0.15F * a + 0.85F;
         a = 0.5F * (float)Math.pow((double)Math.abs(a), 0.3);
         a = (float)Math.pow(0.5 * ((double)a + 1.0), 0.6) * a;
         a = (float)Math.pow(0.5 * ((double)a + 1.0), 0.6) * a;
         a = (0.5F * a + 0.35F * a) * 2.0F * a;
         a = (0.25F * a + 0.35F * a) * 2.0F * a;
         a *= Math.max(a, a) * a;
         int a = a >> 16 & 255;
         int a = a >> 8 & 255;
         int a = a & 255;
         a = Class767.Method1687((int)((float)a * a));
         a = Class767.Method1687((int)((float)a * a));
         a = Class767.Method1687((int)((float)a * a));
         return a & -16777216 | a << 16 | a << 8 | a;
      }
   }

   public String toString() {
      return "Texture/Marble Texture...";
   }
}
