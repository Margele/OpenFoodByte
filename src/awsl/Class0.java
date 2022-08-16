/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 */
package awsl;

import awsl.Class148;
import awsl.Class264;
import awsl.Class267;
import awsl.Class31;
import awsl.Class37;
import awsl.Class45;
import obfuscate.b;

public class Class0
extends Class267 {
    private static final b Field0 = b.Method3205("java/lang/Object");
    private int[] Field1 = new int[40];
    private Object[] Field2 = new Object[20];
    protected final int Field3;
    protected int Field4;
    private boolean Field5;

    public Class0(int a, String a2, Class267 a3) {
        this(327680, a, a2, a3);
        if (this.getClass() != Class0.class) {
            throw new IllegalStateException();
        }
    }

    protected Class0(int a2, int a3, String a4, Class267 a5) {
        super(a2, a5);
        b[] a6 = b.Method3211(a4);
        this.Field4 = (8 & a3) == 0 ? 1 : 0;
        for (int a7 = 0; a7 < a6.length; ++a7) {
            this.Field4 += a6[a7].Method3233();
        }
        this.Field3 = this.Field4;
    }

    @Override
    public void Method1840(int a2, int a3) {
        b a4;
        switch (a2) {
            case 22: 
            case 55: {
                a4 = b.Field579;
                break;
            }
            case 24: 
            case 57: {
                a4 = b.Field580;
                break;
            }
            case 23: 
            case 56: {
                a4 = b.Field578;
                break;
            }
            case 21: 
            case 54: {
                a4 = b.Field577;
                break;
            }
            default: {
                a4 = Field0;
            }
        }
        this.Field1460.Method1840(a2, this.Method1850(a3, a4));
    }

    @Override
    public void Method1841(int a2, int a3) {
        this.Field1460.Method1841(this.Method1850(a2, b.Field577), a3);
    }

    @Override
    public void Method1842(int a2, int a3) {
        this.Field1460.Method1842(a2, this.Field4);
    }

    @Override
    public void Method1843(String a2, String a3, String a4, Class264 a5, Class264 a6, int a7) {
        int a8 = this.Method1850(a7, b.Method3204(a3));
        this.Field1460.Method1843(a2, a3, a4, a5, a6, a8);
    }

    @Override
    public Class148 Method1844(int a2, Class31 a3, Class264[] a4, Class264[] a5, int[] a6, String a7, boolean a8) {
        b a9 = b.Method3204(a7);
        int[] a10 = new int[a6.length];
        for (int a11 = 0; a11 < a10.length; ++a11) {
            a10[a11] = this.Method1850(a6[a11], a9);
        }
        return this.Field1460.Method1844(a2, a3, a4, a5, a10, a7, a8);
    }

    @Override
    public void Method1845(int a2, int a3, Object[] a4, int a5, Object[] a6) {
        int a7;
        Object[] a8;
        block12: {
            int a9;
            block14: {
                block13: {
                    boolean a10 = Class37.Method3383();
                    if (a2 != -1) {
                        throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
                    }
                    if (!this.Field5) {
                        this.Field1460.Method1845(a2, a3, a4, a5, a6);
                        return;
                    }
                    a8 = new Object[this.Field2.length];
                    System.arraycopy((Object)this.Field2, (int)0, (Object)a8, (int)0, (int)a8.length);
                    this.Method1847(this.Field2);
                    int a11 = 0;
                    a7 = 0;
                    if (a7 < a3) {
                        int a12;
                        Object a13 = a4[a7];
                        int n = a12 = a13 == Class45.Field400 || a13 == Class45.Field399 ? 2 : 1;
                        if (a13 != Class45.Field396) {
                            b a14 = Field0;
                            if (a13 == Class45.Field397) {
                                a14 = b.Field577;
                            }
                            if (a13 == Class45.Field398) {
                                a14 = b.Field578;
                            }
                            if (a13 == Class45.Field400) {
                                a14 = b.Field579;
                            }
                            if (a13 == Class45.Field399) {
                                a14 = b.Field580;
                            }
                            if (a13 instanceof String) {
                                a14 = b.Method3205((String)a13);
                            }
                            this.Method1849(this.Method1850(a11, a14), a13);
                        }
                        a11 += a12;
                        ++a7;
                    }
                    a11 = 0;
                    a7 = 0;
                    a9 = 0;
                    if (a11 >= this.Field2.length) break block12;
                    Object a15 = this.Field2[a11++];
                    if (a15 == Class45.Field396) break block13;
                    this.Field2[a9] = a15;
                    a7 = a9 + 1;
                    if (a15 != Class45.Field400 && a15 != Class45.Field399) break block14;
                    ++a11;
                }
                this.Field2[a9] = Class45.Field396;
            }
            ++a9;
        }
        this.Field1460.Method1845(a2, a7, this.Field2, a5, a6);
        this.Field2 = a8;
    }

    public int Method1846(b a2) {
        Object a3;
        switch (a2.Method3217()) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                a3 = Class45.Field397;
                break;
            }
            case 6: {
                a3 = Class45.Field398;
                break;
            }
            case 7: {
                a3 = Class45.Field400;
                break;
            }
            case 8: {
                a3 = Class45.Field399;
                break;
            }
            case 9: {
                a3 = a2.Method3225();
                break;
            }
            default: {
                a3 = a2.Method3221();
            }
        }
        int a4 = this.Method1851(a2);
        this.Method1848(a4, a2);
        this.Method1849(a4, a3);
        this.Field5 = true;
        return a4;
    }

    protected void Method1847(Object[] a2) {
    }

    protected void Method1848(int a2, b a3) {
    }

    private void Method1849(int a2, Object a3) {
        int a4 = this.Field2.length;
        if (a2 >= a4) {
            Object[] a5 = new Object[Math.max((int)(2 * a4), (int)(a2 + 1))];
            System.arraycopy((Object)this.Field2, (int)0, (Object)a5, (int)0, (int)a4);
            this.Field2 = a5;
        }
        this.Field2[a2] = a3;
    }

    private int Method1850(int a2, b a3) {
        int a4;
        block2: {
            int a5;
            if (a2 + a3.Method3233() <= this.Field3) {
                return a2;
            }
            int a6 = 2 * a2 + a3.Method3233() - 1;
            if (a6 >= (a5 = this.Field1.length)) {
                int[] a7 = new int[Math.max((int)(2 * a5), (int)(a6 + 1))];
                System.arraycopy((Object)this.Field1, (int)0, (Object)a7, (int)0, (int)a5);
                this.Field1 = a7;
            }
            a4 = this.Field1[a6];
            a4 = this.Method1851(a3);
            this.Method1848(a4, a3);
            this.Field1[a6] = a4 + 1;
            if (a4 == a2) break block2;
            this.Field5 = true;
        }
        return a4;
    }

    protected int Method1851(b a2) {
        int a3 = this.Field4;
        this.Field4 += a2.Method3233();
        return a3;
    }

    private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}