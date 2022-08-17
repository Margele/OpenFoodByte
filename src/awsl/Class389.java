package awsl;

import java.awt.Color;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ColorValue;

public class Class389 extends Class390 {
   public double Field1904;
   public ColorValue Field1905;
   protected boolean Field1906;

   public Class389(ColorValue a, Class381 a, int a, int a, String a, String a) {
      super(a, a, a, a, a);
      this.Field1905 = a;
      this.Field1909 = Math.max(this.Field1919.Field1874, a.Method1414());
      this.Field1910 = 18;
      if (this.Field1905 != null) {
         this.Field1904 = (double)this.Field1905.Method2442();
      }

      this.Field1920 = "ColorSlider";
   }

   public void Method419(int a, int a) {
      this.Field1916 = !this.Field1905.Method2756();
   }

   public void Method411(int a, int a) {
      super.Method411(a, a);
      if (this.Field1915) {
         GlobalModule.INSTANCE.Field3190.Method1808(this.Field1914);
      }

   }

   public void Method412(int a, int a) {
      Class390.Method1317();
      Class565.Field2636.Method1217(this.Field1913, (float)(this.Field1907 + 5), (float)(this.Field1908 + 1), 16777215);
      float var4 = 0.0F;
      if (var4 < (float)(this.Method1310() - 10)) {
         int var5 = Color.getHSBColor(var4 / (float)(this.Method1310() - 10), 1.0F, 1.0F).getRGB();
         RenderUtils.Method1103((float)(this.Field1907 + 5) + var4, (float)(this.Field1908 + this.Field1910 - 8), 0.5F, 4.0F, var5);
         if ((float)a == (float)(this.Field1907 + 5) + var4 && this.Field1906) {
            this.Field1905.Method2440(var5);
            GlobalModule.INSTANCE.fileManager.saveValues();
         }

         if (this.Field1905.Method2442() == var5) {
            RenderUtils.Method1103((float)(this.Field1907 + 5) + var4, (float)(this.Field1908 + this.Field1910 - 8), 0.5F, 4.0F, -1);
         }

         var4 += 0.5F;
      }

   }

   public void Method413(int a, int a, boolean a) {
      this.Field1915 = MathUtils.isHovering((float)a, (float)a, (float)this.Field1907, (float)(this.Field1908 + 8), (float)(this.Field1907 + this.Field1909 - (this.Field1919.Method1418() ? 2 : 0)), (float)(this.Field1908 + this.Field1910)) && this.Field1919.Method1392(a, a);
      if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown(0)) {
         this.Field1906 = true;
      }

      this.Field1906 = false;
      this.Field1918 = a;
   }

   public void Method414() {
      super.Method414();
      if (!Mouse.isButtonDown(0)) {
         this.Field1906 = false;
      }

   }
}
