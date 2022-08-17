package awsl;

import java.awt.geom.Point2D;

public class Class103 extends Class119 {
   private int Field830 = 50;
   private float Field831;
   private float Field832 = 1.0F;
   private float Field833 = 0.2F;
   private float Field834 = 0.1F;
   private int Field835 = -1;
   private int Field836;
   private int Field837;
   private float Field838 = 0.5F;
   private float Field839 = 0.5F;
   private float Field840 = 1.6F;
   private float Field841 = 0.03F;
   private float Field842 = 0.006F;
   private float Field843 = 0.5F;
   private float Field844 = 6.0F;
   private float Field845;
   private float Field846;
   private float Field847;

   public Class103() {
      this.Method166(50.0F);
   }

   public void Method9(int a) {
      this.Field835 = a;
   }

   public int Method10() {
      return this.Field835;
   }

   public void Method56(float a) {
      this.Field840 = a;
   }

   public float Method57() {
      return this.Field840;
   }

   public void Method58(float a) {
      this.Field832 = a;
   }

   public float Method59() {
      return this.Field832;
   }

   public void Method60(float a) {
      this.Field833 = a;
   }

   public float Method61() {
      return this.Field833;
   }

   public void Method164(float a) {
      this.Field834 = a;
   }

   public float Method165() {
      return this.Field834;
   }

   public void Method330(Point2D a) {
      this.Field838 = (float)a.getX();
      this.Field839 = (float)a.getY();
   }

   public Point2D Method331() {
      return new Point2D.Float(this.Field838, this.Field839);
   }

   public void Method166(float a) {
      this.Field831 = a;
      this.Field845 = a / 3.0F;
   }

   public float Method167() {
      return this.Field831;
   }

   public void Method17(int a, int a) {
      this.Field836 = a;
      this.Field837 = a;
      this.Field846 = this.Field838 * (float)a;
      this.Field847 = this.Field839 * (float)a;
      super.Method17(a, a);
   }

   public int Method3(int a, int a, int a) {
      float a = (float)a - this.Field846;
      Class193.Method1270();
      float a = (float)a - this.Field847;
      float a = (float)Math.sqrt((double)(a * a + a * a));
      float a = (float)Math.exp((double)(-a * a * this.Field842)) * this.Field843 + (float)Math.exp((double)(-a * this.Field841)) * (1.0F - this.Field843);
      a *= this.Field832;
      if (a > this.Field831 + this.Field840) {
         a = Class776.Method1717((a - (this.Field831 + this.Field840)) / this.Field844, a, 0.0F);
      }

      float a;
      if (a < this.Field831 - this.Field840 || a > this.Field831 + this.Field840) {
         a = 0.0F;
      }

      a = Math.abs(a - this.Field831) / this.Field840;
      a = 1.0F - a * a * (3.0F - 2.0F * a);
      a *= this.Field833;
      a += a;
      float a = (float)Math.atan2((double)a, (double)a) + 3.1415927F;
      a = (Class776.Method1714(a / 3.1415927F * 17.0F + 1.0F + Class598.Method156(a * 10.0F), 1.0F) - 0.5F) * 2.0F;
      a = Math.abs(a);
      a = (float)Math.pow((double)a, 5.0);
      float a = this.Field834 * a / (1.0F + a * 0.1F);
      a += a;
      a = Class776.Method1711(a, 0.0F, 1.0F);
      return Class776.Method1719(a, a, this.Field835);
   }

   public String toString() {
      return "Stylize/Flare...";
   }
}
