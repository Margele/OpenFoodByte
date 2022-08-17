package trash.foodbyte.value;

import awsl.Class333;
import awsl.Class446;
import awsl.Class447;
import java.util.ArrayList;
import java.util.Arrays;
import obfuscate.a;

public class ModeValue extends Class447 {
   Class333 Field2091;
   private String[] Field2092;

   public ModeValue(String a, String a, String a, String[] a) {
      this(a, a, a, false, a);
   }

   public ModeValue(String a, String a, String a, String[] a, String a) {
      this(a, a, a, false, a);
      this.Field2119 = a;
   }

   public ModeValue(String a, String a, String a, boolean a3, String[] a) {
      this.Field2091 = new Class333(1.0F, 0.05F);
      this.Field2117 = a;
      this.Field2118 = a;
      this.Field2120 = a;
      ArrayList a = new ArrayList(Arrays.asList(a));
      if (!a.contains(a)) {
         a.Method2530(a);
      }

      this.Field2092 = (String[])a.toArray(new String[0]);
      Class446.Method2762(this);
   }

   public String Method2719() {
      return (String)this.Field2120;
   }

   public void Method2720(String a) {
   }

   public void Method2721(String a) {
      BooleanValue.Method2512();
      ArrayList a = new ArrayList(Arrays.asList(this.Field2092));
      if (!a.contains(a)) {
         a.Method2530(a);
      }

      this.Field2092 = (String[])a.toArray(new String[0]);
      if (a.trash() == null) {
         BooleanValue.Method2511(new int[3]);
      }

   }

   public void Method2722(String a) {
      BooleanValue.Method2512();
      ArrayList a = new ArrayList(Arrays.asList(this.Field2092));
      a.removeIf(ModeValue::Method2729);
      this.Field2092 = (String[])a.toArray(new String[0]);
      a.trash(new String[5]);
   }

   public String[] Method2723() {
      return this.Field2092;
   }

   public String getMode() {
      return (String)this.Field2120;
   }

   public void Method2725(String a) {
      this.Method2720(a);
   }

   public boolean isCurrentMode(String a) {
      return this.Method2719().equals(a);
   }

   public Class333 Method2727() {
      return this.Field2091;
   }

   public String[] Method2728() {
      return this.Field2092;
   }

   public Object Method2454() {
      return this.Method2719();
   }

   private static boolean Method2729(String a, String a) {
      return a.equals(a);
   }
}
