// Created by ZG on 15/6/29.
// 

public class Factorial {
    public static void main(String[] args) {
        final int NUM_FACTS = 10;
        for(int i=0; i<NUM_FACTS; i++){
            System.out.println(i + "! is " + factorial(i));
        }
    }

    public static int factorial(int n){
        int result = 1;
        for (int i=2; i<=n; i++){
            result *= i;
        }
        return  result;
    }
}
