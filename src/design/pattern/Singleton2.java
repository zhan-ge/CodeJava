package design.pattern;
// Created by ZG on 15/7/21.
// 单例模式：懒汉模式
// 区别：
// 饿汉模式：加载类时比较慢，运行时获取对象的速度比较快，线程安全
// 懒汉模式：加载类时比较快，运行时获取对象的速度比较慢，线程不安全

public class Singleton2 {
    // 1、将构造方法私有化，外部无法直接创建类的实例
    private Singleton2(){}

    // 2、仅仅是声明而不是创建类的唯一实例，私有静态成员，类加载的时候并没有创建实例，只有第一个用户来获取时才会创建实例
    private static Singleton2 instance;

    // 3、提供一个用于获取唯一实例的方法
    public static Singleton2 getInstance(){
        // 判断实例是否为空，为空的话首先创建，否则直接返回已有的实例
        if(instance==null){
            instance = new Singleton2();
        }
        return instance;
    }
}
