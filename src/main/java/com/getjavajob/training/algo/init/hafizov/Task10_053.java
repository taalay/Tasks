package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 17.07.2015.
 */
public class Task10_053 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrInput(arr, arr.length));//9 8 7 6 5 4 3 2 1
    }

    public static String arrInput(int[] arr, int size) {
        String result = "";
        if (size == 0) {
            result += "";
        } else {
            result += arr[size - 1];
            result += arrInput(arr, size - 1);
        }
        return result;
    }
}
