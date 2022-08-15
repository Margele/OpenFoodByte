/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class46;
import awsl.Class797;

public class Class782
implements Class797 {
    public static final Class782 Field3513 = new Class782(null);
    public static final Class782 Field3514 = new Class782(Class46.Field577);
    public static final Class782 Field3515 = new Class782(Class46.Field578);
    public static final Class782 Field3516 = new Class782(Class46.Field579);
    public static final Class782 Field3517 = new Class782(Class46.Field580);
    public static final Class782 Field3518 = new Class782(Class46.Method3205("java/lang/Object"));
    public static final Class782 Field3519 = new Class782(Class46.Field572);
    private final Class46 Field3520;

    public Class782(Class46 a) {
        this.Field3520 = a;
    }

    public Class46 Method861() {
        return this.Field3520;
    }

    @Override
    public int Method806() {
        return this.Field3520 == Class46.Field579 || this.Field3520 == Class46.Field580 ? 2 : 1;
    }

    public boolean Method862() {
        return this.Field3520 != null && (this.Field3520.Method3217() == 10 || this.Field3520.Method3217() == 9);
    }

    public boolean Method863(Object a) {
        if (a == this) {
            return true;
        }
        if (a instanceof Class782) {
            if (this.Field3520 == null) {
                return ((Class782)a).Field3520 == null;
            }
            return this.Field3520.Method3235(((Class782)a).Field3520);
        }
        return false;
    }

    public int Method864() {
        return this.Field3520 == null ? 0 : this.Field3520.Method3236();
    }

    public String Method865() {
        if (this == Field3513) {
            return ".";
        }
        if (this == Field3519) {
            return "A";
        }
        if (this == Field3518) {
            return "R";
        }
        return this.Field3520.Method3225();
    }
}