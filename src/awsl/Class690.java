package awsl;

import java.util.HashMap;
import obfuscate.b;

public class Class690 extends HashMap {
   private final Class52 Field2979 = new Class52();
   private final Class52 Field2980 = new Class52();
   private final Class52 Field2981 = new Class52();
   private final Class52 Field2982 = new Class52();
   private final Class52 Field2983 = new Class52();
   private static String[] Field2984;

   public Class52 Method2492(int a) {
      this.Field2979.Method3186(a);
      Class52 a = this.Method2506(this.Field2979);
      a = new Class52(this.Field2979);
      this.Method2507(a);
      return a;
   }

   public Class52 Method2493(float a) {
      this.Field2979.Method3188(a);
      Class52 a = this.Method2506(this.Field2979);
      a = new Class52(this.Field2979);
      this.Method2507(a);
      return a;
   }

   public Class52 Method2494(long a) {
      this.Field2979.Method3187(a);
      Class52 a = this.Method2506(this.Field2979);
      a = new Class52(this.Field2979);
      this.Method2507(a);
      return a;
   }

   public Class52 Method2495(double a) {
      this.Field2979.Method3189(a);
      Class52 a = this.Method2506(this.Field2979);
      a = new Class52(this.Field2979);
      this.Method2507(a);
      return a;
   }

   public Class52 Method2496(String a) {
      this.Field2979.Method3190('s', a, (String)null, (String)null);
      Class52 a = this.Method2506(this.Field2979);
      a = new Class52(this.Field2979);
      this.Method2507(a);
      return a;
   }

   private Class52 Method2497(String a) {
      this.Field2980.Method3190('S', a, (String)null, (String)null);
      Class52 a = this.Method2506(this.Field2980);
      this.Method2496(a);
      a = new Class52(this.Field2980);
      this.Method2507(a);
      return a;
   }

   public Class52 Method2498(String a) {
      this.Field2980.Method3190('C', a, (String)null, (String)null);
      Class52 a = this.Method2506(this.Field2980);
      this.Method2496(a);
      a = new Class52(this.Field2980);
      this.Method2507(a);
      return a;
   }

   public Class52 Method2499(String a) {
      this.Field2980.Method3190('t', a, (String)null, (String)null);
      Class52 a = this.Method2506(this.Field2980);
      this.Method2496(a);
      a = new Class52(this.Field2980);
      this.Method2507(a);
      return a;
   }

   public Class52 Method2500(int a, String a, String a, String a) {
      Method2342();
      this.Field2982.Method3190((char)(103 + a), a, a, a);
      Class52 a = this.Method2506(this.Field2982);
      if (a <= 4) {
         this.Method2502(a, a, a);
      }

      this.Method2503(a, a, a, a == 9);
      a = new Class52(this.Field2982);
      this.Method2507(a);
      return a;
   }

   public Class52 Method2501(Object a) {
      if (a instanceof Integer) {
         int a = (Integer)a;
         return this.Method2492(a);
      } else if (a instanceof Float) {
         float a = (Float)a;
         return this.Method2493(a);
      } else if (a instanceof Long) {
         long a = (Long)a;
         return this.Method2494(a);
      } else if (a instanceof Double) {
         double a = (Double)a;
         return this.Method2495(a);
      } else if (a instanceof String) {
         return this.Method2497((String)a);
      } else if (a instanceof b) {
         b a = (b)a;
         int a = a.Method3217();
         if (a == 10) {
            return this.Method2498(a.Method3221());
         } else {
            return a == 11 ? this.Method2499(a.Method3225()) : this.Method2498(a.Method3225());
         }
      } else if (a instanceof Class279) {
         Class279 a = (Class279)a;
         return this.Method2500(a.Method2820(), a.Method2821(), a.Method2822(), a.Method2823());
      } else {
         throw new IllegalArgumentException("value " + a);
      }
   }

   public Class52 Method2502(String a, String a, String a) {
      this.Field2981.Method3190('G', a, a, a);
      Class52 a = this.Method2506(this.Field2981);
      this.Method2498(a);
      this.Method2505(a, a);
      a = new Class52(this.Field2981);
      this.Method2507(a);
      return a;
   }

   public Class52 Method2503(String a, String a, String a, boolean a3) {
      this.Field2981.Method3190('N', a, a, a);
      Class52 a = this.Method2506(this.Field2981);
      this.Method2498(a);
      this.Method2505(a, a);
      a = new Class52(this.Field2981);
      this.Method2507(a);
      return a;
   }

   public Class52 Method2504(String a, String a, Class279 a, Object[] a) {
      Method2342();
      this.Field2983.Method3191(a, a, a, a);
      Class52 a = this.Method2506(this.Field2983);
      this.Method2505(a, a);
      this.Method2500(a.Method2820(), a.Method2821(), a.Method2822(), a.Method2823());
      int a = 0;
      if (a < a.length) {
         this.Method2501(a[a]);
         ++a;
      }

      a = new Class52(this.Field2983);
      this.Method2507(a);
      return a;
   }

   public Class52 Method2505(String a, String a) {
      this.Field2980.Method3190('T', a, a, (String)null);
      Class52 a = this.Method2506(this.Field2980);
      this.Method2496(a);
      this.Method2496(a);
      a = new Class52(this.Field2980);
      this.Method2507(a);
      return a;
   }

   private Class52 Method2506(Class52 a) {
      return (Class52)this.Method2665(a);
   }

   private void Method2507(Class52 a) {
      this.put(a, a);
   }

   public static void Method2341(String[] arr) {
      Field2984 = arr;
   }

   public static String[] Method2342() {
      return Field2984;
   }

   private static IllegalArgumentException Method2508(IllegalArgumentException illegalArgumentException) {
      return illegalArgumentException;
   }

   static {
      if (Method2342() != null) {
         Method2341(new String[3]);
      }

   }
}
