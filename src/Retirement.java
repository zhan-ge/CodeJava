// Created by ZG on 15/7/4.
// 

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retrie?");
        double goal = in.nextDouble();

        System.out.print("Hou much money will you retrie every year?");
        double payment = in.nextDouble();

        System.out.print("Insert rate in %: ");
        double insertRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        // update account balance while goal isn't reached
        while(balance < goal){
            // add this year's payment and interest
            balance += payment;
            double interest = balance * insertRate / 100;
            balance += interest;
            years ++;
        }

        System.out.println("You can retrie in " + years + " years.");
    }
}
