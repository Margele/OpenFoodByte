/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.BitSet
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 */
package awsl;

import awsl.Class102;
import awsl.Class104;
import awsl.Class116;
import awsl.Class122;
import awsl.Class15;
import awsl.Class264;
import awsl.Class267;
import awsl.Class37;
import awsl.Class45;
import awsl.Class699;
import awsl.Class790;
import awsl.Class794;
import awsl.Class83;
import awsl.Class91;
import awsl.Class96;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class17
extends Class15
implements Class45 {
    private static final boolean Field224 = false;
    private final Map Field225 = new HashMap();
    private final BitSet Field226 = new BitSet();
    final BitSet Field227 = new BitSet();

    public Class17(Class267 a, int a2, String a3, String a4, String a5, String[] a6) {
        this(327680, a, a2, a3, a4, a5, a6);
        if (this.getClass() != Class17.class) {
            throw new IllegalStateException();
        }
    }

    protected Class17(int a, Class267 a2, int a3, String a4, String a5, String a6, String[] a7) {
        super(a, a3, a4, a5, a6, a7);
        this.Field1460 = a2;
    }

    @Override
    public void Method1957(int a, Class264 a2) {
        block0: {
            super.Method1957(a, a2);
            Class104 a3 = ((Class102)this.Field208.Method185()).Field829;
            if (a != 168 || this.Field225.containsKey((Object)a3)) break block0;
            this.Field225.put((Object)a3, (Object)new BitSet());
        }
    }

    @Override
    public void Method1653() {
        block1: {
            if (!this.Field225.isEmpty()) {
                this.Method1879();
                this.Method1882();
            }
            if (this.Field1460 == null) break block1;
            this.Method3444(this.Field1460);
        }
    }

    private void Method1879() {
        BitSet a = new BitSet();
        this.Method3446(this.Field226, 0, a);
        Iterator a2 = this.Field225.Method2663().Method1383();
        while (a2.Method932()) {
            Map.Entry a3 = (Map.Entry)a2.Method933();
            Class104 a4 = (Class104)a3.getKey();
            BitSet a5 = (BitSet)a3.getValue();
            int a6 = this.Field208.Method188(a4);
            this.Method3446(a5, a6, a);
        }
    }

    private void Method3446(BitSet a, int a2, BitSet a3) {
        this.Method3447(a, a2, a3);
        boolean a4 = true;
        block0: while (true) {
            a4 = false;
            Iterator a5 = this.Field209.Method1383();
            while (true) {
                if (!a5.Method932()) continue block0;
                Class794 a6 = (Class794)a5.Method933();
                int a7 = this.Field208.Method188(a6.Field3561);
                if (a.get(a7)) continue;
                int a8 = this.Field208.Method188(a6.Field3559);
                int a9 = this.Field208.Method188(a6.Field3560);
                int a10 = a.nextSetBit(a8);
                if (a10 == -1 || a10 >= a9) continue;
                this.Method3447(a, a7, a3);
                a4 = true;
            }
            break;
        }
    }

    private void Method3447(BitSet a, int a2, BitSet a3) {
        do {
            int a4;
            Class91 a5;
            Class91 a6 = this.Field208.Method186(a2);
            if (a.get(a2)) {
                return;
            }
            a.set(a2);
            if (a3.get(a2)) {
                this.Field227.set(a2);
            }
            a3.set(a2);
            if (a6.Method0() == 7 && a6.Method3640() != 168) {
                a5 = (Class102)a6;
                a4 = this.Field208.Method188(((Class102)a5).Field829);
                this.Method3447(a, a4, a3);
            }
            if (a6.Method0() == 11) {
                a5 = (Class122)a6;
                a4 = this.Field208.Method188(a5.Field961);
                this.Method3447(a, a4, a3);
                int a7 = a5.Field962.Method1799() - 1;
                while (true) {
                    Class104 a8 = (Class104)a5.Field962.get(a7);
                    a4 = this.Field208.Method188(a8);
                    this.Method3447(a, a4, a3);
                    --a7;
                }
            }
            if (a6.Method0() == 12) {
                a5 = (Class96)a6;
                a4 = this.Field208.Method188(((Class96)a5).Field817);
                this.Method3447(a, a4, a3);
                int a9 = ((Class96)a5).Field819.Method1799() - 1;
                while (true) {
                    Class104 a10 = (Class104)((Class96)a5).Field819.get(a9);
                    a4 = this.Field208.Method188(a10);
                    this.Method3447(a, a4, a3);
                    --a9;
                }
            }
            switch (this.Field208.Method186(a2).Method3640()) {
                case 167: 
                case 169: 
                case 170: 
                case 171: 
                case 172: 
                case 173: 
                case 174: 
                case 175: 
                case 176: 
                case 177: 
                case 191: {
                    return;
                }
            }
        } while (++a2 < this.Field208.Method183());
    }

    private void Method1882() {
        LinkedList a = new LinkedList();
        a.Method2530((Object)new Class699(this, null, this.Field226));
        Class116 a2 = new Class116();
        ArrayList a3 = new ArrayList();
        ArrayList a4 = new ArrayList();
        while (!a.isEmpty()) {
            Class699 a5 = (Class699)((Object)a.removeFirst());
            this.Method3448(a5, (List)a, a2, (List)a3, (List)a4);
        }
        this.Field208 = a2;
        this.Field209 = a3;
        this.Field212 = a4;
    }

    private void Method3448(Class699 a, List a2, Class116 a3, List a4, List a5) {
        Iterator a6;
        Class104 a7;
        Object a8;
        Class91 a9;
        block11: {
            int a10;
            block13: {
                Object a11;
                block12: {
                    Object a12;
                    Object var7_6 = null;
                    boolean a13 = Class37.Method3383();
                    a10 = 0;
                    int a14 = this.Field208.Method183();
                    if (a10 >= a14) break block11;
                    a9 = this.Field208.Method186(a10);
                    a8 = a.Method2660(a10);
                    if (a9.Method0() != 8) break block12;
                    a7 = (Class104)a9;
                    a11 = a.Method2662(a7);
                    if (a11 == a12) break block13;
                    a3.Method194((Class91)a11);
                    a12 = a11;
                }
                if (a8 != a) {
                }
                if (a9.Method3640() == 169) {
                    a7 = null;
                    a11 = a;
                    if (((Class699)((Object)a11)).Field3014.get(a10)) {
                        a7 = ((Class699)((Object)a11)).Field3016;
                    }
                    a11 = ((Class699)((Object)a11)).Field3013;
                    throw new RuntimeException("Instruction #" + a10 + " is a RET not owned by any subroutine");
                }
                if (a9.Method3640() == 168) {
                    a7 = ((Class102)a9).Field829;
                    a11 = (BitSet)this.Field225.Method2665((Object)a7);
                    Class699 a15 = new Class699(this, a, (BitSet)a11);
                    Class104 a16 = a15.Method2661(a7);
                    a3.Method194(new Class83(1));
                    a3.Method194(new Class102(167, a16));
                    a3.Method194(a15.Field3016);
                    a2.Method2530((Object)a15);
                }
                a3.Method194(a9.Method2((Map)a));
            }
            ++a10;
        }
        if ((a6 = this.Field209.Method1383()).Method932()) {
            Class794 a17 = (Class794)a6.Method933();
            a9 = a.Method2662(a17.Field3559);
            if (a9 == (a8 = a.Method2662(a17.Field3560))) {
            }
            a7 = a.Method2661(a17.Field3561);
            throw new RuntimeException("Internal error!");
        }
        a6 = this.Field212.Method1383();
        if (a6.Method932()) {
            Class790 a18 = (Class790)a6.Method933();
            a9 = a.Method2662(a18.Field3552);
            if (a9 == (a8 = a.Method2662(a18.Field3553))) {
            }
            a5.Method2530((Object)new Class790(a18.Field3549, a18.Field3550, a18.Field3551, (Class104)a9, (Class104)a8, a18.Field3554));
        }
    }

    private static void Method1873(String a) {
        System.err.println(a);
    }

    private static IllegalStateException Method1946(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}