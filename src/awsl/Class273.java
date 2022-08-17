package awsl;

import org.xml.sax.Attributes;

public final class Class273 extends Class253 {
   Class663 Field1475;

   public Class273(Class663 a, Attributes a) {
      super(327680);
      this.Field1475 = a;
      a.Method2394("field", a);
   }

   public Class148 Method2114(String a, boolean a1) {
      return new Class134(this.Field1475, "annotation", 1, (String)null, a);
   }

   public Class148 Method2115(int a, Class31 a, String a, boolean a3) {
      return new Class134(this.Field1475, "typeAnnotation", 1, (String)null, a, a, a);
   }

   public void Method2121() {
      this.Field1475.Method2395("field");
   }
}
