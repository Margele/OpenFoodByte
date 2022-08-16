/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  net.minecraft.block.Block
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.MathHelper
 *  net.minecraft.util.Vec3
 */
package awsl;

import awsl.Class210;
import awsl.Class220;
import awsl.Class659;
import awsl.Class670;
import awsl.Class685;
import awsl.Class703;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import trash.foodbyte.utils.ChatUtils;
import trash.foodbyte.utils.PlayerUtils;

public class Class221 {
    private final ArrayList Field1220 = new ArrayList();
    private Vec3 Field1221 = new Vec3(0.0, 0.0, 0.0);
    private Class210 Field1222;
    private boolean Field1223;
    private float Field1224;
    private float Field1225;
    private float Field1226;
    private double Field1227;
    private double Field1228;
    private double Field1229;
    private double Field1230;
    private final ArrayList Field1231 = new Class703(this);
    private Class670 Field1232;
    private Class659 Field1233;
    private static String[] Field1234;

    public ArrayList Method2151(Vec3 a, Vec3 a2, boolean a3, Class670 a4, Class659 a5) {
        this.Field1221 = a2;
        this.Field1233 = a5;
        this.Field1223 = false;
        this.Field1222 = null;
        this.Field1232 = a4;
        this.Field1224 = (float)((double)MathHelper.floor_double((double)a.xCoord) + 0.5);
        this.Field1225 = MathHelper.floor_double((double)a.yCoord);
        this.Field1226 = (float)((double)MathHelper.floor_double((double)a.zCoord) + 0.5);
        this.Field1220.clear();
        this.Field1220.Method2530((Object)new Class210(new Class685(this), this.Field1221, a4));
        long a6 = System.nanoTime() / 1000000L;
        long a7 = System.currentTimeMillis();
        int a8 = 0;
        while (!this.Field1223) {
            this.Field1228 = this.Field1227;
            this.Field1227 = this.Method2155();
            this.Field1229 = this.Field1228 - this.Field1227;
            this.Field1230 = this.Field1229 == 1.0 ? (this.Field1230 += 1.0) : 0.0;
            if (++a8 > 5000) {
                return null;
            }
            this.Method2153();
            if (System.nanoTime() / 1000000L - a6 <= 1000L) continue;
            return null;
        }
        this.Field1220.clear();
        this.Method2152();
        return this.Field1222.Method2523();
    }

    private void Method2152() {
        Vec3 a = null;
        Vec3 a2 = null;
        ArrayList a3 = new ArrayList((Collection)this.Field1222.Method2523());
        int a4 = 0;
        Iterator iterator = a3.Method1383();
        while (iterator.Method932()) {
            Vec3 a5 = (Vec3)iterator.Method933();
            Vec3 a6 = a2;
            a2 = new Vec3(a.xCoord - a5.xCoord, a.yCoord - a5.yCoord, a.zCoord - a5.zCoord);
            if (this.Method2159(a6, a2) && a4 < 6) {
                this.Field1222.Method2523().remove((Object)a);
                ++a4;
                a = a5;
                continue;
            }
            a4 = 0;
            a = a5;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void Method2153() {
        Class210 a;
        Iterator iterator;
        void a2;
        ArrayList arrayList = new ArrayList((Collection)this.Field1220);
        double a3 = this.Method2154() / (double)this.Field1220.Method1799();
        String[] a4 = Class221.Method2164();
        if (this.Field1229 < 0.0) {
            a3 += a3 / 2.0;
        }
        int a5 = 0;
        switch (Class220.Field1219[this.Field1233.ordinal()]) {
            case 1: {
                a5 = 100;
            }
            case 2: {
                a5 = 3;
            }
        }
        if (this.Field1230 >= (double)a5) {
            a3 -= a3 / 2.0;
            iterator = a2.Method1383();
            if (iterator.Method932()) {
                a = (Class210)iterator.Method933();
                if (a.Method2524() != this.Field1227) {
                    this.Field1220.remove((Object)a);
                }
            }
        }
        if ((iterator = a2.Method1383()).Method932()) {
            a = (Class210)iterator.Method933();
            if (a.Method2524() > a3) {
            }
            ArrayList a6 = a.Method2523();
            Vec3 a7 = (Vec3)a6.get(a6.Method1799() - 1);
            a.Method2525(false);
            int a8 = -1;
            if (a8 <= 1) {
                this.Method2156(a8, 0, 0, a6, a7, a);
                a8 += 2;
            }
            if ((a8 = -1) <= 1) {
                this.Method2156(0, a8, 0, a6, a7, a);
                a8 += 2;
            }
            if ((a8 = -1) <= 1) {
                this.Method2156(0, 0, a8, a6, a7, a);
                a8 += 2;
            }
            if (!a.Method2526()) {
                this.Field1220.remove((Object)a);
            }
        }
    }

    private double Method2154() {
        double a = 0.0;
        Iterator iterator = this.Field1220.Method1383();
        while (iterator.Method932()) {
            Class210 a2 = (Class210)iterator.Method933();
            a += a2.Method2524();
        }
        return a;
    }

    private double Method2155() {
        double a = Double.MAX_VALUE;
        Iterator iterator = this.Field1220.Method1383();
        while (iterator.Method932()) {
            Class210 a2 = (Class210)iterator.Method933();
            if (!(a2.Method2524() < a)) continue;
            a = a2.Method2524();
        }
        return a;
    }

    private void Method2156(int a, int a2, int a3, ArrayList a4, Vec3 a5, Class210 a6) {
        if (this.Field1223) {
            return;
        }
        ArrayList a7 = new ArrayList((Collection)a4);
        Vec3 a8 = new Vec3(a5.xCoord + (double)a, a5.yCoord + (double)a2, a5.zCoord + (double)a3);
        if (!this.Method2158(a8, a5)) {
            return;
        }
        this.Method2157(a8, a6);
        a7.Method2530((Object)a8);
        this.Field1220.Method2530((Object)new Class210(a7, this.Field1221, this.Field1232));
        a6.Method2525(true);
    }

    private void Method2157(Vec3 a, Class210 a2) {
        if (this.Method2159(a, this.Field1221)) {
            this.Field1223 = true;
            this.Field1222 = a2;
        }
    }

    private boolean Method2158(Vec3 a, Vec3 a2) {
        Class210 a3;
        Block a4 = PlayerUtils.getBlock(a.xCoord, a.yCoord, a.zCoord);
        if (!this.Field1231.contains((Object)a4)) {
            return false;
        }
        Block a5 = PlayerUtils.getBlock(a.xCoord, a.yCoord + 1.0, a.zCoord);
        if (!this.Field1231.contains((Object)a5)) {
            return false;
        }
        switch (Class220.Field1219[this.Field1233.ordinal()]) {
            case 2: {
                Block a6 = PlayerUtils.getBlock(a.xCoord, a.yCoord, a.zCoord);
                a3 = PlayerUtils.getBlock(a2.xCoord, a2.yCoord - 1.0, a2.zCoord);
                Block a7 = PlayerUtils.getBlock(a2.xCoord, a2.yCoord - 2.0, a2.zCoord);
                if (!this.Field1231.contains((Object)a7) || !this.Field1231.contains((Object)a3) || this.Method2159(a.addVector(0.0, 1.0, 0.0), a2) || a6.Method3429((Object)Blocks.ladder)) break;
                if (a6.Method3429((Object)Blocks.ladder)) {
                    ChatUtils.addChatMessage("" + Math.random());
                }
                return false;
            }
        }
        Iterator iterator = this.Field1220.Method1383();
        while (iterator.Method932()) {
            a3 = (Class210)iterator.Method933();
            Iterator iterator2 = a3.Method2523().Method1383();
            while (iterator2.Method932()) {
                Vec3 a8 = (Vec3)iterator2.Method933();
                if (!this.Method2159(a8, a)) continue;
                return false;
            }
        }
        return true;
    }

    private boolean Method2159(Vec3 a, Vec3 a2) {
        return Math.abs((double)(a.xCoord - a2.xCoord)) <= 0.5 && Math.abs((double)(a.yCoord - a2.yCoord)) <= 0.5 && Math.abs((double)(a.zCoord - a2.zCoord)) <= 0.5;
    }

    static float Method2160(Class221 a) {
        return a.Field1224;
    }

    static float Method2161(Class221 a) {
        return a.Field1225;
    }

    static float Method2162(Class221 a) {
        return a.Field1226;
    }

    public static void Method2163(String[] stringArray) {
        Field1234 = stringArray;
    }

    public static String[] Method2164() {
        return Field1234;
    }

    static {
        if (Class221.Method2164() != null) {
            Class221.Method2163(new String[5]);
        }
    }
}