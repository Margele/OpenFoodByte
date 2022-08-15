/*
 * Decompiled with CFR 0.1.0 (FabricMC a830a72d).
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  org.apache.commons.io.IOUtils
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClients
 */
package awsl;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import trash.foodbyte.module.GlobalModule;
import trash.foodbyte.utils.RenderUtils;

public class Class367 {
    public static String Field1732 = "6ca3ac79-2046-4016-8754-c7f91a2d0228";

    public static String Method676(String a) {
        String a2 = "https://api.antisniper.net/denick?nick=" + a;
        System.err.println(a2);
        CloseableHttpClient a3 = HttpClients.createDefault();
        HttpGet a4 = new HttpGet(a2);
        a4.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
        a4.setHeader("xf-api-key", Field1732);
        String a5 = "null";
        CloseableHttpResponse a6 = a3.execute((HttpUriRequest)a4);
        Throwable throwable = null;
        try {
            a5 = IOUtils.toString((InputStream)a6.getEntity().getContent(), (Charset)StandardCharsets.UTF_8);
            return a5;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String Method677(String a, String a2) {
        void a3;
        String string = "https://hypixel.net/api/players/" + a + "/ban/" + a2.replace((CharSequence)"#", (CharSequence)"");
        int[] nArray = RenderUtils.Method1148();
        System.err.println((String)a3);
        int[] a4 = nArray;
        CloseableHttpClient a5 = HttpClients.createDefault();
        HttpGet a6 = new HttpGet((String)a3);
        a6.setHeader("user-agent", "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Mobile Safari/537.36");
        a6.setHeader("xf-api-key", GlobalModule.Field3167);
        String a7 = "null";
        CloseableHttpResponse a8 = a5.execute((HttpUriRequest)a6);
        Throwable throwable = null;
        try {
            a7 = IOUtils.toString((InputStream)a8.getEntity().getContent(), (Charset)StandardCharsets.UTF_8);
            return a7;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
        }
    }

    private static Throwable Method678(Throwable throwable) {
        return throwable;
    }
}