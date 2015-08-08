package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 16.07.2015.
 */
public class Task10_044 {
    public static void main(String[] args) {
        System.out.println(numRoot(564654));
    }

    public static int numRoot(int in) {
        int temp;
        if (in == 0) {
            temp = 0;
        } else {
            temp = numRoot(in / 10) + in % 10;
        }

        if (temp > 9) {
            temp = numRoot(temp);
        }
        return temp;
    }
}
