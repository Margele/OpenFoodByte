/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.lang.Object
 *  java.lang.System
 */
package awsl;

import awsl.Class193;
import awsl.Class765;
import java.io.PrintStream;

class Class764 {
    int Field3380;
    int Field3381;
    Class764 Field3382;
    Class764[] Field3383;
    boolean Field3384;
    int Field3385;
    int Field3386;
    int Field3387;
    int Field3388;
    int Field3389;
    final Class765 Field3390;

    Class764(Class765 a) {
        this.Field3390 = a;
        this.Field3383 = new Class764[8];
    }

    public void Method1776(PrintStream a, int a2) {
        int a3;
        boolean bl = false;
        boolean a4 = Class193.Method1269();
        if (a3 < a2) {
            System.out.print(' ');
            ++a3;
        }
        if (this.Field3385 == 0) {
            System.out.println(this.Field3389 + ": count=" + this.Field3385);
        }
        System.out.println(this.Field3389 + ": count=" + this.Field3385 + " red=" + this.Field3386 / this.Field3385 + " green=" + this.Field3387 / this.Field3385 + " blue=" + this.Field3388 / this.Field3385);
        a3 = 0;
        if (a3 < 8) {
            if (this.Field3383[a3] != null) {
                this.Field3383[a3].Method1776(a, a2 + 2);
            }
            ++a3;
        }
    }
}