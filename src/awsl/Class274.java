package awsl;

import com.ibm.icu.text.NumberFormat;
import java.awt.Color;
import java.util.regex.Pattern;
import obfuscate.a;

public final class Class274 {
   private static final Pattern Field1476 = Pattern.compile("(?i)§[0-9A-FK-OR]");

   public static Color Method2775(Color a, float a) {
      return Method2777(a, a);
   }

   public static Color Method2776(Color a, float a) {
      return Method2778(a, (double)a);
   }

   public static Color Method2777(Color a, float a) {
      int var2 = a.getRed();
      int var3 = a.getGreen();
      int var4 = a.getBlue();
      int var5 = a.getAlpha();
      int var6 = (int)(1.0 / (1.0 - (double)a));
      return new Color(var6, var6, var6, var5);
   }

   public static Color Method2778(Color a, double a) {
      return new Color(Math.max((int)((double)a.getRed() * a), 0), Math.max((int)((double)a.getGreen() * a), 0), Math.max((int)((double)a.getBlue() * a), 0), a.getAlpha());
   }

   public static int Method2779(float a, float a, float a) {
      float var3 = 4500.0F;
      float var4 = (float)(System.currentTimeMillis() % 4500L) / 4500.0F;
      return Color.HSBtoRGB(var4 - a / 54.0F, a, a);
   }

   public static int Method2780(float a, float a, float a) {
      return Color.HSBtoRGB(a / 54.0F, a, a);
   }

   public Color Method2781(Color a, Color a, double a) {
      float var5 = (float)System.currentTimeMillis();
      a += (double)var5;
      double var6;
      int var8;
      if (a > 1.0) {
         var6 = a % 1.0;
         var8 = (int)a;
         a = var8 % 2 == 0 ? var6 : 1.0 - var6;
      }

      var6 = 1.0 - a;
      var8 = (int)((double)a.getRed() * var6 + (double)a.getRed() * a);
      int var9 = (int)((double)a.getGreen() * var6 + (double)a.getGreen() * a);
      int var10 = (int)((double)a.getBlue() * var6 + (double)a.getBlue() * a);
      return new Color(var8, var9, var10);
   }

   public static int Method2782() {
      float var0 = (float)(System.currentTimeMillis() % 10000L) / 10000.0F;
      return Color.HSBtoRGB(var0, 0.5F, 1.0F);
   }

   public static String Method2783(String a) {
      return Field1476.matcher(a).replaceAll("");
   }

   public static Color Method2784(Color a, Color a, double a) {
      double var4 = 1.0 - a;
      int var6 = (int)((double)a.getRed() * a + (double)a.getRed() * var4);
      int var7 = (int)((double)a.getGreen() * a + (double)a.getGreen() * var4);
      int var8 = (int)((double)a.getBlue() * a + (double)a.getBlue() * var4);
      return new Color(var6, var7, var8);
   }

   public static Color Method2785(float[] a, Color[] a, float a) {
      throw new IllegalArgumentException("Fractions can't be null");
   }

   public static int[] Method2786(float[] a, float a) {
      int[] var3 = new int[2];

      int var2;
      for(var2 = 0; var2 < a.length && a[var2] <= a; ++var2) {
      }

      if (var2 >= a.length) {
         var2 = a.length - 1;
      }

      var3[0] = var2 - 1;
      var3[1] = var2;
      return var3;
   }

   public static Color Method2787(Color a, Color a, double a) {
      float var5 = (float)a;
      float var6 = 1.0F - var5;
      float[] var7 = new float[3];
      float[] var8 = new float[3];
      Class668.Method1270();
      a.getColorComponents(var7);
      a.getColorComponents(var8);
      float var9 = var7[0] * var5 + var8[0] * var6;
      float var10 = var7[1] * var5 + var8[1] * var6;
      float var11 = var7[2] * var5 + var8[2] * var6;
      if (var9 < 0.0F) {
         var9 = 0.0F;
      }

      if (var9 > 255.0F) {
         var9 = 255.0F;
      }

      if (var10 < 0.0F) {
         var10 = 0.0F;
      }

      if (var10 > 255.0F) {
         var10 = 255.0F;
      }

      if (var11 < 0.0F) {
         var11 = 0.0F;
      }

      if (var11 > 255.0F) {
         var11 = 255.0F;
      }

      Color var12 = null;

      try {
         var12 = new Color(var9, var10, var11);
      } catch (IllegalArgumentException var15) {
         NumberFormat var14 = NumberFormat.getNumberInstance();
         var15.printStackTrace();
      }

      if (a.trash() == null) {
         Class668.Method1268(false);
      }

      return var12;
   }

   public static String Method2788(int a) {
      if (a != 1) {
         if (a == 2) {
            return "§a";
         }

         if (a == 3) {
            return "§3";
         }

         if (a == 4) {
            return "§4";
         }

         if (a >= 5) {
            return "§e";
         }
      }

      return "§f";
   }

   private static IllegalArgumentException Method2789(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }
}
