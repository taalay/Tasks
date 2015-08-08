package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 18.07.2015.
 */
public class Task12_023 {
    public static void main(String[] args) {
        showArr(arrOfA());
        System.out.println();
        showArr(arrOfB());
        System.out.println();
        showArr(arrOfV());

    }

    public static int[][] arrOfA() {//
        int[][] temp = new int[7][7];
        for (int a = 0, b = temp.length - 1; a < temp.length; a++, b--) {
            temp[a][a] = 1;
            temp[a][b] = 1;
        }
        return temp;
    }

    public static int[][] arrOfB() {//
        int[][] temp = new int[7][7];
        for (int a = 0, b = temp.length - 1; a < temp.length; a++, b--) {
            temp[a][a] = 1;
            temp[a][b] = 1;
            temp[a][3] = 1;
            if (a == 3) {
                for (int r = 0; r < temp.length; r++) {
                    temp[a][r] = 1;
                }
            }
        }
        return temp;
    }

    public static int[][] arrOfV() {//
        int[][] temp = new int[7][7];
        for (int a = 0; a < temp.length; a++) {
            for (int j = a; j < temp.length - a; j++) {
                temp[a][j] = 1;
            }
        }

        for (int a = 4, b = 2; a < temp.length; a++, b--) {
            for (int j = b; j < temp.length - b; j++) {
                temp[a][j] = 1;
            }
        }

        return temp;
    }

    public static void showArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
