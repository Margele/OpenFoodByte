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
import awsl.Class63;
import awsl.Class79;
import awsl.Class801;
import awsl.Class806;
import awsl.Class90;
import java.util.HashMap;
import java.util.Map;
import obfuscate.a;
import obfuscate.b;

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

    protected Class804(int a2) {
        super(a2);
    }

    public static void main(String[] a2) throws Exception {
        boolean a3 = false;
        int a4 = 2;
        boolean a5 = true;
        if (a2.length < 1 || a2.length > 2) {
            a5 = false;
        }
        if ("-debug".equals((Object)a2[0])) {
            a3 = true;
            a4 = 0;
            if (a2.length != 2) {
                a5 = false;
            }
        }
        System.err.println("Prints a disassembled view of the given class.");
        System.err.println("Usage: Textifier [-debug] <fully qualified class name or class file name>");
    }

    @Override
    public void Method3245(int a2, int a3, String a4, String a5, String a6, String[] a7) {
        this.Field3612 = a3;
        int a8 = a2 & 0xFFFF;
        int a9 = a2 >>> 16;
        this.Field3579.setLength(0);
        this.Field3579.append("// class version ").append(a8).append('.').append(a9).append(" (").append(a2).append(")\n");
        if ((a3 & 0x20000) != 0) {
            this.Field3579.append("// DEPRECATED\n");
        }
        this.Field3579.append("// access flags 0x").append(Integer.toHexString((int)a3).toUpperCase()).append('\n');
        this.Method3354(5, a5);
        Class90 a10 = new Class90(a3);
        Class79 a11 = new Class79(a5);
        a11.Method3748(a10);
        this.Field3579.append("// declaration: ").append(a4).append(a10.Method3626()).append('\n');
        this.Method3356(a3 & 0xFFFFFFDF);
        if ((a3 & 0x2000) != 0) {
            this.Field3579.append("@interface ");
        } else if ((a3 & 0x200) != 0) {
            this.Field3579.append("interface ");
        } else if ((a3 & 0x4000) == 0) {
            this.Field3579.append("class ");
        }
        this.Method3354(0, a4);
        if (!"java/lang/Object".equals((Object)a6)) {
            this.Field3579.append(" extends ");
            this.Method3354(0, a6);
            this.Field3579.append(' ');
        }
        if (a7.length > 0) {
            this.Field3579.append(" implements ");
            for (int a12 = 0; a12 < a7.length; ++a12) {
                this.Method3354(0, a7[a12]);
                this.Field3579.append(' ');
            }
        }
        this.Field3579.append(" {\n\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3246(String a2, String a3) {
        block0: {
            this.Field3579.setLength(0);
            this.Field3579.append(this.Field3607).append("// compiled from: ").append(a2).append('\n');
            this.Field3579.append(this.Field3607).append("// debug info: ").append(a3).append('\n');
            if (this.Field3579.length() <= 0) break block0;
            this.Field3580.Method2530((Object)this.Field3579.toString());
        }
    }

    @Override
    public void Method3247(String a2, String a3, String a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append("OUTERCLASS ");
        this.Method3354(0, a2);
        this.Field3579.append(' ');
        this.Field3579.append(a3).append(' ');
        this.Method3354(3, a4);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class804 Method3333(String a2, boolean a3) {
        this.Field3580.Method2530((Object)"\n");
        return this.Method3351(a2, a3);
    }

    @Override
    public Class801 Method3249(int a2, Class31 a3, String a4, boolean a5) {
        this.Field3580.Method2530((Object)"\n");
        return this.Method3352(a2, a3, a4, a5);
    }

    @Override
    public void Method3250(Class136 a2) {
        this.Field3580.Method2530((Object)"\n");
        this.Method3323(a2);
    }

    @Override
    public void Method3251(String a2, String a3, String a4, int a5) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append("// access flags 0x");
        this.Field3579.append(Integer.toHexString((int)(a5 & 0xFFFFFFDF)).toUpperCase()).append('\n');
        this.Field3579.append(this.Field3607);
        this.Method3356(a5);
        this.Field3579.append("INNERCLASS ");
        this.Method3354(0, a2);
        this.Field3579.append(' ');
        this.Method3354(0, a3);
        this.Field3579.append(' ');
        this.Method3354(0, a4);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class804 Method3334(int a2, String a3, String a4, String a5, Object a6) {
        this.Field3579.setLength(0);
        this.Field3579.append('\n');
        if ((a2 & 0x20000) != 0) {
            this.Field3579.append(this.Field3607).append("// DEPRECATED\n");
        }
        this.Field3579.append(this.Field3607).append("// access flags 0x").append(Integer.toHexString((int)a2).toUpperCase()).append('\n');
        this.Field3579.append(this.Field3607);
        this.Method3354(2, a5);
        Object a7 = new Class90(0);
        Class79 a8 = new Class79(a5);
        a8.Method3749((Class63)a7);
        this.Field3579.append(this.Field3607).append("// declaration: ").append(((Class90)a7).Method3626()).append('\n');
        this.Field3579.append(this.Field3607);
        this.Method3356(a2);
        this.Method3354(1, a4);
        this.Field3579.append(' ').append(a3);
        this.Field3579.append(" = ");
        if (a6 instanceof String) {
            this.Field3579.append('\"').append(a6).append('\"');
        } else {
            this.Field3579.append(a6);
        }
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        a7 = this.Method3353();
        this.Field3580.Method2530((Object)((Class801)a7).Method3295());
        return a7;
    }

    public Class804 Method3335(int a2, String a3, String a4, String a5, String[] a6) {
        this.Field3579.setLength(0);
        this.Field3579.append('\n');
        if ((a2 & 0x20000) != 0) {
            this.Field3579.append(this.Field3607).append("// DEPRECATED\n");
        }
        this.Field3579.append(this.Field3607).append("// access flags 0x").append(Integer.toHexString((int)a2).toUpperCase()).append('\n');
        this.Field3579.append(this.Field3607);
        this.Method3354(4, a5);
        Object a7 = new Class90(0);
        Class79 a8 = new Class79(a5);
        a8.Method3748((Class63)a7);
        String a9 = ((Class90)a7).Method3626();
        String a10 = ((Class90)a7).Method3627();
        String a11 = ((Class90)a7).Method3628();
        this.Field3579.append(this.Field3607).append("// declaration: ").append(a10).append(' ').append(a3).append(a9);
        this.Field3579.append(" throws ").append(a11);
        this.Field3579.append('\n');
        this.Field3579.append(this.Field3607);
        this.Method3356(a2 & 0xFFFFFFBF);
        if ((a2 & 0x100) != 0) {
            this.Field3579.append("native ");
        }
        if ((a2 & 0x80) != 0) {
            this.Field3579.append("varargs ");
        }
        if ((a2 & 0x40) != 0) {
            this.Field3579.append("bridge ");
        }
        if ((this.Field3612 & 0x200) != 0 && (a2 & 0x400) == 0 && (a2 & 8) == 0) {
            this.Field3579.append("default ");
        }
        this.Field3579.append(a3);
        this.Method3354(3, a4);
        if (a6.length > 0) {
            this.Field3579.append(" throws ");
            for (int a12 = 0; a12 < a6.length; ++a12) {
                this.Method3354(0, a6[a12]);
                this.Field3579.append(' ');
            }
        }
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        a7 = this.Method3353();
        this.Field3580.Method2530((Object)((Class801)a7).Method3295());
        return a7;
    }

    @Override
    public void Method3254() {
        this.Field3580.Method2530((Object)"}\n");
    }

    @Override
    public void Method3255(String a2, Object a3) {
        this.Field3579.setLength(0);
        this.Method3357(this.Field3613++);
        this.Field3579.append(a2).append('=');
        if (a3 instanceof String) {
            this.Method3343((String)a3);
        } else if (a3 instanceof b) {
            this.Method3344((b)a3);
        } else if (a3 instanceof Byte) {
            this.Method3341((Byte)a3);
        } else if (a3 instanceof Boolean) {
            this.Method3342((Boolean)a3);
        } else if (a3 instanceof Short) {
            this.Method3340((Short)a3);
        } else if (a3 instanceof Character) {
            this.Method3339(((Character)a3).charValue());
        } else if (a3 instanceof Integer) {
            this.Method3325((Integer)a3);
        } else if (a3 instanceof Float) {
            this.Method3337(((Float)a3).floatValue());
        } else if (a3 instanceof Long) {
            this.Method3336((Long)a3);
        } else if (a3 instanceof Double) {
            this.Method3338((Double)a3);
        } else if (a3.getClass().isArray()) {
            this.Field3579.append('{');
            if (a3 instanceof byte[]) {
                byte[] a4 = (byte[])a3;
                for (int a5 = 0; a5 < a4.length; ++a5) {
                    this.Method3357(a5);
                    this.Method3341(a4[a5]);
                }
            } else if (a3 instanceof boolean[]) {
                boolean[] a6 = (boolean[])a3;
                for (int a7 = 0; a7 < a6.length; ++a7) {
                    this.Method3357(a7);
                    this.Method3342(a6[a7]);
                }
            } else if (a3 instanceof short[]) {
                short[] a8 = (short[])a3;
                for (int a9 = 0; a9 < a8.length; ++a9) {
                    this.Method3357(a9);
                    this.Method3340(a8[a9]);
                }
            } else if (a3 instanceof char[]) {
                char[] a10 = (char[])a3;
                for (int a11 = 0; a11 < a10.length; ++a11) {
                    this.Method3357(a11);
                    this.Method3339(a10[a11]);
                }
            } else if (a3 instanceof int[]) {
                int[] a12 = (int[])a3;
                for (int a13 = 0; a13 < a12.length; ++a13) {
                    this.Method3357(a13);
                    this.Method3325(a12[a13]);
                }
            } else if (a3 instanceof long[]) {
                long[] a14 = (long[])a3;
                for (int a15 = 0; a15 < a14.length; ++a15) {
                    this.Method3357(a15);
                    this.Method3336(a14[a15]);
                }
            } else if (a3 instanceof float[]) {
                float[] a16 = (float[])a3;
                for (int a17 = 0; a17 < a16.length; ++a17) {
                    this.Method3357(a17);
                    this.Method3337(a16[a17]);
                }
            } else if (a3 instanceof double[]) {
                double[] a18 = (double[])a3;
                for (int a19 = 0; a19 < a18.length; ++a19) {
                    this.Method3357(a19);
                    this.Method3338(a18[a19]);
                }
            }
            this.Field3579.append('}');
        }
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    private void Method3325(int a2) {
        this.Field3579.append(a2);
    }

    private void Method3336(long a2) {
        this.Field3579.append(a2).append('L');
    }

    private void Method3337(float a2) {
        this.Field3579.append(a2).append('F');
    }

    private void Method3338(double a2) {
        this.Field3579.append(a2).append('D');
    }

    private void Method3339(char a2) {
        this.Field3579.append("(char)").append((int)a2);
    }

    private void Method3340(short a2) {
        this.Field3579.append("(short)").append((int)a2);
    }

    private void Method3341(byte a2) {
        this.Field3579.append("(byte)").append((int)a2);
    }

    private void Method3342(boolean a2) {
        this.Field3579.append(a2);
    }

    private void Method3343(String a2) {
        Class804.Method3297(this.Field3579, a2);
    }

    private void Method3344(b a2) {
        this.Field3579.append(a2.Method3220()).append(".class");
    }

    @Override
    public void Method3256(String a2, String a3, String a4) {
        this.Field3579.setLength(0);
        this.Method3357(this.Field3613++);
        this.Field3579.append(a2).append('=');
        this.Method3354(1, a3);
        this.Field3579.append('.').append(a4);
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class804 Method3345(String a2, String a3) {
        this.Field3579.setLength(0);
        this.Method3357(this.Field3613++);
        this.Field3579.append(a2).append('=');
        this.Field3579.append('@');
        this.Method3354(1, a3);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a4 = this.Method3353();
        this.Field3580.Method2530((Object)a4.Method3295());
        this.Field3580.Method2530((Object)")");
        return a4;
    }

    public Class804 Method3346(String a2) {
        this.Field3579.setLength(0);
        this.Method3357(this.Field3613++);
        this.Field3579.append(a2).append('=');
        this.Field3579.append('{');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a3 = this.Method3353();
        this.Field3580.Method2530((Object)a3.Method3295());
        this.Field3580.Method2530((Object)"}");
        return a3;
    }

    @Override
    public void Method3259() {
    }

    public Class804 Method3347(String a2, boolean a3) {
        return this.Method3351(a2, a3);
    }

    @Override
    public Class801 Method3261(int a2, Class31 a3, String a4, boolean a5) {
        return this.Method3352(a2, a3, a4, a5);
    }

    @Override
    public void Method3262(Class136 a2) {
        this.Method3323(a2);
    }

    @Override
    public void Method3263() {
    }

    @Override
    public void Method3264(String a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("// parameter ");
        this.Method3356(a3);
        this.Field3579.append(' ').append("<no name>").append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class804 Method3348() {
        this.Field3580.Method2530((Object)(this.Field3608 + "default="));
        Class804 a2 = this.Method3353();
        this.Field3580.Method2530((Object)a2.Method3295());
        this.Field3580.Method2530((Object)"\n");
        return a2;
    }

    public Class804 Method3349(String a2, boolean a3) {
        return this.Method3351(a2, a3);
    }

    @Override
    public Class801 Method3267(int a2, Class31 a3, String a4, boolean a5) {
        return this.Method3352(a2, a3, a4, a5);
    }

    public Class804 Method3350(int a2, String a3, boolean a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append('@');
        this.Method3354(1, a3);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a5 = this.Method3353();
        this.Field3580.Method2530((Object)a5.Method3295());
        this.Field3580.Method2530((Object)") // parameter ");
        this.Field3580.Method2530((Object)new Integer(a2));
        this.Field3580.Method2530((Object)"\n");
        return a5;
    }

    @Override
    public void Method3269(Class136 a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append("ATTRIBUTE ");
        this.Method3354(-1, a2.Field987);
        if (a2 instanceof Class806) {
            ((Class806)((Object)a2)).Method3359(this.Field3579, this.Field3611);
        } else {
            this.Field3579.append(" : unknown\n");
        }
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3270() {
    }

    @Override
    public void Method3271(int a2, int a3, Object[] a4, int a5, Object[] a6) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3610);
        this.Field3579.append("FRAME ");
        switch (a2) {
            case -1: 
            case 0: {
                this.Field3579.append("FULL [");
                this.Method3328(a3, a4);
                this.Field3579.append("] [");
                this.Method3328(a5, a6);
                this.Field3579.append(']');
                break;
            }
            case 1: {
                this.Field3579.append("APPEND [");
                this.Method3328(a3, a4);
                this.Field3579.append(']');
                break;
            }
            case 2: {
                this.Field3579.append("CHOP ").append(a3);
                break;
            }
            case 3: {
                this.Field3579.append("SAME");
                break;
            }
            case 4: {
                this.Field3579.append("SAME1 ");
                this.Method3328(1, a6);
            }
        }
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3272(int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a2]).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3273(int a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a2]).append(' ').append(a2 == 188 ? Field3576[a3] : Integer.toString((int)a3)).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3274(int a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a2]).append(' ').append(a3).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3275(int a2, String a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a2]).append(' ');
        this.Method3354(0, a3);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3276(int a2, String a3, String a4, String a5) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a2]).append(' ');
        this.Method3354(0, a3);
        this.Field3579.append('.').append(a4).append(" : ");
        this.Method3354(1, a5);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    @Deprecated
    public void Method3277(int a2, String a3, String a4, String a5) {
        if (this.Field3578 >= 327680) {
            super.Method3277(a2, a3, a4, a5);
            return;
        }
        this.Method3317(a2, a3, a4, a5, a2 == 185);
    }

    @Override
    public void Method3278(int a2, String a3, String a4, String a5, boolean a6) {
        if (this.Field3578 < 327680) {
            super.Method3278(a2, a3, a4, a5, a6);
            return;
        }
        this.Method3317(a2, a3, a4, a5, a6);
    }

    private void Method3317(int a2, String a3, String a4, String a5, boolean a6) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a2]).append(' ');
        this.Method3354(0, a3);
        this.Field3579.append('.').append(a4).append(' ');
        this.Method3354(3, a5);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3279(String a2, String a3, Class279 a4, Object[] a5) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("INVOKEDYNAMIC").append(' ');
        this.Field3579.append(a2);
        this.Method3354(3, a3);
        this.Field3579.append(" [");
        this.Field3579.append('\n');
        this.Field3579.append(this.Field3609);
        this.Method3355(a4);
        this.Field3579.append('\n');
        this.Field3579.append(this.Field3609).append("// arguments:");
        if (a5.length == 0) {
            this.Field3579.append(" none");
        } else {
            this.Field3579.append('\n');
            for (int a6 = 0; a6 < a5.length; ++a6) {
                this.Field3579.append(this.Field3609);
                Object a7 = a5[a6];
                if (a7 instanceof String) {
                    Class801.Method3297(this.Field3579, (String)a7);
                } else if (a7 instanceof b) {
                    b a8 = (b)a7;
                    if (a8.Method3217() == 11) {
                        this.Method3354(3, a8.Method3225());
                    } else {
                        this.Field3579.append(a8.Method3225()).append(".class");
                    }
                } else if (a7 instanceof Class279) {
                    this.Method3355((Class279)a7);
                } else {
                    this.Field3579.append(a7);
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
    public void Method3280(int a2, Class264 a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append(Field3575[a2]).append(' ');
        this.Method3330(a3);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3281(Class264 a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3610);
        this.Method3330(a2);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3282(Object a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("LDC ");
        if (a2 instanceof String) {
            Class801.Method3297(this.Field3579, (String)a2);
        } else if (a2 instanceof b) {
            this.Field3579.append(((b)a2).Method3225()).append(".class");
        } else {
            this.Field3579.append(a2);
        }
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3283(int a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("IINC ").append(a2).append(' ').append(a3).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3284(int a2, int a3, Class264 a4, Class264[] a5) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("TABLESWITCH\n");
        for (int a6 = 0; a6 < a5.length; ++a6) {
            this.Field3579.append(this.Field3609).append(a2 + a6).append(": ");
            this.Method3330(a5[a6]);
            this.Field3579.append('\n');
        }
        this.Field3579.append(this.Field3609).append("default: ");
        this.Method3330(a4);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3285(Class264 a2, int[] a3, Class264[] a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("LOOKUPSWITCH\n");
        for (int a5 = 0; a5 < a4.length; ++a5) {
            this.Field3579.append(this.Field3609).append(a3[a5]).append(": ");
            this.Method3330(a4[a5]);
            this.Field3579.append('\n');
        }
        this.Field3579.append(this.Field3609).append("default: ");
        this.Method3330(a2);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3286(String a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("MULTIANEWARRAY ");
        this.Method3354(1, a2);
        this.Field3579.append(' ').append(a3).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public Class801 Method3287(int a2, Class31 a3, String a4, boolean a5) {
        return this.Method3352(a2, a3, a4, a5);
    }

    @Override
    public void Method3288(Class264 a2, Class264 a3, Class264 a4, String a5) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("TRYCATCHBLOCK ");
        this.Method3330(a2);
        this.Field3579.append(' ');
        this.Method3330(a3);
        this.Field3579.append(' ');
        this.Method3330(a4);
        this.Field3579.append(' ');
        this.Method3354(0, a5);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public Class801 Method3289(int a2, Class31 a3, String a4, boolean a5) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("TRYCATCHBLOCK @");
        this.Method3354(1, a4);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a6 = this.Method3353();
        this.Field3580.Method2530((Object)a6.Method3295());
        this.Field3579.setLength(0);
        this.Field3579.append(") : ");
        this.Method3358(a2);
        this.Field3579.append(", ").append((Object)a3);
        this.Field3579.append("\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        return a6;
    }

    @Override
    public void Method3290(String a2, String a3, String a4, Class264 a5, Class264 a6, int a7) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("LOCALVARIABLE ").append(a2).append(' ');
        this.Method3354(1, a3);
        this.Field3579.append(' ');
        this.Method3330(a5);
        this.Field3579.append(' ');
        this.Method3330(a6);
        this.Field3579.append(' ').append(a7).append('\n');
        this.Field3579.append(this.Field3608);
        this.Method3354(2, a4);
        Class90 a8 = new Class90(0);
        Class79 a9 = new Class79(a4);
        a9.Method3749(a8);
        this.Field3579.append(this.Field3608).append("// declaration: ").append(a8.Method3626()).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public Class801 Method3291(int a2, Class31 a3, Class264[] a4, Class264[] a5, int[] a6, String a7, boolean a8) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("LOCALVARIABLE @");
        this.Method3354(1, a7);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a9 = this.Method3353();
        this.Field3580.Method2530((Object)a9.Method3295());
        this.Field3579.setLength(0);
        this.Field3579.append(") : ");
        this.Method3358(a2);
        this.Field3579.append(", ").append((Object)a3);
        for (int a10 = 0; a10 < a4.length; ++a10) {
            this.Field3579.append(" [ ");
            this.Method3330(a4[a10]);
            this.Field3579.append(" - ");
            this.Method3330(a5[a10]);
            this.Field3579.append(" - ").append(a6[a10]).append(" ]");
        }
        this.Field3579.append("\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        return a9;
    }

    @Override
    public void Method3292(int a2, Class264 a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("LINENUMBER ").append(a2).append(' ');
        this.Method3330(a3);
        this.Field3579.append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3293(int a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("MAXSTACK = ").append(a2).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3608).append("MAXLOCALS = ").append(a3).append('\n');
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3294() {
    }

    public Class804 Method3351(String a2, boolean a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append('@');
        this.Method3354(1, a2);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a4 = this.Method3353();
        this.Field3580.Method2530((Object)a4.Method3295());
        this.Field3580.Method2530((Object)")\n");
        return a4;
    }

    public Class804 Method3352(int a2, Class31 a3, String a4, boolean a5) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append('@');
        this.Method3354(1, a4);
        this.Field3579.append('(');
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class804 a6 = this.Method3353();
        this.Field3580.Method2530((Object)a6.Method3295());
        this.Field3579.setLength(0);
        this.Field3579.append(") : ");
        this.Method3358(a2);
        this.Field3579.append(", ").append((Object)a3);
        this.Field3579.append("\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        return a6;
    }

    public void Method3323(Class136 a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3607).append("ATTRIBUTE ");
        this.Method3354(-1, a2.Field987);
        if (a2 instanceof Class806) {
            ((Class806)((Object)a2)).Method3359(this.Field3579, null);
        } else {
            this.Field3579.append(" : unknown\n");
        }
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    protected Class804 Method3353() {
        return new Class804();
    }

    protected void Method3354(int a2, String a3) {
        if (a2 == 5 || a2 == 2 || a2 == 4) {
            this.Field3579.append("// signature ").append(a3).append('\n');
        } else {
            this.Field3579.append(a3);
        }
    }

    protected void Method3330(Class264 a2) {
        if (this.Field3611 == null) {
            this.Field3611 = new HashMap();
        }
        String a3 = (String)this.Field3611.Method2665((Object)a2);
        a3 = "L" + this.Field3611.Method1799();
        this.Field3611.put((Object)a2, (Object)a3);
        this.Field3579.append(a3);
    }

    protected void Method3355(Class279 a2) {
        int a3 = a2.Method2820();
        this.Field3579.append("// handle kind 0x").append(Integer.toHexString((int)a3)).append(" : ");
        boolean a4 = false;
        switch (a3) {
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
                a4 = true;
                break;
            }
            case 7: {
                this.Field3579.append("INVOKESPECIAL");
                a4 = true;
                break;
            }
            case 6: {
                this.Field3579.append("INVOKESTATIC");
                a4 = true;
                break;
            }
            case 5: {
                this.Field3579.append("INVOKEVIRTUAL");
                a4 = true;
                break;
            }
            case 8: {
                this.Field3579.append("NEWINVOKESPECIAL");
                a4 = true;
            }
        }
        this.Field3579.append('\n');
        this.Field3579.append(this.Field3609);
        this.Method3354(0, a2.Method2821());
        this.Field3579.append('.');
        this.Field3579.append(a2.Method2822());
        this.Field3579.append('(');
        this.Method3354(9, a2.Method2823());
        this.Field3579.append(')');
    }

    private void Method3356(int a2) {
        block12: {
            if ((a2 & 1) != 0) {
                this.Field3579.append("public ");
            }
            if ((a2 & 2) != 0) {
                this.Field3579.append("private ");
            }
            if ((a2 & 4) != 0) {
                this.Field3579.append("protected ");
            }
            if ((a2 & 0x10) != 0) {
                this.Field3579.append("final ");
            }
            if ((a2 & 8) != 0) {
                this.Field3579.append("static ");
            }
            if ((a2 & 0x20) != 0) {
                this.Field3579.append("synchronized ");
            }
            if ((a2 & 0x40) != 0) {
                this.Field3579.append("volatile ");
            }
            if ((a2 & 0x80) != 0) {
                this.Field3579.append("transient ");
            }
            if ((a2 & 0x400) != 0) {
                this.Field3579.append("abstract ");
            }
            if ((a2 & 0x800) != 0) {
                this.Field3579.append("strictfp ");
            }
            if ((a2 & 0x1000) != 0) {
                this.Field3579.append("synthetic ");
            }
            if ((a2 & 0x8000) != 0) {
                this.Field3579.append("mandated ");
            }
            if ((a2 & 0x4000) == 0) break block12;
            this.Field3579.append("enum ");
        }
    }

    private void Method3357(int a2) {
        this.Field3579.append(", ");
    }

    private void Method3358(int a2) {
        Class33 a3 = new Class33(a2);
        a[] a4 = Class801.Method3300();
        switch (a3.Method3408()) {
            case 0: {
                this.Field3579.append("CLASS_TYPE_PARAMETER ").append(a3.Method3409());
            }
            case 1: {
                this.Field3579.append("METHOD_TYPE_PARAMETER ").append(a3.Method3409());
            }
            case 16: {
                this.Field3579.append("CLASS_EXTENDS ").append(a3.Method3411());
            }
            case 17: {
                this.Field3579.append("CLASS_TYPE_PARAMETER_BOUND ").append(a3.Method3409()).append(", ").append(a3.Method3410());
            }
            case 18: {
                this.Field3579.append("METHOD_TYPE_PARAMETER_BOUND ").append(a3.Method3409()).append(", ").append(a3.Method3410());
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
                this.Field3579.append("METHOD_FORMAL_PARAMETER ").append(a3.Method3412());
            }
            case 23: {
                this.Field3579.append("THROWS ").append(a3.Method3413());
            }
            case 64: {
                this.Field3579.append("LOCAL_VARIABLE");
            }
            case 65: {
                this.Field3579.append("RESOURCE_VARIABLE");
            }
            case 66: {
                this.Field3579.append("EXCEPTION_PARAMETER ").append(a3.Method3414());
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
                this.Field3579.append("CAST ").append(a3.Method3415());
            }
            case 72: {
                this.Field3579.append("CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT ").append(a3.Method3415());
            }
            case 73: {
                this.Field3579.append("METHOD_INVOCATION_TYPE_ARGUMENT ").append(a3.Method3415());
            }
            case 74: {
                this.Field3579.append("CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT ").append(a3.Method3415());
            }
            case 75: {
                this.Field3579.append("METHOD_REFERENCE_TYPE_ARGUMENT ").append(a3.Method3415());
                break;
            }
        }
    }

    private void Method3328(int a2, Object[] a3) {
        for (int a4 = 0; a4 < a2; ++a4) {
            this.Field3579.append(' ');
            if (a3[a4] instanceof String) {
                String a5 = (String)a3[a4];
                if (a5.startsWith("[")) {
                    this.Method3354(1, a5);
                    continue;
                }
                this.Method3354(0, a5);
                continue;
            }
            if (a3[a4] instanceof Integer) {
                switch ((Integer)a3[a4]) {
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
            this.Method3330((Class264)a3[a4]);
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