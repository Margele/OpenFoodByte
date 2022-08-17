package trash.foodbyte.notification;

import java.awt.Color;

public enum Types {
   public static final Types SUCCESS = new Types("SUCCESS", 0, "SUCCESS", 0, (new Color(3522898)).getRGB());
   public static final Types INFO = new Types("INFO", 1, "INFO", 1, (new Color(3644396)).getRGB());
   public static final Types WARNING = new Types("WARNING", 2, "WARNING", 2, (new Color(13807392)).getRGB());
   public static final Types ERROR = new Types("ERROR", 3, "ERROR", 3, (new Color(13120307)).getRGB());
   private final int Field2954;

   public static Types[] Method2346() {
      return (Types[])Field2955.clone();
   }

   public static Types Method2347(String a) {
      return (Types)Enum.valueOf(Types.class, a);
   }

   private Types(String a, int a1, int a) {
      this.Field2954 = a;
   }

   public int Method10() {
      return this.Field2954;
   }
}
