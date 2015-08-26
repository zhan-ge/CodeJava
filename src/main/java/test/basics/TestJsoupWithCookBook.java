package test.basics;// Created by ZG on 15/7/19.
// 

import org.jsoup.*;
import org.jsoup.nodes.*;

public class TestJsoupWithCookBook {
    public static void main(String[] args) throws java.io.IOException{

        String html = "<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>";
        Document doc = Jsoup.parse(html);
        System.out.println(doc);

        Document doc_1 = Jsoup.parseBodyFragment(html);
        Element body = doc_1.body();
        System.out.println("body = " + body);


        String url = "http://www.baidu.com";
        Document doc_2 = Jsoup.connect(url).userAgent("Mozilla").get();
        System.out.println("doc_2.title() = " + doc_2.title());

    }
}
