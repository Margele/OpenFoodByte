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
      ScaledResolution a = Method2736();
      this.Field2103 = new Class438(this, (double)a.getScaledWidth(), (double)((float)a.getScaledHeight() - this.Field2105 - 2.0F));
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
      int a = a.getScaledWidth();
      int a = a.getScaledHeight();
      float a = (float)a - (this.Field2105 + 2.0F) * (float)a - (float)a;
      float a = (float)a - this.Field2104;
      if (this.Field2108.Method2716(this.Field2106)) {
         this.Field2103.Method2666((double)a, (double)a);
         a.trash(new String[5]);
      }

      this.Field2103.Method2666((double)a, (double)a);
      float a = (float)this.Field2103.Method2667();
      float a = (float)this.Field2103.Method2669();
      if (a >= (float)a) {
         this.Field2109 = true;
      } else {
         Class348.Method364(a, a, this.Field2104, this.Field2105, true);
         GL11.glEnable(3089);
         Method2735(a, (int)a, (int)a, MathHelper.ceiling_float_int(this.Field2104), (int)this.Field2105);
         RenderUtils.Method1103((float)((int)a), (float)((int)a), (float)((int)this.Field2104), (float)((int)this.Field2105), 2013265920);
         double a = (double)(System.currentTimeMillis() - this.Field2108.Method2715()) / (double)this.Field2106 * (double)this.Field2104;
         RenderUtils.Method1103((float)((int)a), (float)((int)a + (int)this.Field2105 - 1), (float)((int)this.Field2104), (float)((int)this.Field2105), Method2740(this.Field2107, 0.4F));
         RenderUtils.Method1103((float)((int)a), (float)((int)a + (int)this.Field2105 - 1), (float)((int)a), (float)((int)this.Field2105), this.Field2107);
         if (this.Field2102 != null && this.Field2102.length() > 0) {
            Class565.Field2634.Method1217(this.Field2101, (float)((int)a + 2), (float)((int)a + 1), -1);
            Class565.Field2637.Method1217(this.Field2102, (float)((int)a + 2), (float)((int)a + 8), -1);
         }

         Class565.Field2637.Method1217(this.Field2101, (float)((int)a + 2), (float)((int)a + 4), -1);
         GL11.glDisable(3089);
      }
   }

   public static void Method2735(ScaledResolution a, int a, int a, int a, int a) {
      int a = a.getScaleFactor();
      GL11.glScissor(a * a, (a.getScaledHeight() - (a + a)) * a, a * a, a * a);
   }

   public static ScaledResolution Method2736() {
      int a = Display.getWidth();
      int a = Display.getHeight();
      int a = Field2100.gameSettings.guiScale;
      if (a == Field2110 && a == Field2111 && a == Field2112) {
         return Field2113;
      } else {
         Field2110 = a;
         Field2111 = a;
         Field2112 = a;
         return Field2113 = new ScaledResolution(Field2100);
      }
   }

   public static void Method2737(float a, float a, float a, float a, int a) {
      Method2742();
      int a = a >> 24 & 255;
      boolean a = a < 255;
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GlStateManager.enableBlend();
      GL11.glColor4ub((byte)(a >> 16 & 255), (byte)(a >> 8 & 255), (byte)(a & 255), (byte)a);
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
      int a = a >> 24 & 255;
      boolean a = a < 255;
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4ub((byte)(a >> 16 & 255), (byte)(a >> 8 & 255), (byte)(a & 255), (byte)a);
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
      int a = (int)((float)(a >> 16 & 255) * a);
      int a = (int)((float)(a >> 8 & 255) * a);
      int a = (int)((float)(a & 255) * a);
      int a = a >> 24 & 255;
      return (a & 255) << 16 | (a & 255) << 8 | a & 255 | (a & 255) << 24;
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
