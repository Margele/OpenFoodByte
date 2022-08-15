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
import awsl.Class91;
import com.google.gson.JsonObject;
import java.awt.Color;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
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
        JsonObject a = new JsonObject();
        int a2 = Class259.Method2273();
        a.addProperty("label", this.Field1420);
        a.addProperty("server", this.Field1421);
        a.addProperty("x", (Number)Double.valueOf((double)this.Field1422));
        a.addProperty("y", (Number)Double.valueOf((double)this.Field1423));
        a.addProperty("z", (Number)Double.valueOf((double)this.Field1424));
        a.addProperty("dimension", (Number)Integer.valueOf((int)this.Field1425));
        if (Class91.Method3648() == null) {
            Class259.Method2271(++a2);
        }
        return a;
    }

    public void Method2842(JsonObject a) {
        this.Field1420 = a.get("label").getAsString();
        this.Field1421 = a.get("server").getAsString();
        this.Field1422 = a.get("x").getAsInt();
        this.Field1423 = a.get("y").getAsInt();
        this.Field1424 = a.get("z").getAsInt();
        this.Field1425 = a.get("dimension").getAsInt();
    }

    public void Method2843(FontRenderer a, String a2, String a3, float a4, boolean a5) {
        GlStateManager.scale((float)1.0f, (float)1.0f, (float)1.0f);
        int a6 = a.getStringWidth(a2 + a3) / 2;
        RenderUtils.Method1103((float)(-a6) - 1.0f, 0.0f, a.getStringWidth(a2 + a3) + 1, -a.FONT_HEIGHT, new Color(0, 0, 0, 80).getRGB());
        int n = Class259.Method2272();
        a.drawStringWithShadow(a2 + a3, (float)(-a6), -8.0f, -1);
        int a7 = n;
        Class91.Method3647(new String[1]);
    }
}