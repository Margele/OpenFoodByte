package awsl;

public class Class597 implements Class593 {
   public static final int Field2794 = 1;
   public static final int Field2795 = 2;
   public static final int Field2796 = 3;
   public static final int Field2797 = 4;
   public static final int Field2798 = -1;
   public static final int Field2799 = -2;
   public static final int Field2800 = -3;
   public static final int Field2801 = -4;
   private int Field2802;

   public Class597(int a) {
      this.Field2802 = a;
   }

   public float Method29(float a) {
      switch (this.Field2802) {
         case -4:
            return a * a;
         case -3:
            return (float)Math.atan((double)a);
         case -2:
            return (float)Math.acos((double)a);
         case -1:
            return (float)Math.asin((double)a);
         case 0:
         default:
            return a;
         case 1:
            return (float)Math.sin((double)a);
         case 2:
            return (float)Math.cos((double)a);
         case 3:
            return (float)Math.tan((double)a);
         case 4:
            return (float)Math.sqrt((double)a);
      }
   }
}
