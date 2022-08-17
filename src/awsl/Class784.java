package awsl;

import java.util.ArrayList;
import obfuscate.a;
import obfuscate.b;

public class Class784 {
   private Class797 Field3532;
   private Class797[] Field3533;
   private int Field3534;
   private int Field3535;

   public Class784(int a, int a) {
      this.Field3533 = (Class797[])(new Class797[a + a]);
      this.Field3534 = a;
   }

   public Class784(Class784 a) {
      this(a.Field3534, a.Field3533.length - a.Field3534);
      this.Method884(a);
   }

   public Class784 Method884(Class784 a) {
      this.Field3532 = a.Field3532;
      System.arraycopy(a.Field3533, 0, this.Field3533, 0, this.Field3533.length);
      this.Field3535 = a.Field3535;
      return this;
   }

   public void Method885(Class797 a) {
      this.Field3532 = a;
   }

   public int Method886() {
      return this.Field3534;
   }

   public int Method887() {
      return this.Field3533.length - this.Field3534;
   }

   public Class797 Method888(int a) throws IndexOutOfBoundsException {
      if (a >= this.Field3534) {
         throw new IndexOutOfBoundsException("Trying to access an inexistant local variable");
      } else {
         return this.Field3533[a];
      }
   }

   public void Method889(int a, Class797 a) throws IndexOutOfBoundsException {
      if (a >= this.Field3534) {
         throw new IndexOutOfBoundsException("Trying to access an inexistant local variable " + a);
      } else {
         this.Field3533[a] = a;
      }
   }

   public int Method890() {
      return this.Field3535;
   }

   public Class797 Method891(int a) throws IndexOutOfBoundsException {
      return this.Field3533[a + this.Field3534];
   }

   public void Method892() {
      this.Field3535 = 0;
   }

   public Class797 Method893() throws IndexOutOfBoundsException {
      if (this.Field3535 == 0) {
         throw new IndexOutOfBoundsException("Cannot pop operand off an empty stack.");
      } else {
         return this.Field3533[--this.Field3535 + this.Field3534];
      }
   }

   public void Method894(Class797 a) throws IndexOutOfBoundsException {
      if (this.Field3535 + this.Field3534 >= this.Field3533.length) {
         throw new IndexOutOfBoundsException("Insufficient maximum stack size.");
      } else {
         this.Field3533[this.Field3535++ + this.Field3534] = a;
      }
   }

   public void Method895(a a, Class786 a) throws Class731 {
      int[] var3 = Class786.Method917();
      Class797 var4;
      Class797 var5;
      Class797 var6;
      ArrayList var8;
      int var9;
      String var10;
      int var11;
      switch (a.Method3640()) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
            this.Method894(a.Method908(a));
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
            this.Method894(a.Method909(a, this.Method888(((Class112)a).Field877)));
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
            var5 = this.Method893();
            var4 = this.Method893();
            this.Method894(a.Method911(a, var4, var5));
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
            var4 = a.Method909(a, this.Method893());
            var9 = ((Class112)a).Field877;
            this.Method889(var9, var4);
            if (var4.Method806() == 2) {
               this.Method889(var9 + 1, a.Method907((b)null));
            }

            Class797 var13 = this.Method888(var9 - 1);
            if (var13.Method806() == 2) {
               this.Method889(var9 - 1, a.Method907((b)null));
            }
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
            var6 = this.Method893();
            var5 = this.Method893();
            var4 = this.Method893();
            a.Method912(a, var4, var5, var6);
         case 87:
            if (this.Method893().Method806() == 2) {
               throw new Class731(a, "Illegal use of POP");
            }
            break;
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
         case 196:
         default:
            throw new RuntimeException("Illegal opcode " + a.Method3640());
         case 88:
            if (this.Method893().Method806() == 1 && this.Method893().Method806() != 1) {
               throw new Class731(a, "Illegal use of POP2");
            }
            break;
         case 89:
            var4 = this.Method893();
            if (var4.Method806() != 1) {
               throw new Class731(a, "Illegal use of DUP");
            }

            this.Method894(var4);
            this.Method894(a.Method909(a, var4));
         case 90:
            var4 = this.Method893();
            var5 = this.Method893();
            if (var4.Method806() != 1 || var5.Method806() != 1) {
               throw new Class731(a, "Illegal use of DUP_X1");
            }

            this.Method894(a.Method909(a, var4));
            this.Method894(var5);
            this.Method894(var4);
         case 91:
            var4 = this.Method893();
            if (var4.Method806() == 1) {
               var5 = this.Method893();
               if (var5.Method806() == 1) {
                  var6 = this.Method893();
                  if (var6.Method806() != 1) {
                     throw new Class731(a, "Illegal use of DUP_X2");
                  }

                  this.Method894(a.Method909(a, var4));
                  this.Method894(var6);
                  this.Method894(var5);
                  this.Method894(var4);
               }

               this.Method894(a.Method909(a, var4));
               this.Method894(var5);
               this.Method894(var4);
            }

            throw new Class731(a, "Illegal use of DUP_X2");
         case 92:
            var4 = this.Method893();
            if (var4.Method806() == 1) {
               var5 = this.Method893();
               if (var5.Method806() != 1) {
                  throw new Class731(a, "Illegal use of DUP2");
               }

               this.Method894(var5);
               this.Method894(var4);
               this.Method894(a.Method909(a, var5));
               this.Method894(a.Method909(a, var4));
            }

            this.Method894(var4);
            this.Method894(a.Method909(a, var4));
            break;
         case 93:
            var4 = this.Method893();
            if (var4.Method806() == 1) {
               var5 = this.Method893();
               if (var5.Method806() != 1) {
                  throw new Class731(a, "Illegal use of DUP2_X1");
               }

               var6 = this.Method893();
               if (var6.Method806() != 1) {
                  throw new Class731(a, "Illegal use of DUP2_X1");
               }

               this.Method894(a.Method909(a, var5));
               this.Method894(a.Method909(a, var4));
               this.Method894(var6);
               this.Method894(var5);
               this.Method894(var4);
            }

            var5 = this.Method893();
            if (var5.Method806() == 1) {
               this.Method894(a.Method909(a, var4));
               this.Method894(var5);
               this.Method894(var4);
            }

            throw new Class731(a, "Illegal use of DUP2_X1");
         case 94:
            var4 = this.Method893();
            if (var4.Method806() == 1) {
               var5 = this.Method893();
               if (var5.Method806() != 1) {
                  throw new Class731(a, "Illegal use of DUP2_X2");
               }

               var6 = this.Method893();
               if (var6.Method806() == 1) {
                  Class797 var7 = this.Method893();
                  if (var7.Method806() != 1) {
                     throw new Class731(a, "Illegal use of DUP2_X2");
                  }

                  this.Method894(a.Method909(a, var5));
                  this.Method894(a.Method909(a, var4));
                  this.Method894(var7);
                  this.Method894(var6);
                  this.Method894(var5);
                  this.Method894(var4);
               }

               this.Method894(a.Method909(a, var5));
               this.Method894(a.Method909(a, var4));
               this.Method894(var6);
               this.Method894(var5);
               this.Method894(var4);
            }

            var5 = this.Method893();
            if (var5.Method806() == 1) {
               var6 = this.Method893();
               if (var6.Method806() != 1) {
                  throw new Class731(a, "Illegal use of DUP2_X2");
               }

               this.Method894(a.Method909(a, var4));
               this.Method894(var6);
               this.Method894(var5);
               this.Method894(var4);
            }

            this.Method894(a.Method909(a, var4));
            this.Method894(var5);
            this.Method894(var4);
            throw new Class731(a, "Illegal use of DUP2_X2");
         case 95:
            var5 = this.Method893();
            var4 = this.Method893();
            if (var4.Method806() != 1 || var5.Method806() != 1) {
               throw new Class731(a, "Illegal use of SWAP");
            }

            this.Method894(a.Method909(a, var5));
            this.Method894(a.Method909(a, var4));
         case 96:
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
            var5 = this.Method893();
            var4 = this.Method893();
            this.Method894(a.Method911(a, var4, var5));
         case 116:
         case 117:
         case 118:
         case 119:
            this.Method894(a.Method910(a, this.Method893()));
         case 120:
         case 121:
         case 122:
         case 123:
         case 124:
         case 125:
         case 126:
         case 127:
         case 128:
         case 129:
         case 130:
         case 131:
            var5 = this.Method893();
            var4 = this.Method893();
            this.Method894(a.Method911(a, var4, var5));
         case 132:
            var9 = ((Class82)a).Field712;
            this.Method889(var9, a.Method910(a, this.Method888(var9)));
         case 133:
         case 134:
         case 135:
         case 136:
         case 137:
         case 138:
         case 139:
         case 140:
         case 141:
         case 142:
         case 143:
         case 144:
         case 145:
         case 146:
         case 147:
            this.Method894(a.Method910(a, this.Method893()));
         case 148:
         case 149:
         case 150:
         case 151:
         case 152:
            var5 = this.Method893();
            var4 = this.Method893();
            this.Method894(a.Method911(a, var4, var5));
         case 153:
         case 154:
         case 155:
         case 156:
         case 157:
         case 158:
            a.Method910(a, this.Method893());
         case 159:
         case 160:
         case 161:
         case 162:
         case 163:
         case 164:
         case 165:
         case 166:
            var5 = this.Method893();
            var4 = this.Method893();
            a.Method911(a, var4, var5);
         case 167:
         case 168:
            this.Method894(a.Method908(a));
         case 169:
         case 170:
         case 171:
            a.Method910(a, this.Method893());
         case 172:
         case 173:
         case 174:
         case 175:
         case 176:
            var4 = this.Method893();
            a.Method910(a, var4);
            a.Method914(a, var4, this.Field3532);
         case 177:
            if (this.Field3532 != null) {
               throw new Class731(a, "Incompatible return type");
            }
            break;
         case 178:
            this.Method894(a.Method908(a));
         case 179:
            a.Method910(a, this.Method893());
         case 180:
            this.Method894(a.Method910(a, this.Method893()));
         case 181:
            var5 = this.Method893();
            var4 = this.Method893();
            a.Method911(a, var4, var5);
         case 182:
         case 183:
         case 184:
         case 185:
            var8 = new ArrayList();
            var10 = ((Class98)a).Field826;
            var11 = b.Method3211(var10).length;
            var8.add(0, this.Method893());
            --var11;
            if (a.Method3640() != 184) {
               var8.add(0, this.Method893());
            }

            if (b.Method3213(var10) == b.Field572) {
               a.Method913(a, var8);
            }

            this.Method894(a.Method913(a, var8));
         case 186:
            var8 = new ArrayList();
            var10 = ((Class88)a).Field760;
            var11 = b.Method3211(var10).length;
            var8.add(0, this.Method893());
            --var11;
            if (b.Method3213(var10) == b.Field572) {
               a.Method913(a, var8);
            }

            this.Method894(a.Method913(a, var8));
         case 187:
            this.Method894(a.Method908(a));
         case 188:
         case 189:
         case 190:
            this.Method894(a.Method910(a, this.Method893()));
         case 191:
            a.Method910(a, this.Method893());
         case 192:
         case 193:
            this.Method894(a.Method910(a, this.Method893()));
         case 194:
         case 195:
            a.Method910(a, this.Method893());
         case 197:
            var8 = new ArrayList();
            int var12 = ((Class120)a).Field953;
            var8.add(0, this.Method893());
            --var12;
            this.Method894(a.Method913(a, var8));
         case 198:
         case 199:
            a.Method910(a, this.Method893());
            throw new RuntimeException("Illegal opcode " + a.Method3640());
      }

   }

   public boolean Method896(Class784 a, Class786 a) throws Class731 {
      if (this.Field3535 != a.Field3535) {
         throw new Class731((a)null, "Incompatible stack heights");
      } else {
         boolean var3 = false;

         for(int var4 = 0; var4 < this.Field3534 + this.Field3535; ++var4) {
            Class797 var5 = a.Method915(this.Field3533[var4], a.Field3533[var4]);
            if (!var5.Method3429(this.Field3533[var4])) {
               this.Field3533[var4] = var5;
               var3 = true;
            }
         }

         return var3;
      }
   }

   public boolean Method897(Class784 a, boolean[] a) {
      boolean var3 = false;

      for(int var4 = 0; var4 < this.Field3534; ++var4) {
         if (!a[var4] && !this.Field3533[var4].Method3429(a.Field3533[var4])) {
            this.Field3533[var4] = a.Field3533[var4];
            var3 = true;
         }
      }

      return var3;
   }

   public String Method898() {
      StringBuilder var1 = new StringBuilder();

      int var2;
      for(var2 = 0; var2 < this.Method886(); ++var2) {
         var1.append(this.Method888(var2));
      }

      var1.append(' ');

      for(var2 = 0; var2 < this.Method890(); ++var2) {
         var1.append(this.Method891(var2).Method3780());
      }

      return var1.toString();
   }

   private static Exception Method899(Exception exception) {
      return exception;
   }
}
