package test.basics;// Created by ZG on 15/7/4.
// 

public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;

        // allocate triangular array

        int[][] odds = new int [NMAX + 1][];
        for (int i=0;i<=NMAX;i++){
            odds[i] = new int[i+1];
        }

        // fill triangular array

        for(int i=0;i<=odds.length; i++){
            for(int k = 0; k<=odds[i].length; k++){
                int lotteryOdds = 1;
                for(int n=1;n<=k;n++){
                    lotteryOdds = lotteryOdds*(i-n+1)/n;
                }
                odds[i][k] = lotteryOdds;
            }
        }

        for(int[] row: odds){
            for(int odd: row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}
