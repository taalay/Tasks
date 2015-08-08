package com.getjavajob.training.algo.init.hafizov;

import java.util.Scanner;

/**
 * Created by admin on 10.07.2015.
 */
public class Task01_003 {
    public static void main(String[] args) {
        Scanner usetInput = new Scanner(System.in);
        System.out.print("enter the number:");
        int i = usetInput.nextInt();
        System.out.println(enterNumber(i));
    }

    static String enterNumber(int i) {
        return "Your number is: " + i;
    }
}
