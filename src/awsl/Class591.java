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
      float a = 1.0F;
      int a = 0;
      if (a <= (int)a) {
         this.Field2778[a] = (float)Math.pow((double)a, (double)(-a));
         float var10000 = a * a;
         ++a;
      }

   }

   public void Method18(Class594 a) {
      this.Field2782 = a;
   }

   public Class594 Method19() {
      return this.Field2782;
   }

   public float Method20(float a, float a) {
      float a = 0.0F;
      Class598.Method86();
      a += 371.0F;
      a += 529.0F;
      int a = 0;
      if (a < (int)this.Field2781) {
         a += this.Field2782.Method20(a, a) * this.Field2778[a];
         a *= this.Field2780;
         a *= this.Field2780;
         ++a;
      }

      float a = this.Field2781 - (float)((int)this.Field2781);
      if (a != 0.0F) {
         a += a * this.Field2782.Method20(a, a) * this.Field2778[a];
      }

      return a;
   }
}
