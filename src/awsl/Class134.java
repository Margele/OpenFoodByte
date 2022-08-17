package awsl;

import obfuscate.b;
import org.xml.sax.helpers.AttributesImpl;

public final class Class134 extends Class148 {
   Class663 Field983;
   private final String Field984;

   public Class134(Class663 a, String a, int a, String a, String a) {
      this(327680, a, a, a, a, a, -1, -1, (Class31)null, (String[])null, (String[])null, (int[])null);
   }

   public Class134(Class663 a, String a, int a, int a, String a) {
      this(327680, a, a, a, a, (String)null, a, -1, (Class31)null, (String[])null, (String[])null, (int[])null);
   }

   public Class134(Class663 a, String a, int a, String a, String a, int a, Class31 a) {
      this(327680, a, a, a, a, a, -1, a, a, (String[])null, (String[])null, (int[])null);
   }

   public Class134(Class663 a, String a, int a, String a, String a, int a, Class31 a, String[] a, String[] a, int[] a) {
      this(327680, a, a, a, a, a, -1, a, a, a, a, a);
   }

   protected Class134(int a, Class663 a, String a, int a, String a, String a, int a) {
      this(a, a, a, a, a, a, a, -1, (Class31)null, (String[])null, (String[])null, (int[])null);
   }

   protected Class134(int a, Class663 a, String a, int a3, String a, String a, int a, int a, Class31 a, String[] a, String[] a, int[] a) {
      super(a);
      this.Field983 = a;
      this.Field984 = a;
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "name", "name", "", a);
      a.addAttribute("", "visible", "visible", "", "true");
      if (a != -1) {
         a.addAttribute("", "parameter", "parameter", "", Integer.toString(a));
      }

      a.addAttribute("", "desc", "desc", "", a);
      if (a != -1) {
         a.addAttribute("", "typeRef", "typeRef", "", Integer.toString(a));
      }

      a.addAttribute("", "typePath", "typePath", "", a.Method3436());
      StringBuffer a = new StringBuffer(a[0]);

      int a;
      for(a = 1; a < a.length; ++a) {
         a.append(" ").append(a[a]);
      }

      a.addAttribute("", "start", "start", "", a.toString());
      a = new StringBuffer(a[0]);

      for(a = 1; a < a.length; ++a) {
         a.append(" ").append(a[a]);
      }

      a.addAttribute("", "end", "end", "", a.toString());
      a = new StringBuffer();
      a.append(a[0]);

      for(a = 1; a < a.length; ++a) {
         a.append(" ").append(a[a]);
      }

      a.addAttribute("", "index", "index", "", a.toString());
      a.Method2394(a, a);
   }

   public void Method397(String a, Object a) {
      Class831.Method3658();
      Class a = a.getClass();
      if (a.isArray()) {
         Class148 a = this.Method400(a);
         int a;
         if (a instanceof byte[]) {
            byte[] a = (byte[])((byte[])a);
            a = 0;
            if (a < a.length) {
               a.Method397((String)null, new Byte(a[a]));
               ++a;
            }
         }

         byte a;
         if (a instanceof char[]) {
            char[] a = (char[])((char[])a);
            a = 0;
            if (a < a.length) {
               a.Method397((String)null, new Character(a[a]));
               a = a + 1;
            }
         }

         if (a instanceof short[]) {
            short[] a = (short[])((short[])a);
            a = 0;
            if (a < a.length) {
               a.Method397((String)null, new Short(a[a]));
               a = a + 1;
            }
         }

         if (a instanceof boolean[]) {
            boolean[] a = (boolean[])((boolean[])a);
            a = 0;
            if (a < a.length) {
               a.Method397((String)null, a[a]);
               a = a + 1;
            }
         }

         if (a instanceof int[]) {
            int[] a = (int[])((int[])a);
            a = 0;
            if (a < a.length) {
               a.Method397((String)null, new Integer(a[a]));
               a = a + 1;
            }
         }

         if (a instanceof long[]) {
            long[] a = (long[])((long[])a);
            a = 0;
            if (a < a.length) {
               a.Method397((String)null, new Long(a[a]));
               a = a + 1;
            }
         }

         if (a instanceof float[]) {
            float[] a = (float[])((float[])a);
            a = 0;
            if (a < a.length) {
               a.Method397((String)null, new Float(a[a]));
               a = a + 1;
            }
         }

         if (a instanceof double[]) {
            double[] a = (double[])((double[])a);
            a = 0;
            if (a < a.length) {
               a.Method397((String)null, new Double(a[a]));
               a = a + 1;
            }
         }

         a.Method401();
      }

      this.Method449("annotationValue", a, b.Method3229(a), a.Method3780());
   }

   public void Method398(String a, String a, String a) {
      this.Method449("annotationValueEnum", a, a, a);
   }

   public Class148 Method399(String a, String a) {
      return new Class134(this.Field983, "annotationValueAnnotation", 0, a, a);
   }

   public Class148 Method400(String a) {
      return new Class134(this.Field983, "annotationValueArray", 0, a, (String)null);
   }

   public void Method401() {
      this.Field983.Method2395(this.Field984);
   }

   private void Method449(String a, String a, String a, String a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "name", "name", "", a);
      a.addAttribute("", "desc", "desc", "", a);
      a.addAttribute("", "value", "value", "", Class228.Method2071(a));
      this.Field983.Method2396(a, a);
   }
}
