/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.ReflectiveOperationException
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.nio.ByteBuffer
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiPlayerTabOverlay
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.Timer
 *  net.minecraft.util.Vec3
 *  net.minecraftforge.client.event.MouseEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.Event
 *  net.minecraftforge.fml.common.gameevent.InputEvent$MouseInputEvent
 *  org.lwjgl.input.Mouse
 */
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
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Mouse;
import trash.foodbyte.gui.AltLogin;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.ObfuscatedMethods;
import trash.foodbyte.utils.RenderUtils;

public class ReflectionUtils2 {
    private static Map cache2;
    private static Map cache;
    private static final Minecraft mc;
    static final boolean trash;

    public static Object newInstance(Class clazz, String name, boolean cache, Object[] args) {
        try {
            return ((Method)Objects.requireNonNull((Object)ReflectionUtils2.getMethod(clazz, name, cache))).invoke(clazz.newInstance(), args);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException a) {
            a.printStackTrace();
            return null;
        }
    }

    public static Object invokeMethod(Class clazz, Object object, String methodName, Object[] args) {
        try {
            return ((Method)Objects.requireNonNull((Object)ReflectionUtils2.getMethod(clazz, methodName, true))).invoke(object, args);
        }
        catch (IllegalAccessException | InvocationTargetException a) {
            a.printStackTrace();
            return null;
        }
    }

    public static boolean isHittingBlock() {
        try {
            Field a = ReflectionUtils2.mc.playerController.getClass().getDeclaredField(ObfuscatedField.isHittingBlock.getObfuscatedName());
            a.setAccessible(true);
            return a.getBoolean((Object)ReflectionUtils2.mc.playerController);
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static void setField(Field field, Object object, Object newField) {
        try {
            field.setAccessible(true);
            field.set(object, newField);
        }
        catch (IllegalAccessException a) {
            a.printStackTrace();
        }
    }

    public static float getTimerSpeed() {
        Field a = null;
        try {
            a = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
            a.setAccessible(true);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        Field a2 = null;
        try {
            a2 = Timer.class.getDeclaredField(ObfuscatedField.timerSpeed.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        try {
            a2.setAccessible(true);
            return a.getFloat((Object)mc);
        }
        catch (IllegalAccessException illegalAccessException) {
            return 1.0f;
        }
    }

    public static void setTimerSpeed(float timerSpeed) {
        Field a = null;
        try {
            a = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
            a.setAccessible(true);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        Field a2 = null;
        try {
            a2 = Timer.class.getDeclaredField(ObfuscatedField.timerSpeed.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        try {
            a2.setAccessible(true);
            a2.set(a.get((Object)mc), (Object)Float.valueOf((float)timerSpeed));
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
    }

    public static float getRenderPartialTicks() {
        Field a = null;
        try {
            a = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
            a.setAccessible(true);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        Field a2 = null;
        try {
            a2 = Timer.class.getDeclaredField(ObfuscatedField.renderPartialTicks.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        float a3 = 0.0f;
        try {
            a2.setAccessible(true);
            a3 = ((Float)a2.get(a.get((Object)mc))).floatValue();
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        return a3;
    }

    public static double getRenderPosX() {
        Field a = null;
        try {
            a = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosX.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getDouble((Object)mc.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static double getRenderPosY() {
        Field a = null;
        try {
            a = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosY.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getDouble((Object)mc.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static double getRenderPosZ() {
        Field a = null;
        try {
            a = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosZ.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getDouble((Object)mc.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static Object invokeMethod(Class clazz, Object object, String methodName, boolean cache, Object[] args) {
        try {
            return ((Method)Objects.requireNonNull((Object)ReflectionUtils2.getMethod(clazz, methodName, cache))).invoke(object, args);
        }
        catch (IllegalAccessException | InvocationTargetException a) {
            a.printStackTrace();
            return null;
        }
    }

    public static Method getMethod(Class clazz, String methodName, boolean cache) {
        int[] a = RenderUtils.trash();
        if (ReflectionUtils2.cache.containsKey((Object)ReflectionUtils2.format(clazz, methodName))) {
            return (Method)ReflectionUtils2.cache.Method2665((Object)ReflectionUtils2.format(clazz, methodName));
        }
        int n = 0;
        Method[] methodArray = clazz.getDeclaredMethods();
        int n2 = methodArray.length;
        if (n < n2) {
            Method a2 = methodArray[n];
            if (a2.getName().equals((Object)methodName)) {
                if (!a2.isAccessible()) {
                    a2.setAccessible(true);
                }
                ReflectionUtils2.cache.put((Object)ReflectionUtils2.format(clazz, methodName), (Object)a2);
                return a2;
            }
            ++n;
        }
        return null;
    }

    public static boolean getBoolean(Class clazz, Object object, String name) {
        try {
            return ((Field)Objects.requireNonNull((Object)ReflectionUtils2.set(clazz, name, true))).getBoolean(object);
        }
        catch (IllegalAccessException a) {
            a.printStackTrace();
            return false;
        }
    }

    public static boolean getBoolean(Class clazz, Object object, String name, boolean cache) {
        try {
            return ((Field)Objects.requireNonNull((Object)ReflectionUtils2.set(clazz, name, cache))).getBoolean(object);
        }
        catch (IllegalAccessException a) {
            a.printStackTrace();
            return false;
        }
    }

    public static Object getObject(Class clazz, Object object, String name) {
        try {
            return ((Field)Objects.requireNonNull((Object)ReflectionUtils2.set(clazz, name, true))).get(object);
        }
        catch (IllegalAccessException a) {
            a.printStackTrace();
            return false;
        }
    }

    public static Object getObject(Class clazz, Object object, String name, boolean cache) {
        try {
            return ((Field)Objects.requireNonNull((Object)ReflectionUtils2.set(clazz, name, cache))).get(object);
        }
        catch (IllegalAccessException a) {
            a.printStackTrace();
            return false;
        }
    }

    public static void set(Class clazz, Object object, String name, Object newObject) {
        try {
            ((Field)Objects.requireNonNull((Object)ReflectionUtils2.set(clazz, name, true))).set(object, newObject);
        }
        catch (IllegalAccessException a) {
            a.printStackTrace();
        }
    }

    public static Field set(Class clazz, String name, boolean cache) {
        int[] a = RenderUtils.trash();
        if (cache2.containsKey((Object)ReflectionUtils2.format(clazz, name))) {
            return (Field)cache2.Method2665((Object)ReflectionUtils2.format(clazz, name));
        }
        int n = 0;
        Field[] fieldArray = clazz.getDeclaredFields();
        int n2 = fieldArray.length;
        if (n < n2) {
            Field a2 = fieldArray[n];
            if (a2.getName().equals((Object)name)) {
                if (!a2.isAccessible()) {
                    a2.setAccessible(true);
                }
                cache2.put((Object)ReflectionUtils2.format(clazz, name), (Object)a2);
                return a2;
            }
            ++n;
        }
        return null;
    }

    private static String format(Class clazz, String method) {
        return clazz.getName().replace((CharSequence)".", (CharSequence)"/") + "-" + method;
    }

    public static void clear() {
        cache.clear();
        cache2.clear();
    }

    public static Ordering getOrdering() {
        try {
            Field a = GuiPlayerTabOverlay.class.getField(ObfuscatedField.field_175252_a.getObfuscatedName());
            a.setAccessible(true);
            return (Ordering)a.get((Object)new GuiPlayerTabOverlay(mc, ReflectionUtils2.mc.ingameGUI));
        }
        catch (Exception a) {
            a.printStackTrace();
            return null;
        }
    }

    public static void setupCameraTransform(float a, int b) {
        try {
            Method a2 = ReflectionUtils2.mc.entityRenderer.getClass().getDeclaredMethod(ObfuscatedMethods.setupCameraTransform.getObfuscatedName(), new Class[]{Float.TYPE, Integer.TYPE});
            a2.setAccessible(true);
            a2.invoke((Object)ReflectionUtils2.mc.entityRenderer, new Object[]{Float.valueOf((float)a), b});
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    public static void orientCamera(float a) {
        try {
            Method a2 = ReflectionUtils2.mc.entityRenderer.getClass().getDeclaredMethod(ObfuscatedMethods.orientCamera.getObfuscatedName(), new Class[]{Float.TYPE});
            a2.setAccessible(true);
            a2.invoke((Object)ReflectionUtils2.mc.entityRenderer, new Object[]{Float.valueOf((float)a)});
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    public static AxisAlignedBB craeteAxisAlignedBB(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        Class a = null;
        try {
            a = Class.forName((String)"net.minecraft.util.AxisAlignedBB");
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        Constructor a2 = null;
        try {
            a2 = a.getDeclaredConstructor(new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        a2.setAccessible(true);
        try {
            return (AxisAlignedBB)a2.newInstance(new Object[]{minX, minY, minZ, maxX, maxY, maxZ});
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException a3) {
            a3.printStackTrace();
            return null;
        }
    }

    public static Vec3 createVec3(double x, double y, double z) {
        Class a = null;
        try {
            a = Class.forName((String)"net.minecraft.util.Vec3");
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        Constructor a2 = null;
        try {
            a2 = a.getDeclaredConstructor(new Class[]{Double.TYPE, Double.TYPE, Double.TYPE});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        a2.setAccessible(true);
        try {
            return (Vec3)a2.newInstance(new Object[]{x, y, z});
        }
        catch (InstantiationException a3) {
            a3.printStackTrace();
        }
        catch (IllegalAccessException a4) {
            a4.printStackTrace();
        }
        catch (InvocationTargetException a5) {
            a5.printStackTrace();
        }
        return null;
    }

    public static void setRightClickDelayTimer(int rightClickDelayTimer) {
        try {
            Field a = mc.getClass().getDeclaredField(ObfuscatedField.rightClickDelayTimer.getObfuscatedName());
            a.setAccessible(true);
            a.setInt((Object)mc, rightClickDelayTimer);
        }
        catch (ReflectiveOperationException a) {
            throw new RuntimeException((Throwable)a);
        }
    }

    public static void setLeftClickCounter(int leftClickCounter) {
        try {
            Field a = mc.getClass().getDeclaredField(ObfuscatedField.leftClickCounter.getObfuscatedName());
            a.setAccessible(true);
            a.setInt((Object)mc, leftClickCounter);
        }
        catch (ReflectiveOperationException a) {
            throw new RuntimeException((Throwable)a);
        }
    }

    public static void clickMouse() {
        try {
            Method a = mc.getClass().getDeclaredMethod(ObfuscatedMethods.clickMouse.getObfuscatedName(), new Class[0]);
            a.setAccessible(true);
            a.invoke((Object)mc, new Object[0]);
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }

    public static void setJumpTicks(int jumpTicks) {
        try {
            Field a = EntityLivingBase.class.getDeclaredField(ObfuscatedField.jumpTicks.getObfuscatedName());
            a.setAccessible(true);
            a.setInt((Object)ReflectionUtils2.mc.thePlayer, jumpTicks);
        }
        catch (ReflectiveOperationException a) {
            throw new RuntimeException((Throwable)a);
        }
    }

    public static AxisAlignedBB createAxisAlignedBB(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        Constructor a;
        Class a2;
        block10: {
            a2 = null;
            try {
                a2 = Class.forName((String)"net.minecraft.util.AxisAlignedBB");
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            a = null;
            if (trash) break block10;
            throw new AssertionError();
        }
        try {
            a = a2.getDeclaredConstructor(new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        try {
            return (AxisAlignedBB)a.newInstance(new Object[]{minX, minY, minZ, maxX, maxY, maxZ});
        }
        catch (InstantiationException instantiationException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
            // empty catch block
        }
        return null;
    }

    public static Class[] getInterfaces(Object object) {
        Class a = object.getClass();
        Class[] a2 = a.getInterfaces();
        return a2;
    }

    public static boolean isMinecraftNull() {
        try {
            return ReflectionUtils2.set(Minecraft.class, "theMinecraft", true) == null;
        }
        catch (Exception a) {
            return true;
        }
    }

    public static boolean isProning(EntityPlayer player) {
        try {
            Class a = Class.forName((String)"com.vicmatskiv.weaponlib.ClientEventHandler");
            Method a2 = a.getDeclaredMethod("isProning", new Class[0]);
            return (Boolean)a2.invoke((Object)a, new Object[]{player});
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static void setCurBlockDamageMP(int curBlockDamageMP) {
        Field a = null;
        try {
            a = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.curBlockDamageMP.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            a.setInt((Object)ReflectionUtils2.mc.playerController, curBlockDamageMP);
        }
        catch (IllegalAccessException a2) {
            a2.printStackTrace();
        }
    }

    public static boolean isHittingBlock2() {
        Field a = null;
        try {
            a = Minecraft.getMinecraft().playerController.getClass().getDeclaredField(ObfuscatedField.isHittingBlock.getObfuscatedName());
            a.setAccessible(true);
            return a.getBoolean((Object)Minecraft.getMinecraft().playerController.getClass());
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static void setBlockHitDelay(int blockHitDelay) {
        Field a = null;
        try {
            a = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.blockHitDelay.getObfuscatedName());
        }
        catch (NoSuchFieldException a2) {
            a2.printStackTrace();
        }
        a.setAccessible(true);
        try {
            a.setInt((Object)ReflectionUtils2.mc.playerController, blockHitDelay);
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
    }

    public static float getCurBlockDamageMP() {
        Field a = null;
        try {
            a = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.curBlockDamageMP.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getFloat((Object)ReflectionUtils2.mc.playerController);
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0f;
        }
    }

    public static void displayGuiAltLogin(Object curScreen) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new AltLogin((GuiScreen)curScreen));
    }

    public static void displayGuiScreen(Object screen) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)screen);
    }

    public static void pollMouseInputEvent(int a, boolean b) {
        Field a2 = MouseEvent.class.getDeclaredField("button");
        Field a3 = MouseEvent.class.getDeclaredField("buttonstate");
        Field a4 = Mouse.class.getDeclaredField("buttons");
        Field a5 = Mouse.class.getDeclaredField("eventButton");
        Field a6 = Mouse.class.getDeclaredField("eventState");
        MouseEvent a7 = new MouseEvent();
        trash.foodbyte.event.MouseEvent a8 = new trash.foodbyte.event.MouseEvent();
        a2.setAccessible(true);
        a2.set((Object)a7, (Object)a);
        a3.setAccessible(true);
        a3.set((Object)a7, (Object)b);
        a5.setAccessible(true);
        a5.set(null, (Object)a);
        a6.setAccessible(true);
        a6.set(null, (Object)b);
        MinecraftForge.EVENT_BUS.post((Event)new InputEvent.MouseInputEvent());
        MinecraftForge.EVENT_BUS.post((Event)a7);
        EventManager.call(a8);
        a4.setAccessible(true);
        ByteBuffer a9 = (ByteBuffer)a4.get(null);
        a4.setAccessible(false);
        ByteBuffer byteBuffer = a9;
        int n = a;
        boolean bl = true;
        try {
            byteBuffer.put(n, (byte)(bl ? 1 : 0));
        }
        catch (Exception a22) {
            a22.printStackTrace();
        }
    }

    static {
        trash = !ReflectionUtils2.class.desiredAssertionStatus();
        mc = Minecraft.getMinecraft();
        cache2 = new HashMap();
        cache = new HashMap();
    }

    private static Exception trash(Exception exception) {
        return exception;
    }
}