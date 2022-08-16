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
import obfuscate.a;
import obfuscate.b;
import trash.foodbyte.event.EventMotion;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.ServerUtils;
import trash.foodbyte.utils.TimeHelper;
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
    public void Method712(EventMotion a2) {
        if (a2.isPost()) {
            return;
        }
        if (ServerUtils.isPlayingSkywars() || ServerUtils.isPlayingSkyblock()) {
            return;
        }
        if (this.Field2619.getValue()) {
            this.setDisplayTag("Head");
        }
        int a3 = this.Field2617.getFloatValue().intValue() - 1;
        this.Field2622 = this.Method243();
        this.Field2621 = this.Method242();
        if (AutoHeal.mc.thePlayer.hurtTime <= 0 && this.Field2618.getBooleanValue().booleanValue()) {
            return;
        }
        float a4 = AutoHeal.mc.thePlayer.getHealth() / AutoHeal.mc.thePlayer.getMaxHealth() * 100.0f;
        if (this.Method713() && a4 <= this.Field2615.getFloatValue().floatValue() + 5.0f) {
            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT));
            this.Method235(this.Field2622, a3);
            Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C0DPacketCloseWindow(0));
        }
        if (this.Field2621 != -1 && a4 <= this.Field2615.getFloatValue().floatValue() && this.Field2620.isDelayComplete(this.Field2616.getFloatValue().floatValue())) {
            Wrapper.INSTANCE.sendPacket((Packet)new C09PacketHeldItemChange(this.Field2621));
            Wrapper.INSTANCE.sendPacket((Packet)new C08PacketPlayerBlockPlacement(AutoHeal.mc.thePlayer.inventory.getCurrentItem()));
            Wrapper.INSTANCE.sendPacket((Packet)new C09PacketHeldItemChange(AutoHeal.mc.thePlayer.inventory.currentItem));
            this.Field2620.reset();
        }
    }

    private int Method242() {
        int a2 = -1;
        a[] a3 = b.trash();
        int a4 = 36;
        if (a4 < 45) {
            if (AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a4).getHasStack()) {
                ItemStack a5 = AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a4).getStack();
                Item a6 = a5.getItem();
                if (a5.getItemDamage() == 3) {
                    boolean a7;
                    if (a5.getDisplayName().contains((CharSequence)"Backpack")) {
                    }
                    boolean bl = a7 = this.Field2619.getBooleanValue() != false && (Item.getIdFromItem((Item)a6) == Item.getIdFromItem((Item)Items.skull) || Item.getIdFromItem((Item)a6) == Item.getIdFromItem((Item)Items.baked_potato)) && (!AutoHeal.mc.thePlayer.isPotionActive(Potion.regeneration) || AutoHeal.mc.thePlayer.getActivePotionEffect(Potion.regeneration).getAmplifier() < 2 && AutoHeal.mc.thePlayer.getActivePotionEffect(Potion.regeneration).getDuration() <= 1 || AutoHeal.mc.thePlayer.getAbsorptionAmount() <= 0.0f && a5.stackSize >= 1);
                    if (Item.getIdFromItem((Item)a6) != 282) {
                    }
                    a2 = a4 - 36;
                }
            }
            ++a4;
        }
        return a2;
    }

    private boolean Method713() {
        for (int a2 = 36; a2 < 45; ++a2) {
            ItemStack a3 = AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a2).getStack();
            if (!AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a2).getHasStack() || !(a3.getItem() instanceof ItemSkull) || a3.getItemDamage() != 3 || a3.getDisplayName().contains((CharSequence)"Backpack")) continue;
            return false;
        }
        return true;
    }

    protected void Method235(int a2, int a3) {
        AutoHeal.mc.playerController.windowClick(AutoHeal.mc.thePlayer.inventoryContainer.windowId, a2, a3, 2, (EntityPlayer)AutoHeal.mc.thePlayer);
    }

    private int Method243() {
        int a2 = -1;
        int a3 = 9;
        a[] a4 = b.trash();
        if (a3 < 36) {
            if (AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a3).getHasStack()) {
                ItemStack a5 = AutoHeal.mc.thePlayer.inventoryContainer.getSlot(a3).getStack();
                Item a6 = a5.getItem();
                if (a5.getItemDamage() == 3 && !a5.getDisplayName().contains((CharSequence)"Backpack")) {
                    boolean a7;
                    boolean bl = a7 = this.Field2619.getBooleanValue() != false && (Item.getIdFromItem((Item)a6) == Item.getIdFromItem((Item)Items.skull) || Item.getIdFromItem((Item)a6) == Item.getIdFromItem((Item)Items.baked_potato)) && (!AutoHeal.mc.thePlayer.isPotionActive(Potion.regeneration) || AutoHeal.mc.thePlayer.getActivePotionEffect(Potion.regeneration).getAmplifier() < 2 && AutoHeal.mc.thePlayer.getActivePotionEffect(Potion.regeneration).getDuration() <= 1 || AutoHeal.mc.thePlayer.getAbsorptionAmount() <= 0.0f && a5.stackSize >= 1);
                    if (Item.getIdFromItem((Item)a6) != 282) {
                    }
                    a2 = a3;
                }
            }
            ++a3;
        }
        return a2;
    }
}