package trash.foodbyte.utils;

public enum Servers {
   public static final Servers SB = new Servers("SB", 0);
   public static final Servers SW = new Servers("SW", 1);
   public static final Servers BW = new Servers("BW", 2);
   public static final Servers UHC = new Servers("UHC", 3);
   public static final Servers SG = new Servers("SG", 4);
   public static final Servers MW = new Servers("MW", 5);
   public static final Servers PRE = new Servers("PRE", 6);
   public static final Servers DUELS = new Servers("DUELS", 7);
   public static final Servers PIT = new Servers("PIT", 8);
   public static final Servers NONE = new Servers("NONE", 9);
   public static final Servers LOBBY = new Servers("LOBBY", 10);
   public static final Servers MM = new Servers("MM", 11);

   public static Servers[] getAllServers() {
      return (Servers[])ALL_SERVERS.clone();
   }

   public static Servers getServerByString(String str) {
      return (Servers)Enum.valueOf(Servers.class, str);
   }
}
