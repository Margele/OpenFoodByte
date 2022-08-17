package awsl;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import obfuscate.a;

public class Class17 extends Class15 implements Class45 {
   private static final boolean Field224 = false;
   private final Map Field225;
   private final BitSet Field226;
   final BitSet Field227;

   public Class17(Class267 a, int a, String a, String a, String a, String[] a) {
      this(327680, a, a, a, a, a, a);
      if (this.getClass() != Class17.class) {
         throw new IllegalStateException();
      }
   }

   protected Class17(int a, Class267 a, int a, String a, String a, String a, String[] a) {
      super(a, a, a, a, a, a);
      this.Field225 = new HashMap();
      this.Field226 = new BitSet();
      this.Field227 = new BitSet();
      this.Field1460 = a;
   }

   public void Method1957(int a, Class264 a) {
      super.Method1957(a, a);
      Class104 a = ((Class102)this.Field208.Method185()).Field829;
      if (a == 168 && !this.Field225.containsKey(a)) {
         this.Field225.put(a, new BitSet());
      }

   }

   public void Method1653() {
      if (!this.Field225.isEmpty()) {
         this.Method1879();
         this.Method1882();
      }

      if (this.Field1460 != null) {
         this.Method3444(this.Field1460);
      }

   }

   private void Method1879() {
      BitSet a = new BitSet();
      this.Method3446(this.Field226, 0, a);
      Iterator a = this.Field225.Method2663().Method1383();

      while(a.Method932()) {
         Map.Entry a = (Map.Entry)a.Method933();
         Class104 a = (Class104)a.getKey();
         BitSet a = (BitSet)a.getValue();
         int a = this.Field208.Method188(a);
         this.Method3446(a, a, a);
      }

   }

   private void Method3446(BitSet a, int a, BitSet a) {
      this.Method3447(a, a, a);
      boolean a = true;

      while(true) {
         a = false;
         Iterator a = this.Field209.Method1383();

         while(a.Method932()) {
            Class794 a = (Class794)a.Method933();
            int a = this.Field208.Method188(a.Field3561);
            if (!a.get(a)) {
               int a = this.Field208.Method188(a.Field3559);
               int a = this.Field208.Method188(a.Field3560);
               int a = a.nextSetBit(a);
               if (a != -1 && a < a) {
                  this.Method3447(a, a, a);
                  a = true;
               }
            }
         }
      }
   }

   private void Method3447(BitSet a, int a, BitSet a) {
      while(true) {
         a a = this.Field208.Method186(a);
         if (a.get(a)) {
            return;
         }

         a.set(a);
         if (a.get(a)) {
            this.Field227.set(a);
         }

         a.set(a);
         int a;
         if (a.Method0() == 7 && a.Method3640() != 168) {
            Class102 a = (Class102)a;
            a = this.Field208.Method188(a.Field829);
            this.Method3447(a, a, a);
         }

         int a;
         Class104 a;
         if (a.Method0() == 11) {
            Class122 a = (Class122)a;
            a = this.Field208.Method188(a.Field961);
            this.Method3447(a, a, a);
            a = a.Field962.Method1799() - 1;

            while(true) {
               a = (Class104)a.Field962.get(a);
               a = this.Field208.Method188(a);
               this.Method3447(a, a, a);
               --a;
            }
         }

         if (a.Method0() == 12) {
            Class96 a = (Class96)a;
            a = this.Field208.Method188(a.Field817);
            this.Method3447(a, a, a);
            a = a.Field819.Method1799() - 1;

            while(true) {
               a = (Class104)a.Field819.get(a);
               a = this.Field208.Method188(a);
               this.Method3447(a, a, a);
               --a;
            }
         }

         switch (this.Field208.Method186(a).Method3640()) {
            case 167:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 191:
               return;
            case 168:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            default:
               ++a;
               if (a >= this.Field208.Method183()) {
                  return;
               }
         }
      }
   }

   private void Method1882() {
      LinkedList a = new LinkedList();
      a.Method2530(new Class699(this, (Class699)null, this.Field226));
      Class116 a = new Class116();
      List a = new ArrayList();
      List a = new ArrayList();

      while(!a.isEmpty()) {
         Class699 a = (Class699)a.removeFirst();
         this.Method3448(a, a, a, a, a);
      }

      this.Field208 = a;
      this.Field209 = a;
      this.Field212 = a;
   }

   private void Method3448(Class699 a, List a, Class116 a, List a3, List a) {
      Class37.Method3383();
      Class104 a = null;
      int a = 0;
      int a = this.Field208.Method183();
      Class104 a;
      if (a < a) {
         label70: {
            a a = this.Field208.Method186(a);
            Class699 a = a.Method2660(a);
            if (a.Method0() == 8) {
               a = (Class104)a;
               Class104 a = a.Method2662(a);
               if (a == a) {
                  break label70;
               }

               a.Method194(a);
            }

            if (a != a) {
               ;
            }

            if (a.Method3640() == 169) {
               a = null;
               if (a.Field3014.get(a)) {
                  a = a.Field3016;
               }

               Class699 a = a.Field3013;
               throw new RuntimeException("Instruction #" + a + " is a RET not owned by any subroutine");
            }

            if (a.Method3640() == 168) {
               a = ((Class102)a).Field829;
               BitSet a = (BitSet)this.Field225.Method2665(a);
               Class699 a = new Class699(this, a, a);
               Class104 a = a.Method2661(a);
               a.Method194(new Class83(1));
               a.Method194(new Class102(167, a));
               a.Method194(a.Field3016);
               a.Method2530(a);
            }

            a.Method194(a.Method2(a));
         }

         ++a;
      }

      Iterator a = this.Field209.Method1383();
      Class104 a;
      Class104 a;
      if (a.Method932()) {
         Class794 a = (Class794)a.Method933();
         a = a.Method2662(a.Field3559);
         a = a.Method2662(a.Field3560);
         if (a == a) {
            ;
         }

         a = a.Method2661(a.Field3561);
         throw new RuntimeException("Internal error!");
      } else {
         a = this.Field212.Method1383();
         if (a.Method932()) {
            Class790 a = (Class790)a.Method933();
            a = a.Method2662(a.Field3552);
            a = a.Method2662(a.Field3553);
            if (a == a) {
               ;
            }

            a.Method2530(new Class790(a.Field3549, a.Field3550, a.Field3551, a, a, a.Field3554));
         }

      }
   }

   private static void Method1873(String a) {
      System.err.println(a);
   }

   private static IllegalStateException Method1946(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
