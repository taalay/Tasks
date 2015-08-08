package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 12.07.2015.
 */
public class Task04_115 {

    public static void main(String[] args) {
        System.out.println(calendar(1985));
    }

    static String calendar(int year) {
        if (year >= 1984) {
            String animal[] = {"rat", "cow",
                    "Tiger", "Hare", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Rooster", "Dog", "Pig"};
            String color[] = {"green", "red", "yellow", "white", "black"};

            return color[((year - 4) % 10 / 2)] + " " + animal[(year - 4) % 12];
        } else return "error";
    }
    static String calendarB(int year) {
        String animal[] = {"rat", "cow",
                "Tiger", "Hare", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Rooster", "Dog", "Pig"};
        String color[] = {"green", "red", "yellow", "white", "black"};
        if (year > 1111 && year < 9999) {
            return color[((year - 4) % 10 / 2)] + " " + animal[(year - 4) % 12];
        }
        return "Erron";
    }
}
