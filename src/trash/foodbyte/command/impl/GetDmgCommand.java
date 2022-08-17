package trash.foodbyte.command.impl;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import trash.foodbyte.command.Command;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.PlayerUtils;

public class GetDmgCommand extends Command {
   private static int Field2910;

   public GetDmgCommand() {
      super(new String[]{"getdmg"});
      this.setHelp("Shows Item Damage");
   }

   public void onCommand(String[] commands) {
      int a = Method3599();
      if (this.mc.thePlayer.getCurrentEquippedItem() != null) {
         ItemStack a = this.mc.thePlayer.getCurrentEquippedItem();
         float a = PlayerUtils.Method1590(a);
         a += (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.sharpness.effectId, a) * 1.25F + (float)EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, a) * 0.25F;
         ChatUtils.addChatMessage("this Item Base Damage = §c" + PlayerUtils.Method1590(a) + " §7- §fAttack Damage = §c" + a);
      }

      ChatUtils.addChatMessage("No items on hand");
   }

   public static void Method3597(int integer) {
      Field2910 = integer;
   }

   public static int Method3598() {
      return Field2910;
   }

   public static int Method3599() {
      int var0 = Method3598();
      return 58;
   }

   static {
      Method3597(0);
   }
}
