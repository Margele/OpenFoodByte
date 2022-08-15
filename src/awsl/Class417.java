/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  net.minecraft.client.Minecraft
 */
package awsl;

import awsl.Class411;
import awsl.Class412;
import awsl.Class413;
import awsl.Class418;
import awsl.Class421;
import awsl.Class446;
import awsl.Class447;
import awsl.Class91;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import trash.foodbyte.value.BooleanValue;
import trash.foodbyte.value.FloatValue;
import trash.foodbyte.value.ModeValue;

public class Class417 {
    public String Field2012;
    public ArrayList Field2013;
    public Class421 Field2014;
    public double Field2015;
    public double Field2016;
    public double Field2017;
    public double Field2018;
    public boolean Field2019 = true;
    public boolean Field2020;

    public Class417(String a, Class421 a2) {
        Class447 a3;
        boolean a4 = Class413.Method3580();
        this.Field2020 = false;
        this.Field2012 = a;
        this.Field2018 = Minecraft.getMinecraft().fontRendererObj.FONT_HEIGHT + 2;
        this.Field2014 = a2;
        this.Field2013 = new ArrayList();
        Iterator iterator = Class446.Method2766(a).Method1383();
        if (iterator.Method932()) {
            a3 = (Class447)iterator.Method933();
            if (a3 instanceof ModeValue) {
                this.Field2013.Method2530((Object)new Class411(this, (ModeValue)a3));
            }
            Class91.Method3647(new String[3]);
        }
        if ((iterator = Class446.Method2766(a).Method1383()).Method932()) {
            a3 = (Class447)iterator.Method933();
            if (a3 instanceof FloatValue) {
                this.Field2013.Method2530((Object)new Class418(this, (FloatValue)a3));
            }
        }
        if ((iterator = Class446.Method2766(a).Method1383()).Method932()) {
            a3 = (Class447)iterator.Method933();
            if (a3 instanceof BooleanValue) {
                this.Field2013.Method2530((Object)new Class412(this, (BooleanValue)a3));
            }
        }
    }

    public void Method2376(int a, int a2, float a3) {
    }

    public boolean Method2377(int a, int a2, int a3) {
        return this.Method2378(a, a2);
    }

    public boolean Method2378(int a, int a2) {
        return (double)a >= this.Field2015 && (double)a <= this.Field2015 + this.Field2017 && (double)a2 >= this.Field2016 && (double)a2 <= this.Field2016 + this.Field2018;
    }
}