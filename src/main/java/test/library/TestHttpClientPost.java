package test.library;
// Created by ZG on 15/9/1.
// 

import java.net.URI;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.*;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestHttpClientPost {

    public static void main(String[] args) throws Exception {
        BasicCookieStore cookieStore = new BasicCookieStore();
        CloseableHttpClient httpclient = HttpClients.custom()
                .setDefaultCookieStore(cookieStore)
                .build();

        HttpUriRequest login = RequestBuilder.post()
                .setUri(new URI("https://login.weibo.cn/login/?rand=188393687&backURL=http%3A%2F%2Fm.weibo.cn%2F&backTitle=%E6%89%8B%E6%9C%BA%E6%96%B0%E6%B5%AA%E7%BD%91&vt=4"))
                .addParameter("mobile", "11111")
                .addParameter("password_5121", "1111")
                .addHeader("User-Agent", "Mozilla/5.0 (Linux; U; Android 4.3; en-us; SM-N900T Build/JSS15J) AppleWebKit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30")
                .build();
        CloseableHttpResponse response1 = httpclient.execute(login);

        try {
            HttpEntity entity = response1.getEntity();

            System.out.println("Login form post: " + response1.getStatusLine());
            EntityUtils.consume(entity);

            System.out.println("Initial set of cookies:");
            List<Cookie> cookies = cookieStore.getCookies();
            if (cookies.isEmpty()) {
                System.out.println("None");
            } else {
                for (Cookie cooky : cookies) {
                    System.out.println("- " + cooky.toString());
                }
            }
        } finally {
            response1.close();
        }
    }

}

