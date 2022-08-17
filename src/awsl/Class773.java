package awsl;

import java.awt.Color;

public class Class773 implements Cloneable {
   int Field3434;
   Class590 Field3435;
   Class590 Field3436;
   Class600 Field3437;
   int Field3438;
   float Field3439;
   float Field3440;
   float Field3441;
   float Field3442;
   float Field3443;
   float Field3444;
   float Field3445;
   float Field3446;
   float Field3447;

   public Class773() {
      this(4.712389F, 0.5235988F, 1.0F);
   }

   public Class773(float a, float a, float a) {
      this.Field3434 = 0;
      this.Field3437 = new Class600();
      this.Field3438 = -1;
      this.Field3442 = 0.5F;
      this.Field3443 = 0.5F;
      this.Field3444 = 0.5F;
      this.Field3445 = 0.5235988F;
      this.Field3447 = 100.0F;
      this.Field3440 = a;
      this.Field3441 = a;
      this.Field3439 = a;
   }

   public void Method56(float a) {
      this.Field3440 = a;
   }

   public float Method57() {
      return this.Field3440;
   }

   public void Method58(float a) {
      this.Field3441 = a;
   }

   public float Method59() {
      return this.Field3441;
   }

   public void Method60(float a) {
      this.Field3447 = a;
   }

   public float Method61() {
      return this.Field3447;
   }

   public void Method164(float a) {
      this.Field3439 = a;
   }

   public float Method165() {
      return this.Field3439;
   }

   public void Method166(float a) {
      this.Field3445 = a;
   }

   public float Method167() {
      return this.Field3445;
   }

   public void Method168(float a) {
      this.Field3442 = a;
   }

   public float Method169() {
      return this.Field3442;
   }

   public void Method9(int a) {
      this.Field3438 = a;
   }

   public int Method10() {
      return this.Field3438;
   }

   public void Method170(float a) {
      this.Field3443 = a;
   }

   public float Method171() {
      return this.Field3443;
   }

   public void Method172(float a) {
      this.Field3444 = a;
   }

   public float Method173() {
      return this.Field3444;
   }

   public void Method17(int a, int a) {
      float var3 = (float)(Math.cos((double)this.Field3440) * Math.cos((double)this.Field3441));
      float var4 = (float)(Math.sin((double)this.Field3440) * Math.cos((double)this.Field3441));
      float var5 = (float)Math.sin((double)this.Field3441);
      this.Field3436 = new Class590(var3, var4, var5);
      this.Field3436.Method25();
      if (this.Field3434 != 1) {
         var3 *= this.Field3447;
         var4 *= this.Field3447;
         var5 *= this.Field3447;
         var3 += (float)a * this.Field3443;
         var4 += (float)a * this.Field3444;
      }

      this.Field3435 = new Class590(var3, var4, var5);
      this.Field3437.Method3790(new Color(this.Field3438));
      this.Field3437.Method121(this.Field3439);
      this.Field3446 = (float)Math.cos((double)this.Field3445);
   }

   public Object Method878() {
      try {
         Class773 var1 = (Class773)super.Method1433();
         return var1;
      } catch (CloneNotSupportedException var2) {
         return null;
      }
   }

   public String toString() {
      return "Light";
   }
}
