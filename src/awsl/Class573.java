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

   private void Method1043(boolean a, boolean a1, int a) {
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
      BufferedImage a = new BufferedImage(this.Field2666, this.Field2667, 2);
      Graphics2D a = (Graphics2D)a.getGraphics();
      a.setFont(this.Field2670);
      a.setColor(new Color(255, 255, 255, 0));
      a.fillRect(0, 0, this.Field2666, this.Field2667);
      a.setColor(Color.white);
      int a = 0;
      int a = 0;
      int a = 0;

      for(int a = 0; a < this.Field2669.length; ++a) {
         char a = (char)a;
         BufferedImage a = this.Method1044(a, a, a);
         Class571 a = new Class571((Class572)null);
         a.Field2662 = a.getWidth();
         a.Field2663 = a.getHeight();
         if (a + a.Field2662 >= this.Field2666) {
            a = 0;
            a += a;
            a = 0;
         }

         a.Field2664 = a;
         a.Field2665 = a;
         if (a.Field2663 > this.Field2672) {
            this.Field2672 = a.Field2663;
         }

         if (a.Field2663 > a) {
            a = a.Field2663;
         }

         this.Field2669[a] = a;
         a.drawImage(a, a, a, (ImageObserver)null);
         a += a.Field2662;
      }

      try {
         this.Field2668 = TextureUtil.uploadTextureImageAllocate(TextureUtil.glGenTextures(), a, true, true);
      } catch (NullPointerException var13) {
         var13.printStackTrace();
      }

   }

   private BufferedImage Method1044(char a, boolean a1, int a) {
      BufferedImage a = new BufferedImage(1, 1, 2);
      Graphics2D a = (Graphics2D)a.getGraphics();
      a.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      a.setFont(this.Field2670);
      FontMetrics a = a.getFontMetrics();
      int var7 = a.charWidth(a) + 7;
      int a = 7;
      int a = a.getHeight() + 1 + a;
      a = this.Field2670.getSize();
      BufferedImage a = new BufferedImage(a, a, 2);
      Graphics2D a = (Graphics2D)a.getGraphics();
      a.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      a.setFont(this.Field2670);
      a.setColor(Color.WHITE);
      boolean var11 = true;
      boolean var12 = true;
      a.drawString(String.valueOf(a), 3, 1 + a.getAscent());
      return a;
   }

   public void Method1045(char a, float a, float a) throws ArrayIndexOutOfBoundsException {
      try {
         this.Method1046(a, a, (float)this.Field2669[a].Field2662, (float)this.Field2669[a].Field2663, (float)this.Field2669[a].Field2664, (float)this.Field2669[a].Field2665, (float)this.Field2669[a].Field2662, (float)this.Field2669[a].Field2663);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   private void Method1046(float a, float a, float a, float a, float a, float a, float a, float a) {
      float a = a / (float)this.Field2666;
      float a = a / (float)this.Field2667;
      float a = a / (float)this.Field2666;
      float a = a / (float)this.Field2667;
      GL11.glBegin(4);
      GL11.glTexCoord2f(a + a, a);
      GL11.glVertex2d((double)(a + a), (double)a);
      GL11.glTexCoord2f(a, a);
      GL11.glVertex2d((double)a, (double)a);
      GL11.glTexCoord2f(a, a + a);
      GL11.glVertex2d((double)a, (double)(a + a));
      GL11.glTexCoord2f(a, a + a);
      GL11.glVertex2d((double)a, (double)(a + a));
      GL11.glTexCoord2f(a + a, a + a);
      GL11.glVertex2d((double)(a + a), (double)(a + a));
      GL11.glTexCoord2f(a + a, a);
      GL11.glVertex2d((double)(a + a), (double)a);
      GL11.glEnd();
   }

   public void Method1047(String a, double a, double a, Color a, boolean a4) {
      Class563.Method1234();
      a -= 3.0;
      --a;
      GL11.glPushMatrix();
      GlStateManager.bindTexture(this.Field2668);
      this.Method1050(new Color(0.05F, 0.05F, 0.05F, (float)a.getAlpha() / 255.0F));
      int a = a.length();
      int a = 0;
      if (a < a) {
         char a = a.charAt(a);
         if (a < this.Field2669.length) {
            this.Method1045(a, (float)a, (float)a);
            double var10000 = a + (double)(this.Field2669[a].Field2662 - this.Field2673);
         }

         ++a;
      }

      GL11.glPopMatrix();
      if (a.trash() == null) {
         Class563.Method1233(new a[2]);
      }

   }

   public void Method1048(String a, double a, double a, int a, boolean a4) {
      a -= 3.0;
      Class563.Method1234();
      --a;
      GL11.glPushMatrix();
      GlStateManager.bindTexture(this.Field2668);
      Method1049(a);
      int a = a.length();
      int a = 0;
      if (a < a) {
         char a = a.charAt(a);
         if (a < this.Field2669.length) {
            this.Method1045(a, (float)a, (float)a);
            double var10000 = a + (double)(this.Field2669[a].Field2662 - this.Field2673);
         }

         ++a;
      }

      GL11.glPopMatrix();
   }

   public static void Method1049(int a) {
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glColor4f(a, a, a, a);
   }

   public void Method1050(Color a) {
      float a = (float)a.getRed() / 255.0F;
      float a = (float)a.getGreen() / 255.0F;
      float a = (float)a.getBlue() / 255.0F;
      float a = (float)a.getAlpha() / 255.0F;
      GL11.glColor4f(a, a, a, a);
   }

   public int Method1051(String a) {
      int a = 1;
      char[] a;
      int a = (a = a.toCharArray()).length;

      for(int a = 0; a < a; ++a) {
         char a = a[a];
         if (a == '\n') {
            ++a;
         }
      }

      return this.Field2672 * a;
   }

   public int Method1052() {
      return this.Field2672;
   }

   public int Method1053(String a) {
      int a = 0;
      Class563.Method1234();
      char[] a;
      int a = (a = a.toCharArray()).length;
      int a = 0;
      if (a < a) {
         char a = a[a];
         if (a < this.Field2669.length) {
            a += this.Field2669[a].Field2662 - this.Field2673;
         }

         ++a;
      }

      return a;
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
