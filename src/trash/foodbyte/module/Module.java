package trash.foodbyte.module;

import awsl.Class322;
import awsl.Class446;
import awsl.Class447;
import eventapi.EventManager;
import java.util.Iterator;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;
import obfuscate.a;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.notification.Types;
import trash.foodbyte.reflections.Wrapper;

public class Module {
   public static Minecraft mc;
   public boolean Field2646;
   public boolean hide;
   public boolean isHideModule;
   public boolean use;
   private Category Field2650;
   private String name;
   private String displayName;
   private int Field2653;
   public String Field2654;
   public String description;
   private boolean state;
   private double Field2657;
   private double Field2658;
   private Class322 Field2659;
   private Class322 Field2660;
   private static int[] Field2661;

   public Module(String name, String displayName, Category category) {
      this.Field2654 = "";
      this.description = "unknown";
      mc = Minecraft.getMinecraft();
      this.name = name;
      this.displayName = displayName;
      this.Field2653 = 0;
      this.Field2650 = category;
      this.Field2659 = new Class322();
      this.Field2660 = new Class322();
   }

   public Module(String a, Category category) {
      Method1041();
      super();
      this.Field2654 = "";
      this.description = "unknown";
      mc = Minecraft.getMinecraft();
      this.name = a;
      this.displayName = a;
      this.Field2653 = 0;
      this.Field2650 = category;
      this.Field2659 = new Class322();
      this.Field2660 = new Class322();
      if (a.trash() == null) {
         Method1040(new int[4]);
      }

   }

   public String Method1016() {
      return this.Field2654;
   }

   public void setDisplayTag(String a) {
      int[] a = Method1041();
      if (a.isEmpty()) {
         this.Field2654 = a;
      }

      this.Field2654 = String.format(" %s", EnumChatFormatting.GRAY + a);
   }

   public String getDescription() {
      return this.description;
   }

   public boolean canUse() {
      return this.use;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getName() {
      return this.name;
   }

   public int Method1020() {
      return this.Field2653;
   }

   public void Method1021(int a) {
      this.Field2653 = a;
   }

   public void setHideModule(boolean isHide) {
      this.isHideModule = isHide;
   }

   public String Method1023() {
      return this.displayName;
   }

   public Category Method1024() {
      return this.Field2650;
   }

   public boolean getState() {
      return this.state;
   }

   public boolean Method1026() {
      return Wrapper.INSTANCE.isVaildWorldAndPlayer();
   }

   public void idk() {
   }

   public void onEnable() {
   }

   public void onDisable() {
   }

   public void toggle() {
      int[] var1 = Method1041();
      if (Objects.nonNull(mc.theWorld) && !this.Field2646) {
         if (this.state) {
            if (GlobalModule.toggleSound.getValue()) {
               mc.thePlayer.playSound("mod.on", 1.0F, 1.0F);
            }

            if (!GlobalModule.toggleNotification.getValue()) {
               return;
            }

            GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("§3Module", this.name + " §aEnabled", Types.SUCCESS));
         }

         if (GlobalModule.toggleSound.getValue()) {
            mc.thePlayer.playSound("mod.off", 1.0F, 1.0F);
         }

         if (GlobalModule.toggleNotification.getValue()) {
            GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("§3Module", this.name + " §cDisable", Types.ERROR));
         }
      }

   }

   public void Method1028() {
      try {
         this.setState(!this.getState());
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public void setState(boolean state) {
      this.setState(state, false);
      if (Objects.nonNull(GlobalModule.INSTANCE.fileManager)) {
         GlobalModule.INSTANCE.fileManager.saveMods();
      }

   }

   public void setState(boolean a, boolean a1) {
      int[] a = Method1041();
      if (!this.canUse()) {
         this.state = a;
         this.toggle();
         this.Field2659.Method1192(0.0);
         this.Field2660.Method1192(0.0);
         EventManager.register(this);

         try {
            this.onEnable();
         } catch (Exception var6) {
            var6.printStackTrace();
            EventManager.unregister(this);

            try {
               this.onDisable();
            } catch (Exception var5) {
               var5.printStackTrace();
            }
         }

         GlobalModule.INSTANCE.fileManager.saveMods();
      }
   }

   public boolean Method1031() {
      Iterator var1 = Class446.Method2764().Method1383();

      String a;
      do {
         if (!var1.Method932()) {
            return false;
         }

         Class447 a = (Class447)var1.Method933();
         a = a.Method2755();
      } while(!a.equalsIgnoreCase(this.getName()));

      return true;
   }

   public boolean Method1032() {
      return this.hide;
   }

   public void Method1033(boolean a) {
      this.hide = a;
   }

   public void Method1034(double a) {
      this.Field2657 = a;
   }

   public void Method1035(double a) {
      this.Field2658 = a;
   }

   public double Method1036() {
      return this.Field2657;
   }

   public double Method1037() {
      return this.Field2658;
   }

   public Class322 Method1038() {
      return this.Field2659;
   }

   public Class322 Method1039() {
      return this.Field2660;
   }

   static {
      Method1040(new int[4]);
      mc = Wrapper.INSTANCE.getMinecraft();
   }

   public static void Method1040(int[] arr) {
      Field2661 = arr;
   }

   public static int[] Method1041() {
      return Field2661;
   }

   private static Exception Method1042(Exception exception) {
      return exception;
   }
}
