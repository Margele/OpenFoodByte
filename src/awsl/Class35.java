package awsl;

import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class35 extends Class193 {
   private String Field293;
   private Font Field294;
   private Paint Field295;
   private Composite Field296;
   private AffineTransform Field297;

   public Class35() {
   }

   public Class35(String a, Font a, Paint a, Composite a, AffineTransform a) {
      this.Field293 = a;
      this.Field294 = a;
      this.Field296 = a;
      this.Field295 = a;
      this.Field297 = a;
   }

   public void Method496(String a) {
      this.Field293 = a;
   }

   public String Method497() {
      return this.Field293;
   }

   public void Method1289(Composite a) {
      this.Field296 = a;
   }

   public Composite Method1290() {
      return this.Field296;
   }

   public void Method1276(Paint a) {
      this.Field295 = a;
   }

   public Paint Method1277() {
      return this.Field295;
   }

   public void Method3417(Font a) {
      this.Field294 = a;
   }

   public Font Method3418() {
      return this.Field294;
   }

   public void Method1291(AffineTransform a) {
      this.Field297 = a;
   }

   public AffineTransform Method1292() {
      return this.Field297;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      a = this.Method1263(a, (ColorModel)null);
      Graphics2D a = a.createGraphics();
      a.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      if (this.Field294 != null) {
         a.setFont(this.Field294);
      }

      if (this.Field297 != null) {
         a.setTransform(this.Field297);
      }

      if (this.Field296 != null) {
         a.setComposite(this.Field296);
      }

      if (this.Field295 != null) {
         a.setPaint(this.Field295);
      }

      if (this.Field293 != null) {
         a.drawString(this.Field293, 10, 100);
      }

      a.dispose();
      return a;
   }
}
