package trash.foodbyte.module.impl.combat;

import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.item.ItemSword;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.WorldSettings.GameType;
import obfuscate.a;
import obfuscate.b;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.utils.RotationUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class AimAssist extends Module {
   public ModeValue aimMode = new ModeValue("AimAssist", "Aim Mode", "New", new String[]{"Old", "New", "Blatant"}, "模式{旧的,新的,锁死}");
   public ModeValue priority = new ModeValue("AimAssist", "Priority", "Health", new String[]{"Health", "Reach", "Angle", "Fov"}, "优先瞄准{血量最少,距离最近,角度最小,视角最近}");
   public FloatValue hSpeed = new FloatValue("AimAssist", "H Speed", 10.0, 0.0, 20.0, 0.1, "左右瞄准速度");
   public FloatValue vSpeed = new FloatValue("AimAssist", "V Speed", 10.0, 0.0, 20.0, 0.1, "上下瞄准速度");
   public FloatValue range = new FloatValue("AimAssist", "Range", 3.8, 3.0, 10.0, 0.1, "瞄准距离");
   public FloatValue fov = new FloatValue("AimAssist", "Fov", 120.0, 1.0, 360.0, 5.0, "°", "瞄准视角(120°为屏幕能看见的地方)");
   public BooleanValue infiniteRange = new BooleanValue("AimAssist", "Infinite Range", false, "开启后无论多远都会自瞄(适合枪战小游戏)");
   public BooleanValue rayTrace = new BooleanValue("AimAssist", "RayTrace", false, "墙体检测");
   public BooleanValue blockCheck = new BooleanValue("AimAssist", "Block Check", true, "方块检测");
   public BooleanValue checkAim = new BooleanValue("AimAssist", "ClickAim", true, "按住左键才能开始自瞄");
   public BooleanValue weapon = new BooleanValue("AimAssist", "Weapon", false, "手拿武器才会自瞄");
   public BooleanValue players = new BooleanValue("AimAssist", "Players", true, "玩家");
   public BooleanValue animals = new BooleanValue("AimAssist", "Animals", false, "动物");
   public BooleanValue mobs = new BooleanValue("AimAssist", "Mobs", false, "怪物");
   public BooleanValue invisibles = new BooleanValue("AimAssist", "Invisibles", false, "隐身");
   protected Random random = new Random();
   public ArrayList targets = new ArrayList();
   EntityLivingBase target;
   public boolean aimLock = false;

   public AimAssist() {
      super("AimAssist", "Aim Assist", Category.COMBAT);
   }

   public String getDescription() {
      return "自瞄";
   }

   @EventTarget
   public void onRender(EventRender2D a) {
      new ScaledResolution(mc);
      if (this.weapon.getValue()) {
         if (mc.thePlayer.getCurrentEquippedItem() == null) {
            return;
         }

         if (!(mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword)) {
            return;
         }
      }

      if (this.checkAim.getBooleanValue() && !mc.gameSettings.keyBindAttack.isKeyDown()) {
         this.target = null;
      } else {
         if (this.target != null) {
         }

      }
   }

   @EventTarget
   public void Method755(EventTick a) {
      a[] a = b.trash();
      if (mc.playerController.getCurrentGameType() == GameType.ADVENTURE || mc.objectMouseOver.typeOfHit != MovingObjectType.BLOCK || this.target != null || !this.blockCheck.getBooleanValue()) {
         if (mc.thePlayer.ridingEntity != null) {
            if (this.weapon.getValue() && this.weapon.getValue() && !PlayerUtils.isVaildItem()) {
               return;
            }

            if (this.checkAim.getBooleanValue() && !mc.gameSettings.keyBindAttack.isKeyDown()) {
               return;
            }

            if (mc.playerController.getCurrentGameType() != GameType.ADVENTURE && mc.objectMouseOver.typeOfHit == MovingObjectType.BLOCK && !(mc.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemSword)) {
               return;
            }

            if (getMouseEntities((double)this.range.getFloatValue() + (this.infiniteRange.getBooleanValue() ? 999.0 : 0.0), 0.0) != null && KillAura.target == null) {
               return;
            }

            if (this.target != null && (double)mc.thePlayer.getDistanceToEntity(this.target) <= (double)this.range.getFloatValue() + (this.infiniteRange.getBooleanValue() ? 999.0 : 0.0)) {
               if (this.aimMode.isCurrentMode("Old")) {
                  boolean a = this.getYaw(this.target) > 0.0;
                  double a = (double)((float)(Math.random() / (90.0 / ((double)this.hSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.hSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8));
                  EntityPlayerSP var10000;
                  if ((this.getYaw(this.target) > 7.0 || this.getYaw(this.target) < -7.0) && (double)this.hSpeed.getFloatValue() * 10.0 >= 10.0) {
                     var10000 = mc.thePlayer;
                     var10000.rotationYaw += (float)(-(Math.abs(this.getYaw(this.target)) / a));
                  }

                  double a = (double)((float)(Math.random() / (90.0 / ((double)this.vSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.vSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8));
                  boolean a = this.getPitch(this.target) > 0.0;
                  if ((this.getPitch(this.target) > 20.0 || this.getPitch(this.target) < -1.0) && (double)this.vSpeed.getFloatValue() * 10.0 >= 10.0) {
                     var10000 = mc.thePlayer;
                     var10000.rotationPitch += (float)(-(Math.abs(this.getPitch(this.target)) / a));
                  }
               }

               double a = (double)this.hSpeed.getFloatValue() * 3.0 + ((double)this.hSpeed.getFloatValue() > 0.0 ? this.random.nextDouble() : 0.0);
               double a = (double)this.vSpeed.getFloatValue() * 3.0 + ((double)this.vSpeed.getFloatValue() > 0.0 ? this.random.nextDouble() : 0.0);
               this.setRotation(this.target, (float)a * 2.5F, (float)a * 2.5F);
            }

            this.removeTargets();
            this.updateTargets();
            this.updateTargetByKillAura();
         }

      }
   }

   @EventTarget
   public void onMotion(EventMotion event) {
      a[] a = b.trash();
      if (mc.playerController.getCurrentGameType() == GameType.ADVENTURE || mc.objectMouseOver.typeOfHit != MovingObjectType.BLOCK || this.target != null || !this.blockCheck.getBooleanValue()) {
         if (event.isPre()) {
            if (mc.theWorld == null) {
               return;
            }

            if (this.weapon.getValue() && !PlayerUtils.isVaildItem()) {
               return;
            }

            if (this.checkAim.getBooleanValue() && !mc.gameSettings.keyBindAttack.isKeyDown()) {
               return;
            }

            if (getMouseEntities((double)this.range.getFloatValue() + (this.infiniteRange.getBooleanValue() ? 999.0 : 0.0), 0.0) != null && KillAura.target == null) {
               return;
            }

            if (this.target == null || !((double)mc.thePlayer.getDistanceToEntity(this.target) <= (double)this.range.getFloatValue() + (this.infiniteRange.getBooleanValue() ? 999.0 : 0.0))) {
               return;
            }

            if (this.aimMode.isCurrentMode("Old")) {
               boolean a = this.getYaw(this.target) > 0.0;
               double a = (double)((float)(Math.random() / (90.0 / ((double)this.hSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.hSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8));
               EntityPlayerSP var10000;
               if ((this.getYaw(this.target) > 7.0 || this.getYaw(this.target) < -7.0) && (double)this.hSpeed.getFloatValue() * 10.0 >= 10.0) {
                  var10000 = mc.thePlayer;
                  var10000.rotationYaw += (float)(-(Math.abs(this.getYaw(this.target)) / a));
               }

               double a = (double)((float)(Math.random() / (90.0 / ((double)this.vSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.vSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8));
               boolean a = this.getPitch(this.target) > 0.0;
               if ((this.getPitch(this.target) > 20.0 || this.getPitch(this.target) < -1.0) && (double)this.vSpeed.getFloatValue() * 10.0 >= 10.0) {
                  var10000 = mc.thePlayer;
                  var10000.rotationPitch += (float)(-(Math.abs(this.getPitch(this.target)) / a));
               }
            }

            double a = (double)this.hSpeed.getFloatValue() * 3.0 + ((double)this.hSpeed.getFloatValue() > 0.0 ? this.random.nextDouble() : 0.0);
            double a = (double)this.vSpeed.getFloatValue() * 3.0 + ((double)this.vSpeed.getFloatValue() > 0.0 ? this.random.nextDouble() : 0.0);
            this.setRotation(this.target, (float)a * 2.5F, (float)a * 2.5F);
         }

         if (mc.theWorld != null) {
            this.removeTargets();
            this.updateTargets();
            this.updateTargetByKillAura();
         }

      }
   }

   public static Object[] getMouseEntities(double range, double hitbox) {
      Entity a = mc.getRenderViewEntity();
      Entity a = null;
      if (mc.theWorld == null) {
         return null;
      } else {
         mc.mcProfiler.startSection("pick");
         Vec3 a = a.getPositionEyes(ReflectionUtils.getRenderPartialTicks());
         Vec3 a = a.getLook(ReflectionUtils.getRenderPartialTicks());
         Vec3 a = a.addVector(a.xCoord * range, a.yCoord * range, a.zCoord * range);
         Vec3 a = null;
         float a = 1.0F;
         List a = mc.theWorld.getEntitiesWithinAABBExcludingEntity(a, a.getEntityBoundingBox().addCoord(a.xCoord * range, a.yCoord * range, a.zCoord * range).expand((double)a, (double)a, (double)a));
         double a = range;

         for(int a = 0; a < a.Method1799(); ++a) {
            Entity a = (Entity)a.get(a);
            if (a.canBeCollidedWith()) {
               float a = a.getCollisionBorderSize();
               AxisAlignedBB a = a.getEntityBoundingBox().expand((double)a, (double)a, (double)a);
               a = a.expand(hitbox, hitbox, hitbox);
               MovingObjectPosition a = a.calculateIntercept(a, a);
               if (a.isVecInside(a)) {
                  if (0.0 < a || a == 0.0) {
                     a = a;
                     a = 0.0;
                  }
               } else {
                  double a;
                  if ((a = a.distanceTo(a.hitVec)) < a || a == 0.0) {
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

         if (a < range && !(a instanceof EntityLivingBase) && !(a instanceof EntityItemFrame)) {
            a = null;
         }

         mc.mcProfiler.endSection();
         return null;
      }
   }

   public double getYaw(EntityLivingBase target) {
      return (((double)mc.thePlayer.rotationYaw - this.getRotation(target)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
   }

   public double getPitch(EntityLivingBase target) {
      return (((double)mc.thePlayer.rotationPitch - this.getRotation(target)[1]) % 360.0 + 540.0) % 360.0 - 180.0;
   }

   private void updateTargetByKillAura() {
      if (this.targets.Method1799() == 0) {
         this.target = null;
      } else {
         this.target = (EntityLivingBase)this.targets.get(0);
      }

      if (KillAura.target != null) {
         this.target = KillAura.target;
      }

   }

   private void removeTargets() {
      Iterator var1 = this.targets.Method1383();

      while(var1.Method932()) {
         EntityLivingBase a = (EntityLivingBase)var1.Method933();
         if (!this.isInViewEmpty(a, (double)this.range.getFloatValue() + (this.infiniteRange.getBooleanValue() ? 999.0 : 0.0))) {
            this.targets.remove(a);
         }
      }

   }

   private void updateTargets() {
      int a = true;
      Iterator var2 = mc.theWorld.loadedEntityList.Method1383();

      while(var2.Method932()) {
         Entity a = (Entity)var2.Method933();
         EntityLivingBase a;
         if (a instanceof EntityLivingBase && this.isInViewEmpty(a = (EntityLivingBase)a, (double)this.range.getFloatValue() + (this.infiniteRange.getBooleanValue() ? 999.0 : 0.0)) && !this.targets.contains(a)) {
            this.targets.Method2530(a);
         }
      }

      if (this.priority.isCurrentMode("Reach") && mc.gameSettings.keyBindSprint.isKeyDown()) {
         this.targets.sort(AimAssist::getHealthDiff2);
      } else if (this.priority.isCurrentMode("Health") && mc.gameSettings.keyBindSprint.isKeyDown()) {
         this.targets.sort(Comparator.comparingDouble(AimAssist::getDistanceToPlayer2));
      } else {
         if (this.priority.isCurrentMode("Reach")) {
            this.targets.sort(Comparator.comparingDouble(AimAssist::getDistanceToPlayer));
         }

         if (this.priority.isCurrentMode("Fov")) {
            this.targets.sort(Comparator.comparingDouble(this::getYawDiff));
         }

         if (this.priority.isCurrentMode("Angle")) {
            this.targets.sort(AimAssist::getAngleDiff);
         }

         if (this.priority.isCurrentMode("Health")) {
            this.targets.sort(AimAssist::getHealthDiff);
         }

      }
   }

   private boolean isInViewEmpty(EntityLivingBase entity, double fov) {
      return false;
   }

   public boolean isInView(EntityLivingBase target, float fov) {
      fov = (float)((double)fov * 0.5);
      double a = (((double)mc.thePlayer.rotationYaw - this.getRotation(target)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
      return a > 0.0 && a < (double)fov || (double)(-fov) < a && a < 0.0;
   }

   public double[] getRotation(EntityLivingBase entity) {
      double a = entity.posX - mc.thePlayer.posX;
      double a = entity.posY - mc.thePlayer.posY;
      double a = entity.posZ - mc.thePlayer.posZ;
      a /= (double)mc.thePlayer.getDistanceToEntity(entity);
      double a = -(Math.atan2(a, a) * 57.29577951308232);
      double a = -(Math.asin(a) * 57.29577951308232);
      return new double[]{a, a};
   }

   public static float toSimpleYaw(float a, float b) {
      float a = Math.abs(a - b) % 360.0F;
      if (a > 180.0F) {
         a = 360.0F - a;
      }

      return a;
   }

   public static float[] getRotation3(Entity entity) {
      double a = mc.thePlayer.posX;
      double a = mc.thePlayer.posY + (double)mc.thePlayer.getEyeHeight();
      double a = mc.thePlayer.posZ;
      double a = entity.posX;
      double a = entity.posY + (double)(entity.height / 2.0F);
      double a = entity.posZ;
      double a = a - a;
      double a = a - a;
      double a = a - a;
      double a = Math.sqrt(Math.pow(a, 2.0) + Math.pow(a, 2.0));
      double a = Math.toDegrees(Math.atan2(a, a)) + 90.0;
      double a = Math.toDegrees(Math.atan2(a, a));
      return new float[]{(float)a, (float)(90.0 - a)};
   }

   private void setRotation(Entity target, float lastYaw, float lastPitch) {
      EntityPlayerSP a = mc.thePlayer;
      float a = getRotation2(target)[1];
      float a = getRotation2(target)[0];
      if (this.aimMode.isCurrentMode("Blatant")) {
         a.rotationYaw = a;
         a.rotationPitch = a;
      } else {
         a.rotationYaw = this.clamp(a.rotationYaw, a, lastYaw);
         a.rotationPitch = this.clamp(a.rotationPitch, a, lastPitch);
      }
   }

   public static float[] getRotation2(Entity target) {
      double a = target.posX - mc.thePlayer.posX;
      double a = target.posZ - mc.thePlayer.posZ;
      double a = target instanceof EntityEnderman ? target.posY - mc.thePlayer.posY : target.posY + ((double)target.getEyeHeight() - 1.9) - mc.thePlayer.posY + ((double)mc.thePlayer.getEyeHeight() - 1.5);
      double a = (double)MathHelper.sqrt_double(a * a + a * a);
      float a = (float)Math.toDegrees(-Math.atan(a / a));
      float a = (float)(-Math.toDegrees(Math.atan(a / a)));
      if (a < 0.0 && a < 0.0) {
         a = (float)(90.0 + Math.toDegrees(Math.atan(a / a)));
      } else if (a < 0.0 && a > 0.0) {
         a = (float)(-90.0 + Math.toDegrees(Math.atan(a / a)));
      }

      return new float[]{a, a};
   }

   protected float clamp(float origin, float min, float max) {
      float a = MathHelper.wrapAngleTo180_float(min - origin);
      if (a > max) {
         a = max;
      }

      if (a < -max) {
         a = -max;
      }

      Random a = new Random();
      float a = (float)a.nextInt(15) * 0.01F;
      return origin + a + a;
   }

   private double getYawDiff(EntityLivingBase entity) {
      float[] a = RotationUtils.getRotation(entity);
      float a = (float)((int)a[0]);
      float a = mc.thePlayer.rotationYaw > a ? mc.thePlayer.rotationYaw - a : a - mc.thePlayer.rotationYaw;
      return (double)a;
   }

   private static int getHealthDiff(EntityLivingBase entity1, EntityLivingBase entity2) {
      return (int)(entity1.getHealth() - entity2.getHealth());
   }

   private static int getAngleDiff(EntityLivingBase entity1, EntityLivingBase entity2) {
      float[] a = RotationUtils.getRotation2(entity1);
      float[] a = RotationUtils.getRotation2(entity2);
      return (int)(mc.thePlayer.rotationYaw - a[0] - (mc.thePlayer.rotationYaw - a[0]));
   }

   private static double getDistanceToPlayer(EntityLivingBase entity) {
      return (double)mc.thePlayer.getDistanceToEntity(entity);
   }

   private static double getDistanceToPlayer2(EntityLivingBase entity) {
      return (double)mc.thePlayer.getDistanceToEntity(entity);
   }

   private static int getHealthDiff2(EntityLivingBase entity1, EntityLivingBase entity2) {
      return (int)(entity1.getHealth() - entity2.getHealth());
   }
}
