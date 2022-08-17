package eventapi;

public abstract class StoppableEvent implements Event {
   private boolean Field1387;
   private static String[] Field1388;

   protected StoppableEvent() {
   }

   public void Method2240() {
      this.Field1387 = true;
   }

   public boolean isStopped() {
      return this.Field1387;
   }

   public static void Method2242(String[] arr) {
      Field1388 = arr;
   }

   public static String[] Method2243() {
      return Field1388;
   }

   static {
      if (Method2243() != null) {
         Method2242(new String[1]);
      }

   }
}
