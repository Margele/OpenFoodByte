/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.CompositeContext
 *  java.awt.RenderingHints
 *  java.awt.image.ColorModel
 *  java.lang.Object
 */
package awsl;

import awsl.Class151;
import awsl.Class236;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class Class242
extends Class236 {
    public Class242(float a) {
        super(a);
    }

    public CompositeContext Method1356(ColorModel a, ColorModel a2, RenderingHints a3) {
        return new Class151(this.Field1299, a, a2);
    }
}