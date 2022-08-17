package trash.foodbyte.module.impl.combat;

import eventapi.EventTarget;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S27PacketExplosion;
import net.minecraft.util.EnumChatFormatting;
import obfuscate.a;
import obfuscate.b;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.ReflectionsHelper;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Velocity extends Module {
   public ModeValue Field2480 = new ModeValue("Velocity", "Mode", "Simple", new String[]{"Simple"}, "简单的");
   public FloatValue Field2481 = new FloatValue("Velocity", "H", 0.0, 0.0, 100.0, 1.0, "XZ轴击退(如果想要半击退建议开AntiKB)");
   public FloatValue Field2482 = new FloatValue("Velocity", "V", 0.0, 0.0, 100.0, 1.0, "Y轴击退(如果想要半击退建议开AntiKB)");

   public Velocity() {
      super("Velocity", Category.COMBAT);
   }

   public String getDescription() {
      return "暴力无击退(移动不受攻击影响)";
   }

   public float Method276() {
      return (float)this.Field2482.getFloatValue().doubleValue();
   }

   public float Method798() {
      return (float)this.Field2481.getFloatValue().doubleValue();
   }

   @EventTarget
   public void Method273(EventPacket a) {
      a[] a = b.trash();
      if (this.Field2480.isCurrentMode("Simple")) {
         this.setDisplayTag("Simple");
         S12PacketEntityVelocity a;
         if (a.packet instanceof S12PacketEntityVelocity && mc.theWorld.getEntityByID((a = (S12PacketEntityVelocity)a.packet).getEntityID()) == mc.thePlayer) {
            ChatUtils.debug("§6S12 Vertical " + EnumChatFormatting.GRAY + ": §fX §e" + a.getMotionX() + " §fY §e" + a.getMotionY() + " §fZ §e" + a.getMotionZ());
            if (this.Method798() == 0.0F && this.Method276() == 0.0F) {
               a.setCancelled(true);
            }

            int a = (int)((float)a.getMotionX() * (this.Method798() / 100.0F));
            int a = (int)((float)a.getMotionY() * (this.Method276() / 100.0F));
            int a = (int)((float)a.getMotionZ() * (this.Method798() / 100.0F));
            ReflectionsHelper.setFinalField(a, ObfuscatedField.S12MotionX.getObfuscatedName(), a, false);
            ReflectionsHelper.setFinalField(a, ObfuscatedField.S12MotionY.getObfuscatedName(), a, false);
            ReflectionsHelper.setFinalField(a, ObfuscatedField.S12MotionZ.getObfuscatedName(), a, false);
         }

         if (!(a.packet instanceof S27PacketExplosion)) {
            return;
         }

         S27PacketExplosion a = (S27PacketExplosion)a.packet;
         ChatUtils.debug("§aS27 Vertical " + EnumChatFormatting.GRAY + ": §fX §e" + a.func_149149_c() + " §fY §e" + a.func_149144_d() + " §fZ §e" + a.func_149147_e());
         if (this.Method798() == 0.0F && this.Method276() == 0.0F) {
            a.setCancelled(true);
         }

         float a = a.func_149149_c() * (this.Method798() / 100.0F);
         float a = a.func_149144_d() * (this.Method276() / 100.0F);
         float a = a.func_149147_e() * (this.Method798() / 100.0F);
         ReflectionsHelper.setFinalField(a, ObfuscatedField.S27MotionX.getObfuscatedName(), a, false);
         ReflectionsHelper.setFinalField(a, ObfuscatedField.S27MotionY.getObfuscatedName(), a, false);
         ReflectionsHelper.setFinalField(a, ObfuscatedField.S27MotionZ.getObfuscatedName(), a, false);
      }

   }
}
