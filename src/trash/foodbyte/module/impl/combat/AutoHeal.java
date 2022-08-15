/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Object
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemSkull
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C08PacketPlayerBlockPlacement
 *  net.minecraft.network.play.client.C09PacketHeldItemChange
 *  net.minecraft.network.play.client.C0DPacketCloseWindow
 *  net.minecraft.network.play.client.C16PacketClientStatus
 *  net.minecraft.network.play.client.C16PacketClientStatus$EnumState
 *  net.minecraft.potion.Potion
 */
package trash.foodbyte.module.impl.combat;

import awsl.Class281;
import awsl.Class46;
import awsl.Class91;
import eventapi.EventTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.potion.Potion;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.utils.TimeHelper;
import trash.foodbyte.utils.Wrapper;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;

public class AutoHeal
extends Module {
    public FloatValue Field2615 = new FloatValue("AutoHeal", "Health", 50.0, 1.0, 100.0, 1.0, "%", "\u4f4e\u4e8e\u6700\u5927\u751f\u547d\u503c\u7684\u591a\u5c11\u5f00\u59cb");
    public FloatValue Field2616 = new FloatValue("AutoHeal", "Delay", 50.0, 0.0, 1000.0, 10.0, "\u5403\u4e00\u6b21\u95f4\u9694\u5ef6\u8fdf");
    public FloatValue Field2617 = new FloatValue("AutoHeal", "Slot", 7.0, 1.0, 9.0, 1.0, "\u81ea\u52a8\u9012\u8865\u7ed9\u5230\u51e0\u53f7\u683c\u5b50");
    public BooleanValue Field2618 = new BooleanValue("AutoHeal", "Only Feel Hurt", (Boolean)true, "\u6536\u5230\u4f24\u5bb3\u65f6\u624d\u4f1a\u5403\u8865\u7ed9");
    public BooleanValue Field2619 = new BooleanValue("AutoHeal", "Heads", (Boolean)true, "\u6253\u5f00\u540e\u5403\u5934\u5173\u95ed\u540e\u5403\u8611\u83c7\u5305");
    TimeHelper Field2620 = new TimeHelper();
    public int Field2621;
    public int Field2622;

    public AutoHeal() {
        super("AutoHeal", Category.COMBAT);
        this.setDescription("\u81ea\u52a8\u5403\u8865\u7ed9");
    }

    @EventTarget
    public void Method712(EventMotion a) {
        if (a.isPost()) {
            return;
        }
        if (Class281.Method3051() || Class281.Method3050()) {
            return;
        }
        if (this.Field2619.getValue()) {
            this.setDisplayTag("Head");
        }
        int a2 = this.Field2617.Method2744().intValue() - 1;
        this.Field2622 = this.Method243();
        this.Field2621 = this.Method242();
        if (AutoHeal.mc.thePlayer.hurtTime <= 0 && this.Field2618.Method2509().booleanValue()) {
            return;
        }
        float a3 = AutoHeal.mc.thePlayer.getHealth() / AutoHeal.mc.thePlayer.getMaxHealth() * 100.0f;
        if (this.Method713() && a3 <= this.Field2615.Method2744().floatValue() + 5.0f) {
            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
            this.Method235(this.Field2622, a2);
            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0DPacketCloseWindow(0));
        }
        if (this.Field2621 != -1 && a3 <= this.Field2615.Method2744().floatValue() && this.Field2620.Method219(this.Field2616.Method2744().floatValue())) {
            Wrapper.INSTANCE.Method2874((Packet)new C09PacketHeldItemChange(this.Field2621));
            Wrapper.INSTANCE.Method2874((Packet)new C08PacketPlayerBlockPlacement(AutoHeal.mc.thePlayer.inventory.getCurrentItem()));
            Wrapper.INSTANCE.Method2874((Packet)new C09PacketHeldItemChange(AutoHeal.mc.thePlayer.inventory.currentItem));
            this.Field2620.Method214();
        }
    }

    private int Method242() {
        int a = -1;
        Class91[] a2 = Class46.Method3239();
        int a3 = 36;
        if (a3 < 45) {
            if (AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack()) {
                ItemStack a4 = AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a3).getStack();
                Item a5 = a4.getItem();
                if (a4.getItemDamage() == 3) {
                    boolean a6;
                    if (a4.getDisplayName().contains((CharSequence)"Backpack")) {
                    }
                    boolean bl = a6 = this.Field2619.Method2509() != false && (Item.getIdFromItem((Item)a5) == Item.getIdFromItem((Item)Items.skull) || Item.getIdFromItem((Item)a5) == Item.getIdFromItem((Item)Items.baked_potato)) && (!AutoHeal.mc.thePlayer.isPotionActive(Potion.regeneration) || AutoHeal.mc.thePlayer.getActivePotionEffect(Potion.regeneration).getAmplifier() < 2 && AutoHeal.mc.thePlayer.getActivePotionEffect(Potion.regeneration).getDuration() <= 1 || AutoHeal.mc.thePlayer.getAbsorptionAmount() <= 0.0f && a4.stackSize >= 1);
                    if (Item.getIdFromItem((Item)a5) != 282) {
                    }
                    a = a3 - 36;
                }
            }
            ++a3;
        }
        return a;
    }

    private boolean Method713() {
        for (int a = 36; a < 45; ++a) {
            ItemStack a2 = AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a).getStack();
            if (!AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a).getHasStack() || !(a2.getItem() instanceof ItemSkull) || a2.getItemDamage() != 3 || a2.getDisplayName().contains((CharSequence)"Backpack")) continue;
            return false;
        }
        return true;
    }

    protected void Method235(int a, int a2) {
        AutoHeal.mc.playerController.windowClick(AutoHeal.mc.thePlayer.inventoryContainer.windowId, a, a2, 2, (EntityPlayer)AutoHeal.mc.thePlayer);
    }

    private int Method243() {
        int a = -1;
        int a2 = 9;
        Class91[] a3 = Class46.Method3239();
        if (a2 < 36) {
            if (AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack()) {
                ItemStack a4 = AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a2).getStack();
                Item a5 = a4.getItem();
                if (a4.getItemDamage() == 3 && !a4.getDisplayName().contains((CharSequence)"Backpack")) {
                    boolean a6;
                    boolean bl = a6 = this.Field2619.Method2509() != false && (Item.getIdFromItem((Item)a5) == Item.getIdFromItem((Item)Items.skull) || Item.getIdFromItem((Item)a5) == Item.getIdFromItem((Item)Items.baked_potato)) && (!AutoHeal.mc.thePlayer.isPotionActive(Potion.regeneration) || AutoHeal.mc.thePlayer.getActivePotionEffect(Potion.regeneration).getAmplifier() < 2 && AutoHeal.mc.thePlayer.getActivePotionEffect(Potion.regeneration).getDuration() <= 1 || AutoHeal.mc.thePlayer.getAbsorptionAmount() <= 0.0f && a4.stackSize >= 1);
                    if (Item.getIdFromItem((Item)a5) != 282) {
                    }
                    a = a2;
                }
            }
            ++a2;
        }
        return a;
    }
}