package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 13.07.2015.
 */
public class Task09_017 {
    public static void main(String[] args) {
        System.out.println(iden("hello"));
    }

    static boolean iden(String str) {
        return str.charAt(0) == str.charAt(str.length() - 1) ? true : false;
    }
}
