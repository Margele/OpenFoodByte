/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.util.StringUtils
 */
package awsl;

import awsl.Class416;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.StringUtils;
import obfuscate.a;

public class Class415 {
    private static FontRenderer Field2010;

    public static void Method2360() {
        Field2010 = Minecraft.getMinecraft().fontRendererObj;
    }

    public static int Method2361(String a) {
        return Field2010.getStringWidth(StringUtils.stripControlCodes((String)a));
    }

    public static int Method2362() {
        return Class415.Field2010.FONT_HEIGHT;
    }

    public static void Method2363(String a, double a2, double a3, int a4) {
        Field2010.drawString(a, (int)a2, (int)a3, a4);
    }

    public static void Method2364(String a, double a2, double a3, int a4) {
        Field2010.drawStringWithShadow(a, (float)a2, (float)a3, a4);
    }

    public static void Method2365(String a, double a2, double a3, int a4) {
        Class415.Method2363(a, a2 - (double)(Field2010.getStringWidth(a) / 2), a3, a4);
    }

    public static void Method2366(String a, double a2, double a3, int a4) {
        Class415.Method2364(a, a2 - (double)(Field2010.getStringWidth(a) / 2), a3, a4);
    }

    public static void Method2367(String a, double a2, double a3, int a4) {
        Class415.Method2363(a, a2 - (double)(Field2010.getStringWidth(a) / 2), a3 - (double)(Class415.Field2010.FONT_HEIGHT / 2), a4);
    }

    public static void Method2368(String a2, double a3, double a4, int a5) {
        int n = Class416.Method2355();
        Class415.Method2364(a2, a3 - (double)(Field2010.getStringWidth(a2) / 2), a4 - (double)((float)Class415.Field2010.FONT_HEIGHT / 2.0f), a5);
        int n2 = n;
        if (a.trash() == null) {
            Class416.Method2354(++n2);
        }
    }
}