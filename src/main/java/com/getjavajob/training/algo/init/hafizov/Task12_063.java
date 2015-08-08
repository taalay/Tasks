package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 19.07.2015.
 */
public class Task12_063 {

    public static void main(String[] args) {
        int[][] schoolboysArr = {
                {13, 18, 14, 17},
                {14, 17, 13, 15},
                {15, 13, 14, 17},
                {14, 17, 13, 15},
                {15, 18, 14, 13},
                {17, 15, 13, 15},
                {15, 18, 14, 17},
                {14, 19, 13, 17},
                {14, 15, 13, 15},
                {15, 18, 14, 17},
                {14, 17, 13, 15}
        };

        int[] sum = schoolboys(schoolboysArr);
        for (int i = 0; i < sum.length; i++) {
            System.out.println("Class " + (i + 1) + " - among " + sum[i] + " schoolboys");
        }
    }

    public static int[] schoolboys(int[][] arr) {
        int[] sum = new int[11];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum[i] += arr[i][j];
            }

        }
        return sum;
    }
}
