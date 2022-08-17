package awsl;

import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;

public class Class382 extends Class390 {
   private boolean Field1883;
   public BooleanValue Field1884;
   private Class344 Field1885 = new Class344(20);

   public Class382(BooleanValue a, Class381 a, int a, int a, String a, String a) {
      super(a, a, a, a, a);
      this.Field1884 = a;
      this.Field1909 = Math.max(this.Field1919.Field1874, a.Method1414());
      this.Field1910 = 12;
      this.Field1920 = "Checkbox";
   }

   public void Method419(int a, int a1) {
      this.Field1916 = !this.Field1884.Method2756();
   }

   public void Method411(int a, int a) {
      super.Method411(a, a);
      this.Field1883 = this.Field1884 != null && Boolean.valueOf(this.Field1884.getValue());
      this.Field1885.Method290(this.Field1883);
      if (this.Field1915) {
         GlobalModule.INSTANCE.Field3190.Method1808(this.Field1914);
      }

   }

   public void Method412(int a, int a1) {
      int a = this.Field1909 - (this.Field1919.Method1418() ? 2 : 0);
      Class565.Field2636.Method1217(this.Field1913, (float)(this.Field1907 + 18), (float)this.Field1908 + 2.0F, 16777215);
      RenderUtils.Method1103((float)(this.Field1907 + 5), (float)(this.Field1908 + 2), 8.0F, 8.0F, this.Field1915 ? Class681.Method2699(Class707.Method1832(), 30) : Class707.Method1832());
      if (this.Field1885.Method292() > 0.0) {
         RenderUtils.Method1085((double)(this.Field1907 + 6), (double)(this.Field1908 + 6), (double)(this.Field1907 + 7), (double)(this.Field1908 + 7) + (double)(this.Field1910 - 10) * Math.min(0.5, this.Field1885.Method292()) * 2.0, 1.5F, 16777215);
      }

      if (this.Field1885.Method292() > 0.5) {
         RenderUtils.Method1085((double)(this.Field1907 + 7), (double)(this.Field1908 + this.Field1910 - 3), (double)(this.Field1907 + 7) + (double)(this.Field1910 - 7) * (this.Field1885.Method292() - 0.5) * 2.0, (double)(this.Field1908 + this.Field1910 - 4) - (double)(this.Field1910 - 8) * (this.Field1885.Method292() - 0.5) * 2.0, 1.5F, 16777215);
      }

   }

   public void Method413(int a, int a, boolean a) {
      this.Field1915 = this.Method1313(a, a) && this.Field1919.Method1392(a, a);
      if (!this.Field1918 && this.Field1915 && this.Field1884 != null && Mouse.isButtonDown(0)) {
         this.Field1883 = !this.Field1883;
         this.Field1884.Method2510(this.Field1883);
         GlobalModule.INSTANCE.fileManager.saveValues();
      }

      this.Field1918 = a;
   }

   public void Method414() {
      super.Method414();
   }
}
