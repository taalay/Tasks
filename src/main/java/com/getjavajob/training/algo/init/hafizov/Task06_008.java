package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on       12.07.2015.
 */
public class Task06_008 {
    public static void main(String[] args) {
        //String str= numberN(24);
        // System.out.println(str);//1 4 9 16
    }

    static String numberN(int in) {
        int[] num = new int[10];
        String result = "";
        for (Integer i = 0; i < num.length; i++) {//Write numbers 1-100
            num[i] = (1 + i) * (1 + i);
        }

        for (int q = 0; q < num.length; q++) {
            if (num[q] < in) {
                result += num[q] + " ";
            }
        }

        return new StringBuilder(result).deleteCharAt(result.length() - 1).toString();
    }
}
