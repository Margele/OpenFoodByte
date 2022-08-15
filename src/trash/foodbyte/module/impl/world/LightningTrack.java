/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  javax.vecmath.Vector3d
 *  javax.vecmath.Vector4d
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.event.ClickEvent
 *  net.minecraft.event.ClickEvent$Action
 *  net.minecraft.network.play.server.S07PacketRespawn
 *  net.minecraft.network.play.server.S29PacketSoundEffect
 *  net.minecraft.network.play.server.S2CPacketSpawnGlobalEntity
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.Vec3
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.world;

import awsl.Class260;
import awsl.Class448;
import awsl.Class565;
import awsl.Class628;
import awsl.Class91;
import eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector4d;
import native0.Class614;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.event.ClickEvent;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S29PacketSoundEffect;
import net.minecraft.network.play.server.S2CPacketSpawnGlobalEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class LightningTrack
extends Module {
    private static final String[] Field2292;
    public ModeValue Field2293 = new ModeValue(LightningTrack.Method754(-22728, 11272), LightningTrack.Method754(-22731, 11313), LightningTrack.Method754(-22733, 9221), new String[]{LightningTrack.Method754(-22783, -13597), LightningTrack.Method754(-22747, 1290)}, LightningTrack.Method754(-22748, -5228));
    public FloatValue Field2294;
    private static final String[] Field2295;
    public BooleanValue Field2296 = new BooleanValue(LightningTrack.Method754(-22728, 11272), LightningTrack.Method754(-22771, -32735), (Boolean)true, LightningTrack.Method754(-22721, 22726));
    public BooleanValue Field2297 = new BooleanValue(LightningTrack.Method754(-22728, 11272), LightningTrack.Method754(-22746, -28306), (Boolean)true, LightningTrack.Method754(-22737, 10951));
    public int Field2298;
    private ArrayList Field2299;

    @Override
    public void Method279() {
        this.Field2299.clear();
        this.Field2298 = 0;
    }

    @Class628
    public static native void Method2253(String var0, String var1, String var2, ClickEvent var3);

    static {
        Class614.Method2232(10, LightningTrack.class);
        LightningTrack.Method1658();
    }

    protected void Method2248(Class260 a, double a2, double a3, double a4, double a5, Entity a6) {
        float a7;
        float a8;
        float a9 = (float)(a.Method2837() - (double)((float)a3) + 0.5);
        double a10 = Math.sqrt((double)(a9 * a9 + (a8 = (float)(a.Method2838() - (double)((float)a4) + 1.0)) * a8 + (a7 = (float)(a.Method2839() - (double)((float)a5) + 0.5)) * a7));
        if (a10 <= 20.0) {
            this.Field2299.remove((Object)a);
        }
        FontRenderer a11 = LightningTrack.mc.fontRendererObj;
    }

    public LightningTrack() {
        super(LightningTrack.Method754(-22751, 27787), LightningTrack.Method754(-22738, 7342), Category.WORLD);
        this.Field2294 = new FloatValue(LightningTrack.Method754(-22728, 11272), LightningTrack.Method754(-22781, 2410), 3.0, 1.0, 10.0, 1.0, LightningTrack.Method754(-22734, 4946));
        this.Field2299 = new ArrayList();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Method1734(Vec3 a) {
        if (!(a.xCoord > -1.0)) return false;
        if (!(a.zCoord < 1.0)) return false;
        double d = a.xCoord;
        int n = LightningTrack.mc.gameSettings.guiScale == 0 ? 1 : LightningTrack.mc.gameSettings.guiScale;
        if (!(d / (double)n >= 0.0)) return false;
        double d2 = a.xCoord;
        int n2 = LightningTrack.mc.gameSettings.guiScale == 0 ? 1 : LightningTrack.mc.gameSettings.guiScale;
        if (!(d2 / (double)n2 <= (double)Display.getWidth())) return false;
        double d3 = a.yCoord;
        int n3 = LightningTrack.mc.gameSettings.guiScale == 0 ? 1 : LightningTrack.mc.gameSettings.guiScale;
        if (!(d3 / (double)n3 >= 0.0)) return false;
        double d4 = a.yCoord;
        int n4 = LightningTrack.mc.gameSettings.guiScale == 0 ? 1 : LightningTrack.mc.gameSettings.guiScale;
        if (!(d4 / (double)n4 <= (double)Display.getHeight())) return false;
        return true;
    }

    @EventTarget
    public void Method802(EventRender3D a) {
        if (this.Field2299 != null && this.Field2296.getValue()) {
            this.Field2299.forEach(arg_0 -> this.Method2250(a, arg_0));
        }
    }

    public static String Method2254(String a, String a2, String a3) {
        int a4;
        String a5 = "";
        a4 = a2.isEmpty() ? 0 : ((a4 = a.indexOf(a2)) > -1 ? (a4 += a2.length()) : 0);
        int a6 = a.indexOf(a3, a4);
        if (a3.isEmpty()) {
            a6 = a.length();
        }
        a5 = a.substring(a4, a6);
        return a5;
    }

    @EventTarget
    public void Method273(EventPacket a) {
        float a2;
        float a3;
        float a4;
        float a5;
        float a6;
        float a7;
        float a8;
        S2CPacketSpawnGlobalEntity a9;
        Class91[] a10 = Class448.Method2461();
        if (a.isSend()) {
            return;
        }
        if (this.Field2293.isCurrentMode(LightningTrack.Method754(-22783, -13597)) && a.packet instanceof S2CPacketSpawnGlobalEntity && (a9 = (S2CPacketSpawnGlobalEntity)a.packet).func_149053_g() == 1) {
            a8 = (float)((double)a9.func_149051_d() / 32.0);
            a7 = (float)((double)a9.func_149050_e() / 32.0);
            a6 = (float)((double)a9.func_149049_f() / 32.0);
            a5 = (float)(LightningTrack.mc.thePlayer.posX - (double)a8);
            a4 = (float)(LightningTrack.mc.thePlayer.posY - (double)a7);
            a3 = (float)(LightningTrack.mc.thePlayer.posZ - (double)a6);
            a2 = MathHelper.sqrt_float((float)(a5 * a5 + a4 * a4 + a3 * a3));
            ++this.Field2298;
            if (GlobalModule.INSTANCE.Field3186 != null && PermissionManager.canUseModule(LightningTrack.Method754(-22745, 6737))) {
                LightningTrack.Method2253(LightningTrack.Method754(-22776, 5493) + this.Field2298 + LightningTrack.Method754(-22727, 29040) + (int)a2 + LightningTrack.Method754(-22773, 13712) + (int)a8 + LightningTrack.Method754(-22782, -17792) + (int)a7 + LightningTrack.Method754(-22774, -11077) + (int)a6, LightningTrack.Method754(-22778, -19916), LightningTrack.Method754(-22752, -27254), new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, LightningTrack.Method754(-22750, 13738) + a8 + " " + GlobalModule.Field3162.Method2744() + " " + a6));
            }
            ChatUtils.addChatMessage(LightningTrack.Method754(-22784, 16527) + this.Field2298 + LightningTrack.Method754(-22729, -16477) + (int)a2 + LightningTrack.Method754(-22732, -12008) + (int)a8 + LightningTrack.Method754(-22749, 1978) + (int)a7 + LightningTrack.Method754(-22770, -1221) + (int)a6);
            this.Field2299.Method2530((Object)new Class260(LightningTrack.Method754(-22784, 16527) + this.Field2298 + LightningTrack.Method754(-22769, -7971), a8, a7, a6, LightningTrack.Method754(-22777, 8564), 0));
            if (this.Field2299.Method1799() > this.Field2294.Method2744().intValue()) {
                this.Field2299.remove(0);
            }
        }
        if (this.Field2293.isCurrentMode(LightningTrack.Method754(-22725, -23162)) && a.getPacket() instanceof S29PacketSoundEffect && (a9 = (S29PacketSoundEffect)a.getPacket()).getSoundName().equals((Object)LightningTrack.Method754(-22726, -11947))) {
            a8 = (float)a9.getX();
            a7 = (float)a9.getY();
            a6 = (float)a9.getZ();
            a5 = (float)(LightningTrack.mc.thePlayer.posX - (double)a8);
            a4 = (float)(LightningTrack.mc.thePlayer.posY - (double)a7);
            a3 = (float)(LightningTrack.mc.thePlayer.posZ - (double)a6);
            a2 = MathHelper.sqrt_float((float)(a5 * a5 + a4 * a4 + a3 * a3));
            ++this.Field2298;
            if (GlobalModule.INSTANCE.Field3186 != null && PermissionManager.canUseModule(LightningTrack.Method754(-22740, 31221))) {
                LightningTrack.Method2253(LightningTrack.Method754(-22784, 16527) + this.Field2298 + LightningTrack.Method754(-22729, -16477) + (int)a2 + LightningTrack.Method754(-22732, -12008) + (int)a8 + LightningTrack.Method754(-22749, 1978) + (int)a7 + LightningTrack.Method754(-22770, -1221) + (int)a6, LightningTrack.Method754(-22735, -29438), LightningTrack.Method754(-22772, -20661), new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, LightningTrack.Method754(-22739, 20426) + a8 + " " + GlobalModule.Field3162.Method2744() + " " + a6));
            }
            ChatUtils.addChatMessage(LightningTrack.Method754(-22784, 16527) + this.Field2298 + LightningTrack.Method754(-22729, -16477) + (int)a2 + LightningTrack.Method754(-22732, -12008) + (int)a8 + LightningTrack.Method754(-22749, 1978) + (int)a7 + LightningTrack.Method754(-22770, -1221) + (int)a6);
            this.Field2299.Method2530((Object)new Class260(LightningTrack.Method754(-22784, 16527) + this.Field2298 + LightningTrack.Method754(-22724, -32110), a8, a7, a6, LightningTrack.Method754(-22736, 24329), 0));
            if (this.Field2299.Method1799() > this.Field2294.Method2744().intValue()) {
                this.Field2299.remove(0);
            }
        }
        if (a.getPacket() instanceof S07PacketRespawn) {
            this.Field2299.clear();
            this.Field2298 = 0;
        }
    }

    @Override
    public void onEnable() {
        this.Field2299.clear();
        this.Field2298 = 0;
    }

    private void Method2250(EventRender3D a, Class260 a2) {
        Entity a3 = Minecraft.getMinecraft().getRenderViewEntity();
        float a4 = a.Method3523();
        double a5 = a3.lastTickPosX + (a3.posX - a3.lastTickPosX) * (double)a4;
        double a6 = a3.lastTickPosY + (a3.posY - a3.lastTickPosY) * (double)a4;
        double a7 = a3.lastTickPosZ + (a3.posZ - a3.lastTickPosZ) * (double)a4;
        this.Method2248(a2, 12.0, a5, a6, a7, a3);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.enableDepth();
        GlStateManager.depthMask((boolean)true);
    }

    private void Method2249(EventRender2D a, Class260 a2) {
        Class91[] a3 = Class448.Method2461();
        if (!this.Method1734(new Vec3(a2.Method2837(), a2.Method2838(), a2.Method2839()))) {
            double a4 = a2.Method2837();
            double a5 = a2.Method2838();
            double a6 = a2.Method2839();
            AxisAlignedBB a7 = new AxisAlignedBB(0.0625, 0.0, 0.0625, 0.94, 0.875, 0.94).offset(a4 - ReflectionUtils.Method2591(), a5 - ReflectionUtils.Method2592(), a6 - ReflectionUtils.Method2593());
            List a8 = Arrays.asList((Object[])new Vector3d[]{new Vector3d(a4 + a7.minX - a7.maxX + 0.5, a5, a6 + a7.minZ - a7.maxZ + 0.5), new Vector3d(a4 + a7.maxX - a7.minX - 0.5, a5, a6 + a7.minZ - a7.maxZ + 0.5), new Vector3d(a4 + a7.minX - a7.maxX + 0.5, a5, a6 + a7.maxZ - a7.minZ - 0.5), new Vector3d(a4 + a7.maxX - a7.minX - 0.5, a5, a6 + a7.maxZ - a7.minZ - 0.5), new Vector3d(a4 + a7.minX - a7.maxX + 0.5, a5 + a7.maxY - a7.minY, a6 + a7.minZ - a7.maxZ + 0.5), new Vector3d(a4 + a7.maxX - a7.minX - 0.5, a5 + a7.maxY - a7.minY, a6 + a7.minZ - a7.maxZ + 0.5), new Vector3d(a4 + a7.minX - a7.maxX + 0.5, a5 + a7.maxY - a7.minY, a6 + a7.maxZ - a7.minZ - 0.5), new Vector3d(a4 + a7.maxX - a7.minX - 0.5, a5 + a7.maxY - a7.minY, a6 + a7.maxZ - a7.minZ - 0.5)});
            ReflectionUtils.Method2608(a.Field2923, 0);
            Vector4d a9 = null;
            Iterator iterator = a8.Method1383();
            if (iterator.Method932()) {
                Vector3d a10 = (Vector3d)iterator.Method933();
                a10 = RenderUtils.Method1136(a10.x - LightningTrack.mc.getRenderManager().viewerPosX, a10.y - LightningTrack.mc.getRenderManager().viewerPosY, a10.z - LightningTrack.mc.getRenderManager().viewerPosZ);
                if (a10.z >= 0.0 && a10.z < 1.0) {
                    a9 = new Vector4d(a10.x, a10.y, a10.z, 0.0);
                    a9.x = Math.min((double)a10.x, (double)a9.x);
                    a9.y = Math.min((double)a10.y, (double)a9.y);
                    a9.z = Math.max((double)a10.x, (double)a9.z);
                    a9.w = Math.max((double)a10.y, (double)a9.w);
                }
            }
            LightningTrack.mc.entityRenderer.setupOverlayRendering();
            GL11.glPushMatrix();
            float a11 = (float)a9.x;
            float a12 = (float)a9.z;
            float a13 = (float)a9.y;
            String a14 = "[" + Math.round((double)LightningTrack.mc.thePlayer.getDistance(a2.Method2837(), a2.Method2838(), a2.Method2839())) + LightningTrack.Method754(-22723, 27692) + a2.Method2835() + LightningTrack.Method754(-22722, -24056) + (int)a2.Method2837() + "," + (int)a2.Method2838() + "," + (int)a2.Method2839() + "]";
            RenderUtils.Method1103(a11 + (a12 - a11) / 2.0f - Class565.Field2637.Method1225(a14) / 2.0f - 1.0f, a13 - (float)LightningTrack.mc.fontRendererObj.FONT_HEIGHT + 8.0f, Class565.Field2637.Method1225(a14) + 2.0f, LightningTrack.mc.fontRendererObj.FONT_HEIGHT, new Color(0, 0, 0, 120).getRGB());
            Class565.Field2637.Method1217(a14, a11 + (a12 - a11) / 2.0f - Class565.Field2637.Method1225(a14) / 2.0f, a13 - (float)(LightningTrack.mc.fontRendererObj.FONT_HEIGHT / 2), -1);
            GL11.glPopMatrix();
        }
    }

    private static String Method754(int n, int n2) {
        int n3 = (n ^ 0xFFFFA726) & 0xFFFF;
        if (Field2292[n3] == null) {
            int n4;
            char[] cArray = Field2295[n3].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n4 = 197;
                    break;
                }
                case 1: {
                    n4 = 111;
                    break;
                }
                case 2: {
                    n4 = 80;
                    break;
                }
                case 3: {
                    n4 = 85;
                    break;
                }
                case 4: {
                    n4 = 93;
                    break;
                }
                case 5: {
                    n4 = 156;
                    break;
                }
                case 6: {
                    n4 = 239;
                    break;
                }
                case 7: {
                    n4 = 49;
                    break;
                }
                case 8: {
                    n4 = 212;
                    break;
                }
                case 9: {
                    n4 = 126;
                    break;
                }
                case 10: {
                    n4 = 88;
                    break;
                }
                case 11: {
                    n4 = 133;
                    break;
                }
                case 12: {
                    n4 = 167;
                    break;
                }
                case 13: {
                    n4 = 38;
                    break;
                }
                case 14: {
                    n4 = 246;
                    break;
                }
                case 15: {
                    n4 = 158;
                    break;
                }
                case 16: {
                    n4 = 134;
                    break;
                }
                case 17: {
                    n4 = 79;
                    break;
                }
                case 18: {
                    n4 = 120;
                    break;
                }
                case 19: {
                    n4 = 217;
                    break;
                }
                case 20: {
                    n4 = 98;
                    break;
                }
                case 21: {
                    n4 = 46;
                    break;
                }
                case 22: {
                    n4 = 178;
                    break;
                }
                case 23: {
                    n4 = 102;
                    break;
                }
                case 24: {
                    n4 = 68;
                    break;
                }
                case 25: {
                    n4 = 89;
                    break;
                }
                case 26: {
                    n4 = 210;
                    break;
                }
                case 27: {
                    n4 = 169;
                    break;
                }
                case 28: {
                    n4 = 187;
                    break;
                }
                case 29: {
                    n4 = 125;
                    break;
                }
                case 30: {
                    n4 = 103;
                    break;
                }
                case 31: {
                    n4 = 81;
                    break;
                }
                case 32: {
                    n4 = 252;
                    break;
                }
                case 33: {
                    n4 = 207;
                    break;
                }
                case 34: {
                    n4 = 235;
                    break;
                }
                case 35: {
                    n4 = 96;
                    break;
                }
                case 36: {
                    n4 = 2;
                    break;
                }
                case 37: {
                    n4 = 52;
                    break;
                }
                case 38: {
                    n4 = 180;
                    break;
                }
                case 39: {
                    n4 = 183;
                    break;
                }
                case 40: {
                    n4 = 191;
                    break;
                }
                case 41: {
                    n4 = 45;
                    break;
                }
                case 42: {
                    n4 = 157;
                    break;
                }
                case 43: {
                    n4 = 28;
                    break;
                }
                case 44: {
                    n4 = 166;
                    break;
                }
                case 45: {
                    n4 = 149;
                    break;
                }
                case 46: {
                    n4 = 194;
                    break;
                }
                case 47: {
                    n4 = 172;
                    break;
                }
                case 48: {
                    n4 = 70;
                    break;
                }
                case 49: {
                    n4 = 144;
                    break;
                }
                case 50: {
                    n4 = 50;
                    break;
                }
                case 51: {
                    n4 = 182;
                    break;
                }
                case 52: {
                    n4 = 30;
                    break;
                }
                case 53: {
                    n4 = 74;
                    break;
                }
                case 54: {
                    n4 = 23;
                    break;
                }
                case 55: {
                    n4 = 22;
                    break;
                }
                case 56: {
                    n4 = 76;
                    break;
                }
                case 57: {
                    n4 = 124;
                    break;
                }
                case 58: {
                    n4 = 129;
                    break;
                }
                case 59: {
                    n4 = 29;
                    break;
                }
                case 60: {
                    n4 = 117;
                    break;
                }
                case 61: {
                    n4 = 118;
                    break;
                }
                case 62: {
                    n4 = 204;
                    break;
                }
                case 63: {
                    n4 = 141;
                    break;
                }
                case 64: {
                    n4 = 174;
                    break;
                }
                case 65: {
                    n4 = 21;
                    break;
                }
                case 66: {
                    n4 = 0;
                    break;
                }
                case 67: {
                    n4 = 247;
                    break;
                }
                case 68: {
                    n4 = 140;
                    break;
                }
                case 69: {
                    n4 = 250;
                    break;
                }
                case 70: {
                    n4 = 159;
                    break;
                }
                case 71: {
                    n4 = 116;
                    break;
                }
                case 72: {
                    n4 = 97;
                    break;
                }
                case 73: {
                    n4 = 215;
                    break;
                }
                case 74: {
                    n4 = 106;
                    break;
                }
                case 75: {
                    n4 = 37;
                    break;
                }
                case 76: {
                    n4 = 4;
                    break;
                }
                case 77: {
                    n4 = 35;
                    break;
                }
                case 78: {
                    n4 = 223;
                    break;
                }
                case 79: {
                    n4 = 108;
                    break;
                }
                case 80: {
                    n4 = 179;
                    break;
                }
                case 81: {
                    n4 = 78;
                    break;
                }
                case 82: {
                    n4 = 128;
                    break;
                }
                case 83: {
                    n4 = 255;
                    break;
                }
                case 84: {
                    n4 = 237;
                    break;
                }
                case 85: {
                    n4 = 248;
                    break;
                }
                case 86: {
                    n4 = 8;
                    break;
                }
                case 87: {
                    n4 = 200;
                    break;
                }
                case 88: {
                    n4 = 162;
                    break;
                }
                case 89: {
                    n4 = 42;
                    break;
                }
                case 90: {
                    n4 = 105;
                    break;
                }
                case 91: {
                    n4 = 165;
                    break;
                }
                case 92: {
                    n4 = 214;
                    break;
                }
                case 93: {
                    n4 = 14;
                    break;
                }
                case 94: {
                    n4 = 218;
                    break;
                }
                case 95: {
                    n4 = 242;
                    break;
                }
                case 96: {
                    n4 = 109;
                    break;
                }
                case 97: {
                    n4 = 62;
                    break;
                }
                case 98: {
                    n4 = 54;
                    break;
                }
                case 99: {
                    n4 = 92;
                    break;
                }
                case 100: {
                    n4 = 203;
                    break;
                }
                case 101: {
                    n4 = 249;
                    break;
                }
                case 102: {
                    n4 = 155;
                    break;
                }
                case 103: {
                    n4 = 195;
                    break;
                }
                case 104: {
                    n4 = 34;
                    break;
                }
                case 105: {
                    n4 = 112;
                    break;
                }
                case 106: {
                    n4 = 64;
                    break;
                }
                case 107: {
                    n4 = 196;
                    break;
                }
                case 108: {
                    n4 = 11;
                    break;
                }
                case 109: {
                    n4 = 26;
                    break;
                }
                case 110: {
                    n4 = 254;
                    break;
                }
                case 111: {
                    n4 = 10;
                    break;
                }
                case 112: {
                    n4 = 245;
                    break;
                }
                case 113: {
                    n4 = 171;
                    break;
                }
                case 114: {
                    n4 = 65;
                    break;
                }
                case 115: {
                    n4 = 6;
                    break;
                }
                case 116: {
                    n4 = 1;
                    break;
                }
                case 117: {
                    n4 = 17;
                    break;
                }
                case 118: {
                    n4 = 25;
                    break;
                }
                case 119: {
                    n4 = 131;
                    break;
                }
                case 120: {
                    n4 = 168;
                    break;
                }
                case 121: {
                    n4 = 75;
                    break;
                }
                case 122: {
                    n4 = 101;
                    break;
                }
                case 123: {
                    n4 = 225;
                    break;
                }
                case 124: {
                    n4 = 107;
                    break;
                }
                case 125: {
                    n4 = 163;
                    break;
                }
                case 126: {
                    n4 = 198;
                    break;
                }
                case 127: {
                    n4 = 15;
                    break;
                }
                case 128: {
                    n4 = 24;
                    break;
                }
                case 129: {
                    n4 = 82;
                    break;
                }
                case 130: {
                    n4 = 33;
                    break;
                }
                case 131: {
                    n4 = 51;
                    break;
                }
                case 132: {
                    n4 = 220;
                    break;
                }
                case 133: {
                    n4 = 205;
                    break;
                }
                case 134: {
                    n4 = 95;
                    break;
                }
                case 135: {
                    n4 = 228;
                    break;
                }
                case 136: {
                    n4 = 221;
                    break;
                }
                case 137: {
                    n4 = 7;
                    break;
                }
                case 138: {
                    n4 = 100;
                    break;
                }
                case 139: {
                    n4 = 130;
                    break;
                }
                case 140: {
                    n4 = 40;
                    break;
                }
                case 141: {
                    n4 = 71;
                    break;
                }
                case 142: {
                    n4 = 136;
                    break;
                }
                case 143: {
                    n4 = 69;
                    break;
                }
                case 144: {
                    n4 = 139;
                    break;
                }
                case 145: {
                    n4 = 209;
                    break;
                }
                case 146: {
                    n4 = 73;
                    break;
                }
                case 147: {
                    n4 = 181;
                    break;
                }
                case 148: {
                    n4 = 211;
                    break;
                }
                case 149: {
                    n4 = 58;
                    break;
                }
                case 150: {
                    n4 = 19;
                    break;
                }
                case 151: {
                    n4 = 173;
                    break;
                }
                case 152: {
                    n4 = 193;
                    break;
                }
                case 153: {
                    n4 = 13;
                    break;
                }
                case 154: {
                    n4 = 94;
                    break;
                }
                case 155: {
                    n4 = 230;
                    break;
                }
                case 156: {
                    n4 = 219;
                    break;
                }
                case 157: {
                    n4 = 232;
                    break;
                }
                case 158: {
                    n4 = 99;
                    break;
                }
                case 159: {
                    n4 = 227;
                    break;
                }
                case 160: {
                    n4 = 152;
                    break;
                }
                case 161: {
                    n4 = 226;
                    break;
                }
                case 162: {
                    n4 = 138;
                    break;
                }
                case 163: {
                    n4 = 175;
                    break;
                }
                case 164: {
                    n4 = 143;
                    break;
                }
                case 165: {
                    n4 = 9;
                    break;
                }
                case 166: {
                    n4 = 48;
                    break;
                }
                case 167: {
                    n4 = 253;
                    break;
                }
                case 168: {
                    n4 = 121;
                    break;
                }
                case 169: {
                    n4 = 77;
                    break;
                }
                case 170: {
                    n4 = 53;
                    break;
                }
                case 171: {
                    n4 = 241;
                    break;
                }
                case 172: {
                    n4 = 27;
                    break;
                }
                case 173: {
                    n4 = 192;
                    break;
                }
                case 174: {
                    n4 = 55;
                    break;
                }
                case 175: {
                    n4 = 234;
                    break;
                }
                case 176: {
                    n4 = 5;
                    break;
                }
                case 177: {
                    n4 = 150;
                    break;
                }
                case 178: {
                    n4 = 83;
                    break;
                }
                case 179: {
                    n4 = 32;
                    break;
                }
                case 180: {
                    n4 = 240;
                    break;
                }
                case 181: {
                    n4 = 104;
                    break;
                }
                case 182: {
                    n4 = 147;
                    break;
                }
                case 183: {
                    n4 = 16;
                    break;
                }
                case 184: {
                    n4 = 135;
                    break;
                }
                case 185: {
                    n4 = 36;
                    break;
                }
                case 186: {
                    n4 = 184;
                    break;
                }
                case 187: {
                    n4 = 123;
                    break;
                }
                case 188: {
                    n4 = 202;
                    break;
                }
                case 189: {
                    n4 = 91;
                    break;
                }
                case 190: {
                    n4 = 20;
                    break;
                }
                case 191: {
                    n4 = 148;
                    break;
                }
                case 192: {
                    n4 = 114;
                    break;
                }
                case 193: {
                    n4 = 142;
                    break;
                }
                case 194: {
                    n4 = 113;
                    break;
                }
                case 195: {
                    n4 = 67;
                    break;
                }
                case 196: {
                    n4 = 206;
                    break;
                }
                case 197: {
                    n4 = 60;
                    break;
                }
                case 198: {
                    n4 = 231;
                    break;
                }
                case 199: {
                    n4 = 146;
                    break;
                }
                case 200: {
                    n4 = 86;
                    break;
                }
                case 201: {
                    n4 = 199;
                    break;
                }
                case 202: {
                    n4 = 224;
                    break;
                }
                case 203: {
                    n4 = 41;
                    break;
                }
                case 204: {
                    n4 = 233;
                    break;
                }
                case 205: {
                    n4 = 186;
                    break;
                }
                case 206: {
                    n4 = 43;
                    break;
                }
                case 207: {
                    n4 = 201;
                    break;
                }
                case 208: {
                    n4 = 90;
                    break;
                }
                case 209: {
                    n4 = 39;
                    break;
                }
                case 210: {
                    n4 = 110;
                    break;
                }
                case 211: {
                    n4 = 208;
                    break;
                }
                case 212: {
                    n4 = 216;
                    break;
                }
                case 213: {
                    n4 = 63;
                    break;
                }
                case 214: {
                    n4 = 176;
                    break;
                }
                case 215: {
                    n4 = 153;
                    break;
                }
                case 216: {
                    n4 = 151;
                    break;
                }
                case 217: {
                    n4 = 72;
                    break;
                }
                case 218: {
                    n4 = 170;
                    break;
                }
                case 219: {
                    n4 = 244;
                    break;
                }
                case 220: {
                    n4 = 213;
                    break;
                }
                case 221: {
                    n4 = 177;
                    break;
                }
                case 222: {
                    n4 = 160;
                    break;
                }
                case 223: {
                    n4 = 236;
                    break;
                }
                case 224: {
                    n4 = 222;
                    break;
                }
                case 225: {
                    n4 = 137;
                    break;
                }
                case 226: {
                    n4 = 154;
                    break;
                }
                case 227: {
                    n4 = 164;
                    break;
                }
                case 228: {
                    n4 = 66;
                    break;
                }
                case 229: {
                    n4 = 238;
                    break;
                }
                case 230: {
                    n4 = 122;
                    break;
                }
                case 231: {
                    n4 = 119;
                    break;
                }
                case 232: {
                    n4 = 84;
                    break;
                }
                case 233: {
                    n4 = 31;
                    break;
                }
                case 234: {
                    n4 = 127;
                    break;
                }
                case 235: {
                    n4 = 229;
                    break;
                }
                case 236: {
                    n4 = 3;
                    break;
                }
                case 237: {
                    n4 = 44;
                    break;
                }
                case 238: {
                    n4 = 189;
                    break;
                }
                case 239: {
                    n4 = 18;
                    break;
                }
                case 240: {
                    n4 = 185;
                    break;
                }
                case 241: {
                    n4 = 61;
                    break;
                }
                case 242: {
                    n4 = 145;
                    break;
                }
                case 243: {
                    n4 = 12;
                    break;
                }
                case 244: {
                    n4 = 59;
                    break;
                }
                case 245: {
                    n4 = 243;
                    break;
                }
                case 246: {
                    n4 = 190;
                    break;
                }
                case 247: {
                    n4 = 161;
                    break;
                }
                case 248: {
                    n4 = 188;
                    break;
                }
                case 249: {
                    n4 = 57;
                    break;
                }
                case 250: {
                    n4 = 132;
                    break;
                }
                case 251: {
                    n4 = 47;
                    break;
                }
                case 252: {
                    n4 = 56;
                    break;
                }
                case 253: {
                    n4 = 87;
                    break;
                }
                case 254: {
                    n4 = 251;
                    break;
                }
                default: {
                    n4 = 115;
                }
            }
            int n5 = n4;
            int n6 = (n2 & 0xFF) - n5;
            n6 += 256;
            int n7 = ((n2 & 0xFFFF) >>> 8) - n5;
            n7 += 256;
            int n8 = 0;
            while (n8 < cArray.length) {
                int n9 = n8 % 2;
                int n10 = n8;
                cArray[n10] = (char)(cArray[n10] ^ n6);
                n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n8]) & 0xFF;
                ++n8;
            }
            LightningTrack.Field2292[n3] = new String(cArray).intern();
        }
        return Field2292[n3];
    }

    public void Method810(EventRender2D a) {
        if (!mc.isSingleplayer() && mc.getCurrentServerData() != null && this.Field2296.getValue()) {
            this.Field2299.forEach(arg_0 -> this.Method2249(a, arg_0));
        }
    }

    @Override
    public String getDescription() {
        return LightningTrack.Method754(-22730, 31268);
    }

    public static String Method2255(String a) {
        return a.replaceAll("&", "\u00a7");
    }

    private static native /* synthetic */ void Method1658();
}