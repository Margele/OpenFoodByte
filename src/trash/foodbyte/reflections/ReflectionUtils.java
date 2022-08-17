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
         Field a = Minecraft.class.getDeclaredField(ObfuscatedField.session.getObfuscatedName());
         a.setAccessible(true);
         a.set(Minecraft.getMinecraft(), new Session(name, "", "", "mojang"));
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static void setSession(Session session) {
      try {
         Field a = Minecraft.class.getDeclaredField(ObfuscatedField.session.getObfuscatedName());
         a.setAccessible(true);
         a.set(Minecraft.getMinecraft(), session);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static float getRenderPartialTicks() {
      Field a = null;

      try {
         a = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
         a.setAccessible(true);
      } catch (NoSuchFieldException var6) {
      }

      Field a = null;

      try {
         a = Timer.class.getDeclaredField(ObfuscatedField.renderPartialTicks.getObfuscatedName());
      } catch (NoSuchFieldException var5) {
      }

      float a = 1.0F;

      try {
         a.setAccessible(true);
         a = a.getFloat(a.get(mc));
      } catch (IllegalAccessException var4) {
      }

      return a;
   }

   public static float getTicksPerSecond() {
      Field a = null;

      try {
         a = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
         a.setAccessible(true);
      } catch (Exception var5) {
      }

      Field a = null;

      try {
         a = Timer.class.getDeclaredField(ObfuscatedField.ticksPerSecond.getObfuscatedName());
         a.setAccessible(true);
      } catch (Exception var4) {
      }

      try {
         return a.getFloat(a.get(mc));
      } catch (Exception var3) {
         return 1.0F;
      }
   }

   public static float getTimerSpeed() {
      Field a = null;

      try {
         a = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
         a.setAccessible(true);
      } catch (Exception var5) {
      }

      Field a = null;

      try {
         a = Timer.class.getDeclaredField(ObfuscatedField.timerSpeed.getObfuscatedName());
         a.setAccessible(true);
      } catch (Exception var4) {
      }

      try {
         return a.getFloat(a.get(mc));
      } catch (Exception var3) {
         return 1.0F;
      }
   }

   public static void setTimerSpeed(float speed) {
      Field a = null;

      try {
         a = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
         a.setAccessible(true);
      } catch (NoSuchFieldException var6) {
      }

      Field a = null;

      try {
         a = Timer.class.getDeclaredField(ObfuscatedField.timerSpeed.getObfuscatedName());
      } catch (NoSuchFieldException var5) {
      }

      try {
         a.setAccessible(true);
         a.set(a.get(mc), speed);
      } catch (IllegalAccessException var4) {
      }

   }

   public static double getRenderPosX() {
      Field a = null;

      try {
         a = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosX.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      a.setAccessible(true);

      try {
         return a.getDouble(mc.getRenderManager());
      } catch (IllegalAccessException var2) {
         return 0.0;
      }
   }

   public static double getRenderPosY() {
      Field a = null;

      try {
         a = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosY.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      a.setAccessible(true);

      try {
         return a.getDouble(mc.getRenderManager());
      } catch (IllegalAccessException var2) {
         return 0.0;
      }
   }

   public static double getRenderPosZ() {
      Field a = null;

      try {
         a = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosZ.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      a.setAccessible(true);

      try {
         return a.getDouble(mc.getRenderManager());
      } catch (IllegalAccessException var2) {
         return 0.0;
      }
   }

   public static int getRightClickDelayTimer() {
      Field a = null;

      try {
         a = mc.getClass().getDeclaredField(ObfuscatedField.rightClickDelayTimer.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      a.setAccessible(true);

      try {
         return a.getInt(mc);
      } catch (IllegalAccessException var2) {
         return 4;
      }
   }

   public static void setRightClickDelayTimer(int timer) {
      try {
         Field a = mc.getClass().getDeclaredField(ObfuscatedField.rightClickDelayTimer.getObfuscatedName());
         a.setAccessible(true);
         a.setInt(mc, timer);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static void setLeftClickCounter(int counter) {
      try {
         Field a = mc.getClass().getDeclaredField(ObfuscatedField.leftClickCounter.getObfuscatedName());
         a.setAccessible(true);
         a.setInt(mc, counter);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static boolean isHittingBlock() {
      Field a = null;

      try {
         a = mc.playerController.getClass().getDeclaredField(ObfuscatedField.isHittingBlock.getObfuscatedName());
         a.setAccessible(true);
         return a.getBoolean(mc.playerController.getClass());
      } catch (Exception var2) {
         return false;
      }
   }

   public static void setBlockHitDelay(int hitDelay) {
      Field a = null;

      try {
         a = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.blockHitDelay.getObfuscatedName());
      } catch (NoSuchFieldException var4) {
         var4.printStackTrace();
      }

      a.setAccessible(true);

      try {
         a.setInt(mc.playerController, hitDelay);
      } catch (IllegalAccessException var3) {
      }

   }

   public static void clickMouse() {
      try {
         Method a = mc.getClass().getDeclaredMethod(ObfuscatedMethods.clickMouse.getObfuscatedName());
         a.setAccessible(true);
         a.invoke(mc);
      } catch (Exception var1) {
         var1.printStackTrace();
      }

   }

   public static void setJumpTicks(int jumpTicks) {
      try {
         Field a = EntityLivingBase.class.getDeclaredField(ObfuscatedField.jumpTicks.getObfuscatedName());
         a.setAccessible(true);
         a.setInt(mc.thePlayer, jumpTicks);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static float getCurBlockDamageMP() {
      Field a = null;

      try {
         a = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.curBlockDamageMP.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      a.setAccessible(true);

      try {
         return a.getFloat(mc.playerController);
      } catch (IllegalAccessException var2) {
         return 0.0F;
      }
   }

   public static void setCurBlockDamageMP(float curBlockDamage) {
      a[] a = trash();

      try {
         Field a = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.curBlockDamageMP.getObfuscatedName());
         a.setAccessible(true);
         a.setFloat(mc.playerController, curBlockDamage);
      } catch (ReflectiveOperationException var3) {
         throw new RuntimeException(var3);
      }

      if (a.trash() == null) {
         trash(new a[5]);
      }

   }

   public static float getItemInUseCount() {
      Field a = null;

      try {
         a = EntityPlayer.class.getDeclaredField(ObfuscatedField.itemInUseCount.getObfuscatedName());
      } catch (NoSuchFieldException var3) {
      }

      a.setAccessible(true);

      try {
         return (float)a.getInt(mc.thePlayer);
      } catch (IllegalAccessException var2) {
         return 0.0F;
      }
   }

   public static void setItemInUseCount(int count) {
      a[] a = trash();

      try {
         Field a = EntityPlayer.class.getDeclaredField(ObfuscatedField.itemInUseCount.getObfuscatedName());
         a.setAccessible(true);
         a.setInt(mc.thePlayer, count);
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
         Method a = mc.entityRenderer.getClass().getDeclaredMethod(ObfuscatedMethods.setupCameraTransform.getObfuscatedName(), Float.TYPE, Integer.TYPE);
         a.setAccessible(true);
         a.invoke(mc.entityRenderer, a, b);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public static void setOrientCamera(float orientCamera) {
      try {
         Method a = mc.entityRenderer.getClass().getDeclaredMethod(ObfuscatedMethods.orientCamera.getObfuscatedName(), Float.TYPE);
         a.setAccessible(true);
         a.invoke(mc.entityRenderer, orientCamera);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static void postForgeMouseInputEvent(int a, boolean a) {
      try {
         Field a = MouseEvent.class.getDeclaredField("button");
         Field a = MouseEvent.class.getDeclaredField("buttonstate");
         Field a = Mouse.class.getDeclaredField("buttons");
         Field a = Mouse.class.getDeclaredField("eventButton");
         Field a = Mouse.class.getDeclaredField("eventState");
         MouseEvent a = new MouseEvent();
         trash.foodbyte.event.MouseEvent a = new trash.foodbyte.event.MouseEvent();
         a.setAccessible(true);
         a.set(a, a);
         a.setAccessible(true);
         a.set(a, a);
         a.setAccessible(true);
         a.set((Object)null, a);
         a.setAccessible(true);
         a.set((Object)null, a);
         MinecraftForge.EVENT_BUS.post(new InputEvent.MouseInputEvent());
         MinecraftForge.EVENT_BUS.post(a);
         EventManager.call(a);
         a.setAccessible(true);
         ByteBuffer a = (ByteBuffer)a.get((Object)null);
         a.setAccessible(false);
         a.put(a, (byte)1);
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
