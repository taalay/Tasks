package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 18.07.2015.
 */
public class Task11_245 {
    public static void main(String[] args) {
        int[] arr = {-8, 5, 7, -1, -9, 7, 5, 7, 1, 2, 6, -4};
        for (int i : negativeNumbersFirst(arr)) {
            System.out.print(i + " ");//-8 -1 -9 -4 6 2 1 7 5 7 7 5
        }
    }

    public static int[] negativeNumbersFirst(int[] arr) {
        int[] temp = new int[arr.length];
        int tempIndex = 0;
        int j = arr.length - 1; // массив с конца
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[tempIndex] = arr[i];
                tempIndex++;
            } else {
                temp[j] = arr[i];
                j--;
            }
        }
        return temp;
    }
}
