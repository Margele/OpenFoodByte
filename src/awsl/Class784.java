/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.List
 */
package awsl;

import awsl.Class112;
import awsl.Class120;
import awsl.Class46;
import awsl.Class731;
import awsl.Class786;
import awsl.Class797;
import awsl.Class82;
import awsl.Class88;
import awsl.Class91;
import awsl.Class98;
import java.util.ArrayList;
import java.util.List;

public class Class784 {
    private Class797 Field3532;
    private Class797[] Field3533;
    private int Field3534;
    private int Field3535;

    public Class784(int a, int a2) {
        this.Field3533 = new Class797[a + a2];
        this.Field3534 = a;
    }

    public Class784(Class784 a) {
        this(a.Field3534, a.Field3533.length - a.Field3534);
        this.Method884(a);
    }

    public Class784 Method884(Class784 a) {
        this.Field3532 = a.Field3532;
        System.arraycopy((Object)a.Field3533, (int)0, (Object)this.Field3533, (int)0, (int)this.Field3533.length);
        this.Field3535 = a.Field3535;
        return this;
    }

    public void Method885(Class797 a) {
        this.Field3532 = a;
    }

    public int Method886() {
        return this.Field3534;
    }

    public int Method887() {
        return this.Field3533.length - this.Field3534;
    }

    public Class797 Method888(int a) throws IndexOutOfBoundsException {
        if (a >= this.Field3534) {
            throw new IndexOutOfBoundsException("Trying to access an inexistant local variable");
        }
        return this.Field3533[a];
    }

    public void Method889(int a, Class797 a2) throws IndexOutOfBoundsException {
        if (a >= this.Field3534) {
            throw new IndexOutOfBoundsException("Trying to access an inexistant local variable " + a);
        }
        this.Field3533[a] = a2;
    }

    public int Method890() {
        return this.Field3535;
    }

    public Class797 Method891(int a) throws IndexOutOfBoundsException {
        return this.Field3533[a + this.Field3534];
    }

    public void Method892() {
        this.Field3535 = 0;
    }

    public Class797 Method893() throws IndexOutOfBoundsException {
        if (this.Field3535 == 0) {
            throw new IndexOutOfBoundsException("Cannot pop operand off an empty stack.");
        }
        return this.Field3533[--this.Field3535 + this.Field3534];
    }

    public void Method894(Class797 a) throws IndexOutOfBoundsException {
        if (this.Field3535 + this.Field3534 >= this.Field3533.length) {
            throw new IndexOutOfBoundsException("Insufficient maximum stack size.");
        }
        this.Field3533[this.Field3535++ + this.Field3534] = a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void Method895(Class91 a, Class786 a2) throws Class731 {
        int[] a3 = Class786.Method917();
        switch (a.Method3640()) {
            case 0: {
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: {
                this.Method894(a2.Method908(a));
            }
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: {
                this.Method894(a2.Method909(a, this.Method888(((Class112)a).Field877)));
            }
            case 46: 
            case 47: 
            case 48: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: {
                Class797 a4 = this.Method893();
                Class797 a5 = this.Method893();
                this.Method894(a2.Method911(a, a5, a4));
            }
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: {
                Class797 a5 = a2.Method909(a, this.Method893());
                int a6 = ((Class112)a).Field877;
                this.Method889(a6, a5);
                if (a5.Method806() == 2) {
                    this.Method889(a6 + 1, a2.Method907(null));
                }
                Class797 a7 = this.Method888(a6 - 1);
                if (a7.Method806() == 2) {
                    this.Method889(a6 - 1, a2.Method907(null));
                }
            }
            case 79: 
            case 80: 
            case 81: 
            case 82: 
            case 83: 
            case 84: 
            case 85: 
            case 86: {
                Class797 a8 = this.Method893();
                Class797 a4 = this.Method893();
                Class797 a5 = this.Method893();
                a2.Method912(a, a5, a4, a8);
            }
            case 87: {
                if (this.Method893().Method806() != 2) return;
                throw new Class731(a, "Illegal use of POP");
            }
            case 88: {
                if (this.Method893().Method806() != 1 || this.Method893().Method806() == 1) return;
                throw new Class731(a, "Illegal use of POP2");
            }
            case 89: {
                Class797 a9 = this.Method893();
                if (a9.Method806() != 1) {
                    throw new Class731(a, "Illegal use of DUP");
                }
                this.Method894(a9);
                this.Method894(a2.Method909(a, a9));
            }
            case 90: {
                Class797 a9 = this.Method893();
                Class797 a10 = this.Method893();
                if (a9.Method806() != 1 || a10.Method806() != 1) {
                    throw new Class731(a, "Illegal use of DUP_X1");
                }
                this.Method894(a2.Method909(a, a9));
                this.Method894(a10);
                this.Method894(a9);
            }
            case 91: {
                Class797 a9 = this.Method893();
                if (a9.Method806() != 1) throw new Class731(a, "Illegal use of DUP_X2");
                Class797 a10 = this.Method893();
                if (a10.Method806() == 1) {
                    Class797 a11 = this.Method893();
                    if (a11.Method806() != 1) throw new Class731(a, "Illegal use of DUP_X2");
                    this.Method894(a2.Method909(a, a9));
                    this.Method894(a11);
                    this.Method894(a10);
                    this.Method894(a9);
                }
                this.Method894(a2.Method909(a, a9));
                this.Method894(a10);
                this.Method894(a9);
                throw new Class731(a, "Illegal use of DUP_X2");
            }
            case 92: {
                Class797 a12 = this.Method893();
                if (a12.Method806() == 1) {
                    Class797 a13 = this.Method893();
                    if (a13.Method806() != 1) throw new Class731(a, "Illegal use of DUP2");
                    this.Method894(a13);
                    this.Method894(a12);
                    this.Method894(a2.Method909(a, a13));
                    this.Method894(a2.Method909(a, a12));
                }
                this.Method894(a12);
                this.Method894(a2.Method909(a, a12));
                return;
            }
            case 93: {
                Class797 a14;
                Class797 a15 = this.Method893();
                if (a15.Method806() == 1) {
                    Class797 a16;
                    a14 = this.Method893();
                    if (a14.Method806() != 1 || (a16 = this.Method893()).Method806() != 1) throw new Class731(a, "Illegal use of DUP2_X1");
                    this.Method894(a2.Method909(a, a14));
                    this.Method894(a2.Method909(a, a15));
                    this.Method894(a16);
                    this.Method894(a14);
                    this.Method894(a15);
                }
                if ((a14 = this.Method893()).Method806() != 1) throw new Class731(a, "Illegal use of DUP2_X1");
                this.Method894(a2.Method909(a, a15));
                this.Method894(a14);
                this.Method894(a15);
                throw new Class731(a, "Illegal use of DUP2_X1");
            }
            case 94: {
                Class797 a17;
                Class797 a18;
                Class797 a19 = this.Method893();
                if (a19.Method806() == 1) {
                    a18 = this.Method893();
                    if (a18.Method806() != 1) throw new Class731(a, "Illegal use of DUP2_X2");
                    a17 = this.Method893();
                    if (a17.Method806() == 1) {
                        Class797 a20 = this.Method893();
                        if (a20.Method806() != 1) throw new Class731(a, "Illegal use of DUP2_X2");
                        this.Method894(a2.Method909(a, a18));
                        this.Method894(a2.Method909(a, a19));
                        this.Method894(a20);
                        this.Method894(a17);
                        this.Method894(a18);
                        this.Method894(a19);
                    }
                    this.Method894(a2.Method909(a, a18));
                    this.Method894(a2.Method909(a, a19));
                    this.Method894(a17);
                    this.Method894(a18);
                    this.Method894(a19);
                }
                if ((a18 = this.Method893()).Method806() == 1) {
                    a17 = this.Method893();
                    if (a17.Method806() != 1) throw new Class731(a, "Illegal use of DUP2_X2");
                    this.Method894(a2.Method909(a, a19));
                    this.Method894(a17);
                    this.Method894(a18);
                    this.Method894(a19);
                }
                this.Method894(a2.Method909(a, a19));
                this.Method894(a18);
                this.Method894(a19);
                throw new Class731(a, "Illegal use of DUP2_X2");
            }
            case 95: {
                Class797 a21 = this.Method893();
                Class797 a22 = this.Method893();
                if (a22.Method806() != 1 || a21.Method806() != 1) {
                    throw new Class731(a, "Illegal use of SWAP");
                }
                this.Method894(a2.Method909(a, a21));
                this.Method894(a2.Method909(a, a22));
            }
            case 96: 
            case 97: 
            case 98: 
            case 99: 
            case 100: 
            case 101: 
            case 102: 
            case 103: 
            case 104: 
            case 105: 
            case 106: 
            case 107: 
            case 108: 
            case 109: 
            case 110: 
            case 111: 
            case 112: 
            case 113: 
            case 114: 
            case 115: {
                Class797 a21 = this.Method893();
                Class797 a22 = this.Method893();
                this.Method894(a2.Method911(a, a22, a21));
            }
            case 116: 
            case 117: 
            case 118: 
            case 119: {
                this.Method894(a2.Method910(a, this.Method893()));
            }
            case 120: 
            case 121: 
            case 122: 
            case 123: 
            case 124: 
            case 125: 
            case 126: 
            case 127: 
            case 128: 
            case 129: 
            case 130: 
            case 131: {
                Class797 a21 = this.Method893();
                Class797 a22 = this.Method893();
                this.Method894(a2.Method911(a, a22, a21));
            }
            case 132: {
                int a23 = ((Class82)a).Field712;
                this.Method889(a23, a2.Method910(a, this.Method888(a23)));
            }
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 137: 
            case 138: 
            case 139: 
            case 140: 
            case 141: 
            case 142: 
            case 143: 
            case 144: 
            case 145: 
            case 146: 
            case 147: {
                this.Method894(a2.Method910(a, this.Method893()));
            }
            case 148: 
            case 149: 
            case 150: 
            case 151: 
            case 152: {
                Class797 a21 = this.Method893();
                Class797 a22 = this.Method893();
                this.Method894(a2.Method911(a, a22, a21));
            }
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: {
                a2.Method910(a, this.Method893());
            }
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: {
                Class797 a21 = this.Method893();
                Class797 a22 = this.Method893();
                a2.Method911(a, a22, a21);
            }
            case 167: {
            }
            case 168: {
                this.Method894(a2.Method908(a));
            }
            case 169: {
            }
            case 170: 
            case 171: {
                a2.Method910(a, this.Method893());
            }
            case 172: 
            case 173: 
            case 174: 
            case 175: 
            case 176: {
                Class797 a22 = this.Method893();
                a2.Method910(a, a22);
                a2.Method914(a, a22, this.Field3532);
            }
            case 177: {
                if (this.Field3532 == null) return;
                throw new Class731(a, "Incompatible return type");
            }
            case 178: {
                this.Method894(a2.Method908(a));
            }
            case 179: {
                a2.Method910(a, this.Method893());
            }
            case 180: {
                this.Method894(a2.Method910(a, this.Method893()));
            }
            case 181: {
                Class797 a24 = this.Method893();
                Class797 a25 = this.Method893();
                a2.Method911(a, a25, a24);
            }
            case 182: 
            case 183: 
            case 184: 
            case 185: {
                ArrayList a26 = new ArrayList();
                String a27 = ((Class98)a).Field826;
                int a28 = Class46.Method3211(a27).length;
                a26.add(0, (Object)this.Method893());
                --a28;
                if (a.Method3640() != 184) {
                    a26.add(0, (Object)this.Method893());
                }
                if (Class46.Method3213(a27) == Class46.Field572) {
                    a2.Method913(a, (List)a26);
                }
                this.Method894(a2.Method913(a, (List)a26));
            }
            case 186: {
                ArrayList a26 = new ArrayList();
                String a27 = ((Class88)a).Field760;
                int a28 = Class46.Method3211(a27).length;
                a26.add(0, (Object)this.Method893());
                --a28;
                if (Class46.Method3213(a27) == Class46.Field572) {
                    a2.Method913(a, (List)a26);
                }
                this.Method894(a2.Method913(a, (List)a26));
            }
            case 187: {
                this.Method894(a2.Method908(a));
            }
            case 188: 
            case 189: 
            case 190: {
                this.Method894(a2.Method910(a, this.Method893()));
            }
            case 191: {
                a2.Method910(a, this.Method893());
            }
            case 192: 
            case 193: {
                this.Method894(a2.Method910(a, this.Method893()));
            }
            case 194: 
            case 195: {
                a2.Method910(a, this.Method893());
            }
            case 197: {
                ArrayList a26 = new ArrayList();
                int a29 = ((Class120)a).Field953;
                a26.add(0, (Object)this.Method893());
                --a29;
                this.Method894(a2.Method913(a, (List)a26));
            }
            case 198: 
            case 199: {
                a2.Method910(a, this.Method893());
            }
            default: {
                throw new RuntimeException("Illegal opcode " + a.Method3640());
            }
        }
    }

    public boolean Method896(Class784 a, Class786 a2) throws Class731 {
        if (this.Field3535 != a.Field3535) {
            throw new Class731(null, "Incompatible stack heights");
        }
        boolean a3 = false;
        for (int a4 = 0; a4 < this.Field3534 + this.Field3535; ++a4) {
            Class797 a5 = a2.Method915(this.Field3533[a4], a.Field3533[a4]);
            if (a5.Method3429(this.Field3533[a4])) continue;
            this.Field3533[a4] = a5;
            a3 = true;
        }
        return a3;
    }

    public boolean Method897(Class784 a, boolean[] a2) {
        boolean a3 = false;
        for (int a4 = 0; a4 < this.Field3534; ++a4) {
            if (a2[a4] || this.Field3533[a4].Method3429(a.Field3533[a4])) continue;
            this.Field3533[a4] = a.Field3533[a4];
            a3 = true;
        }
        return a3;
    }

    public String Method898() {
        int a;
        StringBuilder a2 = new StringBuilder();
        for (a = 0; a < this.Method886(); ++a) {
            a2.append((Object)this.Method888(a));
        }
        a2.append(' ');
        for (a = 0; a < this.Method890(); ++a) {
            a2.append(this.Method891(a).Method3780());
        }
        return a2.toString();
    }

    private static Exception Method899(Exception exception) {
        return exception;
    }
}