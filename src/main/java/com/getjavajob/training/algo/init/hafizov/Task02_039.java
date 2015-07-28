package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 10.07.2015.
 */
public class Task02_039 {

    public static void main(String[] args) {
        System.out.print(getDegree(23, 59, 59));
    }

    static int getDegree(int h, int m, int s) {//В четырех минутах один градус
        if (h <= 23 && m <= 59 && s <= 59) {
            return ((h * 60) + m + (s / 60)) / 4;
        }
        return 0;
    }

}
