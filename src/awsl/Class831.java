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
import awsl.Class730;
import obfuscate.a;
import obfuscate.b;
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

    protected final Object Method3651(String a2, String a3) throws SAXException {
        Object a4 = null;
        if ("Ljava/lang/String;".equals((Object)a2)) {
            a4 = this.Method3653(a3);
        } else if ("Ljava/lang/Integer;".equals((Object)a2) || "I".equals((Object)a2) || "S".equals((Object)a2) || "B".equals((Object)a2) || "C".equals((Object)a2) || "Z".equals((Object)a2)) {
            a4 = new Integer(a3);
        } else if ("Ljava/lang/Short;".equals((Object)a2)) {
            a4 = new Short(a3);
        } else if ("Ljava/lang/Byte;".equals((Object)a2)) {
            a4 = new Byte(a3);
        } else if ("Ljava/lang/Character;".equals((Object)a2)) {
            a4 = new Character(this.Method3653(a3).charAt(0));
        } else if ("Ljava/lang/Boolean;".equals((Object)a2)) {
            a4 = Boolean.valueOf((String)a3);
        } else if ("Ljava/lang/Long;".equals((Object)a2) || "J".equals((Object)a2)) {
            a4 = new Long(a3);
        } else if ("Ljava/lang/Float;".equals((Object)a2) || "F".equals((Object)a2)) {
            a4 = new Float(a3);
        } else if ("Ljava/lang/Double;".equals((Object)a2) || "D".equals((Object)a2)) {
            a4 = new Double(a3);
        } else if (b.Method3229(b.class).equals((Object)a2)) {
            a4 = b.Method3204(a3);
        } else if (b.Method3229(Class279.class).equals((Object)a2)) {
            a4 = this.Method3652(a3);
        } else {
            throw new SAXException("Invalid value:" + a3 + " desc:" + a2 + " ctx:" + this);
        }
        return a4;
    }

    Class279 Method3652(String a2) throws SAXException {
        try {
            int a3 = a2.indexOf(46);
            int a4 = a2.indexOf(40, a3 + 1);
            int a5 = a2.lastIndexOf(40);
            int a6 = Integer.parseInt((String)a2.substring(a5 + 1, a2.length() - 1));
            String a7 = a2.substring(0, a3);
            String a8 = a2.substring(a3 + 1, a4);
            String a9 = a2.substring(a4, a5 - 1);
            return new Class279(a6, a7, a8, a9);
        }
        catch (RuntimeException a10) {
            throw new SAXException("Malformed handle " + a2, (Exception)a10);
        }
    }

    private final String Method3653(String a2) throws SAXException {
        StringBuffer a3;
        block5: {
            char a4;
            int a5;
            block6: {
                block7: {
                    a3 = new StringBuffer(a2.length());
                    int[] a6 = Class831.Method3658();
                    try {
                        a5 = 0;
                        if (a5 >= a2.length()) break block5;
                        a4 = a2.charAt(a5);
                        if (a4 != '\\') break block6;
                        if ((a4 = a2.charAt(++a5)) != '\\') break block7;
                        a3.append('\\');
                    }
                    catch (RuntimeException a7) {
                        throw new SAXException((Exception)a7);
                    }
                }
                a3.append((char)Integer.parseInt((String)a2.substring(++a5, a5 + 4), (int)16));
                a5 += 3;
            }
            a3.append(a4);
            ++a5;
        }
        return a3.toString();
    }

    protected final Class264 Method3654(Object a2) {
        Class264 a3 = (Class264)this.Field3688.Field3203.Method2665(a2);
        a3 = new Class264();
        this.Field3688.Field3203.put(a2, (Object)a3);
        return a3;
    }

    protected final Class267 Method3655() {
        return (Class267)this.Field3688.Method1963();
    }

    protected final int Method3656(String a2) {
        int a3;
        block20: {
            a3 = 0;
            int[] a4 = Class831.Method3658();
            if (a2.indexOf("public") != -1) {
                a3 |= 1;
            }
            if (a2.indexOf("private") != -1) {
                a3 |= 2;
            }
            if (a2.indexOf("protected") != -1) {
                a3 |= 4;
            }
            if (a2.indexOf("static") != -1) {
                a3 |= 8;
            }
            if (a2.indexOf("final") != -1) {
                a3 |= 0x10;
            }
            if (a2.indexOf("super") != -1) {
                a3 |= 0x20;
            }
            if (a2.indexOf("synchronized") != -1) {
                a3 |= 0x20;
            }
            if (a2.indexOf("volatile") != -1) {
                a3 |= 0x40;
            }
            if (a2.indexOf("bridge") != -1) {
                a3 |= 0x40;
            }
            if (a2.indexOf("varargs") != -1) {
                a3 |= 0x80;
            }
            if (a2.indexOf("transient") != -1) {
                a3 |= 0x80;
            }
            if (a2.indexOf("native") != -1) {
                a3 |= 0x100;
            }
            if (a2.indexOf("interface") != -1) {
                a3 |= 0x200;
            }
            if (a2.indexOf("abstract") != -1) {
                a3 |= 0x400;
            }
            if (a2.indexOf("strict") != -1) {
                a3 |= 0x800;
            }
            if (a2.indexOf("synthetic") != -1) {
                a3 |= 0x1000;
            }
            if (a2.indexOf("annotation") != -1) {
                a3 |= 0x2000;
            }
            if (a2.indexOf("enum") != -1) {
                a3 |= 0x4000;
            }
            if (a2.indexOf("deprecated") != -1) {
                a3 |= 0x20000;
            }
            if (a2.indexOf("mandated") != -1) {
                a3 |= 0x8000;
            }
            if (a.trash() != null) break block20;
            Class831.Method3657(new int[4]);
        }
        return a3;
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