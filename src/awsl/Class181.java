package awsl;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.util.Hashtable;

public class Class181 extends Class193 {
   private int Field1130;
   private int Field1131;
   private int Field1132;
   private int Field1133;

   public Class181() {
      this(0, 0, 32, 32);
   }

   public Class181(int a, int a, int a, int a) {
      this.Field1130 = a;
      this.Field1131 = a;
      this.Field1132 = a;
      this.Field1133 = a;
   }

   public void Method9(int a) {
      this.Field1130 = a;
   }

   public int Method10() {
      return this.Field1130;
   }

   public void Method11(int a) {
      this.Field1131 = a;
   }

   public int Method12() {
      return this.Field1131;
   }

   public void Method13(int a) {
      this.Field1132 = a;
   }

   public int Method14() {
      return this.Field1132;
   }

   public void Method15(int a) {
      this.Field1133 = a;
   }

   public int Method16() {
      return this.Field1133;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int var3 = a.getWidth();
      int var4 = a.getHeight();
      ColorModel var5 = a.getColorModel();
      a = new BufferedImage(var5, var5.createCompatibleWritableRaster(this.Field1132, this.Field1133), var5.isAlphaPremultiplied(), (Hashtable)null);
      Graphics2D var6 = a.createGraphics();
      var6.drawRenderedImage(a, AffineTransform.getTranslateInstance((double)(-this.Field1130), (double)(-this.Field1131)));
      var6.dispose();
      return a;
   }

   public String toString() {
      return "Distort/Crop";
   }
}
