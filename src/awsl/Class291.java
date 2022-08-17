package awsl;

public class Class291 extends Class290 {
   public Class291(String a) {
      super(a);
   }

   public String Method2899() throws Class666 {
      Class666.Method3438();
      StringBuilder a = new StringBuilder();

      char a;
      do {
         a = this.Method2885();
      } while(Character.isWhitespace(a));

      if (a == '"' || a == '\'') {
         char a = a;
         a = this.Method2885();
         if (a < ' ') {
            throw this.Method2895("Unterminated string.");
         }

         if (a == a) {
            return a.toString();
         }

         a.append(a);
      }

      while(!Character.isWhitespace(a)) {
         a.append(a);
         a = this.Method2885();
      }

      return a.toString();
   }

   private static Class666 Method2906(Class666 class666) {
      return class666;
   }
}
