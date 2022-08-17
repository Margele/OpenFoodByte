package trash.foodbyte.module.impl.world;

import awsl.Class305;
import awsl.Class309;
import awsl.Class364;
import awsl.Class448;
import eventapi.EventTarget;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import obfuscate.a;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.Module;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.notification.Types;
import trash.foodbyte.utils.ChatUtils;

public class MCF extends Module {
   private final Class364 Field2303 = new Class364(2);

   public MCF() {
      super("MCF", Category.WORLD);
   }

   public String getDescription() {
      return "鼠标中键添加Friend";
   }

   @EventTarget
   public void Method755(EventTick a) {
      a[] var2 = Class448.trash();
      if (mc.objectMouseOver != null && mc.objectMouseOver.entityHit instanceof EntityPlayer) {
         EntityLivingBase var3 = (EntityLivingBase)mc.objectMouseOver.entityHit;
         String var4 = mc.objectMouseOver.entityHit.getName();
         if (this.Field2303.Method582()) {
            ChatUtils.debug("Team: " + var3.getName());
            ChatUtils.debug("Team: " + var3.getTeam().isSameTeam(mc.thePlayer.getTeam()));
            if (Class305.Method697(var3)) {
               int var5 = 0;
               if (var5 < Class305.Method695().Method1799()) {
                  Class309 var6 = (Class309)Class305.Method695().get(var5);
                  if (var6.Method748().equalsIgnoreCase(var4)) {
                     Class305.Method695().remove(var5);
                     GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Friend", "Remove " + var4, Types.WARNING));
                  }

                  ++var5;
               }
            }

            Class305.Method695().Method2530(new Class309(var4, var4));
            GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Friend", "Add " + var4, Types.SUCCESS));
            GlobalModule.INSTANCE.fileManager.saveFriends();
         }
      }

   }
}
