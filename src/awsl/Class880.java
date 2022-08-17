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
      boolean var3 = Class193.Method1269();
      a = this.Method1263(a, (ColorModel)null);
      int var4 = a.getWidth();
      int var5 = a.getHeight();
      int var6 = (int)(this.Field3839 * (float)var4 * (float)var5 / 100.0F);
      float var7 = this.Field3843 * (float)var4;
      Random var8 = new Random((long)this.Field3845);
      Graphics2D var9 = a.createGraphics();
      var9.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      var9.setColor(new Color(this.Field3844));
      var9.setStroke(new BasicStroke(this.Field3842));
      int var10 = 0;
      if (var10 < var6) {
         float var11 = (float)var4 * var8.nextFloat();
         float var12 = (float)var5 * var8.nextFloat();
         float var13 = this.Field3840 + 6.2831855F * this.Field3841 * (var8.nextFloat() - 0.5F);
         float var14 = (float)Math.sin((double)var13) * var7;
         float var15 = (float)Math.cos((double)var13) * var7;
         float var16 = var11 - var15;
         float var17 = var12 - var14;
         float var18 = var11 + var15;
         float var19 = var12 + var14;
         var9.drawLine((int)var16, (int)var17, (int)var18, (int)var19);
         ++var10;
      }

      var9.dispose();
      return a;
   }

   public String toString() {
      return "Render/Scratches...";
   }
}
