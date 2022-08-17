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
      float a = this.Field2487.getFloatValue();
      float a = this.Field2486.getFloatValue();
      return (float)((double)a + this.Field2490.nextDouble() * (double)(a - a));
   }

   public float Method798() {
      float a = this.Method276();
      float a = this.Field2488.getFloatValue();
      return Math.max(a, a);
   }

   @EventTarget
   public void Method712(EventMotion a) {
      this.setDisplayTag(this.Field2487.getFloatValue().doubleValue() == this.Field2486.getFloatValue().doubleValue() ? this.Method276() + "" : this.Field2487.getFloatValue() + "-" + this.Field2486.getFloatValue());
   }

   @EventTarget
   private void Method747(EventEntityTick a) {
      if (a.getEntity().equals(mc.thePlayer) && this.Field2489.getBooleanValue()) {
         double a = 3.4;
         Object[] a = this.Method926(a, 0.0, 0.0F);
         if (mc.gameSettings.keyBindAttack.isKeyDown() && this.Field2491.isDelayComplete(100.0) && mc.objectMouseOver.typeOfHit == MovingObjectType.BLOCK) {
            mc.objectMouseOver = new MovingObjectPosition((Entity)a[0], (Vec3)a[1]);
            mc.pointedEntity = (Entity)a[0];
            mc.thePlayer.swingItem();
            mc.playerController.attackEntity(mc.thePlayer, mc.objectMouseOver.entityHit);
            this.Field2491.reset();
         }
      }

   }

   public Object[] Method926(double a, double a, float a2) {
      Entity a = mc.getRenderViewEntity();
      b.trash();
      Entity a = null;
      if (mc.theWorld == null) {
         return null;
      } else {
         mc.mcProfiler.startSection("pick");
         Vec3 a = a.getPositionEyes(0.0F);
         Vec3 a = a.getLook(0.0F);
         Vec3 a = a.addVector(a.xCoord * a, a.yCoord * a, a.zCoord * a);
         Vec3 a = null;
         float a = 1.0F;
         List a = mc.theWorld.getEntitiesWithinAABBExcludingEntity(a, a.getEntityBoundingBox().addCoord(a.xCoord * a, a.yCoord * a, a.zCoord * a).expand(1.0, 1.0, 1.0));
         double a = a;
         int a = 0;
         if (a < a.Method1799()) {
            Entity a = (Entity)a.get(a);
            if (a.canBeCollidedWith()) {
               label58: {
                  HitBox a = (HitBox)ModuleManager.getModule(HitBox.class);
                  float a = a.Method1187(a) ? a.Field2607.getFloatValue() : a.getCollisionBorderSize();
                  AxisAlignedBB a = a.getEntityBoundingBox().expand((double)a, (double)a, (double)a);
                  a = a.expand(a, a, a);
                  MovingObjectPosition a = a.calculateIntercept(a, a);
                  if (a.isVecInside(a)) {
                     if (!(0.0 < a) && a != 0.0) {
                        break label58;
                     }

                     a = a;
                     a = 0.0;
                  }

                  double a = a.distanceTo(a.hitVec);
                  if (a < a || a == 0.0) {
                     label62: {
                        if (a == a.ridingEntity) {
                           if (a != 0.0) {
                              break label62;
                           }

                           a = a.hitVec;
                        }

                        a = a;
                        a = a.hitVec;
                        a = a;
                     }
                  }
               }
            }

            ++a;
         }

         if (a < a && !(a instanceof EntityLivingBase) && !(a instanceof EntityItemFrame)) {
            a = null;
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
