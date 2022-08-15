/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.System
 *  java.util.HashMap
 *  java.util.Map
 */
package awsl;

import awsl.Class136;
import awsl.Class264;
import awsl.Class279;
import awsl.Class31;
import awsl.Class33;
import awsl.Class46;
import awsl.Class63;
import awsl.Class79;
import awsl.Class801;
import awsl.Class806;
import awsl.Class90;
import awsl.Class91;
import java.util.HashMap;
import java.util.Map;

public class Class804
extends Class801 {
    public static final int Field3597 = 0;
    public static final int Field3598 = 1;
    public static final int Field3599 = 2;
    public static final int Field3600 = 3;
    public static final int Field3601 = 4;
    public static final int Field3602 = 5;
    public static final int Field3603 = 6;
    public static final int Field3604 = 7;
    public static final int Field3605 = 8;
    public static final int Field3606 = 9;
    protected String Field3607 = "  ";
    protected String Field3608 = "    ";
    protected String Field3609 = "      ";
    protected String Field3610 = "   ";
    protected Map Field3611;
    private int Field3612;
    private int Field3613 = 0;

    public Class804() {
        this(327680);
        if (this.getClass() != Class804.class) {
            throw new IllegalStateException();
        }
    }

    protected Class804(int a) {
        super(a);
    }

    public static void main(String[] a) throws Exception {
        boolean a2 = false;
        int a3 = 2;
        boolean a4 = true;
        if (a.length < 1 || a.length > 2) {
            a4 = false;
        }
        if ("-debug".equals((Object)a[0])) {
            a2 = true;
            a3 = 0;
            if (a.length != 2) {
                a4 = false;
            }
        }
        System.err.println("Prints a disassembled view of the given class.");
        System.err.println("Usage: Textifier [-debug] <fully qualified class name or class file name>");
    }

    @Override
    public void Method3245(int a, int a2, String a3, String a4, String a5, String[] a6) {
        this.Field3612 = a2;
        int a7 = a & 0xFFFF;
        int a8 = a >>> 16;
        this.Field3579.setLength(0);
        this.Field3579.append("// class version ").append(a7).append('.').append(a8).append(" (").append(a).append(")\n");
        if ((a2 & 0x20000) != 0) {
            this.Field3579.append("// DEPRECATED\n");
        }
        this.Field3579.append("// access flags 0x").append(Integer.toHexString((int)a2).toUpperCase()).append('\n');
        this.Method3354(5, a4);
        Class90 a9 = new Class90(a2);
        Class79 a10 = new Class79(a4);
        a10.Method3748(a9);
        this.Field3579.append("// declaration: ").append(a3).append(a9.Method3626()).append('\n');
        this.Method3356(a2 & 0xFFFFFFDF);
        if ((a2 & 0x2000) != 0) {
            this.Field3579.append("@interface ");
        } else if ((a2 & 0x200) != 0) {
            this.Field3579.append("interface ");
        } else if ((a2 & 0x4000) == 0) {
            this.Field3579.append("class ");
        }
        this.Method3354(0, a3);
        if (!"java/lang/Object".equals((Object)a5)) {
            this.Field3579.append(" extends ");
            this.Method3354(0, a5);
            this.Field3579.append(' ');
        }
        if (a6.length > 0) {
            this.Field3579.append(" implements ");
            for (int a11 = 0; a11 < a6.length; ++a11) {
                this.Method3354(0, a6[a11]);
                this.Field3579.append(' ');
            }
        }
        this.Field3579.append(" {\n\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3246(String a, String a2) {
        block0: {
            this.Field3579.setLength(0);
            this.Field3579.append(this.Field3607).append("// compiled from: ").append(a).append('\n');
            this.Field3579.append(this.Field3607).append("// debug info: ").append(a2).append('\n');
            if (this.Field3579.length() <= 0) break block0;
            this.Field3580.Method2530((Object)this.Field3579.toString());
        }
    }

    @Override
    public void Method3247(String a, String a2, String a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append("OUTERCLASS ");
        this.Method3354(0, a);
        this.Field3579.append(' ');
        this.Field3579.append(a2).append(' ');
        this.Method3354(3, a3);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class804 Method3333(String a, boolean a2) {
        this.Field3580.Method2530((Object)"\n");
        return this.Method3351(a, a2);
    }

    @Override
    public Class801 Method3249(int a, Class31 a2, String a3, boolean a4) {
        this.Field3580.Method2530((Object)"\n");
        return this.Method3352(a, a2, a3, a4);
    }

    @Override
    public void Method3250(Class136 a) {
        this.Field3580.Method2530((Object)"\n");
        this.Method3323(a);
    }

    @Override
    public void Method3251(String a, String a2, String a3, int a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append("// access flags 0x");
        this.Field3579.append(Integer.toHexString((int)(a4 & 0xFFFFFFDF)).toUpperCase()).append('\n');
        this.Field3579.append(this.Field3607);
        this.Method3356(a4);
        this.Field3579.append("INNERCLASS ");
        this.Method3354(0, a);
        this.Field3579.append(' ');
        this.Method3354(0, a2);
        this.Field3579.append(' ');
        this.Method3354(0, a3);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class804 Method3334(int a, String a2, String a3, String a4, Object a5) {
        this.Field3579.setLength(0);
        this.Field3579.append('\n');
        if ((a & 0x20000) != 0) {
            this.Field3579.append(this.Field3607).append("// DEPRECATED\n");
        }
        this.Field3579.append(this.Field3607).append("// access flags 0x").append(Integer.toHexString((int)a).toUpperCase()).append('\n');
        this.Field3579.append(this.Field3607);
        this.Method3354(2, a4);
        Object a6 = new Class90(0);
        Class79 a7 = new Class79(a4);
        a7.Method3749((Class63)a6);
        this.Field3579.append(this.Field3607).append("// declaration: ").append(((Class90)a6).Method3626()).append('\n');
        this.Field3579.append(this.Field3607);
        this.Method3356(a);
        this.Method3354(1, a3);
        this.Field3579.append(' ').append(a2);
        this.Field3579.append(" = ");
        if (a5 instanceof String) {
            this.Field3579.append('\"').append(a5).append('\"');
        } else {
            this.Field3579.append(a5);
        }
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        a6 = this.Method3353();
        this.Field3580.Method2530((Object)((Class801)a6).Method3295());
        return a6;
    }

    public Class804 Method3335(int a, String a2, String a3, String a4, String[] a5) {
        this.Field3579.setLength(0);
        this.Field3579.append('\n');
        if ((a & 0x20000) != 0) {
            this.Field3579.append(this.Field3607).append("// DEPRECATED\n");
        }
        this.Field3579.append(this.Field3607).append("// access flags 0x").append(Integer.toHexString((int)a).toUpperCase()).append('\n');
        this.Field3579.append(this.Field3607);
        this.Method3354(4, a4);
        Object a6 = new Class90(0);
        Class79 a7 = new Class79(a4);
        a7.Method3748((Class63)a6);
        String a8 = ((Class90)a6).Method3626();
        String a9 = ((Class90)a6).Method3627();
        String a10 = ((Class90)a6).Method3628();
        this.Field3579.append(this.Field3607).append("// declaration: ").append(a9).append(' ').append(a2).append(a8);
        this.Field3579.append(" throws ").append(a10);
        this.Field3579.append('\n');
        this.Field3579.append(this.Field3607);
        this.Method3356(a & 0xFFFFFFBF);
        if ((a & 0x100) != 0) {
            this.Field3579.append("native ");
        }
        if ((a & 0x80) != 0) {
            this.Field3579.append("varargs ");
        }
        if ((a & 0x40) != 0) {
            this.Field3579.append("bridge ");
        }
        if ((this.Field3612 & 0x200) != 0 && (a & 0x400) == 0 && (a & 8) == 0) {
            this.Field3579.append("default ");
        }
        this.Field3579.append(a2);
        this.Method3354(3, a3);
        if (a5.length > 0) {
            this.Field3579.append(" throws ");
            for (int a11 = 0; a11 < a5.length; ++a11) {
                this.Method3354(0, a5[a11]);
                this.Field3579.append(' ');
            }
        }
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        a6 = this.Method3353();
        this.Field3580.Method2530((Object)((Class801)a6).Method3295());
        return a6;
    }

    @Override
    public void Method3254() {
        this.Field3580.Method2530((Object)"}\n");
    }

    @Override
    public void Method3255(String a, Object a2) {
        this.Field3579.setLength(0);
        this.Method3357(this.Field3613++);
        this.Field3579.append(a).append('=');
        if (a2 instanceof String) {
            this.Method3343((String)a2);
        } else if (a2 instanceof Class46) {
            this.Method3344((Class46)a2);
        } else if (a2 instanceof Byte) {
            this.Method3341((Byte)a2);
        } else if (a2 instanceof Boolean) {
            this.Method3342((Boolean)a2);
        } else if (a2 instanceof Short) {
            this.Method3340((Short)a2);
        } else if (a2 instanceof Character) {
            this.Method3339(((Character)a2).charValue());
        } else if (a2 instanceof Integer) {
            this.Method3325((Integer)a2);
        } else if (a2 instanceof Float) {
            this.Method3337(((Float)a2).floatValue());
        } else if (a2 instanceof Long) {
            this.Method3336((Long)a2);
        } else if (a2 instanceof Double) {
            this.Method3338((Double)a2);
        } else if (a2.getClass().isArray()) {
            this.Field3579.append('{');
            if (a2 instanceof byte[]) {
                byte[] a3 = (byte[])a2;
                for (int a4 = 0; a4 < a3.length; ++a4) {
                    this.Method3357(a4);
                    this.Method3341(a3[a4]);
                }
            } else if (a2 instanceof boolean[]) {
                boolean[] a5 = (boolean[])a2;
                for (int a6 = 0; a6 < a5.length; ++a6) {
                    this.Method3357(a6);
                    this.Method3342(a5[a6]);
                }
            } else if (a2 instanceof short[]) {
                short[] a7 = (short[])a2;
                for (int a8 = 0; a8 < a7.length; ++a8) {
                    this.Method3357(a8);
                    this.Method3340(a7[a8]);
                }
            } else if (a2 instanceof char[]) {
                char[] a9 = (char[])a2;
                for (int a10 = 0; a10 < a9.length; ++a10) {
                    this.Method3357(a10);
                    this.Method3339(a9[a10]);
                }
            } else if (a2 instanceof int[]) {
                int[] a11 = (int[])a2;
                for (int a12 = 0; a12 < a11.length; ++a12) {
                    this.Method3357(a12);
                    this.Method3325(a11[a12]);
                }
            } else if (a2 instanceof long[]) {
                long[] a13 = (long[])a2;
                for (int a14 = 0; a14 < a13.length; ++a14) {
                    this.Method3357(a14);
                    this.Method3336(a13[a14]);
                }
            } else if (a2 instanceof float[]) {
                float[] a15 = (float[])a2;
                for (int a16 = 0; a16 < a15.length; ++a16) {
                    this.Method3357(a16);
                    this.Method3337(a15[a16]);
                }
            } else if (a2 instanceof double[]) {
                double[] a17 = (double[])a2;
                for (int a18 = 0; a18 < a17.length; ++a18) {
                    this.Method3357(a18);
                    this.Method3338(a17[a18]);
                }
            }
            this.Field3579.append('}');
        }
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    private void Method3325(int a) {
        this.Field3579.append(a);
    }

    private void Method3336(long a) {
        this.Field3579.append(a).append('L');
    }

    private void Method3337(float a) {
        this.Field3579.append(a).append('F');
    }

    private void Method3338(double a) {
        this.Field3579.append(a).append('D');
    }

    private void Method3339(char a) {
        this.Field3579.append("(char)").append((int)a);
    }

    private void Method3340(short a) {
        this.Field3579.append("(short)").append((int)a);
    }

    private void Method3341(byte a) {
        this.Field3579.append("(byte)").append((int)a);
    }

    private void Method3342(boolean a) {
        this.Field3579.append(a);
    }

    private void Method3343(String a) {
        Class804.Method3297(this.Field3579, a);
    }

    private void Method3344(Class46 a) {
        this.Field3579.append(a.Method3220()).append(".class");
    }

    @Override
    public void Method3256(String a, String a2, String a3) {
        this.Field3579.setLength(0);
        this.Method3357(this.Field3613++);
        this.Field3579.append(a).append('=');
        this.Method3354(1, a2);
        this.Field3579.append('.').append(a3);
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class804 Method3345(String a, String a2) {
        this.Field3579.setLength(0);
        this.Method3357(this.Field3613++);
        this.Field3579.append(a).append('=');
        this.Field3579.append('@');
        this.Method3354(1, a2);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a3 = this.Method3353();
        this.Field3580.Method2530((Object)a3.Method3295());
        this.Field3580.Method2530((Object)")");
        return a3;
    }

    public Class804 Method3346(String a) {
        this.Field3579.setLength(0);
        this.Method3357(this.Field3613++);
        this.Field3579.append(a).append('=');
        this.Field3579.append('{');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a2 = this.Method3353();
        this.Field3580.Method2530((Object)a2.Method3295());
        this.Field3580.Method2530((Object)"}");
        return a2;
    }

    @Override
    public void Method3259() {
    }

    public Class804 Method3347(String a, boolean a2) {
        return this.Method3351(a, a2);
    }

    @Override
    public Class801 Method3261(int a, Class31 a2, String a3, boolean a4) {
        return this.Method3352(a, a2, a3, a4);
    }

    @Override
    public void Method3262(Class136 a) {
        this.Method3323(a);
    }

    @Override
    public void Method3263() {
    }

    @Override
    public void Method3264(String a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("// parameter ");
        this.Method3356(a2);
        this.Field3579.append(' ').append("<no name>").append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class804 Method3348() {
        this.Field3580.Method2530((Object)(this.Field3608 + "default="));
        Class804 a = this.Method3353();
        this.Field3580.Method2530((Object)a.Method3295());
        this.Field3580.Method2530((Object)"\n");
        return a;
    }

    public Class804 Method3349(String a, boolean a2) {
        return this.Method3351(a, a2);
    }

    @Override
    public Class801 Method3267(int a, Class31 a2, String a3, boolean a4) {
        return this.Method3352(a, a2, a3, a4);
    }

    public Class804 Method3350(int a, String a2, boolean a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append('@');
        this.Method3354(1, a2);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a4 = this.Method3353();
        this.Field3580.Method2530((Object)a4.Method3295());
        this.Field3580.Method2530((Object)") // parameter ");
        this.Field3580.Method2530((Object)new Integer(a));
        this.Field3580.Method2530((Object)"\n");
        return a4;
    }

    @Override
    public void Method3269(Class136 a) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append("ATTRIBUTE ");
        this.Method3354(-1, a.Field987);
        if (a instanceof Class806) {
            ((Class806)((Object)a)).Method3359(this.Field3579, this.Field3611);
        } else {
            this.Field3579.append(" : unknown\n");
        }
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3270() {
    }

    @Override
    public void Method3271(int a, int a2, Object[] a3, int a4, Object[] a5) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3610);
        this.Field3579.append("FRAME ");
        switch (a) {
            case -1: 
            case 0: {
                this.Field3579.append("FULL [");
                this.Method3328(a2, a3);
                this.Field3579.append("] [");
                this.Method3328(a4, a5);
                this.Field3579.append(']');
                break;
            }
            case 1: {
                this.Field3579.append("APPEND [");
                this.Method3328(a2, a3);
                this.Field3579.append(']');
                break;
            }
            case 2: {
                this.Field3579.append("CHOP ").append(a2);
                break;
            }
            case 3: {
                this.Field3579.append("SAME");
                break;
            }
            case 4: {
                this.Field3579.append("SAME1 ");
                this.Method3328(1, a5);
            }
        }
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3272(int a) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a]).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3273(int a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ').append(a == 188 ? Field3576[a2] : Integer.toString((int)a2)).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3274(int a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ').append(a2).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3275(int a, String a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ');
        this.Method3354(0, a2);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3276(int a, String a2, String a3, String a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ');
        this.Method3354(0, a2);
        this.Field3579.append('.').append(a3).append(" : ");
        this.Method3354(1, a4);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    @Deprecated
    public void Method3277(int a, String a2, String a3, String a4) {
        if (this.Field3578 >= 327680) {
            super.Method3277(a, a2, a3, a4);
            return;
        }
        this.Method3317(a, a2, a3, a4, a == 185);
    }

    @Override
    public void Method3278(int a, String a2, String a3, String a4, boolean a5) {
        if (this.Field3578 < 327680) {
            super.Method3278(a, a2, a3, a4, a5);
            return;
        }
        this.Method3317(a, a2, a3, a4, a5);
    }

    private void Method3317(int a, String a2, String a3, String a4, boolean a5) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ');
        this.Method3354(0, a2);
        this.Field3579.append('.').append(a3).append(' ');
        this.Method3354(3, a4);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3279(String a, String a2, Class279 a3, Object[] a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("INVOKEDYNAMIC").append(' ');
        this.Field3579.append(a);
        this.Method3354(3, a2);
        this.Field3579.append(" [");
        this.Field3579.append('\n');
        this.Field3579.append(this.Field3609);
        this.Method3355(a3);
        this.Field3579.append('\n');
        this.Field3579.append(this.Field3609).append("// arguments:");
        if (a4.length == 0) {
            this.Field3579.append(" none");
        } else {
            this.Field3579.append('\n');
            for (int a5 = 0; a5 < a4.length; ++a5) {
                this.Field3579.append(this.Field3609);
                Object a6 = a4[a5];
                if (a6 instanceof String) {
                    Class801.Method3297(this.Field3579, (String)a6);
                } else if (a6 instanceof Class46) {
                    Class46 a7 = (Class46)a6;
                    if (a7.Method3217() == 11) {
                        this.Method3354(3, a7.Method3225());
                    } else {
                        this.Field3579.append(a7.Method3225()).append(".class");
                    }
                } else if (a6 instanceof Class279) {
                    this.Method3355((Class279)a6);
                } else {
                    this.Field3579.append(a6);
                }
                this.Field3579.append(", \n");
            }
            this.Field3579.setLength(this.Field3579.length() - 3);
        }
        this.Field3579.append('\n');
        this.Field3579.append(this.Field3608).append("]\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3280(int a, Class264 a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ');
        this.Method3330(a2);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3281(Class264 a) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3610);
        this.Method3330(a);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3282(Object a) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("LDC ");
        if (a instanceof String) {
            Class801.Method3297(this.Field3579, (String)a);
        } else if (a instanceof Class46) {
            this.Field3579.append(((Class46)a).Method3225()).append(".class");
        } else {
            this.Field3579.append(a);
        }
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3283(int a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("IINC ").append(a).append(' ').append(a2).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3284(int a, int a2, Class264 a3, Class264[] a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("TABLESWITCH\n");
        for (int a5 = 0; a5 < a4.length; ++a5) {
            this.Field3579.append(this.Field3609).append(a + a5).append(": ");
            this.Method3330(a4[a5]);
            this.Field3579.append('\n');
        }
        this.Field3579.append(this.Field3609).append("default: ");
        this.Method3330(a3);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3285(Class264 a, int[] a2, Class264[] a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("LOOKUPSWITCH\n");
        for (int a4 = 0; a4 < a3.length; ++a4) {
            this.Field3579.append(this.Field3609).append(a2[a4]).append(": ");
            this.Method3330(a3[a4]);
            this.Field3579.append('\n');
        }
        this.Field3579.append(this.Field3609).append("default: ");
        this.Method3330(a);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3286(String a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("MULTIANEWARRAY ");
        this.Method3354(1, a);
        this.Field3579.append(' ').append(a2).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public Class801 Method3287(int a, Class31 a2, String a3, boolean a4) {
        return this.Method3352(a, a2, a3, a4);
    }

    @Override
    public void Method3288(Class264 a, Class264 a2, Class264 a3, String a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("TRYCATCHBLOCK ");
        this.Method3330(a);
        this.Field3579.append(' ');
        this.Method3330(a2);
        this.Field3579.append(' ');
        this.Method3330(a3);
        this.Field3579.append(' ');
        this.Method3354(0, a4);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public Class801 Method3289(int a, Class31 a2, String a3, boolean a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("TRYCATCHBLOCK @");
        this.Method3354(1, a3);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a5 = this.Method3353();
        this.Field3580.Method2530((Object)a5.Method3295());
        this.Field3579.setLength(0);
        this.Field3579.append(") : ");
        this.Method3358(a);
        this.Field3579.append(", ").append((Object)a2);
        this.Field3579.append("\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        return a5;
    }

    @Override
    public void Method3290(String a, String a2, String a3, Class264 a4, Class264 a5, int a6) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("LOCALVARIABLE ").append(a).append(' ');
        this.Method3354(1, a2);
        this.Field3579.append(' ');
        this.Method3330(a4);
        this.Field3579.append(' ');
        this.Method3330(a5);
        this.Field3579.append(' ').append(a6).append('\n');
        this.Field3579.append(this.Field3608);
        this.Method3354(2, a3);
        Class90 a7 = new Class90(0);
        Class79 a8 = new Class79(a3);
        a8.Method3749(a7);
        this.Field3579.append(this.Field3608).append("// declaration: ").append(a7.Method3626()).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public Class801 Method3291(int a, Class31 a2, Class264[] a3, Class264[] a4, int[] a5, String a6, boolean a7) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("LOCALVARIABLE @");
        this.Method3354(1, a6);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a8 = this.Method3353();
        this.Field3580.Method2530((Object)a8.Method3295());
        this.Field3579.setLength(0);
        this.Field3579.append(") : ");
        this.Method3358(a);
        this.Field3579.append(", ").append((Object)a2);
        for (int a9 = 0; a9 < a3.length; ++a9) {
            this.Field3579.append(" [ ");
            this.Method3330(a3[a9]);
            this.Field3579.append(" - ");
            this.Method3330(a4[a9]);
            this.Field3579.append(" - ").append(a5[a9]).append(" ]");
        }
        this.Field3579.append("\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        return a8;
    }

    @Override
    public void Method3292(int a, Class264 a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("LINENUMBER ").append(a).append(' ');
        this.Method3330(a2);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3293(int a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("MAXSTACK = ").append(a).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("MAXLOCALS = ").append(a2).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3294() {
    }

    public Class804 Method3351(String a, boolean a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append('@');
        this.Method3354(1, a);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a3 = this.Method3353();
        this.Field3580.Method2530((Object)a3.Method3295());
        this.Field3580.Method2530((Object)")\n");
        return a3;
    }

    public Class804 Method3352(int a, Class31 a2, String a3, boolean a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append('@');
        this.Method3354(1, a3);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a5 = this.Method3353();
        this.Field3580.Method2530((Object)a5.Method3295());
        this.Field3579.setLength(0);
        this.Field3579.append(") : ");
        this.Method3358(a);
        this.Field3579.append(", ").append((Object)a2);
        this.Field3579.append("\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        return a5;
    }

    public void Method3323(Class136 a) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append("ATTRIBUTE ");
        this.Method3354(-1, a.Field987);
        if (a instanceof Class806) {
            ((Class806)((Object)a)).Method3359(this.Field3579, null);
        } else {
            this.Field3579.append(" : unknown\n");
        }
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    protected Class804 Method3353() {
        return new Class804();
    }

    protected void Method3354(int a, String a2) {
        if (a == 5 || a == 2 || a == 4) {
            this.Field3579.append("// signature ").append(a2).append('\n');
        } else {
            this.Field3579.append(a2);
        }
    }

    protected void Method3330(Class264 a) {
        if (this.Field3611 == null) {
            this.Field3611 = new HashMap();
        }
        String a2 = (String)this.Field3611.Method2665((Object)a);
        a2 = "L" + this.Field3611.Method1799();
        this.Field3611.put((Object)a, (Object)a2);
        this.Field3579.append(a2);
    }

    protected void Method3355(Class279 a) {
        int a2 = a.Method2820();
        this.Field3579.append("// handle kind 0x").append(Integer.toHexString((int)a2)).append(" : ");
        boolean a3 = false;
        switch (a2) {
            case 1: {
                this.Field3579.append("GETFIELD");
                break;
            }
            case 2: {
                this.Field3579.append("GETSTATIC");
                break;
            }
            case 3: {
                this.Field3579.append("PUTFIELD");
                break;
            }
            case 4: {
                this.Field3579.append("PUTSTATIC");
                break;
            }
            case 9: {
                this.Field3579.append("INVOKEINTERFACE");
                a3 = true;
                break;
            }
            case 7: {
                this.Field3579.append("INVOKESPECIAL");
                a3 = true;
                break;
            }
            case 6: {
                this.Field3579.append("INVOKESTATIC");
                a3 = true;
                break;
            }
            case 5: {
                this.Field3579.append("INVOKEVIRTUAL");
                a3 = true;
                break;
            }
            case 8: {
                this.Field3579.append("NEWINVOKESPECIAL");
                a3 = true;
            }
        }
        this.Field3579.append('\n');
        this.Field3579.append(this.Field3609);
        this.Method3354(0, a.Method2821());
        this.Field3579.append('.');
        this.Field3579.append(a.Method2822());
        this.Field3579.append('(');
        this.Method3354(9, a.Method2823());
        this.Field3579.append(')');
    }

    private void Method3356(int a) {
        block12: {
            if ((a & 1) != 0) {
                this.Field3579.append("public ");
            }
            if ((a & 2) != 0) {
                this.Field3579.append("private ");
            }
            if ((a & 4) != 0) {
                this.Field3579.append("protected ");
            }
            if ((a & 0x10) != 0) {
                this.Field3579.append("final ");
            }
            if ((a & 8) != 0) {
                this.Field3579.append("static ");
            }
            if ((a & 0x20) != 0) {
                this.Field3579.append("synchronized ");
            }
            if ((a & 0x40) != 0) {
                this.Field3579.append("volatile ");
            }
            if ((a & 0x80) != 0) {
                this.Field3579.append("transient ");
            }
            if ((a & 0x400) != 0) {
                this.Field3579.append("abstract ");
            }
            if ((a & 0x800) != 0) {
                this.Field3579.append("strictfp ");
            }
            if ((a & 0x1000) != 0) {
                this.Field3579.append("synthetic ");
            }
            if ((a & 0x8000) != 0) {
                this.Field3579.append("mandated ");
            }
            if ((a & 0x4000) == 0) break block12;
            this.Field3579.append("enum ");
        }
    }

    private void Method3357(int a) {
        this.Field3579.append(", ");
    }

    private void Method3358(int a) {
        Class33 a2 = new Class33(a);
        Class91[] a3 = Class801.Method3300();
        switch (a2.Method3408()) {
            case 0: {
                this.Field3579.append("CLASS_TYPE_PARAMETER ").append(a2.Method3409());
            }
            case 1: {
                this.Field3579.append("METHOD_TYPE_PARAMETER ").append(a2.Method3409());
            }
            case 16: {
                this.Field3579.append("CLASS_EXTENDS ").append(a2.Method3411());
            }
            case 17: {
                this.Field3579.append("CLASS_TYPE_PARAMETER_BOUND ").append(a2.Method3409()).append(", ").append(a2.Method3410());
            }
            case 18: {
                this.Field3579.append("METHOD_TYPE_PARAMETER_BOUND ").append(a2.Method3409()).append(", ").append(a2.Method3410());
            }
            case 19: {
                this.Field3579.append("FIELD");
            }
            case 20: {
                this.Field3579.append("METHOD_RETURN");
            }
            case 21: {
                this.Field3579.append("METHOD_RECEIVER");
            }
            case 22: {
                this.Field3579.append("METHOD_FORMAL_PARAMETER ").append(a2.Method3412());
            }
            case 23: {
                this.Field3579.append("THROWS ").append(a2.Method3413());
            }
            case 64: {
                this.Field3579.append("LOCAL_VARIABLE");
            }
            case 65: {
                this.Field3579.append("RESOURCE_VARIABLE");
            }
            case 66: {
                this.Field3579.append("EXCEPTION_PARAMETER ").append(a2.Method3414());
            }
            case 67: {
                this.Field3579.append("INSTANCEOF");
            }
            case 68: {
                this.Field3579.append("NEW");
            }
            case 69: {
                this.Field3579.append("CONSTRUCTOR_REFERENCE");
            }
            case 70: {
                this.Field3579.append("METHOD_REFERENCE");
            }
            case 71: {
                this.Field3579.append("CAST ").append(a2.Method3415());
            }
            case 72: {
                this.Field3579.append("CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT ").append(a2.Method3415());
            }
            case 73: {
                this.Field3579.append("METHOD_INVOCATION_TYPE_ARGUMENT ").append(a2.Method3415());
            }
            case 74: {
                this.Field3579.append("CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT ").append(a2.Method3415());
            }
            case 75: {
                this.Field3579.append("METHOD_REFERENCE_TYPE_ARGUMENT ").append(a2.Method3415());
                break;
            }
        }
    }

    private void Method3328(int a, Object[] a2) {
        for (int a3 = 0; a3 < a; ++a3) {
            this.Field3579.append(' ');
            if (a2[a3] instanceof String) {
                String a4 = (String)a2[a3];
                if (a4.startsWith("[")) {
                    this.Method3354(1, a4);
                    continue;
                }
                this.Method3354(0, a4);
                continue;
            }
            if (a2[a3] instanceof Integer) {
                switch ((Integer)a2[a3]) {
                    case 0: {
                        this.Method3354(1, "T");
                        break;
                    }
                    case 1: {
                        this.Method3354(1, "I");
                        break;
                    }
                    case 2: {
                        this.Method3354(1, "F");
                        break;
                    }
                    case 3: {
                        this.Method3354(1, "D");
                        break;
                    }
                    case 4: {
                        this.Method3354(1, "J");
                        break;
                    }
                    case 5: {
                        this.Method3354(1, "N");
                        break;
                    }
                    case 6: {
                        this.Method3354(1, "U");
                    }
                }
                continue;
            }
            this.Method3330((Class264)a2[a3]);
        }
    }

    @Override
    public Class801 Method3268(int n, String string, boolean bl) {
        return this.Method3350(n, string, bl);
    }

    @Override
    public Class801 Method3266(String string, boolean bl) {
        return this.Method3349(string, bl);
    }

    @Override
    public Class801 Method3265() {
        return this.Method3348();
    }

    @Override
    public Class801 Method3260(String string, boolean bl) {
        return this.Method3347(string, bl);
    }

    @Override
    public Class801 Method3258(String string) {
        return this.Method3346(string);
    }

    @Override
    public Class801 Method3257(String string, String string2) {
        return this.Method3345(string, string2);
    }

    @Override
    public Class801 Method3253(int n, String string, String string2, String string3, String[] stringArray) {
        return this.Method3335(n, string, string2, string3, stringArray);
    }

    @Override
    public Class801 Method3252(int n, String string, String string2, String string3, Object object) {
        return this.Method3334(n, string, string2, string3, object);
    }

    @Override
    public Class801 Method3248(String string, boolean bl) {
        return this.Method3333(string, bl);
    }

    private static Exception Method3332(Exception exception) {
        return exception;
    }
}