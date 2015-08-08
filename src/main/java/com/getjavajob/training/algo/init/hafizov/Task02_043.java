package com.getjavajob.training.algo.init.hafizov;

/**
 *
 */
public class Task02_043 {
    public static void main(String[] args) {
        System.out.print(noIf(200, 500));
    }

    static int noIf(int a, int b) {
        return (a % b) * (b % a) + 1;
    }

}
