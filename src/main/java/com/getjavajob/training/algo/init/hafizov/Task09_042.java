package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 13.07.2015.
 */
public class Task09_042 {
    public static void main(String[] args) {
        System.out.println(reverseS("hello"));
    }

    static String reverseS(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
