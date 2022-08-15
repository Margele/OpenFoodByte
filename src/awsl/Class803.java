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
import awsl.Class46;
import awsl.Class799;
import awsl.Class801;
import awsl.Class91;
import java.util.HashMap;
import java.util.Map;

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

    protected Class803(int a, String a2, int a3) {
        super(a);
        this.Field3591 = a2;
        this.Field3592 = a3;
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
        System.err.println("Prints the ASM code to generate the given class.");
        System.err.println("Usage: ASMifier [-debug] <fully qualified class name or class file name>");
    }

    @Override
    public void Method3245(int a, int a2, String a3, String a4, String a5, String[] a6) {
        String a7;
        int a8 = a3.lastIndexOf(47);
        if (a8 == -1) {
            a7 = a3;
        } else {
            this.Field3580.Method2530((Object)("package asm." + a3.substring(0, a8).replace('/', '.') + ";\n"));
            a7 = a3.substring(a8 + 1);
        }
        this.Field3580.Method2530((Object)"import java.util.*;\n");
        this.Field3580.Method2530((Object)"import org.objectweb.asm.*;\n");
        this.Field3580.Method2530((Object)("public class " + a7 + "Dump implements Opcodes {\n\n"));
        this.Field3580.Method2530((Object)"public static byte[] dump () throws Exception {\n\n");
        this.Field3580.Method2530((Object)"ClassWriter cw = new ClassWriter(0);\n");
        this.Field3580.Method2530((Object)"FieldVisitor fv;\n");
        this.Field3580.Method2530((Object)"MethodVisitor mv;\n");
        this.Field3580.Method2530((Object)"AnnotationVisitor av0;\n\n");
        this.Field3579.setLength(0);
        this.Field3579.append("cw.visit(");
        switch (a) {
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
                this.Field3579.append(a);
            }
        }
        this.Field3579.append(", ");
        this.Method3325(a2 | 0x40000);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", ");
        this.Method3326(a5);
        this.Field3579.append(", ");
        if (a6.length > 0) {
            this.Field3579.append("new String[] {");
            for (int a9 = 0; a9 < a6.length; ++a9) {
                this.Field3579.append(" ");
                this.Method3326(a6[a9]);
            }
            this.Field3579.append(" }");
        } else {
            this.Field3579.append("null");
        }
        this.Field3579.append(");\n\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3246(String a, String a2) {
        this.Field3579.setLength(0);
        this.Field3579.append("cw.visitSource(");
        this.Method3326(a);
        this.Field3579.append(", ");
        this.Method3326(a2);
        this.Field3579.append(");\n\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3247(String a, String a2, String a3) {
        this.Field3579.setLength(0);
        this.Field3579.append("cw.visitOuterClass(");
        this.Method3326(a);
        this.Field3579.append(", ");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(");\n\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3305(String a, boolean a2) {
        return this.Method3320(a, a2);
    }

    public Class803 Method3306(int a, Class31 a2, String a3, boolean a4) {
        return this.Method3321(a, a2, a3, a4);
    }

    @Override
    public void Method3250(Class136 a) {
        this.Method3323(a);
    }

    @Override
    public void Method3251(String a, String a2, String a3, int a4) {
        this.Field3579.setLength(0);
        this.Field3579.append("cw.visitInnerClass(");
        this.Method3326(a);
        this.Field3579.append(", ");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3325(a4 | 0x100000);
        this.Field3579.append(");\n\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3307(int a, String a2, String a3, String a4, Object a5) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n");
        this.Field3579.append("fv = cw.visitField(");
        this.Method3325(a | 0x80000);
        this.Field3579.append(", ");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", ");
        this.Method3326(a5);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a6 = this.Method3324("fv", 0);
        this.Field3580.Method2530((Object)a6.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a6;
    }

    public Class803 Method3308(int a, String a2, String a3, String a4, String[] a5) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n");
        this.Field3579.append("mv = cw.visitMethod(");
        this.Method3325(a);
        this.Field3579.append(", ");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", ");
        if (a5.length > 0) {
            this.Field3579.append("new String[] {");
            for (int a6 = 0; a6 < a5.length; ++a6) {
                this.Field3579.append(" ");
                this.Method3326(a5[a6]);
            }
            this.Field3579.append(" }");
        } else {
            this.Field3579.append("null");
        }
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a7 = this.Method3324("mv", 0);
        this.Field3580.Method2530((Object)a7.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a7;
    }

    @Override
    public void Method3254() {
        this.Field3580.Method2530((Object)"cw.visitEnd();\n\n");
        this.Field3580.Method2530((Object)"return cw.toByteArray();\n");
        this.Field3580.Method2530((Object)"}\n");
        this.Field3580.Method2530((Object)"}\n");
    }

    @Override
    public void Method3255(String a, Object a2) {
        this.Field3579.setLength(0);
        this.Field3579.append("av").append(this.Field3592).append(".visit(");
        Class803.Method3327(this.Field3579, a);
        this.Field3579.append(", ");
        Class803.Method3327(this.Field3579, a2);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3256(String a, String a2, String a3) {
        this.Field3579.setLength(0);
        this.Field3579.append("av").append(this.Field3592).append(".visitEnum(");
        Class803.Method3327(this.Field3579, a);
        this.Field3579.append(", ");
        Class803.Method3327(this.Field3579, a2);
        this.Field3579.append(", ");
        Class803.Method3327(this.Field3579, a3);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3309(String a, String a2) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n");
        this.Field3579.append("AnnotationVisitor av").append(this.Field3592 + 1).append(" = av");
        this.Field3579.append(this.Field3592).append(".visitAnnotation(");
        Class803.Method3327(this.Field3579, a);
        this.Field3579.append(", ");
        Class803.Method3327(this.Field3579, a2);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a3 = this.Method3324("av", this.Field3592 + 1);
        this.Field3580.Method2530((Object)a3.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a3;
    }

    public Class803 Method3310(String a) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n");
        this.Field3579.append("AnnotationVisitor av").append(this.Field3592 + 1).append(" = av");
        this.Field3579.append(this.Field3592).append(".visitArray(");
        Class803.Method3327(this.Field3579, a);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a2 = this.Method3324("av", this.Field3592 + 1);
        this.Field3580.Method2530((Object)a2.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a2;
    }

    @Override
    public void Method3259() {
        this.Field3579.setLength(0);
        this.Field3579.append("av").append(this.Field3592).append(".visitEnd();\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3311(String a, boolean a2) {
        return this.Method3320(a, a2);
    }

    public Class803 Method3312(int a, Class31 a2, String a3, boolean a4) {
        return this.Method3321(a, a2, a3, a4);
    }

    @Override
    public void Method3262(Class136 a) {
        this.Method3323(a);
    }

    @Override
    public void Method3263() {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitEnd();\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3264(String a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitParameter(");
        Class803.Method3297(this.Field3579, a);
        this.Field3579.append(", ");
        this.Method3325(a2);
        this.Field3580.Method2530((Object)this.Field3579.append(");\n").toString());
    }

    public Class803 Method3313() {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitAnnotationDefault();\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a = this.Method3324("av", 0);
        this.Field3580.Method2530((Object)a.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a;
    }

    public Class803 Method3314(String a, boolean a2) {
        return this.Method3320(a, a2);
    }

    public Class803 Method3315(int a, Class31 a2, String a3, boolean a4) {
        return this.Method3321(a, a2, a3, a4);
    }

    public Class803 Method3316(int a, String a2, boolean a3) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitParameterAnnotation(").append(a).append(", ");
        this.Method3326(a2);
        this.Field3579.append(", ").append(a3).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a4 = this.Method3324("av", 0);
        this.Field3580.Method2530((Object)a4.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a4;
    }

    @Override
    public void Method3269(Class136 a) {
        this.Method3323(a);
    }

    @Override
    public void Method3270() {
        this.Field3580.Method2530((Object)(this.Field3591 + ".visitCode();\n"));
    }

    @Override
    public void Method3271(int a, int a2, Object[] a3, int a4, Object[] a5) {
        this.Field3579.setLength(0);
        switch (a) {
            case -1: 
            case 0: {
                this.Method3328(a2, a3);
                this.Method3328(a4, a5);
                if (a == -1) {
                    this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_NEW, ");
                } else {
                    this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_FULL, ");
                }
                this.Field3579.append(a2).append(", new Object[] {");
                this.Method3329(a2, a3);
                this.Field3579.append("}, ").append(a4).append(", new Object[] {");
                this.Method3329(a4, a5);
                this.Field3579.append('}');
                break;
            }
            case 1: {
                this.Method3328(a2, a3);
                this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_APPEND,").append(a2).append(", new Object[] {");
                this.Method3329(a2, a3);
                this.Field3579.append("}, 0, null");
                break;
            }
            case 2: {
                this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_CHOP,").append(a2).append(", null, 0, null");
                break;
            }
            case 3: {
                this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_SAME, 0, null, 0, null");
                break;
            }
            case 4: {
                this.Method3328(1, a5);
                this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {");
                this.Method3329(1, a5);
                this.Field3579.append('}');
            }
        }
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3272(int a) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitInsn(").append(Field3575[a]).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3273(int a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitIntInsn(").append(Field3575[a]).append(", ").append(a == 188 ? Field3576[a2] : Integer.toString((int)a2)).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3274(int a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitVarInsn(").append(Field3575[a]).append(", ").append(a2).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3275(int a, String a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitTypeInsn(").append(Field3575[a]).append(", ");
        this.Method3326(a2);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3276(int a, String a2, String a3, String a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitFieldInsn(").append(Field3575[a]).append(", ");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(");\n");
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
        this.Field3579.append(this.Field3591).append(".visitMethodInsn(").append(Field3575[a]).append(", ");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(", ");
        this.Field3579.append("true");
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3279(String a, String a2, Class279 a3, Object[] a4) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitInvokeDynamicInsn(");
        this.Method3326(a);
        this.Field3579.append(", ");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", new Object[]{");
        for (int a5 = 0; a5 < a4.length; ++a5) {
            this.Method3326(a4[a5]);
            if (a5 == a4.length - 1) continue;
            this.Field3579.append(", ");
        }
        this.Field3579.append("});\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3280(int a, Class264 a2) {
        this.Field3579.setLength(0);
        this.Method3330(a2);
        this.Field3579.append(this.Field3591).append(".visitJumpInsn(").append(Field3575[a]).append(", ");
        this.Method3331(a2);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3281(Class264 a) {
        this.Field3579.setLength(0);
        this.Method3330(a);
        this.Field3579.append(this.Field3591).append(".visitLabel(");
        this.Method3331(a);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3282(Object a) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitLdcInsn(");
        this.Method3326(a);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3283(int a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitIincInsn(").append(a).append(", ").append(a2).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3284(int a, int a2, Class264 a3, Class264[] a4) {
        int a5;
        this.Field3579.setLength(0);
        for (a5 = 0; a5 < a4.length; ++a5) {
            this.Method3330(a4[a5]);
        }
        this.Method3330(a3);
        this.Field3579.append(this.Field3591).append(".visitTableSwitchInsn(").append(a).append(", ").append(a2).append(", ");
        this.Method3331(a3);
        this.Field3579.append(", new Label[] {");
        for (a5 = 0; a5 < a4.length; ++a5) {
            this.Field3579.append(" ");
            this.Method3331(a4[a5]);
        }
        this.Field3579.append(" });\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3285(Class264 a, int[] a2, Class264[] a3) {
        int a4;
        this.Field3579.setLength(0);
        for (a4 = 0; a4 < a3.length; ++a4) {
            this.Method3330(a3[a4]);
        }
        this.Method3330(a);
        this.Field3579.append(this.Field3591).append(".visitLookupSwitchInsn(");
        this.Method3331(a);
        this.Field3579.append(", new int[] {");
        for (a4 = 0; a4 < a2.length; ++a4) {
            this.Field3579.append(" ").append(a2[a4]);
        }
        this.Field3579.append(" }, new Label[] {");
        for (a4 = 0; a4 < a3.length; ++a4) {
            this.Field3579.append(" ");
            this.Method3331(a3[a4]);
        }
        this.Field3579.append(" });\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3286(String a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitMultiANewArrayInsn(");
        this.Method3326(a);
        this.Field3579.append(", ").append(a2).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3318(int a, Class31 a2, String a3, boolean a4) {
        return this.Method3322("visitInsnAnnotation", a, a2, a3, a4);
    }

    @Override
    public void Method3288(Class264 a, Class264 a2, Class264 a3, String a4) {
        this.Field3579.setLength(0);
        this.Method3330(a);
        this.Method3330(a2);
        this.Method3330(a3);
        this.Field3579.append(this.Field3591).append(".visitTryCatchBlock(");
        this.Method3331(a);
        this.Field3579.append(", ");
        this.Method3331(a2);
        this.Field3579.append(", ");
        this.Method3331(a3);
        this.Field3579.append(", ");
        this.Method3326(a4);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3319(int a, Class31 a2, String a3, boolean a4) {
        return this.Method3322("visitTryCatchAnnotation", a, a2, a3, a4);
    }

    @Override
    public void Method3290(String a, String a2, String a3, Class264 a4, Class264 a5, int a6) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitLocalVariable(");
        this.Method3326(a);
        this.Field3579.append(", ");
        this.Method3326(a2);
        this.Field3579.append(", ");
        this.Method3326(a3);
        this.Field3579.append(", ");
        this.Method3331(a4);
        this.Field3579.append(", ");
        this.Method3331(a5);
        this.Field3579.append(", ").append(a6).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public Class801 Method3291(int a, Class31 a2, Class264[] a3, Class264[] a4, int[] a5, String a6, boolean a7) {
        int a8;
        this.Field3579.setLength(0);
        this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitLocalVariableAnnotation(");
        this.Field3579.append(a);
        this.Field3579.append(", TypePath.fromString(\"").append((Object)a2).append("\"), ");
        this.Field3579.append("new Label[] {");
        for (a8 = 0; a8 < a3.length; ++a8) {
            this.Field3579.append(" ");
            this.Method3331(a3[a8]);
        }
        this.Field3579.append(" }, new Label[] {");
        for (a8 = 0; a8 < a4.length; ++a8) {
            this.Field3579.append(" ");
            this.Method3331(a4[a8]);
        }
        this.Field3579.append(" }, new int[] {");
        for (a8 = 0; a8 < a5.length; ++a8) {
            this.Field3579.append(" ").append(a5[a8]);
        }
        this.Field3579.append(" }, ");
        this.Method3326(a6);
        this.Field3579.append(", ").append(a7).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a9 = this.Method3324("av", 0);
        this.Field3580.Method2530((Object)a9.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a9;
    }

    @Override
    public void Method3292(int a, Class264 a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitLineNumber(").append(a).append(", ");
        this.Method3331(a2);
        this.Field3579.append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3293(int a, int a2) {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitMaxs(").append(a).append(", ").append(a2).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    @Override
    public void Method3294() {
        this.Field3579.setLength(0);
        this.Field3579.append(this.Field3591).append(".visitEnd();\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    public Class803 Method3320(String a, boolean a2) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitAnnotation(");
        this.Method3326(a);
        this.Field3579.append(", ").append(a2).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a3 = this.Method3324("av", 0);
        this.Field3580.Method2530((Object)a3.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a3;
    }

    public Class803 Method3321(int a, Class31 a2, String a3, boolean a4) {
        return this.Method3322("visitTypeAnnotation", a, a2, a3, a4);
    }

    public Class803 Method3322(String a, int a2, Class31 a3, String a4, boolean a5) {
        this.Field3579.setLength(0);
        this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".").append(a).append("(");
        this.Field3579.append(a2);
        this.Field3579.append(", TypePath.fromString(\"").append((Object)a3).append("\"), ");
        this.Method3326(a4);
        this.Field3579.append(", ").append(a5).append(");\n");
        this.Field3580.Method2530((Object)this.Field3579.toString());
        Class803 a6 = this.Method3324("av", 0);
        this.Field3580.Method2530((Object)a6.Method3295());
        this.Field3580.Method2530((Object)"}\n");
        return a6;
    }

    public void Method3323(Class136 a) {
        this.Field3579.setLength(0);
        this.Field3579.append("// ATTRIBUTE ").append(a.Field987).append('\n');
        if (a instanceof Class799) {
            if (this.Field3593 == null) {
                this.Field3593 = new HashMap();
            }
            this.Field3579.append("{\n");
            ((Class799)((Object)a)).Method830(this.Field3579, "attr", this.Field3593);
            this.Field3579.append(this.Field3591).append(".visitAttribute(attr);\n");
            this.Field3579.append("}\n");
        }
        this.Field3580.Method2530((Object)this.Field3579.toString());
    }

    protected Class803 Method3324(String a, int a2) {
        return new Class803(327680, a, a2);
    }

    void Method3325(int a) {
        boolean a2 = true;
        if ((a & 1) != 0) {
            this.Field3579.append("ACC_PUBLIC");
            a2 = false;
        }
        if ((a & 2) != 0) {
            this.Field3579.append("ACC_PRIVATE");
            a2 = false;
        }
        if ((a & 4) != 0) {
            this.Field3579.append("ACC_PROTECTED");
            a2 = false;
        }
        if ((a & 0x10) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_FINAL");
            a2 = false;
        }
        if ((a & 8) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_STATIC");
            a2 = false;
        }
        if ((a & 0x20) != 0) {
            this.Field3579.append(" + ");
            if ((a & 0x40000) == 0) {
                this.Field3579.append("ACC_SYNCHRONIZED");
            } else {
                this.Field3579.append("ACC_SUPER");
            }
            a2 = false;
        }
        if ((a & 0x40) != 0 && (a & 0x80000) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_VOLATILE");
            a2 = false;
        }
        if ((a & 0x40) != 0 && (a & 0x40000) == 0 && (a & 0x80000) == 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_BRIDGE");
            a2 = false;
        }
        if ((a & 0x80) != 0 && (a & 0x40000) == 0 && (a & 0x80000) == 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_VARARGS");
            a2 = false;
        }
        if ((a & 0x80) != 0 && (a & 0x80000) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_TRANSIENT");
            a2 = false;
        }
        if ((a & 0x100) != 0 && (a & 0x40000) == 0 && (a & 0x80000) == 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_NATIVE");
            a2 = false;
        }
        if ((a & 0x4000) != 0 && ((a & 0x40000) != 0 || (a & 0x80000) != 0 || (a & 0x100000) != 0)) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_ENUM");
            a2 = false;
        }
        if ((a & 0x2000) != 0 && ((a & 0x40000) != 0 || (a & 0x100000) != 0)) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_ANNOTATION");
            a2 = false;
        }
        if ((a & 0x400) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_ABSTRACT");
            a2 = false;
        }
        if ((a & 0x200) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_INTERFACE");
            a2 = false;
        }
        if ((a & 0x800) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_STRICT");
            a2 = false;
        }
        if ((a & 0x1000) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_SYNTHETIC");
            a2 = false;
        }
        if ((a & 0x20000) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_DEPRECATED");
            a2 = false;
        }
        if ((a & 0x8000) != 0) {
            this.Field3579.append(" + ");
            this.Field3579.append("ACC_MANDATED");
            a2 = false;
        }
        this.Field3579.append('0');
    }

    protected void Method3326(Object a) {
        Class803.Method3327(this.Field3579, a);
    }

    static void Method3327(StringBuffer a, Object a2) {
        int a3;
        Object a4;
        Class91[] a5 = Class801.Method3300();
        a.append("null");
        if (a2 instanceof String) {
            Class803.Method3297(a, (String)a2);
        }
        if (a2 instanceof Class46) {
            a.append("Type.getType(\"");
            a.append(((Class46)a2).Method3225());
            a.append("\")");
        }
        if (a2 instanceof Class279) {
            a.append("new Handle(");
            a4 = (Class279)a2;
            a.append("Opcodes.").append(Field3577[((Class279)a4).Method2820()]).append(", \"");
            a.append(((Class279)a4).Method2821()).append("\", \"");
            a.append(((Class279)a4).Method2822()).append("\", \"");
            a.append(((Class279)a4).Method2823()).append("\")");
        }
        if (a2 instanceof Byte) {
            a.append("new Byte((byte)").append(a2).append(')');
        }
        if (a2 instanceof Boolean) {
            a.append((Boolean)a2 != false ? "Boolean.TRUE" : "Boolean.FALSE");
        }
        if (a2 instanceof Short) {
            a.append("new Short((short)").append(a2).append(')');
        }
        if (a2 instanceof Character) {
            char a6 = ((Character)a2).charValue();
            a.append("new Character((char)").append((int)a6).append(')');
        }
        if (a2 instanceof Integer) {
            a.append("new Integer(").append(a2).append(')');
        }
        if (a2 instanceof Float) {
            a.append("new Float(\"").append(a2).append("\")");
        }
        if (a2 instanceof Long) {
            a.append("new Long(").append(a2).append("L)");
        }
        if (a2 instanceof Double) {
            a.append("new Double(\"").append(a2).append("\")");
        }
        if (a2 instanceof byte[]) {
            a4 = (byte[])a2;
            a.append("new byte[] {");
            a3 = 0;
            if (a3 < ((Object)a4).length) {
                a.append("").append((int)a4[a3]);
                ++a3;
            }
            a.append('}');
        }
        if (a2 instanceof boolean[]) {
            a4 = (boolean[])a2;
            a.append("new boolean[] {");
            a3 = 0;
            if (a3 < ((Object)a4).length) {
                a.append("").append((boolean)a4[a3]);
                ++a3;
            }
            a.append('}');
        }
        if (a2 instanceof short[]) {
            a4 = (short[])a2;
            a.append("new short[] {");
            a3 = 0;
            if (a3 < ((Object)a4).length) {
                a.append("").append("(short)").append((int)a4[a3]);
                ++a3;
            }
            a.append('}');
        }
        if (a2 instanceof char[]) {
            a4 = (char[])a2;
            a.append("new char[] {");
            a3 = 0;
            if (a3 < ((Object)a4).length) {
                a.append("").append("(char)").append((int)a4[a3]);
                ++a3;
            }
            a.append('}');
        }
        if (a2 instanceof int[]) {
            a4 = (int[])a2;
            a.append("new int[] {");
            a3 = 0;
            if (a3 < ((Object)a4).length) {
                a.append("").append((int)a4[a3]);
                ++a3;
            }
            a.append('}');
        }
        if (a2 instanceof long[]) {
            a4 = (long[])a2;
            a.append("new long[] {");
            a3 = 0;
            if (a3 < ((Object)a4).length) {
                a.append("").append((long)a4[a3]).append('L');
                ++a3;
            }
            a.append('}');
        }
        if (a2 instanceof float[]) {
            a4 = (float[])a2;
            a.append("new float[] {");
            a3 = 0;
            if (a3 < ((Object)a4).length) {
                a.append("").append((float)a4[a3]).append('f');
                ++a3;
            }
            a.append('}');
        }
        if (a2 instanceof double[]) {
            a4 = (double[])a2;
            a.append("new double[] {");
            a3 = 0;
            if (a3 < ((Object)a4).length) {
                a.append("").append((double)a4[a3]).append('d');
                ++a3;
            }
            a.append('}');
        }
    }

    private void Method3328(int a, Object[] a2) {
        for (int a3 = 0; a3 < a; ++a3) {
            if (!(a2[a3] instanceof Class264)) continue;
            this.Method3330((Class264)a2[a3]);
        }
    }

    private void Method3329(int a, Object[] a2) {
        for (int a3 = 0; a3 < a; ++a3) {
            this.Field3579.append(", ");
            if (a2[a3] instanceof String) {
                this.Method3326(a2[a3]);
                continue;
            }
            if (a2[a3] instanceof Integer) {
                switch ((Integer)a2[a3]) {
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
            this.Method3331((Class264)a2[a3]);
        }
    }

    protected void Method3330(Class264 a) {
        if (this.Field3593 == null) {
            this.Field3593 = new HashMap();
        }
        String a2 = (String)this.Field3593.Method2665((Object)a);
        a2 = "l" + this.Field3593.Method1799();
        this.Field3593.put((Object)a, (Object)a2);
        this.Field3579.append("Label ").append(a2).append(" = new Label();\n");
    }

    protected void Method3331(Class264 a) {
        this.Field3579.append((String)this.Field3593.Method2665((Object)a));
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