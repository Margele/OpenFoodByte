/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.AlphaComposite
 *  java.awt.Color
 *  java.awt.Composite
 *  java.awt.Graphics2D
 *  java.awt.image.BufferedImage
 *  java.awt.image.RenderedImage
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class111;
import awsl.Class187;
import awsl.Class193;
import awsl.Class246;
import awsl.Class40;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class Class882
extends Class193 {
    private float Field3849 = 5.0f;
    private float Field3850 = 5.4977875f;
    private float Field3851 = 5.0f;
    private float Field3852 = 0.5f;
    private boolean Field3853 = false;
    private int Field3854 = -1;
    private float Field3855 = 0.2f;
    private float Field3856 = 0.0f;

    public void Method56(float a) {
        this.Field3850 = a;
    }

    public float Method57() {
        return this.Field3850;
    }

    public void Method58(float a) {
        this.Field3851 = a;
    }

    public float Method59() {
        return this.Field3851;
    }

    public void Method60(float a) {
        this.Field3849 = a;
    }

    public float Method61() {
        return this.Field3849;
    }

    public void Method164(float a) {
        this.Field3852 = a;
    }

    public float Method165() {
        return this.Field3852;
    }

    public void Method9(int a) {
        this.Field3854 = a;
    }

    public int Method10() {
        return this.Field3854;
    }

    public void Method87(boolean a) {
        this.Field3853 = a;
    }

    public boolean Method88() {
        return this.Field3853;
    }

    public void Method166(float a) {
        this.Field3855 = a;
    }

    public float Method167() {
        return this.Field3855;
    }

    public void Method168(float a) {
        this.Field3856 = a;
    }

    public float Method169() {
        return this.Field3856;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        a2 = this.Method1263(a, null);
        float a5 = this.Field3851 * (float)Math.cos((double)this.Field3850);
        float a6 = -this.Field3851 * (float)Math.sin((double)this.Field3850);
        BufferedImage a7 = new BufferedImage(a3, a4, 2);
        Class111 a8 = new Class111(this.Field3852 * 10.0f, 0.75f, 0.1f);
        a7 = a8.Method62(a, null);
        BufferedImage a9 = new BufferedImage(a3, a4, 2);
        Graphics2D a10 = a9.createGraphics();
        a10.setColor(new Color(this.Field3854));
        a10.fillRect(0, 0, a3, a4);
        a10.setComposite((Composite)AlphaComposite.DstIn);
        a10.drawRenderedImage((RenderedImage)a7, null);
        a10.setComposite((Composite)AlphaComposite.DstOut);
        a10.translate((double)a5, (double)a6);
        a10.drawRenderedImage((RenderedImage)a7, null);
        a10.dispose();
        a9 = new Class187(this.Field3849).Method62(a9, null);
        a9 = new Class40(3.0f * this.Field3855).Method62(a9, a9);
        a10 = a2.createGraphics();
        a10.drawRenderedImage((RenderedImage)a, null);
        a10.setComposite((Composite)new Class246(1.0f));
        a10.drawRenderedImage((RenderedImage)a9, null);
        a10.dispose();
        return a2;
    }

    public String toString() {
        return "Stylize/Shine...";
    }
}