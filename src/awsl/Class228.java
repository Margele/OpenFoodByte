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
      AttributesImpl var3 = new AttributesImpl();
      var3.addAttribute("", "file", "file", "", Method2071(a));
      var3.addAttribute("", "debug", "debug", "", Method2071(a));
      this.Field1277.Method2396("source", var3);
   }

   public void Method1453(String a, String a, String a) {
      AttributesImpl var4 = new AttributesImpl();
      var4.addAttribute("", "owner", "owner", "", a);
      var4.addAttribute("", "name", "name", "", a);
      var4.addAttribute("", "desc", "desc", "", a);
      this.Field1277.Method2396("outerclass", var4);
   }

   public Class148 Method1448(String a, boolean a) {
      return new Class134(this.Field1277, "annotation", 1, (String)null, a);
   }

   public Class148 Method1449(int a, Class31 a, String a, boolean a) {
      return new Class134(this.Field1277, "typeAnnotation", 1, (String)null, a, a, a);
   }

   public void Method1447(int a, int a, String a, String a, String a, String[] a) {
      StringBuffer var7 = new StringBuffer();
      Method2072(a | 262144, var7);
      AttributesImpl var8 = new AttributesImpl();
      var8.addAttribute("", "access", "access", "", var7.toString());
      var8.addAttribute("", "name", "name", "", a);
      var8.addAttribute("", "signature", "signature", "", Method2071(a));
      var8.addAttribute("", "parent", "parent", "", a);
      var8.addAttribute("", "major", "major", "", Integer.toString(a & '\uffff'));
      var8.addAttribute("", "minor", "minor", "", Integer.toString(a >>> 16));
      this.Field1277.Method2394("class", var8);
      this.Field1277.Method2394("interfaces", new AttributesImpl());
      if (a.length > 0) {
         for(int var9 = 0; var9 < a.length; ++var9) {
            AttributesImpl var10 = new AttributesImpl();
            var10.addAttribute("", "name", "name", "", a[var9]);
            this.Field1277.Method2396("interface", var10);
         }
      }

      this.Field1277.Method2395("interfaces");
   }

   public Class253 Method1450(int a, String a, String a, String a, Object a) {
      StringBuffer var6 = new StringBuffer();
      Method2072(a | 524288, var6);
      AttributesImpl var7 = new AttributesImpl();
      var7.addAttribute("", "access", "access", "", var6.toString());
      var7.addAttribute("", "name", "name", "", a);
      var7.addAttribute("", "desc", "desc", "", a);
      var7.addAttribute("", "signature", "signature", "", Method2071(a));
      var7.addAttribute("", "value", "value", "", Method2071(a.Method3780()));
      return new Class273(this.Field1277, var7);
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      StringBuffer var6 = new StringBuffer();
      Method2072(a, var6);
      AttributesImpl var7 = new AttributesImpl();
      var7.addAttribute("", "access", "access", "", var6.toString());
      var7.addAttribute("", "name", "name", "", a);
      var7.addAttribute("", "desc", "desc", "", a);
      var7.addAttribute("", "signature", "signature", "", a);
      this.Field1277.Method2394("method", var7);
      this.Field1277.Method2394("exceptions", new AttributesImpl());
      if (a.length > 0) {
         for(int var8 = 0; var8 < a.length; ++var8) {
            AttributesImpl var9 = new AttributesImpl();
            var9.addAttribute("", "name", "name", "", a[var8]);
            this.Field1277.Method2396("exception", var9);
         }
      }

      this.Field1277.Method2395("exceptions");
      return new Class43(this.Field1277, a);
   }

   public final void Method1452(String a, String a, String a, int a) {
      StringBuffer var5 = new StringBuffer();
      Method2072(a | 1048576, var5);
      AttributesImpl var6 = new AttributesImpl();
      var6.addAttribute("", "access", "access", "", var5.toString());
      var6.addAttribute("", "name", "name", "", a);
      var6.addAttribute("", "outerName", "outerName", "", a);
      var6.addAttribute("", "innerName", "innerName", "", a);
      this.Field1277.Method2396("innerclass", var6);
   }

   public final void Method1460() {
      this.Field1277.Method2395("class");
      if (!this.Field1278) {
         this.Field1277.Method2393();
      }

   }

   static final String Method2071(String a) {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < a.length(); ++var2) {
         char var3 = a.charAt(var2);
         if (var3 == '\\') {
            var1.append("\\\\");
         } else if (var3 >= ' ' && var3 <= 127) {
            var1.append(var3);
         } else {
            var1.append("\\u");
            if (var3 < 16) {
               var1.append("000");
            } else if (var3 < 256) {
               var1.append("00");
            } else if (var3 < 4096) {
               var1.append('0');
            }

            var1.append(Integer.toString(var3, 16));
         }
      }

      return var1.toString();
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
