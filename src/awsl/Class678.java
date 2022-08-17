package awsl;

import java.io.IOException;
import java.io.OutputStream;

final class Class678 implements Class674 {
   private final OutputStream Field2959;

   Class678(OutputStream a) {
      this.Field2959 = a;
   }

   public OutputStream Method2334(String a) throws IOException {
      return this.Field2959;
   }

   public void Method2335() throws IOException {
      this.Field2959.flush();
   }
}
