package awsl;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import obfuscate.a;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.module.impl.render.Radar;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class353 extends Class379 {
   public static HashMap Field1696 = new HashMap();

   public Class353() {
      this(5.0F, 25.0F, 100.0F, 100.0F, 12.0F, 1.0F, 0.5F, true, 100.0F, 100.0F, 1920.0F, 1080.0F);
   }

   public Class353(float a, float a, float a, float a, float a, float a, float a, boolean a, float a, float a, float a, float a) {
      super("Radar", a, a, a, a, "Radar", "X", a, a, a, a, a, a, a, a);
      Field1696.put("PVP", new double[]{Double.parseDouble("0"), Double.parseDouble("80"), Double.parseDouble("0")});
   }

   public void Method63() {
      GlStateManager.disableDepth();
      super.Method63();
      float var2 = this.Field1806;
      float var3 = this.Field1807 + this.Field1812;
      float var4 = (float)this.Field1808.thePlayer.posX;
      float var5 = (float)this.Field1808.thePlayer.posZ;
      float var6 = 0.0F;
      Class776.Method1731();
      float var7 = 2.0F;
      RenderUtils.Method1104(var2 + (this.Field1814 / 2.0F - 0.5F), var3 + var6, var2 + this.Field1814 / 2.0F + 0.5F, var3 + this.Field1815 - var6, (new Color(255, 255, 255, 80)).getRGB());
      RenderUtils.Method1104(var2 + var6, var3 + (this.Field1815 / 2.0F - 0.5F), var2 + this.Field1814 - var6, var3 + this.Field1815 / 2.0F + 0.5F, (new Color(255, 255, 255, 80)).getRGB());
      Iterator var8 = this.Field1808.theWorld.getLoadedEntityList().Method1383();
      if (var8.Method932()) {
         Object var9 = var8.Method933();
         if (var9 instanceof EntityPlayer) {
            EntityPlayer var10 = (EntityPlayer)var9;
            if (var10.isEntityAlive() && var10 != this.Field1808.thePlayer && !var10.isInvisible() && !var10.isInvisibleToPlayer(this.Field1808.thePlayer) && !AntiBot.botList.contains(var10)) {
               float var11 = ReflectionUtils.getRenderPartialTicks();
               float var12 = (float)((var10.lastTickPosX + (var10.posX - var10.lastTickPosX) * (double)var11 - (double)var4) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue());
               float var13 = (float)((var10.lastTickPosZ + (var10.posZ - var10.lastTickPosZ) * (double)var11 - (double)var5) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue());
               int var14 = RenderUtils.Method1114(1000);
               if (Class305.Method697(var10)) {
                  var14 = Class681.Method3(0, 195, 255);
                  a.trash(new String[5]);
               }

               if (Class305.Method704(var10)) {
                  var14 = Class681.Method2696(0, 255, 0, 255);
               }

               if (this.Field1808.thePlayer.canEntityBeSeen(var10)) {
                  var14 = Class681.Method2696(255, 0, 0, 255);
               }

               if (!this.Field1808.thePlayer.canEntityBeSeen(var10)) {
                  var14 = Class681.Method2696(255, 255, 0, 255);
               }

               float var15 = (float)Math.cos((double)this.Field1808.thePlayer.rotationYaw * 0.017453292519943295);
               float var16 = (float)Math.sin((double)this.Field1808.thePlayer.rotationYaw * 0.017453292519943295);
               float var17 = -(var13 * var15 - var12 * var16);
               float var18 = -(var12 * var15 + var13 * var16);
               if (var17 > this.Field1815 / 2.0F - var7) {
                  var17 = this.Field1815 / 2.0F - var7;
               }

               if (var17 < -(this.Field1815 / 2.0F) + var7) {
                  var17 = -(this.Field1815 / 2.0F) + var7;
               }

               if (var18 > this.Field1814 / 2.0F - var7) {
                  var18 = this.Field1814 / 2.0F - var7;
               }

               if (var18 < -(this.Field1814 / 2.0F - var7)) {
                  var18 = -(this.Field1814 / 2.0F - var7);
               }

               RenderUtils.Method1108((double)(var2 + this.Field1814 / 2.0F + var18) - 1.5, (double)(var3 + this.Field1815 / 2.0F + var17) - 1.5, (double)(var2 + this.Field1814 / 2.0F + var18) + 1.5, (double)(var3 + this.Field1815 / 2.0F + var17) + 1.5, 0.5, var14, Class681.Method1612(16));
            }
         }
      }

      if (((Radar)ModuleManager.getModule2(Radar.class)).Field2221.getBooleanValue() && Field1696.Method1799() > 0) {
         Field1696.keySet().forEach(this::Method66);
      }

   }

   public void Method64(int a, int a) {
      if (this.Field1811) {
         this.Field1806 = (float)a - this.Field1809;
         this.Field1807 = (float)a - this.Field1810;
      }

      if (this.Field1822) {
         this.Field1814 += (float)a - this.Field1809;
         if (this.Field1814 < this.Field1818) {
            this.Field1814 = this.Field1818;
         } else if (this.Field1814 > this.Field1820) {
            this.Field1814 = this.Field1820;
         } else {
            this.Field1809 = (float)a;
         }

         this.Field1815 += (float)a - this.Field1810;
         if (this.Field1815 < this.Field1819) {
            this.Field1815 = this.Field1819;
         } else if (this.Field1815 > this.Field1821) {
            this.Field1815 = this.Field1821;
         } else {
            this.Field1810 = (float)a;
         }

         if (!Display.isActive()) {
            this.Field1822 = false;
         }
      }

   }

   private static void Method65(String a, int a, int a) {
      String var3 = a;
      String[] var4 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "m", "o", "r", "g"};
      String[] var5 = var4;
      int var6 = var4.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         String var8 = var5[var7];
         a = a.replaceAll("§" + var8, "");
      }

      GlStateManager.pushMatrix();
      GlStateManager.disableDepth();
      a *= 2;
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a + 1, a * 2, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a - 1, a * 2, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a, a * 2 + 1, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a, a * 2 - 1, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(var3, a, a * 2, Class681.Method2696(0, 153, 255, 255));
      GlStateManager.enableDepth();
      GlStateManager.popMatrix();
   }

   private void Method66(float a, float a, float a, float a, float a, float a, float a, String a) {
      double[] var9 = (double[])Field1696.Method2665(a);
      Class338 var10 = new Class338(var9[0], var9[1], var9[2]);
      Class338 var11 = var10;
      int var12 = (int)Math.floor(this.Field1808.thePlayer.getPositionVector().xCoord / 16.0);
      int var13 = (int)Math.floor(this.Field1808.thePlayer.getPositionVector().zCoord / 16.0);
      if (!this.Field1808.theWorld.getChunkFromChunkCoords(var12, var13).isLoaded() && var10.Method223(this.Field1808.thePlayer.getPositionVector()) > (double)this.Field1808.gameSettings.renderDistanceChunks) {
         var11 = var10.Method225((double)this.Field1808.gameSettings.renderDistanceChunks);
      }

      float var14 = ReflectionUtils.getRenderPartialTicks();
      float var15 = (float)((var11.Method220() - (double)a) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue());
      float var16 = (float)((var11.Method222() - (double)a) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue());
      int var17 = RenderUtils.Method1114(980);
      float var18 = (float)Math.cos((double)this.Field1808.thePlayer.rotationYaw * 0.017453292519943295);
      float var19 = (float)Math.sin((double)this.Field1808.thePlayer.rotationYaw * 0.017453292519943295);
      float var20 = -(var16 * var18 - var15 * var19);
      float var21 = -(var15 * var18 + var16 * var19);
      if (var20 > this.Field1815 / 2.0F - a) {
         var20 = this.Field1815 / 2.0F - a;
      } else if (var20 < -(this.Field1815 / 2.0F) + a) {
         var20 = -(this.Field1815 / 2.0F) + a;
      }

      if (var21 > this.Field1814 / 2.0F - a) {
         var21 = this.Field1814 / 2.0F - a;
      } else if (var21 < -(this.Field1814 / 2.0F - a)) {
         var21 = -(this.Field1814 / 2.0F - a);
      }

      RenderUtils.Method1108((double)(a + this.Field1814 / 2.0F + var21) - 1.5, (double)(a + this.Field1815 / 2.0F + var20) - 1.5, (double)(a + this.Field1814 / 2.0F + var21) + 1.5, (double)(a + this.Field1815 / 2.0F + var20) + 1.5, 0.5, Class681.Method2696(0, 153, 255, 200), Class681.Method1612(12));
      Method65(a, (int)(a + this.Field1814 / 2.0F + var21 - (float)(this.Field1808.fontRendererObj.getStringWidth(a) / 5)), (int)(a + this.Field1815 / 2.0F + var20 + 2.0F));
   }
}
