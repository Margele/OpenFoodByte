/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.inventory.GuiChest
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.inventory.Container
 *  net.minecraft.inventory.ContainerChest
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.play.server.S2FPacketSetSlot
 */
package trash.foodbyte.module.impl.skyblock;

import awsl.Class628;
import awsl.Class643;
import awsl.Class747;
import eventapi.EventTarget;
import java.util.List;
import native0.Class614;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.S2FPacketSetSlot;
import trash.foodbyte.event.EventPacket;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.Module;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class DungeonHelper
extends Module {
    public int Field3240;
    private static long Field3241;
    private static final String[] Field3242;
    private static String Field3243;
    public static boolean Field3244;
    private static final String[] Field3245;
    public static FloatValue Field3246;
    public static ModeValue Field3247;

    @EventTarget
    public void Method1186(EventPacket a) {
        if (a.isRecieve() && Field3247.isCurrentMode(DungeonHelper.Method754(-11423, 31190)) && a.getPacket() instanceof S2FPacketSetSlot) {
            S2FPacketSetSlot a2 = (S2FPacketSetSlot)a.getPacket();
            if (DungeonHelper.mc.currentScreen instanceof GuiChest) {
                Container a3 = Minecraft.getMinecraft().thePlayer.openContainer;
                ContainerChest a4 = (ContainerChest)a3;
                String a5 = a4.getLowerChestInventory().getDisplayName().getUnformattedText().toLowerCase();
                String a6 = a4.getLowerChestInventory().getDisplayName().getUnformattedText();
                boolean a7 = false;
                if (a6.contains((CharSequence)DungeonHelper.Method754(-11414, -11115))) {
                    short a8;
                    int a9 = a2.func_149173_d();
                    ItemStack a10 = a4.getLowerChestInventory().getStackInSlot(a9 - 9 - 9);
                    if (DungeonHelper.mc.thePlayer.ticksExisted >= 3 && this.Field3240 != 0 && Item.getIdFromItem((Item)a4.getLowerChestInventory().getStackInSlot(this.Field3240).getItem()) == 155 && a4.getLowerChestInventory().getStackInSlot(this.Field3240).getItemDamage() == 0) {
                        a8 = DungeonHelper.mc.thePlayer.openContainer.getNextTransactionID(DungeonHelper.mc.thePlayer.inventory);
                        Class747.Method1564(a9);
                        this.Field3240 = 0;
                    }
                    if (Item.getIdFromItem((Item)a2.func_149174_e().getItem()) == 155 && a2.func_149174_e().getItemDamage() == 0) {
                        a8 = DungeonHelper.mc.thePlayer.openContainer.getNextTransactionID(DungeonHelper.mc.thePlayer.inventory);
                        Class747.Method1564(a9);
                        if (Item.getIdFromItem((Item)a10.getItem()) == 35) {
                            this.Field3240 = a9;
                        }
                        DungeonHelper.mc.thePlayer.ticksExisted = 0;
                    }
                }
            }
        }
    }

    @Override
    public void onDisable() {
        Field3246.Method2757(Field3247.isCurrentMode(DungeonHelper.Method754(-11422, -9067)));
    }

    static {
        Class614.Method2232(7, DungeonHelper.class);
        DungeonHelper.Method1658();
    }

    @Class628
    public native void Method1656(Container var1, String var2, int var3, List var4, IInventory var5);

    public DungeonHelper() {
        super(DungeonHelper.Method754(-11410, 3174), DungeonHelper.Method754(-11409, -21921), Category.SKYBLOCK);
        this.setDescription(DungeonHelper.Method754(-11419, -31315));
    }

    @EventTarget
    public void Method1657(Class643 a) {
        GuiContainer a2 = (GuiContainer)a.Field2911;
        if (a2.inventorySlots instanceof ContainerChest) {
            IInventory a3 = ((ContainerChest)a2.inventorySlots).getLowerChestInventory();
            Container a4 = a2.inventorySlots;
            String a5 = a3.getDisplayName().getUnformattedText().toLowerCase().trim();
            String a6 = a3.getDisplayName().getUnformattedText();
            int a7 = a2.inventorySlots.inventorySlots.Method1799();
            List a8 = a2.inventorySlots.inventorySlots;
            this.Method1656(a4, a6, a7, a8, a3);
            Class747.Method1565(0);
        }
    }

    private static String Method754(int n, int n2) {
        int n3 = (n ^ 0xFFFFD368) & 0xFFFF;
        if (Field3242[n3] == null) {
            int n4;
            char[] cArray = Field3245[n3].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n4 = 52;
                    break;
                }
                case 1: {
                    n4 = 42;
                    break;
                }
                case 2: {
                    n4 = 78;
                    break;
                }
                case 3: {
                    n4 = 199;
                    break;
                }
                case 4: {
                    n4 = 55;
                    break;
                }
                case 5: {
                    n4 = 128;
                    break;
                }
                case 6: {
                    n4 = 129;
                    break;
                }
                case 7: {
                    n4 = 211;
                    break;
                }
                case 8: {
                    n4 = 240;
                    break;
                }
                case 9: {
                    n4 = 146;
                    break;
                }
                case 10: {
                    n4 = 201;
                    break;
                }
                case 11: {
                    n4 = 250;
                    break;
                }
                case 12: {
                    n4 = 187;
                    break;
                }
                case 13: {
                    n4 = 54;
                    break;
                }
                case 14: {
                    n4 = 72;
                    break;
                }
                case 15: {
                    n4 = 9;
                    break;
                }
                case 16: {
                    n4 = 176;
                    break;
                }
                case 17: {
                    n4 = 208;
                    break;
                }
                case 18: {
                    n4 = 126;
                    break;
                }
                case 19: {
                    n4 = 245;
                    break;
                }
                case 20: {
                    n4 = 221;
                    break;
                }
                case 21: {
                    n4 = 12;
                    break;
                }
                case 22: {
                    n4 = 105;
                    break;
                }
                case 23: {
                    n4 = 232;
                    break;
                }
                case 24: {
                    n4 = 69;
                    break;
                }
                case 25: {
                    n4 = 161;
                    break;
                }
                case 26: {
                    n4 = 174;
                    break;
                }
                case 27: {
                    n4 = 43;
                    break;
                }
                case 28: {
                    n4 = 76;
                    break;
                }
                case 29: {
                    n4 = 125;
                    break;
                }
                case 30: {
                    n4 = 90;
                    break;
                }
                case 31: {
                    n4 = 122;
                    break;
                }
                case 32: {
                    n4 = 85;
                    break;
                }
                case 33: {
                    n4 = 198;
                    break;
                }
                case 34: {
                    n4 = 171;
                    break;
                }
                case 35: {
                    n4 = 160;
                    break;
                }
                case 36: {
                    n4 = 204;
                    break;
                }
                case 37: {
                    n4 = 70;
                    break;
                }
                case 38: {
                    n4 = 82;
                    break;
                }
                case 39: {
                    n4 = 243;
                    break;
                }
                case 40: {
                    n4 = 35;
                    break;
                }
                case 41: {
                    n4 = 103;
                    break;
                }
                case 42: {
                    n4 = 159;
                    break;
                }
                case 43: {
                    n4 = 246;
                    break;
                }
                case 44: {
                    n4 = 61;
                    break;
                }
                case 45: {
                    n4 = 165;
                    break;
                }
                case 46: {
                    n4 = 30;
                    break;
                }
                case 47: {
                    n4 = 127;
                    break;
                }
                case 48: {
                    n4 = 192;
                    break;
                }
                case 49: {
                    n4 = 75;
                    break;
                }
                case 50: {
                    n4 = 57;
                    break;
                }
                case 51: {
                    n4 = 214;
                    break;
                }
                case 52: {
                    n4 = 239;
                    break;
                }
                case 53: {
                    n4 = 8;
                    break;
                }
                case 54: {
                    n4 = 162;
                    break;
                }
                case 55: {
                    n4 = 102;
                    break;
                }
                case 56: {
                    n4 = 177;
                    break;
                }
                case 57: {
                    n4 = 98;
                    break;
                }
                case 58: {
                    n4 = 97;
                    break;
                }
                case 59: {
                    n4 = 33;
                    break;
                }
                case 60: {
                    n4 = 148;
                    break;
                }
                case 61: {
                    n4 = 96;
                    break;
                }
                case 62: {
                    n4 = 152;
                    break;
                }
                case 63: {
                    n4 = 156;
                    break;
                }
                case 64: {
                    n4 = 173;
                    break;
                }
                case 65: {
                    n4 = 116;
                    break;
                }
                case 66: {
                    n4 = 31;
                    break;
                }
                case 67: {
                    n4 = 56;
                    break;
                }
                case 68: {
                    n4 = 39;
                    break;
                }
                case 69: {
                    n4 = 215;
                    break;
                }
                case 70: {
                    n4 = 4;
                    break;
                }
                case 71: {
                    n4 = 252;
                    break;
                }
                case 72: {
                    n4 = 7;
                    break;
                }
                case 73: {
                    n4 = 206;
                    break;
                }
                case 74: {
                    n4 = 153;
                    break;
                }
                case 75: {
                    n4 = 247;
                    break;
                }
                case 76: {
                    n4 = 155;
                    break;
                }
                case 77: {
                    n4 = 140;
                    break;
                }
                case 78: {
                    n4 = 253;
                    break;
                }
                case 79: {
                    n4 = 241;
                    break;
                }
                case 80: {
                    n4 = 141;
                    break;
                }
                case 81: {
                    n4 = 59;
                    break;
                }
                case 82: {
                    n4 = 47;
                    break;
                }
                case 83: {
                    n4 = 118;
                    break;
                }
                case 84: {
                    n4 = 113;
                    break;
                }
                case 85: {
                    n4 = 104;
                    break;
                }
                case 86: {
                    n4 = 249;
                    break;
                }
                case 87: {
                    n4 = 167;
                    break;
                }
                case 88: {
                    n4 = 228;
                    break;
                }
                case 89: {
                    n4 = 225;
                    break;
                }
                case 90: {
                    n4 = 115;
                    break;
                }
                case 91: {
                    n4 = 16;
                    break;
                }
                case 92: {
                    n4 = 21;
                    break;
                }
                case 93: {
                    n4 = 1;
                    break;
                }
                case 94: {
                    n4 = 168;
                    break;
                }
                case 95: {
                    n4 = 143;
                    break;
                }
                case 96: {
                    n4 = 188;
                    break;
                }
                case 97: {
                    n4 = 44;
                    break;
                }
                case 98: {
                    n4 = 91;
                    break;
                }
                case 99: {
                    n4 = 79;
                    break;
                }
                case 100: {
                    n4 = 77;
                    break;
                }
                case 101: {
                    n4 = 244;
                    break;
                }
                case 102: {
                    n4 = 210;
                    break;
                }
                case 103: {
                    n4 = 86;
                    break;
                }
                case 104: {
                    n4 = 196;
                    break;
                }
                case 105: {
                    n4 = 46;
                    break;
                }
                case 106: {
                    n4 = 80;
                    break;
                }
                case 107: {
                    n4 = 150;
                    break;
                }
                case 108: {
                    n4 = 123;
                    break;
                }
                case 109: {
                    n4 = 73;
                    break;
                }
                case 110: {
                    n4 = 41;
                    break;
                }
                case 111: {
                    n4 = 24;
                    break;
                }
                case 112: {
                    n4 = 193;
                    break;
                }
                case 113: {
                    n4 = 117;
                    break;
                }
                case 114: {
                    n4 = 6;
                    break;
                }
                case 115: {
                    n4 = 195;
                    break;
                }
                case 116: {
                    n4 = 62;
                    break;
                }
                case 117: {
                    n4 = 207;
                    break;
                }
                case 118: {
                    n4 = 101;
                    break;
                }
                case 119: {
                    n4 = 10;
                    break;
                }
                case 120: {
                    n4 = 51;
                    break;
                }
                case 121: {
                    n4 = 134;
                    break;
                }
                case 122: {
                    n4 = 124;
                    break;
                }
                case 123: {
                    n4 = 226;
                    break;
                }
                case 124: {
                    n4 = 106;
                    break;
                }
                case 125: {
                    n4 = 50;
                    break;
                }
                case 126: {
                    n4 = 137;
                    break;
                }
                case 127: {
                    n4 = 200;
                    break;
                }
                case 128: {
                    n4 = 100;
                    break;
                }
                case 129: {
                    n4 = 202;
                    break;
                }
                case 130: {
                    n4 = 212;
                    break;
                }
                case 131: {
                    n4 = 251;
                    break;
                }
                case 132: {
                    n4 = 227;
                    break;
                }
                case 133: {
                    n4 = 219;
                    break;
                }
                case 134: {
                    n4 = 34;
                    break;
                }
                case 135: {
                    n4 = 23;
                    break;
                }
                case 136: {
                    n4 = 58;
                    break;
                }
                case 137: {
                    n4 = 230;
                    break;
                }
                case 138: {
                    n4 = 238;
                    break;
                }
                case 139: {
                    n4 = 145;
                    break;
                }
                case 140: {
                    n4 = 223;
                    break;
                }
                case 141: {
                    n4 = 254;
                    break;
                }
                case 142: {
                    n4 = 110;
                    break;
                }
                case 143: {
                    n4 = 36;
                    break;
                }
                case 144: {
                    n4 = 149;
                    break;
                }
                case 145: {
                    n4 = 194;
                    break;
                }
                case 146: {
                    n4 = 158;
                    break;
                }
                case 147: {
                    n4 = 93;
                    break;
                }
                case 148: {
                    n4 = 178;
                    break;
                }
                case 149: {
                    n4 = 63;
                    break;
                }
                case 150: {
                    n4 = 135;
                    break;
                }
                case 151: {
                    n4 = 19;
                    break;
                }
                case 152: {
                    n4 = 142;
                    break;
                }
                case 153: {
                    n4 = 229;
                    break;
                }
                case 154: {
                    n4 = 89;
                    break;
                }
                case 155: {
                    n4 = 40;
                    break;
                }
                case 156: {
                    n4 = 224;
                    break;
                }
                case 157: {
                    n4 = 37;
                    break;
                }
                case 158: {
                    n4 = 20;
                    break;
                }
                case 159: {
                    n4 = 172;
                    break;
                }
                case 160: {
                    n4 = 163;
                    break;
                }
                case 161: {
                    n4 = 14;
                    break;
                }
                case 162: {
                    n4 = 71;
                    break;
                }
                case 163: {
                    n4 = 255;
                    break;
                }
                case 164: {
                    n4 = 107;
                    break;
                }
                case 165: {
                    n4 = 87;
                    break;
                }
                case 166: {
                    n4 = 217;
                    break;
                }
                case 167: {
                    n4 = 234;
                    break;
                }
                case 168: {
                    n4 = 154;
                    break;
                }
                case 169: {
                    n4 = 18;
                    break;
                }
                case 170: {
                    n4 = 169;
                    break;
                }
                case 171: {
                    n4 = 175;
                    break;
                }
                case 172: {
                    n4 = 130;
                    break;
                }
                case 173: {
                    n4 = 166;
                    break;
                }
                case 174: {
                    n4 = 65;
                    break;
                }
                case 175: {
                    n4 = 45;
                    break;
                }
                case 176: {
                    n4 = 48;
                    break;
                }
                case 177: {
                    n4 = 237;
                    break;
                }
                case 178: {
                    n4 = 114;
                    break;
                }
                case 179: {
                    n4 = 38;
                    break;
                }
                case 180: {
                    n4 = 121;
                    break;
                }
                case 181: {
                    n4 = 88;
                    break;
                }
                case 182: {
                    n4 = 185;
                    break;
                }
                case 183: {
                    n4 = 144;
                    break;
                }
                case 184: {
                    n4 = 209;
                    break;
                }
                case 185: {
                    n4 = 231;
                    break;
                }
                case 186: {
                    n4 = 99;
                    break;
                }
                case 187: {
                    n4 = 181;
                    break;
                }
                case 188: {
                    n4 = 197;
                    break;
                }
                case 189: {
                    n4 = 60;
                    break;
                }
                case 190: {
                    n4 = 136;
                    break;
                }
                case 191: {
                    n4 = 67;
                    break;
                }
                case 192: {
                    n4 = 164;
                    break;
                }
                case 193: {
                    n4 = 32;
                    break;
                }
                case 194: {
                    n4 = 27;
                    break;
                }
                case 195: {
                    n4 = 92;
                    break;
                }
                case 196: {
                    n4 = 203;
                    break;
                }
                case 197: {
                    n4 = 190;
                    break;
                }
                case 198: {
                    n4 = 147;
                    break;
                }
                case 199: {
                    n4 = 139;
                    break;
                }
                case 200: {
                    n4 = 81;
                    break;
                }
                case 201: {
                    n4 = 138;
                    break;
                }
                case 202: {
                    n4 = 248;
                    break;
                }
                case 203: {
                    n4 = 180;
                    break;
                }
                case 204: {
                    n4 = 108;
                    break;
                }
                case 205: {
                    n4 = 131;
                    break;
                }
                case 206: {
                    n4 = 186;
                    break;
                }
                case 207: {
                    n4 = 64;
                    break;
                }
                case 208: {
                    n4 = 13;
                    break;
                }
                case 209: {
                    n4 = 5;
                    break;
                }
                case 210: {
                    n4 = 133;
                    break;
                }
                case 211: {
                    n4 = 25;
                    break;
                }
                case 212: {
                    n4 = 28;
                    break;
                }
                case 213: {
                    n4 = 2;
                    break;
                }
                case 214: {
                    n4 = 11;
                    break;
                }
                case 215: {
                    n4 = 95;
                    break;
                }
                case 216: {
                    n4 = 15;
                    break;
                }
                case 217: {
                    n4 = 66;
                    break;
                }
                case 218: {
                    n4 = 235;
                    break;
                }
                case 219: {
                    n4 = 119;
                    break;
                }
                case 220: {
                    n4 = 68;
                    break;
                }
                case 221: {
                    n4 = 111;
                    break;
                }
                case 222: {
                    n4 = 157;
                    break;
                }
                case 223: {
                    n4 = 183;
                    break;
                }
                case 224: {
                    n4 = 17;
                    break;
                }
                case 225: {
                    n4 = 132;
                    break;
                }
                case 226: {
                    n4 = 29;
                    break;
                }
                case 227: {
                    n4 = 189;
                    break;
                }
                case 228: {
                    n4 = 151;
                    break;
                }
                case 229: {
                    n4 = 22;
                    break;
                }
                case 230: {
                    n4 = 120;
                    break;
                }
                case 231: {
                    n4 = 170;
                    break;
                }
                case 232: {
                    n4 = 236;
                    break;
                }
                case 233: {
                    n4 = 53;
                    break;
                }
                case 234: {
                    n4 = 26;
                    break;
                }
                case 235: {
                    n4 = 205;
                    break;
                }
                case 236: {
                    n4 = 94;
                    break;
                }
                case 237: {
                    n4 = 233;
                    break;
                }
                case 238: {
                    n4 = 74;
                    break;
                }
                case 239: {
                    n4 = 182;
                    break;
                }
                case 240: {
                    n4 = 222;
                    break;
                }
                case 241: {
                    n4 = 3;
                    break;
                }
                case 242: {
                    n4 = 213;
                    break;
                }
                case 243: {
                    n4 = 218;
                    break;
                }
                case 244: {
                    n4 = 109;
                    break;
                }
                case 245: {
                    n4 = 112;
                    break;
                }
                case 246: {
                    n4 = 49;
                    break;
                }
                case 247: {
                    n4 = 84;
                    break;
                }
                case 248: {
                    n4 = 216;
                    break;
                }
                case 249: {
                    n4 = 220;
                    break;
                }
                case 250: {
                    n4 = 83;
                    break;
                }
                case 251: {
                    n4 = 184;
                    break;
                }
                case 252: {
                    n4 = 179;
                    break;
                }
                case 253: {
                    n4 = 191;
                    break;
                }
                case 254: {
                    n4 = 242;
                    break;
                }
                default: {
                    n4 = 0;
                }
            }
            int n5 = n4;
            int n6 = (n2 & 0xFF) - n5;
            n6 += 256;
            int n7 = ((n2 & 0xFFFF) >>> 8) - n5;
            n7 += 256;
            int n8 = 0;
            while (n8 < cArray.length) {
                int n9 = n8 % 2;
                int n10 = n8;
                cArray[n10] = (char)(cArray[n10] ^ n6);
                n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n8]) & 0xFF;
                ++n8;
            }
            DungeonHelper.Field3242[n3] = new String(cArray).intern();
        }
        return Field3242[n3];
    }

    private static native /* synthetic */ void Method1658();
}