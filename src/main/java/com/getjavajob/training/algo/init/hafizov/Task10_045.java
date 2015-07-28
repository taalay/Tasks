package com.getjavajob.training.algo.init.hafizov;

/**
 * НЕ доделан
 */
public class Task10_045 {
    public static void main(String[] args) {
        System.out.println(getN(1, 3, 100));//298.0
        System.out.println(getSum(1, 3, 100));//14950.0
    }

    public static int getN(int a1, int d, int n) {//n-го члена прогрессии
        if (n == 1) {
            return a1;
        } else {
            return d + getN(a1, d, n - 1);
        }
    }

    public static int getSum(int a1, int d, int n) {//суммы n первых членов прогрессии
        if (n == 1) {
            return a1;
        } else {
            return getN(a1, d, n) + getSum(a1, d, n - 1);
        }
    }
}
