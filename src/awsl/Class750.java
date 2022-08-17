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
         Class752 a = new Class752(this, Field3281);
         CompletableFuture.runAsync(Class750::Method1618);
      }

      System.out.println("堵塞测试");
   }

   public boolean Method1616(int a) {
      boolean a = true;

      try {
         a = this.Method1617("127.0.0.1", a);
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return a;
   }

   public boolean Method1617(String a, int a) throws UnknownHostException {
      boolean a = false;
      InetAddress a = InetAddress.getByName(a);

      try {
         new Socket(a, a);
         a = true;
      } catch (IOException var6) {
      }

      return a;
   }

   private static void Method1618(Class752 a) {
      a.Method1339();
   }
}
