package awsl;

final class Class261 {
   int Field1426;
   int Field1427;
   int Field1428;
   long Field1429;
   String Field1430;
   String Field1431;
   String Field1432;
   int Field1433;
   Class261 Field1434;

   Class261() {
   }

   Class261(int a) {
      this.Field1426 = a;
   }

   Class261(int a, Class261 a) {
      this.Field1426 = a;
      this.Field1427 = a.Field1427;
      this.Field1428 = a.Field1428;
      this.Field1429 = a.Field1429;
      this.Field1430 = a.Field1430;
      this.Field1431 = a.Field1431;
      this.Field1432 = a.Field1432;
      this.Field1433 = a.Field1433;
   }

   void Method2827(int a) {
      this.Field1427 = 3;
      this.Field1428 = a;
      this.Field1433 = Integer.MAX_VALUE & this.Field1427 + a;
   }

   void Method2828(long a) {
      this.Field1427 = 5;
      this.Field1429 = a;
      this.Field1433 = Integer.MAX_VALUE & this.Field1427 + (int)a;
   }

   void Method2829(float a) {
      this.Field1427 = 4;
      this.Field1428 = Float.floatToRawIntBits(a);
      this.Field1433 = Integer.MAX_VALUE & this.Field1427 + (int)a;
   }

   void Method2830(double a) {
      this.Field1427 = 6;
      this.Field1429 = Double.doubleToRawLongBits(a);
      this.Field1433 = Integer.MAX_VALUE & this.Field1427 + (int)a;
   }

   void Method2831(int a, String a, String a, String a) {
      this.Field1427 = a;
      this.Field1430 = a;
      this.Field1431 = a;
      this.Field1432 = a;
      switch (a) {
         case 7:
            this.Field1428 = 0;
         case 1:
         case 8:
         case 16:
         case 30:
            this.Field1433 = Integer.MAX_VALUE & a + a.hashCode();
            return;
         case 12:
            this.Field1433 = Integer.MAX_VALUE & a + a.hashCode() * a.hashCode();
            return;
         default:
            this.Field1433 = Integer.MAX_VALUE & a + a.hashCode() * a.hashCode() * a.hashCode();
      }
   }

   void Method2832(String a, String a, int a) {
      this.Field1427 = 18;
      this.Field1429 = (long)a;
      this.Field1430 = a;
      this.Field1431 = a;
      this.Field1433 = Integer.MAX_VALUE & 18 + a * this.Field1430.hashCode() * this.Field1431.hashCode();
   }

   void Method2833(int a, int a) {
      this.Field1427 = 33;
      this.Field1428 = a;
      this.Field1433 = a;
   }

   boolean Method2834(Class261 a) {
      switch (this.Field1427) {
         case 1:
         case 7:
         case 8:
         case 16:
         case 30:
            return a.Field1430.equals(this.Field1430);
         case 2:
         case 9:
         case 10:
         case 11:
         case 13:
         case 14:
         case 15:
         case 17:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         default:
            return a.Field1430.equals(this.Field1430) && a.Field1431.equals(this.Field1431) && a.Field1432.equals(this.Field1432);
         case 3:
         case 4:
            return a.Field1428 == this.Field1428;
         case 5:
         case 6:
         case 32:
            return a.Field1429 == this.Field1429;
         case 12:
            return a.Field1430.equals(this.Field1430) && a.Field1431.equals(this.Field1431);
         case 18:
            return a.Field1429 == this.Field1429 && a.Field1430.equals(this.Field1430) && a.Field1431.equals(this.Field1431);
         case 31:
            return a.Field1428 == this.Field1428 && a.Field1430.equals(this.Field1430);
      }
   }
}
