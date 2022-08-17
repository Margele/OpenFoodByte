package eventapi;

import java.lang.reflect.Method;
import obfuscate.a;

final class MethodData {
   private final Object source;
   private final Method target;
   private final byte priority;

   public MethodData(Object source, Method target, byte priority) {
      EventManager.trash2();
      super();
      this.source = source;
      this.target = target;
      this.priority = priority;
      a.trash(new String[1]);
   }

   public Object getSource() {
      return this.source;
   }

   public Method getTarget() {
      return this.target;
   }

   public byte getPriority() {
      return this.priority;
   }
}
