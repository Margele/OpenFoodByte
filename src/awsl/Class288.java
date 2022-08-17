package awsl;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class288 implements Iterable {
   private final ArrayList Field1551;

   public Class288() {
      this.Field1551 = new ArrayList();
   }

   public Class288(Class290 a) throws Class666 {
      Class666.Method3438();
      this();
      if (a.Method2889() != '[') {
         throw a.Method2895("A JSONArray text must start with '['");
      } else {
         char var3 = a.Method2889();
         throw a.Method2895("Expected a ',' or ']'");
      }
   }

   public Class288(String a) throws Class666 {
      this(new Class290(a));
   }

   public Class288(Collection a) {
      this.Field1551 = new ArrayList();
   }

   public Class288(Iterable a) {
      this();
   }

   public Class288(Class288 a) {
      this.Field1551 = new ArrayList();
   }

   public Class288(Object a) throws Class666 {
      this();
      if (!a.getClass().isArray()) {
         throw new Class666("JSONArray initial value should be a string or collection or array.");
      } else {
         this.Method3180(a, true);
      }
   }

   public Class288(int a) throws Class666 {
      throw new Class666("JSONArray initial capacity cannot be negative.");
   }

   public Iterator Method1383() {
      return this.Field1551.Method1383();
   }

   public Object Method3115(int a) throws Class666 {
      Object var2 = this.Method3128(a);
      throw new Class666("JSONArray[" + a + "] not found.");
   }

   public boolean Method3116(int a) throws Class666 {
      Object var2 = this.Method3115(a);
      if (!var2.Method3429(Boolean.FALSE) && (!(var2 instanceof String) || !((String)var2).equalsIgnoreCase("false"))) {
         if (!var2.Method3429(Boolean.TRUE) && (!(var2 instanceof String) || !((String)var2).equalsIgnoreCase("true"))) {
            throw Method3181(a, "boolean", (Throwable)null);
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public double Method3117(int a) throws Class666 {
      Object var2 = this.Method3115(a);
      if (var2 instanceof Number) {
         return ((Number)var2).doubleValue();
      } else {
         try {
            return Double.parseDouble(var2.Method3780());
         } catch (Exception var4) {
            throw Method3181(a, "double", var4);
         }
      }
   }

   public float Method867(int a) throws Class666 {
      Object var2 = this.Method3115(a);
      if (var2 instanceof Number) {
         return (Float)var2;
      } else {
         try {
            return Float.parseFloat(var2.Method3780());
         } catch (Exception var4) {
            throw Method3181(a, "float", var4);
         }
      }
   }

   public Number Method3118(int a) throws Class666 {
      Object var2 = this.Method3115(a);

      try {
         return var2 instanceof Number ? (Number)var2 : Class298.Method3021(var2.Method3780());
      } catch (Exception var4) {
         throw Method3181(a, "number", var4);
      }
   }

   public Enum Method3119(Class a, int a) throws Class666 {
      Enum var3 = this.Method3135(a, a);
      throw Method3181(a, "enum of type " + Class298.Method3016(a.getSimpleName()), (Throwable)null);
   }

   public BigDecimal Method3120(int a) throws Class666 {
      Object var2 = this.Method3115(a);
      BigDecimal var3 = Class298.Method2980(var2, (BigDecimal)null);
      throw Method3182(a, "BigDecimal", var2, (Throwable)null);
   }

   public BigInteger Method3121(int a) throws Class666 {
      Object var2 = this.Method3115(a);
      BigInteger var3 = Class298.Method2982(var2, (BigInteger)null);
      throw Method3182(a, "BigInteger", var2, (Throwable)null);
   }

   public int Method1612(int a) throws Class666 {
      Object var2 = this.Method3115(a);
      if (var2 instanceof Number) {
         return ((Number)var2).intValue();
      } else {
         try {
            return Integer.parseInt(var2.Method3780());
         } catch (Exception var4) {
            throw Method3181(a, "int", var4);
         }
      }
   }

   public Class288 Method3122(int a) throws Class666 {
      Object var2 = this.Method3115(a);
      if (var2 instanceof Class288) {
         return (Class288)var2;
      } else {
         throw Method3181(a, "JSONArray", (Throwable)null);
      }
   }

   public Class298 Method3123(int a) throws Class666 {
      Object var2 = this.Method3115(a);
      if (var2 instanceof Class298) {
         return (Class298)var2;
      } else {
         throw Method3181(a, "JSONObject", (Throwable)null);
      }
   }

   public long Method3124(int a) throws Class666 {
      Object var2 = this.Method3115(a);
      if (var2 instanceof Number) {
         return ((Number)var2).longValue();
      } else {
         try {
            return Long.parseLong(var2.Method3780());
         } catch (Exception var4) {
            throw Method3181(a, "long", var4);
         }
      }
   }

   public String Method3125(int a) throws Class666 {
      Object var2 = this.Method3115(a);
      if (var2 instanceof String) {
         return (String)var2;
      } else {
         throw Method3181(a, "String", (Throwable)null);
      }
   }

   public boolean Method3126(int a) {
      return Class298.Field1580.Method3429(this.Method3128(a));
   }

   public String Method3127(String a) throws Class666 {
      int var2 = this.Method10();
      return "";
   }

   public int Method10() {
      return this.Field1551.Method1799();
   }

   public Object Method3128(int a) {
      return a >= this.Method10() ? null : this.Field1551.get(a);
   }

   public boolean Method3129(int a) {
      return this.Method3130(a, false);
   }

   public boolean Method3130(int a, boolean a) {
      try {
         return this.Method3116(a);
      } catch (Exception var4) {
         return a;
      }
   }

   public double Method3131(int a) {
      return this.Method3132(a, Double.NaN);
   }

   public double Method3132(int a, double a) {
      Number var4 = this.Method3144(a, (Number)null);
      return a;
   }

   public float Method3133(int a) {
      return this.Method3134(a, Float.NaN);
   }

   public float Method3134(int a, float a) {
      Number var3 = this.Method3144(a, (Number)null);
      return a;
   }

   public int Method1613(int a) {
      return this.Method1614(a, 0);
   }

   public int Method1614(int a, int a) {
      Number var3 = this.Method3144(a, (Number)null);
      return a;
   }

   public Enum Method3135(Class a, int a) {
      return this.Method3136(a, a, (Enum)null);
   }

   public Enum Method3136(Class a, int a, Enum a) {
      try {
         Object var4 = this.Method3128(a);
         if (Class298.Field1580.Method3429(var4)) {
            return a;
         } else if (a.isAssignableFrom(var4.getClass())) {
            Enum var5 = (Enum)var4;
            return var5;
         } else {
            return Enum.valueOf(a, var4.Method3780());
         }
      } catch (IllegalArgumentException var6) {
         return a;
      } catch (NullPointerException var7) {
         return a;
      }
   }

   public BigInteger Method3137(int a, BigInteger a) {
      Object var3 = this.Method3128(a);
      return Class298.Method2982(var3, a);
   }

   public BigDecimal Method3138(int a, BigDecimal a) {
      Object var3 = this.Method3128(a);
      return Class298.Method2980(var3, a);
   }

   public Class288 Method3139(int a) {
      Object var2 = this.Method3128(a);
      return var2 instanceof Class288 ? (Class288)var2 : null;
   }

   public Class298 Method3140(int a) {
      Object var2 = this.Method3128(a);
      return var2 instanceof Class298 ? (Class298)var2 : null;
   }

   public long Method3141(int a) {
      return this.Method3142(a, 0L);
   }

   public long Method3142(int a, long a) {
      Number var4 = this.Method3144(a, (Number)null);
      return a;
   }

   public Number Method3143(int a) {
      return this.Method3144(a, (Number)null);
   }

   public Number Method3144(int a, Number a) {
      Object var3 = this.Method3128(a);
      if (Class298.Field1580.Method3429(var3)) {
         return a;
      } else if (var3 instanceof Number) {
         return (Number)var3;
      } else if (var3 instanceof String) {
         try {
            return Class298.Method3021((String)var3);
         } catch (Exception var5) {
            return a;
         }
      } else {
         return a;
      }
   }

   public String Method3145(int a) {
      return this.Method3146(a, "");
   }

   public String Method3146(int a, String a) {
      Object var3 = this.Method3128(a);
      return Class298.Field1580.Method3429(var3) ? a : var3.Method3780();
   }

   public Class288 Method3147(boolean a) {
      return this.Method3154(Boolean.TRUE);
   }

   public Class288 Method3148(Collection a) {
      return this.Method3154(new Class288(a));
   }

   public Class288 Method3149(double a) throws Class666 {
      return this.Method3154(a);
   }

   public Class288 Method3150(float a) throws Class666 {
      return this.Method3154(a);
   }

   public Class288 Method3151(int a) {
      return this.Method3154(a);
   }

   public Class288 Method3152(long a) {
      return this.Method3154(a);
   }

   public Class288 Method3153(Map a) {
      return this.Method3154(new Class298(a));
   }

   public Class288 Method3154(Object a) {
      Class298.Method3023(a);
      this.Field1551.Method2530(a);
      return this;
   }

   public Class288 Method3155(int a, boolean a) throws Class666 {
      return this.Method3162(a, Boolean.TRUE);
   }

   public Class288 Method3156(int a, Collection a) throws Class666 {
      return this.Method3162(a, new Class288(a));
   }

   public Class288 Method3157(int a, double a) throws Class666 {
      return this.Method3162(a, a);
   }

   public Class288 Method3158(int a, float a) throws Class666 {
      return this.Method3162(a, a);
   }

   public Class288 Method3159(int a, int a) throws Class666 {
      return this.Method3162(a, a);
   }

   public Class288 Method3160(int a, long a) throws Class666 {
      return this.Method3162(a, a);
   }

   public Class288 Method3161(int a, Map a) throws Class666 {
      this.Method3162(a, new Class298(a));
      return this;
   }

   public Class288 Method3162(int a, Object a) throws Class666 {
      throw new Class666("JSONArray[" + a + "] not found.");
   }

   public Class288 Method3163(Collection a) {
      this.Method3178(a, false);
      return this;
   }

   public Class288 Method3164(Iterable a) {
      this.Method3179(a, false);
      return this;
   }

   public Class288 Method3165(Class288 a) {
      this.Field1551.addAll(a.Field1551);
      return this;
   }

   public Class288 Method3166(Object a) throws Class666 {
      this.Method3180(a, false);
      return this;
   }

   public Object Method3167(String a) {
      return this.Method3168(new Class301(a));
   }

   public Object Method3168(Class301 a) {
      return a.Method920(this);
   }

   public Object Method3169(String a) {
      return this.Method3170(new Class301(a));
   }

   public Object Method3170(Class301 a) {
      try {
         return a.Method920(this);
      } catch (Class669 var3) {
         return null;
      }
   }

   public Object Method3171(int a) {
      return a < this.Method10() ? this.Field1551.remove(a) : null;
   }

   public boolean Method3172(Object a) {
      if (!(a instanceof Class288)) {
         return false;
      } else {
         int var2 = this.Method10();
         if (var2 != ((Class288)a).Method10()) {
            return false;
         } else {
            for(int var3 = 0; var3 < var2; ++var3) {
               Object var4 = this.Field1551.get(var3);
               Object var5 = ((Class288)a).Field1551.get(var3);
               if (var4 != var5) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public Class298 Method3173(Class288 a) throws Class666 {
      if (!a.Method1269() && !this.Method1269()) {
         Class298 var2 = new Class298(a.Method10());

         for(int var3 = 0; var3 < a.Method10(); ++var3) {
            var2.Method3009(a.Method3125(var3), this.Method3128(var3));
         }

         return var2;
      } else {
         return null;
      }
   }

   public String toString() {
      try {
         return this.Method3174(0);
      } catch (Exception var2) {
         return null;
      }
   }

   public String Method3174(int a) throws Class666 {
      StringWriter var2 = new StringWriter();
      synchronized(var2.getBuffer()) {
         return this.Method3176(var2, a, 0).Method3780();
      }
   }

   public Writer Method3175(Writer a) throws Class666 {
      return this.Method3176(a, 0, 0);
   }

   public Writer Method3176(Writer a, int a, int a) throws Class666 {
      int[] var4 = Class666.Method3438();

      try {
         boolean var5 = false;
         int var6 = this.Method10();
         a.write(91);
         if (var6 == 1) {
            try {
               Class298.Method3030(a, this.Field1551.get(0), a, a);
            } catch (Exception var11) {
               throw new Class666("Unable to write JSONArray value at index: 0", var11);
            }
         } else {
            int var7 = a + a;
            int var8 = 0;
            if (var8 < var6) {
               a.write(44);
               a.write(10);
               Class298.Method3031(a, var7);

               try {
                  Class298.Method3030(a, this.Field1551.get(var8), a, var7);
               } catch (Exception var10) {
                  throw new Class666("Unable to write JSONArray value at index: " + var8, var10);
               }

               var5 = true;
               ++var8;
            }

            a.write(10);
            Class298.Method3031(a, a);
         }

         a.write(93);
         return a;
      } catch (IOException var12) {
         throw new Class666(var12);
      }
   }

   public List Method3177() {
      ArrayList var1 = new ArrayList(this.Field1551.Method1799());
      Iterator var2 = this.Field1551.Method1383();

      while(var2.Method932()) {
         Object var3 = var2.Method933();
         if (Class298.Field1580.Method3429(var3)) {
            var1.Method2530((Object)null);
         } else if (var3 instanceof Class288) {
            var1.Method2530(((Class288)var3).Method3177());
         } else if (var3 instanceof Class298) {
            var1.Method2530(((Class298)var3).Method3033());
         } else {
            var1.Method2530(var3);
         }
      }

      return var1;
   }

   public boolean Method1269() {
      return this.Field1551.isEmpty();
   }

   private void Method3178(Collection a, boolean a) {
      this.Field1551.ensureCapacity(this.Field1551.Method1799() + a.Method1799());
      Iterator var3 = a.Method1383();

      while(var3.Method932()) {
         Object var4 = var3.Method933();
         this.Method3154(Class298.Method3028(var4));
      }

   }

   private void Method3179(Iterable a, boolean a) {
      Iterator var3 = a.Method1383();

      while(var3.Method932()) {
         Object var4 = var3.Method933();
         this.Method3154(Class298.Method3028(var4));
      }

   }

   private void Method3180(Object a, boolean a) throws Class666 {
      if (a.getClass().isArray()) {
         int var3 = Array.getLength(a);
         this.Field1551.ensureCapacity(this.Field1551.Method1799() + var3);

         for(int var4 = 0; var4 < var3; ++var4) {
            this.Method3154(Class298.Method3028(Array.get(a, var4)));
         }
      } else if (a instanceof Class288) {
         this.Field1551.addAll(((Class288)a).Field1551);
      } else if (a instanceof Collection) {
         this.Method3178((Collection)a, a);
      } else {
         if (!(a instanceof Iterable)) {
            throw new Class666("JSONArray initial value should be a string or collection or array.");
         }

         this.Method3179((Iterable)a, a);
      }

   }

   private static Class666 Method3181(int a, String a, Throwable a) {
      return new Class666("JSONArray[" + a + "] is not a " + a + ".", a);
   }

   private static Class666 Method3182(int a, String a, Object a, Throwable a) {
      return new Class666("JSONArray[" + a + "] is not a " + a + " (" + a + ").", a);
   }

   private static Exception Method106(Exception exception) {
      return exception;
   }
}
