/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.image.BufferedImage
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class60;
import awsl.Class833;
import java.awt.image.BufferedImage;

public class Class830
extends Class833 {
    private float Field3686 = 0.5f;
    private float Field3687 = 1.0f;

    public void Method164(float a) {
        this.Field3686 = a;
    }

    public float Method165() {
        return this.Field3686;
    }

    public void Method166(float a) {
        this.Field3687 = a;
    }

    public float Method167() {
        return this.Field3687;
    }

    @Override
    public BufferedImage Method62(BufferedImage a, BufferedImage a2) {
        this.Method11(1);
        a2 = super.Method62(a, a2);
        Class60 a3 = new Class60(this);
        return a3.Method62(a2, a2);
    }

    @Override
    public String toString() {
        return "Effects/Chrome...";
    }

    static float Method3649(Class830 a) {
        return a.Field3686;
    }

    static float Method3650(Class830 a) {
        return a.Field3687;
    }
}