package test.library;
// Created by ZG on 15/8/26.
//

import org.apache.http.HttpEntity;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class TestForApacheHttpClient {
    public static void main(String[] args) throws Exception{
        String url = "http://www.hinews.cn/news/system/2015/08/18/017770842.shtml";
//        String url = "http://www.xilu.com/news/jixiantiaozhanyanbo_2.html";

        CloseableHttpClient httpclient = HttpClients.createDefault();
        CookieStore cookieStore = new BasicCookieStore();
        HttpClientContext localContext = HttpClientContext.create();
        localContext.setCookieStore(cookieStore);

        try {
            HttpGet httpget = new HttpGet(url);
            httpget.addHeader("User-Agent", "Mozilla/5.0");
            httpget.addHeader("Content-Type", "text/html;charset=UTF-8");
            String charset;

//            CookieStore httpCookieStore = new BasicCookieStore();
//            HttpClientBuilder builder = HttpClientBuilder.create().setDefaultCookieStore(httpCookieStore);

            System.out.println("Executing request " + httpget.getURI());
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                System.out.println("----------------------------------------");
                System.out.println("status = " + response.getStatusLine());

//                CookieStore cookieStore = httpClient.getCookieStore;
//                List<Cookie> cookies = cookieStore.getCookies();

//                System.out.println(httpCookieStore.getCookies());
                List<Cookie> cookies = cookieStore.getCookies();
                for (Cookie cooky : cookies) {
                    System.out.println("Local cookie: " + cooky);
                }

                response.getHeaders("Content");
                HttpEntity entity = response.getEntity();
                String result = "";
                if (entity != null) {
                    System.out.println(entity.getContentEncoding());

                    System.out.println(ContentType.getOrDefault(entity).getCharset());
                    if(ContentType.getOrDefault(entity).getCharset()!=null)
                        charset = ContentType.getOrDefault(entity).getCharset().name();
                    else
//                        charset = "GB2312";
                        charset = "GBK";
//                    {
//                        Pattern p = Pattern.compile("(?<=charset=)(.+)(?=\")");
//                        Matcher m = p.matcher(resultBuffer);
//                        if (m.find()){
//                            charset = m.group().toUpperCase();
//                            System.out.println(charset);
//                        }
//                        else
//                            charset = "GB2312";
//                    }

                    System.out.println("charset = " + charset);
                    result = EntityUtils.toString(entity, charset);
                }
                System.out.println(result);

                httpget.abort();
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }

//        Document document = Jsoup.parse(new URL(url).openStream(), "UTF8", url);
//        System.out.println(document.charset());
    }
}
