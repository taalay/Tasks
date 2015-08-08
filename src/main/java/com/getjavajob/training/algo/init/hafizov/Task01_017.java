package com.getjavajob.training.algo.init.hafizov;

import sun.nio.cs.ext.MacThai;

/**
 * Created by admin on 10.07.2015.
 */
public class Task01_017 {
    public static void main(String[] args) {
        System.out.print(o(17));
    }

    static double o(double x) {

        return Math.sqrt(1 - Math.pow(Math.sin(x), 2));
    }

    static double p(double a, double x, double b, double c) {
        return 1 / Math.sqrt(a * Math.pow(x, 2) + b * x + c);
    }

    static double r(double x) {
        return (Math.sqrt(x + 1) + Math.sqrt(x * x - 1)) / 2 * Math.sqrt(x);
    }

    static double c(double x) {
        return Math.abs(x) + Math.abs(x + 1);
    }

}
