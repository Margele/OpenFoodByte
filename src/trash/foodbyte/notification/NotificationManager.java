package trash.foodbyte.notification;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.ScaledResolution;

public final class NotificationManager {
   protected List Field2090 = new ArrayList();

   public void Method2730(ScaledResolution a, boolean a1, int a) {
      Notification.Method2742();
      List a = this.Method2732();
      Notification a = null;
      int a = 0;
      if (a < a.Method1799()) {
         Notification a = (Notification)a.get(a);
         if (a.Method2739()) {
            a = a;
         }

         a.Method2734(a, a + 1, a);
         ++a;
      }

      this.Method2732().remove(a);
   }

   public void addNotification(Notification a) {
      this.Method2732().Method2530(a);
   }

   public List Method2732() {
      return this.Field2090;
   }
}
