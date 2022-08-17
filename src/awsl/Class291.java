package awsl;

public class Class291 extends Class290 {
   public Class291(String a) {
      super(a);
   }

   public String Method2899() throws Class666 {
      Class666.Method3438();
      StringBuilder var4 = new StringBuilder();

      char var2;
      do {
         var2 = this.Method2885();
      } while(Character.isWhitespace(var2));

      if (var2 == '"' || var2 == '\'') {
         char var3 = var2;
         var2 = this.Method2885();
         if (var2 < ' ') {
            throw this.Method2895("Unterminated string.");
         }

         if (var2 == var3) {
            return var4.toString();
         }

         var4.append(var2);
      }

      while(!Character.isWhitespace(var2)) {
         var4.append(var2);
         var2 = this.Method2885();
      }

      return var4.toString();
   }

   private static Class666 Method2906(Class666 class666) {
      return class666;
   }
}
