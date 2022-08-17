package awsl;

import java.awt.Color;
import obfuscate.a;

public class Class416 {
   private static int Field2011;

   public static Color Method2352() {
      return new Color(0, 153, 255);
   }

   public static Color Method2353(int a, int a, float a, float a, float a) {
      int var6 = (int)((System.currentTimeMillis() / (long)a + (long)a) % 360L);
      Method2356();
      float var7 = (float)var6 / 360.0F;
      Color var8 = new Color(Color.HSBtoRGB(var7, a, a));
      Color var10000 = new Color(var8.getRed(), var8.getGreen(), var8.getBlue(), Math.max(0, Math.min(255, (int)(a * 255.0F))));
      a.trash(new String[2]);
      return var10000;
   }

   public static void Method2354(int integer) {
      Field2011 = integer;
   }

   public static int Method2355() {
      return Field2011;
   }

   public static int Method2356() {
      int var0 = Method2355();
      return 122;
   }

   static {
      if (Method2356() != 0) {
         Method2354(13);
      }

   }
}
