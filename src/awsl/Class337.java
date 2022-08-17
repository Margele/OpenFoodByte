package awsl;

import java.util.Random;
import obfuscate.a;

public class Class337 {
   private float Field1625;
   private float Field1626;
   private float Field1627;
   private float Field1628;
   private Class262 Field1629;
   private Class263 Field1630;
   private final Random Field1631;
   private float Field1632 = Class328.Method990(1.1F, 1.8F);

   public Class337(float a, float a, float a, float a) {
      this.Field1625 = a;
      this.Field1626 = a;
      this.Field1627 = a;
      this.Field1628 = a;
      this.Field1631 = new Random();
      this.Field1629 = new Class262(0.0F, 0.0F, 0.0F);
      this.Field1630 = new Class263(0.0F, 0.0F);
   }

   public float Method1181(float a, float a) {
      return a + this.Field1631.nextFloat() * (a - a);
   }

   public Class263 Method1182(Class262 a, Class262 a) {
      Class263 var4 = new Class263(0.0F, 0.0F);
      Class328.Method995();
      this.Field1629.Method2808(a.Method2811().floatValue() - a.Method2811().floatValue()).Method2809(a.Method2812().floatValue() + this.Field1632 - (a.Method2812().floatValue() + this.Field1632)).Method2810(a.Method2813().floatValue() - a.Method2813().floatValue());
      double var5 = Math.hypot(this.Field1629.Method2811().doubleValue(), this.Field1629.Method2813().doubleValue());
      float var7 = (float)Math.atan2((double)this.Field1629.Method2813().floatValue(), (double)this.Field1629.Method2811().floatValue());
      float var8 = (float)Math.atan2((double)this.Field1629.Method2812().floatValue(), var5);
      float var9 = 57.29578F;
      float var10 = var7 * var9 - 90.0F;
      float var11 = -(var8 * var9);
      Class263 var10000 = var4.Method2844(var10).Method2845(var11).Method2848();
      a.trash(new String[1]);
      return var10000;
   }

   public void Method1183(float a) {
      this.Field1632 = a;
   }

   public Class263 Method1184(Class263 a, Class263 a, float a, float a) {
      int var5 = Class328.Method994();
      Class263 var10000 = this.Field1630.Method2844(a.Method2846() - a.Method2846() - (Math.abs(a.Method2846() - a.Method2846()) > 5.0F ? Math.abs(a.Method2846() - a.Method2846()) / Math.abs(a.Method2846() - a.Method2846()) * 2.0F / 2.0F : 0.0F)).Method2845(a.Method2847() - a.Method2847()).Method2848().Method2844(a.Method2846() - this.Field1630.Method2846() / a * this.Method1181(this.Field1625, this.Field1626)).Method2848().Method2845(a.Method2847() - this.Field1630.Method2847() / a * this.Method1181(this.Field1627, this.Field1628)).Method2848();
      if (a.trash() == null) {
         ++var5;
         Class328.Method993(var5);
      }

      return var10000;
   }
}
