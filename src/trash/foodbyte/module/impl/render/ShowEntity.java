package trash.foodbyte.module.impl.render;

import awsl.Class492;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.List;
import java.util.Random;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.FloatValue;

public class ShowEntity extends Module {
   public FloatValue Field2209 = new FloatValue("ShowEntity", "EntityReach", 5.0, 3.0, 10.0, 0.1, "瞄准实体的距离开始显示");
   public FloatValue Field2210 = new FloatValue("ShowEntity", "entityInfoStay", 0.0, 0.0, 5.0, 1.0, "延迟消失实体数据");
   private Entity Field2211;
   private MovingObjectPosition Field2212;
   EntityLivingBase Field2213;
   long Field2214 = 0L;

   public ShowEntity() {
      super("ShowEntity", "Show Entity", Category.RENDER);
   }

   public String getDescription() {
      return "显示瞄准实体的数据";
   }

   @EventTarget
   private void Method810(EventRender2D a) {
      ScaledResolution var3 = new ScaledResolution(mc);
      Class492.Method2239();
      long var4 = System.currentTimeMillis();
      MovingObjectPosition var6 = this.Method2277((double)this.Field2209.getFloatValue(), 0.0F);
      if (var6.entityHit != null && var6.entityHit instanceof EntityLivingBase) {
         this.Field2213 = (EntityLivingBase)var6.entityHit;
         this.Field2214 = var4;
      }

      if (this.Field2213 != null && !this.Field2213.isInvisibleToPlayer(mc.thePlayer) && (float)(var4 - this.Field2214) <= 1000.0F * this.Field2210.getFloatValueCast()) {
         try {
            float var7 = 1.0F;
            if (this.Field2213.width > var7) {
               var7 = this.Field2213.width;
            }

            if (this.Field2213.height > var7 * 2.0F) {
               var7 = this.Field2213.height / 2.0F;
            }

            int var8 = var3.getScaledWidth() / 2;
            int var9 = var3.getScaledHeight() / 2;
            String var10 = "" + (int)this.Field2213.getHealth();
            int var11 = mc.fontRendererObj.getStringWidth(var10);
            float var12 = this.Field2213.getHealth();
            if (var12 > 20.0F) {
               var12 = 20.0F;
            }

            int var13 = (int)Math.abs(var12 * 5.0F * 0.01F * 0.0F + (1.0F - var12 * 5.0F * 0.01F) * 255.0F);
            int var14 = (int)Math.abs(var12 * 5.0F * 0.01F * 255.0F + (1.0F - var12 * 5.0F * 0.01F) * 0.0F);
            Color var15 = (new Color(var13, var14, 0)).brighter();
            String var16 = this.Field2213.getDisplayName().getFormattedText();
            int var17 = var8 - 80;
            mc.fontRendererObj.drawStringWithShadow(var16, (float)var17, (float)(var9 - 55), 16777215);
            int var18 = MathHelper.ceiling_float_int(this.Field2213.getHealth());
            IAttributeInstance var19 = this.Field2213.getEntityAttribute(SharedMonsterAttributes.maxHealth);
            float var20 = (float)var19.getBaseValue();
            String var21 = var18 + "§f/§a" + (int)var20;
            byte var38 = 2;
            var20 = 2.0F;
            mc.getTextureManager().bindTexture(GuiIngame.icons);
            float var22 = Math.min(200.0F, var20);
            int var23 = (int)((float)var38 * var22 / var20);
            float var24;
            float var25 = var24 = this.Field2213.getAbsorptionAmount();
            int var26 = MathHelper.ceiling_float_int((var22 + var25) / 2.0F / 10.0F);
            int var27 = Math.max(10 - (var26 - 2), 3);
            boolean var28 = true;
            int var29 = MathHelper.ceiling_float_int((var22 + var25) / 2.0F) - 1;
            boolean var30 = true;
            boolean var31 = true;
            int var32 = MathHelper.ceiling_float_int((float)(var29 + 1) / 10.0F) - 1;
            int var33 = var29 % 10 * 8;
            int var35 = var9 - 45 + var32 * var27 * 1;
            if ((double)var23 <= (double)var22 * 0.4) {
               var35 += (new Random()).nextInt(2);
            }

            if (var29 == -1) {
               var35 -= 2;
            }

            byte var36 = 0;
            if (this.Field2213.worldObj.getWorldInfo().isHardcoreModeEnabled()) {
               var36 = 5;
            }

            mc.ingameGUI.drawTexturedModalRect(var17, var35, 25, 9 * var36, 9, 9);
            if (var24 > 0.0F) {
               if (var24 == var25 && var25 % 2.0F == 1.0F) {
                  mc.ingameGUI.drawTexturedModalRect(var17, var35, 169, 9 * var36, 9, 9);
               }

               mc.ingameGUI.drawTexturedModalRect(var17, var35, 160, 9 * var36, 9, 9);
               var24 -= 2.0F;
            }

            if (var29 * 2 + 1 < var23) {
               mc.ingameGUI.drawTexturedModalRect(var17, var35, 52, 9 * var36, 9, 9);
            }

            if (var29 * 2 + 1 == var23) {
               mc.ingameGUI.drawTexturedModalRect(var17, var35, 61, 9 * var36, 9, 9);
            }

            --var29;
            mc.fontRendererObj.drawStringWithShadow(var21, (float)var17 + 12.0F, (float)var9 - 45.0F, var15.getRGB());
         } catch (Exception var37) {
            var37.printStackTrace();
         }
      }

   }

   public MovingObjectPosition Method2277(double a, float a) {
      Entity var4 = mc.getRenderViewEntity();
      if (mc.theWorld == null) {
         return null;
      } else {
         mc.mcProfiler.startSection("pick");
         mc.pointedEntity = null;
         MovingObjectPosition var5 = var4.rayTrace(a, a);
         Vec3 var6 = var4.getPositionEyes(a);
         Vec3 var7 = var4.getLook(a);
         Vec3 var8 = var6.addVector(var7.xCoord * a, var7.yCoord * a, var7.zCoord * a);
         Entity var9 = null;
         Vec3 var10 = null;
         float var11 = 1.0F;
         List var12 = mc.theWorld.getEntitiesWithinAABBExcludingEntity(var4, var4.getEntityBoundingBox().addCoord(var7.xCoord * a, var7.yCoord * a, var7.zCoord * a).expand((double)var11, (double)var11, (double)var11));
         double var13 = var5.hitVec.distanceTo(var6);

         for(int var15 = 0; var15 < var12.Method1799(); ++var15) {
            Entity var16 = (Entity)var12.get(var15);
            if (var16.canBeCollidedWith()) {
               float var17 = var16.getCollisionBorderSize();
               AxisAlignedBB var18 = var16.getEntityBoundingBox().expand((double)var17, (double)var17, (double)var17);
               MovingObjectPosition var19 = var18.calculateIntercept(var6, var8);
               if (var18.isVecInside(var6)) {
                  if (0.0 < var13 || var13 == 0.0) {
                     var9 = var16;
                     var10 = var6;
                     var13 = 0.0;
                  }
               } else {
                  double var20 = var6.distanceTo(var19.hitVec);
                  if (var20 < var13 || var13 == 0.0) {
                     if (var16 == var4.ridingEntity) {
                        if (var13 == 0.0) {
                           var9 = var16;
                           var10 = var19.hitVec;
                        }
                     } else {
                        var9 = var16;
                        var10 = var19.hitVec;
                        var13 = var20;
                     }
                  }
               }
            }
         }

         if (!(var13 < a)) {
            ;
         }

         var5 = new MovingObjectPosition(var9, var10);
         if (var9 instanceof EntityLivingBase || var9 instanceof EntityItemFrame) {
            mc.pointedEntity = var9;
         }

         return var5;
      }
   }

   private static Exception Method263(Exception exception) {
      return exception;
   }
}
