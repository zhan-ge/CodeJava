package design.pattern;
// Created by ZG on 15/7/21.
// 单例模式Singleton
// 应用场合：有些对象只需要一个就够了，比如工具类、缓存、线程池
// 作用：保证整个应用程序中某个实例只有一个
// 类型：饿汉模式、懒汉模式

public class Singleton {
    // 1、将构造方法私有化，外部无法直接创建类的实例
    private Singleton(){}

    // 2、创建类的唯一实例，私有静态成员，属于类所有，类被加载的时候创建创建实例，主动创建属于饿汉模式
    private static Singleton instance = new Singleton();

    // 3、提供一个用于获取唯一实例的方法
    public static Singleton getInstance(){
        return instance;
    }
}
