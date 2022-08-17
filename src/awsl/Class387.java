package awsl;

import java.awt.Color;
import org.lwjgl.input.Mouse;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ModeValue;

public class Class387 extends Class390 {
   private boolean Field1893 = false;
   public String Field1894;
   public ModeValue Field1895;
   public int Field1896;
   private Class344 Field1897 = new Class344(15);

   public Class387(ModeValue a, Class381 a, int a, int a, String a) {
      super(a, a, a, a.Method2754(), a);
      this.Field1895 = a;
      this.Field1896 = 16;
      this.Field1909 = Math.max(this.Field1919.Field1874, a.Method1414());
      this.Field1910 = 21;
      this.Field1920 = "ComboBox";
   }

   public void Method419(int a, int a) {
      this.Field1916 = !this.Field1895.Method2756();
   }

   public void Method411(int a, int a) {
      super.Method411(a, a);
      this.Field1897.Method290(this.Field1893);
      this.Field1919.Method1384();
      if (this.Field1915) {
         GlobalModule.INSTANCE.Field3190.Method1808(this.Field1914);
      }

   }

   public void Method412(int a, int a) {
      Class390.Method1318();
      RenderUtils.Method1103((float)(this.Field1907 + 5), (float)(this.Field1908 + 9), (float)(this.Method1310() - 10), 10.0F, (new Color(150, 150, 150, 77)).getRGB());
      Class565.Field2636.Method1217(this.Field1913, (float)(this.Field1907 + 5), (float)this.Field1908 + 1.0F, 16777215);
      Class565.Field2636.Method1222(this.Field1895.getMode(), (float)(this.Field1907 + this.Method1310() / 2), (float)(this.Field1908 + 10), 16777215);
      float var4 = (float)this.Field1897.Method292() * 2.0F - 1.0F;
      float var5 = (float)(this.Field1908 + 14) + var4 * 1.0F;
      float var6 = (float)(this.Field1908 + 14) - var4 * 1.0F;
      float var7 = (float)(this.Field1908 + 14) + var4 * 1.0F;
      RenderUtils.Method1085((double)(this.Field1907 + this.Method1310() - 12), (double)var5, (double)((float)(this.Field1907 + this.Method1310()) - 10.0F), (double)var6, 1.0F, 16777215);
      RenderUtils.Method1085((double)((float)(this.Field1907 + this.Method1310()) - 10.0F), (double)var6, (double)(this.Field1907 + this.Method1310() - 8), (double)var7, 1.0F, 16777215);
      if (this.Field1893) {
         RenderUtils.Method1103((float)(this.Field1907 + 5), (float)(this.Field1908 + 19), (float)(this.Method1310() - 10), (float)(this.Field1910 - 21), (new Color(150, 150, 150, 77)).getRGB());
         if (this.Field1895.Method2728().length > 1) {
            RenderUtils.Method1106((double)(this.Field1907 + 5), (double)(this.Field1908 + 19), (double)(this.Field1907 + this.Method1310() - 5), (double)(this.Field1908 + 25), (new Color(0, 0, 0, 30)).getRGB(), 0);
         }

         double var8 = (double)this.Field1908 + 21.0;
         int var10 = 0;
         if (var10 < this.Field1895.Method2728().length) {
            String var11 = this.Field1895.Method2728()[var10];
            int var12 = (new Color(163, 162, 162, 255)).getRGB();
            if (this.Field1895.isCurrentMode(var11)) {
               ;
            }

            if (a >= this.Field1907 + 5 && a <= this.Field1907 + this.Method1310() - 5 && (double)a >= var8 && (double)a < var8 + (double)Class565.Field2636.Field2625 - 1.0) {
               var12 = (new Color(0, 153, 255, 150)).getRGB();
            }

            Class565.Field2636.Method1222(var11, (float)(this.Field1907 + this.Method1310() / 2), (float)(var8 - 1.0), var12);
            var8 += (double)Class565.Field2636.Field2625;
            ++var10;
         }

      }
   }

   public void Method413(int a, int a, boolean a) {
      int var4 = Class390.Method1318();
      this.Field1915 = this.Method1314(a, a) && this.Field1919.Method1392(a, a);
      if (!this.Field1918 && this.Field1915 && !Mouse.isButtonDown(2)) {
         this.Field1893 = !this.Field1893;
         if (this.Field1893) {
            this.Field1910 = (int)(21.0F + Class565.Field2636.Field2625 * (float)(this.Field1895.Method2728().length - 1));
         }

         this.Field1910 = 21;
      }

      if (this.Field1893 && !this.Field1918 && !Mouse.isButtonDown(2)) {
         double var5 = (double)this.Field1908 + 21.0;
         int var7 = 0;
         if (var7 < this.Field1895.Method2728().length) {
            String var8 = this.Field1895.Method2728()[var7];
            int var9 = (new Color(163, 162, 162, 255)).getRGB();
            if (this.Field1895.isCurrentMode(var8)) {
               ;
            }

            if (a >= this.Field1907 + 5 && a <= this.Field1907 + this.Method1310() - 5 && (double)a >= var5 && (double)a < var5 + (double)Class565.Field2636.Field2625 - 1.0) {
               this.Field1895.Method2725(this.Field1895.Method2728()[var7]);
               GlobalModule.INSTANCE.fileManager.saveValues();
               this.Field1893 = false;
               this.Field1910 = 21;
            }

            var5 += (double)Class565.Field2636.Field2625;
            ++var7;
         }
      }

      this.Field1918 = a;
   }

   public void Method414() {
      super.Method414();
   }
}
