package com.getjavajob.training.algo.init.hafizov;

import java.util.Arrays;

/**
 * Created by admin on 19.07.2015.
 */
public class Task12_028 {
    public static void main(String[] args) {
        int[][] arr = spiral();
        int[][] arr2 = new int[][]{
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };

        for (int[] anArr : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + anArr[j]);
            }
            System.out.println();
        }
    }

    public static int[][] spiral() {
        int size = 5;
        int[][] arr = new int[5][5];
        int i = 1;
        int p = size / 2;
        for (int k = 1; k <= p; k++) {
            for (int j = k - 1; j < size - k + 1; j++) {
                arr[k - 1][j] = i++;
            }
            for (int j = k; j < size - k + 1; j++) {
                arr[j][size - k] = i++;
            }
            for (int j = size - k - 1; j >= k - 1; --j) {
                arr[size - k][j] = i++;
            }
            for (int j = size - k - 1; j >= k; j--) {
                arr[j][k - 1] = i++;
            }
        }
        if (size % 2 == 1) {
            arr[p][p] = size * size;
        }
        return arr;
    }
}
