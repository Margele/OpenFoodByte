package awsl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import obfuscate.a;
import obfuscate.b;

public class Class814 extends Class786 implements Class45 {
   public Class814() {
      super(327680);
   }

   protected Class814(int a) {
      super(a);
   }

   public Class816 Method3663(b a) {
      return a == b.Field572 ? null : new Class816(1);
   }

   public Class816 Method3664(a a) {
      int[] var2 = Class786.Method917();
      switch (a.Method3640()) {
         case 9:
         case 10:
         case 14:
         case 15:
            boolean var3 = true;
         case 18:
            Object var4 = ((Class106)a).Field850;
            boolean var10000;
            if (!(var4 instanceof Long) && !(var4 instanceof Double)) {
               var10000 = true;
            } else {
               var10000 = true;
            }
         case 178:
            int var5 = b.Method3204(((Class93)a).Field809).Method3233();
      }

      byte var6 = 1;
      return new Class816(var6, a);
   }

   public Class816 Method3665(a a, Class816 a) {
      return new Class816(a.Method806(), a);
   }

   public Class816 Method3666(a a, Class816 a) {
      int var3;
      switch (a.Method3640()) {
         case 117:
         case 119:
         case 133:
         case 135:
         case 138:
         case 140:
         case 141:
         case 143:
            var3 = 2;
            break;
         case 180:
            var3 = b.Method3204(((Class93)a).Field809).Method3233();
            break;
         default:
            var3 = 1;
      }

      return new Class816(var3, a);
   }

   public Class816 Method3667(a a, Class816 a, Class816 a) {
      int[] var4 = Class786.Method917();
      switch (a.Method3640()) {
         case 47:
         case 49:
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
         case 121:
         case 123:
         case 125:
         case 127:
         case 129:
         case 131:
            boolean var5 = true;
         default:
            byte var6 = 1;
            return new Class816(var6, a);
      }
   }

   public Class816 Method3668(a a, Class816 a, Class816 a, Class816 a) {
      return new Class816(1, a);
   }

   public Class816 Method3669(a a, List a) {
      int var4 = a.Method3640();
      int var3;
      if (var4 == 197) {
         var3 = 1;
      } else {
         String var5 = var4 == 186 ? ((Class88)a).Field760 : ((Class98)a).Field826;
         var3 = b.Method3213(var5).Method3233();
      }

      return new Class816(var3, a);
   }

   public void Method3670(a a, Class816 a, Class816 a) {
   }

   public Class816 Method3671(Class816 a, Class816 a) {
      if (a.Field3653 instanceof Class701 && a.Field3653 instanceof Class701) {
         Set var4 = ((Class701)a.Field3653).Method1800((Class701)a.Field3653);
         return var4 == a.Field3653 && a.Field3652 == a.Field3652 ? a : new Class816(Math.min(a.Field3652, a.Field3652), var4);
      } else if (a.Field3652 == a.Field3652 && a.Field3653.containsAll(a.Field3653)) {
         return a;
      } else {
         HashSet var3 = new HashSet();
         var3.addAll(a.Field3653);
         var3.addAll(a.Field3653);
         return new Class816(Math.min(a.Field3652, a.Field3652), var3);
      }
   }

   public Class797 Method915(Class797 class7971, Class797 class7972) {
      return this.Method3671((Class816)class7971, (Class816)class7972);
   }

   public void Method914(a class91, Class797 class7972, Class797 class7973) throws Class731 {
      this.Method3670(class91, (Class816)class7972, (Class816)class7973);
   }

   public Class797 Method913(a class91, List list) throws Class731 {
      return this.Method3669(class91, list);
   }

   public Class797 Method912(a class91, Class797 class7972, Class797 class7973, Class797 class7974) throws Class731 {
      return this.Method3668(class91, (Class816)class7972, (Class816)class7973, (Class816)class7974);
   }

   public Class797 Method911(a class91, Class797 class7972, Class797 class7973) throws Class731 {
      return this.Method3667(class91, (Class816)class7972, (Class816)class7973);
   }

   public Class797 Method910(a class91, Class797 class797) throws Class731 {
      return this.Method3666(class91, (Class816)class797);
   }

   public Class797 Method909(a class91, Class797 class797) throws Class731 {
      return this.Method3665(class91, (Class816)class797);
   }

   public Class797 Method908(a class91) throws Class731 {
      return this.Method3664(class91);
   }

   public Class797 Method907(b class46) {
      return this.Method3663(class46);
   }
}
