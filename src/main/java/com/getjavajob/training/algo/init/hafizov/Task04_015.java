package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 11.07.2015.
 */
public class Task04_015 {

    public static void main(String[] args) {
        System.out.println("test1  " + howOld(12, 2014, 6, 1985));
        System.out.println("test2  " + howOld(5, 2014, 6, 1985));
        System.out.println("test3  " + howOld(6, 2014, 6, 1985));
        System.out.println("test4  " + howOld(9, 2015, 4, 1993));
    }

    static int howOld(int todayM, int todayY, int birthdayM, int birthdayY) {
        return todayM >= birthdayM ? todayY - birthdayY : todayY - birthdayY - 1;
    }

}
