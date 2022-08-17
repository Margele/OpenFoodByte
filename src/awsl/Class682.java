package awsl;

import javax.xml.transform.Templates;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import org.xml.sax.ContentHandler;

final class Class682 implements Class672 {
   private SAXTransformerFactory Field2964;
   private final Templates Field2965;
   private ContentHandler Field2966;

   Class682(SAXTransformerFactory a, Templates a, ContentHandler a) {
      this.Field2964 = a;
      this.Field2965 = a;
      this.Field2966 = a;
   }

   public final ContentHandler Method2326() {
      try {
         TransformerHandler var1 = this.Field2964.newTransformerHandler(this.Field2965);
         var1.setResult(new SAXResult(this.Field2966));
         return var1;
      } catch (TransformerConfigurationException var2) {
         throw new RuntimeException(var2.toString());
      }
   }
}
