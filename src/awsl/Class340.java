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
      boolean var2 = false;
      int var3 = RenderUtils.Method1076() / 2 - 20;
      int var4 = RenderUtils.Method1077() / 2 + 20;
      if (a instanceof EntityPlayer) {
         var2 = true;
         var3 = RenderUtils.Method1076() / 2 + 10;
      }

      String var5 = a.getName();
      float var6 = Class565.Field2641.Method1225(var5);
      boolean var7 = var6 > 65.0F;
      Field1644.Method1211(KillAura.target != null ? Class661.FORWARDS : Class661.BACKWARDS);
      RenderUtils.Method1145((float)(var3 + 0) + (36.0F + var6) / 2.0F, (float)(var4 + 14), (float)Field1644.Method1213());
      GlStateManager.pushMatrix();
      RenderUtils.Method1074((float)(var3 - 1 + 0), (float)(var4 - 1), (float)var3 + 36.0F + var6, (float)(var4 + 1) + 28.0F, Class681.Method1614(0, 150));
      Class565.Field2641.Method1217(var5, (float)(var3 + 31), (float)(var4 + 2), -1);
      Class565.Field2641.Method1222(var5, (float)(var3 + 63), (float)(var4 + 2), -1);
      BigDecimal var8 = new BigDecimal((double)a.getHealth());
      var8 = var8.setScale(1, RoundingMode.HALF_UP);
      double var9 = var8.doubleValue();
      BigDecimal var11 = new BigDecimal((double)Minecraft.getMinecraft().thePlayer.getDistanceToEntity(a));
      var11 = var11.setScale(1, RoundingMode.HALF_UP);
      double var12 = var11.doubleValue();
      float var14 = a.getAbsorptionAmount();
      float var15 = a.getHealth();
      boolean var16 = a.getAbsorptionAmount() > 0.0F;
      float var17 = (float)a.getTotalArmorValue();
      float var18 = (float)a.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue();
      float[] var10000 = new float[]{0.0F, 0.5F, 1.0F};
      Color[] var38 = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
      float var21 = var15 / var18;
      float var22 = var17 / 20.0F;
      double var23 = (double)(var6 - 9.0F);
      double var25 = var23 * (double)var22;
      double var27 = var23 * (double)var21;
      String var29;
      if ((double)var15 > 20.0) {
         var29 = "§9";
      }

      if ((double)var15 >= 10.0) {
         var29 = "§a";
      }

      if ((double)var15 >= 3.0) {
         var29 = "§e";
      }

      var29 = "§4";
      if (a != Field1639) {
         Field1639 = a;
         Field1638 = (float)var27;
         Field1642 = 0.0F;
         Field1645.clear();
      }

      if (Field1638 <= 0.0F) {
         Field1638 = (float)var27;
      }

      if (a.hurtTime <= 6) {
         Field1638 = Class342.Method280(Field1638, (float)var27, (float)Math.max(10.0, Math.abs((double)Field1638 - var27) * 30.0 * 0.4));
      }

      if (!Field1641.containsKey(a)) {
         Field1641.put(a, a.getHealth());
      }

      float var30 = (Float)Field1641.get(a);
      float var31 = a.getHealth();
      if (var30 != var31) {
         if (var30 - var31 < 0.0F) {
            Field1640 = "§a+ " + Method265((double)((var30 - var31) * -1.0F), 1);
         }

         Field1640 = "§c- " + Method265((double)(var30 - var31), 1);
         Field1641.remove(a);
         Field1641.put(a, a.getHealth());
         Field1642 = 50.0F;
      }

      if (Field1642 > 0.0F) {
         Field1642 = (float)RenderUtils.Method1073((double)Field1642, 0.0, 0.1);
         Class565.Field2637.Method1224(Field1640, (float)(var3 + 12 + 0), (float)(var4 - 17) + Field1642 / 10.0F, -1);
      }

      String var32;
      if (var15 % 1.0F != 0.0F) {
         var32 = (new BigDecimal((double)(var15 + var14))).setScale(1, 4).floatValue() + "";
      }

      var32 = (new BigDecimal((double)(var15 + var14))).setScale(0, 4).toString();
      Color var33 = new Color(219, 190, 1);
      Class565.Field2639.Method1217("t", (float)(var3 + 30), (float)(var4 + 12), Class681.Method3(219, 190, 1));
      RenderUtils.Method1108((double)var3 + 39.5, (double)var4 + 15.0, (double)var3 + 40.5 + var23, (double)var4 + 18.0, 0.5, Class681.Method2696(153, 153, 153, 150), Class681.Method1614(0, 80));
      RenderUtils.Method1105((double)(var3 + 40), (double)var4 + 15.5, (double)((float)(var3 + 40) + Field1638), (double)var4 + 17.5, var33.darker().getRGB());
      RenderUtils.Method1105((double)(var3 + 40), (double)var4 + 15.5, (double)(var3 + 40) + var27, (double)var4 + 17.5, var33.getRGB());
      RenderUtils.Method1108((double)var3 + 39.5, (double)var4 + 22.0, (double)var3 + 12.5 + var23, (double)var4 + 25.0, 0.5, Class681.Method2696(153, 153, 153, 150), Class681.Method1614(0, 80));
      Class565.Field2639.Method1217("u", (float)(var3 + 30), (float)(var4 + 19), Class681.Method3(153, 153, 153));
      RenderUtils.Method1105((double)(var3 + 40), (double)var4 + 22.5, (double)var3 + 40.0 + var25 / 2.0, (double)var4 + 24.5, Class681.Method3(0, 180, 255));
      Class565.Field2639.Method1222("t", (float)var3 + var6 + 12.0F, (float)(var4 + 19) - 0.5F, Class681.Method3(0, 153, 255));
      Class565.Field2636.Method1223(var32, (float)var3 + var6 + 24.0F, (float)(var4 + 19), -1, 0.5F);
      if (a instanceof EntityPlayer) {
         Field1643.Method4(a.hurtTime > 5);
         GL11.glPushMatrix();
         Iterator var34;
         Class284 var35;
         if (Field1644.Method1213() > 0.5) {
            var34 = Field1645.Method1383();
            if (var34.Method932()) {
               var35 = (Class284)var34.Method933();
               if (var35.Field1541 > 4.0) {
                  var35.Method3103();
               }
            }
         }

         Field1645.clear();
         if (Field1646.Method3077(16L)) {
            var34 = Field1645.Method1383();
            if (var34.Method932()) {
               var35 = (Class284)var34.Method933();
               var35.Method3104();
               if (var35.Field1541 < 1.0) {
                  Field1645.remove(var35);
               }
            }

            Field1646.Method3079();
         }

         if (a.hurtTime >= 9) {
            int var40 = 0;
            if (var40 <= 2) {
               var35 = new Class284();
               var35.Method3105((double)(var3 + 13), (double)(var4 + 13), (Math.random() - 0.5) * 2.0 * 0.8, (Math.random() - 0.5) * 2.0 * 0.8, Math.random() * 3.0, new Color(255, 0, 0));
               Field1645.Method2530(var35);
               ++var40;
            }
         }

         GL11.glTranslatef((float)(var3 + 1), (float)(var4 + 1), 0.0F);
         float var41 = (float)a.hurtTime / 10.0F;
         float var39;
         if (var41 == 0.0F) {
            var39 = 1.0F;
         } else if (var41 < 0.5F) {
            var39 = 1.0F - 0.2F * var41 * 2.0F;
         } else {
            var39 = 0.8F + 0.2F * (var41 - 0.5F) * 2.0F;
         }

         byte var36 = 26;
         float var37 = (float)(1.0 - 0.1 * Field1643.Method6());
         GL11.glScalef(var37, var37, var37);
         GL11.glTranslatef((float)var36 * 0.5F * (1.0F - var37) / var37, (float)var36 * 0.5F * (1.0F - var37) / var37, 0.0F);
         Class211.Method2575(false);
         RenderUtils.Method1087(13.0F, 13.0F, 15.0F, Color.white.getRGB());
         Class211.Method2574(true);
         GL11.glColor4f(1.0F, 1.0F - var41, 1.0F - var41, 1.0F);
         Method266((double)(var3 + 1), (double)(var4 + 1), 8.0F, 8.0F, 8, 8, 26, 26, 64.0F, 64.0F, (AbstractClientPlayer)a);
         Class211.Method2573();
         GL11.glPopMatrix();
      }

      GlStateManager.popMatrix();
      RenderUtils.Method1146();
   }

   public static double Method265(double a, int a) {
      throw new IllegalArgumentException();
   }

   private static void Method266(double a, double a, float a, float a, int a, int a, int a, int a, float a, float a, AbstractClientPlayer a) {
      try {
         new ScaledResolution(Field1637);
         ResourceLocation var14 = a.getLocationSkin();
         GL11.glEnable(3042);
         Field1637.getTextureManager().bindTexture(var14);
         Gui.drawScaledCustomSizeModalRect(0, 0, a, a, a, a, a, a, a, a);
         if (a.isWearing(EnumPlayerModelParts.HAT)) {
            Gui.drawScaledCustomSizeModalRect(0, 0, a + 32.0F, a, a, a, a, a, a, a);
         }

         GL11.glDisable(3042);
      } catch (Exception var15) {
      }

   }

   protected static void Method267(float a, float a, float a, float a, int a, int a) {
      float var6 = (float)(a >> 24 & 255) / 255.0F;
      float var7 = (float)(a >> 16 & 255) / 255.0F;
      float var8 = (float)(a >> 8 & 255) / 255.0F;
      float var9 = (float)(a & 255) / 255.0F;
      float var10 = (float)(a >> 24 & 255) / 255.0F;
      float var11 = (float)(a >> 16 & 255) / 255.0F;
      float var12 = (float)(a >> 8 & 255) / 255.0F;
      float var13 = (float)(a & 255) / 255.0F;
      GlStateManager.disableTexture2D();
      GlStateManager.enableBlend();
      GlStateManager.disableAlpha();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.shadeModel(7425);
      Tessellator var14 = Tessellator.getInstance();
      WorldRenderer var15 = var14.getWorldRenderer();
      var15.begin(7, DefaultVertexFormats.POSITION_COLOR);
      var15.pos((double)a, (double)a, 0.0).color(var7, var8, var9, var6).endVertex();
      var15.pos((double)a, (double)a, 0.0).color(var7, var8, var9, var6).endVertex();
      var15.pos((double)a, (double)a, 0.0).color(var11, var12, var13, var10).endVertex();
      var15.pos((double)a, (double)a, 0.0).color(var11, var12, var13, var10).endVertex();
      var14.draw();
      GlStateManager.shadeModel(7424);
      GlStateManager.disableBlend();
      GlStateManager.enableAlpha();
      GlStateManager.enableTexture2D();
   }

   protected static void Method268(float a, float a, float a, float a, int a, int a) {
      float var6 = (float)(a >> 24 & 255) / 255.0F;
      float var7 = (float)(a >> 16 & 255) / 255.0F;
      float var8 = (float)(a >> 8 & 255) / 255.0F;
      float var9 = (float)(a & 255) / 255.0F;
      float var10 = (float)(a >> 24 & 255) / 255.0F;
      float var11 = (float)(a >> 16 & 255) / 255.0F;
      float var12 = (float)(a >> 8 & 255) / 255.0F;
      float var13 = (float)(a & 255) / 255.0F;
      GlStateManager.disableTexture2D();
      GlStateManager.enableBlend();
      GlStateManager.disableAlpha();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GlStateManager.shadeModel(7425);
      Tessellator var14 = Tessellator.getInstance();
      WorldRenderer var15 = var14.getWorldRenderer();
      var15.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
      var15.pos((double)a, (double)a, 0.0).tex(0.0, 1.0).color(var7, var8, var9, var6).endVertex();
      var15.pos((double)a, (double)a, 0.0).tex(1.0, 1.0).color(var7, var8, var9, var6).endVertex();
      var15.pos((double)a, (double)a, 0.0).tex(1.0, 0.0).color(var11, var12, var13, var10).endVertex();
      var15.pos((double)a, (double)a, 0.0).tex(0.0, 0.0).color(var11, var12, var13, var10).endVertex();
      var14.draw();
      GlStateManager.shadeModel(7424);
      GlStateManager.disableBlend();
      GlStateManager.enableAlpha();
      GlStateManager.enableTexture2D();
   }

   private static Exception Method269(Exception exception) {
      return exception;
   }
}
