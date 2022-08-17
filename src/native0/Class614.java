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
         String osName;
         String platformTypeName;
         label93: {
            String platform;
            label92: {
               osName = System.getProperty("os.name").toLowerCase();
               platform = System.getProperty("os.arch").toLowerCase();
               switch (platform.hashCode()) {
                  case -1221096139:
                     if (platform.equals("aarch64")) {
                        platformTypeName = "arm64";
                        break label93;
                     }
                     break label92;
                  case -806050265:
                     if (!platform.equals("x86_64")) {
                        break label92;
                     }
                     break;
                  case 96860:
                     if (platform.equals("arm")) {
                        platformTypeName = "arm32";
                        break label93;
                     }
                     break label92;
                  case 117110:
                     if (platform.equals("x86")) {
                        platformTypeName = "x86";
                        break label93;
                     }
                     break label92;
                  case 92926582:
                     if (!platform.equals("amd64")) {
                        break label92;
                     }
                     break;
                  default:
                     break label92;
               }

               platformTypeName = "x64";
               break label93;
            }

            platformTypeName = "raw" + platform;
         }

         String osTypeName;
         if (!osName.contains("nix") && !osName.contains("nux") && !osName.contains("aix")) {
            if (osName.contains("win")) {
               osTypeName = "windows.dll";
            } else if (osName.contains("mac")) {
               osTypeName = "macos.dylib";
            } else {
               osTypeName = "raw" + osName;
            }
         } else {
            osTypeName = "linux.so";
         }

         String libFileName = String.format("/%s/%s-%s", Class614.class.getName().split("\\.")[0], platformTypeName, osTypeName);

         try {
            File libFile = File.createTempFile("lib", (String)null);
            libFile.deleteOnExit();
            if (!libFile.exists()) {
               throw new IOException();
            }
         } catch (IOException var13) {
            throw new UnsatisfiedLinkError("Failed to create temp file");
         }

         byte[] arrayOfByte = new byte[2048];

         try {
            InputStream inputStream = Class614.class.getResourceAsStream(libFileName);
            throw new UnsatisfiedLinkError(String.format("Failed to open lib file: %s", libFileName));
         } catch (IOException var12) {
            throw new UnsatisfiedLinkError(String.format("Failed to copy file: %s", var12.getMessage()));
         }
      }
   }
}
