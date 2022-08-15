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

public class Class72
extends Class193 {
    private BufferedImageOp Field688;
    private int Field689;

    public Class72(BufferedImageOp a, int a2) {
        this.Field688 = a;
        this.Field689 = a2;
    }

    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        BufferedImage a3;
        BufferedImage bufferedImage = a;
        boolean a4 = Class193.Method1269();
        int a5 = 0;
        if (a5 < this.Field689) {
            a3 = this.Field688.Method62(a3, a2);
            ++a5;
        }
        return a3;
    }
}