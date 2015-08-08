package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 17.07.2015.
 */
public class Task10_052 {
    public static void main(String[] args) {
        System.out.println(numNat(1234));
    }

    public static String numNat(int i) {
        String result = new String();
        if (i == 0) {
            result += "";
        } else {
            result += i % 10;
            result += numNat(i / 10);
        }
        return result;
    }
}
