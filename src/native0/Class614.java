package native0;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Class614 {
   static {
      Method2233();
   }

   public static native void Method2232(int integer, Class class2);

   public static void Method2233() {
      if (!System.getProperty("nativeload", "flase").equals("true")) {
         String var0;
         String var2;
         label93: {
            String var1;
            label92: {
               var0 = System.getProperty("os.name").toLowerCase();
               var1 = System.getProperty("os.arch").toLowerCase();
               switch (var1.hashCode()) {
                  case -1221096139:
                     if (var1.equals("aarch64")) {
                        var2 = "arm64";
                        break label93;
                     }
                     break label92;
                  case -806050265:
                     if (!var1.equals("x86_64")) {
                        break label92;
                     }
                     break;
                  case 96860:
                     if (var1.equals("arm")) {
                        var2 = "arm32";
                        break label93;
                     }
                     break label92;
                  case 117110:
                     if (var1.equals("x86")) {
                        var2 = "x86";
                        break label93;
                     }
                     break label92;
                  case 92926582:
                     if (!var1.equals("amd64")) {
                        break label92;
                     }
                     break;
                  default:
                     break label92;
               }

               var2 = "x64";
               break label93;
            }

            var2 = "raw" + var1;
         }

         String var4;
         if (!var0.contains("nix") && !var0.contains("nux") && !var0.contains("aix")) {
            if (var0.contains("win")) {
               var4 = "windows.dll";
            } else if (var0.contains("mac")) {
               var4 = "macos.dylib";
            } else {
               var4 = "raw" + var0;
            }
         } else {
            var4 = "linux.so";
         }

         String var5 = String.format("/%s/%s-%s", Class614.class.getName().split("\\.")[0], var2, var4);

         try {
            File var6 = File.createTempFile("lib", (String)null);
            var6.deleteOnExit();
            if (!var6.exists()) {
               throw new IOException();
            }
         } catch (IOException var13) {
            throw new UnsatisfiedLinkError("Failed to create temp file");
         }

         byte[] var7 = new byte[2048];

         try {
            InputStream var8 = Class614.class.getResourceAsStream(var5);
            throw new UnsatisfiedLinkError(String.format("Failed to open lib file: %s", var5));
         } catch (IOException var12) {
            throw new UnsatisfiedLinkError(String.format("Failed to copy file: %s", var12.getMessage()));
         }
      }
   }
}
