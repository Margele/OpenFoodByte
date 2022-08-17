package awsl;

import java.awt.Color;
import net.minecraft.util.MathHelper;
import obfuscate.a;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.FloatValue;

public class Class423 extends Class426 {
   public boolean Field2041;
   FloatValue Field2042;
   private static boolean Field2043;

   public Class423(Class414 a, FloatValue a) {
      this.Field2047 = a;
      this.Field2048 = a;
      this.Field2042 = (FloatValue)this.Field2048;
      this.Field2041 = false;
      super.Method2308();
   }

   public void Method2310(int a, int a, float a2) {
      String a = "" + (double)Math.round((double)this.Field2042.getFloatValue() * 100.0) / 100.0;
      RenderUtils.Method1105(this.Field2050, this.Field2051, this.Field2050 + this.Field2052, this.Field2051 + this.Field2053, (new Color(0, 0, 0, 150)).getRGB());
      Class565.Field2637.Method1217(this.Field2054, (float)(this.Field2050 + 2.0), (float)(this.Field2051 + 0.0), -1);
      Method2409();
      Class565.Field2637.Method1217(a, (float)(this.Field2050 + this.Field2052 - (double)Class565.Field2637.Method1225(a) - 1.0), (float)(this.Field2051 + 0.0), -1);
      this.Field2050 += 2.0;
      this.Field2052 -= 4.0;
      boolean var10000 = this.Method2407(a, a) || this.Field2041;
      Color a = Class416.Method2352();
      int a = (new Color(a.getRed(), a.getGreen(), a.getBlue(), 250)).getRGB();
      int a = (new Color(a.getRed(), a.getGreen(), a.getBlue(), 255)).getRGB();
      double a = ((double)this.Field2042.getFloatValue() - (double)this.Field2042.Method2750()) / ((double)this.Field2042.Method2751() - (double)this.Field2042.Method2750());
      RenderUtils.Method1105(this.Field2050, this.Field2051 + 12.0, this.Field2050 + this.Field2052, this.Field2051 + 13.5, (new Color(0, 0, 0, 80)).getRGB());
      RenderUtils.Method1105(this.Field2050, this.Field2051 + 12.0, this.Field2050 + a * this.Field2052, this.Field2051 + 13.5, a);
      if (a > 0.0 && a < 1.0) {
         RenderUtils.Method1105(this.Field2050 + a * this.Field2052 - 1.0, this.Field2051 + 12.0, this.Field2050 + Math.min(a * this.Field2052, this.Field2052), this.Field2051 + 13.5, a);
      }

      if (this.Field2041) {
         double a = (double)this.Field2042.Method2751() - (double)this.Field2042.Method2750();
         double a = (double)this.Field2042.Method2750() + MathHelper.clamp_double(((double)a - this.Field2050) / this.Field2052, 0.0, 1.0) * a;
         a = (double)Math.round(a * (1.0 / (double)this.Field2042.Method2752())) / (1.0 / (double)this.Field2042.Method2752());
         a = (double)((float)Math.round(a * 100.0) / 100.0F);
         this.Field2042.Method2745((float)a);
      }

      a.trash(new String[2]);
   }

   public boolean Method2311(int a, int a, int a) {
      return this.Method2407(a, a) ? (this.Field2041 = true) : super.Method2311(a, a, a);
   }

   public void Method2312(int a, int a1, int a2) {
      this.Field2041 = false;
      GlobalModule.INSTANCE.fileManager.saveValues();
   }

   public boolean Method2407(int a, int a) {
      return (double)a >= this.Field2050 && (double)a <= this.Field2050 + this.Field2052 && (double)a >= this.Field2051 + 11.0 && (double)a <= this.Field2051 + 14.0;
   }

   public static void Method2408(boolean boolean1) {
      Field2043 = boolean1;
   }

   public static boolean Method2409() {
      return Field2043;
   }

   public static boolean Method2410() {
      boolean var0 = Method2409();
      return true;
   }

   static {
      if (!Method2409()) {
         Method2408(true);
      }

   }
}
