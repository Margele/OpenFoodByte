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
import awsl.Class91;
import java.awt.Color;
import java.awt.Font;
import java.io.InputStream;
import java.util.HashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import org.lwjgl.opengl.GL11;

public class Class563 {
    public float Field2625 = 0.0f;
    private Class573 Field2626;
    private int[] Field2627 = new int[32];
    private float Field2628;
    public HashMap Field2629 = new HashMap();
    public HashMap Field2630 = new HashMap();
    private static Class91[] Field2631;

    public Class563(String a, int a2, int a3, boolean a4) {
        this(a, a2, a3, 0, a4);
    }

    public Class563(String a, int a2, int a3, int a4, boolean a5) {
        this(a, a2, a3, a4, a5, 0);
    }

    public Class563(String a, int a2, int a3, int a4, boolean a5, int a6) {
        this.Field2626 = new Class573(this.Method1216(a, a2, a3), true, a4, a5, a6);
        this.Field2628 = 0.0f;
        for (int a7 = 0; a7 < 32; ++a7) {
            int a8 = (a7 >> 3 & 1) * 85;
            int a9 = (a7 >> 2 & 1) * 170 + a8;
            int a10 = (a7 >> 1 & 1) * 170 + a8;
            int a11 = (a7 & 1) * 170 + a8;
            if (a7 == 6) {
                a9 += 85;
            }
            if (a7 >= 16) {
                a9 /= 4;
                a10 /= 4;
                a11 /= 4;
            }
            this.Field2627[a7] = (a9 & 0xFF) << 16 | (a10 & 0xFF) << 8 | a11 & 0xFF;
        }
        this.Field2625 = this.Method1227("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
    }

    private Font Method1216(String a, int a2, int a3) {
        Font a4 = null;
        try {
            InputStream a5 = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("minecraft:FoodByte/font/" + a)).getInputStream();
            a4 = Font.createFont((int)0, (InputStream)a5);
            a4 = a4.deriveFont(a2, (float)a3);
        }
        catch (Exception a6) {
            a6.printStackTrace();
            System.err.println("Failed to load custom font");
        }
        return a4;
    }

    public int Method1217(String a, float a2, float a3, int a4) {
        return this.Method1218(a, a2, a3, a4, 1.0f);
    }

    public int Method1218(String a, float a2, float a3, int a4, float a5) {
        a = this.Method1219(a);
        Class91[] a6 = Class563.Method1234();
        a3 *= 2.0f;
        float a7 = a2 *= 2.0f;
        GL11.glPushMatrix();
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        boolean a8 = GL11.glGetBoolean((int)3042);
        GlStateManager.enableAlpha();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3553);
        int a9 = a4;
        char[] a10 = a.toCharArray();
        int a11 = 0;
        char[] a12 = a10;
        int a13 = a10.length;
        int a14 = 0;
        if (a14 < a13) {
            char a15 = a12[a14];
            if (a15 == '\r') {
                a2 = a7;
            }
            if (a15 == '\n') {
                a3 += this.Method1227(Character.toString((char)a15)) * 2.0f;
            }
            if (a15 != '\u00a7') {
                if (a11 == a10.length - 1 || a10[a11 - 1] != '\u00a7') {
                    if (a11 >= 1 && a10[a11 - 1] == '\u00a7') {
                        Class91.Method3647(new String[1]);
                    }
                    GL11.glPushMatrix();
                    this.Field2626.Method1048(Character.toString((char)a15), a2, a3, Class563.Method1232(a9, a5), false);
                    GL11.glPopMatrix();
                    a2 += this.Method1225(Character.toString((char)a15)) * 2.0f;
                }
            }
            if (a15 == ' ') {
                a2 += (float)this.Field2626.Method1053(" ");
            }
            if (a15 == '\u00a7' && a11 != a10.length - 1) {
                int a16 = "0123456789abcdefklmnor".indexOf((int)a.charAt(a11 + 1));
                if (a16 < 16) {
                    a9 = this.Field2627[a16];
                }
                if (a16 == 21) {
                    a9 = Color.WHITE.getRGB();
                }
            }
            ++a11;
            ++a14;
        }
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return (int)a2;
    }

    private String Method1219(String a) {
        String a2 = "";
        for (char a3 : a.toCharArray()) {
            if (a3 >= '\uc350' && a3 <= '\uea60' || a3 == '\u26bd') continue;
            a2 = String.valueOf((Object)a2) + a3;
        }
        a = a2.replace((CharSequence)"\u00a7r", (CharSequence)"").replace('\u25ac', '=').replace('\u2764', '\u2665').replace('\u22c6', '\u2606').replace('\u2620', '\u2606').replace('\u2730', '\u2606').replace((CharSequence)"\u272b", (CharSequence)"\u2606").replace((CharSequence)"\u2719", (CharSequence)"+").replace((CharSequence)"\uf8ff", (CharSequence)"").replace((CharSequence)"\u2b1b", (CharSequence)"\u25a0\u25a0");
        a = a.replace('\u2b05', '\u2190').replace('\u2b06', '\u2191').replace('\u2b07', '\u2193').replace('\u27a1', '\u2192').replace('\u2b08', '\u2197').replace('\u2b0b', '\u2199').replace('\u2b09', '\u2196').replace('\u2b0a', '\u2198');
        return a;
    }

    public int Method1220(String a, float a2, float a3, int a4) {
        this.Method1218(StringUtils.stripControlCodes((String)a), a2 + 0.5f, a3 + 0.5f, 0, 1.0f);
        return this.Method1217(a, a2, a3, a4);
    }

    public int Method1221(String a, float a2, float a3, int a4) {
        this.Method1218(StringUtils.stripControlCodes((String)a), a2 + 0.8f, a3 + 0.8f, 0, 1.0f);
        return this.Method1217(a, a2, a3, a4);
    }

    public int Method1222(String a, float a2, float a3, int a4) {
        return this.Method1217(a, a2 - (float)((int)this.Method1225(a) / 2), a3, a4);
    }

    public void Method1223(String a, float a2, float a3, int a4, float a5) {
        this.Method1218(a, a2 - (float)((int)this.Method1225(a) / 2), a3, a4, a5);
    }

    public void Method1224(String a, float a2, float a3, int a4) {
        this.Method1222(StringUtils.stripControlCodes((String)a), a2 + 0.5f, a3 + 0.5f, -16777216);
        this.Method1222(a, a2, a3, a4);
    }

    public float Method1225(String a) {
        if (this.Field2629.containsKey((Object)a)) {
            return ((Float)this.Field2629.Method2665((Object)a)).floatValue();
        }
        float a2 = 0.0f;
        String a3 = StringUtils.stripControlCodes((String)a);
        for (char a4 : a3.toCharArray()) {
            a2 += (float)this.Field2626.Method1053(Character.toString((char)a4)) + this.Field2628;
        }
        this.Field2629.put((Object)a, (Object)Float.valueOf((float)(a2 / 2.0f)));
        return a2 / 2.0f;
    }

    public float Method1226(char a) {
        return this.Field2626.Method1053(String.valueOf((char)a));
    }

    public float Method1227(String a) {
        if (this.Field2630.containsKey((Object)a)) {
            return ((Float)this.Field2630.Method2665((Object)a)).floatValue();
        }
        float a2 = (float)this.Field2626.Method1051(a) / 2.0f;
        this.Field2630.put((Object)a, (Object)Float.valueOf((float)a2));
        return a2;
    }

    public float Method1228() {
        return (float)this.Field2626.Method1051("FluxIsThatBestClarinet.") / 2.0f;
    }

    public Class573 Method1229() {
        return this.Field2626;
    }

    public String Method1230(String a, int a2) {
        return this.Method1231(a, a2, false);
    }

    public String Method1231(String a, int a2, boolean a3) {
        a = this.Method1219(a);
        StringBuilder a4 = new StringBuilder();
        float a5 = 0.0f;
        int a6 = a.length() - 1;
        int a7 = -1;
        boolean a8 = false;
        boolean a9 = false;
        int a10 = a6;
        while (true) {
            if (a10 >= a.length() || !(a5 < (float)a2)) break;
            char a11 = a.charAt(a10);
            float a12 = this.Method1226(a11);
            a8 = false;
            if (a11 != 'l' && a11 != 'L') {
                if (a11 == 'r' || a11 == 'R') {
                    a9 = false;
                }
            } else {
                a9 = true;
            }
            if (a5 > (float)a2) break;
            a4.insert(0, a11);
            a10 += a7;
        }
        return a4.toString();
    }

    public static int Method1232(int a, float a2) {
        Color a3 = new Color(a);
        float a4 = 0.003921569f * (float)a3.getRed();
        float a5 = 0.003921569f * (float)a3.getGreen();
        float a6 = 0.003921569f * (float)a3.getBlue();
        return new Color(a4, a5, a6, a2).getRGB();
    }

    public static void Method1233(Class91[] class91Array) {
        Field2631 = class91Array;
    }

    public static Class91[] Method1234() {
        return Field2631;
    }

    static {
        Class563.Method1233(new Class91[5]);
    }
}