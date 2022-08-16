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
import awsl.Class96;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import obfuscate.a;

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
    public void Method1957(int a2, Class264 a3) {
        block0: {
            super.Method1957(a2, a3);
            Class104 a4 = ((Class102)this.Field208.Method185()).Field829;
            if (a2 != 168 || this.Field225.containsKey((Object)a4)) break block0;
            this.Field225.put((Object)a4, (Object)new BitSet());
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
        BitSet a2 = new BitSet();
        this.Method3446(this.Field226, 0, a2);
        Iterator a3 = this.Field225.Method2663().Method1383();
        while (a3.Method932()) {
            Map.Entry a4 = (Map.Entry)a3.Method933();
            Class104 a5 = (Class104)a4.getKey();
            BitSet a6 = (BitSet)a4.getValue();
            int a7 = this.Field208.Method188(a5);
            this.Method3446(a6, a7, a2);
        }
    }

    private void Method3446(BitSet a2, int a3, BitSet a4) {
        this.Method3447(a2, a3, a4);
        boolean a5 = true;
        block0: while (true) {
            a5 = false;
            Iterator a6 = this.Field209.Method1383();
            while (true) {
                if (!a6.Method932()) continue block0;
                Class794 a7 = (Class794)a6.Method933();
                int a8 = this.Field208.Method188(a7.Field3561);
                if (a2.get(a8)) continue;
                int a9 = this.Field208.Method188(a7.Field3559);
                int a10 = this.Field208.Method188(a7.Field3560);
                int a11 = a2.nextSetBit(a9);
                if (a11 == -1 || a11 >= a10) continue;
                this.Method3447(a2, a8, a4);
                a5 = true;
            }
            break;
        }
    }

    private void Method3447(BitSet a2, int a3, BitSet a4) {
        do {
            int a5;
            a a6;
            a a7 = this.Field208.Method186(a3);
            if (a2.get(a3)) {
                return;
            }
            a2.set(a3);
            if (a4.get(a3)) {
                this.Field227.set(a3);
            }
            a4.set(a3);
            if (a7.Method0() == 7 && a7.Method3640() != 168) {
                a6 = (Class102)a7;
                a5 = this.Field208.Method188(((Class102)a6).Field829);
                this.Method3447(a2, a5, a4);
            }
            if (a7.Method0() == 11) {
                a6 = (Class122)a7;
                a5 = this.Field208.Method188(a6.Field961);
                this.Method3447(a2, a5, a4);
                int a8 = a6.Field962.Method1799() - 1;
                while (true) {
                    Class104 a9 = (Class104)a6.Field962.get(a8);
                    a5 = this.Field208.Method188(a9);
                    this.Method3447(a2, a5, a4);
                    --a8;
                }
            }
            if (a7.Method0() == 12) {
                a6 = (Class96)a7;
                a5 = this.Field208.Method188(((Class96)a6).Field817);
                this.Method3447(a2, a5, a4);
                int a10 = ((Class96)a6).Field819.Method1799() - 1;
                while (true) {
                    Class104 a11 = (Class104)((Class96)a6).Field819.get(a10);
                    a5 = this.Field208.Method188(a11);
                    this.Method3447(a2, a5, a4);
                    --a10;
                }
            }
            switch (this.Field208.Method186(a3).Method3640()) {
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
        } while (++a3 < this.Field208.Method183());
    }

    private void Method1882() {
        LinkedList a2 = new LinkedList();
        a2.Method2530((Object)new Class699(this, null, this.Field226));
        Class116 a3 = new Class116();
        ArrayList a4 = new ArrayList();
        ArrayList a5 = new ArrayList();
        while (!a2.isEmpty()) {
            Class699 a6 = (Class699)((Object)a2.removeFirst());
            this.Method3448(a6, (List)a2, a3, (List)a4, (List)a5);
        }
        this.Field208 = a3;
        this.Field209 = a4;
        this.Field212 = a5;
    }

    private void Method3448(Class699 a2, List a3, Class116 a4, List a5, List a6) {
        Iterator a7;
        Class104 a8;
        Object a9;
        a a10;
        block11: {
            int a11;
            block13: {
                Object a12;
                block12: {
                    Object a13;
                    Object var7_6 = null;
                    boolean a14 = Class37.Method3383();
                    a11 = 0;
                    int a15 = this.Field208.Method183();
                    if (a11 >= a15) break block11;
                    a10 = this.Field208.Method186(a11);
                    a9 = a2.Method2660(a11);
                    if (a10.Method0() != 8) break block12;
                    a8 = (Class104)a10;
                    a12 = a2.Method2662(a8);
                    if (a12 == a13) break block13;
                    a4.Method194((a)a12);
                    a13 = a12;
                }
                if (a9 != a2) {
                }
                if (a10.Method3640() == 169) {
                    a8 = null;
                    a12 = a2;
                    if (((Class699)((Object)a12)).Field3014.get(a11)) {
                        a8 = ((Class699)((Object)a12)).Field3016;
                    }
                    a12 = ((Class699)((Object)a12)).Field3013;
                    throw new RuntimeException("Instruction #" + a11 + " is a RET not owned by any subroutine");
                }
                if (a10.Method3640() == 168) {
                    a8 = ((Class102)a10).Field829;
                    a12 = (BitSet)this.Field225.Method2665((Object)a8);
                    Class699 a16 = new Class699(this, a2, (BitSet)a12);
                    Class104 a17 = a16.Method2661(a8);
                    a4.Method194(new Class83(1));
                    a4.Method194(new Class102(167, a17));
                    a4.Method194(a16.Field3016);
                    a3.Method2530((Object)a16);
                }
                a4.Method194(a10.Method2((Map)a2));
            }
            ++a11;
        }
        if ((a7 = this.Field209.Method1383()).Method932()) {
            Class794 a18 = (Class794)a7.Method933();
            a10 = a2.Method2662(a18.Field3559);
            if (a10 == (a9 = a2.Method2662(a18.Field3560))) {
            }
            a8 = a2.Method2661(a18.Field3561);
            throw new RuntimeException("Internal error!");
        }
        a7 = this.Field212.Method1383();
        if (a7.Method932()) {
            Class790 a19 = (Class790)a7.Method933();
            a10 = a2.Method2662(a19.Field3552);
            if (a10 == (a9 = a2.Method2662(a19.Field3553))) {
            }
            a6.Method2530((Object)new Class790(a19.Field3549, a19.Field3550, a19.Field3551, (Class104)a10, (Class104)a9, a19.Field3554));
        }
    }

    private static void Method1873(String a2) {
        System.err.println(a2);
    }

    private static IllegalStateException Method1946(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}