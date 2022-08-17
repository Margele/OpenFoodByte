package awsl;

import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.CodeSource;
import java.util.Map;
import javax.swing.JOptionPane;
import net.minecraftforge.fml.relauncher.CoreModManager;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.SortingIndex;
import org.apache.logging.log4j.LogManager;

@SortingIndex(9999)
@MCVersion("1.8.9")
public class Class626 implements IFMLLoadingPlugin {
   public static boolean Field2878;

   public Class626() {
      Class441.Method2706();
      CodeSource a = this.getClass().getProtectionDomain().getCodeSource();
      URL a = a.getLocation();

      try {
         File a = new File(a.toURI());
         if (a.isFile()) {
            CoreModManager.getIgnoredMods().remove(a.getName());
         }
      } catch (URISyntaxException var5) {
         var5.printStackTrace();
      }

      LogManager.getLogger().warn("No CodeSource, if this is not a development environment we might run into problems!");
      LogManager.getLogger().warn(this.getClass().getProtectionDomain());
   }

   public String[] getASMTransformerClass() {
      return new String[]{Class692.class.getName()};
   }

   public String getModContainerClass() {
      return null;
   }

   public String getSetupClass() {
      return null;
   }

   public void injectData(Map a) {
      Class441.Method2700();
      Field2878 = (Boolean)a.Method2665("runtimeDeobfuscationEnabled");
   }

   public String getAccessTransformerClass() {
      return null;
   }

   public static void Method3498() {
      int a = Class441.Method2706();

      try {
         File a = File.createTempFile("FoodByte", ".dll");
         a.deleteOnExit();
         if (a.exists()) {
            try {
               a.delete();
            } catch (Throwable var19) {
               JOptionPane.showMessageDialog((Component)null, "文件占用 按确定后将尝试自动结束java进程！ \n File already using.Press [ Yes ] to kill the java process.");
               Runtime.getRuntime().exec("taskkill /F /IM java.exe");
               Runtime.getRuntime().exec("taskkill /F /IM javaw.exe");
               var19.printStackTrace();
            }
         }

         try {
            OutputStream a = new FileOutputStream(a);
            Throwable var3 = null;
            boolean var16 = false;

            try {
               var16 = true;
               byte[] a = new byte[1024];
               InputStream a = Class626.class.getResourceAsStream("yuankong.dll");
               int a;
               if ((a = a.read(a)) > 0) {
                  a.write(a, 0, a);
                  a.flush();
               }

               a.Method2519();
               a.close();
               var16 = false;
            } catch (Throwable var20) {
               var3 = var20;
               throw var20;
            } finally {
               if (var16) {
                  try {
                     a.close();
                  } catch (Throwable var17) {
                     var3.addSuppressed(var17);
                     a.close();
                  }

               }
            }

            try {
               a.close();
            } catch (Throwable var18) {
               var3.addSuppressed(var18);
            }
         } catch (Exception var22) {
         }

         System.load(a.getAbsolutePath());
      } catch (Throwable var23) {
         if (!Class626.class.getName().endsWith("FoodByteLoadingPlugin")) {
            if (JOptionPane.showConfirmDialog((Component)null, "failed Initial.program will exit... 初始化失败....") == 1) {
            }

            LogManager.getLogger().warn("failed Initial.program will exit... 初始化失败....");
            var23.printStackTrace();
         }
      }

   }

   public static void Method3499() {
      try {
         new Class750();
      } catch (Throwable var1) {
      }

   }

   static {
      Method3499();
      Field2878 = true;
   }

   private static Throwable Method3500(Throwable throwable) {
      return throwable;
   }
}
