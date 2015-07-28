package com.getjavajob.training.algo.init.hafizov;

/**
 *
 */
public class Task02_031 {

    public static void main(String[] args) {

        System.out.print(doTask(456));
    }

    public static int doTask(int in) {
        if (in <= 999 && in >= -999) {
            String str = Integer.toString(in);
            String[] temp = str.split("");

            return Integer.parseInt(temp[0] + temp[1] + temp[1]);
        } else return 0;
    }
}
