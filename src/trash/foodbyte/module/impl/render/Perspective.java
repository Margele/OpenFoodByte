package trash.foodbyte.module.impl.render;

import eventapi.EventTarget;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class Perspective extends Module {
   public BooleanValue Field2196 = new BooleanValue("Perspective", "Hold", false, "按住按键开启松开关闭");
   public BooleanValue Field2197 = new BooleanValue("Perspective", "Custom Fov", false, "自定义开启后角度");
   public FloatValue Field2198 = new FloatValue("Perspective", "Fov", 70.0, 30.0, 150.0, 1.0, "角度");
   public static float Field2199;
   public static float Field2200;
   public static float Field2201;
   public static int Field2202;
   public static boolean Field2203;

   public Perspective() {
      super("Perspective", "Perspective", Category.RENDER);
      this.Method1033(true);
   }

   public String getDescription() {
      return "360°视角(打开后可以无死角观察不影响玩家走路)";
   }

   @EventTarget
   public void Method801(EventTickUpdate a) {
      if (mc.gameSettings.thirdPersonView != 1) {
         Field2202 = mc.gameSettings.thirdPersonView;
         this.Method1028();
      }

      if (this.Field2197.getBooleanValue()) {
         mc.gameSettings.fovSetting = this.Field2198.getFloatValue();
      }

      if (this.Field2196.getBooleanValue() && mc.theWorld != null) {
         boolean var2 = Keyboard.isKeyDown(this.Method1020());
         if (mc.currentScreen != null) {
            this.setState(false);
         }
      }

   }

   public void onEnable() {
      Field2203 = true;
      Field2200 = mc.thePlayer.rotationYaw;
      Field2201 = mc.thePlayer.rotationPitch;
      Field2202 = mc.gameSettings.thirdPersonView;
      mc.gameSettings.thirdPersonView = 1;
      Field2199 = mc.gameSettings.fovSetting;
      if (this.Field2197.getBooleanValue()) {
         mc.gameSettings.fovSetting = this.Field2198.getFloatValue();
      }

   }

   public void onDisable() {
      Field2203 = false;
      if (mc.gameSettings.thirdPersonView != 1) {
      }

      mc.gameSettings.thirdPersonView = Field2202;
      mc.gameSettings.fovSetting = Field2199;
   }

   static {
      Field2199 = mc.gameSettings.fovSetting;
      Field2200 = 0.0F;
      Field2201 = 0.0F;
      Field2202 = 0;
      Field2203 = false;
   }
}
