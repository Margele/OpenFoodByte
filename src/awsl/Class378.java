/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.util.LinkedHashMap
 *  java.util.regex.Pattern
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.inventory.Slot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.C01PacketChatMessage
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.fml.relauncher.ReflectionHelper
 *  org.lwjgl.input.Mouse
 *  trash.foodbyte.utils.RenderUtils
 */
package awsl;

import awsl.Class379;
import awsl.Class391;
import awsl.Class492;
import awsl.Class565;
import awsl.Class628;
import awsl.Class681;
import java.awt.Color;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import native0.Class614;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C01PacketChatMessage;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Mouse;
import trash.foodbyte.irc.PermissionManager;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.module.impl.world.UHCFastCraft;
import trash.foodbyte.reflections.ObfuscatedField;
import trash.foodbyte.reflections.Wrapper;
import trash.foodbyte.utils.MathUtils;
import trash.foodbyte.utils.RenderUtils;

public class Class378
extends Class379 {
    private boolean Field1791;
    public int Field1792;
    private boolean Field1793;
    public ItemStack Field1794;
    private boolean Field1795;
    public int Field1796;
    public LinkedHashMap Field1797;
    public int Field1798;
    private boolean Field1799;
    private static final String[] Field1800;
    public Class391 Field1801;
    final UHCFastCraft Field1802;
    private boolean Field1803;
    private static final String[] Field1804;
    public Class391 Field1805;

    static {
        Class614.Method2232(6, Class378.class);
        Class378.Method484();
    }

    public void Method476() {
        this.Field1797.clear();
        this.Method478(this.Field1797);
        int a2 = 4;
        this.Field1796 = 5;
        this.Field1798 = this.Field1796 * a2;
        this.Field1814 = 82.0f;
        this.Field1815 = a2 * 16 + 16;
    }

    @Override
    public void Method63() {
        String string = Class492.Method2239();
        GlStateManager.disableDepth();
        this.Method450();
        RenderUtils.Method1103((float)this.Field1806, (float)this.Field1807, (float)this.Field1814, (float)this.Field1812, (int)GlobalModule.Field3143.Method2442());
        String a2 = string;
        RenderUtils.Method1103((float)this.Field1806, (float)(this.Field1807 + this.Field1812), (float)this.Field1814, (float)this.Field1815, (int)Field1833.getRGB());
        boolean a3 = !this.Field1823.isEmpty();
        Class565.Field2638.Method1217(this.Field1823, this.Field1806 + this.Field1824, this.Field1807 + this.Field1825, Class681.WHITE.Field2962);
        Class565.Field2636.Method1217(this.Field1816, this.Field1806 + 3.0f + (float)8, this.Field1807 + this.Field1812 / 2.0f - Class565.Field2636.Field2625 / 2.0f, Class681.WHITE.Field2962);
        GlStateManager.enableDepth();
        if (!PermissionManager.canUseFeature(Class378.Method482(16542, -25163))) {
            this.Field1808.fontRendererObj.drawStringWithShadow(Class378.Method482(16601, 24672), this.Field1806 + this.Field1814 / 2.0f - (float)(this.Field1808.fontRendererObj.getStringWidth(Class378.Method482(16609, 12042)) / 2), this.Field1807 + 24.0f + 1.0f, -1);
            this.Field1808.fontRendererObj.drawStringWithShadow(Class378.Method482(16549, 16152), this.Field1806 + this.Field1814 / 2.0f - (float)(this.Field1808.fontRendererObj.getStringWidth(Class378.Method482(16551, -26844)) / 2), this.Field1807 + 36.0f + 1.0f, -1);
            this.Field1808.fontRendererObj.drawStringWithShadow(Class378.Method482(16556, 5550), this.Field1806 + this.Field1814 / 2.0f - (float)(this.Field1808.fontRendererObj.getStringWidth(Class378.Method482(16573, -6685)) / 2), this.Field1807 + 48.0f + 1.0f, -1);
            this.Field1808.fontRendererObj.drawStringWithShadow(Class378.Method482(16631, 12546), this.Field1806 + this.Field1814 / 2.0f - (float)(this.Field1808.fontRendererObj.getStringWidth(Class378.Method482(16550, -24143)) / 2), this.Field1807 + 60.0f + 1.0f, -1);
            return;
        }
        int a4 = 13;
        int a5 = (int)((this.Field1814 - (float)(this.Field1796 * 16 + 3)) / 2.0f);
        int a6 = this.Field1792 / this.Field1798;
        int a7 = new Color(255, 150, 200, 255).getRGB();
        int a8 = (int)Math.ceil((double)(this.Field1797.size() / this.Field1798)) + 1;
        int a9 = 16;
        this.Field1794 = null;
        if (this.Field1797.size() > 0) {
            RenderHelper.enableGUIStandardItemLighting();
            int a10 = Math.min((int)(this.Field1797.size() - 1), (int)(a6 * this.Field1798));
            if (a10 < Math.min((int)this.Field1797.size(), (int)((a6 + 1) * this.Field1798))) {
                int a11 = (int)(this.Field1806 + 1.0f + (float)a5 + (float)(a9 * (a10 % this.Field1796)));
                int a12 = (int)(this.Field1807 + (float)a4 + (float)(a9 * (a10 % this.Field1798 / this.Field1796)));
                ItemStack a13 = (ItemStack)this.Field1797.keySet().toArray()[a10];
                if (UHCFastCraft.Method2118(this.Field1802) > a11 && UHCFastCraft.Method2118(this.Field1802) < a11 + 16 && UHCFastCraft.Method2119(this.Field1802) > a12 && UHCFastCraft.Method2119(this.Field1802) < a12 + a9) {
                    RenderUtils.Method1103((float)a11, (float)a12, (float)a9, (float)a9, (int)new Color(150, 150, 150, 150).getRGB());
                    this.Field1794 = a13;
                }
                this.Field1808.getRenderItem().renderItemAndEffectIntoGUI(a13, a11, a12);
                this.Field1808.getRenderItem().renderItemOverlays(this.Field1808.fontRendererObj, a13, a11, a12);
                ++a10;
            }
            RenderHelper.disableStandardItemLighting();
        }
        GlStateManager.disableDepth();
        float a14 = this.Field1801.Method1295() + this.Field1801.Method1297() / 2.0f - 2.0f;
        float a15 = this.Field1801.Method1296() + this.Field1801.Method1298() / 2.0f;
        this.Field1801 = new Class391(this.Field1806 + 2.0f, this.Field1807 + this.Field1815 - 2.0f, 12.0f, 12.0f);
        RenderUtils.Method1103((float)this.Field1801.Method1295(), (float)this.Field1801.Method1296(), (float)this.Field1801.Method1297(), (float)this.Field1801.Method1298(), (int)(this.Field1791 ? Class681.Method2699(GlobalModule.Field3143.Method2442(), 15) : GlobalModule.Field3143.Method2442()));
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)a14, (float)a15, (float)0.0f);
        GlStateManager.rotate((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        RenderUtils.Method1085((double)-3.0, (double)-3.0, (double)1.0, (double)0.0, (float)1.0f, (int)-1);
        RenderUtils.Method1085((double)-3.0, (double)3.0, (double)1.0, (double)0.0, (float)1.0f, (int)-1);
        GlStateManager.translate((float)(-a14), (float)(-a15), (float)0.0f);
        GlStateManager.popMatrix();
        this.Field1805 = new Class391(this.Field1806 + this.Field1814 - 14.0f, this.Field1807 + this.Field1815 - 2.0f, 12.0f, 12.0f);
        RenderUtils.Method1103((float)this.Field1805.Method1295(), (float)this.Field1805.Method1296(), (float)this.Field1805.Method1297(), (float)this.Field1805.Method1298(), (int)(this.Field1803 ? Class681.Method2699(GlobalModule.Field3143.Method2442(), 15) : GlobalModule.Field3143.Method2442()));
        a14 = this.Field1805.Method1295() + this.Field1805.Method1297() / 2.0f + 2.0f;
        a15 = this.Field1805.Method1296() + this.Field1805.Method1298() / 2.0f;
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)a14, (float)a15, (float)0.0f);
        GlStateManager.rotate((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        RenderUtils.Method1085((double)-3.0, (double)-3.0, (double)1.0, (double)0.0, (float)1.0f, (int)-1);
        RenderUtils.Method1085((double)-3.0, (double)3.0, (double)1.0, (double)0.0, (float)1.0f, (int)-1);
        GlStateManager.translate((float)(-a14), (float)(-a15), (float)0.0f);
        GlStateManager.popMatrix();
        String a16 = a6 + 1 + "/" + ((this.Field1797.size() - 1) / this.Field1798 + 1);
        this.Field1808.fontRendererObj.drawStringWithShadow(a16, this.Field1806 + this.Field1814 / 2.0f - (float)(this.Field1808.fontRendererObj.getStringWidth(a16) / 2), this.Field1807 + this.Field1815 + 1.0f, -1);
        GlStateManager.enableDepth();
    }

    private static Exception Method477(Exception exception) {
        return exception;
    }

    @Class628
    public native void Method478(LinkedHashMap var1);

    public Class378(UHCFastCraft a2, float a3, float a4, float a5, float a6, float a7, float a8, float a9) {
        this.Field1802 = a2;
        super(Class378.Method482(16562, -8555), a3, a4, a5, a6, Class378.Method482(16621, 29981), "Y", a7, a8, a9);
        this.Field1797 = new LinkedHashMap();
        this.Field1794 = null;
        this.Field1801 = new Class391();
        this.Field1805 = new Class391();
        this.Field1792 = 0;
        this.Method476();
    }

    @Override
    public void Method64(int a2, int a3) {
        super.Method64(a2, a3);
    }

    public void Method479(int a2, int a3, boolean a4) {
        if (this.Field1795 && Mouse.isCreated()) {
            while (Mouse.next()) {
                int a5 = Mouse.getEventDWheel();
                int a6 = this.Field1792 / this.Field1798;
                this.Field1792 = Math.max((int)0, (int)((a6 - 1) * this.Field1798));
            }
        }
    }

    public void Method480(int a2, int a3, boolean a4) {
        this.Field1795 = this.Method459(a2, a3);
        this.Field1791 = MathUtils.Method550(a2, a3, this.Field1801) && this.Field1795;
        this.Field1803 = MathUtils.Method550(a2, a3, this.Field1805) && this.Field1795;
        if (!this.Field1793 && Mouse.isButtonDown((int)0)) {
            if (this.Field1794 != null) {
                Wrapper.INSTANCE.sendPacketNoEvent((Packet)new C01PacketChatMessage((String)this.Field1797.get((Object)this.Field1794)));
            }
            int a5 = this.Field1792 / this.Field1798;
            if (this.Field1791) {
                this.Field1792 = Math.max((int)0, (int)((a5 - 1) * this.Field1798));
            }
            if (this.Field1803) {
                this.Field1792 = Math.min((int)(this.Field1797.size() - 1), (int)((a5 + 1) * this.Field1798));
            }
        }
        this.Field1793 = a4;
    }

    @Override
    public boolean Method456(int a2, int a3, boolean a4) {
        boolean a5;
        boolean bl = false;
        String a6 = Class492.Method2239();
        if (this.Method458(a2, a3)) {
            if (!this.Field1793) {
                a5 = true;
            }
            boolean a7 = RenderUtils.Method1096((float)a2, (float)a3, (float)this.Field1806, (float)this.Field1807, (float)(this.Field1806 + this.Field1814), (float)(this.Field1807 + this.Field1812));
            boolean a8 = RenderUtils.Method1096((float)a2, (float)a3, (float)(this.Field1806 + this.Field1814 - 8.0f), (float)(this.Field1807 + this.Field1812 + this.Field1815 - 8.0f), (float)(this.Field1806 + this.Field1814), (float)(this.Field1807 + this.Field1812 + this.Field1815));
            if (!this.Field1793) {
                this.Field1811 = true;
                this.Field1827 = System.currentTimeMillis();
                this.Field1809 = (float)a2 - this.Field1806;
                this.Field1810 = (float)a3 - this.Field1807;
            }
            this.Field1811 = false;
            if (this.Field1817 && !this.Field1793) {
                this.Field1822 = true;
                this.Field1827 = System.currentTimeMillis();
                this.Field1809 = a2;
                this.Field1810 = a3;
            }
            this.Field1822 = false;
            this.Method480(a2, a3, a4);
        }
        if (this.Field1811) {
            this.Field1811 = false;
        }
        if (this.Field1822) {
            this.Field1822 = false;
        }
        this.Method457();
        this.Field1793 = a4;
        return a5;
    }

    public ItemStack Method481(String a2) {
        block3: {
            try {
                Item a3;
                a2 = a2.replace('&', '\u00a7');
                Item a4 = a3 = new Item();
                String[] a5 = null;
                boolean a6 = true;
                boolean a7 = false;
                int a8 = 0;
                if (a8 > Math.min((int)12, (int)(a2.length() - 2))) break block3;
                a5 = a2.substring(a8).split(Pattern.quote((String)" "));
                ResourceLocation a9 = new ResourceLocation(a5[0]);
                a3 = (Item)Item.itemRegistry.getObject((Object)a9);
            }
            catch (Exception a10) {
                a10.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static String Method482(int n, int n2) {
        int n3 = (n ^ 0x40D1) & 0xFFFF;
        if (Field1800[n3] == null) {
            int n4;
            char[] cArray = Field1804[n3].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n4 = 246;
                    break;
                }
                case 1: {
                    n4 = 207;
                    break;
                }
                case 2: {
                    n4 = 60;
                    break;
                }
                case 3: {
                    n4 = 196;
                    break;
                }
                case 4: {
                    n4 = 20;
                    break;
                }
                case 5: {
                    n4 = 135;
                    break;
                }
                case 6: {
                    n4 = 64;
                    break;
                }
                case 7: {
                    n4 = 72;
                    break;
                }
                case 8: {
                    n4 = 245;
                    break;
                }
                case 9: {
                    n4 = 169;
                    break;
                }
                case 10: {
                    n4 = 239;
                    break;
                }
                case 11: {
                    n4 = 118;
                    break;
                }
                case 12: {
                    n4 = 208;
                    break;
                }
                case 13: {
                    n4 = 139;
                    break;
                }
                case 14: {
                    n4 = 144;
                    break;
                }
                case 15: {
                    n4 = 22;
                    break;
                }
                case 16: {
                    n4 = 193;
                    break;
                }
                case 17: {
                    n4 = 81;
                    break;
                }
                case 18: {
                    n4 = 234;
                    break;
                }
                case 19: {
                    n4 = 102;
                    break;
                }
                case 20: {
                    n4 = 216;
                    break;
                }
                case 21: {
                    n4 = 166;
                    break;
                }
                case 22: {
                    n4 = 28;
                    break;
                }
                case 23: {
                    n4 = 111;
                    break;
                }
                case 24: {
                    n4 = 26;
                    break;
                }
                case 25: {
                    n4 = 253;
                    break;
                }
                case 26: {
                    n4 = 127;
                    break;
                }
                case 27: {
                    n4 = 162;
                    break;
                }
                case 28: {
                    n4 = 40;
                    break;
                }
                case 29: {
                    n4 = 15;
                    break;
                }
                case 30: {
                    n4 = 188;
                    break;
                }
                case 31: {
                    n4 = 57;
                    break;
                }
                case 32: {
                    n4 = 31;
                    break;
                }
                case 33: {
                    n4 = 88;
                    break;
                }
                case 34: {
                    n4 = 70;
                    break;
                }
                case 35: {
                    n4 = 156;
                    break;
                }
                case 36: {
                    n4 = 178;
                    break;
                }
                case 37: {
                    n4 = 125;
                    break;
                }
                case 38: {
                    n4 = 33;
                    break;
                }
                case 39: {
                    n4 = 251;
                    break;
                }
                case 40: {
                    n4 = 186;
                    break;
                }
                case 41: {
                    n4 = 117;
                    break;
                }
                case 42: {
                    n4 = 247;
                    break;
                }
                case 43: {
                    n4 = 54;
                    break;
                }
                case 44: {
                    n4 = 38;
                    break;
                }
                case 45: {
                    n4 = 179;
                    break;
                }
                case 46: {
                    n4 = 218;
                    break;
                }
                case 47: {
                    n4 = 96;
                    break;
                }
                case 48: {
                    n4 = 250;
                    break;
                }
                case 49: {
                    n4 = 171;
                    break;
                }
                case 50: {
                    n4 = 158;
                    break;
                }
                case 51: {
                    n4 = 152;
                    break;
                }
                case 52: {
                    n4 = 0;
                    break;
                }
                case 53: {
                    n4 = 17;
                    break;
                }
                case 54: {
                    n4 = 180;
                    break;
                }
                case 55: {
                    n4 = 119;
                    break;
                }
                case 56: {
                    n4 = 129;
                    break;
                }
                case 57: {
                    n4 = 47;
                    break;
                }
                case 58: {
                    n4 = 192;
                    break;
                }
                case 59: {
                    n4 = 45;
                    break;
                }
                case 60: {
                    n4 = 191;
                    break;
                }
                case 61: {
                    n4 = 50;
                    break;
                }
                case 62: {
                    n4 = 184;
                    break;
                }
                case 63: {
                    n4 = 198;
                    break;
                }
                case 64: {
                    n4 = 172;
                    break;
                }
                case 65: {
                    n4 = 95;
                    break;
                }
                case 66: {
                    n4 = 138;
                    break;
                }
                case 67: {
                    n4 = 202;
                    break;
                }
                case 68: {
                    n4 = 80;
                    break;
                }
                case 69: {
                    n4 = 164;
                    break;
                }
                case 70: {
                    n4 = 79;
                    break;
                }
                case 71: {
                    n4 = 39;
                    break;
                }
                case 72: {
                    n4 = 242;
                    break;
                }
                case 73: {
                    n4 = 211;
                    break;
                }
                case 74: {
                    n4 = 237;
                    break;
                }
                case 75: {
                    n4 = 249;
                    break;
                }
                case 76: {
                    n4 = 104;
                    break;
                }
                case 77: {
                    n4 = 140;
                    break;
                }
                case 78: {
                    n4 = 86;
                    break;
                }
                case 79: {
                    n4 = 244;
                    break;
                }
                case 80: {
                    n4 = 36;
                    break;
                }
                case 81: {
                    n4 = 201;
                    break;
                }
                case 82: {
                    n4 = 233;
                    break;
                }
                case 83: {
                    n4 = 11;
                    break;
                }
                case 84: {
                    n4 = 66;
                    break;
                }
                case 85: {
                    n4 = 101;
                    break;
                }
                case 86: {
                    n4 = 69;
                    break;
                }
                case 87: {
                    n4 = 19;
                    break;
                }
                case 88: {
                    n4 = 170;
                    break;
                }
                case 89: {
                    n4 = 252;
                    break;
                }
                case 90: {
                    n4 = 219;
                    break;
                }
                case 91: {
                    n4 = 3;
                    break;
                }
                case 92: {
                    n4 = 168;
                    break;
                }
                case 93: {
                    n4 = 53;
                    break;
                }
                case 94: {
                    n4 = 243;
                    break;
                }
                case 95: {
                    n4 = 6;
                    break;
                }
                case 96: {
                    n4 = 62;
                    break;
                }
                case 97: {
                    n4 = 124;
                    break;
                }
                case 98: {
                    n4 = 217;
                    break;
                }
                case 99: {
                    n4 = 143;
                    break;
                }
                case 100: {
                    n4 = 7;
                    break;
                }
                case 101: {
                    n4 = 67;
                    break;
                }
                case 102: {
                    n4 = 210;
                    break;
                }
                case 103: {
                    n4 = 4;
                    break;
                }
                case 104: {
                    n4 = 1;
                    break;
                }
                case 105: {
                    n4 = 94;
                    break;
                }
                case 106: {
                    n4 = 222;
                    break;
                }
                case 107: {
                    n4 = 150;
                    break;
                }
                case 108: {
                    n4 = 189;
                    break;
                }
                case 109: {
                    n4 = 236;
                    break;
                }
                case 110: {
                    n4 = 204;
                    break;
                }
                case 111: {
                    n4 = 209;
                    break;
                }
                case 112: {
                    n4 = 205;
                    break;
                }
                case 113: {
                    n4 = 206;
                    break;
                }
                case 114: {
                    n4 = 116;
                    break;
                }
                case 115: {
                    n4 = 159;
                    break;
                }
                case 116: {
                    n4 = 74;
                    break;
                }
                case 117: {
                    n4 = 136;
                    break;
                }
                case 118: {
                    n4 = 137;
                    break;
                }
                case 119: {
                    n4 = 130;
                    break;
                }
                case 120: {
                    n4 = 9;
                    break;
                }
                case 121: {
                    n4 = 18;
                    break;
                }
                case 122: {
                    n4 = 13;
                    break;
                }
                case 123: {
                    n4 = 91;
                    break;
                }
                case 124: {
                    n4 = 240;
                    break;
                }
                case 125: {
                    n4 = 14;
                    break;
                }
                case 126: {
                    n4 = 212;
                    break;
                }
                case 127: {
                    n4 = 215;
                    break;
                }
                case 128: {
                    n4 = 194;
                    break;
                }
                case 129: {
                    n4 = 2;
                    break;
                }
                case 130: {
                    n4 = 113;
                    break;
                }
                case 131: {
                    n4 = 165;
                    break;
                }
                case 132: {
                    n4 = 90;
                    break;
                }
                case 133: {
                    n4 = 224;
                    break;
                }
                case 134: {
                    n4 = 229;
                    break;
                }
                case 135: {
                    n4 = 30;
                    break;
                }
                case 136: {
                    n4 = 155;
                    break;
                }
                case 137: {
                    n4 = 160;
                    break;
                }
                case 138: {
                    n4 = 12;
                    break;
                }
                case 139: {
                    n4 = 56;
                    break;
                }
                case 140: {
                    n4 = 84;
                    break;
                }
                case 141: {
                    n4 = 133;
                    break;
                }
                case 142: {
                    n4 = 105;
                    break;
                }
                case 143: {
                    n4 = 226;
                    break;
                }
                case 144: {
                    n4 = 203;
                    break;
                }
                case 145: {
                    n4 = 181;
                    break;
                }
                case 146: {
                    n4 = 103;
                    break;
                }
                case 147: {
                    n4 = 149;
                    break;
                }
                case 148: {
                    n4 = 32;
                    break;
                }
                case 149: {
                    n4 = 108;
                    break;
                }
                case 150: {
                    n4 = 35;
                    break;
                }
                case 151: {
                    n4 = 29;
                    break;
                }
                case 152: {
                    n4 = 227;
                    break;
                }
                case 153: {
                    n4 = 61;
                    break;
                }
                case 154: {
                    n4 = 16;
                    break;
                }
                case 155: {
                    n4 = 142;
                    break;
                }
                case 156: {
                    n4 = 49;
                    break;
                }
                case 157: {
                    n4 = 128;
                    break;
                }
                case 158: {
                    n4 = 174;
                    break;
                }
                case 159: {
                    n4 = 187;
                    break;
                }
                case 160: {
                    n4 = 73;
                    break;
                }
                case 161: {
                    n4 = 85;
                    break;
                }
                case 162: {
                    n4 = 5;
                    break;
                }
                case 163: {
                    n4 = 97;
                    break;
                }
                case 164: {
                    n4 = 25;
                    break;
                }
                case 165: {
                    n4 = 161;
                    break;
                }
                case 166: {
                    n4 = 83;
                    break;
                }
                case 167: {
                    n4 = 235;
                    break;
                }
                case 168: {
                    n4 = 157;
                    break;
                }
                case 169: {
                    n4 = 112;
                    break;
                }
                case 170: {
                    n4 = 100;
                    break;
                }
                case 171: {
                    n4 = 59;
                    break;
                }
                case 172: {
                    n4 = 151;
                    break;
                }
                case 173: {
                    n4 = 254;
                    break;
                }
                case 174: {
                    n4 = 87;
                    break;
                }
                case 175: {
                    n4 = 146;
                    break;
                }
                case 176: {
                    n4 = 8;
                    break;
                }
                case 177: {
                    n4 = 213;
                    break;
                }
                case 178: {
                    n4 = 200;
                    break;
                }
                case 179: {
                    n4 = 10;
                    break;
                }
                case 180: {
                    n4 = 115;
                    break;
                }
                case 181: {
                    n4 = 89;
                    break;
                }
                case 182: {
                    n4 = 175;
                    break;
                }
                case 183: {
                    n4 = 241;
                    break;
                }
                case 184: {
                    n4 = 231;
                    break;
                }
                case 185: {
                    n4 = 114;
                    break;
                }
                case 186: {
                    n4 = 163;
                    break;
                }
                case 187: {
                    n4 = 199;
                    break;
                }
                case 188: {
                    n4 = 37;
                    break;
                }
                case 189: {
                    n4 = 42;
                    break;
                }
                case 190: {
                    n4 = 132;
                    break;
                }
                case 191: {
                    n4 = 48;
                    break;
                }
                case 192: {
                    n4 = 232;
                    break;
                }
                case 193: {
                    n4 = 93;
                    break;
                }
                case 194: {
                    n4 = 238;
                    break;
                }
                case 195: {
                    n4 = 145;
                    break;
                }
                case 196: {
                    n4 = 134;
                    break;
                }
                case 197: {
                    n4 = 65;
                    break;
                }
                case 198: {
                    n4 = 71;
                    break;
                }
                case 199: {
                    n4 = 167;
                    break;
                }
                case 200: {
                    n4 = 55;
                    break;
                }
                case 201: {
                    n4 = 82;
                    break;
                }
                case 202: {
                    n4 = 76;
                    break;
                }
                case 203: {
                    n4 = 221;
                    break;
                }
                case 204: {
                    n4 = 34;
                    break;
                }
                case 205: {
                    n4 = 147;
                    break;
                }
                case 206: {
                    n4 = 123;
                    break;
                }
                case 207: {
                    n4 = 197;
                    break;
                }
                case 208: {
                    n4 = 109;
                    break;
                }
                case 209: {
                    n4 = 63;
                    break;
                }
                case 210: {
                    n4 = 110;
                    break;
                }
                case 211: {
                    n4 = 68;
                    break;
                }
                case 212: {
                    n4 = 154;
                    break;
                }
                case 213: {
                    n4 = 41;
                    break;
                }
                case 214: {
                    n4 = 190;
                    break;
                }
                case 215: {
                    n4 = 92;
                    break;
                }
                case 216: {
                    n4 = 75;
                    break;
                }
                case 217: {
                    n4 = 177;
                    break;
                }
                case 218: {
                    n4 = 173;
                    break;
                }
                case 219: {
                    n4 = 23;
                    break;
                }
                case 220: {
                    n4 = 58;
                    break;
                }
                case 221: {
                    n4 = 141;
                    break;
                }
                case 222: {
                    n4 = 126;
                    break;
                }
                case 223: {
                    n4 = 24;
                    break;
                }
                case 224: {
                    n4 = 21;
                    break;
                }
                case 225: {
                    n4 = 185;
                    break;
                }
                case 226: {
                    n4 = 106;
                    break;
                }
                case 227: {
                    n4 = 225;
                    break;
                }
                case 228: {
                    n4 = 98;
                    break;
                }
                case 229: {
                    n4 = 121;
                    break;
                }
                case 230: {
                    n4 = 195;
                    break;
                }
                case 231: {
                    n4 = 248;
                    break;
                }
                case 232: {
                    n4 = 120;
                    break;
                }
                case 233: {
                    n4 = 43;
                    break;
                }
                case 234: {
                    n4 = 27;
                    break;
                }
                case 235: {
                    n4 = 44;
                    break;
                }
                case 236: {
                    n4 = 51;
                    break;
                }
                case 237: {
                    n4 = 77;
                    break;
                }
                case 238: {
                    n4 = 148;
                    break;
                }
                case 239: {
                    n4 = 230;
                    break;
                }
                case 240: {
                    n4 = 153;
                    break;
                }
                case 241: {
                    n4 = 52;
                    break;
                }
                case 242: {
                    n4 = 122;
                    break;
                }
                case 243: {
                    n4 = 182;
                    break;
                }
                case 244: {
                    n4 = 223;
                    break;
                }
                case 245: {
                    n4 = 214;
                    break;
                }
                case 246: {
                    n4 = 255;
                    break;
                }
                case 247: {
                    n4 = 78;
                    break;
                }
                case 248: {
                    n4 = 107;
                    break;
                }
                case 249: {
                    n4 = 99;
                    break;
                }
                case 250: {
                    n4 = 183;
                    break;
                }
                case 251: {
                    n4 = 176;
                    break;
                }
                case 252: {
                    n4 = 131;
                    break;
                }
                case 253: {
                    n4 = 46;
                    break;
                }
                case 254: {
                    n4 = 220;
                    break;
                }
                default: {
                    n4 = 228;
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
            Class378.Field1800[n3] = new String(cArray).intern();
        }
        return Field1800[n3];
    }

    public Slot Method483(GuiContainer a2) {
        Slot a3 = null;
        try {
            a3 = (Slot)ReflectionHelper.findField(GuiContainer.class, (String[])new String[]{ObfuscatedField.theSlot.getObfuscatedName()}).get((Object)a2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return a3;
    }

    @Override
    public void Method457() {
        this.Field1795 = false;
        this.Field1791 = false;
        this.Field1803 = false;
        this.Field1793 = false;
    }

    private static native /* synthetic */ void Method484();
}