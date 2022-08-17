package awsl;

import java.io.Writer;
import org.xml.sax.ContentHandler;

final class Class676 implements Class672 {
   private final Writer Field2956;
   private final boolean Field2957;

   Class676(Writer a, boolean a) {
      this.Field2956 = a;
      this.Field2957 = a;
   }

   public final ContentHandler Method2326() {
      return new Class738(this.Field2956, this.Field2957);
   }
}
