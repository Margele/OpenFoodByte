package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import obfuscate.b;

public abstract class Class5 extends Class2 implements Class45 {
   private static final Object Field101 = new Object();
   private static final Object Field102 = new Object();
   protected int Field103;
   protected String Field104;
   private boolean Field105;
   private boolean Field106;
   private List Field107;
   private Map Field108;

   protected Class5(int a, Class267 a, int a, String a, String a) {
      super(a, a, a, a, a);
      this.Field103 = a;
      this.Field104 = a;
      this.Field105 = "<init>".equals(a);
   }

   public void Method1652() {
      this.Field1460.Method1652();
      if (this.Field105) {
         this.Field107 = new ArrayList();
         this.Field108 = new HashMap();
      } else {
         this.Field106 = true;
         this.Method1966();
      }

   }

   public void Method1947(Class264 a) {
      this.Field1460.Method1947(a);
      if (this.Field105 && this.Field108 != null) {
         List var2 = (List)this.Field108.Method2665(a);
         this.Field107 = var2;
         this.Field108.remove(a);
      }

   }

   public void Method1948(int a) {
      boolean var2 = Class37.Method3383();
      if (this.Field105) {
         int var3;
         switch (a) {
            case 177:
               this.Method1967(a);
            case 172:
            case 174:
            case 176:
            case 191:
               this.Method1963();
               this.Method1967(a);
            case 173:
            case 175:
               this.Method1963();
               this.Method1963();
               this.Method1967(a);
            case 0:
            case 47:
            case 49:
            case 116:
            case 117:
            case 118:
            case 119:
            case 134:
            case 138:
            case 139:
            case 143:
            case 145:
            case 146:
            case 147:
            case 190:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 133:
            case 135:
            case 140:
            case 141:
               this.Method1965(Field102);
            case 9:
            case 10:
            case 14:
            case 15:
               this.Method1965(Field102);
               this.Method1965(Field102);
            case 46:
            case 48:
            case 50:
            case 51:
            case 52:
            case 53:
            case 87:
            case 96:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 108:
            case 110:
            case 112:
            case 114:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 128:
            case 130:
            case 136:
            case 137:
            case 142:
            case 144:
            case 149:
            case 150:
            case 194:
            case 195:
               this.Method1963();
            case 88:
            case 97:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 109:
            case 111:
            case 113:
            case 115:
            case 127:
            case 129:
            case 131:
               this.Method1963();
               this.Method1963();
            case 79:
            case 81:
            case 83:
            case 84:
            case 85:
            case 86:
            case 148:
            case 151:
            case 152:
               this.Method1963();
               this.Method1963();
               this.Method1963();
            case 80:
            case 82:
               this.Method1963();
               this.Method1963();
               this.Method1963();
               this.Method1963();
            case 89:
               this.Method1965(this.Method1964());
            case 90:
               var3 = this.Field107.Method1799();
               this.Field107.add(var3 - 2, this.Field107.get(var3 - 1));
            case 91:
               var3 = this.Field107.Method1799();
               this.Field107.add(var3 - 3, this.Field107.get(var3 - 1));
            case 92:
               var3 = this.Field107.Method1799();
               this.Field107.add(var3 - 2, this.Field107.get(var3 - 1));
               this.Field107.add(var3 - 2, this.Field107.get(var3 - 1));
            case 93:
               var3 = this.Field107.Method1799();
               this.Field107.add(var3 - 3, this.Field107.get(var3 - 1));
               this.Field107.add(var3 - 3, this.Field107.get(var3 - 1));
            case 94:
               var3 = this.Field107.Method1799();
               this.Field107.add(var3 - 4, this.Field107.get(var3 - 1));
               this.Field107.add(var3 - 4, this.Field107.get(var3 - 1));
            case 95:
               var3 = this.Field107.Method1799();
               this.Field107.add(var3 - 2, this.Field107.get(var3 - 1));
               this.Field107.remove(var3);
            case 16:
            case 17:
            case 18:
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
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
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
            case 132:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
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
            case 192:
            case 193:
         }
      }

      switch (a) {
         case 172:
         case 173:
         case 174:
         case 175:
         case 176:
         case 177:
         case 191:
            this.Method1967(a);
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
            this.Field1460.Method1948(a);
      }
   }

   public void Method1840(int a, int a) {
      super.Method1840(a, a);
      if (this.Field105) {
         switch (a) {
            case 21:
            case 23:
               this.Method1965(Field102);
               break;
            case 22:
            case 24:
               this.Method1965(Field102);
               this.Method1965(Field102);
               break;
            case 25:
               this.Method1965(Field101);
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
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            default:
               break;
            case 54:
            case 56:
            case 58:
               this.Method1963();
               break;
            case 55:
            case 57:
               this.Method1963();
               this.Method1963();
         }
      }

   }

   public void Method1949(int a, String a, String a, String a) {
      this.Field1460.Method1949(a, a, a, a);
      if (this.Field105) {
         char var5 = a.charAt(0);
         boolean var6 = var5 == 'J' || var5 == 'D';
         switch (a) {
            case 178:
               this.Method1965(Field102);
               this.Method1965(Field102);
               break;
            case 179:
               this.Method1963();
               this.Method1963();
               break;
            case 180:
            default:
               this.Method1965(Field102);
               break;
            case 181:
               this.Method1963();
               this.Method1963();
               this.Method1963();
         }
      }

   }

   public void Method854(int a, int a) {
      this.Field1460.Method854(a, a);
      if (this.Field105 && a != 188) {
         this.Method1965(Field102);
      }

   }

   public void Method1950(Object a) {
      this.Field1460.Method1950(a);
      if (this.Field105) {
         this.Method1965(Field102);
         if (a instanceof Double || a instanceof Long) {
            this.Method1965(Field102);
         }
      }

   }

   public void Method1951(String a, int a) {
      this.Field1460.Method1951(a, a);
      if (this.Field105) {
         for(int var3 = 0; var3 < a; ++var3) {
            this.Method1963();
         }

         this.Method1965(Field102);
      }

   }

   public void Method1952(int a, String a) {
      this.Field1460.Method1952(a, a);
      if (this.Field105 && a == 187) {
         this.Method1965(Field102);
      }

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
      this.Field1460.Method1954(a, a, a, a, a);
      if (this.Field105) {
         b[] var6 = b.Method3211(a);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            this.Method1963();
            if (var6[var7].Method3233() == 2) {
               this.Method1963();
            }
         }

         switch (a) {
            case 182:
            case 185:
               this.Method1963();
               break;
            case 183:
               Object var8 = this.Method1963();
               if (var8 == Field101 && !this.Field106) {
                  this.Method1966();
                  this.Field106 = true;
                  this.Field105 = false;
               }
            case 184:
         }

         b var9 = b.Method3213(a);
         if (var9 != b.Field572) {
            this.Method1965(Field102);
            if (var9.Method3233() == 2) {
               this.Method1965(Field102);
            }
         }
      }

   }

   public void Method1956(String a, String a, Class279 a, Object[] a) {
      this.Field1460.Method1956(a, a, a, a);
      if (this.Field105) {
         b[] var5 = b.Method3211(a);

         for(int var6 = 0; var6 < var5.length; ++var6) {
            this.Method1963();
            if (var5[var6].Method3233() == 2) {
               this.Method1963();
            }
         }

         b var7 = b.Method3213(a);
         if (var7 != b.Field572) {
            this.Method1965(Field102);
            if (var7.Method3233() == 2) {
               this.Method1965(Field102);
            }
         }
      }

   }

   public void Method1957(int a, Class264 a) {
      this.Field1460.Method1957(a, a);
      if (this.Field105) {
         switch (a) {
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 198:
            case 199:
               this.Method1963();
               break;
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
               this.Method1963();
               this.Method1963();
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
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            default:
               break;
            case 168:
               this.Method1965(Field102);
         }

         this.Method1962(a);
      }

   }

   public void Method1958(Class264 a, int[] a, Class264[] a) {
      this.Field1460.Method1958(a, a, a);
      if (this.Field105) {
         this.Method1963();
         this.Method1961(a, a);
      }

   }

   public void Method1959(int a, int a, Class264 a, Class264[] a) {
      this.Field1460.Method1959(a, a, a, a);
      if (this.Field105) {
         this.Method1963();
         this.Method1961(a, a);
      }

   }

   public void Method1960(Class264 a, Class264 a, Class264 a, String a) {
      super.Method1960(a, a, a, a);
      if (this.Field105 && !this.Field108.containsKey(a)) {
         ArrayList var5 = new ArrayList();
         var5.Method2530(Field102);
         this.Field108.put(a, var5);
      }

   }

   private void Method1961(Class264 a, Class264[] a) {
      this.Method1962(a);

      for(int var3 = 0; var3 < a.length; ++var3) {
         this.Method1962(a[var3]);
      }

   }

   private void Method1962(Class264 a) {
      if (!this.Field108.containsKey(a)) {
         this.Field108.put(a, new ArrayList(this.Field107));
      }
   }

   private Object Method1963() {
      return this.Field107.remove(this.Field107.Method1799() - 1);
   }

   private Object Method1964() {
      return this.Field107.get(this.Field107.Method1799() - 1);
   }

   private void Method1965(Object a) {
      this.Field107.Method2530(a);
   }

   protected void Method1966() {
   }

   protected void Method1967(int a) {
   }
}
