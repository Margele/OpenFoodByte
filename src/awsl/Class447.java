package awsl;

public class Class447 {
   protected String Field2117;
   protected String Field2118;
   protected String Field2119 = "暂无说明~";
   protected Object Field2120;
   protected boolean Field2121;
   private static String[] Field2122;

   public Object Method2454() {
      return this.Field2120;
   }

   public void Method2510(Object a) {
      this.Field2120 = a;
   }

   public String Method2753() {
      return this.Field2119;
   }

   public String Method2754() {
      return this.Field2118;
   }

   public String Method2755() {
      return this.Field2117;
   }

   public boolean Method2756() {
      return this.Field2121;
   }

   public void Method2757(boolean a) {
      this.Field2121 = true;
   }

   public static void Method2758(String[] arr) {
      Field2122 = arr;
   }

   public static String[] Method2759() {
      return Field2122;
   }

   static {
      if (Method2759() == null) {
         Method2758(new String[5]);
      }

   }
}
