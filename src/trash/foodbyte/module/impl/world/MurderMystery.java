/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 *  java.util.Iterator
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemBow
 *  net.minecraft.network.play.server.S07PacketRespawn
 *  net.minecraft.util.EnumChatFormatting
 */
package trash.foodbyte.module.impl.world;

import awsl.Class281;
import awsl.Class448;
import awsl.Class653;
import awsl.Class667;
import awsl.Class91;
import eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.network.play.server.S07PacketRespawn;
import net.minecraft.util.EnumChatFormatting;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.ChatUtils;

public class MurderMystery
extends Module {
    public static ArrayList Field2300 = new ArrayList();
    public static ArrayList Field2301 = new ArrayList();
    private static final int[] Field2302 = new int[]{267, 272, 256, 280, 271, 268, 32, 273, 369, 277, 406, 400, 285, 260, 421, 19, 398, 352, 391, 396, 357, 279, 175, 409, 364, 405, 366, 283, 276, 293, 359, 349, 351, 333, 382, 340};

    public MurderMystery() {
        super("MurderMystery", "Murder Mystery", Category.WORLD);
        this.setDescription("\u5bc6\u5ba4\u6740\u624b\u68c0\u6d4b\u6740\u624b\u548c\u597d\u4eba");
    }

    @EventTarget
    public void Method755(Class653 a) {
        Iterator iterator;
        Class91[] a2 = Class448.Method2461();
        if (mc.getCurrentServerData() != null && MurderMystery.mc.theWorld != null && Class281.Method3049(Class667.MM) && (iterator = MurderMystery.mc.theWorld.loadedEntityList.Method1383()).Method932()) {
            Object a3 = iterator.Method933();
            if (a3 instanceof EntityPlayer) {
                EntityPlayer a4 = (EntityPlayer)a3;
                if (Field2300.contains((Object)a4) && !a4.isEntityAlive()) {
                    Field2300.remove((Object)a4);
                }
                if (Field2301.contains((Object)a4) && !a4.isEntityAlive()) {
                    Field2301.remove((Object)a4);
                }
                if (a4 != MurderMystery.mc.thePlayer && !a4.isDead && !a4.isInvisible()) {
                    if (!Field2300.contains((Object)a4) && a4.getHeldItem() != null && this.Method2258(a4.getHeldItem().getItem())) {
                        ChatUtils.addChatMessage(EnumChatFormatting.RED + a4.getName() + EnumChatFormatting.WHITE + " might be a murderer watch out!");
                        Field2300.Method2530((Object)a4);
                    }
                    if (!Field2301.contains((Object)a4) && !Field2300.contains((Object)a4) && a4.getHeldItem() != null && a4.getHeldItem().getItem() instanceof ItemBow) {
                        ChatUtils.addChatMessage(EnumChatFormatting.BLUE + a4.getName() + EnumChatFormatting.WHITE + " is a good guy.");
                        Field2301.Method2530((Object)a4);
                    }
                }
            }
        }
        if (MurderMystery.mc.thePlayer.isDead) {
            Field2301.clear();
            Field2300.clear();
        }
    }

    private boolean Method2258(Item a) {
        int[] nArray = Field2302;
        int n = nArray.length;
        Class91[] a2 = Class448.Method2461();
        int n2 = 0;
        if (n2 < n) {
            int a3 = nArray[n2];
            if (Item.getIdFromItem((Item)a) == a3) {
                return true;
            }
            ++n2;
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

    @Override
    public void Method279() {
        Field2300.clear();
        Field2301.clear();
    }
}