package design.pattern;
// Created by ZG on 15/7/21.
// 

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Test {
    public static void main(String[] args) {

        // 饿汉模式
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1==s2){
            System.out.println("同一个实例");
        }else{
            System.out.println("不是同一个实例");
        }

        // 懒汉模式
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        if(s3==s4){
            System.out.println("同一个实例");
        }else{
            System.out.println("不是同一个实例");
        }

        // 工厂模式
        Human boy = HumanFactory.createHuman("boy");
        boy.Talk();
        boy.Walk();
        Human girl = HumanFactory.createHuman("girl");
        girl.Talk();
        girl.Walk();

        // 标准库中的工厂模式：getInstance()方法会返回不同的Calendar（日历）对象
        System.out.println(Calendar.getInstance());
        System.out.println(Calendar.getInstance(TimeZone.getDefault()));
        System.out.println(Calendar.getInstance(Locale.CANADA));
        System.out.println(Calendar.getInstance(TimeZone.getDefault(), Locale.CANADA));
        System.out.println(NumberFormat.getInstance());
        System.out.println(NumberFormat.getInstance(Locale.CANADA));

    }
}
