/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Graphics2D
 *  java.awt.Paint
 *  java.awt.geom.AffineTransform
 *  java.awt.image.BufferedImage
 *  java.awt.image.RenderedImage
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class Class197
extends Class193 {
    private int Field1170;
    private int Field1171;
    private int Field1172;
    private int Field1173;
    private Paint Field1174;

    public Class197() {
    }

    public Class197(int a, int a2, int a3, int a4, Paint a5) {
        this.Field1170 = a;
        this.Field1172 = a2;
        this.Field1171 = a3;
        this.Field1173 = a4;
        this.Field1174 = a5;
    }

    public void Method9(int a) {
        this.Field1170 = a;
    }

    public int Method10() {
        return this.Field1170;
    }

    public void Method11(int a) {
        this.Field1171 = a;
    }

    public int Method12() {
        return this.Field1171;
    }

    public void Method13(int a) {
        this.Field1172 = a;
    }

    public int Method14() {
        return this.Field1172;
    }

    public void Method15(int a) {
        this.Field1173 = a;
    }

    public int Method16() {
        return this.Field1173;
    }

    public void Method1276(Paint a) {
        this.Field1174 = a;
    }

    public Paint Method1277() {
        return this.Field1174;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        int a3 = a.getWidth();
        int a4 = a.getHeight();
        a2 = new BufferedImage(a3 + this.Field1170 + this.Field1171, a4 + this.Field1172 + this.Field1173, a.getType());
        Graphics2D a5 = a2.createGraphics();
        if (this.Field1174 != null) {
            a5.setPaint(this.Field1174);
            if (this.Field1170 > 0) {
                a5.fillRect(0, 0, this.Field1170, a4);
            }
            if (this.Field1171 > 0) {
                a5.fillRect(a3 - this.Field1171, 0, this.Field1171, a4);
            }
            if (this.Field1172 > 0) {
                a5.fillRect(this.Field1170, 0, a3 - this.Field1170 - this.Field1171, this.Field1172);
            }
            if (this.Field1173 > 0) {
                a5.fillRect(this.Field1170, a4 - this.Field1173, a3 - this.Field1170 - this.Field1171, this.Field1173);
            }
        }
        a5.drawRenderedImage((RenderedImage)a, AffineTransform.getTranslateInstance((double)this.Field1170, (double)this.Field1171));
        a5.dispose();
        return a2;
    }

    public String toString() {
        return "Distort/Border...";
    }
}