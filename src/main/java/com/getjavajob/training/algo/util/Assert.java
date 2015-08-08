package com.getjavajob.training.algo.util;

import java.util.Arrays;

/**
 * Created by admin on 14.07.2015.
 */
public class Assert {

    public static void assertEquals(boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("Success");
        } else {
            System.out.println("Failure: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(int expected, int actual) {
        if (expected==actual) {
            System.out.println("Success");
        } else {
            System.out.println("Failure: expected " + expected + ", actual " + actual);
        }
    }
    public static void assertEquals(double expected, double actual) {
        if (expected==actual) {
            System.out.println("Success");
        } else {
            System.out.println("Failure: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(long expected, long actual) {
        if (expected==actual) {
            System.out.println("Success");
        } else {
            System.out.println("Failure: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(int[] expected, int[] actual) {
        if (Arrays.equals(expected,actual)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure: expected " + Arrays.toString(expected) + ", actual " + Arrays.toString(actual));
        }
    }

    public static void assertEquals(int[][] expected, int[][] actual) {
        if (Arrays.deepEquals(expected,actual)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure: expected " + Arrays.deepToString(expected) + ", actual " + Arrays.deepToString(actual));
        }
    }
}