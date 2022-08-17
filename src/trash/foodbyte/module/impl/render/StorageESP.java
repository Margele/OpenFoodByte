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
      String var2 = Class492.Method2239();
      if (!ServerUtils.isSinglePlayer(Servers.SG) || !ServerUtils.isStartingGame()) {
         if (!ServerUtils.isPlayingSkyblock() && !ServerUtils.isPlayingMurderMystery()) {
            Iterator var3;
            TileEntity var4;
            if (this.Field2185.isCurrentMode("OutLine")) {
               var3 = mc.theWorld.loadedTileEntityList.Method1383();

               while(var3.Method932()) {
                  var4 = (TileEntity)var3.Method933();
                  Color var5 = null;
                  if (var4 instanceof TileEntityChest && this.Field2186.getValue()) {
                     if (((TileEntityChest)var4).getChestType() == 1) {
                        var5 = new Color(255, 0, 0);
                     } else if (((TileEntityChest)var4).getChestType() == 0) {
                        var5 = new Color(255, 161, 27);
                     }
                  }

                  if (var4 instanceof TileEntityEnderChest && this.Field2187.getValue()) {
                     var5 = new Color(225, 0, 255);
                  }
               }
            }

            if (this.Field2185.isCurrentMode("Box")) {
               var3 = mc.theWorld.loadedTileEntityList.Method1383();
               if (var3.Method932()) {
                  var4 = (TileEntity)var3.Method933();
                  Color var11 = new Color(0);
                  double var7;
                  double var9;
                  double var12;
                  if (var4 instanceof TileEntityChest && this.Field2186.getValue()) {
                     if (((TileEntityChest)var4).getChestType() == 1) {
                        var11 = new Color(255, 0, 0, 155);
                     }

                     if (((TileEntityChest)var4).getChestType() == 0) {
                        var11 = new Color(255, 161, 27, 155);
                     }

                     var7 = (double)var4.getPos().getX() - ReflectionUtils.getRenderPosX();
                     var12 = (double)var4.getPos().getY() - ReflectionUtils.getRenderPosY();
                     var9 = (double)var4.getPos().getZ() - ReflectionUtils.getRenderPosZ();
                     RenderUtils.Method1134(var7, var12, var9, var11.getRGB(), var11.getRGB(), 1.0F);
                  }

                  if (var4 instanceof TileEntityEnderChest && this.Field2187.getValue()) {
                     var11 = new Color(225, 0, 255, 155);
                     var7 = (double)var4.getPos().getX() - ReflectionUtils.getRenderPosX();
                     var12 = (double)var4.getPos().getY() - ReflectionUtils.getRenderPosY();
                     var9 = (double)var4.getPos().getZ() - ReflectionUtils.getRenderPosZ();
                     RenderUtils.Method1134(var7, var12, var9, var11.getRGB(), var11.getRGB(), 1.0F);
                  }
               }
            }

            RenderHelper.disableStandardItemLighting();
            GlStateManager.disableBlend();
         }
      }
   }

   public static void Method1178(BlockPos a) {
      double var1 = (double)a.getX() - Minecraft.getMinecraft().getRenderManager().viewerPosX;
      double var3 = (double)a.getY() - Minecraft.getMinecraft().getRenderManager().viewerPosY;
      double var5 = (double)a.getZ() - Minecraft.getMinecraft().getRenderManager().viewerPosZ;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(true);
      GL11.glColor4d(255.0, 170.0, 0.0, 1.0);
      Method2099(new AxisAlignedBB(var1, var3, var5, var1 + 1.0, var3 + 1.0, var5 + 1.0));
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void Method2096(BlockPos a) {
      double var1 = (double)a.getX() - Minecraft.getMinecraft().getRenderManager().viewerPosX;
      double var3 = (double)a.getY() - Minecraft.getMinecraft().getRenderManager().viewerPosY;
      double var5 = (double)a.getZ() - Minecraft.getMinecraft().getRenderManager().viewerPosZ;
      GL11.glPushMatrix();
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(true);
      GL11.glColor4d(170.0, 0.0, 170.0, 1.0);
      Method2099(new AxisAlignedBB(var1, var3, var5, var1 + 1.0, var3 + 1.0, var5 + 1.0));
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public static void Method2097(AxisAlignedBB a, float a, float a, float a, float a, float a, float a, float a, float a, float a, boolean a, boolean a) {
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
      Tessellator var1 = Tessellator.getInstance();
      WorldRenderer var2 = var1.getWorldRenderer();
      var2.begin(3, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var1.draw();
      var2.begin(3, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var1.draw();
      var2.begin(1, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var1.draw();
   }

   public static void Method2098(AxisAlignedBB a) {
      Tessellator var2 = Tessellator.getInstance();
      WorldRenderer var3 = var2.getWorldRenderer();
      var3.begin(7, DefaultVertexFormats.POSITION);
      var3.pos(a.minX, a.minY, a.minZ).endVertex();
      var3.pos(a.minX, a.maxY, a.minZ).endVertex();
      var3.pos(a.maxX, a.minY, a.minZ).endVertex();
      var3.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var3.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var3.pos(a.minX, a.minY, a.maxZ).endVertex();
      var3.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var2.draw();
      var3.begin(7, DefaultVertexFormats.POSITION);
      var3.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var3.pos(a.maxX, a.minY, a.minZ).endVertex();
      var3.pos(a.minX, a.maxY, a.minZ).endVertex();
      Class492.Method2239();
      var3.pos(a.minX, a.minY, a.minZ).endVertex();
      var3.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var3.pos(a.minX, a.minY, a.maxZ).endVertex();
      var3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var3.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.draw();
      var3.begin(7, DefaultVertexFormats.POSITION);
      var3.pos(a.minX, a.maxY, a.minZ).endVertex();
      var3.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var3.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var3.pos(a.minX, a.maxY, a.minZ).endVertex();
      var3.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var3.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.draw();
      var3.begin(7, DefaultVertexFormats.POSITION);
      var3.pos(a.minX, a.minY, a.minZ).endVertex();
      var3.pos(a.maxX, a.minY, a.minZ).endVertex();
      var3.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var3.pos(a.minX, a.minY, a.maxZ).endVertex();
      var3.pos(a.minX, a.minY, a.minZ).endVertex();
      var3.pos(a.minX, a.minY, a.maxZ).endVertex();
      var3.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var3.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.draw();
      var3.begin(7, DefaultVertexFormats.POSITION);
      var3.pos(a.minX, a.minY, a.minZ).endVertex();
      var3.pos(a.minX, a.maxY, a.minZ).endVertex();
      var3.pos(a.minX, a.minY, a.maxZ).endVertex();
      var3.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var3.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var3.pos(a.maxX, a.minY, a.minZ).endVertex();
      var3.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.draw();
      var3.begin(7, DefaultVertexFormats.POSITION);
      var3.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var3.pos(a.minX, a.minY, a.maxZ).endVertex();
      var3.pos(a.minX, a.maxY, a.minZ).endVertex();
      var3.pos(a.minX, a.minY, a.minZ).endVertex();
      var3.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var3.pos(a.maxX, a.minY, a.minZ).endVertex();
      var3.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var3.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.draw();
      if (a.trash() == null) {
         Class492.Method2238("H8VUSc");
      }

   }

   public static void Method2099(AxisAlignedBB a) {
      Tessellator var1 = Tessellator.getInstance();
      WorldRenderer var2 = var1.getWorldRenderer();
      var2.begin(3, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var1.draw();
      var2.begin(3, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var1.draw();
      var2.begin(1, DefaultVertexFormats.POSITION);
      var2.pos(a.minX, a.minY, a.minZ).endVertex();
      var2.pos(a.minX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.minZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.minZ).endVertex();
      var2.pos(a.maxX, a.minY, a.maxZ).endVertex();
      var2.pos(a.maxX, a.maxY, a.maxZ).endVertex();
      var2.pos(a.minX, a.minY, a.maxZ).endVertex();
      var2.pos(a.minX, a.maxY, a.maxZ).endVertex();
      var1.draw();
   }
}
