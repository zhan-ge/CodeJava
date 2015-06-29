// Created by ZG on 15/6/29.
// 

public class EnhancedFor {
    public static void main(String[] args) {

    }

    // pre: list != null
    // post: return sum of elements
    // uses enhanced for loop
    public static int sumListEnhanced(int[] list){
        int total = 0;
        for(int val: list){
            total += val;
        }
        return total;
    }

    // pre: list != null
    // post: return sum of elements
    // use traditional for loop
    public static int sumListOld(int[] list){
        int total = 0;
        for(int i=0; i<list.length; i++){
            total += list[i];
            System.out.println(list[i]);
        }
        return total;
    }
}
