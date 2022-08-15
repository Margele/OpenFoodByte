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
import awsl.Class46;

public class Class0
extends Class267 {
    private static final Class46 Field0 = Class46.Method3205("java/lang/Object");
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

    protected Class0(int a, int a2, String a3, Class267 a4) {
        super(a, a4);
        Class46[] a5 = Class46.Method3211(a3);
        this.Field4 = (8 & a2) == 0 ? 1 : 0;
        for (int a6 = 0; a6 < a5.length; ++a6) {
            this.Field4 += a5[a6].Method3233();
        }
        this.Field3 = this.Field4;
    }

    @Override
    public void Method1840(int a, int a2) {
        Class46 a3;
        switch (a) {
            case 22: 
            case 55: {
                a3 = Class46.Field579;
                break;
            }
            case 24: 
            case 57: {
                a3 = Class46.Field580;
                break;
            }
            case 23: 
            case 56: {
                a3 = Class46.Field578;
                break;
            }
            case 21: 
            case 54: {
                a3 = Class46.Field577;
                break;
            }
            default: {
                a3 = Field0;
            }
        }
        this.Field1460.Method1840(a, this.Method1850(a2, a3));
    }

    @Override
    public void Method1841(int a, int a2) {
        this.Field1460.Method1841(this.Method1850(a, Class46.Field577), a2);
    }

    @Override
    public void Method1842(int a, int a2) {
        this.Field1460.Method1842(a, this.Field4);
    }

    @Override
    public void Method1843(String a, String a2, String a3, Class264 a4, Class264 a5, int a6) {
        int a7 = this.Method1850(a6, Class46.Method3204(a2));
        this.Field1460.Method1843(a, a2, a3, a4, a5, a7);
    }

    @Override
    public Class148 Method1844(int a, Class31 a2, Class264[] a3, Class264[] a4, int[] a5, String a6, boolean a7) {
        Class46 a8 = Class46.Method3204(a6);
        int[] a9 = new int[a5.length];
        for (int a10 = 0; a10 < a9.length; ++a10) {
            a9[a10] = this.Method1850(a5[a10], a8);
        }
        return this.Field1460.Method1844(a, a2, a3, a4, a9, a6, a7);
    }

    @Override
    public void Method1845(int a, int a2, Object[] a3, int a4, Object[] a5) {
        int a6;
        Object[] a7;
        block12: {
            int a8;
            block14: {
                block13: {
                    boolean a9 = Class37.Method3383();
                    if (a != -1) {
                        throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
                    }
                    if (!this.Field5) {
                        this.Field1460.Method1845(a, a2, a3, a4, a5);
                        return;
                    }
                    a7 = new Object[this.Field2.length];
                    System.arraycopy((Object)this.Field2, (int)0, (Object)a7, (int)0, (int)a7.length);
                    this.Method1847(this.Field2);
                    int a10 = 0;
                    a6 = 0;
                    if (a6 < a2) {
                        int a11;
                        Object a12 = a3[a6];
                        int n = a11 = a12 == Class45.Field400 || a12 == Class45.Field399 ? 2 : 1;
                        if (a12 != Class45.Field396) {
                            Class46 a13 = Field0;
                            if (a12 == Class45.Field397) {
                                a13 = Class46.Field577;
                            }
                            if (a12 == Class45.Field398) {
                                a13 = Class46.Field578;
                            }
                            if (a12 == Class45.Field400) {
                                a13 = Class46.Field579;
                            }
                            if (a12 == Class45.Field399) {
                                a13 = Class46.Field580;
                            }
                            if (a12 instanceof String) {
                                a13 = Class46.Method3205((String)a12);
                            }
                            this.Method1849(this.Method1850(a10, a13), a12);
                        }
                        a10 += a11;
                        ++a6;
                    }
                    a10 = 0;
                    a6 = 0;
                    a8 = 0;
                    if (a10 >= this.Field2.length) break block12;
                    Object a14 = this.Field2[a10++];
                    if (a14 == Class45.Field396) break block13;
                    this.Field2[a8] = a14;
                    a6 = a8 + 1;
                    if (a14 != Class45.Field400 && a14 != Class45.Field399) break block14;
                    ++a10;
                }
                this.Field2[a8] = Class45.Field396;
            }
            ++a8;
        }
        this.Field1460.Method1845(a, a6, this.Field2, a4, a5);
        this.Field2 = a7;
    }

    public int Method1846(Class46 a) {
        Object a2;
        switch (a.Method3217()) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                a2 = Class45.Field397;
                break;
            }
            case 6: {
                a2 = Class45.Field398;
                break;
            }
            case 7: {
                a2 = Class45.Field400;
                break;
            }
            case 8: {
                a2 = Class45.Field399;
                break;
            }
            case 9: {
                a2 = a.Method3225();
                break;
            }
            default: {
                a2 = a.Method3221();
            }
        }
        int a3 = this.Method1851(a);
        this.Method1848(a3, a);
        this.Method1849(a3, a2);
        this.Field5 = true;
        return a3;
    }

    protected void Method1847(Object[] a) {
    }

    protected void Method1848(int a, Class46 a2) {
    }

    private void Method1849(int a, Object a2) {
        int a3 = this.Field2.length;
        if (a >= a3) {
            Object[] a4 = new Object[Math.max((int)(2 * a3), (int)(a + 1))];
            System.arraycopy((Object)this.Field2, (int)0, (Object)a4, (int)0, (int)a3);
            this.Field2 = a4;
        }
        this.Field2[a] = a2;
    }

    private int Method1850(int a, Class46 a2) {
        int a3;
        block2: {
            int a4;
            if (a + a2.Method3233() <= this.Field3) {
                return a;
            }
            int a5 = 2 * a + a2.Method3233() - 1;
            if (a5 >= (a4 = this.Field1.length)) {
                int[] a6 = new int[Math.max((int)(2 * a4), (int)(a5 + 1))];
                System.arraycopy((Object)this.Field1, (int)0, (Object)a6, (int)0, (int)a4);
                this.Field1 = a6;
            }
            a3 = this.Field1[a5];
            a3 = this.Method1851(a2);
            this.Method1848(a3, a2);
            this.Field1[a5] = a3 + 1;
            if (a3 == a) break block2;
            this.Field5 = true;
        }
        return a3;
    }

    protected int Method1851(Class46 a) {
        int a2 = this.Field4;
        this.Field4 += a.Method3233();
        return a2;
    }

    private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}