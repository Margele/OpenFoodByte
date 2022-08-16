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
 *  java.lang.StringBuffer
 *  java.lang.System
 *  java.util.HashMap
 *  java.util.Map
 */
package awsl;

import awsl.Class136;
import awsl.Class264;
import awsl.Class279;
import awsl.Class31;
import awsl.Class799;
import awsl.Class801;
import java.util.HashMap;
import java.util.Map;
import obfuscate.a;
import obfuscate.b;

public class Class803
extends Class801 {
    protected final String Field3591;
    protected final int Field3592;
    protected Map Field3593;
    private static final int Field3594 = 262144;
    private static final int Field3595 = 524288;
    private static final int Field3596 = 0x100000;

    public Class803() {
        this(327680, "cw", 0);
        if (this.getClass() != Class803.class) {
            throw new IllegalStateException();
        }
    }

    protected Class803(int a2, String a3, int a4) {
        super(a2);
        this.Field3591 = a3;
        this.Field3592 = a4;
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
        System.err.println("Prints the ASM code to generate the given class.");
        System.err.println("Usage: ASMifier [-debug] <fully qualified class name or class file name>");
    }

    @Override
    public void Method3245(int a2, int a3, String a4, String a5, String a6, String[] a7) {
        String a8;
        int a9 = a4.lastIndexOf(47);
        if (a9 == -1) {
            a8 = a4;
        } else {
            this.Field3580.Method2530((Object)("package asm." + a4.substring(0, a9).replace('/', '.') + ";\n"));
            a8 = a4.substring(a9 + 1);
        }
        this.Field3580.Method2530((Object)"import java.util.*;\n");
        this.Field3580.Method2530((Object)"import org.objectweb.asm.*;\n");
        this.Field3580.Method2530((Object)("public class " + a8 + "Dump implements Opcodes {\n\n"));
        this.Field3580.Method2530((Object)"public static byte[] dump () throws Exception {\n\n");
        this.Field3580.Method2530((Object)"ClassWriter cw = new ClassWriter(0);\n");
        this.Field3580.Method2530((Object)"FieldVisitor fv;\n");
        this.Field3580.Method2530((Object)"MethodVisitor mv;\n");
        this.Field3580.Method2530((Object)"AnnotationVisitor av0;\n\n");
        this.Field3579.setLength(0);
        this.Field3579.append("cw.visit(");
        switch (a2) {
            case 196653: {
                this.Field3579.append("V1_1");
                break;
            }
            case 46: {
                this.Field3579.append("V1_2");
                break;
            }
            case 47: {
                this.Field3579.append("V1_3");
                break;
            }
            case 48: {
                this.Field3579.append("V1_4");
                break;
            }
            case 49: {
                this.Field3579.append("V1_5");
                break;
            }
            case 50: {
                this.Field3579.append("V1_6");
                break;
            }
            case 51: {
                this.Field3579.append("V1_7");
                break;
            }
            default: {
                this.Field3579.append(a2);
            }
        }
        this.Field3579.append(", ");
        this.Method3325(a3 | 0x40000);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", ");
        this.Method3326(a5);
        this.Field3579.append(", ");
        this.Method3326(a6);
        this.Field3579.append(", ");
        if (a7.length > 0) {
            this.Field3579.append("new String[] {");
            for (int a10 = 0; a10 < a7.length; ++a10) {
                this.Field3579.append(" ");
                this.Method3326(a7[a10]);
            }
            this.Field3579.append(" }");
        } else {
            this.Field3579.append("null");
        }
        this.Field3579.append(");\n\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3246(String a2, String a3) {
        this.Field3579.setLength(0);
        this.Field3579.append("cw.visitSource(");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(");\n\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3247(String a2, String a3, String a4) {
        this.Field3579.setLength(0);
        this.Field3579.append("cw.visitOuterClass(");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(");\n\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3305(String a2, boolean a3) {
        return this.Method3320(a2, a3);
    }

    public Class803 Method3306(int a2, Class31 a3, String a4, boolean a5) {
        return this.Method3321(a2, a3, a4, a5);
    }

    @Override
    public void Method3250(Class136 a2) {
        this.Method3323(a2);
    }

    @Override
    public void Method3251(String a2, String a3, String a4, int a5) {
        this.Field3579.setLength(0);
        this.Field3579.append("cw.visitInnerClass(");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", ");
        this.Method3325(a5 | 0x100000);
        this.Field3579.append(");\n\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3307(int a2, String a3, String a4, String a5, Object a6) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n");
        this.Field3579.append("fv = cw.visitField(");
        this.Method3325(a2 | 0x80000);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", ");
        this.Method3326(a5);
        this.Field3579.append(", ");
        this.Method3326(a6);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a7 = this.Method3324("fv", 0);
        this.Field3580.Method2530((Object)a7.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a7;
    }

    public Class803 Method3308(int a2, String a3, String a4, String a5, String[] a6) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n");
        this.Field3579.append("mv = cw.visitMethod(");
        this.Method3325(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", ");
        this.Method3326(a5);
        this.Field3579.append(", ");
        if (a6.length > 0) {
            this.Field3579.append("new String[] {");
            for (int a7 = 0; a7 < a6.length; ++a7) {
                this.Field3579.append(" ");
                this.Method3326(a6[a7]);
            }
            this.Field3579.append(" }");
        } else {
            this.Field3579.append("null");
        }
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a8 = this.Method3324("mv", 0);
        this.Field3580.Method2530((Object)a8.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a8;
    }

    @Override
    public void Method3254() {
        this.Field3580.Method2530((Object)"cw.visitEnd();\n\n");
        this.Field3580.Method2530((Object)"return cw.toByteArray();\n");
        this.Field3580.Method2530((Object)"}\n");
        this.Field3580.Method2530((Object)"}\n");
    }

    @Override
    public void Method3255(String a2, Object a3) {
        this.Field3579.setLength(0);
        this.Field3579.append("av").append(this.Field3592).append(".visit(");
        Class803.Method3327(this.Field3579, a2);
        this.Field3579.append(", ");
        Class803.Method3327(this.Field3579, a3);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3256(String a2, String a3, String a4) {
        this.Field3579.setLength(0);
        this.Field3579.append("av").append(this.Field3592).append(".visitEnum(");
        Class803.Method3327(this.Field3579, a2);
        this.Field3579.append(", ");
        Class803.Method3327(this.Field3579, a3);
        this.Field3579.append(", ");
        Class803.Method3327(this.Field3579, a4);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3309(String a2, String a3) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n");
        this.Field3579.append("AnnotationVisitor av").append(this.Field3592 + 1).append(" = av");
        this.Field3579.append(this.Field3592).append(".visitAnnotation(");
        Class803.Method3327(this.Field3579, a2);
        this.Field3579.append(", ");
        Class803.Method3327(this.Field3579, a3);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a4 = this.Method3324("av", this.Field3592 + 1);
        this.Field3580.Method2530((Object)a4.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a4;
    }

    public Class803 Method3310(String a2) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n");
        this.Field3579.append("AnnotationVisitor av").append(this.Field3592 + 1).append(" = av");
        this.Field3579.append(this.Field3592).append(".visitArray(");
        Class803.Method3327(this.Field3579, a2);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a3 = this.Method3324("av", this.Field3592 + 1);
        this.Field3580.Method2530((Object)a3.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a3;
    }

    @Override
    public void Method3259() {
        this.Field3579.setLength(0);
        this.Field3579.append("av").append(this.Field3592).append(".visitEnd();\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3311(String a2, boolean a3) {
        return this.Method3320(a2, a3);
    }

    public Class803 Method3312(int a2, Class31 a3, String a4, boolean a5) {
        return this.Method3321(a2, a3, a4, a5);
    }

    @Override
    public void Method3262(Class136 a2) {
        this.Method3323(a2);
    }

    @Override
    public void Method3263() {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitEnd();\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3264(String a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitParameter(");
        Class803.Method3297(this.Field3579, a2);
        this.Field3579.append(", ");
        this.Method3325(a3);
        this.Field3580.Method2530((Object)this.Field3579.append(");\n").toString());
    }

    public Class803 Method3313() {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitAnnotationDefault();\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a2 = this.Method3324("av", 0);
        this.Field3580.Method2530((Object)a2.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a2;
    }

    public Class803 Method3314(String a2, boolean a3) {
        return this.Method3320(a2, a3);
    }

    public Class803 Method3315(int a2, Class31 a3, String a4, boolean a5) {
        return this.Method3321(a2, a3, a4, a5);
    }

    public Class803 Method3316(int a2, String a3, boolean a4) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitParameterAnnotation(").append(a2).append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ").append(a4).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a5 = this.Method3324("av", 0);
        this.Field3580.Method2530((Object)a5.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a5;
    }

    @Override
    public void Method3269(Class136 a2) {
        this.Method3323(a2);
    }

    @Override
    public void Method3270() {
        this.Field3580.Method2530((Object)(this.Field3591 + ".visitCode();\n"));
    }

    @Override
    public void Method3271(int a2, int a3, Object[] a4, int a5, Object[] a6) {
        this.Field3579.setLength(0);
        switch (a2) {
            case -1: 
            case 0: {
                this.Method3328(a3, a4);
                this.Method3328(a5, a6);
                if (a2 == -1) {
                    this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_NEW, ");
                } else {
                    this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_FULL, ");
                }
                this.Field3579.append(a3).append(", new Object[] {");
                this.Method3329(a3, a4);
                this.Field3579.append("}, ").append(a5).append(", new Object[] {");
                this.Method3329(a5, a6);
                this.Field3579.append('}');
                break;
            }
            case 1: {
                this.Method3328(a3, a4);
                this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_APPEND,").append(a3).append(", new Object[] {");
                this.Method3329(a3, a4);
                this.Field3579.append("}, 0, null");
                break;
            }
            case 2: {
                this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_CHOP,").append(a3).append(", null, 0, null");
                break;
            }
            case 3: {
                this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_SAME, 0, null, 0, null");
                break;
            }
            case 4: {
                this.Method3328(1, a6);
                this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {");
                this.Method3329(1, a6);
                this.Field3579.append('}');
            }
        }
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3272(int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitInsn(").append(Field3575[a2]).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3273(int a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitIntInsn(").append(Field3575[a2]).append(", ").append(a2 == 188 ? Field3576[a3] : Integer.toString((int)a3)).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3274(int a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitVarInsn(").append(Field3575[a2]).append(", ").append(a3).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3275(int a2, String a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitTypeInsn(").append(Field3575[a2]).append(", ");
        this.Method3326(a3);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3276(int a2, String a3, String a4, String a5) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitFieldInsn(").append(Field3575[a2]).append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", ");
        this.Method3326(a5);
        this.Field3579.append(");\n");
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
        this.Field3579.append(this.Field3591).append(".visitMethodInsn(").append(Field3575[a2]).append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", ");
        this.Method3326(a5);
        this.Field3579.append(", ");
        this.Field3579.append("true");
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3279(String a2, String a3, Class279 a4, Object[] a5) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitInvokeDynamicInsn(");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", new Object[]{");
        for (int a6 = 0; a6 < a5.length; ++a6) {
            this.Method3326(a5[a6]);
            if (a6 == a5.length - 1) continue;
            this.Field3579.append(", ");
        }
        this.Field3579.append("});\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3280(int a2, Class264 a3) {
        this.Field3579.setLength(0);
        this.Method3330(a3);
        this.Field3579.append(this.Field3591).append(".visitJumpInsn(").append(Field3575[a2]).append(", ");
        this.Method3331(a3);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3281(Class264 a2) {
        this.Field3579.setLength(0);
        this.Method3330(a2);
        this.Field3579.append(this.Field3591).append(".visitLabel(");
        this.Method3331(a2);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3282(Object a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitLdcInsn(");
        this.Method3326(a2);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3283(int a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitIincInsn(").append(a2).append(", ").append(a3).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3284(int a2, int a3, Class264 a4, Class264[] a5) {
        int a6;
        this.Field3579.setLength(0);
        for (a6 = 0; a6 < a5.length; ++a6) {
            this.Method3330(a5[a6]);
        }
        this.Method3330(a4);
        this.Field3579.append(this.Field3591).append(".visitTableSwitchInsn(").append(a2).append(", ").append(a3).append(", ");
        this.Method3331(a4);
        this.Field3579.append(", new Label[] {");
        for (a6 = 0; a6 < a5.length; ++a6) {
            this.Field3579.append(" ");
            this.Method3331(a5[a6]);
        }
        this.Field3579.append(" });\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3285(Class264 a2, int[] a3, Class264[] a4) {
        int a5;
        this.Field3579.setLength(0);
        for (a5 = 0; a5 < a4.length; ++a5) {
            this.Method3330(a4[a5]);
        }
        this.Method3330(a2);
        this.Field3579.append(this.Field3591).append(".visitLookupSwitchInsn(");
        this.Method3331(a2);
        this.Field3579.append(", new int[] {");
        for (a5 = 0; a5 < a3.length; ++a5) {
            this.Field3579.append(" ").append(a3[a5]);
        }
        this.Field3579.append(" }, new Label[] {");
        for (a5 = 0; a5 < a4.length; ++a5) {
            this.Field3579.append(" ");
            this.Method3331(a4[a5]);
        }
        this.Field3579.append(" });\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3286(String a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitMultiANewArrayInsn(");
        this.Method3326(a2);
        this.Field3579.append(", ").append(a3).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3318(int a2, Class31 a3, String a4, boolean a5) {
        return this.Method3322("visitInsnAnnotation", a2, a3, a4, a5);
    }

    @Override
    public void Method3288(Class264 a2, Class264 a3, Class264 a4, String a5) {
        this.Field3579.setLength(0);
        this.Method3330(a2);
        this.Method3330(a3);
        this.Method3330(a4);
        this.Field3579.append(this.Field3591).append(".visitTryCatchBlock(");
        this.Method3331(a2);
        this.Field3579.append(", ");
        this.Method3331(a3);
        this.Field3579.append(", ");
        this.Method3331(a4);
        this.Field3579.append(", ");
        this.Method3326(a5);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3319(int a2, Class31 a3, String a4, boolean a5) {
        return this.Method3322("visitTryCatchAnnotation", a2, a3, a4, a5);
    }

    @Override
    public void Method3290(String a2, String a3, String a4, Class264 a5, Class264 a6, int a7) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitLocalVariable(");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", ");
        this.Method3331(a5);
        this.Field3579.append(", ");
        this.Method3331(a6);
        this.Field3579.append(", ").append(a7).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public Class801 Method3291(int a2, Class31 a3, Class264[] a4, Class264[] a5, int[] a6, String a7, boolean a8) {
        int a9;
        this.Field3579.setLength(0);
        this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitLocalVariableAnnotation(");
        this.Field3579.append(a2);
        this.Field3579.append(", TypePath.fromString(\"").append((Object)a3).append("\"), ");
        this.Field3579.append("new Label[] {");
        for (a9 = 0; a9 < a4.length; ++a9) {
            this.Field3579.append(" ");
            this.Method3331(a4[a9]);
        }
        this.Field3579.append(" }, new Label[] {");
        for (a9 = 0; a9 < a5.length; ++a9) {
            this.Field3579.append(" ");
            this.Method3331(a5[a9]);
        }
        this.Field3579.append(" }, new int[] {");
        for (a9 = 0; a9 < a6.length; ++a9) {
            this.Field3579.append(" ").append(a6[a9]);
        }
        this.Field3579.append(" }, ");
        this.Method3326(a7);
        this.Field3579.append(", ").append(a8).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a10 = this.Method3324("av", 0);
        this.Field3580.Method2530((Object)a10.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a10;
    }

    @Override
    public void Method3292(int a2, Class264 a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitLineNumber(").append(a2).append(", ");
        this.Method3331(a3);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3293(int a2, int a3) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitMaxs(").append(a2).append(", ").append(a3).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3294() {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitEnd();\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3320(String a2, boolean a3) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitAnnotation(");
        this.Method3326(a2);
        this.Field3579.append(", ").append(a3).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a4 = this.Method3324("av", 0);
        this.Field3580.Method2530((Object)a4.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a4;
    }

    public Class803 Method3321(int a2, Class31 a3, String a4, boolean a5) {
        return this.Method3322("visitTypeAnnotation", a2, a3, a4, a5);
    }

    public Class803 Method3322(String a2, int a3, Class31 a4, String a5, boolean a6) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".").append(a2).append("(");
        this.Field3579.append(a3);
        this.Field3579.append(", TypePath.fromString(\"").append((Object)a4).append("\"), ");
        this.Method3326(a5);
        this.Field3579.append(", ").append(a6).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a7 = this.Method3324("av", 0);
        this.Field3580.Method2530((Object)a7.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a7;
    }

    public void Method3323(Class136 a2) {
        this.Field3579.setLength(0);
        this.Field3579.append("// ATTRIBUTE ").append(a2.Field987).append('\n');
        if (a2 instanceof Class799) {
            if (this.Field3593 == null) {
                this.Field3593 = new HashMap();
            }
            this.Field3579.append("{\n");
            ((Class799)((Object)a2)).Method830(this.Field3579, "attr", this.Field3593);
            this.Field3579.append(this.Field3591).append(".visitAttribute(attr);\n");
            this.Field3579.append("}\n");
        }
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    protected Class803 Method3324(String a2, int a3) {
        return new Class803(327680, a2, a3);
    }

    void Method3325(int a2) {
        boolean a3 = true;
        if ((a2 & 1) != 0) {
            this.Field3579.append("ACC_PUBLIC");
            a3 = false;
        }
        if ((a2 & 2) != 0) {
            this.Field3579.append("ACC_PRIVATE");
            a3 = false;
        }
        if ((a2 & 4) != 0) {
            this.Field3579.append("ACC_PROTECTED");
            a3 = false;
        }
        if ((a2 & 0x10) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_FINAL");
            a3 = false;
        }
        if ((a2 & 8) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_STATIC");
            a3 = false;
        }
        if ((a2 & 0x20) != 0) {
            this.Field3579.append(" + ");
            if ((a2 & 0x40000) == 0) {
                this.Field3579.append("ACC_SYNCHRONIZED");
            } else {
                this.Field3579.append("ACC_SUPER");
            }
            a3 = false;
        }
        if ((a2 & 0x40) != 0 && (a2 & 0x80000) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_VOLATILE");
            a3 = false;
        }
        if ((a2 & 0x40) != 0 && (a2 & 0x40000) == 0 && (a2 & 0x80000) == 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_BRIDGE");
            a3 = false;
        }
        if ((a2 & 0x80) != 0 && (a2 & 0x40000) == 0 && (a2 & 0x80000) == 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_VARARGS");
            a3 = false;
        }
        if ((a2 & 0x80) != 0 && (a2 & 0x80000) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_TRANSIENT");
            a3 = false;
        }
        if ((a2 & 0x100) != 0 && (a2 & 0x40000) == 0 && (a2 & 0x80000) == 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_NATIVE");
            a3 = false;
        }
        if ((a2 & 0x4000) != 0 && ((a2 & 0x40000) != 0 || (a2 & 0x80000) != 0 || (a2 & 0x100000) != 0)) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_ENUM");
            a3 = false;
        }
        if ((a2 & 0x2000) != 0 && ((a2 & 0x40000) != 0 || (a2 & 0x100000) != 0)) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_ANNOTATION");
            a3 = false;
        }
        if ((a2 & 0x400) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_ABSTRACT");
            a3 = false;
        }
        if ((a2 & 0x200) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_INTERFACE");
            a3 = false;
        }
        if ((a2 & 0x800) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_STRICT");
            a3 = false;
        }
        if ((a2 & 0x1000) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_SYNTHETIC");
            a3 = false;
        }
        if ((a2 & 0x20000) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_DEPRECATED");
            a3 = false;
        }
        if ((a2 & 0x8000) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_MANDATED");
            a3 = false;
        }
        this.Field3579.append('0');
    }

    protected void Method3326(Object a2) {
        Class803.Method3327(this.Field3579, a2);
    }

    static void Method3327(StringBuffer a2, Object a3) {
        int a4;
        Object a5;
        a[] a6 = Class801.Method3300();
        a2.append("null");
        if (a3 instanceof String) {
            Class803.Method3297(a2, (String)a3);
        }
        if (a3 instanceof b) {
            a2.append("Type.getType(\"");
            a2.append(((b)a3).Method3225());
            a2.append("\")");
        }
        if (a3 instanceof Class279) {
            a2.append("new Handle(");
            a5 = (Class279)a3;
            a2.append("Opcodes.").append(Field3577[((Class279)a5).Method2820()]).append(", \"");
            a2.append(((Class279)a5).Method2821()).append("\", \"");
            a2.append(((Class279)a5).Method2822()).append("\", \"");
            a2.append(((Class279)a5).Method2823()).append("\")");
        }
        if (a3 instanceof Byte) {
            a2.append("new Byte((byte)").append(a3).append(')');
        }
        if (a3 instanceof Boolean) {
            a2.append((Boolean)a3 != false ? "Boolean.TRUE" : "Boolean.FALSE");
        }
        if (a3 instanceof Short) {
            a2.append("new Short((short)").append(a3).append(')');
        }
        if (a3 instanceof Character) {
            char a7 = ((Character)a3).charValue();
            a2.append("new Character((char)").append((int)a7).append(')');
        }
        if (a3 instanceof Integer) {
            a2.append("new Integer(").append(a3).append(')');
        }
        if (a3 instanceof Float) {
            a2.append("new Float(\"").append(a3).append("\")");
        }
        if (a3 instanceof Long) {
            a2.append("new Long(").append(a3).append("L)");
        }
        if (a3 instanceof Double) {
            a2.append("new Double(\"").append(a3).append("\")");
        }
        if (a3 instanceof byte[]) {
            a5 = (byte[])a3;
            a2.append("new byte[] {");
            a4 = 0;
            if (a4 < ((Object)a5).length) {
                a2.append("").append((int)a5[a4]);
                ++a4;
            }
            a2.append('}');
        }
        if (a3 instanceof boolean[]) {
            a5 = (boolean[])a3;
            a2.append("new boolean[] {");
            a4 = 0;
            if (a4 < ((Object)a5).length) {
                a2.append("").append((boolean)a5[a4]);
                ++a4;
            }
            a2.append('}');
        }
        if (a3 instanceof short[]) {
            a5 = (short[])a3;
            a2.append("new short[] {");
            a4 = 0;
            if (a4 < ((Object)a5).length) {
                a2.append("").append("(short)").append((int)a5[a4]);
                ++a4;
            }
            a2.append('}');
        }
        if (a3 instanceof char[]) {
            a5 = (char[])a3;
            a2.append("new char[] {");
            a4 = 0;
            if (a4 < ((Object)a5).length) {
                a2.append("").append("(char)").append((int)a5[a4]);
                ++a4;
            }
            a2.append('}');
        }
        if (a3 instanceof int[]) {
            a5 = (int[])a3;
            a2.append("new int[] {");
            a4 = 0;
            if (a4 < ((Object)a5).length) {
                a2.append("").append((int)a5[a4]);
                ++a4;
            }
            a2.append('}');
        }
        if (a3 instanceof long[]) {
            a5 = (long[])a3;
            a2.append("new long[] {");
            a4 = 0;
            if (a4 < ((Object)a5).length) {
                a2.append("").append((long)a5[a4]).append('L');
                ++a4;
            }
            a2.append('}');
        }
        if (a3 instanceof float[]) {
            a5 = (float[])a3;
            a2.append("new float[] {");
            a4 = 0;
            if (a4 < ((Object)a5).length) {
                a2.append("").append((float)a5[a4]).append('f');
                ++a4;
            }
            a2.append('}');
        }
        if (a3 instanceof double[]) {
            a5 = (double[])a3;
            a2.append("new double[] {");
            a4 = 0;
            if (a4 < ((Object)a5).length) {
                a2.append("").append((double)a5[a4]).append('d');
                ++a4;
            }
            a2.append('}');
        }
    }

    private void Method3328(int a2, Object[] a3) {
        for (int a4 = 0; a4 < a2; ++a4) {
            if (!(a3[a4] instanceof Class264)) continue;
            this.Method3330((Class264)a3[a4]);
        }
    }

    private void Method3329(int a2, Object[] a3) {
        for (int a4 = 0; a4 < a2; ++a4) {
            this.Field3579.append(", ");
            if (a3[a4] instanceof String) {
                this.Method3326(a3[a4]);
                continue;
            }
            if (a3[a4] instanceof Integer) {
                switch ((Integer)a3[a4]) {
                    case 0: {
                        this.Field3579.append("Opcodes.TOP");
                        break;
                    }
                    case 1: {
                        this.Field3579.append("Opcodes.INTEGER");
                        break;
                    }
                    case 2: {
                        this.Field3579.append("Opcodes.FLOAT");
                        break;
                    }
                    case 3: {
                        this.Field3579.append("Opcodes.DOUBLE");
                        break;
                    }
                    case 4: {
                        this.Field3579.append("Opcodes.LONG");
                        break;
                    }
                    case 5: {
                        this.Field3579.append("Opcodes.NULL");
                        break;
                    }
                    case 6: {
                        this.Field3579.append("Opcodes.UNINITIALIZED_THIS");
                    }
                }
                continue;
            }
            this.Method3331((Class264)a3[a4]);
        }
    }

    protected void Method3330(Class264 a2) {
        if (this.Field3593 == null) {
            this.Field3593 = new HashMap();
        }
        String a3 = (String)this.Field3593.Method2665((Object)a2);
        a3 = "l" + this.Field3593.Method1799();
        this.Field3593.put((Object)a2, (Object)a3);
        this.Field3579.append("Label ").append(a3).append(" = new Label();\n");
    }

    protected void Method3331(Class264 a2) {
        this.Field3579.append((String)this.Field3593.Method2665((Object)a2));
    }

    @Override
    public Class801 Method3289(int n, Class31 class31, String string, boolean bl) {
        return this.Method3319(n, class31, string, bl);
    }

    @Override
    public Class801 Method3287(int n, Class31 class31, String string, boolean bl) {
        return this.Method3318(n, class31, string, bl);
    }

    @Override
    public Class801 Method3268(int n, String string, boolean bl) {
        return this.Method3316(n, string, bl);
    }

    @Override
    public Class801 Method3267(int n, Class31 class31, String string, boolean bl) {
        return this.Method3315(n, class31, string, bl);
    }

    @Override
    public Class801 Method3266(String string, boolean bl) {
        return this.Method3314(string, bl);
    }

    @Override
    public Class801 Method3265() {
        return this.Method3313();
    }

    @Override
    public Class801 Method3261(int n, Class31 class31, String string, boolean bl) {
        return this.Method3312(n, class31, string, bl);
    }

    @Override
    public Class801 Method3260(String string, boolean bl) {
        return this.Method3311(string, bl);
    }

    @Override
    public Class801 Method3258(String string) {
        return this.Method3310(string);
    }

    @Override
    public Class801 Method3257(String string, String string2) {
        return this.Method3309(string, string2);
    }

    @Override
    public Class801 Method3253(int n, String string, String string2, String string3, String[] stringArray) {
        return this.Method3308(n, string, string2, string3, stringArray);
    }

    @Override
    public Class801 Method3252(int n, String string, String string2, String string3, Object object) {
        return this.Method3307(n, string, string2, string3, object);
    }

    @Override
    public Class801 Method3249(int n, Class31 class31, String string, boolean bl) {
        return this.Method3306(n, class31, string, bl);
    }

    @Override
    public Class801 Method3248(String string, boolean bl) {
        return this.Method3305(string, bl);
    }

    private static Exception Method3332(Exception exception) {
        return exception;
    }
}