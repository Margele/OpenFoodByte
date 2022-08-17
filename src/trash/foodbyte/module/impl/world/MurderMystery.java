package trash.foodbyte.module.impl.world;

import awsl.Class448;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.util.EnumChatFormatting;
import obfuscate.a;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.event.EventTick;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.Servers;

public class MurderMystery extends Module {
   public static ArrayList Field2300 = new ArrayList();
   public static ArrayList Field2301 = new ArrayList();
   private static final int[] Field2302 = new int[]{267, 272, 256, 280, 271, 268, 32, 273, 369, 277, 406, 400, 285, 260, 421, 19, 398, 352, 391, 396, 357, 279, 175, 409, 364, 405, 366, 283, 276, 293, 359, 349, 351, 333, 382, 340};

   public MurderMystery() {
      super("MurderMystery", "Murder Mystery", Category.WORLD);
      this.setDescription("密室杀手检测杀手和好人");
   }

   @EventTarget
   public void Method755(EventTick a) {
      a[] var2 = Class448.trash();
      if (mc.getCurrentServerData() != null && mc.theWorld != null && ServerUtils.isSinglePlayer(Servers.MM)) {
         Iterator var3 = mc.theWorld.loadedEntityList.Method1383();
         if (var3.Method932()) {
            Object var4 = var3.Method933();
            if (var4 instanceof EntityPlayer) {
               EntityPlayer var5 = (EntityPlayer)var4;
               if (Field2300.contains(var5) && !var5.isEntityAlive()) {
                  Field2300.remove(var5);
               }

               if (Field2301.contains(var5) && !var5.isEntityAlive()) {
                  Field2301.remove(var5);
               }

               if (var5 != mc.thePlayer && !var5.isDead && !var5.isInvisible()) {
                  if (!Field2300.contains(var5) && var5.getHeldItem() != null && this.Method2258(var5.getHeldItem().getItem())) {
                     ChatUtils.addChatMessage(EnumChatFormatting.RED + var5.getName() + EnumChatFormatting.WHITE + " might be a murderer watch out!");
                     Field2300.Method2530(var5);
                  }

                  if (!Field2301.contains(var5) && !Field2300.contains(var5) && var5.getHeldItem() != null && var5.getHeldItem().getItem() instanceof ItemBow) {
                     ChatUtils.addChatMessage(EnumChatFormatting.BLUE + var5.getName() + EnumChatFormatting.WHITE + " is a good guy.");
                     Field2301.Method2530(var5);
                  }
               }
            }
         }
      }

      if (mc.thePlayer.isDead) {
         Field2301.clear();
         Field2300.clear();
      }

   }

   private boolean Method2258(Item a) {
      int[] var3 = Field2302;
      Class448.trash();
      int var4 = var3.length;
      int var5 = 0;
      if (var5 < var4) {
         int var6 = var3[var5];
         if (Item.getIdFromItem(a) == var6) {
            return true;
         }

         ++var5;
      }

      return false;
   }

   @EventTarget
   public void Method273(EventPacket a) {
      if (a.getPacket() instanceof S07PacketRespawn) {
         Field2300.clear();
         Field2301.clear();
      }

   }

   public void onDisable() {
      Field2300.clear();
      Field2301.clear();
   }
}
