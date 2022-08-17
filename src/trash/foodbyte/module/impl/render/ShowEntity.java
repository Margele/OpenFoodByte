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
      ScaledResolution a = new ScaledResolution(mc);
      Class492.Method2239();
      long a = System.currentTimeMillis();
      MovingObjectPosition a = this.Method2277((double)this.Field2209.getFloatValue(), 0.0F);
      if (a.entityHit != null && a.entityHit instanceof EntityLivingBase) {
         this.Field2213 = (EntityLivingBase)a.entityHit;
         this.Field2214 = a;
      }

      if (this.Field2213 != null && !this.Field2213.isInvisibleToPlayer(mc.thePlayer) && (float)(a - this.Field2214) <= 1000.0F * this.Field2210.getFloatValueCast()) {
         try {
            float a = 1.0F;
            if (this.Field2213.width > a) {
               a = this.Field2213.width;
            }

            if (this.Field2213.height > a * 2.0F) {
               a = this.Field2213.height / 2.0F;
            }

            int a = a.getScaledWidth() / 2;
            int a = a.getScaledHeight() / 2;
            String a = "" + (int)this.Field2213.getHealth();
            int a = mc.fontRendererObj.getStringWidth(a);
            float a = this.Field2213.getHealth();
            if (a > 20.0F) {
               a = 20.0F;
            }

            int a = (int)Math.abs(a * 5.0F * 0.01F * 0.0F + (1.0F - a * 5.0F * 0.01F) * 255.0F);
            int a = (int)Math.abs(a * 5.0F * 0.01F * 255.0F + (1.0F - a * 5.0F * 0.01F) * 0.0F);
            Color a = (new Color(a, a, 0)).brighter();
            String a = this.Field2213.getDisplayName().getFormattedText();
            int a = a - 80;
            mc.fontRendererObj.drawStringWithShadow(a, (float)a, (float)(a - 55), 16777215);
            int a = MathHelper.ceiling_float_int(this.Field2213.getHealth());
            IAttributeInstance a = this.Field2213.getEntityAttribute(SharedMonsterAttributes.maxHealth);
            float a = (float)a.getBaseValue();
            String a = a + "§f/§a" + (int)a;
            int a = 2;
            a = 2.0F;
            mc.getTextureManager().bindTexture(GuiIngame.icons);
            float a = Math.min(200.0F, a);
            int a = (int)((float)a * a / a);
            float a;
            float a = a = this.Field2213.getAbsorptionAmount();
            int a = MathHelper.ceiling_float_int((a + a) / 2.0F / 10.0F);
            int a = Math.max(10 - (a - 2), 3);
            int a = true;
            int a = MathHelper.ceiling_float_int((a + a) / 2.0F) - 1;
            int a = true;
            byte a = true;
            int a = MathHelper.ceiling_float_int((float)(a + 1) / 10.0F) - 1;
            int a = a % 10 * 8;
            int a = a - 45 + a * a * 1;
            if ((double)a <= (double)a * 0.4) {
               a += (new Random()).nextInt(2);
            }

            if (a == -1) {
               a -= 2;
            }

            byte a = 0;
            if (this.Field2213.worldObj.getWorldInfo().isHardcoreModeEnabled()) {
               a = 5;
            }

            mc.ingameGUI.drawTexturedModalRect(a, a, 25, 9 * a, 9, 9);
            if (a > 0.0F) {
               if (a == a && a % 2.0F == 1.0F) {
                  mc.ingameGUI.drawTexturedModalRect(a, a, 169, 9 * a, 9, 9);
               }

               mc.ingameGUI.drawTexturedModalRect(a, a, 160, 9 * a, 9, 9);
               a -= 2.0F;
            }

            if (a * 2 + 1 < a) {
               mc.ingameGUI.drawTexturedModalRect(a, a, 52, 9 * a, 9, 9);
            }

            if (a * 2 + 1 == a) {
               mc.ingameGUI.drawTexturedModalRect(a, a, 61, 9 * a, 9, 9);
            }

            --a;
            mc.fontRendererObj.drawStringWithShadow(a, (float)a + 12.0F, (float)a - 45.0F, a.getRGB());
         } catch (Exception var37) {
            var37.printStackTrace();
         }
      }

   }

   public MovingObjectPosition Method2277(double a, float a) {
      Entity a = mc.getRenderViewEntity();
      if (mc.theWorld == null) {
         return null;
      } else {
         mc.mcProfiler.startSection("pick");
         mc.pointedEntity = null;
         MovingObjectPosition a = a.rayTrace(a, a);
         Vec3 a = a.getPositionEyes(a);
         Vec3 a = a.getLook(a);
         Vec3 a = a.addVector(a.xCoord * a, a.yCoord * a, a.zCoord * a);
         Entity a = null;
         Vec3 a = null;
         float a = 1.0F;
         List a = mc.theWorld.getEntitiesWithinAABBExcludingEntity(a, a.getEntityBoundingBox().addCoord(a.xCoord * a, a.yCoord * a, a.zCoord * a).expand((double)a, (double)a, (double)a));
         double a = a.hitVec.distanceTo(a);

         for(int a = 0; a < a.Method1799(); ++a) {
            Entity a = (Entity)a.get(a);
            if (a.canBeCollidedWith()) {
               float a = a.getCollisionBorderSize();
               AxisAlignedBB a = a.getEntityBoundingBox().expand((double)a, (double)a, (double)a);
               MovingObjectPosition a = a.calculateIntercept(a, a);
               if (a.isVecInside(a)) {
                  if (0.0 < a || a == 0.0) {
                     a = a;
                     a = a;
                     a = 0.0;
                  }
               } else {
                  double a = a.distanceTo(a.hitVec);
                  if (a < a || a == 0.0) {
                     if (a == a.ridingEntity) {
                        if (a == 0.0) {
                           a = a;
                           a = a.hitVec;
                        }
                     } else {
                        a = a;
                        a = a.hitVec;
                        a = a;
                     }
                  }
               }
            }
         }

         if (!(a < a)) {
            ;
         }

         a = new MovingObjectPosition(a, a);
         if (a instanceof EntityLivingBase || a instanceof EntityItemFrame) {
            mc.pointedEntity = a;
         }

         return a;
      }
   }

   private static Exception Method263(Exception exception) {
      return exception;
   }
}
