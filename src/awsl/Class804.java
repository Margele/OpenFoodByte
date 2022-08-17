package awsl;

import java.util.HashMap;
import java.util.Map;
import obfuscate.b;

public class Class804 extends Class801 {
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
   protected String Field3607;
   protected String Field3608;
   protected String Field3609;
   protected String Field3610;
   protected Map Field3611;
   private int Field3612;
   private int Field3613;

   public Class804() {
      this(327680);
      if (this.getClass() != Class804.class) {
         throw new IllegalStateException();
      }
   }

   protected Class804(int a) {
      super(a);
      this.Field3607 = "  ";
      this.Field3608 = "    ";
      this.Field3609 = "      ";
      this.Field3610 = "   ";
      this.Field3613 = 0;
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

      System.err.println("Prints a disassembled view of the given class.");
      System.err.println("Usage: Textifier [-debug] <fully qualified class name or class file name>");
   }

   public void Method3245(int a, int a, String a, String a, String a, String[] a) {
      this.Field3612 = a;
      int a = a & '\uffff';
      int a = a >>> 16;
      this.Field3579.setLength(0);
      this.Field3579.append("// class version ").append(a).append('.').append(a).append(" (").append(a).append(")\n");
      if ((a & 131072) != 0) {
         this.Field3579.append("// DEPRECATED\n");
      }

      this.Field3579.append("// access flags 0x").append(Integer.toHexString(a).toUpperCase()).append('\n');
      this.Method3354(5, a);
      Class90 a = new Class90(a);
      Class79 a = new Class79(a);
      a.Method3748(a);
      this.Field3579.append("// declaration: ").append(a).append(a.Method3626()).append('\n');
      this.Method3356(a & -33);
      if ((a & 8192) != 0) {
         this.Field3579.append("@interface ");
      } else if ((a & 512) != 0) {
         this.Field3579.append("interface ");
      } else if ((a & 16384) == 0) {
         this.Field3579.append("class ");
      }

      this.Method3354(0, a);
      if (!"java/lang/Object".equals(a)) {
         this.Field3579.append(" extends ");
         this.Method3354(0, a);
         this.Field3579.append(' ');
      }

      if (a.length > 0) {
         this.Field3579.append(" implements ");

         for(int a = 0; a < a.length; ++a) {
            this.Method3354(0, a[a]);
            this.Field3579.append(' ');
         }
      }

      this.Field3579.append(" {\n\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3246(String a, String a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3607).append("// compiled from: ").append(a).append('\n');
      this.Field3579.append(this.Field3607).append("// debug info: ").append(a).append('\n');
      if (this.Field3579.length() > 0) {
         this.Field3580.Method2530(this.Field3579.toString());
      }

   }

   public void Method3247(String a, String a, String a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3607).append("OUTERCLASS ");
      this.Method3354(0, a);
      this.Field3579.append(' ');
      this.Field3579.append(a).append(' ');
      this.Method3354(3, a);
      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class804 Method3333(String a, boolean a) {
      this.Field3580.Method2530("\n");
      return this.Method3351(a, a);
   }

   public Class801 Method3249(int a, Class31 a, String a, boolean a) {
      this.Field3580.Method2530("\n");
      return this.Method3352(a, a, a, a);
   }

   public void Method3250(Class136 a) {
      this.Field3580.Method2530("\n");
      this.Method3323(a);
   }

   public void Method3251(String a, String a, String a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3607).append("// access flags 0x");
      this.Field3579.append(Integer.toHexString(a & -33).toUpperCase()).append('\n');
      this.Field3579.append(this.Field3607);
      this.Method3356(a);
      this.Field3579.append("INNERCLASS ");
      this.Method3354(0, a);
      this.Field3579.append(' ');
      this.Method3354(0, a);
      this.Field3579.append(' ');
      this.Method3354(0, a);
      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class804 Method3334(int a, String a, String a, String a, Object a) {
      this.Field3579.setLength(0);
      this.Field3579.append('\n');
      if ((a & 131072) != 0) {
         this.Field3579.append(this.Field3607).append("// DEPRECATED\n");
      }

      this.Field3579.append(this.Field3607).append("// access flags 0x").append(Integer.toHexString(a).toUpperCase()).append('\n');
      this.Field3579.append(this.Field3607);
      this.Method3354(2, a);
      Class90 a = new Class90(0);
      Class79 a = new Class79(a);
      a.Method3749(a);
      this.Field3579.append(this.Field3607).append("// declaration: ").append(a.Method3626()).append('\n');
      this.Field3579.append(this.Field3607);
      this.Method3356(a);
      this.Method3354(1, a);
      this.Field3579.append(' ').append(a);
      this.Field3579.append(" = ");
      if (a instanceof String) {
         this.Field3579.append('"').append(a).append('"');
      } else {
         this.Field3579.append(a);
      }

      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
      Class804 a = this.Method3353();
      this.Field3580.Method2530(a.Method3295());
      return a;
   }

   public Class804 Method3335(int a, String a, String a, String a, String[] a) {
      this.Field3579.setLength(0);
      this.Field3579.append('\n');
      if ((a & 131072) != 0) {
         this.Field3579.append(this.Field3607).append("// DEPRECATED\n");
      }

      this.Field3579.append(this.Field3607).append("// access flags 0x").append(Integer.toHexString(a).toUpperCase()).append('\n');
      this.Field3579.append(this.Field3607);
      this.Method3354(4, a);
      Class90 a = new Class90(0);
      Class79 a = new Class79(a);
      a.Method3748(a);
      String a = a.Method3626();
      String a = a.Method3627();
      String a = a.Method3628();
      this.Field3579.append(this.Field3607).append("// declaration: ").append(a).append(' ').append(a).append(a);
      this.Field3579.append(" throws ").append(a);
      this.Field3579.append('\n');
      this.Field3579.append(this.Field3607);
      this.Method3356(a & -65);
      if ((a & 256) != 0) {
         this.Field3579.append("native ");
      }

      if ((a & 128) != 0) {
         this.Field3579.append("varargs ");
      }

      if ((a & 64) != 0) {
         this.Field3579.append("bridge ");
      }

      if ((this.Field3612 & 512) != 0 && (a & 1024) == 0 && (a & 8) == 0) {
         this.Field3579.append("default ");
      }

      this.Field3579.append(a);
      this.Method3354(3, a);
      if (a.length > 0) {
         this.Field3579.append(" throws ");

         for(int a = 0; a < a.length; ++a) {
            this.Method3354(0, a[a]);
            this.Field3579.append(' ');
         }
      }

      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
      Class804 a = this.Method3353();
      this.Field3580.Method2530(a.Method3295());
      return a;
   }

   public void Method3254() {
      this.Field3580.Method2530("}\n");
   }

   public void Method3255(String a, Object a) {
      this.Field3579.setLength(0);
      this.Method3357(this.Field3613++);
      this.Field3579.append(a).append('=');
      if (a instanceof String) {
         this.Method3343((String)a);
      } else if (a instanceof b) {
         this.Method3344((b)a);
      } else if (a instanceof Byte) {
         this.Method3341((Byte)a);
      } else if (a instanceof Boolean) {
         this.Method3342((Boolean)a);
      } else if (a instanceof Short) {
         this.Method3340((Short)a);
      } else if (a instanceof Character) {
         this.Method3339((Character)a);
      } else if (a instanceof Integer) {
         this.Method3325((Integer)a);
      } else if (a instanceof Float) {
         this.Method3337((Float)a);
      } else if (a instanceof Long) {
         this.Method3336((Long)a);
      } else if (a instanceof Double) {
         this.Method3338((Double)a);
      } else if (a.getClass().isArray()) {
         this.Field3579.append('{');
         int a;
         if (a instanceof byte[]) {
            byte[] a = (byte[])((byte[])a);

            for(a = 0; a < a.length; ++a) {
               this.Method3357(a);
               this.Method3341(a[a]);
            }
         } else if (a instanceof boolean[]) {
            boolean[] a = (boolean[])((boolean[])a);

            for(a = 0; a < a.length; ++a) {
               this.Method3357(a);
               this.Method3342(a[a]);
            }
         } else if (a instanceof short[]) {
            short[] a = (short[])((short[])a);

            for(a = 0; a < a.length; ++a) {
               this.Method3357(a);
               this.Method3340(a[a]);
            }
         } else if (a instanceof char[]) {
            char[] a = (char[])((char[])a);

            for(a = 0; a < a.length; ++a) {
               this.Method3357(a);
               this.Method3339(a[a]);
            }
         } else if (a instanceof int[]) {
            int[] a = (int[])((int[])a);

            for(a = 0; a < a.length; ++a) {
               this.Method3357(a);
               this.Method3325(a[a]);
            }
         } else if (a instanceof long[]) {
            long[] a = (long[])((long[])a);

            for(a = 0; a < a.length; ++a) {
               this.Method3357(a);
               this.Method3336(a[a]);
            }
         } else if (a instanceof float[]) {
            float[] a = (float[])((float[])a);

            for(a = 0; a < a.length; ++a) {
               this.Method3357(a);
               this.Method3337(a[a]);
            }
         } else if (a instanceof double[]) {
            double[] a = (double[])((double[])a);

            for(a = 0; a < a.length; ++a) {
               this.Method3357(a);
               this.Method3338(a[a]);
            }
         }

         this.Field3579.append('}');
      }

      this.Field3580.Method2530(this.Field3579.toString());
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
      this.Field3579.append("(char)").append(a);
   }

   private void Method3340(short a) {
      this.Field3579.append("(short)").append(a);
   }

   private void Method3341(byte a) {
      this.Field3579.append("(byte)").append(a);
   }

   private void Method3342(boolean a) {
      this.Field3579.append(a);
   }

   private void Method3343(String a) {
      Method3297(this.Field3579, a);
   }

   private void Method3344(b a) {
      this.Field3579.append(a.Method3220()).append(".class");
   }

   public void Method3256(String a, String a, String a) {
      this.Field3579.setLength(0);
      this.Method3357(this.Field3613++);
      this.Field3579.append(a).append('=');
      this.Method3354(1, a);
      this.Field3579.append('.').append(a);
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class804 Method3345(String a, String a) {
      this.Field3579.setLength(0);
      this.Method3357(this.Field3613++);
      this.Field3579.append(a).append('=');
      this.Field3579.append('@');
      this.Method3354(1, a);
      this.Field3579.append('(');
      this.Field3580.Method2530(this.Field3579.toString());
      Class804 a = this.Method3353();
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530(")");
      return a;
   }

   public Class804 Method3346(String a) {
      this.Field3579.setLength(0);
      this.Method3357(this.Field3613++);
      this.Field3579.append(a).append('=');
      this.Field3579.append('{');
      this.Field3580.Method2530(this.Field3579.toString());
      Class804 a = this.Method3353();
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530("}");
      return a;
   }

   public void Method3259() {
   }

   public Class804 Method3347(String a, boolean a) {
      return this.Method3351(a, a);
   }

   public Class801 Method3261(int a, Class31 a, String a, boolean a) {
      return this.Method3352(a, a, a, a);
   }

   public void Method3262(Class136 a) {
      this.Method3323(a);
   }

   public void Method3263() {
   }

   public void Method3264(String a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("// parameter ");
      this.Method3356(a);
      this.Field3579.append(' ').append("<no name>").append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class804 Method3348() {
      this.Field3580.Method2530(this.Field3608 + "default=");
      Class804 a = this.Method3353();
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530("\n");
      return a;
   }

   public Class804 Method3349(String a, boolean a) {
      return this.Method3351(a, a);
   }

   public Class801 Method3267(int a, Class31 a, String a, boolean a) {
      return this.Method3352(a, a, a, a);
   }

   public Class804 Method3350(int a, String a, boolean a2) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append('@');
      this.Method3354(1, a);
      this.Field3579.append('(');
      this.Field3580.Method2530(this.Field3579.toString());
      Class804 a = this.Method3353();
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530(") // parameter ");
      this.Field3580.Method2530(new Integer(a));
      this.Field3580.Method2530("\n");
      return a;
   }

   public void Method3269(Class136 a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3607).append("ATTRIBUTE ");
      this.Method3354(-1, a.Field987);
      if (a instanceof Class806) {
         ((Class806)a).Method3359(this.Field3579, this.Field3611);
      } else {
         this.Field3579.append(" : unknown\n");
      }

      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3270() {
   }

   public void Method3271(int a, int a, Object[] a, int a, Object[] a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3610);
      this.Field3579.append("FRAME ");
      switch (a) {
         case -1:
         case 0:
            this.Field3579.append("FULL [");
            this.Method3328(a, a);
            this.Field3579.append("] [");
            this.Method3328(a, a);
            this.Field3579.append(']');
            break;
         case 1:
            this.Field3579.append("APPEND [");
            this.Method3328(a, a);
            this.Field3579.append(']');
            break;
         case 2:
            this.Field3579.append("CHOP ").append(a);
            break;
         case 3:
            this.Field3579.append("SAME");
            break;
         case 4:
            this.Field3579.append("SAME1 ");
            this.Method3328(1, a);
      }

      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3272(int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append(Field3575[a]).append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3273(int a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ').append(a == 188 ? Field3576[a] : Integer.toString(a)).append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3274(int a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ').append(a).append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3275(int a, String a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ');
      this.Method3354(0, a);
      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3276(int a, String a, String a, String a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ');
      this.Method3354(0, a);
      this.Field3579.append('.').append(a).append(" : ");
      this.Method3354(1, a);
      this.Field3579.append('\n');
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
      this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ');
      this.Method3354(0, a);
      this.Field3579.append('.').append(a).append(' ');
      this.Method3354(3, a);
      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3279(String a, String a, Class279 a, Object[] a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("INVOKEDYNAMIC").append(' ');
      this.Field3579.append(a);
      this.Method3354(3, a);
      this.Field3579.append(" [");
      this.Field3579.append('\n');
      this.Field3579.append(this.Field3609);
      this.Method3355(a);
      this.Field3579.append('\n');
      this.Field3579.append(this.Field3609).append("// arguments:");
      if (a.length == 0) {
         this.Field3579.append(" none");
      } else {
         this.Field3579.append('\n');

         for(int a = 0; a < a.length; ++a) {
            this.Field3579.append(this.Field3609);
            Object a = a[a];
            if (a instanceof String) {
               Class801.Method3297(this.Field3579, (String)a);
            } else if (a instanceof b) {
               b a = (b)a;
               if (a.Method3217() == 11) {
                  this.Method3354(3, a.Method3225());
               } else {
                  this.Field3579.append(a.Method3225()).append(".class");
               }
            } else if (a instanceof Class279) {
               this.Method3355((Class279)a);
            } else {
               this.Field3579.append(a);
            }

            this.Field3579.append(", \n");
         }

         this.Field3579.setLength(this.Field3579.length() - 3);
      }

      this.Field3579.append('\n');
      this.Field3579.append(this.Field3608).append("]\n");
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3280(int a, Class264 a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append(Field3575[a]).append(' ');
      this.Method3330(a);
      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3281(Class264 a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3610);
      this.Method3330(a);
      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3282(Object a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("LDC ");
      if (a instanceof String) {
         Class801.Method3297(this.Field3579, (String)a);
      } else if (a instanceof b) {
         this.Field3579.append(((b)a).Method3225()).append(".class");
      } else {
         this.Field3579.append(a);
      }

      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3283(int a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("IINC ").append(a).append(' ').append(a).append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3284(int a, int a1, Class264 a, Class264[] a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("TABLESWITCH\n");

      for(int a = 0; a < a.length; ++a) {
         this.Field3579.append(this.Field3609).append(a + a).append(": ");
         this.Method3330(a[a]);
         this.Field3579.append('\n');
      }

      this.Field3579.append(this.Field3609).append("default: ");
      this.Method3330(a);
      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3285(Class264 a, int[] a, Class264[] a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("LOOKUPSWITCH\n");

      for(int a = 0; a < a.length; ++a) {
         this.Field3579.append(this.Field3609).append(a[a]).append(": ");
         this.Method3330(a[a]);
         this.Field3579.append('\n');
      }

      this.Field3579.append(this.Field3609).append("default: ");
      this.Method3330(a);
      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3286(String a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("MULTIANEWARRAY ");
      this.Method3354(1, a);
      this.Field3579.append(' ').append(a).append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class801 Method3287(int a, Class31 a, String a, boolean a) {
      return this.Method3352(a, a, a, a);
   }

   public void Method3288(Class264 a, Class264 a, Class264 a, String a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("TRYCATCHBLOCK ");
      this.Method3330(a);
      this.Field3579.append(' ');
      this.Method3330(a);
      this.Field3579.append(' ');
      this.Method3330(a);
      this.Field3579.append(' ');
      this.Method3354(0, a);
      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class801 Method3289(int a, Class31 a, String a, boolean a3) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("TRYCATCHBLOCK @");
      this.Method3354(1, a);
      this.Field3579.append('(');
      this.Field3580.Method2530(this.Field3579.toString());
      Class804 a = this.Method3353();
      this.Field3580.Method2530(a.Method3295());
      this.Field3579.setLength(0);
      this.Field3579.append(") : ");
      this.Method3358(a);
      this.Field3579.append(", ").append(a);
      this.Field3579.append("\n");
      this.Field3580.Method2530(this.Field3579.toString());
      return a;
   }

   public void Method3290(String a, String a, String a, Class264 a, Class264 a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("LOCALVARIABLE ").append(a).append(' ');
      this.Method3354(1, a);
      this.Field3579.append(' ');
      this.Method3330(a);
      this.Field3579.append(' ');
      this.Method3330(a);
      this.Field3579.append(' ').append(a).append('\n');
      this.Field3579.append(this.Field3608);
      this.Method3354(2, a);
      Class90 a = new Class90(0);
      Class79 a = new Class79(a);
      a.Method3749(a);
      this.Field3579.append(this.Field3608).append("// declaration: ").append(a.Method3626()).append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public Class801 Method3291(int a, Class31 a, Class264[] a, Class264[] a, int[] a, String a, boolean a6) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("LOCALVARIABLE @");
      this.Method3354(1, a);
      this.Field3579.append('(');
      this.Field3580.Method2530(this.Field3579.toString());
      Class804 a = this.Method3353();
      this.Field3580.Method2530(a.Method3295());
      this.Field3579.setLength(0);
      this.Field3579.append(") : ");
      this.Method3358(a);
      this.Field3579.append(", ").append(a);

      for(int a = 0; a < a.length; ++a) {
         this.Field3579.append(" [ ");
         this.Method3330(a[a]);
         this.Field3579.append(" - ");
         this.Method3330(a[a]);
         this.Field3579.append(" - ").append(a[a]).append(" ]");
      }

      this.Field3579.append("\n");
      this.Field3580.Method2530(this.Field3579.toString());
      return a;
   }

   public void Method3292(int a, Class264 a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("LINENUMBER ").append(a).append(' ');
      this.Method3330(a);
      this.Field3579.append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3293(int a, int a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("MAXSTACK = ").append(a).append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3608).append("MAXLOCALS = ").append(a).append('\n');
      this.Field3580.Method2530(this.Field3579.toString());
   }

   public void Method3294() {
   }

   public Class804 Method3351(String a, boolean a1) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3607).append('@');
      this.Method3354(1, a);
      this.Field3579.append('(');
      this.Field3580.Method2530(this.Field3579.toString());
      Class804 a = this.Method3353();
      this.Field3580.Method2530(a.Method3295());
      this.Field3580.Method2530(")\n");
      return a;
   }

   public Class804 Method3352(int a, Class31 a, String a, boolean a3) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3607).append('@');
      this.Method3354(1, a);
      this.Field3579.append('(');
      this.Field3580.Method2530(this.Field3579.toString());
      Class804 a = this.Method3353();
      this.Field3580.Method2530(a.Method3295());
      this.Field3579.setLength(0);
      this.Field3579.append(") : ");
      this.Method3358(a);
      this.Field3579.append(", ").append(a);
      this.Field3579.append("\n");
      this.Field3580.Method2530(this.Field3579.toString());
      return a;
   }

   public void Method3323(Class136 a) {
      this.Field3579.setLength(0);
      this.Field3579.append(this.Field3607).append("ATTRIBUTE ");
      this.Method3354(-1, a.Field987);
      if (a instanceof Class806) {
         ((Class806)a).Method3359(this.Field3579, (Map)null);
      } else {
         this.Field3579.append(" : unknown\n");
      }

      this.Field3580.Method2530(this.Field3579.toString());
   }

   protected Class804 Method3353() {
      return new Class804();
   }

   protected void Method3354(int a, String a) {
      if (a != 5 && a != 2 && a != 4) {
         this.Field3579.append(a);
      } else {
         this.Field3579.append("// signature ").append(a).append('\n');
      }

   }

   protected void Method3330(Class264 a) {
      if (this.Field3611 == null) {
         this.Field3611 = new HashMap();
      }

      String a = (String)this.Field3611.Method2665(a);
      a = "L" + this.Field3611.Method1799();
      this.Field3611.put(a, a);
      this.Field3579.append(a);
   }

   protected void Method3355(Class279 a) {
      int a = a.Method2820();
      this.Field3579.append("// handle kind 0x").append(Integer.toHexString(a)).append(" : ");
      boolean a = false;
      switch (a) {
         case 1:
            this.Field3579.append("GETFIELD");
            break;
         case 2:
            this.Field3579.append("GETSTATIC");
            break;
         case 3:
            this.Field3579.append("PUTFIELD");
            break;
         case 4:
            this.Field3579.append("PUTSTATIC");
            break;
         case 5:
            this.Field3579.append("INVOKEVIRTUAL");
            a = true;
            break;
         case 6:
            this.Field3579.append("INVOKESTATIC");
            a = true;
            break;
         case 7:
            this.Field3579.append("INVOKESPECIAL");
            a = true;
            break;
         case 8:
            this.Field3579.append("NEWINVOKESPECIAL");
            a = true;
            break;
         case 9:
            this.Field3579.append("INVOKEINTERFACE");
            a = true;
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
      if ((a & 1) != 0) {
         this.Field3579.append("public ");
      }

      if ((a & 2) != 0) {
         this.Field3579.append("private ");
      }

      if ((a & 4) != 0) {
         this.Field3579.append("protected ");
      }

      if ((a & 16) != 0) {
         this.Field3579.append("final ");
      }

      if ((a & 8) != 0) {
         this.Field3579.append("static ");
      }

      if ((a & 32) != 0) {
         this.Field3579.append("synchronized ");
      }

      if ((a & 64) != 0) {
         this.Field3579.append("volatile ");
      }

      if ((a & 128) != 0) {
         this.Field3579.append("transient ");
      }

      if ((a & 1024) != 0) {
         this.Field3579.append("abstract ");
      }

      if ((a & 2048) != 0) {
         this.Field3579.append("strictfp ");
      }

      if ((a & 4096) != 0) {
         this.Field3579.append("synthetic ");
      }

      if ((a & '耀') != 0) {
         this.Field3579.append("mandated ");
      }

      if ((a & 16384) != 0) {
         this.Field3579.append("enum ");
      }

   }

   private void Method3357(int a) {
      this.Field3579.append(", ");
   }

   private void Method3358(int a) {
      Class801.Method3300();
      Class33 a = new Class33(a);
      switch (a.Method3408()) {
         case 0:
            this.Field3579.append("CLASS_TYPE_PARAMETER ").append(a.Method3409());
         case 1:
            this.Field3579.append("METHOD_TYPE_PARAMETER ").append(a.Method3409());
         case 16:
            this.Field3579.append("CLASS_EXTENDS ").append(a.Method3411());
         case 17:
            this.Field3579.append("CLASS_TYPE_PARAMETER_BOUND ").append(a.Method3409()).append(", ").append(a.Method3410());
         case 18:
            this.Field3579.append("METHOD_TYPE_PARAMETER_BOUND ").append(a.Method3409()).append(", ").append(a.Method3410());
         case 19:
            this.Field3579.append("FIELD");
         case 20:
            this.Field3579.append("METHOD_RETURN");
         case 21:
            this.Field3579.append("METHOD_RECEIVER");
         case 22:
            this.Field3579.append("METHOD_FORMAL_PARAMETER ").append(a.Method3412());
         case 23:
            this.Field3579.append("THROWS ").append(a.Method3413());
         case 64:
            this.Field3579.append("LOCAL_VARIABLE");
         case 65:
            this.Field3579.append("RESOURCE_VARIABLE");
         case 66:
            this.Field3579.append("EXCEPTION_PARAMETER ").append(a.Method3414());
         case 67:
            this.Field3579.append("INSTANCEOF");
         case 68:
            this.Field3579.append("NEW");
         case 69:
            this.Field3579.append("CONSTRUCTOR_REFERENCE");
         case 70:
            this.Field3579.append("METHOD_REFERENCE");
         case 71:
            this.Field3579.append("CAST ").append(a.Method3415());
         case 72:
            this.Field3579.append("CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT ").append(a.Method3415());
         case 73:
            this.Field3579.append("METHOD_INVOCATION_TYPE_ARGUMENT ").append(a.Method3415());
         case 74:
            this.Field3579.append("CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT ").append(a.Method3415());
         case 75:
            this.Field3579.append("METHOD_REFERENCE_TYPE_ARGUMENT ").append(a.Method3415());
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         default:
      }
   }

   private void Method3328(int a, Object[] a) {
      for(int a = 0; a < a; ++a) {
         this.Field3579.append(' ');
         if (a[a] instanceof String) {
            String a = (String)a[a];
            if (a.startsWith("[")) {
               this.Method3354(1, a);
            } else {
               this.Method3354(0, a);
            }
         } else if (a[a] instanceof Integer) {
            switch ((Integer)a[a]) {
               case 0:
                  this.Method3354(1, "T");
                  break;
               case 1:
                  this.Method3354(1, "I");
                  break;
               case 2:
                  this.Method3354(1, "F");
                  break;
               case 3:
                  this.Method3354(1, "D");
                  break;
               case 4:
                  this.Method3354(1, "J");
                  break;
               case 5:
                  this.Method3354(1, "N");
                  break;
               case 6:
                  this.Method3354(1, "U");
            }
         } else {
            this.Method3330((Class264)a[a]);
         }
      }

   }

   public Class801 Method3268(int integer, String string, boolean boolean3) {
      return this.Method3350(integer, string, boolean3);
   }

   public Class801 Method3266(String string, boolean boolean2) {
      return this.Method3349(string, boolean2);
   }

   public Class801 Method3265() {
      return this.Method3348();
   }

   public Class801 Method3260(String string, boolean boolean2) {
      return this.Method3347(string, boolean2);
   }

   public Class801 Method3258(String string) {
      return this.Method3346(string);
   }

   public Class801 Method3257(String string1, String string2) {
      return this.Method3345(string1, string2);
   }

   public Class801 Method3253(int integer, String string2, String string3, String string4, String[] arr) {
      return this.Method3335(integer, string2, string3, string4, arr);
   }

   public Class801 Method3252(int integer, String string2, String string3, String string4, Object object) {
      return this.Method3334(integer, string2, string3, string4, object);
   }

   public Class801 Method3248(String string, boolean boolean2) {
      return this.Method3333(string, boolean2);
   }

   private static Exception Method3332(Exception exception) {
      return exception;
   }
}
