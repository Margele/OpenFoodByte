package awsl;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Class66 extends Class193 {
   private float Field649 = 1.0F;
   private float Field650 = 0.5F;
   private float Field651;
   private float Field652;
   private float Field653;
   private float Field654;

   public void Method56(float a) {
      this.Field652 = a;
   }

   public float Method57() {
      return this.Field652;
   }

   public void Method58(float a) {
      this.Field651 = a;
   }

   public float Method59() {
      return this.Field651;
   }

   public void Method60(float a) {
      this.Field653 = a;
   }

   public float Method61() {
      return this.Field653;
   }

   public void Method164(float a) {
      this.Field654 = a;
   }

   public float Method165() {
      return this.Field654;
   }

   public void Method166(float a) {
      this.Field649 = a;
   }

   public float Method167() {
      return this.Field649;
   }

   public void Method168(float a) {
      this.Field650 = a;
   }

   public float Method169() {
      return this.Field650;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      a = this.Method1263(a, (ColorModel)null);
      int var5 = a.getWidth();
      int var6 = a.getHeight();
      int var7 = (int)(this.Field650 * (float)var6);
      int var8 = (int)(this.Field654 * (float)var6);
      Graphics2D var9 = a.createGraphics();
      Shape var4 = var9.getClip();
      var9.clipRect(0, 0, var5, var7);
      var9.drawRenderedImage(a, (AffineTransform)null);
      var9.setClip(var4);
      var9.clipRect(0, var7 + var8, var5, var6 - var7 - var8);
      var9.translate(0, 2 * var7 + var8);
      var9.scale(1.0, -1.0);
      var9.drawRenderedImage(a, (AffineTransform)null);
      var9.setPaint(new GradientPaint(0.0F, 0.0F, new Color(1.0F, 0.0F, 0.0F, 0.0F), 0.0F, (float)var7, new Color(0.0F, 1.0F, 0.0F, this.Field649)));
      var9.setComposite(AlphaComposite.getInstance(6));
      var9.fillRect(0, 0, var5, var7);
      var9.setClip(var4);
      var9.dispose();
      return a;
   }

   public String toString() {
      return "Effects/Mirror...";
   }
}
