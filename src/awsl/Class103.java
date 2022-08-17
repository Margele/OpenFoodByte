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
      float var5 = (float)a - this.Field846;
      Class193.Method1270();
      float var6 = (float)a - this.Field847;
      float var7 = (float)Math.sqrt((double)(var5 * var5 + var6 * var6));
      float var8 = (float)Math.exp((double)(-var7 * var7 * this.Field842)) * this.Field843 + (float)Math.exp((double)(-var7 * this.Field841)) * (1.0F - this.Field843);
      var8 *= this.Field832;
      if (var7 > this.Field831 + this.Field840) {
         var8 = Class776.Method1717((var7 - (this.Field831 + this.Field840)) / this.Field844, var8, 0.0F);
      }

      float var9;
      if (var7 < this.Field831 - this.Field840 || var7 > this.Field831 + this.Field840) {
         var9 = 0.0F;
      }

      var9 = Math.abs(var7 - this.Field831) / this.Field840;
      var9 = 1.0F - var9 * var9 * (3.0F - 2.0F * var9);
      var9 *= this.Field833;
      var8 += var9;
      float var10 = (float)Math.atan2((double)var5, (double)var6) + 3.1415927F;
      var10 = (Class776.Method1714(var10 / 3.1415927F * 17.0F + 1.0F + Class598.Method156(var10 * 10.0F), 1.0F) - 0.5F) * 2.0F;
      var10 = Math.abs(var10);
      var10 = (float)Math.pow((double)var10, 5.0);
      float var11 = this.Field834 * var10 / (1.0F + var7 * 0.1F);
      var8 += var11;
      var8 = Class776.Method1711(var8, 0.0F, 1.0F);
      return Class776.Method1719(var8, a, this.Field835);
   }

   public String toString() {
      return "Stylize/Flare...";
   }
}
