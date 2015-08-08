package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 13.07.2015.
 */
public class Task09_022 {
    public static void main(String[] args) {
        System.out.println(splitStr("just"));
    }

    static String splitStr(String str) {
        String result;
        if (str.length() % 2 == 0) {
            result = str.substring(0, str.length() / 2);
        } else {
            result = "Not odd";
        }
        return result;
    }
}
