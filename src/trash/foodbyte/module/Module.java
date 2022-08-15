/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.Objects
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.EnumChatFormatting
 */
package trash.foodbyte.module;

import awsl.Class322;
import awsl.Class446;
import awsl.Class447;
import awsl.Class91;
import eventapi.EventManager;
import java.util.Iterator;
import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;
import trash.foodbyte.module.Category;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.notification.Notification;
import trash.foodbyte.notification.Types;
import trash.foodbyte.utils.Wrapper;

public class Module {
    public static Minecraft mc;
    public boolean Field2646;
    public boolean hide;
    public boolean isHideModule;
    public boolean use;
    private Category Field2650;
    private String name;
    private String displayName;
    private int Field2653;
    public String Field2654;
    public String description;
    private boolean state;
    private double Field2657;
    private double Field2658;
    private Class322 Field2659;
    private Class322 Field2660;
    private static int[] Field2661;

    public Module(String name, String displayName, Category category) {
        this.Field2654 = "";
        this.description = "unknown";
        mc = Minecraft.getMinecraft();
        this.name = name;
        this.displayName = displayName;
        this.Field2653 = 0;
        this.Field2650 = category;
        this.Field2659 = new Class322();
        this.Field2660 = new Class322();
    }

    public Module(String a, Category category) {
        int[] nArray = Module.Method1041();
        int[] nArray2 = nArray;
        this.Field2654 = "";
        this.description = "unknown";
        mc = Minecraft.getMinecraft();
        this.name = a;
        this.displayName = a;
        this.Field2653 = 0;
        this.Field2650 = category;
        this.Field2659 = new Class322();
        this.Field2660 = new Class322();
        if (Class91.Method3648() == null) {
            Module.Method1040(new int[4]);
        }
    }

    public String Method1016() {
        return this.Field2654;
    }

    public void setDisplayTag(String a) {
        String a2 = a;
        int[] a3 = Module.Method1041();
        if (a2.isEmpty()) {
            this.Field2654 = a2;
        }
        this.Field2654 = String.format((String)" %s", (Object[])new Object[]{EnumChatFormatting.GRAY + a});
    }

    public String getDescription() {
        return this.description;
    }

    public boolean canUse() {
        return this.use;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public int Method1020() {
        return this.Field2653;
    }

    public void Method1021(int a) {
        this.Field2653 = a;
    }

    public void setHideModule(boolean isHide) {
        this.isHideModule = isHide;
    }

    public String Method1023() {
        return this.displayName;
    }

    public Category Method1024() {
        return this.Field2650;
    }

    public boolean getState() {
        return this.state;
    }

    public boolean Method1026() {
        return Wrapper.INSTANCE.Method2871();
    }

    public void onDisable() {
    }

    public void onEnable() {
    }

    public void Method279() {
    }

    public void toggle() {
        block6: {
            block7: {
                int[] nArray = Module.Method1041();
                if (!Objects.nonNull((Object)Module.mc.theWorld) || this.Field2646) break block6;
                if (!this.state) break block7;
                if (GlobalModule.toggleSound.getValue()) {
                    Module.mc.thePlayer.playSound("mod.on", 1.0f, 1.0f);
                }
                if (!GlobalModule.toggleNotification.getValue()) break block6;
                GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("\u00a73Module", this.name + " \u00a7aEnabled", Types.SUCCESS));
            }
            if (GlobalModule.toggleSound.getValue()) {
                Module.mc.thePlayer.playSound("mod.off", 1.0f, 1.0f);
            }
            if (GlobalModule.toggleNotification.getValue()) {
                GlobalModule.INSTANCE.getNotificationManager().addNotification(new Notification("\u00a73Module", this.name + " \u00a7cDisable", Types.ERROR));
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Method1028() {
        boolean bl;
        Module module;
        try {
            module = this;
            bl = !this.getState();
        }
        catch (Exception a) {
            a.printStackTrace();
            return;
        }
        {
            module.setState(bl);
            return;
        }
    }

    public void setState(boolean state) {
        this.setState(state, false);
        if (Objects.nonNull((Object)GlobalModule.INSTANCE.fileManager)) {
            GlobalModule.INSTANCE.fileManager.saveMods();
        }
    }

    public void setState(boolean a, boolean a2) {
        int[] a3 = Module.Method1041();
        if (this.canUse()) {
            return;
        }
        this.state = a;
        this.toggle();
        this.Field2659.Method1192(0.0);
        this.Field2660.Method1192(0.0);
        EventManager.register(this);
        try {
            this.onEnable();
        }
        catch (Exception a4) {
            a4.printStackTrace();
            EventManager.unregister(this);
            try {
                this.Method279();
            }
            catch (Exception a5) {
                a5.printStackTrace();
            }
        }
        GlobalModule.INSTANCE.fileManager.saveMods();
    }

    public boolean Method1031() {
        Iterator iterator = Class446.Method2764().Method1383();
        while (iterator.Method932()) {
            Class447 a = (Class447)iterator.Method933();
            String a2 = a.Method2755();
            if (!a2.equalsIgnoreCase(this.getName())) continue;
            return true;
        }
        return false;
    }

    public boolean Method1032() {
        return this.hide;
    }

    public void Method1033(boolean a) {
        this.hide = a;
    }

    public void Method1034(double a) {
        this.Field2657 = a;
    }

    public void Method1035(double a) {
        this.Field2658 = a;
    }

    public double Method1036() {
        return this.Field2657;
    }

    public double Method1037() {
        return this.Field2658;
    }

    public Class322 Method1038() {
        return this.Field2659;
    }

    public Class322 Method1039() {
        return this.Field2660;
    }

    static {
        Module.Method1040(new int[4]);
        mc = Wrapper.INSTANCE.Method2868();
    }

    public static void Method1040(int[] nArray) {
        Field2661 = nArray;
    }

    public static int[] Method1041() {
        return Field2661;
    }

    private static Exception Method1042(Exception exception) {
        return exception;
    }
}