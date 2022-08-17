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
      a[] a = Class448.trash();
      if (mc.objectMouseOver != null && mc.objectMouseOver.entityHit instanceof EntityPlayer) {
         EntityLivingBase a = (EntityLivingBase)mc.objectMouseOver.entityHit;
         String a = mc.objectMouseOver.entityHit.getName();
         if (this.Field2303.Method582()) {
            ChatUtils.debug("Team: " + a.getName());
            ChatUtils.debug("Team: " + a.getTeam().isSameTeam(mc.thePlayer.getTeam()));
            if (Class305.Method697(a)) {
               int a = 0;
               if (a < Class305.Method695().Method1799()) {
                  Class309 a = (Class309)Class305.Method695().get(a);
                  if (a.Method748().equalsIgnoreCase(a)) {
                     Class305.Method695().remove(a);
                     GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Friend", "Remove " + a, Types.WARNING));
                  }

                  ++a;
               }
            }

            Class305.Method695().Method2530(new Class309(a, a));
            GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("Friend", "Add " + a, Types.SUCCESS));
            GlobalModule.INSTANCE.fileManager.saveFriends();
         }
      }

   }
}
