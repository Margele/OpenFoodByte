package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class Class84 extends Class193 {
   public static final int Field714 = 1;
   public static final int Field715 = 2;
   public static final int Field716 = 3;
   public static final int Field717 = 4;
   public static final int Field718 = 5;
   public static final int Field719 = 6;
   private int Field720;
   private int Field721;
   private int Field722;
   private int Field723;
   private int Field724;

   public Class84() {
      this(3);
   }

   public Class84(int a) {
      this.Field720 = a;
   }

   public void Method9(int a) {
      this.Field720 = a;
   }

   public int Method10() {
      return this.Field720;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      int a = a.getType();
      WritableRaster a = a.getRaster();
      int[] a = this.Method104(a, 0, 0, a, a, (int[])null);
      byte a = 0;
      Class193.Method1270();
      int a = 0;
      int a = false;
      int a = false;
      int a = a;
      int a = a;
      int var10000;
      switch (this.Field720) {
         case 1:
            var10000 = a - (a + a);
         case 2:
            var10000 = a - (a + a);
         case 3:
         case 4:
            var10000 = a - (a + a);
         case 5:
            a = a;
            a = a;
            var10000 = a - (a + a);
         case 6:
            var10000 = a - (a + a);
            var10000 = a - (a + a);
         default:
            int[] a = new int[a * a];
            int a = 0;
            if (a < a) {
               int a = 0;
               if (a < a) {
                  int a = a * a + a;
                  int a = a;
                  int a = a;
                  switch (this.Field720) {
                     case 1:
                        a = a - a - 1;
                     case 2:
                        a = a - a - 1;
                     case 3:
                     case 4:
                        a = a - a - 1;
                     case 5:
                        a = a - a - 1;
                     case 6:
                        a = a - a - 1;
                        a = a - a - 1;
                     default:
                        int a = a * a + a;
                        a[a] = a[a];
                        ++a;
                  }
               }

               ++a;
            }

            ColorModel a = a.getColorModel();
            a = new BufferedImage(a, a.createCompatibleWritableRaster(a, a), a.isAlphaPremultiplied(), (Hashtable)null);
            WritableRaster a = a.getRaster();
            this.Method1267(a, 0, 0, a, a, a);
            return a;
      }
   }

   public String toString() {
      switch (this.Field720) {
         case 1:
            return "Flip Horizontal";
         case 2:
            return "Flip Vertical";
         case 3:
            return "Flip Diagonal";
         case 4:
            return "Rotate 90";
         case 5:
            return "Rotate -90";
         case 6:
            return "Rotate 180";
         default:
            return "Flip";
      }
   }
}
