// Created by ZG on 15/7/5.
// 

import java.util.Map;

public class ArrayExamples {
    public static void main(String[] args) {

    }

    // pre: list != null, list.length > 0
    // post: return index of mininum element of array
    public static int findMin(int[] list){
        assert list != null && list.length > 0: "Failed precondition.";

        int indexOfMin = 0;
        for(int i=1; i<list.length; i++){
            if (list[i] < list[indexOfMin]){
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    // pre: list != null, newSize >= 0
    // post: nothing. the method does not succeed it resizing the argument
    public static void badResize(int[] list, int newSize){
        assert list != null && newSize >= 0: "Failed precondition.";

        int[] temp = new int[newSize];
        int limit = Math.min(list.length, newSize);

        for(int i=0; i<limit; i++){
            temp[i] = list[i];
        }

        list = temp;
    }
}
