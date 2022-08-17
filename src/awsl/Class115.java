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
      float a = (float)Math.cos((double)a);
      float a = (float)Math.sin((double)a);
      this.Field908 = a;
      this.Field909 = a;
      this.Field910 = -a;
      this.Field911 = a;
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
      float a = this.Field908 * (float)a + this.Field909 * (float)a;
      float a = this.Field910 * (float)a + this.Field911 * (float)a;
      if (this.Field906 == 2) {
         a = (float)Math.sqrt((double)(a * a + a * a));
      }

      if (this.Field906 == 3) {
         a = Class776.Method1714(a, 16.0F);
      }

      if (this.Field906 == 4) {
         a = this.Method20(a, 16.0F);
      }

      int a = (int)(Class776.Method1708(this.Field904, this.Field904 + this.Field905, a) * 255.0F);
      if (this.Field907) {
         a = 255 - a;
      }

      return a << 24 | a & 16777215;
   }

   public float Method20(float a, float a) {
      a = Class776.Method1714(a, 2.0F * a);
      return a > a ? 2.0F * a - a : a;
   }

   public String toString() {
      return "Fade...";
   }
}
