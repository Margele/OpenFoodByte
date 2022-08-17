package awsl;

import java.awt.Color;
import net.minecraft.util.MathHelper;
import obfuscate.a;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.FloatValue;

public class Class418 extends Class413 {
   public boolean Field2021;
   FloatValue Field2022;
   private static boolean Field2023;

   public Class418(Class417 a, FloatValue a) {
      this.Field1991 = a;
      this.Field1992 = a;
      this.Field2022 = (FloatValue)this.Field1992;
      this.Field2021 = false;
      super.Method3576();
   }

   public void Method2369(int a, int a, float a) {
      String var5 = "" + (double)Math.round((double)this.Field2022.getFloatValue() * 100.0) / 100.0;
      Method2374();
      RenderUtils.Method1105(this.Field1994, this.Field1995, this.Field1994 + this.Field1996, this.Field1995 + this.Field1997, (new Color(0, 0, 0, 150)).getRGB());
      Class565.Field2637.Method1217(this.Field1998, (float)(this.Field1994 + 2.0), (float)(this.Field1995 + 0.0), -1);
      Class565.Field2637.Method1217(var5, (float)(this.Field1994 + this.Field1996 - (double)Class565.Field2637.Method1225(var5) - 1.0), (float)(this.Field1995 + 0.0), -1);
      this.Field1994 += 2.0;
      this.Field1996 -= 4.0;
      boolean var10000 = this.Method2372(a, a) || this.Field2021;
      Color var7 = Class416.Method2352();
      int var8 = (new Color(var7.getRed(), var7.getGreen(), var7.getBlue(), 250)).getRGB();
      int var9 = (new Color(var7.getRed(), var7.getGreen(), var7.getBlue(), 255)).getRGB();
      double var10 = ((double)this.Field2022.getFloatValue() - (double)this.Field2022.Method2750()) / ((double)this.Field2022.Method2751() - (double)this.Field2022.Method2750());
      RenderUtils.Method1105(this.Field1994, this.Field1995 + 12.0, this.Field1994 + this.Field1996, this.Field1995 + 13.5, (new Color(0, 0, 0, 80)).getRGB());
      RenderUtils.Method1105(this.Field1994, this.Field1995 + 12.0, this.Field1994 + var10 * this.Field1996, this.Field1995 + 13.5, var8);
      if (var10 > 0.0 && var10 < 1.0) {
         RenderUtils.Method1105(this.Field1994 + var10 * this.Field1996 - 1.0, this.Field1995 + 12.0, this.Field1994 + Math.min(var10 * this.Field1996, this.Field1996), this.Field1995 + 13.5, var9);
      }

      if (this.Field2021) {
         double var12 = (double)this.Field2022.Method2751() - (double)this.Field2022.Method2750();
         double var14 = (double)this.Field2022.Method2750() + MathHelper.clamp_double(((double)a - this.Field1994) / this.Field1996, 0.0, 1.0) * var12;
         var14 = (double)Math.round(var14 * (1.0 / (double)this.Field2022.Method2752())) / (1.0 / (double)this.Field2022.Method2752());
         var14 = (double)((float)Math.round(var14 * 100.0) / 100.0F);
         this.Field2022.Method2745((float)var14);
      }

      a.trash(new String[5]);
   }

   public boolean Method2370(int a, int a, int a) {
      return this.Method2372(a, a) ? (this.Field2021 = true) : super.Method2370(a, a, a);
   }

   public void Method2371(int a, int a, int a) {
      this.Field2021 = false;
      GlobalModule.INSTANCE.fileManager.saveValues();
   }

   public boolean Method2372(int a, int a) {
      return (double)a >= this.Field1994 && (double)a <= this.Field1994 + this.Field1996 && (double)a >= this.Field1995 + 11.0 && (double)a <= this.Field1995 + 14.0;
   }

   public static void Method2373(boolean boolean1) {
      Field2023 = boolean1;
   }

   public static boolean Method2374() {
      return Field2023;
   }

   public static boolean Method2375() {
      boolean var0 = Method2374();
      return true;
   }

   static {
      if (!Method2374()) {
         Method2373(true);
      }

   }
}
