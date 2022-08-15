/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.awt.Rectangle
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package awsl;

import awsl.Class193;
import awsl.Class808;
import java.awt.Rectangle;

public class Class793
extends Class808 {
    private static final byte[] Field3558 = new byte[]{0, 0, 0, 1, 0, 0, 1, 3, 0, 0, 3, 1, 1, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 3, 0, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 3, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 2, 0, 0, 1, 3, 1, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 1, 3, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 0, 1, 0, 0, 0, 0, 2, 2, 0, 0, 2, 0, 0, 0};

    public Class793() {
        this.Field3617 = -1;
    }

    @Override
    protected int[] Method714(int a, int a2, int[] a3, Rectangle a4) {
        int[] a5;
        block14: {
            int a6;
            block15: {
                int a7;
                block16: {
                    int a8;
                    block17: {
                        int a9;
                        int a10;
                        block18: {
                            byte a11;
                            int a12;
                            block19: {
                                int[] nArray = new int[a * a2];
                                boolean a13 = Class193.Method1270();
                                a12 = 0;
                                int a14 = -16777216;
                                int a15 = -1;
                                a6 = 0;
                                if (a6 >= this.Field3619) break block14;
                                a12 = 0;
                                a7 = 0;
                                if (a7 >= 2) break block15;
                                a8 = 1;
                                if (a8 >= a2 - 1) break block16;
                                int a16 = a8 * a + 1;
                                a10 = 1;
                                if (a10 >= a - 1) break block17;
                                a9 = a3[a16];
                                if (a9 != a14) break block18;
                                int a17 = 0;
                                if (a3[a16 - a - 1] == a14) {
                                    a17 |= 1;
                                }
                                if (a3[a16 - a] == a14) {
                                    a17 |= 2;
                                }
                                if (a3[a16 - a + 1] == a14) {
                                    a17 |= 4;
                                }
                                if (a3[a16 + 1] == a14) {
                                    a17 |= 8;
                                }
                                if (a3[a16 + a + 1] == a14) {
                                    a17 |= 0x10;
                                }
                                if (a3[a16 + a] == a14) {
                                    a17 |= 0x20;
                                }
                                if (a3[a16 + a - 1] == a14) {
                                    a17 |= 0x40;
                                }
                                if (a3[a16 - 1] == a14) {
                                    a17 |= 0x80;
                                }
                                a11 = Field3558[a17];
                                if (a7 != 1) break block19;
                                if (a11 != 2 && a11 != 3) break block18;
                                if (this.Field3620 != null) {
                                    a9 = this.Field3620.Method283((float)a6 / (float)this.Field3619);
                                }
                                a9 = this.Field3617;
                                ++a12;
                            }
                            if (a11 == 1 || a11 == 3) {
                                if (this.Field3620 != null) {
                                    a9 = this.Field3620.Method283((float)a6 / (float)this.Field3619);
                                }
                                a9 = this.Field3617;
                                ++a12;
                            }
                        }
                        a5[a16++] = a9;
                        ++a10;
                    }
                    ++a8;
                }
                a3 = a5;
                a5 = new int[a * a2];
                ++a7;
            }
            ++a6;
        }
        return a5;
    }

    public String toString() {
        return "Binary/Skeletonize...";
    }
}