package awsl;

import java.util.Iterator;
import obfuscate.a;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;

class Class420 extends Class421 {
   final Category Field2025;
   final Class705 Field2026;

   Class420(Class705 a, String a, double a, double a, double a, double a, boolean a, Class705 a, Category class689) {
      Class421.Method2390();
      this.Field2026 = a;
      this.Field2025 = class689;
      super(a, a, a, a, a, a, a);
      if (a.trash() == null) {
         Class421.Method2389(new String[1]);
      }

   }

   public void Method2381() {
      Class421.Method2390();
      Iterator var2 = ModuleManager.getAllModules().Method1383();
      if (var2.Method932()) {
         Module var3 = (Module)var2.Method933();
         if (!var3.Method1024().equals(this.Field2025)) {
            ;
         }

         this.Field2037.Method2530(new Class414(var3, this));
      }

   }
}
