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
      a[] var2 = b.trash();
      if (this.Field2480.isCurrentMode("Simple")) {
         this.setDisplayTag("Simple");
         S12PacketEntityVelocity var3;
         if (a.packet instanceof S12PacketEntityVelocity && mc.theWorld.getEntityByID((var3 = (S12PacketEntityVelocity)a.packet).getEntityID()) == mc.thePlayer) {
            ChatUtils.debug("§6S12 Vertical " + EnumChatFormatting.GRAY + ": §fX §e" + var3.getMotionX() + " §fY §e" + var3.getMotionY() + " §fZ §e" + var3.getMotionZ());
            if (this.Method798() == 0.0F && this.Method276() == 0.0F) {
               a.setCancelled(true);
            }

            int var4 = (int)((float)var3.getMotionX() * (this.Method798() / 100.0F));
            int var5 = (int)((float)var3.getMotionY() * (this.Method276() / 100.0F));
            int var6 = (int)((float)var3.getMotionZ() * (this.Method798() / 100.0F));
            ReflectionsHelper.setFinalField(var3, ObfuscatedField.S12MotionX.getObfuscatedName(), var4, false);
            ReflectionsHelper.setFinalField(var3, ObfuscatedField.S12MotionY.getObfuscatedName(), var5, false);
            ReflectionsHelper.setFinalField(var3, ObfuscatedField.S12MotionZ.getObfuscatedName(), var6, false);
         }

         if (!(a.packet instanceof S27PacketExplosion)) {
            return;
         }

         S27PacketExplosion var8 = (S27PacketExplosion)a.packet;
         ChatUtils.debug("§aS27 Vertical " + EnumChatFormatting.GRAY + ": §fX §e" + var8.func_149149_c() + " §fY §e" + var8.func_149144_d() + " §fZ §e" + var8.func_149147_e());
         if (this.Method798() == 0.0F && this.Method276() == 0.0F) {
            a.setCancelled(true);
         }

         float var9 = var8.func_149149_c() * (this.Method798() / 100.0F);
         float var10 = var8.func_149144_d() * (this.Method276() / 100.0F);
         float var7 = var8.func_149147_e() * (this.Method798() / 100.0F);
         ReflectionsHelper.setFinalField(var8, ObfuscatedField.S27MotionX.getObfuscatedName(), var9, false);
         ReflectionsHelper.setFinalField(var8, ObfuscatedField.S27MotionY.getObfuscatedName(), var10, false);
         ReflectionsHelper.setFinalField(var8, ObfuscatedField.S27MotionZ.getObfuscatedName(), var7, false);
      }

   }
}
