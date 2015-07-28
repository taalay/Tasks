package com.getjavajob.training.algo.init.hafizov;

/**
 *
 */
public class Task05_038 {
    public static void main(String[] args) {
        System.out.println(husband(100));//Distance from home= 0.6881718. The total distance traveled= 5.187378
    }

    static String husband(int in) {
        float R = 0;
        float S = 0;

        for (int i = 1; i <= in; ++i) {
            R += (2 * (i % 2) - 1) / (i + 0.);
            S += 1 / (i + 0.);
        }
        return "Distance from home= " + R + ". The total distance traveled= " + S;
    }
}
