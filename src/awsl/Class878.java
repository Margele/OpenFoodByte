package awsl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.util.Random;

public class Class878 extends Class193 {
   private float Field3822 = 0.5F;
   private float Field3823 = 0.5F;
   private float Field3824;
   private float Field3825;
   private float Field3826;
   private float Field3827;
   private float Field3828 = 1.0F;
   private float Field3829 = 1.0F;
   private int Field3830 = 5;
   private int Field3831;

   public void Method56(float a) {
      this.Field3825 = a;
   }

   public float Method57() {
      return this.Field3825;
   }

   public void Method58(float a) {
      this.Field3824 = a;
   }

   public float Method59() {
      return this.Field3824;
   }

   public void Method60(float a) {
      this.Field3826 = a;
   }

   public float Method61() {
      return this.Field3826;
   }

   public void Method164(float a) {
      this.Field3827 = a;
   }

   public float Method165() {
      return this.Field3827;
   }

   public void Method166(float a) {
      this.Field3828 = a;
   }

   public float Method167() {
      return this.Field3828;
   }

   public void Method168(float a) {
      this.Field3829 = a;
   }

   public float Method169() {
      return this.Field3829;
   }

   public void Method170(float a) {
      this.Field3822 = a;
   }

   public float Method171() {
      return this.Field3822;
   }

   public void Method172(float a) {
      this.Field3823 = a;
   }

   public float Method173() {
      return this.Field3823;
   }

   public void Method330(Point2D a) {
      this.Field3822 = (float)a.getX();
      this.Field3823 = (float)a.getY();
   }

   public Point2D Method331() {
      return new Point2D.Float(this.Field3822, this.Field3823);
   }

   public void Method9(int a) {
      this.Field3830 = a;
   }

   public int Method10() {
      return this.Field3830;
   }

   public void Method11(int a) {
      this.Field3831 = a;
   }

   public int Method12() {
      return this.Field3831;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = Class193.Method1269();
      a = this.Method1263(a, (ColorModel)null);
      float a = (float)a.getWidth();
      float a = (float)a.getHeight();
      float a = (float)a.getWidth() * this.Field3822;
      float a = (float)a.getHeight() * this.Field3823;
      float a = (float)Math.sqrt((double)(a * a + a * a));
      int a = this.Field3830 * this.Field3830;
      Class700[] a = new Class700[a];
      float[] a = new float[a];
      float[] a = new float[a];
      float[] a = new float[a];
      Graphics2D a = a.createGraphics();
      Random a = new Random(0L);
      float a = 0.0F;
      float a = 0.0F;
      int a = 0;
      Rectangle a;
      if (a < this.Field3830) {
         int a = (int)a * a / this.Field3830;
         int a = (int)a * (a + 1) / this.Field3830;
         int a = 0;
         if (a < this.Field3830) {
            int a = a * this.Field3830 + a;
            int a = (int)a * a / this.Field3830;
            int a = (int)a * (a + 1) / this.Field3830;
            a[a] = (float)this.Field3831 * a.nextFloat();
            a[a] = (float)this.Field3831 * a.nextFloat();
            a[a] = 0.0F;
            a[a] = 0.0F;
            a[a] = (float)this.Field3831 * (2.0F * a.nextFloat() - 1.0F);
            a = new Rectangle(a, a, a - a, a - a);
            a[a] = new Class700();
            a[a].Field3025 = a;
            a[a].Field3018 = (float)(a + a) * 0.5F;
            a[a].Field3019 = (float)(a + a) * 0.5F;
            a[a].Field3020 = a - (a - (float)a);
            a[a].Field3021 = a - (a - (float)a);
            a[a].Field3022 = (float)(a - a);
            a[a].Field3023 = (float)(a - a);
            ++a;
         }

         ++a;
      }

      int a = 0;
      if (a < a) {
         float a = (float)a / (float)a;
         double a = (double)(a * 2.0F) * Math.PI;
         float a = this.Field3825 * a * (float)Math.cos(a);
         float a = this.Field3825 * a * (float)Math.sin(a);
         Class700 a = a[a];
         a = a.Field3025.getBounds();
         AffineTransform a = a.getTransform();
         a = a.Field3018 + this.Field3825 * a.Field3020;
         a = a.Field3019 + this.Field3825 * a.Field3021;
         a.translate((double)a, (double)a);
         a.rotate((double)(this.Field3825 * a[a]));
         a.setColor(Color.getHSBColor(a, 1.0F, 1.0F));
         Shape a = a.getClip();
         a.clip(a.Field3025);
         a.drawImage(a, 0, 0, (ImageObserver)null);
         a.setClip(a);
         a.setTransform(a);
         a = a + 1;
      }

      a.dispose();
      return a;
   }

   public String toString() {
      return "Transition/Shatter...";
   }
}
