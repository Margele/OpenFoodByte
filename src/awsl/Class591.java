package awsl;

public class Class591 implements Class594 {
   protected float[] Field2778;
   protected float Field2779;
   protected float Field2780;
   protected float Field2781;
   protected Class594 Field2782;

   public Class591(float a, float a, float a) {
      this(a, a, a, new Class598());
   }

   public Class591(float a, float a, float a, Class594 a) {
      Class598.Method86();
      super();
      this.Field2779 = a;
      this.Field2780 = a;
      this.Field2781 = a;
      this.Field2782 = a;
      this.Field2778 = new float[(int)a + 1];
      float var6 = 1.0F;
      int var7 = 0;
      if (var7 <= (int)a) {
         this.Field2778[var7] = (float)Math.pow((double)var6, (double)(-a));
         float var10000 = var6 * a;
         ++var7;
      }

   }

   public void Method18(Class594 a) {
      this.Field2782 = a;
   }

   public Class594 Method19() {
      return this.Field2782;
   }

   public float Method20(float a, float a) {
      float var4 = 0.0F;
      Class598.Method86();
      a += 371.0F;
      a += 529.0F;
      int var6 = 0;
      if (var6 < (int)this.Field2781) {
         var4 += this.Field2782.Method20(a, a) * this.Field2778[var6];
         a *= this.Field2780;
         a *= this.Field2780;
         ++var6;
      }

      float var5 = this.Field2781 - (float)((int)this.Field2781);
      if (var5 != 0.0F) {
         var4 += var5 * this.Field2782.Method20(a, a) * this.Field2778[var6];
      }

      return var4;
   }
}
