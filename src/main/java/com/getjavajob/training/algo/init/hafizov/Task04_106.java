package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 11.07.2015.
 */
public class Task04_106 {
    public static void main(String[] args0) {
        System.out.println(season(3));
    }

    static String season(int month) {
        switch (month) {
            case 1:
            case 2:
            case 12:
                return "winter";
            case 3:
            case 4:
            case 5:
                return "spring";
            case 6:
            case 7:
            case 8:
                return "summer";
            case 9:
            case 10:
            case 11:
                return "fall";
            default:
                return "error";
        }
    }
}
