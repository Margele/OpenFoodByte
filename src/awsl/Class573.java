package awsl;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import obfuscate.a;
import org.lwjgl.opengl.GL11;

public class Class573 {
   public int Field2666 = 1024;
   public int Field2667 = 1024;
   private int Field2668;
   private Class571[] Field2669 = new Class571[2048];
   private final Font Field2670;
   private boolean Field2671;
   private int Field2672 = -1;
   private int Field2673 = 8;

   public Class573(Font a, boolean a, int a, boolean a, int a) {
      this.Field2670 = a;
      this.Field2671 = a;
      this.Field2673 = a;
      this.Field2673 = 8;
      this.Method1043(a, a, a);
   }

   public Class573(Font a, boolean a, boolean a, int a) {
      this.Field2670 = a;
      this.Field2671 = a;
      this.Field2673 = 6;
      this.Method1043(a, a, a);
   }

   private void Method1043(boolean a, boolean a, int a) {
      if (this.Field2670.getSize() <= 15) {
         this.Field2666 = 256;
         this.Field2667 = 256;
      }

      if (this.Field2670.getSize() <= 43) {
         this.Field2666 = 512;
         this.Field2667 = 512;
      } else if (this.Field2670.getSize() <= 91) {
         this.Field2666 = 1024;
         this.Field2667 = 1024;
      } else {
         this.Field2666 = 2048;
         this.Field2667 = 2048;
      }

      this.Field2669 = new Class571['\uffff'];
      this.Field2666 = 8192;
      this.Field2667 = 8192;
      BufferedImage var4 = new BufferedImage(this.Field2666, this.Field2667, 2);
      Graphics2D var5 = (Graphics2D)var4.getGraphics();
      var5.setFont(this.Field2670);
      var5.setColor(new Color(255, 255, 255, 0));
      var5.fillRect(0, 0, this.Field2666, this.Field2667);
      var5.setColor(Color.white);
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      for(int var9 = 0; var9 < this.Field2669.length; ++var9) {
         char var10 = (char)var9;
         BufferedImage var11 = this.Method1044(var10, a, a);
         Class571 var12 = new Class571((Class572)null);
         var12.Field2662 = var11.getWidth();
         var12.Field2663 = var11.getHeight();
         if (var7 + var12.Field2662 >= this.Field2666) {
            var7 = 0;
            var8 += var6;
            var6 = 0;
         }

         var12.Field2664 = var7;
         var12.Field2665 = var8;
         if (var12.Field2663 > this.Field2672) {
            this.Field2672 = var12.Field2663;
         }

         if (var12.Field2663 > var6) {
            var6 = var12.Field2663;
         }

         this.Field2669[var9] = var12;
         var5.drawImage(var11, var7, var8, (ImageObserver)null);
         var7 += var12.Field2662;
      }

      try {
         this.Field2668 = TextureUtil.uploadTextureImageAllocate(TextureUtil.glGenTextures(), var4, true, true);
      } catch (NullPointerException var13) {
         var13.printStackTrace();
      }

   }

   private BufferedImage Method1044(char a, boolean a, int a) {
      BufferedImage var4 = new BufferedImage(1, 1, 2);
      Graphics2D var5 = (Graphics2D)var4.getGraphics();
      var5.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      var5.setFont(this.Field2670);
      FontMetrics var6 = var5.getFontMetrics();
      int var7 = var6.charWidth(a) + 7;
      byte var13 = 7;
      int var8 = var6.getHeight() + 1 + a;
      var8 = this.Field2670.getSize();
      BufferedImage var9 = new BufferedImage(var13, var8, 2);
      Graphics2D var10 = (Graphics2D)var9.getGraphics();
      var10.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      var10.setFont(this.Field2670);
      var10.setColor(Color.WHITE);
      boolean var11 = true;
      boolean var12 = true;
      var10.drawString(String.valueOf(a), 3, 1 + var6.getAscent());
      return var9;
   }

   public void Method1045(char a, float a, float a) throws ArrayIndexOutOfBoundsException {
      try {
         this.Method1046(a, a, (float)this.Field2669[a].Field2662, (float)this.Field2669[a].Field2663, (float)this.Field2669[a].Field2664, (float)this.Field2669[a].Field2665, (float)this.Field2669[a].Field2662, (float)this.Field2669[a].Field2663);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   private void Method1046(float a, float a, float a, float a, float a, float a, float a, float a) {
      float var9 = a / (float)this.Field2666;
      float var10 = a / (float)this.Field2667;
      float var11 = a / (float)this.Field2666;
      float var12 = a / (float)this.Field2667;
      GL11.glBegin(4);
      GL11.glTexCoord2f(var9 + var11, var10);
      GL11.glVertex2d((double)(a + a), (double)a);
      GL11.glTexCoord2f(var9, var10);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glTexCoord2f(var9, var10 + var12);
      GL11.glVertex2d((double)a, (double)(a + a));
      GL11.glTexCoord2f(var9, var10 + var12);
      GL11.glVertex2d((double)a, (double)(a + a));
      GL11.glTexCoord2f(var9 + var11, var10 + var12);
      GL11.glVertex2d((double)(a + a), (double)(a + a));
      GL11.glTexCoord2f(var9 + var11, var10);
      GL11.glVertex2d((double)(a + a), (double)a);
      GL11.glEnd();
   }

   public void Method1047(String a, double a, double a, Color a, boolean a) {
      Class563.Method1234();
      a -= 3.0;
      --a;
      GL11.glPushMatrix();
      GlStateManager.bindTexture(this.Field2668);
      this.Method1050(new Color(0.05F, 0.05F, 0.05F, (float)a.getAlpha() / 255.0F));
      int var9 = a.length();
      int var10 = 0;
      if (var10 < var9) {
         char var11 = a.charAt(var10);
         if (var11 < this.Field2669.length) {
            this.Method1045(var11, (float)a, (float)a);
            double var10000 = a + (double)(this.Field2669[var11].Field2662 - this.Field2673);
         }

         ++var10;
      }

      GL11.glPopMatrix();
      if (a.trash() == null) {
         Class563.Method1233(new a[2]);
      }

   }

   public void Method1048(String a, double a, double a, int a, boolean a) {
      a -= 3.0;
      Class563.Method1234();
      --a;
      GL11.glPushMatrix();
      GlStateManager.bindTexture(this.Field2668);
      Method1049(a);
      int var9 = a.length();
      int var10 = 0;
      if (var10 < var9) {
         char var11 = a.charAt(var10);
         if (var11 < this.Field2669.length) {
            this.Method1045(var11, (float)a, (float)a);
            double var10000 = a + (double)(this.Field2669[var11].Field2662 - this.Field2673);
         }

         ++var10;
      }

      GL11.glPopMatrix();
   }

   public static void Method1049(int a) {
      float var1 = (float)(a >> 24 & 255) / 255.0F;
      float var2 = (float)(a >> 16 & 255) / 255.0F;
      float var3 = (float)(a >> 8 & 255) / 255.0F;
      float var4 = (float)(a & 255) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1);
   }

   public void Method1050(Color a) {
      float var2 = (float)a.getRed() / 255.0F;
      float var3 = (float)a.getGreen() / 255.0F;
      float var4 = (float)a.getBlue() / 255.0F;
      float var5 = (float)a.getAlpha() / 255.0F;
      GL11.glColor4f(var2, var3, var4, var5);
   }

   public int Method1051(String a) {
      int var2 = 1;
      char[] var3;
      int var4 = (var3 = a.toCharArray()).length;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var6 = var3[var5];
         if (var6 == '\n') {
            ++var2;
         }
      }

      return this.Field2672 * var2;
   }

   public int Method1052() {
      return this.Field2672;
   }

   public int Method1053(String a) {
      int var3 = 0;
      Class563.Method1234();
      char[] var4;
      int var5 = (var4 = a.toCharArray()).length;
      int var6 = 0;
      if (var6 < var5) {
         char var7 = var4[var6];
         if (var7 < this.Field2669.length) {
            var3 += this.Field2669[var7].Field2662 - this.Field2673;
         }

         ++var6;
      }

      return var3;
   }

   public boolean Method1054() {
      return this.Field2671;
   }

   public void Method1055(boolean a, boolean a, int a) {
      if (this.Field2671 != a) {
         this.Method1043(this.Field2671 = a, a, a);
      }

   }

   public Font Method1056() {
      return this.Field2670;
   }

   private static NullPointerException Method1057(NullPointerException nullPointerException) {
      return nullPointerException;
   }
}
