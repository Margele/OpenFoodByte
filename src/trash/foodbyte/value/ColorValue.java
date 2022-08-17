package trash.foodbyte.value;

import awsl.Class446;
import awsl.Class447;
import awsl.Class681;
import java.awt.Color;

public class ColorValue extends Class447 {
   private Color Field2126;
   private boolean Field2127;
   private double Field2128;

   public double Method2435() {
      return this.Field2128;
   }

   public void Method2436(double a) {
      this.Field2128 = a;
   }

   public boolean Method2437() {
      return this.Field2127;
   }

   public void Method2438(boolean a) {
      this.Field2127 = a;
   }

   public ColorValue(String a, String a, Color a, boolean a3) {
      this.Field2127 = false;
      this.Field2128 = 1.0;
      this.Field2117 = a;
      this.Field2118 = a;
      this.Field2126 = a;
      Class446.Method2762(this);
   }

   public ColorValue(String a, String a, Color a, String a) {
      this(a, a, a, false);
      this.Field2119 = a;
   }

   public ColorValue(String a, String a, Color a) {
      this(a, a, a, false);
   }

   public void Method2439(Color a) {
      this.Field2126 = a;
   }

   public void Method2440(int a) {
      this.Field2126 = Class681.Method2697(a);
   }

   public Color Method2441() {
      return this.Field2126;
   }

   public int Method2442() {
      return this.Method2444().getRGB();
   }

   public float[] Method2443() {
      Color a = this.Field2126;
      return Color.RGBtoHSB(a.getRed(), a.getGreen(), a.getBlue(), (float[])null);
   }

   public Color Method2444() {
      return this.Method2445(0L);
   }

   public Color Method2445(long a) {
      if (this.Field2127) {
         float a = (float)(Math.ceil((double)System.currentTimeMillis() / 14.1 + (double)a) % 360.0 / 360.0);
         float[] a = this.Method2443();
         return Class681.Method2698(Color.getHSBColor(a, a[1], a[2]).getRGB(), this.Field2126.getAlpha());
      } else {
         return this.Field2126;
      }
   }

   public void Method2446(int a) {
      Color a = this.Field2126;
      Color a = new Color(a, a.getGreen(), a.getBlue(), a.getAlpha());
      this.Field2126 = a;
   }

   public void Method2447(int a) {
      Color a = this.Field2126;
      Color a = new Color(a.getRed(), a, a.getBlue(), a.getAlpha());
      this.Field2126 = a;
   }

   public void Method2448(int a) {
      Color a = this.Field2126;
      Color a = new Color(a.getRed(), a.getGreen(), a, a.getAlpha());
      this.Field2126 = a;
   }

   public void Method2449(int a) {
      Color a = this.Field2126;
      Color a = new Color(a.getRed(), a.getGreen(), a.getBlue(), a);
      this.Field2126 = a;
   }

   public int Method2450() {
      return this.Method2444().getRed();
   }

   public int Method2451() {
      return this.Method2444().getGreen();
   }

   public int Method2452() {
      return this.Method2444().getBlue();
   }

   public int Method2453() {
      return this.Method2444().getAlpha();
   }

   public Object Method2454() {
      return this.Method2441();
   }
}
