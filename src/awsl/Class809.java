package awsl;

import java.util.List;
import obfuscate.a;
import obfuscate.b;

public class Class809 extends Class786 implements Class45 {
   public Class809() {
      super(327680);
   }

   protected Class809(int a) {
      super(a);
   }

   public Class782 Method3360(b a) {
      return Class782.Field3513;
   }

   public Class782 Method3361(a a) throws Class731 {
      switch (a.Method3640()) {
         case 1:
            return this.Method3360(b.Method3205("null"));
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
            return Class782.Field3514;
         case 9:
         case 10:
            return Class782.Field3516;
         case 11:
         case 12:
         case 13:
            return Class782.Field3515;
         case 14:
         case 15:
            return Class782.Field3517;
         case 16:
         case 17:
            return Class782.Field3514;
         case 18:
            Object var2 = ((Class106)a).Field850;
            if (var2 instanceof Integer) {
               return Class782.Field3514;
            } else if (var2 instanceof Float) {
               return Class782.Field3515;
            } else if (var2 instanceof Long) {
               return Class782.Field3516;
            } else if (var2 instanceof Double) {
               return Class782.Field3517;
            } else if (var2 instanceof String) {
               return this.Method3360(b.Method3205("java/lang/String"));
            } else if (var2 instanceof b) {
               int var3 = ((b)var2).Method3217();
               if (var3 != 10 && var3 != 9) {
                  if (var3 == 11) {
                     return this.Method3360(b.Method3205("java/lang/invoke/MethodType"));
                  }

                  throw new IllegalArgumentException("Illegal LDC constant " + var2);
               }

               return this.Method3360(b.Method3205("java/lang/Class"));
            } else {
               if (var2 instanceof Class279) {
                  return this.Method3360(b.Method3205("java/lang/invoke/MethodHandle"));
               }

               throw new IllegalArgumentException("Illegal LDC constant " + var2);
            }
         case 168:
            return Class782.Field3519;
         case 178:
            return this.Method3360(b.Method3204(((Class93)a).Field809));
         case 187:
            return this.Method3360(b.Method3205(((Class110)a).Field871));
         default:
            throw new Error("Internal error.");
      }
   }

   public Class782 Method3362(a a, Class782 a) throws Class731 {
      return a;
   }

   public Class782 Method3363(a a, Class782 a) throws Class731 {
      String var3;
      switch (a.Method3640()) {
         case 116:
         case 132:
         case 136:
         case 139:
         case 142:
         case 145:
         case 146:
         case 147:
            return Class782.Field3514;
         case 117:
         case 133:
         case 140:
         case 143:
            return Class782.Field3516;
         case 118:
         case 134:
         case 137:
         case 144:
            return Class782.Field3515;
         case 119:
         case 135:
         case 138:
         case 141:
            return Class782.Field3517;
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
         case 153:
         case 154:
         case 155:
         case 156:
         case 157:
         case 158:
         case 170:
         case 171:
         case 172:
         case 173:
         case 174:
         case 175:
         case 176:
         case 179:
            return null;
         case 180:
            return this.Method3360(b.Method3204(((Class93)a).Field809));
         case 188:
            switch (((Class86)a).Field734) {
               case 4:
                  return this.Method3360(b.Method3204("[Z"));
               case 5:
                  return this.Method3360(b.Method3204("[C"));
               case 6:
                  return this.Method3360(b.Method3204("[F"));
               case 7:
                  return this.Method3360(b.Method3204("[D"));
               case 8:
                  return this.Method3360(b.Method3204("[B"));
               case 9:
                  return this.Method3360(b.Method3204("[S"));
               case 10:
                  return this.Method3360(b.Method3204("[I"));
               case 11:
                  return this.Method3360(b.Method3204("[J"));
               default:
                  throw new Class731(a, "Invalid array type");
            }
         case 189:
            var3 = ((Class110)a).Field871;
            return this.Method3360(b.Method3204("[" + b.Method3205(var3)));
         case 190:
            return Class782.Field3514;
         case 191:
            return null;
         case 192:
            var3 = ((Class110)a).Field871;
            return this.Method3360(b.Method3205(var3));
         case 193:
            return Class782.Field3514;
         case 194:
         case 195:
         case 198:
         case 199:
            return null;
      }
   }

   public Class782 Method3364(a a, Class782 a, Class782 a) throws Class731 {
      switch (a.Method3640()) {
         case 46:
         case 51:
         case 52:
         case 53:
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
            return Class782.Field3514;
         case 47:
         case 97:
         case 101:
         case 105:
         case 109:
         case 113:
         case 121:
         case 123:
         case 125:
         case 127:
         case 129:
         case 131:
            return Class782.Field3516;
         case 48:
         case 98:
         case 102:
         case 106:
         case 110:
         case 114:
            return Class782.Field3515;
         case 49:
         case 99:
         case 103:
         case 107:
         case 111:
         case 115:
            return Class782.Field3517;
         case 50:
            return Class782.Field3518;
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
         case 148:
         case 149:
         case 150:
         case 151:
         case 152:
            return Class782.Field3514;
         case 159:
         case 160:
         case 161:
         case 162:
         case 163:
         case 164:
         case 165:
         case 166:
         case 181:
            return null;
      }
   }

   public Class782 Method3365(a a, Class782 a, Class782 a, Class782 a) throws Class731 {
      return null;
   }

   public Class782 Method3366(a a, List a) throws Class731 {
      int var3 = a.Method3640();
      if (var3 == 197) {
         return this.Method3360(b.Method3204(((Class120)a).Field952));
      } else {
         return var3 == 186 ? this.Method3360(b.Method3213(((Class88)a).Field760)) : this.Method3360(b.Method3213(((Class98)a).Field826));
      }
   }

   public void Method3367(a a, Class782 a, Class782 a) throws Class731 {
   }

   public Class782 Method3368(Class782 a, Class782 a) {
      return !a.Method863(a) ? Class782.Field3513 : a;
   }

   public Class797 Method915(Class797 class7971, Class797 class7972) {
      return this.Method3368((Class782)class7971, (Class782)class7972);
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

   public Class797 Method908(a class91) throws Class731 {
      return this.Method3361(class91);
   }

   public Class797 Method907(b class46) {
      return this.Method3360(class46);
   }

   private static Exception Method3369(Exception exception) {
      return exception;
   }
}
