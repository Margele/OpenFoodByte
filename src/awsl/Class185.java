/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Composite
 *  java.awt.Graphics2D
 *  java.awt.RenderingHints
 *  java.awt.geom.AffineTransform
 *  java.awt.image.BufferedImage
 *  java.awt.image.RenderedImage
 *  java.lang.Object
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class Class185
extends Class193 {
    private Composite Field1144;
    private AffineTransform Field1145;

    public Class185() {
    }

    public Class185(Composite a) {
        this.Field1144 = a;
    }

    public Class185(Composite a, AffineTransform a2) {
        this.Field1144 = a;
        this.Field1145 = a2;
    }

    public void Method1289(Composite a) {
        this.Field1144 = a;
    }

    public Composite Method1290() {
        return this.Field1144;
    }

    public void Method1291(AffineTransform a) {
        this.Field1145 = a;
    }

    public AffineTransform Method1292() {
        return this.Field1145;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        a2 = this.Method1263(a, null);
        Graphics2D a3 = a2.createGraphics();
        a3.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        a3.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        a3.setComposite(this.Field1144);
        a3.drawRenderedImage((RenderedImage)a, this.Field1145);
        a3.dispose();
        return a2;
    }

    public String toString() {
        return "Composite";
    }
}