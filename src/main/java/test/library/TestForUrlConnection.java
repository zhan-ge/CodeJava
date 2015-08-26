package test.library;
// Created by ZG on 15/8/26.
//

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class TestForUrlConnection {
    public static void main(String[] args) {
        try {

            URL obj = new URL("http://www.qiyadeng.com");
//            URL obj = new URL("http://www.hinews.cn/news/system/2015/08/18/017770842.shtml");
            URLConnection conn = obj.openConnection();
            Map<String, List<String>> map = conn.getHeaderFields();

            System.out.println("显示响应Header信息\n");

            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println("Key : " + entry.getKey() +
                        " ,Value : " + entry.getValue());
            }

            System.out.println("\n使用key获得响应Header信息 \n");
            List<String> server = map.get("Server");

            if (server == null) {
                System.out.println("Key 'Server' is not found!");
            } else {
                for (String values : server) {
                    System.out.println(values);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
