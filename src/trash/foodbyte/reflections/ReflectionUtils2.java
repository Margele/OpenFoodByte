package trash.foodbyte.reflections;

import com.google.common.collect.Ordering;
import eventapi.EventManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Timer;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Mouse;
import trash.foodbyte.gui.AltLogin;
import trash.foodbyte.utils.RenderUtils;

public class ReflectionUtils2 {
   private static Map cache2 = new HashMap();
   private static Map cache = new HashMap();
   private static final Minecraft mc = Minecraft.getMinecraft();
   static final boolean trash = !ReflectionUtils2.class.desiredAssertionStatus();

   public static Object newInstance(Class clazz, String name, boolean cache, Object[] args) {
      try {
         return ((Method)Objects.requireNonNull(getMethod(clazz, name, cache))).invoke(clazz.newInstance(), args);
      } catch (InvocationTargetException | InstantiationException | IllegalAccessException var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public static Object invokeMethod(Class clazz, Object object, String methodName, Object[] args) {
      try {
         return ((Method)Objects.requireNonNull(getMethod(clazz, methodName, true))).invoke(object, args);
      } catch (InvocationTargetException | IllegalAccessException var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public static boolean isHittingBlock() {
      try {
         Field a = mc.playerController.getClass().getDeclaredField(ObfuscatedField.isHittingBlock.getObfuscatedName());
         a.setAccessible(true);
         return a.getBoolean(mc.playerController);
      } catch (Exception var1) {
         return false;
      }
   }

   public static void setField(Field field, Object object, Object newField) {
      try {
         field.setAccessible(true);
         field.set(object, newField);
      } catch (IllegalAccessException var4) {
         var4.printStackTrace();
      }

   }

   public static float getTimerSpeed() {
      Field a = null;

      try {
         a = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
         a.setAccessible(true);
      } catch (NoSuchFieldException var5) {
      }

      Field a = null;

      try {
         a = Timer.class.getDeclaredField(ObfuscatedField.timerSpeed.getObfuscatedName());
      } catch (NoSuchFieldException var4) {
      }

      try {
         a.setAccessible(true);
         return a.getFloat(mc);
      } catch (IllegalAccessException var3) {
         return 1.0F;
      }
   }

   public static void setTimerSpeed(float timerSpeed) {
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
         a.set(a.get(mc), timerSpeed);
      } catch (IllegalAccessException var4) {
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

      float a = 0.0F;

      try {
         a.setAccessible(true);
         a = (Float)a.get(a.get(mc));
      } catch (IllegalAccessException var4) {
      }

      return a;
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

   public static Object invokeMethod(Class clazz, Object object, String methodName, boolean cache, Object[] args) {
      try {
         return ((Method)Objects.requireNonNull(getMethod(clazz, methodName, cache))).invoke(object, args);
      } catch (InvocationTargetException | IllegalAccessException var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public static Method getMethod(Class clazz, String methodName, boolean cache) {
      int[] a = RenderUtils.trash();
      if (ReflectionUtils2.cache.containsKey(format(clazz, methodName))) {
         return (Method)ReflectionUtils2.cache.Method2665(format(clazz, methodName));
      } else {
         Method[] var4 = clazz.getDeclaredMethods();
         int var5 = var4.length;
         int var6 = 0;
         if (var6 < var5) {
            Method a = var4[var6];
            if (a.getName().equals(methodName)) {
               if (!a.isAccessible()) {
                  a.setAccessible(true);
               }

               ReflectionUtils2.cache.put(format(clazz, methodName), a);
               return a;
            }

            ++var6;
         }

         return null;
      }
   }

   public static boolean getBoolean(Class clazz, Object object, String name) {
      try {
         return ((Field)Objects.requireNonNull(set(clazz, name, true))).getBoolean(object);
      } catch (IllegalAccessException var4) {
         var4.printStackTrace();
         return false;
      }
   }

   public static boolean getBoolean(Class clazz, Object object, String name, boolean cache) {
      try {
         return ((Field)Objects.requireNonNull(set(clazz, name, cache))).getBoolean(object);
      } catch (IllegalAccessException var5) {
         var5.printStackTrace();
         return false;
      }
   }

   public static Object getObject(Class clazz, Object object, String name) {
      try {
         return ((Field)Objects.requireNonNull(set(clazz, name, true))).get(object);
      } catch (IllegalAccessException var4) {
         var4.printStackTrace();
         return false;
      }
   }

   public static Object getObject(Class clazz, Object object, String name, boolean cache) {
      try {
         return ((Field)Objects.requireNonNull(set(clazz, name, cache))).get(object);
      } catch (IllegalAccessException var5) {
         var5.printStackTrace();
         return false;
      }
   }

   public static void set(Class clazz, Object object, String name, Object newObject) {
      try {
         ((Field)Objects.requireNonNull(set(clazz, name, true))).set(object, newObject);
      } catch (IllegalAccessException var5) {
         var5.printStackTrace();
      }

   }

   public static Field set(Class clazz, String name, boolean cache) {
      int[] a = RenderUtils.trash();
      if (cache2.containsKey(format(clazz, name))) {
         return (Field)cache2.Method2665(format(clazz, name));
      } else {
         Field[] var4 = clazz.getDeclaredFields();
         int var5 = var4.length;
         int var6 = 0;
         if (var6 < var5) {
            Field a = var4[var6];
            if (a.getName().equals(name)) {
               if (!a.isAccessible()) {
                  a.setAccessible(true);
               }

               cache2.put(format(clazz, name), a);
               return a;
            }

            ++var6;
         }

         return null;
      }
   }

   private static String format(Class clazz, String method) {
      return clazz.getName().replace(".", "/") + "-" + method;
   }

   public static void clear() {
      cache.clear();
      cache2.clear();
   }

   public static Ordering getOrdering() {
      try {
         Field a = GuiPlayerTabOverlay.class.getField(ObfuscatedField.field_175252_a.getObfuscatedName());
         a.setAccessible(true);
         return (Ordering)a.get(new GuiPlayerTabOverlay(mc, mc.ingameGUI));
      } catch (Exception var1) {
         var1.printStackTrace();
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

   public static void orientCamera(float a) {
      try {
         Method a = mc.entityRenderer.getClass().getDeclaredMethod(ObfuscatedMethods.orientCamera.getObfuscatedName(), Float.TYPE);
         a.setAccessible(true);
         a.invoke(mc.entityRenderer, a);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static AxisAlignedBB craeteAxisAlignedBB(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
      Class a = null;

      try {
         a = Class.forName("net.minecraft.util.AxisAlignedBB");
      } catch (ClassNotFoundException var17) {
      }

      Constructor a = null;

      try {
         a = a.getDeclaredConstructor(Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
      } catch (NoSuchMethodException var16) {
      }

      a.setAccessible(true);

      try {
         return (AxisAlignedBB)a.newInstance(minX, minY, minZ, maxX, maxY, maxZ);
      } catch (IllegalAccessException | InvocationTargetException | InstantiationException var15) {
         var15.printStackTrace();
         return null;
      }
   }

   public static Vec3 createVec3(double x, double y, double z) {
      Class a = null;

      try {
         a = Class.forName("net.minecraft.util.Vec3");
      } catch (ClassNotFoundException var13) {
      }

      Constructor a = null;

      try {
         a = a.getDeclaredConstructor(Double.TYPE, Double.TYPE, Double.TYPE);
      } catch (NoSuchMethodException var12) {
      }

      a.setAccessible(true);

      try {
         return (Vec3)a.newInstance(x, y, z);
      } catch (InstantiationException var9) {
         var9.printStackTrace();
      } catch (IllegalAccessException var10) {
         var10.printStackTrace();
      } catch (InvocationTargetException var11) {
         var11.printStackTrace();
      }

      return null;
   }

   public static void setRightClickDelayTimer(int rightClickDelayTimer) {
      try {
         Field a = mc.getClass().getDeclaredField(ObfuscatedField.rightClickDelayTimer.getObfuscatedName());
         a.setAccessible(true);
         a.setInt(mc, rightClickDelayTimer);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static void setLeftClickCounter(int leftClickCounter) {
      try {
         Field a = mc.getClass().getDeclaredField(ObfuscatedField.leftClickCounter.getObfuscatedName());
         a.setAccessible(true);
         a.setInt(mc, leftClickCounter);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
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

   public static AxisAlignedBB createAxisAlignedBB(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
      Class a = null;

      try {
         a = Class.forName("net.minecraft.util.AxisAlignedBB");
      } catch (ClassNotFoundException var19) {
      }

      Constructor a = null;

      try {
         if (!trash) {
            throw new AssertionError();
         }

         a = a.getDeclaredConstructor(Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
      } catch (NoSuchMethodException var18) {
      }

      try {
         return (AxisAlignedBB)a.newInstance(minX, minY, minZ, maxX, maxY, maxZ);
      } catch (InstantiationException var15) {
      } catch (IllegalAccessException var16) {
      } catch (InvocationTargetException var17) {
      }

      return null;
   }

   public static Class[] getInterfaces(Object object) {
      Class a = object.getClass();
      Class[] a = a.getInterfaces();
      return a;
   }

   public static boolean isMinecraftNull() {
      try {
         return set(Minecraft.class, "theMinecraft", true) == null;
      } catch (Exception var1) {
         return true;
      }
   }

   public static boolean isProning(EntityPlayer player) {
      try {
         Class a = Class.forName("com.vicmatskiv.weaponlib.ClientEventHandler");
         Method a = a.getDeclaredMethod("isProning");
         return (Boolean)a.invoke(a, player);
      } catch (Exception var3) {
         return false;
      }
   }

   public static void setCurBlockDamageMP(int curBlockDamageMP) {
      Field a = null;

      try {
         a = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.curBlockDamageMP.getObfuscatedName());
      } catch (NoSuchFieldException var4) {
      }

      a.setAccessible(true);

      try {
         a.setInt(mc.playerController, curBlockDamageMP);
      } catch (IllegalAccessException var3) {
         var3.printStackTrace();
      }

   }

   public static boolean isHittingBlock2() {
      Field a = null;

      try {
         a = Minecraft.getMinecraft().playerController.getClass().getDeclaredField(ObfuscatedField.isHittingBlock.getObfuscatedName());
         a.setAccessible(true);
         return a.getBoolean(Minecraft.getMinecraft().playerController.getClass());
      } catch (Exception var2) {
         return false;
      }
   }

   public static void setBlockHitDelay(int blockHitDelay) {
      Field a = null;

      try {
         a = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.blockHitDelay.getObfuscatedName());
      } catch (NoSuchFieldException var4) {
         var4.printStackTrace();
      }

      a.setAccessible(true);

      try {
         a.setInt(mc.playerController, blockHitDelay);
      } catch (IllegalAccessException var3) {
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

   public static void displayGuiAltLogin(Object curScreen) {
      Minecraft.getMinecraft().displayGuiScreen(new AltLogin((GuiScreen)curScreen));
   }

   public static void displayGuiScreen(Object screen) {
      Minecraft.getMinecraft().displayGuiScreen((GuiScreen)screen);
   }

   public static void pollMouseInputEvent(int a, boolean b) {
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
         a.set(a, b);
         a.setAccessible(true);
         a.set((Object)null, a);
         a.setAccessible(true);
         a.set((Object)null, b);
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

   private static Exception trash(Exception trash) {
      return trash;
   }
}
