package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 19.07.2015.
 */
public class Task03_029Test {
    public static void main(String[] args) {
        testTrueOfA();
        testFalseOfA();

        testTrueOfB();
        testFalseOfB();

        testTrueOfV();
        testFalseOfV();

        testTrueOfG();
        testFalseOfG();

        testTrueOfD();
        testFalseOfD();

        testTrueOfE();
        testFalseOfE();
    }

    public static void testTrueOfA() {
        Assert.assertEquals(true, Task03_029.a(2, 8));
    }

    public static void testFalseOfA() {
        Assert.assertEquals(false, Task03_029.a(7, 8));
    }

    public static void testTrueOfB() {
        Assert.assertEquals(true, Task03_029.b(20, 8));
    }

    public static void testFalseOfB() {
        Assert.assertEquals(false, Task03_029.b(15, 7));
    }

    public static void testTrueOfV() {
        Assert.assertEquals(true, Task03_029.v(0, 8));
    }

    public static void testFalseOfV() {
        Assert.assertEquals(false, Task03_029.v(15, 7));
    }

    public static void testTrueOfG() {
        Assert.assertEquals(true, Task03_029.g(-1, -9, -10));
    }

    public static void testFalseOfG() {
        Assert.assertEquals(false, Task03_029.g(-45, -9, 5));
    }

    public static void testTrueOfD() {
        Assert.assertEquals(true, Task03_029.d(25, 4, 18));
    }

    public static void testFalseOfD() {
        Assert.assertEquals(false, Task03_029.d(25, 10, 46));
    }

    public static void testTrueOfE() {
        Assert.assertEquals(true, Task03_029.e(105, 200, 85));
    }

    public static void testFalseOfE() {
        Assert.assertEquals(false, Task03_029.e(46, 28, 98));
    }

}
