package trash.foodbyte.notification;

import awsl.Class348;
import awsl.Class438;
import awsl.Class440;
import awsl.Class565;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import obfuscate.a;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.utils.RenderUtils;

public final class Notification {
   static Minecraft Field2100 = Minecraft.getMinecraft();
   private final String Field2101;
   private final String Field2102;
   private final Class438 Field2103;
   private final float Field2104;
   private final float Field2105;
   private final long Field2106;
   private final int Field2107;
   private final Class440 Field2108;
   private boolean Field2109;
   private static int Field2110;
   private static int Field2111;
   private static int Field2112;
   private static ScaledResolution Field2113;
   private static a[] Field2114;

   public Notification(String a, String a, long a, Types a) {
      this.Field2101 = a;
      this.Field2102 = a;
      this.Field2104 = Math.max(Class565.Field2634.Method1225(a), Class565.Field2637.Method1225(a)) + 4.0F;
      this.Field2105 = 22.0F;
      ScaledResolution var6 = Method2736();
      this.Field2103 = new Class438(this, (double)var6.getScaledWidth(), (double)((float)var6.getScaledHeight() - this.Field2105 - 2.0F));
      this.Field2106 = a;
      this.Field2107 = a.Method10();
      this.Field2108 = new Class440(this);
   }

   public Notification(String a, String a, Types a) {
      this(a, a, (long)(a.length() + a.length()) * 40L, a);
   }

   public Notification(String a, Types a) {
      this(a, (String)null, (long)a.length() * 40L, a);
   }

   public Notification(String a, long a, Types a) {
      this(a, (String)null, a, a);
   }

   public void Method2734(ScaledResolution a, int a, int a) {
      Method2742();
      int var5 = a.getScaledWidth();
      int var6 = a.getScaledHeight();
      float var7 = (float)var6 - (this.Field2105 + 2.0F) * (float)a - (float)a;
      float var8 = (float)var5 - this.Field2104;
      if (this.Field2108.Method2716(this.Field2106)) {
         this.Field2103.Method2666((double)var8, (double)var6);
         a.trash(new String[5]);
      }

      this.Field2103.Method2666((double)var8, (double)var7);
      float var9 = (float)this.Field2103.Method2667();
      float var10 = (float)this.Field2103.Method2669();
      if (var10 >= (float)var6) {
         this.Field2109 = true;
      } else {
         Class348.Method364(var9, var10, this.Field2104, this.Field2105, true);
         GL11.glEnable(3089);
         Method2735(a, (int)var9, (int)var10, MathHelper.ceiling_float_int(this.Field2104), (int)this.Field2105);
         RenderUtils.Method1103((float)((int)var8), (float)((int)var10), (float)((int)this.Field2104), (float)((int)this.Field2105), 2013265920);
         double var11 = (double)(System.currentTimeMillis() - this.Field2108.Method2715()) / (double)this.Field2106 * (double)this.Field2104;
         RenderUtils.Method1103((float)((int)var8), (float)((int)var10 + (int)this.Field2105 - 1), (float)((int)this.Field2104), (float)((int)this.Field2105), Method2740(this.Field2107, 0.4F));
         RenderUtils.Method1103((float)((int)var8), (float)((int)var10 + (int)this.Field2105 - 1), (float)((int)var11), (float)((int)this.Field2105), this.Field2107);
         if (this.Field2102 != null && this.Field2102.length() > 0) {
            Class565.Field2634.Method1217(this.Field2101, (float)((int)var8 + 2), (float)((int)var10 + 1), -1);
            Class565.Field2637.Method1217(this.Field2102, (float)((int)var8 + 2), (float)((int)var10 + 8), -1);
         }

         Class565.Field2637.Method1217(this.Field2101, (float)((int)var8 + 2), (float)((int)var10 + 4), -1);
         GL11.glDisable(3089);
      }
   }

   public static void Method2735(ScaledResolution a, int a, int a, int a, int a) {
      int var5 = a.getScaleFactor();
      GL11.glScissor(a * var5, (a.getScaledHeight() - (a + a)) * var5, a * var5, a * var5);
   }

   public static ScaledResolution Method2736() {
      int var0 = Display.getWidth();
      int var1 = Display.getHeight();
      int var2 = Field2100.gameSettings.guiScale;
      if (var0 == Field2110 && var1 == Field2111 && var2 == Field2112) {
         return Field2113;
      } else {
         Field2110 = var0;
         Field2111 = var1;
         Field2112 = var2;
         return Field2113 = new ScaledResolution(Field2100);
      }
   }

   public static void Method2737(float a, float a, float a, float a, int a) {
      Method2742();
      int var6 = a >> 24 & 255;
      boolean var7 = var6 < 255;
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GlStateManager.enableBlend();
      GL11.glColor4ub((byte)(a >> 16 & 255), (byte)(a >> 8 & 255), (byte)(a & 255), (byte)var6);
      GL11.glColor3ub((byte)(a >> 16 & 255), (byte)(a >> 8 & 255), (byte)(a & 255));
      GL11.glBegin(7);
      GL11.glVertex2f(a, a);
      GL11.glVertex2f(a, a);
      GL11.glVertex2f(a, a);
      GL11.glVertex2f(a, a);
      GL11.glEnd();
      GL11.glDisable(3042);
      GlStateManager.disableBlend();
      GL11.glEnable(3553);
      if (a.trash() == null) {
         Method2741(new a[1]);
      }

   }

   public static void Method2738(double a, double a, double a, double a, int a) {
      int var9 = a >> 24 & 255;
      boolean var10 = var9 < 255;
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4ub((byte)(a >> 16 & 255), (byte)(a >> 8 & 255), (byte)(a & 255), (byte)var9);
      GL11.glBegin(7);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glEnd();
      GL11.glDisable(3042);
      GL11.glEnable(3553);
   }

   public boolean Method2739() {
      return this.Field2109;
   }

   public static int Method2740(int a, float a) {
      int var2 = (int)((float)(a >> 16 & 255) * a);
      int var3 = (int)((float)(a >> 8 & 255) * a);
      int var4 = (int)((float)(a & 255) * a);
      int var5 = a >> 24 & 255;
      return (var2 & 255) << 16 | (var3 & 255) << 8 | var4 & 255 | (var5 & 255) << 24;
   }

   static {
      Method2741((a[])null);
   }

   public static void Method2741(a[] arr) {
      Field2114 = arr;
   }

   public static a[] Method2742() {
      return Field2114;
   }
}
