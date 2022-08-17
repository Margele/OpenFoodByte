package trash.foodbyte.module.impl.render;

import awsl.Class492;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import obfuscate.a;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.Servers;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ModeValue;

public class StorageESP extends Module {
   public ModeValue Field2185 = new ModeValue("StorageESP", "ESP Mode", "OutLine", new String[]{"OutLine", "Box"});
   public BooleanValue Field2186 = new BooleanValue("StorageESP", "Chest", true, "普通箱子和陷阱箱");
   public BooleanValue Field2187 = new BooleanValue("StorageESP", "EnderChest", true, "末影箱");

   public StorageESP() {
      super("StorageESP", "Storage ESP", Category.RENDER);
   }

   public String getDescription() {
      return "箱子透视";
   }

   @EventTarget(0)
   public void Method802(EventRender3D a) {
      String a = Class492.Method2239();
      if (!ServerUtils.isSinglePlayer(Servers.SG) || !ServerUtils.isStartingGame()) {
         if (!ServerUtils.isPlayingSkyblock() && !ServerUtils.isPlayingMurderMystery()) {
            Iterator var3;
            TileEntity a;
            if (this.Field2185.isCurrentMode("OutLine")) {
               var3 = mc.theWorld.loadedTileEntityList.Method1383();

               while(var3.Method932()) {
                  a = (TileEntity)var3.Method933();
                  Color a = null;
                  if (a instanceof TileEntityChest && this.Field2186.getValue()) {
                     if (((TileEntityChest)a).getChestType() == 1) {
                        a = new Color(255, 0, 0);
                     } else if (((TileEntityChest)a).getChestType() == 0) {
                        a = new Color(255, 161, 27);
                     }
                  }

                  if (a instanceof TileEntityEnderChest && this.Field2187.getValue()) {
                     a = new Color(225, 0, 255);
                  }
               }
            }

            if (this.Field2185.isCurrentMode("Box")) {
               var3 = mc.theWorld.loadedTileEntityList.Method1383();
               if (var3.Method932()) {
                  a = (TileEntity)var3.Method933();
                  Color a = new Color(0);
                  double a;
                  double a;
                  double a;
                  if (a instanceof TileEntityChest && this.Field2186.getValue()) {
                     if (((TileEntityChest)a).getChestType() == 1) {
                        a = new Color(255, 0, 0, 155);
                     }

                     if (((TileEntityChest)a).getChestType() == 0) {
                        a = new Color(255, 161, 27, 155);
                     }

                     a = (double)a.getPos().getX() - ReflectionUtils.getRenderPosX();
                     a = (double)a.getPos().getY() - ReflectionUtils.getRenderPosY();
                     a = (double)a.getPos().getZ() - ReflectionUtils.getRenderPosZ();
                     RenderUtils.Method1134(a, a, a, a.getRGB(), a.getRGB(), 1.0F);
                  }

                  if (a instanceof TileEntityEnderChest && this.Field2187.getValue()) {
                     a = new Color(225, 0, 255, 155);
                     a = (double)a.getPos().getX() - ReflectionUtils.getRenderPosX();
                     a = (double)a.getPos().getY() - ReflectionUtils.getRenderPosY();
                     a = (double)a.getPos().getZ() - ReflectionUtils.getRenderPosZ();
                     RenderUtils.Method1134(a, a, a, a.getRGB(), a.getRGB(), 1.0F);
                  }
               }
            }

            RenderHelper.disableStandardItemLighting();
            GlStateManager.disableBlend();
         }
      }
   }

   public static void Method1178(BlockPos a) {
      double a = (double)a.getX() - Minecraft.getMinecraft().getRenderManager().viewerPosX;
      double a = (double)a.getY() - Minecraft.getMinecraft().getRenderManager().viewerPosY;
      double a = (double)a.getZ() - Minecraft.getMinecraft().getRenderManager().viewerPosZ;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(true);
      GL11.glColor4d(255.0, 170.0, 0.0, 1.0);
      Method2099(new AxisAlignedBB(a, a, a, a + 1.0, a + 1.0, a + 1.0));
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void Method2096(BlockPos a) {
      double a = (double)a.getX() - Minecraft.getMinecraft().getRenderManager().viewerPosX;
      double a = (double)a.getY() - Minecraft.getMinecraft().getRenderManager().viewerPosY;
      double a = (double)a.getZ() - Minecraft.getMinecraft().getRenderManager().viewerPosZ;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(true);
      GL11.glColor4d(170.0, 0.0, 170.0, 1.0);
      Method2099(new AxisAlignedBB(a, a, a, a + 1.0, a + 1.0, a + 1.0));
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void Method2097(AxisAlignedBB a, float a, float a, float a, float a, float a, float a, float a, float a, float a, boolean a10, boolean a11) {
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GlStateManager.disableLighting();
      GL11.glDepthMask(false);
      GL11.glColor4f(a, a, a, a);
      Method2098(new AxisAlignedBB(a.minX, a.minY, a.minZ, a.maxX, a.maxY, a.maxZ));
      GL11.glLineWidth(a);
      GL11.glColor4f(a, a, a, a);
      Method1629(new AxisAlignedBB(a.minX, a.minY, a.minZ, a.maxX, a.maxY, a.maxZ));
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GlStateManager.enableLighting();
      RenderHelper.disableStandardItemLighting();
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void Method1629(AxisAlignedBB a) {
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      a.begin(3, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.draw();
      a.begin(3, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.draw();
      a.begin(1, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.draw();
   }

   public static void Method2098(AxisAlignedBB a) {
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.draw();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      Class492.Method2239();
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.draw();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.draw();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.draw();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.draw();
      a.begin(7, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.draw();
      if (a.trash() == null) {
         Class492.Method2238("H8VUSc");
      }

   }

   public static void Method2099(AxisAlignedBB a) {
      Tessellator a = Tessellator.getInstance();
      WorldRenderer a = a.getWorldRenderer();
      a.begin(3, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.draw();
      a.begin(3, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.draw();
      a.begin(1, DefaultVertexFormats.POSITION);
      a.pos(a.minX, a.minY, a.minZ).endVertex();
      a.pos(a.minX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.minZ).endVertex();
      a.pos(a.maxX, a.maxY, a.minZ).endVertex();
      a.pos(a.maxX, a.minY, a.maxZ).endVertex();
      a.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      a.pos(a.minX, a.minY, a.maxZ).endVertex();
      a.pos(a.minX, a.maxY, a.maxZ).endVertex();
      a.draw();
   }
}
