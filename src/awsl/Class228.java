package awsl;

import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.AttributesImpl;

public final class Class228 extends Class167 {
   Class663 Field1277;
   private final boolean Field1278;
   private static final int Field1279 = 262144;
   private static final int Field1280 = 524288;
   private static final int Field1281 = 1048576;

   public Class228(ContentHandler a, boolean a) {
      super(327680);
      this.Field1277 = new Class663(a);
      this.Field1278 = a;
      this.Field1277.Method2392();
   }

   public void Method1458(String a, String a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "file", "file", "", Method2071(a));
      a.addAttribute("", "debug", "debug", "", Method2071(a));
      this.Field1277.Method2396("source", a);
   }

   public void Method1453(String a, String a, String a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "owner", "owner", "", a);
      a.addAttribute("", "name", "name", "", a);
      a.addAttribute("", "desc", "desc", "", a);
      this.Field1277.Method2396("outerclass", a);
   }

   public Class148 Method1448(String a, boolean a1) {
      return new Class134(this.Field1277, "annotation", 1, (String)null, a);
   }

   public Class148 Method1449(int a, Class31 a, String a, boolean a3) {
      return new Class134(this.Field1277, "typeAnnotation", 1, (String)null, a, a, a);
   }

   public void Method1447(int a, int a, String a, String a, String a, String[] a) {
      StringBuffer a = new StringBuffer();
      Method2072(a | 262144, a);
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "access", "access", "", a.toString());
      a.addAttribute("", "name", "name", "", a);
      a.addAttribute("", "signature", "signature", "", Method2071(a));
      a.addAttribute("", "parent", "parent", "", a);
      a.addAttribute("", "major", "major", "", Integer.toString(a & '\uffff'));
      a.addAttribute("", "minor", "minor", "", Integer.toString(a >>> 16));
      this.Field1277.Method2394("class", a);
      this.Field1277.Method2394("interfaces", new AttributesImpl());
      if (a.length > 0) {
         for(int a = 0; a < a.length; ++a) {
            AttributesImpl a = new AttributesImpl();
            a.addAttribute("", "name", "name", "", a[a]);
            this.Field1277.Method2396("interface", a);
         }
      }

      this.Field1277.Method2395("interfaces");
   }

   public Class253 Method1450(int a, String a, String a, String a, Object a) {
      StringBuffer a = new StringBuffer();
      Method2072(a | 524288, a);
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "access", "access", "", a.toString());
      a.addAttribute("", "name", "name", "", a);
      a.addAttribute("", "desc", "desc", "", a);
      a.addAttribute("", "signature", "signature", "", Method2071(a));
      a.addAttribute("", "value", "value", "", Method2071(a.Method3780()));
      return new Class273(this.Field1277, a);
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      StringBuffer a = new StringBuffer();
      Method2072(a, a);
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "access", "access", "", a.toString());
      a.addAttribute("", "name", "name", "", a);
      a.addAttribute("", "desc", "desc", "", a);
      a.addAttribute("", "signature", "signature", "", a);
      this.Field1277.Method2394("method", a);
      this.Field1277.Method2394("exceptions", new AttributesImpl());
      if (a.length > 0) {
         for(int a = 0; a < a.length; ++a) {
            AttributesImpl a = new AttributesImpl();
            a.addAttribute("", "name", "name", "", a[a]);
            this.Field1277.Method2396("exception", a);
         }
      }

      this.Field1277.Method2395("exceptions");
      return new Class43(this.Field1277, a);
   }

   public final void Method1452(String a, String a, String a, int a) {
      StringBuffer a = new StringBuffer();
      Method2072(a | 1048576, a);
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "access", "access", "", a.toString());
      a.addAttribute("", "name", "name", "", a);
      a.addAttribute("", "outerName", "outerName", "", a);
      a.addAttribute("", "innerName", "innerName", "", a);
      this.Field1277.Method2396("innerclass", a);
   }

   public final void Method1460() {
      this.Field1277.Method2395("class");
      if (!this.Field1278) {
         this.Field1277.Method2393();
      }

   }

   static final String Method2071(String a) {
      StringBuffer a = new StringBuffer();

      for(int a = 0; a < a.length(); ++a) {
         char a = a.charAt(a);
         if (a == '\\') {
            a.append("\\\\");
         } else if (a >= ' ' && a <= 127) {
            a.append(a);
         } else {
            a.append("\\u");
            if (a < 16) {
               a.append("000");
            } else if (a < 256) {
               a.append("00");
            } else if (a < 4096) {
               a.append('0');
            }

            a.append(Integer.toString(a, 16));
         }
      }

      return a.toString();
   }

   static void Method2072(int a, StringBuffer a) {
      int[] var2 = Class831.Method3658();
      if ((a & 1) != 0) {
         a.append("public ");
      }

      if ((a & 2) != 0) {
         a.append("private ");
      }

      if ((a & 4) != 0) {
         a.append("protected ");
      }

      if ((a & 16) != 0) {
         a.append("final ");
      }

      if ((a & 8) != 0) {
         a.append("static ");
      }

      if ((a & 32) != 0) {
         if ((a & 262144) == 0) {
            a.append("synchronized ");
         }

         a.append("super ");
      }

      if ((a & 64) != 0) {
         if ((a & 524288) == 0) {
            a.append("bridge ");
         }

         a.append("volatile ");
      }

      if ((a & 128) != 0) {
         if ((a & 524288) == 0) {
            a.append("varargs ");
         }

         a.append("transient ");
      }

      if ((a & 256) != 0) {
         a.append("native ");
      }

      if ((a & 2048) != 0) {
         a.append("strict ");
      }

      if ((a & 512) != 0) {
         a.append("interface ");
      }

      if ((a & 1024) != 0) {
         a.append("abstract ");
      }

      if ((a & 4096) != 0) {
         a.append("synthetic ");
      }

      if ((a & 8192) != 0) {
         a.append("annotation ");
      }

      if ((a & 16384) != 0) {
         a.append("enum ");
      }

      if ((a & 131072) != 0) {
         a.append("deprecated ");
      }

      if ((a & '耀') != 0) {
         a.append("mandated ");
      }

   }
}
