package awsl;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import net.minecraft.launchwrapper.IClassTransformer;
import obfuscate.a;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class692 implements IClassTransformer {
   private final Logger Field2986;
   private static final Multimap Field2987 = ArrayListMultimap.create();

   public Class692() {
      Class441.Method2706();
      this.Field2986 = LogManager.getLogger("FoodByte Transformer");
      Method2513(new Class399());
      Method2513(new Class402());
      Method2513(new Class409());
      Method2513(new Class406());
      Method2513(new Class408());
      Method2513(new Class403());
      Method2513(new Class405());
      Method2513(new Class410());
      Method2513(new Class459());
      Method2513(new Class465());
      Method2513(new Class398());
      Method2513(new Class434());
      Method2513(new Class457());
      Method2513(new Class456());
      Method2513(new Class460());
      Method2513(new Class462());
      Method2513(new Class435());
      Method2513(new Class437());
      Method2513(new Class427());
      Method2513(new Class429());
      Method2513(new Class470());
      Method2513(new Class458());
      Method2513(new Class436());
      Method2513(new Class428());
      Method2513(new Class468());
      Method2513(new Class455());
      Method2513(new Class400());
      Method2513(new Class431());
      Method2513(new Class464());
      Method2513(new Class463());
      Method2513(new Class469());
      Method2513(new Class433());
      Method2513(new Class466());
      Method2513(new Class432());
      Method2513(new Class401());
      Method2513(new Class404());
      Method2513(new Class467());
      Method2513(new Class430());
      a.trash(new String[4]);
   }

   private static void Method2513(Class422 a) {
      String[] var2 = a.Method1360();
      Class441.Method2707();
      int var3 = var2.length;
      int var4 = 0;
      if (var4 < var3) {
         String var5 = var2[var4];
         Field2987.put(var5, a);
         ++var4;
      }

   }

   public byte[] transform(String a, String a, byte[] a) {
      return this.Method2514(a, a);
   }

   public byte[] Method2514(String a, byte[] a) {
      return null;
   }

   private void Method2515(String a, Class169 a) {
      try {
         File var3 = new File("fbbytecode");
         File var4 = new File(var3, a + ".class");
         if (!var3.exists()) {
            return;
         }

         if (!var4.exists()) {
            var4.createNewFile();
         }

         FileOutputStream var5 = new FileOutputStream(var4);
         var5.write(a.Method1503());
         var5.close();
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   private void Method2516(String a, Class224 a, Class422 a) {
      this.Field2986.fatal("Applying transformer {} on {}...", new Object[]{a.getClass().getName(), a});
      a.Method1361(a, a);
      a.Field1260.forEach(Class692::Method2517);
   }

   private static void Method2517(Class422 a, String a, Class15 a) {
      a.Method1359(a, a);
   }

   private static Throwable Method2518(Throwable throwable) {
      return throwable;
   }
}
