package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 11.07.2015.
 */
public class Task04_036 {
    public static void main(String[] args) {
        System.out.println(trafficLights(3));
        System.out.println(trafficLights(5));
    }

    static String trafficLights(int time) {
        return time % 5 >= 0 && time % 5 <= 2 ? "green" : "red";
    }
}
