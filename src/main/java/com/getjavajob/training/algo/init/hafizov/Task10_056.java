package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 17.07.2015.
 */
public class Task10_056 {
    public static void main(String[] args) {
        System.out.println(isPrimeNumbers(113));//true
        System.out.println(isPrimeNumbers(114));//false
    }

    public static boolean isPrimeNumbers(int p) {
        if (p < 1) {
            return false;
        }
        if (p % 2 == 0) {
            return false;
        }
        if (p % 2 != 0) {
            return true;
        }
        return isPrimeNumbers(p);
    }
}

