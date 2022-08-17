package awsl;

import java.awt.Point;
import java.awt.image.BufferedImage;

public class Class896 extends Class877 {
   private float Field3968 = 1.0F;
   private float Field3969 = 1.0F;
   private float Field3970 = 2.0F;
   private Class743[] Field3971;
   private Class743[] Field3972;
   private Class743[] Field3973;
   private float Field3974;
   private float Field3975;

   public void Method56(float a) {
      this.Field3968 = a;
   }

   public float Method57() {
      return this.Field3968;
   }

   public void Method58(float a) {
      this.Field3969 = a;
   }

   public float Method59() {
      return this.Field3969;
   }

   public void Method60(float a) {
      this.Field3970 = a;
   }

   public float Method61() {
      return this.Field3970;
   }

   public void Method3563(Class743[] a) {
      this.Field3971 = a;
   }

   public Class743[] Method3564() {
      return this.Field3971;
   }

   public void Method3565(Class743[] a) {
      this.Field3972 = a;
   }

   public Class743[] Method3566() {
      return this.Field3972;
   }

   protected void Method3567(int a, int a, Point a) {
   }

   protected void Method3439(int a, int a, float[] a) {
      Class193.Method1270();
      float var5 = 0.0F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      float var11 = 0.001F;
      float var12 = 1.5F * this.Field3970 + 0.5F;
      float var13 = this.Field3969;
      float var14 = 0.0F;
      float var15 = 0.0F;
      float var16 = 0.0F;
      int var17 = 0;
      if (var17 < this.Field3971.length) {
         Class743 var18 = this.Field3971[var17];
         Class743 var19 = this.Field3973[var17];
         float var20 = (float)(a - var19.Field3248);
         float var21 = (float)(a - var19.Field3249);
         var7 = (var20 * (float)var19.Field3252 + var21 * (float)var19.Field3253) / var19.Field3255;
         float var9 = (var21 * (float)var19.Field3252 - var20 * (float)var19.Field3253) / var19.Field3254;
         float var8;
         if (var7 <= 0.0F) {
            var8 = (float)Math.sqrt((double)(var20 * var20 + var21 * var21));
         }

         if (var7 >= 1.0F) {
            var20 = (float)(a - var19.Field3250);
            var21 = (float)(a - var19.Field3251);
            var8 = (float)Math.sqrt((double)(var20 * var20 + var21 * var21));
         }

         if (var9 >= 0.0F) {
            ;
         }

         var8 = -var9;
         var5 = (float)var18.Field3248 + var7 * (float)var18.Field3252 - var9 * (float)var18.Field3253 / var18.Field3254;
         var6 = (float)var18.Field3249 + var7 * (float)var18.Field3253 + var9 * (float)var18.Field3252 / var18.Field3254;
         float var10 = (float)Math.pow(Math.pow((double)var19.Field3254, (double)var13) / (double)(var11 + var8), (double)var12);
         var15 += (var5 - (float)a) * var10;
         var16 += (var6 - (float)a) * var10;
         var14 += var10;
         ++var17;
      }

      a[0] = (float)a + var15 / var14 + 0.5F;
      a[1] = (float)a + var16 / var14 + 0.5F;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Field3974 = this.Field3974;
      this.Field3975 = this.Field3975;
      if (this.Field3971 != null && this.Field3972 != null) {
         this.Field3973 = new Class743[this.Field3971.length];

         for(int var3 = 0; var3 < this.Field3971.length; ++var3) {
            Class743 var4 = this.Field3973[var3] = new Class743(Class776.Method1718(this.Field3968, this.Field3971[var3].Field3248, this.Field3972[var3].Field3248), Class776.Method1718(this.Field3968, this.Field3971[var3].Field3249, this.Field3972[var3].Field3249), Class776.Method1718(this.Field3968, this.Field3971[var3].Field3250, this.Field3972[var3].Field3250), Class776.Method1718(this.Field3968, this.Field3971[var3].Field3251, this.Field3972[var3].Field3251));
            var4.Method1676();
            this.Field3971[var3].Method1676();
         }

         a = super.Method62(a, a);
         this.Field3973 = null;
         return a;
      } else {
         return a;
      }
   }

   public String toString() {
      return "Distort/Field Warp...";
   }
}
