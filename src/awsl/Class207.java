/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 */
package awsl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Class207 {
    private String Field1178;
    private List Field1179 = new ArrayList();
    private List Field1180 = new ArrayList();
    private HashMap Field1181 = new HashMap();
    private List Field1182 = new ArrayList();
    private static String[] Field1183;

    public Class207(String a) {
        this.Field1178 = a;
    }

    public String Method2419() {
        return this.Field1178;
    }

    public List Method2420() {
        return this.Field1179;
    }

    public List Method2421() {
        return this.Field1180;
    }

    public HashMap Method2422() {
        return this.Field1181;
    }

    public List Method2423() {
        return this.Field1182;
    }

    public void Method2424(String a) {
        this.Field1178 = a;
    }

    public void Method2425(List a) {
        this.Field1179 = a;
    }

    public void Method2426(List a) {
        this.Field1180 = a;
    }

    public void Method2427(HashMap a) {
        this.Field1181 = a;
    }

    public void Method2428(List a) {
        this.Field1182 = a;
    }

    public boolean Method2429(Object a) {
        String[] a2 = Class207.Method2434();
        if (a == this) {
            return true;
        }
        if (!(a instanceof Class207)) {
            return false;
        }
        Class207 a3 = (Class207)a;
        if (!a3.Method2430(this)) {
            return false;
        }
        String a4 = this.Method2419();
        String a5 = a3.Method2419();
        if (a4.Method3429((Object)a5)) {
        }
        return false;
    }

    protected boolean Method2430(Object a) {
        return a instanceof Class207;
    }

    public int Method2431() {
        int a = 59;
        int a2 = 1;
        String a3 = this.Method2419();
        a2 = a2 * 59 + 43;
        List a4 = this.Method2420();
        a2 = a2 * 59 + 43;
        List a5 = this.Method2421();
        a2 = a2 * 59 + 43;
        HashMap a6 = this.Method2422();
        a2 = a2 * 59 + 43;
        List a7 = this.Method2423();
        a2 = a2 * 59 + 43;
        return a2;
    }

    public String Method2432() {
        return "Preset(name=" + this.Method2419() + ", activatedModules=" + this.Method2420() + ", banModules=" + this.Method2421() + ", bindMap=" + this.Method2422() + ", settings=" + this.Method2423() + ")";
    }

    public static void Method2433(String[] stringArray) {
        Field1183 = stringArray;
    }

    public static String[] Method2434() {
        return Field1183;
    }

    static {
        Class207.Method2433(new String[5]);
    }
}