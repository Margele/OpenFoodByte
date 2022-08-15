/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuffer
 *  org.xml.sax.Attributes
 *  org.xml.sax.SAXException
 */
package awsl;

import awsl.Class264;
import awsl.Class267;
import awsl.Class279;
import awsl.Class46;
import awsl.Class730;
import awsl.Class91;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public abstract class Class831 {
    final Class730 Field3688;
    private static int[] Field3689;

    protected Class831(Class730 a) {
        this.Field3688 = a;
    }

    public void Method3501(String a, Attributes a2) throws SAXException {
    }

    public void Method3514(String a) {
    }

    protected final Object Method3651(String a, String a2) throws SAXException {
        Object a3 = null;
        if ("Ljava/lang/String;".equals((Object)a)) {
            a3 = this.Method3653(a2);
        } else if ("Ljava/lang/Integer;".equals((Object)a) || "I".equals((Object)a) || "S".equals((Object)a) || "B".equals((Object)a) || "C".equals((Object)a) || "Z".equals((Object)a)) {
            a3 = new Integer(a2);
        } else if ("Ljava/lang/Short;".equals((Object)a)) {
            a3 = new Short(a2);
        } else if ("Ljava/lang/Byte;".equals((Object)a)) {
            a3 = new Byte(a2);
        } else if ("Ljava/lang/Character;".equals((Object)a)) {
            a3 = new Character(this.Method3653(a2).charAt(0));
        } else if ("Ljava/lang/Boolean;".equals((Object)a)) {
            a3 = Boolean.valueOf((String)a2);
        } else if ("Ljava/lang/Long;".equals((Object)a) || "J".equals((Object)a)) {
            a3 = new Long(a2);
        } else if ("Ljava/lang/Float;".equals((Object)a) || "F".equals((Object)a)) {
            a3 = new Float(a2);
        } else if ("Ljava/lang/Double;".equals((Object)a) || "D".equals((Object)a)) {
            a3 = new Double(a2);
        } else if (Class46.Method3229(Class46.class).equals((Object)a)) {
            a3 = Class46.Method3204(a2);
        } else if (Class46.Method3229(Class279.class).equals((Object)a)) {
            a3 = this.Method3652(a2);
        } else {
            throw new SAXException("Invalid value:" + a2 + " desc:" + a + " ctx:" + this);
        }
        return a3;
    }

    Class279 Method3652(String a) throws SAXException {
        try {
            int a2 = a.indexOf(46);
            int a3 = a.indexOf(40, a2 + 1);
            int a4 = a.lastIndexOf(40);
            int a5 = Integer.parseInt((String)a.substring(a4 + 1, a.length() - 1));
            String a6 = a.substring(0, a2);
            String a7 = a.substring(a2 + 1, a3);
            String a8 = a.substring(a3, a4 - 1);
            return new Class279(a5, a6, a7, a8);
        }
        catch (RuntimeException a9) {
            throw new SAXException("Malformed handle " + a, (Exception)a9);
        }
    }

    private final String Method3653(String a) throws SAXException {
        StringBuffer a2;
        block5: {
            char a3;
            int a4;
            block6: {
                block7: {
                    a2 = new StringBuffer(a.length());
                    int[] a5 = Class831.Method3658();
                    try {
                        a4 = 0;
                        if (a4 >= a.length()) break block5;
                        a3 = a.charAt(a4);
                        if (a3 != '\\') break block6;
                        if ((a3 = a.charAt(++a4)) != '\\') break block7;
                        a2.append('\\');
                    }
                    catch (RuntimeException a6) {
                        throw new SAXException((Exception)a6);
                    }
                }
                a2.append((char)Integer.parseInt((String)a.substring(++a4, a4 + 4), (int)16));
                a4 += 3;
            }
            a2.append(a3);
            ++a4;
        }
        return a2.toString();
    }

    protected final Class264 Method3654(Object a) {
        Class264 a2 = (Class264)this.Field3688.Field3203.Method2665(a);
        a2 = new Class264();
        this.Field3688.Field3203.put(a, (Object)a2);
        return a2;
    }

    protected final Class267 Method3655() {
        return (Class267)this.Field3688.Method1963();
    }

    protected final int Method3656(String a) {
        int a2;
        block20: {
            a2 = 0;
            int[] a3 = Class831.Method3658();
            if (a.indexOf("public") != -1) {
                a2 |= 1;
            }
            if (a.indexOf("private") != -1) {
                a2 |= 2;
            }
            if (a.indexOf("protected") != -1) {
                a2 |= 4;
            }
            if (a.indexOf("static") != -1) {
                a2 |= 8;
            }
            if (a.indexOf("final") != -1) {
                a2 |= 0x10;
            }
            if (a.indexOf("super") != -1) {
                a2 |= 0x20;
            }
            if (a.indexOf("synchronized") != -1) {
                a2 |= 0x20;
            }
            if (a.indexOf("volatile") != -1) {
                a2 |= 0x40;
            }
            if (a.indexOf("bridge") != -1) {
                a2 |= 0x40;
            }
            if (a.indexOf("varargs") != -1) {
                a2 |= 0x80;
            }
            if (a.indexOf("transient") != -1) {
                a2 |= 0x80;
            }
            if (a.indexOf("native") != -1) {
                a2 |= 0x100;
            }
            if (a.indexOf("interface") != -1) {
                a2 |= 0x200;
            }
            if (a.indexOf("abstract") != -1) {
                a2 |= 0x400;
            }
            if (a.indexOf("strict") != -1) {
                a2 |= 0x800;
            }
            if (a.indexOf("synthetic") != -1) {
                a2 |= 0x1000;
            }
            if (a.indexOf("annotation") != -1) {
                a2 |= 0x2000;
            }
            if (a.indexOf("enum") != -1) {
                a2 |= 0x4000;
            }
            if (a.indexOf("deprecated") != -1) {
                a2 |= 0x20000;
            }
            if (a.indexOf("mandated") != -1) {
                a2 |= 0x8000;
            }
            if (Class91.Method3648() != null) break block20;
            Class831.Method3657(new int[4]);
        }
        return a2;
    }

    public static void Method3657(int[] nArray) {
        Field3689 = nArray;
    }

    public static int[] Method3658() {
        return Field3689;
    }

    private static Exception Method3659(Exception exception) {
        return exception;
    }

    static {
        Class831.Method3657(new int[1]);
    }
}