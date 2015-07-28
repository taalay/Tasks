package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 16.07.2015.
 */
public class Task10_046 {
    public static void main(String[] args) {
        System.out.println(getGeometryN(1, 3, 100));//1.7179250691067045E47
        System.out.println(getGeometrSum(1, 3, 100));//2.5768876036600566E47
    }

    public static double getGeometryN(double a1, double d, int n) {
        if (n <= 1) {
            return a1;
        } else {
            return getGeometryN(a1 * d, d, n - 1);
        }
    }

    public static double getGeometrSum(double a1, double d, int n) {
        if (n == 1) {
            return a1;
        } else {
            return getGeometryN(a1, d, n) + getGeometrSum(a1, d, n - 1);
        }
    }
}
