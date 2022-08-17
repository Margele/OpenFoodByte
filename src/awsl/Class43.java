package awsl;

import java.util.HashMap;
import java.util.Map;
import obfuscate.b;
import org.xml.sax.helpers.AttributesImpl;

public final class Class43 extends Class267 {
   static final String[] Field335 = new String[]{"top", "int", "float", "double", "long", "null", "uninitializedThis"};
   Class663 Field336;
   int Field337;
   private final Map Field338;

   public Class43(Class663 a, int a) {
      super(327680);
      this.Field336 = a;
      this.Field337 = a;
      this.Field338 = new HashMap();
   }

   public void Method1979(String a, int a) {
      AttributesImpl var3 = new AttributesImpl();
      var3.addAttribute("", "name", "name", "", a);
      StringBuffer var4 = new StringBuffer();
      Class228.Method2072(a, var4);
      var3.addAttribute("", "access", "access", "", var4.toString());
      this.Field336.Method2396("parameter", var3);
   }

   public final void Method1652() {
      if ((this.Field337 & 1792) == 0) {
         this.Field336.Method2394("code", new AttributesImpl());
      }

   }

   public void Method1845(int a, int a, Object[] a, int a, Object[] a) {
      Class831.Method3658();
      AttributesImpl var7 = new AttributesImpl();
      switch (a) {
         case -1:
         case 0:
            if (a == -1) {
               var7.addAttribute("", "type", "type", "", "NEW");
            }

            var7.addAttribute("", "type", "type", "", "FULL");
            this.Field336.Method2394("frame", var7);
            this.Method3242(true, a, a);
            this.Method3242(false, a, a);
         case 1:
            var7.addAttribute("", "type", "type", "", "APPEND");
            this.Field336.Method2394("frame", var7);
            this.Method3242(true, a, a);
         case 2:
            var7.addAttribute("", "type", "type", "", "CHOP");
            var7.addAttribute("", "count", "count", "", Integer.toString(a));
            this.Field336.Method2394("frame", var7);
         case 3:
            var7.addAttribute("", "type", "type", "", "SAME");
            this.Field336.Method2394("frame", var7);
         case 4:
            var7.addAttribute("", "type", "type", "", "SAME1");
            this.Field336.Method2394("frame", var7);
            this.Method3242(false, 1, a);
         default:
            this.Field336.Method2395("frame");
      }
   }

   private void Method3242(boolean a, int a, Object[] a) {
      for(int var4 = 0; var4 < a; ++var4) {
         Object var5 = a[var4];
         AttributesImpl var6 = new AttributesImpl();
         if (var5 instanceof String) {
            var6.addAttribute("", "type", "type", "", (String)var5);
         } else if (var5 instanceof Integer) {
            var6.addAttribute("", "type", "type", "", Field335[(Integer)var5]);
         } else {
            var6.addAttribute("", "type", "type", "", "uninitialized");
            var6.addAttribute("", "label", "label", "", this.Method3244((Class264)var5));
         }

         this.Field336.Method2396("local", var6);
      }

   }

   public final void Method1948(int a) {
      this.Field336.Method2396(Class801.Field3575[a], new AttributesImpl());
   }

   public final void Method854(int a, int a) {
      AttributesImpl var3 = new AttributesImpl();
      var3.addAttribute("", "value", "value", "", Integer.toString(a));
      this.Field336.Method2396(Class801.Field3575[a], var3);
   }

   public final void Method1840(int a, int a) {
      AttributesImpl var3 = new AttributesImpl();
      var3.addAttribute("", "var", "var", "", Integer.toString(a));
      this.Field336.Method2396(Class801.Field3575[a], var3);
   }

   public final void Method1952(int a, String a) {
      AttributesImpl var3 = new AttributesImpl();
      var3.addAttribute("", "desc", "desc", "", a);
      this.Field336.Method2396(Class801.Field3575[a], var3);
   }

   public final void Method1949(int a, String a, String a, String a) {
      AttributesImpl var5 = new AttributesImpl();
      var5.addAttribute("", "owner", "owner", "", a);
      var5.addAttribute("", "name", "name", "", a);
      var5.addAttribute("", "desc", "desc", "", a);
      this.Field336.Method2396(Class801.Field3575[a], var5);
   }

   public final void Method1954(int a, String a, String a, String a, boolean a) {
      AttributesImpl var6 = new AttributesImpl();
      var6.addAttribute("", "owner", "owner", "", a);
      var6.addAttribute("", "name", "name", "", a);
      var6.addAttribute("", "desc", "desc", "", a);
      var6.addAttribute("", "itf", "itf", "", "true");
      this.Field336.Method2396(Class801.Field3575[a], var6);
   }

   public void Method1956(String a, String a, Class279 a, Object[] a) {
      AttributesImpl var5 = new AttributesImpl();
      var5.addAttribute("", "name", "name", "", a);
      var5.addAttribute("", "desc", "desc", "", a);
      var5.addAttribute("", "bsm", "bsm", "", Class228.Method2071(a.Method2826()));
      this.Field336.Method2394("INVOKEDYNAMIC", var5);

      for(int var6 = 0; var6 < a.length; ++var6) {
         this.Field336.Method2396("bsmArg", Method3243(a[var6]));
      }

      this.Field336.Method2395("INVOKEDYNAMIC");
   }

   public final void Method1957(int a, Class264 a) {
      AttributesImpl var3 = new AttributesImpl();
      var3.addAttribute("", "label", "label", "", this.Method3244(a));
      this.Field336.Method2396(Class801.Field3575[a], var3);
   }

   public final void Method1947(Class264 a) {
      AttributesImpl var2 = new AttributesImpl();
      var2.addAttribute("", "name", "name", "", this.Method3244(a));
      this.Field336.Method2396("Label", var2);
   }

   public final void Method1950(Object a) {
      this.Field336.Method2396(Class801.Field3575[18], Method3243(a));
   }

   private static AttributesImpl Method3243(Object a) {
      AttributesImpl var1 = new AttributesImpl();
      var1.addAttribute("", "cst", "cst", "", Class228.Method2071(a.Method3780()));
      var1.addAttribute("", "desc", "desc", "", b.Method3229(a.getClass()));
      return var1;
   }

   public final void Method1841(int a, int a) {
      AttributesImpl var3 = new AttributesImpl();
      var3.addAttribute("", "var", "var", "", Integer.toString(a));
      var3.addAttribute("", "inc", "inc", "", Integer.toString(a));
      this.Field336.Method2396(Class801.Field3575[132], var3);
   }

   public final void Method1959(int a, int a, Class264 a, Class264[] a) {
      AttributesImpl var5 = new AttributesImpl();
      var5.addAttribute("", "min", "min", "", Integer.toString(a));
      var5.addAttribute("", "max", "max", "", Integer.toString(a));
      var5.addAttribute("", "dflt", "dflt", "", this.Method3244(a));
      String var6 = Class801.Field3575[170];
      this.Field336.Method2394(var6, var5);

      for(int var7 = 0; var7 < a.length; ++var7) {
         AttributesImpl var8 = new AttributesImpl();
         var8.addAttribute("", "name", "name", "", this.Method3244(a[var7]));
         this.Field336.Method2396("label", var8);
      }

      this.Field336.Method2395(var6);
   }

   public final void Method1958(Class264 a, int[] a, Class264[] a) {
      AttributesImpl var4 = new AttributesImpl();
      var4.addAttribute("", "dflt", "dflt", "", this.Method3244(a));
      String var5 = Class801.Field3575[171];
      this.Field336.Method2394(var5, var4);

      for(int var6 = 0; var6 < a.length; ++var6) {
         AttributesImpl var7 = new AttributesImpl();
         var7.addAttribute("", "name", "name", "", this.Method3244(a[var6]));
         var7.addAttribute("", "key", "key", "", Integer.toString(a[var6]));
         this.Field336.Method2396("label", var7);
      }

      this.Field336.Method2395(var5);
   }

   public final void Method1951(String a, int a) {
      AttributesImpl var3 = new AttributesImpl();
      var3.addAttribute("", "desc", "desc", "", a);
      var3.addAttribute("", "dims", "dims", "", Integer.toString(a));
      this.Field336.Method2396(Class801.Field3575[197], var3);
   }

   public final void Method1960(Class264 a, Class264 a, Class264 a, String a) {
      AttributesImpl var5 = new AttributesImpl();
      var5.addAttribute("", "start", "start", "", this.Method3244(a));
      var5.addAttribute("", "end", "end", "", this.Method3244(a));
      var5.addAttribute("", "handler", "handler", "", this.Method3244(a));
      var5.addAttribute("", "type", "type", "", a);
      this.Field336.Method2396("TryCatch", var5);
   }

   public final void Method1842(int a, int a) {
      AttributesImpl var3 = new AttributesImpl();
      var3.addAttribute("", "maxStack", "maxStack", "", Integer.toString(a));
      var3.addAttribute("", "maxLocals", "maxLocals", "", Integer.toString(a));
      this.Field336.Method2396("Max", var3);
      this.Field336.Method2395("code");
   }

   public void Method1843(String a, String a, String a, Class264 a, Class264 a, int a) {
      AttributesImpl var7 = new AttributesImpl();
      var7.addAttribute("", "name", "name", "", a);
      var7.addAttribute("", "desc", "desc", "", a);
      var7.addAttribute("", "signature", "signature", "", Class228.Method2071(a));
      var7.addAttribute("", "start", "start", "", this.Method3244(a));
      var7.addAttribute("", "end", "end", "", this.Method3244(a));
      var7.addAttribute("", "var", "var", "", Integer.toString(a));
      this.Field336.Method2396("LocalVar", var7);
   }

   public final void Method1981(int a, Class264 a) {
      AttributesImpl var3 = new AttributesImpl();
      var3.addAttribute("", "line", "line", "", Integer.toString(a));
      var3.addAttribute("", "start", "start", "", this.Method3244(a));
      this.Field336.Method2396("LineNumber", var3);
   }

   public Class148 Method1968() {
      return new Class134(this.Field336, "annotationDefault", 0, (String)null, (String)null);
   }

   public Class148 Method1969(String a, boolean a) {
      return new Class134(this.Field336, "annotation", 1, (String)null, a);
   }

   public Class148 Method1970(int a, Class31 a, String a, boolean a) {
      return new Class134(this.Field336, "typeAnnotation", 1, (String)null, a, a, a);
   }

   public Class148 Method1971(int a, String a, boolean a) {
      return new Class134(this.Field336, "parameterAnnotation", 1, a, a);
   }

   public Class148 Method1973(int a, Class31 a, String a, boolean a) {
      return new Class134(this.Field336, "insnAnnotation", 1, (String)null, a, a, a);
   }

   public Class148 Method1974(int a, Class31 a, String a, boolean a) {
      return new Class134(this.Field336, "tryCatchAnnotation", 1, (String)null, a, a, a);
   }

   public Class148 Method1844(int a, Class31 a, Class264[] a, Class264[] a, int[] a, String a, boolean a) {
      String[] var8 = new String[a.length];
      String[] var9 = new String[a.length];

      int var10;
      for(var10 = 0; var10 < var8.length; ++var10) {
         var8[var10] = this.Method3244(a[var10]);
      }

      for(var10 = 0; var10 < var9.length; ++var10) {
         var9[var10] = this.Method3244(a[var10]);
      }

      return new Class134(this.Field336, "localVariableAnnotation", 1, (String)null, a, a, a, var8, var9, a);
   }

   public void Method1653() {
      this.Field336.Method2395("method");
   }

   private final String Method3244(Class264 a) {
      String var2 = (String)this.Field338.Method2665(a);
      var2 = Integer.toString(this.Field338.Method1799());
      this.Field338.put(a, var2);
      return var2;
   }
}
