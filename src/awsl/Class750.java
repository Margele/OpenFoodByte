package awsl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.CompletableFuture;

public class Class750 extends Thread {
   private static int Field3281 = 6868;
   private Class752 Field3282;

   public Class750() {
      if (!this.Method1616(Field3281)) {
         Class752 var1 = new Class752(this, Field3281);
         CompletableFuture.runAsync(Class750::Method1618);
      }

      System.out.println("堵塞测试");
   }

   public boolean Method1616(int a) {
      boolean var2 = true;

      try {
         var2 = this.Method1617("127.0.0.1", a);
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public boolean Method1617(String a, int a) throws UnknownHostException {
      boolean var3 = false;
      InetAddress var4 = InetAddress.getByName(a);

      try {
         new Socket(var4, a);
         var3 = true;
      } catch (IOException var6) {
      }

      return var3;
   }

   private static void Method1618(Class752 a) {
      a.Method1339();
   }
}
