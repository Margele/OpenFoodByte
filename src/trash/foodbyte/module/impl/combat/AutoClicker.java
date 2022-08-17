package trash.foodbyte.module.impl.combat;

import eventapi.EventTarget;
import java.util.Random;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.WorldSettings.GameType;
import obfuscate.a;
import obfuscate.b;
import org.lwjgl.input.Mouse;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.event.EventUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.PlayerUtils;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class AutoClicker extends Module {
   public FloatValue startDelay = new FloatValue("AutoClicker", "StartDelay", 3.0, 0.0, 10.0, 1.0, "按下左键延迟几tick开始攻击");
   public FloatValue maxCps = new FloatValue("AutoClicker", "MaxCPS", 12.0, 1.0, 20.0, 1.0, "最大CPS");
   public FloatValue minCps = new FloatValue("AutoClicker", "MinCPS", 8.0, 1.0, 20.0, 1.0, "最小CPS");
   public FloatValue jitter = new FloatValue("AutoClicker", "Jitter", 1.0, 0.0, 2.0, 0.1, "抖动幅度");
   public BooleanValue blockHit = new BooleanValue("AutoClicker", "BlockHit", true, "格挡也能攻击");
   public BooleanValue fakeAutoBlock = new BooleanValue("AutoClicker", "FakeAutoBlock", true, "假格挡只有格挡的动画");
   public BooleanValue autoBlock = new BooleanValue("AutoClicker", "AutoBlock", true, "自动格挡");
   private double cps;
   private double delay = 0.0;
   private TimeHelper timer1 = new TimeHelper();
   private TimeHelper timer2 = new TimeHelper();
   Random random = new Random();

   public AutoClicker() {
      super("AutoClicker", "Auto Clicker", Category.COMBAT);
   }

   public String getDescription() {
      return "自动连点";
   }

   @EventTarget
   private void onTickUpdate(EventTickUpdate e) {
      if (mc.currentScreen == null) {
         if (this.timer2.isDelayComplete(100.0) && Mouse.isButtonDown(0)) {
            ++this.cps;
            this.timer2.reset();
         } else if (!Mouse.isButtonDown(0)) {
            this.cps = 0.0;
         }
      }
   }

   @EventTarget
   private void onMotion(EventMotion e) {
      a[] a = b.trash();
      if (e.isPre()) {
         boolean var10000;
         if (mc.objectMouseOver.typeOfHit == MovingObjectType.BLOCK && mc.theWorld.getBlockState(mc.objectMouseOver.getBlockPos()).getBlock() != Blocks.air && mc.objectMouseOver.typeOfHit != MovingObjectType.ENTITY) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         if (!mc.gameSettings.keyBindAttack.isKeyDown()) {
            return;
         }

         if (mc.currentScreen != null) {
            return;
         }

         if (this.cps < (double)this.startDelay.getFloatValueCast()) {
            return;
         }

         if (mc.playerController.getCurrentGameType() != GameType.ADVENTURE) {
            return;
         }

         if (!this.blockHit.getBooleanValue() && mc.thePlayer.isBlocking()) {
            return;
         }

         if (this.jitter.getFloatValue() > 0.0F) {
            float a = (float)((double)this.jitter.getFloatValue() * 0.5);
            EntityPlayerSP var5;
            if (this.random.nextBoolean()) {
               var5 = mc.thePlayer;
               var5.rotationYaw += this.random.nextFloat() * a;
            }

            var5 = mc.thePlayer;
            var5.rotationYaw -= this.random.nextFloat() * a;
            if (this.random.nextBoolean()) {
               var5 = mc.thePlayer;
               var5.rotationPitch += (float)((double)this.random.nextFloat() * (double)a * 0.75);
            }

            var5 = mc.thePlayer;
            var5.rotationPitch -= (float)((double)this.random.nextFloat() * (double)a * 0.75);
         }
      }

   }

   @EventTarget
   public void onUpdate(EventUpdate e) {
      boolean var10000;
      if (mc.objectMouseOver.typeOfHit == MovingObjectType.BLOCK && mc.theWorld.getBlockState(mc.objectMouseOver.getBlockPos()).getBlock() != Blocks.air && mc.objectMouseOver.typeOfHit != MovingObjectType.ENTITY) {
         var10000 = true;
      } else {
         var10000 = false;
      }

      this.setDisplayTag("CPS:" + this.minCps.getFloatValue() + "-" + this.maxCps.getFloatValue());
      if (mc.currentScreen == null) {
         if (Mouse.isButtonDown(0)) {
            if (this.timer1.isDelayComplete(this.delay)) {
               if (!(this.cps < (double)this.startDelay.getFloatValueCast())) {
                  if (mc.playerController.getCurrentGameType() == GameType.ADVENTURE) {
                     if (this.blockHit.getBooleanValue() || !mc.thePlayer.isBlocking()) {
                        if (KillAura.target == null) {
                           PlayerUtils.rightClickEntity(mc.objectMouseOver.entityHit, this.fakeAutoBlock.getBooleanValue(), this.autoBlock.getValue());
                           ReflectionUtils.postForgeMouseInputEvent(0, true);
                           ReflectionUtils.clickMouse();
                           ReflectionUtils.setLeftClickCounter(0);
                           ReflectionUtils.postForgeMouseInputEvent(0, false);
                           this.resetDelay();
                           this.timer1.reset();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void resetDelay() {
      int a = this.maxCps.getFloatValue().intValue();
      int a = this.minCps.getFloatValue().intValue();
      this.delay = (double)MathUtils.getRandomDouble(a, a);
   }
}
