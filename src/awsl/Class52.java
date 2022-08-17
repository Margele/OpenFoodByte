package awsl;

import java.util.Arrays;

class Class52 {
   char Field590;
   int Field591;
   long Field592;
   float Field593;
   double Field594;
   String Field595;
   String Field596;
   Object Field597;
   Object[] Field598;
   int Field599;

   Class52() {
   }

   Class52(Class52 a) {
      this.Field590 = a.Field590;
      this.Field591 = a.Field591;
      this.Field592 = a.Field592;
      this.Field593 = a.Field593;
      this.Field594 = a.Field594;
      this.Field595 = a.Field595;
      this.Field596 = a.Field596;
      this.Field597 = a.Field597;
      this.Field598 = a.Field598;
      this.Field599 = a.Field599;
   }

   void Method3186(int a) {
      this.Field590 = 'I';
      this.Field591 = a;
      this.Field599 = Integer.MAX_VALUE & this.Field590 + a;
   }

   void Method3187(long a) {
      this.Field590 = 'J';
      this.Field592 = a;
      this.Field599 = Integer.MAX_VALUE & this.Field590 + (int)a;
   }

   void Method3188(float a) {
      this.Field590 = 'F';
      this.Field593 = a;
      this.Field599 = Integer.MAX_VALUE & this.Field590 + (int)a;
   }

   void Method3189(double a) {
      this.Field590 = 'D';
      this.Field594 = a;
      this.Field599 = Integer.MAX_VALUE & this.Field590 + (int)a;
   }

   void Method3190(char a, String a, String a, String a) {
      this.Field590 = a;
      this.Field595 = a;
      this.Field596 = a;
      this.Field597 = a;
      switch (a) {
         case 'C':
         case 'S':
         case 's':
         case 't':
            this.Field599 = Integer.MAX_VALUE & a + a.hashCode();
            return;
         case 'T':
            this.Field599 = Integer.MAX_VALUE & a + a.hashCode() * a.hashCode();
            return;
         default:
            this.Field599 = Integer.MAX_VALUE & a + a.hashCode() * a.hashCode() * a.hashCode();
      }
   }

   void Method3191(String a, String a, Class279 a, Object[] a) {
      this.Field590 = 'y';
      this.Field595 = a;
      this.Field596 = a;
      this.Field597 = a;
      this.Field598 = a;
      int a = 121 + a.hashCode() * a.hashCode() * a.Method2825();

      for(int a = 0; a < a.length; ++a) {
         a *= a[a].Method3430();
      }

      this.Field599 = Integer.MAX_VALUE & a;
   }

   void Method3192(Class169 a) {
      String[] var2 = Class690.Method2342();
      switch (this.Field590) {
         case 'I':
            a.Method1505(new Integer(this.Field591));
         case 'J':
            a.Method1505(new Long(this.Field592));
         case 'F':
            a.Method1505(new Float(this.Field593));
         case 'D':
            a.Method1505(new Double(this.Field594));
         case 'S':
            a.Method1505(this.Field595);
         case 's':
            a.Method1506(this.Field595);
         case 'C':
            a.Method1508(this.Field595);
         case 'T':
            a.Method1524(this.Field595, this.Field596);
         case 'G':
            a.Method1516(this.Field595, this.Field596, (String)this.Field597);
         case 'M':
            a.Method1518(this.Field595, this.Field596, (String)this.Field597, false);
         case 'N':
            a.Method1518(this.Field595, this.Field596, (String)this.Field597, true);
         case 'y':
            a.Method1514(this.Field595, this.Field596, (Class279)this.Field597, this.Field598);
         case 't':
            a.Method1510(this.Field595);
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
            a.Method1512(this.Field590 - 104 + 1, this.Field595, this.Field596, (String)this.Field597);
      }
   }

   public boolean Method3193(Object a) {
      if (!(a instanceof Class52)) {
         return false;
      } else {
         Class52 a = (Class52)a;
         if (a.Field590 != this.Field590) {
            return false;
         } else {
            switch (this.Field590) {
               case 'C':
               case 'S':
               case 's':
               case 't':
                  return a.Field595.equals(this.Field595);
               case 'D':
                  return Double.compare(a.Field594, this.Field594) == 0;
               case 'F':
                  return Float.compare(a.Field593, this.Field593) == 0;
               case 'I':
                  return a.Field591 == this.Field591;
               case 'J':
                  return a.Field592 == this.Field592;
               case 'T':
                  return a.Field595.equals(this.Field595) && a.Field596.equals(this.Field596);
               case 'y':
                  return a.Field595.equals(this.Field595) && a.Field596.equals(this.Field596) && a.Field597.Method3429(this.Field597) && Arrays.equals(a.Field598, this.Field598);
               default:
                  return a.Field595.equals(this.Field595) && a.Field596.equals(this.Field596) && a.Field597.Method3429(this.Field597);
            }
         }
      }
   }

   public int Method3194() {
      return this.Field599;
   }
}
