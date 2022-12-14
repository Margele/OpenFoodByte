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
         Field var0 = mc.playerController.getClass().getDeclaredField(ObfuscatedField.isHittingBlock.getObfuscatedName());
         var0.setAccessible(true);
         return var0.getBoolean(mc.playerController);
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
      Field var0 = null;

      try {
         var0 = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
         var0.setAccessible(true);
      } catch (NoSuchFieldException var5) {
      }

      Field var1 = null;

      try {
         var1 = Timer.class.getDeclaredField(ObfuscatedField.timerSpeed.getObfuscatedName());
      } catch (NoSuchFieldException var4) {
      }

      try {
         var1.setAccessible(true);
         return var0.getFloat(mc);
      } catch (IllegalAccessException var3) {
         return 1.0F;
      }
   }

   public static void setTimerSpeed(float timerSpeed) {
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
         var2.set(var1.get(mc), timerSpeed);
      } catch (IllegalAccessException var4) {
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

      float var2 = 0.0F;

      try {
         var1.setAccessible(true);
         var2 = (Float)var1.get(var0.get(mc));
      } catch (IllegalAccessException var4) {
      }

      return var2;
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

   public static Object invokeMethod(Class clazz, Object object, String methodName, boolean cache, Object[] args) {
      try {
         return ((Method)Objects.requireNonNull(getMethod(clazz, methodName, cache))).invoke(object, args);
      } catch (InvocationTargetException | IllegalAccessException var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public static Method getMethod(Class clazz, String methodName, boolean cache) {
      int[] var3 = RenderUtils.trash();
      if (ReflectionUtils2.cache.containsKey(format(clazz, methodName))) {
         return (Method)ReflectionUtils2.cache.Method2665(format(clazz, methodName));
      } else {
         Method[] var4 = clazz.getDeclaredMethods();
         int var5 = var4.length;
         int var6 = 0;
         if (var6 < var5) {
            Method var7 = var4[var6];
            if (var7.getName().equals(methodName)) {
               if (!var7.isAccessible()) {
                  var7.setAccessible(true);
               }

               ReflectionUtils2.cache.put(format(clazz, methodName), var7);
               return var7;
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
      int[] var3 = RenderUtils.trash();
      if (cache2.containsKey(format(clazz, name))) {
         return (Field)cache2.Method2665(format(clazz, name));
      } else {
         Field[] var4 = clazz.getDeclaredFields();
         int var5 = var4.length;
         int var6 = 0;
         if (var6 < var5) {
            Field var7 = var4[var6];
            if (var7.getName().equals(name)) {
               if (!var7.isAccessible()) {
                  var7.setAccessible(true);
               }

               cache2.put(format(clazz, name), var7);
               return var7;
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
         Field var0 = GuiPlayerTabOverlay.class.getField(ObfuscatedField.field_175252_a.getObfuscatedName());
         var0.setAccessible(true);
         return (Ordering)var0.get(new GuiPlayerTabOverlay(mc, mc.ingameGUI));
      } catch (Exception var1) {
         var1.printStackTrace();
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

   public static void orientCamera(float a) {
      try {
         Method var1 = mc.entityRenderer.getClass().getDeclaredMethod(ObfuscatedMethods.orientCamera.getObfuscatedName(), Float.TYPE);
         var1.setAccessible(true);
         var1.invoke(mc.entityRenderer, a);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static AxisAlignedBB craeteAxisAlignedBB(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
      Class var12 = null;

      try {
         var12 = Class.forName("net.minecraft.util.AxisAlignedBB");
      } catch (ClassNotFoundException var17) {
      }

      Constructor var13 = null;

      try {
         var13 = var12.getDeclaredConstructor(Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
      } catch (NoSuchMethodException var16) {
      }

      var13.setAccessible(true);

      try {
         return (AxisAlignedBB)var13.newInstance(minX, minY, minZ, maxX, maxY, maxZ);
      } catch (IllegalAccessException | InvocationTargetException | InstantiationException var15) {
         var15.printStackTrace();
         return null;
      }
   }

   public static Vec3 createVec3(double x, double y, double z) {
      Class var6 = null;

      try {
         var6 = Class.forName("net.minecraft.util.Vec3");
      } catch (ClassNotFoundException var13) {
      }

      Constructor var7 = null;

      try {
         var7 = var6.getDeclaredConstructor(Double.TYPE, Double.TYPE, Double.TYPE);
      } catch (NoSuchMethodException var12) {
      }

      var7.setAccessible(true);

      try {
         return (Vec3)var7.newInstance(x, y, z);
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
         Field var1 = mc.getClass().getDeclaredField(ObfuscatedField.rightClickDelayTimer.getObfuscatedName());
         var1.setAccessible(true);
         var1.setInt(mc, rightClickDelayTimer);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static void setLeftClickCounter(int leftClickCounter) {
      try {
         Field var1 = mc.getClass().getDeclaredField(ObfuscatedField.leftClickCounter.getObfuscatedName());
         var1.setAccessible(true);
         var1.setInt(mc, leftClickCounter);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
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

   public static AxisAlignedBB createAxisAlignedBB(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
      Class var12 = null;

      try {
         var12 = Class.forName("net.minecraft.util.AxisAlignedBB");
      } catch (ClassNotFoundException var19) {
      }

      Constructor var13 = null;

      try {
         if (!trash) {
            throw new AssertionError();
         }

         var13 = var12.getDeclaredConstructor(Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE);
      } catch (NoSuchMethodException var18) {
      }

      try {
         return (AxisAlignedBB)var13.newInstance(minX, minY, minZ, maxX, maxY, maxZ);
      } catch (InstantiationException var15) {
      } catch (IllegalAccessException var16) {
      } catch (InvocationTargetException var17) {
      }

      return null;
   }

   public static Class[] getInterfaces(Object object) {
      Class var1 = object.getClass();
      Class[] var2 = var1.getInterfaces();
      return var2;
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
         Class var1 = Class.forName("com.vicmatskiv.weaponlib.ClientEventHandler");
         Method var2 = var1.getDeclaredMethod("isProning");
         return (Boolean)var2.invoke(var1, player);
      } catch (Exception var3) {
         return false;
      }
   }

   public static void setCurBlockDamageMP(int curBlockDamageMP) {
      Field var1 = null;

      try {
         var1 = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.curBlockDamageMP.getObfuscatedName());
      } catch (NoSuchFieldException var4) {
      }

      var1.setAccessible(true);

      try {
         var1.setInt(mc.playerController, curBlockDamageMP);
      } catch (IllegalAccessException var3) {
         var3.printStackTrace();
      }

   }

   public static boolean isHittingBlock2() {
      Field var0 = null;

      try {
         var0 = Minecraft.getMinecraft().playerController.getClass().getDeclaredField(ObfuscatedField.isHittingBlock.getObfuscatedName());
         var0.setAccessible(true);
         return var0.getBoolean(Minecraft.getMinecraft().playerController.getClass());
      } catch (Exception var2) {
         return false;
      }
   }

   public static void setBlockHitDelay(int blockHitDelay) {
      Field var1 = null;

      try {
         var1 = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.blockHitDelay.getObfuscatedName());
      } catch (NoSuchFieldException var4) {
         var4.printStackTrace();
      }

      var1.setAccessible(true);

      try {
         var1.setInt(mc.playerController, blockHitDelay);
      } catch (IllegalAccessException var3) {
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

   public static void displayGuiAltLogin(Object curScreen) {
      Minecraft.getMinecraft().displayGuiScreen(new AltLogin((GuiScreen)curScreen));
   }

   public static void displayGuiScreen(Object screen) {
      Minecraft.getMinecraft().displayGuiScreen((GuiScreen)screen);
   }

   public static void pollMouseInputEvent(int a, boolean b) {
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
         var3.set(var7, b);
         var5.setAccessible(true);
         var5.set((Object)null, a);
         var6.setAccessible(true);
         var6.set((Object)null, b);
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

   private static Exception trash(Exception trash) {
      return trash;
   }
}
