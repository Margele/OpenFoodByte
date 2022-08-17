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
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "name", "name", "", a);
      StringBuffer a = new StringBuffer();
      Class228.Method2072(a, a);
      a.addAttribute("", "access", "access", "", a.toString());
      this.Field336.Method2396("parameter", a);
   }

   public final void Method1652() {
      if ((this.Field337 & 1792) == 0) {
         this.Field336.Method2394("code", new AttributesImpl());
      }

   }

   public void Method1845(int a, int a, Object[] a, int a, Object[] a) {
      Class831.Method3658();
      AttributesImpl a = new AttributesImpl();
      switch (a) {
         case -1:
         case 0:
            if (a == -1) {
               a.addAttribute("", "type", "type", "", "NEW");
            }

            a.addAttribute("", "type", "type", "", "FULL");
            this.Field336.Method2394("frame", a);
            this.Method3242(true, a, a);
            this.Method3242(false, a, a);
         case 1:
            a.addAttribute("", "type", "type", "", "APPEND");
            this.Field336.Method2394("frame", a);
            this.Method3242(true, a, a);
         case 2:
            a.addAttribute("", "type", "type", "", "CHOP");
            a.addAttribute("", "count", "count", "", Integer.toString(a));
            this.Field336.Method2394("frame", a);
         case 3:
            a.addAttribute("", "type", "type", "", "SAME");
            this.Field336.Method2394("frame", a);
         case 4:
            a.addAttribute("", "type", "type", "", "SAME1");
            this.Field336.Method2394("frame", a);
            this.Method3242(false, 1, a);
         default:
            this.Field336.Method2395("frame");
      }
   }

   private void Method3242(boolean a, int a, Object[] a) {
      for(int a = 0; a < a; ++a) {
         Object a = a[a];
         AttributesImpl a = new AttributesImpl();
         if (a instanceof String) {
            a.addAttribute("", "type", "type", "", (String)a);
         } else if (a instanceof Integer) {
            a.addAttribute("", "type", "type", "", Field335[(Integer)a]);
         } else {
            a.addAttribute("", "type", "type", "", "uninitialized");
            a.addAttribute("", "label", "label", "", this.Method3244((Class264)a));
         }

         this.Field336.Method2396("local", a);
      }

   }

   public final void Method1948(int a) {
      this.Field336.Method2396(Class801.Field3575[a], new AttributesImpl());
   }

   public final void Method854(int a, int a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "value", "value", "", Integer.toString(a));
      this.Field336.Method2396(Class801.Field3575[a], a);
   }

   public final void Method1840(int a, int a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "var", "var", "", Integer.toString(a));
      this.Field336.Method2396(Class801.Field3575[a], a);
   }

   public final void Method1952(int a, String a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "desc", "desc", "", a);
      this.Field336.Method2396(Class801.Field3575[a], a);
   }

   public final void Method1949(int a, String a, String a, String a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "owner", "owner", "", a);
      a.addAttribute("", "name", "name", "", a);
      a.addAttribute("", "desc", "desc", "", a);
      this.Field336.Method2396(Class801.Field3575[a], a);
   }

   public final void Method1954(int a, String a, String a, String a, boolean a4) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "owner", "owner", "", a);
      a.addAttribute("", "name", "name", "", a);
      a.addAttribute("", "desc", "desc", "", a);
      a.addAttribute("", "itf", "itf", "", "true");
      this.Field336.Method2396(Class801.Field3575[a], a);
   }

   public void Method1956(String a, String a, Class279 a, Object[] a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "name", "name", "", a);
      a.addAttribute("", "desc", "desc", "", a);
      a.addAttribute("", "bsm", "bsm", "", Class228.Method2071(a.Method2826()));
      this.Field336.Method2394("INVOKEDYNAMIC", a);

      for(int a = 0; a < a.length; ++a) {
         this.Field336.Method2396("bsmArg", Method3243(a[a]));
      }

      this.Field336.Method2395("INVOKEDYNAMIC");
   }

   public final void Method1957(int a, Class264 a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "label", "label", "", this.Method3244(a));
      this.Field336.Method2396(Class801.Field3575[a], a);
   }

   public final void Method1947(Class264 a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "name", "name", "", this.Method3244(a));
      this.Field336.Method2396("Label", a);
   }

   public final void Method1950(Object a) {
      this.Field336.Method2396(Class801.Field3575[18], Method3243(a));
   }

   private static AttributesImpl Method3243(Object a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "cst", "cst", "", Class228.Method2071(a.Method3780()));
      a.addAttribute("", "desc", "desc", "", b.Method3229(a.getClass()));
      return a;
   }

   public final void Method1841(int a, int a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "var", "var", "", Integer.toString(a));
      a.addAttribute("", "inc", "inc", "", Integer.toString(a));
      this.Field336.Method2396(Class801.Field3575[132], a);
   }

   public final void Method1959(int a, int a, Class264 a, Class264[] a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "min", "min", "", Integer.toString(a));
      a.addAttribute("", "max", "max", "", Integer.toString(a));
      a.addAttribute("", "dflt", "dflt", "", this.Method3244(a));
      String a = Class801.Field3575[170];
      this.Field336.Method2394(a, a);

      for(int a = 0; a < a.length; ++a) {
         AttributesImpl a = new AttributesImpl();
         a.addAttribute("", "name", "name", "", this.Method3244(a[a]));
         this.Field336.Method2396("label", a);
      }

      this.Field336.Method2395(a);
   }

   public final void Method1958(Class264 a, int[] a, Class264[] a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "dflt", "dflt", "", this.Method3244(a));
      String a = Class801.Field3575[171];
      this.Field336.Method2394(a, a);

      for(int a = 0; a < a.length; ++a) {
         AttributesImpl a = new AttributesImpl();
         a.addAttribute("", "name", "name", "", this.Method3244(a[a]));
         a.addAttribute("", "key", "key", "", Integer.toString(a[a]));
         this.Field336.Method2396("label", a);
      }

      this.Field336.Method2395(a);
   }

   public final void Method1951(String a, int a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "desc", "desc", "", a);
      a.addAttribute("", "dims", "dims", "", Integer.toString(a));
      this.Field336.Method2396(Class801.Field3575[197], a);
   }

   public final void Method1960(Class264 a, Class264 a, Class264 a, String a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "start", "start", "", this.Method3244(a));
      a.addAttribute("", "end", "end", "", this.Method3244(a));
      a.addAttribute("", "handler", "handler", "", this.Method3244(a));
      a.addAttribute("", "type", "type", "", a);
      this.Field336.Method2396("TryCatch", a);
   }

   public final void Method1842(int a, int a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "maxStack", "maxStack", "", Integer.toString(a));
      a.addAttribute("", "maxLocals", "maxLocals", "", Integer.toString(a));
      this.Field336.Method2396("Max", a);
      this.Field336.Method2395("code");
   }

   public void Method1843(String a, String a, String a, Class264 a, Class264 a, int a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "name", "name", "", a);
      a.addAttribute("", "desc", "desc", "", a);
      a.addAttribute("", "signature", "signature", "", Class228.Method2071(a));
      a.addAttribute("", "start", "start", "", this.Method3244(a));
      a.addAttribute("", "end", "end", "", this.Method3244(a));
      a.addAttribute("", "var", "var", "", Integer.toString(a));
      this.Field336.Method2396("LocalVar", a);
   }

   public final void Method1981(int a, Class264 a) {
      AttributesImpl a = new AttributesImpl();
      a.addAttribute("", "line", "line", "", Integer.toString(a));
      a.addAttribute("", "start", "start", "", this.Method3244(a));
      this.Field336.Method2396("LineNumber", a);
   }

   public Class148 Method1968() {
      return new Class134(this.Field336, "annotationDefault", 0, (String)null, (String)null);
   }

   public Class148 Method1969(String a, boolean a1) {
      return new Class134(this.Field336, "annotation", 1, (String)null, a);
   }

   public Class148 Method1970(int a, Class31 a, String a, boolean a3) {
      return new Class134(this.Field336, "typeAnnotation", 1, (String)null, a, a, a);
   }

   public Class148 Method1971(int a, String a, boolean a2) {
      return new Class134(this.Field336, "parameterAnnotation", 1, a, a);
   }

   public Class148 Method1973(int a, Class31 a, String a, boolean a3) {
      return new Class134(this.Field336, "insnAnnotation", 1, (String)null, a, a, a);
   }

   public Class148 Method1974(int a, Class31 a, String a, boolean a3) {
      return new Class134(this.Field336, "tryCatchAnnotation", 1, (String)null, a, a, a);
   }

   public Class148 Method1844(int a, Class31 a, Class264[] a, Class264[] a, int[] a, String a, boolean a6) {
      String[] a = new String[a.length];
      String[] a = new String[a.length];

      int a;
      for(a = 0; a < a.length; ++a) {
         a[a] = this.Method3244(a[a]);
      }

      for(a = 0; a < a.length; ++a) {
         a[a] = this.Method3244(a[a]);
      }

      return new Class134(this.Field336, "localVariableAnnotation", 1, (String)null, a, a, a, a, a, a);
   }

   public void Method1653() {
      this.Field336.Method2395("method");
   }

   private final String Method3244(Class264 a) {
      String a = (String)this.Field338.Method2665(a);
      a = Integer.toString(this.Field338.Method1799());
      this.Field338.put(a, a);
      return a;
   }
}
