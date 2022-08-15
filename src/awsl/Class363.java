/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.mojang.authlib.GameProfile
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Objects
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.inventory.GuiChest
 *  net.minecraft.client.network.NetworkPlayerInfo
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.client.shader.Framebuffer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItemFrame
 *  net.minecraft.init.Items
 *  net.minecraft.scoreboard.ScorePlayerTeam
 *  net.minecraft.scoreboard.Team
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.EntitySelectors
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumWorldBlockLayer
 *  net.minecraft.util.MovingObjectPosition
 *  net.minecraft.util.MovingObjectPosition$MovingObjectType
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.Vec3
 *  net.minecraft.world.IBlockAccess
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class346;
import awsl.Class347;
import awsl.Class393;
import awsl.Class606;
import awsl.Class628;
import awsl.Class645;
import awsl.Class652;
import awsl.Class655;
import awsl.Class681;
import awsl.Class707;
import awsl.Class749;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.mojang.authlib.GameProfile;
import eventapi.EventManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import native0.Class614;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.init.Items;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.module.impl.combat.AntiBot;
import trash.foodbyte.module.impl.combat.HitBox;
import trash.foodbyte.module.impl.combat.KeepSprint;
import trash.foodbyte.module.impl.combat.KillAura;
import trash.foodbyte.module.impl.combat.Reach;
import trash.foodbyte.module.impl.movement.NoSlowDown;
import trash.foodbyte.module.impl.player.NameProtect;
import trash.foodbyte.module.impl.render.BlockOverlay;
import trash.foodbyte.module.impl.render.FullBright;
import trash.foodbyte.module.impl.render.ItemRender;
import trash.foodbyte.module.impl.render.NameTag;
import trash.foodbyte.module.impl.render.NoFov;
import trash.foodbyte.module.impl.render.NoHurtcam;
import trash.foodbyte.module.impl.render.Perspective;
import trash.foodbyte.module.impl.render.ViewClip;
import trash.foodbyte.utils.ReflectionUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class363 {
    public static boolean Field1713;
    private static Entity Field1714;
    public static Minecraft Field1715;
    private static Class Field1716;
    private static final String[] Field1717;
    public static ArrayList Field1718;
    public static int Field1719;
    private static final String[] Field1720;
    public static Boolean Field1721;
    public static boolean Field1722;
    private static long Field1723;

    public static boolean Method584(IBlockAccess a, BlockPos a2, EnumFacing a3, double[] a4) {
        return a3 == EnumFacing.DOWN && a4[1] > 0.0 || a3 == EnumFacing.UP && a4[4] < 1.0 || a3 == EnumFacing.NORTH && a4[2] > 0.0 || a3 == EnumFacing.SOUTH && a4[5] < 1.0 || a3 == EnumFacing.WEST && a4[0] > 0.0 || a3 == EnumFacing.EAST && a4[3] < 1.0 || !a.getBlockState(a2).getBlock().isOpaqueCube();
    }

    public static void Method585(RenderManager a, float a2) {
        float a3 = Perspective.Field2203 ? Perspective.Field2200 : a2;
        a.playerViewY = a3;
    }

    public static boolean Method586() {
        return ModuleManager.getModule(NoHurtcam.class).getState();
    }

    public static boolean Method587() {
        return ModuleManager.getModule(FullBright.class).getState();
    }

    public static boolean Method588() {
        return ModuleManager.getModule(BlockOverlay.class).getState();
    }

    public static String Method589() {
        String a = null;
        if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null) {
            Iterator iterator = Minecraft.getMinecraft().thePlayer.sendQueue.getPlayerInfoMap().Method1383();
            while (iterator.Method932()) {
                NetworkPlayerInfo a2 = (NetworkPlayerInfo)iterator.Method933();
                GameProfile a3 = a2.getGameProfile();
                if (a3.getId() == null || !a3.getId().equals((Object)Minecraft.getMinecraft().getSession().getProfile().getId()) || a3.getName().equalsIgnoreCase(Minecraft.getMinecraft().getSession().getProfile().getName())) continue;
                a = a3.getName();
            }
        }
        return a;
    }

    public static void Method590() {
        if (!GlobalModule.Field3151.isCurrentMode(Class363.Method598(-7086, -24105)) || !(Minecraft.getMinecraft().currentScreen instanceof Class707)) {
            // empty if block
        }
    }

    public static boolean Method591() {
        return ModuleManager.getModule(ViewClip.class).getState();
    }

    public static boolean Method592() {
        return GlobalModule.Field3153.Method2509();
    }

    public static void Method593(RenderManager a, float a2) {
        float a3 = Perspective.Field2203 ? Perspective.Field2201 : a2;
        a.playerViewX = a3;
    }

    public static boolean Method594() {
        return Field1713;
    }

    public static boolean Method595() {
        return GlobalModule.Field3174.Method2509();
    }

    public static float Method596(Entity a) {
        if (!a.equals((Object)Class363.Field1715.thePlayer)) {
            return a.rotationPitch;
        }
        return Perspective.Field2203 ? Perspective.Field2201 : Class363.Field1715.thePlayer.rotationPitch;
    }

    public static boolean Method597(IBlockAccess a, BlockPos a2, EnumFacing a3, Object a4, double[] a5) {
        if (Field1713 && Field1718.contains((Object)((Block)a4))) {
            if (!Field1721.booleanValue()) {
                return true;
            }
            for (EnumFacing a6 : EnumFacing.VALUES) {
                if (!Class363.Method584(a, a2.offset(a6), a6, a5)) continue;
                return Field1722 || Class363.Method584(a, a2, a3, a5);
            }
        } else {
            return Class363.Method584(a, a2, a3, a5);
        }
        return false;
    }

    private static String Method598(int n, int n2) {
        int n3 = (n ^ 0xFFFFE442) & 0xFFFF;
        if (Field1720[n3] == null) {
            int n4;
            char[] cArray = Field1717[n3].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n4 = 160;
                    break;
                }
                case 1: {
                    n4 = 191;
                    break;
                }
                case 2: {
                    n4 = 216;
                    break;
                }
                case 3: {
                    n4 = 177;
                    break;
                }
                case 4: {
                    n4 = 186;
                    break;
                }
                case 5: {
                    n4 = 255;
                    break;
                }
                case 6: {
                    n4 = 92;
                    break;
                }
                case 7: {
                    n4 = 61;
                    break;
                }
                case 8: {
                    n4 = 111;
                    break;
                }
                case 9: {
                    n4 = 140;
                    break;
                }
                case 10: {
                    n4 = 147;
                    break;
                }
                case 11: {
                    n4 = 62;
                    break;
                }
                case 12: {
                    n4 = 88;
                    break;
                }
                case 13: {
                    n4 = 199;
                    break;
                }
                case 14: {
                    n4 = 130;
                    break;
                }
                case 15: {
                    n4 = 8;
                    break;
                }
                case 16: {
                    n4 = 149;
                    break;
                }
                case 17: {
                    n4 = 237;
                    break;
                }
                case 18: {
                    n4 = 13;
                    break;
                }
                case 19: {
                    n4 = 66;
                    break;
                }
                case 20: {
                    n4 = 137;
                    break;
                }
                case 21: {
                    n4 = 132;
                    break;
                }
                case 22: {
                    n4 = 206;
                    break;
                }
                case 23: {
                    n4 = 230;
                    break;
                }
                case 24: {
                    n4 = 152;
                    break;
                }
                case 25: {
                    n4 = 158;
                    break;
                }
                case 26: {
                    n4 = 42;
                    break;
                }
                case 27: {
                    n4 = 80;
                    break;
                }
                case 28: {
                    n4 = 118;
                    break;
                }
                case 29: {
                    n4 = 244;
                    break;
                }
                case 30: {
                    n4 = 31;
                    break;
                }
                case 31: {
                    n4 = 201;
                    break;
                }
                case 32: {
                    n4 = 6;
                    break;
                }
                case 33: {
                    n4 = 139;
                    break;
                }
                case 34: {
                    n4 = 74;
                    break;
                }
                case 35: {
                    n4 = 114;
                    break;
                }
                case 36: {
                    n4 = 121;
                    break;
                }
                case 37: {
                    n4 = 17;
                    break;
                }
                case 38: {
                    n4 = 196;
                    break;
                }
                case 39: {
                    n4 = 197;
                    break;
                }
                case 40: {
                    n4 = 165;
                    break;
                }
                case 41: {
                    n4 = 161;
                    break;
                }
                case 42: {
                    n4 = 67;
                    break;
                }
                case 43: {
                    n4 = 157;
                    break;
                }
                case 44: {
                    n4 = 11;
                    break;
                }
                case 45: {
                    n4 = 188;
                    break;
                }
                case 46: {
                    n4 = 233;
                    break;
                }
                case 47: {
                    n4 = 54;
                    break;
                }
                case 48: {
                    n4 = 127;
                    break;
                }
                case 49: {
                    n4 = 53;
                    break;
                }
                case 50: {
                    n4 = 27;
                    break;
                }
                case 51: {
                    n4 = 36;
                    break;
                }
                case 52: {
                    n4 = 87;
                    break;
                }
                case 53: {
                    n4 = 107;
                    break;
                }
                case 54: {
                    n4 = 245;
                    break;
                }
                case 55: {
                    n4 = 52;
                    break;
                }
                case 56: {
                    n4 = 145;
                    break;
                }
                case 57: {
                    n4 = 39;
                    break;
                }
                case 58: {
                    n4 = 171;
                    break;
                }
                case 59: {
                    n4 = 153;
                    break;
                }
                case 60: {
                    n4 = 99;
                    break;
                }
                case 61: {
                    n4 = 10;
                    break;
                }
                case 62: {
                    n4 = 89;
                    break;
                }
                case 63: {
                    n4 = 131;
                    break;
                }
                case 64: {
                    n4 = 57;
                    break;
                }
                case 65: {
                    n4 = 7;
                    break;
                }
                case 66: {
                    n4 = 142;
                    break;
                }
                case 67: {
                    n4 = 34;
                    break;
                }
                case 68: {
                    n4 = 252;
                    break;
                }
                case 69: {
                    n4 = 224;
                    break;
                }
                case 70: {
                    n4 = 77;
                    break;
                }
                case 71: {
                    n4 = 154;
                    break;
                }
                case 72: {
                    n4 = 40;
                    break;
                }
                case 73: {
                    n4 = 238;
                    break;
                }
                case 74: {
                    n4 = 41;
                    break;
                }
                case 75: {
                    n4 = 37;
                    break;
                }
                case 76: {
                    n4 = 120;
                    break;
                }
                case 77: {
                    n4 = 69;
                    break;
                }
                case 78: {
                    n4 = 64;
                    break;
                }
                case 79: {
                    n4 = 156;
                    break;
                }
                case 80: {
                    n4 = 81;
                    break;
                }
                case 81: {
                    n4 = 91;
                    break;
                }
                case 82: {
                    n4 = 86;
                    break;
                }
                case 83: {
                    n4 = 122;
                    break;
                }
                case 84: {
                    n4 = 181;
                    break;
                }
                case 85: {
                    n4 = 96;
                    break;
                }
                case 86: {
                    n4 = 78;
                    break;
                }
                case 87: {
                    n4 = 83;
                    break;
                }
                case 88: {
                    n4 = 100;
                    break;
                }
                case 89: {
                    n4 = 141;
                    break;
                }
                case 90: {
                    n4 = 151;
                    break;
                }
                case 91: {
                    n4 = 194;
                    break;
                }
                case 92: {
                    n4 = 3;
                    break;
                }
                case 93: {
                    n4 = 174;
                    break;
                }
                case 94: {
                    n4 = 179;
                    break;
                }
                case 95: {
                    n4 = 16;
                    break;
                }
                case 96: {
                    n4 = 231;
                    break;
                }
                case 97: {
                    n4 = 249;
                    break;
                }
                case 98: {
                    n4 = 248;
                    break;
                }
                case 99: {
                    n4 = 192;
                    break;
                }
                case 100: {
                    n4 = 225;
                    break;
                }
                case 101: {
                    n4 = 21;
                    break;
                }
                case 102: {
                    n4 = 33;
                    break;
                }
                case 103: {
                    n4 = 109;
                    break;
                }
                case 104: {
                    n4 = 38;
                    break;
                }
                case 105: {
                    n4 = 9;
                    break;
                }
                case 106: {
                    n4 = 254;
                    break;
                }
                case 107: {
                    n4 = 148;
                    break;
                }
                case 108: {
                    n4 = 234;
                    break;
                }
                case 109: {
                    n4 = 101;
                    break;
                }
                case 110: {
                    n4 = 204;
                    break;
                }
                case 111: {
                    n4 = 0;
                    break;
                }
                case 112: {
                    n4 = 189;
                    break;
                }
                case 113: {
                    n4 = 163;
                    break;
                }
                case 114: {
                    n4 = 128;
                    break;
                }
                case 115: {
                    n4 = 136;
                    break;
                }
                case 116: {
                    n4 = 29;
                    break;
                }
                case 117: {
                    n4 = 246;
                    break;
                }
                case 118: {
                    n4 = 207;
                    break;
                }
                case 119: {
                    n4 = 173;
                    break;
                }
                case 120: {
                    n4 = 126;
                    break;
                }
                case 121: {
                    n4 = 175;
                    break;
                }
                case 122: {
                    n4 = 190;
                    break;
                }
                case 123: {
                    n4 = 22;
                    break;
                }
                case 124: {
                    n4 = 85;
                    break;
                }
                case 125: {
                    n4 = 239;
                    break;
                }
                case 126: {
                    n4 = 183;
                    break;
                }
                case 127: {
                    n4 = 116;
                    break;
                }
                case 128: {
                    n4 = 125;
                    break;
                }
                case 129: {
                    n4 = 193;
                    break;
                }
                case 130: {
                    n4 = 222;
                    break;
                }
                case 131: {
                    n4 = 26;
                    break;
                }
                case 132: {
                    n4 = 95;
                    break;
                }
                case 133: {
                    n4 = 167;
                    break;
                }
                case 134: {
                    n4 = 129;
                    break;
                }
                case 135: {
                    n4 = 104;
                    break;
                }
                case 136: {
                    n4 = 2;
                    break;
                }
                case 137: {
                    n4 = 23;
                    break;
                }
                case 138: {
                    n4 = 115;
                    break;
                }
                case 139: {
                    n4 = 1;
                    break;
                }
                case 140: {
                    n4 = 138;
                    break;
                }
                case 141: {
                    n4 = 205;
                    break;
                }
                case 142: {
                    n4 = 232;
                    break;
                }
                case 143: {
                    n4 = 65;
                    break;
                }
                case 144: {
                    n4 = 46;
                    break;
                }
                case 145: {
                    n4 = 226;
                    break;
                }
                case 146: {
                    n4 = 63;
                    break;
                }
                case 147: {
                    n4 = 144;
                    break;
                }
                case 148: {
                    n4 = 51;
                    break;
                }
                case 149: {
                    n4 = 82;
                    break;
                }
                case 150: {
                    n4 = 143;
                    break;
                }
                case 151: {
                    n4 = 14;
                    break;
                }
                case 152: {
                    n4 = 71;
                    break;
                }
                case 153: {
                    n4 = 220;
                    break;
                }
                case 154: {
                    n4 = 134;
                    break;
                }
                case 155: {
                    n4 = 48;
                    break;
                }
                case 156: {
                    n4 = 108;
                    break;
                }
                case 157: {
                    n4 = 209;
                    break;
                }
                case 158: {
                    n4 = 123;
                    break;
                }
                case 159: {
                    n4 = 162;
                    break;
                }
                case 160: {
                    n4 = 169;
                    break;
                }
                case 161: {
                    n4 = 106;
                    break;
                }
                case 162: {
                    n4 = 30;
                    break;
                }
                case 163: {
                    n4 = 247;
                    break;
                }
                case 164: {
                    n4 = 210;
                    break;
                }
                case 165: {
                    n4 = 19;
                    break;
                }
                case 166: {
                    n4 = 135;
                    break;
                }
                case 167: {
                    n4 = 47;
                    break;
                }
                case 168: {
                    n4 = 45;
                    break;
                }
                case 169: {
                    n4 = 24;
                    break;
                }
                case 170: {
                    n4 = 176;
                    break;
                }
                case 171: {
                    n4 = 203;
                    break;
                }
                case 172: {
                    n4 = 195;
                    break;
                }
                case 173: {
                    n4 = 219;
                    break;
                }
                case 174: {
                    n4 = 60;
                    break;
                }
                case 175: {
                    n4 = 251;
                    break;
                }
                case 176: {
                    n4 = 15;
                    break;
                }
                case 177: {
                    n4 = 49;
                    break;
                }
                case 178: {
                    n4 = 50;
                    break;
                }
                case 179: {
                    n4 = 12;
                    break;
                }
                case 180: {
                    n4 = 185;
                    break;
                }
                case 181: {
                    n4 = 253;
                    break;
                }
                case 182: {
                    n4 = 187;
                    break;
                }
                case 183: {
                    n4 = 4;
                    break;
                }
                case 184: {
                    n4 = 68;
                    break;
                }
                case 185: {
                    n4 = 105;
                    break;
                }
                case 186: {
                    n4 = 180;
                    break;
                }
                case 187: {
                    n4 = 20;
                    break;
                }
                case 188: {
                    n4 = 214;
                    break;
                }
                case 189: {
                    n4 = 172;
                    break;
                }
                case 190: {
                    n4 = 150;
                    break;
                }
                case 191: {
                    n4 = 98;
                    break;
                }
                case 192: {
                    n4 = 215;
                    break;
                }
                case 193: {
                    n4 = 18;
                    break;
                }
                case 194: {
                    n4 = 117;
                    break;
                }
                case 195: {
                    n4 = 55;
                    break;
                }
                case 196: {
                    n4 = 235;
                    break;
                }
                case 197: {
                    n4 = 35;
                    break;
                }
                case 198: {
                    n4 = 93;
                    break;
                }
                case 199: {
                    n4 = 155;
                    break;
                }
                case 200: {
                    n4 = 43;
                    break;
                }
                case 201: {
                    n4 = 102;
                    break;
                }
                case 202: {
                    n4 = 236;
                    break;
                }
                case 203: {
                    n4 = 227;
                    break;
                }
                case 204: {
                    n4 = 112;
                    break;
                }
                case 205: {
                    n4 = 146;
                    break;
                }
                case 206: {
                    n4 = 59;
                    break;
                }
                case 207: {
                    n4 = 119;
                    break;
                }
                case 208: {
                    n4 = 28;
                    break;
                }
                case 209: {
                    n4 = 211;
                    break;
                }
                case 210: {
                    n4 = 229;
                    break;
                }
                case 211: {
                    n4 = 212;
                    break;
                }
                case 212: {
                    n4 = 75;
                    break;
                }
                case 213: {
                    n4 = 79;
                    break;
                }
                case 214: {
                    n4 = 228;
                    break;
                }
                case 215: {
                    n4 = 166;
                    break;
                }
                case 216: {
                    n4 = 25;
                    break;
                }
                case 217: {
                    n4 = 178;
                    break;
                }
                case 218: {
                    n4 = 184;
                    break;
                }
                case 219: {
                    n4 = 242;
                    break;
                }
                case 220: {
                    n4 = 32;
                    break;
                }
                case 221: {
                    n4 = 70;
                    break;
                }
                case 222: {
                    n4 = 110;
                    break;
                }
                case 223: {
                    n4 = 208;
                    break;
                }
                case 224: {
                    n4 = 133;
                    break;
                }
                case 225: {
                    n4 = 56;
                    break;
                }
                case 226: {
                    n4 = 240;
                    break;
                }
                case 227: {
                    n4 = 250;
                    break;
                }
                case 228: {
                    n4 = 73;
                    break;
                }
                case 229: {
                    n4 = 200;
                    break;
                }
                case 230: {
                    n4 = 103;
                    break;
                }
                case 231: {
                    n4 = 223;
                    break;
                }
                case 232: {
                    n4 = 243;
                    break;
                }
                case 233: {
                    n4 = 84;
                    break;
                }
                case 234: {
                    n4 = 202;
                    break;
                }
                case 235: {
                    n4 = 241;
                    break;
                }
                case 236: {
                    n4 = 218;
                    break;
                }
                case 237: {
                    n4 = 58;
                    break;
                }
                case 238: {
                    n4 = 76;
                    break;
                }
                case 239: {
                    n4 = 198;
                    break;
                }
                case 240: {
                    n4 = 44;
                    break;
                }
                case 241: {
                    n4 = 217;
                    break;
                }
                case 242: {
                    n4 = 5;
                    break;
                }
                case 243: {
                    n4 = 182;
                    break;
                }
                case 244: {
                    n4 = 72;
                    break;
                }
                case 245: {
                    n4 = 159;
                    break;
                }
                case 246: {
                    n4 = 170;
                    break;
                }
                case 247: {
                    n4 = 97;
                    break;
                }
                case 248: {
                    n4 = 164;
                    break;
                }
                case 249: {
                    n4 = 113;
                    break;
                }
                case 250: {
                    n4 = 213;
                    break;
                }
                case 251: {
                    n4 = 221;
                    break;
                }
                case 252: {
                    n4 = 90;
                    break;
                }
                case 253: {
                    n4 = 124;
                    break;
                }
                case 254: {
                    n4 = 168;
                    break;
                }
                default: {
                    n4 = 94;
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
            Class363.Field1720[n3] = new String(cArray).intern();
        }
        return Field1720[n3];
    }

    public static boolean Method599() {
        return ModuleManager.getModule(HitBox.class).getState();
    }

    @Class628
    public static native void Method600(BlockPos var0);

    public static void Method601() {
        if (GlobalModule.Field3146.Method2509().booleanValue()) {
            GL11.glPushMatrix();
        }
    }

    public static boolean Method602(EntityLivingBase a) {
        NameTag a2 = (NameTag)ModuleManager.getModule(NameTag.class);
        if (a2.Field2223.Method2509().booleanValue()) {
            return a2.getState() && a2.Method965(a) && !AntiBot.Field2577.contains((Object)a) && a != Class363.Field1715.thePlayer;
        }
        return false;
    }

    public static int Method603(int a, int a2, int a3) {
        return Class681.Method2696(a, a2, a3, Field1719);
    }

    public static EnumWorldBlockLayer Method604(Object a) {
        return Field1718.contains((Object)((Block)a)) ? EnumWorldBlockLayer.SOLID : EnumWorldBlockLayer.TRANSLUCENT;
    }

    public static void Method605(float a) {
        block11: {
            double a2;
            Vec3 a3;
            Vec3 a4;
            double a5;
            Reach a6;
            block12: {
                double a7;
                MovingObjectPosition a8;
                Entity a9;
                block14: {
                    Entity a10;
                    block13: {
                        Vec3 a11;
                        a10 = Field1715.getRenderViewEntity();
                        int[] a12 = RenderUtils.Method1148();
                        if (Class363.Field1715.theWorld == null) break block11;
                        Class363.Field1715.mcProfiler.startSection(Class363.Method598(-7091, 12151));
                        Class363.Field1715.pointedEntity = null;
                        a6 = (Reach)ModuleManager.getModule(Reach.class);
                        double a13 = a6.getState() && !Class363.Field1715.playerController.extendedReach() ? (double)a6.Method798() : (double)Class363.Field1715.playerController.getBlockReachDistance();
                        Class363.Field1715.objectMouseOver = a10.rayTrace(a6.getState() && !Class363.Field1715.playerController.extendedReach() ? (double)a6.Field2488.Method2744().floatValue() : a13, a);
                        a5 = a13;
                        a4 = a10.getPositionEyes(a);
                        boolean a14 = false;
                        if (Class363.Field1715.playerController.extendedReach()) {
                            a13 = 6.0;
                            a5 = 6.0;
                        }
                        if (a13 > 3.0) {
                            a14 = true;
                        }
                        if (Class363.Field1715.objectMouseOver != null) {
                            a5 = Class363.Field1715.objectMouseOver.hitVec.distanceTo(a4);
                        }
                        if (a6.getState() && !Class363.Field1715.playerController.extendedReach()) {
                            a5 = a6.Method276();
                            a11 = a10.rayTrace(a5, a);
                            a5 = a11.hitVec.distanceTo(a4);
                        }
                        a11 = a10.getLook(a);
                        Vec3 a15 = a4.addVector(a11.xCoord * a13, a11.yCoord * a13, a11.zCoord * a13);
                        Field1714 = null;
                        a3 = null;
                        float a16 = 1.0f;
                        List a17 = Class363.Field1715.theWorld.getEntitiesInAABBexcluding(a10, a10.getEntityBoundingBox().addCoord(a11.xCoord * a13, a11.yCoord * a13, a11.zCoord * a13).expand((double)a16, (double)a16, (double)a16), Predicates.and((Predicate)EntitySelectors.NOT_SPECTATING, Class363::Method633));
                        a2 = a5;
                        Iterator iterator = a17.Method1383();
                        if (!iterator.Method932()) break block12;
                        a9 = (Entity)iterator.Method933();
                        HitBox a18 = (HitBox)ModuleManager.getModule(HitBox.class);
                        float a19 = a18.getState() && a18.Method1187(a9) ? a18.Field2607.Method2744().floatValue() : a9.getCollisionBorderSize();
                        AxisAlignedBB a20 = a9.getEntityBoundingBox().expand((double)a19, (double)a19, (double)a19);
                        a8 = a20.calculateIntercept(a4, a15);
                        if (!a20.isVecInside(a4)) break block13;
                        if (!(a2 >= 0.0)) break block12;
                        Field1714 = a9;
                        a3 = a4;
                        a2 = 0.0;
                    }
                    if (!((a7 = a4.distanceTo(a8.hitVec)) < a2) && a2 != 0.0) break block12;
                    if (a9 != a10.ridingEntity) break block14;
                    if (a2 != 0.0) break block12;
                    Field1714 = a9;
                    a3 = a8.hitVec;
                }
                Field1714 = a9;
                a3 = a8.hitVec;
                a2 = a7;
            }
            if (Field1714 != null) {
                double d = a4.distanceTo(a3);
                double d2 = a6.getState() && !Class363.Field1715.playerController.extendedReach() ? (double)a6.Method276() : 3.0;
                if (d > d2) {
                    Field1714 = null;
                    Class363.Field1715.objectMouseOver = new MovingObjectPosition(MovingObjectPosition.MovingObjectType.MISS, a3, null, new BlockPos(a3));
                }
            }
            if (Field1714 != null && (a2 < a5 || Class363.Field1715.objectMouseOver == null)) {
                Class363.Field1715.objectMouseOver = new MovingObjectPosition(Field1714, a3);
                if (Field1714 instanceof EntityLivingBase || Field1714 instanceof EntityItemFrame) {
                    Class363.Field1715.pointedEntity = Field1714;
                }
            }
            Class363.Field1715.mcProfiler.endSection();
        }
    }

    public static String Method606(NetworkPlayerInfo a) {
        String a2 = "";
        a2 = a.getDisplayName() != null ? a.getDisplayName().getFormattedText() : ScorePlayerTeam.formatPlayerName((Team)a.getPlayerTeam(), (String)a.getGameProfile().getName());
        if (Objects.nonNull((Object)GlobalModule.INSTANCE.Field3186) && !GlobalModule.INSTANCE.Field3186.Field2823.isEmpty() && PermissionManager.canUseFeature(Class363.Method598(-7104, -2384))) {
            Iterator iterator = GlobalModule.INSTANCE.Field3186.Field2823.Method1383();
            while (iterator.Method932()) {
                Class606 a3 = (Class606)iterator.Method933();
                if (!a.getGameProfile().getName().equals((Object)a3.Field2841)) continue;
                if (a3.Field2847) {
                    if (GlobalModule.INSTANCE.Field3186.Field2827.Method3740() < 5) continue;
                    if (a3.Field2838.equalsIgnoreCase(Class363.Method598(-7096, -22628))) {
                        a2 = a2.replace((CharSequence)a3.Field2841, (CharSequence)(a3.Field2841 + Class363.Method598(-7095, 24177) + a3.Field2840 + Class363.Method598(-7094, -8542).replace((CharSequence)a3.Field2840, (CharSequence)(Class363.Method598(-7102, -30891) + a3.Field2840))));
                        continue;
                    }
                    if (a3.Field2838.equalsIgnoreCase(Class363.Method598(-7100, 764))) {
                        a2 = a2.replace((CharSequence)a3.Field2841, (CharSequence)(a3.Field2841 + Class363.Method598(-7103, 24277) + a3.Field2840 + Class363.Method598(-7090, 17090).replace((CharSequence)a3.Field2840, (CharSequence)(Class363.Method598(-7098, -20137) + a3.Field2840))));
                        continue;
                    }
                    a2 = a2.replace((CharSequence)a3.Field2841, (CharSequence)(a3.Field2841 + Class363.Method598(-7101, 7617) + a3.Field2840 + Class363.Method598(-7090, 17090).replace((CharSequence)a3.Field2840, (CharSequence)(Class363.Method598(-7098, -20137) + a3.Field2840))));
                    continue;
                }
                if (a3.Field2838.equalsIgnoreCase(Class363.Method598(-7096, -22628))) {
                    a2 = a2.replace((CharSequence)a3.Field2841, (CharSequence)(a3.Field2841 + Class363.Method598(-7089, -348) + a3.Field2840 + Class363.Method598(-7099, 20182)));
                    continue;
                }
                if (a3.Field2838.equalsIgnoreCase(Class363.Method598(-7085, -1233))) {
                    a2 = a2.replace((CharSequence)a3.Field2841, (CharSequence)(a3.Field2841 + Class363.Method598(-7092, -21155) + a3.Field2840 + Class363.Method598(-7088, -22199)));
                    continue;
                }
                a2 = a2.replace((CharSequence)a3.Field2841, (CharSequence)(a3.Field2841 + Class363.Method598(-7093, -20674) + a3.Field2840 + Class363.Method598(-7088, -22199)));
            }
        }
        if (Class363.Method616()) {
            a2 = a2.replace((CharSequence)Class363.Field1715.thePlayer.getName(), (CharSequence)(Objects.nonNull((Object)GlobalModule.fakeName) ? GlobalModule.fakeName : GlobalModule.Field3149));
        }
        return a2;
    }

    private static boolean Method607(Entity a) {
        return a.canBeCollidedWith();
    }

    public static void Method608(GuiScreen a) {
        EventManager.Method2686(new Class655(a));
        if (Objects.isNull((Object)a) && GuiChest.class.Method3429((Object)Field1716)) {
            Field1723 = System.currentTimeMillis();
            Field1716 = null;
        }
        Field1716 = a.getClass();
    }

    public static float Method609(Entity a) {
        if (!a.equals((Object)Class363.Field1715.thePlayer)) {
            return a.prevRotationYaw;
        }
        return Perspective.Field2203 ? Perspective.Field2200 : Class363.Field1715.thePlayer.prevRotationYaw;
    }

    public static float Method610(Entity a) {
        if (!a.equals((Object)Class363.Field1715.thePlayer)) {
            return a.rotationYaw;
        }
        return Perspective.Field2203 ? Perspective.Field2200 : Class363.Field1715.thePlayer.rotationYaw;
    }

    public static boolean Method611() {
        return ModuleManager.getModule(NoFov.class).getState();
    }

    public static void Method612() {
        GlStateManager.pushMatrix();
        EventRender3D a = new EventRender3D(ReflectionUtils.Method2587());
        EventManager.Method2686(a);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.popMatrix();
    }

    public static boolean Method613() {
        ItemRender a = (ItemRender)ModuleManager.getModule(ItemRender.class);
        if (a.getState() && a.Field2374.isCurrentMode(Class363.Method598(-7097, -24298))) {
            GL11.glRotatef((float)(-Class363.Field1715.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(Class363.Field1715.gameSettings.thirdPersonView == 2 ? -Class363.Field1715.getRenderManager().playerViewX : Class363.Field1715.getRenderManager().playerViewX), (float)1.0f, (float)0.0f, (float)0.0f);
            GlStateManager.rotate((float)180.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            return false;
        }
        return true;
    }

    public static boolean Method614() {
        return ModuleManager.getModule(KeepSprint.class).getState();
    }

    public static float Method615(Entity a) {
        if (!a.equals((Object)Class363.Field1715.thePlayer)) {
            return a.prevRotationPitch;
        }
        return Perspective.Field2203 ? Perspective.Field2201 : Class363.Field1715.thePlayer.prevRotationPitch;
    }

    public static boolean Method616() {
        return ModuleManager.getModule(NameProtect.class).getState();
    }

    public static boolean Method617() {
        return GlobalModule.Field3158.Method2509();
    }

    public static ResourceLocation Method618() {
        return Class393.Field1938;
    }

    public static boolean Method619() {
        return Class363.Method616() && NameProtect.Field2717.Method2509() != false;
    }

    protected static float Method620(float a, float a2, float a3) {
        float a4;
        for (a4 = a2 - a; a4 < -180.0f; a4 += 360.0f) {
        }
        while (a4 >= 180.0f) {
            a4 -= 360.0f;
        }
        return a + a3 * a4;
    }

    public static boolean Method621() {
        return GlobalModule.Field3160.Method2509();
    }

    public static MovingObjectPosition Method622(float a) {
        Entity a2 = Field1715.getRenderViewEntity();
        MovingObjectPosition a3 = null;
        if (Class363.Field1715.theWorld != null) {
            Vec3 a4;
            Class363.Field1715.pointedEntity = null;
            Reach a5 = (Reach)ModuleManager.getModule(Reach.class);
            double a6 = a5.getState() && !Class363.Field1715.playerController.extendedReach() ? (double)a5.Method798() : (double)Class363.Field1715.playerController.getBlockReachDistance();
            Class363.Field1715.objectMouseOver = a2.rayTrace(a5.getState() && !Class363.Field1715.playerController.extendedReach() ? (double)a5.Field2488.Method2744().floatValue() : a6, a);
            double a7 = a6;
            Vec3 a8 = a2.getPositionEyes(a);
            boolean a9 = false;
            if (Class363.Field1715.playerController.extendedReach()) {
                a6 = 6.0;
                a7 = 6.0;
            } else if (a6 > 3.0) {
                a9 = true;
            }
            if (Class363.Field1715.objectMouseOver != null) {
                a7 = Class363.Field1715.objectMouseOver.hitVec.distanceTo(a8);
            }
            if (a5.getState() && !Class363.Field1715.playerController.extendedReach()) {
                a7 = a5.Method276();
                a4 = a2.rayTrace(a7, a);
                a7 = a4.hitVec.distanceTo(a8);
            }
            a4 = a2.getLook(a);
            Vec3 a10 = a8.addVector(a4.xCoord * a6, a4.yCoord * a6, a4.zCoord * a6);
            Entity a11 = null;
            Vec3 a12 = null;
            float a13 = 1.0f;
            List a14 = Class363.Field1715.theWorld.getEntitiesInAABBexcluding(a2, a2.getEntityBoundingBox().addCoord(a4.xCoord * a6, a4.yCoord * a6, a4.zCoord * a6).expand((double)a13, (double)a13, (double)a13), Predicates.and((Predicate)EntitySelectors.NOT_SPECTATING, Class363::Method607));
            double a15 = a7;
            Iterator iterator = a14.Method1383();
            while (iterator.Method932()) {
                Entity a16 = (Entity)iterator.Method933();
                HitBox a17 = (HitBox)ModuleManager.getModule(HitBox.class);
                float a18 = a17.Method1187(a16) ? a17.Field2607.Method2744().floatValue() : a16.getCollisionBorderSize();
                AxisAlignedBB a19 = a16.getEntityBoundingBox().expand((double)a18, (double)a18, (double)a18);
                MovingObjectPosition a20 = a19.calculateIntercept(a8, a10);
                if (a19.isVecInside(a8)) {
                    if (!(a15 >= 0.0)) continue;
                    a11 = a16;
                    a12 = a8;
                    a15 = 0.0;
                    continue;
                }
                double a21 = a8.distanceTo(a20.hitVec);
                if (!(a21 < a15) && a15 != 0.0) continue;
                if (a16 == a2.ridingEntity) {
                    if (a15 != 0.0) continue;
                    a11 = a16;
                    a12 = a20.hitVec;
                    continue;
                }
                a11 = a16;
                a12 = a20.hitVec;
                a15 = a21;
            }
            double d = a8.distanceTo(a12);
            double d2 = a5.getState() && !Class363.Field1715.playerController.extendedReach() ? (double)a5.Method276() : 3.0;
            if (d > d2) {
                a11 = null;
                a3 = new MovingObjectPosition(MovingObjectPosition.MovingObjectType.MISS, a12, null, new BlockPos(a12));
            }
            if (a15 < a7 || Class363.Field1715.objectMouseOver == null) {
                a3 = new MovingObjectPosition(a11, a12);
                if (a11 instanceof EntityLivingBase || a11 instanceof EntityItemFrame) {
                    Class363.Field1715.pointedEntity = a11;
                }
            }
        }
        return a3;
    }

    public static float Method623() {
        float a = NoFov.Field2239.Method2744().floatValue();
        if (Class363.Field1715.thePlayer.isUsingItem() && Class363.Field1715.thePlayer.getItemInUse().getItem() == Items.bow && NoFov.Field2240.Method2509().booleanValue()) {
            int a2 = Class363.Field1715.thePlayer.getItemInUseDuration();
            float a3 = (float)a2 / 20.0f;
            a3 = a3 > 1.0f ? 1.0f : (a3 *= a3);
            a *= 1.0f - a3 * 0.15f;
        }
        return a;
    }

    public static void Method624(int a, int a2) {
        if (!GlobalModule.Field3171.Method2509().booleanValue() || Class363.Method626()) {
            Mouse.setCursorPosition((int)a, (int)a2);
            Mouse.setGrabbed((boolean)false);
        }
    }

    public static void Method625() {
        Class347.Field1663 = new Framebuffer(Class363.Field1715.displayWidth, Class363.Field1715.displayHeight, false);
        Class347.Field1663.setFramebufferColor(0.0f, 0.0f, 0.0f, 0.0f);
        Class347.Method375(Class347.Field1667, Class347.Field1663);
    }

    public static boolean Method626() {
        return System.currentTimeMillis() - Field1723 > 200L;
    }

    public static void Method627(Object a) {
        if (a.Method3429((Object)Minecraft.getMinecraft().thePlayer) && a instanceof AbstractClientPlayer && GlobalModule.Field3187.Method2509().booleanValue()) {
            Class346.Method305((AbstractClientPlayer)Minecraft.getMinecraft().thePlayer, Class393.Field1937);
        } else if (a.Method3429((Object)Minecraft.getMinecraft().thePlayer) && a instanceof AbstractClientPlayer) {
            Class346.Method305((AbstractClientPlayer)Minecraft.getMinecraft().thePlayer, null);
        }
    }

    public static void Method628() {
        if (GlobalModule.Field3146.Method2509().booleanValue()) {
            GL11.glPopMatrix();
        }
    }

    public static float Method629(float a, float a2, float a3, float a4, int a5) {
        float a6 = EventMotion.Field2892;
        float a7 = EventMotion.Field2893;
        float a8 = EventMotion.Field2894;
        float a9 = EventMotion.Field2895;
        a = Class363.Method620(a8, a6, a4);
        float a10 = Class363.Method620(a8, a6, a4) - a;
        float a11 = Class363.Method620(a9, a7, a4);
        a2 = a10;
        a3 = a11;
        return a;
    }

    public static boolean Method630() {
        if (Class363.Field1715.inGameHasFocus && Display.isActive()) {
            if (!Perspective.Field2203) {
                return true;
            }
            Class363.Field1715.mouseHelper.mouseXYChange();
            float a = Class363.Field1715.gameSettings.mouseSensitivity * 0.6f + 0.2f;
            float a2 = a * a * a * 8.0f;
            float a3 = (float)Class363.Field1715.mouseHelper.deltaX * a2;
            float a4 = (float)Class363.Field1715.mouseHelper.deltaY * a2;
            Perspective.Field2200 += a3 * 0.15f;
            Perspective.Field2201 += a4 * 0.15f;
            if (Perspective.Field2201 > 90.0f) {
                Perspective.Field2201 = 90.0f;
            }
            if (Perspective.Field2201 < -90.0f) {
                Perspective.Field2201 = -90.0f;
            }
        }
        return false;
    }

    public static float Method631(Object a) {
        Entity a2 = (Entity)a;
        HitBox a3 = (HitBox)ModuleManager.getModule2(HitBox.class);
        return a3.Method1187(a2) ? a3.Field2607.Method2744().floatValue() : 0.1f;
    }

    public static boolean Method632() {
        return GlobalModule.Field3148.Method2509() != false && Class749.Method1608();
    }

    private static boolean Method633(Entity a) {
        return a.canBeCollidedWith();
    }

    public static void Method634(EntityLivingBase a, boolean a2) {
        Class645 a3 = new Class645(a, a2);
        EventManager.Method2686(a3);
    }

    public static boolean Method635() {
        return !Class363.Field1715.playerController.getIsHittingBlock() || GlobalModule.Field3184.Method2509() != false;
    }

    public static boolean Method636(Object a) {
        return a instanceof EntityPlayerSP && ModuleManager.getModule(KillAura.class).getState() && ((KillAura)ModuleManager.getModule2(KillAura.class)).Field2521.Method2509() != false && KillAura.Field2524 != null;
    }

    public static boolean Method637() {
        return !Class363.Field1715.thePlayer.isUsingItem() || GlobalModule.Field3184.Method2509() != false;
    }

    public static void Method638(Object a) {
        EventManager.Method2686(new Class652((BlockPos)a));
    }

    public static boolean Method639() {
        return ModuleManager.getModule(Reach.class).getState();
    }

    public static String Method640(String a) {
        String a2 = a;
        if (Objects.isNull((Object)Class363.Field1715.thePlayer) || !Class363.Method616()) {
            return a2;
        }
        if (Class363.Method616() && Objects.nonNull((Object)a2)) {
            a2 = a2.replace((CharSequence)Class363.Field1715.thePlayer.getName(), (CharSequence)(Objects.nonNull((Object)GlobalModule.fakeName) ? GlobalModule.fakeName : GlobalModule.Field3149));
        }
        return a2;
    }

    public static boolean Method641() {
        return Keyboard.getEventKey() == 0 && Keyboard.getEventCharacter() >= ' ' || Keyboard.getEventKeyState();
    }

    public static boolean Method642() {
        return ModuleManager.getModule(NoSlowDown.class).getState() || KillAura.Field2493;
    }

    static {
        Class614.Method2232(52, Class363.class);
        Class363.Method644();
    }

    public static void Method643() {
        GlStateManager.pushMatrix();
        EventRender2D a = new EventRender2D(ReflectionUtils.Method2587());
        EventManager.Method2686(a);
        GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GlStateManager.popMatrix();
    }

    private static native /* synthetic */ void Method644();
}