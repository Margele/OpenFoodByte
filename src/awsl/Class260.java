/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  java.awt.Color
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.renderer.GlStateManager
 */
package awsl;

import awsl.Class259;
import com.google.gson.JsonObject;
import java.awt.Color;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import obfuscate.a;
import trash.foodbyte.utils.RenderUtils;

public class Class260 {
    private String Field1420;
    private String Field1421;
    private double Field1422;
    private double Field1423;
    private double Field1424;
    private int Field1425;

    public Class260(String a, double a2, double a3, double a4, String a5, int a6) {
        this.Field1420 = a;
        this.Field1422 = a2;
        this.Field1423 = a3;
        this.Field1424 = a4;
        this.Field1421 = a5;
        this.Field1425 = a6;
    }

    public Class260() {
    }

    public String Method2835() {
        return this.Field1420;
    }

    public String Method2836() {
        return this.Field1421;
    }

    public double Method2837() {
        return this.Field1422;
    }

    public double Method2838() {
        return this.Field1423;
    }

    public double Method2839() {
        return this.Field1424;
    }

    public int Method2840() {
        return this.Field1425;
    }

    public JsonObject Method2841() {
        JsonObject a2 = new JsonObject();
        int a3 = Class259.Method2273();
        a2.addProperty("label", this.Field1420);
        a2.addProperty("server", this.Field1421);
        a2.addProperty("x", (Number)Double.valueOf((double)this.Field1422));
        a2.addProperty("y", (Number)Double.valueOf((double)this.Field1423));
        a2.addProperty("z", (Number)Double.valueOf((double)this.Field1424));
        a2.addProperty("dimension", (Number)Integer.valueOf((int)this.Field1425));
        if (a.trash() == null) {
            Class259.Method2271(++a3);
        }
        return a2;
    }

    public void Method2842(JsonObject a2) {
        this.Field1420 = a2.get("label").getAsString();
        this.Field1421 = a2.get("server").getAsString();
        this.Field1422 = a2.get("x").getAsInt();
        this.Field1423 = a2.get("y").getAsInt();
        this.Field1424 = a2.get("z").getAsInt();
        this.Field1425 = a2.get("dimension").getAsInt();
    }

    public void Method2843(FontRenderer a2, String a3, String a4, float a5, boolean a6) {
        GlStateManager.scale((float)1.0f, (float)1.0f, (float)1.0f);
        int a7 = a2.getStringWidth(a3 + a4) / 2;
        RenderUtils.Method1103((float)(-a7) - 1.0f, 0.0f, a2.getStringWidth(a3 + a4) + 1, -a2.FONT_HEIGHT, new Color(0, 0, 0, 80).getRGB());
        int n = Class259.Method2272();
        a2.drawStringWithShadow(a3 + a4, (float)(-a7), -8.0f, -1);
        int a8 = n;
        a.trash(new String[1]);
    }
}