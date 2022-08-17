package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class196 extends Class193 {
   private float Field1166;
   private float Field1167;
   private int Field1168 = 1;
   private boolean Field1169 = true;

   public Class196() {
   }

   public Class196(float a, float a, int a) {
      this.Field1166 = a;
      this.Field1167 = a;
      this.Field1168 = a;
   }

   public void Method87(boolean a) {
      this.Field1169 = a;
   }

   public boolean Method88() {
      return this.Field1169;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      a = this.Method1263(a, (ColorModel)null);
      int[] a = new int[a * a];
      int[] a = new int[a * a];
      this.Method104(a, 0, 0, a, a, a);
      if (this.Field1169) {
         Class776.Method1727(a, 0, a.length);
      }

      for(int a = 0; a < this.Field1168; ++a) {
         Method1278(a, a, a, a, this.Field1166);
         Method1278(a, a, a, a, this.Field1167);
      }

      Method1279(a, a, a, a, this.Field1166);
      Method1279(a, a, a, a, this.Field1167);
      if (this.Field1169) {
         Class776.Method1728(a, 0, a.length);
      }

      this.Method1267(a, 0, 0, a, a, a);
      return a;
   }

   public static void Method1278(int[] a, int[] a, int a, int a, float a) {
      int a = a - 1;
      Class193.Method1269();
      int a = (int)a;
      int a = 2 * a + 1;
      int[] a = new int[256 * a];
      int a = 0;
      if (a < 256 * a) {
         a[a] = a / a;
         ++a;
      }

      int a = 0;
      int a = 0;
      if (a < a) {
         int a = 0;
         int a = 0;
         int a = 0;
         int a = 0;
         int a = -a;
         int a;
         if (a <= a) {
            a = a[a + Class776.Method1712(a, 0, a - 1)];
            a += a >> 24 & 255;
            a += a >> 16 & 255;
            a += a >> 8 & 255;
            a += a & 255;
            ++a;
         }

         int a = 0;
         int var10000;
         if (a < a) {
            a[a] = a[a] << 24 | a[a] << 16 | a[a] << 8 | a[a];
            a = a + a + 1;
            if (a > a) {
               a = a;
            }

            int a = a - a;
            int a = 0;
            int a = a[a + a];
            int a = a[a + a];
            var10000 = a + ((a >> 24 & 255) - (a >> 24 & 255));
            var10000 = a + ((a & 16711680) - (a & 16711680) >> 16);
            var10000 = a + ((a & '\uff00') - (a & '\uff00') >> 8);
            var10000 = a + ((a & 255) - (a & 255));
            int a = a + a;
            a = a + 1;
         }

         var10000 = a + a;
         ++a;
      }

   }

   public static void Method1279(int[] a, int[] a, int a, int a, float a) {
      a -= (float)((int)a);
      float a = 1.0F / (1.0F + 2.0F * a);
      int a = 0;

      for(int a = 0; a < a; ++a) {
         a[a] = a[0];
         int a = a + a;

         for(int a = 1; a < a - 1; ++a) {
            int a = a + a;
            int a = a[a - 1];
            int a = a[a];
            int a = a[a + 1];
            int a = a >> 24 & 255;
            int a = a >> 16 & 255;
            int a = a >> 8 & 255;
            int a = a & 255;
            int a = a >> 24 & 255;
            int a = a >> 16 & 255;
            int a = a >> 8 & 255;
            int a = a & 255;
            int a = a >> 24 & 255;
            int a = a >> 16 & 255;
            int a = a >> 8 & 255;
            int a = a & 255;
            a = a + (int)((float)(a + a) * a);
            a = a + (int)((float)(a + a) * a);
            a = a + (int)((float)(a + a) * a);
            a = a + (int)((float)(a + a) * a);
            a = (int)((float)a * a);
            a = (int)((float)a * a);
            a = (int)((float)a * a);
            a = (int)((float)a * a);
            a[a] = a << 24 | a << 16 | a << 8 | a;
            a += a;
         }

         a[a] = a[a - 1];
         a += a;
      }

   }

   public void Method56(float a) {
      this.Field1166 = a;
   }

   public float Method57() {
      return this.Field1166;
   }

   public void Method58(float a) {
      this.Field1167 = a;
   }

   public float Method59() {
      return this.Field1167;
   }

   public void Method60(float a) {
      this.Field1166 = this.Field1167 = a;
   }

   public float Method61() {
      return this.Field1166;
   }

   public void Method9(int a) {
      this.Field1168 = a;
   }

   public int Method10() {
      return this.Field1168;
   }

   public String toString() {
      return "Blur/Box Blur...";
   }
}
