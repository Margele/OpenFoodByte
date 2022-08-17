package awsl;

import java.awt.Color;
import java.util.Comparator;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;

public class Class386 extends Class390 {
   private int Field1892;

   public Class386(Class381 a, int a, int a, String a) {
      super(a, a, a, "IRCUserList", a);
      this.Field1909 = this.Field1919.Field1874;
      this.Field1910 = 18;
      this.Field1920 = "IRCUserList";
   }

   public void Method411(int a, int a) {
      super.Method411(a, a);
      Class390.Method1317();
      this.Field1919.Method1398("IRC - " + GlobalModule.INSTANCE.balant.Field2823.Method1799());
      float a = 0.0F;
      int a = 0;
      if (a < GlobalModule.INSTANCE.balant.Field2823.Method1799()) {
         Class606 a = (Class606)GlobalModule.INSTANCE.balant.Field2823.get(a);
         if (Class565.Field2636.Method1225(a.Method3737() + a.Method3739()) > a) {
            a = Class565.Field2636.Method1225(a.Method3737() + a.Method3739());
         }

         ++a;
      }

      if (a + 6.0F >= (float)this.Field1909) {
         this.Field1909 = (int)a + 6;
      }

      this.Field1909 = this.Field1919.Field1874;
      GlobalModule.INSTANCE.balant.Field2823.sort(Comparator.comparingDouble(Class606::Method3740).reversed());
      this.Field1910 = (int)((float)GlobalModule.INSTANCE.balant.Field2823.Method1799() * (Class565.Field2636.Field2625 + 2.0F) + 4.0F);
      this.Field1919.Method1384();
   }

   public void Method412(int a, int a) {
      float a = (float)(this.Field1907 + 2);
      Class390.Method1318();
      float a = (float)(this.Field1908 + 2);
      float a = 2.0F;
      RenderUtils.Method1103((float)this.Field1907 + a, a, (float)this.Field1909 - a * 2.0F, (float)(this.Field1910 - 4), (new Color(255, 255, 255, 40)).getRGB());
      int a = 0;
      if (a < GlobalModule.INSTANCE.balant.Field2823.Method1799()) {
         Class606 a = (Class606)GlobalModule.INSTANCE.balant.Field2823.get(a);
         if ((float)a >= a + 0.5F && (float)a <= (float)(this.Field1907 + this.Field1909) - a * 2.0F - 1.0F && (float)a >= a + 0.5F && (float)a < a + Class565.Field2636.Field2625 + 3.0F) {
            this.Field1892 = a;
            GlobalModule.INSTANCE.Field3190.Method1808(a.Method3736() + a.Method3737() + a.Method3739() + "\n在线时间 - " + a.Method3742(System.currentTimeMillis() - a.Field2844) + "\n游戏ID - " + a.Field2842 + "\n匿名ID - " + a.Field2841 + "\n正在玩 - " + a.Field2849 + "\n" + a.Field2850 + "\n开局 " + a.Method3742(System.currentTimeMillis() - a.Field2851) + "\n隐身 - " + (a.Field2847 ? "开启" : "关闭") + "\nIRC朋友 - " + (a.Field2848 ? "开启" : "关闭") + "\n");
            RenderUtils.Method1103(a + 0.5F, a + 0.5F, (float)this.Field1909 - a * 2.0F - 1.0F, Class565.Field2636.Method1227(a.Method3737() + a.Method3739()) + 1.0F, Class681.Method900(Class707.Method1828(), 0.5F));
         }

         Class565.Field2636.Method1217(a.Method3737() + a.Method3739(), a + 1.0F, a + 1.0F, (new Color(14013909)).getRGB());
         float var10000 = a + Class565.Field2636.Method1227(a.Method3737() + a.Method3739()) + 2.0F;
         ++a;
      }

   }

   public void Method413(int a, int a1, boolean a2) {
   }
}
