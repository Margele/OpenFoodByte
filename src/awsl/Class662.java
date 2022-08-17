package awsl;

import java.awt.Color;
import java.util.function.Supplier;

public enum Class662 {
   public static final Class662 GREEN = new Class662("GREEN", 0, Class662::Method2406);
   public static final Class662 WHITE = new Class662("WHITE", 1, Class662::Method2405);
   public static final Class662 PURPLE = new Class662("PURPLE", 2, Class662::Method2404);
   public static final Class662 DARK_PURPLE = new Class662("DARK_PURPLE", 3, Class662::Method2403);
   public static final Class662 BLUE = new Class662("BLUE", 4, Class662::Method2402);
   private final Supplier Field2932;
   private static final Class662[] Field2933 = new Class662[]{GREEN, WHITE, PURPLE, DARK_PURPLE, BLUE};

   public static Class662[] Method2397() {
      return (Class662[])Field2933.clone();
   }

   public static Class662 Method2398(String a) {
      return (Class662)Enum.valueOf(Class662.class, a);
   }

   private Class662(Supplier a) {
      this.Field2932 = a;
   }

   public static Color Method2399(Color a) {
      return Method2400(a, 2, 100);
   }

   public static Color Method2400(Color a, int a, int a) {
      float[] var3 = new float[3];
      Color.RGBtoHSB(a.getRed(), a.getGreen(), a.getBlue(), var3);
      float var4 = Math.abs(((float)(System.currentTimeMillis() % 2000L) / 1000.0F + (float)a / (float)a * 2.0F) % 2.0F - 1.0F);
      var4 = 0.5F + 0.5F * var4;
      var3[2] = var4 % 2.0F;
      return new Color(Color.HSBtoRGB(var3[0], var3[1], var3[2]));
   }

   public Color Method2401() {
      return (Color)this.Field2932.get();
   }

   private static Color Method2402() {
      return new Color(116, 202, 255);
   }

   private static Color Method2403() {
      return new Color(133, 46, 215);
   }

   private static Color Method2404() {
      return new Color(198, 139, 255);
   }

   private static Color Method2405() {
      return Color.WHITE;
   }

   private static Color Method2406() {
      return new Color(0, 255, 138);
   }
}
