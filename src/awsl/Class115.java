package awsl;

public class Class115 extends Class119 {
   private int Field901;
   private int Field902;
   private float Field903 = 0.0F;
   private float Field904 = 1.0F;
   private float Field905 = 10.0F;
   private int Field906;
   private boolean Field907;
   private float Field908 = 1.0F;
   private float Field909 = 0.0F;
   private float Field910 = 0.0F;
   private float Field911 = 1.0F;

   public void Method56(float a) {
      this.Field903 = a;
      float var2 = (float)Math.cos((double)a);
      float var3 = (float)Math.sin((double)a);
      this.Field908 = var2;
      this.Field909 = var3;
      this.Field910 = -var3;
      this.Field911 = var2;
   }

   public float Method57() {
      return this.Field903;
   }

   public void Method9(int a) {
      this.Field906 = a;
   }

   public int Method10() {
      return this.Field906;
   }

   public void Method58(float a) {
      this.Field904 = a;
   }

   public float Method59() {
      return this.Field904;
   }

   public void Method60(float a) {
      this.Field905 = a;
   }

   public float Method61() {
      return this.Field905;
   }

   public void Method87(boolean a) {
      this.Field907 = a;
   }

   public boolean Method88() {
      return this.Field907;
   }

   public void Method17(int a, int a) {
      this.Field901 = a;
      this.Field902 = a;
      super.Method17(a, a);
   }

   public int Method3(int a, int a, int a) {
      Class193.Method1270();
      float var5 = this.Field908 * (float)a + this.Field909 * (float)a;
      float var6 = this.Field910 * (float)a + this.Field911 * (float)a;
      if (this.Field906 == 2) {
         var5 = (float)Math.sqrt((double)(var5 * var5 + var6 * var6));
      }

      if (this.Field906 == 3) {
         var5 = Class776.Method1714(var5, 16.0F);
      }

      if (this.Field906 == 4) {
         var5 = this.Method20(var5, 16.0F);
      }

      int var7 = (int)(Class776.Method1708(this.Field904, this.Field904 + this.Field905, var5) * 255.0F);
      if (this.Field907) {
         var7 = 255 - var7;
      }

      return var7 << 24 | a & 16777215;
   }

   public float Method20(float a, float a) {
      a = Class776.Method1714(a, 2.0F * a);
      return a > a ? 2.0F * a - a : a;
   }

   public String toString() {
      return "Fade...";
   }
}
