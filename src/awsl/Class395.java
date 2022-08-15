/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.io.IOException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package awsl;

import awsl.Class344;
import awsl.Class381;
import awsl.Class390;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import trash.foodbyte.utils.RenderUtils;

public class Class395
extends Class390 {
    private List Field1950 = new ArrayList();
    private int Field1951;
    private boolean Field1952;
    private Class344 Field1953 = new Class344(15);

    public Class395(Class381 a, int a2, int a3, String a4) {
        super(a, a2, a3, a4, null);
        this.Field1909 = Math.max((int)this.Field1919.Field1874, (int)a.Method1414());
        this.Field1910 = 0;
        this.Field1920 = "Box";
    }

    public void Method1344(Class390 a) {
        this.Method1309();
        a.Field1907 = this.Field1907 + 10;
        this.Field1950.Method2530((Object)a);
    }

    @Override
    public void Method412(int a, int a2) {
        if (!this.Field1952) {
            return;
        }
        float a3 = this.Field1907;
        float a4 = Math.min((float)(this.Field1919.Field1851 + (this.Field1919.Field1853 - this.Field1919.Field1876) + this.Field1919.Field1876), (float)(this.Field1910 + this.Field1908));
        float a5 = this.Field1909;
        float a6 = Math.min((int)(this.Field1908 + this.Field1910 - (this.Field1919.Field1851 + this.Field1919.Field1876)), (int)this.Field1910);
        if (a6 <= 0.0f || (float)this.Field1910 <= 1.0f) {
            return;
        }
        RenderUtils.Method1108((double)this.Field1907 + 3.5, (double)this.Field1908 + 0.5, (double)(this.Field1907 + this.Method1310()) - 3.5, (double)(this.Field1908 + this.Field1951) - 0.5, 0.5, 1, new Color(255, 255, 255, 80).getRGB());
        this.Field1950.stream().filter(Class395::Method1354).forEach(arg_0 -> Class395.Method1353(a, a2, arg_0));
    }

    @Override
    public void Method413(int a, int a2, boolean a3) {
        if (!this.Field1952) {
            return;
        }
        this.Field1950.stream().filter(Class395::Method1352).forEach(arg_0 -> Class395.Method1351(a, a2, a3, arg_0));
    }

    @Override
    public void Method414() {
        if (!this.Field1952) {
            return;
        }
        this.Field1950.stream().filter(Class395::Method1350).forEach(Class390::Method414);
    }

    @Override
    public void Method1315(char a, int a2) throws IOException {
        super.Method1315(a, a2);
        this.Field1950.stream().filter(Class395::Method1349).forEach(arg_0 -> Class395.Method1348(a, a2, arg_0));
    }

    @Override
    public void Method411(int a, int a2) {
        int n = Class390.Method1317();
        super.Method411(a, a2);
        int a3 = n;
        int a4 = this.Field1908;
        int a5 = this.Field1907;
        Iterator iterator = this.Field1950.Method1383();
        while (iterator.Method932()) {
            Class390 a6 = (Class390)iterator.Method933();
            a6.Method419(a, a2);
            if (!a6.Field1916) continue;
            a6.Method411(a, a2);
            a6.Field1908 = a4;
            a6.Field1907 = a5;
            a4 = (int)((float)a4 + (float)a6.Field1910);
            break;
        }
        this.Method425();
        this.Field1953.Method290(this.Field1952);
        this.Field1910 = (int)((this.Field1952 ? 1.0 : 0.0) * (double)this.Field1951);
        this.Field1919.Method1384();
    }

    public void Method425() {
        this.Field1951 = this.Field1950.stream().filter(Class395::Method1347).mapToInt(Class395::Method1346).sum();
    }

    public void Method1345(boolean a) {
        this.Field1952 = a;
    }

    public boolean Method420() {
        return this.Field1952;
    }

    private static int Method1346(Class390 a) {
        return a.Field1910;
    }

    private static boolean Method1347(Class390 a) {
        return a.Field1916;
    }

    private static void Method1348(char a, int a2, Class390 a3) {
        try {
            a3.Method1315(a, a2);
        }
        catch (IOException a4) {
            a4.printStackTrace();
        }
    }

    private static boolean Method1349(Class390 a) {
        return a.Field1916;
    }

    private static boolean Method1350(Class390 a) {
        return a.Field1916;
    }

    private static void Method1351(int a, int a2, boolean a3, Class390 a4) {
        a4.Method413(a, a2, a3);
    }

    private static boolean Method1352(Class390 a) {
        return a.Field1916;
    }

    private static void Method1353(int a, int a2, Class390 a3) {
        a3.Method412(a, a2);
    }

    private static boolean Method1354(Class390 a) {
        return a.Field1916;
    }
}