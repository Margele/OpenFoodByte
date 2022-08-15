/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Object
 */
package awsl;

import awsl.Class599;
import java.awt.Color;

public class Class600
extends Class599 {
    public Class600() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Class600(float[] a) {
        this.Field2813 = a[0];
        this.Field2814 = a[1];
        this.Field2815 = a[2];
        this.Field2816 = a[3];
    }

    public Class600(float a, float a2, float a3, float a4) {
        this.Field2813 = a;
        this.Field2814 = a2;
        this.Field2815 = a3;
        this.Field2816 = a4;
    }

    public Class600(Class600 a) {
        this.Field2813 = a.Field2813;
        this.Field2814 = a.Field2814;
        this.Field2815 = a.Field2815;
        this.Field2816 = a.Field2816;
    }

    public Class600(Class599 a) {
        this.Field2813 = a.Field2813;
        this.Field2814 = a.Field2814;
        this.Field2815 = a.Field2815;
        this.Field2816 = a.Field2816;
    }

    public Class600(Color a) {
        this.Method3790(a);
    }

    public void Method3790(Color a) {
        this.Method114(a.getRGBComponents(null));
    }

    public Color Method3791() {
        return new Color(this.Field2813, this.Field2814, this.Field2815, this.Field2816);
    }
}