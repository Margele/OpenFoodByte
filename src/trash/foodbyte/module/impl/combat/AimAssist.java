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
      a[] var2 = b.trash();
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
                  boolean var3 = this.getYaw(this.target) > 0.0;
                  double var4 = (double)((float)(Math.random() / (90.0 / ((double)this.hSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.hSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8));
                  EntityPlayerSP var10000;
                  if ((this.getYaw(this.target) > 7.0 || this.getYaw(this.target) < -7.0) && (double)this.hSpeed.getFloatValue() * 10.0 >= 10.0) {
                     var10000 = mc.thePlayer;
                     var10000.rotationYaw += (float)(-(Math.abs(this.getYaw(this.target)) / var4));
                  }

                  double var6 = (double)((float)(Math.random() / (90.0 / ((double)this.vSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.vSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8));
                  boolean var8 = this.getPitch(this.target) > 0.0;
                  if ((this.getPitch(this.target) > 20.0 || this.getPitch(this.target) < -1.0) && (double)this.vSpeed.getFloatValue() * 10.0 >= 10.0) {
                     var10000 = mc.thePlayer;
                     var10000.rotationPitch += (float)(-(Math.abs(this.getPitch(this.target)) / var6));
                  }
               }

               double var9 = (double)this.hSpeed.getFloatValue() * 3.0 + ((double)this.hSpeed.getFloatValue() > 0.0 ? this.random.nextDouble() : 0.0);
               double var5 = (double)this.vSpeed.getFloatValue() * 3.0 + ((double)this.vSpeed.getFloatValue() > 0.0 ? this.random.nextDouble() : 0.0);
               this.setRotation(this.target, (float)var9 * 2.5F, (float)var5 * 2.5F);
            }

            this.removeTargets();
            this.updateTargets();
            this.updateTargetByKillAura();
         }

      }
   }

   @EventTarget
   public void onMotion(EventMotion event) {
      a[] var2 = b.trash();
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
               boolean var3 = this.getYaw(this.target) > 0.0;
               double var4 = (double)((float)(Math.random() / (90.0 / ((double)this.hSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.hSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8));
               EntityPlayerSP var10000;
               if ((this.getYaw(this.target) > 7.0 || this.getYaw(this.target) < -7.0) && (double)this.hSpeed.getFloatValue() * 10.0 >= 10.0) {
                  var10000 = mc.thePlayer;
                  var10000.rotationYaw += (float)(-(Math.abs(this.getYaw(this.target)) / var4));
               }

               double var6 = (double)((float)(Math.random() / (90.0 / ((double)this.vSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 1.2 - 337.5) + 90.0 / ((double)this.vSpeed.getFloatValue() * 10.0 + MathUtils.getRandomDouble2(1.2354235325235234E-4, 0.0024708470650470467)) * 3.0 / 0.8));
               boolean var8 = this.getPitch(this.target) > 0.0;
               if ((this.getPitch(this.target) > 20.0 || this.getPitch(this.target) < -1.0) && (double)this.vSpeed.getFloatValue() * 10.0 >= 10.0) {
                  var10000 = mc.thePlayer;
                  var10000.rotationPitch += (float)(-(Math.abs(this.getPitch(this.target)) / var6));
               }
            }

            double var9 = (double)this.hSpeed.getFloatValue() * 3.0 + ((double)this.hSpeed.getFloatValue() > 0.0 ? this.random.nextDouble() : 0.0);
            double var5 = (double)this.vSpeed.getFloatValue() * 3.0 + ((double)this.vSpeed.getFloatValue() > 0.0 ? this.random.nextDouble() : 0.0);
            this.setRotation(this.target, (float)var9 * 2.5F, (float)var5 * 2.5F);
         }

         if (mc.theWorld != null) {
            this.removeTargets();
            this.updateTargets();
            this.updateTargetByKillAura();
         }

      }
   }

   public static Object[] getMouseEntities(double range, double hitbox) {
      Entity var4 = mc.getRenderViewEntity();
      Entity var5 = null;
      if (mc.theWorld == null) {
         return null;
      } else {
         mc.mcProfiler.startSection("pick");
         Vec3 var10 = var4.getPositionEyes(ReflectionUtils.getRenderPartialTicks());
         Vec3 var11 = var4.getLook(ReflectionUtils.getRenderPartialTicks());
         Vec3 var12 = var10.addVector(var11.xCoord * range, var11.yCoord * range, var11.zCoord * range);
         Vec3 var13 = null;
         float var14 = 1.0F;
         List var15 = mc.theWorld.getEntitiesWithinAABBExcludingEntity(var4, var4.getEntityBoundingBox().addCoord(var11.xCoord * range, var11.yCoord * range, var11.zCoord * range).expand((double)var14, (double)var14, (double)var14));
         double var16 = range;

         for(int var18 = 0; var18 < var15.Method1799(); ++var18) {
            Entity var21 = (Entity)var15.get(var18);
            if (var21.canBeCollidedWith()) {
               float var22 = var21.getCollisionBorderSize();
               AxisAlignedBB var23 = var21.getEntityBoundingBox().expand((double)var22, (double)var22, (double)var22);
               var23 = var23.expand(hitbox, hitbox, hitbox);
               MovingObjectPosition var24 = var23.calculateIntercept(var10, var12);
               if (var23.isVecInside(var10)) {
                  if (0.0 < var16 || var16 == 0.0) {
                     var5 = var21;
                     var16 = 0.0;
                  }
               } else {
                  double var19;
                  if ((var19 = var10.distanceTo(var24.hitVec)) < var16 || var16 == 0.0) {
                     if (var21 == var4.ridingEntity) {
                        if (var16 == 0.0) {
                           var5 = var21;
                           var13 = var24.hitVec;
                        }
                     } else {
                        var5 = var21;
                        var13 = var24.hitVec;
                        var16 = var19;
                     }
                  }
               }
            }
         }

         if (var16 < range && !(var5 instanceof EntityLivingBase) && !(var5 instanceof EntityItemFrame)) {
            var5 = null;
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
         EntityLivingBase var2 = (EntityLivingBase)var1.Method933();
         if (!this.isInViewEmpty(var2, (double)this.range.getFloatValue() + (this.infiniteRange.getBooleanValue() ? 999.0 : 0.0))) {
            this.targets.remove(var2);
         }
      }

   }

   private void updateTargets() {
      boolean var1 = true;
      Iterator var2 = mc.theWorld.loadedEntityList.Method1383();

      while(var2.Method932()) {
         Entity var3 = (Entity)var2.Method933();
         EntityLivingBase var4;
         if (var3 instanceof EntityLivingBase && this.isInViewEmpty(var4 = (EntityLivingBase)var3, (double)this.range.getFloatValue() + (this.infiniteRange.getBooleanValue() ? 999.0 : 0.0)) && !this.targets.contains(var4)) {
            this.targets.Method2530(var4);
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
      double var3 = (((double)mc.thePlayer.rotationYaw - this.getRotation(target)[0]) % 360.0 + 540.0) % 360.0 - 180.0;
      return var3 > 0.0 && var3 < (double)fov || (double)(-fov) < var3 && var3 < 0.0;
   }

   public double[] getRotation(EntityLivingBase entity) {
      double var2 = entity.posX - mc.thePlayer.posX;
      double var4 = entity.posY - mc.thePlayer.posY;
      double var6 = entity.posZ - mc.thePlayer.posZ;
      var4 /= (double)mc.thePlayer.getDistanceToEntity(entity);
      double var8 = -(Math.atan2(var2, var6) * 57.29577951308232);
      double var10 = -(Math.asin(var4) * 57.29577951308232);
      return new double[]{var8, var10};
   }

   public static float toSimpleYaw(float a, float b) {
      float var2 = Math.abs(a - b) % 360.0F;
      if (var2 > 180.0F) {
         var2 = 360.0F - var2;
      }

      return var2;
   }

   public static float[] getRotation3(Entity entity) {
      double var1 = mc.thePlayer.posX;
      double var3 = mc.thePlayer.posY + (double)mc.thePlayer.getEyeHeight();
      double var5 = mc.thePlayer.posZ;
      double var7 = entity.posX;
      double var9 = entity.posY + (double)(entity.height / 2.0F);
      double var11 = entity.posZ;
      double var13 = var1 - var7;
      double var15 = var3 - var9;
      double var17 = var5 - var11;
      double var19 = Math.sqrt(Math.pow(var13, 2.0) + Math.pow(var17, 2.0));
      double var21 = Math.toDegrees(Math.atan2(var17, var13)) + 90.0;
      double var23 = Math.toDegrees(Math.atan2(var19, var15));
      return new float[]{(float)var21, (float)(90.0 - var23)};
   }

   private void setRotation(Entity target, float lastYaw, float lastPitch) {
      EntityPlayerSP var4 = mc.thePlayer;
      float var5 = getRotation2(target)[1];
      float var6 = getRotation2(target)[0];
      if (this.aimMode.isCurrentMode("Blatant")) {
         var4.rotationYaw = var5;
         var4.rotationPitch = var6;
      } else {
         var4.rotationYaw = this.clamp(var4.rotationYaw, var5, lastYaw);
         var4.rotationPitch = this.clamp(var4.rotationPitch, var6, lastPitch);
      }
   }

   public static float[] getRotation2(Entity target) {
      double var1 = target.posX - mc.thePlayer.posX;
      double var3 = target.posZ - mc.thePlayer.posZ;
      double var5 = target instanceof EntityEnderman ? target.posY - mc.thePlayer.posY : target.posY + ((double)target.getEyeHeight() - 1.9) - mc.thePlayer.posY + ((double)mc.thePlayer.getEyeHeight() - 1.5);
      double var7 = (double)MathHelper.sqrt_double(var1 * var1 + var3 * var3);
      float var9 = (float)Math.toDegrees(-Math.atan(var1 / var3));
      float var10 = (float)(-Math.toDegrees(Math.atan(var5 / var7)));
      if (var3 < 0.0 && var1 < 0.0) {
         var9 = (float)(90.0 + Math.toDegrees(Math.atan(var3 / var1)));
      } else if (var3 < 0.0 && var1 > 0.0) {
         var9 = (float)(-90.0 + Math.toDegrees(Math.atan(var3 / var1)));
      }

      return new float[]{var10, var9};
   }

   protected float clamp(float origin, float min, float max) {
      float var4 = MathHelper.wrapAngleTo180_float(min - origin);
      if (var4 > max) {
         var4 = max;
      }

      if (var4 < -max) {
         var4 = -max;
      }

      Random var5 = new Random();
      float var6 = (float)var5.nextInt(15) * 0.01F;
      return origin + var4 + var6;
   }

   private double getYawDiff(EntityLivingBase entity) {
      float[] var2 = RotationUtils.getRotation(entity);
      float var3 = (float)((int)var2[0]);
      float var4 = mc.thePlayer.rotationYaw > var3 ? mc.thePlayer.rotationYaw - var3 : var3 - mc.thePlayer.rotationYaw;
      return (double)var4;
   }

   private static int getHealthDiff(EntityLivingBase entity1, EntityLivingBase entity2) {
      return (int)(entity1.getHealth() - entity2.getHealth());
   }

   private static int getAngleDiff(EntityLivingBase entity1, EntityLivingBase entity2) {
      float[] var2 = RotationUtils.getRotation2(entity1);
      float[] var3 = RotationUtils.getRotation2(entity2);
      return (int)(mc.thePlayer.rotationYaw - var2[0] - (mc.thePlayer.rotationYaw - var3[0]));
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
