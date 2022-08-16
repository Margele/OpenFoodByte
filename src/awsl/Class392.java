/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.Reader
 *  java.io.UnsupportedEncodingException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URISyntaxException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.net.URLEncoder
 *  java.nio.charset.StandardCharsets
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  org.apache.http.HttpEntity
 *  org.apache.http.ParseException
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.entity.StringEntity
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClients
 *  org.apache.http.util.EntityUtils
 */
package awsl;

import awsl.Class288;
import awsl.Class298;
import awsl.Class628;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import native0.Class614;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import trash.foodbyte.gui.AltLogin;

public final class Class392
implements Runnable {
    private static final String[] Field1930;
    private static final String Field1931;
    private static final String[] Field1932;
    public boolean Field1933;
    private static final String Field1934;
    private static String Field1935;
    private static final String Field1936;

    public static String Method1325(String a, Map a2) {
        return Class392.Method1330(a, Class392.Method1329(a2), Class392.Method1327(16248, -20859));
    }

    public static String Method1326(String a, String a2) {
        return Class392.Method1330(a, a2, Class392.Method1327(16173, 17287));
    }

    private static String Method1327(int n, int n2) {
        int n3 = (n ^ 0x3F20) & 0xFFFF;
        if (Field1930[n3] == null) {
            int n4;
            char[] cArray = Field1932[n3].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n4 = 154;
                    break;
                }
                case 1: {
                    n4 = 117;
                    break;
                }
                case 2: {
                    n4 = 119;
                    break;
                }
                case 3: {
                    n4 = 116;
                    break;
                }
                case 4: {
                    n4 = 87;
                    break;
                }
                case 5: {
                    n4 = 207;
                    break;
                }
                case 6: {
                    n4 = 17;
                    break;
                }
                case 7: {
                    n4 = 231;
                    break;
                }
                case 8: {
                    n4 = 67;
                    break;
                }
                case 9: {
                    n4 = 130;
                    break;
                }
                case 10: {
                    n4 = 111;
                    break;
                }
                case 11: {
                    n4 = 255;
                    break;
                }
                case 12: {
                    n4 = 42;
                    break;
                }
                case 13: {
                    n4 = 105;
                    break;
                }
                case 14: {
                    n4 = 19;
                    break;
                }
                case 15: {
                    n4 = 213;
                    break;
                }
                case 16: {
                    n4 = 158;
                    break;
                }
                case 17: {
                    n4 = 27;
                    break;
                }
                case 18: {
                    n4 = 131;
                    break;
                }
                case 19: {
                    n4 = 175;
                    break;
                }
                case 20: {
                    n4 = 161;
                    break;
                }
                case 21: {
                    n4 = 97;
                    break;
                }
                case 22: {
                    n4 = 77;
                    break;
                }
                case 23: {
                    n4 = 191;
                    break;
                }
                case 24: {
                    n4 = 218;
                    break;
                }
                case 25: {
                    n4 = 35;
                    break;
                }
                case 26: {
                    n4 = 71;
                    break;
                }
                case 27: {
                    n4 = 102;
                    break;
                }
                case 28: {
                    n4 = 125;
                    break;
                }
                case 29: {
                    n4 = 229;
                    break;
                }
                case 30: {
                    n4 = 59;
                    break;
                }
                case 31: {
                    n4 = 169;
                    break;
                }
                case 32: {
                    n4 = 184;
                    break;
                }
                case 33: {
                    n4 = 167;
                    break;
                }
                case 34: {
                    n4 = 249;
                    break;
                }
                case 35: {
                    n4 = 89;
                    break;
                }
                case 36: {
                    n4 = 239;
                    break;
                }
                case 37: {
                    n4 = 122;
                    break;
                }
                case 38: {
                    n4 = 61;
                    break;
                }
                case 39: {
                    n4 = 144;
                    break;
                }
                case 40: {
                    n4 = 2;
                    break;
                }
                case 41: {
                    n4 = 152;
                    break;
                }
                case 42: {
                    n4 = 29;
                    break;
                }
                case 43: {
                    n4 = 65;
                    break;
                }
                case 44: {
                    n4 = 84;
                    break;
                }
                case 45: {
                    n4 = 52;
                    break;
                }
                case 46: {
                    n4 = 215;
                    break;
                }
                case 47: {
                    n4 = 149;
                    break;
                }
                case 48: {
                    n4 = 106;
                    break;
                }
                case 49: {
                    n4 = 112;
                    break;
                }
                case 50: {
                    n4 = 214;
                    break;
                }
                case 51: {
                    n4 = 72;
                    break;
                }
                case 52: {
                    n4 = 48;
                    break;
                }
                case 53: {
                    n4 = 37;
                    break;
                }
                case 54: {
                    n4 = 193;
                    break;
                }
                case 55: {
                    n4 = 43;
                    break;
                }
                case 56: {
                    n4 = 156;
                    break;
                }
                case 57: {
                    n4 = 6;
                    break;
                }
                case 58: {
                    n4 = 162;
                    break;
                }
                case 59: {
                    n4 = 81;
                    break;
                }
                case 60: {
                    n4 = 246;
                    break;
                }
                case 61: {
                    n4 = 110;
                    break;
                }
                case 62: {
                    n4 = 78;
                    break;
                }
                case 63: {
                    n4 = 160;
                    break;
                }
                case 64: {
                    n4 = 221;
                    break;
                }
                case 65: {
                    n4 = 15;
                    break;
                }
                case 66: {
                    n4 = 104;
                    break;
                }
                case 67: {
                    n4 = 200;
                    break;
                }
                case 68: {
                    n4 = 91;
                    break;
                }
                case 69: {
                    n4 = 159;
                    break;
                }
                case 70: {
                    n4 = 32;
                    break;
                }
                case 71: {
                    n4 = 53;
                    break;
                }
                case 72: {
                    n4 = 83;
                    break;
                }
                case 73: {
                    n4 = 74;
                    break;
                }
                case 74: {
                    n4 = 164;
                    break;
                }
                case 75: {
                    n4 = 95;
                    break;
                }
                case 76: {
                    n4 = 75;
                    break;
                }
                case 77: {
                    n4 = 132;
                    break;
                }
                case 78: {
                    n4 = 28;
                    break;
                }
                case 79: {
                    n4 = 98;
                    break;
                }
                case 80: {
                    n4 = 194;
                    break;
                }
                case 81: {
                    n4 = 60;
                    break;
                }
                case 82: {
                    n4 = 41;
                    break;
                }
                case 83: {
                    n4 = 18;
                    break;
                }
                case 84: {
                    n4 = 50;
                    break;
                }
                case 85: {
                    n4 = 165;
                    break;
                }
                case 86: {
                    n4 = 223;
                    break;
                }
                case 87: {
                    n4 = 148;
                    break;
                }
                case 88: {
                    n4 = 206;
                    break;
                }
                case 89: {
                    n4 = 127;
                    break;
                }
                case 90: {
                    n4 = 192;
                    break;
                }
                case 91: {
                    n4 = 137;
                    break;
                }
                case 92: {
                    n4 = 197;
                    break;
                }
                case 93: {
                    n4 = 150;
                    break;
                }
                case 94: {
                    n4 = 47;
                    break;
                }
                case 95: {
                    n4 = 82;
                    break;
                }
                case 96: {
                    n4 = 196;
                    break;
                }
                case 97: {
                    n4 = 155;
                    break;
                }
                case 98: {
                    n4 = 45;
                    break;
                }
                case 99: {
                    n4 = 121;
                    break;
                }
                case 100: {
                    n4 = 62;
                    break;
                }
                case 101: {
                    n4 = 182;
                    break;
                }
                case 102: {
                    n4 = 142;
                    break;
                }
                case 103: {
                    n4 = 146;
                    break;
                }
                case 104: {
                    n4 = 209;
                    break;
                }
                case 105: {
                    n4 = 232;
                    break;
                }
                case 106: {
                    n4 = 163;
                    break;
                }
                case 107: {
                    n4 = 58;
                    break;
                }
                case 108: {
                    n4 = 99;
                    break;
                }
                case 109: {
                    n4 = 174;
                    break;
                }
                case 110: {
                    n4 = 23;
                    break;
                }
                case 111: {
                    n4 = 179;
                    break;
                }
                case 112: {
                    n4 = 199;
                    break;
                }
                case 113: {
                    n4 = 176;
                    break;
                }
                case 114: {
                    n4 = 135;
                    break;
                }
                case 115: {
                    n4 = 103;
                    break;
                }
                case 116: {
                    n4 = 157;
                    break;
                }
                case 117: {
                    n4 = 244;
                    break;
                }
                case 118: {
                    n4 = 228;
                    break;
                }
                case 119: {
                    n4 = 237;
                    break;
                }
                case 120: {
                    n4 = 208;
                    break;
                }
                case 121: {
                    n4 = 235;
                    break;
                }
                case 122: {
                    n4 = 34;
                    break;
                }
                case 123: {
                    n4 = 115;
                    break;
                }
                case 124: {
                    n4 = 186;
                    break;
                }
                case 125: {
                    n4 = 183;
                    break;
                }
                case 126: {
                    n4 = 39;
                    break;
                }
                case 127: {
                    n4 = 40;
                    break;
                }
                case 128: {
                    n4 = 170;
                    break;
                }
                case 129: {
                    n4 = 44;
                    break;
                }
                case 130: {
                    n4 = 68;
                    break;
                }
                case 131: {
                    n4 = 211;
                    break;
                }
                case 132: {
                    n4 = 254;
                    break;
                }
                case 133: {
                    n4 = 4;
                    break;
                }
                case 134: {
                    n4 = 222;
                    break;
                }
                case 135: {
                    n4 = 79;
                    break;
                }
                case 136: {
                    n4 = 219;
                    break;
                }
                case 137: {
                    n4 = 55;
                    break;
                }
                case 138: {
                    n4 = 90;
                    break;
                }
                case 139: {
                    n4 = 217;
                    break;
                }
                case 140: {
                    n4 = 145;
                    break;
                }
                case 141: {
                    n4 = 107;
                    break;
                }
                case 142: {
                    n4 = 172;
                    break;
                }
                case 143: {
                    n4 = 56;
                    break;
                }
                case 144: {
                    n4 = 38;
                    break;
                }
                case 145: {
                    n4 = 251;
                    break;
                }
                case 146: {
                    n4 = 93;
                    break;
                }
                case 147: {
                    n4 = 66;
                    break;
                }
                case 148: {
                    n4 = 189;
                    break;
                }
                case 149: {
                    n4 = 240;
                    break;
                }
                case 150: {
                    n4 = 114;
                    break;
                }
                case 151: {
                    n4 = 252;
                    break;
                }
                case 152: {
                    n4 = 80;
                    break;
                }
                case 153: {
                    n4 = 212;
                    break;
                }
                case 154: {
                    n4 = 10;
                    break;
                }
                case 155: {
                    n4 = 49;
                    break;
                }
                case 156: {
                    n4 = 242;
                    break;
                }
                case 157: {
                    n4 = 138;
                    break;
                }
                case 158: {
                    n4 = 21;
                    break;
                }
                case 159: {
                    n4 = 141;
                    break;
                }
                case 160: {
                    n4 = 64;
                    break;
                }
                case 161: {
                    n4 = 133;
                    break;
                }
                case 162: {
                    n4 = 201;
                    break;
                }
                case 163: {
                    n4 = 3;
                    break;
                }
                case 164: {
                    n4 = 139;
                    break;
                }
                case 165: {
                    n4 = 13;
                    break;
                }
                case 166: {
                    n4 = 36;
                    break;
                }
                case 167: {
                    n4 = 180;
                    break;
                }
                case 168: {
                    n4 = 188;
                    break;
                }
                case 169: {
                    n4 = 33;
                    break;
                }
                case 170: {
                    n4 = 63;
                    break;
                }
                case 171: {
                    n4 = 140;
                    break;
                }
                case 172: {
                    n4 = 54;
                    break;
                }
                case 173: {
                    n4 = 113;
                    break;
                }
                case 174: {
                    n4 = 253;
                    break;
                }
                case 175: {
                    n4 = 185;
                    break;
                }
                case 176: {
                    n4 = 227;
                    break;
                }
                case 177: {
                    n4 = 226;
                    break;
                }
                case 178: {
                    n4 = 120;
                    break;
                }
                case 179: {
                    n4 = 1;
                    break;
                }
                case 180: {
                    n4 = 187;
                    break;
                }
                case 181: {
                    n4 = 108;
                    break;
                }
                case 182: {
                    n4 = 238;
                    break;
                }
                case 183: {
                    n4 = 202;
                    break;
                }
                case 184: {
                    n4 = 166;
                    break;
                }
                case 185: {
                    n4 = 7;
                    break;
                }
                case 186: {
                    n4 = 96;
                    break;
                }
                case 187: {
                    n4 = 129;
                    break;
                }
                case 188: {
                    n4 = 5;
                    break;
                }
                case 189: {
                    n4 = 171;
                    break;
                }
                case 190: {
                    n4 = 11;
                    break;
                }
                case 191: {
                    n4 = 16;
                    break;
                }
                case 192: {
                    n4 = 0;
                    break;
                }
                case 193: {
                    n4 = 230;
                    break;
                }
                case 194: {
                    n4 = 236;
                    break;
                }
                case 195: {
                    n4 = 9;
                    break;
                }
                case 196: {
                    n4 = 85;
                    break;
                }
                case 197: {
                    n4 = 30;
                    break;
                }
                case 198: {
                    n4 = 101;
                    break;
                }
                case 199: {
                    n4 = 233;
                    break;
                }
                case 200: {
                    n4 = 173;
                    break;
                }
                case 201: {
                    n4 = 51;
                    break;
                }
                case 202: {
                    n4 = 73;
                    break;
                }
                case 203: {
                    n4 = 234;
                    break;
                }
                case 204: {
                    n4 = 128;
                    break;
                }
                case 205: {
                    n4 = 248;
                    break;
                }
                case 206: {
                    n4 = 88;
                    break;
                }
                case 207: {
                    n4 = 216;
                    break;
                }
                case 208: {
                    n4 = 100;
                    break;
                }
                case 209: {
                    n4 = 203;
                    break;
                }
                case 210: {
                    n4 = 92;
                    break;
                }
                case 211: {
                    n4 = 31;
                    break;
                }
                case 212: {
                    n4 = 14;
                    break;
                }
                case 213: {
                    n4 = 109;
                    break;
                }
                case 214: {
                    n4 = 25;
                    break;
                }
                case 215: {
                    n4 = 76;
                    break;
                }
                case 216: {
                    n4 = 86;
                    break;
                }
                case 217: {
                    n4 = 26;
                    break;
                }
                case 218: {
                    n4 = 22;
                    break;
                }
                case 219: {
                    n4 = 220;
                    break;
                }
                case 220: {
                    n4 = 70;
                    break;
                }
                case 221: {
                    n4 = 250;
                    break;
                }
                case 222: {
                    n4 = 147;
                    break;
                }
                case 223: {
                    n4 = 46;
                    break;
                }
                case 224: {
                    n4 = 224;
                    break;
                }
                case 225: {
                    n4 = 243;
                    break;
                }
                case 226: {
                    n4 = 57;
                    break;
                }
                case 227: {
                    n4 = 134;
                    break;
                }
                case 228: {
                    n4 = 143;
                    break;
                }
                case 229: {
                    n4 = 245;
                    break;
                }
                case 230: {
                    n4 = 94;
                    break;
                }
                case 231: {
                    n4 = 195;
                    break;
                }
                case 232: {
                    n4 = 168;
                    break;
                }
                case 233: {
                    n4 = 204;
                    break;
                }
                case 234: {
                    n4 = 136;
                    break;
                }
                case 235: {
                    n4 = 178;
                    break;
                }
                case 236: {
                    n4 = 190;
                    break;
                }
                case 237: {
                    n4 = 126;
                    break;
                }
                case 238: {
                    n4 = 12;
                    break;
                }
                case 239: {
                    n4 = 241;
                    break;
                }
                case 240: {
                    n4 = 118;
                    break;
                }
                case 241: {
                    n4 = 124;
                    break;
                }
                case 242: {
                    n4 = 151;
                    break;
                }
                case 243: {
                    n4 = 225;
                    break;
                }
                case 244: {
                    n4 = 177;
                    break;
                }
                case 245: {
                    n4 = 123;
                    break;
                }
                case 246: {
                    n4 = 198;
                    break;
                }
                case 247: {
                    n4 = 24;
                    break;
                }
                case 248: {
                    n4 = 153;
                    break;
                }
                case 249: {
                    n4 = 205;
                    break;
                }
                case 250: {
                    n4 = 20;
                    break;
                }
                case 251: {
                    n4 = 210;
                    break;
                }
                case 252: {
                    n4 = 247;
                    break;
                }
                case 253: {
                    n4 = 8;
                    break;
                }
                case 254: {
                    n4 = 69;
                    break;
                }
                default: {
                    n4 = 181;
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
            Class392.Field1930[n3] = new String(cArray).intern();
        }
        return Field1930[n3];
    }

    private String Method1328(String a, String a2) {
        Class298 a3 = new Class298();
        a3.Method3009(Class392.Method1327(16174, -19433), Class392.Method1327(16137, 17973) + a + ";" + a2);
        Class298 a4 = new Class298(Class392.Method1333(Class392.Method1327(16134, 16413), a3));
        return a4.Method2963(Class392.Method1327(16238, -24272));
    }

    public static String Method1329(Map a) {
        StringBuilder a2;
        block3: {
            a2 = new StringBuilder();
            Iterator iterator = a.Method2663().Method1383();
            while (iterator.Method932()) {
                Map.Entry a3 = (Map.Entry)iterator.Method933();
                try {
                    a2.append(URLEncoder.encode((String)((String)a3.getKey()), (String)Class392.Method1327(16154, -20177)));
                    a2.append('=');
                    a2.append(URLEncoder.encode((String)((String)a3.getValue()), (String)Class392.Method1327(16154, -20177)));
                    a2.append('&');
                }
                catch (UnsupportedEncodingException a4) {
                    a4.printStackTrace();
                }
            }
            if (a2.length() <= 0) break block3;
            a2.deleteCharAt(a2.length() - 1);
        }
        return a2.toString();
    }

    public static String Method1330(String a, String a2, String a3) {
        HashMap a4 = new HashMap();
        a4.put((Object)Class392.Method1327(16249, 2260), (Object)(a3 + Class392.Method1327(16138, -25501)));
        return Class392.Method1334(a, a2, (Map)a4);
    }

    public static String Method1331(String a, Map a2) throws UnsupportedEncodingException, IOException {
        String a3 = "";
        BufferedReader a4 = null;
        String a5 = a;
        URL a6 = new URL(a5);
        URLConnection a7 = a6.openConnection();
        a7.setConnectTimeout(5000);
        a7.setReadTimeout(15000);
        Object a8 = a2.Method2663().Method1383();
        while (a8.Method932()) {
            Map.Entry a9 = (Map.Entry)a8.Method933();
            a7.setRequestProperty((String)a9.getKey(), (String)a9.getValue());
        }
        a7.setRequestProperty(Class392.Method1327(16240, -20234), Class392.Method1327(16226, 28579));
        a7.setRequestProperty(Class392.Method1327(16186, 12069), Class392.Method1327(16159, -211));
        a7.setRequestProperty(Class392.Method1327(16175, -10274), Class392.Method1327(16155, -11014));
        a7.connect();
        a4 = new BufferedReader((Reader)new InputStreamReader(a7.getInputStream(), Class392.Method1327(16142, 28414)));
        while ((a8 = a4.readLine()) != null) {
            a3 = a3 + (String)a8;
        }
        a4.close();
        return a3;
    }

    @Class628
    private native String Method1332(String var1);

    public static String Method1333(String a, Class298 a2) {
        return Class392.Method1330(a, a2.Method3025(), Class392.Method1327(16149, 2425));
    }

    public static String Method1334(String a, String a2, Map a3) {
        HttpEntity a4;
        CloseableHttpClient a5 = HttpClients.createDefault();
        ArrayList a6 = new ArrayList();
        HttpPost a7 = new HttpPost(a);
        a7.setEntity((HttpEntity)new StringEntity(a2, Class392.Method1327(16154, -20177)));
        if (a3.Method1799() > 0) {
            Iterator iterator = a3.Method2663().Method1383();
            while (iterator.Method932()) {
                a4 = (Map.Entry)iterator.Method933();
                a7.addHeader((String)a4.getKey(), (String)a4.getValue());
            }
        }
        CloseableHttpResponse a8 = null;
        try {
            a8 = a5.execute((HttpUriRequest)a7);
        }
        catch (IOException a9) {
            a9.printStackTrace();
        }
        a4 = a8.getEntity();
        String a10 = null;
        try {
            a10 = EntityUtils.toString((HttpEntity)a4);
        }
        catch (IOException | ParseException a11) {
            a11.printStackTrace();
        }
        return a10;
    }

    private Class298 Method1335(String a) {
        Class298 a2 = new Class298();
        Class298 a3 = new Class298();
        a2.Method3009(Class392.Method1327(16145, 6946), a3);
        a2.Method3009(Class392.Method1327(16228, 2790), Class392.Method1327(16251, -28989));
        a2.Method3009(Class392.Method1327(16153, 28866), Class392.Method1327(16162, -7486));
        a3.Method3009(Class392.Method1327(16151, 4076), Class392.Method1327(16185, -9738));
        a3.Method3009(Class392.Method1327(16184, -1145), new Class288((Collection)Arrays.asList((Object[])new String[]{a})));
        HashMap a4 = new HashMap();
        a4.put((Object)Class392.Method1327(16144, 15379), (Object)Class392.Method1327(16166, -23537));
        a4.put((Object)Class392.Method1327(16227, 10206), (Object)"1");
        return new Class298(Class392.Method1334(Class392.Method1327(16152, -10454), a2.Method3025(), (Map)a4));
    }

    static {
        Class614.Method2232(51, Class392.class);
        Class392.Method1343();
    }

    @Class628
    private native String Method1336() throws IOException, URISyntaxException;

    private static Throwable Method1337(Throwable throwable) {
        return throwable;
    }

    private void Method1338(String a, String a2, OutputStream a3) throws IOException {
        byte[] a4 = a.getBytes(StandardCharsets.UTF_8);
        a3.write((a2 + Class392.Method1327(16225, 23252)).getBytes());
        a3.write(String.valueOf((int)a4.length).getBytes());
        a3.write(Class392.Method1327(16176, 14303).getBytes());
        a3.write(a4);
        a3.flush();
    }

    /*
     * WARNING - void declaration
     */
    public void Method1339() {
        try {
            this.Method1341();
        }
        catch (IOException | URISyntaxException throwable) {
            void a;
            AltLogin.Field3049 = Class392.Method1327(16178, 24119);
            a.printStackTrace();
        }
    }

    public static String Method1340() {
        return Field1935;
    }

    @Class628
    public native String Method1341() throws IOException, URISyntaxException;

    public static void Method1342(String string) {
        Field1935 = string;
    }

    private static native /* synthetic */ void Method1343();
}