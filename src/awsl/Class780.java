package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import obfuscate.a;
import obfuscate.b;

public class Class780 implements Class45 {
   private final Class786 Field3475;
   private int Field3476;
   private Class116 Field3477;
   private List[] Field3478;
   private Class784[] Field3479;
   private Class796[] Field3480;
   private boolean[] Field3481;
   private int[] Field3482;
   private int Field3483;

   public Class780(Class786 a) {
      this.Field3475 = a;
   }

   public Class784[] Method847(String a, Class15 a) throws Class731 {
      int[] var3 = Class786.Method917();
      if ((a.Field194 & 1280) != 0) {
         this.Field3479 = (Class784[])(new Class784[0]);
         return this.Field3479;
      } else {
         this.Field3476 = a.Field208.Method183();
         this.Field3477 = a.Field208;
         this.Field3478 = (List[])(new List[this.Field3476]);
         this.Field3479 = (Class784[])(new Class784[this.Field3476]);
         this.Field3480 = new Class796[this.Field3476];
         this.Field3481 = new boolean[this.Field3476];
         this.Field3482 = new int[this.Field3476];
         this.Field3483 = 0;
         int var4 = 0;
         int var7;
         if (var4 < a.Field209.Method1799()) {
            Class794 var5 = (Class794)a.Field209.get(var4);
            int var6 = this.Field3477.Method188(var5.Field3559);
            var7 = this.Field3477.Method188(var5.Field3560);
            if (var6 < var7) {
               List var9 = this.Field3478[var6];
               ArrayList var32 = new ArrayList();
               this.Field3478[var6] = var32;
               var32.Method2530(var5);
               int var8 = var6 + 1;
            }

            ++var4;
         }

         Class796 var24 = new Class796((Class104)null, a.Field211, (Class102)null);
         ArrayList var25 = new ArrayList();
         HashMap var26 = new HashMap();
         this.Method848(0, var24, var25);
         if (!var25.isEmpty()) {
            Class102 var27 = (Class102)var25.remove(0);
            Class796 var29 = (Class796)var26.Method2665(var27.Field829);
            var29 = new Class796(var27.Field829, a.Field211, var27);
            var26.put(var27.Field829, var29);
            this.Method848(this.Field3477.Method188(var27.Field829), var29, var25);
            var29.Field3567.Method2530(var27);
         }

         byte var28 = 0;
         if (var28 < this.Field3476) {
            if (this.Field3480[var28] != null && this.Field3480[var28].Field3565 == null) {
               this.Field3480[var28] = null;
            }

            var7 = var28 + 1;
         }

         Class784 var30 = this.Method852(a.Field211, a.Field210);
         Class784 var31 = this.Method852(a.Field211, a.Field210);
         var30.Method885(this.Field3475.Method907(b.Method3213(a.Field196)));
         b[] var33 = b.Method3211(a.Field196);
         int var10 = 0;
         if ((a.Field194 & 8) == 0) {
            b var11 = b.Method3205(a);
            var30.Method889(var10++, this.Field3475.Method907(var11));
         }

         int var34 = 0;
         if (var34 < var33.length) {
            var30.Method889(var10++, this.Field3475.Method907(var33[var34]));
            if (var33[var34].Method3233() == 2) {
               var30.Method889(var10++, this.Field3475.Method907((b)null));
            }

            ++var34;
         }

         if (var10 < a.Field211) {
            var30.Method889(var10++, this.Field3475.Method907((b)null));
         }

         this.Method857(0, var30, (Class796)null);
         this.Method851(a, a);
         if (this.Field3483 > 0) {
            var34 = this.Field3482[--this.Field3483];
            Class784 var12 = this.Field3479[var34];
            Class796 var13 = this.Field3480[var34];
            this.Field3481[var34] = false;
            a var14 = null;

            try {
               var14 = a.Field208.Method186(var34);
               int var15 = var14.Method3640();
               int var16 = var14.Method0();
               if (var16 == 8 || var16 == 15 || var16 == 14) {
                  this.Method857(var34 + 1, var12, var13);
                  this.Method854(var34, var34 + 1);
               }

               var30.Method884(var12).Method895(var14, this.Field3475);
               var13 = null;
               int var18;
               if (var14 instanceof Class102) {
                  Class102 var17 = (Class102)var14;
                  if (var15 != 167 && var15 != 168) {
                     this.Method857(var34 + 1, var30, var13);
                     this.Method854(var34, var34 + 1);
                  }

                  var18 = this.Field3477.Method188(var17.Field829);
                  if (var15 == 168) {
                     this.Method857(var18, var30, new Class796(var17.Field829, a.Field211, var17));
                  }

                  this.Method857(var18, var30, var13);
                  this.Method854(var34, var18);
               }

               int var19;
               Class104 var20;
               if (var14 instanceof Class96) {
                  Class96 var35 = (Class96)var14;
                  var18 = this.Field3477.Method188(var35.Field817);
                  this.Method857(var18, var30, var13);
                  this.Method854(var34, var18);
                  var19 = 0;
                  if (var19 < var35.Field819.Method1799()) {
                     var20 = (Class104)var35.Field819.get(var19);
                     var18 = this.Field3477.Method188(var20);
                     this.Method857(var18, var30, var13);
                     this.Method854(var34, var18);
                     ++var19;
                  }
               }

               if (var14 instanceof Class122) {
                  Class122 var36 = (Class122)var14;
                  var18 = this.Field3477.Method188(var36.Field961);
                  this.Method857(var18, var30, var13);
                  this.Method854(var34, var18);
                  byte var39 = 0;
                  if (var39 < var36.Field962.Method1799()) {
                     var20 = (Class104)var36.Field962.get(var39);
                     var18 = this.Field3477.Method188(var20);
                     this.Method857(var18, var30, var13);
                     this.Method854(var34, var18);
                     var19 = var39 + 1;
                  }
               }

               if (var15 == 169) {
                  throw new Class731(var14, "RET instruction outside of a sub routine");
               }

               if (var15 != 191 && (var15 < 172 || var15 > 177)) {
                  int var37;
                  if (var14 instanceof Class112) {
                     var37 = ((Class112)var14).Field877;
                     var13.Field3566[var37] = true;
                     if (var15 == 22 || var15 == 24 || var15 == 55 || var15 == 57) {
                        var13.Field3566[var37 + 1] = true;
                     }
                  }

                  if (var14 instanceof Class82) {
                     var37 = ((Class82)var14).Field712;
                     var13.Field3566[var37] = true;
                  }

                  this.Method857(var34 + 1, var30, var13);
                  this.Method854(var34, var34 + 1);
               }

               List var38 = this.Field3478[var34];
               byte var40 = 0;
               if (var40 < var38.Method1799()) {
                  Class794 var41 = (Class794)var38.get(var40);
                  b var42;
                  if (var41.Field3562 == null) {
                     var42 = b.Method3205("java/lang/Throwable");
                  }

                  var42 = b.Method3205(var41.Field3562);
                  int var21 = this.Field3477.Method188(var41.Field3561);
                  if (this.Method856(var34, var41)) {
                     var31.Method884(var12);
                     var31.Method892();
                     var31.Method894(this.Field3475.Method907(var42));
                     this.Method857(var21, var31, var13);
                  }

                  var18 = var40 + 1;
               }
            } catch (Class731 var22) {
               throw new Class731(var22.Field3210, "Error at instruction " + var34 + ": " + var22.getMessage(), var22);
            } catch (Exception var23) {
               throw new Class731(var14, "Error at instruction " + var34 + ": " + var23.getMessage(), var23);
            }
         }

         return this.Field3479;
      }
   }

   private void Method848(int a, Class796 a, List a) throws Class731 {
      while(a < this.Field3476) {
         if (this.Field3480[a] != null) {
            return;
         }

         this.Field3480[a] = a.Method807();
         a var4 = this.Field3477.Method186(a);
         int var6;
         if (var4 instanceof Class102) {
            if (var4.Method3640() == 168) {
               a.Method2530(var4);
            } else {
               Class102 var5 = (Class102)var4;
               this.Method848(this.Field3477.Method188(var5.Field829), a, a);
            }
         } else {
            Class104 var11;
            if (var4 instanceof Class122) {
               Class122 var10 = (Class122)var4;
               this.Method848(this.Field3477.Method188(var10.Field961), a, a);
               var6 = var10.Field962.Method1799() - 1;

               while(true) {
                  var11 = (Class104)var10.Field962.get(var6);
                  this.Method848(this.Field3477.Method188(var11), a, a);
                  --var6;
               }
            }

            if (var4 instanceof Class96) {
               Class96 var9 = (Class96)var4;
               this.Method848(this.Field3477.Method188(var9.Field817), a, a);
               var6 = var9.Field819.Method1799() - 1;

               while(true) {
                  var11 = (Class104)var9.Field819.get(var6);
                  this.Method848(this.Field3477.Method188(var11), a, a);
                  --var6;
               }
            }
         }

         List var8 = this.Field3478[a];

         for(var6 = 0; var6 < var8.Method1799(); ++var6) {
            Class794 var7 = (Class794)var8.get(var6);
            this.Method848(this.Field3477.Method188(var7.Field3561), a, a);
         }

         switch (var4.Method3640()) {
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
         }
      }

      throw new Class731((a)null, "Execution can fall off end of the code");
   }

   public Class784[] Method849() {
      return this.Field3479;
   }

   public List Method850(int a) {
      return this.Field3478[a];
   }

   protected void Method851(String a, Class15 a) throws Class731 {
   }

   protected Class784 Method852(int a, int a) {
      return new Class784(a, a);
   }

   protected Class784 Method853(Class784 a) {
      return new Class784(a);
   }

   protected void Method854(int a, int a) {
   }

   protected boolean Method855(int a, int a) {
      return true;
   }

   protected boolean Method856(int a, Class794 a) {
      return this.Method855(a, this.Field3477.Method188(a.Field3561));
   }

   private void Method857(int a, Class784 a, Class796 a) throws Class731 {
      Class784 var4 = this.Field3479[a];
      Class796 var5 = this.Field3480[a];
      this.Field3479[a] = this.Method853(a);
      boolean var6 = true;
      this.Field3480[a] = a.Method807();
      var6 = true;
      if (!this.Field3481[a]) {
         this.Field3481[a] = true;
         this.Field3482[this.Field3483++] = a;
      }

   }

   private void Method858(int a, Class784 a, Class784 a, Class796 a, boolean[] a) throws Class731 {
      Class784 var6 = this.Field3479[a];
      Class796 var7 = this.Field3480[a];
      a.Method897(a, a);
      this.Field3479[a] = this.Method853(a);
      boolean var8 = true;
      var8 |= var7.Method808(a);
      if (!this.Field3481[a]) {
         this.Field3481[a] = true;
         this.Field3482[this.Field3483++] = a;
      }

   }

   private static Class731 Method859(Class731 class731) {
      return class731;
   }
}
