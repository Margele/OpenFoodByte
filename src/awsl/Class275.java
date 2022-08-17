package awsl;

import net.minecraft.entity.player.EntityPlayer;

public class Class275 {
   public EntityPlayer Field1477;
   public float Field1478 = 0.0F;

   public Class275(EntityPlayer a) {
      this.Field1477 = a;
   }

   public void Method2806(float a, float a1) {
      String a = this.Field1477.getName();
      String a = (double)Math.round(this.Field1477.getHealth() * 10.0F) / 10.0 + " hp";
   }

   public void Method2807(EntityPlayer a) {
      this.Field1477 = a;
   }
}
