package awsl;

public class Class123 extends Class119 {
   private int Field963 = 8;
   private int Field964 = 8;
   private int Field965 = -1;
   private int Field966 = -16777216;
   private int Field967 = 0;
   private float Field968 = 0.0F;
   private float Field969 = 1.0F;
   private float Field970 = 0.0F;
   private float Field971 = 0.0F;
   private float Field972 = 1.0F;

   public void Method9(int a) {
      this.Field965 = a;
   }

   public int Method10() {
      return this.Field965;
   }

   public void Method11(int a) {
      this.Field966 = a;
   }

   public int Method12() {
      return this.Field966;
   }

   public void Method13(int a) {
      this.Field963 = a;
   }

   public int Method14() {
      return this.Field963;
   }

   public void Method15(int a) {
      this.Field964 = a;
   }

   public int Method16() {
      return this.Field964;
   }

   public void Method498(int a) {
      this.Field967 = a;
   }

   public int Method499() {
      return this.Field967;
   }

   public void Method56(float a) {
      this.Field968 = a;
      float a = (float)Math.cos((double)a);
      float a = (float)Math.sin((double)a);
      this.Field969 = a;
      this.Field970 = a;
      this.Field971 = -a;
      this.Field972 = a;
   }

   public float Method57() {
      return this.Field968;
   }

   public int Method3(int a, int a, int a2) {
      float a = (this.Field969 * (float)a + this.Field970 * (float)a) / (float)this.Field963;
      float a = (this.Field971 * (float)a + this.Field972 * (float)a) / (float)this.Field964;
      float a = (int)(a + 100000.0F) % 2 != (int)(a + 100000.0F) % 2 ? 1.0F : 0.0F;
      if (this.Field967 != 0) {
         float a = (float)this.Field967 / 100.0F;
         float a = Class776.Method1707(0.0F, a, 1.0F - a, 1.0F, Class776.Method1714(a, 1.0F));
         float a = Class776.Method1707(0.0F, a, 1.0F - a, 1.0F, Class776.Method1714(a, 1.0F));
         a *= a * a;
      }

      return Class776.Method1719(a, this.Field965, this.Field966);
   }

   public String toString() {
      return "Texture/Checkerboard...";
   }
}
