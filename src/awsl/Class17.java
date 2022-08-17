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
      Class104 var3 = ((Class102)this.Field208.Method185()).Field829;
      if (a == 168 && !this.Field225.containsKey(var3)) {
         this.Field225.put(var3, new BitSet());
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
      BitSet var1 = new BitSet();
      this.Method3446(this.Field226, 0, var1);
      Iterator var2 = this.Field225.Method2663().Method1383();

      while(var2.Method932()) {
         Map.Entry var3 = (Map.Entry)var2.Method933();
         Class104 var4 = (Class104)var3.getKey();
         BitSet var5 = (BitSet)var3.getValue();
         int var6 = this.Field208.Method188(var4);
         this.Method3446(var5, var6, var1);
      }

   }

   private void Method3446(BitSet a, int a, BitSet a) {
      this.Method3447(a, a, a);
      boolean var4 = true;

      while(true) {
         var4 = false;
         Iterator var5 = this.Field209.Method1383();

         while(var5.Method932()) {
            Class794 var6 = (Class794)var5.Method933();
            int var7 = this.Field208.Method188(var6.Field3561);
            if (!a.get(var7)) {
               int var8 = this.Field208.Method188(var6.Field3559);
               int var9 = this.Field208.Method188(var6.Field3560);
               int var10 = a.nextSetBit(var8);
               if (var10 != -1 && var10 < var9) {
                  this.Method3447(a, var7, a);
                  var4 = true;
               }
            }
         }
      }
   }

   private void Method3447(BitSet a, int a, BitSet a) {
      while(true) {
         a var4 = this.Field208.Method186(a);
         if (a.get(a)) {
            return;
         }

         a.set(a);
         if (a.get(a)) {
            this.Field227.set(a);
         }

         a.set(a);
         int var6;
         if (var4.Method0() == 7 && var4.Method3640() != 168) {
            Class102 var5 = (Class102)var4;
            var6 = this.Field208.Method188(var5.Field829);
            this.Method3447(a, var6, a);
         }

         int var7;
         Class104 var8;
         if (var4.Method0() == 11) {
            Class122 var10 = (Class122)var4;
            var6 = this.Field208.Method188(var10.Field961);
            this.Method3447(a, var6, a);
            var7 = var10.Field962.Method1799() - 1;

            while(true) {
               var8 = (Class104)var10.Field962.get(var7);
               var6 = this.Field208.Method188(var8);
               this.Method3447(a, var6, a);
               --var7;
            }
         }

         if (var4.Method0() == 12) {
            Class96 var9 = (Class96)var4;
            var6 = this.Field208.Method188(var9.Field817);
            this.Method3447(a, var6, a);
            var7 = var9.Field819.Method1799() - 1;

            while(true) {
               var8 = (Class104)var9.Field819.get(var7);
               var6 = this.Field208.Method188(var8);
               this.Method3447(a, var6, a);
               --var7;
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
      LinkedList var1 = new LinkedList();
      var1.Method2530(new Class699(this, (Class699)null, this.Field226));
      Class116 var2 = new Class116();
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();

      while(!var1.isEmpty()) {
         Class699 var5 = (Class699)var1.removeFirst();
         this.Method3448(var5, var1, var2, var3, var4);
      }

      this.Field208 = var2;
      this.Field209 = var3;
      this.Field212 = var4;
   }

   private void Method3448(Class699 a, List a, Class116 a, List a, List a) {
      Class37.Method3383();
      Object var7 = null;
      int var8 = 0;
      int var9 = this.Field208.Method183();
      Class104 var12;
      if (var8 < var9) {
         label70: {
            a var10 = this.Field208.Method186(var8);
            Class699 var11 = a.Method2660(var8);
            if (var10.Method0() == 8) {
               var12 = (Class104)var10;
               Class104 var13 = a.Method2662(var12);
               if (var13 == var7) {
                  break label70;
               }

               a.Method194(var13);
            }

            if (var11 != a) {
               ;
            }

            if (var10.Method3640() == 169) {
               var12 = null;
               if (a.Field3014.get(var8)) {
                  var12 = a.Field3016;
               }

               Class699 var22 = a.Field3013;
               throw new RuntimeException("Instruction #" + var8 + " is a RET not owned by any subroutine");
            }

            if (var10.Method3640() == 168) {
               var12 = ((Class102)var10).Field829;
               BitSet var21 = (BitSet)this.Field225.Method2665(var12);
               Class699 var14 = new Class699(this, a, var21);
               Class104 var15 = var14.Method2661(var12);
               a.Method194(new Class83(1));
               a.Method194(new Class102(167, var15));
               a.Method194(var14.Field3016);
               a.Method2530(var14);
            }

            a.Method194(var10.Method2(a));
         }

         ++var8;
      }

      Iterator var16 = this.Field209.Method1383();
      Class104 var19;
      Class104 var20;
      if (var16.Method932()) {
         Class794 var18 = (Class794)var16.Method933();
         var19 = a.Method2662(var18.Field3559);
         var20 = a.Method2662(var18.Field3560);
         if (var19 == var20) {
            ;
         }

         var12 = a.Method2661(var18.Field3561);
         throw new RuntimeException("Internal error!");
      } else {
         var16 = this.Field212.Method1383();
         if (var16.Method932()) {
            Class790 var17 = (Class790)var16.Method933();
            var19 = a.Method2662(var17.Field3552);
            var20 = a.Method2662(var17.Field3553);
            if (var19 == var20) {
               ;
            }

            a.Method2530(new Class790(var17.Field3549, var17.Field3550, var17.Field3551, var19, var20, var17.Field3554));
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
