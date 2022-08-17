package awsl;

import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class Class239 implements Composite {
   public static final int Field1310 = 0;
   public static final int Field1311 = 1;
   public static final int Field1312 = 2;
   public static final int Field1313 = 3;
   public static final int Field1314 = 4;
   public static final int Field1315 = 5;
   public static final int Field1316 = 6;
   public static final int Field1317 = 7;
   public static final int Field1318 = 8;
   public static final int Field1319 = 9;
   public static final int Field1320 = 10;
   public static final int Field1321 = 11;
   public static final int Field1322 = 12;
   public static final int Field1323 = 13;
   public static final int Field1324 = 14;
   public static final int Field1325 = 15;
   public static final int Field1326 = 16;
   public static final int Field1327 = 17;
   public static final int Field1328 = 18;
   public static final int Field1329 = 19;
   public static final int Field1330 = 20;
   public static final int Field1331 = 21;
   public static final int Field1332 = 22;
   public static final int Field1333 = 23;
   public static final int Field1334 = 24;
   private static final int Field1335 = 0;
   private static final int Field1336 = 24;
   public static String[] Field1337 = new String[]{"Normal", "Add", "Subtract", "Difference", "Multiply", "Darken", "Burn", "Color Burn", "Screen", "Lighten", "Dodge", "Color Dodge", "Hue", "Saturation", "Brightness", "Color", "Overlay", "Soft Light", "Hard Light", "Pin Light", "Exclusion", "Negation", "Average", "Stencil", "Silhouette"};
   protected float Field1338;
   protected int Field1339;

   private Class239(int a) {
      this(a, 1.0F);
   }

   private Class239(int a, float a) {
      if (!(a < 0.0F) && !(a > 1.0F)) {
         if (a > 24) {
            throw new IllegalArgumentException("unknown composite rule");
         } else {
            this.Field1339 = a;
            this.Field1338 = a;
         }
      } else {
         throw new IllegalArgumentException("alpha value out of range");
      }
   }

   public static Composite Method2275(int a, float a) {
      switch (a) {
         case 0:
            return AlphaComposite.getInstance(3, a);
         case 1:
            return new Class246(a);
         case 2:
            return new Class147(a);
         case 3:
            return new Class166(a);
         case 4:
            return new Class158(a);
         case 5:
            return new Class168(a);
         case 6:
            return new Class243(a);
         case 7:
            return new Class242(a);
         case 8:
            return new Class162(a);
         case 9:
            return new Class159(a);
         case 10:
            return new Class177(a);
         case 11:
            return new Class170(a);
         case 12:
            return new Class174(a);
         case 13:
            return new Class163(a);
         case 14:
            return new Class145(a);
         case 15:
            return new Class172(a);
         case 16:
            return new Class156(a);
         case 17:
            return new Class160(a);
         case 18:
            return new Class175(a);
         case 19:
            return new Class164(a);
         case 20:
            return new Class176(a);
         case 21:
            return new Class157(a);
         case 22:
            return new Class245(a);
         case 23:
            return AlphaComposite.getInstance(6, a);
         case 24:
            return AlphaComposite.getInstance(8, a);
         default:
            return new Class239(a, a);
      }
   }

   public CompositeContext Method1356(ColorModel a, ColorModel a, RenderingHints a2) {
      return new Class237(this.Field1339, this.Field1338, a, a);
   }

   public float Method2102() {
      return this.Field1338;
   }

   public int Method2276() {
      return this.Field1339;
   }

   public int Method2103() {
      return Float.floatToIntBits(this.Field1338) * 31 + this.Field1339;
   }

   public boolean Method2104(Object a) {
      if (!(a instanceof Class239)) {
         return false;
      } else {
         Class239 a = (Class239)a;
         if (this.Field1339 != a.Field1339) {
            return false;
         } else {
            return this.Field1338 == a.Field1338;
         }
      }
   }

   private static IllegalArgumentException Method2107(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }
}
