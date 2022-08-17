package awsl;

import java.io.IOException;
import org.xml.sax.SAXException;

class Class732 extends Class730 {
   final Class169 Field3211;
   final Class892 Field3212;

   Class732(Class892 a, Class167 a, Class169 class169) {
      super(a);
      this.Field3212 = a;
      this.Field3211 = class169;
   }

   public void Method1636() throws SAXException {
      try {
         this.Field3212.Field3915.write(this.Field3211.Method1503());
      } catch (IOException var2) {
         throw new SAXException(var2);
      }
   }
}
