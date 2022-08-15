/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.authlib.properties.Property
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntitySkull
 *  net.minecraft.util.BlockPos
 *  net.minecraft.util.MovingObjectPosition
 */
package trash.foodbyte.module.impl.skyblock;

import awsl.Class248;
import awsl.Class91;
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
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;

public class GhostBlocks
extends Module {
    public GhostBlocks() {
        int[] nArray = Class98.Method3639();
        super("GhostBlocks", "Ghost Blocks", Category.SKYBLOCK);
        int[] nArray2 = nArray;
        this.setDescription("\u624b\u62ff\u9550\u5b50\u53f3\u952e\u65b9\u5757\u53ef\u6d88\u9664\u65b9\u5757");
        if (Class91.Method3648() == null) {
            Class98.Method3638(new int[5]);
        }
    }

    @EventTarget
    public void Method2066(Class248 a) {
        if (GhostBlocks.mc.currentScreen == null && a.Field1377 == 1 && a.Field1378) {
            MovingObjectPosition a2 = GhostBlocks.mc.objectMouseOver;
            if (a2.entityHit != null) {
                return;
            }
            Block a3 = GhostBlocks.mc.theWorld.getBlockState(a2.getBlockPos()).getBlock();
            BlockPos a4 = a2.getBlockPos();
            ItemStack a5 = GhostBlocks.mc.thePlayer.getHeldItem();
            if (!this.Method2067(a4)) {
                if (a5.getDisplayName().contains((CharSequence)"Stonk") || a5.getDisplayName().contains((CharSequence)"Pickaxe")) {
                    GhostBlocks.mc.theWorld.setBlockToAir(a4);
                    a.Method2300(true);
                }
            }
        }
    }

    private boolean Method2067(BlockPos a) {
        TileEntitySkull a2;
        Block a3 = GhostBlocks.mc.theWorld.getBlockState(a).getBlock();
        if (a3 == Blocks.skull && (a2 = (TileEntitySkull)GhostBlocks.mc.theWorld.getTileEntity(a)).getSkullType() == 3 && a2.getPlayerProfile() != null && a2.getPlayerProfile().getProperties() != null) {
            Property a4 = (Property)GhostBlocks.Method2068((Iterable)a2.getPlayerProfile().getProperties().get((Object)"textures"));
            return a4.getValue().equals((Object)"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzRkYjRhZGZhOWJmNDhmZjVkNDE3MDdhZTM0ZWE3OGJkMjM3MTY1OWZjZDhjZDg5MzQ3NDlhZjRjY2U5YiJ9fX0=");
        }
        return a3 == Blocks.lever || a3 == Blocks.chest || a3 == Blocks.trapped_chest;
    }

    public static Object Method2068(Iterable a) {
        return Iterables.getFirst((Iterable)a, null);
    }
}