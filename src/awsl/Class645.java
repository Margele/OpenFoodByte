package awsl;

import eventapi.Event;
import net.minecraft.entity.EntityLivingBase;

public class Class645 implements Event {
   public boolean Field2914;
   public EntityLivingBase Field2915;

   public Class645(Object a, boolean a) {
      this.Field2915 = (EntityLivingBase)a;
      this.Field2914 = a;
   }

   public EntityLivingBase Method3605() {
      return this.Field2915;
   }

   public boolean Method2241() {
      return this.Field2914;
   }

   public boolean Method3515() {
      return !this.Field2914;
   }
}
