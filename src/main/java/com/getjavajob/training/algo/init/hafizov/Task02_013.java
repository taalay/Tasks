package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 10.07.2015.
 */
public class Task02_013 {
    public static void main(String[] args) {
        System.out.println(printNumber(321));
    }


    static int printNumber(int num) {
        int number = num;
        int in = 0;
        int temp;
        String result = "";
        temp = number;
        while (number != 0) {
            number = number / 10;
            in++;
        }
        number = temp;
        for (int i = in; number != 0; i--) {
            result += number % 10;
            number = number / 10;
        }
        return Integer.parseInt(result);
    }
}
