/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.math.BigDecimal
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  net.minecraft.block.Block
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.network.login.server.S02PacketLoginSuccess
 *  net.minecraft.network.play.server.S07PacketRespawn
 *  net.minecraft.util.AxisAlignedBB
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.MathHelper
 *  org.lwjgl.opengl.GL11
 */
package trash.foodbyte.module.impl.world;

import awsl.Class363;
import awsl.Class448;
import awsl.Class565;
import awsl.Class628;
import awsl.Class649;
import awsl.Class652;
import eventapi.EventTarget;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import native0.Class614;
import net.minecraft.block.Block;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import obfuscate.a;
import org.lwjgl.opengl.GL11;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventRender2D;
import trash.foodbyte.event.EventRender3D;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ReflectionUtils;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.RenderUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class XRay
extends Module {
    public static HashMap Field2242;
    public BooleanValue Field2243;
    private int Field2244 = 3000;
    public FloatValue Field2245;
    public FloatValue Field2246;
    public BooleanValue Field2247;
    public BooleanValue Field2248;
    private static final String[] Field2249;
    public FloatValue Field2250;
    public BooleanValue Field2251;
    public BooleanValue Field2252;
    private static final ArrayList Field2253;
    public BooleanValue Field2254;
    public BooleanValue Field2255;
    public BooleanValue Field2256;
    public BooleanValue Field2257;
    public BooleanValue Field2258;
    public BooleanValue Field2259;
    public BooleanValue Field2260;
    private static final String[] Field2261;
    public BooleanValue Field2262;
    public static ArrayList Field2263;
    private static final Block[] Field2264;
    public FloatValue Field2265 = new FloatValue(XRay.Method754(-15344, 9070), XRay.Method754(-15342, -25234), 160.0, 0.0, 255.0, 5.0, XRay.Method754(-15327, 32092));
    private final Class448 Field2266;

    public static void Method2111(double a, double a2, double a3, double a4, int a5) {
        float a6 = (float)(a5 >> 24 & 0xFF) / 255.0f;
        float a7 = (float)(a5 >> 16 & 0xFF) / 255.0f;
        float a8 = (float)(a5 >> 8 & 0xFF) / 255.0f;
        float a9 = (float)(a5 & 0xFF) / 255.0f;
        GL11.glColor4f((float)a7, (float)a8, (float)a9, (float)a6);
        RenderUtils.Method1105(a, a2, a + a3, a2 + a4, a5);
    }

    public XRay() {
        super(XRay.Method754(-15313, -29943), Category.WORLD);
        this.Field2246 = new FloatValue(XRay.Method754(-15344, 9070), XRay.Method754(-15322, -21035), 160.0, 0.0, 255.0, 5.0, XRay.Method754(-15316, 1905));
        this.Field2245 = new FloatValue(XRay.Method754(-15344, 9070), XRay.Method754(-15308, -307), 3.0, 0.5, 5.0, 0.1, XRay.Method754(-15328, 3344));
        this.Field2250 = new FloatValue(XRay.Method754(-15344, 9070), XRay.Method754(-15339, 24899), 4.0, 0.0, 7.0, 1.0, XRay.Method754(-15312, 26101));
        this.Field2260 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15341, -20360), (Boolean)true, XRay.Method754(-15337, 25857));
        this.Field2247 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15325, 13773), (Boolean)false, XRay.Method754(-15309, 1779));
        this.Field2251 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15301, 32387), (Boolean)false, XRay.Method754(-15297, -10065));
        this.Field2255 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15299, -32107), (Boolean)true, XRay.Method754(-15321, 20155));
        this.Field2243 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15320, 6478), (Boolean)false, XRay.Method754(-15323, -28320));
        this.Field2252 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15304, -2288), (Boolean)false, XRay.Method754(-15318, 22672));
        this.Field2262 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15314, 5056), (Boolean)false, XRay.Method754(-15302, 12991));
        this.Field2259 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15326, -5781), (Boolean)false, "\u94c1");
        this.Field2257 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15306, -26633), (Boolean)true, XRay.Method754(-15303, -23980));
        this.Field2248 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15315, 10103), (Boolean)true, XRay.Method754(-15324, 25838));
        this.Field2256 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15300, -3639), (Boolean)false, XRay.Method754(-15310, -8482));
        this.Field2258 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15338, -2475), (Boolean)false, XRay.Method754(-15307, -1612));
        this.Field2254 = new BooleanValue(XRay.Method754(-15344, 9070), XRay.Method754(-15319, -29472), (Boolean)false, XRay.Method754(-15298, 13315));
        this.Field2266 = new Class448(this);
    }

    public boolean Method2289(BlockPos a2) {
        int a3 = Block.getIdFromBlock((Block)XRay.mc.theWorld.getBlockState(a2).getBlock());
        if (a3 == 83 && this.Field2252.getBooleanValue().booleanValue()) {
            return false;
        }
        if (a3 == 16 && this.Field2262.getBooleanValue().booleanValue()) {
            return false;
        }
        if (a3 == 15 && this.Field2259.getBooleanValue().booleanValue()) {
            return false;
        }
        if (a3 == 14 && this.Field2257.getBooleanValue().booleanValue()) {
            return false;
        }
        if (a3 == 56 && this.Field2248.getBooleanValue().booleanValue()) {
            return false;
        }
        if (a3 == 73 && this.Field2256.getBooleanValue().booleanValue()) {
            return false;
        }
        if (a3 == 74 && this.Field2256.getBooleanValue().booleanValue()) {
            return false;
        }
        if (a3 == 129 && this.Field2258.getBooleanValue().booleanValue()) {
            return false;
        }
        return a3 != 21 || this.Field2254.getBooleanValue() == false;
    }

    private static String Method754(int n, int n2) {
        int n3 = (n ^ 0xFFFFC433) & 0xFFFF;
        if (Field2261[n3] == null) {
            int n4;
            char[] cArray = Field2249[n3].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n4 = 171;
                    break;
                }
                case 1: {
                    n4 = 216;
                    break;
                }
                case 2: {
                    n4 = 229;
                    break;
                }
                case 3: {
                    n4 = 61;
                    break;
                }
                case 4: {
                    n4 = 158;
                    break;
                }
                case 5: {
                    n4 = 243;
                    break;
                }
                case 6: {
                    n4 = 114;
                    break;
                }
                case 7: {
                    n4 = 55;
                    break;
                }
                case 8: {
                    n4 = 56;
                    break;
                }
                case 9: {
                    n4 = 169;
                    break;
                }
                case 10: {
                    n4 = 185;
                    break;
                }
                case 11: {
                    n4 = 99;
                    break;
                }
                case 12: {
                    n4 = 241;
                    break;
                }
                case 13: {
                    n4 = 223;
                    break;
                }
                case 14: {
                    n4 = 72;
                    break;
                }
                case 15: {
                    n4 = 50;
                    break;
                }
                case 16: {
                    n4 = 230;
                    break;
                }
                case 17: {
                    n4 = 74;
                    break;
                }
                case 18: {
                    n4 = 194;
                    break;
                }
                case 19: {
                    n4 = 191;
                    break;
                }
                case 20: {
                    n4 = 107;
                    break;
                }
                case 21: {
                    n4 = 60;
                    break;
                }
                case 22: {
                    n4 = 68;
                    break;
                }
                case 23: {
                    n4 = 31;
                    break;
                }
                case 24: {
                    n4 = 17;
                    break;
                }
                case 25: {
                    n4 = 211;
                    break;
                }
                case 26: {
                    n4 = 240;
                    break;
                }
                case 27: {
                    n4 = 234;
                    break;
                }
                case 28: {
                    n4 = 85;
                    break;
                }
                case 29: {
                    n4 = 34;
                    break;
                }
                case 30: {
                    n4 = 250;
                    break;
                }
                case 31: {
                    n4 = 202;
                    break;
                }
                case 32: {
                    n4 = 138;
                    break;
                }
                case 33: {
                    n4 = 23;
                    break;
                }
                case 34: {
                    n4 = 178;
                    break;
                }
                case 35: {
                    n4 = 95;
                    break;
                }
                case 36: {
                    n4 = 37;
                    break;
                }
                case 37: {
                    n4 = 91;
                    break;
                }
                case 38: {
                    n4 = 93;
                    break;
                }
                case 39: {
                    n4 = 206;
                    break;
                }
                case 40: {
                    n4 = 118;
                    break;
                }
                case 41: {
                    n4 = 203;
                    break;
                }
                case 42: {
                    n4 = 64;
                    break;
                }
                case 43: {
                    n4 = 29;
                    break;
                }
                case 44: {
                    n4 = 217;
                    break;
                }
                case 45: {
                    n4 = 209;
                    break;
                }
                case 46: {
                    n4 = 213;
                    break;
                }
                case 47: {
                    n4 = 8;
                    break;
                }
                case 48: {
                    n4 = 88;
                    break;
                }
                case 49: {
                    n4 = 139;
                    break;
                }
                case 50: {
                    n4 = 228;
                    break;
                }
                case 51: {
                    n4 = 38;
                    break;
                }
                case 52: {
                    n4 = 7;
                    break;
                }
                case 53: {
                    n4 = 227;
                    break;
                }
                case 54: {
                    n4 = 89;
                    break;
                }
                case 55: {
                    n4 = 137;
                    break;
                }
                case 56: {
                    n4 = 152;
                    break;
                }
                case 57: {
                    n4 = 90;
                    break;
                }
                case 58: {
                    n4 = 110;
                    break;
                }
                case 59: {
                    n4 = 109;
                    break;
                }
                case 60: {
                    n4 = 0;
                    break;
                }
                case 61: {
                    n4 = 104;
                    break;
                }
                case 62: {
                    n4 = 218;
                    break;
                }
                case 63: {
                    n4 = 231;
                    break;
                }
                case 64: {
                    n4 = 4;
                    break;
                }
                case 65: {
                    n4 = 251;
                    break;
                }
                case 66: {
                    n4 = 208;
                    break;
                }
                case 67: {
                    n4 = 183;
                    break;
                }
                case 68: {
                    n4 = 116;
                    break;
                }
                case 69: {
                    n4 = 236;
                    break;
                }
                case 70: {
                    n4 = 196;
                    break;
                }
                case 71: {
                    n4 = 166;
                    break;
                }
                case 72: {
                    n4 = 249;
                    break;
                }
                case 73: {
                    n4 = 51;
                    break;
                }
                case 74: {
                    n4 = 163;
                    break;
                }
                case 75: {
                    n4 = 122;
                    break;
                }
                case 76: {
                    n4 = 232;
                    break;
                }
                case 77: {
                    n4 = 188;
                    break;
                }
                case 78: {
                    n4 = 145;
                    break;
                }
                case 79: {
                    n4 = 193;
                    break;
                }
                case 80: {
                    n4 = 1;
                    break;
                }
                case 81: {
                    n4 = 131;
                    break;
                }
                case 82: {
                    n4 = 177;
                    break;
                }
                case 83: {
                    n4 = 174;
                    break;
                }
                case 84: {
                    n4 = 9;
                    break;
                }
                case 85: {
                    n4 = 221;
                    break;
                }
                case 86: {
                    n4 = 180;
                    break;
                }
                case 87: {
                    n4 = 214;
                    break;
                }
                case 88: {
                    n4 = 76;
                    break;
                }
                case 89: {
                    n4 = 22;
                    break;
                }
                case 90: {
                    n4 = 115;
                    break;
                }
                case 91: {
                    n4 = 143;
                    break;
                }
                case 92: {
                    n4 = 94;
                    break;
                }
                case 93: {
                    n4 = 134;
                    break;
                }
                case 94: {
                    n4 = 254;
                    break;
                }
                case 95: {
                    n4 = 83;
                    break;
                }
                case 96: {
                    n4 = 151;
                    break;
                }
                case 97: {
                    n4 = 42;
                    break;
                }
                case 98: {
                    n4 = 245;
                    break;
                }
                case 99: {
                    n4 = 187;
                    break;
                }
                case 100: {
                    n4 = 150;
                    break;
                }
                case 101: {
                    n4 = 79;
                    break;
                }
                case 102: {
                    n4 = 132;
                    break;
                }
                case 103: {
                    n4 = 126;
                    break;
                }
                case 104: {
                    n4 = 168;
                    break;
                }
                case 105: {
                    n4 = 173;
                    break;
                }
                case 106: {
                    n4 = 225;
                    break;
                }
                case 107: {
                    n4 = 130;
                    break;
                }
                case 108: {
                    n4 = 238;
                    break;
                }
                case 109: {
                    n4 = 119;
                    break;
                }
                case 110: {
                    n4 = 190;
                    break;
                }
                case 111: {
                    n4 = 40;
                    break;
                }
                case 112: {
                    n4 = 18;
                    break;
                }
                case 113: {
                    n4 = 124;
                    break;
                }
                case 114: {
                    n4 = 161;
                    break;
                }
                case 115: {
                    n4 = 2;
                    break;
                }
                case 116: {
                    n4 = 36;
                    break;
                }
                case 117: {
                    n4 = 155;
                    break;
                }
                case 118: {
                    n4 = 207;
                    break;
                }
                case 119: {
                    n4 = 16;
                    break;
                }
                case 120: {
                    n4 = 127;
                    break;
                }
                case 121: {
                    n4 = 30;
                    break;
                }
                case 122: {
                    n4 = 78;
                    break;
                }
                case 123: {
                    n4 = 237;
                    break;
                }
                case 124: {
                    n4 = 172;
                    break;
                }
                case 125: {
                    n4 = 32;
                    break;
                }
                case 126: {
                    n4 = 73;
                    break;
                }
                case 127: {
                    n4 = 148;
                    break;
                }
                case 128: {
                    n4 = 128;
                    break;
                }
                case 129: {
                    n4 = 45;
                    break;
                }
                case 130: {
                    n4 = 175;
                    break;
                }
                case 131: {
                    n4 = 204;
                    break;
                }
                case 132: {
                    n4 = 179;
                    break;
                }
                case 133: {
                    n4 = 53;
                    break;
                }
                case 134: {
                    n4 = 156;
                    break;
                }
                case 135: {
                    n4 = 47;
                    break;
                }
                case 136: {
                    n4 = 201;
                    break;
                }
                case 137: {
                    n4 = 235;
                    break;
                }
                case 138: {
                    n4 = 5;
                    break;
                }
                case 139: {
                    n4 = 84;
                    break;
                }
                case 140: {
                    n4 = 81;
                    break;
                }
                case 141: {
                    n4 = 86;
                    break;
                }
                case 142: {
                    n4 = 222;
                    break;
                }
                case 143: {
                    n4 = 244;
                    break;
                }
                case 144: {
                    n4 = 106;
                    break;
                }
                case 145: {
                    n4 = 24;
                    break;
                }
                case 146: {
                    n4 = 149;
                    break;
                }
                case 147: {
                    n4 = 176;
                    break;
                }
                case 148: {
                    n4 = 195;
                    break;
                }
                case 149: {
                    n4 = 125;
                    break;
                }
                case 150: {
                    n4 = 26;
                    break;
                }
                case 151: {
                    n4 = 113;
                    break;
                }
                case 152: {
                    n4 = 65;
                    break;
                }
                case 153: {
                    n4 = 197;
                    break;
                }
                case 154: {
                    n4 = 160;
                    break;
                }
                case 155: {
                    n4 = 246;
                    break;
                }
                case 156: {
                    n4 = 14;
                    break;
                }
                case 157: {
                    n4 = 144;
                    break;
                }
                case 158: {
                    n4 = 57;
                    break;
                }
                case 159: {
                    n4 = 15;
                    break;
                }
                case 160: {
                    n4 = 54;
                    break;
                }
                case 161: {
                    n4 = 103;
                    break;
                }
                case 162: {
                    n4 = 101;
                    break;
                }
                case 163: {
                    n4 = 182;
                    break;
                }
                case 164: {
                    n4 = 135;
                    break;
                }
                case 165: {
                    n4 = 146;
                    break;
                }
                case 166: {
                    n4 = 111;
                    break;
                }
                case 167: {
                    n4 = 35;
                    break;
                }
                case 168: {
                    n4 = 192;
                    break;
                }
                case 169: {
                    n4 = 253;
                    break;
                }
                case 170: {
                    n4 = 255;
                    break;
                }
                case 171: {
                    n4 = 219;
                    break;
                }
                case 172: {
                    n4 = 75;
                    break;
                }
                case 173: {
                    n4 = 39;
                    break;
                }
                case 174: {
                    n4 = 12;
                    break;
                }
                case 175: {
                    n4 = 100;
                    break;
                }
                case 176: {
                    n4 = 82;
                    break;
                }
                case 177: {
                    n4 = 205;
                    break;
                }
                case 178: {
                    n4 = 153;
                    break;
                }
                case 179: {
                    n4 = 215;
                    break;
                }
                case 180: {
                    n4 = 121;
                    break;
                }
                case 181: {
                    n4 = 226;
                    break;
                }
                case 182: {
                    n4 = 252;
                    break;
                }
                case 183: {
                    n4 = 3;
                    break;
                }
                case 184: {
                    n4 = 105;
                    break;
                }
                case 185: {
                    n4 = 239;
                    break;
                }
                case 186: {
                    n4 = 11;
                    break;
                }
                case 187: {
                    n4 = 69;
                    break;
                }
                case 188: {
                    n4 = 200;
                    break;
                }
                case 189: {
                    n4 = 136;
                    break;
                }
                case 190: {
                    n4 = 199;
                    break;
                }
                case 191: {
                    n4 = 43;
                    break;
                }
                case 192: {
                    n4 = 164;
                    break;
                }
                case 193: {
                    n4 = 198;
                    break;
                }
                case 194: {
                    n4 = 20;
                    break;
                }
                case 195: {
                    n4 = 63;
                    break;
                }
                case 196: {
                    n4 = 27;
                    break;
                }
                case 197: {
                    n4 = 102;
                    break;
                }
                case 198: {
                    n4 = 141;
                    break;
                }
                case 199: {
                    n4 = 41;
                    break;
                }
                case 200: {
                    n4 = 212;
                    break;
                }
                case 201: {
                    n4 = 19;
                    break;
                }
                case 202: {
                    n4 = 233;
                    break;
                }
                case 203: {
                    n4 = 186;
                    break;
                }
                case 204: {
                    n4 = 184;
                    break;
                }
                case 205: {
                    n4 = 242;
                    break;
                }
                case 206: {
                    n4 = 66;
                    break;
                }
                case 207: {
                    n4 = 62;
                    break;
                }
                case 208: {
                    n4 = 248;
                    break;
                }
                case 209: {
                    n4 = 92;
                    break;
                }
                case 210: {
                    n4 = 98;
                    break;
                }
                case 211: {
                    n4 = 71;
                    break;
                }
                case 212: {
                    n4 = 28;
                    break;
                }
                case 213: {
                    n4 = 46;
                    break;
                }
                case 214: {
                    n4 = 123;
                    break;
                }
                case 215: {
                    n4 = 112;
                    break;
                }
                case 216: {
                    n4 = 210;
                    break;
                }
                case 217: {
                    n4 = 157;
                    break;
                }
                case 218: {
                    n4 = 108;
                    break;
                }
                case 219: {
                    n4 = 87;
                    break;
                }
                case 220: {
                    n4 = 133;
                    break;
                }
                case 221: {
                    n4 = 224;
                    break;
                }
                case 222: {
                    n4 = 58;
                    break;
                }
                case 223: {
                    n4 = 77;
                    break;
                }
                case 224: {
                    n4 = 48;
                    break;
                }
                case 225: {
                    n4 = 80;
                    break;
                }
                case 226: {
                    n4 = 154;
                    break;
                }
                case 227: {
                    n4 = 247;
                    break;
                }
                case 228: {
                    n4 = 10;
                    break;
                }
                case 229: {
                    n4 = 52;
                    break;
                }
                case 230: {
                    n4 = 129;
                    break;
                }
                case 231: {
                    n4 = 189;
                    break;
                }
                case 232: {
                    n4 = 13;
                    break;
                }
                case 233: {
                    n4 = 142;
                    break;
                }
                case 234: {
                    n4 = 162;
                    break;
                }
                case 235: {
                    n4 = 44;
                    break;
                }
                case 236: {
                    n4 = 49;
                    break;
                }
                case 237: {
                    n4 = 59;
                    break;
                }
                case 238: {
                    n4 = 70;
                    break;
                }
                case 239: {
                    n4 = 140;
                    break;
                }
                case 240: {
                    n4 = 25;
                    break;
                }
                case 241: {
                    n4 = 170;
                    break;
                }
                case 242: {
                    n4 = 67;
                    break;
                }
                case 243: {
                    n4 = 147;
                    break;
                }
                case 244: {
                    n4 = 120;
                    break;
                }
                case 245: {
                    n4 = 96;
                    break;
                }
                case 246: {
                    n4 = 6;
                    break;
                }
                case 247: {
                    n4 = 167;
                    break;
                }
                case 248: {
                    n4 = 220;
                    break;
                }
                case 249: {
                    n4 = 33;
                    break;
                }
                case 250: {
                    n4 = 117;
                    break;
                }
                case 251: {
                    n4 = 21;
                    break;
                }
                case 252: {
                    n4 = 165;
                    break;
                }
                case 253: {
                    n4 = 181;
                    break;
                }
                case 254: {
                    n4 = 159;
                    break;
                }
                default: {
                    n4 = 97;
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
            XRay.Field2261[n3] = new String(cArray).intern();
        }
        return Field2261[n3];
    }

    private void Method2096(BlockPos a2) {
        float a3 = ReflectionUtils.getRenderPartialTicks();
        double a4 = (double)a2.getX() - XRay.mc.getRenderManager().viewerPosX + 0.5;
        double a5 = (double)a2.getY() - XRay.mc.getRenderManager().viewerPosY + 0.5;
        double a6 = (double)a2.getZ() - XRay.mc.getRenderManager().viewerPosZ + 0.5;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        a[] aArray = Class448.Method2461();
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        a[] a7 = aArray;
        GL11.glLineWidth((float)1.0f);
        float a8 = (float)(XRay.mc.thePlayer.posX - (double)a2.getX());
        float a9 = (float)(XRay.mc.thePlayer.posY - (double)a2.getY());
        float a10 = (float)(XRay.mc.thePlayer.posZ - (double)a2.getZ());
        int a11 = Block.getIdFromBlock((Block)XRay.mc.theWorld.getBlockState(a2).getBlock());
        float a12 = this.Field2246.getFloatValue().floatValue() / 255.0f;
        if (a11 == 83) {
            GL11.glColor4f((float)0.38039216f, (float)0.63529414f, (float)0.15686275f, (float)a12);
        }
        if (a11 == 16) {
            GL11.glColor4f((float)0.047058824f, (float)0.047058824f, (float)0.047058824f, (float)a12);
        }
        if (a11 == 15) {
            GL11.glColor4f((float)0.8235294f, (float)0.8235294f, (float)0.8235294f, (float)a12);
        }
        if (a11 == 14) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)0.0f, (float)a12);
        }
        if (a11 == 56) {
            GL11.glColor4f((float)0.0f, (float)0.78431374f, (float)0.78431374f, (float)a12);
        }
        if (a11 == 73) {
            GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.0f, (float)a12);
        }
        if (a11 == 74) {
            GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.0f, (float)a12);
        }
        if (a11 == 129) {
            GL11.glColor4f((float)0.0f, (float)0.7921569f, (float)0.1882353f, (float)a12);
        }
        if (a11 == 21) {
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.3882353f, (float)a12);
        }
        GL11.glLoadIdentity();
        boolean a13 = XRay.mc.gameSettings.viewBobbing;
        XRay.mc.gameSettings.viewBobbing = false;
        ReflectionUtils.setOrientCamera(a3);
        GL11.glBegin((int)3);
        GL11.glVertex3d((double)0.0, (double)XRay.mc.thePlayer.getEyeHeight(), (double)0.0);
        GL11.glVertex3d((double)a4, (double)a5, (double)a6);
        GL11.glVertex3d((double)a4, (double)a5, (double)a6);
        GL11.glEnd();
        XRay.mc.gameSettings.viewBobbing = a13;
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    @EventTarget
    public void Method2290(Class652 a2) {
        BlockPos a3 = new BlockPos(a2.Field2924.getX(), a2.Field2924.getY(), a2.Field2924.getZ());
        if ((this.Field2247.getBooleanValue().booleanValue() || this.Field2251.getBooleanValue().booleanValue()) && !Field2263.contains((Object)a3)) {
            double d = this.Method2291(a3);
            double d2 = XRay.mc.thePlayer.posY > 60.0 ? 50.0 : 60.0;
            if (d < d2 && Field2253.contains((Object)Block.getIdFromBlock((Block)XRay.mc.theWorld.getBlockState(a3).getBlock()))) {
                Field2263.Method2530((Object)a3);
            }
        }
    }

    @EventTarget
    public void Method810(EventRender2D a2) {
        this.Field2244 = (int)(this.Field2245.getFloatValue().floatValue() * 1000.0f);
        if (!ServerUtils.isPlayingMegaWalls() && this.Field2260.getBooleanValue().booleanValue() && XRay.mc.thePlayer.posY <= 25.0) {
            if (this.Field2266.Method2455(this.Field2244)) {
                this.Method258();
                this.Field2266.Method2456();
            }
            float a3 = this.Field2266.Method2459();
            ScaledResolution a4 = new ScaledResolution(mc);
            Color a5 = a3 >= 0.0f ? RenderUtils.Method1139(new float[]{0.0f, 0.5f, 1.0f}, new Color[]{Color.RED, Color.YELLOW, new Color(0, 153, 255)}, a3 / (float)this.Field2244).brighter() : Color.RED;
            XRay.Method2111((double)a4.getScaledWidth() / 2.0 - 60.5, (double)a4.getScaledHeight() - 70.5, 121.0, 3.0, new Color(0, 0, 0, 150).getRGB());
            XRay.Method2111((double)a4.getScaledWidth() / 2.0 - 60.0, (double)a4.getScaledHeight() - 70.0, 120.0 * (double)(a3 / (float)this.Field2244), 2.0, a5.getRGB());
            Class565.Field2636.Method1222(XRay.Method754(-15305, -4127), (float)a4.getScaledWidth() / 2.0f, a4.getScaledHeight() - 79, -1);
            Class565.Field2636.Method1217(BigDecimal.valueOf((double)(((float)this.Field2244 - a3) / 1000.0f)).setScale(1, 4) + "s", (float)a4.getScaledWidth() / 2.0f - Class565.Field2636.Method1225(BigDecimal.valueOf((double)(((float)this.Field2244 - a3) / 1000.0f)).setScale(1, 4) + "s") + 60.0f, a4.getScaledHeight() - 79, -1);
        }
    }

    static {
        Class614.Method2232(11, XRay.class);
        XRay.Method2065();
    }

    @EventTarget
    public void Method1625(Class649 a2) {
        BlockPos a3;
        if ((this.Field2247.getBooleanValue().booleanValue() || this.Field2251.getBooleanValue().booleanValue()) && Block.getIdFromBlock((Block)XRay.mc.theWorld.getBlockState(a3 = new BlockPos(a2.Method3513(), a2.Method3542(), a2.Method3543())).getBlock()) == 83 && !Field2263.contains((Object)a3)) {
            Field2263.Method2530((Object)a3);
        }
    }

    @Override
    public void onDisable() {
        Class363.Field1713 = false;
        Field2263.clear();
        Field2242.clear();
        if (!this.Method1026()) {
            return;
        }
        XRay.mc.renderGlobal.loadRenderers();
    }

    @EventTarget
    public void Method801(EventTickUpdate a2) {
        for (int a3 = 0; a3 < Field2263.Method1799(); ++a3) {
            BlockPos a4 = (BlockPos)Field2263.get(a3);
            int a5 = Block.getIdFromBlock((Block)XRay.mc.theWorld.getBlockState(a4).getBlock());
            if (Field2253.contains((Object)a5)) continue;
            Field2263.remove(a3);
        }
    }

    @Class628
    public native void Method258();

    @Override
    public void onEnable() {
        if (!GlobalModule.Field3188) {
            ChatUtils.addChatMessage(XRay.Method754(-15311, -19201));
            ChatUtils.addChatMessage(XRay.Method754(-15343, 2588));
            this.setState(false);
            return;
        }
        Field2263.clear();
        Field2242.clear();
        Class363.Field1722 = this.Field2243.getBooleanValue();
        Class363.Field1721 = this.Field2255.getBooleanValue();
        Class363.Field1719 = this.Field2265.getFloatValue().intValue();
        Class363.Field1713 = true;
        this.Field2266.Method2457((long)(this.Field2245.getFloatValue().floatValue() * 1000.0f));
        if (!this.Method1026()) {
            return;
        }
        XRay.mc.renderGlobal.loadRenderers();
        int a2 = (int)XRay.mc.thePlayer.posX;
        int a3 = (int)XRay.mc.thePlayer.posY;
        int a4 = (int)XRay.mc.thePlayer.posZ;
        XRay.mc.renderGlobal.markBlockRangeForRenderUpdate(a2 - 900, a3 - 900, a4 - 900, a2 + 900, a3 + 900, a4 + 900);
    }

    private void Method1178(BlockPos a2) {
        double a3 = (double)a2.getX() - XRay.mc.getRenderManager().viewerPosX;
        double a4 = (double)a2.getY() - XRay.mc.getRenderManager().viewerPosY;
        double a5 = (double)a2.getZ() - XRay.mc.getRenderManager().viewerPosZ;
        int a6 = Block.getIdFromBlock((Block)XRay.mc.theWorld.getBlockState(a2).getBlock());
        float a7 = this.Field2246.getFloatValue().floatValue() / 255.0f;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)1.0f);
        if (a6 == 83) {
            GL11.glColor4f((float)0.38039216f, (float)0.63529414f, (float)0.15686275f, (float)a7);
        } else if (a6 == 16) {
            GL11.glColor4f((float)0.047058824f, (float)0.047058824f, (float)0.047058824f, (float)a7);
        } else if (a6 == 15) {
            GL11.glColor4f((float)0.8235294f, (float)0.8235294f, (float)0.8235294f, (float)a7);
        } else if (a6 == 14) {
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)0.0f, (float)a7);
        } else if (a6 == 56) {
            GL11.glColor4f((float)0.0f, (float)0.78431374f, (float)0.78431374f, (float)a7);
        } else if (a6 == 73) {
            GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.0f, (float)a7);
        } else if (a6 == 74) {
            GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.0f, (float)a7);
        } else if (a6 == 129) {
            GL11.glColor4f((float)0.0f, (float)0.7921569f, (float)0.1882353f, (float)a7);
        } else if (a6 == 21) {
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.3882353f, (float)a7);
        }
        RenderUtils.Method1098(new AxisAlignedBB(a3, a4, a5, a3 + 1.0, a4 + 1.0, a5 + 1.0));
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    @EventTarget
    public void Method802(EventRender3D a2) {
        BlockPos a3;
        Iterator iterator;
        if (this.Field2247.getBooleanValue().booleanValue()) {
            iterator = Field2263.Method1383();
            while (iterator.Method932()) {
                a3 = (BlockPos)iterator.Method933();
                if (this.Method2289(a3)) continue;
                this.Method1178(a3);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
        }
        if (this.Field2251.getBooleanValue().booleanValue()) {
            iterator = Field2263.Method1383();
            while (iterator.Method932()) {
                a3 = (BlockPos)iterator.Method933();
                if (this.Method2289(a3)) continue;
                this.Method2096(a3);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            }
        }
    }

    @EventTarget
    public void Method273(EventPacket a2) {
        if (a2.getPacket() instanceof S07PacketRespawn || a2.getPacket() instanceof S02PacketLoginSuccess) {
            Field2263.clear();
            Field2242.clear();
        }
    }

    @Override
    public String getDescription() {
        return XRay.Method754(-15317, -16147);
    }

    public double Method2291(BlockPos a2) {
        float a3 = (float)(XRay.mc.thePlayer.posX - (double)a2.getX());
        float a4 = (float)(XRay.mc.thePlayer.posY - (double)a2.getY());
        float a5 = (float)(XRay.mc.thePlayer.posZ - (double)a2.getZ());
        float a6 = MathHelper.sqrt_float((float)(a3 * a3 + 0.0f + a5 * a5));
        return a6;
    }

    private static native /* synthetic */ void Method2065();
}