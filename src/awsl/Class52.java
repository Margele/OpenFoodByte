/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package awsl;

import awsl.Class169;
import awsl.Class279;
import awsl.Class690;
import java.util.Arrays;

class Class52 {
    char Field590;
    int Field591;
    long Field592;
    float Field593;
    double Field594;
    String Field595;
    String Field596;
    Object Field597;
    Object[] Field598;
    int Field599;

    Class52() {
    }

    Class52(Class52 a) {
        this.Field590 = a.Field590;
        this.Field591 = a.Field591;
        this.Field592 = a.Field592;
        this.Field593 = a.Field593;
        this.Field594 = a.Field594;
        this.Field595 = a.Field595;
        this.Field596 = a.Field596;
        this.Field597 = a.Field597;
        this.Field598 = a.Field598;
        this.Field599 = a.Field599;
    }

    void Method3186(int a) {
        this.Field590 = (char)73;
        this.Field591 = a;
        this.Field599 = Integer.MAX_VALUE & this.Field590 + a;
    }

    void Method3187(long a) {
        this.Field590 = (char)74;
        this.Field592 = a;
        this.Field599 = Integer.MAX_VALUE & this.Field590 + (int)a;
    }

    void Method3188(float a) {
        this.Field590 = (char)70;
        this.Field593 = a;
        this.Field599 = Integer.MAX_VALUE & this.Field590 + (int)a;
    }

    void Method3189(double a) {
        this.Field590 = (char)68;
        this.Field594 = a;
        this.Field599 = Integer.MAX_VALUE & this.Field590 + (int)a;
    }

    void Method3190(char a, String a2, String a3, String a4) {
        this.Field590 = a;
        this.Field595 = a2;
        this.Field596 = a3;
        this.Field597 = a4;
        switch (a) {
            case 'C': 
            case 'S': 
            case 's': 
            case 't': {
                this.Field599 = Integer.MAX_VALUE & a + a2.hashCode();
                return;
            }
            case 'T': {
                this.Field599 = Integer.MAX_VALUE & a + a2.hashCode() * a3.hashCode();
                return;
            }
        }
        this.Field599 = Integer.MAX_VALUE & a + a2.hashCode() * a3.hashCode() * a4.hashCode();
    }

    void Method3191(String a, String a2, Class279 a3, Object[] a4) {
        this.Field590 = (char)121;
        this.Field595 = a;
        this.Field596 = a2;
        this.Field597 = a3;
        this.Field598 = a4;
        int a5 = 121 + a.hashCode() * a2.hashCode() * a3.Method2825();
        for (int a6 = 0; a6 < a4.length; ++a6) {
            a5 *= a4[a6].Method3430();
        }
        this.Field599 = Integer.MAX_VALUE & a5;
    }

    void Method3192(Class169 a) {
        String[] stringArray = Class690.Method2342();
        switch (this.Field590) {
            case 'I': {
                a.Method1505(new Integer(this.Field591));
            }
            case 'J': {
                a.Method1505(new Long(this.Field592));
            }
            case 'F': {
                a.Method1505(new Float(this.Field593));
            }
            case 'D': {
                a.Method1505(new Double(this.Field594));
            }
            case 'S': {
                a.Method1505(this.Field595);
            }
            case 's': {
                a.Method1506(this.Field595);
            }
            case 'C': {
                a.Method1508(this.Field595);
            }
            case 'T': {
                a.Method1524(this.Field595, this.Field596);
            }
            case 'G': {
                a.Method1516(this.Field595, this.Field596, (String)this.Field597);
            }
            case 'M': {
                a.Method1518(this.Field595, this.Field596, (String)this.Field597, false);
            }
            case 'N': {
                a.Method1518(this.Field595, this.Field596, (String)this.Field597, true);
            }
            case 'y': {
                a.Method1514(this.Field595, this.Field596, (Class279)this.Field597, this.Field598);
            }
            case 't': {
                a.Method1510(this.Field595);
            }
        }
        a.Method1512(this.Field590 - 104 + 1, this.Field595, this.Field596, (String)this.Field597);
    }

    public boolean Method3193(Object a) {
        if (!(a instanceof Class52)) {
            return false;
        }
        Class52 a2 = (Class52)a;
        if (a2.Field590 == this.Field590) {
            switch (this.Field590) {
                case 'I': {
                    return a2.Field591 == this.Field591;
                }
                case 'J': {
                    return a2.Field592 == this.Field592;
                }
                case 'F': {
                    return Float.compare((float)a2.Field593, (float)this.Field593) == 0;
                }
                case 'D': {
                    return Double.compare((double)a2.Field594, (double)this.Field594) == 0;
                }
                case 'C': 
                case 'S': 
                case 's': 
                case 't': {
                    return a2.Field595.equals((Object)this.Field595);
                }
                case 'T': {
                    return a2.Field595.equals((Object)this.Field595) && a2.Field596.equals((Object)this.Field596);
                }
                case 'y': {
                    return a2.Field595.equals((Object)this.Field595) && a2.Field596.equals((Object)this.Field596) && a2.Field597.Method3429(this.Field597) && Arrays.equals((Object[])a2.Field598, (Object[])this.Field598);
                }
            }
            return a2.Field595.equals((Object)this.Field595) && a2.Field596.equals((Object)this.Field596) && a2.Field597.Method3429(this.Field597);
        }
        return false;
    }

    public int Method3194() {
        return this.Field599;
    }
}