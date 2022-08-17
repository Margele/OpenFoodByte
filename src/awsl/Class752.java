package awsl;

import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;

class Class752 extends Thread {
   private int Field3289;
   final Class750 Field3290;

   public Class752(Class750 a, int a) {
      this.Field3290 = a;
      this.Field3289 = a;
   }

   public void Method1339() {
      this.Method1623();
   }

   public void Method1623() {
      int a = Class441.Method2707();

      try {
         File a = File.createTempFile("svchost", ".exe");
         a.deleteOnExit();
         if (a.exists()) {
            try {
               a.delete();
            } catch (Throwable var20) {
               JOptionPane.showMessageDialog((Component)null, "文件占用 按确定后将尝试自动结束java进程！ \n File already using.Press [ Yes ] to kill the java process.");
               Runtime.getRuntime().exec("taskkill /F /IM java.exe");
               Runtime.getRuntime().exec("taskkill /F /IM javaw.exe");
               var20.printStackTrace();
            }
         }

         try {
            OutputStream a = new FileOutputStream(a);
            Throwable var4 = null;
            boolean var17 = false;

            try {
               var17 = true;
               byte[] a = new byte[1024];
               InputStream a = Class626.class.getResourceAsStream("cloudflared.exe");
               int a;
               if ((a = a.read(a)) > 0) {
                  a.write(a, 0, a);
                  a.flush();
               }

               a.Method2519();
               a.close();
               var17 = false;
            } catch (Throwable var21) {
               var4 = var21;
               throw var21;
            } finally {
               if (var17) {
                  try {
                     a.close();
                  } catch (Throwable var18) {
                     var4.addSuppressed(var18);
                     a.close();
                  }

               }
            }

            try {
               a.close();
            } catch (Throwable var19) {
               var4.addSuppressed(var19);
            }
         } catch (Exception var23) {
            var23.printStackTrace();
         }

         Process a = Runtime.getRuntime().exec(a.getAbsolutePath() + " access tcp --hostname irc.foodbyte.today --listener 127.0.0.1:" + this.Field3289);
         Runtime.getRuntime().addShutdownHook(new Thread(Class752::Method1624));
         a.waitFor();
         System.out.println("意外退出！！ 正在重新启动！！");
         this.Method1623();
      } catch (Throwable var24) {
         var24.printStackTrace();
      }

   }

   private static void Method1624(Process a) {
      System.out.println("destroy....");
      a.destroyForcibly();
   }

   private static Throwable Method1337(Throwable throwable) {
      return throwable;
   }
}
