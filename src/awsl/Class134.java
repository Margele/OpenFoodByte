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

   protected Class134(int a, Class663 a, String a, int a, String a, String a, int a, int a, Class31 a, String[] a, String[] a, int[] a) {
      super(a);
      this.Field983 = a;
      this.Field984 = a;
      AttributesImpl var13 = new AttributesImpl();
      var13.addAttribute("", "name", "name", "", a);
      var13.addAttribute("", "visible", "visible", "", "true");
      if (a != -1) {
         var13.addAttribute("", "parameter", "parameter", "", Integer.toString(a));
      }

      var13.addAttribute("", "desc", "desc", "", a);
      if (a != -1) {
         var13.addAttribute("", "typeRef", "typeRef", "", Integer.toString(a));
      }

      var13.addAttribute("", "typePath", "typePath", "", a.Method3436());
      StringBuffer var14 = new StringBuffer(a[0]);

      int var15;
      for(var15 = 1; var15 < a.length; ++var15) {
         var14.append(" ").append(a[var15]);
      }

      var13.addAttribute("", "start", "start", "", var14.toString());
      var14 = new StringBuffer(a[0]);

      for(var15 = 1; var15 < a.length; ++var15) {
         var14.append(" ").append(a[var15]);
      }

      var13.addAttribute("", "end", "end", "", var14.toString());
      var14 = new StringBuffer();
      var14.append(a[0]);

      for(var15 = 1; var15 < a.length; ++var15) {
         var14.append(" ").append(a[var15]);
      }

      var13.addAttribute("", "index", "index", "", var14.toString());
      a.Method2394(a, var13);
   }

   public void Method397(String a, Object a) {
      Class831.Method3658();
      Class var4 = a.getClass();
      if (var4.isArray()) {
         Class148 var5 = this.Method400(a);
         int var7;
         if (a instanceof byte[]) {
            byte[] var6 = (byte[])((byte[])a);
            var7 = 0;
            if (var7 < var6.length) {
               var5.Method397((String)null, new Byte(var6[var7]));
               ++var7;
            }
         }

         byte var12;
         if (a instanceof char[]) {
            char[] var8 = (char[])((char[])a);
            var12 = 0;
            if (var12 < var8.length) {
               var5.Method397((String)null, new Character(var8[var12]));
               var7 = var12 + 1;
            }
         }

         if (a instanceof short[]) {
            short[] var9 = (short[])((short[])a);
            var12 = 0;
            if (var12 < var9.length) {
               var5.Method397((String)null, new Short(var9[var12]));
               var7 = var12 + 1;
            }
         }

         if (a instanceof boolean[]) {
            boolean[] var10 = (boolean[])((boolean[])a);
            var12 = 0;
            if (var12 < var10.length) {
               var5.Method397((String)null, var10[var12]);
               var7 = var12 + 1;
            }
         }

         if (a instanceof int[]) {
            int[] var11 = (int[])((int[])a);
            var12 = 0;
            if (var12 < var11.length) {
               var5.Method397((String)null, new Integer(var11[var12]));
               var7 = var12 + 1;
            }
         }

         if (a instanceof long[]) {
            long[] var13 = (long[])((long[])a);
            var12 = 0;
            if (var12 < var13.length) {
               var5.Method397((String)null, new Long(var13[var12]));
               var7 = var12 + 1;
            }
         }

         if (a instanceof float[]) {
            float[] var14 = (float[])((float[])a);
            var12 = 0;
            if (var12 < var14.length) {
               var5.Method397((String)null, new Float(var14[var12]));
               var7 = var12 + 1;
            }
         }

         if (a instanceof double[]) {
            double[] var15 = (double[])((double[])a);
            var12 = 0;
            if (var12 < var15.length) {
               var5.Method397((String)null, new Double(var15[var12]));
               var7 = var12 + 1;
            }
         }

         var5.Method401();
      }

      this.Method449("annotationValue", a, b.Method3229(var4), a.Method3780());
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
      AttributesImpl var5 = new AttributesImpl();
      var5.addAttribute("", "name", "name", "", a);
      var5.addAttribute("", "desc", "desc", "", a);
      var5.addAttribute("", "value", "value", "", Class228.Method2071(a));
      this.Field983.Method2396(a, var5);
   }
}
