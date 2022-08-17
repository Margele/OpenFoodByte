package awsl;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Class195 extends Class193 {
   private float Field1162 = 0.0F;
   private float Field1163 = 0.0F;
   private float Field1164 = 0.0F;
   private int Field1165;

   public void Method56(float a) {
      this.Field1162 = a;
   }

   public float Method57() {
      return this.Field1162;
   }

   public void Method58(float a) {
      this.Field1163 = a;
   }

   public float Method59() {
      return this.Field1163;
   }

   public void Method60(float a) {
      this.Field1164 = a;
   }

   public float Method61() {
      return this.Field1164;
   }

   public void Method9(int a) {
      this.Field1165 = a;
   }

   public int Method10() {
      return this.Field1165;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int a = a.getWidth();
      int a = a.getHeight();
      int a = a.getType();
      WritableRaster a = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      WritableRaster a = a.getRaster();
      float[] a = null;
      float[] a = null;
      int a = this.Field1165;
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      float[] a = Color.RGBtoHSB(a, a, a, (float[])a);
      int[] a = null;
      int a = 0;
      if (a < a) {
         int[] a = this.Method104(a, 0, a, a, 1, (int[])a);
         int a = 0;
         if (a < a) {
            int a = a[a];
            int a = a >> 16 & 255;
            int a = a >> 8 & 255;
            int a = a & 255;
            float[] a = Color.RGBtoHSB(a, a, a, (float[])a);
            if (Math.abs(a[0] - a[0]) < this.Field1162 && Math.abs(a[1] - a[1]) < this.Field1163 && Math.abs(a[2] - a[2]) < this.Field1164) {
               a[a] = a & 16777215;
            }

            a[a] = a;
            ++a;
         }

         this.Method1267(a, 0, a, a, 1, a);
         ++a;
      }

      return a;
   }

   public String toString() {
      return "Keying/Chroma Key...";
   }
}
