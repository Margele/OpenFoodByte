package awsl;

import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class185 extends Class193 {
   private Composite Field1144;
   private AffineTransform Field1145;

   public Class185() {
   }

   public Class185(Composite a) {
      this.Field1144 = a;
   }

   public Class185(Composite a, AffineTransform a) {
      this.Field1144 = a;
      this.Field1145 = a;
   }

   public void Method1289(Composite a) {
      this.Field1144 = a;
   }

   public Composite Method1290() {
      return this.Field1144;
   }

   public void Method1291(AffineTransform a) {
      this.Field1145 = a;
   }

   public AffineTransform Method1292() {
      return this.Field1145;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      a = this.Method1263(a, (ColorModel)null);
      Graphics2D var3 = a.createGraphics();
      var3.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      var3.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      var3.setComposite(this.Field1144);
      var3.drawRenderedImage(a, this.Field1145);
      var3.dispose();
      return a;
   }

   public String toString() {
      return "Composite";
   }
}
