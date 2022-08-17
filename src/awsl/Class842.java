package awsl;

import org.xml.sax.Attributes;

final class Class842 extends Class831 {
   final Class730 Field3730;

   Class842(Class730 a) {
      super(a);
      this.Field3730 = a;
   }

   public void Method3501(String a, Attributes a) {
      String var4 = a.getValue("desc");
      boolean var5 = Boolean.valueOf(a.getValue("visible"));
      int var6 = Integer.parseInt(a.getValue("typeRef"));
      Class31 var7 = Class31.Method3435(a.getValue("typePath"));
      Class831.Method3658();
      String[] var8 = a.getValue("start").split(" ");
      Class264[] var9 = new Class264[var8.length];
      int var10 = 0;
      if (var10 < var9.length) {
         var9[var10] = this.Method3654(var8[var10]);
         ++var10;
      }

      String[] var15 = a.getValue("end").split(" ");
      Class264[] var11 = new Class264[var15.length];
      int var12 = 0;
      if (var12 < var11.length) {
         var11[var12] = this.Method3654(var15[var12]);
         ++var12;
      }

      String[] var16 = a.getValue("index").split(" ");
      int[] var13 = new int[var16.length];
      int var14 = 0;
      if (var14 < var13.length) {
         var13[var14] = Integer.parseInt(var16[var14]);
         ++var14;
      }

      this.Field3730.Method1950(((Class267)this.Field3730.Method1963()).Method1844(var6, var7, var9, var11, var13, var4, var5));
   }

   public void Method3514(String a) {
      Class148 var2 = (Class148)this.Field3730.Method1964();
      var2.Method401();
   }
}
