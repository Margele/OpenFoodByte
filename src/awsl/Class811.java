package awsl;

import java.util.List;
import obfuscate.a;
import obfuscate.b;

public class Class811 extends Class809 {
   public Class811() {
      super(327680);
   }

   protected Class811(int a) {
      super(a);
   }

   public Class782 Method3362(a a, Class782 a) throws Class731 {
      Class782 var3;
      switch (a.Method3640()) {
         case 21:
         case 54:
            var3 = Class782.Field3514;
            break;
         case 22:
         case 55:
            var3 = Class782.Field3516;
            break;
         case 23:
         case 56:
            var3 = Class782.Field3515;
            break;
         case 24:
         case 57:
            var3 = Class782.Field3517;
            break;
         case 25:
            if (!a.Method862()) {
               throw new Class731(a, (String)null, "an object reference", a);
            }

            return a;
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
            return a;
         case 58:
            if (!a.Method862() && !Class782.Field3519.Method863(a)) {
               throw new Class731(a, (String)null, "an object reference or a return address", a);
            }

            return a;
      }

      if (!var3.Method3429(a)) {
         throw new Class731(a, (String)null, var3, a);
      } else {
         return a;
      }
   }

   public Class782 Method3363(a a, Class782 a) throws Class731 {
      Class782 var3;
      switch (a.Method3640()) {
         case 116:
         case 132:
         case 133:
         case 134:
         case 135:
         case 145:
         case 146:
         case 147:
         case 153:
         case 154:
         case 155:
         case 156:
         case 157:
         case 158:
         case 170:
         case 171:
         case 172:
         case 188:
         case 189:
            var3 = Class782.Field3514;
            break;
         case 117:
         case 136:
         case 137:
         case 138:
         case 173:
            var3 = Class782.Field3516;
            break;
         case 118:
         case 139:
         case 140:
         case 141:
         case 174:
            var3 = Class782.Field3515;
            break;
         case 119:
         case 142:
         case 143:
         case 144:
         case 175:
            var3 = Class782.Field3517;
            break;
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
         case 148:
         case 149:
         case 150:
         case 151:
         case 152:
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
         case 177:
         case 178:
         case 181:
         case 182:
         case 183:
         case 184:
         case 185:
         case 186:
         case 187:
         case 196:
         case 197:
         default:
            throw new Error("Internal error.");
         case 176:
         case 191:
         case 193:
         case 194:
         case 195:
         case 198:
         case 199:
            if (!a.Method862()) {
               throw new Class731(a, (String)null, "an object reference", a);
            }

            return super.Method3363(a, a);
         case 179:
            var3 = this.Method3360(b.Method3204(((Class93)a).Field809));
            break;
         case 180:
            var3 = this.Method3360(b.Method3205(((Class93)a).Field807));
            break;
         case 190:
            if (!this.Method3660(a)) {
               throw new Class731(a, (String)null, "an array reference", a);
            }

            return super.Method3363(a, a);
         case 192:
            if (!a.Method862()) {
               throw new Class731(a, (String)null, "an object reference", a);
            }

            return super.Method3363(a, a);
      }

      if (!this.Method3662(a, var3)) {
         throw new Class731(a, (String)null, var3, a);
      } else {
         return super.Method3363(a, a);
      }
   }

   public Class782 Method3364(a a, Class782 a, Class782 a) throws Class731 {
      int[] var4 = Class786.Method917();
      Class782 var5;
      Class782 var6;
      switch (a.Method3640()) {
         case 46:
            var5 = this.Method3360(b.Method3204("[I"));
            var6 = Class782.Field3514;
         case 51:
            if (this.Method3662(a, this.Method3360(b.Method3204("[Z")))) {
               var5 = this.Method3360(b.Method3204("[Z"));
            }

            var5 = this.Method3360(b.Method3204("[B"));
            var6 = Class782.Field3514;
         case 52:
            var5 = this.Method3360(b.Method3204("[C"));
            var6 = Class782.Field3514;
         case 53:
            var5 = this.Method3360(b.Method3204("[S"));
            var6 = Class782.Field3514;
         case 47:
            var5 = this.Method3360(b.Method3204("[J"));
            var6 = Class782.Field3514;
         case 48:
            var5 = this.Method3360(b.Method3204("[F"));
            var6 = Class782.Field3514;
         case 49:
            var5 = this.Method3360(b.Method3204("[D"));
            var6 = Class782.Field3514;
         case 50:
            var5 = this.Method3360(b.Method3204("[Ljava/lang/Object;"));
            var6 = Class782.Field3514;
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
         case 159:
         case 160:
         case 161:
         case 162:
         case 163:
         case 164:
            var5 = Class782.Field3514;
            var6 = Class782.Field3514;
         case 98:
         case 102:
         case 106:
         case 110:
         case 114:
         case 149:
         case 150:
            var5 = Class782.Field3515;
            var6 = Class782.Field3515;
         case 97:
         case 101:
         case 105:
         case 109:
         case 113:
         case 127:
         case 129:
         case 131:
         case 148:
            var5 = Class782.Field3516;
            var6 = Class782.Field3516;
         case 121:
         case 123:
         case 125:
            var5 = Class782.Field3516;
            var6 = Class782.Field3514;
         case 99:
         case 103:
         case 107:
         case 111:
         case 115:
         case 151:
         case 152:
            var5 = Class782.Field3517;
            var6 = Class782.Field3517;
         case 165:
         case 166:
            var5 = Class782.Field3518;
            var6 = Class782.Field3518;
         case 181:
            Class93 var7 = (Class93)a;
            this.Method3360(b.Method3205(var7.Field807));
            this.Method3360(b.Method3204(var7.Field809));
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
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
         case 91:
         case 92:
         case 93:
         case 94:
         case 95:
         case 116:
         case 117:
         case 118:
         case 119:
         case 132:
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
         case 153:
         case 154:
         case 155:
         case 156:
         case 157:
         case 158:
         case 167:
         case 168:
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
         default:
            throw new Error("Internal error.");
      }
   }

   public Class782 Method3365(a a, Class782 a, Class782 a, Class782 a) throws Class731 {
      Class782 var5;
      Class782 var6;
      switch (a.Method3640()) {
         case 79:
            var5 = this.Method3360(b.Method3204("[I"));
            var6 = Class782.Field3514;
            break;
         case 80:
            var5 = this.Method3360(b.Method3204("[J"));
            var6 = Class782.Field3516;
            break;
         case 81:
            var5 = this.Method3360(b.Method3204("[F"));
            var6 = Class782.Field3515;
            break;
         case 82:
            var5 = this.Method3360(b.Method3204("[D"));
            var6 = Class782.Field3517;
            break;
         case 83:
            var5 = a;
            var6 = Class782.Field3518;
            break;
         case 84:
            if (this.Method3662(a, this.Method3360(b.Method3204("[Z")))) {
               var5 = this.Method3360(b.Method3204("[Z"));
            } else {
               var5 = this.Method3360(b.Method3204("[B"));
            }

            var6 = Class782.Field3514;
            break;
         case 85:
            var5 = this.Method3360(b.Method3204("[C"));
            var6 = Class782.Field3514;
            break;
         case 86:
            var5 = this.Method3360(b.Method3204("[S"));
            var6 = Class782.Field3514;
            break;
         default:
            throw new Error("Internal error.");
      }

      if (!this.Method3662(a, var5)) {
         throw new Class731(a, "First argument", "a " + var5 + " array reference", a);
      } else if (!Class782.Field3514.Method863(a)) {
         throw new Class731(a, "Second argument", Class782.Field3514, a);
      } else if (!this.Method3662(a, var6)) {
         throw new Class731(a, "Third argument", var6, a);
      } else {
         return null;
      }
   }

   public Class782 Method3366(a a, List a) throws Class731 {
      int var3 = a.Method3640();
      int var4;
      if (var3 == 197) {
         for(var4 = 0; var4 < a.Method1799(); ++var4) {
            if (!Class782.Field3514.Method863(a.get(var4))) {
               throw new Class731(a, (String)null, Class782.Field3514, (Class797)a.get(var4));
            }
         }
      } else {
         var4 = 0;
         int var5 = 0;
         if (var3 != 184 && var3 != 186) {
            b var6 = b.Method3205(((Class98)a).Field824);
            if (!this.Method3662((Class782)a.get(var4++), this.Method3360(var6))) {
               throw new Class731(a, "Method owner", this.Method3360(var6), (Class797)a.get(0));
            }
         }

         String var10 = var3 == 186 ? ((Class88)a).Field760 : ((Class98)a).Field826;
         b[] var7 = b.Method3211(var10);

         while(var4 < a.Method1799()) {
            Class782 var8 = this.Method3360(var7[var5++]);
            Class782 var9 = (Class782)a.get(var4++);
            if (!this.Method3662(var9, var8)) {
               throw new Class731(a, "Argument " + var5, var8, var9);
            }
         }
      }

      return super.Method3366(a, a);
   }

   public void Method3367(a a, Class782 a, Class782 a) throws Class731 {
      if (!this.Method3662(a, a)) {
         throw new Class731(a, "Incompatible return type", a, a);
      }
   }

   protected boolean Method3660(Class782 a) {
      return a.Method862();
   }

   protected Class782 Method3661(Class782 a) throws Class731 {
      return Class782.Field3518;
   }

   protected boolean Method3662(Class782 a, Class782 a) {
      return a.Method863(a);
   }

   public void Method914(a class91, Class797 class7972, Class797 class7973) throws Class731 {
      this.Method3367(class91, (Class782)class7972, (Class782)class7973);
   }

   public Class797 Method913(a class91, List list) throws Class731 {
      return this.Method3366(class91, list);
   }

   public Class797 Method912(a class91, Class797 class7972, Class797 class7973, Class797 class7974) throws Class731 {
      return this.Method3365(class91, (Class782)class7972, (Class782)class7973, (Class782)class7974);
   }

   public Class797 Method911(a class91, Class797 class7972, Class797 class7973) throws Class731 {
      return this.Method3364(class91, (Class782)class7972, (Class782)class7973);
   }

   public Class797 Method910(a class91, Class797 class797) throws Class731 {
      return this.Method3363(class91, (Class782)class797);
   }

   public Class797 Method909(a class91, Class797 class797) throws Class731 {
      return this.Method3362(class91, (Class782)class797);
   }

   private static Class731 Method859(Class731 class731) {
      return class731;
   }
}
