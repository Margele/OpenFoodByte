package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
      int[] a = Class786.Method917();
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
         int a = 0;
         int a;
         if (a < a.Field209.Method1799()) {
            Class794 a = (Class794)a.Field209.get(a);
            int a = this.Field3477.Method188(a.Field3559);
            a = this.Field3477.Method188(a.Field3560);
            if (a < a) {
               List a = this.Field3478[a];
               List a = new ArrayList();
               this.Field3478[a] = a;
               a.Method2530(a);
               int var8 = a + 1;
            }

            ++a;
         }

         Class796 a = new Class796((Class104)null, a.Field211, (Class102)null);
         List a = new ArrayList();
         Map a = new HashMap();
         this.Method848(0, a, a);
         if (!a.isEmpty()) {
            Class102 a = (Class102)a.remove(0);
            Class796 a = (Class796)a.Method2665(a.Field829);
            a = new Class796(a.Field829, a.Field211, a);
            a.put(a.Field829, a);
            this.Method848(this.Field3477.Method188(a.Field829), a, a);
            a.Field3567.Method2530(a);
         }

         int a = 0;
         if (a < this.Field3476) {
            if (this.Field3480[a] != null && this.Field3480[a].Field3565 == null) {
               this.Field3480[a] = null;
            }

            a = a + 1;
         }

         Class784 a = this.Method852(a.Field211, a.Field210);
         Class784 a = this.Method852(a.Field211, a.Field210);
         a.Method885(this.Field3475.Method907(b.Method3213(a.Field196)));
         b[] a = b.Method3211(a.Field196);
         int a = 0;
         if ((a.Field194 & 8) == 0) {
            b a = b.Method3205(a);
            a.Method889(a++, this.Field3475.Method907(a));
         }

         int a = 0;
         if (a < a.length) {
            a.Method889(a++, this.Field3475.Method907(a[a]));
            if (a[a].Method3233() == 2) {
               a.Method889(a++, this.Field3475.Method907((b)null));
            }

            ++a;
         }

         if (a < a.Field211) {
            a.Method889(a++, this.Field3475.Method907((b)null));
         }

         this.Method857(0, a, (Class796)null);
         this.Method851(a, a);
         if (this.Field3483 > 0) {
            a = this.Field3482[--this.Field3483];
            Class784 a = this.Field3479[a];
            Class796 a = this.Field3480[a];
            this.Field3481[a] = false;
            a a = null;

            try {
               a = a.Field208.Method186(a);
               int a = a.Method3640();
               int a = a.Method0();
               if (a == 8 || a == 15 || a == 14) {
                  this.Method857(a + 1, a, a);
                  this.Method854(a, a + 1);
               }

               a.Method884(a).Method895(a, this.Field3475);
               a = null;
               int a;
               if (a instanceof Class102) {
                  Class102 a = (Class102)a;
                  if (a != 167 && a != 168) {
                     this.Method857(a + 1, a, a);
                     this.Method854(a, a + 1);
                  }

                  a = this.Field3477.Method188(a.Field829);
                  if (a == 168) {
                     this.Method857(a, a, new Class796(a.Field829, a.Field211, a));
                  }

                  this.Method857(a, a, a);
                  this.Method854(a, a);
               }

               int a;
               Class104 a;
               if (a instanceof Class96) {
                  Class96 a = (Class96)a;
                  a = this.Field3477.Method188(a.Field817);
                  this.Method857(a, a, a);
                  this.Method854(a, a);
                  a = 0;
                  if (a < a.Field819.Method1799()) {
                     a = (Class104)a.Field819.get(a);
                     a = this.Field3477.Method188(a);
                     this.Method857(a, a, a);
                     this.Method854(a, a);
                     ++a;
                  }
               }

               if (a instanceof Class122) {
                  Class122 a = (Class122)a;
                  a = this.Field3477.Method188(a.Field961);
                  this.Method857(a, a, a);
                  this.Method854(a, a);
                  int a = 0;
                  if (a < a.Field962.Method1799()) {
                     a = (Class104)a.Field962.get(a);
                     a = this.Field3477.Method188(a);
                     this.Method857(a, a, a);
                     this.Method854(a, a);
                     a = a + 1;
                  }
               }

               if (a == 169) {
                  throw new Class731(a, "RET instruction outside of a sub routine");
               }

               if (a != 191 && (a < 172 || a > 177)) {
                  int a;
                  if (a instanceof Class112) {
                     a = ((Class112)a).Field877;
                     a.Field3566[a] = true;
                     if (a == 22 || a == 24 || a == 55 || a == 57) {
                        a.Field3566[a + 1] = true;
                     }
                  }

                  if (a instanceof Class82) {
                     a = ((Class82)a).Field712;
                     a.Field3566[a] = true;
                  }

                  this.Method857(a + 1, a, a);
                  this.Method854(a, a + 1);
               }

               List a = this.Field3478[a];
               int a = 0;
               if (a < a.Method1799()) {
                  Class794 a = (Class794)a.get(a);
                  b a;
                  if (a.Field3562 == null) {
                     a = b.Method3205("java/lang/Throwable");
                  }

                  a = b.Method3205(a.Field3562);
                  int a = this.Field3477.Method188(a.Field3561);
                  if (this.Method856(a, a)) {
                     a.Method884(a);
                     a.Method892();
                     a.Method894(this.Field3475.Method907(a));
                     this.Method857(a, a, a);
                  }

                  a = a + 1;
               }
            } catch (Class731 var22) {
               throw new Class731(var22.Field3210, "Error at instruction " + a + ": " + var22.getMessage(), var22);
            } catch (Exception var23) {
               throw new Class731(a, "Error at instruction " + a + ": " + var23.getMessage(), var23);
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
         a a = this.Field3477.Method186(a);
         int a;
         if (a instanceof Class102) {
            if (a.Method3640() == 168) {
               a.Method2530(a);
            } else {
               Class102 a = (Class102)a;
               this.Method848(this.Field3477.Method188(a.Field829), a, a);
            }
         } else {
            Class104 a;
            if (a instanceof Class122) {
               Class122 a = (Class122)a;
               this.Method848(this.Field3477.Method188(a.Field961), a, a);
               a = a.Field962.Method1799() - 1;

               while(true) {
                  a = (Class104)a.Field962.get(a);
                  this.Method848(this.Field3477.Method188(a), a, a);
                  --a;
               }
            }

            if (a instanceof Class96) {
               Class96 a = (Class96)a;
               this.Method848(this.Field3477.Method188(a.Field817), a, a);
               a = a.Field819.Method1799() - 1;

               while(true) {
                  a = (Class104)a.Field819.get(a);
                  this.Method848(this.Field3477.Method188(a), a, a);
                  --a;
               }
            }
         }

         List a = this.Field3478[a];

         for(a = 0; a < a.Method1799(); ++a) {
            Class794 a = (Class794)a.get(a);
            this.Method848(this.Field3477.Method188(a.Field3561), a, a);
         }

         switch (a.Method3640()) {
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

   protected void Method851(String a, Class15 a1) throws Class731 {
   }

   protected Class784 Method852(int a, int a) {
      return new Class784(a, a);
   }

   protected Class784 Method853(Class784 a) {
      return new Class784(a);
   }

   protected void Method854(int a, int a1) {
   }

   protected boolean Method855(int a, int a1) {
      return true;
   }

   protected boolean Method856(int a, Class794 a) {
      return this.Method855(a, this.Field3477.Method188(a.Field3561));
   }

   private void Method857(int a, Class784 a, Class796 a) throws Class731 {
      Class784 a = this.Field3479[a];
      Class796 a = this.Field3480[a];
      this.Field3479[a] = this.Method853(a);
      boolean a = true;
      this.Field3480[a] = a.Method807();
      a = true;
      if (!this.Field3481[a]) {
         this.Field3481[a] = true;
         this.Field3482[this.Field3483++] = a;
      }

   }

   private void Method858(int a, Class784 a, Class784 a, Class796 a, boolean[] a) throws Class731 {
      Class784 a = this.Field3479[a];
      Class796 a = this.Field3480[a];
      a.Method897(a, a);
      this.Field3479[a] = this.Method853(a);
      boolean a = true;
      a |= a.Method808(a);
      if (!this.Field3481[a]) {
         this.Field3481[a] = true;
         this.Field3482[this.Field3483++] = a;
      }

   }

   private static Class731 Method859(Class731 class731) {
      return class731;
   }
}
