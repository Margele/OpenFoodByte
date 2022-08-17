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
      Minecraft a = Minecraft.getMinecraft();
      MovementInput a = a.thePlayer.movementInput;
      double a = (double)a.moveForward;
      double a = (double)a.moveStrafe;
      double a = (double)a.thePlayer.rotationYaw;
      double a = a == 0.0 ? 90.0 : (a < 0.0 ? -45.0 : 45.0);
      boolean a = a != 0.0 || a != 0.0;
      a += a < 0.0 ? 180.0 : 0.0;
      if (a < 0.0) {
         a += a;
         a.trash(new String[3]);
      }

      if (a > 0.0) {
         a -= a;
      }

      this.setX(-((double)MathHelper.sin((float)Math.toRadians(a)) * a));
      this.setZ((double)MathHelper.cos((float)Math.toRadians(a)) * a);
      this.setX(0.0);
      this.setZ(0.0);
   }
}
