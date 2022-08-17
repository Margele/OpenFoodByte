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
      float a = 0.0F;
      Class492.Method2239();
      float a = 0.99F;
      float a = 1.5F;
      if (mc.thePlayer.getHeldItem() != null) {
         if (mc.thePlayer.getHeldItem().getItem() instanceof ItemBow && mc.thePlayer.isUsingItem() || mc.thePlayer.getHeldItem().getItem() instanceof ItemFishingRod || mc.thePlayer.getHeldItem().getItem() instanceof ItemSnowball || mc.thePlayer.getHeldItem().getItem() instanceof ItemEnderPearl || mc.thePlayer.getHeldItem().getItem() instanceof ItemEgg || mc.thePlayer.getHeldItem().getItem() instanceof ItemPotion && ItemPotion.isSplash(mc.thePlayer.getHeldItem().getItemDamage())) {
            EntityPlayerSP a = mc.thePlayer;
            Item a = mc.thePlayer.getCurrentEquippedItem().getItem();
            boolean a = a instanceof ItemBow;
            double a = 1.0;
            double a;
            if (a instanceof ItemBow) {
               a = 0.05;
               float a = (float)(72000 - a.getItemInUseCount()) / 20.0F;
               a = (a * a + a * 2.0F) / 3.0F;
               if (a > 1.0F) {
                  a = 1.0F;
               }

               a *= 3.0F;
               a = a;
            }

            if (a instanceof ItemFishingRod) {
               a = 0.92F;
               a = 0.04;
            }

            if (ItemPotion.isSplash(mc.thePlayer.getCurrentEquippedItem().getMetadata())) {
               a = 0.05;
               a = -20.0F;
               a = 0.5F;
            }

            a = 0.03;
            double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * (double)a.Method3523() - Math.cos(Math.toRadians((double)a.rotationYaw)) * 0.1599999964237213;
            double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * (double)a.Method3523() + (double)a.getEyeHeight() - 0.1;
            double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * (double)a.Method3523() - Math.sin(Math.toRadians((double)a.rotationYaw)) * 0.1599999964237213;
            double a = (double)(-MathHelper.sin(mc.thePlayer.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(mc.thePlayer.rotationPitch / 180.0F * 3.1415927F)) * a;
            double a = (double)(-MathHelper.sin((mc.thePlayer.rotationPitch + a) / 180.0F * 3.1415927F)) * a;
            double a = (double)(MathHelper.cos(mc.thePlayer.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(mc.thePlayer.rotationPitch / 180.0F * 3.1415927F)) * a;
            float a = MathHelper.sqrt_double(a * a + a * a + a * a);
            a /= (double)a;
            a /= (double)a;
            a /= (double)a;
            a *= (double)a;
            a *= (double)a;
            a *= (double)a;
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
            boolean a = false;
            EntityLivingBase a = null;
            if (a > 0.0) {
               Vec3 a = new Vec3(a.posX, a.posY + (double)a.getEyeHeight(), a.posZ);
               Vec3 a = new Vec3(a, a, a);
               Vec3 a = new Vec3(a + a, a + a, a + a);
               this.Field2194 = mc.theWorld.rayTraceBlocks(a, a);
               this.Field2194 = mc.theWorld.rayTraceBlocks(a, a, false, true, false);
               if (this.Field2194 != null) {
                  a = true;
               }

               Iterator var31 = mc.theWorld.getLoadedEntityList().Method1383();
               if (var31.Method932()) {
                  Entity a = (Entity)var31.Method933();
                  if (a instanceof EntityLivingBase && !(a instanceof EntityPlayerSP)) {
                     this.Field2193 = (EntityLivingBase)a;
                     AxisAlignedBB a = this.Field2193.getEntityBoundingBox().expand(0.3, 0.3, 0.3);
                     this.Field2195 = a.calculateIntercept(a, a);
                     if (this.Field2195 != null) {
                        a = true;
                        this.Field2194 = this.Field2195;
                        a = this.Field2193;
                     }
                  }
               }

               a += a;
               a += a;
               a += a;
               BlockPos a = new BlockPos(a, a, a);
               Block a = mc.theWorld.getBlockState(a).getBlock();
               if (a.getMaterial() == Material.water) {
                  a *= 0.72;
                  a *= 0.72;
                  a *= 0.72;
               }

               double var10000 = a * (double)a;
               a *= (double)a;
               var10000 = a * (double)a;
               var10000 = a - a;
               GL11.glVertex3d(a - ReflectionUtils.getRenderPosX(), a - ReflectionUtils.getRenderPosY(), a - ReflectionUtils.getRenderPosZ());
            }

            GL11.glEnd();
            GL11.glPushMatrix();
            GL11.glColor4f(1.0F, 0.0F, 0.2F, 0.5F);
            GL11.glColor4f(0.0F, 0.6451613F, 1.0F, 0.5F);
            GL11.glTranslated(a - ReflectionUtils.getRenderPosX() - 0.5, a - ReflectionUtils.getRenderPosY() - 0.5, a - ReflectionUtils.getRenderPosZ() - 0.5);
            if (this.Field2194 != null && this.Field2194.typeOfHit == MovingObjectType.BLOCK) {
               int a = this.Field2194.sideHit.getIndex();
               if (a == 2) {
                  GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
                  Method1629(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
                  Method2098(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
               }

               if (a == 3) {
                  GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
                  Method1629(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
                  Method2098(new AxisAlignedBB(0.0, 0.5, -1.0, 1.0, 0.5, 0.0));
               }

               if (a == 4) {
                  GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
                  Method1629(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
                  Method2098(new AxisAlignedBB(0.0, -0.5, 0.0, 1.0, -0.5, 1.0));
               }

               if (a == 5) {
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
            double a = (double)ReflectionUtils.getRenderPartialTicks();
            double a = a.lastTickPosX + (a.posX - a.lastTickPosX) * a - ReflectionUtils.getRenderPosX();
            double a = a.lastTickPosY + (a.posY - a.lastTickPosY) * a - ReflectionUtils.getRenderPosY();
            double a = a.lastTickPosZ + (a.posZ - a.lastTickPosZ) * a - ReflectionUtils.getRenderPosZ();
            Color a = new Color(255, 0, 0);
            RenderUtils.Method1121(a, a, a, (double)a.width / 1.5, (double)a.height + 0.2, (float)a.getRed() / 255.0F, (float)a.getGreen() / 255.0F, (float)a.getBlue() / 255.0F, 1.0F);
         }
      }
   }

   public ArrayList Method241() {
      ArrayList a = new ArrayList();
      Iterator var2 = mc.theWorld.loadedEntityList.Method1383();

      while(var2.Method932()) {
         Object a = var2.Method933();
         if (a != mc.thePlayer && a instanceof EntityLivingBase) {
            a.Method2530(a);
         }
      }

      return a;
   }

   public Entity Method2108(boolean a, Vec3 a, Vec3 a) {
      Iterator var4 = this.Method241().Method1383();

      EntityLivingBase a;
      do {
         if (!var4.Method932()) {
            return null;
         }

         Object a = var4.Method933();
         a = (EntityLivingBase)a;
      } while(a == mc.thePlayer);

      float a = 0.2F;
      AxisAlignedBB a = a.getEntityBoundingBox().expand((double)a, (double)a, (double)a);
      MovingObjectPosition a = a.calculateIntercept(a, a);
      return a;
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
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
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

   public static void Method2112(double a, double a, double a, double a, int a, int a) {
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      float a = (float)(a >> 24 & 255) / 255.0F;
      float a = (float)(a >> 16 & 255) / 255.0F;
      float a = (float)(a >> 8 & 255) / 255.0F;
      float a = (float)(a & 255) / 255.0F;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(2848);
      GL11.glShadeModel(7425);
      GL11.glPushMatrix();
      GL11.glBegin(7);
      GL11.glColor4f(a, a, a, a);
      GL11.glVertex2d(a, a);
      GL11.glVertex2d(a, a);
      GL11.glColor4f(a, a, a, a);
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
