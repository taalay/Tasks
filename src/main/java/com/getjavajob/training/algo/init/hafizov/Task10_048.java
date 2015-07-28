package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 17.07.2015.
 */
public class Task10_048 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 8, 10, 5, 4, 3, 7, 4};//10
        System.out.println(maxOfArr(arr, arr.length));
    }

    public static int maxOfArr(int[] arr, int size) {
        if (size <= 1) {
            return arr[0];
        } else {
            return Math.max(arr[size - 1], maxOfArr(arr, size - 1));
        }
    }
}
