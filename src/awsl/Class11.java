package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import obfuscate.b;

public class Class11 extends Class267 {
   public List Field181;
   public List Field182;
   private List Field183;
   public Map Field184;
   private int Field185;
   private int Field186;
   private String Field187;

   public Class11(String a, int a, String a, String a, Class267 a) {
      this(327680, a, a, a, a, a);
      if (this.getClass() != Class11.class) {
         throw new IllegalStateException();
      }
   }

   protected Class11(int a, String a, int a, String a, String a, Class267 a) {
      super(a, a);
      this.Field187 = a;
      this.Field181 = new ArrayList();
      this.Field182 = new ArrayList();
      this.Field184 = new HashMap();
      if ((a & 8) == 0) {
         if ("<init>".equals(a)) {
            this.Field181.Method2530(Class45.Field402);
         } else {
            this.Field181.Method2530(a);
         }
      }

      b[] a = b.Method3211(a);

      for(int a = 0; a < a.length; ++a) {
         b a = a[a];
         switch (a.Method3217()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
               this.Field181.Method2530(Class45.Field397);
               break;
            case 6:
               this.Field181.Method2530(Class45.Field398);
               break;
            case 7:
               this.Field181.Method2530(Class45.Field400);
               this.Field181.Method2530(Class45.Field396);
               break;
            case 8:
               this.Field181.Method2530(Class45.Field399);
               this.Field181.Method2530(Class45.Field396);
               break;
            case 9:
               this.Field181.Method2530(a[a].Method3225());
               break;
            default:
               this.Field181.Method2530(a[a].Method3221());
         }
      }

      this.Field186 = this.Field181.Method1799();
   }

   public void Method1845(int a, int a, Object[] a, int a, Object[] a) {
      if (a != -1) {
         throw new IllegalStateException("ClassReader.accept() should be called with EXPAND_FRAMES flag");
      } else {
         if (this.Field1460 != null) {
            this.Field1460.Method1845(a, a, a, a, a);
         }

         if (this.Field181 != null) {
            this.Field181.clear();
            this.Field182.clear();
         } else {
            this.Field181 = new ArrayList();
            this.Field182 = new ArrayList();
         }

         Method3449(a, a, this.Field181);
         Method3449(a, a, this.Field182);
         this.Field185 = Math.max(this.Field185, this.Field182.Method1799());
      }
   }

   private static void Method3449(int a, Object[] a, List a) {
      for(int a = 0; a < a; ++a) {
         Object a = a[a];
         a.Method2530(a);
         if (a == Class45.Field400 || a == Class45.Field399) {
            a.Method2530(Class45.Field396);
         }
      }

   }

   public void Method1948(int a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1948(a);
      }

      this.Method3452(a, 0, (String)null);
      if (a >= 172 && a <= 177 || a == 191) {
         this.Field181 = null;
         this.Field182 = null;
      }

   }

   public void Method854(int a, int a) {
      if (this.Field1460 != null) {
         this.Field1460.Method854(a, a);
      }

      this.Method3452(a, a, (String)null);
   }

   public void Method1840(int a, int a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1840(a, a);
      }

      this.Method3452(a, a, (String)null);
   }

   public void Method1952(int a, String a) {
      if (a == 187) {
         if (this.Field183 == null) {
            Class264 a = new Class264();
            this.Field183 = new ArrayList(3);
            this.Field183.Method2530(a);
            if (this.Field1460 != null) {
               this.Field1460.Method1947(a);
            }
         }

         for(int a = 0; a < this.Field183.Method1799(); ++a) {
            this.Field184.put(this.Field183.get(a), a);
         }
      }

      if (this.Field1460 != null) {
         this.Field1460.Method1952(a, a);
      }

      this.Method3452(a, 0, a);
   }

   public void Method1949(int a, String a, String a, String a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1949(a, a, a, a);
      }

      this.Method3452(a, 0, a);
   }

   /** @deprecated */
   @Deprecated
   public void Method1953(int a, String a, String a, String a) {
      if (this.Field1459 >= 327680) {
         super.Method1953(a, a, a, a);
      } else {
         this.Method1955(a, a, a, a, a == 185);
      }
   }

   public void Method1954(int a, String a, String a, String a, boolean a) {
      if (this.Field1459 < 327680) {
         super.Method1954(a, a, a, a, a);
      } else {
         this.Method1955(a, a, a, a, a);
      }
   }

   private void Method1955(int a, String a, String a, String a, boolean a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1954(a, a, a, a, a);
      }

      if (this.Field181 == null) {
         this.Field183 = null;
      } else {
         this.Method3451(a);
         if (a != 184) {
            Object a = this.Method1963();
            if (a == 183 && a.charAt(0) == '<') {
               Object a;
               if (a == Class45.Field402) {
                  a = this.Field187;
               } else {
                  a = this.Field184.Method2665(a);
               }

               int a;
               for(a = 0; a < this.Field181.Method1799(); ++a) {
                  if (this.Field181.get(a) == a) {
                     this.Field181.set(a, a);
                  }
               }

               for(a = 0; a < this.Field182.Method1799(); ++a) {
                  if (this.Field182.get(a) == a) {
                     this.Field182.set(a, a);
                  }
               }
            }
         }

         this.Method1873(a);
         this.Field183 = null;
      }
   }

   public void Method1956(String a, String a, Class279 a, Object[] a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1956(a, a, a, a);
      }

      if (this.Field181 == null) {
         this.Field183 = null;
      } else {
         this.Method3451(a);
         this.Method1873(a);
         this.Field183 = null;
      }
   }

   public void Method1957(int a, Class264 a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1957(a, a);
      }

      this.Method3452(a, 0, (String)null);
      if (a == 167) {
         this.Field181 = null;
         this.Field182 = null;
      }

   }

   public void Method1947(Class264 a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1947(a);
      }

      if (this.Field183 == null) {
         this.Field183 = new ArrayList(3);
      }

      this.Field183.Method2530(a);
   }

   public void Method1950(Object a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1950(a);
      }

      if (this.Field181 == null) {
         this.Field183 = null;
      } else {
         if (a instanceof Integer) {
            this.Method1965(Class45.Field397);
         } else if (a instanceof Long) {
            this.Method1965(Class45.Field400);
            this.Method1965(Class45.Field396);
         } else if (a instanceof Float) {
            this.Method1965(Class45.Field398);
         } else if (a instanceof Double) {
            this.Method1965(Class45.Field399);
            this.Method1965(Class45.Field396);
         } else if (a instanceof String) {
            this.Method1965("java/lang/String");
         } else if (a instanceof b) {
            int a = ((b)a).Method3217();
            if (a != 10 && a != 9) {
               if (a != 11) {
                  throw new IllegalArgumentException();
               }

               this.Method1965("java/lang/invoke/MethodType");
            } else {
               this.Method1965("java/lang/Class");
            }
         } else {
            if (!(a instanceof Class279)) {
               throw new IllegalArgumentException();
            }

            this.Method1965("java/lang/invoke/MethodHandle");
         }

         this.Field183 = null;
      }
   }

   public void Method1841(int a, int a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1841(a, a);
      }

      this.Method3452(132, a, (String)null);
   }

   public void Method1959(int a, int a, Class264 a, Class264[] a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1959(a, a, a, a);
      }

      this.Method3452(170, 0, (String)null);
      this.Field181 = null;
      this.Field182 = null;
   }

   public void Method1958(Class264 a, int[] a, Class264[] a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1958(a, a, a);
      }

      this.Method3452(171, 0, (String)null);
      this.Field181 = null;
      this.Field182 = null;
   }

   public void Method1951(String a, int a) {
      if (this.Field1460 != null) {
         this.Field1460.Method1951(a, a);
      }

      this.Method3452(197, a, a);
   }

   public void Method1842(int a, int a) {
      if (this.Field1460 != null) {
         this.Field185 = Math.max(this.Field185, a);
         this.Field186 = Math.max(this.Field186, a);
         this.Field1460.Method1842(this.Field185, this.Field186);
      }

   }

   private Object Method3450(int a) {
      this.Field186 = Math.max(this.Field186, a + 1);
      return a < this.Field181.Method1799() ? this.Field181.get(a) : Class45.Field396;
   }

   private void Method1849(int a, Object a) {
      this.Field186 = Math.max(this.Field186, a + 1);

      while(a >= this.Field181.Method1799()) {
         this.Field181.Method2530(Class45.Field396);
      }

      this.Field181.set(a, a);
   }

   private void Method1965(Object a) {
      this.Field182.Method2530(a);
      this.Field185 = Math.max(this.Field185, this.Field182.Method1799());
   }

   private void Method1873(String a) {
      int a = a.charAt(0) == '(' ? a.indexOf(41) + 1 : 0;
      switch (a.charAt(a)) {
         case 'B':
         case 'C':
         case 'I':
         case 'S':
         case 'Z':
            this.Method1965(Class45.Field397);
            return;
         case 'D':
            this.Method1965(Class45.Field399);
            this.Method1965(Class45.Field396);
            return;
         case 'E':
         case 'G':
         case 'H':
         case 'K':
         case 'L':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'T':
         case 'U':
         case 'W':
         case 'X':
         case 'Y':
         default:
            this.Method1965(a.substring(1, a.length() - 1));
            break;
         case 'F':
            this.Method1965(Class45.Field398);
            return;
         case 'J':
            this.Method1965(Class45.Field400);
            this.Method1965(Class45.Field396);
            return;
         case 'V':
            return;
         case '[':
            this.Method1965(a);
      }

   }

   private Object Method1963() {
      return this.Field182.remove(this.Field182.Method1799() - 1);
   }

   private void Method1869(int a) {
      int a = this.Field182.Method1799();
      int a = a - a;

      for(int a = a - 1; a >= a; --a) {
         this.Field182.remove(a);
      }

   }

   private void Method3451(String a) {
      char a = a.charAt(0);
      if (a == '(') {
         int a = 0;
         b[] a = b.Method3211(a);

         for(int a = 0; a < a.length; ++a) {
            a += a[a].Method3233();
         }

         this.Method1869(a);
      } else if (a != 'J' && a != 'D') {
         this.Method1869(1);
      } else {
         this.Method1869(2);
      }

   }

   private void Method3452(int a, int a, String a) {
      int a = Class37.Method3383();
      if (this.Field181 == null) {
         this.Field183 = null;
      } else {
         Object a;
         Object a;
         Object a;
         switch (a) {
            case 0:
            case 116:
            case 117:
            case 118:
            case 119:
            case 145:
            case 146:
            case 147:
            case 167:
            case 177:
            case 1:
               this.Method1965(Class45.Field401);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
               this.Method1965(Class45.Field397);
            case 9:
            case 10:
               this.Method1965(Class45.Field400);
               this.Method1965(Class45.Field396);
            case 11:
            case 12:
            case 13:
               this.Method1965(Class45.Field398);
            case 14:
            case 15:
               this.Method1965(Class45.Field399);
               this.Method1965(Class45.Field396);
            case 21:
            case 23:
            case 25:
               this.Method1965(this.Method3450(a));
            case 22:
            case 24:
               this.Method1965(this.Method3450(a));
               this.Method1965(Class45.Field396);
            case 46:
            case 51:
            case 52:
            case 53:
               this.Method1869(2);
               this.Method1965(Class45.Field397);
            case 47:
            case 143:
               this.Method1869(2);
               this.Method1965(Class45.Field400);
               this.Method1965(Class45.Field396);
            case 48:
               this.Method1869(2);
               this.Method1965(Class45.Field398);
            case 49:
            case 138:
               this.Method1869(2);
               this.Method1965(Class45.Field399);
               this.Method1965(Class45.Field396);
            case 50:
               this.Method1869(1);
               a = this.Method1963();
               if (a instanceof String) {
                  this.Method1873(((String)a).substring(1));
               }

               this.Method1965("java/lang/Object");
            case 54:
            case 56:
            case 58:
               a = this.Method1963();
               this.Method1849(a, a);
               a = this.Method3450(a - 1);
               if (a != Class45.Field400 && a != Class45.Field399) {
                  break;
               }

               this.Method1849(a - 1, Class45.Field396);
            case 55:
            case 57:
               this.Method1869(1);
               a = this.Method1963();
               this.Method1849(a, a);
               this.Method1849(a + 1, Class45.Field396);
               a = this.Method3450(a - 1);
               if (a != Class45.Field400 && a != Class45.Field399) {
                  break;
               }

               this.Method1849(a - 1, Class45.Field396);
            case 79:
            case 81:
            case 83:
            case 84:
            case 85:
            case 86:
               this.Method1869(3);
            case 80:
            case 82:
               this.Method1869(4);
            case 87:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 170:
            case 171:
            case 172:
            case 174:
            case 176:
            case 191:
            case 194:
            case 195:
            case 198:
            case 199:
               this.Method1869(1);
            case 88:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 173:
            case 175:
               this.Method1869(2);
            case 89:
               a = this.Method1963();
               this.Method1965(a);
               this.Method1965(a);
            case 90:
               a = this.Method1963();
               a = this.Method1963();
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
            case 91:
               a = this.Method1963();
               a = this.Method1963();
               a = this.Method1963();
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
            case 92:
               a = this.Method1963();
               a = this.Method1963();
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
            case 93:
               a = this.Method1963();
               a = this.Method1963();
               a = this.Method1963();
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
            case 94:
               a = this.Method1963();
               a = this.Method1963();
               a = this.Method1963();
               Object a = this.Method1963();
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
               this.Method1965(a);
            case 95:
               a = this.Method1963();
               a = this.Method1963();
               this.Method1965(a);
               this.Method1965(a);
            case 96:
            case 100:
            case 104:
            case 108:
            case 112:
            case 120:
            case 122:
            case 124:
            case 126:
            case 128:
            case 130:
            case 136:
            case 142:
            case 149:
            case 150:
               this.Method1869(2);
               this.Method1965(Class45.Field397);
            case 97:
            case 101:
            case 105:
            case 109:
            case 113:
            case 127:
            case 129:
            case 131:
               this.Method1869(4);
               this.Method1965(Class45.Field400);
               this.Method1965(Class45.Field396);
            case 98:
            case 102:
            case 106:
            case 110:
            case 114:
            case 137:
            case 144:
               this.Method1869(2);
               this.Method1965(Class45.Field398);
            case 99:
            case 103:
            case 107:
            case 111:
            case 115:
               this.Method1869(4);
               this.Method1965(Class45.Field399);
               this.Method1965(Class45.Field396);
            case 121:
            case 123:
            case 125:
               this.Method1869(3);
               this.Method1965(Class45.Field400);
               this.Method1965(Class45.Field396);
            case 132:
               this.Method1849(a, Class45.Field397);
            case 133:
            case 140:
               this.Method1869(1);
               this.Method1965(Class45.Field400);
               this.Method1965(Class45.Field396);
            case 134:
               this.Method1869(1);
               this.Method1965(Class45.Field398);
            case 135:
            case 141:
               this.Method1869(1);
               this.Method1965(Class45.Field399);
               this.Method1965(Class45.Field396);
            case 139:
            case 190:
            case 193:
               this.Method1869(1);
               this.Method1965(Class45.Field397);
            case 148:
            case 151:
            case 152:
               this.Method1869(4);
               this.Method1965(Class45.Field397);
               throw new RuntimeException("JSR/RET are not supported");
            case 168:
            case 169:
               throw new RuntimeException("JSR/RET are not supported");
            case 178:
               this.Method1873(a);
            case 179:
               this.Method3451(a);
            case 180:
               this.Method1869(1);
               this.Method1873(a);
            case 181:
               this.Method3451(a);
               this.Method1963();
            case 187:
               this.Method1965(this.Field183.get(0));
            case 188:
               this.Method1963();
               switch (a) {
                  case 4:
                     this.Method1873("[Z");
                  case 5:
                     this.Method1873("[C");
                  case 8:
                     this.Method1873("[B");
                  case 9:
                     this.Method1873("[S");
                  case 10:
                     this.Method1873("[I");
                  case 6:
                     this.Method1873("[F");
                  case 7:
                     this.Method1873("[D");
                  default:
                     this.Method1873("[J");
               }
            case 189:
               this.Method1963();
               this.Method1873("[" + b.Method3205(a));
            case 192:
               this.Method1963();
               this.Method1873(b.Method3205(a).Method3225());
            case 18:
            case 19:
            case 20:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 196:
            case 197:
            default:
               this.Method1869(a);
               this.Method1873(a);
         }

         this.Field183 = null;
      }
   }

   private static IllegalStateException Method1852(IllegalStateException illegalStateException) {
      return illegalStateException;
   }
}
