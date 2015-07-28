package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 20.07.2015.
 */
public class Task10_043Test {
    public static void main(String[] args) {
        testSumOfNumbers();
        testGetAmount();
    }

    public static void testSumOfNumbers() {
        Assert.assertEquals(25, Task10_043.sumOfNumbers(4759));
    }

    public static void testGetAmount() {
        Assert.assertEquals(7, Task10_043.getAmount(7545674));
    }
}
