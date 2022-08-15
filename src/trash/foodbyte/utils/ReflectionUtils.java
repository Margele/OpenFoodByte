/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.ReflectiveOperationException
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 *  java.nio.ByteBuffer
 *  java.util.List
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.client.shader.ShaderGroup
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.Session
 *  net.minecraft.util.Timer
 *  net.minecraftforge.client.event.MouseEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.Event
 *  net.minecraftforge.fml.common.gameevent.InputEvent$MouseInputEvent
 *  net.minecraftforge.fml.relauncher.ReflectionHelper
 *  org.lwjgl.input.Mouse
 */
package trash.foodbyte.utils;

import awsl.Class248;
import awsl.Class683;
import awsl.Class91;
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
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Mouse;
import trash.foodbyte.utils.ObfuscatedClasses;
import trash.foodbyte.utils.Wrapper;

public class ReflectionUtils {
    public static Minecraft Field1204;
    private static Class91[] Field1205;

    public static void Method2585(String a) {
        try {
            Field a2 = Minecraft.class.getDeclaredField(ObfuscatedClasses.session.getObfuscatedName());
            a2.setAccessible(true);
            a2.set((Object)Minecraft.getMinecraft(), (Object)new Session(a, "", "", "mojang"));
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    public static void Method2586(Session a) {
        try {
            Field a2 = Minecraft.class.getDeclaredField(ObfuscatedClasses.session.getObfuscatedName());
            a2.setAccessible(true);
            a2.set((Object)Minecraft.getMinecraft(), (Object)a);
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    public static float Method2587() {
        Field a = null;
        try {
            a = Field1204.getClass().getDeclaredField(ObfuscatedClasses.timer.getObfuscatedName());
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
        float a3 = 1.0f;
        try {
            a2.setAccessible(true);
            a3 = a2.getFloat(a.get((Object)Field1204));
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        return a3;
    }

    public static float Method2588() {
        Field a = null;
        try {
            a = Field1204.getClass().getDeclaredField(ObfuscatedClasses.timer.getObfuscatedName());
            a.setAccessible(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        Field a2 = null;
        try {
            a2 = Timer.class.getDeclaredField(ObfuscatedClasses.ticksPerSecond.getObfuscatedName());
            a2.setAccessible(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            return a2.getFloat(a.get((Object)Field1204));
        }
        catch (Exception exception) {
            return 1.0f;
        }
    }

    public static float Method2589() {
        Field a = null;
        try {
            a = Field1204.getClass().getDeclaredField(ObfuscatedClasses.timer.getObfuscatedName());
            a.setAccessible(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        Field a2 = null;
        try {
            a2 = Timer.class.getDeclaredField(ObfuscatedClasses.timerSpeed.getObfuscatedName());
            a2.setAccessible(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            return a2.getFloat(a.get((Object)Field1204));
        }
        catch (Exception exception) {
            return 1.0f;
        }
    }

    public static void setTimerSpeed(float a) {
        Field a2 = null;
        try {
            a2 = Field1204.getClass().getDeclaredField(ObfuscatedClasses.timer.getObfuscatedName());
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
            a3.set(a2.get((Object)Field1204), (Object)Float.valueOf((float)a));
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
    }

    public static double Method2591() {
        Field a = null;
        try {
            a = RenderManager.class.getDeclaredField(ObfuscatedClasses.renderPosX.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getDouble((Object)Field1204.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static double Method2592() {
        Field a = null;
        try {
            a = RenderManager.class.getDeclaredField(ObfuscatedClasses.renderPosY.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getDouble((Object)Field1204.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static double Method2593() {
        Field a = null;
        try {
            a = RenderManager.class.getDeclaredField(ObfuscatedClasses.renderPosZ.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getDouble((Object)Field1204.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static int Method2594() {
        Field a = null;
        try {
            a = Field1204.getClass().getDeclaredField(ObfuscatedClasses.rightClickDelayTimer.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getInt((Object)Field1204);
        }
        catch (IllegalAccessException illegalAccessException) {
            return 4;
        }
    }

    public static void Method2595(int a) {
        try {
            Field a2 = Field1204.getClass().getDeclaredField(ObfuscatedClasses.rightClickDelayTimer.getObfuscatedName());
            a2.setAccessible(true);
            a2.setInt((Object)Field1204, a);
        }
        catch (ReflectiveOperationException a3) {
            throw new RuntimeException((Throwable)a3);
        }
    }

    public static void Method2596(int a) {
        try {
            Field a2 = Field1204.getClass().getDeclaredField(ObfuscatedClasses.leftClickCounter.getObfuscatedName());
            a2.setAccessible(true);
            a2.setInt((Object)Field1204, a);
        }
        catch (ReflectiveOperationException a3) {
            throw new RuntimeException((Throwable)a3);
        }
    }

    public static boolean Method2597() {
        Field a = null;
        try {
            a = ReflectionUtils.Field1204.playerController.getClass().getDeclaredField(ObfuscatedClasses.isHittingBlock.getObfuscatedName());
            a.setAccessible(true);
            return a.getBoolean((Object)ReflectionUtils.Field1204.playerController.getClass());
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static void Method2598(int a) {
        Field a2 = null;
        try {
            a2 = PlayerControllerMP.class.getDeclaredField(ObfuscatedClasses.blockHitDelay.getObfuscatedName());
        }
        catch (NoSuchFieldException a3) {
            a3.printStackTrace();
        }
        a2.setAccessible(true);
        try {
            a2.setInt((Object)ReflectionUtils.Field1204.playerController, a);
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
    }

    public static void Method2599() {
        try {
            Method a = Field1204.getClass().getDeclaredMethod(Class683.clickMouse.Method497(), new Class[0]);
            a.setAccessible(true);
            a.invoke((Object)Field1204, new Object[0]);
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }

    public static void Method2600(int a) {
        try {
            Field a2 = EntityLivingBase.class.getDeclaredField(ObfuscatedClasses.jumpTicks.getObfuscatedName());
            a2.setAccessible(true);
            a2.setInt((Object)ReflectionUtils.Field1204.thePlayer, a);
        }
        catch (ReflectiveOperationException a3) {
            throw new RuntimeException((Throwable)a3);
        }
    }

    public static float Method2601() {
        Field a = null;
        try {
            a = PlayerControllerMP.class.getDeclaredField(ObfuscatedClasses.curBlockDamageMP.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getFloat((Object)ReflectionUtils.Field1204.playerController);
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0f;
        }
    }

    public static void Method2602(float a) {
        block2: {
            Class91[] a2 = ReflectionUtils.Method2612();
            try {
                Field a3 = PlayerControllerMP.class.getDeclaredField(ObfuscatedClasses.curBlockDamageMP.getObfuscatedName());
                a3.setAccessible(true);
                a3.setFloat((Object)ReflectionUtils.Field1204.playerController, a);
            }
            catch (ReflectiveOperationException a4) {
                throw new RuntimeException((Throwable)a4);
            }
            if (Class91.Method3648() != null) break block2;
            ReflectionUtils.Method2611(new Class91[5]);
        }
    }

    public static float Method2603() {
        Field a = null;
        try {
            a = EntityPlayer.class.getDeclaredField(ObfuscatedClasses.itemInUseCount.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a.setAccessible(true);
        try {
            return a.getInt((Object)ReflectionUtils.Field1204.thePlayer);
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0f;
        }
    }

    public static void Method2604(int a) {
        Class91[] a2 = ReflectionUtils.Method2612();
        try {
            Field a3 = EntityPlayer.class.getDeclaredField(ObfuscatedClasses.itemInUseCount.getObfuscatedName());
            a3.setAccessible(true);
            a3.setInt((Object)ReflectionUtils.Field1204.thePlayer, a);
        }
        catch (ReflectiveOperationException a4) {
            throw new RuntimeException((Throwable)a4);
        }
        Class91.Method3647(new String[5]);
    }

    public static boolean Method2605(KeyBinding a) {
        try {
            return (Boolean)ReflectionHelper.findField(KeyBinding.class, (String[])new String[]{ObfuscatedClasses.pressed.getObfuscatedName()}).get((Object)a);
        }
        catch (Exception a2) {
            return false;
        }
    }

    public static void Method2606(KeyBinding a, boolean a2) {
        try {
            ReflectionHelper.findField(KeyBinding.class, (String[])new String[]{ObfuscatedClasses.pressed.getObfuscatedName()}).set((Object)a, (Object)a2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static List Method2607(ShaderGroup a) {
        try {
            return (List)ReflectionHelper.findField(ShaderGroup.class, (String[])new String[]{ObfuscatedClasses.listShaders.getObfuscatedName()}).get((Object)a);
        }
        catch (Exception a2) {
            a2.printStackTrace();
            return null;
        }
    }

    public static void Method2608(float a, int a2) {
        try {
            Method a3 = ReflectionUtils.Field1204.entityRenderer.getClass().getDeclaredMethod(Class683.setupCameraTransform.Method497(), new Class[]{Float.TYPE, Integer.TYPE});
            a3.setAccessible(true);
            a3.invoke((Object)ReflectionUtils.Field1204.entityRenderer, new Object[]{Float.valueOf((float)a), a2});
        }
        catch (Exception a4) {
            a4.printStackTrace();
        }
    }

    public static void Method2609(float a) {
        try {
            Method a2 = ReflectionUtils.Field1204.entityRenderer.getClass().getDeclaredMethod(Class683.orientCamera.Method497(), new Class[]{Float.TYPE});
            a2.setAccessible(true);
            a2.invoke((Object)ReflectionUtils.Field1204.entityRenderer, new Object[]{Float.valueOf((float)a)});
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    public static void Method2610(int a, boolean a2) {
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
        ReflectionUtils.Method2611(null);
        Field1204 = Wrapper.INSTANCE.Method2868();
    }

    public static void Method2611(Class91[] class91Array) {
        Field1205 = class91Array;
    }

    public static Class91[] Method2612() {
        return Field1205;
    }

    private static Exception Method2613(Exception exception) {
        return exception;
    }
}