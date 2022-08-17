package awsl;

public enum Class615 {
   public static final Class615 NONE;
   public static final Class615 ISLAND;
   public static final Class615 END;
   public static final Class615 DRAGON_NEST;
   public static final Class615 VOID_SEPULTURE;
   public static final Class615 DUNGEON;
   public static final Class615 DUNGEONING;
   public static final Class615 WOODS;
   public static final Class615 PARK;
   public static final Class615 DWARVENMINES;
   private String Field2858;
   private static int[] Field2860;

   public static Class615[] Method3531() {
      return (Class615[])Field2859.clone();
   }

   public static Class615 Method3532(String a) {
      return (Class615)Enum.valueOf(Class615.class, a);
   }

   private Class615(String a) {
      this.Field2858 = a;
   }

   static {
      Method3533((int[])null);
      NONE = new Class615("NONE", 0, "NONE");
      ISLAND = new Class615("ISLAND", 1, "Island");
      END = new Class615("END", 2, "The End");
      DRAGON_NEST = new Class615("DRAGON_NEST", 3, "Dragon's Nest");
      VOID_SEPULTURE = new Class615("VOID_SEPULTURE", 4, "Void Sepulture");
      DUNGEON = new Class615("DUNGEON", 5, "Dungeon");
      DUNGEONING = new Class615("DUNGEONING", 6, "Dungeoning");
      WOODS = new Class615("WOODS", 7, "WoodIsland");
      PARK = new Class615("PARK", 8, "Park");
      DWARVENMINES = new Class615("DWARVENMINES", 9, "Dwarven Mines");
   }

   public static void Method3533(int[] arr) {
      Field2860 = arr;
   }

   public static int[] Method3534() {
      return Field2860;
   }
}
