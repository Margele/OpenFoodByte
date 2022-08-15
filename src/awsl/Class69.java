/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class39;
import awsl.Class63;
import awsl.Class801;
import awsl.Class91;

public class Class69
extends Class63 {
    public static final int Field664 = 0;
    public static final int Field665 = 1;
    public static final int Field666 = 2;
    private static final int Field667 = 1;
    private static final int Field668 = 2;
    private static final int Field669 = 4;
    private static final int Field670 = 8;
    private static final int Field671 = 16;
    private static final int Field672 = 32;
    private static final int Field673 = 64;
    private static final int Field674 = 128;
    private static final int Field675 = 256;
    private final int Field676;
    private int Field677;
    private boolean Field678;
    private final Class63 Field679;

    public Class69(int a, Class63 a2) {
        this(327680, a, a2);
    }

    protected Class69(int a, int a2, Class63 a3) {
        super(a);
        this.Field676 = a2;
        this.Field677 = 1;
        this.Field679 = a3;
    }

    @Override
    public void Method3610(String a) {
        block1: {
            if (this.Field676 == 2 || this.Field677 != 1 && this.Field677 != 2 && this.Field677 != 4) {
                throw new IllegalStateException();
            }
            Class39.Method3390(a, "formal type parameter");
            this.Field677 = 2;
            if (this.Field679 == null) break block1;
            this.Field679.Method3610(a);
        }
    }

    @Override
    public Class63 Method3611() {
        if (this.Field677 != 2) {
            throw new IllegalStateException();
        }
        this.Field677 = 4;
        Class63 a = this.Field679 == null ? null : this.Field679.Method3611();
        return new Class69(2, a);
    }

    @Override
    public Class63 Method3612() {
        if (this.Field677 != 2 && this.Field677 != 4) {
            throw new IllegalArgumentException();
        }
        Class63 a = this.Field679 == null ? null : this.Field679.Method3612();
        return new Class69(2, a);
    }

    @Override
    public Class63 Method3613() {
        if (this.Field676 != 0 || (this.Field677 & 7) == 0) {
            throw new IllegalArgumentException();
        }
        this.Field677 = 8;
        Class63 a = this.Field679 == null ? null : this.Field679.Method3613();
        return new Class69(2, a);
    }

    @Override
    public Class63 Method3614() {
        if (this.Field677 != 8) {
            throw new IllegalStateException();
        }
        Class63 a = this.Field679 == null ? null : this.Field679.Method3614();
        return new Class69(2, a);
    }

    @Override
    public Class63 Method3615() {
        if (this.Field676 != 1 || (this.Field677 & 0x17) == 0) {
            throw new IllegalArgumentException();
        }
        this.Field677 = 16;
        Class63 a = this.Field679 == null ? null : this.Field679.Method3615();
        return new Class69(2, a);
    }

    @Override
    public Class63 Method3616() {
        Class69 a;
        block1: {
            Class91[] a2 = Class801.Method3300();
            if (this.Field676 != 1 || (this.Field677 & 0x17) == 0) {
                throw new IllegalArgumentException();
            }
            this.Field677 = 32;
            Class63 a3 = this.Field679 == null ? null : this.Field679.Method3616();
            a = new Class69(2, a3);
            a.Field678 = true;
            if (Class91.Method3648() != null) break block1;
            Class801.Method3299(new Class91[5]);
        }
        return a;
    }

    @Override
    public Class63 Method3617() {
        if (this.Field677 != 32) {
            throw new IllegalStateException();
        }
        Class63 a = this.Field679 == null ? null : this.Field679.Method3617();
        return new Class69(2, a);
    }

    @Override
    public void Method3618(char a) {
        block2: {
            if (this.Field676 != 2 || this.Field677 != 1) {
                throw new IllegalStateException();
            }
            if (a == 'V' ? !this.Field678 : "ZCBSIFJD".indexOf((int)a) == -1) {
                throw new IllegalArgumentException();
            }
            this.Field677 = 64;
            if (this.Field679 == null) break block2;
            this.Field679.Method3618(a);
        }
    }

    @Override
    public void Method3619(String a) {
        block1: {
            if (this.Field676 != 2 || this.Field677 != 1) {
                throw new IllegalStateException();
            }
            Class39.Method3390(a, "type variable");
            this.Field677 = 64;
            if (this.Field679 == null) break block1;
            this.Field679.Method3619(a);
        }
    }

    @Override
    public Class63 Method3620() {
        if (this.Field676 != 2 || this.Field677 != 1) {
            throw new IllegalStateException();
        }
        this.Field677 = 64;
        Class63 a = this.Field679 == null ? null : this.Field679.Method3620();
        return new Class69(2, a);
    }

    @Override
    public void Method3621(String a) {
        block1: {
            if (this.Field676 != 2 || this.Field677 != 1) {
                throw new IllegalStateException();
            }
            Class39.Method3393(a, "class name");
            this.Field677 = 128;
            if (this.Field679 == null) break block1;
            this.Field679.Method3621(a);
        }
    }

    @Override
    public void Method3622(String a) {
        block1: {
            if (this.Field677 != 128) {
                throw new IllegalStateException();
            }
            Class39.Method3390(a, "inner class name");
            if (this.Field679 == null) break block1;
            this.Field679.Method3622(a);
        }
    }

    @Override
    public void Method3623() {
        block1: {
            if (this.Field677 != 128) {
                throw new IllegalStateException();
            }
            if (this.Field679 == null) break block1;
            this.Field679.Method3623();
        }
    }

    @Override
    public Class63 Method3624(char a) {
        if (this.Field677 != 128) {
            throw new IllegalStateException();
        }
        if ("+-=".indexOf((int)a) == -1) {
            throw new IllegalArgumentException();
        }
        Class63 a2 = this.Field679 == null ? null : this.Field679.Method3624(a);
        return new Class69(2, a2);
    }

    @Override
    public void Method3625() {
        block1: {
            if (this.Field677 != 128) {
                throw new IllegalStateException();
            }
            this.Field677 = 256;
            if (this.Field679 == null) break block1;
            this.Field679.Method3625();
        }
    }

    private static IllegalStateException Method3781(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}