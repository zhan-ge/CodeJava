package test.basics;// Created by ZG on 15/7/4.
// 

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        // get first input
        System.out.print("What's your first name?");
        String name = in.nextLine();

        // get second input
        System.out.print("What's your second age?");
        int age = in.nextInt();

        // display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
        System.out.printf("Hello, %s. Next year, you'll be %d", name, age+1);
    }
}
