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
package awsl;

import awsl.Class248;
import awsl.Class683;
import awsl.Class706;
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
import trash.foodbyte.utils.ObfuscatedClasses;
import trash.foodbyte.utils.RenderUtils;

public class Class362 {
    private static Map Field1709;
    private static Map Field1710;
    private static final Minecraft Field1711;
    static final boolean Field1712;

    public static Object Method502(Class a, String a2, boolean a3, Object[] a4) {
        try {
            return ((Method)Objects.requireNonNull((Object)Class362.Method513(a, a2, a3))).invoke(a.newInstance(), a4);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException a5) {
            a5.printStackTrace();
            return null;
        }
    }

    public static Object Method503(Class a, Object a2, String a3, Object[] a4) {
        try {
            return ((Method)Objects.requireNonNull((Object)Class362.Method513(a, a3, true))).invoke(a2, a4);
        }
        catch (IllegalAccessException | InvocationTargetException a5) {
            a5.printStackTrace();
            return null;
        }
    }

    public static boolean Method504() {
        try {
            Field a = Class362.Field1711.playerController.getClass().getDeclaredField(ObfuscatedClasses.isHittingBlock.getObfuscatedName());
            a.setAccessible(true);
            return a.getBoolean((Object)Class362.Field1711.playerController);
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static void Method505(Field a, Object a2, Object a3) {
        try {
            a.setAccessible(true);
            a.set(a2, a3);
        }
        catch (IllegalAccessException a4) {
            a4.printStackTrace();
        }
    }

    public static float Method506() {
        Field a = null;
        try {
            a = Field1711.getClass().getDeclaredField(ObfuscatedClasses.timer.getObfuscatedName());
            a.setAccessible(true);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        Field a2 = null;
        try {
            a2 = Timer.class.getDeclaredField(ObfuscatedClasses.timerSpeed.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        try {
            a2.setAccessible(true);
            return a.getFloat((Object)Field1711);
        }
        catch (IllegalAccessException illegalAccessException) {
            return 1.0f;
        }
    }

    public static void Method507(float a) {
        Field a2 = null;
        try {
            a2 = Field1711.getClass().getDeclaredField(ObfuscatedClasses.timer.getObfuscatedName());
            a2.setAccessible(true);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        Field a3 = null;
        try {
            a3 = Timer.class.getDeclaredField(ObfuscatedClasses.timerSpeed.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        try {
            a3.setAccessible(true);
            a3.set(a2.get((Object)Field1711), (Object)Float.valueOf((float)a));
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
    }

    public static float Method508() {
        Field a = null;
        try {
            a = Field1711.getClass().getDeclaredField(ObfuscatedClasses.timer.getObfuscatedName());
            a.setAccessible(true);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        Field a2 = null;
        try {
            a2 = Timer.class.getDeclaredField(ObfuscatedClasses.renderPartialTicks.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        float a3 = 0.0f;
        try {
            a2.setAccessible(true);
            a3 = ((Float)a2.get(a.get((Object)Field1711))).floatValue();
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        return a3;
    }

    public static double Method509() {
        Field a = null;
        try {
            a = RenderManager.class.getDeclaredField(ObfuscatedClasses.renderPosX.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getDouble((Object)Field1711.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static double Method510() {
        Field a = null;
        try {
            a = RenderManager.class.getDeclaredField(ObfuscatedClasses.renderPosY.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getDouble((Object)Field1711.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static double Method511() {
        Field a = null;
        try {
            a = RenderManager.class.getDeclaredField(ObfuscatedClasses.renderPosZ.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getDouble((Object)Field1711.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static Object Method512(Class a, Object a2, String a3, boolean a4, Object[] a5) {
        try {
            return ((Method)Objects.requireNonNull((Object)Class362.Method513(a, a3, a4))).invoke(a2, a5);
        }
        catch (IllegalAccessException | InvocationTargetException a6) {
            a6.printStackTrace();
            return null;
        }
    }

    public static Method Method513(Class a, String a2, boolean a3) {
        int[] a4 = RenderUtils.Method1148();
        if (Field1710.containsKey((Object)Class362.Method520(a, a2))) {
            return (Method)Field1710.Method2665((Object)Class362.Method520(a, a2));
        }
        int n = 0;
        Method[] methodArray = a.getDeclaredMethods();
        int n2 = methodArray.length;
        if (n < n2) {
            Method a5 = methodArray[n];
            if (a5.getName().equals((Object)a2)) {
                if (!a5.isAccessible()) {
                    a5.setAccessible(true);
                }
                Field1710.put((Object)Class362.Method520(a, a2), (Object)a5);
                return a5;
            }
            ++n;
        }
        return null;
    }

    public static boolean Method514(Class a, Object a2, String a3) {
        try {
            return ((Field)Objects.requireNonNull((Object)Class362.Method519(a, a3, true))).getBoolean(a2);
        }
        catch (IllegalAccessException a4) {
            a4.printStackTrace();
            return false;
        }
    }

    public static boolean Method515(Class a, Object a2, String a3, boolean a4) {
        try {
            return ((Field)Objects.requireNonNull((Object)Class362.Method519(a, a3, a4))).getBoolean(a2);
        }
        catch (IllegalAccessException a5) {
            a5.printStackTrace();
            return false;
        }
    }

    public static Object Method516(Class a, Object a2, String a3) {
        try {
            return ((Field)Objects.requireNonNull((Object)Class362.Method519(a, a3, true))).get(a2);
        }
        catch (IllegalAccessException a4) {
            a4.printStackTrace();
            return false;
        }
    }

    public static Object Method517(Class a, Object a2, String a3, boolean a4) {
        try {
            return ((Field)Objects.requireNonNull((Object)Class362.Method519(a, a3, a4))).get(a2);
        }
        catch (IllegalAccessException a5) {
            a5.printStackTrace();
            return false;
        }
    }

    public static void Method518(Class a, Object a2, String a3, Object a4) {
        try {
            ((Field)Objects.requireNonNull((Object)Class362.Method519(a, a3, true))).set(a2, a4);
        }
        catch (IllegalAccessException a5) {
            a5.printStackTrace();
        }
    }

    public static Field Method519(Class a, String a2, boolean a3) {
        int[] a4 = RenderUtils.Method1148();
        if (Field1709.containsKey((Object)Class362.Method520(a, a2))) {
            return (Field)Field1709.Method2665((Object)Class362.Method520(a, a2));
        }
        int n = 0;
        Field[] fieldArray = a.getDeclaredFields();
        int n2 = fieldArray.length;
        if (n < n2) {
            Field a5 = fieldArray[n];
            if (a5.getName().equals((Object)a2)) {
                if (!a5.isAccessible()) {
                    a5.setAccessible(true);
                }
                Field1709.put((Object)Class362.Method520(a, a2), (Object)a5);
                return a5;
            }
            ++n;
        }
        return null;
    }

    private static String Method520(Class a, String a2) {
        return a.getName().replace((CharSequence)".", (CharSequence)"/") + "-" + a2;
    }

    public static void Method521() {
        Field1710.clear();
        Field1709.clear();
    }

    public static Ordering Method522() {
        try {
            Field a = GuiPlayerTabOverlay.class.getField(ObfuscatedClasses.field_175252_a.getObfuscatedName());
            a.setAccessible(true);
            return (Ordering)a.get((Object)new GuiPlayerTabOverlay(Field1711, Class362.Field1711.ingameGUI));
        }
        catch (Exception a) {
            a.printStackTrace();
            return null;
        }
    }

    public static void Method523(float a, int a2) {
        try {
            Method a3 = Class362.Field1711.entityRenderer.getClass().getDeclaredMethod(Class683.setupCameraTransform.Method497(), new Class[]{Float.TYPE, Integer.TYPE});
            a3.setAccessible(true);
            a3.invoke((Object)Class362.Field1711.entityRenderer, new Object[]{Float.valueOf((float)a), a2});
        }
        catch (Exception a4) {
            a4.printStackTrace();
        }
    }

    public static void Method524(float a) {
        try {
            Method a2 = Class362.Field1711.entityRenderer.getClass().getDeclaredMethod(Class683.orientCamera.Method497(), new Class[]{Float.TYPE});
            a2.setAccessible(true);
            a2.invoke((Object)Class362.Field1711.entityRenderer, new Object[]{Float.valueOf((float)a)});
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    public static AxisAlignedBB Method525(double a, double a2, double a3, double a4, double a5, double a6) {
        Class a7 = null;
        try {
            a7 = Class.forName((String)"net.minecraft.util.AxisAlignedBB");
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        Constructor a8 = null;
        try {
            a8 = a7.getDeclaredConstructor(new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        a8.setAccessible(true);
        try {
            return (AxisAlignedBB)a8.newInstance(new Object[]{a, a2, a3, a4, a5, a6});
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException a9) {
            a9.printStackTrace();
            return null;
        }
    }

    public static Vec3 Method526(double a, double a2, double a3) {
        Class a4 = null;
        try {
            a4 = Class.forName((String)"net.minecraft.util.Vec3");
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        Constructor a5 = null;
        try {
            a5 = a4.getDeclaredConstructor(new Class[]{Double.TYPE, Double.TYPE, Double.TYPE});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        a5.setAccessible(true);
        try {
            return (Vec3)a5.newInstance(new Object[]{a, a2, a3});
        }
        catch (InstantiationException a6) {
            a6.printStackTrace();
        }
        catch (IllegalAccessException a7) {
            a7.printStackTrace();
        }
        catch (InvocationTargetException a8) {
            a8.printStackTrace();
        }
        return null;
    }

    public static void Method527(int a) {
        try {
            Field a2 = Field1711.getClass().getDeclaredField(ObfuscatedClasses.rightClickDelayTimer.getObfuscatedName());
            a2.setAccessible(true);
            a2.setInt((Object)Field1711, a);
        }
        catch (ReflectiveOperationException a3) {
            throw new RuntimeException((Throwable)a3);
        }
    }

    public static void Method528(int a) {
        try {
            Field a2 = Field1711.getClass().getDeclaredField(ObfuscatedClasses.leftClickCounter.getObfuscatedName());
            a2.setAccessible(true);
            a2.setInt((Object)Field1711, a);
        }
        catch (ReflectiveOperationException a3) {
            throw new RuntimeException((Throwable)a3);
        }
    }

    public static void Method529() {
        try {
            Method a = Field1711.getClass().getDeclaredMethod(Class683.clickMouse.Method497(), new Class[0]);
            a.setAccessible(true);
            a.invoke((Object)Field1711, new Object[0]);
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }

    public static void Method530(int a) {
        try {
            Field a2 = EntityLivingBase.class.getDeclaredField(ObfuscatedClasses.jumpTicks.getObfuscatedName());
            a2.setAccessible(true);
            a2.setInt((Object)Class362.Field1711.thePlayer, a);
        }
        catch (ReflectiveOperationException a3) {
            throw new RuntimeException((Throwable)a3);
        }
    }

    public static AxisAlignedBB Method531(double a, double a2, double a3, double a4, double a5, double a6) {
        Constructor a7;
        Class a8;
        block10: {
            a8 = null;
            try {
                a8 = Class.forName((String)"net.minecraft.util.AxisAlignedBB");
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            a7 = null;
            if (Field1712) break block10;
            throw new AssertionError();
        }
        try {
            a7 = a8.getDeclaredConstructor(new Class[]{Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        try {
            return (AxisAlignedBB)a7.newInstance(new Object[]{a, a2, a3, a4, a5, a6});
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

    public static Class[] Method532(Object a) {
        Class a2 = a.getClass();
        Class[] a3 = a2.getInterfaces();
        return a3;
    }

    public static boolean Method533() {
        try {
            return Class362.Method519(Minecraft.class, "theMinecraft", true) == null;
        }
        catch (Exception a) {
            return true;
        }
    }

    public static boolean Method534(EntityPlayer a) {
        try {
            Class a2 = Class.forName((String)"com.vicmatskiv.weaponlib.ClientEventHandler");
            Method a3 = a2.getDeclaredMethod("isProning", new Class[0]);
            return (Boolean)a3.invoke((Object)a2, new Object[]{a});
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static void Method535(int a) {
        Field a2 = null;
        try {
            a2 = PlayerControllerMP.class.getDeclaredField(ObfuscatedClasses.curBlockDamageMP.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a2.setAccessible(true);
        try {
            a2.setInt((Object)Class362.Field1711.playerController, a);
        }
        catch (IllegalAccessException a3) {
            a3.printStackTrace();
        }
    }

    public static boolean Method536() {
        Field a = null;
        try {
            a = Minecraft.getMinecraft().playerController.getClass().getDeclaredField(ObfuscatedClasses.isHittingBlock.getObfuscatedName());
            a.setAccessible(true);
            return a.getBoolean((Object)Minecraft.getMinecraft().playerController.getClass());
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static void Method537(int a) {
        Field a2 = null;
        try {
            a2 = PlayerControllerMP.class.getDeclaredField(ObfuscatedClasses.blockHitDelay.getObfuscatedName());
        }
        catch (NoSuchFieldException a3) {
            a3.printStackTrace();
        }
        a2.setAccessible(true);
        try {
            a2.setInt((Object)Class362.Field1711.playerController, a);
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
    }

    public static float Method538() {
        Field a = null;
        try {
            a = PlayerControllerMP.class.getDeclaredField(ObfuscatedClasses.curBlockDamageMP.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getFloat((Object)Class362.Field1711.playerController);
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0f;
        }
    }

    public static void Method539(Object a) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new Class706((GuiScreen)a));
    }

    public static void Method540(Object a) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)a);
    }

    public static void Method541(int a, boolean a2) {
        Field a3 = MouseEvent.class.getDeclaredField("button");
        Field a4 = MouseEvent.class.getDeclaredField("buttonstate");
        Field a5 = Mouse.class.getDeclaredField("buttons");
        Field a6 = Mouse.class.getDeclaredField("eventButton");
        Field a7 = Mouse.class.getDeclaredField("eventState");
        MouseEvent a8 = new MouseEvent();
        Class248 a9 = new Class248();
        a3.setAccessible(true);
        a3.set((Object)a8, (Object)a);
        a4.setAccessible(true);
        a4.set((Object)a8, (Object)a2);
        a6.setAccessible(true);
        a6.set(null, (Object)a);
        a7.setAccessible(true);
        a7.set(null, (Object)a2);
        MinecraftForge.EVENT_BUS.post((Event)new InputEvent.MouseInputEvent());
        MinecraftForge.EVENT_BUS.post((Event)a8);
        EventManager.Method2686(a9);
        a5.setAccessible(true);
        ByteBuffer a10 = (ByteBuffer)a5.get(null);
        a5.setAccessible(false);
        ByteBuffer byteBuffer = a10;
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
        Field1712 = !Class362.class.desiredAssertionStatus();
        Field1711 = Minecraft.getMinecraft();
        Field1709 = new HashMap();
        Field1710 = new HashMap();
    }

    private static Exception Method542(Exception exception) {
        return exception;
    }
}