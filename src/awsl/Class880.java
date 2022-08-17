package awsl;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.util.Random;

public class Class880 extends Class193 {
   private float Field3839 = 0.1F;
   private float Field3840;
   private float Field3841 = 1.0F;
   private float Field3842 = 0.5F;
   private float Field3843 = 0.5F;
   private int Field3844 = -1;
   private int Field3845 = 0;

   public void Method56(float a) {
      this.Field3840 = a;
   }

   public float Method57() {
      return this.Field3840;
   }

   public void Method58(float a) {
      this.Field3841 = a;
   }

   public float Method59() {
      return this.Field3841;
   }

   public void Method60(float a) {
      this.Field3839 = a;
   }

   public float Method61() {
      return this.Field3839;
   }

   public void Method164(float a) {
      this.Field3843 = a;
   }

   public float Method165() {
      return this.Field3843;
   }

   public void Method166(float a) {
      this.Field3842 = a;
   }

   public float Method167() {
      return this.Field3842;
   }

   public void Method9(int a) {
      this.Field3844 = a;
   }

   public int Method10() {
      return this.Field3844;
   }

   public void Method11(int a) {
      this.Field3845 = a;
   }

   public int Method12() {
      return this.Field3845;
   }

   public BufferedImage Method62(BufferedImage a, BufferedImage a) {
      int a = Class193.Method1269();
      a = this.Method1263(a, (ColorModel)null);
      int a = a.getWidth();
      int a = a.getHeight();
      int a = (int)(this.Field3839 * (float)a * (float)a / 100.0F);
      float a = this.Field3843 * (float)a;
      Random a = new Random((long)this.Field3845);
      Graphics2D a = a.createGraphics();
      a.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      a.setColor(new Color(this.Field3844));
      a.setStroke(new BasicStroke(this.Field3842));
      int a = 0;
      if (a < a) {
         float a = (float)a * a.nextFloat();
         float a = (float)a * a.nextFloat();
         float a = this.Field3840 + 6.2831855F * this.Field3841 * (a.nextFloat() - 0.5F);
         float a = (float)Math.sin((double)a) * a;
         float a = (float)Math.cos((double)a) * a;
         float a = a - a;
         float a = a - a;
         float a = a + a;
         float a = a + a;
         a.drawLine((int)a, (int)a, (int)a, (int)a);
         ++a;
      }

      a.dispose();
      return a;
   }

   public String toString() {
      return "Render/Scratches...";
   }
}
