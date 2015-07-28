package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 15.07.2015.
 */
public class Task10_042 {
    public static void main(String[] args) {

        System.out.println(toOdd(4, 9));
        System.out.println(Math.pow(9, 4));
    }

    public static double toOdd(double a, double n) {
        if (n == 0) {
            return 1;
        }
        n--;
        return toOdd(a, n) * a;
    }
}
