package awsl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class173 extends Class171 {
   private String Field1122;
   String Field1123;
   boolean Field1124 = false;
   boolean Field1125 = false;
   List Field1126 = new ArrayList();

   public Class173(Class167 a, Class37 a) {
      super(327680, a, a);
   }

   Class253 Method1457(int a, String a, String a) {
      return super.Method1450(a, a, a, (String)null, (Object)null);
   }

   public void Method1447(int a, int a, String a, String a3, String a, String[] a) {
      super.Method1447(46, a, a, (String)null, a, a);
      int a = a.lastIndexOf(47);
      this.Field1122 = a.substring(0, a);
      this.Field1123 = a;
      this.Field1124 = (a & 512) != 0;
   }

   public void Method1458(String a, String a1) {
   }

   public void Method1453(String a, String a1, String a2) {
   }

   public Class148 Method1448(String a, boolean a1) {
      return null;
   }

   public Class148 Method1449(int a, Class31 a1, String a2, boolean a3) {
      return null;
   }

   public void Method1459(Class136 a) {
   }

   public void Method1452(String a, String a1, String a2, int a3) {
   }

   public Class253 Method1450(int a, String a, String a, String a3, Object a) {
      String a = this.Field1120.Method3185(this.Field1121, a, a);
      if ("-".equals(a)) {
         return null;
      } else {
         if ((a & 5) == 0) {
            if ((a & 16) != 0 && (a & 8) != 0 && a.length() == 1) {
               return null;
            }

            if ("awsl/asm".equals(this.Field1122) && a.equals(a)) {
               System.out.println("INFO: " + this.Field1123 + "." + a + " could be renamed");
            }

            super.Method1450(a, a, a, (String)null, a);
         } else {
            if (!a.equals(a)) {
               throw new RuntimeException("The public or protected field " + this.Field1121 + '.' + a + " must not be renamed.");
            }

            super.Method1450(a, a, a, (String)null, a);
         }

         return null;
      }
   }

   public Class267 Method1451(int a, String a, String a, String a3, String[] a) {
      String a = this.Field1120.Method3184(this.Field1121, a, a);
      if ("-".equals(a)) {
         return null;
      } else if (a.equals("<clinit>") && !this.Field1124) {
         this.Field1125 = true;
         Class267 a = super.Method1451(a, a, a, (String)null, a);
         return new Class25(this, 327680, a);
      } else if ((a & 5) == 0) {
         if ("awsl/asm".equals(this.Field1122) && !a.startsWith("<") && a.equals(a)) {
            System.out.println("INFO: " + this.Field1123 + "." + a + " could be renamed");
         }

         return super.Method1451(a, a, a, (String)null, a);
      } else if (!a.equals(a)) {
         throw new RuntimeException("The public or protected method " + this.Field1121 + '.' + a + a + " must not be renamed.");
      } else {
         return super.Method1451(a, a, a, (String)null, a);
      }
   }

   protected Class267 Method1455(int a, String a, Class267 a) {
      return new Class23(this, a, a, a, this.Field1120);
   }

   public void Method1460() {
      label25: {
         String[] a = Class690.Method2342();
         Class267 a;
         if (this.Field1126.isEmpty()) {
            if (!this.Field1125) {
               break label25;
            }

            a = this.Field1035.Method1451(4104, "_clinit_", "()V", (String)null, (String[])null);
            a.Method1652();
            a.Method1948(177);
            a.Method1842(0, 0);
            a.Method1653();
         }

         a = this.Field1035.Method1451(4104, "class$", "(Ljava/lang/String;)Ljava/lang/Class;", (String)null, (String[])null);
         a.Method1652();
         Class264 a = new Class264();
         Class264 a = new Class264();
         Class264 a = new Class264();
         a.Method1960(a, a, a, "java/lang/ClassNotFoundException");
         a.Method1947(a);
         a.Method1840(25, 0);
         a.Method1954(184, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
         a.Method1947(a);
         a.Method1948(176);
         a.Method1947(a);
         a.Method1954(182, "java/lang/ClassNotFoundException", "getMessage", "()Ljava/lang/String;", false);
         a.Method1840(58, 1);
         a.Method1952(187, "java/lang/NoClassDefFoundError");
         a.Method1948(89);
         a.Method1840(25, 1);
         a.Method1954(183, "java/lang/NoClassDefFoundError", "<init>", "(Ljava/lang/String;)V", false);
         a.Method1948(191);
         a.Method1842(3, 2);
         a.Method1653();
         if (this.Field1125) {
            a = this.Field1035.Method1451(10, "_clinit_", "()V", (String)null, (String[])null);
         }

         a = this.Field1035.Method1451(8, "<clinit>", "()V", (String)null, (String[])null);
         Iterator var6 = this.Field1126.Method1383();
         if (var6.Method932()) {
            String a = (String)var6.Method933();
            String a = "class$" + a.replace('/', '$');
            a.Method1950(a.replace('/', '.'));
            a.Method1954(184, this.Field1123, "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
            a.Method1949(179, this.Field1123, a, "Ljava/lang/Class;");
         }

         a.Method1948(177);
         a.Method1842(1, 0);
         a.Method1653();
      }

      super.Method1460();
   }

   private static RuntimeException Method1461(RuntimeException runtimeException) {
      return runtimeException;
   }
}
