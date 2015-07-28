package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 16.07.2015.
 */
public class Task10_043 {
    public static void main(String[] args0) {
        System.out.println(sumOfNumbers(4759));//25
        System.out.println(getAmount(7545674));//7
    }

    public static int sumOfNumbers(int in) {
        if (in < 10)
            return in;
        else
            return in % 10 + sumOfNumbers(in / 10);
    }

    public static int getAmount(int in) {
        int res = in;
        res = in / 10;
        if (res == 0) {
            return 1;
        } else {
            return getAmount(res) + 1;
        }
    }

}
