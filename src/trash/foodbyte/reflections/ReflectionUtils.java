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
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import obfuscate.a;
import org.lwjgl.input.Mouse;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.ObfuscatedMethods;
import trash.foodbyte.reflections.Wrapper;

public class ReflectionUtils {
    public static Minecraft mc;
    private static a[] Field1205;

    public static void setUsername(String name) {
        try {
            Field a2 = Minecraft.class.getDeclaredField(ObfuscatedField.session.getObfuscatedName());
            a2.setAccessible(true);
            a2.set((Object)Minecraft.getMinecraft(), (Object)new Session(name, "", "", "mojang"));
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    public static void setSession(Session session) {
        try {
            Field a2 = Minecraft.class.getDeclaredField(ObfuscatedField.session.getObfuscatedName());
            a2.setAccessible(true);
            a2.set((Object)Minecraft.getMinecraft(), (Object)session);
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    public static float getRenderPartialTicks() {
        Field a2 = null;
        try {
            a2 = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
            a2.setAccessible(true);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        Field a3 = null;
        try {
            a3 = Timer.class.getDeclaredField(ObfuscatedField.renderPartialTicks.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        float a4 = 1.0f;
        try {
            a3.setAccessible(true);
            a4 = a3.getFloat(a2.get((Object)mc));
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        return a4;
    }

    public static float getTicksPerSecond() {
        Field a2 = null;
        try {
            a2 = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
            a2.setAccessible(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        Field a3 = null;
        try {
            a3 = Timer.class.getDeclaredField(ObfuscatedField.ticksPerSecond.getObfuscatedName());
            a3.setAccessible(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            return a3.getFloat(a2.get((Object)mc));
        }
        catch (Exception exception) {
            return 1.0f;
        }
    }

    public static float getTimerSpeed() {
        Field a2 = null;
        try {
            a2 = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
            a2.setAccessible(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        Field a3 = null;
        try {
            a3 = Timer.class.getDeclaredField(ObfuscatedField.timerSpeed.getObfuscatedName());
            a3.setAccessible(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            return a3.getFloat(a2.get((Object)mc));
        }
        catch (Exception exception) {
            return 1.0f;
        }
    }

    public static void setTimerSpeed(float speed) {
        Field a2 = null;
        try {
            a2 = mc.getClass().getDeclaredField(ObfuscatedField.timer.getObfuscatedName());
            a2.setAccessible(true);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        Field a3 = null;
        try {
            a3 = Timer.class.getDeclaredField(ObfuscatedField.timerSpeed.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        try {
            a3.setAccessible(true);
            a3.set(a2.get((Object)mc), (Object)Float.valueOf((float)speed));
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
    }

    public static double getRenderPosX() {
        Field a2 = null;
        try {
            a2 = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosX.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a2.setAccessible(true);
        try {
            return a2.getDouble((Object)mc.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static double getRenderPosY() {
        Field a2 = null;
        try {
            a2 = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosY.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a2.setAccessible(true);
        try {
            return a2.getDouble((Object)mc.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static double getRenderPosZ() {
        Field a2 = null;
        try {
            a2 = RenderManager.class.getDeclaredField(ObfuscatedField.renderPosZ.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a2.setAccessible(true);
        try {
            return a2.getDouble((Object)mc.getRenderManager());
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0;
        }
    }

    public static int getRightClickDelayTimer() {
        Field a2 = null;
        try {
            a2 = mc.getClass().getDeclaredField(ObfuscatedField.rightClickDelayTimer.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a2.setAccessible(true);
        try {
            return a2.getInt((Object)mc);
        }
        catch (IllegalAccessException illegalAccessException) {
            return 4;
        }
    }

    public static void setRightClickDelayTimer(int timer) {
        try {
            Field a2 = mc.getClass().getDeclaredField(ObfuscatedField.rightClickDelayTimer.getObfuscatedName());
            a2.setAccessible(true);
            a2.setInt((Object)mc, timer);
        }
        catch (ReflectiveOperationException a3) {
            throw new RuntimeException((Throwable)a3);
        }
    }

    public static void setLeftClickCounter(int counter) {
        try {
            Field a2 = mc.getClass().getDeclaredField(ObfuscatedField.leftClickCounter.getObfuscatedName());
            a2.setAccessible(true);
            a2.setInt((Object)mc, counter);
        }
        catch (ReflectiveOperationException a3) {
            throw new RuntimeException((Throwable)a3);
        }
    }

    public static boolean isHittingBlock() {
        Field a2 = null;
        try {
            a2 = ReflectionUtils.mc.playerController.getClass().getDeclaredField(ObfuscatedField.isHittingBlock.getObfuscatedName());
            a2.setAccessible(true);
            return a2.getBoolean((Object)ReflectionUtils.mc.playerController.getClass());
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static void setBlockHitDelay(int hitDelay) {
        Field a2 = null;
        try {
            a2 = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.blockHitDelay.getObfuscatedName());
        }
        catch (NoSuchFieldException a3) {
            a3.printStackTrace();
        }
        a2.setAccessible(true);
        try {
            a2.setInt((Object)ReflectionUtils.mc.playerController, hitDelay);
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
    }

    public static void clickMouse() {
        try {
            Method a2 = mc.getClass().getDeclaredMethod(ObfuscatedMethods.clickMouse.getObfuscatedName(), new Class[0]);
            a2.setAccessible(true);
            a2.invoke((Object)mc, new Object[0]);
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    public static void setJumpTicks(int jumpTicks) {
        try {
            Field a2 = EntityLivingBase.class.getDeclaredField(ObfuscatedField.jumpTicks.getObfuscatedName());
            a2.setAccessible(true);
            a2.setInt((Object)ReflectionUtils.mc.thePlayer, jumpTicks);
        }
        catch (ReflectiveOperationException a3) {
            throw new RuntimeException((Throwable)a3);
        }
    }

    public static float getCurBlockDamageMP() {
        Field a2 = null;
        try {
            a2 = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.curBlockDamageMP.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a2.setAccessible(true);
        try {
            return a2.getFloat((Object)ReflectionUtils.mc.playerController);
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0f;
        }
    }

    public static void setCurBlockDamageMP(float curBlockDamage) {
        block2: {
            a[] a2 = ReflectionUtils.trash();
            try {
                Field a3 = PlayerControllerMP.class.getDeclaredField(ObfuscatedField.curBlockDamageMP.getObfuscatedName());
                a3.setAccessible(true);
                a3.setFloat((Object)ReflectionUtils.mc.playerController, curBlockDamage);
            }
            catch (ReflectiveOperationException a4) {
                throw new RuntimeException((Throwable)a4);
            }
            if (a.trash() != null) break block2;
            ReflectionUtils.trash(new a[5]);
        }
    }

    public static float getItemInUseCount() {
        Field a2 = null;
        try {
            a2 = EntityPlayer.class.getDeclaredField(ObfuscatedField.itemInUseCount.getObfuscatedName());
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        a2.setAccessible(true);
        try {
            return a2.getInt((Object)ReflectionUtils.mc.thePlayer);
        }
        catch (IllegalAccessException illegalAccessException) {
            return 0.0f;
        }
    }

    public static void setItemInUseCount(int count) {
        a[] a2 = ReflectionUtils.trash();
        try {
            Field a3 = EntityPlayer.class.getDeclaredField(ObfuscatedField.itemInUseCount.getObfuscatedName());
            a3.setAccessible(true);
            a3.setInt((Object)ReflectionUtils.mc.thePlayer, count);
        }
        catch (ReflectiveOperationException a4) {
            throw new RuntimeException((Throwable)a4);
        }
        a.trash(new String[5]);
    }

    public static boolean isPressed(KeyBinding keyBinding) {
        try {
            return (Boolean)ReflectionHelper.findField(KeyBinding.class, (String[])new String[]{ObfuscatedField.pressed.getObfuscatedName()}).get((Object)keyBinding);
        }
        catch (Exception a2) {
            return false;
        }
    }

    public static void setPressed(KeyBinding keyBinding, boolean pressed) {
        try {
            ReflectionHelper.findField(KeyBinding.class, (String[])new String[]{ObfuscatedField.pressed.getObfuscatedName()}).set((Object)keyBinding, (Object)pressed);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static List getListShaders(ShaderGroup group) {
        try {
            return (List)ReflectionHelper.findField(ShaderGroup.class, (String[])new String[]{ObfuscatedField.listShaders.getObfuscatedName()}).get((Object)group);
        }
        catch (Exception a2) {
            a2.printStackTrace();
            return null;
        }
    }

    public static void setupCameraTransform(float a2, int b) {
        try {
            Method a3 = ReflectionUtils.mc.entityRenderer.getClass().getDeclaredMethod(ObfuscatedMethods.setupCameraTransform.getObfuscatedName(), new Class[]{Float.TYPE, Integer.TYPE});
            a3.setAccessible(true);
            a3.invoke((Object)ReflectionUtils.mc.entityRenderer, new Object[]{Float.valueOf((float)a2), b});
        }
        catch (Exception a4) {
            a4.printStackTrace();
        }
    }

    public static void setOrientCamera(float orientCamera) {
        try {
            Method a2 = ReflectionUtils.mc.entityRenderer.getClass().getDeclaredMethod(ObfuscatedMethods.orientCamera.getObfuscatedName(), new Class[]{Float.TYPE});
            a2.setAccessible(true);
            a2.invoke((Object)ReflectionUtils.mc.entityRenderer, new Object[]{Float.valueOf((float)orientCamera)});
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
    }

    public static void postForgeMouseInputEvent(int a2, boolean a3) {
        Field a4 = MouseEvent.class.getDeclaredField("button");
        Field a5 = MouseEvent.class.getDeclaredField("buttonstate");
        Field a6 = Mouse.class.getDeclaredField("buttons");
        Field a7 = Mouse.class.getDeclaredField("eventButton");
        Field a8 = Mouse.class.getDeclaredField("eventState");
        MouseEvent a9 = new MouseEvent();
        trash.foodbyte.event.MouseEvent a10 = new trash.foodbyte.event.MouseEvent();
        a4.setAccessible(true);
        a4.set((Object)a9, (Object)a2);
        a5.setAccessible(true);
        a5.set((Object)a9, (Object)a3);
        a7.setAccessible(true);
        a7.set(null, (Object)a2);
        a8.setAccessible(true);
        a8.set(null, (Object)a3);
        MinecraftForge.EVENT_BUS.post((Event)new InputEvent.MouseInputEvent());
        MinecraftForge.EVENT_BUS.post((Event)a9);
        EventManager.call(a10);
        a6.setAccessible(true);
        ByteBuffer a11 = (ByteBuffer)a6.get(null);
        a6.setAccessible(false);
        ByteBuffer byteBuffer = a11;
        int n = a2;
        boolean bl = true;
        try {
            byteBuffer.put(n, (byte)(bl ? 1 : 0));
        }
        catch (Exception a22) {
            a22.printStackTrace();
        }
    }

    static {
        ReflectionUtils.trash(null);
        mc = Wrapper.INSTANCE.getMinecraft();
    }

    public static void trash(a[] aArray) {
        Field1205 = aArray;
    }

    public static a[] trash() {
        return Field1205;
    }

    private static Exception Method2613(Exception exception) {
        return exception;
    }
}