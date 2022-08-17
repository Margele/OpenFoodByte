package trash.foodbyte.reflections;

import eventapi.EventManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Session;
import net.minecraft.util.Timer;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import obfuscate.a;
import org.lwjgl.input.Mouse;

public class ReflectionUtils {
   public static Minecraft mc;
   private static a[] Field1205;

   public static void setUsername(String name) {
      try {
         Field var1 = Minecraft.class.getDeclaredField(ObfuscatedField.session.getObfuscatedName());
         var1.setAccessible(true);
         var1.set(Minecraft.getMinecraft(), new Session(name, "", "", "mojang"));
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static void setSession(Session session) {
      try {
         Field var1 = Minecraft.class.getDeclaredField(ObfuscatedField.session.getObfuscatedName());
         var1.setAccessible(true);
         var1.set(Minecraft.getMinecraft(), session);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static float getRenderPartialTicks() {
      Field var0 = null;

      try {
         var0 = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
         var0.setAccessible(true);
      } catch (NoSuchFieldException var6) {
      }

      Field var1 = null;

      try {
         var1 = Timer.class.getDeclaredField(ObfuscatedField.renderPartialTicks.getObfuscatedName());
      } catch (NoSuchFieldException var5) {
      }

      float var2 = 1.0F;

      try {
         var1.setAccessible(true);
         var2 = var1.getFloat(var0.get(mc));
      } catch (IllegalAccessException var4) {
      }

      return var2;
   }

   public static float getTicksPerSecond() {
      Field var0 = null;

      try {
         var0 = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
         var0.setAccessible(true);
      } catch (Exception var5) {
      }

      Field var1 = null;

      try {
         var1 = Timer.class.getDeclaredField(ObfuscatedField.ticksPerSecond.getObfuscatedName());
         var1.setAccessible(true);
      } catch (Exception var4) {
      }

      try {
         return var1.getFloat(var0.get(mc));
      } catch (Exception var3) {
         return 1.0F;
      }
   }

   public static float getTimerSpeed() {
      Field var0 = null;

      try {
         var0 = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
         var0.setAccessible(true);
      } catch (Exception var5) {
      }

      Field var1 = null;

      try {
         var1 = Timer.class.getDeclaredField(ObfuscatedField.timerSpeed.getObfuscatedName());
         var1.setAccessible(true);
      } catch (Exception var4) {
      }

      try {
         return var1.getFloat(var0.get(mc));
      } catch (Exception var3) {
         return 1.0F;
      }
   }

   public static void setTimerSpeed(float speed) {
      Field var1 = null;

      try {
         var1 = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
         var1.setAccessible(true);
      } catch (NoSuchFieldException var6) {
      }

      Field var2 = null;

      try {
         var2 = Timer.class.getDeclaredField(ObfuscatedField.timerSpeed.getObfuscatedName());
      } catch (NoSuchFieldException var5) {
      }

      try {
         var2.setAccessible(true);
         var2.set(var1.get(mc), speed);
      } catch (IllegalAccessException var4) {
      }

   }

   public static double getRenderPosX() {
      Field var0 = null;

      try {
         var0 = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosX.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      var0.setAccessible(true);

      try {
         return var0.getDouble(mc.getRenderManager());
      } catch (IllegalAccessException var2) {
         return 0.0;
      }
   }

   public static double getRenderPosY() {
      Field var0 = null;

      try {
         var0 = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosY.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      var0.setAccessible(true);

      try {
         return var0.getDouble(mc.getRenderManager());
      } catch (IllegalAccessException var2) {
         return 0.0;
      }
   }

   public static double getRenderPosZ() {
      Field var0 = null;

      try {
         var0 = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosZ.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      var0.setAccessible(true);

      try {
         return var0.getDouble(mc.getRenderManager());
      } catch (IllegalAccessException var2) {
         return 0.0;
      }
   }

   public static int getRightClickDelayTimer() {
      Field var0 = null;

      try {
         var0 = mc.getClass().getDeclaredField(ObfuscatedField.rightClickDelayTimer.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      var0.setAccessible(true);

      try {
         return var0.getInt(mc);
      } catch (IllegalAccessException var2) {
         return 4;
      }
   }

   public static void setRightClickDelayTimer(int timer) {
      try {
         Field var1 = mc.getClass().getDeclaredField(ObfuscatedField.rightClickDelayTimer.getObfuscatedName());
         var1.setAccessible(true);
         var1.setInt(mc, timer);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static void setLeftClickCounter(int counter) {
      try {
         Field var1 = mc.getClass().getDeclaredField(ObfuscatedField.leftClickCounter.getObfuscatedName());
         var1.setAccessible(true);
         var1.setInt(mc, counter);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static boolean isHittingBlock() {
      Field var0 = null;

      try {
         var0 = mc.playerController.getClass().getDeclaredField(ObfuscatedField.isHittingBlock.getObfuscatedName());
         var0.setAccessible(true);
         return var0.getBoolean(mc.playerController.getClass());
      } catch (Exception var2) {
         return false;
      }
   }

   public static void setBlockHitDelay(int hitDelay) {
      Field var1 = null;

      try {
         var1 = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.blockHitDelay.getObfuscatedName());
      } catch (NoSuchFieldException var4) {
         var4.printStackTrace();
      }

      var1.setAccessible(true);

      try {
         var1.setInt(mc.playerController, hitDelay);
      } catch (IllegalAccessException var3) {
      }

   }

   public static void clickMouse() {
      try {
         Method var0 = mc.getClass().getDeclaredMethod(ObfuscatedMethods.clickMouse.getObfuscatedName());
         var0.setAccessible(true);
         var0.invoke(mc);
      } catch (Exception var1) {
         var1.printStackTrace();
      }

   }

   public static void setJumpTicks(int jumpTicks) {
      try {
         Field var1 = EntityLivingBase.class.getDeclaredField(ObfuscatedField.jumpTicks.getObfuscatedName());
         var1.setAccessible(true);
         var1.setInt(mc.thePlayer, jumpTicks);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static float getCurBlockDamageMP() {
      Field var0 = null;

      try {
         var0 = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.curBlockDamageMP.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      var0.setAccessible(true);

      try {
         return var0.getFloat(mc.playerController);
      } catch (IllegalAccessException var2) {
         return 0.0F;
      }
   }

   public static void setCurBlockDamageMP(float curBlockDamage) {
      a[] var1 = trash();

      try {
         Field var2 = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.curBlockDamageMP.getObfuscatedName());
         var2.setAccessible(true);
         var2.setFloat(mc.playerController, curBlockDamage);
      } catch (ReflectiveOperationException var3) {
         throw new RuntimeException(var3);
      }

      if (a.trash() == null) {
         trash(new a[5]);
      }

   }

   public static float getItemInUseCount() {
      Field var0 = null;

      try {
         var0 = EntityPlayer.class.getDeclaredField(ObfuscatedField.itemInUseCount.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      var0.setAccessible(true);

      try {
         return (float)var0.getInt(mc.thePlayer);
      } catch (IllegalAccessException var2) {
         return 0.0F;
      }
   }

   public static void setItemInUseCount(int count) {
      a[] var1 = trash();

      try {
         Field var2 = EntityPlayer.class.getDeclaredField(ObfuscatedField.itemInUseCount.getObfuscatedName());
         var2.setAccessible(true);
         var2.setInt(mc.thePlayer, count);
      } catch (ReflectiveOperationException var3) {
         throw new RuntimeException(var3);
      }

      a.trash(new String[5]);
   }

   public static boolean isPressed(KeyBinding keyBinding) {
      try {
         return (Boolean)ReflectionHelper.findField(KeyBinding.class, new String[]{ObfuscatedField.pressed.getObfuscatedName()}).get(keyBinding);
      } catch (Exception var2) {
         return false;
      }
   }

   public static void setPressed(KeyBinding keyBinding, boolean pressed) {
      try {
         ReflectionHelper.findField(KeyBinding.class, new String[]{ObfuscatedField.pressed.getObfuscatedName()}).set(keyBinding, pressed);
      } catch (Exception var3) {
      }

   }

   public static List getListShaders(ShaderGroup group) {
      try {
         return (List)ReflectionHelper.findField(ShaderGroup.class, new String[]{ObfuscatedField.listShaders.getObfuscatedName()}).get(group);
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static void setupCameraTransform(float a, int b) {
      try {
         Method var2 = mc.entityRenderer.getClass().getDeclaredMethod(ObfuscatedMethods.setupCameraTransform.getObfuscatedName(), Float.TYPE, Integer.TYPE);
         var2.setAccessible(true);
         var2.invoke(mc.entityRenderer, a, b);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public static void setOrientCamera(float orientCamera) {
      try {
         Method var1 = mc.entityRenderer.getClass().getDeclaredMethod(ObfuscatedMethods.orientCamera.getObfuscatedName(), Float.TYPE);
         var1.setAccessible(true);
         var1.invoke(mc.entityRenderer, orientCamera);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static void postForgeMouseInputEvent(int a, boolean a) {
      try {
         Field var2 = MouseEvent.class.getDeclaredField("button");
         Field var3 = MouseEvent.class.getDeclaredField("buttonstate");
         Field var4 = Mouse.class.getDeclaredField("buttons");
         Field var5 = Mouse.class.getDeclaredField("eventButton");
         Field var6 = Mouse.class.getDeclaredField("eventState");
         MouseEvent var7 = new MouseEvent();
         trash.foodbyte.event.MouseEvent var8 = new trash.foodbyte.event.MouseEvent();
         var2.setAccessible(true);
         var2.set(var7, a);
         var3.setAccessible(true);
         var3.set(var7, a);
         var5.setAccessible(true);
         var5.set((Object)null, a);
         var6.setAccessible(true);
         var6.set((Object)null, a);
         MinecraftForge.EVENT_BUS.post(new InputEvent.MouseInputEvent());
         MinecraftForge.EVENT_BUS.post(var7);
         EventManager.call(var8);
         var4.setAccessible(true);
         ByteBuffer var9 = (ByteBuffer)var4.get((Object)null);
         var4.setAccessible(false);
         var9.put(a, (byte)1);
      } catch (Exception var10) {
         var10.printStackTrace();
      }

   }

   static {
      trash((a[])null);
      mc = Wrapper.INSTANCE.getMinecraft();
   }

   public static void trash(a[] arr) {
      Field1205 = arr;
   }

   public static a[] trash() {
      return Field1205;
   }

   private static Exception Method2613(Exception exception) {
      return exception;
   }
}
