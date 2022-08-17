package eventapi;

import java.util.concurrent.CopyOnWriteArrayList;
import obfuscate.a;

final class PackedMethodData extends CopyOnWriteArrayList {
   private static final long Field2267 = 666L;
   final MethodData methodData;

   PackedMethodData(MethodData class533) {
      EventManager.trash2();
      this.methodData = class533;
      super();
      this.Method2530(this.methodData);
      if (a.trash() == null) {
         EventManager.trash(false);
      }

   }
}
