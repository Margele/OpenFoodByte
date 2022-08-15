/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Composite
 *  java.awt.CompositeContext
 *  java.awt.RenderingHints
 *  java.awt.image.ColorModel
 *  java.lang.Object
 */
package awsl;

import awsl.Class240;
import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class Class254
implements Composite {
    private int Field1391;

    public Class254(int a) {
        this.Field1391 = a;
    }

    public CompositeContext Method1356(ColorModel a, ColorModel a2, RenderingHints a3) {
        return new Class240(this.Field1391, a, a2);
    }

    public int Method2103() {
        return 0;
    }

    public boolean Method2104(Object a) {
        return a instanceof Class254;
    }
}