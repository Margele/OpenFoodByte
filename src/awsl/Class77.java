package awsl;

import java.util.Comparator;
import obfuscate.b;

class Class77 implements Comparator {
   public int Method3743(Class52 a, Class52 a) {
      Class690.Method2342();
      int a = Method3747(a) - Method3747(a);
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
            a = a.Field595.compareTo(a.Field595);
            a.Field596.compareTo(a.Field596);
         case 'y':
            a = a.Field595.compareTo(a.Field595);
            a = a.Field596.compareTo(a.Field596);
            Class279 a = (Class279)a.Field597;
            Class279 a = (Class279)a.Field597;
            a = Method3744(a, a);
            Method3746(a.Field598, a.Field598);
         default:
            a = a.Field595.compareTo(a.Field595);
            a = a.Field596.compareTo(a.Field596);
            a = ((String)a.Field597).compareTo((String)a.Field597);
            return a;
      }
   }

   private static int Method3744(Class279 a, Class279 a) {
      int a = a.Method2820() - a.Method2820();
      a = a.Method2821().compareTo(a.Method2821());
      a = a.Method2822().compareTo(a.Method2822());
      a = a.Method2823().compareTo(a.Method2823());
      return a;
   }

   private static int Method3745(b a, b a) {
      return a.Method3225().compareTo(a.Method3225());
   }

   private static int Method3746(Object[] a, Object[] a) {
      Class690.Method2342();
      int a = a.length;
      int a = a - a.length;
      int a = 0;
      if (a < a) {
         Object a = a[a];
         Object a = a[a];
         a = a.getClass().getName().compareTo(a.getClass().getName());
         if (a instanceof b) {
            a = Method3745((b)a, (b)a);
         }

         if (a instanceof Class279) {
            a = Method3744((Class279)a, (Class279)a);
         }

         a = ((Comparable)a).compareTo(a);
         return a;
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
