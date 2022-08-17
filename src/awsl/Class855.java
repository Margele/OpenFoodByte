package awsl;

import java.awt.Rectangle;

public class Class855 extends Class798 {
   private short Method3529(short a, short a, short a) {
      if (a < a) {
         ++a;
      }

      if (a < a) {
         ++a;
      }

      if (a > a) {
         --a;
      }

      if (a > a) {
         --a;
      }

      return a;
   }

   protected int[] Method714(int a, int a, int[] a, Rectangle a3) {
      Class193.Method1269();
      int a = 0;
      short[][] a = new short[3][a];
      short[][] a = new short[3][a];
      short[][] a = new short[3][a];
      int[] a = new int[a * a];
      int a = 0;
      if (a < a) {
         int a = a[a];
         a[1][a] = (short)(a >> 16 & 255);
         a[1][a] = (short)(a >> 8 & 255);
         a[1][a] = (short)(a & 255);
         ++a;
      }

      int a = 0;
      if (a < a) {
         boolean a = a < a - 1;
         int a = a + a;
         int a;
         if (a < a - 1) {
            a = 0;
            if (a < a) {
               int a = a[a++];
               a[2][a] = (short)(a >> 16 & 255);
               a[2][a] = (short)(a >> 8 & 255);
               a[2][a] = (short)(a & 255);
               ++a;
            }
         }

         int a = 0;
         if (a < a) {
            boolean a = a < a - 1;
            short a = a[1][a];
            short a = a[1][a];
            short a = a[1][a];
            int a = a - 1;
            int a = a + 1;
            a = this.Method3529(a, a[0][a], a[2][a]);
            a = this.Method3529(a, a[0][a], a[2][a]);
            a = this.Method3529(a, a[0][a], a[2][a]);
            a = this.Method3529(a, a[1][a], a[1][a]);
            a = this.Method3529(a, a[1][a], a[1][a]);
            a = this.Method3529(a, a[1][a], a[1][a]);
            a = this.Method3529(a, a[0][a], a[2][a]);
            a = this.Method3529(a, a[0][a], a[2][a]);
            a = this.Method3529(a, a[0][a], a[2][a]);
            a = this.Method3529(a, a[2][a], a[0][a]);
            a = this.Method3529(a, a[2][a], a[0][a]);
            a = this.Method3529(a, a[2][a], a[0][a]);
            a[a] = a[a] & -16777216 | a << 16 | a << 8 | a;
            ++a;
            a = a + 1;
         }

         short[] a = a[0];
         a[0] = a[1];
         a[1] = a[2];
         a[2] = a;
         a = a[0];
         a[0] = a[1];
         a[1] = a[2];
         a[2] = a;
         a = a[0];
         a[0] = a[1];
         a[1] = a[2];
         a[2] = a;
         a = a + 1;
      }

      return a;
   }

   public String toString() {
      return "Blur/Despeckle...";
   }
}
