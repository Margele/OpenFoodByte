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
      File var1 = new File(this.filePath);
      if (!var1.exists()) {
         var1.mkdirs();
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
      File var1 = new File(this.filePath + "/keys.cfg");

      try {
         if (!var1.exists()) {
            var1.createNewFile();
         }

         PrintWriter var2 = new PrintWriter(var1);
         Iterator var3 = ModuleManager.getAllModules().Method1383();

         while(var3.Method932()) {
            Module var4 = (Module)var3.Method933();
            String var5 = var4.Method1020() < 0 ? "None" : Keyboard.getKeyName(var4.Method1020());
            var2.write(var4.getName() + ":" + var5 + "\n");
         }

         var2.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public void loadKeys() throws IOException {
      File var1 = new File(this.filePath + "/keys.cfg");
      if (!var1.exists()) {
         var1.createNewFile();
      } else {
         BufferedReader var3 = new BufferedReader(new FileReader(var1));

         String var2;
         while((var2 = var3.readLine()) != null) {
            if (var2.contains(":")) {
               String[] var4 = var2.split(":");
               Module var5 = ModuleManager.getModule(var4[0]);
               int var6 = Keyboard.getKeyIndex(var4[1]);
               if (var6 != -1) {
                  var5.Method1021(var6);
               }
            }
         }

         var3.close();
      }

   }

   public void saveMods() {
      File var1 = new File(this.filePath + "/mods.cfg");

      try {
         if (!var1.exists()) {
            var1.createNewFile();
         }

         PrintWriter var2 = new PrintWriter(var1);
         Iterator var3 = ModuleManager.getAllModules().Method1383();

         while(var3.Method932()) {
            Module var4 = (Module)var3.Method933();
            var2.print(var4.getName() + ":" + var4.getState() + "\n");
         }

         var2.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void loadMods() throws IOException {
      File var1 = new File(this.filePath + "/mods.cfg");
      if (!var1.exists()) {
         var1.createNewFile();
      } else {
         BufferedReader var3 = new BufferedReader(new FileReader(var1));

         String var2;
         while((var2 = var3.readLine()) != null) {
            if (var2.contains(":")) {
               String[] var4 = var2.split(":");
               Module var5 = ModuleManager.getModule(var4[0]);
            }
         }

         var3.close();
      }

   }

   public void saveValues() {
      File var1 = new File(this.filePath + "/values.cfg");

      try {
         if (!var1.exists()) {
            var1.createNewFile();
         }

         PrintWriter var2 = new PrintWriter(var1);
         Iterator var3 = Class446.Method2764().Method1383();

         while(var3.Method932()) {
            Class447 var4 = (Class447)var3.Method933();
            String var5 = var4.Method2755() + "_" + var4.Method2754();
            if (var4 instanceof BooleanValue) {
               var2.print(var5 + ":b:" + var4.Method2454() + "\n");
            } else if (var4 instanceof FloatValue) {
               var2.print(var5 + ":d:" + var4.Method2454() + "\n");
            } else if (var4 instanceof ColorValue) {
               var2.print(var5 + ":i:" + ((ColorValue)var4).Method2442() + ":b:" + ((ColorValue)var4).Method2437() + "\n");
            } else if (var4 instanceof ModeValue) {
               var2.print(var5 + ":s:" + var4.Method2754() + ":" + ((ModeValue)var4).getMode() + "\n");
            }
         }

         var2.close();
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public void loadValues() throws IOException {
      File var1 = new File(this.filePath + "/values.cfg");
      if (!var1.exists()) {
         var1.createNewFile();
      } else {
         BufferedReader var3 = new BufferedReader(new FileReader(var1));

         label82:
         while(true) {
            String var2;
            do {
               if ((var2 = var3.readLine()) == null) {
                  var3.close();
                  return;
               }
            } while(!var2.contains(":"));

            String[] var4 = var2.split(":");
            Iterator var5 = Class446.Method2764().Method1383();

            while(true) {
               while(true) {
                  Class447 var6;
                  do {
                     if (!var5.Method932()) {
                        continue label82;
                     }

                     var6 = (Class447)var5.Method933();
                  } while(!var4[0].equalsIgnoreCase(var6.Method2755() + "_" + var6.Method2754()));

                  if (var6 instanceof BooleanValue && var4[1].equalsIgnoreCase("b")) {
                     var6.Method2510(Boolean.parseBoolean(var4[2]));
                  } else if (var6 instanceof FloatValue && var4[1].equalsIgnoreCase("d")) {
                     var6.Method2510(Float.parseFloat(var4[2]));
                  } else if (var6 instanceof ColorValue) {
                     if (var4[1].equalsIgnoreCase("i")) {
                        ((ColorValue)var6).Method2440(Integer.parseInt(var4[2]));
                     }

                     if (var4.length > 3 && var4[3].equalsIgnoreCase("b")) {
                        ((ColorValue)var6).Method2438(Boolean.parseBoolean(var4[4]));
                     }
                  } else if (var6 instanceof ModeValue && var4[1].equalsIgnoreCase("s") && var4[2].equalsIgnoreCase(var6.Method2754())) {
                     ((ModeValue)var6).Method2725(String.valueOf(var4[3]));
                  }
               }
            }
         }
      }
   }

   public void saveFriends() {
      File var1 = new File(this.filePath + "/friend.cfg");

      try {
         if (!var1.exists()) {
            var1.createNewFile();
         }

         PrintWriter var2 = new PrintWriter(var1);
         Iterator var3 = Class305.Method695().Method1383();

         while(var3.Method932()) {
            Class309 var4 = (Class309)var3.Method933();
            var2.print(var4.Method748() + ":" + var4.Method749() + "\n");
         }

         var2.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void loadFriends() throws IOException {
      File var1 = new File(this.filePath + "/friend.cfg");
      if (!var1.exists()) {
         var1.createNewFile();
      } else {
         BufferedReader var2 = new BufferedReader(new FileReader(var1));

         String var3;
         while((var3 = var2.readLine()) != null) {
            if (var3.contains(":")) {
               String[] var4 = var3.split(":");
               if (var3.length() >= 2) {
                  Class309 var5 = new Class309(var4[0], var4[1]);
                  Class305.Method695().Method2530(var5);
               }
            }
         }

         var2.close();
      }

   }

   public void saveTargets() {
      File var1 = new File(this.filePath + "/target.cfg");

      try {
         if (!var1.exists()) {
            var1.createNewFile();
         }

         PrintWriter var2 = new PrintWriter(var1);
         Iterator var3 = Class305.Method696().Method1383();

         while(var3.Method932()) {
            Class307 var4 = (Class307)var3.Method933();
            var2.print(var4.Method744() + ":" + var4.Method745() + "\n");
         }

         var2.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void loadTargets() throws IOException {
      File var1 = new File(this.filePath + "/target.cfg");
      if (!var1.exists()) {
         var1.createNewFile();
      } else {
         BufferedReader var2 = new BufferedReader(new FileReader(var1));

         String var3;
         while((var3 = var2.readLine()) != null) {
            if (var3.contains(":")) {
               String[] var4 = var3.split(":");
               if (var3.length() >= 2) {
                  Class307 var5 = new Class307(var4[0], var4[1]);
                  Class305.Method696().Method2530(var5);
               }
            }
         }

         var2.close();
      }

   }

   public void saveNameProtect() {
      File var1 = new File(this.filePath + "/nameprotect.cfg");

      try {
         if (!var1.exists()) {
            var1.createNewFile();
         }

         PrintWriter var2 = new PrintWriter(var1);
         if (Objects.nonNull(GlobalModule.fakeName)) {
            var2.print(GlobalModule.fakeName);
         }

         var2.close();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void loadNameProtect() throws IOException {
      File var1 = new File(this.filePath + "/nameprotect.cfg");
      if (!var1.exists()) {
         var1.createNewFile();
      } else {
         BufferedReader var2 = new BufferedReader(new FileReader(var1));

         String var3;
         while((var3 = var2.readLine()) != null) {
            if (!var3.equalsIgnoreCase("")) {
               GlobalModule.fakeName = var3;
            }
         }

         var2.close();
      }

   }

   public void saveHide() {
      File var1 = new File(this.filePath + "/Hide.cfg");

      try {
         if (!var1.exists()) {
            var1.createNewFile();
         }

         PrintWriter var2 = new PrintWriter(var1);
         Iterator var3 = ModuleManager.getAllModules().Method1383();

         while(var3.Method932()) {
            Module var4 = (Module)var3.Method933();
            if (var4.hide) {
               var2.print(var4.getName() + ":" + var4.hide + "\n");
            }
         }

         var2.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public void loadHide() throws IOException {
      File var1 = new File(this.filePath + "/Hide.cfg");
      if (!var1.exists()) {
         var1.createNewFile();
      } else {
         BufferedReader var3 = new BufferedReader(new FileReader(var1));

         String var2;
         while((var2 = var3.readLine()) != null) {
            if (var2.contains(":")) {
               String[] var4 = var2.split(":");
               Module var5 = ModuleManager.getModule(var4[0]);
               boolean var6 = Boolean.parseBoolean(var4[1]);
            }
         }

         var3.close();
      }

   }

   public void saveClickGuiPos() {
      File var1 = new File(this.filePath + "/ClickGuiPos.cfg");

      try {
         if (!var1.exists()) {
            var1.createNewFile();
         }

         PrintWriter var2 = new PrintWriter(var1);
         Iterator var3 = Class705.Field3044.Method1383();

         while(var3.Method932()) {
            Class421 var4 = (Class421)var3.Method933();
            var2.print(var4.Field2027 + ":" + var4.Field2028 + ":" + var4.Field2029 + ":" + var4.Field2035 + "\n");
         }

         var2.close();
      } catch (Exception var5) {
      }

   }

   public void loadClickGuiPos() {
      File var1 = new File(this.filePath + "/ClickGuiPos.cfg");

      try {
         BufferedReader var2 = new BufferedReader(new FileReader(var1));

         String var3;
         while((var3 = var2.readLine()) != null) {
            String var4 = var3.split(":")[0];
            float var5 = Float.parseFloat(var3.split(":")[1]);
            float var6 = Float.parseFloat(var3.split(":")[2]);
            boolean var7 = Boolean.parseBoolean(var3.split(":")[3]);
            Iterator var8 = Class705.Field3045.Method1383();

            while(var8.Method932()) {
               Class421 var9 = (Class421)var8.Method933();
               if (var9.Field2027.equalsIgnoreCase(var4)) {
                  var9.Field2028 = (double)((int)var5);
                  var9.Field2029 = (double)((int)var6);
                  var9.Field2035 = var7;
               }
            }
         }

         var2.close();
      } catch (Exception var10) {
      }

   }

   public void saveFoodByteClickGui() {
      File var1 = new File(this.filePath + "/FoodByteClickGui.cfg");

      try {
         if (!var1.exists()) {
            var1.createNewFile();
         }

         PrintWriter var2 = new PrintWriter(var1);
         Iterator var3 = GlobalModule.INSTANCE.Method2014().Method1833().Method1383();

         while(var3.Method932()) {
            Class381 var4 = (Class381)var3.Method933();
            var2.print(var4.Method1395() + ":" + var4.Method1410() + ":" + var4.Method1412() + ":" + var4.Method1406() + ":" + var4.Method1404() + ":" + var4.Method1402() + ":" + var4.Method1400() + "\n");
         }

         var2.close();
      } catch (Exception var5) {
      }

   }

   public void loadFoodByteClickGui() {
      File var1 = new File(this.filePath + "/FoodByteClickGui.cfg");

      try {
         BufferedReader var2 = new BufferedReader(new FileReader(var1));

         String var3;
         while((var3 = var2.readLine()) != null) {
            String var4 = var3.split(":")[0];
            int var5 = Integer.parseInt(var3.split(":")[1]);
            int var6 = Integer.parseInt(var3.split(":")[2]);
            boolean var7 = Boolean.parseBoolean(var3.split(":")[3]);
            boolean var8 = Boolean.parseBoolean(var3.split(":")[4]);
            boolean var9 = Boolean.parseBoolean(var3.split(":")[5]);
            boolean var10 = Boolean.parseBoolean(var3.split(":")[6]);
            Iterator var11 = GlobalModule.INSTANCE.Method2014().Method1833().Method1383();

            while(var11.Method932()) {
               Class381 var12 = (Class381)var11.Method933();
               if (var12.Method1395().equalsIgnoreCase(var4)) {
                  var12.Method1411(var5);
                  var12.Method1413(var6);
                  var12.Method1407(var7);
                  var12.Method1405(var8);
                  var12.Method1403(var9);
                  var12.Method1401(var10);
               }
            }
         }

         var2.close();
      } catch (Exception var13) {
      }

   }

   public void loadConfigs() {
      Class215.Method2649().clear();

      try {
         File var1 = new File(System.getProperty("user.home") + File.separator + GlobalModule.clientName);
         if (var1.listFiles() == null) {
            return;
         }

         FilenameFilter var2 = FileManager::Method790;
         File[] var3;
         int var4 = (var3 = var1.listFiles(var2)).length;

         for(int var5 = 0; var5 < var4; ++var5) {
            File var6 = var3[var5];
            Class207 var7 = new Class207(var6.getName().replace("conf-", "").replace(".cfg", ""));
            Class215.Method2649().Method2530(var7);
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public void deleteConfig(String a) {
      try {
         File var2 = new File(System.getProperty("user.home") + File.separator + GlobalModule.clientName + "/conf-" + a + ".cfg");
         if (var2.exists()) {
            var2.delete();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void Method786(String a) {
      File var2 = new File(System.getProperty("user.home") + File.separator + GlobalModule.clientName);
      if (!var2.exists()) {
         var2.mkdirs();
      }

      File var3 = new File(System.getProperty("user.home") + File.separator + GlobalModule.clientName + "/conf-" + a + ".cfg");

      try {
         if (!var3.exists()) {
            var3.createNewFile();
         }

         PrintWriter var4 = new PrintWriter(var3);
         Iterator var5 = ModuleManager.getAllModules().Method1383();

         Module var6;
         while(var5.Method932()) {
            var6 = (Module)var5.Method933();
            var4.print(var6.getName() + ":mod:" + var6.getState() + "\n");
         }

         var5 = ModuleManager.getAllModules().Method1383();

         String var7;
         while(var5.Method932()) {
            var6 = (Module)var5.Method933();
            var7 = var6.Method1020() < 0 ? "None" : Keyboard.getKeyName(var6.Method1020());
            var4.write(var6.getName() + ":key:" + var7 + "\n");
         }

         var5 = Class446.Method2764().Method1383();

         while(var5.Method932()) {
            Class447 var9 = (Class447)var5.Method933();
            var7 = var9.Method2755() + "_" + var9.Method2754();
            if (var9 instanceof BooleanValue) {
               var4.print(var7 + ":b:" + var9.Method2454() + "\n");
            } else if (var9 instanceof FloatValue) {
               var4.print(var7 + ":d:" + var9.Method2454() + "\n");
            } else if (var9 instanceof ColorValue) {
               var4.print(var7 + ":i:" + ((ColorValue)var9).Method2442() + "\n");
            } else if (var9 instanceof ModeValue) {
               var4.print(var7 + ":s:" + var9.Method2754() + ":" + ((ModeValue)var9).getMode() + "\n");
            }
         }

         var4.close();
      } catch (Exception var8) {
      }

   }

   public void Method787(String a, boolean a) {
      File var3 = new File(System.getProperty("user.home") + File.separator + GlobalModule.clientName + "/conf-" + a + ".cfg");

      try {
         BufferedReader var5 = new BufferedReader(new FileReader(var3));

         while(true) {
            String var4;
            do {
               if ((var4 = var5.readLine()) == null) {
                  var5.close();
                  BufferedReader var13 = new BufferedReader(new FileReader(var3));

                  String[] var8;
                  String var12;
                  while((var12 = var13.readLine()) != null) {
                     if (var12.contains(":key:")) {
                        var8 = var12.split(":key:");
                        Module var9 = ModuleManager.getModule(var8[0]);
                        int var10 = Keyboard.getKeyIndex(var8[1]);
                        if (var10 != -1) {
                           var9.Method1021(var10);
                        }
                     }
                  }

                  var13.close();
                  var13 = new BufferedReader(new FileReader(var3));

                  label127:
                  while(true) {
                     do {
                        if ((var12 = var13.readLine()) == null) {
                           var13.close();
                           this.saveMods();
                           this.saveValues();
                           this.saveKeys();
                           return;
                        }
                     } while(!var12.contains(":"));

                     var8 = var12.split(":");
                     Iterator var14 = Class446.Method2764().Method1383();

                     while(true) {
                        while(true) {
                           Class447 var15;
                           do {
                              if (!var14.Method932()) {
                                 continue label127;
                              }

                              var15 = (Class447)var14.Method933();
                           } while(!var8[0].equalsIgnoreCase(var15.Method2755() + "_" + var15.Method2754()));

                           if (var15 instanceof BooleanValue && var8[1].equalsIgnoreCase("b")) {
                              var15.Method2510(Boolean.parseBoolean(var8[2]));
                           } else if (var15 instanceof FloatValue && var8[1].equalsIgnoreCase("d")) {
                              var15.Method2510(Float.parseFloat(var8[2]));
                           } else if (var15 instanceof ColorValue && var8[1].equalsIgnoreCase("i")) {
                              ((ColorValue)var15).Method2440(Integer.parseInt(var8[2]));
                           } else if (var15 instanceof ModeValue && var8[1].equalsIgnoreCase("s") && var8[2].equalsIgnoreCase(var15.Method2754())) {
                              ((ModeValue)var15).Method2725(String.valueOf(var8[3]));
                           }
                        }
                     }
                  }
               }
            } while(!var4.contains(":mod:") && !var4.contains(":key:") && !var4.contains(":"));

            String[] var6 = var4.split(":mod:");
            Module var7 = ModuleManager.getModule(var6[0]);
         }
      } catch (IOException var11) {
      }
   }

   public void Method788() {
      File var1 = new File(System.getProperty("user.home") + File.separator + "FoodByte.cfg");

      try {
         if (!var1.exists()) {
            var1.createNewFile();
         }

         PrintWriter var2 = new PrintWriter(var1);
         Iterator var3 = ModuleManager.getAllModules().Method1383();

         Module var4;
         while(var3.Method932()) {
            var4 = (Module)var3.Method933();
            var2.print(var4.getName() + ":mod:" + var4.getState() + "\n");
         }

         var3 = ModuleManager.getAllModules().Method1383();

         String var5;
         while(var3.Method932()) {
            var4 = (Module)var3.Method933();
            var5 = var4.Method1020() < 0 ? "None" : Keyboard.getKeyName(var4.Method1020());
            var2.write(var4.getName() + ":key:" + var5 + "\n");
         }

         var3 = Class446.Method2764().Method1383();

         while(var3.Method932()) {
            Class447 var7 = (Class447)var3.Method933();
            var5 = var7.Method2755() + "_" + var7.Method2754();
            if (var7 instanceof BooleanValue) {
               var2.print(var5 + ":b:" + var7.Method2454() + "\n");
            } else if (var7 instanceof FloatValue) {
               var2.print(var5 + ":d:" + var7.Method2454() + "\n");
            } else if (var7 instanceof ColorValue) {
               var2.print(var5 + ":i:" + ((ColorValue)var7).Method2442() + ":b:" + ((ColorValue)var7).Method2437() + "\n");
            } else if (var7 instanceof ModeValue) {
               var2.print(var5 + ":s:" + var7.Method2754() + ":" + ((ModeValue)var7).getMode() + "\n");
            }
         }

         var2.close();
      } catch (Exception var6) {
      }

   }

   public void Method789() {
      Method792();
      File var2 = new File(System.getProperty("user.home") + File.separator + "FoodByte.cfg");

      try {
         String var3;
         BufferedReader var4;
         String[] var5;
         Module var6;
         for(var4 = new BufferedReader(new FileReader(var2)); (var3 = var4.readLine()) != null; var6 = ModuleManager.getModule(var5[0])) {
            if (!var3.contains(":mod:") && !var3.contains(":key:") && !var3.contains(":")) {
               ;
            }

            var5 = var3.split(":mod:");
         }

         var4.close();
         BufferedReader var14 = new BufferedReader(new FileReader(var2));

         String var13;
         while((var13 = var14.readLine()) != null) {
            if (var13.contains(":key:")) {
               String[] var7 = var13.split(":key:");
               Module var8 = ModuleManager.getModule(var7[0]);
               int var9 = Keyboard.getKeyIndex(var7[1]);
               if (var9 != -1) {
                  var8.Method1021(var9);
                  break;
               }
            }
         }

         var14.close();
         BufferedReader var16 = new BufferedReader(new FileReader(var2));
         String var15;
         if ((var15 = var16.readLine()) != null) {
            if (!var15.contains(":")) {
               ;
            }

            String[] var17 = var15.split(":");
            Iterator var10 = Class446.Method2764().Method1383();

            while(var10.Method932()) {
               Class447 var11 = (Class447)var10.Method933();
               if (var17[0].equalsIgnoreCase(var11.Method2755() + "_" + var11.Method2754())) {
                  if (var11 instanceof BooleanValue && var17[1].equalsIgnoreCase("b")) {
                     var11.Method2510(Boolean.parseBoolean(var17[2]));
                  }

                  if (var11 instanceof FloatValue && var17[1].equalsIgnoreCase("d")) {
                     var11.Method2510(Float.parseFloat(var17[2]));
                  }

                  if (var11 instanceof ColorValue) {
                     if (var17[1].equalsIgnoreCase("i")) {
                        ((ColorValue)var11).Method2440(Integer.parseInt(var17[2]));
                     }

                     if (!var17[3].equalsIgnoreCase("b")) {
                        continue;
                     }

                     ((ColorValue)var11).Method2438(Boolean.parseBoolean(var17[4]));
                  }

                  if (var11 instanceof ModeValue && var17[1].equalsIgnoreCase("s")) {
                     if (!var17[2].equalsIgnoreCase(var11.Method2754())) {
                        ;
                     }

                     ((ModeValue)var11).Method2725(String.valueOf(var17[3]));
                     break;
                  }
               }
            }
         }

         var16.close();
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
