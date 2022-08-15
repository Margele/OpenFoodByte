/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.net.InetAddress
 *  java.net.Socket
 *  java.net.UnknownHostException
 *  java.util.concurrent.CompletableFuture
 */
package awsl;

import awsl.Class752;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.CompletableFuture;

public class Class750
extends Thread {
    private static int Field3281 = 6868;
    private Class752 Field3282;

    public Class750() {
        if (!this.Method1616(Field3281)) {
            Class752 a = new Class752(this, Field3281);
            CompletableFuture.runAsync(() -> Class750.Method1618(a));
        }
        System.out.println("\u5835\u585e\u6d4b\u8bd5");
    }

    public boolean Method1616(int a) {
        boolean a2 = true;
        try {
            a2 = this.Method1617("127.0.0.1", a);
        }
        catch (Exception a3) {
            a3.printStackTrace();
        }
        return a2;
    }

    public boolean Method1617(String a, int a2) throws UnknownHostException {
        boolean a3 = false;
        InetAddress a4 = InetAddress.getByName((String)a);
        try {
            Socket a5 = new Socket(a4, a2);
            a3 = true;
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return a3;
    }

    private static void Method1618(Class752 a) {
        a.Method1339();
    }
}