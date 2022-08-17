package awsl;

import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ModeValue;

public class Class377 extends Class390 {
   public Class377(Class381 a, int a, int a, String a) {
      super(a, a, a, a, (String)null);
      this.Field1909 = 80;
      this.Field1910 = (int)(Class565.Field2636.Method1227(this.Field1913) + 3.0F);
      this.Field1920 = "Label";
   }

   public Class377(ModeValue a, Class381 a, int a, int a) {
      super(a, a, a, a.Method2754(), (String)null);
      this.Field1909 = 80;
      this.Field1910 = (int)(Class565.Field2636.Method1227(this.Field1913) + 3.0F);
      this.Field1920 = "Label";
   }

   public void Method412(int a, int a1) {
      int a = this.Field1909 - (this.Field1919.Method1418() ? 2 : 0);
      RenderUtils.Method1103((float)this.Field1907, (float)this.Field1908, (float)a, (float)this.Field1910, Class707.Method1829());
      Class565.Field2636.Method1217(this.Field1913, (float)(this.Field1907 + 5), (float)this.Field1908 + ((float)(this.Field1910 / 2) - Class565.Field2636.Method1227(this.Field1913) / 2.0F) + 0.0F, 16777215);
      float a = (float)this.Field1909 - Class565.Field2636.Method1225(this.Field1913) - 8.0F;
      if (a > 2.0F) {
         float var5 = 0.5F;
      }

   }

   public void Method413(int a, int a1, boolean a2) {
   }
}
