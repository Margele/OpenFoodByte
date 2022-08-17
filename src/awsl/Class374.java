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

   public void Method419(int a, int a) {
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

   public void Method412(int a, int a) {
      float var3 = this.Method432()[0];
      float var4 = this.Method432()[1];
      Class565.Field2636.Method1217(this.Field1764.Method2754(), (float)(this.Field1907 + 5), (float)(this.Field1908 + 2), -1);
      int var5 = (new Color(this.Method431())).darker().darker().getRGB();
      if (this == GlobalModule.INSTANCE.Field3190.Method1825() && this.Field1770) {
         var5 = -1;
      }

      RenderUtils.Method1104(var3 - 18.5F, var4 - 0.5F, var3 - 3.0F, var4 + 6.5F, var5);
      this.Method445(var3 - 18.0F, var4, var3 - 3.25F, var4 + 6.0F);
      RenderUtils.Method1104(var3 - 18.0F, var4, var3 - 3.25F, var4 + 6.0F, this.Method431());
   }

   public void Method413(int a, int a, boolean a) {
      float var4 = this.Method432()[0];
      float var5 = this.Method432()[1];
      this.Field1915 = MathUtils.isHovering((float)a, (float)a, var4 - 18.5F, var5 - 0.5F, var4 - 3.0F, var5 + 6.5F) && this.Field1919.Method1392(a, a);
      if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown(0) && Keyboard.isKeyDown(42)) {
         this.Field1764.Method2438(!this.Field1764.Method2437());
         this.Method415(this.Field1764.Method2442());
         GlobalModule.INSTANCE.fileManager.saveValues();
      }

      if (!this.Field1918 && this.Field1915 && Mouse.isButtonDown(1)) {
         this.Field1770 = !this.Field1770;
         GlobalModule.INSTANCE.Field3190.Method1824(this);
         this.Field1774 = var4 + 2.0F - (float)this.Field1907;
         this.Field1775 = var5 - (float)this.Field1908;
      }

      this.Field1918 = a;
   }

   public boolean Method420() {
      return this.Field1915;
   }

   public void Method421(int a, int a) {
      float[] var4 = this.Method433();
      Method448();
      float var5 = var4[0];
      float var6 = var4[1];
      int var11 = Class681.Method1612(1);
      float var14 = this.Method434();
      float var15 = this.Method435();
      RenderUtils.Method1110(var5, var6, var5 + var14, var6 + var15, 3.0F, var11);
      RenderUtils.Method1110(var5 + 0.5F, var6 + 0.5F, var5 + var14 - 0.5F, var6 + var15 - 0.5F, 3.0F, Class681.Method1612(3750203));
      RenderUtils.Method1110(var5 + 1.0F, var6 + 1.0F, var5 + var14 - 1.0F, var6 + var15 - 1.0F, 3.0F, Class681.Method1612(2302755));
      float var16 = var14 - 17.0F;
      float var17 = var5 + 3.0F;
      float var18 = var6 + 3.0F;
      float var19 = var17 + var16;
      float var20 = var18 + var16;
      int var21 = (new Color(255, 255, 255, 180)).getRGB();
      if (!((float)a <= var17) && !((float)a <= var18) && !((float)a >= var19) && (float)a >= var20) {
      }

      RenderUtils.Method1104(var17 - 0.5F, var18 - 0.5F, var19 + 0.5F, var20 + 0.5F, Class681.Method1612(0));
      this.Method446(var17, var18, var19, var20);
      float var22 = this.Field1767 * (var19 - var17);
      float var23 = (1.0F - this.Field1768) * (var20 - var18);
      float var7;
      float var8;
      float var9;
      float var10;
      if (this.Field1771) {
         var10 = var19 - var17;
         var9 = (float)a - var17;
         if (var9 <= 0.0F) {
            var9 = 0.0F;
         }

         if (var9 >= var10) {
            var9 = var10;
         }

         this.Field1767 = var9 / var10;
         var22 = var9;
         var8 = var20 - var18;
         var7 = (float)a - var18;
         if (var7 <= 0.0F) {
            var7 = 0.0F;
         }

         if (var7 >= var8) {
            var7 = var8;
         }

         this.Field1768 = 1.0F - var7 / var8;
         var23 = var7;
         this.Method442(Color.HSBtoRGB(this.Field1766, this.Field1767, this.Field1768), false);
      }

      var10 = var17 + var22 - 0.5F;
      var9 = var18 + var23 - 0.5F;
      var8 = var17 + var22 + 0.5F;
      var7 = var18 + var23 + 0.5F;
      RenderUtils.Method1104(var10 - 0.5F, var9 - 0.5F, var10, var7 + 0.5F, var11);
      RenderUtils.Method1104(var8, var9 - 0.5F, var8 + 0.5F, var7 + 0.5F, var11);
      RenderUtils.Method1104(var10, var9 - 0.5F, var8, var9, var11);
      RenderUtils.Method1104(var10, var7, var8, var7 + 0.5F, var11);
      RenderUtils.Method1104(var10, var9, var8, var7, var21);
      var22 = var19 + 3.0F;
      var10 = var22 + 8.0F;
      if (!((float)a <= var22) && !((float)a <= var18) && !((float)a >= var10) && (float)a >= var20) {
      }

      var8 = var20 - var18;
      var7 = (1.0F - this.Field1766) * var8;
      float var24;
      if (this.Field1772) {
         var24 = (float)a - var18;
         if (var24 <= 0.0F) {
            var24 = 0.0F;
         }

         if (var24 >= var8) {
            var24 = var8;
         }

         this.Field1766 = 1.0F - var24 / var8;
         var7 = var24;
         this.Method442(Color.HSBtoRGB(this.Field1766, this.Field1767, this.Field1768), false);
      }

      RenderUtils.Method1104(var22 - 0.5F, var18 - 0.5F, var10 + 0.5F, var20 + 0.5F, var11);
      var24 = var20 - var18;
      float var25 = var24 / 5.0F;
      int var27 = 0;
      float var26;
      if ((float)var27 < 5.0F) {
         boolean var28 = (float)var27 == 4.0F;
         this.Method426(var22, var18, var10, var18 + var25, this.Method444(Color.HSBtoRGB(1.0F - 0.2F * (float)var27, 1.0F, 1.0F)), this.Method444(Color.HSBtoRGB(1.0F - 0.2F * (float)(var27 + 1), 1.0F, 1.0F)));
         var26 = var18 + var25;
         ++var27;
         a.trash(new String[3]);
      }

      float var34 = var18 + var7 - 0.5F;
      float var29 = var18 + var7 + 0.5F;
      RenderUtils.Method1104(var22 - 0.5F, var34 - 0.5F, var22, var29 + 0.5F, var11);
      RenderUtils.Method1104(var10, var34 - 0.5F, var10 + 0.5F, var29 + 0.5F, var11);
      RenderUtils.Method1104(var22, var34 - 0.5F, var10, var34, var11);
      RenderUtils.Method1104(var22, var29, var10, var29 + 0.5F, var11);
      RenderUtils.Method1104(var22, var34, var10, var29, var21);
      var23 = var20 + 3.0F;
      var9 = var23 + 8.0F;
      if (!((float)a <= var17) && !((float)a <= var23) && !((float)a >= var19) && (float)a >= var9) {
      }

      int var30 = Color.HSBtoRGB(this.Field1766, this.Field1767, this.Field1768);
      int var31 = var30 >> 16 & 255;
      int var32 = var30 >> 8 & 255;
      int var33 = var30 & 255;
      var24 = var19 - var17;
      var25 = this.Field1769 * var24;
      if (this.Field1773) {
         var26 = (float)a - var17;
         if (var26 <= 0.0F) {
            var26 = 0.0F;
         }

         if (var26 >= var8) {
            var26 = var8;
         }

         this.Field1769 = var26 / var24;
         var25 = var26;
         this.Method442((new Color(var31, var32, var33, (int)(this.Field1769 * 255.0F))).getRGB(), true);
      }

      RenderUtils.Method1104(var17 - 0.5F, var23 - 0.5F, var19 + 0.5F, var9 + 0.5F, var11);
      this.Method445(var17, var23, var19, var9);
      this.Method427((double)var17, (double)var23, (double)var19, (double)var9, true, (new Color(var31, var32, var33, 0)).getRGB(), (new Color(var31, var32, var33, 255)).getRGB());
      var26 = var17 + var25 - 0.5F;
      var29 = var17 + var25 + 0.5F;
      RenderUtils.Method1104(var26 - 0.5F, var23, var29 + 0.5F, var9, var11);
      RenderUtils.Method1104(var26, var23, var29, var9, var21);
   }

   public static void Method422(float a, float a, float a, float a, float a, int a, int a) {
      RenderUtils.Method1103(a + a, a + a, a - a * 2.0F, a - a * 2.0F, a);
      RenderUtils.Method1103(a, a, a, a, a);
      RenderUtils.Method1103(a, a + a, a, a - a, a);
      RenderUtils.Method1103(a + a - a, a + a, a, a - a, a);
      RenderUtils.Method1103(a + a, a + a - a, a - a * 2.0F, a, a);
   }

   public boolean Method423(int a, int a) {
      float[] var3 = this.Method433();
      float var4 = var3[0];
      float var5 = var3[1];
      float var6 = this.Method434();
      float var7 = this.Method435();
      return (float)a >= var4 && (float)a <= var4 + var6 && (float)a >= var5 && (float)a <= var5 + var7;
   }

   public void Method424(int a, int a) {
      if (Mouse.isButtonDown(0)) {
         float[] var3 = this.Method433();
         float var4 = var3[0];
         float var5 = var3[1];
         float var6 = this.Method434();
         float var7 = this.Method435();
         float var8 = var6 - 9.0F - 8.0F;
         float var9 = var4 + 3.0F;
         float var10 = var5 + 3.0F;
         float var11 = var9 + var8;
         float var12 = var10 + var8;
         float var13 = var12 + 3.0F;
         float var14 = var13 + 8.0F;
         float var15 = var11 + 3.0F;
         float var16 = var15 + 8.0F;
         this.Field1771 = !this.Field1771 && (float)a > var9 && (float)a > var10 && (float)a < var11 && (float)a < var12;
         this.Field1773 = !this.Field1773 && (float)a > var9 && (float)a > var13 && (float)a < var11 && (float)a < var14;
         this.Field1772 = !this.Field1772 && (float)a > var15 && (float)a > var10 && (float)a < var16 && (float)a < var12;
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
      float var8 = (float)(a >> 24 & 255) / 255.0F;
      float var9 = (float)(a >> 16 & 255) / 255.0F;
      float var10 = (float)(a >> 8 & 255) / 255.0F;
      float var11 = (float)(a & 255) / 255.0F;
      float var12 = (float)(a >> 24 & 255) / 255.0F;
      float var13 = (float)(a >> 16 & 255) / 255.0F;
      float var14 = (float)(a >> 8 & 255) / 255.0F;
      float var15 = (float)(a & 255) / 255.0F;
      GlStateManager.disableTexture2D();
      GlStateManager.enableBlend();
      GlStateManager.disableAlpha();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.shadeModel(7425);
      Tessellator var16 = Tessellator.getInstance();
      WorldRenderer var17 = var16.getWorldRenderer();
      var17.begin(7, DefaultVertexFormats.POSITION_COLOR);
      var17.pos((double)a, (double)a, 0.0).color(var9, var10, var11, var8).endVertex();
      var17.pos((double)a, (double)a, 0.0).color(var9, var10, var11, var8).endVertex();
      var17.pos((double)a, (double)a, 0.0).color(var13, var14, var15, var12).endVertex();
      var17.pos((double)a, (double)a, 0.0).color(var13, var14, var15, var12).endVertex();
      var16.draw();
      GlStateManager.shadeModel(7424);
      GlStateManager.disableBlend();
      GlStateManager.enableAlpha();
      GlStateManager.enableTexture2D();
      if (a.trash() == null) {
         Method447(new a[4]);
      }

   }

   public void Method427(double a, double a, double a, double a, boolean a, int a, int a) {
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
      float[] var1 = this.Field1764.Method2443();
      this.Field1766 = var1[0];
      this.Field1767 = var1[1];
      this.Field1768 = var1[2];
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
      float[] var2 = this.Method441(a);
      this.Field1766 = var2[0];
      this.Field1767 = var2[1];
      this.Field1768 = var2[2];
      this.Field1769 = (float)(a >> 24 & 255) / 255.0F;
   }

   private float[] Method441(int a) {
      int var2 = a >> 16 & 255;
      int var3 = a >> 8 & 255;
      int var4 = a & 255;
      return Color.RGBtoHSB(var2, var3, var4, (float[])null);
   }

   public void Method442(int a, boolean a) {
      this.Method443(a);
   }

   public void Method443(int a) {
      this.Field1764.Method2440(Class681.Method2697(a).getRGB());
   }

   public int Method444(int a) {
      int var2 = a >> 16 & 255;
      int var3 = a >> 8 & 255;
      int var4 = a & 255;
      short var5 = 255;
      return (var2 & 255) << 16 | (var3 & 255) << 8 | var4 & 255 | (var5 & 255) << 24;
   }

   private void Method445(float a, float a, float a, float a) {
      RenderUtils.Method1104(a, a, a, a, this.Method444(16777215));
      Method448();
      boolean var6 = false;
      if (a < a) {
         var6 = true;
         float var7 = a + (float)(true ? 1 : 0);
         if (var7 < a) {
            if (var7 <= a - 1.0F) {
               RenderUtils.Method1104(var7, a, var7 + 1.0F, a + 1.0F, this.Method444(8421504));
            }

            var7 += 2.0F;
         }

         ++a;
      }

   }

   private void Method446(float a, float a, float a, float a) {
      int var5 = this.Method444(Color.HSBtoRGB(this.Field1766, 1.0F, 1.0F));
      this.Method427((double)a, (double)a, (double)a, (double)a, true, this.Method444(16777215), var5);
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
