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

   public void Method1447(int a, int a, String a, String a, String a, String[] a) {
      super.Method1447(46, a, a, (String)null, a, a);
      int var7 = a.lastIndexOf(47);
      this.Field1122 = a.substring(0, var7);
      this.Field1123 = a;
      this.Field1124 = (a & 512) != 0;
   }

   public void Method1458(String a, String a) {
   }

   public void Method1453(String a, String a, String a) {
   }

   public Class148 Method1448(String a, boolean a) {
      return null;
   }

   public Class148 Method1449(int a, Class31 a, String a, boolean a) {
      return null;
   }

   public void Method1459(Class136 a) {
   }

   public void Method1452(String a, String a, String a, int a) {
   }

   public Class253 Method1450(int a, String a, String a, String a, Object a) {
      String var6 = this.Field1120.Method3185(this.Field1121, a, a);
      if ("-".equals(var6)) {
         return null;
      } else {
         if ((a & 5) == 0) {
            if ((a & 16) != 0 && (a & 8) != 0 && a.length() == 1) {
               return null;
            }

            if ("awsl/asm".equals(this.Field1122) && var6.equals(a)) {
               System.out.println("INFO: " + this.Field1123 + "." + var6 + " could be renamed");
            }

            super.Method1450(a, a, a, (String)null, a);
         } else {
            if (!var6.equals(a)) {
               throw new RuntimeException("The public or protected field " + this.Field1121 + '.' + a + " must not be renamed.");
            }

            super.Method1450(a, a, a, (String)null, a);
         }

         return null;
      }
   }

   public Class267 Method1451(int a, String a, String a, String a, String[] a) {
      String var6 = this.Field1120.Method3184(this.Field1121, a, a);
      if ("-".equals(var6)) {
         return null;
      } else if (a.equals("<clinit>") && !this.Field1124) {
         this.Field1125 = true;
         Class267 var7 = super.Method1451(a, a, a, (String)null, a);
         return new Class25(this, 327680, var7);
      } else if ((a & 5) == 0) {
         if ("awsl/asm".equals(this.Field1122) && !a.startsWith("<") && var6.equals(a)) {
            System.out.println("INFO: " + this.Field1123 + "." + var6 + " could be renamed");
         }

         return super.Method1451(a, a, a, (String)null, a);
      } else if (!var6.equals(a)) {
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
         String[] var1 = Class690.Method2342();
         Class267 var2;
         if (this.Field1126.isEmpty()) {
            if (!this.Field1125) {
               break label25;
            }

            var2 = this.Field1035.Method1451(4104, "_clinit_", "()V", (String)null, (String[])null);
            var2.Method1652();
            var2.Method1948(177);
            var2.Method1842(0, 0);
            var2.Method1653();
         }

         var2 = this.Field1035.Method1451(4104, "class$", "(Ljava/lang/String;)Ljava/lang/Class;", (String)null, (String[])null);
         var2.Method1652();
         Class264 var3 = new Class264();
         Class264 var4 = new Class264();
         Class264 var5 = new Class264();
         var2.Method1960(var3, var4, var5, "java/lang/ClassNotFoundException");
         var2.Method1947(var3);
         var2.Method1840(25, 0);
         var2.Method1954(184, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
         var2.Method1947(var4);
         var2.Method1948(176);
         var2.Method1947(var5);
         var2.Method1954(182, "java/lang/ClassNotFoundException", "getMessage", "()Ljava/lang/String;", false);
         var2.Method1840(58, 1);
         var2.Method1952(187, "java/lang/NoClassDefFoundError");
         var2.Method1948(89);
         var2.Method1840(25, 1);
         var2.Method1954(183, "java/lang/NoClassDefFoundError", "<init>", "(Ljava/lang/String;)V", false);
         var2.Method1948(191);
         var2.Method1842(3, 2);
         var2.Method1653();
         if (this.Field1125) {
            var2 = this.Field1035.Method1451(10, "_clinit_", "()V", (String)null, (String[])null);
         }

         var2 = this.Field1035.Method1451(8, "<clinit>", "()V", (String)null, (String[])null);
         Iterator var6 = this.Field1126.Method1383();
         if (var6.Method932()) {
            String var7 = (String)var6.Method933();
            String var8 = "class$" + var7.replace('/', '$');
            var2.Method1950(var7.replace('/', '.'));
            var2.Method1954(184, this.Field1123, "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
            var2.Method1949(179, this.Field1123, var8, "Ljava/lang/Class;");
         }

         var2.Method1948(177);
         var2.Method1842(1, 0);
         var2.Method1653();
      }

      super.Method1460();
   }

   private static RuntimeException Method1461(RuntimeException runtimeException) {
      return runtimeException;
   }
}
