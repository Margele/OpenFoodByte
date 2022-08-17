package awsl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Class144 {
   public static final Class144 Field999 = new Class144();
   public static final Class144 Field1000 = (new Class144()).Method1426(true);
   private boolean Field1001;
   private String Field1002;
   private boolean Field1003;
   private Map Field1004;

   public Class144() {
      this.Field1001 = false;
      this.Field1002 = "content";
      this.Field1003 = false;
      this.Field1004 = Collections.emptyMap();
   }

   /** @deprecated */
   @Deprecated
   public Class144(boolean a) {
      this(a, "content", false);
   }

   /** @deprecated */
   @Deprecated
   public Class144(String a) {
      this(false, a, false);
   }

   /** @deprecated */
   @Deprecated
   public Class144(boolean a, String a) {
      this.Field1001 = a;
      this.Field1002 = a;
      this.Field1003 = false;
   }

   /** @deprecated */
   @Deprecated
   public Class144(boolean a, String a, boolean a) {
      this.Field1001 = a;
      this.Field1002 = a;
      this.Field1003 = a;
   }

   private Class144(boolean a, String a, boolean a, Map a) {
      this.Field1001 = a;
      this.Field1002 = a;
      this.Field1003 = a;
      this.Field1004 = Collections.unmodifiableMap(a);
   }

   protected Class144 Method1424() {
      return new Class144(this.Field1001, this.Field1002, this.Field1003, this.Field1004);
   }

   public boolean Method1425() {
      return this.Field1001;
   }

   public Class144 Method1426(boolean a) {
      Class144 var2 = this.Method1424();
      var2.Field1001 = a;
      return var2;
   }

   public String Method1427() {
      return this.Field1002;
   }

   public Class144 Method1428(String a) {
      Class144 var2 = this.Method1424();
      var2.Field1002 = a;
      return var2;
   }

   public boolean Method1429() {
      return this.Field1003;
   }

   public Class144 Method1430(boolean a) {
      Class144 var2 = this.Method1424();
      var2.Field1003 = a;
      return var2;
   }

   public Map Method1431() {
      return this.Field1004;
   }

   public Class144 Method1432(Map a) {
      Class144 var2 = this.Method1424();
      HashMap var3 = new HashMap(a);
      var2.Field1004 = Collections.unmodifiableMap(var3);
      return var2;
   }

   protected Object Method1433() throws CloneNotSupportedException {
      return this.Method1424();
   }
}
