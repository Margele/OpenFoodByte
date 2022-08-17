package trash.foodbyte.event;

import eventapi.Event;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovementInput;
import obfuscate.a;

public class EventMove implements Event {
   public double x;
   public double y;
   public double z;
   private boolean safewalk;
   public Entity entity;

   public EventMove(Object entity, double x, double y, double z) {
      this.entity = (Entity)entity;
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public Boolean isLocalPlayer() {
      return this.entity instanceof EntityPlayerSP;
   }

   public Entity getEntity() {
      return this.entity;
   }

   public double getX() {
      return this.x;
   }

   public void setX(double x) {
      this.x = x;
   }

   public double getY() {
      return this.y;
   }

   public void setY(double y) {
      this.y = y;
   }

   public double getZ() {
      return this.z;
   }

   public void setZ(double z) {
      this.z = z;
   }

   public void setSafewalk(boolean safewalk) {
      this.safewalk = safewalk;
   }

   public void iWannaSetSafewalkToo(boolean safewalk) {
      this.safewalk = safewalk;
   }

   public void setSpeed(double a) {
      EventPacket.trash();
      Minecraft var4 = Minecraft.getMinecraft();
      MovementInput var5 = var4.thePlayer.movementInput;
      double var6 = (double)var5.moveForward;
      double var8 = (double)var5.moveStrafe;
      double var10 = (double)var4.thePlayer.rotationYaw;
      double var12 = var6 == 0.0 ? 90.0 : (var6 < 0.0 ? -45.0 : 45.0);
      boolean var14 = var6 != 0.0 || var8 != 0.0;
      var10 += var6 < 0.0 ? 180.0 : 0.0;
      if (var8 < 0.0) {
         var10 += var12;
         a.trash(new String[3]);
      }

      if (var8 > 0.0) {
         var10 -= var12;
      }

      this.setX(-((double)MathHelper.sin((float)Math.toRadians(var10)) * a));
      this.setZ((double)MathHelper.cos((float)Math.toRadians(var10)) * a);
      this.setX(0.0);
      this.setZ(0.0);
   }
}
