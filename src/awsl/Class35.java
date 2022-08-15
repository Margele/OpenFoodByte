/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Composite
 *  java.awt.Font
 *  java.awt.Graphics2D
 *  java.awt.Paint
 *  java.awt.RenderingHints
 *  java.awt.geom.AffineTransform
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Class35
extends Class193 {
    private String Field293;
    private Font Field294;
    private Paint Field295;
    private Composite Field296;
    private AffineTransform Field297;

    public Class35() {
    }

    public Class35(String a, Font a2, Paint a3, Composite a4, AffineTransform a5) {
        this.Field293 = a;
        this.Field294 = a2;
        this.Field296 = a4;
        this.Field295 = a3;
        this.Field297 = a5;
    }

    public void Method496(String a) {
        this.Field293 = a;
    }

    public String Method497() {
        return this.Field293;
    }

    public void Method1289(Composite a) {
        this.Field296 = a;
    }

    public Composite Method1290() {
        return this.Field296;
    }

    public void Method1276(Paint a) {
        this.Field295 = a;
    }

    public Paint Method1277() {
        return this.Field295;
    }

    public void Method3417(Font a) {
        this.Field294 = a;
    }

    public Font Method3418() {
        return this.Field294;
    }

    public void Method1291(AffineTransform a) {
        this.Field297 = a;
    }

    public AffineTransform Method1292() {
        return this.Field297;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        a2 = this.Method1263(a, null);
        Graphics2D a3 = a2.createGraphics();
        a3.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        if (this.Field294 != null) {
            a3.setFont(this.Field294);
        }
        if (this.Field297 != null) {
            a3.setTransform(this.Field297);
        }
        if (this.Field296 != null) {
            a3.setComposite(this.Field296);
        }
        if (this.Field295 != null) {
            a3.setPaint(this.Field295);
        }
        if (this.Field293 != null) {
            a3.drawString(this.Field293, 10, 100);
        }
        a3.dispose();
        return a2;
    }
}