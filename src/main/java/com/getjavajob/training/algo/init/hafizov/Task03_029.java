package com.getjavajob.training.algo.init.hafizov;

/**
 * Created by admin on 11.07.2015.
 */
public class Task03_029 {
    public static void main(String[] args) {
        System.out.println(a(2, 8));//true
        System.out.println(a(7, 8));//false

        System.out.println(b(20, 8));//true
        System.out.println(b(15, 7));//false

        System.out.println(v(0, 8));//true
        System.out.println(v(15, 7));//false

        //  System.out.println(b(21,19));
    }

    /**
     * @param x
     * @param y
     * @return return true if
     * each of the numbers X and Y is odd
     */
    static boolean a(int x, int y) {
        return x % 2 == 0 && y % 2 == 0;
    }

    /**
     *  return true if
     * Only one of the numbers X and Y is less than or equal to 2
     */
    static boolean b(int x, int y) {
        return x < 20 ^ y < 20;
    }

    /**
     * return true if
     * at least one of the numbers X and Y equal to zero
     */
    static boolean v(int x, int y) {
        return x == 0 || y == 0;
    }

    /**
     *  return true if
     * each of the numbers X, Y, Z negative
     */
    static boolean g(int x, int y, int z) {
        return x < 0 && y < 0 && z < 0;
    }

    /**
     * return true if
     * only one of the numbers X, Y and Z is a multiple of five
     */
    static boolean d(int x, int y, int z) {
        boolean a, b, c;
        a = x % 5 == 0;
        b = y % 5 == 0;
        c = z % 5 == 0;
        return (a ^ b ^ c) ^ (a && b && c);
    }

    /**
     * return true if
     * at least one of the numbers X, Y, Z is more than 100
     */
    static boolean e(int x, int y, int z) {
        return x > 100 || y > 100 || z > 100;
    }

}
