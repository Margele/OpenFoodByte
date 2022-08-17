package awsl;

import java.awt.Color;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ModeValue;

public class Class388 extends Class390 {
   private boolean Field1898;
   public String Field1899;
   public ModeValue Field1900;
   public int Field1901;
   public int Field1902;
   private Class344 Field1903 = new Class344(15);

   public Class388(ModeValue a, Class381 a, int a, int a) {
      super(a, a, a, a.Method2754(), (String)null);
      this.Field1900 = a;
      this.Field1902 = 8;
      this.Field1909 = Math.max(this.Field1919.Field1874, a.Method1414());
      this.Field1910 = 12 + 12 * this.Field1900.Method2728().length;
      this.Field1920 = "ComboBox";
   }

   public void Method419(int a, int a) {
      this.Field1916 = !this.Field1900.Method2756();
   }

   public void Method411(int a, int a) {
      super.Method411(a, a);
      this.Field1901 = -1;
      this.Field1903.Method290(true);
      this.Field1919.Method1384();
   }

   public void Method412(int a, int a) {
      Class390.Method1318();
      Class565.Field2636.Method1217(this.Field1913, (float)(this.Field1907 + 5), (float)this.Field1908 + 1.0F, 16777215);
      int var4 = 0;
      if (var4 < this.Field1900.Method2728().length) {
         float var5 = (float)(this.Field1908 + this.Field1902 + 12 * var4);
         int var6 = this.Field1901 == var4 ? Class707.Method1831() : Class707.Method1832();
         Class565.Field2636.Method1217(this.Field1900.Method2728()[var4], (float)(this.Field1907 + 13 + 2), var5 + 4.5F, 16777215);
         RenderUtils.Method1103((float)(this.Field1907 + 5), var5 + 5.0F, 6.5F, 6.5F, var6);
         if (this.Field1900.isCurrentMode(this.Field1900.Method2728()[var4]) && this.Field1903.Method292() > 0.0) {
            RenderUtils.Method1103((float)this.Field1907 + 6.0F, var5 + 6.0F, 4.5F, 4.5F, (new Color(255, 255, 255, (int)(255.0 * this.Field1903.Method292()))).getRGB());
         }

         ++var4;
      }

   }

   public void Method413(int a, int a, boolean a) {
      this.Field1915 = this.Method1311(a, a) && this.Field1919.Method1392(a, a);
      if (!this.Field1915) {
         this.Field1901 = -1;
      } else {
         this.Field1901 = this.Method1442(a, a);
         if (!this.Field1918 && this.Field1915 && this.Field1901 != -1 && !this.Field1900.getMode().equals(this.Field1900.Method2728()[this.Field1901])) {
            this.Field1900.Method2725(this.Field1900.Method2728()[this.Field1901]);
            this.Field1903.Method291();
         }

         this.Field1918 = a;
      }
   }

   private int Method1442(int a, int a) {
      Class390.Method1317();
      int var4 = a - this.Field1908 - this.Field1902;
      int var5 = 0;
      if (var4 > 12) {
         ++var5;
         int var6 = var4 - 12;
      }

      return var5 >= this.Field1900.Method2728().length ? this.Field1901 : var5;
   }
}
