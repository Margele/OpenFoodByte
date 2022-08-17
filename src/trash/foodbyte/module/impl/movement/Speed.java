package trash.foodbyte.module.impl.movement;

import awsl.Class167;
import awsl.Class633;
import eventapi.EventTarget;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventMove;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.reflections.ReflectionsHelper;
import trash.foodbyte.utils.MoveUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Speed extends Module {
   public ModeValue Field2431 = new ModeValue("Speed", "Speed Mode", "Hypixel", new String[]{"WatchDog", "WatchDogLow", "Hypixel", "JumpStrafe"}, "绕过模式{正常一般Speed,Hypixel}");
   public FloatValue Field2432 = new FloatValue("Speed", "Timer Boost", 1.0, 0.5, 2.0, 0.1, "Timer加速");
   public BooleanValue Field2433 = new BooleanValue("Speed", "Strafe Look", true);
   public BooleanValue Field2434 = new BooleanValue("Speed", "Timer Boost", true);
   public BooleanValue Field2435 = new BooleanValue("Speed", "LagBack Check", true);
   public static TimeHelper Field2436 = new TimeHelper();
   private int stage;
   private double speed;
   private double Field2439;
   private double Field2440;

   public Speed() {
      super("Speed", "Speed", Category.MOVEMENT);
      this.setHideModule(true);
   }

   public String getDescription() {
      return "加速边跳边跑";
   }

   public boolean canUse() {
      return GlobalModule.INSTANCE.balant == null || !PermissionManager.canUseModule("speed");
   }

   public void onEnable() {
      this.speed = 0.0;
      this.stage = 0;
   }

   public void onDisable() {
      ReflectionUtils.setTimerSpeed(1.0F);
   }

   @EventTarget
   public void Method762(Class633 a) {
   }

   @EventTarget
   public void Method801(EventTickUpdate a) {
   }

   @EventTarget
   public void Method755(EventTick a) {
   }

   @EventTarget(3)
   public void Method712(EventMotion a) {
      Class167.Method1501();
      this.setDisplayTag(this.Field2431.getMode());
      if (a.isPre()) {
         if (this.Field2433.getBooleanValue() && this.Method713() && !mc.thePlayer.isSneaking()) {
            a.setYaw(this.Method276() / 0.017453292F);
         }

         if (this.Field2431.isCurrentMode("JumpStrafe")) {
            if (mc.thePlayer.onGround && MoveUtils.isMoving()) {
               MoveUtils.setSpeed(MoveUtils.getDefaultSpeed() - Math.random() / 50.0);
               if (MoveUtils.isMoving()) {
                  if (this.Field2434.getBooleanValue()) {
                     ReflectionUtils.setTimerSpeed(this.Field2432.getFloatValue());
                  }

                  mc.thePlayer.jump();
                  a.setY(mc.thePlayer.motionY = MoveUtils.getJumpEffect(0.39999998688697813));
               }

               ReflectionUtils.setTimerSpeed(1.0F);
            }

            MoveUtils.setHypottedSpeed();
         }

         if (this.Field2431.isCurrentMode("WatchDog") && MoveUtils.isMoving()) {
            if (mc.thePlayer.onGround) {
               mc.thePlayer.motionY = MoveUtils.getJumpEffect(0.41999998688697815);
               this.speed = 0.3323;
               if (mc.thePlayer.isPotionActive(Potion.moveSpeed)) {
                  this.speed = 0.465023;
               }

               ReflectionUtils.setTimerSpeed(this.Field2432.getFloatValue());
            }

            this.speed -= 0.006;
            MoveUtils.setSpeed2(this.speed);
         }

         if (this.Field2431.isCurrentMode("WatchDogLow")) {
            if (this.Field2434.getBooleanValue()) {
               ReflectionUtils.setTimerSpeed(this.Field2432.getFloatValue());
            }

            if (MoveUtils.isMoving() && mc.thePlayer.onGround) {
               this.Field2439 = 1.2000000476837158;
               mc.thePlayer.motionY = 0.31999998688697817;
            }

            MoveUtils.setSpeed2(MoveUtils.getMoveSpeed() * 0.9015100002288818 * this.Field2439);
            if (this.Field2439 > 1.0) {
               this.Field2439 -= 0.05;
            }
         }
      }

   }

   private float Method1779() {
      double var1 = (Double)ReflectionsHelper.getFieldAsObject(mc.thePlayer, new String[]{ObfuscatedField.lastReportedPosX.getObfuscatedName()});
      double var3 = (Double)ReflectionsHelper.getFieldAsObject(mc.thePlayer, new String[]{ObfuscatedField.lastReportedPosY.getObfuscatedName()}) + (double)mc.thePlayer.getEyeHeight();
      double var5 = (Double)ReflectionsHelper.getFieldAsObject(mc.thePlayer, new String[]{ObfuscatedField.lastReportedPosZ.getObfuscatedName()});
      double var7 = mc.thePlayer.posX;
      double var9 = mc.thePlayer.posY + (double)mc.thePlayer.getEyeHeight();
      double var11 = mc.thePlayer.posZ;
      double var13 = var1 - var7;
      double var15 = var3 - var9;
      double var17 = var5 - var11;
      double var19 = Math.sqrt(Math.pow(var13, 2.0) + Math.pow(var17, 2.0));
      double var21 = Math.toDegrees(Math.atan2(var17, var13)) + 90.0;
      double var23 = Math.toDegrees(Math.atan2(var19, var15));
      return (float)var21;
   }

   @EventTarget
   public void Method274(EventMove e) {
      if (this.Field2431.isCurrentMode("Hypixel") && e.isLocalPlayer()) {
         double var2 = MoveUtils.getDefaultSpeed();
         if (MoveUtils.isMoving()) {
            if (this.Field2434.getBooleanValue() && !MoveUtils.isReallyOnGround(0.0) && mc.thePlayer.ticksExisted > 5) {
               ReflectionUtils.setTimerSpeed(this.Field2432.getFloatValue() + MoveUtils.getRandomFloat());
            }

            if (MoveUtils.isTouchingWall()) {
               e.setY(mc.thePlayer.motionY = MoveUtils.getJumpEffect(0.41999998688697815));
               this.stage = 0;
            }

            switch (this.stage) {
               case 0:
                  this.speed = var2 * 2.15;
                  break;
               case 1:
                  this.speed *= 0.58;
                  break;
               case 2:
               case 3:
               default:
                  this.speed = this.speed / 100.0 * 98.5;
                  break;
               case 4:
                  this.speed = var2 * 1.2;
            }

            ++this.stage;
            double[] var4 = MoveUtils.warp(this.Method276(), Math.max(var2, this.speed));
            e.setX(var4[0]);
            e.setZ(var4[1]);
         } else {
            ReflectionUtils.setTimerSpeed(1.0F);
            e.setX(mc.thePlayer.motionX = 0.0);
            e.setZ(mc.thePlayer.motionZ = 0.0);
         }
      }

   }

   public float Method276() {
      float var1 = mc.thePlayer.rotationYaw;
      if (mc.thePlayer.moveForward < 0.0F) {
         var1 += 180.0F;
      }

      float var2 = 1.0F;
      if (mc.thePlayer.moveForward < 0.0F) {
         var2 = -0.5F;
      } else if (mc.thePlayer.moveForward > 0.0F) {
         var2 = 0.5F;
      }

      if (mc.thePlayer.moveStrafing > 0.0F) {
         var1 -= 90.0F * var2;
      }

      if (mc.thePlayer.moveStrafing < 0.0F) {
         var1 += 90.0F * var2;
      }

      var1 = (float)((double)var1 * 0.017453292);
      return var1;
   }

   private double Method1780() {
      Class167.Method1501();
      this.Field2440 = Math.toRadians((double)mc.thePlayer.rotationYaw);
      boolean var2 = mc.thePlayer.moveForward > 0.0F;
      boolean var3 = mc.thePlayer.moveForward < 0.0F;
      boolean var4 = mc.thePlayer.moveStrafing > 0.0F;
      boolean var5 = mc.thePlayer.moveStrafing < 0.0F;
      boolean var6 = true;
      boolean var7 = true;
      double var8 = MathHelper.wrapAngleTo180_double((double)mc.thePlayer.rotationYaw);
      if (this.Field2440 == Double.NaN) {
         this.Field2440 = var8;
      }

      double var10 = 45.0;
      if (Math.abs(var8 - this.Field2440) > 45.0 && Math.abs(var8 - this.Field2440) < 315.0) {
         if (var8 > this.Field2440) {
            var8 += var10;
         }

         var8 -= var10;
      }

      this.Field2440 = var8;
      return Math.toRadians(var8);
   }

   public boolean Method713() {
      return mc.gameSettings.keyBindForward.isKeyDown() || mc.gameSettings.keyBindBack.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown() || mc.gameSettings.keyBindRight.isKeyDown();
   }

   @EventTarget
   public void Method273(EventPacket a) {
      if (this.Field2435.getBooleanValue() && a.getPacket() instanceof S08PacketPlayerPosLook) {
         this.setState(false);
      }

   }
}
