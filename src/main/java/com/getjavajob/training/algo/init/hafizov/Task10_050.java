package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 17.07.2015.
 */
public class Task10_050 {
    public static void main(String[] args) {
        System.out.println(ackerman(3, 3));
    }

    public static int ackerman(int n, int m) {
        if (n == 0) {
            return m + 1;
        } else if (n != 0 && m == 0) {
            return ackerman(n - 1, 1);
        } else if (n > 0 && m > 0) {
            return ackerman(n - 1, ackerman(n, m - 1));
        } else {
            return 0;
        }

    }
}
