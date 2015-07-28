package com.getjavajob.training.algo.init.hafizov;

import java.util.Scanner;

public class Task05_010 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println(coursOfDollar(scn.nextInt()));
    }

    public static String coursOfDollar(int cours){
        String result ="";
        for (int i = 1; i < 21; i++) {
            result += i + "$ = " +i * cours+"rub\n";
        }
        return result;
    }
}
