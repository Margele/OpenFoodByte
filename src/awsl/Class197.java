package awsl;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Class197 extends Class193 {
   private int Field1170;
   private int Field1171;
   private int Field1172;
   private int Field1173;
   private Paint Field1174;

   public Class197() {
   }

   public Class197(int a, int a, int a, int a, Paint a) {
      this.Field1170 = a;
      this.Field1172 = a;
      this.Field1171 = a;
      this.Field1173 = a;
      this.Field1174 = a;
   }

   public void Method9(int a) {
      this.Field1170 = a;
   }

   public int Method10() {
      return this.Field1170;
   }

   public void Method11(int a) {
      this.Field1171 = a;
   }

   public int Method12() {
      return this.Field1171;
   }

   public void Method13(int a) {
      this.Field1172 = a;
   }

   public int Method14() {
      return this.Field1172;
   }

   public void Method15(int a) {
      this.Field1173 = a;
   }

   public int Method16() {
      return this.Field1173;
   }

   public void Method1276(Paint a) {
      this.Field1174 = a;
   }

   public Paint Method1277() {
      return this.Field1174;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = a.getWidth();
      int a = a.getHeight();
      a = new BufferedImage(a + this.Field1170 + this.Field1171, a + this.Field1172 + this.Field1173, a.getType());
      Graphics2D a = a.createGraphics();
      if (this.Field1174 != null) {
         a.setPaint(this.Field1174);
         if (this.Field1170 > 0) {
            a.fillRect(0, 0, this.Field1170, a);
         }

         if (this.Field1171 > 0) {
            a.fillRect(a - this.Field1171, 0, this.Field1171, a);
         }

         if (this.Field1172 > 0) {
            a.fillRect(this.Field1170, 0, a - this.Field1170 - this.Field1171, this.Field1172);
         }

         if (this.Field1173 > 0) {
            a.fillRect(this.Field1170, a - this.Field1173, a - this.Field1170 - this.Field1171, this.Field1173);
         }
      }

      a.drawRenderedImage(a, AffineTransform.getTranslateInstance((double)this.Field1170, (double)this.Field1171));
      a.dispose();
      return a;
   }

   public String toString() {
      return "Distort/Border...";
   }
}
