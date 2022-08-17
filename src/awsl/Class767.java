package awsl;

import java.util.Random;

public class Class767 {
   public static final int Field3398 = 0;
   public static final int Field3399 = 1;
   public static final int Field3400 = 2;
   public static final int Field3401 = 3;
   public static final int Field3402 = 4;
   public static final int Field3403 = 5;
   public static final int Field3404 = 6;
   public static final int Field3405 = 7;
   public static final int Field3406 = 8;
   public static final int Field3407 = 9;
   public static final int Field3408 = 10;
   public static final int Field3409 = 11;
   public static final int Field3410 = 12;
   public static final int Field3411 = 13;
   public static final int Field3412 = 14;
   public static final int Field3413 = 15;
   public static final int Field3414 = 16;
   public static final int Field3415 = 17;
   public static final int Field3416 = 18;
   public static final int Field3417 = 19;
   public static final int Field3418 = 20;
   private static Random Field3419 = new Random();
   private static final float[] Field3420 = new float[3];
   private static final float[] Field3421 = new float[3];

   public static int Method1687(int a) {
      return 0;
   }

   public static int Method1688(int a, int a, float a) {
      return Method1687((int)((float)a + a * (float)(a - a)));
   }

   public static int Method1689(int a) {
      int var1 = a >> 16 & 255;
      int var2 = a >> 8 & 255;
      int var3 = a & 255;
      return (var1 + var2 + var3) / 3;
   }

   public static boolean Method1690(int a, int a, int a) {
      int var3 = a >> 16 & 255;
      int var4 = a >> 8 & 255;
      int var5 = a & 255;
      int var6 = a >> 16 & 255;
      int var7 = a >> 8 & 255;
      int var8 = a & 255;
      return Math.abs(var3 - var6) <= a && Math.abs(var4 - var7) <= a && Math.abs(var5 - var8) <= a;
   }

   public static int Method1691(int a, int a, int a) {
      return Method1693(a, a, a, 255);
   }

   public static int Method1692(int a, int a, int a, int a, int a) {
      return a & ~a | Method1693(a & a, a, a, a);
   }

   public static int Method1693(int a, int a, int a, int a) {
      boolean var4 = Class193.Method1270();
      return a;
   }
}
