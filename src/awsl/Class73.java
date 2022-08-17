package awsl;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class Class73 extends Class193 {
   private BufferedImage Field690;
   private float Field691;

   public void Method1271(BufferedImage a) {
      this.Field690 = a;
   }

   public BufferedImage Method1272() {
      return this.Field690;
   }

   public void Method56(float a) {
      this.Field691 = a;
   }

   public float Method57() {
      return this.Field691;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      Class193.Method1270();
      int a = a.getWidth();
      int a = a.getHeight();
      int a = a.getType();
      WritableRaster a = a.getRaster();
      a = this.Method1263(a, (ColorModel)null);
      WritableRaster a = a.getRaster();
      if (this.Field690 != null) {
         a = Math.min(a, this.Field690.getWidth());
         a = Math.min(a, this.Field690.getWidth());
         int[] a = null;
         int[] a = null;
         int a = 0;
         if (a < a) {
            int[] a = this.Method104(a, 0, a, a, 1, (int[])a);
            int[] a = this.Method104(this.Field690, 0, a, a, 1, (int[])a);
            int a = 0;
            if (a < a) {
               int a = a[a];
               int a = a[a];
               int a = a >> 24 & 255;
               int a = a >> 16 & 255;
               int a = a >> 8 & 255;
               int a = a & 255;
               int a = a >> 24 & 255;
               int a = a >> 16 & 255;
               int a = a >> 8 & 255;
               int a = a & 255;
               a = Class767.Method1687(Class776.Method1718(this.Field691, a, a));
               a = Class767.Method1687(Class776.Method1718(this.Field691, a, a));
               a = Class767.Method1687(Class776.Method1718(this.Field691, a, a));
               a[a] = a << 24 | a << 16 | a << 8 | a;
               ++a;
            }

            this.Method1267(a, 0, a, a, 1, a);
            ++a;
         }
      }

      return a;
   }

   public String toString() {
      return "Effects/Interpolate...";
   }
}
