package awsl;

import java.util.HashMap;
import java.util.Map;
import obfuscate.a;
import obfuscate.b;

public class Class803 extends Class801 {
   protected final String Field3591;
   protected final int Field3592;
   protected Map Field3593;
   private static final int Field3594 = 262144;
   private static final int Field3595 = 524288;
   private static final int Field3596 = 1048576;

   public Class803() {
      this(327680, "cw", 0);
      if (this.getClass() != Class803.class) {
         throw new IllegalStateException();
      }
   }

   protected Class803(int a, String a, int a) {
      super(a);
      this.Field3591 = a;
      this.Field3592 = a;
   }

   public static void main(String[] a) throws Exception {
      int a = false;
      int a = true;
      boolean a = true;
      if (a.length < 1 || a.length > 2) {
         a = false;
      }

      if ("-debug".equals(a[0])) {
         a = true;
         a = false;
         if (a.length != 2) {
            a = false;
         }
      }

      System.err.println("Prints the ASM code to generate the given class.");
      System.err.println("Usage: ASMifier [-debug] <fully qualified class name or class file name>");
   }

   public void Method3245(int a, int a, String a, String a, String a, String[] a) {
      int a = a.lastIndexOf(47);
      String a;
      if (a == -1) {
         a = a;
      } else {
         this.Field3580.Method2530("package asm." + a.substring(0, a).replace('/', '.') + ";\n");
         a = a.substring(a + 1);
      }

      this.Field3580.Method2530("import java.util.*;\n");
      this.Field3580.Method2530("import org.objectweb.asm.*;\n");
      this.Field3580.Method2530("public class " + a + "Dump implements Opcodes {\n\n");
      this.Field3580.Method2530("public static byte[] dump () throws Exception {\n\n");
      this.Field3580.Method2530("ClassWriter cw = new ClassWriter(0);\n");
      this.Field3580.Method2530("FieldVisitor fv;\n");
      this.Field3580.Method2530("MethodVisitor mv;\n");
      this.Field3580.Method2530("AnnotationVisitor av0;\n\n");
      this.Field3579.setLength(0);
      this.Field3579.append("cw.visit(");
      switch (a) {
         case 46:
            this.Field3579.append("V1_2");
            break;
         case 47:
            this.Field3579.append("V1_3");
            break;
         case 48:
            this.Field3579.append("V1_4");
            break;
         case 49:
            this.Field3579.append("V1_5");
            break;
         case 50:
            this.Field3579.append("V1_6");
            break;
         case 51:
            this.Field3579.append("V1_7");
            break;
         case 196653:
            this.Field3579.append("V1_1");
            break;
         default:
            this.Field3579.append(a);
      }

      this.Field3579.append(", ");
      this.Method3325(a | 262144);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      if (a.length > 0) {
         this.Field3579.append("new String[] {");

         for(int a = 0; a < a.length; ++a) {
            this.Field3579.append(" ");
            this.Method3326(a[a]);
         }

         this.Field3579.append(" }");
      } else {
         this.Field3579.append("null");
      }

      this.Field3579.append(");\n\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3246(String a, String a) {
      this.Field3579.setLength(0);
      this.Field3579.append("cw.visitSource(");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(");\n\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3247(String a, String a, String a) {
      this.Field3579.setLength(0);
      this.Field3579.append("cw.visitOuterClass(");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(");\n\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class803 Method3305(String a, boolean a) {
      return this.Method3320(a, a);
   }

   public Class803 Method3306(int a, Class31 a, String a, boolean a) {
      return this.Method3321(a, a, a, a);
   }

   public void Method3250(Class136 a) {
      this.Method3323(a);
   }

   public void Method3251(String a, String a, String a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append("cw.visitInnerClass(");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3325(a | 1048576);
      this.Field3579.append(");\n\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class803 Method3307(int a, String a, String a, String a, Object a) {
      this.Field3579.setLength(0);
      this.Field3579.append("{\n");
      this.Field3579.append("fv = cw.visitField(");
      this.Method3325(a | 524288);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
      Class803 a = this.Method3324("fv", 0);
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530("}\n");
      return a;
   }

   public Class803 Method3308(int a, String a, String a, String a, String[] a) {
      this.Field3579.setLength(0);
      this.Field3579.append("{\n");
      this.Field3579.append("mv = cw.visitMethod(");
      this.Method3325(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      if (a.length > 0) {
         this.Field3579.append("new String[] {");

         for(int a = 0; a < a.length; ++a) {
            this.Field3579.append(" ");
            this.Method3326(a[a]);
         }

         this.Field3579.append(" }");
      } else {
         this.Field3579.append("null");
      }

      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
      Class803 a = this.Method3324("mv", 0);
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530("}\n");
      return a;
   }

   public void Method3254() {
      this.Field3580.Method2530("cw.visitEnd();\n\n");
      this.Field3580.Method2530("return cw.toByteArray();\n");
      this.Field3580.Method2530("}\n");
      this.Field3580.Method2530("}\n");
   }

   public void Method3255(String a, Object a) {
      this.Field3579.setLength(0);
      this.Field3579.append("av").append(this.Field3592).append(".visit(");
      Method3327(this.Field3579, a);
      this.Field3579.append(", ");
      Method3327(this.Field3579, a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3256(String a, String a, String a) {
      this.Field3579.setLength(0);
      this.Field3579.append("av").append(this.Field3592).append(".visitEnum(");
      Method3327(this.Field3579, a);
      this.Field3579.append(", ");
      Method3327(this.Field3579, a);
      this.Field3579.append(", ");
      Method3327(this.Field3579, a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class803 Method3309(String a, String a) {
      this.Field3579.setLength(0);
      this.Field3579.append("{\n");
      this.Field3579.append("AnnotationVisitor av").append(this.Field3592 + 1).append(" = av");
      this.Field3579.append(this.Field3592).append(".visitAnnotation(");
      Method3327(this.Field3579, a);
      this.Field3579.append(", ");
      Method3327(this.Field3579, a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
      Class803 a = this.Method3324("av", this.Field3592 + 1);
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530("}\n");
      return a;
   }

   public Class803 Method3310(String a) {
      this.Field3579.setLength(0);
      this.Field3579.append("{\n");
      this.Field3579.append("AnnotationVisitor av").append(this.Field3592 + 1).append(" = av");
      this.Field3579.append(this.Field3592).append(".visitArray(");
      Method3327(this.Field3579, a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
      Class803 a = this.Method3324("av", this.Field3592 + 1);
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530("}\n");
      return a;
   }

   public void Method3259() {
      this.Field3579.setLength(0);
      this.Field3579.append("av").append(this.Field3592).append(".visitEnd();\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class803 Method3311(String a, boolean a) {
      return this.Method3320(a, a);
   }

   public Class803 Method3312(int a, Class31 a, String a, boolean a) {
      return this.Method3321(a, a, a, a);
   }

   public void Method3262(Class136 a) {
      this.Method3323(a);
   }

   public void Method3263() {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitEnd();\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3264(String a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitParameter(");
      Method3297(this.Field3579, a);
      this.Field3579.append(", ");
      this.Method3325(a);
      this.Field3580.Method2530(this.Field3579.append(");\n").toString());
   }

   public Class803 Method3313() {
      this.Field3579.setLength(0);
      this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitAnnotationDefault();\n");
      this.Field3580.Method2530(this.Field3579.toString());
      Class803 a = this.Method3324("av", 0);
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530("}\n");
      return a;
   }

   public Class803 Method3314(String a, boolean a) {
      return this.Method3320(a, a);
   }

   public Class803 Method3315(int a, Class31 a, String a, boolean a) {
      return this.Method3321(a, a, a, a);
   }

   public Class803 Method3316(int a, String a, boolean a) {
      this.Field3579.setLength(0);
      this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitParameterAnnotation(").append(a).append(", ");
      this.Method3326(a);
      this.Field3579.append(", ").append(a).append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
      Class803 a = this.Method3324("av", 0);
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530("}\n");
      return a;
   }

   public void Method3269(Class136 a) {
      this.Method3323(a);
   }

   public void Method3270() {
      this.Field3580.Method2530(this.Field3591 + ".visitCode();\n");
   }

   public void Method3271(int a, int a, Object[] a, int a, Object[] a) {
      this.Field3579.setLength(0);
      switch (a) {
         case -1:
         case 0:
            this.Method3328(a, a);
            this.Method3328(a, a);
            if (a == -1) {
               this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_NEW, ");
            } else {
               this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_FULL, ");
            }

            this.Field3579.append(a).append(", new Object[] {");
            this.Method3329(a, a);
            this.Field3579.append("}, ").append(a).append(", new Object[] {");
            this.Method3329(a, a);
            this.Field3579.append('}');
            break;
         case 1:
            this.Method3328(a, a);
            this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_APPEND,").append(a).append(", new Object[] {");
            this.Method3329(a, a);
            this.Field3579.append("}, 0, null");
            break;
         case 2:
            this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_CHOP,").append(a).append(", null, 0, null");
            break;
         case 3:
            this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_SAME, 0, null, 0, null");
            break;
         case 4:
            this.Method3328(1, a);
            this.Field3579.append(this.Field3591).append(".visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {");
            this.Method3329(1, a);
            this.Field3579.append('}');
      }

      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3272(int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitInsn(").append(Field3575[a]).append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3273(int a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitIntInsn(").append(Field3575[a]).append(", ").append(a == 188 ? Field3576[a] : Integer.toString(a)).append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3274(int a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitVarInsn(").append(Field3575[a]).append(", ").append(a).append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3275(int a, String a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitTypeInsn(").append(Field3575[a]).append(", ");
      this.Method3326(a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3276(int a, String a, String a, String a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitFieldInsn(").append(Field3575[a]).append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   /** @deprecated */
   @Deprecated
   public void Method3277(int a, String a, String a, String a) {
      if (this.Field3578 >= 327680) {
         super.Method3277(a, a, a, a);
      } else {
         this.Method3317(a, a, a, a, a == 185);
      }
   }

   public void Method3278(int a, String a, String a, String a, boolean a) {
      if (this.Field3578 < 327680) {
         super.Method3278(a, a, a, a, a);
      } else {
         this.Method3317(a, a, a, a, a);
      }
   }

   private void Method3317(int a, String a, String a, String a, boolean a4) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitMethodInsn(").append(Field3575[a]).append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Field3579.append("true");
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3279(String a, String a, Class279 a, Object[] a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitInvokeDynamicInsn(");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", new Object[]{");

      for(int a = 0; a < a.length; ++a) {
         this.Method3326(a[a]);
         if (a != a.length - 1) {
            this.Field3579.append(", ");
         }
      }

      this.Field3579.append("});\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3280(int a, Class264 a) {
      this.Field3579.setLength(0);
      this.Method3330(a);
      this.Field3579.append(this.Field3591).append(".visitJumpInsn(").append(Field3575[a]).append(", ");
      this.Method3331(a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3281(Class264 a) {
      this.Field3579.setLength(0);
      this.Method3330(a);
      this.Field3579.append(this.Field3591).append(".visitLabel(");
      this.Method3331(a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3282(Object a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitLdcInsn(");
      this.Method3326(a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3283(int a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitIincInsn(").append(a).append(", ").append(a).append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3284(int a, int a, Class264 a, Class264[] a) {
      this.Field3579.setLength(0);

      int a;
      for(a = 0; a < a.length; ++a) {
         this.Method3330(a[a]);
      }

      this.Method3330(a);
      this.Field3579.append(this.Field3591).append(".visitTableSwitchInsn(").append(a).append(", ").append(a).append(", ");
      this.Method3331(a);
      this.Field3579.append(", new Label[] {");

      for(a = 0; a < a.length; ++a) {
         this.Field3579.append(" ");
         this.Method3331(a[a]);
      }

      this.Field3579.append(" });\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3285(Class264 a, int[] a, Class264[] a) {
      this.Field3579.setLength(0);

      int a;
      for(a = 0; a < a.length; ++a) {
         this.Method3330(a[a]);
      }

      this.Method3330(a);
      this.Field3579.append(this.Field3591).append(".visitLookupSwitchInsn(");
      this.Method3331(a);
      this.Field3579.append(", new int[] {");

      for(a = 0; a < a.length; ++a) {
         this.Field3579.append(" ").append(a[a]);
      }

      this.Field3579.append(" }, new Label[] {");

      for(a = 0; a < a.length; ++a) {
         this.Field3579.append(" ");
         this.Method3331(a[a]);
      }

      this.Field3579.append(" });\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3286(String a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitMultiANewArrayInsn(");
      this.Method3326(a);
      this.Field3579.append(", ").append(a).append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class803 Method3318(int a, Class31 a, String a, boolean a) {
      return this.Method3322("visitInsnAnnotation", a, a, a, a);
   }

   public void Method3288(Class264 a, Class264 a, Class264 a, String a) {
      this.Field3579.setLength(0);
      this.Method3330(a);
      this.Method3330(a);
      this.Method3330(a);
      this.Field3579.append(this.Field3591).append(".visitTryCatchBlock(");
      this.Method3331(a);
      this.Field3579.append(", ");
      this.Method3331(a);
      this.Field3579.append(", ");
      this.Method3331(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class803 Method3319(int a, Class31 a, String a, boolean a) {
      return this.Method3322("visitTryCatchAnnotation", a, a, a, a);
   }

   public void Method3290(String a, String a, String a, Class264 a, Class264 a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitLocalVariable(");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3326(a);
      this.Field3579.append(", ");
      this.Method3331(a);
      this.Field3579.append(", ");
      this.Method3331(a);
      this.Field3579.append(", ").append(a).append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class801 Method3291(int a, Class31 a, Class264[] a, Class264[] a, int[] a, String a, boolean a) {
      this.Field3579.setLength(0);
      this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitLocalVariableAnnotation(");
      this.Field3579.append(a);
      this.Field3579.append(", TypePath.fromString(\"").append(a).append("\"), ");
      this.Field3579.append("new Label[] {");

      int a;
      for(a = 0; a < a.length; ++a) {
         this.Field3579.append(" ");
         this.Method3331(a[a]);
      }

      this.Field3579.append(" }, new Label[] {");

      for(a = 0; a < a.length; ++a) {
         this.Field3579.append(" ");
         this.Method3331(a[a]);
      }

      this.Field3579.append(" }, new int[] {");

      for(a = 0; a < a.length; ++a) {
         this.Field3579.append(" ").append(a[a]);
      }

      this.Field3579.append(" }, ");
      this.Method3326(a);
      this.Field3579.append(", ").append(a).append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
      Class803 a = this.Method3324("av", 0);
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530("}\n");
      return a;
   }

   public void Method3292(int a, Class264 a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitLineNumber(").append(a).append(", ");
      this.Method3331(a);
      this.Field3579.append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3293(int a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitMaxs(").append(a).append(", ").append(a).append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3294() {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3591).append(".visitEnd();\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class803 Method3320(String a, boolean a) {
      this.Field3579.setLength(0);
      this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".visitAnnotation(");
      this.Method3326(a);
      this.Field3579.append(", ").append(a).append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
      Class803 a = this.Method3324("av", 0);
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530("}\n");
      return a;
   }

   public Class803 Method3321(int a, Class31 a, String a, boolean a) {
      return this.Method3322("visitTypeAnnotation", a, a, a, a);
   }

   public Class803 Method3322(String a, int a, Class31 a, String a, boolean a) {
      this.Field3579.setLength(0);
      this.Field3579.append("{\n").append("av0 = ").append(this.Field3591).append(".").append(a).append("(");
      this.Field3579.append(a);
      this.Field3579.append(", TypePath.fromString(\"").append(a).append("\"), ");
      this.Method3326(a);
      this.Field3579.append(", ").append(a).append(");\n");
      this.Field3580.Method2530(this.Field3579.toString());
      Class803 a = this.Method3324("av", 0);
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530("}\n");
      return a;
   }

   public void Method3323(Class136 a) {
      this.Field3579.setLength(0);
      this.Field3579.append("// ATTRIBUTE ").append(a.Field987).append('\n');
      if (a instanceof Class799) {
         if (this.Field3593 == null) {
            this.Field3593 = new HashMap();
         }

         this.Field3579.append("{\n");
         ((Class799)a).Method830(this.Field3579, "attr", this.Field3593);
         this.Field3579.append(this.Field3591).append(".visitAttribute(attr);\n");
         this.Field3579.append("}\n");
      }

      this.Field3580.Method2530(this.Field3579.toString());
   }

   protected Class803 Method3324(String a, int a) {
      return new Class803(327680, a, a);
   }

   void Method3325(int a) {
      boolean a = true;
      if ((a & 1) != 0) {
         this.Field3579.append("ACC_PUBLIC");
         a = false;
      }

      if ((a & 2) != 0) {
         this.Field3579.append("ACC_PRIVATE");
         a = false;
      }

      if ((a & 4) != 0) {
         this.Field3579.append("ACC_PROTECTED");
         a = false;
      }

      if ((a & 16) != 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_FINAL");
         a = false;
      }

      if ((a & 8) != 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_STATIC");
         a = false;
      }

      if ((a & 32) != 0) {
         this.Field3579.append(" + ");
         if ((a & 262144) == 0) {
            this.Field3579.append("ACC_SYNCHRONIZED");
         } else {
            this.Field3579.append("ACC_SUPER");
         }

         a = false;
      }

      if ((a & 64) != 0 && (a & 524288) != 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_VOLATILE");
         a = false;
      }

      if ((a & 64) != 0 && (a & 262144) == 0 && (a & 524288) == 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_BRIDGE");
         a = false;
      }

      if ((a & 128) != 0 && (a & 262144) == 0 && (a & 524288) == 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_VARARGS");
         a = false;
      }

      if ((a & 128) != 0 && (a & 524288) != 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_TRANSIENT");
         a = false;
      }

      if ((a & 256) != 0 && (a & 262144) == 0 && (a & 524288) == 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_NATIVE");
         a = false;
      }

      if ((a & 16384) != 0 && ((a & 262144) != 0 || (a & 524288) != 0 || (a & 1048576) != 0)) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_ENUM");
         a = false;
      }

      if ((a & 8192) != 0 && ((a & 262144) != 0 || (a & 1048576) != 0)) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_ANNOTATION");
         a = false;
      }

      if ((a & 1024) != 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_ABSTRACT");
         a = false;
      }

      if ((a & 512) != 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_INTERFACE");
         a = false;
      }

      if ((a & 2048) != 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_STRICT");
         a = false;
      }

      if ((a & 4096) != 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_SYNTHETIC");
         a = false;
      }

      if ((a & 131072) != 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_DEPRECATED");
         a = false;
      }

      if ((a & '耀') != 0) {
         this.Field3579.append(" + ");
         this.Field3579.append("ACC_MANDATED");
         a = false;
      }

      this.Field3579.append('0');
   }

   protected void Method3326(Object a) {
      Method3327(this.Field3579, a);
   }

   static void Method3327(StringBuffer a, Object a) {
      a[] a = Class801.Method3300();
      a.append("null");
      if (a instanceof String) {
         Method3297(a, (String)a);
      }

      if (a instanceof b) {
         a.append("Type.getType(\"");
         a.append(((b)a).Method3225());
         a.append("\")");
      }

      if (a instanceof Class279) {
         a.append("new Handle(");
         Class279 a = (Class279)a;
         a.append("Opcodes.").append(Field3577[a.Method2820()]).append(", \"");
         a.append(a.Method2821()).append("\", \"");
         a.append(a.Method2822()).append("\", \"");
         a.append(a.Method2823()).append("\")");
      }

      if (a instanceof Byte) {
         a.append("new Byte((byte)").append(a).append(')');
      }

      if (a instanceof Boolean) {
         a.append((Boolean)a ? "Boolean.TRUE" : "Boolean.FALSE");
      }

      if (a instanceof Short) {
         a.append("new Short((short)").append(a).append(')');
      }

      if (a instanceof Character) {
         int a = (Character)a;
         a.append("new Character((char)").append(a).append(')');
      }

      if (a instanceof Integer) {
         a.append("new Integer(").append(a).append(')');
      }

      if (a instanceof Float) {
         a.append("new Float(\"").append(a).append("\")");
      }

      if (a instanceof Long) {
         a.append("new Long(").append(a).append("L)");
      }

      if (a instanceof Double) {
         a.append("new Double(\"").append(a).append("\")");
      }

      int a;
      if (a instanceof byte[]) {
         byte[] a = (byte[])((byte[])a);
         a.append("new byte[] {");
         a = 0;
         if (a < a.length) {
            a.append("").append(a[a]);
            ++a;
         }

         a.append('}');
      }

      byte a;
      if (a instanceof boolean[]) {
         boolean[] a = (boolean[])((boolean[])a);
         a.append("new boolean[] {");
         a = 0;
         if (a < a.length) {
            a.append("").append(a[a]);
            a = a + 1;
         }

         a.append('}');
      }

      if (a instanceof short[]) {
         short[] a = (short[])((short[])a);
         a.append("new short[] {");
         a = 0;
         if (a < a.length) {
            a.append("").append("(short)").append(a[a]);
            a = a + 1;
         }

         a.append('}');
      }

      if (a instanceof char[]) {
         char[] a = (char[])((char[])a);
         a.append("new char[] {");
         a = 0;
         if (a < a.length) {
            a.append("").append("(char)").append(a[a]);
            a = a + 1;
         }

         a.append('}');
      }

      if (a instanceof int[]) {
         int[] a = (int[])((int[])a);
         a.append("new int[] {");
         a = 0;
         if (a < a.length) {
            a.append("").append(a[a]);
            a = a + 1;
         }

         a.append('}');
      }

      if (a instanceof long[]) {
         long[] a = (long[])((long[])a);
         a.append("new long[] {");
         a = 0;
         if (a < a.length) {
            a.append("").append(a[a]).append('L');
            a = a + 1;
         }

         a.append('}');
      }

      if (a instanceof float[]) {
         float[] a = (float[])((float[])a);
         a.append("new float[] {");
         a = 0;
         if (a < a.length) {
            a.append("").append(a[a]).append('f');
            a = a + 1;
         }

         a.append('}');
      }

      if (a instanceof double[]) {
         double[] a = (double[])((double[])a);
         a.append("new double[] {");
         a = 0;
         if (a < a.length) {
            a.append("").append(a[a]).append('d');
            a = a + 1;
         }

         a.append('}');
      }

   }

   private void Method3328(int a, Object[] a) {
      for(int a = 0; a < a; ++a) {
         if (a[a] instanceof Class264) {
            this.Method3330((Class264)a[a]);
         }
      }

   }

   private void Method3329(int a, Object[] a) {
      for(int a = 0; a < a; ++a) {
         this.Field3579.append(", ");
         if (a[a] instanceof String) {
            this.Method3326(a[a]);
         } else if (a[a] instanceof Integer) {
            switch ((Integer)a[a]) {
               case 0:
                  this.Field3579.append("Opcodes.TOP");
                  break;
               case 1:
                  this.Field3579.append("Opcodes.INTEGER");
                  break;
               case 2:
                  this.Field3579.append("Opcodes.FLOAT");
                  break;
               case 3:
                  this.Field3579.append("Opcodes.DOUBLE");
                  break;
               case 4:
                  this.Field3579.append("Opcodes.LONG");
                  break;
               case 5:
                  this.Field3579.append("Opcodes.NULL");
                  break;
               case 6:
                  this.Field3579.append("Opcodes.UNINITIALIZED_THIS");
            }
         } else {
            this.Method3331((Class264)a[a]);
         }
      }

   }

   protected void Method3330(Class264 a) {
      if (this.Field3593 == null) {
         this.Field3593 = new HashMap();
      }

      String a = (String)this.Field3593.Method2665(a);
      a = "l" + this.Field3593.Method1799();
      this.Field3593.put(a, a);
      this.Field3579.append("Label ").append(a).append(" = new Label();\n");
   }

   protected void Method3331(Class264 a) {
      this.Field3579.append((String)this.Field3593.Method2665(a));
   }

   public Class801 Method3289(int integer, Class31 class31, String string, boolean boolean4) {
      return this.Method3319(integer, class31, string, boolean4);
   }

   public Class801 Method3287(int integer, Class31 class31, String string, boolean boolean4) {
      return this.Method3318(integer, class31, string, boolean4);
   }

   public Class801 Method3268(int integer, String string, boolean boolean3) {
      return this.Method3316(integer, string, boolean3);
   }

   public Class801 Method3267(int integer, Class31 class31, String string, boolean boolean4) {
      return this.Method3315(integer, class31, string, boolean4);
   }

   public Class801 Method3266(String string, boolean boolean2) {
      return this.Method3314(string, boolean2);
   }

   public Class801 Method3265() {
      return this.Method3313();
   }

   public Class801 Method3261(int integer, Class31 class31, String string, boolean boolean4) {
      return this.Method3312(integer, class31, string, boolean4);
   }

   public Class801 Method3260(String string, boolean boolean2) {
      return this.Method3311(string, boolean2);
   }

   public Class801 Method3258(String string) {
      return this.Method3310(string);
   }

   public Class801 Method3257(String string1, String string2) {
      return this.Method3309(string1, string2);
   }

   public Class801 Method3253(int integer, String string2, String string3, String string4, String[] arr) {
      return this.Method3308(integer, string2, string3, string4, arr);
   }

   public Class801 Method3252(int integer, String string2, String string3, String string4, Object object) {
      return this.Method3307(integer, string2, string3, string4, object);
   }

   public Class801 Method3249(int integer, Class31 class31, String string, boolean boolean4) {
      return this.Method3306(integer, class31, string, boolean4);
   }

   public Class801 Method3248(String string, boolean boolean2) {
      return this.Method3305(string, boolean2);
   }

   private static Exception Method3332(Exception exception) {
      return exception;
   }
}
