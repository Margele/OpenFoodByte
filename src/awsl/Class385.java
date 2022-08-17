package awsl;

import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class385 extends Class394 {
   private Module Field1888;
   private boolean Field1889;
   private boolean Field1890;
   private Class344 Field1891 = new Class344(15);

   public Class385(Class381 a, int a, int a, String a, Module a, String a) {
      super(a, a, a, a, a);
      this.Field1888 = a;
      this.Field1909 = Math.max(this.Field1919.Field1874, a.Method1414());
      this.Field1910 = 15;
      this.Field1920 = "ModuleButton";
   }

   public void Method419(int a, int a1) {
      this.Field1916 = !this.Field1888.isHideModule;
      if (GlobalModule.Field3155.getValue()) {
         this.Field1916 = true;
      } else if (!this.Field1916 && GlobalModule.INSTANCE.Field3190.Method1827(this.Field1888.getName() + "_setting")) {
         GlobalModule.INSTANCE.Field3190.Method1826(this.Field1888.getName() + "_setting", false);
      }

      this.Field1910 = this.Field1916 ? 15 : 0;
      this.Field1949 = this.Field1888 != null && this.Field1888.getState();
   }

   public void Method411(int a, int a) {
      super.Method411(a, a);
      if (this.Field1889) {
         GlobalModule.INSTANCE.Field3190.Method1808("§3" + this.Field1888.getName() + "\n" + this.Field1914 + "\n隐藏功能: " + this.Field1888.hide + "\n绑定按键: §d" + Keyboard.getKeyName(this.Field1888.Method1020()));
      }

   }

   public void Method412(int a, int a1) {
      int a = (new Color(14013909)).getRGB();
      this.Field1891.Method290(GlobalModule.INSTANCE.Field3190.Method1827(this.Field1888.getName() + "_setting"));
      if (this.Field1915) {
         RenderUtils.Method1103((float)this.Field1907, (float)this.Field1908, (float)this.Method1310(), (float)this.Field1910, Class681.Method2699(Class707.Method1829(), -250));
      }

      Class565.Field2635.Method1217(this.Field1913, (float)(this.Field1907 + 12), (float)(this.Field1908 + this.Field1910 / 2) - Class565.Field2635.Method1227(this.Field1913) / 2.0F + 1.0F, this.Field1888.canUse() ? (new Color(7303023)).getRGB() : (this.Field1949 ? Class707.Method1832() : 16777215));
      if (this.Field1888.Method1031()) {
         a = this.Field1890 ? Class681.Method2699(a, 30) : a;
         float a = (float)this.Field1907 + (float)this.Field1909 - 6.5F;
         float a = (float)this.Field1908 + (float)this.Field1910 / 2.0F;
         GlStateManager.pushMatrix();
         GlStateManager.translate(a, a, 0.0F);
         GlStateManager.rotate((float)this.Field1891.Method292() * 90.0F, 0.0F, 0.0F, 1.0F);
         RenderUtils.Method1085(-1.0, -2.0, 1.0, 0.0, 1.0F, a);
         RenderUtils.Method1085(-1.0, 2.0, 1.0, 0.0, 1.0F, a);
         GlStateManager.translate(-a, -a, 0.0F);
         GlStateManager.popMatrix();
      }

      int a = this.Field1888.getState() ? Class707.Method1832() : 16777215;
      RenderUtils.Method1133(a);
   }

   protected void Method425() {
      int var1 = Class390.Method1318();
      if (this.Field1889 && this.Field1888 != null) {
         if (Mouse.isButtonDown(0)) {
            this.Field1888.Method1028();
         }

         if (!Mouse.isButtonDown(1) && Mouse.isButtonDown(2)) {
            if (Keyboard.isKeyDown(42)) {
               this.Field1888.Method1033(!this.Field1888.hide);
               GlobalModule.INSTANCE.fileManager.saveHide();
            }

            this.Field1923.displayGuiScreen(new Class708(this.Field1888, GlobalModule.INSTANCE.Field3190));
         }
      }

      if (this.Field1890 && this.Field1888.Method1031() && (Mouse.isButtonDown(1) || Mouse.isButtonDown(0))) {
         if (!GlobalModule.INSTANCE.Field3190.Method1827(this.Field1888.getName() + "_setting")) {
            GlobalModule.INSTANCE.Field3190.Method1826(this.Field1888.getName() + "_setting", true);
         }

         GlobalModule.INSTANCE.Field3190.Method1826(this.Field1888.getName() + "_setting", false);
         this.Field1919.Method1384();
      }

   }

   public void Method413(int a, int a, boolean a) {
      this.Field1889 = this.Method423(a, a) && this.Field1919.Method1392(a, a) && this.Field1915;
      this.Field1890 = this.Method1438(a, a) && this.Field1919.Method1392(a, a) && this.Field1915;
      super.Method413(a, a, a);
   }

   public void Method414() {
      this.Field1889 = false;
      this.Field1890 = false;
      super.Method414();
   }

   private boolean Method423(int a, int a) {
      return MathUtils.isHovering((float)a, (float)a, (float)this.Field1907, (float)this.Field1908, (float)(this.Field1907 + this.Field1909 - 15), (float)(this.Field1908 + this.Field1910));
   }

   private boolean Method1438(int a, int a) {
      return MathUtils.isHovering((float)a, (float)a, (float)this.Field1907 + (float)this.Field1909 - (float)(this.Field1919.Method1418() ? 2 : 0) - 10.0F, (float)this.Field1908, (float)(this.Field1907 + this.Field1909 - (this.Field1919.Method1418() ? 2 : 0) - 2), (float)(this.Field1908 + this.Field1910));
   }

   public Module Method1439() {
      return this.Field1888;
   }

   public void Method1440(Module a) {
      this.Field1888 = a;
   }
}
