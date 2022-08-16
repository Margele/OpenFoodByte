/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Error
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.List
 */
package awsl;

import awsl.Class731;
import awsl.Class782;
import awsl.Class786;
import awsl.Class797;
import awsl.Class811;
import java.util.List;
import obfuscate.b;

public class Class813
extends Class811 {
    private final b Field3638;
    private final b Field3639;
    private final List Field3640;
    private final boolean Field3641;
    private ClassLoader Field3642 = this.getClass().getClassLoader();

    public Class813() {
        this(null, null, false);
    }

    public Class813(b a2, b a3, boolean a4) {
        this(a2, a3, null, a4);
    }

    public Class813(b a2, b a3, List a4, boolean a5) {
        this(327680, a2, a3, a4, a5);
    }

    protected Class813(int a2, b a3, b a4, List a5, boolean a6) {
        super(a2);
        this.Field3638 = a3;
        this.Field3639 = a4;
        this.Field3640 = a5;
        this.Field3641 = a6;
    }

    public void Method3672(ClassLoader a2) {
        this.Field3642 = a2;
    }

    @Override
    public Class782 Method3360(b a2) {
        int[] a3 = Class786.Method917();
        return Class782.Field3513;
    }

    @Override
    protected boolean Method3660(Class782 a2) {
        b a3 = a2.Method861();
        return "Lnull;".equals((Object)a3.Method3225()) || a3.Method3217() == 9;
    }

    @Override
    protected Class782 Method3661(Class782 a2) throws Class731 {
        b a3 = a2.Method861();
        if (a3.Method3217() == 9) {
            return this.Method3360(b.Method3204(a3.Method3225().substring(1)));
        }
        if ("Lnull;".equals((Object)a3.Method3225())) {
            return a2;
        }
        throw new Error("Internal error");
    }

    @Override
    protected boolean Method3662(Class782 a2, Class782 a3) {
        b a4 = a3.Method861();
        b a5 = a2.Method861();
        switch (a4.Method3217()) {
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return a5.Method3235(a4);
            }
            case 9: 
            case 10: {
                if ("Lnull;".equals((Object)a5.Method3225())) {
                    return true;
                }
                if (a5.Method3217() == 10 || a5.Method3217() == 9) {
                    return this.Method3674(a4, a5);
                }
                return false;
            }
        }
        throw new Error("Internal error");
    }

    @Override
    public Class782 Method3368(Class782 a2, Class782 a3) {
        if (!a2.Method863(a3)) {
            b a4 = a2.Method861();
            b a5 = a3.Method861();
            if (a4.Method3217() == 10 || a4.Method3217() == 9) {
                if (a5.Method3217() == 10 || a5.Method3217() == 9) {
                    if ("Lnull;".equals((Object)a4.Method3225())) {
                        return a3;
                    }
                    if ("Lnull;".equals((Object)a5.Method3225())) {
                        return a2;
                    }
                    if (this.Method3674(a4, a5)) {
                        return a2;
                    }
                    if (this.Method3674(a5, a4)) {
                        return a3;
                    }
                    do {
                        if (!this.Method3673(a4)) continue;
                        return Class782.Field3518;
                    } while (!this.Method3674(a4 = this.Method1906(a4), a5));
                    return this.Method3360(a4);
                }
            }
            return Class782.Field3513;
        }
        return a2;
    }

    protected boolean Method3673(b a2) {
        if (this.Field3638 != null && a2.Method3235(this.Field3638)) {
            return this.Field3641;
        }
        return this.Method3675(a2).isInterface();
    }

    protected b Method1906(b a2) {
        if (this.Field3638 != null && a2.Method3235(this.Field3638)) {
            return this.Field3639;
        }
        Class a3 = this.Method3675(a2).getSuperclass();
        return null;
    }

    protected boolean Method3674(b a2, b a3) {
        int[] a4 = Class786.Method917();
        if (a2.Method3235(a3)) {
            return true;
        }
        if (this.Field3638 != null && a2.Method3235(this.Field3638)) {
            if (this.Method1906(a3) == null) {
                return false;
            }
            if (this.Field3641) {
                return a3.Method3217() == 10 || a3.Method3217() == 9;
            }
            return this.Method3674(a2, this.Method1906(a3));
        }
        if (this.Field3638 != null && a3.Method3235(this.Field3638)) {
            int a5;
            if (this.Method3674(a2, this.Field3639)) {
                return true;
            }
            if (this.Field3640 != null && (a5 = 0) < this.Field3640.Method1799()) {
                b a6 = (b)this.Field3640.get(a5);
                if (this.Method3674(a2, a6)) {
                    return true;
                }
                ++a5;
            }
            return false;
        }
        Class<Object> a7 = this.Method3675(a2);
        if (a7.isInterface()) {
            a7 = Object.class;
        }
        return a7.isAssignableFrom(this.Method3675(a3));
    }

    protected Class Method3675(b a2) {
        block3: {
            try {
                if (a2.Method3217() != 9) break block3;
                return Class.forName((String)a2.Method3225().replace('/', '.'), (boolean)false, (ClassLoader)this.Field3642);
            }
            catch (ClassNotFoundException a3) {
                throw new RuntimeException(a3.toString());
            }
        }
        return Class.forName((String)a2.Method3220(), (boolean)false, (ClassLoader)this.Field3642);
    }

    @Override
    public Class797 Method915(Class797 class797, Class797 class7972) {
        return this.Method3368((Class782)class797, (Class782)class7972);
    }

    @Override
    public Class797 Method907(b b2) {
        return this.Method3360(b2);
    }

    private static Exception Method1642(Exception exception) {
        return exception;
    }
}