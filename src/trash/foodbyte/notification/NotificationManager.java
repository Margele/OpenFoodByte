package trash.foodbyte.notification;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.ScaledResolution;

public final class NotificationManager {
   protected List Field2090 = new ArrayList();

   public void Method2730(ScaledResolution a, boolean a, int a) {
      Notification.Method2742();
      List var5 = this.Method2732();
      Notification var6 = null;
      int var7 = 0;
      if (var7 < var5.Method1799()) {
         Notification var8 = (Notification)var5.get(var7);
         if (var8.Method2739()) {
            var6 = var8;
         }

         var8.Method2734(a, var7 + 1, a);
         ++var7;
      }

      this.Method2732().remove(var6);
   }

   public void addNotification(Notification a) {
      this.Method2732().Method2530(a);
   }

   public List Method2732() {
      return this.Field2090;
   }
}
