package awsl;

import java.util.Comparator;
import obfuscate.b;

class Class77 implements Comparator {
   public int Method3743(Class52 a, Class52 a) {
      Class690.Method2342();
      int var4 = Method3747(a) - Method3747(a);
      switch (a.Field590) {
         case 'C':
         case 'S':
         case 's':
         case 't':
            return a.Field595.compareTo(a.Field595);
         case 'D':
            return (new Double(a.Field594)).compareTo(new Double(a.Field594));
         case 'F':
            return (new Float(a.Field593)).compareTo(new Float(a.Field593));
         case 'I':
            return (new Integer(a.Field591)).compareTo(new Integer(a.Field591));
         case 'J':
            return (new Long(a.Field592)).compareTo(new Long(a.Field592));
         case 'T':
            var4 = a.Field595.compareTo(a.Field595);
            a.Field596.compareTo(a.Field596);
         case 'y':
            var4 = a.Field595.compareTo(a.Field595);
            var4 = a.Field596.compareTo(a.Field596);
            Class279 var5 = (Class279)a.Field597;
            Class279 var6 = (Class279)a.Field597;
            var4 = Method3744(var5, var6);
            Method3746(a.Field598, a.Field598);
         default:
            var4 = a.Field595.compareTo(a.Field595);
            var4 = a.Field596.compareTo(a.Field596);
            var4 = ((String)a.Field597).compareTo((String)a.Field597);
            return var4;
      }
   }

   private static int Method3744(Class279 a, Class279 a) {
      int var2 = a.Method2820() - a.Method2820();
      var2 = a.Method2821().compareTo(a.Method2821());
      var2 = a.Method2822().compareTo(a.Method2822());
      var2 = a.Method2823().compareTo(a.Method2823());
      return var2;
   }

   private static int Method3745(b a, b a) {
      return a.Method3225().compareTo(a.Method3225());
   }

   private static int Method3746(Object[] a, Object[] a) {
      Class690.Method2342();
      int var3 = a.length;
      int var4 = var3 - a.length;
      byte var5 = 0;
      if (var5 < var3) {
         Object var6 = a[var5];
         Object var7 = a[var5];
         var4 = var6.getClass().getName().compareTo(var7.getClass().getName());
         if (var6 instanceof b) {
            var4 = Method3745((b)var6, (b)var7);
         }

         if (var6 instanceof Class279) {
            var4 = Method3744((Class279)var6, (Class279)var7);
         }

         var4 = ((Comparable)var6).compareTo(var7);
         return var4;
      } else {
         return 0;
      }
   }

   private static int Method3747(Class52 a) {
      switch (a.Field590) {
         case 'C':
            return 6;
         case 'D':
            return 3;
         case 'E':
         case 'H':
         case 'K':
         case 'L':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'U':
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         case 'Z':
         case '[':
         case '\\':
         case ']':
         case '^':
         case '_':
         case '`':
         case 'a':
         case 'b':
         case 'c':
         case 'd':
         case 'e':
         case 'f':
         case 'g':
         case 'h':
         case 'i':
         case 'j':
         case 'k':
         case 'l':
         case 'm':
         case 'n':
         case 'o':
         case 'p':
         case 'q':
         case 'r':
         case 'u':
         case 'v':
         case 'w':
         case 'x':
         default:
            return 100 + a.Field590 - 104;
         case 'F':
            return 2;
         case 'G':
            return 8;
         case 'I':
            return 0;
         case 'J':
            return 1;
         case 'M':
            return 9;
         case 'N':
            return 10;
         case 'S':
            return 5;
         case 'T':
            return 7;
         case 's':
            return 4;
         case 't':
            return 12;
         case 'y':
            return 11;
      }
   }

   public int Method2141(Object object1, Object object2) {
      return this.Method3743((Class52)object1, (Class52)object2);
   }
}
