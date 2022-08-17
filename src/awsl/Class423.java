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

   public void Method2310(int a, int a, float a) {
      String var5 = "" + (double)Math.round((double)this.Field2042.getFloatValue() * 100.0) / 100.0;
      RenderUtils.Method1105(this.Field2050, this.Field2051, this.Field2050 + this.Field2052, this.Field2051 + this.Field2053, (new Color(0, 0, 0, 150)).getRGB());
      Class565.Field2637.Method1217(this.Field2054, (float)(this.Field2050 + 2.0), (float)(this.Field2051 + 0.0), -1);
      Method2409();
      Class565.Field2637.Method1217(var5, (float)(this.Field2050 + this.Field2052 - (double)Class565.Field2637.Method1225(var5) - 1.0), (float)(this.Field2051 + 0.0), -1);
      this.Field2050 += 2.0;
      this.Field2052 -= 4.0;
      boolean var10000 = this.Method2407(a, a) || this.Field2041;
      Color var7 = Class416.Method2352();
      int var8 = (new Color(var7.getRed(), var7.getGreen(), var7.getBlue(), 250)).getRGB();
      int var9 = (new Color(var7.getRed(), var7.getGreen(), var7.getBlue(), 255)).getRGB();
      double var10 = ((double)this.Field2042.getFloatValue() - (double)this.Field2042.Method2750()) / ((double)this.Field2042.Method2751() - (double)this.Field2042.Method2750());
      RenderUtils.Method1105(this.Field2050, this.Field2051 + 12.0, this.Field2050 + this.Field2052, this.Field2051 + 13.5, (new Color(0, 0, 0, 80)).getRGB());
      RenderUtils.Method1105(this.Field2050, this.Field2051 + 12.0, this.Field2050 + var10 * this.Field2052, this.Field2051 + 13.5, var8);
      if (var10 > 0.0 && var10 < 1.0) {
         RenderUtils.Method1105(this.Field2050 + var10 * this.Field2052 - 1.0, this.Field2051 + 12.0, this.Field2050 + Math.min(var10 * this.Field2052, this.Field2052), this.Field2051 + 13.5, var9);
      }

      if (this.Field2041) {
         double var12 = (double)this.Field2042.Method2751() - (double)this.Field2042.Method2750();
         double var14 = (double)this.Field2042.Method2750() + MathHelper.clamp_double(((double)a - this.Field2050) / this.Field2052, 0.0, 1.0) * var12;
         var14 = (double)Math.round(var14 * (1.0 / (double)this.Field2042.Method2752())) / (1.0 / (double)this.Field2042.Method2752());
         var14 = (double)((float)Math.round(var14 * 100.0) / 100.0F);
         this.Field2042.Method2745((float)var14);
      }

      a.trash(new String[2]);
   }

   public boolean Method2311(int a, int a, int a) {
      return this.Method2407(a, a) ? (this.Field2041 = true) : super.Method2311(a, a, a);
   }

   public void Method2312(int a, int a, int a) {
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
