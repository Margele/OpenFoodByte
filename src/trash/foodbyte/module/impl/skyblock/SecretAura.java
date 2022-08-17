package trash.foodbyte.module.impl.skyblock;

import awsl.Class98;
import com.google.common.collect.Iterables;
import com.mojang.authlib.properties.Property;
import com.mojang.realmsclient.gui.ChatFormatting;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.server.S02PacketChat;
import net.minecraft.network.play.server.S2DPacketOpenWindow;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3i;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class SecretAura extends Module {
   public static FloatValue Field3127 = new FloatValue("SecretAura", "Reach", 3.0F, 5.0F, 7.0F, 1.0F, "自动点击延迟");
   public static BooleanValue Field3128 = new BooleanValue("SecretAura", "Clicked check", true, "懂得都懂");
   public static BooleanValue Field3129 = new BooleanValue("SecretAura", "Cancel chests", true, "懂得都懂");
   public static BooleanValue Field3130 = new BooleanValue("SecretAura", "Rotation", false, "头会扭动瞄准秘密再打开(但是自己视角看不见)");
   public static ArrayList Field3131 = new ArrayList();
   public static boolean Field3132;
   private boolean Field3133;

   public SecretAura() {
      super("SecretAura", "Secret Aura", Category.SKYBLOCK);
      this.setDescription("§3Skills\n地牢走到秘密旁边自动打开");
   }

   @EventTarget
   public void Method752(EventMotion a) {
      int[] var2 = Class98.Method3639();
      Vec3i var3;
      Iterator var4;
      BlockPos var5;
      if (a.isPre()) {
         if (mc.thePlayer == null || !ServerUtils.isPlayingSkyblockAndCleared() || !Field3130.getBooleanValue()) {
            return;
         }

         var3 = new Vec3i(10, 10, 10);
         var4 = BlockPos.getAllInBox((new BlockPos(mc.thePlayer.getPosition())).add(var3), new BlockPos(mc.thePlayer.getPosition().subtract(var3))).Method1383();
         if (var4.Method932()) {
            var5 = (BlockPos)var4.Method933();
            if (this.Method2067(var5) && mc.thePlayer.getDistance((double)var5.getX(), (double)((float)var5.getY() - mc.thePlayer.getEyeHeight()), (double)var5.getZ()) < (double)Field3127.getFloatValue()) {
               float[] var6 = Method2070(new Vec3((double)var5.getX() + 0.5, (double)var5.getY() + 0.5, (double)var5.getZ() + 0.5));
               EventMotion.pitch = var6[1];
               EventMotion.yaw = var6[0];
            }
         }
      }

      if (mc.thePlayer != null && ServerUtils.isPlayingSkyblockAndCleared()) {
         var3 = new Vec3i(10, 10, 10);
         var4 = BlockPos.getAllInBox((new BlockPos(mc.thePlayer.getPosition())).add(var3), new BlockPos(mc.thePlayer.getPosition().subtract(var3))).Method1383();

         while(var4.Method932()) {
            var5 = (BlockPos)var4.Method933();
            if (!this.Method2067(var5) || !(mc.thePlayer.getDistance((double)var5.getX(), (double)((float)var5.getY() - mc.thePlayer.getEyeHeight()), (double)var5.getZ()) < (double)Field3127.getFloatValue())) {
               break;
            }

            this.Method2069(var5);
            if (Field3130.getBooleanValue()) {
               break;
            }
         }
      }

   }

   private boolean Method2067(BlockPos a) {
      Block var2 = mc.theWorld.getBlockState(a).getBlock();
      if (var2 == Blocks.skull) {
         TileEntitySkull var3 = (TileEntitySkull)mc.theWorld.getTileEntity(a);
         if (var3.getSkullType() == 3 && var3.getPlayerProfile() != null && var3.getPlayerProfile().getProperties() != null) {
            Property var4 = (Property)Method2068(var3.getPlayerProfile().getProperties().get("textures"));
            return var4.getValue().equals("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzRkYjRhZGZhOWJmNDhmZjVkNDE3MDdhZTM0ZWE3OGJkMjM3MTY1OWZjZDhjZDg5MzQ3NDlhZjRjY2U5YiJ9fX0=") && (!Field3131.contains(a) || !Field3128.getBooleanValue());
         }
      }

      return (var2 == Blocks.lever || var2 == Blocks.chest || var2 == Blocks.trapped_chest) && (!Field3131.contains(a) || !Field3128.getBooleanValue());
   }

   private void Method2069(BlockPos a) {
      for(int var2 = 0; var2 < 9; ++var2) {
         if (mc.thePlayer.inventory.getStackInSlot(var2) != null && mc.thePlayer.inventory.getStackInSlot(var2).getDisplayName().toLowerCase().contains("stonk".toLowerCase())) {
            int var3 = mc.thePlayer.inventory.currentItem;
            mc.thePlayer.inventory.currentItem = var2;
            if (mc.theWorld.getBlockState(a).getBlock() == Blocks.lever && !Field3132) {
               mc.playerController.onPlayerRightClick(mc.thePlayer, mc.theWorld, mc.thePlayer.inventory.getCurrentItem(), a, EnumFacing.fromAngle((double)mc.thePlayer.rotationYaw), new Vec3(0.0, 0.0, 0.0));
            }

            mc.playerController.onPlayerRightClick(mc.thePlayer, mc.theWorld, mc.thePlayer.inventory.getCurrentItem(), a, EnumFacing.fromAngle((double)mc.thePlayer.rotationYaw), new Vec3(0.0, 0.0, 0.0));
            mc.thePlayer.inventory.currentItem = var3;
            Field3131.Method2530(a);
            return;
         }
      }

      if (!this.Field3133) {
         ChatUtils.addChatMessage("You don't have a required item in your hotbar!");
         this.Field3133 = true;
      }

   }

   @EventTarget
   public void Method1186(EventPacket a) {
      if (a.isRecieve()) {
         if (a.packet instanceof S02PacketChat && ChatFormatting.stripFormatting(((S02PacketChat)a.packet).getChatComponent().getFormattedText()).startsWith("[BOSS] Necron")) {
            Field3132 = true;
         }

         if (a.packet instanceof S2DPacketOpenWindow && ChatFormatting.stripFormatting(((S2DPacketOpenWindow)a.packet).getWindowTitle().getFormattedText()).equals("Chest") && ServerUtils.isPlayingSkyblockAndCleared() && Field3129.getBooleanValue()) {
            a.setCancelled(true);
            mc.getNetHandler().getNetworkManager().sendPacket(new C0DPacketCloseWindow(((S2DPacketOpenWindow)a.packet).getWindowId()));
         }
      }

   }

   public static Object Method2068(Iterable a) {
      return Iterables.getFirst(a, (Object)null);
   }

   public static float[] Method2070(Vec3 a) {
      double var1 = a.xCoord - mc.thePlayer.posX;
      double var3 = a.yCoord - (mc.thePlayer.posY + (double)mc.thePlayer.getEyeHeight());
      double var5 = a.zCoord - mc.thePlayer.posZ;
      double var7 = (double)MathHelper.sqrt_double(var1 * var1 + var5 * var5);
      float var9 = (float)(Math.atan2(var5, var1) * 180.0 / Math.PI) - 90.0F;
      float var10 = (float)(-(Math.atan2(var3, var7) * 180.0 / Math.PI));
      return new float[]{mc.thePlayer.rotationYaw + MathHelper.wrapAngleTo180_float(var9 - mc.thePlayer.rotationYaw), mc.thePlayer.rotationPitch + MathHelper.wrapAngleTo180_float(var10 - mc.thePlayer.rotationPitch)};
   }
}
