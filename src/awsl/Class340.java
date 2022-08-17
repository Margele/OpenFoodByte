package awsl;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.utils.RenderUtils;

public class Class340 {
   public static Minecraft Field1637 = Minecraft.getMinecraft();
   public static float Field1638;
   public static EntityLivingBase Field1639 = null;
   private static String Field1640 = "";
   private static final WeakHashMap Field1641 = new WeakHashMap();
   private static float Field1642;
   public static Class349 Field1643 = new Class349(0.01);
   public static Class321 Field1644 = new Class314(150, 1.0, 3.0F);
   public static List Field1645 = new ArrayList();
   private static final Class280 Field1646 = new Class280();

   public static void Method264(EntityLivingBase a) {
      RenderUtils.trash();
      boolean a = false;
      int a = RenderUtils.Method1076() / 2 - 20;
      int a = RenderUtils.Method1077() / 2 + 20;
      if (a instanceof EntityPlayer) {
         a = true;
         a = RenderUtils.Method1076() / 2 + 10;
      }

      String a = a.getName();
      float a = Class565.Field2641.Method1225(a);
      boolean a = a > 65.0F;
      Field1644.Method1211(KillAura.target != null ? Class661.FORWARDS : Class661.BACKWARDS);
      RenderUtils.Method1145((float)(a + 0) + (36.0F + a) / 2.0F, (float)(a + 14), (float)Field1644.Method1213());
      GlStateManager.pushMatrix();
      RenderUtils.Method1074((float)(a - 1 + 0), (float)(a - 1), (float)a + 36.0F + a, (float)(a + 1) + 28.0F, Class681.Method1614(0, 150));
      Class565.Field2641.Method1217(a, (float)(a + 31), (float)(a + 2), -1);
      Class565.Field2641.Method1222(a, (float)(a + 63), (float)(a + 2), -1);
      BigDecimal var8 = new BigDecimal((double)a.getHealth());
      var8 = var8.setScale(1, RoundingMode.HALF_UP);
      double var9 = var8.doubleValue();
      BigDecimal var11 = new BigDecimal((double)Minecraft.getMinecraft().thePlayer.getDistanceToEntity(a));
      var11 = var11.setScale(1, RoundingMode.HALF_UP);
      double var12 = var11.doubleValue();
      float a = a.getAbsorptionAmount();
      float a = a.getHealth();
      boolean a = a.getAbsorptionAmount() > 0.0F;
      float a = (float)a.getTotalArmorValue();
      float a = (float)a.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue();
      float[] var10000 = new float[]{0.0F, 0.5F, 1.0F};
      Color[] var38 = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
      float a = a / a;
      float a = a / 20.0F;
      double a = (double)(a - 9.0F);
      double a = a * (double)a;
      double a = a * (double)a;
      String a;
      if ((double)a > 20.0) {
         a = "§9";
      }

      if ((double)a >= 10.0) {
         a = "§a";
      }

      if ((double)a >= 3.0) {
         a = "§e";
      }

      a = "§4";
      if (a != Field1639) {
         Field1639 = a;
         Field1638 = (float)a;
         Field1642 = 0.0F;
         Field1645.clear();
      }

      if (Field1638 <= 0.0F) {
         Field1638 = (float)a;
      }

      if (a.hurtTime <= 6) {
         Field1638 = Class342.Method280(Field1638, (float)a, (float)Math.max(10.0, Math.abs((double)Field1638 - a) * 30.0 * 0.4));
      }

      if (!Field1641.containsKey(a)) {
         Field1641.put(a, a.getHealth());
      }

      float a = (Float)Field1641.get(a);
      float a = a.getHealth();
      if (a != a) {
         if (a - a < 0.0F) {
            Field1640 = "§a+ " + Method265((double)((a - a) * -1.0F), 1);
         }

         Field1640 = "§c- " + Method265((double)(a - a), 1);
         Field1641.remove(a);
         Field1641.put(a, a.getHealth());
         Field1642 = 50.0F;
      }

      if (Field1642 > 0.0F) {
         Field1642 = (float)RenderUtils.Method1073((double)Field1642, 0.0, 0.1);
         Class565.Field2637.Method1224(Field1640, (float)(a + 12 + 0), (float)(a - 17) + Field1642 / 10.0F, -1);
      }

      String a;
      if (a % 1.0F != 0.0F) {
         a = (new BigDecimal((double)(a + a))).setScale(1, 4).floatValue() + "";
      }

      a = (new BigDecimal((double)(a + a))).setScale(0, 4).toString();
      Color a = new Color(219, 190, 1);
      Class565.Field2639.Method1217("t", (float)(a + 30), (float)(a + 12), Class681.Method3(219, 190, 1));
      RenderUtils.Method1108((double)a + 39.5, (double)a + 15.0, (double)a + 40.5 + a, (double)a + 18.0, 0.5, Class681.Method2696(153, 153, 153, 150), Class681.Method1614(0, 80));
      RenderUtils.Method1105((double)(a + 40), (double)a + 15.5, (double)((float)(a + 40) + Field1638), (double)a + 17.5, a.darker().getRGB());
      RenderUtils.Method1105((double)(a + 40), (double)a + 15.5, (double)(a + 40) + a, (double)a + 17.5, a.getRGB());
      RenderUtils.Method1108((double)a + 39.5, (double)a + 22.0, (double)a + 12.5 + a, (double)a + 25.0, 0.5, Class681.Method2696(153, 153, 153, 150), Class681.Method1614(0, 80));
      Class565.Field2639.Method1217("u", (float)(a + 30), (float)(a + 19), Class681.Method3(153, 153, 153));
      RenderUtils.Method1105((double)(a + 40), (double)a + 22.5, (double)a + 40.0 + a / 2.0, (double)a + 24.5, Class681.Method3(0, 180, 255));
      Class565.Field2639.Method1222("t", (float)a + a + 12.0F, (float)(a + 19) - 0.5F, Class681.Method3(0, 153, 255));
      Class565.Field2636.Method1223(a, (float)a + a + 24.0F, (float)(a + 19), -1, 0.5F);
      if (a instanceof EntityPlayer) {
         Field1643.Method4(a.hurtTime > 5);
         GL11.glPushMatrix();
         Iterator var34;
         Class284 a;
         if (Field1644.Method1213() > 0.5) {
            var34 = Field1645.Method1383();
            if (var34.Method932()) {
               a = (Class284)var34.Method933();
               if (a.Field1541 > 4.0) {
                  a.Method3103();
               }
            }
         }

         Field1645.clear();
         if (Field1646.Method3077(16L)) {
            var34 = Field1645.Method1383();
            if (var34.Method932()) {
               a = (Class284)var34.Method933();
               a.Method3104();
               if (a.Field1541 < 1.0) {
                  Field1645.remove(a);
               }
            }

            Field1646.Method3079();
         }

         if (a.hurtTime >= 9) {
            int a = 0;
            if (a <= 2) {
               a = new Class284();
               a.Method3105((double)(a + 13), (double)(a + 13), (Math.random() - 0.5) * 2.0 * 0.8, (Math.random() - 0.5) * 2.0 * 0.8, Math.random() * 3.0, new Color(255, 0, 0));
               Field1645.Method2530(a);
               ++a;
            }
         }

         GL11.glTranslatef((float)(a + 1), (float)(a + 1), 0.0F);
         float a = (float)a.hurtTime / 10.0F;
         float var39;
         if (a == 0.0F) {
            var39 = 1.0F;
         } else if (a < 0.5F) {
            var39 = 1.0F - 0.2F * a * 2.0F;
         } else {
            var39 = 0.8F + 0.2F * (a - 0.5F) * 2.0F;
         }

         int a = 26;
         float a = (float)(1.0 - 0.1 * Field1643.Method6());
         GL11.glScalef(a, a, a);
         GL11.glTranslatef((float)a * 0.5F * (1.0F - a) / a, (float)a * 0.5F * (1.0F - a) / a, 0.0F);
         Class211.Method2575(false);
         RenderUtils.Method1087(13.0F, 13.0F, 15.0F, Color.white.getRGB());
         Class211.Method2574(true);
         GL11.glColor4f(1.0F, 1.0F - a, 1.0F - a, 1.0F);
         Method266((double)(a + 1), (double)(a + 1), 8.0F, 8.0F, 8, 8, 26, 26, 64.0F, 64.0F, (AbstractClientPlayer)a);
         Class211.Method2573();
         GL11.glPopMatrix();
      }

      GlStateManager.popMatrix();
      RenderUtils.Method1146();
   }

   public static double Method265(double a, int a1) {
      throw new IllegalArgumentException();
   }

   private static void Method266(double a, double a1, float a, float a, int a, int a, int a, int a, float a, float a, AbstractClientPlayer a) {
      try {
         new ScaledResolution(Field1637);
         ResourceLocation a = a.getLocationSkin();
         GL11.glEnable(3042);
         Field1637.getTextureManager().bindTexture(a);
         Gui.drawScaledCustomSizeModalRect(0, 0, a, a, a, a, a, a, a, a);
         if (a.isWearing(EnumPlayerModelParts.HAT)) {
            Gui.drawScaledCustomSizeModalRect(0, 0, a + 32.0F, a, a, a, a, a, a, a);
         }

         GL11.glDisable(3042);
      } catch (Exception var15) {
      }

   }

   protected static void Method267(float a, float a, float a, float a, int a, int a) {
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
   }

   protected static void Method268(float a, float a, float a, float a, int a, int a) {
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
      a.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
      a.pos((double)a, (double)a, 0.0).tex(0.0, 1.0).color(a, a, a, a).endVertex();
      a.pos((double)a, (double)a, 0.0).tex(1.0, 1.0).color(a, a, a, a).endVertex();
      a.pos((double)a, (double)a, 0.0).tex(1.0, 0.0).color(a, a, a, a).endVertex();
      a.pos((double)a, (double)a, 0.0).tex(0.0, 0.0).color(a, a, a, a).endVertex();
      a.draw();
      GlStateManager.shadeModel(7424);
      GlStateManager.disableBlend();
      GlStateManager.enableAlpha();
      GlStateManager.enableTexture2D();
   }

   private static Exception Method269(Exception exception) {
      return exception;
   }
}
