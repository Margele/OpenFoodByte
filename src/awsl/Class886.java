package awsl;

import java.awt.Rectangle;

public class Class886 extends Class877 {
   public static final int Field3875 = 0;
   public static final int Field3876 = 1;
   public static final int Field3877 = 2;
   public static final int Field3878 = 3;
   private float Field3879 = 5.0F;
   private float Field3880 = 0.0F;
   private float Field3881;
   private float Field3882;
   private int Field3883;

   public Class886() {
      this.Field3881 = this.Field3882 = 16.0F;
   }

   public void Method56(float a) {
      this.Field3879 = a;
   }

   public float Method57() {
      return this.Field3879;
   }

   public void Method58(float a) {
      this.Field3881 = a;
   }

   public float Method59() {
      return this.Field3881;
   }

   public void Method60(float a) {
      this.Field3880 = a;
   }

   public float Method61() {
      return this.Field3880;
   }

   public void Method164(float a) {
      this.Field3882 = a;
   }

   public float Method165() {
      return this.Field3882;
   }

   public void Method13(int a) {
      this.Field3883 = a;
   }

   public int Method14() {
      return this.Field3883;
   }

   protected void Method834(Rectangle a) {
      if (this.Field3818 == 0) {
         a.x -= (int)this.Field3879;
         a.width += (int)(2.0F * this.Field3879);
         a.y -= (int)this.Field3880;
         a.height += (int)(2.0F * this.Field3880);
      }

   }

   protected void Method3439(int a, int a, float[] a) {
      Class193.Method1270();
      float a = (float)a / this.Field3881;
      float a = (float)a / this.Field3882;
      float a;
      float a;
      switch (this.Field3883) {
         case 0:
         default:
            a = (float)Math.sin((double)a);
            a = (float)Math.sin((double)a);
         case 1:
            a = Class776.Method1714(a, 1.0F);
            a = Class776.Method1714(a, 1.0F);
         case 2:
            a = Class776.Method1716(a);
            a = Class776.Method1716(a);
         case 3:
            a = Class598.Method156(a);
            a = Class598.Method156(a);
            a[0] = (float)a + this.Field3879 * a;
            a[1] = (float)a + this.Field3880 * a;
      }
   }

   public String toString() {
      return "Distort/Ripple...";
   }
}
