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
      int a = a.getRed();
      int a = a.getGreen();
      int a = a.getBlue();
      int a = a.getAlpha();
      int a = (int)(1.0 / (1.0 - (double)a));
      return new Color(a, a, a, a);
   }

   public static Color Method2778(Color a, double a) {
      return new Color(Math.max((int)((double)a.getRed() * a), 0), Math.max((int)((double)a.getGreen() * a), 0), Math.max((int)((double)a.getBlue() * a), 0), a.getAlpha());
   }

   public static int Method2779(float a, float a, float a) {
      float a = 4500.0F;
      float a = (float)(System.currentTimeMillis() % 4500L) / 4500.0F;
      return Color.HSBtoRGB(a - a / 54.0F, a, a);
   }

   public static int Method2780(float a, float a, float a) {
      return Color.HSBtoRGB(a / 54.0F, a, a);
   }

   public Color Method2781(Color a, Color a, double a) {
      float a = (float)System.currentTimeMillis();
      a += (double)a;
      double a;
      int a;
      if (a > 1.0) {
         a = a % 1.0;
         a = (int)a;
         a = a % 2 == 0 ? a : 1.0 - a;
      }

      a = 1.0 - a;
      a = (int)((double)a.getRed() * a + (double)a.getRed() * a);
      int a = (int)((double)a.getGreen() * a + (double)a.getGreen() * a);
      int a = (int)((double)a.getBlue() * a + (double)a.getBlue() * a);
      return new Color(a, a, a);
   }

   public static int Method2782() {
      float a = (float)(System.currentTimeMillis() % 10000L) / 10000.0F;
      return Color.HSBtoRGB(a, 0.5F, 1.0F);
   }

   public static String Method2783(String a) {
      return Field1476.matcher(a).replaceAll("");
   }

   public static Color Method2784(Color a, Color a, double a) {
      double a = 1.0 - a;
      int a = (int)((double)a.getRed() * a + (double)a.getRed() * a);
      int a = (int)((double)a.getGreen() * a + (double)a.getGreen() * a);
      int a = (int)((double)a.getBlue() * a + (double)a.getBlue() * a);
      return new Color(a, a, a);
   }

   public static Color Method2785(float[] a, Color[] a1, float a2) {
      throw new IllegalArgumentException("Fractions can't be null");
   }

   public static int[] Method2786(float[] a, float a) {
      int[] a = new int[2];

      int a;
      for(a = 0; a < a.length && a[a] <= a; ++a) {
      }

      if (a >= a.length) {
         a = a.length - 1;
      }

      a[0] = a - 1;
      a[1] = a;
      return a;
   }

   public static Color Method2787(Color a, Color a, double a) {
      float a = (float)a;
      float a = 1.0F - a;
      float[] a = new float[3];
      float[] a = new float[3];
      Class668.Method1270();
      a.getColorComponents(a);
      a.getColorComponents(a);
      float a = a[0] * a + a[0] * a;
      float a = a[1] * a + a[1] * a;
      float a = a[2] * a + a[2] * a;
      if (a < 0.0F) {
         a = 0.0F;
      }

      if (a > 255.0F) {
         a = 255.0F;
      }

      if (a < 0.0F) {
         a = 0.0F;
      }

      if (a > 255.0F) {
         a = 255.0F;
      }

      if (a < 0.0F) {
         a = 0.0F;
      }

      if (a > 255.0F) {
         a = 255.0F;
      }

      Color a = null;

      try {
         a = new Color(a, a, a);
      } catch (IllegalArgumentException var15) {
         NumberFormat a = NumberFormat.getNumberInstance();
         var15.printStackTrace();
      }

      if (a.trash() == null) {
         Class668.Method1268(false);
      }

      return a;
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
