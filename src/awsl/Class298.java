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

      for(int a = 0; a < a.length; ++a) {
         try {
            this.Method3010(a[a], a.Method2974(a[a]));
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
            char a = a.Method2889();
            switch (a) {
               case '\u0000':
                  throw a.Method2895("A JSONObject text must end with '}'");
               case '}':
                  return;
               default:
                  a.Method2880();
                  String a = a.Method2893().Method3780();
                  a = a.Method2889();
                  if (a != ':') {
                     throw a.Method2895("Expected a ':' after a key");
                  }

                  if (this.Method2974(a) != null) {
                     throw a.Method2895("Duplicate key \"" + a + "\"");
                  }

                  Object a = a.Method2893();
                  this.Method3009(a, a);
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
      Class a = a.getClass();

      for(int a = 0; a < a.length; ++a) {
         String a = a[a];

         try {
            this.Method3011(a, a.getField(a).get(a));
         } catch (Exception var7) {
         }
      }

   }

   public Class298(String a) throws Class666 {
      this(new Class290(a));
   }

   public Class298(String a, Locale a) throws Class666 {
      this();
      ResourceBundle a = ResourceBundle.getBundle(a, a, Thread.currentThread().getContextClassLoader());
      Enumeration a = a.getKeys();

      while(a.hasMoreElements()) {
         Object a = a.nextElement();
         String[] a = ((String)a).split("\\.");
         int a = a.length - 1;
         Class298 a = this;

         for(int a = 0; a < a; ++a) {
            String a = a[a];
            Class298 a = a.Method2990(a);
            a = new Class298();
            a.Method3009(a, a);
            a = a;
         }

         a.Method3009(a[a], a.getString((String)a));
      }

   }

   protected Class298(int a) {
      this.Field1579 = new HashMap(a);
   }

   public Class298 Method2946(String a, Object a) throws Class666 {
      Method3023(a);
      Object a = this.Method2974(a);
      this.Method3009(a, a instanceof Class288 ? (new Class288()).Method3154(a) : a);
      return this;
   }

   public Class298 Method2947(String a, Object a) throws Class666 {
      Method3023(a);
      Object a = this.Method2974(a);
      this.Method3009(a, (new Class288()).Method3154(a));
      return this;
   }

   public static String Method2948(double a) {
      if (!Double.isInfinite(a) && !Double.isNaN(a)) {
         String a = Double.toString(a);
         if (a.indexOf(46) > 0 && a.indexOf(101) < 0 && a.indexOf(69) < 0) {
            while(a.endsWith("0")) {
               a = a.substring(0, a.length() - 1);
            }

            if (a.endsWith(".")) {
               a = a.substring(0, a.length() - 1);
            }
         }

         return a;
      } else {
         return "null";
      }
   }

   public Object Method2949(String a) throws Class666 {
      throw new Class666("Null key.");
   }

   public Enum Method2950(Class a, String a) throws Class666 {
      Enum a = this.Method2975(a, a);
      throw Method3034(a, "enum of type " + Method3016(a.getSimpleName()), (Throwable)null);
   }

   public boolean Method2951(String a) throws Class666 {
      Object a = this.Method2949(a);
      if (!a.Method3429(Boolean.FALSE) && (!(a instanceof String) || !((String)a).equalsIgnoreCase("false"))) {
         if (!a.Method3429(Boolean.TRUE) && (!(a instanceof String) || !((String)a).equalsIgnoreCase("true"))) {
            throw Method3034(a, "Boolean", (Throwable)null);
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public BigInteger Method2952(String a) throws Class666 {
      Object a = this.Method2949(a);
      BigInteger a = Method2982(a, (BigInteger)null);
      return a;
   }

   public BigDecimal Method2953(String a) throws Class666 {
      Object a = this.Method2949(a);
      BigDecimal a = Method2980(a, (BigDecimal)null);
      return a;
   }

   public double Method2954(String a) throws Class666 {
      Object a = this.Method2949(a);
      if (a instanceof Number) {
         return ((Number)a).doubleValue();
      } else {
         try {
            return Double.parseDouble(a.Method3780());
         } catch (Exception var4) {
            throw Method3034(a, "double", var4);
         }
      }
   }

   public float Method2955(String a) throws Class666 {
      Object a = this.Method2949(a);
      if (a instanceof Number) {
         return ((Number)a).floatValue();
      } else {
         try {
            return Float.parseFloat(a.Method3780());
         } catch (Exception var4) {
            throw Method3034(a, "float", var4);
         }
      }
   }

   public Number Method2956(String a) throws Class666 {
      Object a = this.Method2949(a);

      try {
         return a instanceof Number ? (Number)a : Method3021(a.Method3780());
      } catch (Exception var4) {
         throw Method3034(a, "number", var4);
      }
   }

   public int Method2957(String a) throws Class666 {
      Object a = this.Method2949(a);
      if (a instanceof Number) {
         return ((Number)a).intValue();
      } else {
         try {
            return Integer.parseInt(a.Method3780());
         } catch (Exception var4) {
            throw Method3034(a, "int", var4);
         }
      }
   }

   public Class288 Method2958(String a) throws Class666 {
      Object a = this.Method2949(a);
      if (a instanceof Class288) {
         return (Class288)a;
      } else {
         throw Method3034(a, "JSONArray", (Throwable)null);
      }
   }

   public Class298 Method2959(String a) throws Class666 {
      Object a = this.Method2949(a);
      if (a instanceof Class298) {
         return (Class298)a;
      } else {
         throw Method3034(a, "JSONObject", (Throwable)null);
      }
   }

   public long Method2960(String a) throws Class666 {
      Object a = this.Method2949(a);
      if (a instanceof Number) {
         return ((Number)a).longValue();
      } else {
         try {
            return Long.parseLong(a.Method3780());
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
      Object a = this.Method2949(a);
      if (a instanceof String) {
         return (String)a;
      } else {
         throw Method3034(a, "string", (Throwable)null);
      }
   }

   public boolean Method2964(String a) {
      return this.Field1579.containsKey(a);
   }

   public Class298 Method2965(String a) throws Class666 {
      Object a = this.Method2974(a);
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
         Object a = this.Method2974(a);
         if (Field1580.Method3429(a)) {
            return a;
         } else if (a.isAssignableFrom(a.getClass())) {
            Enum a = (Enum)a;
            return a;
         } else {
            return Enum.valueOf(a, a.Method3780());
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
      Object a = this.Method2974(a);
      if (Field1580.Method3429(a)) {
         return a;
      } else if (a instanceof Boolean) {
         return (Boolean)a;
      } else {
         try {
            return this.Method2951(a);
         } catch (Exception var5) {
            return a;
         }
      }
   }

   public BigDecimal Method2979(String a, BigDecimal a) {
      Object a = this.Method2974(a);
      return Method2980(a, a);
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
         double a = ((Number)a).doubleValue();
         return Double.isNaN(a) ? a : new BigDecimal(((Number)a).doubleValue());
      }
   }

   public BigInteger Method2981(String a, BigInteger a) {
      Object a = this.Method2974(a);
      return Method2982(a, a);
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
               String a = a.Method3780();
               return Method3020(a) ? (new BigDecimal(a)).toBigInteger() : new BigInteger(a);
            } catch (Exception var4) {
               return a;
            }
         } else {
            return BigInteger.valueOf(((Number)a).longValue());
         }
      } else {
         double a = ((Number)a).doubleValue();
         return Double.isNaN(a) ? a : (new BigDecimal(a)).toBigInteger();
      }
   }

   public double Method2983(String a) {
      return this.Method2984(a, Double.NaN);
   }

   public double Method2984(String a, double a) {
      Number a = this.Method2993(a);
      return a;
   }

   public float Method2985(String a) {
      return this.Method2986(a, Float.NaN);
   }

   public float Method2986(String a, float a) {
      Number a = this.Method2993(a);
      return a;
   }

   public int Method2987(String a) {
      return this.Method2988(a, 0);
   }

   public int Method2988(String a, int a) {
      Number a = this.Method2994(a, (Number)null);
      return a;
   }

   public Class288 Method2989(String a) {
      Object a = this.Method2974(a);
      return a instanceof Class288 ? (Class288)a : null;
   }

   public Class298 Method2990(String a) {
      Object a = this.Method2974(a);
      return a instanceof Class298 ? (Class298)a : null;
   }

   public long Method2991(String a) {
      return this.Method2992(a, 0L);
   }

   public long Method2992(String a, long a) {
      Number a = this.Method2994(a, (Number)null);
      return a;
   }

   public Number Method2993(String a) {
      return this.Method2994(a, (Number)null);
   }

   public Number Method2994(String a, Number a) {
      Object a = this.Method2974(a);
      if (Field1580.Method3429(a)) {
         return a;
      } else if (a instanceof Number) {
         return (Number)a;
      } else {
         try {
            return Method3021(a.Method3780());
         } catch (Exception var5) {
            return a;
         }
      }
   }

   public String Method2995(String a) {
      return this.Method2996(a, "");
   }

   public String Method2996(String a, String a) {
      Object a = this.Method2974(a);
      return Field1580.Method3429(a) ? a : a.Method3780();
   }

   private void Method2997(Object a) {
      Class a = a.getClass();
      boolean a = a.getClassLoader() != null;
      Method[] var4 = a.getMethods();
      Method[] var5 = var4;
      int var6 = var4.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         Method a = var5[var7];
         int a = a.getModifiers();
         if (Modifier.isPublic(a) && !Modifier.isStatic(a) && a.getParameterTypes().length == 0 && !a.isBridge() && a.getReturnType() != Void.TYPE && Method2998(a.getName())) {
            String a = Method2999(a);
            if (!a.isEmpty()) {
               try {
                  Object a = a.invoke(a);
                  this.Field1579.put(a, Method3028(a));
                  if (a instanceof Closeable) {
                     try {
                        ((Closeable)a).Method2519();
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
      int a = Method3001(a, Class303.class);
      int a = Method3001(a, Class304.class);
      if (a <= a) {
         return null;
      } else {
         Class304 a = (Class304)Method3000(a, Class304.class);
         if (a.Method931() != null && !a.Method931().isEmpty()) {
            return a.Method931();
         } else {
            String a = a.getName();
            String a;
            if (a.startsWith("get") && a.length() > 3) {
               a = a.substring(3);
            } else {
               if (!a.startsWith("is") || a.length() <= 2) {
                  return null;
               }

               a = a.substring(2);
            }

            if (Character.isLowerCase(a.charAt(0))) {
               return null;
            } else {
               if (a.length() == 1) {
                  a = a.toLowerCase(Locale.ROOT);
               } else if (!Character.isUpperCase(a.charAt(1))) {
                  a = a.substring(0, 1).toLowerCase(Locale.ROOT) + a.substring(1);
               }

               return a;
            }
         }
      }
   }

   private static Annotation Method3000(Method a, Class a1) {
      return null;
   }

   private static int Method3001(Method a, Class a1) {
      return -1;
   }

   public Class298 Method3002(String a, boolean a1) throws Class666 {
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

   public Class298 Method3009(String a, Object a1) throws Class666 {
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
      StringWriter a = new StringWriter();
      synchronized(a.getBuffer()) {
         String var10000;
         try {
            var10000 = Method3017(a, a).Method3780();
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
         char a = 0;
         int a = a.length();
         a.write(34);

         for(int a = 0; a < a; ++a) {
            char a = a;
            a = a.charAt(a);
            switch (a) {
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
                  a.write(a);
                  continue;
               case '/':
                  if (a == '<') {
                     a.write(92);
                  }

                  a.write(a);
                  continue;
            }

            if (a >= ' ' && (a < 128 || a >= 160) && (a < 8192 || a >= 8448)) {
               a.write(a);
            } else {
               a.write("\\u");
               String a = Integer.toHexString(a);
               a.write("0000", 0, 4 - a.length());
               a.write(a);
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

            Object a;
            Object a;
            do {
               if (!var2.Method932()) {
                  return true;
               }

               Map.Entry a = (Map.Entry)var2.Method933();
               String a = (String)a.getKey();
               a = a.getValue();
               a = ((Class298)a).Method2949(a);
            } while(a == a);

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
      char a = a.charAt(0);
      if ((a < '0' || a > '9') && a != '-') {
         throw new NumberFormatException("val [" + a + "] is not a valid number.");
      } else if (Method3020(a)) {
         try {
            BigDecimal a = new BigDecimal(a);
            return (Number)(a == '-' && BigDecimal.ZERO.compareTo(a) == 0 ? -0.0 : a);
         } catch (NumberFormatException var6) {
            try {
               Double a = Double.valueOf(a);
               if (!a.isNaN() && !a.isInfinite()) {
                  return a;
               } else {
                  throw new NumberFormatException("val [" + a + "] is not a valid number.");
               }
            } catch (NumberFormatException var5) {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         }
      } else {
         char a;
         if (a == '0' && a.length() > 1) {
            a = a.charAt(1);
            if (a >= '0' && a <= '9') {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         }

         if (a == '-' && a.length() > 2) {
            a = a.charAt(1);
            char a = a.charAt(2);
            if (a == '0' && a >= '0' && a <= '9') {
               throw new NumberFormatException("val [" + a + "] is not a valid number.");
            }
         }

         BigInteger a = new BigInteger(a);
         if (a.bitLength() <= 31) {
            return a.intValue();
         } else {
            return (Number)(a.bitLength() <= 63 ? a.longValue() : a);
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
         char a = a.charAt(0);
         if (a >= '0' && a <= '9' || a == '-') {
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
         Class288 a = new Class288();

         for(int a = 0; a < a.Method10(); ++a) {
            a.Method3154(this.Method2974(a.Method3125(a)));
         }

         return a;
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
      StringWriter a = new StringWriter();
      synchronized(a.getBuffer()) {
         return this.Method3032(a, a, 0).Method3780();
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
         String a;
         if (a instanceof Class289) {
            try {
               a = ((Class289)a).Method3114();
            } catch (Exception var6) {
               throw new Class666(var6);
            }

            a.write(a.Method3780());
         } else if (a instanceof Number) {
            a = Method2973((Number)a);
            if (Field1578.matcher(a).matches()) {
               a.write(a);
            } else {
               Method3017(a, a);
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
            Map a = (Map)a;
            (new Class298(a)).Method3032(a, a, a);
         } else if (a instanceof Collection) {
            Collection a = (Collection)a;
            (new Class288(a)).Method3176(a, a, a);
         } else if (a.getClass().isArray()) {
            (new Class288(a)).Method3176(a, a, a);
         } else {
            Method3017(a.Method3780(), a);
         }
      }

      return a;
   }

   static final void Method3031(Writer a, int a) throws IOException {
      for(int a = 0; a < a; ++a) {
         a.write(32);
      }

   }

   public Writer Method3032(Writer a, int a, int a) throws Class666 {
      int[] a = Class666.Method3438();

      try {
         boolean a = false;
         int a = this.Method2970();
         a.write(123);
         if (a == 1) {
            Map.Entry a = (Map.Entry)this.Method2969().Method1383().Method933();
            String a = (String)a.getKey();
            a.write(Method3016(a));
            a.write(58);
            a.write(32);

            try {
               Method3030(a, a.getValue(), a, a);
            } catch (Exception var13) {
               throw new Class666("Unable to write JSONObject value for key: " + a, var13);
            }
         }

         int a = a + a;
         Iterator var16 = this.Method2969().Method1383();
         if (var16.Method932()) {
            Map.Entry a = (Map.Entry)var16.Method933();
            a.write(44);
            a.write(10);
            Method3031(a, a);
            String a = (String)a.getKey();
            a.write(Method3016(a));
            a.write(58);
            a.write(32);

            try {
               Method3030(a, a.getValue(), a, a);
            } catch (Exception var12) {
               throw new Class666("Unable to write JSONObject value for key: " + a, var12);
            }

            a = true;
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
      Map a = new HashMap();

      Map.Entry a;
      Object a;
      for(Iterator var2 = this.Method2969().Method1383(); var2.Method932(); a.put(a.getKey(), a)) {
         a = (Map.Entry)var2.Method933();
         if (a.getValue() != null && !Field1580.Method3429(a.getValue())) {
            if (a.getValue() instanceof Class298) {
               a = ((Class298)a.getValue()).Method3033();
            } else if (a.getValue() instanceof Class288) {
               a = ((Class288)a.getValue()).Method3177();
            } else {
               a = a.getValue();
            }
         } else {
            a = null;
         }
      }

      return a;
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
