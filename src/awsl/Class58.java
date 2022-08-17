package awsl;

public class Class58 extends Class119 {
   private float Field611 = 32.0F;
   private float Field612 = 1.0F;
   private float Field613 = 0.0F;
   public float Field614 = 1.0F;
   public float Field615 = 1.0F;
   public float Field616 = 0.5F;
   public float Field617 = 0.5F;
   public int Field618;
   private float Field619 = 1.0F;
   private float Field620 = 0.0F;
   private float Field621 = 0.0F;
   private float Field622 = 1.0F;
   private Class755 Field623 = new Class758();
   private Class594 Field624 = new Class598();

   public void Method56(float a) {
      this.Field614 = a;
   }

   public float Method57() {
      return this.Field614;
   }

   public void Method18(Class594 a) {
      this.Field624 = a;
   }

   public Class594 Method19() {
      return this.Field624;
   }

   public void Method9(int a) {
      this.Field618 = a;
   }

   public int Method10() {
      return this.Field618;
   }

   public void Method58(float a) {
      this.Field611 = a;
   }

   public float Method59() {
      return this.Field611;
   }

   public void Method60(float a) {
      this.Field612 = a;
   }

   public float Method61() {
      return this.Field612;
   }

   public void Method164(float a) {
      this.Field613 = a;
      float var2 = (float)Math.cos((double)a);
      float var3 = (float)Math.sin((double)a);
      this.Field619 = var2;
      this.Field620 = var3;
      this.Field621 = -var3;
      this.Field622 = var2;
   }

   public float Method165() {
      return this.Field613;
   }

   public void Method166(float a) {
      this.Field615 = a;
   }

   public float Method167() {
      return this.Field615;
   }

   public void Method176(Class755 a) {
      this.Field623 = a;
   }

   public Class755 Method177() {
      return this.Field623;
   }

   public int Method3(int a, int a, int a) {
      float var5 = this.Field619 * (float)a + this.Field620 * (float)a;
      float var6 = this.Field621 * (float)a + this.Field622 * (float)a;
      Class193.Method1270();
      var5 /= this.Field611;
      var6 /= this.Field611 * this.Field612;
      float var7 = (double)this.Field615 == 1.0 ? Class598.Method157(var5, var6) : Class598.Method153(var5, var6, this.Field615);
      var7 = var7 * 0.5F + 0.5F;
      var7 = Class776.Method1704(var7, this.Field616);
      var7 = Class776.Method1703(var7, this.Field617);
      var7 *= this.Field614;
      int var8 = a & -16777216;
      if (this.Field623 != null) {
         this.Field623.Method283(var7);
      }

      int var9 = Class767.Method1687((int)(var7 * 255.0F));
      int var10 = var9 << 16;
      int var11 = var9 << 8;
      var9 |= var8 | var10 | var11;
      if (this.Field618 != 0) {
         var9 = Class767.Method1691(a, var9, this.Field618);
      }

      return var9;
   }

   public String toString() {
      return "Texture/Noise...";
   }
}
