/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.AlphaComposite
 *  java.awt.Color
 *  java.awt.Composite
 *  java.awt.GradientPaint
 *  java.awt.Graphics2D
 *  java.awt.Paint
 *  java.awt.Shape
 *  java.awt.image.BufferedImage
 *  java.awt.image.RenderedImage
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class Class66
extends Class193 {
    private float Field649 = 1.0f;
    private float Field650 = 0.5f;
    private float Field651;
    private float Field652;
    private float Field653;
    private float Field654;

    public void Method56(float a) {
        this.Field652 = a;
    }

    public float Method57() {
        return this.Field652;
    }

    public void Method58(float a) {
        this.Field651 = a;
    }

    public float Method59() {
        return this.Field651;
    }

    public void Method60(float a) {
        this.Field653 = a;
    }

    public float Method61() {
        return this.Field653;
    }

    public void Method164(float a) {
        this.Field654 = a;
    }

    public float Method165() {
        return this.Field654;
    }

    public void Method166(float a) {
        this.Field649 = a;
    }

    public float Method167() {
        return this.Field649;
    }

    public void Method168(float a) {
        this.Field650 = a;
    }

    public float Method169() {
        return this.Field650;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        a2 = this.Method1263(a, null);
        BufferedImage a3 = a;
        int a4 = a.getWidth();
        int a5 = a.getHeight();
        int a6 = (int)(this.Field650 * (float)a5);
        int a7 = (int)(this.Field654 * (float)a5);
        Graphics2D a8 = a2.createGraphics();
        Shape a9 = a8.getClip();
        a8.clipRect(0, 0, a4, a6);
        a8.drawRenderedImage((RenderedImage)a, null);
        a8.setClip(a9);
        a8.clipRect(0, a6 + a7, a4, a5 - a6 - a7);
        a8.translate(0, 2 * a6 + a7);
        a8.scale(1.0, -1.0);
        a8.drawRenderedImage((RenderedImage)a, null);
        a8.setPaint((Paint)new GradientPaint(0.0f, 0.0f, new Color(1.0f, 0.0f, 0.0f, 0.0f), 0.0f, (float)a6, new Color(0.0f, 1.0f, 0.0f, this.Field649)));
        a8.setComposite((Composite)AlphaComposite.getInstance((int)6));
        a8.fillRect(0, 0, a4, a6);
        a8.setClip(a9);
        a8.dispose();
        return a2;
    }

    public String toString() {
        return "Effects/Mirror...";
    }
}