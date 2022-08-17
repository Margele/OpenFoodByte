package trash.foodbyte.event;

import awsl.Class266;
import eventapi.Event;

public abstract class UnknownEvent implements Event, Class266 {
   private boolean Field1380;
   private static String Field1381;

   protected UnknownEvent() {
   }

   public boolean Method2241() {
      return this.Field1380;
   }

   public void Method2300(boolean a) {
      this.Field1380 = a;
   }

   public static void Method2301(String string) {
      Field1381 = string;
   }

   public static String Method2302() {
      return Field1381;
   }

   static {
      if (Method2302() == null) {
         Method2301("rII19b");
      }

   }
}
