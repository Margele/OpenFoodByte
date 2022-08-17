package trash.foodbyte.module;

public enum Category {
   public static final Category COMBAT;
   public static final Category MOVEMENT;
   public static final Category RENDER;
   public static final Category PLAYER;
   public static final Category WORLD;
   public static final Category SKYBLOCK;
   public String Field2976;
   private static int[] Field2978;

   public static Category[] Method2760() {
      return (Category[])Field2977.clone();
   }

   public static Category Method2761(String a) {
      return (Category)Enum.valueOf(Category.class, a);
   }

   private Category(String a, int a, String a) {
      this.Field2976 = a;
   }

   static {
      Method85((int[])null);
      COMBAT = new Category("COMBAT", 0, "COMBAT", 0, "Combat");
      MOVEMENT = new Category("MOVEMENT", 1, "MOVEMENT", 1, "Movement");
      RENDER = new Category("RENDER", 2, "RENDER", 2, "Render");
      PLAYER = new Category("PLAYER", 3, "PLAYER", 3, "Player");
      WORLD = new Category("WORLD", 4, "WORLD", 4, "World");
      SKYBLOCK = new Category("SKYBLOCK", 5, "SKYBLOCK", 5, "SkyBlock");
   }

   public static void Method85(int[] arr) {
      Field2978 = arr;
   }

   public static int[] Method3438() {
      return Field2978;
   }
}
