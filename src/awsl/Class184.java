/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.awt.image.BufferedImageOp
 *  java.lang.Object
 */
package awsl;

import awsl.Class193;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class Class184
extends Class193 {
    private BufferedImageOp Field1142;
    private BufferedImageOp Field1143;

    public Class184(BufferedImageOp a, BufferedImageOp a2) {
        this.Field1142 = a;
        this.Field1143 = a2;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        BufferedImage a3 = this.Field1142.Method62(a, a2);
        a3 = this.Field1143.Method62(a3, a2);
        return a3;
    }
}