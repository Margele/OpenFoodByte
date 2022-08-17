package trash.foodbyte.utils;

import awsl.Class207;
import awsl.Class215;
import awsl.Class305;
import awsl.Class307;
import awsl.Class309;
import awsl.Class381;
import awsl.Class421;
import awsl.Class446;
import awsl.Class447;
import awsl.Class705;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.module.ModuleManager;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.ColorValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class FileManager {
   public Minecraft mc = Minecraft.getMinecraft();
   public String filePath;
   private static String[] Field1597;

   public FileManager() {
      this.filePath = this.mc.mcDataDir.getAbsolutePath() + "/" + GlobalModule.clientName;
      File a = new File(this.filePath);
      if (!a.exists()) {
         a.mkdirs();
      }

      try {
         this.loadKeys();
         this.loadValues();
         this.loadMods();
         this.loadFriends();
         this.loadTargets();
         this.loadNameProtect();
         this.loadHide();
         this.loadClickGuiPos();
         this.loadFoodByteClickGui();
         this.loadConfigs();
      } catch (IOException var3) {
         var3.printStackTrace();
      }

   }

   public void saveAll() {
      this.saveKeys();
      this.saveValues();
      this.saveMods();
      this.saveFriends();
      this.saveNameProtect();
      this.saveHide();
      this.saveClickGuiPos();
      this.saveFoodByteClickGui();
   }

   public void saveKeys() {
      File a = new File(this.filePath + "/keys.cfg");

      try {
         if (!a.exists()) {
            a.createNewFile();
         }

         PrintWriter a = new PrintWriter(a);
         Iterator var3 = ModuleManager.getAllModules().Method1383();

         while(var3.Method932()) {
            Module a = (Module)var3.Method933();
            String a = a.Method1020() < 0 ? "None" : Keyboard.getKeyName(a.Method1020());
            a.write(a.getName() + ":" + a + "\n");
         }

         a.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public void loadKeys() throws IOException {
      File a = new File(this.filePath + "/keys.cfg");
      if (!a.exists()) {
         a.createNewFile();
      } else {
         BufferedReader a = new BufferedReader(new FileReader(a));

         String a;
         while((a = a.readLine()) != null) {
            if (a.contains(":")) {
               String[] a = a.split(":");
               Module a = ModuleManager.getModule(a[0]);
               int a = Keyboard.getKeyIndex(a[1]);
               if (a != -1) {
                  a.Method1021(a);
               }
            }
         }

         a.close();
      }

   }

   public void saveMods() {
      File a = new File(this.filePath + "/mods.cfg");

      try {
         if (!a.exists()) {
            a.createNewFile();
         }

         PrintWriter a = new PrintWriter(a);
         Iterator var3 = ModuleManager.getAllModules().Method1383();

         while(var3.Method932()) {
            Module a = (Module)var3.Method933();
            a.print(a.getName() + ":" + a.getState() + "\n");
         }

         a.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void loadMods() throws IOException {
      File a = new File(this.filePath + "/mods.cfg");
      if (!a.exists()) {
         a.createNewFile();
      } else {
         BufferedReader a = new BufferedReader(new FileReader(a));

         String a;
         while((a = a.readLine()) != null) {
            if (a.contains(":")) {
               String[] a = a.split(":");
               Module a = ModuleManager.getModule(a[0]);
            }
         }

         a.close();
      }

   }

   public void saveValues() {
      File a = new File(this.filePath + "/values.cfg");

      try {
         if (!a.exists()) {
            a.createNewFile();
         }

         PrintWriter a = new PrintWriter(a);
         Iterator var3 = Class446.Method2764().Method1383();

         while(var3.Method932()) {
            Class447 a = (Class447)var3.Method933();
            String a = a.Method2755() + "_" + a.Method2754();
            if (a instanceof BooleanValue) {
               a.print(a + ":b:" + a.Method2454() + "\n");
            } else if (a instanceof FloatValue) {
               a.print(a + ":d:" + a.Method2454() + "\n");
            } else if (a instanceof ColorValue) {
               a.print(a + ":i:" + ((ColorValue)a).Method2442() + ":b:" + ((ColorValue)a).Method2437() + "\n");
            } else if (a instanceof ModeValue) {
               a.print(a + ":s:" + a.Method2754() + ":" + ((ModeValue)a).getMode() + "\n");
            }
         }

         a.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public void loadValues() throws IOException {
      File a = new File(this.filePath + "/values.cfg");
      if (!a.exists()) {
         a.createNewFile();
      } else {
         BufferedReader a = new BufferedReader(new FileReader(a));

         label82:
         while(true) {
            String a;
            do {
               if ((a = a.readLine()) == null) {
                  a.close();
                  return;
               }
            } while(!a.contains(":"));

            String[] a = a.split(":");
            Iterator var5 = Class446.Method2764().Method1383();

            while(true) {
               while(true) {
                  Class447 a;
                  do {
                     if (!var5.Method932()) {
                        continue label82;
                     }

                     a = (Class447)var5.Method933();
                  } while(!a[0].equalsIgnoreCase(a.Method2755() + "_" + a.Method2754()));

                  if (a instanceof BooleanValue && a[1].equalsIgnoreCase("b")) {
                     a.Method2510(Boolean.parseBoolean(a[2]));
                  } else if (a instanceof FloatValue && a[1].equalsIgnoreCase("d")) {
                     a.Method2510(Float.parseFloat(a[2]));
                  } else if (a instanceof ColorValue) {
                     if (a[1].equalsIgnoreCase("i")) {
                        ((ColorValue)a).Method2440(Integer.parseInt(a[2]));
                     }

                     if (a.length > 3 && a[3].equalsIgnoreCase("b")) {
                        ((ColorValue)a).Method2438(Boolean.parseBoolean(a[4]));
                     }
                  } else if (a instanceof ModeValue && a[1].equalsIgnoreCase("s") && a[2].equalsIgnoreCase(a.Method2754())) {
                     ((ModeValue)a).Method2725(String.valueOf(a[3]));
                  }
               }
            }
         }
      }
   }

   public void saveFriends() {
      File a = new File(this.filePath + "/friend.cfg");

      try {
         if (!a.exists()) {
            a.createNewFile();
         }

         PrintWriter a = new PrintWriter(a);
         Iterator a = Class305.Method695().Method1383();

         while(a.Method932()) {
            Class309 a = (Class309)a.Method933();
            a.print(a.Method748() + ":" + a.Method749() + "\n");
         }

         a.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void loadFriends() throws IOException {
      File a = new File(this.filePath + "/friend.cfg");
      if (!a.exists()) {
         a.createNewFile();
      } else {
         BufferedReader a = new BufferedReader(new FileReader(a));

         String a;
         while((a = a.readLine()) != null) {
            if (a.contains(":")) {
               String[] a = a.split(":");
               if (a.length() >= 2) {
                  Class309 a = new Class309(a[0], a[1]);
                  Class305.Method695().Method2530(a);
               }
            }
         }

         a.close();
      }

   }

   public void saveTargets() {
      File a = new File(this.filePath + "/target.cfg");

      try {
         if (!a.exists()) {
            a.createNewFile();
         }

         PrintWriter a = new PrintWriter(a);
         Iterator a = Class305.Method696().Method1383();

         while(a.Method932()) {
            Class307 a = (Class307)a.Method933();
            a.print(a.Method744() + ":" + a.Method745() + "\n");
         }

         a.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void loadTargets() throws IOException {
      File a = new File(this.filePath + "/target.cfg");
      if (!a.exists()) {
         a.createNewFile();
      } else {
         BufferedReader a = new BufferedReader(new FileReader(a));

         String a;
         while((a = a.readLine()) != null) {
            if (a.contains(":")) {
               String[] a = a.split(":");
               if (a.length() >= 2) {
                  Class307 a = new Class307(a[0], a[1]);
                  Class305.Method696().Method2530(a);
               }
            }
         }

         a.close();
      }

   }

   public void saveNameProtect() {
      File a = new File(this.filePath + "/nameprotect.cfg");

      try {
         if (!a.exists()) {
            a.createNewFile();
         }

         PrintWriter a = new PrintWriter(a);
         if (Objects.nonNull(GlobalModule.fakeName)) {
            a.print(GlobalModule.fakeName);
         }

         a.close();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void loadNameProtect() throws IOException {
      File a = new File(this.filePath + "/nameprotect.cfg");
      if (!a.exists()) {
         a.createNewFile();
      } else {
         BufferedReader a = new BufferedReader(new FileReader(a));

         String a;
         while((a = a.readLine()) != null) {
            if (!a.equalsIgnoreCase("")) {
               GlobalModule.fakeName = a;
            }
         }

         a.close();
      }

   }

   public void saveHide() {
      File a = new File(this.filePath + "/Hide.cfg");

      try {
         if (!a.exists()) {
            a.createNewFile();
         }

         PrintWriter a = new PrintWriter(a);
         Iterator var3 = ModuleManager.getAllModules().Method1383();

         while(var3.Method932()) {
            Module a = (Module)var3.Method933();
            if (a.hide) {
               a.print(a.getName() + ":" + a.hide + "\n");
            }
         }

         a.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void loadHide() throws IOException {
      File a = new File(this.filePath + "/Hide.cfg");
      if (!a.exists()) {
         a.createNewFile();
      } else {
         BufferedReader a = new BufferedReader(new FileReader(a));

         String a;
         while((a = a.readLine()) != null) {
            if (a.contains(":")) {
               String[] a = a.split(":");
               Module a = ModuleManager.getModule(a[0]);
               boolean a = Boolean.parseBoolean(a[1]);
            }
         }

         a.close();
      }

   }

   public void saveClickGuiPos() {
      File a = new File(this.filePath + "/ClickGuiPos.cfg");

      try {
         if (!a.exists()) {
            a.createNewFile();
         }

         PrintWriter a = new PrintWriter(a);
         Iterator var3 = Class705.Field3044.Method1383();

         while(var3.Method932()) {
            Class421 a = (Class421)var3.Method933();
            a.print(a.Field2027 + ":" + a.Field2028 + ":" + a.Field2029 + ":" + a.Field2035 + "\n");
         }

         a.close();
      } catch (Exception var5) {
      }

   }

   public void loadClickGuiPos() {
      File a = new File(this.filePath + "/ClickGuiPos.cfg");

      try {
         BufferedReader a = new BufferedReader(new FileReader(a));

         String a;
         while((a = a.readLine()) != null) {
            String a = a.split(":")[0];
            float a = Float.parseFloat(a.split(":")[1]);
            float a = Float.parseFloat(a.split(":")[2]);
            boolean a = Boolean.parseBoolean(a.split(":")[3]);
            Iterator var8 = Class705.Field3045.Method1383();

            while(var8.Method932()) {
               Class421 a = (Class421)var8.Method933();
               if (a.Field2027.equalsIgnoreCase(a)) {
                  a.Field2028 = (double)((int)a);
                  a.Field2029 = (double)((int)a);
                  a.Field2035 = a;
               }
            }
         }

         a.close();
      } catch (Exception var10) {
      }

   }

   public void saveFoodByteClickGui() {
      File a = new File(this.filePath + "/FoodByteClickGui.cfg");

      try {
         if (!a.exists()) {
            a.createNewFile();
         }

         PrintWriter a = new PrintWriter(a);
         Iterator var3 = GlobalModule.INSTANCE.Method2014().Method1833().Method1383();

         while(var3.Method932()) {
            Class381 a = (Class381)var3.Method933();
            a.print(a.Method1395() + ":" + a.Method1410() + ":" + a.Method1412() + ":" + a.Method1406() + ":" + a.Method1404() + ":" + a.Method1402() + ":" + a.Method1400() + "\n");
         }

         a.close();
      } catch (Exception var5) {
      }

   }

   public void loadFoodByteClickGui() {
      File a = new File(this.filePath + "/FoodByteClickGui.cfg");

      try {
         BufferedReader a = new BufferedReader(new FileReader(a));

         String a;
         while((a = a.readLine()) != null) {
            String a = a.split(":")[0];
            int a = Integer.parseInt(a.split(":")[1]);
            int a = Integer.parseInt(a.split(":")[2]);
            boolean a = Boolean.parseBoolean(a.split(":")[3]);
            boolean a = Boolean.parseBoolean(a.split(":")[4]);
            boolean a = Boolean.parseBoolean(a.split(":")[5]);
            boolean a = Boolean.parseBoolean(a.split(":")[6]);
            Iterator var11 = GlobalModule.INSTANCE.Method2014().Method1833().Method1383();

            while(var11.Method932()) {
               Class381 a = (Class381)var11.Method933();
               if (a.Method1395().equalsIgnoreCase(a)) {
                  a.Method1411(a);
                  a.Method1413(a);
                  a.Method1407(a);
                  a.Method1405(a);
                  a.Method1403(a);
                  a.Method1401(a);
               }
            }
         }

         a.close();
      } catch (Exception var13) {
      }

   }

   public void loadConfigs() {
      Class215.Method2649().clear();

      try {
         File a = new File(System.getProperty("user.home") + File.separator + GlobalModule.clientName);
         if (a.listFiles() == null) {
            return;
         }

         FilenameFilter a = FileManager::Method790;
         File[] a;
         int a = (a = a.listFiles(a)).length;

         for(int a = 0; a < a; ++a) {
            File a = a[a];
            Class207 a = new Class207(a.getName().replace("conf-", "").replace(".cfg", ""));
            Class215.Method2649().Method2530(a);
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public void deleteConfig(String a) {
      try {
         File a = new File(System.getProperty("user.home") + File.separator + GlobalModule.clientName + "/conf-" + a + ".cfg");
         if (a.exists()) {
            a.delete();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void Method786(String a) {
      File a = new File(System.getProperty("user.home") + File.separator + GlobalModule.clientName);
      if (!a.exists()) {
         a.mkdirs();
      }

      File a = new File(System.getProperty("user.home") + File.separator + GlobalModule.clientName + "/conf-" + a + ".cfg");

      try {
         if (!a.exists()) {
            a.createNewFile();
         }

         PrintWriter a = new PrintWriter(a);
         Iterator var5 = ModuleManager.getAllModules().Method1383();

         Module a;
         while(var5.Method932()) {
            a = (Module)var5.Method933();
            a.print(a.getName() + ":mod:" + a.getState() + "\n");
         }

         var5 = ModuleManager.getAllModules().Method1383();

         String a;
         while(var5.Method932()) {
            a = (Module)var5.Method933();
            a = a.Method1020() < 0 ? "None" : Keyboard.getKeyName(a.Method1020());
            a.write(a.getName() + ":key:" + a + "\n");
         }

         var5 = Class446.Method2764().Method1383();

         while(var5.Method932()) {
            Class447 a = (Class447)var5.Method933();
            a = a.Method2755() + "_" + a.Method2754();
            if (a instanceof BooleanValue) {
               a.print(a + ":b:" + a.Method2454() + "\n");
            } else if (a instanceof FloatValue) {
               a.print(a + ":d:" + a.Method2454() + "\n");
            } else if (a instanceof ColorValue) {
               a.print(a + ":i:" + ((ColorValue)a).Method2442() + "\n");
            } else if (a instanceof ModeValue) {
               a.print(a + ":s:" + a.Method2754() + ":" + ((ModeValue)a).getMode() + "\n");
            }
         }

         a.close();
      } catch (Exception var8) {
      }

   }

   public void Method787(String a, boolean a1) {
      File a = new File(System.getProperty("user.home") + File.separator + GlobalModule.clientName + "/conf-" + a + ".cfg");

      try {
         BufferedReader a = new BufferedReader(new FileReader(a));

         while(true) {
            String a;
            do {
               if ((a = a.readLine()) == null) {
                  a.close();
                  BufferedReader a = new BufferedReader(new FileReader(a));

                  String[] a;
                  String a;
                  while((a = a.readLine()) != null) {
                     if (a.contains(":key:")) {
                        a = a.split(":key:");
                        Module a = ModuleManager.getModule(a[0]);
                        int a = Keyboard.getKeyIndex(a[1]);
                        if (a != -1) {
                           a.Method1021(a);
                        }
                     }
                  }

                  a.close();
                  a = new BufferedReader(new FileReader(a));

                  label127:
                  while(true) {
                     do {
                        if ((a = a.readLine()) == null) {
                           a.close();
                           this.saveMods();
                           this.saveValues();
                           this.saveKeys();
                           return;
                        }
                     } while(!a.contains(":"));

                     a = a.split(":");
                     Iterator var14 = Class446.Method2764().Method1383();

                     while(true) {
                        while(true) {
                           Class447 a;
                           do {
                              if (!var14.Method932()) {
                                 continue label127;
                              }

                              a = (Class447)var14.Method933();
                           } while(!a[0].equalsIgnoreCase(a.Method2755() + "_" + a.Method2754()));

                           if (a instanceof BooleanValue && a[1].equalsIgnoreCase("b")) {
                              a.Method2510(Boolean.parseBoolean(a[2]));
                           } else if (a instanceof FloatValue && a[1].equalsIgnoreCase("d")) {
                              a.Method2510(Float.parseFloat(a[2]));
                           } else if (a instanceof ColorValue && a[1].equalsIgnoreCase("i")) {
                              ((ColorValue)a).Method2440(Integer.parseInt(a[2]));
                           } else if (a instanceof ModeValue && a[1].equalsIgnoreCase("s") && a[2].equalsIgnoreCase(a.Method2754())) {
                              ((ModeValue)a).Method2725(String.valueOf(a[3]));
                           }
                        }
                     }
                  }
               }
            } while(!a.contains(":mod:") && !a.contains(":key:") && !a.contains(":"));

            String[] a = a.split(":mod:");
            Module a = ModuleManager.getModule(a[0]);
         }
      } catch (IOException var11) {
      }
   }

   public void Method788() {
      File a = new File(System.getProperty("user.home") + File.separator + "FoodByte.cfg");

      try {
         if (!a.exists()) {
            a.createNewFile();
         }

         PrintWriter a = new PrintWriter(a);
         Iterator var3 = ModuleManager.getAllModules().Method1383();

         Module a;
         while(var3.Method932()) {
            a = (Module)var3.Method933();
            a.print(a.getName() + ":mod:" + a.getState() + "\n");
         }

         var3 = ModuleManager.getAllModules().Method1383();

         String a;
         while(var3.Method932()) {
            a = (Module)var3.Method933();
            a = a.Method1020() < 0 ? "None" : Keyboard.getKeyName(a.Method1020());
            a.write(a.getName() + ":key:" + a + "\n");
         }

         var3 = Class446.Method2764().Method1383();

         while(var3.Method932()) {
            Class447 a = (Class447)var3.Method933();
            a = a.Method2755() + "_" + a.Method2754();
            if (a instanceof BooleanValue) {
               a.print(a + ":b:" + a.Method2454() + "\n");
            } else if (a instanceof FloatValue) {
               a.print(a + ":d:" + a.Method2454() + "\n");
            } else if (a instanceof ColorValue) {
               a.print(a + ":i:" + ((ColorValue)a).Method2442() + ":b:" + ((ColorValue)a).Method2437() + "\n");
            } else if (a instanceof ModeValue) {
               a.print(a + ":s:" + a.Method2754() + ":" + ((ModeValue)a).getMode() + "\n");
            }
         }

         a.close();
      } catch (Exception var6) {
      }

   }

   public void Method789() {
      Method792();
      File a = new File(System.getProperty("user.home") + File.separator + "FoodByte.cfg");

      try {
         String a;
         BufferedReader a;
         String[] a;
         Module a;
         for(a = new BufferedReader(new FileReader(a)); (a = a.readLine()) != null; a = ModuleManager.getModule(a[0])) {
            if (!a.contains(":mod:") && !a.contains(":key:") && !a.contains(":")) {
               ;
            }

            a = a.split(":mod:");
         }

         a.close();
         BufferedReader a = new BufferedReader(new FileReader(a));

         String a;
         while((a = a.readLine()) != null) {
            if (a.contains(":key:")) {
               String[] a = a.split(":key:");
               Module a = ModuleManager.getModule(a[0]);
               int a = Keyboard.getKeyIndex(a[1]);
               if (a != -1) {
                  a.Method1021(a);
                  break;
               }
            }
         }

         a.close();
         BufferedReader a = new BufferedReader(new FileReader(a));
         String a;
         if ((a = a.readLine()) != null) {
            if (!a.contains(":")) {
               ;
            }

            String[] a = a.split(":");
            Iterator var10 = Class446.Method2764().Method1383();

            while(var10.Method932()) {
               Class447 a = (Class447)var10.Method933();
               if (a[0].equalsIgnoreCase(a.Method2755() + "_" + a.Method2754())) {
                  if (a instanceof BooleanValue && a[1].equalsIgnoreCase("b")) {
                     a.Method2510(Boolean.parseBoolean(a[2]));
                  }

                  if (a instanceof FloatValue && a[1].equalsIgnoreCase("d")) {
                     a.Method2510(Float.parseFloat(a[2]));
                  }

                  if (a instanceof ColorValue) {
                     if (a[1].equalsIgnoreCase("i")) {
                        ((ColorValue)a).Method2440(Integer.parseInt(a[2]));
                     }

                     if (!a[3].equalsIgnoreCase("b")) {
                        continue;
                     }

                     ((ColorValue)a).Method2438(Boolean.parseBoolean(a[4]));
                  }

                  if (a instanceof ModeValue && a[1].equalsIgnoreCase("s")) {
                     if (!a[2].equalsIgnoreCase(a.Method2754())) {
                        ;
                     }

                     ((ModeValue)a).Method2725(String.valueOf(a[3]));
                     break;
                  }
               }
            }
         }

         a.close();
         this.saveMods();
         this.saveValues();
         this.saveKeys();
      } catch (IOException var12) {
         var12.printStackTrace();
      }

   }

   private static boolean Method790(File a, String a) {
      return a.startsWith("conf-") && a.endsWith(".cfg");
   }

   public static void Method791(String[] arr) {
      Field1597 = arr;
   }

   public static String[] Method792() {
      return Field1597;
   }

   private static Exception Method793(Exception exception) {
      return exception;
   }

   static {
      Method791(new String[3]);
   }
}
