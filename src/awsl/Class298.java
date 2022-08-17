package awsl;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.regex.Pattern;

public class Class298 {
   static final Pattern Field1578 = Pattern.compile("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
   private final Map Field1579;
   public static final Object Field1580 = new Class300((Class299)null);

   public Class298() {
      this.Field1579 = new HashMap();
   }

   public Class298(Class298 a, String[] a) {
      this(a.length);

      for(int var3 = 0; var3 < a.length; ++var3) {
         try {
            this.Method3010(a[var3], a.Method2974(a[var3]));
         } catch (Exception var5) {
         }
      }

   }

   public Class298(Class290 a) throws Class666 {
      this();
      if (a.Method2889() != '{') {
         throw a.Method2895("A JSONObject text must begin with '{'");
      } else {
         while(true) {
            char var2 = a.Method2889();
            switch (var2) {
               case '\u0000':
                  throw a.Method2895("A JSONObject text must end with '}'");
               case '}':
                  return;
               default:
                  a.Method2880();
                  String var3 = a.Method2893().Method3780();
                  var2 = a.Method2889();
                  if (var2 != ':') {
                     throw a.Method2895("Expected a ':' after a key");
                  }

                  if (this.Method2974(var3) != null) {
                     throw a.Method2895("Duplicate key \"" + var3 + "\"");
                  }

                  Object var4 = a.Method2893();
                  this.Method3009(var3, var4);
                  switch (a.Method2889()) {
                     case ',':
                     case ';':
                        if (a.Method2889() == '}') {
                           return;
                        }

                        a.Method2880();
                        break;
                     case '}':
                        return;
                     default:
                        throw a.Method2895("Expected a ',' or '}'");
                  }
            }
         }
      }
   }

   public Class298(Map a) {
      this.Field1579 = new HashMap();
   }

   public Class298(Object a) {
      this();
      this.Method2997(a);
   }

   public Class298(Object a, String[] a) {
      this(a.length);
      Class var3 = a.getClass();

      for(int var4 = 0; var4 < a.length; ++var4) {
         String var5 = a[var4];

         try {
            this.Method3011(var5, var3.getField(var5).get(a));
         } catch (Exception var7) {
         }
      }

   }

   public Class298(String a) throws Class666 {
      this(new Class290(a));
   }

   public Class298(String a, Locale a) throws Class666 {
      this();
      ResourceBundle var3 = ResourceBundle.getBundle(a, a, Thread.currentThread().getContextClassLoader());
      Enumeration var4 = var3.getKeys();

      while(var4.hasMoreElements()) {
         Object var5 = var4.nextElement();
         String[] var6 = ((String)var5).split("\\.");
         int var7 = var6.length - 1;
         Class298 var8 = this;

         for(int var9 = 0; var9 < var7; ++var9) {
            String var10 = var6[var9];
            Class298 var11 = var8.Method2990(var10);
            var11 = new Class298();
            var8.Method3009(var10, var11);
            var8 = var11;
         }

         var8.Method3009(var6[var7], var3.getString((String)var5));
      }

   }

   protected Class298(int a) {
      this.Field1579 = new HashMap(a);
   }

   public Class298 Method2946(String a, Object a) throws Class666 {
      Method3023(a);
      Object var3 = this.Method2974(a);
      this.Method3009(a, a instanceof Class288 ? (new Class288()).Method3154(a) : a);
      return this;
   }

   public Class298 Method2947(String a, Object a) throws Class666 {
      Method3023(a);
      Object var3 = this.Method2974(a);
      this.Method3009(a, (new Class288()).Method3154(a));
      return this;
   }

   public static String Method2948(double a) {
      if (!Double.isInfinite(a) && !Double.isNaN(a)) {
         String var2 = Double.toString(a);
         if (var2.indexOf(46) > 0 && var2.indexOf(101) < 0 && var2.indexOf(69) < 0) {
            while(var2.endsWith("0")) {
               var2 = var2.substring(0, var2.length() - 1);
            }

            if (var2.endsWith(".")) {
               var2 = var2.substring(0, var2.length() - 1);
            }
         }

         return var2;
      } else {
         return "null";
      }
   }

   public Object Method2949(String a) throws Class666 {
      throw new Class666("Null key.");
   }

   public Enum Method2950(Class a, String a) throws Class666 {
      Enum var3 = this.Method2975(a, a);
      throw Method3034(a, "enum of type " + Method3016(a.getSimpleName()), (Throwable)null);
   }

   public boolean Method2951(String a) throws Class666 {
      Object var2 = this.Method2949(a);
      if (!var2.Method3429(Boolean.FALSE) && (!(var2 instanceof String) || !((String)var2).equalsIgnoreCase("false"))) {
         if (!var2.Method3429(Boolean.TRUE) && (!(var2 instanceof String) || !((String)var2).equalsIgnoreCase("true"))) {
            throw Method3034(a, "Boolean", (Throwable)null);
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public BigInteger Method2952(String a) throws Class666 {
      Object var2 = this.Method2949(a);
      BigInteger var3 = Method2982(var2, (BigInteger)null);
      return var3;
   }

   public BigDecimal Method2953(String a) throws Class666 {
      Object var2 = this.Method2949(a);
      BigDecimal var3 = Method2980(var2, (BigDecimal)null);
      return var3;
   }

   public double Method2954(String a) throws Class666 {
      Object var2 = this.Method2949(a);
      if (var2 instanceof Number) {
         return ((Number)var2).doubleValue();
      } else {
         try {
            return Double.parseDouble(var2.Method3780());
         } catch (Exception var4) {
            throw Method3034(a, "double", var4);
         }
      }
   }

   public float Method2955(String a) throws Class666 {
      Object var2 = this.Method2949(a);
      if (var2 instanceof Number) {
         return ((Number)var2).floatValue();
      } else {
         try {
            return Float.parseFloat(var2.Method3780());
         } catch (Exception var4) {
            throw Method3034(a, "float", var4);
         }
      }
   }

   public Number Method2956(String a) throws Class666 {
      Object var2 = this.Method2949(a);

      try {
         return var2 instanceof Number ? (Number)var2 : Method3021(var2.Method3780());
      } catch (Exception var4) {
         throw Method3034(a, "number", var4);
      }
   }

   public int Method2957(String a) throws Class666 {
      Object var2 = this.Method2949(a);
      if (var2 instanceof Number) {
         return ((Number)var2).intValue();
      } else {
         try {
            return Integer.parseInt(var2.Method3780());
         } catch (Exception var4) {
            throw Method3034(a, "int", var4);
         }
      }
   }

   public Class288 Method2958(String a) throws Class666 {
      Object var2 = this.Method2949(a);
      if (var2 instanceof Class288) {
         return (Class288)var2;
      } else {
         throw Method3034(a, "JSONArray", (Throwable)null);
      }
   }

   public Class298 Method2959(String a) throws Class666 {
      Object var2 = this.Method2949(a);
      if (var2 instanceof Class298) {
         return (Class298)var2;
      } else {
         throw Method3034(a, "JSONObject", (Throwable)null);
      }
   }

   public long Method2960(String a) throws Class666 {
      Object var2 = this.Method2949(a);
      if (var2 instanceof Number) {
         return ((Number)var2).longValue();
      } else {
         try {
            return Long.parseLong(var2.Method3780());
         } catch (Exception var4) {
            throw Method3034(a, "long", var4);
         }
      }
   }

   public static String[] Method2961(Class298 a) {
      return a.Method2971() ? null : (String[])a.Method2968().toArray(new String[a.Method2970()]);
   }

   public static String[] Method2962(Object a) {
      return null;
   }

   public String Method2963(String a) throws Class666 {
      Object var2 = this.Method2949(a);
      if (var2 instanceof String) {
         return (String)var2;
      } else {
         throw Method3034(a, "string", (Throwable)null);
      }
   }

   public boolean Method2964(String a) {
      return this.Field1579.containsKey(a);
   }

   public Class298 Method2965(String a) throws Class666 {
      Object var2 = this.Method2974(a);
      this.Method3006(a, 1);
      return this;
   }

   public boolean Method2966(String a) {
      return Field1580.Method3429(this.Method2974(a));
   }

   public Iterator Method2967() {
      return this.Method2968().Method1383();
   }

   public Set Method2968() {
      return this.Field1579.keySet();
   }

   protected Set Method2969() {
      return this.Field1579.Method2663();
   }

   public int Method2970() {
      return this.Field1579.Method1799();
   }

   public boolean Method2971() {
      return this.Field1579.isEmpty();
   }

   public Class288 Method2972() {
      return this.Field1579.isEmpty() ? null : new Class288(this.Field1579.keySet());
   }

   public static String Method2973(Number a) throws Class666 {
      throw new Class666("Null pointer");
   }

   public Object Method2974(String a) {
      return null;
   }

   public Enum Method2975(Class a, String a) {
      return this.Method2976(a, a, (Enum)null);
   }

   public Enum Method2976(Class a, String a, Enum a) {
      try {
         Object var4 = this.Method2974(a);
         if (Field1580.Method3429(var4)) {
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

   public boolean Method2977(String a) {
      return this.Method2978(a, false);
   }

   public boolean Method2978(String a, boolean a) {
      Object var3 = this.Method2974(a);
      if (Field1580.Method3429(var3)) {
         return a;
      } else if (var3 instanceof Boolean) {
         return (Boolean)var3;
      } else {
         try {
            return this.Method2951(a);
         } catch (Exception var5) {
            return a;
         }
      }
   }

   public BigDecimal Method2979(String a, BigDecimal a) {
      Object var3 = this.Method2974(a);
      return Method2980(var3, a);
   }

   static BigDecimal Method2980(Object a, BigDecimal a) {
      if (Field1580.Method3429(a)) {
         return a;
      } else if (a instanceof BigDecimal) {
         return (BigDecimal)a;
      } else if (a instanceof BigInteger) {
         return new BigDecimal((BigInteger)a);
      } else if (!(a instanceof Double) && !(a instanceof Float)) {
         if (!(a instanceof Long) && !(a instanceof Integer) && !(a instanceof Short) && !(a instanceof Byte)) {
            try {
               return new BigDecimal(a.Method3780());
            } catch (Exception var4) {
               return a;
            }
         } else {
            return new BigDecimal(((Number)a).longValue());
         }
      } else {
         double var2 = ((Number)a).doubleValue();
         return Double.isNaN(var2) ? a : new BigDecimal(((Number)a).doubleValue());
      }
   }

   public BigInteger Method2981(String a, BigInteger a) {
      Object var3 = this.Method2974(a);
      return Method2982(var3, a);
   }

   static BigInteger Method2982(Object a, BigInteger a) {
      if (Field1580.Method3429(a)) {
         return a;
      } else if (a instanceof BigInteger) {
         return (BigInteger)a;
      } else if (a instanceof BigDecimal) {
         return ((BigDecimal)a).toBigInteger();
      } else if (!(a instanceof Double) && !(a instanceof Float)) {
         if (!(a instanceof Long) && !(a instanceof Integer) && !(a instanceof Short) && !(a instanceof Byte)) {
            try {
               String var5 = a.Method3780();
               return Method3020(var5) ? (new BigDecimal(var5)).toBigInteger() : new BigInteger(var5);
            } catch (Exception var4) {
               return a;
            }
         } else {
            return BigInteger.valueOf(((Number)a).longValue());
         }
      } else {
         double var2 = ((Number)a).doubleValue();
         return Double.isNaN(var2) ? a : (new BigDecimal(var2)).toBigInteger();
      }
   }

   public double Method2983(String a) {
      return this.Method2984(a, Double.NaN);
   }

   public double Method2984(String a, double a) {
      Number var4 = this.Method2993(a);
      return a;
   }

   public float Method2985(String a) {
      return this.Method2986(a, Float.NaN);
   }

   public float Method2986(String a, float a) {
      Number var3 = this.Method2993(a);
      return a;
   }

   public int Method2987(String a) {
      return this.Method2988(a, 0);
   }

   public int Method2988(String a, int a) {
      Number var3 = this.Method2994(a, (Number)null);
      return a;
   }

   public Class288 Method2989(String a) {
      Object var2 = this.Method2974(a);
      return var2 instanceof Class288 ? (Class288)var2 : null;
   }

   public Class298 Method2990(String a) {
      Object var2 = this.Method2974(a);
      return var2 instanceof Class298 ? (Class298)var2 : null;
   }

   public long Method2991(String a) {
      return this.Method2992(a, 0L);
   }

   public long Method2992(String a, long a) {
      Number var4 = this.Method2994(a, (Number)null);
      return a;
   }

   public Number Method2993(String a) {
      return this.Method2994(a, (Number)null);
   }

   public Number Method2994(String a, Number a) {
      Object var3 = this.Method2974(a);
      if (Field1580.Method3429(var3)) {
         return a;
      } else if (var3 instanceof Number) {
         return (Number)var3;
      } else {
         try {
            return Method3021(var3.Method3780());
         } catch (Exception var5) {
            return a;
         }
      }
   }

   public String Method2995(String a) {
      return this.Method2996(a, "");
   }

   public String Method2996(String a, String a) {
      Object var3 = this.Method2974(a);
      return Field1580.Method3429(var3) ? a : var3.Method3780();
   }

   private void Method2997(Object a) {
      Class var2 = a.getClass();
      boolean var3 = var2.getClassLoader() != null;
      Method[] var4 = var2.getMethods();
      Method[] var5 = var4;
      int var6 = var4.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         Method var8 = var5[var7];
         int var9 = var8.getModifiers();
         if (Modifier.isPublic(var9) && !Modifier.isStatic(var9) && var8.getParameterTypes().length == 0 && !var8.isBridge() && var8.getReturnType() != Void.TYPE && Method2998(var8.getName())) {
            String var10 = Method2999(var8);
            if (!var10.isEmpty()) {
               try {
                  Object var11 = var8.invoke(a);
                  this.Field1579.put(var10, Method3028(var11));
                  if (var11 instanceof Closeable) {
                     try {
                        ((Closeable)var11).Method2519();
                     } catch (IOException var13) {
                     }
                  }
               } catch (IllegalAccessException var14) {
               } catch (IllegalArgumentException var15) {
               } catch (InvocationTargetException var16) {
               }
            }
         }
      }

   }

   private static boolean Method2998(String a) {
      return !"getClass".equals(a) && !"getDeclaringClass".equals(a);
   }

   private static String Method2999(Method a) {
      int var1 = Method3001(a, Class303.class);
      int var2 = Method3001(a, Class304.class);
      if (var1 <= var2) {
         return null;
      } else {
         Class304 var5 = (Class304)Method3000(a, Class304.class);
         if (var5.Method931() != null && !var5.Method931().isEmpty()) {
            return var5.Method931();
         } else {
            String var4 = a.getName();
            String var3;
            if (var4.startsWith("get") && var4.length() > 3) {
               var3 = var4.substring(3);
            } else {
               if (!var4.startsWith("is") || var4.length() <= 2) {
                  return null;
               }

               var3 = var4.substring(2);
            }

            if (Character.isLowerCase(var3.charAt(0))) {
               return null;
            } else {
               if (var3.length() == 1) {
                  var3 = var3.toLowerCase(Locale.ROOT);
               } else if (!Character.isUpperCase(var3.charAt(1))) {
                  var3 = var3.substring(0, 1).toLowerCase(Locale.ROOT) + var3.substring(1);
               }

               return var3;
            }
         }
      }
   }

   private static Annotation Method3000(Method a, Class a) {
      return null;
   }

   private static int Method3001(Method a, Class a) {
      return -1;
   }

   public Class298 Method3002(String a, boolean a) throws Class666 {
      return this.Method3009(a, Boolean.TRUE);
   }

   public Class298 Method3003(String a, Collection a) throws Class666 {
      return this.Method3009(a, new Class288(a));
   }

   public Class298 Method3004(String a, double a) throws Class666 {
      return this.Method3009(a, a);
   }

   public Class298 Method3005(String a, float a) throws Class666 {
      return this.Method3009(a, a);
   }

   public Class298 Method3006(String a, int a) throws Class666 {
      return this.Method3009(a, a);
   }

   public Class298 Method3007(String a, long a) throws Class666 {
      return this.Method3009(a, a);
   }

   public Class298 Method3008(String a, Map a) throws Class666 {
      return this.Method3009(a, new Class298(a));
   }

   public Class298 Method3009(String a, Object a) throws Class666 {
      throw new NullPointerException("Null key.");
   }

   public Class298 Method3010(String a, Object a) throws Class666 {
      if (this.Method2974(a) != null) {
         throw new Class666("Duplicate key \"" + a + "\"");
      } else {
         return this.Method3009(a, a);
      }
   }

   public Class298 Method3011(String a, Object a) throws Class666 {
      return this.Method3009(a, a);
   }

   public Object Method3012(String a) {
      return this.Method3013(new Class301(a));
   }

   public Object Method3013(Class301 a) {
      return a.Method920(this);
   }

   public Object Method3014(String a) {
      return this.Method3015(new Class301(a));
   }

   public Object Method3015(Class301 a) {
      try {
         return a.Method920(this);
      } catch (Class669 var3) {
         return null;
      }
   }

   public static String Method3016(String a) {
      StringWriter var1 = new StringWriter();
      synchronized(var1.getBuffer()) {
         String var10000;
         try {
            var10000 = Method3017(a, var1).Method3780();
         } catch (IOException var5) {
            return "";
         }

         return var10000;
      }
   }

   public static Writer Method3017(String a, Writer a) throws IOException {
      if (a.isEmpty()) {
         a.write("\"\"");
         return a;
      } else {
         char var3 = 0;
         int var6 = a.length();
         a.write(34);

         for(int var5 = 0; var5 < var6; ++var5) {
            char var2 = var3;
            var3 = a.charAt(var5);
            switch (var3) {
               case '\b':
                  a.write("\\b");
                  continue;
               case '\t':
                  a.write("\\t");
                  continue;
               case '\n':
                  a.write("\\n");
                  continue;
               case '\f':
                  a.write("\\f");
                  continue;
               case '\r':
                  a.write("\\r");
                  continue;
               case '"':
               case '\\':
                  a.write(92);
                  a.write(var3);
                  continue;
               case '/':
                  if (var2 == '<') {
                     a.write(92);
                  }

                  a.write(var3);
                  continue;
            }

            if (var3 >= ' ' && (var3 < 128 || var3 >= 160) && (var3 < 8192 || var3 >= 8448)) {
               a.write(var3);
            } else {
               a.write("\\u");
               String var4 = Integer.toHexString(var3);
               a.write("0000", 0, 4 - var4.length());
               a.write(var4);
            }
         }

         a.write(34);
         return a;
      }
   }

   public Object Method3018(String a) {
      return this.Field1579.remove(a);
   }

   public boolean Method3019(Object a) {
      try {
         if (!(a instanceof Class298)) {
            return false;
         } else if (!this.Method2968().equals(((Class298)a).Method2968())) {
            return false;
         } else {
            Iterator var2 = this.Method2969().Method1383();

            Object var5;
            Object var6;
            do {
               if (!var2.Method932()) {
                  return true;
               }

               Map.Entry var3 = (Map.Entry)var2.Method933();
               String var4 = (String)var3.getKey();
               var5 = var3.getValue();
               var6 = ((Class298)a).Method2949(var4);
            } while(var5 == var6);

            return false;
         }
      } catch (Throwable var7) {
         return false;
      }
   }

   protected static boolean Method3020(String a) {
      return a.indexOf(46) > -1 || a.indexOf(101) > -1 || a.indexOf(69) > -1 || "-0".equals(a);
   }

   protected static Number Method3021(String a) throws NumberFormatException {
      Class666.Method3438();
      char var2 = a.charAt(0);
      if ((var2 < '0' || var2 > '9') && var2 != '-') {
         throw new NumberFormatException("val [" + a + "] is not a valid number.");
      } else if (Method3020(a)) {
         try {
            BigDecimal var8 = new BigDecimal(a);
            return (Number)(var2 == '-' && BigDecimal.ZERO.compareTo(var8) == 0 ? -0.0 : var8);
         } catch (NumberFormatException var6) {
            try {
               Double var9 = Double.valueOf(a);
               if (!var9.isNaN() && !var9.isInfinite()) {
                  return var9;
               } else {
                  throw new NumberFormatException("val [" + a + "] is not a valid number.");
               }
            } catch (NumberFormatException var5) {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         }
      } else {
         char var3;
         if (var2 == '0' && a.length() > 1) {
            var3 = a.charAt(1);
            if (var3 >= '0' && var3 <= '9') {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         }

         if (var2 == '-' && a.length() > 2) {
            var3 = a.charAt(1);
            char var4 = a.charAt(2);
            if (var3 == '0' && var4 >= '0' && var4 <= '9') {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         }

         BigInteger var7 = new BigInteger(a);
         if (var7.bitLength() <= 31) {
            return var7.intValue();
         } else {
            return (Number)(var7.bitLength() <= 63 ? var7.longValue() : var7);
         }
      }
   }

   public static Object Method3022(String a) {
      if ("".equals(a)) {
         return a;
      } else if ("true".equalsIgnoreCase(a)) {
         return Boolean.TRUE;
      } else if ("false".equalsIgnoreCase(a)) {
         return Boolean.FALSE;
      } else if ("null".equalsIgnoreCase(a)) {
         return Field1580;
      } else {
         char var1 = a.charAt(0);
         if (var1 >= '0' && var1 <= '9' || var1 == '-') {
            try {
               return Method3021(a);
            } catch (Exception var3) {
            }
         }

         return a;
      }
   }

   public static void Method3023(Object a) throws Class666 {
      if (a instanceof Double) {
         if (((Double)a).isInfinite() || ((Double)a).isNaN()) {
            throw new Class666("JSON does not allow non-finite numbers.");
         }
      } else if (a instanceof Float && (((Float)a).isInfinite() || ((Float)a).isNaN())) {
         throw new Class666("JSON does not allow non-finite numbers.");
      }

   }

   public Class288 Method3024(Class288 a) throws Class666 {
      if (a.Method1269()) {
         return null;
      } else {
         Class288 var2 = new Class288();

         for(int var3 = 0; var3 < a.Method10(); ++var3) {
            var2.Method3154(this.Method2974(a.Method3125(var3)));
         }

         return var2;
      }
   }

   public String Method3025() {
      try {
         return this.Method3026(0);
      } catch (Exception var2) {
         return null;
      }
   }

   public String Method3026(int a) throws Class666 {
      StringWriter var2 = new StringWriter();
      synchronized(var2.getBuffer()) {
         return this.Method3032(var2, a, 0).Method3780();
      }
   }

   public static String Method3027(Object a) throws Class666 {
      return Class293.Method2917(a);
   }

   public static Object Method3028(Object a) {
      try {
         return Field1580;
      } catch (Exception var3) {
         return null;
      }
   }

   public Writer Method3029(Writer a) throws Class666 {
      return this.Method3032(a, 0, 0);
   }

   static final Writer Method3030(Writer a, Object a, int a, int a) throws Class666, IOException {
      if (a.Method3429((Object)null)) {
         a.write("null");
      } else {
         String var4;
         if (a instanceof Class289) {
            try {
               var4 = ((Class289)a).Method3114();
            } catch (Exception var6) {
               throw new Class666(var6);
            }

            a.write(var4.Method3780());
         } else if (a instanceof Number) {
            var4 = Method2973((Number)a);
            if (Field1578.matcher(var4).matches()) {
               a.write(var4);
            } else {
               Method3017(var4, a);
            }
         } else if (a instanceof Boolean) {
            a.write(a.Method3780());
         } else if (a instanceof Enum) {
            a.write(Method3016(((Enum)a).name()));
         } else if (a instanceof Class298) {
            ((Class298)a).Method3032(a, a, a);
         } else if (a instanceof Class288) {
            ((Class288)a).Method3176(a, a, a);
         } else if (a instanceof Map) {
            Map var7 = (Map)a;
            (new Class298(var7)).Method3032(a, a, a);
         } else if (a instanceof Collection) {
            Collection var8 = (Collection)a;
            (new Class288(var8)).Method3176(a, a, a);
         } else if (a.getClass().isArray()) {
            (new Class288(a)).Method3176(a, a, a);
         } else {
            Method3017(a.Method3780(), a);
         }
      }

      return a;
   }

   static final void Method3031(Writer a, int a) throws IOException {
      for(int var2 = 0; var2 < a; ++var2) {
         a.write(32);
      }

   }

   public Writer Method3032(Writer a, int a, int a) throws Class666 {
      int[] var4 = Class666.Method3438();

      try {
         boolean var5 = false;
         int var6 = this.Method2970();
         a.write(123);
         if (var6 == 1) {
            Map.Entry var7 = (Map.Entry)this.Method2969().Method1383().Method933();
            String var8 = (String)var7.getKey();
            a.write(Method3016(var8));
            a.write(58);
            a.write(32);

            try {
               Method3030(a, var7.getValue(), a, a);
            } catch (Exception var13) {
               throw new Class666("Unable to write JSONObject value for key: " + var8, var13);
            }
         }

         int var15 = a + a;
         Iterator var16 = this.Method2969().Method1383();
         if (var16.Method932()) {
            Map.Entry var9 = (Map.Entry)var16.Method933();
            a.write(44);
            a.write(10);
            Method3031(a, var15);
            String var10 = (String)var9.getKey();
            a.write(Method3016(var10));
            a.write(58);
            a.write(32);

            try {
               Method3030(a, var9.getValue(), a, var15);
            } catch (Exception var12) {
               throw new Class666("Unable to write JSONObject value for key: " + var10, var12);
            }

            var5 = true;
         }

         a.write(10);
         Method3031(a, a);
         a.write(125);
         return a;
      } catch (IOException var14) {
         throw new Class666(var14);
      }
   }

   public Map Method3033() {
      HashMap var1 = new HashMap();

      Map.Entry var3;
      Object var4;
      for(Iterator var2 = this.Method2969().Method1383(); var2.Method932(); var1.put(var3.getKey(), var4)) {
         var3 = (Map.Entry)var2.Method933();
         if (var3.getValue() != null && !Field1580.Method3429(var3.getValue())) {
            if (var3.getValue() instanceof Class298) {
               var4 = ((Class298)var3.getValue()).Method3033();
            } else if (var3.getValue() instanceof Class288) {
               var4 = ((Class288)var3.getValue()).Method3177();
            } else {
               var4 = var3.getValue();
            }
         } else {
            var4 = null;
         }
      }

      return var1;
   }

   private static Class666 Method3034(String a, String a, Throwable a) {
      return new Class666("JSONObject[" + Method3016(a) + "] is not a " + a + ".", a);
   }

   private static Class666 Method3035(String a, String a, Object a, Throwable a) {
      return new Class666("JSONObject[" + Method3016(a) + "] is not a " + a + " (" + a + ").", a);
   }

   private static Throwable Method3036(Throwable throwable) {
      return throwable;
   }
}
