package awsl;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.StringUtils;
import obfuscate.a;

public class Class415 {
   private static FontRenderer Field2010;

   public static void Method2360() {
      Field2010 = Minecraft.getMinecraft().fontRendererObj;
   }

   public static int Method2361(String a) {
      return Field2010.getStringWidth(StringUtils.stripControlCodes(a));
   }

   public static int Method2362() {
      return Field2010.FONT_HEIGHT;
   }

   public static void Method2363(String a, double a, double a, int a) {
      Field2010.drawString(a, (int)a, (int)a, a);
   }

   public static void Method2364(String a, double a, double a, int a) {
      Field2010.drawStringWithShadow(a, (float)a, (float)a, a);
   }

   public static void Method2365(String a, double a, double a, int a) {
      Method2363(a, a - (double)(Field2010.getStringWidth(a) / 2), a, a);
   }

   public static void Method2366(String a, double a, double a, int a) {
      Method2364(a, a - (double)(Field2010.getStringWidth(a) / 2), a, a);
   }

   public static void Method2367(String a, double a, double a, int a) {
      Method2363(a, a - (double)(Field2010.getStringWidth(a) / 2), a - (double)(Field2010.FONT_HEIGHT / 2), a);
   }

   public static void Method2368(String a, double a, double a, int a) {
      int var10000 = Class416.Method2355();
      Method2364(a, a - (double)(Field2010.getStringWidth(a) / 2), a - (double)((float)Field2010.FONT_HEIGHT / 2.0F), a);
      int var6 = var10000;
      if (a.trash() == null) {
         ++var6;
         Class416.Method2354(var6);
      }

   }
}
