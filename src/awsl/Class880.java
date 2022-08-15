/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.BasicStroke
 *  java.awt.Color
 *  java.awt.Graphics2D
 *  java.awt.RenderingHints
 *  java.awt.Stroke
 *  java.awt.image.BufferedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Random
 */
package awsl;

import awsl.Class193;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Class880
extends Class193 {
    private float Field3839 = 0.1f;
    private float Field3840;
    private float Field3841 = 1.0f;
    private float Field3842 = 0.5f;
    private float Field3843 = 0.5f;
    private int Field3844 = -1;
    private int Field3845 = 0;

    public void Method56(float a) {
        this.Field3840 = a;
    }

    public float Method57() {
        return this.Field3840;
    }

    public void Method58(float a) {
        this.Field3841 = a;
    }

    public float Method59() {
        return this.Field3841;
    }

    public void Method60(float a) {
        this.Field3839 = a;
    }

    public float Method61() {
        return this.Field3839;
    }

    public void Method164(float a) {
        this.Field3843 = a;
    }

    public float Method165() {
        return this.Field3843;
    }

    public void Method166(float a) {
        this.Field3842 = a;
    }

    public float Method167() {
        return this.Field3842;
    }

    public void Method9(int a) {
        this.Field3844 = a;
    }

    public int Method10() {
        return this.Field3844;
    }

    public void Method11(int a) {
        this.Field3845 = a;
    }

    public int Method12() {
        return this.Field3845;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        boolean a3 = Class193.Method1269();
        a2 = this.Method1263(a, null);
        int a4 = a.getWidth();
        int a5 = a.getHeight();
        int a6 = (int)(this.Field3839 * (float)a4 * (float)a5 / 100.0f);
        float a7 = this.Field3843 * (float)a4;
        Random a8 = new Random((long)this.Field3845);
        Graphics2D a9 = a2.createGraphics();
        a9.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        a9.setColor(new Color(this.Field3844));
        a9.setStroke((Stroke)new BasicStroke(this.Field3842));
        int a10 = 0;
        if (a10 < a6) {
            float a11 = (float)a4 * a8.nextFloat();
            float a12 = (float)a5 * a8.nextFloat();
            float a13 = this.Field3840 + (float)Math.PI * 2 * (this.Field3841 * (a8.nextFloat() - 0.5f));
            float a14 = (float)Math.sin((double)a13) * a7;
            float a15 = (float)Math.cos((double)a13) * a7;
            float a16 = a11 - a15;
            float a17 = a12 - a14;
            float a18 = a11 + a15;
            float a19 = a12 + a14;
            a9.drawLine((int)a16, (int)a17, (int)a18, (int)a19);
            ++a10;
        }
        a9.dispose();
        return a2;
    }

    public String toString() {
        return "Render/Scratches...";
    }
}