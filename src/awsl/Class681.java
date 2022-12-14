package awsl;

import java.awt.Color;

public enum Class681 {
   public static final Class681 BLACK = new Class681("BLACK", 0, -16711423);
   public static final Class681 BLUE = new Class681("BLUE", 1, -12028161);
   public static final Class681 DARKBLUE = new Class681("DARKBLUE", 2, -12621684);
   public static final Class681 GREEN = new Class681("GREEN", 3, -9830551);
   public static final Class681 DARKGREEN = new Class681("DARKGREEN", 4, -9320847);
   public static final Class681 WHITE = new Class681("WHITE", 5, -65794);
   public static final Class681 AQUA = new Class681("AQUA", 6, -7820064);
   public static final Class681 DARKAQUA = new Class681("DARKAQUA", 7, -12621684);
   public static final Class681 GREY = new Class681("GREY", 8, -9868951);
   public static final Class681 DARKGREY = new Class681("DARKGREY", 9, -14342875);
   public static final Class681 RED = new Class681("RED", 10, -65536);
   public static final Class681 DARKRED = new Class681("DARKRED", 11, -8388608);
   public static final Class681 ORANGE = new Class681("ORANGE", 12, -29696);
   public static final Class681 DARKORANGE = new Class681("DARKORANGE", 13, -2263808);
   public static final Class681 YELLOW = new Class681("YELLOW", 14, -256);
   public static final Class681 DARKYELLOW = new Class681("DARKYELLOW", 15, -2702025);
   public static final Class681 MAGENTA = new Class681("MAGENTA", 16, -18751);
   public static final Class681 DARKMAGENTA = new Class681("DARKMAGENTA", 17, -2252579);
   public int Field2962;

   public static Class681[] Method2693() {
      return (Class681[])Field2963.clone();
   }

   public static Class681 Method2694(String a) {
      return (Class681)Enum.valueOf(Class681.class, a);
   }

   private Class681(int a) {
      this.Field2962 = a;
   }

   public static int Method2695(Color a) {
      return Method2696(a.getRed(), a.getGreen(), a.getBlue(), a.getAlpha());
   }

   public static int Method1612(int a) {
      return Method2696(a, a, a, 255);
   }

   public static int Method1614(int a, int a) {
      return Method2696(a, a, a, a);
   }

   public static int Method3(int a, int a, int a) {
      return Method2696(a, a, a, 255);
   }

   public static int Method2696(int a, int a, int a, int a) {
      int var4 = 0;
      var4 |= a << 24;
      var4 |= a << 16;
      var4 |= a << 8;
      var4 |= a;
      return var4;
   }

   public static Color Method2697(int a) {
      int var1 = a >> 16 & 255;
      int var2 = a >> 8 & 255;
      int var3 = a & 255;
      int var4 = a >> 24 & 255;
      return new Color(var1, var2, var3, var4);
   }

   public static Color Method2698(int a, int a) {
      int var2 = a >> 16 & 255;
      int var3 = a >> 8 & 255;
      int var4 = a & 255;
      return new Color(var2, var3, var4, a);
   }

   public static int Method2699(int a, int a) {
      float var2 = (float)(a >> 24 & 255);
      float var3 = Math.max((float)(a >> 16 & 255) - (float)(a >> 16 & 255) / (100.0F / (float)a), 0.0F);
      float var4 = Math.max((float)(a >> 8 & 255) - (float)(a >> 8 & 255) / (100.0F / (float)a), 0.0F);
      float var5 = Math.max((float)(a & 255) - (float)(a & 255) / (100.0F / (float)a), 0.0F);
      return (int)((float)(((int)var2 << 24) + ((int)var3 << 16) + ((int)var4 << 8)) + var5);
   }

   public static int Method900(int a, float a) {
      Color var2 = new Color(a);
      float var3 = 0.003921569F * (float)var2.getRed();
      float var4 = 0.003921569F * (float)var2.getGreen();
      float var5 = 0.003921569F * (float)var2.getBlue();
      return (new Color(var3, var4, var5, a)).getRGB();
   }
}
