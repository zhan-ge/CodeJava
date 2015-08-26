package test.basics;// Created by ZG on 15/6/29.
// 

public class CallingMethodsInSameClass {
    public static void main(String[] args) {
        printOne();
        printOne();
        printTwo();
    }

    public static void printOne(){
        System.out.println("test one");
    }

    public static void printTwo(){
        printOne();
        printOne();
    }
}
