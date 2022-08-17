package awsl;

import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import obfuscate.a;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.ColorValue;

public class Class374 extends Class390 {
   public double Field1763;
   public ColorValue Field1764;
   public boolean Field1765;
   public float Field1766;
   public float Field1767;
   public float Field1768;
   public float Field1769;
   public boolean Field1770;
   private boolean Field1771;
   private boolean Field1772;
   private boolean Field1773;
   public float Field1774 = 0.0F;
   public float Field1775 = 0.0F;
   private static a[] Field1776;

   public Class374(ColorValue a, Class381 a, int a, int a, String a, String a) {
      super(a, a, a, a, a);
      this.Field1764 = a;
      this.Field1909 = Math.max(this.Field1919.Field1874, a.Method1414());
      this.Field1910 = 18;
      if (this.Field1764 != null) {
         this.Field1763 = (double)this.Field1764.Method2442();
         this.Method415(this.Field1764.Method2442());
      }

      this.Field1920 = "ColorPicker";
   }

   public void Method419(int a, int a1) {
      this.Field1916 = !this.Field1764.Method2756();
   }

   public void Method411(int a, int a) {
      super.Method411(a, a);
      this.Field1910 = 12;
      if (GlobalModule.INSTANCE.Field3190.Method1825() != this || !GlobalModule.INSTANCE.Field3190.Method1834()) {
         this.Field1770 = false;
      }

      if (this.Field1764.Method2437()) {
         this.Method415(this.Field1764.Method2442());
      }

      if (this.Field1915) {
         GlobalModule.INSTANCE.Field3190.Method1808("§9" + this.Field1914 + "\n§e右键打开着色器\n§eShift点击此处切换彩色");
      }

   }

   public void Method412(int a, int a1) {
      float a = this.Method432()[0];
      float a = this.Method432()[1];
      Class565.Field2636.Method1217(this.Field1764.Method2754(), (float)(this.Field1907 + 5), (float)(this.Field1908 + 2), -1);
      int a = (new Color(this.Method431())).darker().darker().getRGB();
      if (this == GlobalModule.INSTANCE.Field3190.Method1825() && this.Field1770) {
         a = -1;
      }

      RenderUtils.Method1104(a - 18.5F, a - 0.5F, a - 3.0F, a + 6.5F, a);
      this.Method445(a - 18.0F, a, a - 3.25F, a + 6.0F);
      RenderUtils.Method1104(a - 18.0F, a, a - 3.25F, a + 6.0F, this.Method431());
   }

   public void Method413(int a, int a, boolean a) {
      float a = this.Method432()[0];
      float a = this.Method432()[1];
      this.Field1915 = MathUtils.isHovering((float)a, (float)a, a - 18.5F, a - 0.5F, a - 3.0F, a + 6.5F) && this.Field1919.Method1392(a, a);
      if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown(0) && Keyboard.isKeyDown(42)) {
         this.Field1764.Method2438(!this.Field1764.Method2437());
         this.Method415(this.Field1764.Method2442());
         GlobalModule.INSTANCE.fileManager.saveValues();
      }

      if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown(1)) {
         this.Field1770 = !this.Field1770;
         GlobalModule.INSTANCE.Field3190.Method1824(this);
         this.Field1774 = a + 2.0F - (float)this.Field1907;
         this.Field1775 = a - (float)this.Field1908;
      }

      this.Field1918 = a;
   }

   public boolean Method420() {
      return this.Field1915;
   }

   public void Method421(int a, int a) {
      float[] a = this.Method433();
      Method448();
      float a = a[0];
      float a = a[1];
      int a = Class681.Method1612(1);
      float a = this.Method434();
      float a = this.Method435();
      RenderUtils.Method1110(a, a, a + a, a + a, 3.0F, a);
      RenderUtils.Method1110(a + 0.5F, a + 0.5F, a + a - 0.5F, a + a - 0.5F, 3.0F, Class681.Method1612(3750203));
      RenderUtils.Method1110(a + 1.0F, a + 1.0F, a + a - 1.0F, a + a - 1.0F, 3.0F, Class681.Method1612(2302755));
      float a = a - 17.0F;
      float a = a + 3.0F;
      float a = a + 3.0F;
      float a = a + a;
      float a = a + a;
      int a = (new Color(255, 255, 255, 180)).getRGB();
      if (!((float)a <= a) && !((float)a <= a) && !((float)a >= a) && (float)a >= a) {
      }

      RenderUtils.Method1104(a - 0.5F, a - 0.5F, a + 0.5F, a + 0.5F, Class681.Method1612(0));
      this.Method446(a, a, a, a);
      float a = this.Field1767 * (a - a);
      float a = (1.0F - this.Field1768) * (a - a);
      float a;
      float a;
      float a;
      float a;
      if (this.Field1771) {
         a = a - a;
         a = (float)a - a;
         if (a <= 0.0F) {
            a = 0.0F;
         }

         if (a >= a) {
            a = a;
         }

         this.Field1767 = a / a;
         a = a;
         a = a - a;
         a = (float)a - a;
         if (a <= 0.0F) {
            a = 0.0F;
         }

         if (a >= a) {
            a = a;
         }

         this.Field1768 = 1.0F - a / a;
         a = a;
         this.Method442(Color.HSBtoRGB(this.Field1766, this.Field1767, this.Field1768), false);
      }

      a = a + a - 0.5F;
      a = a + a - 0.5F;
      a = a + a + 0.5F;
      a = a + a + 0.5F;
      RenderUtils.Method1104(a - 0.5F, a - 0.5F, a, a + 0.5F, a);
      RenderUtils.Method1104(a, a - 0.5F, a + 0.5F, a + 0.5F, a);
      RenderUtils.Method1104(a, a - 0.5F, a, a, a);
      RenderUtils.Method1104(a, a, a, a + 0.5F, a);
      RenderUtils.Method1104(a, a, a, a, a);
      a = a + 3.0F;
      a = a + 8.0F;
      if (!((float)a <= a) && !((float)a <= a) && !((float)a >= a) && (float)a >= a) {
      }

      a = a - a;
      a = (1.0F - this.Field1766) * a;
      float a;
      if (this.Field1772) {
         a = (float)a - a;
         if (a <= 0.0F) {
            a = 0.0F;
         }

         if (a >= a) {
            a = a;
         }

         this.Field1766 = 1.0F - a / a;
         a = a;
         this.Method442(Color.HSBtoRGB(this.Field1766, this.Field1767, this.Field1768), false);
      }

      RenderUtils.Method1104(a - 0.5F, a - 0.5F, a + 0.5F, a + 0.5F, a);
      a = a - a;
      float a = a / 5.0F;
      int a = 0;
      float a;
      if ((float)a < 5.0F) {
         boolean a = (float)a == 4.0F;
         this.Method426(a, a, a, a + a, this.Method444(Color.HSBtoRGB(1.0F - 0.2F * (float)a, 1.0F, 1.0F)), this.Method444(Color.HSBtoRGB(1.0F - 0.2F * (float)(a + 1), 1.0F, 1.0F)));
         a = a + a;
         ++a;
         a.trash(new String[3]);
      }

      float a = a + a - 0.5F;
      float a = a + a + 0.5F;
      RenderUtils.Method1104(a - 0.5F, a - 0.5F, a, a + 0.5F, a);
      RenderUtils.Method1104(a, a - 0.5F, a + 0.5F, a + 0.5F, a);
      RenderUtils.Method1104(a, a - 0.5F, a, a, a);
      RenderUtils.Method1104(a, a, a, a + 0.5F, a);
      RenderUtils.Method1104(a, a, a, a, a);
      a = a + 3.0F;
      a = a + 8.0F;
      if (!((float)a <= a) && !((float)a <= a) && !((float)a >= a) && (float)a >= a) {
      }

      int a = Color.HSBtoRGB(this.Field1766, this.Field1767, this.Field1768);
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      a = a - a;
      a = this.Field1769 * a;
      if (this.Field1773) {
         a = (float)a - a;
         if (a <= 0.0F) {
            a = 0.0F;
         }

         if (a >= a) {
            a = a;
         }

         this.Field1769 = a / a;
         a = a;
         this.Method442((new Color(a, a, a, (int)(this.Field1769 * 255.0F))).getRGB(), true);
      }

      RenderUtils.Method1104(a - 0.5F, a - 0.5F, a + 0.5F, a + 0.5F, a);
      this.Method445(a, a, a, a);
      this.Method427((double)a, (double)a, (double)a, (double)a, true, (new Color(a, a, a, 0)).getRGB(), (new Color(a, a, a, 255)).getRGB());
      a = a + a - 0.5F;
      a = a + a + 0.5F;
      RenderUtils.Method1104(a - 0.5F, a, a + 0.5F, a, a);
      RenderUtils.Method1104(a, a, a, a, a);
   }

   public static void Method422(float a, float a, float a, float a, float a, int a, int a) {
      RenderUtils.Method1103(a + a, a + a, a - a * 2.0F, a - a * 2.0F, a);
      RenderUtils.Method1103(a, a, a, a, a);
      RenderUtils.Method1103(a, a + a, a, a - a, a);
      RenderUtils.Method1103(a + a - a, a + a, a, a - a, a);
      RenderUtils.Method1103(a + a, a + a - a, a - a * 2.0F, a, a);
   }

   public boolean Method423(int a, int a) {
      float[] a = this.Method433();
      float a = a[0];
      float a = a[1];
      float a = this.Method434();
      float a = this.Method435();
      return (float)a >= a && (float)a <= a + a && (float)a >= a && (float)a <= a + a;
   }

   public void Method424(int a, int a) {
      if (Mouse.isButtonDown(0)) {
         float[] a = this.Method433();
         float a = a[0];
         float a = a[1];
         float a = this.Method434();
         float a = this.Method435();
         float a = a - 9.0F - 8.0F;
         float a = a + 3.0F;
         float a = a + 3.0F;
         float a = a + a;
         float a = a + a;
         float a = a + 3.0F;
         float a = a + 8.0F;
         float a = a + 3.0F;
         float a = a + 8.0F;
         this.Field1771 = !this.Field1771 && (float)a > a && (float)a > a && (float)a < a && (float)a < a;
         this.Field1773 = !this.Field1773 && (float)a > a && (float)a > a && (float)a < a && (float)a < a;
         this.Field1772 = !this.Field1772 && (float)a > a && (float)a > a && (float)a < a && (float)a < a;
         this.Field1765 = true;
      }

   }

   public void Method425() {
      this.Field1765 = false;
      this.Field1772 = false;
      this.Field1771 = false;
      this.Field1773 = false;
      GlobalModule.INSTANCE.fileManager.saveValues();
   }

   public void Method426(float a, float a, float a, float a, int a, int a) {
      Method448();
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GlStateManager.disableTexture2D();
      GlStateManager.enableBlend();
      GlStateManager.disableAlpha();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.shadeModel(7425);
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      a.begin(7, DefaultVertexFormats.POSITION_COLOR);
      a.pos((double)a, (double)a, 0.0).color(a, a, a, a).endVertex();
      a.pos((double)a, (double)a, 0.0).color(a, a, a, a).endVertex();
      a.pos((double)a, (double)a, 0.0).color(a, a, a, a).endVertex();
      a.pos((double)a, (double)a, 0.0).color(a, a, a, a).endVertex();
      a.draw();
      GlStateManager.shadeModel(7424);
      GlStateManager.disableBlend();
      GlStateManager.enableAlpha();
      GlStateManager.enableTexture2D();
      if (a.trash() == null) {
         Method447(new a[4]);
      }

   }

   public void Method427(double a, double a, double a, double a, boolean a4, int a, int a) {
      GL11.glDisable(3553);
      Method448();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glShadeModel(7425);
      GL11.glBegin(7);
      RenderUtils.Method1113(a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      RenderUtils.Method1113(a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      RenderUtils.Method1113(a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      RenderUtils.Method1113(a);
      GL11.glVertex2d(a, a);
      GL11.glEnd();
      GL11.glDisable(3042);
      GL11.glShadeModel(7424);
      GL11.glEnable(3553);
   }

   private void Method428() {
      float[] a = this.Field1764.Method2443();
      this.Field1766 = a[0];
      this.Field1767 = a[1];
      this.Field1768 = a[2];
   }

   private void Method429(float a, float a, float a) {
      this.Field1764.Method2440(Color.getHSBColor(a, a, a).getRGB());
   }

   public boolean Method430() {
      return this.Field1770;
   }

   public int Method431() {
      return this.Field1764.Method2442();
   }

   public float[] Method432() {
      return new float[]{(float)(super.Field1907 + 78), (float)super.Field1908 + 3.5F};
   }

   public float[] Method433() {
      return new float[]{(float)this.Field1907 + this.Field1774 - 75.0F, (float)this.Field1908 + this.Field1775 + 8.0F};
   }

   public float Method434() {
      return 70.0F;
   }

   public float Method435() {
      return this.Method434();
   }

   public void Method436(float a) {
      this.Method440(a, this.Field1767, this.Field1768);
   }

   public void Method437(float a) {
      this.Method440(this.Field1766, a, this.Field1768);
   }

   public void Method438(float a) {
      this.Method440(this.Field1766, this.Field1767, a);
   }

   public void Method439(float a) {
      this.Field1769 = MathUtils.clamp(a, 0.0F, 1.0F);
   }

   public void Method440(float a, float a, float a) {
      this.Field1766 = a;
      this.Field1767 = a;
      this.Field1768 = a;
   }

   public void Method415(int a) {
      float[] a = this.Method441(a);
      this.Field1766 = a[0];
      this.Field1767 = a[1];
      this.Field1768 = a[2];
      this.Field1769 = (float)(a >> 24 & 255) / 255.0F;
   }

   private float[] Method441(int a) {
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      return Color.RGBtoHSB(a, a, a, (float[])null);
   }

   public void Method442(int a, boolean a1) {
      this.Method443(a);
   }

   public void Method443(int a) {
      this.Field1764.Method2440(Class681.Method2697(a).getRGB());
   }

   public int Method444(int a) {
      int a = a >> 16 & 255;
      int a = a >> 8 & 255;
      int a = a & 255;
      int a = 255;
      return (a & 255) << 16 | (a & 255) << 8 | a & 255 | (a & 255) << 24;
   }

   private void Method445(float a, float a, float a, float a) {
      RenderUtils.Method1104(a, a, a, a, this.Method444(16777215));
      Method448();
      boolean a = false;
      if (a < a) {
         a = true;
         float a = a + (float)(true ? 1 : 0);
         if (a < a) {
            if (a <= a - 1.0F) {
               RenderUtils.Method1104(a, a, a + 1.0F, a + 1.0F, this.Method444(8421504));
            }

            a += 2.0F;
         }

         ++a;
      }

   }

   private void Method446(float a, float a, float a, float a) {
      int a = this.Method444(Color.HSBtoRGB(this.Field1766, 1.0F, 1.0F));
      this.Method427((double)a, (double)a, (double)a, (double)a, true, this.Method444(16777215), a);
      this.Method426(a, a, a, a, 0, this.Method444(0));
   }

   public static void Method447(a[] arr) {
      Field1776 = arr;
   }

   public static a[] Method448() {
      return Field1776;
   }

   static {
      Method447(new a[4]);
   }
}
