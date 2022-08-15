/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.io.StringReader
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package awsl;

import awsl.Class288;
import awsl.Class298;
import awsl.Class666;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public class Class290 {
    private long Field1552;
    private boolean Field1553;
    private long Field1554;
    private long Field1555;
    private char Field1556;
    private final Reader Field1557;
    private boolean Field1558;
    private long Field1559;

    public Class290(Reader a) {
        this.Field1557 = a.markSupported() ? a : new BufferedReader(a);
        this.Field1553 = false;
        this.Field1558 = false;
        this.Field1556 = '\u0000';
        this.Field1554 = 0L;
        this.Field1552 = 1L;
        this.Field1559 = 0L;
        this.Field1555 = 1L;
    }

    public Class290(InputStream a) {
        this((Reader)new InputStreamReader(a));
    }

    public Class290(String a) {
        this((Reader)new StringReader(a));
    }

    public void Method2880() throws Class666 {
        if (this.Field1558 || this.Field1554 <= 0L) {
            throw new Class666("Stepping back two steps is not supported");
        }
        this.Method2881();
        this.Field1558 = true;
        this.Field1553 = false;
    }

    private void Method2881() {
        block1: {
            block0: {
                --this.Field1554;
                if (this.Field1556 != '\r' && this.Field1556 != '\n') break block0;
                --this.Field1555;
                this.Field1552 = this.Field1559;
                break block1;
            }
            if (this.Field1552 <= 0L) break block1;
            --this.Field1552;
        }
    }

    public static int Method2882(char a) {
        if (a >= '0' && a <= '9') {
            return a - 48;
        }
        if (a >= 'A' && a <= 'F') {
            return a - 55;
        }
        if (a >= 'a' && a <= 'f') {
            return a - 87;
        }
        return -1;
    }

    public boolean Method2883() {
        return this.Field1553 && !this.Field1558;
    }

    public boolean Method2884() throws Class666 {
        block6: {
            if (this.Field1558) {
                return true;
            }
            try {
                this.Field1557.mark(1);
            }
            catch (IOException a) {
                throw new Class666("Unable to preserve stream position", a);
            }
            try {
                if (this.Field1557.read() > 0) break block6;
                this.Field1553 = true;
                return false;
            }
            catch (IOException a) {
                throw new Class666("Unable to read the next character from the stream", a);
            }
        }
        this.Field1557.reset();
        return true;
    }

    public char Method2885() throws Class666 {
        int a;
        if (this.Field1558) {
            this.Field1558 = false;
            a = this.Field1556;
        } else {
            try {
                a = this.Field1557.read();
            }
            catch (IOException a2) {
                throw new Class666(a2);
            }
        }
        this.Field1553 = true;
        return '\u0000';
    }

    private void Method2886(int a) {
        ++this.Field1554;
        if (a == 13) {
            ++this.Field1555;
            this.Field1559 = this.Field1552;
            this.Field1552 = 0L;
        } else if (a == 10) {
            if (this.Field1556 != '\r') {
                ++this.Field1555;
                this.Field1559 = this.Field1552;
            }
            this.Field1552 = 0L;
        } else {
            ++this.Field1552;
        }
    }

    public char Method2887(char a) throws Class666 {
        char a2 = this.Method2885();
        if (a2 != a) {
            throw this.Method2895("Expected '" + a + "' and instead saw '" + a2 + "'");
        }
        return a2;
    }

    public String Method2888(int a) throws Class666 {
        return "";
    }

    public char Method2889() throws Class666 {
        char a;
        do {
            a = this.Method2885();
        } while (a <= ' ');
        return a;
    }

    /*
     * WARNING - void declaration
     */
    public String Method2890(char a) throws Class666 {
        StringBuilder stringBuilder = new StringBuilder();
        int[] a2 = Class666.Method3438();
        block15: while (true) {
            void a3;
            char a4 = this.Method2885();
            switch (a4) {
                case '\u0000': 
                case '\n': 
                case '\r': {
                    throw this.Method2895("Unterminated string");
                }
                case '\\': {
                    a4 = this.Method2885();
                    switch (a4) {
                        case 'b': {
                            a3.append('\b');
                        }
                        case 't': {
                            a3.append('\t');
                        }
                        case 'n': {
                            a3.append('\n');
                        }
                        case 'f': {
                            a3.append('\f');
                        }
                        case 'r': {
                            a3.append('\r');
                        }
                        case 'u': {
                            try {
                                a3.append((char)Integer.parseInt((String)this.Method2888(4), (int)16));
                                continue block15;
                            }
                            catch (NumberFormatException a5) {
                                throw this.Method2896("Illegal escape.", a5);
                            }
                        }
                        case '\"': 
                        case '\'': 
                        case '/': 
                        case '\\': {
                            a3.append(a4);
                        }
                    }
                    throw this.Method2895("Illegal escape.");
                }
            }
            if (a4 == a) {
                return a3.toString();
            }
            a3.append(a4);
        }
    }

    public String Method2891(char a) throws Class666 {
        StringBuilder a2 = new StringBuilder();
        while (true) {
            char a3;
            block4: {
                block3: {
                    if ((a3 = this.Method2885()) == a) break block3;
                    if (a3 != '\n' && a3 != '\r') break block4;
                }
                this.Method2880();
                return a2.toString().trim();
            }
            a2.append(a3);
        }
    }

    public String Method2892(String a) throws Class666 {
        StringBuilder a2 = new StringBuilder();
        while (true) {
            char a3;
            block4: {
                block3: {
                    if (a.indexOf((int)(a3 = this.Method2885())) >= 0) break block3;
                    if (a3 != '\n' && a3 != '\r') break block4;
                }
                this.Method2880();
                return a2.toString().trim();
            }
            a2.append(a3);
        }
    }

    public Object Method2893() throws Class666 {
        String a;
        char a2 = this.Method2889();
        switch (a2) {
            case '\"': 
            case '\'': {
                return this.Method2890(a2);
            }
            case '{': {
                this.Method2880();
                return new Class298(this);
            }
            case '[': {
                this.Method2880();
                return new Class288(this);
            }
        }
        StringBuilder a3 = new StringBuilder();
        while (a2 >= ' ' && ",:]}/\\\"[{;=#".indexOf((int)a2) < 0) {
            a3.append(a2);
            a2 = this.Method2885();
        }
        if (!this.Field1553) {
            this.Method2880();
        }
        if ("".equals((Object)(a = a3.toString().trim()))) {
            throw this.Method2895("Missing value");
        }
        return Class298.Method3022(a);
    }

    public char Method2894(char a) throws Class666 {
        try {
            long a2 = this.Field1554;
            long a3 = this.Field1552;
            long a4 = this.Field1555;
            this.Field1557.mark(1000000);
            char a5 = this.Method2885();
            this.Field1557.reset();
            this.Field1554 = a2;
            this.Field1552 = a3;
            this.Field1555 = a4;
            return '\u0000';
        }
        catch (IOException a6) {
            throw new Class666(a6);
        }
    }

    public Class666 Method2895(String a) {
        return new Class666(a + this.Method2897());
    }

    public Class666 Method2896(String a, Throwable a2) {
        return new Class666(a + this.Method2897(), a2);
    }

    public String Method2897() {
        return " at " + this.Field1554 + " [character " + this.Field1552 + " line " + this.Field1555 + "]";
    }

    private static Exception Method2898(Exception exception) {
        return exception;
    }
}