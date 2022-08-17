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
      float var4 = 0.0F;
      int var5 = 0;
      if (var5 < GlobalModule.INSTANCE.balant.Field2823.Method1799()) {
         Class606 var6 = (Class606)GlobalModule.INSTANCE.balant.Field2823.get(var5);
         if (Class565.Field2636.Method1225(var6.Method3737() + var6.Method3739()) > var4) {
            var4 = Class565.Field2636.Method1225(var6.Method3737() + var6.Method3739());
         }

         ++var5;
      }

      if (var4 + 6.0F >= (float)this.Field1909) {
         this.Field1909 = (int)var4 + 6;
      }

      this.Field1909 = this.Field1919.Field1874;
      GlobalModule.INSTANCE.balant.Field2823.sort(Comparator.comparingDouble(Class606::Method3740).reversed());
      this.Field1910 = (int)((float)GlobalModule.INSTANCE.balant.Field2823.Method1799() * (Class565.Field2636.Field2625 + 2.0F) + 4.0F);
      this.Field1919.Method1384();
   }

   public void Method412(int a, int a) {
      float var4 = (float)(this.Field1907 + 2);
      Class390.Method1318();
      float var5 = (float)(this.Field1908 + 2);
      float var6 = 2.0F;
      RenderUtils.Method1103((float)this.Field1907 + var6, var5, (float)this.Field1909 - var6 * 2.0F, (float)(this.Field1910 - 4), (new Color(255, 255, 255, 40)).getRGB());
      int var7 = 0;
      if (var7 < GlobalModule.INSTANCE.balant.Field2823.Method1799()) {
         Class606 var8 = (Class606)GlobalModule.INSTANCE.balant.Field2823.get(var7);
         if ((float)a >= var4 + 0.5F && (float)a <= (float)(this.Field1907 + this.Field1909) - var6 * 2.0F - 1.0F && (float)a >= var5 + 0.5F && (float)a < var5 + Class565.Field2636.Field2625 + 3.0F) {
            this.Field1892 = var7;
            GlobalModule.INSTANCE.Field3190.Method1808(var8.Method3736() + var8.Method3737() + var8.Method3739() + "\n在线时间 - " + var8.Method3742(System.currentTimeMillis() - var8.Field2844) + "\n游戏ID - " + var8.Field2842 + "\n匿名ID - " + var8.Field2841 + "\n正在玩 - " + var8.Field2849 + "\n" + var8.Field2850 + "\n开局 " + var8.Method3742(System.currentTimeMillis() - var8.Field2851) + "\n隐身 - " + (var8.Field2847 ? "开启" : "关闭") + "\nIRC朋友 - " + (var8.Field2848 ? "开启" : "关闭") + "\n");
            RenderUtils.Method1103(var4 + 0.5F, var5 + 0.5F, (float)this.Field1909 - var6 * 2.0F - 1.0F, Class565.Field2636.Method1227(var8.Method3737() + var8.Method3739()) + 1.0F, Class681.Method900(Class707.Method1828(), 0.5F));
         }

         Class565.Field2636.Method1217(var8.Method3737() + var8.Method3739(), var4 + 1.0F, var5 + 1.0F, (new Color(14013909)).getRGB());
         float var10000 = var5 + Class565.Field2636.Method1227(var8.Method3737() + var8.Method3739()) + 2.0F;
         ++var7;
      }

   }

   public void Method413(int a, int a, boolean a) {
   }
}
