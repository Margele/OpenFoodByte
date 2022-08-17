package trash.foodbyte.module.impl.render;

import awsl.Class492;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSnowball;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;

public class Trajectories extends Module {
   public static float Field2192 = 1.0F;
   private EntityLivingBase Field2193;
   private MovingObjectPosition Field2194 = null;
   private MovingObjectPosition Field2195 = null;

   public Trajectories() {
      super("Trajectories", Category.RENDER);
      this.setDescription("抛物线(使用弓箭雪球末影珍珠有一条线)");
   }

   @EventTarget(0)
   public void Method802(EventRender3D a) {
      float var4 = 0.0F;
      Class492.Method2239();
      float var5 = 0.99F;
      float var6 = 1.5F;
      if (mc.thePlayer.getHeldItem() != null) {
         if (mc.thePlayer.getHeldItem().getItem() instanceof ItemBow && mc.thePlayer.isUsingItem() || mc.thePlayer.getHeldItem().getItem() instanceof ItemFishingRod || mc.thePlayer.getHeldItem().getItem() instanceof ItemSnowball || mc.thePlayer.getHeldItem().getItem() instanceof ItemEnderPearl || mc.thePlayer.getHeldItem().getItem() instanceof ItemEgg || mc.thePlayer.getHeldItem().getItem() instanceof ItemPotion && ItemPotion.isSplash(mc.thePlayer.getHeldItem().getItemDamage())) {
            EntityPlayerSP var9 = mc.thePlayer;
            Item var10 = mc.thePlayer.getCurrentEquippedItem().getItem();
            boolean var3 = var10 instanceof ItemBow;
            double var11 = 1.0;
            double var7;
            if (var10 instanceof ItemBow) {
               var7 = 0.05;
               float var13 = (float)(72000 - var9.getItemInUseCount()) / 20.0F;
               var13 = (var13 * var13 + var13 * 2.0F) / 3.0F;
               if (var13 > 1.0F) {
                  var13 = 1.0F;
               }

               var13 *= 3.0F;
               var6 = var13;
            }

            if (var10 instanceof ItemFishingRod) {
               var5 = 0.92F;
               var7 = 0.04;
            }

            if (ItemPotion.isSplash(mc.thePlayer.getCurrentEquippedItem().getMetadata())) {
               var7 = 0.05;
               var4 = -20.0F;
               var6 = 0.5F;
            }

            var7 = 0.03;
            double var37 = var9.lastTickPosX + (var9.posX - var9.lastTickPosX) * (double)a.Method3523() - Math.cos(Math.toRadians((double)var9.rotationYaw)) * 0.1599999964237213;
            double var15 = var9.lastTickPosY + (var9.posY - var9.lastTickPosY) * (double)a.Method3523() + (double)var9.getEyeHeight() - 0.1;
            double var17 = var9.lastTickPosZ + (var9.posZ - var9.lastTickPosZ) * (double)a.Method3523() - Math.sin(Math.toRadians((double)var9.rotationYaw)) * 0.1599999964237213;
            double var19 = (double)(-MathHelper.sin(mc.thePlayer.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(mc.thePlayer.rotationPitch / 180.0F * 3.1415927F)) * var11;
            double var21 = (double)(-MathHelper.sin((mc.thePlayer.rotationPitch + var4) / 180.0F * 3.1415927F)) * var11;
            double var23 = (double)(MathHelper.cos(mc.thePlayer.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(mc.thePlayer.rotationPitch / 180.0F * 3.1415927F)) * var11;
            float var25 = MathHelper.sqrt_double(var19 * var19 + var21 * var21 + var23 * var23);
            var19 /= (double)var25;
            var21 /= (double)var25;
            var23 /= (double)var25;
            var19 *= (double)var6;
            var21 *= (double)var6;
            var23 *= (double)var6;
            GL11.glPushMatrix();
            GL11.glEnable(3553);
            GL11.glDisable(2896);
            GL11.glEnable(2848);
            GL11.glDisable(2929);
            GL11.glColor4f(0.0F, 0.6451613F, 1.0F, Field2192);
            GL11.glDisable(3553);
            GL11.glDepthMask(false);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glLineWidth(1.5F);
            GL11.glBegin(3);
            boolean var26 = false;
            EntityLivingBase var27 = null;
            if (var15 > 0.0) {
               Vec3 var28 = new Vec3(var9.posX, var9.posY + (double)var9.getEyeHeight(), var9.posZ);
               Vec3 var29 = new Vec3(var37, var15, var17);
               Vec3 var30 = new Vec3(var37 + var19, var15 + var21, var17 + var23);
               this.Field2194 = mc.theWorld.rayTraceBlocks(var28, var29);
               this.Field2194 = mc.theWorld.rayTraceBlocks(var29, var30, false, true, false);
               if (this.Field2194 != null) {
                  var26 = true;
               }

               Iterator var31 = mc.theWorld.getLoadedEntityList().Method1383();
               if (var31.Method932()) {
                  Entity var32 = (Entity)var31.Method933();
                  if (var32 instanceof EntityLivingBase && !(var32 instanceof EntityPlayerSP)) {
                     this.Field2193 = (EntityLivingBase)var32;
                     AxisAlignedBB var33 = this.Field2193.getEntityBoundingBox().expand(0.3, 0.3, 0.3);
                     this.Field2195 = var33.calculateIntercept(var28, var29);
                     if (this.Field2195 != null) {
                        var26 = true;
                        this.Field2194 = this.Field2195;
                        var27 = this.Field2193;
                     }
                  }
               }

               var37 += var19;
               var15 += var21;
               var17 += var23;
               BlockPos var41 = new BlockPos(var37, var15, var17);
               Block var42 = mc.theWorld.getBlockState(var41).getBlock();
               if (var42.getMaterial() == Material.water) {
                  var19 *= 0.72;
                  var21 *= 0.72;
                  var23 *= 0.72;
               }

               double var10000 = var19 * (double)var5;
               var21 *= (double)var5;
               var10000 = var23 * (double)var5;
               var10000 = var21 - var7;
               GL11.glVertex3d(var37 - ReflectionUtils.getRenderPosX(), var15 - ReflectionUtils.getRenderPosY(), var17 - ReflectionUtils.getRenderPosZ());
            }

            GL11.glEnd();
            GL11.glPushMatrix();
            GL11.glColor4f(1.0F, 0.0F, 0.2F, 0.5F);
            GL11.glColor4f(0.0F, 0.6451613F, 1.0F, 0.5F);
            GL11.glTranslated(var37 - ReflectionUtils.getRenderPosX() - 0.5, var15 - ReflectionUtils.getRenderPosY() - 0.5, var17 - ReflectionUtils.getRenderPosZ() - 0.5);
            if (this.Field2194 != null && this.Field2194.typeOfHit == MovingObjectType.BLOCK) {
               int var38 = this.Field2194.sideHit.getIndex();
               if (var38 == 2) {
                  GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
                  Method1629(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
                  Method2098(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
               }

               if (var38 == 3) {
                  GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
                  Method1629(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
                  Method2098(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
               }

               if (var38 == 4) {
                  GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
                  Method1629(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
                  Method2098(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
               }

               if (var38 == 5) {
                  GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
                  Method1629(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
                  Method2098(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
               }

               Method1629(new AxisAlignedBB(0.0, 0.5, 0.0, 1.0, 0.5, 1.0));
               Method2098(new AxisAlignedBB(0.0, 0.5, 0.0, 1.0, 0.5, 1.0));
            }

            GL11.glPopMatrix();
            GL11.glDisable(3042);
            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(2929);
            GL11.glDisable(2848);
            GL11.glPopMatrix();
            double var39 = (double)ReflectionUtils.getRenderPartialTicks();
            double var40 = var27.lastTickPosX + (var27.posX - var27.lastTickPosX) * var39 - ReflectionUtils.getRenderPosX();
            double var43 = var27.lastTickPosY + (var27.posY - var27.lastTickPosY) * var39 - ReflectionUtils.getRenderPosY();
            double var34 = var27.lastTickPosZ + (var27.posZ - var27.lastTickPosZ) * var39 - ReflectionUtils.getRenderPosZ();
            Color var36 = new Color(255, 0, 0);
            RenderUtils.Method1121(var40, var43, var34, (double)var27.width / 1.5, (double)var27.height + 0.2, (float)var36.getRed() / 255.0F, (float)var36.getGreen() / 255.0F, (float)var36.getBlue() / 255.0F, 1.0F);
         }
      }
   }

   public ArrayList Method241() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = mc.theWorld.loadedEntityList.Method1383();

      while(var2.Method932()) {
         Object var3 = var2.Method933();
         if (var3 != mc.thePlayer && var3 instanceof EntityLivingBase) {
            var1.Method2530(var3);
         }
      }

      return var1;
   }

   public Entity Method2108(boolean a, Vec3 a, Vec3 a) {
      Iterator var4 = this.Method241().Method1383();

      EntityLivingBase var6;
      do {
         if (!var4.Method932()) {
            return null;
         }

         Object var5 = var4.Method933();
         var6 = (EntityLivingBase)var5;
      } while(var6 == mc.thePlayer);

      float var7 = 0.2F;
      AxisAlignedBB var8 = var6.getEntityBoundingBox().expand((double)var7, (double)var7, (double)var7);
      MovingObjectPosition var9 = var8.calculateIntercept(a, a);
      return var6;
   }

   public static void Method1629(AxisAlignedBB a) {
      GL11.glBegin(7);
      GL11.glVertex3d(a.minX, a.minY, a.minZ);
      GL11.glVertex3d(a.maxX, a.minY, a.minZ);
      GL11.glVertex3d(a.maxX, a.minY, a.maxZ);
      GL11.glVertex3d(a.minX, a.minY, a.maxZ);
      GL11.glVertex3d(a.minX, a.maxY, a.minZ);
      GL11.glVertex3d(a.minX, a.maxY, a.maxZ);
      GL11.glVertex3d(a.maxX, a.maxY, a.maxZ);
      GL11.glVertex3d(a.maxX, a.maxY, a.minZ);
      GL11.glVertex3d(a.minX, a.minY, a.minZ);
      GL11.glVertex3d(a.minX, a.maxY, a.minZ);
      GL11.glVertex3d(a.maxX, a.maxY, a.minZ);
      GL11.glVertex3d(a.maxX, a.minY, a.minZ);
      GL11.glVertex3d(a.maxX, a.minY, a.minZ);
      GL11.glVertex3d(a.maxX, a.maxY, a.minZ);
      GL11.glVertex3d(a.maxX, a.maxY, a.maxZ);
      GL11.glVertex3d(a.maxX, a.minY, a.maxZ);
      GL11.glVertex3d(a.minX, a.minY, a.maxZ);
      GL11.glVertex3d(a.maxX, a.minY, a.maxZ);
      GL11.glVertex3d(a.maxX, a.maxY, a.maxZ);
      GL11.glVertex3d(a.minX, a.maxY, a.maxZ);
      GL11.glVertex3d(a.minX, a.minY, a.minZ);
      GL11.glVertex3d(a.minX, a.minY, a.maxZ);
      GL11.glVertex3d(a.minX, a.maxY, a.maxZ);
      GL11.glVertex3d(a.minX, a.maxY, a.minZ);
      GL11.glEnd();
   }

   public static void Method2098(AxisAlignedBB a) {
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

   public void Method2109(float a, float a, float a, float a, int a) {
      Method2111((double)a, (double)a, (double)a, (double)(a + 0.5F), a);
      Method2111((double)a, (double)(a + 0.5F), (double)(a + 0.5F), (double)a, a);
      Method2111((double)(a - 0.5F), (double)(a + 0.5F), (double)a, (double)(a - 0.5F), a);
      Method2111((double)(a + 0.5F), (double)(a - 0.5F), (double)a, (double)a, a);
   }

   public static void Method2110(double a, double a, double a, double a, float a, float a, float a, float a) {
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GL11.glPushMatrix();
      GL11.glColor4f(a, a, a, a);
      GL11.glBegin(7);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glEnd();
      GlStateManager.disableTexture2D();
      GlStateManager.disableBlend();
      GL11.glPopMatrix();
   }

   public static void Method2111(double a, double a, double a, double a, int a) {
      float var9 = (float)(a >> 24 & 255) / 255.0F;
      float var10 = (float)(a >> 16 & 255) / 255.0F;
      float var11 = (float)(a >> 8 & 255) / 255.0F;
      float var12 = (float)(a & 255) / 255.0F;
      GlStateManager.enableBlend();
      GlStateManager.disableTexture2D();
      GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
      GL11.glPushMatrix();
      GL11.glColor4f(var10, var11, var12, var9);
      GL11.glBegin(7);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glEnd();
      GlStateManager.disableTexture2D();
      GlStateManager.disableBlend();
      GL11.glPopMatrix();
   }

   public static void Method2112(double a, double a, double a, double a, int a, int a) {
      float var10 = (float)(a >> 24 & 255) / 255.0F;
      float var11 = (float)(a >> 16 & 255) / 255.0F;
      float var12 = (float)(a >> 8 & 255) / 255.0F;
      float var13 = (float)(a & 255) / 255.0F;
      float var14 = (float)(a >> 24 & 255) / 255.0F;
      float var15 = (float)(a >> 16 & 255) / 255.0F;
      float var16 = (float)(a >> 8 & 255) / 255.0F;
      float var17 = (float)(a & 255) / 255.0F;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glShadeModel(7425);
      GL11.glPushMatrix();
      GL11.glBegin(7);
      GL11.glColor4f(var11, var12, var13, var10);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glColor4f(var15, var16, var17, var14);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
      GL11.glDisable(2848);
      GL11.glShadeModel(7424);
   }

   public void Method2113(Entity a, AxisAlignedBB a, float a, float a, float a, float a, float a) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(2896);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glLineWidth(a);
      GL11.glColor4f(a, a, a, a);
      Method2099(a);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(2848);
      GL11.glEnable(3553);
      GL11.glEnable(2896);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
   }

   public static void Method2099(AxisAlignedBB a) {
   }
}
