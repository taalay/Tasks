package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 17.07.2015.
 */
public class Task10_055 {
    public static void main(String[] args) {
        String str = transfer(528, 2);
        System.out.println(str);//40
    }

    public static String transfer(int n, int to) {
        int a;
        String result = "";
        if (n == 0 || to < 2 && to < 16) {
            return "";
        } else {
            a = n / to;
            result += transfer(a, to);
            result += n % to;
        }
        return result;
    }
}
