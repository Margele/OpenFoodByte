package trash.foodbyte.module.impl.combat;

import eventapi.EventTarget;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import obfuscate.b;
import trash.foodbyte.event.EventEntityTick;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class Reach extends Module {
   public FloatValue Field2486 = new FloatValue("Reach", "MaxReach", 3.5F, 3.0F, 7.0F, 0.1F, "最远距离");
   public FloatValue Field2487 = new FloatValue("Reach", "MinReach", 3.5F, 3.0F, 7.0F, 0.1F, "最近距离");
   public FloatValue Field2488 = new FloatValue("Reach", "BlockReach", 5.0F, 4.5F, 7.0F, 0.1F, "修改瞄准方块距离");
   public BooleanValue Field2489 = new BooleanValue("Reach", "ThroughWalls", true, "隔墙(有墙点击墙就能攻击)");
   Random Field2490 = new Random();
   private TimeHelper Field2491 = new TimeHelper();

   public Reach() {
      super("Reach", Category.COMBAT);
   }

   public String getDescription() {
      return "修改攻击距离";
   }

   public float Method276() {
      float var1 = this.Field2487.getFloatValue();
      float var2 = this.Field2486.getFloatValue();
      return (float)((double)var2 + this.Field2490.nextDouble() * (double)(var1 - var2));
   }

   public float Method798() {
      float var1 = this.Method276();
      float var2 = this.Field2488.getFloatValue();
      return Math.max(var1, var2);
   }

   @EventTarget
   public void Method712(EventMotion a) {
      this.setDisplayTag(this.Field2487.getFloatValue().doubleValue() == this.Field2486.getFloatValue().doubleValue() ? this.Method276() + "" : this.Field2487.getFloatValue() + "-" + this.Field2486.getFloatValue());
   }

   @EventTarget
   private void Method747(EventEntityTick a) {
      if (a.getEntity().equals(mc.thePlayer) && this.Field2489.getBooleanValue()) {
         double var2 = 3.4;
         Object[] var4 = this.Method926(var2, 0.0, 0.0F);
         if (mc.gameSettings.keyBindAttack.isKeyDown() && this.Field2491.isDelayComplete(100.0) && mc.objectMouseOver.typeOfHit == MovingObjectType.BLOCK) {
            mc.objectMouseOver = new MovingObjectPosition((Entity)var4[0], (Vec3)var4[1]);
            mc.pointedEntity = (Entity)var4[0];
            mc.thePlayer.swingItem();
            mc.playerController.attackEntity(mc.thePlayer, mc.objectMouseOver.entityHit);
            this.Field2491.reset();
         }
      }

   }

   public Object[] Method926(double a, double a, float a) {
      Entity var7 = mc.getRenderViewEntity();
      b.trash();
      Entity var8 = null;
      if (mc.theWorld == null) {
         return null;
      } else {
         mc.mcProfiler.startSection("pick");
         Vec3 var9 = var7.getPositionEyes(0.0F);
         Vec3 var10 = var7.getLook(0.0F);
         Vec3 var11 = var9.addVector(var10.xCoord * a, var10.yCoord * a, var10.zCoord * a);
         Vec3 var12 = null;
         float var13 = 1.0F;
         List var14 = mc.theWorld.getEntitiesWithinAABBExcludingEntity(var7, var7.getEntityBoundingBox().addCoord(var10.xCoord * a, var10.yCoord * a, var10.zCoord * a).expand(1.0, 1.0, 1.0));
         double var15 = a;
         int var17 = 0;
         if (var17 < var14.Method1799()) {
            Entity var18 = (Entity)var14.get(var17);
            if (var18.canBeCollidedWith()) {
               label58: {
                  HitBox var19 = (HitBox)ModuleManager.getModule(HitBox.class);
                  float var20 = var19.Method1187(var18) ? var19.Field2607.getFloatValue() : var18.getCollisionBorderSize();
                  AxisAlignedBB var21 = var18.getEntityBoundingBox().expand((double)var20, (double)var20, (double)var20);
                  var21 = var21.expand(a, a, a);
                  MovingObjectPosition var22 = var21.calculateIntercept(var9, var11);
                  if (var21.isVecInside(var9)) {
                     if (!(0.0 < a) && a != 0.0) {
                        break label58;
                     }

                     var8 = var18;
                     var15 = 0.0;
                  }

                  double var23 = var9.distanceTo(var22.hitVec);
                  if (var23 < var15 || var15 == 0.0) {
                     label62: {
                        if (var18 == var7.ridingEntity) {
                           if (var15 != 0.0) {
                              break label62;
                           }

                           var12 = var22.hitVec;
                        }

                        var8 = var18;
                        var12 = var22.hitVec;
                        var15 = var23;
                     }
                  }
               }
            }

            ++var17;
         }

         if (var15 < a && !(var8 instanceof EntityLivingBase) && !(var8 instanceof EntityItemFrame)) {
            var8 = null;
         }

         mc.mcProfiler.endSection();
         return null;
      }
   }

   public void onEnable() {
      super.onEnable();
   }

   public void onDisable() {
      super.onDisable();
   }
}
