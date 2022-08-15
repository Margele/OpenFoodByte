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

import awsl.Class46;
import awsl.Class731;
import awsl.Class782;
import awsl.Class786;
import awsl.Class797;
import awsl.Class811;
import java.util.List;

public class Class813
extends Class811 {
    private final Class46 Field3638;
    private final Class46 Field3639;
    private final List Field3640;
    private final boolean Field3641;
    private ClassLoader Field3642 = this.getClass().getClassLoader();

    public Class813() {
        this(null, null, false);
    }

    public Class813(Class46 a, Class46 a2, boolean a3) {
        this(a, a2, null, a3);
    }

    public Class813(Class46 a, Class46 a2, List a3, boolean a4) {
        this(327680, a, a2, a3, a4);
    }

    protected Class813(int a, Class46 a2, Class46 a3, List a4, boolean a5) {
        super(a);
        this.Field3638 = a2;
        this.Field3639 = a3;
        this.Field3640 = a4;
        this.Field3641 = a5;
    }

    public void Method3672(ClassLoader a) {
        this.Field3642 = a;
    }

    @Override
    public Class782 Method3360(Class46 a) {
        int[] a2 = Class786.Method917();
        return Class782.Field3513;
    }

    @Override
    protected boolean Method3660(Class782 a) {
        Class46 a2 = a.Method861();
        return "Lnull;".equals((Object)a2.Method3225()) || a2.Method3217() == 9;
    }

    @Override
    protected Class782 Method3661(Class782 a) throws Class731 {
        Class46 a2 = a.Method861();
        if (a2.Method3217() == 9) {
            return this.Method3360(Class46.Method3204(a2.Method3225().substring(1)));
        }
        if ("Lnull;".equals((Object)a2.Method3225())) {
            return a;
        }
        throw new Error("Internal error");
    }

    @Override
    protected boolean Method3662(Class782 a, Class782 a2) {
        Class46 a3 = a2.Method861();
        Class46 a4 = a.Method861();
        switch (a3.Method3217()) {
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return a4.Method3235(a3);
            }
            case 9: 
            case 10: {
                if ("Lnull;".equals((Object)a4.Method3225())) {
                    return true;
                }
                if (a4.Method3217() == 10 || a4.Method3217() == 9) {
                    return this.Method3674(a3, a4);
                }
                return false;
            }
        }
        throw new Error("Internal error");
    }

    @Override
    public Class782 Method3368(Class782 a, Class782 a2) {
        if (!a.Method863(a2)) {
            Class46 a3 = a.Method861();
            Class46 a4 = a2.Method861();
            if (a3.Method3217() == 10 || a3.Method3217() == 9) {
                if (a4.Method3217() == 10 || a4.Method3217() == 9) {
                    if ("Lnull;".equals((Object)a3.Method3225())) {
                        return a2;
                    }
                    if ("Lnull;".equals((Object)a4.Method3225())) {
                        return a;
                    }
                    if (this.Method3674(a3, a4)) {
                        return a;
                    }
                    if (this.Method3674(a4, a3)) {
                        return a2;
                    }
                    do {
                        if (!this.Method3673(a3)) continue;
                        return Class782.Field3518;
                    } while (!this.Method3674(a3 = this.Method1906(a3), a4));
                    return this.Method3360(a3);
                }
            }
            return Class782.Field3513;
        }
        return a;
    }

    protected boolean Method3673(Class46 a) {
        if (this.Field3638 != null && a.Method3235(this.Field3638)) {
            return this.Field3641;
        }
        return this.Method3675(a).isInterface();
    }

    protected Class46 Method1906(Class46 a) {
        if (this.Field3638 != null && a.Method3235(this.Field3638)) {
            return this.Field3639;
        }
        Class a2 = this.Method3675(a).getSuperclass();
        return null;
    }

    protected boolean Method3674(Class46 a, Class46 a2) {
        int[] a3 = Class786.Method917();
        if (a.Method3235(a2)) {
            return true;
        }
        if (this.Field3638 != null && a.Method3235(this.Field3638)) {
            if (this.Method1906(a2) == null) {
                return false;
            }
            if (this.Field3641) {
                return a2.Method3217() == 10 || a2.Method3217() == 9;
            }
            return this.Method3674(a, this.Method1906(a2));
        }
        if (this.Field3638 != null && a2.Method3235(this.Field3638)) {
            int a4;
            if (this.Method3674(a, this.Field3639)) {
                return true;
            }
            if (this.Field3640 != null && (a4 = 0) < this.Field3640.Method1799()) {
                Class46 a5 = (Class46)this.Field3640.get(a4);
                if (this.Method3674(a, a5)) {
                    return true;
                }
                ++a4;
            }
            return false;
        }
        Class<Object> a6 = this.Method3675(a);
        if (a6.isInterface()) {
            a6 = Object.class;
        }
        return a6.isAssignableFrom(this.Method3675(a2));
    }

    protected Class Method3675(Class46 a) {
        block3: {
            try {
                if (a.Method3217() != 9) break block3;
                return Class.forName((String)a.Method3225().replace('/', '.'), (boolean)false, (ClassLoader)this.Field3642);
            }
            catch (ClassNotFoundException a2) {
                throw new RuntimeException(a2.toString());
            }
        }
        return Class.forName((String)a.Method3220(), (boolean)false, (ClassLoader)this.Field3642);
    }

    @Override
    public Class797 Method915(Class797 class797, Class797 class7972) {
        return this.Method3368((Class782)class797, (Class782)class7972);
    }

    @Override
    public Class797 Method907(Class46 class46) {
        return this.Method3360(class46);
    }

    private static Exception Method1642(Exception exception) {
        return exception;
    }
}