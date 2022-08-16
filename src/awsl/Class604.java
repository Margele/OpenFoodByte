/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.authlib.GameProfile
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.concurrent.GenericFutureListener
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Objects
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.TimeUnit
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.network.NetworkPlayerInfo
 *  net.minecraft.network.login.server.S02PacketLoginSuccess
 *  net.minecraft.network.play.client.C01PacketChatMessage
 *  net.minecraft.network.play.server.S07PacketRespawn
 *  net.minecraft.network.play.server.S40PacketDisconnect
 *  net.minecraft.util.IChatComponent
 */
package awsl;

import awsl.Class461;
import awsl.Class538;
import awsl.Class540;
import awsl.Class542;
import awsl.Class544;
import awsl.Class546;
import awsl.Class550;
import awsl.Class606;
import awsl.Class609;
import awsl.Class628;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.authlib.GameProfile;
import eventapi.EventManager;
import eventapi.EventTarget;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import native0.Class614;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.network.login.server.S02PacketLoginSuccess;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.network.play.server.S40PacketDisconnect;
import net.minecraft.util.IChatComponent;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventTickUpdate;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.ServerPacketHandler;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.TimeHelper;

public class Class604 {
    public TimeHelper Field2818;
    public String Field2819;
    public String Field2820;
    private static final String[] Field2821;
    public Bootstrap Field2822;
    public ArrayList Field2823;
    private static int Field2824;
    public static int Field2825;
    public TimeHelper Field2826;
    public Class606 Field2827;
    private static final String[] Field2828;
    private boolean Field2829;
    public String Field2830;
    public String Field2831;
    private NioEventLoopGroup Field2832;
    private ExecutorService Field2833;
    public Channel Field2834;
    public int Field2835;

    public void Method3698(String a, int a2) {
        this.Field2829 = true;
        if (this.Field2834 != null) {
            this.Field2834.close();
            this.Field2834 = null;
        }
        this.Field2822 = new Bootstrap();
        this.Field2822.group((EventLoopGroup)this.Field2832);
        this.Field2822.option(ChannelOption.TCP_NODELAY, (Object)true);
        this.Field2822.option(ChannelOption.CONNECT_TIMEOUT_MILLIS, (Object)10000);
        this.Field2822.channel(NioSocketChannel.class);
        this.Field2822.handler((ChannelHandler)new Class461());
        try {
            this.Field2834 = this.Field2822.connect(a, a2).syncUninterruptibly().channel();
            this.Method3711(new Class546(this.Field2827));
            this.Field2829 = false;
        }
        catch (Throwable a3) {
            this.Field2829 = false;
            this.Field2818.reset();
            this.Field2835 += 10000;
        }
    }

    public void Method3699() {
        this.Field2820 = Minecraft.getMinecraft().getSession().getProfile().getName();
        this.Field2827 = new Class606(GlobalModule.Field3150, GlobalModule.Field3170, GlobalModule.Field3149, this.Field2820, this.Field2820);
        System.out.println(Class604.Method3700(-29518, -1702));
        this.Field2818.reset();
        this.Method3698(this.Field2830, Field2825);
        Executors.newScheduledThreadPool((int)1).scheduleWithFixedDelay(this::Method3710, 0L, 5L, TimeUnit.SECONDS);
    }

    public Class604(String a, Class606 a2) {
        this.Field2832 = new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat(Class604.Method3700(-29507, 912)).setDaemon(true).build());
        this.Field2833 = Executors.newFixedThreadPool((int)2);
        this.Field2818 = new TimeHelper();
        this.Field2826 = new TimeHelper();
        this.Field2823 = new ArrayList();
        this.Field2831 = Minecraft.getMinecraft().getSession().getProfile().getName();
        this.Field2819 = new String(new byte[]{49, 50, 55, 46, 48, 46, 48, 46, 49});
        this.Field2830 = new String(new byte[]{49, 50, 55, 46, 48, 46, 48, 46, 49});
        this.Field2829 = false;
        this.Field2835 = 10000;
        this.Field2827 = a2;
        try {
            Field2825 = Integer.parseInt((String)a);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static String Method3700(int n, int n2) {
        int n3 = (n ^ 0xFFFF8CB0) & 0xFFFF;
        if (Field2821[n3] == null) {
            int n4;
            char[] cArray = Field2828[n3].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n4 = 178;
                    break;
                }
                case 1: {
                    n4 = 216;
                    break;
                }
                case 2: {
                    n4 = 116;
                    break;
                }
                case 3: {
                    n4 = 52;
                    break;
                }
                case 4: {
                    n4 = 20;
                    break;
                }
                case 5: {
                    n4 = 114;
                    break;
                }
                case 6: {
                    n4 = 192;
                    break;
                }
                case 7: {
                    n4 = 115;
                    break;
                }
                case 8: {
                    n4 = 83;
                    break;
                }
                case 9: {
                    n4 = 149;
                    break;
                }
                case 10: {
                    n4 = 80;
                    break;
                }
                case 11: {
                    n4 = 179;
                    break;
                }
                case 12: {
                    n4 = 37;
                    break;
                }
                case 13: {
                    n4 = 175;
                    break;
                }
                case 14: {
                    n4 = 97;
                    break;
                }
                case 15: {
                    n4 = 129;
                    break;
                }
                case 16: {
                    n4 = 101;
                    break;
                }
                case 17: {
                    n4 = 208;
                    break;
                }
                case 18: {
                    n4 = 22;
                    break;
                }
                case 19: {
                    n4 = 41;
                    break;
                }
                case 20: {
                    n4 = 218;
                    break;
                }
                case 21: {
                    n4 = 117;
                    break;
                }
                case 22: {
                    n4 = 7;
                    break;
                }
                case 23: {
                    n4 = 74;
                    break;
                }
                case 24: {
                    n4 = 49;
                    break;
                }
                case 25: {
                    n4 = 227;
                    break;
                }
                case 26: {
                    n4 = 168;
                    break;
                }
                case 27: {
                    n4 = 231;
                    break;
                }
                case 28: {
                    n4 = 75;
                    break;
                }
                case 29: {
                    n4 = 180;
                    break;
                }
                case 30: {
                    n4 = 124;
                    break;
                }
                case 31: {
                    n4 = 53;
                    break;
                }
                case 32: {
                    n4 = 213;
                    break;
                }
                case 33: {
                    n4 = 131;
                    break;
                }
                case 34: {
                    n4 = 92;
                    break;
                }
                case 35: {
                    n4 = 84;
                    break;
                }
                case 36: {
                    n4 = 96;
                    break;
                }
                case 37: {
                    n4 = 236;
                    break;
                }
                case 38: {
                    n4 = 105;
                    break;
                }
                case 39: {
                    n4 = 145;
                    break;
                }
                case 40: {
                    n4 = 70;
                    break;
                }
                case 41: {
                    n4 = 156;
                    break;
                }
                case 42: {
                    n4 = 252;
                    break;
                }
                case 43: {
                    n4 = 148;
                    break;
                }
                case 44: {
                    n4 = 42;
                    break;
                }
                case 45: {
                    n4 = 170;
                    break;
                }
                case 46: {
                    n4 = 240;
                    break;
                }
                case 47: {
                    n4 = 205;
                    break;
                }
                case 48: {
                    n4 = 207;
                    break;
                }
                case 49: {
                    n4 = 28;
                    break;
                }
                case 50: {
                    n4 = 91;
                    break;
                }
                case 51: {
                    n4 = 199;
                    break;
                }
                case 52: {
                    n4 = 110;
                    break;
                }
                case 53: {
                    n4 = 111;
                    break;
                }
                case 54: {
                    n4 = 194;
                    break;
                }
                case 55: {
                    n4 = 104;
                    break;
                }
                case 56: {
                    n4 = 154;
                    break;
                }
                case 57: {
                    n4 = 10;
                    break;
                }
                case 58: {
                    n4 = 182;
                    break;
                }
                case 59: {
                    n4 = 66;
                    break;
                }
                case 60: {
                    n4 = 241;
                    break;
                }
                case 61: {
                    n4 = 90;
                    break;
                }
                case 62: {
                    n4 = 103;
                    break;
                }
                case 63: {
                    n4 = 162;
                    break;
                }
                case 64: {
                    n4 = 6;
                    break;
                }
                case 65: {
                    n4 = 249;
                    break;
                }
                case 66: {
                    n4 = 232;
                    break;
                }
                case 67: {
                    n4 = 67;
                    break;
                }
                case 68: {
                    n4 = 121;
                    break;
                }
                case 69: {
                    n4 = 171;
                    break;
                }
                case 70: {
                    n4 = 173;
                    break;
                }
                case 71: {
                    n4 = 246;
                    break;
                }
                case 72: {
                    n4 = 223;
                    break;
                }
                case 73: {
                    n4 = 106;
                    break;
                }
                case 74: {
                    n4 = 137;
                    break;
                }
                case 75: {
                    n4 = 128;
                    break;
                }
                case 76: {
                    n4 = 2;
                    break;
                }
                case 77: {
                    n4 = 181;
                    break;
                }
                case 78: {
                    n4 = 39;
                    break;
                }
                case 79: {
                    n4 = 243;
                    break;
                }
                case 80: {
                    n4 = 88;
                    break;
                }
                case 81: {
                    n4 = 226;
                    break;
                }
                case 82: {
                    n4 = 32;
                    break;
                }
                case 83: {
                    n4 = 25;
                    break;
                }
                case 84: {
                    n4 = 59;
                    break;
                }
                case 85: {
                    n4 = 69;
                    break;
                }
                case 86: {
                    n4 = 132;
                    break;
                }
                case 87: {
                    n4 = 160;
                    break;
                }
                case 88: {
                    n4 = 62;
                    break;
                }
                case 89: {
                    n4 = 185;
                    break;
                }
                case 90: {
                    n4 = 18;
                    break;
                }
                case 91: {
                    n4 = 1;
                    break;
                }
                case 92: {
                    n4 = 215;
                    break;
                }
                case 93: {
                    n4 = 118;
                    break;
                }
                case 94: {
                    n4 = 72;
                    break;
                }
                case 95: {
                    n4 = 120;
                    break;
                }
                case 96: {
                    n4 = 99;
                    break;
                }
                case 97: {
                    n4 = 123;
                    break;
                }
                case 98: {
                    n4 = 158;
                    break;
                }
                case 99: {
                    n4 = 95;
                    break;
                }
                case 100: {
                    n4 = 164;
                    break;
                }
                case 101: {
                    n4 = 27;
                    break;
                }
                case 102: {
                    n4 = 248;
                    break;
                }
                case 103: {
                    n4 = 138;
                    break;
                }
                case 104: {
                    n4 = 38;
                    break;
                }
                case 105: {
                    n4 = 166;
                    break;
                }
                case 106: {
                    n4 = 135;
                    break;
                }
                case 107: {
                    n4 = 51;
                    break;
                }
                case 108: {
                    n4 = 219;
                    break;
                }
                case 109: {
                    n4 = 64;
                    break;
                }
                case 110: {
                    n4 = 54;
                    break;
                }
                case 111: {
                    n4 = 230;
                    break;
                }
                case 112: {
                    n4 = 184;
                    break;
                }
                case 113: {
                    n4 = 204;
                    break;
                }
                case 114: {
                    n4 = 119;
                    break;
                }
                case 115: {
                    n4 = 142;
                    break;
                }
                case 116: {
                    n4 = 234;
                    break;
                }
                case 117: {
                    n4 = 247;
                    break;
                }
                case 118: {
                    n4 = 197;
                    break;
                }
                case 119: {
                    n4 = 238;
                    break;
                }
                case 120: {
                    n4 = 141;
                    break;
                }
                case 121: {
                    n4 = 122;
                    break;
                }
                case 122: {
                    n4 = 255;
                    break;
                }
                case 123: {
                    n4 = 169;
                    break;
                }
                case 124: {
                    n4 = 31;
                    break;
                }
                case 125: {
                    n4 = 176;
                    break;
                }
                case 126: {
                    n4 = 4;
                    break;
                }
                case 127: {
                    n4 = 188;
                    break;
                }
                case 128: {
                    n4 = 65;
                    break;
                }
                case 129: {
                    n4 = 222;
                    break;
                }
                case 130: {
                    n4 = 200;
                    break;
                }
                case 131: {
                    n4 = 85;
                    break;
                }
                case 132: {
                    n4 = 15;
                    break;
                }
                case 133: {
                    n4 = 3;
                    break;
                }
                case 134: {
                    n4 = 155;
                    break;
                }
                case 135: {
                    n4 = 56;
                    break;
                }
                case 136: {
                    n4 = 0;
                    break;
                }
                case 137: {
                    n4 = 183;
                    break;
                }
                case 138: {
                    n4 = 36;
                    break;
                }
                case 139: {
                    n4 = 139;
                    break;
                }
                case 140: {
                    n4 = 68;
                    break;
                }
                case 141: {
                    n4 = 133;
                    break;
                }
                case 142: {
                    n4 = 81;
                    break;
                }
                case 143: {
                    n4 = 152;
                    break;
                }
                case 144: {
                    n4 = 253;
                    break;
                }
                case 145: {
                    n4 = 157;
                    break;
                }
                case 146: {
                    n4 = 165;
                    break;
                }
                case 147: {
                    n4 = 245;
                    break;
                }
                case 148: {
                    n4 = 153;
                    break;
                }
                case 149: {
                    n4 = 55;
                    break;
                }
                case 150: {
                    n4 = 87;
                    break;
                }
                case 151: {
                    n4 = 244;
                    break;
                }
                case 152: {
                    n4 = 203;
                    break;
                }
                case 153: {
                    n4 = 8;
                    break;
                }
                case 154: {
                    n4 = 251;
                    break;
                }
                case 155: {
                    n4 = 130;
                    break;
                }
                case 156: {
                    n4 = 140;
                    break;
                }
                case 157: {
                    n4 = 233;
                    break;
                }
                case 158: {
                    n4 = 23;
                    break;
                }
                case 159: {
                    n4 = 89;
                    break;
                }
                case 160: {
                    n4 = 45;
                    break;
                }
                case 161: {
                    n4 = 16;
                    break;
                }
                case 162: {
                    n4 = 21;
                    break;
                }
                case 163: {
                    n4 = 63;
                    break;
                }
                case 164: {
                    n4 = 189;
                    break;
                }
                case 165: {
                    n4 = 228;
                    break;
                }
                case 166: {
                    n4 = 214;
                    break;
                }
                case 167: {
                    n4 = 217;
                    break;
                }
                case 168: {
                    n4 = 125;
                    break;
                }
                case 169: {
                    n4 = 60;
                    break;
                }
                case 170: {
                    n4 = 100;
                    break;
                }
                case 171: {
                    n4 = 235;
                    break;
                }
                case 172: {
                    n4 = 19;
                    break;
                }
                case 173: {
                    n4 = 14;
                    break;
                }
                case 174: {
                    n4 = 195;
                    break;
                }
                case 175: {
                    n4 = 12;
                    break;
                }
                case 176: {
                    n4 = 98;
                    break;
                }
                case 177: {
                    n4 = 93;
                    break;
                }
                case 178: {
                    n4 = 193;
                    break;
                }
                case 179: {
                    n4 = 44;
                    break;
                }
                case 180: {
                    n4 = 146;
                    break;
                }
                case 181: {
                    n4 = 113;
                    break;
                }
                case 182: {
                    n4 = 48;
                    break;
                }
                case 183: {
                    n4 = 34;
                    break;
                }
                case 184: {
                    n4 = 57;
                    break;
                }
                case 185: {
                    n4 = 202;
                    break;
                }
                case 186: {
                    n4 = 94;
                    break;
                }
                case 187: {
                    n4 = 58;
                    break;
                }
                case 188: {
                    n4 = 250;
                    break;
                }
                case 189: {
                    n4 = 212;
                    break;
                }
                case 190: {
                    n4 = 190;
                    break;
                }
                case 191: {
                    n4 = 29;
                    break;
                }
                case 192: {
                    n4 = 167;
                    break;
                }
                case 193: {
                    n4 = 186;
                    break;
                }
                case 194: {
                    n4 = 196;
                    break;
                }
                case 195: {
                    n4 = 24;
                    break;
                }
                case 196: {
                    n4 = 229;
                    break;
                }
                case 197: {
                    n4 = 109;
                    break;
                }
                case 198: {
                    n4 = 151;
                    break;
                }
                case 199: {
                    n4 = 239;
                    break;
                }
                case 200: {
                    n4 = 50;
                    break;
                }
                case 201: {
                    n4 = 102;
                    break;
                }
                case 202: {
                    n4 = 224;
                    break;
                }
                case 203: {
                    n4 = 225;
                    break;
                }
                case 204: {
                    n4 = 76;
                    break;
                }
                case 205: {
                    n4 = 209;
                    break;
                }
                case 206: {
                    n4 = 78;
                    break;
                }
                case 207: {
                    n4 = 86;
                    break;
                }
                case 208: {
                    n4 = 237;
                    break;
                }
                case 209: {
                    n4 = 11;
                    break;
                }
                case 210: {
                    n4 = 5;
                    break;
                }
                case 211: {
                    n4 = 17;
                    break;
                }
                case 212: {
                    n4 = 126;
                    break;
                }
                case 213: {
                    n4 = 30;
                    break;
                }
                case 214: {
                    n4 = 210;
                    break;
                }
                case 215: {
                    n4 = 134;
                    break;
                }
                case 216: {
                    n4 = 46;
                    break;
                }
                case 217: {
                    n4 = 43;
                    break;
                }
                case 218: {
                    n4 = 191;
                    break;
                }
                case 219: {
                    n4 = 40;
                    break;
                }
                case 220: {
                    n4 = 254;
                    break;
                }
                case 221: {
                    n4 = 172;
                    break;
                }
                case 222: {
                    n4 = 143;
                    break;
                }
                case 223: {
                    n4 = 161;
                    break;
                }
                case 224: {
                    n4 = 220;
                    break;
                }
                case 225: {
                    n4 = 79;
                    break;
                }
                case 226: {
                    n4 = 77;
                    break;
                }
                case 227: {
                    n4 = 13;
                    break;
                }
                case 228: {
                    n4 = 198;
                    break;
                }
                case 229: {
                    n4 = 211;
                    break;
                }
                case 230: {
                    n4 = 221;
                    break;
                }
                case 231: {
                    n4 = 177;
                    break;
                }
                case 232: {
                    n4 = 136;
                    break;
                }
                case 233: {
                    n4 = 112;
                    break;
                }
                case 234: {
                    n4 = 174;
                    break;
                }
                case 235: {
                    n4 = 108;
                    break;
                }
                case 236: {
                    n4 = 187;
                    break;
                }
                case 237: {
                    n4 = 242;
                    break;
                }
                case 238: {
                    n4 = 147;
                    break;
                }
                case 239: {
                    n4 = 26;
                    break;
                }
                case 240: {
                    n4 = 33;
                    break;
                }
                case 241: {
                    n4 = 73;
                    break;
                }
                case 242: {
                    n4 = 47;
                    break;
                }
                case 243: {
                    n4 = 150;
                    break;
                }
                case 244: {
                    n4 = 107;
                    break;
                }
                case 245: {
                    n4 = 201;
                    break;
                }
                case 246: {
                    n4 = 127;
                    break;
                }
                case 247: {
                    n4 = 35;
                    break;
                }
                case 248: {
                    n4 = 163;
                    break;
                }
                case 249: {
                    n4 = 9;
                    break;
                }
                case 250: {
                    n4 = 144;
                    break;
                }
                case 251: {
                    n4 = 206;
                    break;
                }
                case 252: {
                    n4 = 82;
                    break;
                }
                case 253: {
                    n4 = 61;
                    break;
                }
                case 254: {
                    n4 = 71;
                    break;
                }
                default: {
                    n4 = 159;
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
            Class604.Field2821[n3] = new String(cArray).intern();
        }
        return Field2821[n3];
    }

    public void Method3701() {
        this.Field2818.reset();
        EventManager.unregister(this);
        if (this.Field2834 == null) {
            return;
        }
        if (!this.Field2834.isOpen() || !this.Field2834.isWritable()) {
            return;
        }
        this.Field2834.close();
    }

    static {
        Class614.Method2232(53, Class604.class);
        Class604.Method3713();
    }

    public void Method3702() {
        EventManager.register(this);
    }

    private void Method3703(Class609 a) {
        this.Field2834.writeAndFlush((Object)a).addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }

    @EventTarget
    public void Method3704(EventPacket a) {
        Object a2;
        String a3;
        S40PacketDisconnect a4;
        if (a.getPacket() instanceof S07PacketRespawn || a.getPacket() instanceof S02PacketLoginSuccess) {
            this.Field2818.Method216(4500);
        }
        if (a.getPacket() instanceof S40PacketDisconnect && ((IChatComponent)(a4 = (S40PacketDisconnect)a.getPacket()).getReason().getSiblings().get(8)).getUnformattedText() != null && ((IChatComponent)a4.getReason().getSiblings().get(8)).getUnformattedText().startsWith("#") && ((IChatComponent)a4.getReason().getSiblings().get(4)).getUnformattedText().startsWith(Class604.Method3700(-29511, -28728))) {
            a3 = ((IChatComponent)a4.getReason().getSiblings().get(8)).getUnformattedText().replace((CharSequence)"\n", (CharSequence)"");
            a2 = Minecraft.getMinecraft().getSession().getProfile().getId().toString().replace((CharSequence)"-", (CharSequence)"");
            this.Method3711(new Class542((String)a2, a3, Class604.Method3700(-29510, 30625)));
        }
        if (a.getPacket() instanceof C01PacketChatMessage && (a3 = (a4 = (C01PacketChatMessage)a.getPacket()).getMessage()).toLowerCase().startsWith(Class604.Method3700(-29513, 29937)) && ((String[])(a2 = a3.split(" "))).length >= 3) {
            this.Method3711(new Class550(a2[1]));
        }
    }

    @EventTarget
    public void Method3705(EventTickUpdate a2) {
        int a3 = Class604.Method3707();
        if (Objects.nonNull((Object)this.Field2834) && (this.Field2834.isOpen() || this.Field2834.isWritable())) {
            String a4;
            if (this.Field2818.isDelayComplete(5000.0)) {
                Iterator iterator;
                this.Field2818.reset();
                a4 = Minecraft.getMinecraft().getSession().getUsername();
                if (Minecraft.getMinecraft().thePlayer != null && Minecraft.getMinecraft().theWorld != null && (iterator = Minecraft.getMinecraft().thePlayer.sendQueue.getPlayerInfoMap().Method1383()).Method932()) {
                    NetworkPlayerInfo a5 = (NetworkPlayerInfo)iterator.Method933();
                    GameProfile a6 = a5.getGameProfile();
                    if (a6.getId() != null && a6.getId().equals((Object)Minecraft.getMinecraft().getSession().getProfile().getId())) {
                        if (a6.getName().equalsIgnoreCase(Minecraft.getMinecraft().getSession().getProfile().getName())) {
                        }
                        a4 = a6.getName();
                    }
                }
                if (!this.Field2820.equals((Object)a4)) {
                    this.Field2820 = a4;
                    this.Field2827.Field2842 = Minecraft.getMinecraft().getSession().getUsername();
                    this.Field2827.Field2841 = a4;
                    this.Field2827.Field2844 = System.currentTimeMillis();
                    System.err.println(Class604.Method3700(-29508, 17997) + this.Field2820);
                    ChatUtils.debug(Class604.Method3700(-29517, -13501) + this.Field2820);
                    this.Method3711(new Class538(this.Field2827, Class604.Method3700(-29516, -5513)));
                }
            }
            if (this.Field2826.isDelayComplete(8.64E7)) {
                this.Field2826.reset();
                if (Wrapper.INSTANCE.getMinecraft().thePlayer != null) {
                    a4 = Wrapper.INSTANCE.getMinecraft().theWorld.getScoreboard().getObjectiveInDisplaySlot(1);
                    this.Method3711(new Class540(ServerPacketHandler.currentServer.name(), ServerUtils.format(a4.getDisplayName())));
                    if (Wrapper.INSTANCE.getMinecraft().isSingleplayer()) {
                        this.Method3711(new Class540(Class604.Method3700(-29514, -8869), Class604.Method3700(-29520, -19348)));
                    }
                    if (!Wrapper.INSTANCE.getMinecraft().isSingleplayer()) {
                        this.Method3711(new Class540(Class604.Method3700(-29509, -3647), Class604.Method3700(-29519, 30598)));
                    }
                }
                ChatUtils.debug(Class604.Method3700(-29515, 1274));
            }
            return;
        }
        if (this.Field2818.isDelayComplete(this.Field2835) && !this.Field2829) {
            this.Field2818.reset();
            this.Method3699();
        }
    }

    public static void Method3706(int n) {
        Field2824 = n;
    }

    public static int Method3707() {
        int n = Class604.Method3709();
        return 22;
    }

    @Class628
    public native void Method3708();

    public static int Method3709() {
        return Field2824;
    }

    public Class604() {
        this.Field2832 = new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat(Class604.Method3700(-29512, 11693)).setDaemon(true).build());
        this.Field2833 = Executors.newFixedThreadPool((int)2);
        this.Field2818 = new TimeHelper();
        this.Field2826 = new TimeHelper();
        this.Field2823 = new ArrayList();
        this.Field2831 = Minecraft.getMinecraft().getSession().getProfile().getName();
        this.Field2819 = new String(new byte[]{49, 50, 55, 46, 48, 46, 48, 46, 49});
        this.Field2830 = new String(new byte[]{49, 50, 55, 46, 48, 46, 48, 46, 49});
        this.Field2829 = false;
        this.Field2835 = 10000;
        this.Method3708();
        this.Method3699();
        EventManager.register(this);
    }

    public void Method3710() {
        if (this.Field2834 == null) {
            return;
        }
        if (!this.Field2834.isOpen() || !this.Field2834.isWritable()) {
            return;
        }
        this.Method3711(new Class544(66));
    }

    public void Method3711(Class609 a2) {
        if (this.Field2834 == null) {
            return;
        }
        if (!this.Field2834.isOpen() || !this.Field2834.isWritable()) {
            return;
        }
        if (this.Field2834.eventLoop().inEventLoop()) {
            this.Field2834.writeAndFlush((Object)a2).addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        } else {
            this.Field2834.eventLoop().execute(() -> this.Method3703(a2));
        }
    }

    private static Throwable Method3712(Throwable throwable) {
        return throwable;
    }

    private static native /* synthetic */ void Method3713();
}