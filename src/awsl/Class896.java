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

   protected void Method3567(int a, int a1, Point a2) {
   }

   protected void Method3439(int a, int a, float[] a) {
      Class193.Method1270();
      float a = 0.0F;
      float a = 0.0F;
      float a = 0.0F;
      float a = 0.001F;
      float a = 1.5F * this.Field3970 + 0.5F;
      float a = this.Field3969;
      float a = 0.0F;
      float a = 0.0F;
      float a = 0.0F;
      int a = 0;
      if (a < this.Field3971.length) {
         Class743 a = this.Field3971[a];
         Class743 a = this.Field3973[a];
         float a = (float)(a - a.Field3248);
         float a = (float)(a - a.Field3249);
         a = (a * (float)a.Field3252 + a * (float)a.Field3253) / a.Field3255;
         float a = (a * (float)a.Field3252 - a * (float)a.Field3253) / a.Field3254;
         float a;
         if (a <= 0.0F) {
            a = (float)Math.sqrt((double)(a * a + a * a));
         }

         if (a >= 1.0F) {
            a = (float)(a - a.Field3250);
            a = (float)(a - a.Field3251);
            a = (float)Math.sqrt((double)(a * a + a * a));
         }

         if (a >= 0.0F) {
            ;
         }

         a = -a;
         a = (float)a.Field3248 + a * (float)a.Field3252 - a * (float)a.Field3253 / a.Field3254;
         a = (float)a.Field3249 + a * (float)a.Field3253 + a * (float)a.Field3252 / a.Field3254;
         float a = (float)Math.pow(Math.pow((double)a.Field3254, (double)a) / (double)(a + a), (double)a);
         a += (a - (float)a) * a;
         a += (a - (float)a) * a;
         a += a;
         ++a;
      }

      a[0] = (float)a + a / a + 0.5F;
      a[1] = (float)a + a / a + 0.5F;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      this.Field3974 = this.Field3974;
      this.Field3975 = this.Field3975;
      if (this.Field3971 != null && this.Field3972 != null) {
         this.Field3973 = new Class743[this.Field3971.length];

         for(int a = 0; a < this.Field3971.length; ++a) {
            Class743 a = this.Field3973[a] = new Class743(Class776.Method1718(this.Field3968, this.Field3971[a].Field3248, this.Field3972[a].Field3248), Class776.Method1718(this.Field3968, this.Field3971[a].Field3249, this.Field3972[a].Field3249), Class776.Method1718(this.Field3968, this.Field3971[a].Field3250, this.Field3972[a].Field3250), Class776.Method1718(this.Field3968, this.Field3971[a].Field3251, this.Field3972[a].Field3251));
            a.Method1676();
            this.Field3971[a].Method1676();
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
