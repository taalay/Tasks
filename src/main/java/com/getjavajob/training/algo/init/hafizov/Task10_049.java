package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 17.07.2015.
 */
public class Task10_049 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 13, 10, 5, 4, 3, 7, 40};
        System.out.println(maxIndexOfArr(arr, arr.length));
    }

    public static int maxIndexOfArr(int[] arr, int size) {//индекс начинаеться с 1
        if (isMax(arr, arr[size - 1])) {
            return size;
        }
        return maxIndexOfArr(arr, size - 1);
    }

    private static boolean isMax(int[] arr, int in) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > in)
                return false;
        }
        return true;
    }
}


