package awsl;

import trash.foodbyte.utils.RenderUtils;

public abstract class Class394 extends Class390 {
   protected boolean Field1949;

   public Class394(Class381 a, int a, int a, String a, String a) {
      super(a, a, a, a, a);
      this.Field1909 = Math.max(this.Field1919.Field1874, a.Method1414());
      this.Field1910 = 18;
      this.Field1920 = "Button";
   }

   public void Method412(int a, int a1) {
      int a = this.Field1909 - (this.Field1919.Method1418() ? 2 : 0);
      if (this.Field1915) {
         RenderUtils.Method1103((float)this.Field1907, (float)this.Field1908, (float)this.Method1310(), (float)this.Field1910, Class681.Method2699(Class707.Method1829(), -250));
      }

      Class565.Field2635.Method1217(this.Field1913, (float)(this.Field1907 + 12), (float)(this.Field1908 + this.Field1910 / 2) - Class565.Field2635.Method1227(this.Field1913) / 2.0F + 1.0F, this.Field1949 ? Class707.Method1832() : 16777215);
   }

   public void Method411(int a, int a) {
      super.Method411(a, a);
   }

   public void Method413(int a, int a, boolean a) {
      this.Field1915 = this.Method1311(a, a) && this.Field1919.Method1392(a, a);
      if (!this.Field1918 && this.Field1915) {
         this.Method425();
      }

      this.Field1918 = a;
   }

   protected abstract void Method425();

   public void Method414() {
      super.Method414();
   }
}
