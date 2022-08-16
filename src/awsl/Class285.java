/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.BlockBush
 *  net.minecraft.block.BlockLiquid
 */
package awsl;

import awsl.Class216;
import awsl.Class280;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLiquid;
import obfuscate.a;
import trash.foodbyte.utils.PlayerUtils;

public class Class285 {
    private final Class280 Field1543 = new Class280();
    public final Class216 Field1544;
    private final Class216 Field1545;
    public int Field1546;
    private static int Field1547;

    public Class285(Class216 a) {
        this.Field1544 = a;
        this.Field1545 = new Class216((Math.random() * 0.5 - 0.25) * 0.01, Math.random() * 0.25 * 0.01, (Math.random() * 0.5 - 0.25) * 0.01);
        this.Field1543.Method3079();
    }

    public Class285(Class216 a, Class216 a2) {
        this.Field1544 = a;
        this.Field1545 = new Class216(a2.Field1207 * 0.01, a2.Field1208 * 0.01, a2.Field1209 * 0.01);
        this.Field1543.Method3079();
    }

    public void Method3096() {
        Block a2;
        Block a3;
        Block a4 = PlayerUtils.getBlock(this.Field1544.Field1207, this.Field1544.Field1208, this.Field1544.Field1209 + this.Field1545.Field1209);
        int a5 = Class285.Method3102();
        if (!(a4 instanceof BlockAir || a4 instanceof BlockBush || a4 instanceof BlockLiquid)) {
            this.Field1545.Field1209 *= -0.8;
        }
        if (!((a3 = PlayerUtils.getBlock(this.Field1544.Field1207, this.Field1544.Field1208 + this.Field1545.Field1208, this.Field1544.Field1209)) instanceof BlockAir || a3 instanceof BlockBush || a3 instanceof BlockLiquid)) {
            this.Field1545.Field1207 *= (double)0.999f;
            this.Field1545.Field1209 *= (double)0.999f;
            this.Field1545.Field1208 *= -0.6;
        }
        if (!((a2 = PlayerUtils.getBlock(this.Field1544.Field1207 + this.Field1545.Field1207, this.Field1544.Field1208, this.Field1544.Field1209)) instanceof BlockAir || a2 instanceof BlockBush || a2 instanceof BlockLiquid)) {
            this.Field1545.Field1207 *= -0.8;
        }
        this.Method3097();
        if (this.Method3099()) {
            ++this.Field1546;
        }
        a.trash(new String[2]);
    }

    public void Method3097() {
        this.Field1544.Field1207 += this.Field1545.Field1207;
        int n = Class285.Method3102();
        this.Field1544.Field1208 += this.Field1545.Field1208;
        this.Field1544.Field1209 += this.Field1545.Field1209;
        this.Field1545.Field1207 /= (double)0.999998f;
        this.Field1545.Field1208 -= 1.5E-6;
        this.Field1545.Field1209 /= (double)0.999998f;
        if (a.trash() == null) {
            Class285.Method3100(++n);
        }
    }

    public Class216 Method3098() {
        return this.Field1544;
    }

    public boolean Method3099() {
        Block a2 = PlayerUtils.getBlock(this.Field1544.Field1207, this.Field1544.Field1208 - 1.0E-5, this.Field1544.Field1209);
        return !(a2 instanceof BlockAir) && !(a2 instanceof BlockBush) && !(a2 instanceof BlockLiquid);
    }

    public static void Method3100(int n) {
        Field1547 = n;
    }

    public static int Method3101() {
        return Field1547;
    }

    public static int Method3102() {
        int n = Class285.Method3101();
        return 83;
    }

    static {
        if (Class285.Method3102() != 0) {
            Class285.Method3100(53);
        }
    }
}