package com.getjavajob.training.algo.init.hafizov;

import com.getjavajob.training.algo.util.Assert;

/**
 * Created by admin on 21.07.2015.
 */
public class Task10_047Test {
    public static void main(String[] args) {
        testFibonacci();
    }

    public static void testFibonacci() {
        Assert.assertEquals(6765, Task10_047.getFibonacci(20));
    }
}
