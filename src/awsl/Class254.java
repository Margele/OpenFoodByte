package awsl;

import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class Class254 implements Composite {
   private int Field1391;

   public Class254(int a) {
      this.Field1391 = a;
   }

   public CompositeContext Method1356(ColorModel a, ColorModel a, RenderingHints a2) {
      return new Class240(this.Field1391, a, a);
   }

   public int Method2103() {
      return 0;
   }

   public boolean Method2104(Object a) {
      return a instanceof Class254;
   }
}
