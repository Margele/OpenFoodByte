package trash.foodbyte.module.impl.skyblock;

import awsl.Class98;
import com.google.common.collect.Iterables;
import com.mojang.authlib.properties.Property;
import eventapi.EventTarget;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import obfuscate.a;
import trash.foodbyte.event.MouseEvent;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;

public class GhostBlocks extends Module {
   public GhostBlocks() {
      Class98.Method3639();
      super("GhostBlocks", "Ghost Blocks", Category.SKYBLOCK);
      this.setDescription("手拿镐子右键方块可消除方块");
      if (a.trash() == null) {
         Class98.Method3638(new int[5]);
      }

   }

   @EventTarget
   public void Method2066(MouseEvent a) {
      if (mc.currentScreen == null && a.eventButton == 1 && a.eventButtonState) {
         MovingObjectPosition a = mc.objectMouseOver;
         if (a.entityHit != null) {
            return;
         }

         mc.theWorld.getBlockState(a.getBlockPos()).getBlock();
         BlockPos a = a.getBlockPos();
         ItemStack a = mc.thePlayer.getHeldItem();
         if (!this.Method2067(a) && (a.getDisplayName().contains("Stonk") || a.getDisplayName().contains("Pickaxe"))) {
            mc.theWorld.setBlockToAir(a);
            a.Method2300(true);
         }
      }

   }

   private boolean Method2067(BlockPos a) {
      Block a = mc.theWorld.getBlockState(a).getBlock();
      if (a == Blocks.skull) {
         TileEntitySkull a = (TileEntitySkull)mc.theWorld.getTileEntity(a);
         if (a.getSkullType() == 3 && a.getPlayerProfile() != null && a.getPlayerProfile().getProperties() != null) {
            Property a = (Property)Method2068(a.getPlayerProfile().getProperties().get("textures"));
            return a.getValue().equals("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzRkYjRhZGZhOWJmNDhmZjVkNDE3MDdhZTM0ZWE3OGJkMjM3MTY1OWZjZDhjZDg5MzQ3NDlhZjRjY2U5YiJ9fX0=");
         }
      }

      return a == Blocks.lever || a == Blocks.chest || a == Blocks.trapped_chest;
   }

   public static Object Method2068(Iterable a) {
      return Iterables.getFirst(a, (Object)null);
   }
}
