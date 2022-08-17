package awsl;

import java.awt.Color;

public class Class97 extends Class119 {
   public float Field820;
   public float Field821;
   public float Field822;
   private float[] Field823;

   public Class97() {
      this(0.0F, 0.0F, 0.0F);
   }

   public Class97(float a, float a, float a) {
      this.Field823 = new float[3];
      this.Field820 = a;
      this.Field821 = a;
      this.Field822 = a;
      this.Field950 = true;
   }

   public void Method56(float a) {
      this.Field820 = a;
   }

   public float Method57() {
      return this.Field820;
   }

   public void Method58(float a) {
      this.Field821 = a;
   }

   public float Method59() {
      return this.Field821;
   }

   public void Method60(float a) {
      this.Field822 = a;
   }

   public float Method61() {
      return this.Field822;
   }

   public int Method3(int a, int a, int a) {
      int var5 = a & -16777216;
      int var6 = a >> 16 & 255;
      int var7 = a >> 8 & 255;
      int var8 = a & 255;
      Class193.Method1270();
      Color.RGBtoHSB(var6, var7, var8, this.Field823);
      float[] var10000 = this.Field823;
      var10000[0] += this.Field820;
      if (this.Field823[0] < 0.0F) {
         var10000 = this.Field823;
         var10000[0] = (float)((double)var10000[0] + 6.283185307179586);
      }

      var10000 = this.Field823;
      var10000[1] += this.Field821;
      if (this.Field823[1] < 0.0F) {
         this.Field823[1] = 0.0F;
      }

      if ((double)this.Field823[1] > 1.0) {
         this.Field823[1] = 1.0F;
      }

      var10000 = this.Field823;
      var10000[2] += this.Field822;
      if (this.Field823[2] < 0.0F) {
         this.Field823[2] = 0.0F;
      }

      if ((double)this.Field823[2] > 1.0) {
         this.Field823[2] = 1.0F;
      }

      a = Color.HSBtoRGB(this.Field823[0], this.Field823[1], this.Field823[2]);
      return var5 | a & 16777215;
   }

   public String toString() {
      return "Colors/Adjust HSB...";
   }
}
