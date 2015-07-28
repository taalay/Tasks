package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 16.07.2015.
 */
public class Task10_047 {
    public static void main(String[] args) {
        System.out.println(getFibonacci(20));//6765
    }

    public static int getFibonacci(int fob) {
        if (fob <= 1) {
            return fob;
        } else {
            return getFibonacci(fob - 1) + getFibonacci(fob - 2);
        }
    }
}
