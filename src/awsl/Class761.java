package awsl;

import java.awt.Rectangle;
import java.util.Date;
import java.util.Random;

public class Class761 extends Class798 {
   private Random Field3333 = new Random();
   private long Field3334 = 567L;
   private int Field3335 = 25000;
   private float Field3336 = -0.59F;
   private float Field3337 = 0.2F;
   private float Field3338 = 0.1F;
   private float Field3339 = 0.0F;
   private int Field3340 = 0;
   private Class755 Field3341 = new Class771();

   public void Method89() {
      this.Field3334 = (new Date()).getTime();
      this.Field3333.setSeed(this.Field3334);
      this.Field3336 = this.Field3333.nextFloat();
      this.Field3337 = this.Field3333.nextFloat();
      this.Field3338 = this.Field3333.nextFloat();
      this.Field3339 = this.Field3333.nextFloat();
      this.Field3340 = this.Field3333.nextInt() % 20 - 10;
   }

   public void Method9(int a) {
      this.Field3335 = a;
   }

   public int Method10() {
      return this.Field3335;
   }

   public void Method56(float a) {
      this.Field3336 = a;
   }

   public float Method57() {
      return this.Field3336;
   }

   public void Method58(float a) {
      this.Field3337 = a;
   }

   public float Method59() {
      return this.Field3337;
   }

   public void Method60(float a) {
      this.Field3338 = a;
   }

   public float Method61() {
      return this.Field3338;
   }

   public void Method164(float a) {
      this.Field3339 = a;
   }

   public float Method165() {
      return this.Field3339;
   }

   public void Method11(int a) {
      this.Field3340 = a;
   }

   public int Method12() {
      return this.Field3340;
   }

   public void Method176(Class755 a) {
      this.Field3341 = a;
   }

   public Class755 Method177() {
      return this.Field3341;
   }

   protected int[] Method714(int a, int a, int[] a2, Rectangle a3) {
      int[] a = new int[a * a];
      boolean var7 = false;
      Class193.Method1269();
      int a = 0;
      float a = 0.1F;
      float a = 0.3F;
      int a = 0;
      float a;
      float a;
      float a;
      float a;
      if (a < 20) {
         a = 3.1415927F * a;
         a = 3.1415927F * a;
         a = (float)Math.sin((double)(2.0F * a));
         a = (float)Math.sin((double)(2.0F * a));
         float a = (float)((double)(this.Field3336 * a) + (double)(this.Field3337 * a) * Math.cos((double)(2.0F * a)) + (double)this.Field3338 * Math.sin((double)(4.0F * a)) + (double)this.Field3339 * Math.sin((double)(6.0F * a)) * Math.cos((double)(4.0F * a)) + (double)((float)this.Field3340 * a));
         a = a >= 0.0F ? a - (float)((int)a) : a - (float)((int)a) + 1.0F;
         float a = (float)((double)(this.Field3336 * a) + (double)(this.Field3337 * a) * Math.cos((double)(2.0F * a)) + (double)this.Field3338 * Math.sin((double)(4.0F * a)) + (double)this.Field3339 * Math.sin((double)(6.0F * a)) * Math.cos((double)(4.0F * a)) + (double)((float)this.Field3340 * a));
         a = a >= 0.0F ? a - (float)((int)a) : a - (float)((int)a) + 1.0F;
         a = a;
         a = a;
         ++a;
      }

      int a = 0;
      if (a < this.Field3335) {
         a = 3.1415927F * a;
         a = 3.1415927F * a;
         a = (float)((double)this.Field3336 * Math.sin((double)(2.0F * a)) + (double)this.Field3337 * Math.sin((double)(2.0F * a)) * Math.cos((double)(2.0F * a)) + (double)this.Field3338 * Math.sin((double)(4.0F * a)) + (double)this.Field3339 * Math.sin((double)(6.0F * a)) * Math.cos((double)(4.0F * a)) + (double)((float)this.Field3340 * a));
         a = a >= 0.0F ? a - (float)((int)a) : a - (float)((int)a) + 1.0F;
         a = (float)((double)this.Field3336 * Math.sin((double)(2.0F * a)) + (double)this.Field3337 * Math.sin((double)(2.0F * a)) * Math.cos((double)(2.0F * a)) + (double)this.Field3338 * Math.sin((double)(4.0F * a)) + (double)this.Field3339 * Math.sin((double)(6.0F * a)) * Math.cos((double)(4.0F * a)) + (double)((float)this.Field3340 * a));
         a = a >= 0.0F ? a - (float)((int)a) : a - (float)((int)a) + 1.0F;
         int a = (int)((float)a * a);
         int a = (int)((float)a * a);
         if (a < a && a < a) {
            int var10001 = a * a + a;
            int var10003 = a[a * a + a];
            a[var10001] = a[a * a + a] + 1;
            int a = var10003;
            if (a > a) {
               a = a;
            }
         }

         a = a + 1;
      }

      if (this.Field3341 != null) {
         a = 0;
         a = 0.0F;
         if (a < (float)a) {
            a = 0.0F;
            if (a < (float)a) {
               a[a] = this.Field3341.Method283((float)a[a] / (float)a);
               a = a + 1;
               ++a;
            }

            ++a;
         }
      }

      return a;
   }

   public String toString() {
      return "Texture/Chaotic Quilt...";
   }
}
