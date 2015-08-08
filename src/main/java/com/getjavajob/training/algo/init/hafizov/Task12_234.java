package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 19.07.2015.
 */
public class Task12_234 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {7, 5, 2, 1, 2, 3, 8},
                {4, 1, 1, 1, 2, 3, 8},
                {1, 3, 8, 1, 2, 3, 8},
                {1, 16, 1, 1, 2, 3, 8},
                {2, 5, 1, 1, 2, 3, 8},
        };

        int[][] a = delOfArr(arr, 4, 3);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] delOfArr(int[][] inArr, int col, int row) {
        int[][] arr = inArr;
        if (row == arr[0].length - 1) {//если передали последний столбец, то просто онулирукм столбец
            for (int j = 0; j < arr.length; j++) {
                arr[j][row] = 0;
            }
        } else {// иначе все сдвигаем
            for (int i = 0, j = row + 1; i < arr.length; i++, j++) {
                arr[i][row] = arr[i][row + 1];
                for (int r = row + 1; r < arr[0].length; r++) {
                    arr[i][r - 1] = arr[i][r];
                    arr[i][r] = 0;
                }
            }
        }

        if (col == arr.length - 1) {//если передали последнюю строку, то просто онулирукм строку
            for (int j = 0; j < arr[0].length; j++) {
                arr[col][j] = 0;
            }
        } else {// иначе все сдвигаем
            for (int i = 0, j = col + 1; i < arr[0].length; i++, j++) {
                arr[col][i] = arr[col + 1][i];
                for (int r = col + 1; r < arr.length; r++) {
                    arr[r - 1][i] = arr[r][i];
                    arr[r][i] = 0;
                }
            }
        }
        return arr;
    }

}
