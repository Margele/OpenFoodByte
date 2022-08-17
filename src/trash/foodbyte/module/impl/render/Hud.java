package trash.foodbyte.module.impl.render;

import awsl.Class327;
import awsl.Class330;
import awsl.Class492;
import awsl.Class565;
import awsl.Class662;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.MathHelper;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ColorValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Hud extends Module {
   public static ModeValue Field2363 = new ModeValue("Hud", "Array", "Normal", new String[]{"Normal", "Side", "All"}, "HUD模式");
   public static ColorValue Field2364 = new ColorValue("Hud", "HUD Color", new Color(0, 153, 255, 100), "绘制颜色");
   public static FloatValue Field2365 = new FloatValue("Hud", "RainBowHue", 4000.0, 500.0, 4000.0, 100.0, "彩色速度");
   public static FloatValue Field2366 = new FloatValue("Hud", "RainBowSatu", 0.5, 0.0, 1.0, 0.01, "彩色鲜明度");
   public static FloatValue Field2367 = new FloatValue("Hud", "RainBowBright", 0.75, 0.0, 1.0, 0.01, "彩色亮度");
   public static FloatValue Field2368 = new FloatValue("Hud", "RainBowStep", 45.0, 1.0, 100.0, 1.0, "变动速度");
   public static BooleanValue Field2369 = new BooleanValue("Hud", "Logo", true, "左上角logo显示");
   public static BooleanValue Field2370 = new BooleanValue("Hud", "ArrayList", true, "功能显示");
   public static BooleanValue Field2371 = new BooleanValue("Hud", "FontShadow", false, "字体阴影");
   public static BooleanValue Field2372 = new BooleanValue("Hud", "Rainbow", false, "彩色模式");
   private Class327 Field2373 = new Class327(Class330.class);

   public Hud() {
      super("Hud", "Hud", Category.RENDER);
      this.Method1033(true);
   }

   public String getDescription() {
      return "这个就不用我多说了吧";
   }

   @EventTarget
   public void Method810(EventRender2D a) {
   }

   public void Method1558(ScaledResolution a) {
      double a = 0.0;
      Class492.Method2239();
      double a = (double)a.getScaledWidth();
      ArrayList a = new ArrayList(ModuleManager.getAllModules());
      a.sort(Comparator.comparingDouble(Hud::Method1560));
      Iterator var8 = a.Method1383();

      while(var8.Method932()) {
         Module a = (Module)var8.Method933();
         if (a != ModuleManager.getModule(ClickGui.class) && !a.hide) {
            String a = a.Method1016().isEmpty() ? a.Method1023() : String.format("%s%s", a.Method1023(), a.Method1016());
            double a = (double)(Class565.Field2637.Method1225(a.Method1016().isEmpty() ? a.Method1023() : String.format("%s%s", a.Method1023(), a.Method1016())) + 2.0F + (float)(Field2363.isCurrentMode("Normal") ? -1 : 0));
            double a = (double)(Class565.Field2637.Field2625 - 4.0F);
            if (a.getState()) {
               a.Method1034(a - this.Field2373.Method998(a.Method1038(), 0.0, a, 0.3));
               a.Method1035(a - this.Field2373.Method998(a.Method1039(), 0.0, a, 0.3));
            }

            a.Method1034(this.Field2373.Method998(a.Method1038(), 0.0, a, 0.3));
            a.Method1035(this.Field2373.Method998(a.Method1039(), 0.0, a, 0.3));
            a.Method1034(MathHelper.clamp_double(a.Method1036(), 0.0, a));
            a.Method1035(MathHelper.clamp_double(a.Method1037(), 0.0, a));
            if (!a.getState() && (a.Method1036() == 0.0 || a.Method1036() == a)) {
               break;
            }

            int a = Field2372.getBooleanValue() ? Method1559((int)(a * (double)Field2368.getFloatValue().intValue())) : Class662.Method2400(new Color(Field2364.Method2444().getRGB()), 20, a.indexOf(a) * 2 + 10).getRGB();
            if (Field2364.Method2453() != 0) {
               RenderUtils.Method1105(a - a + a.Method1036() - 1.0, a, a + a + a.Method1036(), a + a, (new Color(0, 0, 0, Field2364.Method2453())).getRGB());
            }

            if (Field2363.isCurrentMode("Side") || Field2363.isCurrentMode("All")) {
               RenderUtils.Method1105(a + a.Method1036() - 1.0, a, a + a.Method1036(), a + a, a);
            }

            double a = a < (double)(a.getScaledWidth() / 2) ? 2.0 : 0.0;
            if (Field2371.getBooleanValue()) {
               Class565.Field2637.Method1220(a, (float)(a - a + a.Method1036() + a), (float)a - 1.0F, a);
            }

            Class565.Field2637.Method1217(a, (float)(a - a + a.Method1036() + a), (float)a - 1.0F, a);
            double var10000 = a + (a - a.Method1037());
            break;
         }
      }

   }

   public static int Method1559(int a) {
      float a = Field2365.getFloatValue();

      float a;
      for(a = (float)(System.currentTimeMillis() % (long)((int)a)) + (float)(a / 2); a > a; a -= a) {
      }

      a /= a;
      if ((double)a > 0.5) {
         a = 0.5F - a - 0.5F;
      }

      a += 0.5F;
      return Color.HSBtoRGB(a, Field2366.getFloatValue(), Field2367.getFloatValue());
   }

   public void onEnable() {
      this.Field2373.Method1003(1337);
   }

   public void onDisable() {
   }

   private static double Method1560(Module a) {
      return (double)(-Class565.Field2637.Method1225(a.Method1016().isEmpty() ? a.Method1023() : String.format("%s%s", a.Method1023(), a.Method1016())));
   }
}
