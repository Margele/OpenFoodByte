/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.Font
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.HashMap
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.StringUtils
 *  org.lwjgl.opengl.GL11
 */
package awsl;

import awsl.Class573;
import java.awt.Color;
import java.awt.Font;
import java.io.InputStream;
import java.util.HashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import obfuscate.a;
import org.lwjgl.opengl.GL11;

public class Class563 {
    public float Field2625 = 0.0f;
    private Class573 Field2626;
    private int[] Field2627 = new int[32];
    private float Field2628;
    public HashMap Field2629 = new HashMap();
    public HashMap Field2630 = new HashMap();
    private static a[] Field2631;

    public Class563(String a2, int a3, int a4, boolean a5) {
        this(a2, a3, a4, 0, a5);
    }

    public Class563(String a2, int a3, int a4, int a5, boolean a6) {
        this(a2, a3, a4, a5, a6, 0);
    }

    public Class563(String a2, int a3, int a4, int a5, boolean a6, int a7) {
        this.Field2626 = new Class573(this.Method1216(a2, a3, a4), true, a5, a6, a7);
        this.Field2628 = 0.0f;
        for (int a8 = 0; a8 < 32; ++a8) {
            int a9 = (a8 >> 3 & 1) * 85;
            int a10 = (a8 >> 2 & 1) * 170 + a9;
            int a11 = (a8 >> 1 & 1) * 170 + a9;
            int a12 = (a8 & 1) * 170 + a9;
            if (a8 == 6) {
                a10 += 85;
            }
            if (a8 >= 16) {
                a10 /= 4;
                a11 /= 4;
                a12 /= 4;
            }
            this.Field2627[a8] = (a10 & 0xFF) << 16 | (a11 & 0xFF) << 8 | a12 & 0xFF;
        }
        this.Field2625 = this.Method1227("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
    }

    private Font Method1216(String a2, int a3, int a4) {
        Font a5 = null;
        try {
            InputStream a6 = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("minecraft:FoodByte/font/" + a2)).getInputStream();
            a5 = Font.createFont((int)0, (InputStream)a6);
            a5 = a5.deriveFont(a3, (float)a4);
        }
        catch (Exception a7) {
            a7.printStackTrace();
            System.err.println("Failed to load custom font");
        }
        return a5;
    }

    public int Method1217(String a2, float a3, float a4, int a5) {
        return this.Method1218(a2, a3, a4, a5, 1.0f);
    }

    public int Method1218(String a2, float a3, float a4, int a5, float a6) {
        a2 = this.Method1219(a2);
        a[] a7 = Class563.Method1234();
        a4 *= 2.0f;
        float a8 = a3 *= 2.0f;
        GL11.glPushMatrix();
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        boolean a9 = GL11.glGetBoolean((int)3042);
        GlStateManager.enableAlpha();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3553);
        int a10 = a5;
        char[] a11 = a2.toCharArray();
        int a12 = 0;
        char[] a13 = a11;
        int a14 = a11.length;
        int a15 = 0;
        if (a15 < a14) {
            char a16 = a13[a15];
            if (a16 == '\r') {
                a3 = a8;
            }
            if (a16 == '\n') {
                a4 += this.Method1227(Character.toString((char)a16)) * 2.0f;
            }
            if (a16 != '\u00a7') {
                if (a12 == a11.length - 1 || a11[a12 - 1] != '\u00a7') {
                    if (a12 >= 1 && a11[a12 - 1] == '\u00a7') {
                        a.trash(new String[1]);
                    }
                    GL11.glPushMatrix();
                    this.Field2626.Method1048(Character.toString((char)a16), a3, a4, Class563.Method1232(a10, a6), false);
                    GL11.glPopMatrix();
                    a3 += this.Method1225(Character.toString((char)a16)) * 2.0f;
                }
            }
            if (a16 == ' ') {
                a3 += (float)this.Field2626.Method1053(" ");
            }
            if (a16 == '\u00a7' && a12 != a11.length - 1) {
                int a17 = "0123456789abcdefklmnor".indexOf((int)a2.charAt(a12 + 1));
                if (a17 < 16) {
                    a10 = this.Field2627[a17];
                }
                if (a17 == 21) {
                    a10 = Color.WHITE.getRGB();
                }
            }
            ++a12;
            ++a15;
        }
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return (int)a3;
    }

    private String Method1219(String a2) {
        String a3 = "";
        for (char a4 : a2.toCharArray()) {
            if (a4 >= '\uc350' && a4 <= '\uea60' || a4 == '\u26bd') continue;
            a3 = String.valueOf((Object)a3) + a4;
        }
        a2 = a3.replace((CharSequence)"\u00a7r", (CharSequence)"").replace('\u25ac', '=').replace('\u2764', '\u2665').replace('\u22c6', '\u2606').replace('\u2620', '\u2606').replace('\u2730', '\u2606').replace((CharSequence)"\u272b", (CharSequence)"\u2606").replace((CharSequence)"\u2719", (CharSequence)"+").replace((CharSequence)"\uf8ff", (CharSequence)"").replace((CharSequence)"\u2b1b", (CharSequence)"\u25a0\u25a0");
        a2 = a2.replace('\u2b05', '\u2190').replace('\u2b06', '\u2191').replace('\u2b07', '\u2193').replace('\u27a1', '\u2192').replace('\u2b08', '\u2197').replace('\u2b0b', '\u2199').replace('\u2b09', '\u2196').replace('\u2b0a', '\u2198');
        return a2;
    }

    public int Method1220(String a2, float a3, float a4, int a5) {
        this.Method1218(StringUtils.stripControlCodes((String)a2), a3 + 0.5f, a4 + 0.5f, 0, 1.0f);
        return this.Method1217(a2, a3, a4, a5);
    }

    public int Method1221(String a2, float a3, float a4, int a5) {
        this.Method1218(StringUtils.stripControlCodes((String)a2), a3 + 0.8f, a4 + 0.8f, 0, 1.0f);
        return this.Method1217(a2, a3, a4, a5);
    }

    public int Method1222(String a2, float a3, float a4, int a5) {
        return this.Method1217(a2, a3 - (float)((int)this.Method1225(a2) / 2), a4, a5);
    }

    public void Method1223(String a2, float a3, float a4, int a5, float a6) {
        this.Method1218(a2, a3 - (float)((int)this.Method1225(a2) / 2), a4, a5, a6);
    }

    public void Method1224(String a2, float a3, float a4, int a5) {
        this.Method1222(StringUtils.stripControlCodes((String)a2), a3 + 0.5f, a4 + 0.5f, -16777216);
        this.Method1222(a2, a3, a4, a5);
    }

    public float Method1225(String a2) {
        if (this.Field2629.containsKey((Object)a2)) {
            return ((Float)this.Field2629.Method2665((Object)a2)).floatValue();
        }
        float a3 = 0.0f;
        String a4 = StringUtils.stripControlCodes((String)a2);
        for (char a5 : a4.toCharArray()) {
            a3 += (float)this.Field2626.Method1053(Character.toString((char)a5)) + this.Field2628;
        }
        this.Field2629.put((Object)a2, (Object)Float.valueOf((float)(a3 / 2.0f)));
        return a3 / 2.0f;
    }

    public float Method1226(char a2) {
        return this.Field2626.Method1053(String.valueOf((char)a2));
    }

    public float Method1227(String a2) {
        if (this.Field2630.containsKey((Object)a2)) {
            return ((Float)this.Field2630.Method2665((Object)a2)).floatValue();
        }
        float a3 = (float)this.Field2626.Method1051(a2) / 2.0f;
        this.Field2630.put((Object)a2, (Object)Float.valueOf((float)a3));
        return a3;
    }

    public float Method1228() {
        return (float)this.Field2626.Method1051("FluxIsThatBestClarinet.") / 2.0f;
    }

    public Class573 Method1229() {
        return this.Field2626;
    }

    public String Method1230(String a2, int a3) {
        return this.Method1231(a2, a3, false);
    }

    public String Method1231(String a2, int a3, boolean a4) {
        a2 = this.Method1219(a2);
        StringBuilder a5 = new StringBuilder();
        float a6 = 0.0f;
        int a7 = a2.length() - 1;
        int a8 = -1;
        boolean a9 = false;
        boolean a10 = false;
        int a11 = a7;
        while (true) {
            if (a11 >= a2.length() || !(a6 < (float)a3)) break;
            char a12 = a2.charAt(a11);
            float a13 = this.Method1226(a12);
            a9 = false;
            if (a12 != 'l' && a12 != 'L') {
                if (a12 == 'r' || a12 == 'R') {
                    a10 = false;
                }
            } else {
                a10 = true;
            }
            if (a6 > (float)a3) break;
            a5.insert(0, a12);
            a11 += a8;
        }
        return a5.toString();
    }

    public static int Method1232(int a2, float a3) {
        Color a4 = new Color(a2);
        float a5 = 0.003921569f * (float)a4.getRed();
        float a6 = 0.003921569f * (float)a4.getGreen();
        float a7 = 0.003921569f * (float)a4.getBlue();
        return new Color(a5, a6, a7, a3).getRGB();
    }

    public static void Method1233(a[] aArray) {
        Field2631 = aArray;
    }

    public static a[] Method1234() {
        return Field2631;
    }

    static {
        Class563.Method1233(new a[5]);
    }
}