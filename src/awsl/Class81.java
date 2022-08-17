package awsl;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Class81 extends Class193 {
   private float Field707 = 0.0F;
   private float Field708 = 0.0F;
   private float Field709 = 0.0F;
   private BufferedImage Field710;
   private BufferedImage Field711;

   public void Method56(float a) {
      this.Field707 = a;
   }

   public float Method57() {
      return this.Field707;
   }

   public void Method58(float a) {
      this.Field708 = a;
   }

   public float Method59() {
      return this.Field708;
   }

   public void Method60(float a) {
      this.Field709 = a;
   }

   public float Method61() {
      return this.Field709;
   }

   public void Method1271(BufferedImage a) {
      this.Field710 = a;
   }

   public BufferedImage Method1272() {
      return this.Field710;
   }

   public void Method1273(BufferedImage a) {
      this.Field711 = a;
   }

   public BufferedImage Method1274() {
      return this.Field711;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      Class193.Method1269();
      int a = a.getHeight();
      int a = a.getType();
      WritableRaster a = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      WritableRaster a = a.getRaster();
      if (this.Field710 != null && this.Field711 != null) {
         float[] a = null;
         float[] a = null;
         int[] a = null;
         int[] a = null;
         int[] a = null;
         int a = 0;
         if (a < a) {
            int[] a = this.Method104(a, 0, a, a, 1, (int[])a);
            int[] a = this.Method104(this.Field710, 0, a, a, 1, (int[])a);
            int[] a = this.Method104(this.Field711, 0, a, a, 1, (int[])a);
            int a = 0;
            if (a < a) {
               int a = a[a];
               int a = a[a];
               int a = a[a];
               int a = a >> 16 & 255;
               int a = a >> 8 & 255;
               int a = a & 255;
               int a = a >> 16 & 255;
               int a = a >> 8 & 255;
               int a = a & 255;
               float[] a = Color.RGBtoHSB(a, a, a, (float[])a);
               float[] a = Color.RGBtoHSB(a, a, a, (float[])a);
               if (Math.abs(a[0] - a[0]) < this.Field707 && Math.abs(a[1] - a[1]) < this.Field708 && Math.abs(a[2] - a[2]) < this.Field709) {
                  a[a] = a;
               }

               a[a] = a;
               ++a;
            }

            this.Method1267(a, 0, a, a, 1, a);
            ++a;
         }
      }

      return a;
   }

   public String toString() {
      return "Keying/Key...";
   }
}
