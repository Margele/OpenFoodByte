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
      float a = this.Field1806;
      float a = this.Field1807 + this.Field1812;
      float a = (float)this.Field1808.thePlayer.posX;
      float a = (float)this.Field1808.thePlayer.posZ;
      float a = 0.0F;
      Class776.Method1731();
      float a = 2.0F;
      RenderUtils.Method1104(a + (this.Field1814 / 2.0F - 0.5F), a + a, a + this.Field1814 / 2.0F + 0.5F, a + this.Field1815 - a, (new Color(255, 255, 255, 80)).getRGB());
      RenderUtils.Method1104(a + a, a + (this.Field1815 / 2.0F - 0.5F), a + this.Field1814 - a, a + this.Field1815 / 2.0F + 0.5F, (new Color(255, 255, 255, 80)).getRGB());
      Iterator var8 = this.Field1808.theWorld.getLoadedEntityList().Method1383();
      if (var8.Method932()) {
         Object a = var8.Method933();
         if (a instanceof EntityPlayer) {
            EntityPlayer a = (EntityPlayer)a;
            if (a.isEntityAlive() && a != this.Field1808.thePlayer && !a.isInvisible() && !a.isInvisibleToPlayer(this.Field1808.thePlayer) && !AntiBot.botList.contains(a)) {
               float a = ReflectionUtils.getRenderPartialTicks();
               float a = (float)((a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a - (double)a) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue());
               float a = (float)((a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a - (double)a) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue());
               int a = RenderUtils.Method1114(1000);
               if (Class305.Method697(a)) {
                  a = Class681.Method3(0, 195, 255);
                  a.trash(new String[5]);
               }

               if (Class305.Method704(a)) {
                  a = Class681.Method2696(0, 255, 0, 255);
               }

               if (this.Field1808.thePlayer.canEntityBeSeen(a)) {
                  a = Class681.Method2696(255, 0, 0, 255);
               }

               if (!this.Field1808.thePlayer.canEntityBeSeen(a)) {
                  a = Class681.Method2696(255, 255, 0, 255);
               }

               float a = (float)Math.cos((double)this.Field1808.thePlayer.rotationYaw * 0.017453292519943295);
               float a = (float)Math.sin((double)this.Field1808.thePlayer.rotationYaw * 0.017453292519943295);
               float a = -(a * a - a * a);
               float a = -(a * a + a * a);
               if (a > this.Field1815 / 2.0F - a) {
                  a = this.Field1815 / 2.0F - a;
               }

               if (a < -(this.Field1815 / 2.0F) + a) {
                  a = -(this.Field1815 / 2.0F) + a;
               }

               if (a > this.Field1814 / 2.0F - a) {
                  a = this.Field1814 / 2.0F - a;
               }

               if (a < -(this.Field1814 / 2.0F - a)) {
                  a = -(this.Field1814 / 2.0F - a);
               }

               RenderUtils.Method1108((double)(a + this.Field1814 / 2.0F + a) - 1.5, (double)(a + this.Field1815 / 2.0F + a) - 1.5, (double)(a + this.Field1814 / 2.0F + a) + 1.5, (double)(a + this.Field1815 / 2.0F + a) + 1.5, 0.5, a, Class681.Method1612(16));
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
      String a = a;
      String[] a = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "m", "o", "r", "g"};
      String[] var5 = a;
      int var6 = a.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         String a = var5[var7];
         a = a.replaceAll("§" + a, "");
      }

      GlStateManager.pushMatrix();
      GlStateManager.disableDepth();
      a *= 2;
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a + 1, a * 2, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a - 1, a * 2, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a, a * 2 + 1, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a, a * 2 - 1, 0);
      Minecraft.getMinecraft().fontRendererObj.drawString(a, a, a * 2, Class681.Method2696(0, 153, 255, 255));
      GlStateManager.enableDepth();
      GlStateManager.popMatrix();
   }

   private void Method66(float a, float a, float a, float a, float a, float a, float a, String a) {
      double[] a = (double[])Field1696.Method2665(a);
      Class338 a = new Class338(a[0], a[1], a[2]);
      Class338 a = a;
      int a = (int)Math.floor(this.Field1808.thePlayer.getPositionVector().xCoord / 16.0);
      int a = (int)Math.floor(this.Field1808.thePlayer.getPositionVector().zCoord / 16.0);
      if (!this.Field1808.theWorld.getChunkFromChunkCoords(a, a).isLoaded() && a.Method223(this.Field1808.thePlayer.getPositionVector()) > (double)this.Field1808.gameSettings.renderDistanceChunks) {
         a = a.Method225((double)this.Field1808.gameSettings.renderDistanceChunks);
      }

      float a = ReflectionUtils.getRenderPartialTicks();
      float a = (float)((a.Method220() - (double)a) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue());
      float a = (float)((a.Method222() - (double)a) * (double)((Radar)ModuleManager.getModule2(Radar.class)).Field2218.getFloatValue());
      int a = RenderUtils.Method1114(980);
      float a = (float)Math.cos((double)this.Field1808.thePlayer.rotationYaw * 0.017453292519943295);
      float a = (float)Math.sin((double)this.Field1808.thePlayer.rotationYaw * 0.017453292519943295);
      float a = -(a * a - a * a);
      float a = -(a * a + a * a);
      if (a > this.Field1815 / 2.0F - a) {
         a = this.Field1815 / 2.0F - a;
      } else if (a < -(this.Field1815 / 2.0F) + a) {
         a = -(this.Field1815 / 2.0F) + a;
      }

      if (a > this.Field1814 / 2.0F - a) {
         a = this.Field1814 / 2.0F - a;
      } else if (a < -(this.Field1814 / 2.0F - a)) {
         a = -(this.Field1814 / 2.0F - a);
      }

      RenderUtils.Method1108((double)(a + this.Field1814 / 2.0F + a) - 1.5, (double)(a + this.Field1815 / 2.0F + a) - 1.5, (double)(a + this.Field1814 / 2.0F + a) + 1.5, (double)(a + this.Field1815 / 2.0F + a) + 1.5, 0.5, Class681.Method2696(0, 153, 255, 200), Class681.Method1612(12));
      Method65(a, (int)(a + this.Field1814 / 2.0F + a - (float)(this.Field1808.fontRendererObj.getStringWidth(a) / 5)), (int)(a + this.Field1815 / 2.0F + a + 2.0F));
   }
}
