package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task10_056Test {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        Assert.assertEquals(true, Task10_056.isPrimeNumbers(113));
    }

    public static void test2() {
        Assert.assertEquals(false, Task10_056.isPrimeNumbers(114));
    }
}
